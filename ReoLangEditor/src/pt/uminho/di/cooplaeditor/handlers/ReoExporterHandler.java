package pt.uminho.di.cooplaeditor.handlers;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import pt.uminho.di.imc.util.Util;
import pt.uminho.di.reolang.parsing.RSLTranformer;

public class ReoExporterHandler extends AbstractHandler {

public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = ((IFileEditorInput)window.getActivePage().getActiveEditor().getEditorInput()).getFile();
		String file = resource.getLocation().toOSString();
		
		if(file.endsWith(".cpla")) {
			process(file, window.getShell());
		}
		
		return null;
	}
	
	
	private void process(String file, Composite parent) {
		
		
		
		RSLTranformer rslt = new RSLTranformer(file);
		
		try{
			String rsl_content = rslt.translateToRSL();
			
			File f = new File(file);
			FileDialog dialog = new FileDialog(parent.getShell(), SWT.SAVE);
			dialog.setFilterPath(f.getParent());
			dialog.setFilterNames(new String[] { "RSL files" });
			dialog.setFilterExtensions(new String[] { "*.rsl" });
			String path =  dialog.open();
			if( ! (path == null || path.equals("") ) ){
				Util.createFile(path, "rsl", rsl_content);
				
				MessageBox messageBox = new MessageBox(parent.getShell(), SWT.ICON_INFORMATION | SWT.OK );
		        messageBox.setMessage("File created with success!");
			}
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			e.printStackTrace();
			
			MessageBox messageBox = new MessageBox(parent.getShell(), SWT.ICON_INFORMATION | SWT.OK );
		        messageBox.setMessage("This is a beta version of the RSL translation.\n"
		        		+ "Some features of CooPLa are not covered: \n"
		        		+ "-- imports\n"
		        		+ "-- stochastic instances\n"
		        		+ "...\n\n"
		        		+ "See console for more information!");

		    messageBox.open();
			
		}
		
	}		

}
