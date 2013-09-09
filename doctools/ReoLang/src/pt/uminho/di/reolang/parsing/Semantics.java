/**
 * @author Nuno Olivera
 */

package pt.uminho.di.reolang.parsing;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import pt.uminho.di.reolang.*;
import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.ErrorType;
import pt.uminho.di.reolang.parsing.util.SymbolsTable;


/**
 * 
 * @author Nuno Oliveira
 * 
 * This class is used to perform semantic analysis.
 * It performs lexical and syntactic analysis previously 
 * Only performs semantic analysis if parsing returns no errors.
 *
 */
public class Semantics extends CompilerPart {
	

	

	public Semantics(){
		super();
	}
	
	public Semantics(String file){
		super(file);
	}
	
	public Semantics(String file, String content){
		super(file, content);
	}
	
	@SuppressWarnings("finally")
	public ReoLangSemantics.reolang_return performSemanticAnalysis(SymbolsTable symbols_table ) {
		ReoLangSemantics.reolang_return final_result = null;
		
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
	        
			//System.out.println("tree="+((Tree)root.getTree()).toStringTree());
			
			//if there is no parse errors...
			if(parser.getErrors().size()==0){
				//SEMANTIC ANALYSER
		        CommonTreeNodeStream nodes = new CommonTreeNodeStream(root.getTree());
				ReoLangSemantics tree_walker = new ReoLangSemantics(nodes);
		        final_result = tree_walker.reolang(parser.getErrors(), this.getFile(), symbols_table);
		        this.setErrors(final_result.errors);
			}
			else {
				this.setErrors(parser.getErrors());
			}
			
				     
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	         t.printStackTrace();
	         final_result.errors.add(new Error(ErrorType.WARNING, "See Console for more details...", 0, 0, this.getFile()));
	     }
		finally{
			return final_result;
		}
	}
	
	
}
