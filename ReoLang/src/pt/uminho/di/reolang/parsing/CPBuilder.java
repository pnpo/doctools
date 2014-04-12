/**
 * 
 */
package pt.uminho.di.reolang.parsing;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import pt.uminho.di.cp.model.CPModelInternal;
import pt.uminho.di.reolang.ReoLangCP2;
import pt.uminho.di.reolang.ReoLangLexer;
import pt.uminho.di.reolang.ReoLangParser;
import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.ErrorType;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

/**
 * @author Nuno Oliveira
 * @date 10 de Abr de 2013
 *
 */
public class CPBuilder extends CompilerPart {

	
	public CPBuilder() {
		super();
	}

	/**
	 * @param file
	 * @param content
	 */
	public CPBuilder(String file, String content) {
		super(file, content);
	}

	/**
	 * @param file
	 */
	public CPBuilder(String file) {
		super(file);
	}

	
	
	
	
	
	@SuppressWarnings("finally")
	public ReoLangCP2 performModelConstruction(CommonTreeNodeStream tree, LinkedHashMap<String, CPModelInternal> patterns, LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Double>>> stoch_instances, SymbolsTable tab) {
		ReoLangCP2 final_result = null;
		
		try {
			ReoLangCP2 walker = new ReoLangCP2(tree);
		    walker.reolang(this.getFile(), patterns, tab);
		    final_result = walker;
		       			
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	         t.printStackTrace();
	         System.out.println(new Error(ErrorType.WARNING, "See Console for more details...", 0, 0, this.getFile()));
	     }
		finally{
			return final_result;
		}
	}
	
	
	
	
	
	
	
	@SuppressWarnings("finally")
	public ReoLangCP2 performModelConstruction(LinkedHashMap<String, CPModelInternal> patterns, SymbolsTable tab) {
		ReoLangCP2 final_result = null;
		
		try {
			CharStream stream = this.getContent().equals("") ? new ANTLRFileStream(this.getFile(), "UTF8"): new ANTLRStringStream(this.getContent());
			//System.out.println("Processing File: " + this.getFile());
			
			//LEXER
			ReoLangLexer lex = new ReoLangLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lex);
	        //PARSER
			ReoLangParser parser = new ReoLangParser(tokens);
			parser.setFilePath(this.getFile());
			ReoLangParser.reolang_return root = parser.reolang();
	        
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(root.getTree());
			ReoLangCP2 walker = new ReoLangCP2(nodes);
		    walker.reolang(this.getFile(), patterns, tab);
		    final_result = walker;   	
		    
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	         t.printStackTrace();
	         System.out.println(new Error(ErrorType.WARNING, "See Console for more details...", 0, 0, this.getFile()));
	     }
		finally{
			return final_result;
		}
	}
	
	
}
