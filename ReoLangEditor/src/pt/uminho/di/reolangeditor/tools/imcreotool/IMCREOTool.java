package pt.uminho.di.reolangeditor.tools.imcreotool;

import java.io.File;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.reo.composition.Composer2;
import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.parsing.IMCREOScriptParserFrontEnd;
import pt.uminho.di.imc.util.Util;
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
			
			
		}
		catch(Exception e){
			wasOK = false;
			e.printStackTrace();
		}
		
		return wasOK;
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
