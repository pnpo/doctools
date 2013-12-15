package pt.uminho.di.reolang.reclang;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import pt.uminho.di.reolang.ReoLangSemantics.reolang_return;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;
import pt.uminho.di.reolang.parsing.util.Type;

public class Main {

    public static void main(String args[]) throws Exception {
        

		CharStream in = new ANTLRFileStream("InputExamples/new_reconfigurations.rlf", "UTF8");
		RecLexer lexer = new RecLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
 		
		RecParser parser = new RecParser(tokens);
		
        try{
			RecParser.reclang_return res = parser.reclang();
			
			//System.out.println(((CommonTree)ret.getTree()).toStringTree());
			CommonTreeNodeStream tree = new CommonTreeNodeStream(res.getTree());
			System.out.println(((CommonTree) res.getTree()).toStringTree());
			
			RecTG walker_tabid = new RecTG(tree);
			TinySymbolsTable walker_ret = walker_tabid.reclang(); 
			System.out.println( walker_ret.toString() );
			
			/*
			CommonTreeNodeStream tree2 = new CommonTreeNodeStream(ret.getTree());
			RecTG_ver_sem walker_ver_sem = new RecTG_ver_sem(tree2);
			walker_ver_sem.programa(walker_ret);
			
			System.out.println(walker_ver_sem.getErrors());
			*/
			
			
			//System.out.println(walker_ret);
			
//============================
			/*			
    		CommonTree r = null;
    		
			r = (CommonTree) res.getTree();
			System.out.println("--------"); 
			System.out.println(r.toStringTree()); 
			*/
			
			
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