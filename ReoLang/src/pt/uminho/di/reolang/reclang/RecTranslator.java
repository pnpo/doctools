// $ANTLR 3.5.1 /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g 2014-11-10 19:32:04

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.ReoLangCP2;
	import pt.uminho.di.reolang.ReoLangSemantics;
	import pt.uminho.di.reolang.parsing.Semantics;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.reolang.reclang.Constants;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.cp.model.CPModelInternal;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.LinkedHashMap;
	import java.io.File;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class RecTranslator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "CONS_NODE", "CONS_PAIR", 
		"CONS_SET", "CONS_TRIPLE", "CONS_XOR", "DT_CHANNEL", "DT_NAME", "DT_NODE", 
		"DT_PAIR", "DT_PATTERN", "DT_SET", "DT_TRIPLE", "DT_XOR", "ESC_SEQ", "HEX_DIGIT", 
		"ID", "INT", "OCTAL_ESC", "OP_APPLY", "OP_CHANNELS", "OP_CONST", "OP_ENDS", 
		"OP_EQUAL", "OP_FST", "OP_ID", "OP_IN", "OP_INTERSECTION", "OP_JOIN", 
		"OP_MINUS", "OP_NAME", "OP_NAMES", "OP_NODES", "OP_OUT", "OP_PAR", "OP_PATH", 
		"OP_READ", "OP_REMOVE", "OP_SND", "OP_SPLIT", "OP_TRD", "OP_UNION", "OP_UPDATE", 
		"OP_WRITE", "RW_FORALL", "RW_IMPORT", "RW_MAIN", "RW_RECONFIGURATION", 
		"SEP_ACCESSOR", "SEP_ARGS_END", "SEP_ARGS_START", "SEP_BLOCK_END", "SEP_BLOCK_START", 
		"SEP_COLON", "SEP_COMMA", "SEP_LIST_END", "SEP_LIST_START", "SEP_OPTIONAL", 
		"SEP_SEMICOLON", "SEP_STRUCTURE", "SEP_SUBTYPE_END", "SEP_SUBTYPE_START", 
		"SEP_TRIGGER", "STRING", "UNICODE_ESC", "WS", "ACCESS", "APPLICATION", 
		"ARGUMENT", "ARGUMENTS", "ASSIGNMENT", "DECLARATION", "FORALL", "IDS", 
		"IMPORT", "IN", "INSTRUCTIONS", "MAIN", "NODE", "OUT", "PAIR", "RECONFIGS", 
		"RECONFIGURATION", "SET", "SIGNATURE", "STRUCTURE", "SUBTYPE", "TRIPLE", 
		"XOR"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int CONS_NODE=5;
	public static final int CONS_PAIR=6;
	public static final int CONS_SET=7;
	public static final int CONS_TRIPLE=8;
	public static final int CONS_XOR=9;
	public static final int DT_CHANNEL=10;
	public static final int DT_NAME=11;
	public static final int DT_NODE=12;
	public static final int DT_PAIR=13;
	public static final int DT_PATTERN=14;
	public static final int DT_SET=15;
	public static final int DT_TRIPLE=16;
	public static final int DT_XOR=17;
	public static final int ESC_SEQ=18;
	public static final int HEX_DIGIT=19;
	public static final int ID=20;
	public static final int INT=21;
	public static final int OCTAL_ESC=22;
	public static final int OP_APPLY=23;
	public static final int OP_CHANNELS=24;
	public static final int OP_CONST=25;
	public static final int OP_ENDS=26;
	public static final int OP_EQUAL=27;
	public static final int OP_FST=28;
	public static final int OP_ID=29;
	public static final int OP_IN=30;
	public static final int OP_INTERSECTION=31;
	public static final int OP_JOIN=32;
	public static final int OP_MINUS=33;
	public static final int OP_NAME=34;
	public static final int OP_NAMES=35;
	public static final int OP_NODES=36;
	public static final int OP_OUT=37;
	public static final int OP_PAR=38;
	public static final int OP_PATH=39;
	public static final int OP_READ=40;
	public static final int OP_REMOVE=41;
	public static final int OP_SND=42;
	public static final int OP_SPLIT=43;
	public static final int OP_TRD=44;
	public static final int OP_UNION=45;
	public static final int OP_UPDATE=46;
	public static final int OP_WRITE=47;
	public static final int RW_FORALL=48;
	public static final int RW_IMPORT=49;
	public static final int RW_MAIN=50;
	public static final int RW_RECONFIGURATION=51;
	public static final int SEP_ACCESSOR=52;
	public static final int SEP_ARGS_END=53;
	public static final int SEP_ARGS_START=54;
	public static final int SEP_BLOCK_END=55;
	public static final int SEP_BLOCK_START=56;
	public static final int SEP_COLON=57;
	public static final int SEP_COMMA=58;
	public static final int SEP_LIST_END=59;
	public static final int SEP_LIST_START=60;
	public static final int SEP_OPTIONAL=61;
	public static final int SEP_SEMICOLON=62;
	public static final int SEP_STRUCTURE=63;
	public static final int SEP_SUBTYPE_END=64;
	public static final int SEP_SUBTYPE_START=65;
	public static final int SEP_TRIGGER=66;
	public static final int STRING=67;
	public static final int UNICODE_ESC=68;
	public static final int WS=69;
	public static final int ACCESS=70;
	public static final int APPLICATION=71;
	public static final int ARGUMENT=72;
	public static final int ARGUMENTS=73;
	public static final int ASSIGNMENT=74;
	public static final int DECLARATION=75;
	public static final int FORALL=76;
	public static final int IDS=77;
	public static final int IMPORT=78;
	public static final int IN=79;
	public static final int INSTRUCTIONS=80;
	public static final int MAIN=81;
	public static final int NODE=82;
	public static final int OUT=83;
	public static final int PAIR=84;
	public static final int RECONFIGS=85;
	public static final int RECONFIGURATION=86;
	public static final int SET=87;
	public static final int SIGNATURE=88;
	public static final int STRUCTURE=89;
	public static final int SUBTYPE=90;
	public static final int TRIPLE=91;
	public static final int XOR=92;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public RecTranslator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecTranslator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("RecTranslatorTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return RecTranslator.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g"; }


		private HashMap<String,String> reconfigurations;
		
		public HashMap<String,String> getReconfigurations(){
			return this.reconfigurations;
		}
		
		/* unused */
		private Pair<String,String> main;
		
		public Pair<String,String> getMain(){
			return this.main;
		}
		
		
		
		private String datatypeToString(List<String> full_dt){
			String datatype = "";
			
			for (int i = full_dt.size()-1; i>=0; i--){
				String dt = full_dt.get(i);
				if (dt.equals("Pair")){
					datatype = dt + "<" + datatype + ", " + datatype +  ">";
				}
				else if(dt.equals("Triple")){
					datatype = dt + "<" + datatype + ", " + datatype + ", " + datatype + ">";
				}
				else if(i != full_dt.size()-1){
					datatype = dt + "<" + datatype + ">";
				}
				else {
					datatype = dt;		
				}
			}
			
			return datatype;
		}
		
		private List<String> convertRecooplaDatatype(List<Type> recoopla_datatype){
			List<String> datatype = new ArrayList<String>();
			for (Type t : recoopla_datatype){
				String type = t.toString().toLowerCase();
				type = Character.toUpperCase(type.charAt(0)) + type.substring(1);
							
				//convert ReCooPLa datatypes to java datatypes
				type = type.replace("Set", "LinkedHashSet").replace("Pattern", "CoordinationPattern2").replace("Channel", "CommunicationMean2").replace("Name", "String");
				
				datatype.add(type);
			}
			return datatype;
		}
		
		//convert list args to string, separated by ','
		private String listToString(List<String> args){
			String sep = "";
			String values = "";
			for (String a : args){
				values += sep;
				values += a;
				
			        sep = ", ";
			}
			return values;
		}
		
		private TinySymbolsTable getScope(Integer id){
			TinySymbolsTable scope = null;
			for (int i = 0; i < reconfiguration_def_stack.peek().scopes.size(); i++){
				TinySymbolsTable tst = reconfiguration_def_stack.peek().scopes.get(i);
				if ( tst.getScopeRel().fst().equals(id) ) {
					scope = reconfiguration_def_stack.peek().scopes.get(i);
					break;
				}
			}
			return scope;
		}


	protected static class reclang_scope {
		TinySymbolsTable ids_table;
		SymbolsTable coopla_table;
		List<String> imported_coopla_files;
		LinkedHashMap<String, CPModelInternal> patterns;
		int scope_id;
		int parent_id;
		int aux_id;
		List<Integer> scopes;
	}
	protected Stack<reclang_scope> reclang_stack = new Stack<reclang_scope>();

	public static class reclang_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "reclang"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:108:1: reclang[TinySymbolsTable global_table] : ^( RECONFIGS ( directive_def )* content ) ;
	public final RecTranslator.reclang_return reclang(TinySymbolsTable global_table) throws RecognitionException {
		reclang_stack.push(new reclang_scope());
		RecTranslator.reclang_return retval = new RecTranslator.reclang_return();
		retval.start = input.LT(1);


			reclang_stack.peek().ids_table = global_table;
			reclang_stack.peek().coopla_table = new SymbolsTable();
			reclang_stack.peek().imported_coopla_files = new ArrayList<String>();
			reclang_stack.peek().coopla_table = new SymbolsTable();
			reclang_stack.peek().patterns = new LinkedHashMap<String, CPModelInternal>();
			
			this.reconfigurations = new HashMap<String, String>();
			
			reclang_stack.peek().scope_id = 0;
			reclang_stack.peek().parent_id = 0;
			reclang_stack.peek().aux_id = 0;
			
			reclang_stack.peek().scopes = new ArrayList<Integer>(); //LinkedList or Stack
			reclang_stack.peek().scopes.add(0);
			

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:137:2: ( ^( RECONFIGS ( directive_def )* content ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:137:4: ^( RECONFIGS ( directive_def )* content )
			{
			match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang67); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:137:16: ( directive_def )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==IMPORT) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:137:16: directive_def
						{
						pushFollow(FOLLOW_directive_def_in_reclang69);
						directive_def();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				pushFollow(FOLLOW_content_in_reclang72);
				content();
				state._fsp--;

				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			reclang_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "reclang"


	public static class directive_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "directive_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:144:1: directive_def : directive_import ;
	public final RecTranslator.directive_def_return directive_def() throws RecognitionException {
		RecTranslator.directive_def_return retval = new RecTranslator.directive_def_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:145:2: ( directive_import )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:145:4: directive_import
			{
			pushFollow(FOLLOW_directive_import_in_directive_def89);
			directive_import();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "directive_def"


	public static class directive_import_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "directive_import"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:149:1: directive_import : ^( IMPORT STRING ) ;
	public final RecTranslator.directive_import_return directive_import() throws RecognitionException {
		RecTranslator.directive_import_return retval = new RecTranslator.directive_import_return();
		retval.start = input.LT(1);

		CommonTree STRING1=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:150:2: ( ^( IMPORT STRING ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:150:4: ^( IMPORT STRING )
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_directive_import103); 
			match(input, Token.DOWN, null); 
			STRING1=(CommonTree)match(input,STRING,FOLLOW_STRING_in_directive_import105); 

					String file_name = (STRING1!=null?STRING1.getText():null);
					String file = file_name.substring(1, file_name.length()-1); //remove " from string
					
				    	File f = new File( file );
				    	if( f.exists() ){
						String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
						
						if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {	//rpla
							ReCooPLaProcessor p = new ReCooPLaProcessor(file, "");
							TinySymbolsTable imported_ids_table = p.getIdentifiersTable(reclang_stack.peek().ids_table);
							HashMap<String, String> imported_translation = p.getTranslation(imported_ids_table);
							
							this.reconfigurations.putAll(imported_translation);
						}
						else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//*.cpla
							reclang_stack.peek().imported_coopla_files.add(file);
							/*
							CPBuilder cp_model_builder = new CPBuilder(file);
							ReoLangCP2 res = cp_model_builder.performModelConstruction(this.patterns, reclang_stack.peek().coopla_table);
							this.patterns = res.getPatterns() != null ? res.getPatterns() : this.patterns;
							*/
							Semantics semantics = new Semantics(file);
							ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis(reclang_stack.peek().coopla_table);
							reclang_stack.peek().coopla_table = imported_atts != null ? imported_atts.symbols : reclang_stack.peek().coopla_table ;
							
							
							CPBuilder cp_model_builder = new CPBuilder(file);
							ReoLangCP2 res = cp_model_builder.performModelConstruction(reclang_stack.peek().patterns, reclang_stack.peek().coopla_table);
							reclang_stack.peek().patterns = res.getPatterns() != null ? res.getPatterns() : reclang_stack.peek().patterns;
						}
					}
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "directive_import"


	protected static class content_scope {
		TinySymbol ts;
		TinySymbolsTable current_scope;
	}
	protected Stack<content_scope> content_stack = new Stack<content_scope>();

	public static class content_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "content"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:190:1: content : ( element )* ( main )? ;
	public final RecTranslator.content_return content() throws RecognitionException {
		content_stack.push(new content_scope());
		RecTranslator.content_return retval = new RecTranslator.content_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope element2 =null;
		TreeRuleReturnScope main3 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:195:2: ( ( element )* ( main )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:195:4: ( element )* ( main )?
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:195:4: ( element )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==APPLICATION||LA2_0==RECONFIGURATION) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:195:5: element
					{
					pushFollow(FOLLOW_element_in_content129);
					element2=element();
					state._fsp--;

						
							this.reconfigurations.put((element2!=null?((RecTranslator.element_return)element2).name:null), (element2!=null?((StringTemplate)element2.getTemplate()):null).toString());
						
					}
					break;

				default :
					break loop2;
				}
			}

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:201:2: ( main )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MAIN) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:201:3: main
					{
					pushFollow(FOLLOW_main_in_content142);
					main3=main();
					state._fsp--;

						
							this.reconfigurations.put((main3!=null?((RecTranslator.main_return)main3).name:null), (main3!=null?((StringTemplate)main3.getTemplate()):null).toString());
							//this.main = new Pair<String, String>((main3!=null?((RecTranslator.main_return)main3).name:null), (main3!=null?((StringTemplate)main3.getTemplate()):null).toString());
						
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			content_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "content"


	public static class element_return extends TreeRuleReturnScope {
		public String name;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "element"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:210:1: element returns [String name] : ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st}| ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st});
	public final RecTranslator.element_return element() throws RecognitionException {
		RecTranslator.element_return retval = new RecTranslator.element_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope reconfiguration_def4 =null;
		TreeRuleReturnScope applicaiton_def5 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:211:2: ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st}| ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st})
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RECONFIGURATION) ) {
				alt4=1;
			}
			else if ( (LA4_0==APPLICATION) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:211:4: ^( RECONFIGURATION reconfiguration_def )
					{
					match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element166); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_reconfiguration_def_in_element168);
					reconfiguration_def4=reconfiguration_def();
					state._fsp--;


							retval.name = (reconfiguration_def4!=null?((RecTranslator.reconfiguration_def_return)reconfiguration_def4).id:null);
						
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 216:2: -> {$reconfiguration_def.st}
					{
						retval.st = (reconfiguration_def4!=null?((StringTemplate)reconfiguration_def4.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:218:4: ^( APPLICATION applicaiton_def )
					{
					match(input,APPLICATION,FOLLOW_APPLICATION_in_element187); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_applicaiton_def_in_element189);
					applicaiton_def5=applicaiton_def();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 219:2: -> {$applicaiton_def.st}
					{
						retval.st = (applicaiton_def5!=null?((StringTemplate)applicaiton_def5.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element"


	public static class main_return extends TreeRuleReturnScope {
		public String name;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:222:1: main returns [String name] : ^( MAIN main_def ) -> {$main_def.st};
	public final RecTranslator.main_return main() throws RecognitionException {
		RecTranslator.main_return retval = new RecTranslator.main_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope main_def6 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:223:2: ( ^( MAIN main_def ) -> {$main_def.st})
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:223:4: ^( MAIN main_def )
			{
			match(input,MAIN,FOLLOW_MAIN_in_main210); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_main_def_in_main212);
			main_def6=main_def();
			state._fsp--;


					retval.name = (main_def6!=null?((RecTranslator.main_def_return)main_def6).id:null);
				
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 228:2: -> {$main_def.st}
			{
				retval.st = (main_def6!=null?((StringTemplate)main_def6.getTemplate()):null);
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main"


	protected static class reconfiguration_def_scope {
		ArrayList<TinySymbolsTable> scopes;
		List<String> datatype;
		String class_name;
		List<String> args;
		Set<String> reconfs;
		List<String> insts;
		String adv;
	}
	protected Stack<reconfiguration_def_scope> reconfiguration_def_stack = new Stack<reconfiguration_def_scope>();

	public static class reconfiguration_def_return extends TreeRuleReturnScope {
		public String id;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "reconfiguration_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:232:1: reconfiguration_def returns [String id] : ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st);
	public final RecTranslator.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
		reconfiguration_def_stack.push(new reconfiguration_def_scope());
		RecTranslator.reconfiguration_def_return retval = new RecTranslator.reconfiguration_def_return();
		retval.start = input.LT(1);

		CommonTree ID7=null;
		TreeRuleReturnScope args_def8 =null;
		TreeRuleReturnScope reconfiguration_block9 =null;


			content_stack.peek().ts = new TinySymbol();
			reconfiguration_def_stack.peek().scopes = new ArrayList<TinySymbolsTable>();
			reclang_stack.peek().scope_id = 0;
			
			reconfiguration_def_stack.peek().class_name = "";
			reconfiguration_def_stack.peek().args = new ArrayList<String>();
			
			//body
			reconfiguration_def_stack.peek().reconfs = new HashSet<String>();
			reconfiguration_def_stack.peek().insts = new ArrayList<String>();
			
			reconfiguration_def_stack.peek().adv = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:261:2: ( ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st))
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:261:4: ^( ID ( args_def )? reconfiguration_block[false] )
			{
			ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def246); 

					reconfiguration_def_stack.peek().class_name = Character.toUpperCase((ID7!=null?ID7.getText():null).charAt(0)) + (ID7!=null?ID7.getText():null).substring(1);
					
					TinySymbol ts = reclang_stack.peek().ids_table.getSymbols().get((ID7!=null?ID7.getText():null));
					content_stack.peek().ts = ts;
					retval.id = reconfiguration_def_stack.peek().class_name;
					
					reconfiguration_def_stack.peek().scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
				
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:272:2: ( args_def )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ARGUMENTS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:272:2: args_def
					{
					pushFollow(FOLLOW_args_def_in_reconfiguration_def255);
					args_def8=args_def();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def258);
			reconfiguration_block9=reconfiguration_block(false);
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 272:43: -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st)
			{
				retval.st = templateLib.getInstanceOf("mkclass",new STAttrMap().put("name", reconfiguration_def_stack.peek().class_name).put("fields", (args_def8!=null?((RecTranslator.args_def_return)args_def8).values:null)).put("constructor", (args_def8!=null?((StringTemplate)args_def8.getTemplate()):null)).put("method", (reconfiguration_block9!=null?((StringTemplate)reconfiguration_block9.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			reconfiguration_def_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_def"


	public static class args_def_return extends TreeRuleReturnScope {
		public List<String> values;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "args_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:276:1: args_def returns [List<String> values] : ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids);
	public final RecTranslator.args_def_return args_def() throws RecognitionException {
		RecTranslator.args_def_return retval = new RecTranslator.args_def_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope arg_def10 =null;


			List<String> ctfields = new ArrayList<String>();
			List<String> ids = new ArrayList<String>();
			List<String> dts = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:282:2: ( ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids))
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:282:4: ^( ARGUMENTS ( arg_def )+ )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def305); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:283:2: ( arg_def )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ARGUMENT) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:283:3: arg_def
					{
					pushFollow(FOLLOW_arg_def_in_args_def310);
					arg_def10=arg_def();
					state._fsp--;


							ctfields.add((arg_def10!=null?((StringTemplate)arg_def10.getTemplate()):null).toString());
							ids.addAll((arg_def10!=null?((RecTranslator.arg_def_return)arg_def10).values:null));
							for (int i = 0; i < (arg_def10!=null?((RecTranslator.arg_def_return)arg_def10).values:null).size(); i++){
								dts.add((arg_def10!=null?((RecTranslator.arg_def_return)arg_def10).datatype:null));
							}
						
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match(input, Token.UP, null); 

				
					retval.values = ctfields;// + constructor;
				
			// TEMPLATE REWRITE
			// 296:2: -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids)
			{
				retval.st = templateLib.getInstanceOf("constructor",new STAttrMap().put("n", reconfiguration_def_stack.peek().class_name).put("dts", dts).put("ids", ids));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "args_def"


	public static class arg_def_return extends TreeRuleReturnScope {
		public String datatype;
		public List<String> values;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arg_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:299:1: arg_def returns [String datatype, List<String> values] : ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st};
	public final RecTranslator.arg_def_return arg_def() throws RecognitionException {
		RecTranslator.arg_def_return retval = new RecTranslator.arg_def_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope list_ids11 =null;


			reconfiguration_def_stack.peek().datatype = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:303:2: ( ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st})
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:303:4: ^( ARGUMENT datatype list_ids[dt] )
			{
			match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def364); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_arg_def366);
			datatype();
			state._fsp--;


					String dt = datatypeToString(reconfiguration_def_stack.peek().datatype);
				
			pushFollow(FOLLOW_list_ids_in_arg_def373);
			list_ids11=list_ids(dt);
			state._fsp--;

			match(input, Token.UP, null); 


					retval.values = (list_ids11!=null?((RecTranslator.list_ids_return)list_ids11).values:null);
					retval.datatype = dt;
				
			// TEMPLATE REWRITE
			// 313:2: -> {$list_ids.st}
			{
				retval.st = (list_ids11!=null?((StringTemplate)list_ids11.getTemplate()):null);
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arg_def"


	public static class datatype_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "datatype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:316:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
	public final RecTranslator.datatype_return datatype() throws RecognitionException {
		RecTranslator.datatype_return retval = new RecTranslator.datatype_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope other_type12 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:317:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
			int alt7=6;
			switch ( input.LA(1) ) {
			case DT_PATTERN:
				{
				alt7=1;
				}
				break;
			case DT_CHANNEL:
				{
				alt7=2;
				}
				break;
			case DT_NAME:
				{
				alt7=3;
				}
				break;
			case DT_NODE:
				{
				alt7=4;
				}
				break;
			case DT_XOR:
				{
				alt7=5;
				}
				break;
			case DT_PAIR:
			case DT_SET:
			case DT_TRIPLE:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:317:4: DT_PATTERN
					{
					match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype398); 
					 reconfiguration_def_stack.peek().datatype.add("CoordinationPattern2"); 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:318:4: DT_CHANNEL
					{
					match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype405); 
					 reconfiguration_def_stack.peek().datatype.add("CommunicationMean2"); 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:319:4: DT_NAME
					{
					match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype412); 
					 reconfiguration_def_stack.peek().datatype.add("String"); 
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:320:4: DT_NODE
					{
					match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype420); 
					 reconfiguration_def_stack.peek().datatype.add("Node"); 
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:321:4: DT_XOR
					{
					match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype427); 
					 reconfiguration_def_stack.peek().datatype.add("Node"); 
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:322:4: ^( other_type subtype )
					{
					pushFollow(FOLLOW_other_type_in_datatype438);
					other_type12=other_type();
					state._fsp--;

					 reconfiguration_def_stack.peek().datatype.add((other_type12!=null?((RecTranslator.other_type_return)other_type12).name:null)); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subtype_in_datatype443);
					subtype();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "datatype"


	public static class other_type_return extends TreeRuleReturnScope {
		public String name;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "other_type"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:326:1: other_type returns [String name] : ( DT_SET | DT_PAIR | DT_TRIPLE );
	public final RecTranslator.other_type_return other_type() throws RecognitionException {
		RecTranslator.other_type_return retval = new RecTranslator.other_type_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:327:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
			int alt8=3;
			switch ( input.LA(1) ) {
			case DT_SET:
				{
				alt8=1;
				}
				break;
			case DT_PAIR:
				{
				alt8=2;
				}
				break;
			case DT_TRIPLE:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:327:4: DT_SET
					{
					match(input,DT_SET,FOLLOW_DT_SET_in_other_type460); 
					 retval.name = "LinkedHashSet"; 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:328:4: DT_PAIR
					{
					match(input,DT_PAIR,FOLLOW_DT_PAIR_in_other_type471); 
					 retval.name = "Pair"; 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:329:4: DT_TRIPLE
					{
					match(input,DT_TRIPLE,FOLLOW_DT_TRIPLE_in_other_type479); 
					 retval.name = "Triple"; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "other_type"


	public static class subtype_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subtype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:332:1: subtype : datatype ;
	public final RecTranslator.subtype_return subtype() throws RecognitionException {
		RecTranslator.subtype_return retval = new RecTranslator.subtype_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:333:2: ( datatype )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:333:4: datatype
			{
			pushFollow(FOLLOW_datatype_in_subtype492);
			datatype();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subtype"


	public static class list_ids_return extends TreeRuleReturnScope {
		public List<String> values;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "list_ids"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:336:1: list_ids[String dt] returns [List<String> values] : ( ID )+ -> list_fields(datatype=$list_ids.dtids=ids);
	public final RecTranslator.list_ids_return list_ids(String dt) throws RecognitionException {
		RecTranslator.list_ids_return retval = new RecTranslator.list_ids_return();
		retval.start = input.LT(1);

		CommonTree ID13=null;


			List<String> ids = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:340:2: ( ( ID )+ -> list_fields(datatype=$list_ids.dtids=ids))
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:340:3: ( ID )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:340:3: ( ID )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ID) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:340:4: ID
					{
					ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids513); 

							ids.add("_" + (ID13!=null?ID13.getText():null));
							reconfiguration_def_stack.peek().args.add((ID13!=null?ID13.getText():null));
						
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}


					retval.values = ids; 
					//System.out.println(ids);
				
			// TEMPLATE REWRITE
			// 351:2: -> list_fields(datatype=$list_ids.dtids=ids)
			{
				retval.st = templateLib.getInstanceOf("list_fields",new STAttrMap().put("datatype", dt).put("ids", ids));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_ids"


	public static class reconfiguration_block_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "reconfiguration_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:356:1: reconfiguration_block[boolean isForall] : ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts);
	public final RecTranslator.reconfiguration_block_return reconfiguration_block(boolean isForall) throws RecognitionException {
		RecTranslator.reconfiguration_block_return retval = new RecTranslator.reconfiguration_block_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope instruction14 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:357:2: ( ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts))
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:357:4: ^( INSTRUCTIONS ( instruction )+ )
			{
			match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block559); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:357:19: ( instruction )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==OP_APPLY||(LA10_0 >= ASSIGNMENT && LA10_0 <= FORALL)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:357:20: instruction
					{
					pushFollow(FOLLOW_instruction_in_reconfiguration_block562);
					instruction14=instruction();
					state._fsp--;


							if (isForall){
								for_instruction_stack.peek().insts.add((instruction14!=null?((RecTranslator.instruction_return)instruction14).value:null));
							}
							else{
								reconfiguration_def_stack.peek().insts.add((instruction14!=null?((RecTranslator.instruction_return)instruction14).value:null));
							}
						
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 367:4: -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts)
			{
				retval.st = templateLib.getInstanceOf("apply_method",new STAttrMap().put("reconfs", reconfiguration_def_stack.peek().reconfs).put("insts", reconfiguration_def_stack.peek().insts));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_block"


	protected static class instruction_scope {
		String dt;
	}
	protected Stack<instruction_scope> instruction_stack = new Stack<instruction_scope>();

	public static class instruction_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:370:1: instruction returns [String value] : ( declaration | assignment | reconfiguration_apply[false] | for_instruction );
	public final RecTranslator.instruction_return instruction() throws RecognitionException {
		instruction_stack.push(new instruction_scope());
		RecTranslator.instruction_return retval = new RecTranslator.instruction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope declaration15 =null;
		TreeRuleReturnScope assignment16 =null;
		TreeRuleReturnScope reconfiguration_apply17 =null;
		TreeRuleReturnScope for_instruction18 =null;


			content_stack.peek().current_scope = this.getScope( reclang_stack.peek().scopes.get(reclang_stack.peek().scopes.size()-1) ); //rever
			instruction_stack.peek().dt = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:378:2: ( declaration | assignment | reconfiguration_apply[false] | for_instruction )
			int alt11=4;
			switch ( input.LA(1) ) {
			case DECLARATION:
				{
				alt11=1;
				}
				break;
			case ASSIGNMENT:
				{
				alt11=2;
				}
				break;
			case OP_APPLY:
				{
				alt11=3;
				}
				break;
			case FORALL:
				{
				alt11=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:378:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_instruction608);
					declaration15=declaration();
					state._fsp--;

					 retval.value = (declaration15!=null?((RecTranslator.declaration_return)declaration15).value:null); 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:379:4: assignment
					{
					pushFollow(FOLLOW_assignment_in_instruction617);
					assignment16=assignment();
					state._fsp--;

					 retval.value = (assignment16!=null?((RecTranslator.assignment_return)assignment16).value:null); 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:380:4: reconfiguration_apply[false]
					{
					pushFollow(FOLLOW_reconfiguration_apply_in_instruction626);
					reconfiguration_apply17=reconfiguration_apply(false);
					state._fsp--;

					 retval.value = (reconfiguration_apply17!=null?((RecTranslator.reconfiguration_apply_return)reconfiguration_apply17).value:null); 
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:381:4: for_instruction
					{
					pushFollow(FOLLOW_for_instruction_in_instruction634);
					for_instruction18=for_instruction();
					state._fsp--;

					 
							retval.value = (for_instruction18!=null?((RecTranslator.for_instruction_return)for_instruction18).value:null); 

							reclang_stack.peek().scopes.remove(reclang_stack.peek().scopes.size()-1);
							reclang_stack.peek().parent_id = reclang_stack.peek().scopes.get(reclang_stack.peek().scopes.size()-1);
							reclang_stack.peek().aux_id--;
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			instruction_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class reconfiguration_apply_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "reconfiguration_apply"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:391:1: reconfiguration_apply[boolean isAssignment] returns [String value] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
	public final RecTranslator.reconfiguration_apply_return reconfiguration_apply(boolean isAssignment) throws RecognitionException {
		RecTranslator.reconfiguration_apply_return retval = new RecTranslator.reconfiguration_apply_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope reconfiguration_call19 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:392:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:392:4: ^( OP_APPLY reconfiguration_call ( ID )? )
			{
			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply656); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply658);
			reconfiguration_call19=reconfiguration_call();
			state._fsp--;


					String op = (reconfiguration_call19!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call19).name:null);
					//eg: par -> P + ar = Par
					String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
					reconfiguration_def_stack.peek().reconfs.add(class_name + " " + op + ";");
					
					String args = (reconfiguration_call19!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call19).args:null);
					
					String rec = "";
					if (isAssignment){
						String var_name = "_" + assignment_stack.peek().ts.getId();
						String dt = instruction_stack.peek().dt;
						//List<String> dt = new ArrayList<String>( this.convertRecooplaDatatype( assignment_stack.peek().ts.getDataType() ) );
						//String datatype = datatypeToString(dt);
						rec = op + " = new " + class_name + "(" + args + ");\n";
						rec += "final " + dt + var_name + " = " + op + ".apply($cp)"; //add template
						
					}
					else{
						rec = op + " = new " + class_name + "(" + args + ");\n" + op + ".apply($cp)"; //add template
					}
					
					retval.value = rec + ";";
				
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:418:2: ( ID )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:418:2: ID
					{
					match(input,ID,FOLLOW_ID_in_reconfiguration_apply667); 
					}
					break;

			}

			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_apply"


	public static class declaration_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "declaration"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:421:1: declaration returns [String value] : ^( DECLARATION datatype ( var_def )+ ) ;
	public final RecTranslator.declaration_return declaration() throws RecognitionException {
		RecTranslator.declaration_return retval = new RecTranslator.declaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope var_def20 =null;


			reconfiguration_def_stack.peek().datatype = new ArrayList<String>();
			
			List<String> decls = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:427:2: ( ^( DECLARATION datatype ( var_def )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:427:4: ^( DECLARATION datatype ( var_def )+ )
			{
			match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration689); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_declaration691);
			datatype();
			state._fsp--;


					instruction_stack.peek().dt = datatypeToString(reconfiguration_def_stack.peek().datatype) + " ";
				
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:432:2: ( var_def )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==ID||LA13_0==ASSIGNMENT) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:432:3: var_def
					{
					pushFollow(FOLLOW_var_def_in_declaration701);
					var_def20=var_def();
					state._fsp--;

						
							if ((var_def20!=null?((RecTranslator.var_def_return)var_def20).isRec:false)) {
								decls.add((var_def20!=null?((RecTranslator.var_def_return)var_def20).value:null));
							}
							else {
								if ((var_def20!=null?((RecTranslator.var_def_return)var_def20).isAssignment:false)){
									decls.add("final " + instruction_stack.peek().dt + (var_def20!=null?((RecTranslator.var_def_return)var_def20).value:null));
								}
								else {
									String v = (var_def20!=null?((RecTranslator.var_def_return)var_def20).value:null);
									v = v.substring(0, v.length()-1); //remove ';'
									decls.add("final " + instruction_stack.peek().dt + v + ";"); //" = null;"
								}
							}
						
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}


					//convert list decls to string
					String all_decls = "";
					for (String d : decls){
						all_decls += d + "\n";
					}		
					retval.value = all_decls;
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class var_def_return extends TreeRuleReturnScope {
		public String value;
		public boolean isRec;
		public boolean isAssignment;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "var_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:460:1: var_def returns [String value, boolean isRec, boolean isAssignment] : ( ID | assignment );
	public final RecTranslator.var_def_return var_def() throws RecognitionException {
		RecTranslator.var_def_return retval = new RecTranslator.var_def_return();
		retval.start = input.LT(1);

		CommonTree ID21=null;
		TreeRuleReturnScope assignment22 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:461:2: ( ID | assignment )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ID) ) {
				alt14=1;
			}
			else if ( (LA14_0==ASSIGNMENT) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:461:4: ID
					{
					ID21=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def729); 
					 
							retval.value = "_" + (ID21!=null?ID21.getText():null) + ";"; 
							retval.isAssignment = false;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:467:4: assignment
					{
					pushFollow(FOLLOW_assignment_in_var_def740);
					assignment22=assignment();
					state._fsp--;

					 
							retval.value = (assignment22!=null?((RecTranslator.assignment_return)assignment22).value:null);
							retval.isRec = (assignment22!=null?((RecTranslator.assignment_return)assignment22).isRec:false);		
							retval.isAssignment = true;
							
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_def"


	protected static class assignment_scope {
		TinySymbol ts;
	}
	protected Stack<assignment_scope> assignment_stack = new Stack<assignment_scope>();

	public static class assignment_return extends TreeRuleReturnScope {
		public String value;
		public boolean isRec;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:476:1: assignment returns [String value, boolean isRec] : ^( ASSIGNMENT ID assignment_member ) ;
	public final RecTranslator.assignment_return assignment() throws RecognitionException {
		assignment_stack.push(new assignment_scope());
		RecTranslator.assignment_return retval = new RecTranslator.assignment_return();
		retval.start = input.LT(1);

		CommonTree ID23=null;
		TreeRuleReturnScope assignment_member24 =null;


			assignment_stack.peek().ts = new TinySymbol();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:483:2: ( ^( ASSIGNMENT ID assignment_member ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:483:4: ^( ASSIGNMENT ID assignment_member )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment767); 
			match(input, Token.DOWN, null); 
			ID23=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment769); 

					Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();	
					assignment_stack.peek().ts = content_stack.peek().current_scope.containsSymbol((ID23!=null?ID23.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((ID23!=null?ID23.getText():null)) : content_stack.peek().ts.hasValue((ID23!=null?ID23.getText():null), s_id);	
				
			pushFollow(FOLLOW_assignment_member_in_assignment778);
			assignment_member24=assignment_member();
			state._fsp--;


					if ((assignment_member24!=null?((RecTranslator.assignment_member_return)assignment_member24).isRec:false)) {
						retval.value = (assignment_member24!=null?((RecTranslator.assignment_member_return)assignment_member24).value:null);
					}
					else{	
						retval.value = "_" + (ID23!=null?ID23.getText():null) + " = " + (assignment_member24!=null?((RecTranslator.assignment_member_return)assignment_member24).value:null) + ";";
					}
					retval.isRec = (assignment_member24!=null?((RecTranslator.assignment_member_return)assignment_member24).isRec:false);
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			assignment_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class assignment_member_return extends TreeRuleReturnScope {
		public String value;
		public boolean isRec;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignment_member"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:502:1: assignment_member returns [String value, boolean isRec] : ( expression | reconfiguration_apply[true] );
	public final RecTranslator.assignment_member_return assignment_member() throws RecognitionException {
		RecTranslator.assignment_member_return retval = new RecTranslator.assignment_member_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression25 =null;
		TreeRuleReturnScope reconfiguration_apply26 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:503:2: ( expression | reconfiguration_apply[true] )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID||LA15_0==OP_INTERSECTION||LA15_0==OP_MINUS||LA15_0==OP_PATH||(LA15_0 >= OP_UNION && LA15_0 <= OP_UPDATE)||LA15_0==ACCESS||LA15_0==PAIR||LA15_0==SET||LA15_0==TRIPLE) ) {
				alt15=1;
			}
			else if ( (LA15_0==OP_APPLY) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:503:4: expression
					{
					pushFollow(FOLLOW_expression_in_assignment_member801);
					expression25=expression();
					state._fsp--;

					 
							//conditional isOp -> if (isOp) { retval.value = " bla bla" + (expression25!=null?((RecTranslator.expression_return)expression25).value:null);}
							retval.value = (expression25!=null?((RecTranslator.expression_return)expression25).value:null);
							retval.isRec = false;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:510:4: reconfiguration_apply[true]
					{
					pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member815);
					reconfiguration_apply26=reconfiguration_apply(true);
					state._fsp--;

					 
							retval.value = (reconfiguration_apply26!=null?((RecTranslator.reconfiguration_apply_return)reconfiguration_apply26).value:null);
							retval.isRec = true; 	
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_member"


	public static class reconfiguration_call_return extends TreeRuleReturnScope {
		public String name;
		public String args;
		public List<String> dts;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "reconfiguration_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:517:1: reconfiguration_call returns [String name, String args, List<String> dts] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
	public final RecTranslator.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
		RecTranslator.reconfiguration_call_return retval = new RecTranslator.reconfiguration_call_return();
		retval.start = input.LT(1);

		CommonTree OP_JOIN27=null;
		CommonTree OP_SPLIT29=null;
		CommonTree OP_PAR31=null;
		CommonTree OP_REMOVE33=null;
		CommonTree OP_CONST35=null;
		CommonTree OP_ID37=null;
		CommonTree ID38=null;
		TreeRuleReturnScope operation_args28 =null;
		TreeRuleReturnScope operation_args30 =null;
		TreeRuleReturnScope operation_args32 =null;
		TreeRuleReturnScope operation_args34 =null;
		TreeRuleReturnScope operation_args36 =null;
		TreeRuleReturnScope operation_args39 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:518:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
			int alt16=7;
			switch ( input.LA(1) ) {
			case OP_JOIN:
				{
				alt16=1;
				}
				break;
			case OP_SPLIT:
				{
				alt16=2;
				}
				break;
			case OP_PAR:
				{
				alt16=3;
				}
				break;
			case OP_REMOVE:
				{
				alt16=4;
				}
				break;
			case OP_CONST:
				{
				alt16=5;
				}
				break;
			case OP_ID:
				{
				alt16=6;
				}
				break;
			case ID:
				{
				alt16=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:518:4: ^( OP_JOIN operation_args )
					{
					OP_JOIN27=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call836); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call838);
						operation_args28=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							retval.name = (OP_JOIN27!=null?OP_JOIN27.getText():null);
							retval.args = (operation_args28!=null?((RecTranslator.operation_args_return)operation_args28).values:null);
							retval.dts = (operation_args28!=null?((RecTranslator.operation_args_return)operation_args28).datatypes:null);
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:524:4: ^( OP_SPLIT operation_args )
					{
					OP_SPLIT29=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call848); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call850);
						operation_args30=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							retval.name = (OP_SPLIT29!=null?OP_SPLIT29.getText():null);
							retval.args = (operation_args30!=null?((RecTranslator.operation_args_return)operation_args30).values:null);
							retval.dts = (operation_args30!=null?((RecTranslator.operation_args_return)operation_args30).datatypes:null);
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:530:4: ^( OP_PAR operation_args )
					{
					OP_PAR31=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call860); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call862);
						operation_args32=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							retval.name = (OP_PAR31!=null?OP_PAR31.getText():null);
							retval.args = (operation_args32!=null?((RecTranslator.operation_args_return)operation_args32).values:null);
							retval.dts = (operation_args32!=null?((RecTranslator.operation_args_return)operation_args32).datatypes:null);		
						
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:536:4: ^( OP_REMOVE operation_args )
					{
					OP_REMOVE33=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call872); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call874);
						operation_args34=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							retval.name = (OP_REMOVE33!=null?OP_REMOVE33.getText():null);
							retval.args = (operation_args34!=null?((RecTranslator.operation_args_return)operation_args34).values:null);
							retval.dts = (operation_args34!=null?((RecTranslator.operation_args_return)operation_args34).datatypes:null);
						
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:542:4: ^( OP_CONST operation_args )
					{
					OP_CONST35=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call884); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call886);
						operation_args36=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							retval.name = (OP_CONST35!=null?OP_CONST35.getText():null);
							retval.args = (operation_args36!=null?((RecTranslator.operation_args_return)operation_args36).values:null);
							retval.dts = (operation_args36!=null?((RecTranslator.operation_args_return)operation_args36).datatypes:null);
						
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:548:4: ^( OP_ID operation_args )
					{
					OP_ID37=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call896); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call898);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							retval.name = (OP_ID37!=null?OP_ID37.getText():null);
							retval.args = ""; //id does not have args
							retval.dts = new ArrayList<String>();
						
					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:554:4: ^( ID operation_args )
					{
					ID38=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call908); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call910);
						operation_args39=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							retval.name = (ID38!=null?ID38.getText():null);
							retval.args = (operation_args39!=null?((RecTranslator.operation_args_return)operation_args39).values:null);
							retval.dts = (operation_args39!=null?((RecTranslator.operation_args_return)operation_args39).datatypes:null);
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_call"


	public static class structure_operation_call_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "structure_operation_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:563:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
	public final RecTranslator.structure_operation_call_return structure_operation_call() throws RecognitionException {
		RecTranslator.structure_operation_call_return retval = new RecTranslator.structure_operation_call_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:564:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==OP_PATH) ) {
				alt17=1;
			}
			else if ( (LA17_0==OP_UPDATE) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:564:4: ^( OP_PATH operation_args )
					{
					match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call929); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_structure_operation_call931);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:565:4: ^( OP_UPDATE operation_args )
					{
					match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call938); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_structure_operation_call940);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structure_operation_call"


	public static class operation_args_return extends TreeRuleReturnScope {
		public String values;
		public List<String> datatypes;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operation_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:569:1: operation_args returns [String values, List<String> datatypes] : ( args )? ;
	public final RecTranslator.operation_args_return operation_args() throws RecognitionException {
		RecTranslator.operation_args_return retval = new RecTranslator.operation_args_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope args40 =null;


			String args = "";
			List<String> datatypes = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:574:2: ( ( args )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:574:4: ( args )?
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:574:4: ( args )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID||LA18_0==OP_INTERSECTION||LA18_0==OP_MINUS||LA18_0==OP_PATH||(LA18_0 >= OP_UNION && LA18_0 <= OP_UPDATE)||LA18_0==ACCESS||LA18_0==PAIR||LA18_0==SET||LA18_0==TRIPLE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:574:5: args
					{
					pushFollow(FOLLOW_args_in_operation_args963);
					args40=args();
					state._fsp--;


							args = (args40!=null?((RecTranslator.args_return)args40).values:null);
							datatypes = (args40!=null?((RecTranslator.args_return)args40).datatypes:null);
						
					}
					break;

			}


					retval.values = args;
					retval.datatypes = datatypes;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operation_args"


	public static class args_return extends TreeRuleReturnScope {
		public String values;
		public List<String> datatypes;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:587:1: args returns [String values, List<String> datatypes] : ( expression )+ ;
	public final RecTranslator.args_return args() throws RecognitionException {
		RecTranslator.args_return retval = new RecTranslator.args_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression41 =null;


			List<String> args = new ArrayList<String>();
			List<String> datatypes = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:592:2: ( ( expression )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:592:4: ( expression )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:592:4: ( expression )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==ID||LA19_0==OP_INTERSECTION||LA19_0==OP_MINUS||LA19_0==OP_PATH||(LA19_0 >= OP_UNION && LA19_0 <= OP_UPDATE)||LA19_0==ACCESS||LA19_0==PAIR||LA19_0==SET||LA19_0==TRIPLE) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:592:5: expression
					{
					pushFollow(FOLLOW_expression_in_args995);
					expression41=expression();
					state._fsp--;


							args.add((expression41!=null?((RecTranslator.expression_return)expression41).value:null));
							datatypes.add((expression41!=null?((RecTranslator.expression_return)expression41).dt:null));
						
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}


					//convert list args to string, separated by ','
					retval.values = listToString(args);
					retval.datatypes = datatypes;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "args"


	protected static class for_instruction_scope {
		List<String> insts;
		TinySymbolsTable forall_table;
	}
	protected Stack<for_instruction_scope> for_instruction_stack = new Stack<for_instruction_scope>();

	public static class for_instruction_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "for_instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:607:1: for_instruction returns [String value] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) ;
	public final RecTranslator.for_instruction_return for_instruction() throws RecognitionException {
		for_instruction_stack.push(new for_instruction_scope());
		RecTranslator.for_instruction_return retval = new RecTranslator.for_instruction_return();
		retval.start = input.LT(1);

		CommonTree id1=null;
		CommonTree id2=null;


			reconfiguration_def_stack.peek().datatype = new ArrayList<String>();
			reconfiguration_def_stack.peek().adv += "\t";
			
			for_instruction_stack.peek().insts = new ArrayList<String>();
			
			
			if (reclang_stack.peek().scopes.contains(reclang_stack.peek().aux_id)){
				reclang_stack.peek().parent_id = reclang_stack.peek().aux_id;
			}
			else{
				reclang_stack.peek().parent_id = reclang_stack.peek().scopes.get(reclang_stack.peek().scopes.size()-1);
			}
			reclang_stack.peek().scope_id++;
			
			reclang_stack.peek().scopes.add(reclang_stack.peek().scope_id);
			reclang_stack.peek().aux_id++;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:632:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:632:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] )
			{
			match(input,FORALL,FOLLOW_FORALL_in_for_instruction1034); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_for_instruction1036);
			datatype();
			state._fsp--;


					String dt = datatypeToString(reconfiguration_def_stack.peek().datatype);
				
			id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction1047); 
			id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction1051); 

					content_stack.peek().current_scope = this.getScope(reclang_stack.peek().parent_id); //rever
				
					String value = "_" + (id1!=null?id1.getText():null);
					
					//name of set to iterate
					String set_name = "";
					/*
					if (reconfiguration_def_stack.peek().args.contains((id2!=null?id2.getText():null))){
						set_name = "this." + "_" + (id2!=null?id2.getText():null);
					}
					else{
						set_name = "_" + (id2!=null?id2.getText():null);
					}
					*/
					set_name = "_" + (id2!=null?id2.getText():null);
				
			pushFollow(FOLLOW_reconfiguration_block_in_for_instruction1060);
			reconfiguration_block(true);
			state._fsp--;


					//String adv = reconfiguration_def_stack.peek().adv.substring(0, reconfiguration_def_stack.peek().adv.length() - 2);
					String for_insts = "for(" + dt + " " + value + " : " + set_name + ") {\n"; //add template -> for(dt,v,set,insts)
					
					for (String i : for_instruction_stack.peek().insts) {
						String[] parts = i.split("\n"); //separate instructions by line breaks
						for (String p : parts){
							for_insts += "\t" + p + "\n";
						}
					}
					for_insts += "}";
					
					retval.value = for_insts;
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			for_instruction_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "for_instruction"


	public static class expression_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public boolean isOp;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:675:1: expression returns [String value, String dt, boolean isOp] : ( ^( OP_UNION s1= factor s2= factor ) | ^( OP_INTERSECTION s1= factor s2= factor ) | ^( OP_MINUS s1= factor s2= factor ) | factor );
	public final RecTranslator.expression_return expression() throws RecognitionException {
		RecTranslator.expression_return retval = new RecTranslator.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope s2 =null;
		TreeRuleReturnScope factor42 =null;


			String value = "";
			
			List<String> dt = new ArrayList<String>();
			String datatype = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:682:2: ( ^( OP_UNION s1= factor s2= factor ) | ^( OP_INTERSECTION s1= factor s2= factor ) | ^( OP_MINUS s1= factor s2= factor ) | factor )
			int alt20=4;
			switch ( input.LA(1) ) {
			case OP_UNION:
				{
				alt20=1;
				}
				break;
			case OP_INTERSECTION:
				{
				alt20=2;
				}
				break;
			case OP_MINUS:
				{
				alt20=3;
				}
				break;
			case ID:
			case OP_PATH:
			case OP_UPDATE:
			case ACCESS:
			case PAIR:
			case SET:
			case TRIPLE:
				{
				alt20=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:682:4: ^( OP_UNION s1= factor s2= factor )
					{
					match(input,OP_UNION,FOLLOW_OP_UNION_in_expression1089); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression1093);
					s1=factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression1097);
					s2=factor();
					state._fsp--;

					match(input, Token.UP, null); 

						
							if (content_stack.peek().ts.getId().equals("$main")){
								datatype = "LinkedHashSet<" + (s1!=null?((RecTranslator.factor_return)s1).dt:null) + ">";
							} else{
								dt = this.convertRecooplaDatatype( assignment_stack.peek().ts.getDataType() );
								datatype = this.datatypeToString(dt);
							}
						
							value += "new " + datatype + "(" + (s1!=null?((RecTranslator.factor_return)s1).value:null) + "){{ \n";
							
							value += "\taddAll( ";
							if ((s2!=null?((RecTranslator.factor_return)s2).value:null).contains("\n")){
								String[] parts = (s2!=null?((RecTranslator.factor_return)s2).value:null).split("\n"); //separate instructions by line breaks
								for (String p : parts){
									value += p + "\n\t\t";
								}
								value = value.substring(0, value.length()-1) + ");";
							}
							else {
								value += (s2!=null?((RecTranslator.factor_return)s2).value:null) + " );";
							}
							value += "\n}}";
							
							retval.value = value;
									
							retval.dt = (s1!=null?((RecTranslator.factor_return)s1).dt:null); //s1 and s2 have the same datatype
							retval.isOp = false; //true
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:712:4: ^( OP_INTERSECTION s1= factor s2= factor )
					{
					match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1109); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression1113);
					s1=factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression1117);
					s2=factor();
					state._fsp--;

					match(input, Token.UP, null); 


							if (content_stack.peek().ts.getId().equals("$main")){
								datatype = "LinkedHashSet<" + (s1!=null?((RecTranslator.factor_return)s1).dt:null) + ">";
							} else{
								dt = this.convertRecooplaDatatype( assignment_stack.peek().ts.getDataType() );
								datatype = this.datatypeToString(dt);
							}
							
							//rever
							value += "new " + datatype + "(" + (s1!=null?((RecTranslator.factor_return)s1).value:null) + "){{ \n";
							//value += "retainAll( " + (s1!=null?((RecTranslator.factor_return)s1).value:null) + " ); \n}}";
							////value += "_" + assignment_stack.peek().ts.getId() + ".retainAll( " + (s2!=null?((RecTranslator.factor_return)s2).value:null) + " )";
							value += "\tretainAll( ";
							if ((s2!=null?((RecTranslator.factor_return)s2).value:null).contains("\n")){
								String[] parts = (s2!=null?((RecTranslator.factor_return)s2).value:null).split("\n"); //separate instructions by line breaks
								for (String p : parts){
									value += p + "\n\t\t";
								}
								value = value.substring(0, value.length()-1) + ");";
							}
							else {
								value += (s2!=null?((RecTranslator.factor_return)s2).value:null) + " );";
							}
							value += "\n}}";
							
							retval.value = value;
									
							retval.dt = (s1!=null?((RecTranslator.factor_return)s1).dt:null); //s1 and s2 have the same datatype
							retval.isOp = false; //true
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:744:4: ^( OP_MINUS s1= factor s2= factor )
					{
					match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1129); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression1133);
					s1=factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression1137);
					s2=factor();
					state._fsp--;

					match(input, Token.UP, null); 


							if (content_stack.peek().ts.getId().equals("$main")){
								datatype = "LinkedHashSet<" + (s1!=null?((RecTranslator.factor_return)s1).dt:null) + ">";
							} else{
								dt = this.convertRecooplaDatatype( assignment_stack.peek().ts.getDataType() );
								datatype = this.datatypeToString(dt);
							}
							
							//rever
							value += "new " + datatype + "(" + (s1!=null?((RecTranslator.factor_return)s1).value:null) + "){{ \n";
							//value += "removeAll( " + (s1!=null?((RecTranslator.factor_return)s1).value:null) + " ); \n}}";
							////value += "_" + assignment_stack.peek().ts.getId() + ".removeAll( " + (s2!=null?((RecTranslator.factor_return)s2).value:null) + " )";
							value += "\tremoveAll( ";
							if ((s2!=null?((RecTranslator.factor_return)s2).value:null).contains("\n")){
								String[] parts = (s2!=null?((RecTranslator.factor_return)s2).value:null).split("\n"); //separate instructions by line breaks
								for (String p : parts){
									value += p + "\n\t\t";
								}
								value = value.substring(0, value.length()-1) + ");";
							}
							else {
								value += (s2!=null?((RecTranslator.factor_return)s2).value:null) + " );";
							}
							value += "\n}}";
							
							retval.value = value;
									
							retval.dt = (s1!=null?((RecTranslator.factor_return)s1).dt:null); //s1 and s2 have the same datatype
							retval.isOp = false; //true
						
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:776:4: factor
					{
					pushFollow(FOLLOW_factor_in_expression1149);
					factor42=factor();
					state._fsp--;


							retval.value = (factor42!=null?((RecTranslator.factor_return)factor42).value:null);
							retval.dt = (factor42!=null?((RecTranslator.factor_return)factor42).dt:null);
							retval.isOp = false;		
						
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class factor_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "factor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:785:1: factor returns [String value, String dt] : ( ^( ID ID ) | ID | operation | constructor );
	public final RecTranslator.factor_return factor() throws RecognitionException {
		RecTranslator.factor_return retval = new RecTranslator.factor_return();
		retval.start = input.LT(1);

		CommonTree ID43=null;
		TreeRuleReturnScope operation44 =null;
		TreeRuleReturnScope constructor45 =null;


			List<String> dt = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:789:2: ( ^( ID ID ) | ID | operation | constructor )
			int alt21=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA21_1 = input.LA(2);
				if ( (LA21_1==DOWN) ) {
					alt21=1;
				}
				else if ( (LA21_1==UP||LA21_1==ID||LA21_1==OP_INTERSECTION||LA21_1==OP_MINUS||LA21_1==OP_PATH||(LA21_1 >= OP_UNION && LA21_1 <= OP_UPDATE)||LA21_1==ACCESS||LA21_1==PAIR||LA21_1==SET||LA21_1==TRIPLE) ) {
					alt21=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OP_PATH:
			case OP_UPDATE:
			case ACCESS:
				{
				alt21=3;
				}
				break;
			case PAIR:
			case SET:
			case TRIPLE:
				{
				alt21=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:789:4: ^( ID ID )
					{
					match(input,ID,FOLLOW_ID_in_factor1173); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_factor1175); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:790:4: ID
					{
					ID43=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1181); 

							/*
							if (reconfiguration_def_stack.peek().args.contains((ID43!=null?ID43.getText():null))){
								retval.value = "this." + "_" + (ID43!=null?ID43.getText():null);
							}
							else{
								retval.value = "_" + (ID43!=null?ID43.getText():null);
							}
							*/
							retval.value = "_" + (ID43!=null?ID43.getText():null);
							Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();	
							TinySymbol ts = content_stack.peek().current_scope.containsSymbol((ID43!=null?ID43.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((ID43!=null?ID43.getText():null)) : content_stack.peek().ts.hasValue((ID43!=null?ID43.getText():null), s_id);	
							
							dt = this.convertRecooplaDatatype( ts.getDataType() );
							retval.dt = this.datatypeToString(dt);
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:807:4: operation
					{
					pushFollow(FOLLOW_operation_in_factor1190);
					operation44=operation();
					state._fsp--;

					 retval.value = (operation44!=null?((RecTranslator.operation_return)operation44).value:null); 	retval.dt = (operation44!=null?((RecTranslator.operation_return)operation44).dt:null); 
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:808:4: constructor
					{
					pushFollow(FOLLOW_constructor_in_factor1198);
					constructor45=constructor();
					state._fsp--;

					 retval.value = (constructor45!=null?((RecTranslator.constructor_return)constructor45).value:null); 	retval.dt = (constructor45!=null?((RecTranslator.constructor_return)constructor45).dt:null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class operation_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operation"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:811:1: operation returns [String value, String dt] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call );
	public final RecTranslator.operation_return operation() throws RecognitionException {
		RecTranslator.operation_return retval = new RecTranslator.operation_return();
		retval.start = input.LT(1);

		CommonTree id1=null;
		CommonTree id2=null;
		TreeRuleReturnScope attribute_call46 =null;


			String op = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:815:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==ACCESS) ) {
				alt23=1;
			}
			else if ( (LA23_0==OP_PATH||LA23_0==OP_UPDATE) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:815:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] )
					{
					match(input,ACCESS,FOLLOW_ACCESS_in_operation1220); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1224); 

							op += "_" + (id1!=null?id1.getText():null);
							
							Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();	
							TinySymbol ts = content_stack.peek().current_scope.containsSymbol((id1!=null?id1.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((id1!=null?id1.getText():null)) : content_stack.peek().ts.hasValue((id1!=null?id1.getText():null), s_id);	
						
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:822:2: ( ^( STRUCTURE id2= ID ) )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==STRUCTURE) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:822:3: ^( STRUCTURE id2= ID )
							{
							match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1233); 
							match(input, Token.DOWN, null); 
							id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1237); 
							match(input, Token.UP, null); 


									op += ".getChannel(\"" + (id2!=null?id2.getText():null) + "\")"; //"_" + id
								
							}
							break;

					}

					pushFollow(FOLLOW_attribute_call_in_operation1251);
					attribute_call46=attribute_call(ts);
					state._fsp--;


							op += "." + (attribute_call46!=null?((RecTranslator.attribute_call_return)attribute_call46).value:null);
							
							retval.value = op;
							retval.dt = (attribute_call46!=null?((RecTranslator.attribute_call_return)attribute_call46).dt:null);
						
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:837:4: structure_operation_call
					{
					pushFollow(FOLLOW_structure_operation_call_in_operation1264);
					structure_operation_call();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operation"


	public static class constructor_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constructor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:840:1: constructor returns [String value, String dt] : ( triple_cons | pair_cons | set_cons );
	public final RecTranslator.constructor_return constructor() throws RecognitionException {
		RecTranslator.constructor_return retval = new RecTranslator.constructor_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope triple_cons47 =null;
		TreeRuleReturnScope pair_cons48 =null;
		TreeRuleReturnScope set_cons49 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:841:2: ( triple_cons | pair_cons | set_cons )
			int alt24=3;
			switch ( input.LA(1) ) {
			case TRIPLE:
				{
				alt24=1;
				}
				break;
			case PAIR:
				{
				alt24=2;
				}
				break;
			case SET:
				{
				alt24=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:841:4: triple_cons
					{
					pushFollow(FOLLOW_triple_cons_in_constructor1279);
					triple_cons47=triple_cons();
					state._fsp--;

					 retval.value = (triple_cons47!=null?((RecTranslator.triple_cons_return)triple_cons47).value:null); 	retval.dt = (triple_cons47!=null?((RecTranslator.triple_cons_return)triple_cons47).dt:null); 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:842:4: pair_cons
					{
					pushFollow(FOLLOW_pair_cons_in_constructor1286);
					pair_cons48=pair_cons();
					state._fsp--;

					 retval.value = (pair_cons48!=null?((RecTranslator.pair_cons_return)pair_cons48).value:null); 	retval.dt = (pair_cons48!=null?((RecTranslator.pair_cons_return)pair_cons48).dt:null); 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:843:4: set_cons
					{
					pushFollow(FOLLOW_set_cons_in_constructor1293);
					set_cons49=set_cons();
					state._fsp--;

					 retval.value = (set_cons49!=null?((RecTranslator.set_cons_return)set_cons49).value:null); 	retval.dt = (set_cons49!=null?((RecTranslator.set_cons_return)set_cons49).dt:null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor"


	public static class attribute_call_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "attribute_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:854:1: attribute_call[TinySymbol ts] returns [String value, String dt] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
	public final RecTranslator.attribute_call_return attribute_call(TinySymbol ts) throws RecognitionException {
		RecTranslator.attribute_call_return retval = new RecTranslator.attribute_call_return();
		retval.start = input.LT(1);

		CommonTree INT50=null;
		CommonTree INT51=null;


			String value = "";
			String dt = "";
			
			List<String> datatype = new ArrayList<String>( this.convertRecooplaDatatype(ts.getDataType()) );
			datatype.remove(0); //remove Pair or Triple type -> eg: Pair<Node> ([PAIR,NODE]) => [Node]

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:862:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
			int alt27=9;
			switch ( input.LA(1) ) {
			case OP_IN:
				{
				alt27=1;
				}
				break;
			case OP_OUT:
				{
				alt27=2;
				}
				break;
			case OP_NAME:
				{
				alt27=3;
				}
				break;
			case OP_NODES:
				{
				alt27=4;
				}
				break;
			case OP_NAMES:
				{
				alt27=5;
				}
				break;
			case OP_FST:
				{
				alt27=6;
				}
				break;
			case OP_SND:
				{
				alt27=7;
				}
				break;
			case OP_TRD:
				{
				alt27=8;
				}
				break;
			case ID:
				{
				alt27=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:862:4: ^( OP_IN ( INT )? )
					{
					match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1326); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:862:12: ( INT )?
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==INT) ) {
							alt25=1;
						}
						switch (alt25) {
							case 1 :
								// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:862:12: INT
								{
								INT50=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1328); 
								}
								break;

						}

						match(input, Token.UP, null); 
					}


							if ((INT50!=null?INT50.getText():null) != null){
								value = "getIn(" + (INT50!=null?INT50.getText():null) + ")";
								dt = "Node";
							}
							else{
								value = "getIn()";
								dt = "LinkedHashSet<Node>";
							}
							
							retval.value = value;
							retval.dt = dt;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:877:4: ^( OP_OUT ( INT )? )
					{
					match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1341); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:877:13: ( INT )?
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==INT) ) {
							alt26=1;
						}
						switch (alt26) {
							case 1 :
								// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:877:13: INT
								{
								INT51=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1343); 
								}
								break;

						}

						match(input, Token.UP, null); 
					}


							if ((INT51!=null?INT51.getText():null) != null){
								value = "getOut(" + (INT51!=null?INT51.getText():null) + ")";
								dt = "Node";
							}
							else{
								value = "getOut()";
								dt = "LinkedHashSet<Node>";
							}
							
							retval.value = value;
							retval.dt = dt;
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:892:4: OP_NAME
					{
					match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1355); 
					 
							retval.value = "getId()"; 
							retval.dt = "String";
						
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:898:4: OP_NODES
					{
					match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1367); 
					 
							retval.value = "getNodes()"; 
							retval.dt = "LinkedHashSet<Node>";
						
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:904:4: OP_NAMES
					{
					match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1378); 
					 
							retval.value = "getNames()"; 
							retval.dt = "LinkedHashSet<String>";
						
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:917:4: OP_FST
					{
					match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1392); 
					 
							retval.value = "fst()";
							retval.dt = this.datatypeToString(datatype);
						
					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:923:4: OP_SND
					{
					match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1403); 
					 
							retval.value = "snd()"; 
							retval.dt = this.datatypeToString(datatype);
						
					}
					break;
				case 8 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:929:4: OP_TRD
					{
					match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1414); 
					 
							retval.value = "trd()"; 
							retval.dt = this.datatypeToString(datatype);
						
					}
					break;
				case 9 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:935:4: ID
					{
					match(input,ID,FOLLOW_ID_in_attribute_call1426); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attribute_call"


	public static class triple_cons_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "triple_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:939:1: triple_cons returns [String value, String dt] : ^( TRIPLE e1= expression e2= expression e3= expression ) ;
	public final RecTranslator.triple_cons_return triple_cons() throws RecognitionException {
		RecTranslator.triple_cons_return retval = new RecTranslator.triple_cons_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope e3 =null;


			String dt = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:943:2: ( ^( TRIPLE e1= expression e2= expression e3= expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:943:4: ^( TRIPLE e1= expression e2= expression e3= expression )
			{
			match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1449); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_triple_cons1453);
			e1=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_triple_cons1457);
			e2=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_triple_cons1461);
			e3=expression();
			state._fsp--;

			match(input, Token.UP, null); 


					dt = (e1!=null?((RecTranslator.expression_return)e1).dt:null);
					retval.dt = "Triple<" + dt + ", " + dt + ", " + dt + ">";
					retval.value = "new " + retval.dt + "(" + (e1!=null?((RecTranslator.expression_return)e1).value:null) + ", " + (e2!=null?((RecTranslator.expression_return)e2).value:null) + ", " + (e3!=null?((RecTranslator.expression_return)e3).value:null) + ")"; //add template		
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triple_cons"


	public static class pair_cons_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "pair_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:952:1: pair_cons returns [String value, String dt] : ^( PAIR e1= expression e2= expression ) ;
	public final RecTranslator.pair_cons_return pair_cons() throws RecognitionException {
		RecTranslator.pair_cons_return retval = new RecTranslator.pair_cons_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;


			String dt = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:956:2: ( ^( PAIR e1= expression e2= expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:956:4: ^( PAIR e1= expression e2= expression )
			{
			match(input,PAIR,FOLLOW_PAIR_in_pair_cons1487); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_pair_cons1491);
			e1=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_pair_cons1495);
			e2=expression();
			state._fsp--;

			match(input, Token.UP, null); 


					dt = (e1!=null?((RecTranslator.expression_return)e1).dt:null);
					retval.dt = "Pair<" + dt + ", " + dt + ">";		
					retval.value = "new " + retval.dt + "(" + (e1!=null?((RecTranslator.expression_return)e1).value:null) + ", " + (e2!=null?((RecTranslator.expression_return)e2).value:null) + ")"; //add template
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pair_cons"


	public static class set_cons_return extends TreeRuleReturnScope {
		public String value;
		public String dt;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "set_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:966:1: set_cons returns [String value, String dt] : ^( SET ( expression )* ) ;
	public final RecTranslator.set_cons_return set_cons() throws RecognitionException {
		RecTranslator.set_cons_return retval = new RecTranslator.set_cons_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression52 =null;


			//List<String> exps = new ArrayList<String>();
			String exps = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:971:2: ( ^( SET ( expression )* ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:971:4: ^( SET ( expression )* )
			{
			match(input,SET,FOLLOW_SET_in_set_cons1523); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:971:10: ( expression )*
				loop28:
				while (true) {
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ID||LA28_0==OP_INTERSECTION||LA28_0==OP_MINUS||LA28_0==OP_PATH||(LA28_0 >= OP_UNION && LA28_0 <= OP_UPDATE)||LA28_0==ACCESS||LA28_0==PAIR||LA28_0==SET||LA28_0==TRIPLE) ) {
						alt28=1;
					}

					switch (alt28) {
					case 1 :
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:971:11: expression
						{
						pushFollow(FOLLOW_expression_in_set_cons1526);
						expression52=expression();
						state._fsp--;


								exps += "\tadd(" + (expression52!=null?((RecTranslator.expression_return)expression52).value:null) + "); \n";
							
						}
						break;

					default :
						break loop28;
					}
				}


						retval.dt = "LinkedHashSet<" + (expression52!=null?((RecTranslator.expression_return)expression52).dt:null) + ">";
						retval.value = "new " + retval.dt + "() {{ \n" + exps + "}}";  //add template
						//Arrays.asList(" + listToString(exps) + "))"; //add template
					
				match(input, Token.UP, null); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_cons"


	public static class applicaiton_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "applicaiton_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1013:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
	public final RecTranslator.applicaiton_def_return applicaiton_def() throws RecognitionException {
		RecTranslator.applicaiton_def_return retval = new RecTranslator.applicaiton_def_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1014:2: ( ID list_reconfigurations ( trigger_def )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1014:4: ID list_reconfigurations ( trigger_def )?
			{
			match(input,ID,FOLLOW_ID_in_applicaiton_def1559); 
			pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1561);
			list_reconfigurations();
			state._fsp--;

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1014:29: ( trigger_def )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==SEP_BLOCK_START) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1014:29: trigger_def
					{
					pushFollow(FOLLOW_trigger_def_in_applicaiton_def1563);
					trigger_def();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "applicaiton_def"


	public static class list_reconfigurations_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "list_reconfigurations"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1017:1: list_reconfigurations : ( reconfiguration_call )+ ;
	public final RecTranslator.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
		RecTranslator.list_reconfigurations_return retval = new RecTranslator.list_reconfigurations_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1018:2: ( ( reconfiguration_call )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1018:4: ( reconfiguration_call )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1018:4: ( reconfiguration_call )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==ID||LA30_0==OP_CONST||LA30_0==OP_ID||LA30_0==OP_JOIN||LA30_0==OP_PAR||LA30_0==OP_REMOVE||LA30_0==OP_SPLIT) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1018:4: reconfiguration_call
					{
					pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1576);
					reconfiguration_call();
					state._fsp--;

					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_reconfigurations"


	public static class trigger_def_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "trigger_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1021:1: trigger_def : trigger_block ;
	public final RecTranslator.trigger_def_return trigger_def() throws RecognitionException {
		RecTranslator.trigger_def_return retval = new RecTranslator.trigger_def_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1022:2: ( trigger_block )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1022:4: trigger_block
			{
			pushFollow(FOLLOW_trigger_block_in_trigger_def1590);
			trigger_block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_def"


	public static class trigger_block_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "trigger_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1025:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
	public final RecTranslator.trigger_block_return trigger_block() throws RecognitionException {
		RecTranslator.trigger_block_return retval = new RecTranslator.trigger_block_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1026:2: ( SEP_BLOCK_START SEP_BLOCK_END )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1026:4: SEP_BLOCK_START SEP_BLOCK_END
			{
			match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1602); 
			match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1604); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_block"


	protected static class main_def_scope {
		List<String> imported_cps;
		List<String> arg_instances;
		HashMap<String,String> declared_cps;
	}
	protected Stack<main_def_scope> main_def_stack = new Stack<main_def_scope>();

	public static class main_def_return extends TreeRuleReturnScope {
		public String id;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1033:1: main_def returns [String id] : ( main_args )? main_block -> mkmain(files=$reclang::imported_coopla_filesargs=valuesinsts=$main_block.values);
	public final RecTranslator.main_def_return main_def() throws RecognitionException {
		main_def_stack.push(new main_def_scope());
		RecTranslator.main_def_return retval = new RecTranslator.main_def_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope main_args53 =null;
		TreeRuleReturnScope main_block54 =null;


			content_stack.peek().ts = reclang_stack.peek().ids_table.getSymbols().get("$main");
			content_stack.peek().current_scope = content_stack.peek().ts.getScopes().get(0); //main has only one scope
				
			main_def_stack.peek().imported_cps = new ArrayList<String>();
			main_def_stack.peek().arg_instances = new ArrayList<String>();
			main_def_stack.peek().declared_cps = new HashMap<String,String>();
			retval.id = "Run";
			
			HashMap<String, Symbol> coopla_symbols = reclang_stack.peek().coopla_table.getSymbols();
			for (String key : coopla_symbols.keySet()){
				Symbol s = coopla_symbols.get(key);
				if (s.getType().equals("PATTERN")){
					main_def_stack.peek().imported_cps.add(s.getId());
				}
			}

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1056:2: ( ( main_args )? main_block -> mkmain(files=$reclang::imported_coopla_filesargs=valuesinsts=$main_block.values))
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1056:4: ( main_args )? main_block
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1056:4: ( main_args )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ARGUMENTS) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1056:4: main_args
					{
					pushFollow(FOLLOW_main_args_in_main_def1629);
					main_args53=main_args();
					state._fsp--;

					}
					break;

			}


					String value = "";
					for (String key : reclang_stack.peek().patterns.keySet()){
						//CPModelInternal -> Set<stoch_instances (String, CP2)> -> Set<String>
						Set<String> instances = reclang_stack.peek().patterns.get(key).getStochInstances().keySet();
						
						for(String instance : instances){
							value += "CoordinationPattern2 _" + instance + " = new CoordinationPattern2(" +
								"imported_patterns.get(\"" + key + "\").getStochInstances().get(\"" + instance + "\"));\n";
						}
					}	
					List<String> values = new ArrayList<String>();
					values.add(value);
					if ((main_args53!=null?((RecTranslator.main_args_return)main_args53).values:null) != null){
						values.addAll((main_args53!=null?((RecTranslator.main_args_return)main_args53).values:null));
					}
				
			pushFollow(FOLLOW_main_block_in_main_def1639);
			main_block54=main_block();
			state._fsp--;

			// TEMPLATE REWRITE
			// 1077:2: -> mkmain(files=$reclang::imported_coopla_filesargs=valuesinsts=$main_block.values)
			{
				retval.st = templateLib.getInstanceOf("mkmain",new STAttrMap().put("files", reclang_stack.peek().imported_coopla_files).put("args", values).put("insts", (main_block54!=null?((RecTranslator.main_block_return)main_block54).values:null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			main_def_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "main_def"


	public static class main_args_return extends TreeRuleReturnScope {
		public List<String> values;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1080:1: main_args returns [List<String> values] : ^( ARGUMENTS ( main_arg )+ ) ;
	public final RecTranslator.main_args_return main_args() throws RecognitionException {
		RecTranslator.main_args_return retval = new RecTranslator.main_args_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope main_arg55 =null;


			List<String> args = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1084:2: ( ^( ARGUMENTS ( main_arg )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1084:4: ^( ARGUMENTS ( main_arg )+ )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1681); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1084:16: ( main_arg )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==ARGUMENT) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1084:17: main_arg
					{
					pushFollow(FOLLOW_main_arg_in_main_args1684);
					main_arg55=main_arg();
					state._fsp--;


							args.add((main_arg55!=null?((StringTemplate)main_arg55.getTemplate()):null).toString());
						
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}

			match(input, Token.UP, null); 


					retval.values = args;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_args"


	public static class main_arg_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main_arg"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1097:1: main_arg : ^( ARGUMENT ID ids ) -> list_args(empty=isEmptycp=$ID.textids=$ids.values);
	public final RecTranslator.main_arg_return main_arg() throws RecognitionException {
		RecTranslator.main_arg_return retval = new RecTranslator.main_arg_return();
		retval.start = input.LT(1);

		CommonTree ID57=null;
		TreeRuleReturnScope ids56 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1098:2: ( ^( ARGUMENT ID ids ) -> list_args(empty=isEmptycp=$ID.textids=$ids.values))
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1098:4: ^( ARGUMENT ID ids )
			{
			match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1713); 
			match(input, Token.DOWN, null); 
			ID57=(CommonTree)match(input,ID,FOLLOW_ID_in_main_arg1715); 
			pushFollow(FOLLOW_ids_in_main_arg1717);
			ids56=ids();
			state._fsp--;


					for (String var : (ids56!=null?((RecTranslator.ids_return)ids56).values:null)){
						main_def_stack.peek().declared_cps.put(var,(ID57!=null?ID57.getText():null));
						main_def_stack.peek().arg_instances.add(var);
					}
					String first_id = (ids56!=null?((RecTranslator.ids_return)ids56).values:null).get(0);
					String cp_delays = "delays = new HashMap<Node, Pair<Double, Double>>();\n" +
						"for (Node n : _" + first_id + ".getPorts()){\n" +
						"\tdelays.put(n, new Pair<Double, Double>(1.0,0.0));\n}" +
						"for (Node n : _" + first_id + ".getMixed()){\n" +
						"\tdelays.put(n, new Pair<Double, Double>(10000.0,10000.0));\n}";	
					boolean isEmpty = false;
					if ((ID57!=null?ID57.getText():null).equals("Empty")){
						isEmpty = true;
					}
				
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1116:2: -> list_args(empty=isEmptycp=$ID.textids=$ids.values)
			{
				retval.st = templateLib.getInstanceOf("list_args",new STAttrMap().put("empty", isEmpty).put("cp", (ID57!=null?ID57.getText():null)).put("ids", (ids56!=null?((RecTranslator.ids_return)ids56).values:null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_arg"


	public static class ids_return extends TreeRuleReturnScope {
		public List<String> values;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ids"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1119:1: ids returns [List<String> values] : ^( IDS ( ID )+ ) ;
	public final RecTranslator.ids_return ids() throws RecognitionException {
		RecTranslator.ids_return retval = new RecTranslator.ids_return();
		retval.start = input.LT(1);

		CommonTree ID58=null;


			List<String> ids = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1123:2: ( ^( IDS ( ID )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1123:4: ^( IDS ( ID )+ )
			{
			match(input,IDS,FOLLOW_IDS_in_ids1765); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1123:10: ( ID )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==ID) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1123:11: ID
					{
					ID58=(CommonTree)match(input,ID,FOLLOW_ID_in_ids1768); 

							ids.add((ID58!=null?ID58.getText():null)); //"_" + (ID58!=null?ID58.getText():null)
						
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			match(input, Token.UP, null); 


					retval.values = ids;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ids"


	protected static class main_block_scope {
		Set<String> reconfs;
		Integer i;
	}
	protected Stack<main_block_scope> main_block_stack = new Stack<main_block_scope>();

	public static class main_block_return extends TreeRuleReturnScope {
		public List<String> values;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1135:1: main_block returns [List<String> values] : ^( INSTRUCTIONS ( main_instruction )+ ) ;
	public final RecTranslator.main_block_return main_block() throws RecognitionException {
		main_block_stack.push(new main_block_scope());
		RecTranslator.main_block_return retval = new RecTranslator.main_block_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope main_instruction59 =null;


			main_block_stack.peek().reconfs = new HashSet<String>();
			main_block_stack.peek().i = 0;
			List<String> insts = new ArrayList<String>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1145:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1145:4: ^( INSTRUCTIONS ( main_instruction )+ )
			{
			match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1807); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1145:19: ( main_instruction )+
			int cnt34=0;
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==OP_APPLY||LA34_0==APPLICATION) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1145:20: main_instruction
					{
					pushFollow(FOLLOW_main_instruction_in_main_block1810);
					main_instruction59=main_instruction();
					state._fsp--;


							insts.add((main_instruction59!=null?((RecTranslator.main_instruction_return)main_instruction59).value:null));
						
					}
					break;

				default :
					if ( cnt34 >= 1 ) break loop34;
					EarlyExitException eee = new EarlyExitException(34, input);
					throw eee;
				}
				cnt34++;
			}

			match(input, Token.UP, null); 


					List<String> all_instructions = new ArrayList<String>(main_block_stack.peek().reconfs);
					all_instructions.addAll(insts);
					
					retval.values = all_instructions;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			main_block_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "main_block"


	public static class main_instruction_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main_instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1160:1: main_instruction returns [String value] : ( main_assignment | reconf_apply );
	public final RecTranslator.main_instruction_return main_instruction() throws RecognitionException {
		RecTranslator.main_instruction_return retval = new RecTranslator.main_instruction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope main_assignment60 =null;
		TreeRuleReturnScope reconf_apply61 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1164:2: ( main_assignment | reconf_apply )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==APPLICATION) ) {
				alt35=1;
			}
			else if ( (LA35_0==OP_APPLY) ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1164:4: main_assignment
					{
					pushFollow(FOLLOW_main_assignment_in_main_instruction1844);
					main_assignment60=main_assignment();
					state._fsp--;

					 retval.value = (main_assignment60!=null?((RecTranslator.main_assignment_return)main_assignment60).value:null); 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1166:4: reconf_apply
					{
					pushFollow(FOLLOW_reconf_apply_in_main_instruction1853);
					reconf_apply61=reconf_apply();
					state._fsp--;

					 retval.value = (reconf_apply61!=null?((RecTranslator.reconf_apply_return)reconf_apply61).value:null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_instruction"


	public static class main_assignment_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "main_assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1169:1: main_assignment returns [String value] : ^( APPLICATION ^( DECLARATION id1= ID ids ) ^( OP_APPLY id2= ID reconfiguration_call ) ) ;
	public final RecTranslator.main_assignment_return main_assignment() throws RecognitionException {
		RecTranslator.main_assignment_return retval = new RecTranslator.main_assignment_return();
		retval.start = input.LT(1);

		CommonTree id1=null;
		CommonTree id2=null;
		TreeRuleReturnScope ids62 =null;
		TreeRuleReturnScope reconfiguration_call63 =null;


			Integer i = main_block_stack.peek().i++;
			String value = "";
			String invoke = "";
			List<String> instances = new ArrayList<String>();
			String cp_type = "";
			
			String first_id = "";
			
			String add_pattern = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1181:2: ( ^( APPLICATION ^( DECLARATION id1= ID ids ) ^( OP_APPLY id2= ID reconfiguration_call ) ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1181:4: ^( APPLICATION ^( DECLARATION id1= ID ids ) ^( OP_APPLY id2= ID reconfiguration_call ) )
			{
			match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1876); 
			match(input, Token.DOWN, null); 
			match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1879); 
			match(input, Token.DOWN, null); 
			id1=(CommonTree)match(input,ID,FOLLOW_ID_in_main_assignment1883); 
			pushFollow(FOLLOW_ids_in_main_assignment1885);
			ids62=ids();
			state._fsp--;

			match(input, Token.UP, null); 


					List<String> ids = new ArrayList<String>();
					for (String id : (ids62!=null?((RecTranslator.ids_return)ids62).values:null)){
						ids.add("_" + id);
					}
					instances = new ArrayList<String>(ids); //n�o cria apontador para values -> cria copia das instancias
					
					first_id = ids.get(0);
					//first_decl = first_id + " = "; //(CoordinationPattern2) 
				
					value += "\nCoordinationPattern2 " + first_id + " = new CoordinationPattern2();\n"; 
					main_def_stack.peek().declared_cps.put(first_id.substring(1), (id1!=null?id1.getText():null));
									
					ids.remove(0);
					for (String id : ids){
						//remaining += ...
						value += "CoordinationPattern2 " + id + " = new CoordinationPattern2(" + first_id + ");\n";
						//id = _so; id.substring(1) = so
						main_def_stack.peek().declared_cps.put(id.substring(1), (id1!=null?id1.getText():null));
					}
					
					//adiciona novo tipo de padrao a um map de padroes (eg: Replicator x = ... -> add "Replicator")
					add_pattern += "\n\t$new_cp = new CoordinationPattern2(" + first_id + ");\n";
					add_pattern += "\t$new_cp.setId(\"" + (id1!=null?id1.getText():null) + "\");\n";
				
			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1896); 
			match(input, Token.DOWN, null); 
			id2=(CommonTree)match(input,ID,FOLLOW_ID_in_main_assignment1900); 
			pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1902);
			reconfiguration_call63=reconfiguration_call();
			state._fsp--;


					String op = (reconfiguration_call63!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call63).name:null); //.toLowerCase();
					//String var_name = op.toLowerCase();
					
					//eg: par -> P + ar = Par
					String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
					
					String args = (reconfiguration_call63!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call63).args:null);
					
					boolean isPrimitive = false;
					if (class_name.equals("Id") || class_name.equals("Const") || class_name.equals("Par") 
						|| class_name.equals("Join") || class_name.equals("Split") || class_name.equals("Remove")){
						isPrimitive = true;	
					}
					
					
					//rever try - catch
					value += "\ntry{\n";
					String aux = "_" + (id2!=null?id2.getText():null);
			//		if (main_def_stack.peek().declared_cps.containsKey(aux)){
					//if (!main_def_stack.peek().arg_instances.contains(aux)){
			//			value += "\tfinal CoordinationPattern2 aux_cp" + i + " = new CoordinationPattern2(" + aux + ");\n"; //variavel auxiliar para evitar problemas com sets
			//			args = args.replace(aux, "aux_cp" + i);
			//			aux = "aux_cp" + i;
			//		}

					for (String var : main_def_stack.peek().declared_cps.keySet()){
						//if (args.contains(var)){
						if (args.matches("(.*)\\b_" + var + "\\b(.*)")){
							value += "\tfinal CoordinationPattern2 _aux_cp" + i + " = new CoordinationPattern2(_" + var + ");\n"; //variavel auxiliar para evitar problemas com sets
							args = args.replace("_" + var, "_aux_cp" + i);
							i++;
						}
					}
					
								
					if (isPrimitive){
						//String rec = class_name + " _" + op + " = new " + class_name + "(" + args + ");\n"; //const RW -> _const
						String rec = class_name + " " + op + "_primitive;\n"; //const RW -> _const
						main_block_stack.peek().reconfs.add(rec);
						
						value += "\t" + op + "_primitive = new " + class_name + "(" + args + ");\n";
						invoke = "(CoordinationPattern2) " + op + "_primitive.apply( " + aux + " )";
						//value += first_decl + "_" op + ".apply(_" + id2 + ");\n";
						//value += remaining;
						//value += add_pattern;
					}
					else{
						List<String> dts = new ArrayList<String>();
						
						for (String dt : (reconfiguration_call63!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call63).dts:null)){
							int j = dt.indexOf('<');
							if (j > 0){
								dts.add(dt.substring(0, j) + ".class"); //eg: Pair<Node,Node> -> Pair
							} else {
								dts.add(dt + ".class");
							}
						}
						String datatypes = listToString(dts);
						
						String rec = "\nClass " + op + " = Class.forName( \"" + class_name + "\" );\n";
						rec += "Constructor " + op + "_constructor = " + op + ".getConstructor(" + datatypes + ");\n";	
						main_block_stack.peek().reconfs.add(rec);
						
						value += "\tObject " + op + i + "_obj = " + op + "_constructor.newInstance(" + args + ");\n";
						value += "\tMethod " + op + i + "_apply = " + op + ".getMethod(\"apply\", CoordinationPattern2.class);\n";
						
						invoke = "(CoordinationPattern2) " + op + i + "_apply.invoke(" + op + i + "_obj, " + aux + " )"; //_" + id2 + "
					}
					
					instances.add("_" + (id2!=null?id2.getText():null));
					//------------check if new instance has the same structure
					add_pattern += "\n\t//se o pattern já existir...\n";
					add_pattern += "\tif(this.getPattern(" + aux + ".getId()) != null){\n";
					add_pattern += "\t\tif(this.comparePatterns(this.getPattern(" + aux + ".getId()), $new_cp)){\n";
					add_pattern += "\t\t\tif(imported_patterns.keySet().contains(" + aux + ".getId()) ){\n";
					add_pattern += "\t\t\t\tthis.removeInstance(\"" + (id2!=null?id2.getText():null) +"\");\n";
					for (String id : instances){
						add_pattern += "\t\t\t\timported_patterns.get(" + aux + ".getId()).getStochInstances().put(\"" + id.substring(1) + "\", " + id +");\n";
					}
					add_pattern += "\t\t\t\tcreated_patterns.put( " + aux + ".getId(), imported_patterns.get(" + aux + ".getId()) );\n";
					add_pattern += "\t\t\t\timported_patterns.remove(" + aux + ".getId());\n\t\t\t}\n";
					
					add_pattern += "\t\t\telse{\n";
					add_pattern += "\t\t\t\tthis.removeInstance(\"" + (id2!=null?id2.getText():null) +"\");\n";
					for (String id : instances){
						add_pattern += "\t\t\t\tcreated_patterns.get(" + aux + ".getId()).getStochInstances().put(\"" + id.substring(1) + "\", " + id +");\n";
					}
					add_pattern += "\t\t\t}\n";
					add_pattern += "\t\t}\n";
					
					add_pattern += "\t\telse{\n";
					add_pattern += "\t\t\tthrow new Exception(\"Instance " + instances.get(0).substring(1)
								+ " (" + (ids62!=null?((CommonTree)ids62.start):null).getLine() + ":" + (ids62!=null?((CommonTree)ids62.start):null).getCharPositionInLine() + ") " 
								+ "can not be declared with type " + (id1!=null?id1.getText():null) + "! \"\n";
					add_pattern += "\t\t\t\t+ \"\\nIts internal structure does not match with pattern " + (id1!=null?id1.getText():null) + ".\");\n";
					add_pattern += "\t\t}\n";
					add_pattern += "\t}\n";
					//-------------------------
					//instances.remove("_" + (id2!=null?id2.getText():null));
					
					add_pattern += "\telse{\n";
					
					add_pattern += "\t\t$cpmi = new CPModelInternal();\n";
					add_pattern += "\t\t$cpmi.setSimplePattern($new_cp);\n";
					//remove padrão do tipo anterior -> foi reconfigurado logo já a sua estrutura já não corresponde ao tipo anterior
					add_pattern += "\t\tthis.removeInstance(\"" + (id2!=null?id2.getText():null) +"\");\n";
					for (String id : instances){
						value += "\t" + id + " = " + invoke + ";\n";
						//rever -> será necessário mudar nome das instancias para o novo tipo?
						value += "\t" + id + ".setId(\"" + (id1!=null?id1.getText():null) + "\");\n";
						//value += "t" + aux + ".setId(\"Reconfigured_\" + " + aux + ".getId() );\n"; //eg.: Reconfigured_Original
						
						//id.substring(1) -> remove "_"
						add_pattern += "\t\t$cpmi.getStochInstances().put(\"" + id.substring(1) + "\", " + id +");\n";
			//				if (id.equals(first_id)){
			//					value += "\t" + id + " = " + invoke + ";\n";
			//				} else{
			//					value += "\t" + id + " = " + first_id + ";\n";
			//				}
						
						//eg, rec = x.invoke(); rec2 = rec;
			//				value += "\t" + id + " = ";
			//				value += id.equals(first_id) ? invoke + ";\n" : first_id + ";\n"; 
					}
					//add_pattern += "\t\t$cpmi.getStochInstances().put(\"" + (id2!=null?id2.getText():null) + "\", _" + (id2!=null?id2.getText():null) +");\n";
					add_pattern += "\t\tcreated_patterns.put( \"" + (id1!=null?id1.getText():null) + "\", $cpmi );\n";
					
					//final else
					add_pattern += "\t}\n";
					
					//value += remaining;
					value += add_pattern;
					
					value += "} catch(Exception e) {\n";
					value += "\terrors.add(e); \n"; //}\n";
					value += "\tthrow e; \n}\n";
				
			match(input, Token.UP, null); 


					retval.value = value;
					main_block_stack.peek().i = i;
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_assignment"


	public static class reconf_apply_return extends TreeRuleReturnScope {
		public String value;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "reconf_apply"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1358:1: reconf_apply returns [String value] : ^( OP_APPLY ID reconfiguration_call ) ;
	public final RecTranslator.reconf_apply_return reconf_apply() throws RecognitionException {
		RecTranslator.reconf_apply_return retval = new RecTranslator.reconf_apply_return();
		retval.start = input.LT(1);

		CommonTree ID65=null;
		TreeRuleReturnScope reconfiguration_call64 =null;


			Integer i = main_block_stack.peek().i++;
			String value = "";
			String invoke = "";
			String cp_type = "";
			
			//String add_pattern = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1367:2: ( ^( OP_APPLY ID reconfiguration_call ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTranslator.g:1367:4: ^( OP_APPLY ID reconfiguration_call )
			{
			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconf_apply1942); 
			match(input, Token.DOWN, null); 
			ID65=(CommonTree)match(input,ID,FOLLOW_ID_in_reconf_apply1944); 
			pushFollow(FOLLOW_reconfiguration_call_in_reconf_apply1946);
			reconfiguration_call64=reconfiguration_call();
			state._fsp--;


				
					String op = (reconfiguration_call64!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call64).name:null); //.toLowerCase();
					//String var_name = op.toLowerCase();
					
					//eg: par -> P + ar = Par
					String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
					
					String args = (reconfiguration_call64!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call64).args:null);
					
					boolean isPrimitive = false;
					if (class_name.equals("Id") || class_name.equals("Const") || class_name.equals("Par") 
						|| class_name.equals("Join") || class_name.equals("Split") || class_name.equals("Remove")){
						isPrimitive = true;	
					}
					
					
					//rever try - catch
					value += "\ntry{\n";
					String aux = "_" + (ID65!=null?ID65.getText():null);
					for (String var : main_def_stack.peek().declared_cps.keySet()){
						//if (args.contains(var)){
						if (args.matches("(.*)\\b_" + var + "\\b(.*)")){
							value += "\tfinal CoordinationPattern2 _aux_cp" + i + " = new CoordinationPattern2(_" + var + ");\n"; //variavel auxiliar para evitar problemas com sets
							args = args.replace("_" + var, "_aux_cp" + i);
							i++;
						}
					}
					
								
					if (isPrimitive){
						//String rec = class_name + " _" + op + " = new " + class_name + "(" + args + ");\n"; //const RW -> _const
						String rec = class_name + " " + op + "_primitive;\n"; //const RW -> _const
						main_block_stack.peek().reconfs.add(rec);
						
						value += "\t" + op + "_primitive = new " + class_name + "(" + args + ");\n";
						invoke = "(CoordinationPattern2) " + op + "_primitive.apply( " + aux + " )";
						//value += first_decl + "_" op + ".apply(_" + ID65 + ");\n";
						//value += remaining;
						//value += add_pattern;
					}
					else{
						List<String> dts = new ArrayList<String>();
						
						for (String dt : (reconfiguration_call64!=null?((RecTranslator.reconfiguration_call_return)reconfiguration_call64).dts:null)){
							int j = dt.indexOf('<');
							if (j > 0){
								dts.add(dt.substring(0, j) + ".class"); //eg: Pair<Node,Node> -> Pair
							} else {
								dts.add(dt + ".class");
							}
						}
						String datatypes = listToString(dts);
						
						String rec = "\nClass " + op + " = Class.forName( \"" + class_name + "\" );\n";
						rec += "Constructor " + op + "_constructor = " + op + ".getConstructor(" + datatypes + ");\n";	
						main_block_stack.peek().reconfs.add(rec);
						
						value += "\tObject " + op + i + "_obj = " + op + "_constructor.newInstance(" + args + ");\n";
						value += "\tMethod " + op + i + "_apply = " + op + ".getMethod(\"apply\", CoordinationPattern2.class);\n";
						
						invoke = "(CoordinationPattern2) " + op + i + "_apply.invoke(" + op + i + "_obj, " + aux + " )"; //_" + ID65 + "
					}
				
					Set<String> new_cps = new HashSet<String>();
					cp_type = main_def_stack.peek().declared_cps.get(aux);
					new_cps.add(cp_type);
					//remaining += "\tfinal CoordinationPattern2 " + (ID65!=null?ID65.getText():null) + " = new CoordinationPattern2( imported_patterns.get(\"" + main_def_stack.peek().declared_cps.get((ID65!=null?ID65.getText():null)) + "\").getSimplePattern() );\n";
					value += "\t" + aux + " = " + invoke + ";\n";
					
					if(op.equals("id")){
						value += "\tif( imported_patterns.keySet().contains(" + aux + ".getId()) ){\n";
						//value += "\t\timported_patterns.get(" + aux + ".getId()).getStochInstances().put(\"" + (ID65!=null?ID65.getText():null) + "\", " + aux +");\n";
						value += "\t\tcreated_patterns.put(" + aux + ".getId(), imported_patterns.get(" + aux + ".getId()) );\n\t}\n";
						
						//value += "\telse{\n";
						//value += "\t\tcreated_patterns.get(" + aux + ".getId()).getStochInstances().put(\"" + (ID65!=null?ID65.getText():null) + "\", " + aux +");\n\t}\n";
					}
					else{
						//value += "\t" + aux + ".setId(\"Reconfigured_" + (ID65!=null?ID65.getText():null) + "\");\n"; //eg.: Reconfigured_so
						value += "\t" + aux + ".setId(\"Reconfigured_\" + " + aux + ".getId() );\n"; //eg.: Reconfigured_Original
					
						//remove padrão do tipo anterior -> foi reconfigurado logo já a sua estrutura já não corresponde ao tipo anterior
						value += "\tthis.removeInstance(\"" + (ID65!=null?ID65.getText():null) +"\");\n";
						//System.out.println(main_def_stack.peek().declared_cps);
						for (String cp : new_cps){
							//adiciona novo tipo de padrao a um map de padroes (eg: main[Replicator x}{ x @ ... -> add "Replicator")
			//				add_pattern += "\n\t$new_cp = new CoordinationPattern2( " + aux + " );\n"; //invoke
			//				add_pattern += "\t$new_cp.setId(\"" + cp + "\");\n";
							//add_pattern += "\t$cpmi = new CPModelInternal();\n";
							value += "\t$cpmi = created_patterns.get(\"Reconfigured\");\n";
			//				add_pattern += "\t$cpmi.setSimplePattern($new_cp);\n";
							value += "\t$cpmi.getStochInstances().put(\"Reconfigured_" + (ID65!=null?ID65.getText():null) + "\", " + aux +");\n";
							value += "\tcreated_patterns.put( \"Reconfigured\", $cpmi );\n";
						}
						//value += remaining;
			//			value += add_pattern;
					}
					
					value += "} catch(Exception e) {\n";
					value += "\terrors.add(e); \n"; //}\n";
					value += "\tthrow e; \n}\n";
					
					
					retval.value = value;
					retval.value = value;
				
			match(input, Token.UP, null); 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconf_apply"

	// Delegated rules



	public static final BitSet FOLLOW_RECONFIGS_in_reclang67 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_directive_def_in_reclang69 = new BitSet(new long[]{0x0000000000000008L,0x0000000000424080L});
	public static final BitSet FOLLOW_content_in_reclang72 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_directive_import_in_directive_def89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_directive_import103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_directive_import105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_element_in_content129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000420080L});
	public static final BitSet FOLLOW_main_in_content142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECONFIGURATION_in_element166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_reconfiguration_def_in_element168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_APPLICATION_in_element187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_applicaiton_def_in_element189 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MAIN_in_main210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_def_in_main212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_def246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_args_def_in_reconfiguration_def255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def258 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGUMENTS_in_args_def305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arg_def_in_args_def310 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_ARGUMENT_in_arg_def364 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_arg_def366 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_list_ids_in_arg_def373 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DT_PATTERN_in_datatype398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_CHANNEL_in_datatype405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NAME_in_datatype412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NODE_in_datatype420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_XOR_in_datatype427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_other_type_in_datatype438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subtype_in_datatype443 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DT_SET_in_other_type460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_PAIR_in_other_type471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_TRIPLE_in_other_type479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datatype_in_subtype492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_ids513 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_reconfiguration_block562 = new BitSet(new long[]{0x0000000000800008L,0x0000000000001C00L});
	public static final BitSet FOLLOW_declaration_in_instruction608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_instruction617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_instruction626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_instruction_in_instruction634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply658 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_apply667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARATION_in_declaration689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_declaration691 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000400L});
	public static final BitSet FOLLOW_var_def_in_declaration701 = new BitSet(new long[]{0x0000000000100008L,0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_var_def729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_var_def740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignment769 = new BitSet(new long[]{0x0000608280900000L,0x0000000008900040L});
	public static final BitSet FOLLOW_assignment_member_in_assignment778 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_assignment_member801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call836 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call838 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call848 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call850 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call862 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call872 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call874 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call884 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call886 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call896 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_call908 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call910 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call929 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_structure_operation_call931 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call938 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_structure_operation_call940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_args_in_operation_args963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_args995 = new BitSet(new long[]{0x0000608280100002L,0x0000000008900040L});
	public static final BitSet FOLLOW_FORALL_in_for_instruction1034 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_for_instruction1036 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_for_instruction1047 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_for_instruction1051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction1060 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_UNION_in_expression1089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression1093 = new BitSet(new long[]{0x0000408000100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression1097 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression1113 = new BitSet(new long[]{0x0000408000100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression1117 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_MINUS_in_expression1129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression1133 = new BitSet(new long[]{0x0000408000100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression1137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_factor_in_expression1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor1173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_factor1175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_factor1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_factor1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructor_in_factor1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_in_operation1220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_operation1224 = new BitSet(new long[]{0x0000143C50100000L,0x0000000002000000L});
	public static final BitSet FOLLOW_STRUCTURE_in_operation1233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_operation1237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_attribute_call_in_operation1251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_structure_operation_call_in_operation1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triple_cons_in_constructor1279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pair_cons_in_constructor1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_cons_in_constructor1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_IN_in_attribute_call1326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_attribute_call1328 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_OUT_in_attribute_call1341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_attribute_call1343 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_NAME_in_attribute_call1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NODES_in_attribute_call1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_FST_in_attribute_call1392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_SND_in_attribute_call1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_TRD_in_attribute_call1414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attribute_call1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIPLE_in_triple_cons1449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_triple_cons1453 = new BitSet(new long[]{0x0000608280100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_triple_cons1457 = new BitSet(new long[]{0x0000608280100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_triple_cons1461 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PAIR_in_pair_cons1487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_pair_cons1491 = new BitSet(new long[]{0x0000608280100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_pair_cons1495 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set_cons1523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_set_cons1526 = new BitSet(new long[]{0x0000608280100008L,0x0000000008900040L});
	public static final BitSet FOLLOW_ID_in_applicaiton_def1559 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1561 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1576 = new BitSet(new long[]{0x00000A4122100002L});
	public static final BitSet FOLLOW_trigger_block_in_trigger_def1590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1602 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_args_in_main_def1629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_main_block_in_main_def1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARGUMENTS_in_main_args1681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_arg_in_main_args1684 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_ARGUMENT_in_main_arg1713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_arg1715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ids_in_main_arg1717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDS_in_ids1765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ids1768 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_instruction_in_main_block1810 = new BitSet(new long[]{0x0000000000800008L,0x0000000000000080L});
	public static final BitSet FOLLOW_main_assignment_in_main_instruction1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconf_apply_in_main_instruction1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APPLICATION_in_main_assignment1876 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DECLARATION_in_main_assignment1879 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_assignment1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ids_in_main_assignment1885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1896 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_assignment1900 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_APPLY_in_reconf_apply1942 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_reconf_apply1944 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_reconf_apply1946 = new BitSet(new long[]{0x0000000000000008L});
}
