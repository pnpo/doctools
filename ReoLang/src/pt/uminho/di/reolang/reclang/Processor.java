package pt.uminho.di.reolang.reclang;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

import pt.uminho.di.reolang.parsing.util.Error;
import pt.uminho.di.reolang.parsing.util.ErrorType;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;



public class Processor {

		private RecParser.reclang_return res;
	    private ArrayList<Error> syntax_errors;
	    private String file;
		
		
		public Processor(String input_file, String content) {
			
			try{
				CharStream in = content.equals("") ? new ANTLRFileStream(input_file, "UTF8") : new ANTLRStringStream(content);
				RecLexer lexer = new RecLexer(in);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
		 		
				RecParser parser = new RecParser(tokens);
				parser.setFilePath(input_file);
				
				this.res = parser.reclang();
				this.syntax_errors = parser.getErrors();
				this.file = input_file;
				
			} catch (Exception e) {
				System.out.println("exception: " + e);
		        System.out.println(Error.report(ErrorType.WARNING, "See Console for more details...", 0, input_file));
				e.printStackTrace();
		    }
		}
		
		
		
		public ArrayList<Error> getSyntaxErrors(){
			return syntax_errors;
		}
		
		
		public TinySymbolsTable getIdentifiersTable(TinySymbolsTable ids_table){
			TinySymbolsTable o_ids_table = null;
			try{
				//************IDENTIFIERS TABLE************//
				CommonTreeNodeStream tree_it = new CommonTreeNodeStream(this.res.getTree());
//				System.out.println(((CommonTree) res.getTree()).toStringTree());
				
				RecTG walker_idtab = new RecTG(tree_it);
				walker_idtab.setFilePath(this.file);
				
				o_ids_table = walker_idtab.reclang(ids_table);
			} catch (Exception e) {
		        e.printStackTrace();
		    }
			
			return o_ids_table;
		}
		
		
		public ArrayList<Error> getSemanticErrors(TinySymbolsTable ids_table){
			
			ArrayList<Error> errors = null;
			try{
				//***********SEMANTICS ANALYSIS************//
				CommonTreeNodeStream tree_sa = new CommonTreeNodeStream(this.res.getTree());
				RecSA walker_sa = new RecSA(tree_sa);
				walker_sa.setFilePath(this.file);
				
				errors = walker_sa.reclang(ids_table);
			} catch (Exception e) {
		        e.printStackTrace();
		    }
			
			return errors;
		}
		
		
		public HashMap<String, String> getTranslation(String template_path, TinySymbolsTable ids_table){
	        
			HashMap<String, String> translation = new HashMap<String, String>();
			try{
				//************ TRANSLATOR ************//
				CommonTreeNodeStream tree_tltr = new CommonTreeNodeStream(this.res.getTree());
				RecTranslator walker_tltr = new RecTranslator(tree_tltr);

				// load in T.stg template group, put in templates variable
				FileReader groupFileR = new FileReader(template_path); 
				StringTemplateGroup templates = new StringTemplateGroup(groupFileR); 
				groupFileR.close();
				
				walker_tltr.setTemplateLib(templates); 
				walker_tltr.reclang(ids_table);
				//RecTranslator.reclang_return r = walker_tltr.reclang();
				//StringTemplate result = (StringTemplate)r.getTemplate();
		        //System.out.println(result.toString()); // emit translation
		        
		        //translation = result.toString();
				translation = walker_tltr.getReconfigurations();
		        
			} catch (Exception e) {
		        e.printStackTrace();
		    }
			
	        return translation;
		}
}
