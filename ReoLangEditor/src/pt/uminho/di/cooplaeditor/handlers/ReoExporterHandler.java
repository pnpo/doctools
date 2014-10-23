package pt.uminho.di.cooplaeditor.handlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

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
import org.w3c.dom.Document;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.util.ReoXMLProcessor;
import pt.uminho.di.imc.util.Util;
import pt.uminho.di.reolang.ReoLangCP2;
import pt.uminho.di.reolang.ReoLangSemantics;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.RSLTranformer;
import pt.uminho.di.reolang.parsing.Semantics;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

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
		boolean worked = true;
		LinkedHashMap<String, CPModelInternal> patterns = null;
		File f = new File(file);
		String generation_path = f.getParent();
		
		Semantics sem = new Semantics(file);
		ReoLangSemantics.reolang_return res = sem.performSemanticAnalysis(new SymbolsTable());
		
		if(res!=null && res.errors.size()>0){
			//System.err.println(res.errors.toString());
			worked = false;
		}
		else {
			if(sem.getErrors().size()>0) {
				//System.err.println(sem.getErrors().toString());
				worked = false;
			}
		}
		
		if(worked) {
			CPBuilder cpb = new CPBuilder(file);
			ReoLangCP2 rlcp = cpb.performModelConstruction(new LinkedHashMap<String, CPModelInternal>(), res.symbols);
			patterns = rlcp.getPatterns();
			
			boolean files_generated = false;
			
			for(CPModelInternal cpmi : patterns.values()) {
				CoordinationPattern2 cp = cpmi.getSimplePattern();
				try{
					ReoXMLProcessor reo_processor = new ReoXMLProcessor("");
					Document doc = reo_processor.toReoXML(cp, cp.getId() + ".reo");
				
					String xml = ReoXMLProcessor.prettyPrint(doc);
					Util.createFile(generation_path + File.separator + cp.getId(), "reo", xml);
					files_generated = true;
				}
				catch(Exception e){
					System.err.println(e.getMessage());
					e.printStackTrace();
					
					MessageBox messageBox = new MessageBox(parent.getShell(), SWT.ICON_INFORMATION | SWT.OK );
			        messageBox.setMessage("Process failed for Pattern " + cp.getId() + "!\n\n"
			        		+ "This is a beta version of the REO XML translation.\n"
			        		+ "It is probable that some files will not correctly be generated!\n\n"
			        		+ "See console for more information!");
			        messageBox.open();
				}
				
			}
			
			if(files_generated){
				MessageBox messageBox = new MessageBox(parent.getShell(), SWT.ICON_INFORMATION | SWT.OK );
		        messageBox.setMessage("Files generated in the project folder!\n"
		        		+ "Refresh the Eclipse folder if files do not appear!");
		        messageBox.open();
			}
			
		}
		
	}		

}
