package pt.uminho.di.reolang.parsing;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;


import pt.uminho.di.reolang.ReoLangLexer;

/***
 * 
 * @author Nuno
 * 
 * This classes is used to perform a single lexical analysis
 *
 */

public class Lexer extends CompilerPart {

	
	public Lexer(){
		super();
	}
	
	public Lexer(String file){
		super(file);
	}
	
	public Lexer(String file, String content){
		super(file, content);
	}
	
	
	@SuppressWarnings("finally")
	public CommonTokenStream performLexicalAnalysis() {
		CommonTokenStream tokens = null;
		
		try {
			CharStream stream = this.getContent().equals("") ? new ANTLRFileStream(this.getFile(), "UTF8"): new ANTLRStringStream(this.getContent());
			//System.out.println("Processing File: " + this.getFile());
			
			//LEXER
			ReoLangLexer lex = new ReoLangLexer(stream);
			tokens = new CommonTokenStream(lex);
	        	     
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	         t.printStackTrace();
	     }
		finally{
			return tokens;
		}
	}
	
	
}
