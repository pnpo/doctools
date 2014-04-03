package pt.uminho.di.imc.reo.parsing;




import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;

import pt.uminho.di.imc.reo.imc.IMCREOimc;

public class ReoMAParserFrontEnd {

	
	public static IMCREOimc parse(String input, boolean isfile) {
		IMCREOimc imc1 = null; 
		try{
		
			ReoMAParserLexer lex1 = new ReoMAParserLexer(isfile? new ANTLRFileStream(input, "UTF-8") : new ANTLRStringStream(input));
			CommonTokenStream tokens1 = new CommonTokenStream(lex1);
			ReoMAParserParser g1 = new ReoMAParserParser(tokens1);
			g1.imc();
			 
			imc1 = g1.getIMC();
			 		 
		  }
		  catch (Exception e2) {
			  e2.printStackTrace();
		  }
		 
		 return imc1;
		 
	  }
	
}
