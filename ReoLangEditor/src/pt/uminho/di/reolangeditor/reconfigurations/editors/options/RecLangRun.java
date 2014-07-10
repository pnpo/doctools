package pt.uminho.di.reolangeditor.reconfigurations.editors.options;


import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.texteditor.ITextEditor;

import pt.uminho.di.reolang.reclang.Constants;
import pt.uminho.di.reolang.reclang.ReCooPLaProcessor;
import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;

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
	/**
	 * The constructor.
	 */
	public RecLangRun() {
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
		
    	*/
		try{
			IWorkbenchPage page = window.getActivePage();
			IResource resource = ((IFileEditorInput)page.getActiveEditor().getEditorInput()).getFile();
			String file = resource.getLocation().toOSString();
			
			IEditorPart editor = page.getActiveEditor();
			IEditorInput input = editor.getEditorInput();
			IDocument document = ( (ITextEditor)editor ).getDocumentProvider().getDocument(input); 
			String content = document.get(); 
//			System.out.println(content);
			
			ReCooPLaProcessor rp = new ReCooPLaProcessor(file, content);
	    	ArrayList<Error> syntax_errors = rp.getSyntaxErrors();
	    	if ( syntax_errors.isEmpty() ){
	        	TinySymbolsTable ids_table = rp.getIdentifiersTable(new TinySymbolsTable());
	        	ArrayList<Error> semantic_errors = rp.getSemanticErrors(ids_table);
	
	        	if (semantic_errors != null && semantic_errors.isEmpty()){
	        		//traduz
		        	HashMap<String, String> translation = new HashMap<String, String>();
		        	translation = rp.getTranslation(ids_table);
		   
			    	//do something with translation...
			    	for (String t : translation.keySet()){
			    		//check runtime path
//			    		String basePath = new File("").getAbsolutePath();
//			    	    System.out.println(basePath);
			    		
//			    		String folder = "tests/";
			    		String folder = "";
			    		
			    		String file_name = t + ".java";
			    		String file_path = folder + file_name;
			    		
			    		PrintWriter writer = new PrintWriter(file_path, "UTF-8");
			    		writer.println("import " + Constants.JAVA_UTIL + ".*;");
			    		writer.println("import " + Constants.CP_MODEL + ".*;");
			    		writer.println("import " + Constants.CP_RECONFIGURATIONS + ".*;");
			    		writer.println("import " + Constants.REOLANG_PARSING_UTIL + ".*;\n");
			    		if (t.equals("Main")){
			    			/*
			    			 * import org.antlr.runtime.*;
			    			 * import org.antlr.runtime.tree.*;
			    			*/
				    		writer.println("import " + Constants.REOLANG + ".ReoLangCP2;");
				    		writer.println("import " + Constants.REOLANG_PARSING + ".CPBuilder;");
			    			writer.println("import " + Constants.JAVA_LANG_REFLECT + ".*;\n");
			    			//writer.println("import " + PkgConstants.JAVA_LANG_REFLECT + ".Constructor;");
				    		//writer.println("import " + PkgConstants.JAVA_LANG_REFLECT + ".Method;");
			    			
			    		}
			    		writer.print(translation.get(t));
			    		writer.close();
			    		
			    		
			    		String option = "-cp";
			    		String classpath = folder + "recoopla.jar";
			    		
			    		//javac -cp file.jar file.java
			    		executeCommand("javac", option, classpath, file_path);
			    	}
			    	
		

	        		MessageDialog.openInformation(
	        				window.getShell(),
	        				"Run reconfigurations",
	        				"Fez algo...");
	        	}
	        	else{
	        		MessageDialog.openInformation(
	        				window.getShell(),
	        				"Run reconfigurations",
	        				"erro(s)...");
	        	}
	    	}
		}
		catch(Exception e) {
			e.printStackTrace();
			MessageDialog.openInformation(
    				window.getShell(),
    				"Run reconfigurations",
    				e.toString());
		}

    	
	}
	
	
	/**
	 * 
	 * @param cmd 	: command to execute
	 * @param op  	: option (eg.: -cp)
	 * @param cp  	: classpath value
	 * @param file	: file to run
	 */
	private static void executeCommand(String cmd, String op, String cp, String file) {
	     Process p;
	     ProcessBuilder b = new ProcessBuilder(cmd, op, cp, file);
	     try {
	    	 p = b.start();
			 p.waitFor();
			 p.destroy();
	     } 
	     catch (Exception e) {
	    	 e.printStackTrace();
		 }
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