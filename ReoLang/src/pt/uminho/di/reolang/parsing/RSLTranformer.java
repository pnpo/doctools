/**
 * @author Nuno Olivera
 */

package pt.uminho.di.reolang.parsing;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.StringTemplateGroup;

import pt.uminho.di.reolang.*;
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
public class RSLTranformer extends CompilerPart {
	

	

	public RSLTranformer(){
		super();
	}
	
	public RSLTranformer(String file){
		super(file);
	}
	
	public RSLTranformer(String file, String content){
		super(file, content);
	}
	
	@SuppressWarnings("finally")
	public String translateToRSL() {
		ReoLangRSLTranslator.reolang_return final_result = null;
		
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
				ReoLangSemantics.reolang_return sem_res = tree_walker.reolang(parser.getErrors(), this.getFile(), new SymbolsTable());
		        this.setErrors(sem_res.errors);
			}
			else {
				this.setErrors(parser.getErrors());
			}
		    
			if(this.getErrors().size() == 0) {
				CommonTreeNodeStream nodes = new CommonTreeNodeStream(root.getTree());
		        ReoLangRSLTranslator tree_walker = new ReoLangRSLTranslator(nodes);
		        
		        InputStream in = getClass().getResourceAsStream("../rsltemplates.stg");
			    BufferedReader input = new BufferedReader(new InputStreamReader(in));
			    StringTemplateGroup group = new StringTemplateGroup(input);
			    tree_walker.setTemplateLib(group);
			    
			    final_result = tree_walker.reolang();
			    return final_result.toString();
			}
			   			
				     
		} catch(Throwable t) {
	         System.out.println("exception: "+t);
	         t.printStackTrace();
	     }
		finally{
			return final_result.toString();
		}
	}
	
	
}
