/**
 * @author Nuno Olivera
 */

package pt.uminho.di.reolang.parsing;

import org.antlr.runtime.*;
import pt.uminho.di.reolang.*;



/**
 * 
 * @author Nuno Oliveira
 *
 * This class is used to perform a single syntactic analysis (with a previous lexical analysis)
 *
 */

public class Syntax extends CompilerPart {
	

	public Syntax(){
		super();
	}
	
	public Syntax(String file){
		super(file);
	}
	
	public Syntax(String file, String content){
		super(file, content);
	}
	
	@SuppressWarnings("finally")
	public ReoLangParser.reolang_return performSyntacticAnalysis() {
		ReoLangParser.reolang_return final_result = null;
		
		try {
			CharStream stream = this.getContent().equals("") ? new ANTLRFileStream(this.getFile(), "UTF8"): new ANTLRStringStream(this.getContent());
			//System.out.println("Processing File: " + this.getFile());
			
			//LEXER
			ReoLangLexer lex = new ReoLangLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lex);
	        //PARSER
			ReoLangParser parser = new ReoLangParser(tokens);
			parser.setFilePath(this.getFile());
			final_result = parser.reolang();
	        this.setErrors(parser.getErrors());
	
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	         t.printStackTrace();
	     }
		finally{
			return final_result;
		}
	}
	
	
}
