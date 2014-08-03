package pt.uminho.di.reolangeditor.reconfigurations.editors.options;


import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.cp.model.CommunicationMean2;
import pt.uminho.di.cp.model.CoordinationPattern2;
//import pt.uminho.di.cp.model.Node;
import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.cp.model.graph.Node;
import pt.uminho.di.cp.model.graph.Edge;
import pt.uminho.di.reolang.reclang.Constants;
import pt.uminho.di.reolang.reclang.ReCooPLaProcessor;
//import pt.uminho.di.reolang.reclang.ReCooPLaRunner;
import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;
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
	
	private String file;
	private String content;
	
	
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
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public void run(IAction action) {

		try{
			IWorkbenchPage page = window.getActivePage();
			IResource resource = ((IFileEditorInput)page.getActiveEditor().getEditorInput()).getFile();
			this.file = resource.getLocation().toOSString();
			
			IEditorPart editor = page.getActiveEditor();
			IEditorInput input = editor.getEditorInput();
			IDocument document = ( (ITextEditor)editor ).getDocumentProvider().getDocument(input); 
			this.content = document.get(); 
//			System.out.println(content);
			
//			ReCooPLaRunner runner = new ReCooPLaRunner(file, content);
//			runner.compile();
			
			
			String folder = createFolder();
		
	    	//creates java files and compiles them
	    	generateFilesTo(folder);
			
	    	
    	    //*********reflection*********
    	    URL[] classes = {new File(folder).toURI().toURL()};
    	    URLClassLoader child = new URLClassLoader (classes, this.getClass().getClassLoader());
    	
			Class c = Class.forName("Run", true, child);
			Object runner = c.newInstance();
			
			Method getImportedPatterns = c.getMethod("getImportedPatterns", null); //getDeclaredMethod
			LinkedHashMap<String,CPModelInternal> imported_patterns = (LinkedHashMap<String, CPModelInternal>) getImportedPatterns.invoke(runner, null );
			
			Method getCreatedPatterns = c.getMethod("getCreatedPatterns", null); //getDeclaredMethod
			LinkedHashMap<String,CPModelInternal> created_patterns = (LinkedHashMap<String, CPModelInternal>) getCreatedPatterns.invoke(runner, null );
			
			Method getErrors = c.getMethod("getErrors", null); //getDeclaredMethod
			Set<Exception> errors = (Set<Exception>) getErrors.invoke(runner, null );
			//******************************
			
			//get graphs through created patterns
			Set<ArchPatternAbstractGraph> graphs = getGraphs(created_patterns);
			
			//test one graph in reolang pattern view
			testWithReoLangPatternView(graphs, (RecLangEditor) editor);
			
			//update view
			((RecLangEditor) editor).setPatternsRepresentation(graphs);
			
			//open view
			String viewID = "reolangeditor.reconfigurations.views.RecLangPatternsView"; 
			PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow()
				.getActivePage()
				.showView(viewID);
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			MessageDialog.openInformation(
    				window.getShell(),
    				"Run reconfigurations",
    				e.toString());
		} 	
	}
	
	
	
	
	// **************** METHODS **************** 
	/**
	 * creates a folder
	 * @return path to the folder
	 */
	private String createFolder(){
		String home = System.getProperty("user.home");
		//path/file separator
		String file_separator = System.getProperty("file.separator");
		File dir = new File(home + file_separator + "temp");

		// if the directory does not exist, create it
		if (!dir.exists()) {
			dir.mkdir();
		}
		return dir.getAbsolutePath() + file_separator;
	}
	
	
	
	/**
	 * 
	 * @param folder
	 */
	private void generateFilesTo(String folder){
	
		ReCooPLaProcessor rp = new ReCooPLaProcessor(file, content);
		
		ArrayList<Error> syntax_errors = rp.getSyntaxErrors();
    	if ( syntax_errors.isEmpty() ){
        	TinySymbolsTable ids_table = rp.getIdentifiersTable(new TinySymbolsTable());
        	ArrayList<Error> semantic_errors = rp.getSemanticErrors(ids_table);

        	if (semantic_errors != null && semantic_errors.isEmpty()){
        		
	        	HashMap<String, String> translation = new HashMap<String, String>();
	        	translation = rp.getTranslation(ids_table);
	    		  
		    	//do something with translation...
	        	compileFilesTo(folder, translation);
		    	
        	}
        	else{
        		MessageDialog.openInformation(
        				window.getShell(),
        				"Run reconfigurations",
        				"erro(s)...");
        	}
    	}
	}
	
	/**
	 * 
	 * @param folder
	 * @param translation
	 */
	private void compileFilesTo(String folder, HashMap<String, String> translation){
		try{
			for (String t : translation.keySet()){

	    		String file_name = t + ".java";
	    		String file_path = folder + file_name;
	    		
	    		PrintWriter writer = new PrintWriter(file_path, "UTF-8");
	    		writer.println("import " + Constants.JAVA_UTIL + ".*;");
	    		writer.println("import " + Constants.CP_MODEL + ".*;");
	    		writer.println("import " + Constants.CP_RECONFIGURATIONS + ".*;");
	    		writer.println("import " + Constants.REOLANG_PARSING_UTIL + ".*;\n");
	    		if (t.equals("Run")){
	    			/*
	    			 * import org.antlr.runtime.*;
	    			 * import org.antlr.runtime.tree.*;
	    			*/
		    		writer.println("import " + Constants.REOLANG + ".ReoLangCP2;");
		    		writer.println("import " + Constants.REOLANG_PARSING + ".CPBuilder;");
	    			writer.println("import " + Constants.JAVA_LANG_REFLECT + ".*;\n");
	    			
	    		}
	    		writer.print(translation.get(t));
	    		writer.close();
	    		
	    		String option = "-cp";
	    		
	    		String separator = System.getProperty("path.separator"); //':' or ';'
	    		String classpath = folder + "recoopla.jar" + separator + "antlr.jar";
	    		
	    		File f = new File(folder + "recoopla.jar");
	    		if(!f.exists()) {
	    			copyDependenciesTo(folder);
	    		}
	    		
				//javac -cp file.jar file.java
	    		executeCommand("javac", option, classpath, file_path);	
	    	}
		}
		catch(Exception e){
			e.printStackTrace();
			MessageDialog.openInformation(
    				window.getShell(),
    				"Run reconfigurations",
    				e.toString());
		}
	}

	
	/**
	 * 
	 * @param path
	 * @throws Exception
	 */
	private void copyDependenciesTo(String path) throws Exception{
		InputStream recoopla_in = getClass().getResourceAsStream("dependencies/reolang.4.1.debug.jar");
		OutputStream recoopla_out = new FileOutputStream(new File(path + "recoopla.jar"));
		
		InputStream antlr_in = getClass().getResourceAsStream("dependencies/antlr-3.4-complete.jar");
		OutputStream antlr_out = new FileOutputStream(new File(path + "antlr.jar"));
		
		HashMap<InputStream, OutputStream> files = new HashMap<InputStream, OutputStream>();
		files.put(recoopla_in, recoopla_out);
		files.put(antlr_in, antlr_out);
 
		for (InputStream in : files.keySet()){
			int read = 0;
			byte[] bytes = new byte[1024];
	 
			OutputStream out = files.get(in);
			while ((read = in.read(bytes)) != -1) {
				out.write(bytes, 0, read);
			}
			out.close();
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
	 * 
	 * @return graphs
	 */
	private Set<ArchPatternAbstractGraph> getGraphs(LinkedHashMap<String,CPModelInternal> created_patterns){
		Set<ArchPatternAbstractGraph> graphs = new HashSet<ArchPatternAbstractGraph>();
		
		for (CPModelInternal cpmi : created_patterns.values()){
			CoordinationPattern2 cp = cpmi.getSimplePattern();
			Set<Node> in_nodes = new HashSet<Node>();
			Set<Node> out_nodes = new HashSet<Node>();
			Set<Node> nodes = new HashSet<Node>();
			
			int i = 1;
			//map -> old_nodes, new_nodes
			HashMap<String, String> map_nodes = new HashMap<String, String>();
			
			for (pt.uminho.di.cp.model.Node node : cp.getNodes()){
				Node n = new Node();
				String old_node = node.sepEndsByDot();
				
				//rever - incrementar letras para nomes de portas
				String new_node = old_node; //default
				if (map_nodes.containsKey(old_node)){
					new_node = map_nodes.get(old_node);
				}
				else if (old_node.contains(".")){
					new_node = "j" + i;
					map_nodes.put(old_node, new_node);
					i++;
				}
				
				n.setName(new_node);
				nodes.add(n);
				if (cp.getIn().contains(node)){
					in_nodes.add(n);
				}
				else if (cp.getOut().contains(node)){
					out_nodes.add(n);
				}
		    }
//			System.out.println(map_nodes);
			
			Set<Edge> edges = new HashSet<Edge>();
			for(CommunicationMean2 cm : cp.getPattern()){
				boolean is_drain = false;
				if (cm.getType().toLowerCase().contains("drain")){
					is_drain = true;
				}
				String n1 = map_nodes.containsKey( cm.getIn(0).sepEndsByDot() ) ? 
						map_nodes.get( cm.getIn(0).sepEndsByDot() ) : cm.getIn(0).sepEndsByDot();
				String n2 = "";
				boolean directed = true;
				String label = cm.getId() + "::" + cm.getType().toLowerCase();
				if (is_drain){
					n2 = map_nodes.containsKey( cm.getIn(1).sepEndsByDot() ) ? 
							map_nodes.get( cm.getIn(1).sepEndsByDot() ) : cm.getIn(1).sepEndsByDot();
					directed = false;
				}
				else {
					n2 = map_nodes.containsKey( cm.getOut(0).sepEndsByDot() ) ? 
							map_nodes.get( cm.getOut(0).sepEndsByDot() ) : cm.getOut(0).sepEndsByDot();
				}
				Edge edge = new Edge(n1, n2, directed, label);
				edges.add(edge);
			}
			
			String name = cp.getId();
			ArchPatternAbstractGraph graph = new ArchPatternAbstractGraph(in_nodes, out_nodes, nodes, edges, name);
			graphs.add(graph);
			
//			//convert CoordinationPattern2 object to text in coopla format
//			patternToString(cp);
		}
		return graphs;
	}
	
	

	@SuppressWarnings("unused")
	private static void patternToString(CoordinationPattern2 pattern) {
	     StringBuilder sb = new StringBuilder();
	     sb.append("pattern " + pattern.getId() 
	    		 + "(" + nodesToString( pattern.getIn() ) 
	    		 + ":" + nodesToString( pattern.getOut() ) 
	    		 + "){\n");

	     //key: type
	     //value: all channels of type key
	     HashMap<String, Set<String>> type_channels = new HashMap<String, Set<String>>();
	     for (CommunicationMean2 cm : pattern.getPattern()){
	    	
	    	 Set<String> channels = type_channels.get(cm.getType()) != null ? 
	    			 type_channels.get(cm.getType()) : new HashSet<String>();
	    	 channels.add(cm.getId());
	    	 type_channels.put(cm.getType(), channels);
	     }
	     sb.append("\tuse:\n");
	     for (String type : type_channels.keySet()){
	    	 String coopla_type = "";
	    	 if (type.equals("sync")){
	    		 coopla_type = "sync(i:o)";
	    	 }
	    	 else if (type.contains("fifo")){
	    		 coopla_type = "fifo~1(i:o)";
	    	 }
	    	 else if (type.contains("drain")){
	    		 coopla_type = "sync_drain(i,ii:)";
	    	 }
	    	 sb.append("\t\t" + coopla_type + "\tas " + setToString(type_channels.get(type)) + ";\n");
	     }
	     sb.append("\tin:\n");
	     for (pt.uminho.di.cp.model.Node node : pattern.getNodes()){
	    	 //rever
	    	 sb.append("\t\t" + node.sepEndsByDot() + " = " + "__channel.i/.o__" + ";\n");
	     }
	     sb.append("}");
	     
	     System.out.println(sb);
	}
	
	
	private static String nodesToString(Set<pt.uminho.di.cp.model.Node> nodes){
		String sep = "";
		String values = "";
		for (pt.uminho.di.cp.model.Node node : nodes){
			values += sep;
			values += node.sepEndsByDot();
			
		    sep = ",";
		}
		return values;
	}
	
	private static String setToString(Set<String> args){
		String sep = "";
		String values = "";
		for (String a : args){
			values += sep;
			values += a;
			
		        sep = ", ";
		}
		return values;
	}
	
	
	
	private void testWithReoLangPatternView(Set<ArchPatternAbstractGraph> graphs, RecLangEditor editor){

		//retrieve graph to PatternView
		ArchPatternAbstractGraph graph;
		Iterator iter = graphs.iterator();
		if(iter.hasNext()){
			graph = (ArchPatternAbstractGraph) iter.next();
//			PatternViewer pv = new PatternViewer();
//			pv.setGraph(graph);
//			pv.setReplaceMap(null);
//			pv.updateGraph();
			editor.setSelectedPatternGraphModel(graph);
		}
		else{
			MessageDialog.openInformation(
					window.getShell(), 
					"Run reconfigurations", 
					"N�o existem reconfigura��es na main!");
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