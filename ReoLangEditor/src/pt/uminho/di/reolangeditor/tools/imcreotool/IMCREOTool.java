package pt.uminho.di.reolangeditor.tools.imcreotool;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
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
	
	
	
	

	
	
	
	
	


	
	
	private void generatePrism(IMCREOimc imc, IProgressMonitor monitor) {
		String cadp = Activator.getDefault().getPreferenceStore().getString("P_CADP");
		String cadp_bin = Activator.getDefault().getPreferenceStore().getString("P_CADP_BIN");
		String cadp_com = Activator.getDefault().getPreferenceStore().getString("P_CADP_COM");
		
		try{
			//first create a aut file
			monitor.setTaskName("Generating essential CADP file...");
				String full_content = new IMCTransformer(imc.toIMC(false, false)).toAUTFormat(true, false);
				String content = full_content.substring(0, full_content.indexOf("-- STATES MAPPING --\n\n"));
				Util.createFile(this.model.getPath(), "aut", content);
			monitor.worked(1);
			
			monitor.setTaskName("Reducing IMCReo model...");
				int last_sep = this.model.getPath().lastIndexOf(File.separator);
				String directory = this.model.getPath().substring(0,last_sep + 1);
				
				//now convert to BCG, reduce, minimize, convert to aut
				Util.minimize(this.model.getPath(), cadp, cadp_bin, cadp_com, directory);
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
