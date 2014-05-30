package pt.uminho.di.reolang.reclang;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import pt.uminho.di.reolang.parsing.util.ErrorType;
import pt.uminho.di.reolang.parsing.util.SimpleError;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;

public class Main {
	
    public static void main(String args[]) throws Exception {
    	
    	String input_file = "InputExamples/reconfig.rpla";
    	File f = new File(input_file);
    	if(!f.exists()) {
    		System.out.println(SimpleError.report(ErrorType.ERROR, SimpleError.fileDoesNotExist(input_file)));
    	}
    	else{
	    	Processor p = new Processor(input_file);
	    	
	    	List<SimpleError> syntax_errors = p.getSyntaxErrors();
	    	if ( !syntax_errors.isEmpty() ){
	    		System.out.println(syntax_errors);
	    	}
	    	else{
	    		System.out.println("Started!");
	    		
	        	TinySymbolsTable ids_table = p.getIdentifiersTable();
//	        	System.out.println(ids_table.getSymbols().keySet());
	        	List<SimpleError> errors = p.getSemanticErrors(ids_table);
	        	
	        	HashMap<String, String> translation = new HashMap<String, String>();
//	        	translation = p.getTranslation("resources/template.stg", ids_table);

	        	if (errors != null && errors.isEmpty()){
	        		translation = p.getTranslation("resources/template.stg", ids_table);
	        	}
	        	else{
	        		System.out.println(errors);	
	        	}
	        	
	    	
		    	//do something with translation...
	//	    	System.out.println(translation);
		    	
		    	for (String t : translation.keySet()){
		    		String folder = "tests/";
		    		
		    		String file_name = t + ".java";
		    		String file_path = folder + file_name;
		    		
		    		PrintWriter writer = new PrintWriter(file_path, "UTF-8");
		    		writer.println("import " + Constants.JAVA_UTIL + ".*;");
		    		writer.println("import " + Constants.CP_MODEL + ".*;");
		    		writer.println("import " + Constants.CP_RECONFIGURATIONS + ".*;");
		    		writer.println("import " + Constants.REOLANG_PARSING_UTIL + ".*;\n");
		    		if (t.equals("Main")){
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
	//	    		executeCommand("javac" + " " + option + " " + classpath + " " + file_path);
		    		executeCommand("javac", option, classpath, file_path);
		    	}
		    	
	
				System.out.println("Finished!");
	    	}
    	}
    }
    

	/*
	private static void executeCommand(String command) {
     Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			p.destroy();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    }
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

    
    
    
    
    
    
//		//CharStream in = new ANTLRFileStream("InputExamples/new_reconfigurations.rlf", "UTF8");
//    	CharStream in = new ANTLRFileStream("InputExamples/rec_tests.rlf", "UTF8");
//		RecLexer lexer = new RecLexer(in);
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
// 		
//		RecParser parser = new RecParser(tokens);
//		
//        try{
//			RecParser.reclang_return res = parser.reclang();
//			
//			
//			//************IDENTIFIERS TABLE************//
//			CommonTreeNodeStream tree_it = new CommonTreeNodeStream(res.getTree());
//			System.out.println(((CommonTree) res.getTree()).toStringTree());
//			
//			RecTG walker_idtab = new RecTG(tree_it);
//			TinySymbolsTable ids_table = walker_idtab.reclang(); 
//			//System.out.println( ids_table.toString() );
//			
//			//***********SEMANTICS ANALYSIS************//
//			CommonTreeNodeStream tree_sa = new CommonTreeNodeStream(res.getTree());
//			RecSA walker_sa = new RecSA(tree_sa);
//			ArrayList<SimpleError> errors = walker_sa.reclang(ids_table);
//			
//			//***************TRANSLATOR***************//
//			//if there is no parse errors...
//			if(errors.isEmpty()){
//				//TRANSLATOR
//		        CommonTreeNodeStream tree_tltr = new CommonTreeNodeStream(res.getTree());
//				RecTranslator walker_tltr = new RecTranslator(tree_tltr);
//				
//				// load in T.stg template group, put in templates variable
//				FileReader groupFileR = new FileReader("resources/template.stg"); 
//				StringTemplateGroup templates = new StringTemplateGroup(groupFileR); 
//				groupFileR.close();
//				
//				walker_tltr.setTemplateLib(templates);
//				
//				
//				
//				RecTranslator.reclang_return r = walker_tltr.reclang();
//				
//		        StringTemplate result = (StringTemplate)r.getTemplate();
//		        System.out.println(result.toString()); // emit translation
//		        //*/
//			}
//			else {
//				System.out.println(errors.toString());
//			}
//			
//        } catch (Exception e) {
//            //System.out.println("Erro estranho ocorreu! -- No tree created!! " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//	private static boolean RemoveErrorNodes(CommonTree ast) 
//	    { 
//	    if (ast instanceof CommonErrorNode) 
//	        { 
//			System.out.println(ast.toString());
//	        ((CommonTree) ast.parent).deleteChild(ast.childIndex); 
//	        return true; 
//	        } 
//	
//	    for (int i = 0; i < ((CommonTree)ast).getChildCount(); ++i) 
//	        if (RemoveErrorNodes((CommonTree) ast.getChild(i))) 
//	            --i; 
//
//	    return false; 
//	    } 

}