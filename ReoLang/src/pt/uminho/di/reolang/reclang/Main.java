package pt.uminho.di.reolang.reclang;


import java.util.ArrayList;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import pt.uminho.di.reolang.parsing.util.SimpleError;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;

public class Main {

    public static void main(String args[]) throws Exception {
        

		//CharStream in = new ANTLRFileStream("InputExamples/new_reconfigurations.rlf", "UTF8");
    	CharStream in = new ANTLRFileStream("InputExamples/rec_tests.rlf", "UTF8");
		RecLexer lexer = new RecLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
 		
		RecParser parser = new RecParser(tokens);
		
        try{
			RecParser.reclang_return res = parser.reclang();
			
			
			//************IDENTIFIERS TABLE************//
			CommonTreeNodeStream tree_it = new CommonTreeNodeStream(res.getTree());
			System.out.println(((CommonTree) res.getTree()).toStringTree());
			
			RecTG walker_idtab = new RecTG(tree_it);
			TinySymbolsTable ids_table = walker_idtab.reclang(); 
			//System.out.println( ids_table.toString() );
			
			//***********SEMANTICS ANALYSIS************//
			CommonTreeNodeStream tree_sa = new CommonTreeNodeStream(res.getTree());
			RecSA walker_sa = new RecSA(tree_sa);
			ArrayList<SimpleError> errors = walker_sa.reclang(ids_table);
			
			System.out.println(errors.toString());
			
        } catch (Exception e) {
            //System.out.println("Erro estranho ocorreu! -- No tree created!! " + e.getMessage());
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