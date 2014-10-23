package pt.uminho.di.cooplaeditor.handlers;

import java.io.File;
import java.util.LinkedHashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.w3c.dom.Document;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.util.ReoXMLProcessor;
import pt.uminho.di.imc.util.Util;
import pt.uminho.di.reolang.ReoLangCP2;
import pt.uminho.di.reolang.ReoLangSemantics;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.Semantics;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class ReoImporterHandler extends AbstractHandler {

public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IResource resource = ((IFileEditorInput)window.getActivePage().getActiveEditor().getEditorInput()).getFile();
		String file = resource.getLocation().toOSString();
		
		process(new File(file).getParentFile().toString(), window.getShell());
		
		
		return null;
	}
	
	
	private void process(String dir, Composite parent) {
		
		FileDialog dialog = new FileDialog(parent.getShell(), SWT.OPEN);
		dialog.setFilterNames(new String[] { "RSL files (*.reo)", "All files (*.*)" });
		dialog.setFilterExtensions(new String[] { "*.reo", "*.*" });
		String path =  dialog.open();
		if( ! (path == null || path.equals("") ) ){
			File f = new File(path);
			String fname = f.getName();
			int last_dot = fname.lastIndexOf('.');
			fname = last_dot > 0 ? fname.substring(0,last_dot) : fname;
			ReoXMLProcessor reo_processor = new ReoXMLProcessor(path);
			CoordinationPattern2 cp = reo_processor.toCoordinationPattern();
			String coopla = cp.toCooPLa();
			Util.createFile(dir + File.separator + fname, "cpla", coopla);	
			
			MessageBox messageBox = new MessageBox(parent.getShell(), SWT.ICON_INFORMATION | SWT.OK );
	        messageBox.setMessage("File '" + fname+ ".cpla' created with success in the project folder!\n"
	        		+ "Refresh the Eclipse folder if the file do not appear!");
	        messageBox.open();
		}
	}		

}
