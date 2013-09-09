package pt.uminho.di.reolang.parsing;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

import pt.uminho.di.reolang.reclang.RecLexer;
import pt.uminho.di.reolang.reclang.RecParser;



public class RecLangSyntax extends CompilerPart {

	public RecLangSyntax(){
		super();
	}
	
	public RecLangSyntax(String file){
		super(file);
	}
	
	public RecLangSyntax(String file, String content){
		super(file, content);
	}
	
	
	public void performSyntacticAnalysis() {
		
		
		try {
			CharStream stream = this.getContent().equals("") ? new ANTLRFileStream(this.getFile(), "UTF8"): new ANTLRStringStream(this.getContent());
			//System.out.println("Processing File: " + this.getFile());
			
			//LEXER
			RecLexer lex = new RecLexer(stream);
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	        
	        //PARSER	        
	        RecParser parser = new RecParser(tokens);
			parser.setFilePath(this.getFile());
			
			parser.reclang();
	        this.setErrors(parser.getErrors());
	
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	         t.printStackTrace();
	     }
	}
	
	
}
