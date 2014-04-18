package pt.uminho.di.reolangeditor.tools.imcreotool;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.imc.IMC;
import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.parsing.IMCParserWrapper;
import pt.uminho.di.imc.reo.composition.Composer2;
import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.parsing.IMCREOScriptParserFrontEnd;
import pt.uminho.di.imc.util.Util;
import pt.uminho.di.reolangeditor.Activator;
import pt.uminho.di.reolangeditor.tools.imcreotool.IMCREOToolModel.OutputOptions;
import pt.uminho.di.reolangeditor.tools.imcreotool.IMCREOToolModel.ToolOptions;





public class IMCREOTool implements IRunnableWithProgress {
	
	private IMCREOToolModel model;
	private boolean processed;
	
	
	public IMCREOTool(IMCREOToolModel m) {
		this.model = m;
		this.processed = false;
	}
	
	
	
	
	
	
	/**
	 * @return the status
	 */
	public boolean isProcessed() {
		return processed;
	}



	/**
	 * @param status the status to set
	 */
	public void setProcessed(boolean status) {
		this.processed = status;
	}






	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		try{
			int num_of_tasks = 3 + 
					this.model.getOutputs().size() + 
					(this.model.getOutputs().contains(OutputOptions.PRISM) ? 2 : 0); 
			monitor.beginTask("Preparing to process...", num_of_tasks);
				CoordinationPattern2 cp = this.model.getCompletePattern().getStochInstances().get(this.model.getSelected());
				boolean deploy = this.model.getOptions().contains(ToolOptions.DEPLOY);
				boolean verbose = this.model.getOptions().contains(ToolOptions.VERBOSE);
				boolean sequential = this.model.getOptions().contains(ToolOptions.SEQUENTIAL);
				boolean readable = this.model.getOptions().contains(ToolOptions.READABLE);
				boolean labels = this.model.getOptions().contains(ToolOptions.LABELS);
				boolean hide = this.model.getOptions().contains(ToolOptions.HIDE);
			monitor.worked(1);
			
			monitor.setTaskName("Processing script...");
				String imc_script = cp.intoIMCScript();
			monitor.worked(1);	
			
			monitor.setTaskName("Composing IMCReo model...");
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
			monitor.worked(1);
			
			
			generateOutput(imc_result, readable, labels, monitor);
			setProcessed(true);
			
			if(this.model.getOutputs().contains(OutputOptions.PRISM)){
				generatePrism(imc_result, monitor);
			}
				
				
		
		}
		catch(Exception e) {
			this.setProcessed(false);
			e.printStackTrace();
		}
		finally {
			monitor.done();
		}
		
	}
	
	
	
	
	
//	/**
//	 * Generate an IMCREO model and outputs files, depending
//	 * on the options set on the options set by the user
//	 */
//	public boolean generate () {
//		
//		boolean wasOK = true;
//		try{
//			CoordinationPattern2 cp = this.model.getCompletePattern().getStochInstances().get(this.model.getSelected());
//			//this.model.updateStochastics();
//			//options
//			boolean deploy = this.model.getOptions().contains(ToolOptions.DEPLOY);
//			boolean verbose = this.model.getOptions().contains(ToolOptions.VERBOSE);
//			boolean sequential = this.model.getOptions().contains(ToolOptions.SEQUENTIAL);
//			boolean readable = this.model.getOptions().contains(ToolOptions.READABLE);
//			boolean labels = this.model.getOptions().contains(ToolOptions.LABELS);
//			boolean hide = this.model.getOptions().contains(ToolOptions.HIDE);
//			
//			String imc_script = cp.intoIMCScript();
//			
//			
//			long startTime = System.currentTimeMillis();
//			
//			IMCREOimc imc_result;
//			Composer2 cs = IMCREOScriptParserFrontEnd.parse(imc_script, false);
//			if(sequential){
//				imc_result = cs.compose2(deploy);
//			}
//			else {
//				imc_result = cs.compose(deploy);
//			}
//			
//			long endTime   = System.currentTimeMillis();
//			long totalTime = endTime - startTime;
//			System.out.println("OK, generated " + imc_result.getIMCProfile() + " in " + totalTime + "ms");
//			
//			
//			generateOutput(imc_result, readable, labels);
//			
//			if(this.model.getOutputs().contains(OutputOptions.PRISM)){
//				wasOK = generatePrism(imc_result);
//			}
//			
//			//Thread.sleep(50000);
//			
//			
//		}
//		catch(Exception e){
//			wasOK = false;
//			e.printStackTrace();
//		}
//		
//		return wasOK;
//	}
	
	
	
	
	


	
	
	private void generatePrism(IMCREOimc imc, IProgressMonitor monitor) {
		String cadp = Activator.getDefault().getPreferenceStore().getString("P_CADP");
		String cadp_bin = Activator.getDefault().getPreferenceStore().getString("P_CADP_BIN");
		String cadp_com = Activator.getDefault().getPreferenceStore().getString("P_CADP_COM");
		
		try{
			//first create a aut file
			monitor.setTaskName("Generating essential CADP file...");
				String full_content = new IMCTransformer(imc.toIMC(false, false)).toAUTFormat(false, false);
				String content = full_content.substring(0, full_content.indexOf("-- STATES MAPPING --\n\n"));
				Util.createFile(this.model.getPath(), "aut", content);
			monitor.worked(1);
			
			monitor.setTaskName("Reducing IMCReo model...");
				int last_sep = this.model.getPath().lastIndexOf(File.separator);
				String directory = this.model.getPath().substring(0,last_sep + 1);
				
				//now convert to BCG, reduce, minimize, convert to aut
				convertToBCGorAUT(this.model.getPath() + ".aut", cadp, cadp_bin, cadp_com, directory + "temp1.bcg");
				reduceBCG(directory + "temp1.bcg", cadp, cadp_bin, cadp_com, directory + "temp2.bcg");
				minimiseBCG(directory + "temp2.bcg", cadp, cadp_bin, cadp_com, directory + "temp3.bcg");
				convertToBCGorAUT(directory + "temp3.bcg", cadp, cadp_bin, cadp_com, this.model.getPath() + "_minimized.aut");
				clean(directory);
			monitor.worked(1);
			
			monitor.setTaskName("Generating Prism file...");
				//now produce the prism file
				IMCParserWrapper p = new IMCParserWrapper(new File(this.model.getPath() + "_minimized.aut"));
				p.parse();
				IMC imc_classic = p.getImc(); 
				full_content = new IMCTransformer(imc_classic).toPRISM(this.model.getSelected(), null);
				Util.createFile(this.model.getPath(), "sm", full_content);
			monitor.worked(1);
		}
		catch(Exception e) {
			setProcessed(false);
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public static void convertToBCGorAUT(String file, String cadp, String cadp_bin, String cadp_com, String output){
		ProcessBuilder pb1 = new ProcessBuilder(
				cadp_bin + File.separator + "bcg_io", file, output
			);
		processCommand(pb1, cadp, cadp_bin, cadp_com);
	}
	
	public static void reduceBCG(String file, String cadp, String cadp_bin, String cadp_com, String output){
		ProcessBuilder pb1 = new ProcessBuilder(
				cadp_com + File.separator + "bcg_open", file, "reductor", "-weaktrace", output
			);
		processCommand(pb1, cadp, cadp_bin, cadp_com);
	}
	
	public static void minimiseBCG(String file, String cadp, String cadp_bin, String cadp_com, String output){
		ProcessBuilder pb1 = new ProcessBuilder(
				cadp_bin + File.separator + "bcg_min", "-branching", "-rate", "-self", file, output
			);
		processCommand(pb1, cadp, cadp_bin, cadp_com);
	}
	
	public static void clean(String directory){
		String os = System.getProperty("os.name");
		String remove = os.contains("windows") ? "del" : "rm" ; 
		ProcessBuilder pb1 = new ProcessBuilder(
				remove, directory + "*.bcg", directory + "*.o" , directory + "reductor"
			);
		processCommand(pb1, "", "", "");
	}
	
	
	
	
	
	
	
	
	
	private static void setEnvironment(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
		Map<String, String> env = pb.environment();
		env.put("CADP", cadp);
		env.put("PATH", env.get("PATH") + File.pathSeparator + cadp_bin + File.pathSeparator + cadp_com);
	}
	
	
	private static synchronized void processCommand(ProcessBuilder pb, String cadp, String cadp_bin, String cadp_com) {
		try{
			String s;
			setEnvironment(pb, cadp, cadp_bin, cadp_com);
			
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
			p.destroy();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	private void generateOutput(IMCREOimc imc, boolean readable, boolean labels, IProgressMonitor monitor) {
		
		//output options
		for(OutputOptions o : this.model.getOutputs()){
			String extension = ""; 
			switch(o) {
				case IMCA : {
					extension = "ma";
					monitor.setTaskName("Generating IMCA file...");
						Util.createFile(this.model.getPath(), extension, 
							(new IMCTransformer(imc.toIMC(readable, false)).toMAFormat()));
					monitor.worked(1);
				} break ;
				case REOMA: {
					extension = "rma";
					monitor.setTaskName("Generating Reo MA file...");
						Util.createFile(this.model.getPath(), extension, imc.toReoMA());
					monitor.worked(1);
				} break ;
				case DOT : {
					extension = "dot";
					monitor.setTaskName("Generating Dot file...");
						Util.createFile(this.model.getPath(), extension, 
							(new IMCTransformer(imc.toIMC(readable, false)).toDotFormat()));
					monitor.worked(1);
				} break ;
				case CADP : {
					extension = "aut";
					monitor.setTaskName("Generating CADP file...");
						String full_content = new IMCTransformer(imc.toIMC(readable, false)).toAUTFormat(!labels, false);
						String content = full_content.substring(0, full_content.indexOf("-- STATES MAPPING --\n\n"));
						Util.createFile(this.model.getPath(), extension, content);
					monitor.worked(1);
				} break ;
				default : break;
			}
		
			
			
		}
		
		if(this.model.getOutputs().isEmpty()){
			System.out.println(imc.toString());
		}
		
	}


	
	
	
	
	
	
	
	
	
	
	
}
