package pt.uminho.di.reolang;



import java.util.HashMap;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import pt.uminho.di.cp.model.CoordinationPattern;
import pt.uminho.di.reolang.ReoLangSemantics.reolang_return;
import pt.uminho.di.reolang.parsing.CPBuilder;
import pt.uminho.di.reolang.parsing.Semantics;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class Main {

    public static void main(String args[]) throws Exception {
        
    	String file = "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/runtime-EclipseApplication/TrainingCompany/channels_and_patterns.rlf";
    	Semantics c = new Semantics(file, new ANTLRFileStream(file, "UTF8").toString());
    	c.performSemanticAnalysis(new SymbolsTable());
    	System.out.println(c.getErrors());
//    	ReoLangLexer lex = new ReoLangLexer(new ANTLRFileStream(file, "UTF8"));
//        CommonTokenStream tokens = new CommonTokenStream(lex);
//        
//        
//        ReoLangParser parser = new ReoLangParser(tokens);
//		parser.setFilePath(file);
//		
//        try {
//        	ReoLangParser.reolang_return root = parser.reolang();
//    		System.out.println(parser.getErrors().toString());
//    		CommonTree r = null;
//    		
//			r = (CommonTree) root.getTree();
//			System.out.println("--------"); 
//			System.out.println(r.toStringTree()); 
//			//RemoveErrorNodes(r);
//			//System.out.println("--------");
//			//System.out.println(r.toStringTree());
//			
//    		CommonTreeNodeStream nodes = new CommonTreeNodeStream(root.getTree());
//    		if(parser.getErrors().size()==0){
//				ReoLangSemantics tree_walker = new ReoLangSemantics(nodes);	
//		        reolang_return final_result = tree_walker.reolang(parser.getErrors(),file, new SymbolsTable());
//		        System.out.println(final_result.errors);
//		        if(final_result.errors.size()==0) {
//		        	CPBuilder cpb = new CPBuilder(file);
//		        	ReoLangCPModel res = cpb.performModelConstruction(new CommonTreeNodeStream(final_result.tree), null, null, final_result.symbols);
//		        	System.out.println(res.getPatterns());
//		        	System.out.println(res.getStochInstances());
////		        	System.out.println(CoordinationPattern.applyStochasticMap(res.getPatterns().get("InputNode").getCP(), res.getStochInstances().get("InputNode").get("stoch_input_node"), "stoch_input_node"));
//		        }
//    		}
//    		
//    		
//
//			
//        } catch (Exception e) {
//            System.out.println("Erro estranho ocorreu! -- No tree created!! " + e.getMessage());
//            e.printStackTrace();
//        }
    }

	private static boolean RemoveErrorNodes(CommonTree ast) 
	    { 
	    if (ast instanceof CommonErrorNode) 
	        { 
			System.out.println(ast.toString());
	        ((CommonTree) ast.parent).deleteChild(ast.childIndex); 
	        return true; 
	        } 
	
	    for (int i = 0; i < ((CommonTree)ast).getChildCount(); ++i) 
	        if (RemoveErrorNodes((CommonTree) ast.getChild(i))) 
	            --i; 

	    return false; 
	    } 


}