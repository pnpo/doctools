/**
 * 
 */
package pt.uminho.di.cooplaeditor.wizards.imcreo;


import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;

import pt.uminho.di.cooplaeditor.tools.imcreotool.IMCREOTool;
import pt.uminho.di.cooplaeditor.tools.imcreotool.IMCREOToolModel;


/**
 * @author Nuno Oliveira
 * @date 14 de Abr de 2014
 *
 */
public class IMCREOToolWizard extends Wizard {

	private IMCREOToolSelectPage select_page;
	private IMCREOToolDeploymentPage deployment_page;
	private IMCREOToolOutputPage output_page;
	
	private IMCREOToolModel model; 
	
	
	public IMCREOToolWizard(String file){
		super();
		this.model = new IMCREOToolModel();
		this.model.setFile(file);
		setNeedsProgressMonitor(true);
	}
	
	
	
	
	
	/**
	 * @return the select_page
	 */
	public IMCREOToolSelectPage getSelect_page() {
		return select_page;
	}





	/**
	 * @param select_page the select_page to set
	 */
	public void setSelect_page(IMCREOToolSelectPage select_page) {
		this.select_page = select_page;
	}





	/**
	 * @return the deployment_page
	 */
	public IMCREOToolDeploymentPage getDeployment_page() {
		return deployment_page;
	}





	/**
	 * @param deployment_page the deployment_page to set
	 */
	public void setDeployment_page(IMCREOToolDeploymentPage deployment_page) {
		this.deployment_page = deployment_page;
	}





	/**
	 * @return the output_page
	 */
	public IMCREOToolOutputPage getOutput_page() {
		return output_page;
	}





	/**
	 * @param output_page the output_page to set
	 */
	public void setOutput_page(IMCREOToolOutputPage output_page) {
		this.output_page = output_page;
	}



	
	/**
	 * @return the model
	 */
	public IMCREOToolModel getModel() {
		return model;
	}





	/**
	 * @param model the model to set
	 */
	public void setModel(IMCREOToolModel model) {
		this.model = model;
	}




	@Override
	public void addPages() {
		this.select_page = new IMCREOToolSelectPage();
		this.deployment_page = new IMCREOToolDeploymentPage();
		this.output_page = new IMCREOToolOutputPage();
		this.addPage(this.select_page);
		this.addPage(this.deployment_page);
		this.addPage(this.output_page);
	}
	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		this.getModel().updateStochastics();
		final IMCREOTool tool = new IMCREOTool(this.getModel());
		
		//final boolean status = false;
		try{
			this.getContainer().run(true, true, tool);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(tool.isProcessed()){
			MessageDialog.openConfirm(this.getShell(), "IMCREO Generation", "Files generated with success! \n\n " +
					"See console for more details.");
		}
		else {
			MessageDialog.openError(this.getShell(), "IMCREO Generation", "Errors occurred during generation of IMCREO model! \n\n" +
					"See console for more details.");
		}
		
		
		
		
		return true;
	}





	

	
	
	
	
}
