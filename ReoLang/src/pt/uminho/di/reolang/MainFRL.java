package pt.uminho.di.reolang;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import pt.uminho.di.reolang.ReoLangSemantics.reolang_return;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;

public class MainFRL {

	public static void main(String[] args) throws Exception {
	    
		String file = "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/runtime-EclipseApplication/Test/test.rlf";
		CharStream input = new ANTLRFileStream("InputExamples/error_rec_input.txt", "UTF8");
		FuzzyPreProcessor lex = new FuzzyPreProcessor(input);
		TokenStream tokens = new CommonTokenStream(lex);
		tokens.toString();
		String cleaned_text = lex.getPre_Processed_Text();
		//System.out.println(cleaned_text);
		
		FuzzyParserReoLang fprl = new FuzzyParserReoLang(new ANTLRStringStream(cleaned_text));
		fprl.setFile(file);
		CommonTokenStream tokens2 = new CommonTokenStream(fprl);
		tokens2.toString();
		System.out.println(fprl.getGlobalTable().getSymbols());
		
		
//		FuzzyPatternViewReoLang fprl2 = new FuzzyPatternViewReoLang(new ANTLRStringStream(cleaned_text), fprl.getGlobalTable());
//		fprl2.setFile(file);
//		CommonTokenStream tokens3 = new CommonTokenStream(fprl2);
//		tokens3.toString();
//		System.out.println(fprl2.getGraph());
		
		
		
		//System.out.println(lex.array.toString());
		
		//System.out.println(tokens);
/*
		Token t=null;
		do {
			t = lex.nextToken();
			System.out.println("### "+t);
		}
		while ( t==null || t.getType()!=Token.EOF );
*/
	}


}