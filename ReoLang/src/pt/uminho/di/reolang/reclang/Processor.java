package pt.uminho.di.reolang.reclang;

import java.io.FileReader;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import pt.uminho.di.reolang.parsing.util.SimpleError;
import pt.uminho.di.reolang.parsing.util.TinySymbolsTable;



public class Processor {

		private RecParser.reclang_return res;
		
		public Processor(String input_file) {
			
			try{
				CharStream in = new ANTLRFileStream(input_file, "UTF8");
				RecLexer lexer = new RecLexer(in);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
		 		
				RecParser parser = new RecParser(tokens);
				
				this.res = parser.reclang();
				
			} catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		
		
		public ArrayList<SimpleError> getSemanticErrors(){
			
			ArrayList<SimpleError> errors = null;
			try{
				//************IDENTIFIERS TABLE************//
				CommonTreeNodeStream tree_it = new CommonTreeNodeStream(this.res.getTree());
				System.out.println(((CommonTree) res.getTree()).toStringTree());
				
				RecTG walker_idtab = new RecTG(tree_it);
				TinySymbolsTable ids_table = walker_idtab.reclang(); 
				//System.out.println( ids_table.toString() );
				
				//***********SEMANTICS ANALYSIS************//
				CommonTreeNodeStream tree_sa = new CommonTreeNodeStream(this.res.getTree());
				RecSA walker_sa = new RecSA(tree_sa);
				errors = walker_sa.reclang(ids_table);
			} catch (Exception e) {
		        e.printStackTrace();
		    }
			
			return errors;
		}
		
		
		public String getTranslation(String template_path){
	        
			String translation = "";
			try{
				CommonTreeNodeStream tree_tltr = new CommonTreeNodeStream(this.res.getTree());
				RecTranslator walker_tltr = new RecTranslator(tree_tltr);
				
				// load in T.stg template group, put in templates variable
				FileReader groupFileR = new FileReader(template_path); 
				StringTemplateGroup templates = new StringTemplateGroup(groupFileR); 
				groupFileR.close();
				
				walker_tltr.setTemplateLib(templates);
				
				
				RecTranslator.reclang_return r = walker_tltr.reclang();
				
		        StringTemplate result = (StringTemplate)r.getTemplate();
		        System.out.println(result.toString()); // emit translation
		        
		        translation = result.toString(); 
		        
			} catch (Exception e) {
		        e.printStackTrace();
		    }
			
	        return translation;
		}
}
