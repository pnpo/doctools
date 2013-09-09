package pt.uminho.di.reolang.parsing;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;


import pt.uminho.di.reolang.FuzzyParserReoLang;
import pt.uminho.di.reolang.FuzzyPreProcessor;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;

/***
 * 
 * @author Nuno
 * 
 * This classes is used to perform a single lexical analysis
 *
 */

public class FuzzyAnalysis extends CompilerPart {

	
	public FuzzyAnalysis(){
		super();
	}
	
	public FuzzyAnalysis(String file){
		super(file);
	}
	
	public FuzzyAnalysis(String file, String content){
		super(file, content);
	}
	
	
	@SuppressWarnings("finally")
	public SimpleSymbol performFuzzyAnalysis() {
		SimpleSymbol root_element = null;
		
		try {
			CharStream input;
			input = new ANTLRStringStream(this.getContent());
		
			FuzzyPreProcessor lex = new FuzzyPreProcessor(input);
			TokenStream tokens = new CommonTokenStream(lex);
			tokens.toString();
			String cleaned_text = lex.getPre_Processed_Text();
			
			FuzzyParserReoLang fprl = new FuzzyParserReoLang(new ANTLRStringStream(cleaned_text));
			fprl.setFile(this.getFile());
			
			root_element = fprl.getGlobalSymbol();
			
			TokenStream tokens2 = new CommonTokenStream(fprl);
			tokens2.toString();

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			return root_element;
		}
	}
}
