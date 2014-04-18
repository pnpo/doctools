package pt.uminho.di.reolangeditor.tools.imcreotool;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Map;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.reo.composition.Composer2;
import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.parsing.IMCREOScriptParserFrontEnd;
import pt.uminho.di.imc.util.Util;
import pt.uminho.di.reolangeditor.Activator;
import pt.uminho.di.reolangeditor.tools.imcreotool.IMCREOToolModel.OutputOptions;
import pt.uminho.di.reolangeditor.tools.imcreotool.IMCREOToolModel.ToolOptions;





public class IMCREOTool {
	
	private IMCREOToolModel model;
	
	
	public IMCREOTool(IMCREOToolModel m) {
		this.model = m;
	}
	
	
	/**
	 * Generate an IMCREO model and outputs files, depending
	 * on the options set on the options set by the user
	 */
	public boolean generate () {
		
		boolean wasOK = true;
		try{
			CoordinationPattern2 cp = this.model.updateStochastics();
			//options
			boolean deploy = this.model.getOptions().contains(ToolOptions.DEPLOY);
			boolean verbose = this.model.getOptions().contains(ToolOptions.VERBOSE);
			boolean sequential = this.model.getOptions().contains(ToolOptions.SEQUENTIAL);
			boolean readable = this.model.getOptions().contains(ToolOptions.READABLE);
			boolean labels = this.model.getOptions().contains(ToolOptions.LABELS);
			boolean hide = this.model.getOptions().contains(ToolOptions.HIDE);
			
			String imc_script = cp.intoIMCScript();
			
			
			long startTime = System.currentTimeMillis();
			
			IMCREOimc imc_result;
			Composer2 cs = IMCREOScriptParserFrontEnd.parse(imc_script, false);
			if(sequential){
				imc_result = cs.compose2(deploy);
			}
			else {
				imc_result = cs.compose(deploy);
			}
			
			long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println("OK, generated " + imc_result.getIMCProfile() + " in " + totalTime + "ms");
			
			
			generateOutput(imc_result, readable, labels);
			
			if(this.model.getOutputs().contains(OutputOptions.PRISM)){
				generatePrism(imc_result);
			}
			
			
		}
		catch(Exception e){
			wasOK = false;
			e.printStackTrace();
		}
		
		return wasOK;
	}
	
	
	
	
	


	
	
	private void generatePrism(IMCREOimc imc) {
		//first create a aut file
		String full_content = new IMCTransformer(imc.toIMC(false, false)).toAUTFormat(false, false);
		String content = full_content.substring(0, full_content.indexOf("-- STATES MAPPING --\n\n"));
		Util.createFile(this.model.getPath(), "aut", content);
		
		int last_sep = this.model.getPath().lastIndexOf(File.separator);
		String directory = this.model.getPath().substring(0,last_sep + 1);
		
		//now convert to BCG, minimize, reduce, convert to aut, use prismer...
		//AUT to BCG
		String cadp = Activator.getDefault().getPreferenceStore().getString("P_CADP");
		String cadp_bin = Activator.getDefault().getPreferenceStore().getString("P_CADP_BIN");
		String cadp_com = Activator.getDefault().getPreferenceStore().getString("P_CADP_COM");
		
		//Util.test(this.model.getPath() + ".aut", cadp, cadp_bin, cadp_com, directory + "temp1.bcg");
		convertToBCGorAUT(this.model.getPath() + ".aut", cadp, cadp_bin, cadp_com, directory + "temp1.bcg");
		reduceBCG(directory + "tmp1.bcg", cadp, cadp_bin, cadp_com, directory + "temp2.bcg");
		//Util.minimizeBCG(this.model.getPath() + ".aut", cadp, cadp_bin, cadp_com, directory + "temp1.bcg");
		//Util.convertToBCGorAUT(directory + "temp3.bcg", cadp, cadp_bin, cadp_com, this.model.getPath() + ".aut");
		
	}
	
	
	
	
	
	
	public static void convertToBCGorAUT(String file, String cadp, String cadp_bin, String cadp_com, String output){
		ProcessBuilder pb1 = new ProcessBuilder(cadp_bin + File.separator + "bcg_io", file, output);
		processCommand(pb1, cadp, cadp_bin, cadp_com);
	}
	
	public static void reduceBCG(String file, String cadp, String cadp_bin, String cadp_com, String output){
		ProcessBuilder pb1 = new ProcessBuilder(cadp_com + File.separator + "bcg_open", file, "reductor", "-weaktrace", output);
		processCommand(pb1, cadp, cadp_bin, cadp_com);
	}
	
	
	
	
	
	
	
	
	
	private static void setEnvironment(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
		Map<String, String> env = pb.environment();
		env.put("CADP", cadp);
		env.put("PATH", env.get("PATH") + File.pathSeparator + cadp_bin + File.pathSeparator + cadp_com);
	}
	
	
	private static void processCommand(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
		try{
			String s;
			setEnvironment(pb, cadp, cadp_bin, cadp_com);
			
			System.out.println(pb.environment());
			
			Process p = pb.start();
			BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

	        while ((s = stdInput.readLine()) != null) {
	            System.out.println(s);
	        }
		
			while ((s = stdError.readLine()) != null) {
			    System.out.println(s);
			}
			
			p.waitFor();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	private void generateOutput(IMCREOimc imc, boolean readable, boolean labels) {
		
		//output options
		for(OutputOptions o : this.model.getOutputs()){
			String extension = ""; 
			switch(o) {
				case IMCA : {
					extension = "ma";
					Util.createFile(this.model.getPath(), extension, 
							(new IMCTransformer(imc.toIMC(readable, false)).toMAFormat()));
				} break ;
				case REOMA: {
					extension = "rma";
					Util.createFile(this.model.getPath(), extension, imc.toReoMA());
				} break ;
				case DOT : {
					extension = "dot";
					Util.createFile(this.model.getPath(), extension, 
							(new IMCTransformer(imc.toIMC(readable, false)).toDotFormat()));
				} break ;
				case CADP : {
					extension = "aut";
					String full_content = new IMCTransformer(imc.toIMC(readable, false)).toAUTFormat(!labels, false);
					String content = full_content.substring(0, full_content.indexOf("-- STATES MAPPING --\n\n"));
					Util.createFile(this.model.getPath(), extension, content);
//					String mapping = full_content.substring(full_content.indexOf("-- STATES MAPPING --\n\n"));
//					Util.createFile(OUTPUT + File.separator + config.getString("out_aut_file"), "mapping", mapping);
				} break ;
				default : break;
			}
		
			
			
		}
		
		if(this.model.getOutputs().isEmpty()){
			System.out.println(imc.toString());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
