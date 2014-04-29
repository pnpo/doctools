package pt.uminho.di.reolang.reclang;

import java.util.ArrayList;
import java.util.List;

import pt.uminho.di.reolang.parsing.util.SimpleError;

public class Main {
	
    public static void main(String args[]) throws Exception {
        /*
    	List<String> datatype = new ArrayList<String>();
    	datatype.add("LinkedHashSet");
    	//datatype.add("Pair");
    	datatype.add("Triple");
    	datatype.add("Node");
    	
    	RecTranslator rt = new RecTranslator(null);
    	String dt = rt.datatypeToString(datatype);
    	
    	System.out.println(dt);
    	*/
        
    	Processor p = new Processor("InputExamples/new_reconfigurations.part.rlf");
    	List<SimpleError> errors = p.getSemanticErrors();
    	
    	ArrayList<String> translation = new ArrayList<String>();
    	if (errors != null && errors.isEmpty()){
    		translation = p.getTranslation("resources/template.stg");
    	}
    	else{
    		System.out.println(errors);	
    	}
    	
    	//do something with translation...
    	System.out.println(translation);
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