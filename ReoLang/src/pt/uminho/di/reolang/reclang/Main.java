package pt.uminho.di.reolang.reclang;



import java.util.ArrayList;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.StringTemplate;

import pt.uminho.di.reolang.ReoLangParser;
import pt.uminho.di.reolang.ReoLangRSLTranslator;
import pt.uminho.di.reolang.ReoLangSemantics.reolang_return;
import pt.uminho.di.reolang.parsing.util.SimpleError;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;
import pt.uminho.di.reolang.parsing.util.Type;

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
			
			
			//************SEMANTICS ANALYSIS************//
			CommonTreeNodeStream tree_sa = new CommonTreeNodeStream(res.getTree());
			RecSA walker_sa = new RecSA(tree_sa);
			ArrayList<SimpleError> errors = walker_sa.reclang(ids_table);
			
			System.out.println(errors.toString());
			
/* **************			
			 //PARSER
			ReoLangParser parser = new ReoLangParser(tokens);
			parser.setFilePath(file);
			ReoLangParser.reolang_return root = parser.reolang();
	        
			
			//if there is no parse errors...
			if(parser.getErrors().size()==0){
				//SEMANTIC ANALYSER
		        CommonTreeNodeStream nodes = new CommonTreeNodeStream(root.getTree());
				ReoLangRSLTranslator tree_walker = new ReoLangRSLTranslator(nodes);
				tree_walker.setTemplateLib(templates);
				ReoLangRSLTranslator.reolang_return r = tree_walker.reolang();
				
		        StringTemplate result = (StringTemplate)r.getTemplate();
		        System.out.println(result.toString()); // emit translation
			}
			else {
				
			}
************** */
			
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