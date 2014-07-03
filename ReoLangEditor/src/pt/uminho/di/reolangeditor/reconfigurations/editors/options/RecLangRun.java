package pt.uminho.di.reolangeditor.reconfigurations.editors.options;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.jface.dialogs.MessageDialog;

import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;
import pt.uminho.di.reolang.reclang.Processor;
import pt.uminho.di.reolangeditor.reconfigurations.editors.RecLangEditor;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class RecLangRun implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	private RecLangEditor editor;
	/**
	 * The constructor.
	 */
	public RecLangRun() {
	}
	
	public void setEditor(RecLangEditor editor) {
		this.editor = editor;
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		/*
		MessageDialog.openInformation(
			window.getShell(),
			"Run reconfigurations",
			"Faz algo...");
		
		IResource resource = ((IFileEditorInput)editor.getEditorInput()).getFile();
		String file = resource.getLocation().toOSString();
		
		//Processor p = new Processor(file, this.document.get());
		Processor p = new Processor(file, editor.getEditorInput().toString());
		
    	ArrayList<Error> syntax_errors = p.getSyntaxErrors();
    	if ( syntax_errors.isEmpty() ){
        	TinySymbolsTable ids_table = p.getIdentifiersTable(new TinySymbolsTable());
        	ArrayList<Error> semantic_errors = p.getSemanticErrors(ids_table);

        	if (semantic_errors != null && semantic_errors.isEmpty()){
        		//traduz
        	}
    	}
    	*/
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}