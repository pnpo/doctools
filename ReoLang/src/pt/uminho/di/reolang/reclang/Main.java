package pt.uminho.di.reolang.reclang;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import pt.uminho.di.reolang.ReoLangSemantics.reolang_return;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class Main {

    public static void main(String args[]) throws Exception {
        
    	
    	RecLexer lex = new RecLexer(new ANTLRFileStream("InputExamples/reconfigurations.rlf", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        
        
        RecParser parser = new RecParser(tokens);
		//parser.setFilePath("InputExamples/reconfigurations.rlf");
		
        try {
        	RecParser.reclang_return res = parser.reclang();
        	//System.out.println(parser.getErrors().toString());
        	System.out.println(((CommonTree) res.getTree()).toStringTree());
    		//CommonTree r = null;
    		
			//r = (CommonTree) root.getTree();
			//System.out.println("--------"); 
			//System.out.println(r.toStringTree()); 
			//RemoveErrorNodes(r);
			//System.out.println("--------");
			//System.out.println(r.toStringTree());
			
			
			
        } catch (Exception e) {
            System.out.println("Erro estranho ocorreu! -- No tree created!! " + e.getMessage());
            e.printStackTrace();
        }
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