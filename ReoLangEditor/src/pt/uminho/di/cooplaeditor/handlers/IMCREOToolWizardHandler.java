package pt.uminho.di.cooplaeditor.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


import pt.uminho.di.cooplaeditor.wizards.imcreo.IMCREOToolWizard;

public class IMCREOToolWizardHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = ((IFileEditorInput)window.getActivePage().getActiveEditor().getEditorInput()).getFile();
		String file = resource.getLocation().toOSString();
		
		if(file.endsWith(".cpla")) {
			WizardDialog wizardDialog = new WizardDialog(window.getShell(),new IMCREOToolWizard(file));
		    wizardDialog.open();
		}
		
		return null;
	}		

	
}
