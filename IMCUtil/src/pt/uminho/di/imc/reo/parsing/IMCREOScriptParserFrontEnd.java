package pt.uminho.di.imc.reo.parsing;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

import pt.uminho.di.imc.reo.composition.Composer2;
import pt.uminho.di.imc.reo.imc.IMCREOimc;


public class IMCREOScriptParserFrontEnd {

	
	public static Composer2 parse(String input, boolean isfile) {
		Composer2 c = null; 
		try{
			IMCREOScriptParserLexer lex1 = new IMCREOScriptParserLexer(isfile? new ANTLRFileStream(input, "UTF-8") : new ANTLRStringStream(input));
			CommonTokenStream tokens1 = new CommonTokenStream(lex1);
			IMCREOScriptParserParser g1 = new IMCREOScriptParserParser(tokens1);
			g1.script();
			 
			c = g1.getComposer();
			 		 
		  }
		  catch (Exception e2) {
			  e2.printStackTrace();
		  }
		 
		 return c;
		 
	  }
	
}
