package pt.uminho.di.cooplaeditor.reconfigurations.editors.options;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
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
import pt.uminho.di.reolang.parsing.util.ErrorType;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;
import pt.uminho.di.cooplaeditor.reconfigurations.editors.ReCooPLaEditor;


/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class ReCooPLaRun implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	
	private String file;
	private String content;
	
	
	/**
	 * The constructor.
	 */
	public ReCooPLaRun() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	@SuppressWarnings({ "unchecked", "rawtypes"})
	public void run(IAction action) {

		String folder = "";
		
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
			
			
			folder = createFolder();
		
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

			
			LinkedHashMap<String,CoordinationPattern2> final_patterns = new LinkedHashMap<String, CoordinationPattern2>(); 
			for (String pattern : created_patterns.keySet()){
				if (!pattern.equals("Reconfigured")){
					final_patterns.put( pattern, created_patterns.get(pattern).getSimplePattern() );
				}
				else{
					LinkedHashMap<String, CoordinationPattern2> instances = created_patterns.get(pattern).getStochInstances();
					//System.out.println(instances);
					for (String reconfigured : instances.keySet()){
						CoordinationPattern2 cp = instances.get(reconfigured);
						final_patterns.put( reconfigured,  cp);
					}
				}
			}
			//System.out.println(final_patterns);
			
			
			//get graphs through created patterns
			Set<ArchPatternAbstractGraph> graphs = getGraphs(final_patterns);
			
//			//test one graph in reolang pattern view
//			testWithReoLangPatternView(graphs, (RecLangEditor) editor);
			

			//open view 
			String viewID = "cooplaeditor.reconfigurations.views.ReCooPLaPatternsView"; 
			PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow()
				.getActivePage()
				.showView(viewID);

			//update view
			((ReCooPLaEditor) editor).setPatternsRepresentation(graphs);
			
			
			//save to a coopla file
			boolean response = ask("Do you want to save the patterns created to a CooPLa (*.cpla) file?");
			if (response == true){ //YES
				boolean repeat = true;
				do{
					String path = getFilePath();
					
					//if path is not null, user clicks on 'save' button
					if (path != null){
						boolean overwrite = true;
						File f = new File(path);
						if(f.exists() && !f.isDirectory()) {
							String file = path.substring( path.lastIndexOf(System.getProperty("file.separator")) + 1 );
							overwrite = ask("the file \"" + file + "\" already exists. Would you like to replace it?" 
									+ "\nThe replacement will eliminate the current content.");
						}
						
						if (overwrite){
							saveCooPLaFileTo(path, created_patterns);
							repeat = false;
						}
					}
					//else, user clicks on 'cancel' button
					else{
						repeat = false;
					}
				} while (repeat);
			}
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
			
			String msg = e.toString().contains("ClassNotFoundException: Run") ? "The application of reconfiguration structure (main) is missing!" : e.getMessage();
			msg = e.toString().contains("java.lang.NullPointerException") ? "Check the arguments of the reconfigurations, "
					+ "in particular, the internal representation of structured data types used!\n" 
					+ "It seems that some attribute or operation of a structured data type does not exist or can not be applied." : e.getMessage();
			MessageDialog.openInformation(
    				window.getShell(),
    				"Run reconfigurations",
    				"Something went wrong...\n\n" 
    				+ msg);
		} 	
		
		try {
			removeFolder(folder);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	// **************** METHODS **************** 
	/**
	 * creates a folder
	 * @return path to the folder
	 */
	private String createFolder() throws Exception {
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
	 * removes a folder
	 * @param folder path to remove
	 */
	private void removeFolder(String folder_path) throws Exception {
		File folder = new File(folder_path);
		
		String[] files = folder.list();
		for(String file: files){
		    File currentFile = new File(folder.getPath(), file);
		    currentFile.delete();
		}
		
		folder.delete();
	}
	
	
	
	/**
	 * 
	 * @param folder
	 */
	private void generateFilesTo(String folder) throws Exception {
	
		ReCooPLaProcessor rp = new ReCooPLaProcessor(file, content);
		
		ArrayList<Error> syntax_errors = rp.getSyntaxErrors();
    	if ( syntax_errors.isEmpty() ){
        	TinySymbolsTable ids_table = rp.getIdentifiersTable(new TinySymbolsTable());
        	ArrayList<Error> semantic_errors = rp.getSemanticErrors(ids_table);
        	
        	//only warnings allowed
        	int i = 0;
        	for (Error e : semantic_errors){
        		if (e.getType().equals(ErrorType.ERROR)){
        			i++;
        		}
        	}
        	
        	if (semantic_errors != null && i == 0){
        		
	        	HashMap<String, String> translation = new HashMap<String, String>();
	        	translation = rp.getTranslation(ids_table);
	    		  
		    	//do something with translation...
	        	compileFilesTo(folder, translation);
		    	
        	}
        	else{
        		throw new Exception("There are syntactic or semantic errors in the specification. "
        				+ "\nPlease review the markers.");
        	}
    	}
    	else{
    		throw new Exception("There are syntactic or semantic errors in the specification. "
    				+ "\nPlease review the markers.");
    	}
	}
	
	/**
	 * 
	 * @param folder
	 * @param translation
	 */
	private void compileFilesTo(String folder, HashMap<String, String> translation) throws Exception {
		for (String t : translation.keySet()){

    		String file_name = t + ".java";
    		String file_path = folder + file_name;
    		
    		PrintWriter writer = new PrintWriter(file_path, "UTF-8");
    		writer.println("import " + Constants.JAVA_UTIL + ".*;");
    		writer.println("import " + Constants.CP_MODEL + ".*;");
    		writer.println("import " + Constants.CP_RECONFIGURATIONS + ".*;");
    		writer.println("import " + Constants.REOLANG_PARSING_UTIL + ".*;\n");
			writer.println("import " + Constants.JAVA_LANG_REFLECT + ".*;\n");
    		if (t.equals("Run")){
    			/*
    			 * import org.antlr.runtime.*;
    			 * import org.antlr.runtime.tree.*;
    			*/
	    		writer.println("import " + Constants.REOLANG + ".ReoLangCP2;");
	    		writer.println("import " + Constants.REOLANG + ".ReoLangSemantics;");
	    		writer.println("import " + Constants.REOLANG_PARSING + ".CPBuilder;");
	    		writer.println("import " + Constants.REOLANG_PARSING + ".Semantics;");    			
    		}
    		writer.print(translation.get(t));
    		writer.close();
    		
    		String option = "-cp";
    		
    		String separator = System.getProperty("path.separator"); //':' or ';'
    		String classpath = folder + "recoopla.jar" + separator + folder + "antlr.jar";
    		
    		File f = new File(folder + "recoopla.jar");
    		if(!f.exists()) {
    			copyDependenciesTo(folder);
    		}
    		
			//javac -cp file.jar file.java
    		executeCommand("javac", option, classpath, file_path);	
    	}
	}

	
	/**
	 * 
	 * @param path
	 * @throws Exception
	 */
	private void copyDependenciesTo(String path) throws Exception {
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
	private static void executeCommand(String cmd, String op, String cp, String file)  throws Exception {
	     Process p;
	     ProcessBuilder b = new ProcessBuilder(cmd, op, cp, file);
	     
    	 p = b.start();
		 p.waitFor();
		 p.destroy();
	}
	
	
	

	
	/**
	 * 
	 * @return graphs
	 */
	private Set<ArchPatternAbstractGraph> getGraphs(LinkedHashMap<String,CoordinationPattern2> created_patterns) 
			throws Exception {
		Set<ArchPatternAbstractGraph> graphs = new HashSet<ArchPatternAbstractGraph>();
		
		//for (CPModelInternal cpmi : created_patterns.values()){
		for (CoordinationPattern2 cp : created_patterns.values()){
			//CoordinationPattern2 cp = cpmi.getSimplePattern();
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
		}
		return graphs;
	}
	
	

	
	/**
	 * 
	 * @return true if the user clicks 'yes'
	 * and false if the user clicks 'no'
	 */
	private boolean ask(String question) throws Exception {
		boolean response = MessageDialog.openQuestion(
				window.getShell(), 
				"Save files?", 
				question);

//		System.out.println(response);
		return response;
	}
	
	/**
	 * 
	 * @return path to save file
	 */
	private String getFilePath() throws Exception {
		FileDialog dialog = new FileDialog(window.getShell(), SWT.SAVE);
	    dialog.setFilterNames(new String[] { "CooPLa Files (*.cpla)", "All Files (*.*)" });
	    dialog.setFilterExtensions(new String[] { "*.cpla", "*.*" });
	    dialog.setFilterPath(System.getProperty("user.dir"));
	    dialog.setFileName("new_patterns.cpla");
	    
//	    new Button(dialog, SWT.CHECK).setText("Multiple files");
	    
	    
//	    System.out.println("Save to: " + dialog.open());
	    //file_path
	    return dialog.open();
		 
	}
	
	private void saveCooPLaFileTo(String path, LinkedHashMap<String,CPModelInternal> created_patterns) throws Exception {
		
		PrintWriter writer = new PrintWriter(path, "UTF-8");
		
		String channels = readFile("dependencies/channels.cpla");
		
		writer.print("// ******** CHANNELS ******** //\n");
		writer.print(channels);
		
		writer.print("\n\n// ******** PATTERNS ******** //\n");
		for(CPModelInternal cpmi : created_patterns.values()){
			//convert CoordinationPattern2 object to text in coopla format
			String coopla_specification = patternToString(cpmi);	//BETA VERSION - without stochastic info

    		writer.print(coopla_specification);
    		writer.println("\n");
		}
		writer.close();
	}
	
	
	private String readFile(String file_path) throws IOException {

		InputStream is = getClass().getResourceAsStream(file_path);
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
 
		String line;
		try {
 
			br = new BufferedReader(new InputStreamReader(is));
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
 
		return sb.toString();
	}
	

	
	private static String patternToString(CPModelInternal pattern) throws Exception {
		
		 CoordinationPattern2 cp = pattern.getSimplePattern();
	     StringBuilder sb = new StringBuilder();
	     sb.append("pattern " + cp.getId() 
	    		 + "(" + nodesToString( cp.getIn() ) 
	    		 + ":" + nodesToString( cp.getOut() ) 
	    		 + "){\n");

	     //key: type
	     //value: all channels of type key
	     HashMap<String, Set<String>> type_channels = new HashMap<String, Set<String>>();
	     for (CommunicationMean2 cm : cp.getPattern()){
	    	
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
	    	 else if (type.contains("lossy")){
	    		 coopla_type = "lossy(i:o)";
	    	 }
	    	 else if (type.contains("drain")){
	    		 coopla_type = "sync_drain(i,ii:)";
	    	 }
	    	 else if (type.contains("fifo")){
	    		 coopla_type = "fifo~1(i:o)";
	    		 
	    		 String last_char = type.substring(type.length() - 1);
	    		 if (last_char.equals("e")) { //empty
	    		 	coopla_type = "(E)fifo~1(i:o)";
	    		 }
	    		 else if (last_char.equals("f")) {//full
	    		 	coopla_type = "(F)fifo~1(i:o)";
	    		 }
	    	 }
	    	 else{ //rever outros casos - nao e a melhor solucao...
	    		 coopla_type = type + "(i:o)";
	    	 }
	    	 sb.append("\t\t" + coopla_type + "\tas " + setToString(type_channels.get(type)) + ";\n");
	     }
	     sb.append("\tin:\n");
	     
	     int i = 1;
   	 String joined_nodes = "";
	     for (pt.uminho.di.cp.model.Node node : cp.getNodes()){
	    	 String node_name = node.sepEndsByDot();
	    	 if (node_name.contains(".")){
	    		 joined_nodes += "\t\tjoin[" + setToString(node.getEnds()).replace('_', '.') + "] as j" + i + ";\n";
	    		 i++;
	    	 }
	    	 else{
	    		 sb.append("\t\t" + node_name + " = " + node_name.replace('_', '.') + ";\n");
	    	 }
	     }

   	 sb.append(joined_nodes);
	     sb.append("}");
	     
	     //continue stochastic conversion 
	     //... necessario mais informacao!
//	     LinkedHashMap<String, CoordinationPattern2> stoch_instances = pattern.getStochInstances();
//	     if (stoch_instances != null && !stoch_instances.isEmpty()){
//	    	 //do something with stochatic information...
//	     }
	     
//	     System.out.println(sb);
	     return sb.toString();
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
	
	private static String setToString(Set<String> args) {
		String sep = "";
		String values = "";
		for (String a : args){
			values += sep;
			values += a;
			
		        sep = ", ";
		}
		return values;
	}
	
	
	
	
	
	private void testWithReoLangPatternView(Set<ArchPatternAbstractGraph> graphs, ReCooPLaEditor editor){

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
					"No reconfigurations in main!");
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