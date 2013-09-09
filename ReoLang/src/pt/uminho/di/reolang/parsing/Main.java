package pt.uminho.di.reolang.parsing;

import java.io.IOException;


import pt.uminho.di.reolang.ReoLangLexer;
import pt.uminho.di.reolang.ReoLangParser;
import pt.uminho.di.reolang.ReoLangRSLTranslator;
import pt.uminho.di.reolang.ReoLangSemantics;
import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.ErrorType;
import pt.uminho.di.reolang.parsing.util.SimpleSymbol;
import pt.uminho.di.reolang.parsing.util.SimpleSymbolsTable;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.*;
import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String file = (args.length == 0) ? "InputExamples/patterns.rlf" : args[0];
		
		// load in T.stg template group, put in templates variable
		FileReader groupFileR = new FileReader("src/pt/uminho/di/reolang/rsltemplates.stg"); 
		StringTemplateGroup templates = new StringTemplateGroup(groupFileR); 
		groupFileR.close();
		
		 
		
		try {
			CharStream stream = new ANTLRFileStream(file, "UTF8");
			
			//LEXER
			ReoLangLexer lex = new ReoLangLexer(stream);
			CommonTokenStream tokens = new CommonTokenStream(lex);
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
			
				     
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	     }
		
		
		
		
		/*String file = (args.length == 0) ? "InputExamples/sequencer.rlf" : args[0];
		FuzzyAnalysis fa =  new FuzzyAnalysis(file);
		SimpleSymbol st = fa.performFuzzyAnalysis();
		
		PatternViewer pv = new PatternViewer(file, st);
		pv.createPatternViewer();
		System.out.println(pv.getGraph());
		*/
		/*String file = (args.length == 0) ? "InputExamples/patterns.rlf" : args[0];
		System.out.println("\n**This is Just an Example of the ReoLang Semantic Parser**");
		
		Semantics semantics = new Semantics(file);
		ReoLangSemantics.reolang_return res = semantics.performSemanticAnalysis(new SymbolsTable());
		try{
		System.out.println("\nSYMBOLS:\n" + res.symbols);
		System.out.println("ERRORS:\n" + res.errors);
		}
		catch(Exception e){
			System.out.println(semantics.getErrors());
		}*/
	}

}
