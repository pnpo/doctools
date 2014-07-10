// $ANTLR 3.5.1 /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g 2014-07-09 15:42:47

	package pt.uminho.di.reolang.reclang;
		
	import pt.uminho.di.reolang.ReoLangSemantics;
	import pt.uminho.di.reolang.parsing.Semantics;
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.*;
	//import java.util.*;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Collections;
	import java.util.Comparator;
	import java.io.File;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RecSA extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", 
		"RW_IMPORT", "RW_MAIN", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", 
		"DT_XOR", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", 
		"OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", 
		"OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_ENDS", "OP_NODES", "OP_NAMES", 
		"OP_CHANNELS", "OP_READ", "OP_WRITE", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", 
		"OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", 
		"SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", 
		"SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", 
		"SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", 
		"CONS_SET", "CONS_NODE", "CONS_XOR", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", 
		"STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ACCESS", "APPLICATION", 
		"ARGUMENT", "ARGUMENTS", "ASSIGNMENT", "DECLARATION", "FORALL", "IDS", 
		"IMPORT", "IN", "INSTRUCTIONS", "MAIN", "NODE", "OUT", "PAIR", "RECONFIGS", 
		"RECONFIGURATION", "SET", "SIGNATURE", "STRUCTURE", "SUBTYPE", "TRIPLE", 
		"XOR"
	};
	public static final int EOF=-1;
	public static final int OP_NODES=31;
	public static final int CONS_PAIR=56;
	public static final int SEP_OPTIONAL=48;
	public static final int CONS_NODE=59;
	public static final int SEP_SUBTYPE_END=53;
	public static final int SEP_COLON=45;
	public static final int OP_TRD=26;
	public static final int OCTAL_ESC=69;
	public static final int OP_JOIN=17;
	public static final int DT_PAIR=14;
	public static final int ID=61;
	public static final int OP_INTERSECTION=38;
	public static final int DT_NODE=11;
	public static final int DT_SET=13;
	public static final int OP_ID=21;
	public static final int ESC_SEQ=65;
	public static final int SEP_ACCESSOR=54;
	public static final int OP_MINUS=39;
	public static final int DT_XOR=12;
	public static final int RW_FORALL=5;
	public static final int SEP_LIST_START=50;
	public static final int RW_RECONFIGURATION=4;
	public static final int SEP_ARGS_END=47;
	public static final int OP_FST=24;
	public static final int RW_IMPORT=6;
	public static final int OP_ENDS=30;
	public static final int OP_APPLY=36;
	public static final int COMMENT=63;
	public static final int OP_PATH=22;
	public static final int OP_SND=25;
	public static final int SEP_LIST_END=51;
	public static final int SEP_STRUCTURE=55;
	public static final int OP_SPLIT=18;
	public static final int OP_OUT=28;
	public static final int CONS_SET=58;
	public static final int OP_NAMES=32;
	public static final int SEP_COMMA=43;
	public static final int SEP_ARGS_START=46;
	public static final int DT_TRIPLE=15;
	public static final int OP_UPDATE=23;
	public static final int SEP_BLOCK_START=41;
	public static final int UNICODE_ESC=68;
	public static final int OP_PAR=16;
	public static final int OP_REMOVE=19;
	public static final int HEX_DIGIT=67;
	public static final int INT=62;
	public static final int OP_IN=27;
	public static final int OP_WRITE=35;
	public static final int CONS_XOR=60;
	public static final int OP_READ=34;
	public static final int WS=64;
	public static final int OP_CHANNELS=33;
	public static final int CONS_TRIPLE=57;
	public static final int SEP_SUBTYPE_START=52;
	public static final int SEP_SEMICOLON=44;
	public static final int RW_MAIN=7;
	public static final int SEP_BLOCK_END=42;
	public static final int OP_CONST=20;
	public static final int DT_PATTERN=8;
	public static final int OP_EQUAL=40;
	public static final int OP_NAME=29;
	public static final int DT_CHANNEL=9;
	public static final int OP_UNION=37;
	public static final int SEP_TRIGGER=49;
	public static final int STRING=66;
	public static final int DT_NAME=10;
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


	public RecSA(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecSA(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return RecSA.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g"; }


		private String file_path;

		public void setFilePath(String file) {
			this.file_path = file;
		}

		private String retriveResourceFromFilePath(String file_path) {
			int idx = file_path.lastIndexOf('/');
			String resource = file_path.substring(idx + 1);
			return resource;
		}
		

		//Error se = new Error();
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
		
		
		private ArrayList<Error> removeRepeatedErrors(ArrayList<Error> errors){
			ArrayList<Error> local_errors = new ArrayList<Error>(errors);
			
			for (int i=0; i<local_errors.size(); i++) {
				for (int j=0; j<local_errors.size(); j++) {
					if (local_errors.get(i).getMessage().equals(local_errors.get(j).getMessage()) && i != j) {
						if (local_errors.get(i).getLine() < local_errors.get(j).getLine()){
							local_errors.remove(j);
						} else{
							local_errors.remove(i);
						}
					}
				}
			}
			
			return local_errors;
		}
	       	
	       		
		
		//method used in expression prduction
		private Triple<List<Error>, HashSet<List<Type>>, Integer> getData(String n, List<Type> t, List<Error> e, CommonTree v){
	    		
	    		List<Error> local_errors = new ArrayList<Error>();
	    		HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
	    		Integer nulls = 0;
	    		
	    		if (t.isEmpty()){
	    			local_errors.addAll(e);
	    			nulls++;
	    		}
	    		else{
	    			//if dt is a Set<T>
	    			if (t.get(0).equals(Type.SET)){
	    				datatypes.add(t);
	    			}
	    			else{
	    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(n, "Set<T>"), v.getLine(), v.getCharPositionInLine(), this.file_path) );
	    				nulls++;
	    			}
	    		}
	    		
	    		Triple<List<Error>, HashSet<List<Type>>, Integer> res = new Triple<List<Error>, HashSet<List<Type>>, Integer>();
	    		res.setFirst(local_errors);
	    		res.setSecond(datatypes);
	    		res.setThird(nulls);
	    		
	    		return res;
	    	}


	protected static class reclang_scope {
		TinySymbolsTable ids_table;
		SymbolsTable coopla_table;
		int scope_id;
		int parent_id;
		int aux_id;
		List<Integer> scopes;
		HashMap<Integer,Integer> scope_rel;
	}
	protected Stack<reclang_scope> reclang_stack = new Stack<reclang_scope>();


	// $ANTLR start "reclang"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:107:1: reclang[TinySymbolsTable global_table] returns [ArrayList<Error> errors] : ^( RECONFIGS ( directive_def )* content ) ;
	public final ArrayList<Error> reclang(TinySymbolsTable global_table) throws RecognitionException {
		reclang_stack.push(new reclang_scope());
		ArrayList<Error> errors = null;


		ArrayList<Error> directive_def1 =null;
		ArrayList<Error> content2 =null;


			reclang_stack.peek().ids_table = global_table;
			reclang_stack.peek().coopla_table = new SymbolsTable();
			reclang_stack.peek().scope_id = 0;
			reclang_stack.peek().parent_id = 0;	
			reclang_stack.peek().aux_id = 0;
			reclang_stack.peek().scopes = new ArrayList<Integer>(); //LinkedList
			reclang_stack.peek().scopes.add(0);
			reclang_stack.peek().scope_rel = new HashMap<Integer,Integer>();

			ArrayList<Error> local_errors = new ArrayList<Error>();
			boolean exist_imported_errors = false;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:130:2: ( ^( RECONFIGS ( directive_def )* content ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:130:4: ^( RECONFIGS ( directive_def )* content )
			{
			match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang62); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:130:16: ( directive_def )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==IMPORT) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:130:17: directive_def
						{
						pushFollow(FOLLOW_directive_def_in_reclang65);
						directive_def1=directive_def();
						state._fsp--;


								local_errors.addAll(directive_def1);
								if ( !directive_def1.isEmpty() ){
									exist_imported_errors = true;
								}
							
						}
						break;

					default :
						break loop1;
					}
				}

				pushFollow(FOLLOW_content_in_reclang80);
				content2=content();
				state._fsp--;


						
						//rever -> join imported errors to file errors?
						/*
						if( !exist_imported_errors ){ 
							local_errors.addAll(content2);
						}
						*/
						local_errors.addAll(content2);
					
				match(input, Token.UP, null); 
			}


					//System.out.println(reclang_stack.peek().scope_rel);
					
					//local_errors = this.removeRepeatedErrors(local_errors);
					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "reclang"



	// $ANTLR start "directive_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:165:1: directive_def returns [ArrayList<Error> errors] : directive_import ;
	public final ArrayList<Error> directive_def() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> directive_import3 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:166:2: ( directive_import )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:166:4: directive_import
			{
			pushFollow(FOLLOW_directive_import_in_directive_def111);
			directive_import3=directive_import();
			state._fsp--;


					errors = directive_import3;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "directive_def"



	// $ANTLR start "directive_import"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:173:1: directive_import returns [ArrayList<Error> errors] : ^( IMPORT STRING ) ;
	public final ArrayList<Error> directive_import() throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree STRING4=null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:178:2: ( ^( IMPORT STRING ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:178:4: ^( IMPORT STRING )
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_directive_import135); 
			match(input, Token.DOWN, null); 
			STRING4=(CommonTree)match(input,STRING,FOLLOW_STRING_in_directive_import137); 

					String file_name = (STRING4!=null?STRING4.getText():null);
					String file = file_name.substring(1, file_name.length()-1); //remove " from string
					
				    	File f = new File( file );
				    	if( !f.exists() ){
				    		local_errors.add( Error.report(ErrorType.ERROR, Error.fileDoesNotExist(file), (STRING4!=null?STRING4.getLine():0), (STRING4!=null?STRING4.getCharPositionInLine():0), this.file_path) );
				    	}
				    	else{
						String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
						
						if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {		//*.rpla
							ReCooPLaProcessor p = new ReCooPLaProcessor(file, "");
							TinySymbolsTable imported_ids_table = p.getIdentifiersTable(reclang_stack.peek().ids_table);
							ArrayList<Error> imported_semantic_errors = p.getSemanticErrors( imported_ids_table );
							
							if ( !imported_semantic_errors.isEmpty() ){
								local_errors.addAll( imported_semantic_errors );
							}
						}
						else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//*.cpla
							Semantics semantics = new Semantics(file);
							
							ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis(reclang_stack.peek().coopla_table);
							ArrayList<Error> coopla_errors = imported_atts != null ? imported_atts.errors : new ArrayList<Error>(0);
							if ( !coopla_errors.isEmpty() ){
								local_errors.addAll( coopla_errors );
							}
							
							reclang_stack.peek().coopla_table = imported_atts != null ? imported_atts.symbols : reclang_stack.peek().coopla_table ;
						}
						else{
							local_errors.add( Error.report(ErrorType.ERROR, Error.invalidFile(file), (STRING4!=null?STRING4.getLine():0), (STRING4!=null?STRING4.getCharPositionInLine():0), this.file_path) );
						}
					}
					
					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "directive_import"


	protected static class content_scope {
		TinySymbol name;
		TinySymbolsTable current_scope;
		String rec_type;
	}
	protected Stack<content_scope> content_stack = new Stack<content_scope>();


	// $ANTLR start "content"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:223:1: content returns [ArrayList<Error> errors] : ( element )* ( main )? ;
	public final ArrayList<Error> content() throws RecognitionException {
		content_stack.push(new content_scope());
		ArrayList<Error> errors = null;


		ArrayList<Error> element5 =null;
		ArrayList<Error> main6 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:235:2: ( ( element )* ( main )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:235:4: ( element )* ( main )?
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:235:4: ( element )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==APPLICATION||LA2_0==RECONFIGURATION) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:235:5: element
					{
					pushFollow(FOLLOW_element_in_content168);
					element5=element();
					state._fsp--;


							local_errors.addAll(element5);
						
					}
					break;

				default :
					break loop2;
				}
			}

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:241:2: ( main )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MAIN) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:241:3: main
					{
					pushFollow(FOLLOW_main_in_content182);
					main6=main();
					state._fsp--;


							local_errors.addAll(main6);
						
					}
					break;

			}


					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "content"



	// $ANTLR start "element"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:252:1: element returns [ArrayList<Error> errors] : ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) );
	public final ArrayList<Error> element() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> reconfiguration_def7 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:253:2: ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:253:4: ^( RECONFIGURATION reconfiguration_def )
					{
					match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element210); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_reconfiguration_def_in_element212);
					reconfiguration_def7=reconfiguration_def();
					state._fsp--;


							errors = reconfiguration_def7;
						
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:259:4: ^( APPLICATION applicaiton_def )
					{
					match(input,APPLICATION,FOLLOW_APPLICATION_in_element227); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_applicaiton_def_in_element229);
					applicaiton_def();
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
		return errors;
	}
	// $ANTLR end "element"



	// $ANTLR start "main"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:262:1: main returns [ArrayList<Error> errors] : ^( MAIN main_def ) ;
	public final ArrayList<Error> main() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> main_def8 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:263:2: ( ^( MAIN main_def ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:263:4: ^( MAIN main_def )
			{
			match(input,MAIN,FOLLOW_MAIN_in_main246); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_main_def_in_main248);
			main_def8=main_def();
			state._fsp--;


					errors = main_def8;
				
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
		return errors;
	}
	// $ANTLR end "main"


	protected static class reconfiguration_def_scope {
		ArrayList<TinySymbolsTable> scopes;
	}
	protected Stack<reconfiguration_def_scope> reconfiguration_def_stack = new Stack<reconfiguration_def_scope>();


	// $ANTLR start "reconfiguration_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:272:1: reconfiguration_def returns [ArrayList<Error> errors] : ^( ID ( args_def )? reconfiguration_block ) ;
	public final ArrayList<Error> reconfiguration_def() throws RecognitionException {
		reconfiguration_def_stack.push(new reconfiguration_def_scope());
		ArrayList<Error> errors = null;


		CommonTree ID9=null;
		ArrayList<Error> args_def10 =null;
		ArrayList<Error> reconfiguration_block11 =null;


			content_stack.peek().name = new TinySymbol();
			reconfiguration_def_stack.peek().scopes = new ArrayList<TinySymbolsTable>();
			ArrayList<Error> local_errors = new ArrayList<Error>();

			reclang_stack.peek().scope_id = 0;
			
			boolean recAlreadyDefined = false;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:285:2: ( ^( ID ( args_def )? reconfiguration_block ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:285:4: ^( ID ( args_def )? reconfiguration_block )
			{
			ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def279); 
					
					TinySymbol ts = reclang_stack.peek().ids_table.getSymbols().get((ID9!=null?ID9.getText():null));
					content_stack.peek().name = ts;
					reconfiguration_def_stack.peek().scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();

					if (reclang_stack.peek().ids_table.containsSymbol((ID9!=null?ID9.getText():null))){
						String resource = this.retriveResourceFromFilePath(ts.getFile());
						if ( !((ID9!=null?ID9.getLine():0) == ts.getLine() && (ID9!=null?ID9.getCharPositionInLine():0) == ts.getPosition() && this.file_path.equals(ts.getFile())) ){
							//System.out.println(resource + " -> rec: " + (ID9!=null?ID9.getText():null));
							local_errors.add( Error.report(ErrorType.ERROR, Error.recAlreadyDefined((ID9!=null?ID9.getText():null), ts.getLine(), ts.getPosition(), resource), (ID9!=null?ID9.getLine():0), (ID9!=null?ID9.getCharPositionInLine():0), this.file_path) );
							recAlreadyDefined = true;
						}
					}
				
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:300:2: ( args_def )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ARGUMENTS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:300:3: args_def
					{
					pushFollow(FOLLOW_args_def_in_reconfiguration_def287);
					args_def10=args_def();
					state._fsp--;


							if (!recAlreadyDefined){
								local_errors.addAll(args_def10);
							}
						
					}
					break;

			}

			pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def296);
			reconfiguration_block11=reconfiguration_block();
			state._fsp--;


					if (!recAlreadyDefined){
						local_errors.addAll(reconfiguration_block11);
					}
				
			match(input, Token.UP, null); 


					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "reconfiguration_def"


	protected static class args_def_scope {
		TinySymbolsTable scope;
	}
	protected Stack<args_def_scope> args_def_stack = new Stack<args_def_scope>();


	// $ANTLR start "args_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:319:1: args_def returns [ArrayList<Error> errors] : ^( ARGUMENTS ( arg_def )+ ) ;
	public final ArrayList<Error> args_def() throws RecognitionException {
		args_def_stack.push(new args_def_scope());
		ArrayList<Error> errors = null;


		ArrayList<Error> arg_def12 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			args_def_stack.peek().scope = reconfiguration_def_stack.peek().scopes.get(0);
			//reclang_stack.peek().scope_id++;
			TinySymbolsTable tst = new TinySymbolsTable(reclang_stack.peek().ids_table);
			for (TinySymbol ts : tst.getSymbols().values()){
				ts.getScopes().clear();
				args_def_stack.peek().scope.addSymbol(ts);
			}

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:333:2: ( ^( ARGUMENTS ( arg_def )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:333:4: ^( ARGUMENTS ( arg_def )+ )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def329); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:333:16: ( arg_def )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:333:17: arg_def
					{
					pushFollow(FOLLOW_arg_def_in_args_def332);
					arg_def12=arg_def();
					state._fsp--;


							local_errors.addAll(arg_def12);
						
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


					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			args_def_stack.pop();
		}
		return errors;
	}
	// $ANTLR end "args_def"



	// $ANTLR start "arg_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:345:1: arg_def returns [ArrayList<Error> errors] : ^( ARGUMENT datatype list_ids ) ;
	public final ArrayList<Error> arg_def() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> list_ids13 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:350:2: ( ^( ARGUMENT datatype list_ids ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:350:4: ^( ARGUMENT datatype list_ids )
			{
			match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def365); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_arg_def367);
			datatype();
			state._fsp--;

			pushFollow(FOLLOW_list_ids_in_arg_def369);
			list_ids13=list_ids();
			state._fsp--;


					local_errors.addAll(list_ids13);
				
			match(input, Token.UP, null); 


					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "arg_def"



	// $ANTLR start "datatype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:361:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
	public final void datatype() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:362:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
			case DT_SET:
			case DT_PAIR:
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:362:4: DT_PATTERN
					{
					match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype390); 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:363:4: DT_CHANNEL
					{
					match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype395); 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:364:4: DT_NAME
					{
					match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype400); 
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:365:4: DT_NODE
					{
					match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype405); 
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:366:4: DT_XOR
					{
					match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype410); 
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:367:5: ^( other_type subtype )
					{
					pushFollow(FOLLOW_other_type_in_datatype418);
					other_type();
					state._fsp--;

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subtype_in_datatype420);
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
	}
	// $ANTLR end "datatype"



	// $ANTLR start "other_type"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:370:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
	public final void other_type() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:371:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:
			{
			if ( (input.LA(1) >= DT_SET && input.LA(1) <= DT_TRIPLE) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	}
	// $ANTLR end "other_type"



	// $ANTLR start "subtype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:376:1: subtype : datatype ;
	public final void subtype() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:377:2: ( datatype )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:377:4: datatype
			{
			pushFollow(FOLLOW_datatype_in_subtype454);
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
	}
	// $ANTLR end "subtype"



	// $ANTLR start "list_ids"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:380:1: list_ids returns [ArrayList<Error> errors] : ( ID )+ ;
	public final ArrayList<Error> list_ids() throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree ID14=null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:385:2: ( ( ID )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:385:4: ( ID )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:385:4: ( ID )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ID) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:385:5: ID
					{
					ID14=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids473); 

							//if (reclang_stack.peek().ids_table
							if (args_def_stack.peek().scope.containsSymbol((ID14!=null?ID14.getText():null))){
								TinySymbol ts = args_def_stack.peek().scope.getSymbols().get((ID14!=null?ID14.getText():null));
								if ( !((ID14!=null?ID14.getLine():0) == ts.getLine() && (ID14!=null?ID14.getCharPositionInLine():0) == ts.getPosition()) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID14!=null?ID14.getText():null), ts.getLine(), ts.getPosition()), (ID14!=null?ID14.getLine():0), (ID14!=null?ID14.getCharPositionInLine():0), this.file_path) );
								}
							}
						
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}


					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "list_ids"



	// $ANTLR start "reconfiguration_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:403:1: reconfiguration_block returns [ArrayList<Error> errors] : ^( INSTRUCTIONS ( instruction )+ ) ;
	public final ArrayList<Error> reconfiguration_block() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> instruction15 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:408:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:408:4: ^( INSTRUCTIONS ( instruction )+ )
			{
			match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block504); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:408:19: ( instruction )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==OP_APPLY||(LA9_0 >= ASSIGNMENT && LA9_0 <= FORALL)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:408:20: instruction
					{
					pushFollow(FOLLOW_instruction_in_reconfiguration_block507);
					instruction15=instruction();
					state._fsp--;


							local_errors.addAll(instruction15);
						
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input, Token.UP, null); 


					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "reconfiguration_block"



	// $ANTLR start "instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:420:1: instruction returns [ArrayList<Error> errors] : ( declaration | assignment[false] | reconfiguration_apply | for_instruction );
	public final ArrayList<Error> instruction() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> declaration16 =null;
		ArrayList<Error> assignment17 =null;
		ArrayList<Error> reconfiguration_apply18 =null;
		ArrayList<Error> for_instruction19 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			content_stack.peek().rec_type = "";
			content_stack.peek().current_scope = this.getScope( reclang_stack.peek().scopes.get(reclang_stack.peek().scopes.size()-1) ); //rever

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:426:2: ( declaration | assignment[false] | reconfiguration_apply | for_instruction )
			int alt10=4;
			switch ( input.LA(1) ) {
			case DECLARATION:
				{
				alt10=1;
				}
				break;
			case ASSIGNMENT:
				{
				alt10=2;
				}
				break;
			case OP_APPLY:
				{
				alt10=3;
				}
				break;
			case FORALL:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:426:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_instruction539);
					declaration16=declaration();
					state._fsp--;

					 
							local_errors.addAll(declaration16); 
							errors = local_errors;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:431:4: assignment[false]
					{
					pushFollow(FOLLOW_assignment_in_instruction548);
					assignment17=assignment(false);
					state._fsp--;

					 
							local_errors.addAll(assignment17); 
							errors = local_errors; 
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:436:4: reconfiguration_apply
					{
					pushFollow(FOLLOW_reconfiguration_apply_in_instruction558);
					reconfiguration_apply18=reconfiguration_apply();
					state._fsp--;

					 
							local_errors.addAll(reconfiguration_apply18); 
							errors = local_errors; 
						
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:441:4: for_instruction
					{
					pushFollow(FOLLOW_for_instruction_in_instruction567);
					for_instruction19=for_instruction();
					state._fsp--;


							local_errors.addAll(for_instruction19);
							errors = local_errors;	

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
		}
		return errors;
	}
	// $ANTLR end "instruction"



	// $ANTLR start "reconfiguration_apply"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:452:1: reconfiguration_apply returns [ArrayList<Error> errors] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
	public final ArrayList<Error> reconfiguration_apply() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> reconfiguration_call20 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:457:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:457:4: ^( OP_APPLY reconfiguration_call ( ID )? )
			{
			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply589); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply591);
			reconfiguration_call20=reconfiguration_call();
			state._fsp--;


					local_errors.addAll(reconfiguration_call20);
				
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:462:2: ( ID )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:462:2: ID
					{
					match(input,ID,FOLLOW_ID_in_reconfiguration_apply598); 
					}
					break;

			}

			match(input, Token.UP, null); 


					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "reconfiguration_apply"



	// $ANTLR start "declaration"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:469:1: declaration returns [ArrayList<Error> errors] : ^( DECLARATION datatype ( var_def )+ ) ;
	public final ArrayList<Error> declaration() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> var_def21 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:474:2: ( ^( DECLARATION datatype ( var_def )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:474:4: ^( DECLARATION datatype ( var_def )+ )
			{
			match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration623); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_declaration625);
			datatype();
			state._fsp--;

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:474:27: ( var_def )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==ID||LA12_0==ASSIGNMENT) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:474:28: var_def
					{
					pushFollow(FOLLOW_var_def_in_declaration628);
					var_def21=var_def();
					state._fsp--;


							local_errors.addAll(var_def21);
						
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			match(input, Token.UP, null); 


					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "var_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:485:1: var_def returns [ArrayList<Error> errors] : ( ID | assignment[true] );
	public final ArrayList<Error> var_def() throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree ID22=null;
		ArrayList<Error> assignment23 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:490:2: ( ID | assignment[true] )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				alt13=1;
			}
			else if ( (LA13_0==ASSIGNMENT) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:490:4: ID
					{
					ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def658); 

							if (content_stack.peek().current_scope.containsSymbol((ID22!=null?ID22.getText():null))){
								TinySymbol ts = content_stack.peek().current_scope.getSymbols().get((ID22!=null?ID22.getText():null));
								if ( !((ID22!=null?ID22.getLine():0) == ts.getLine() && (ID22!=null?ID22.getCharPositionInLine():0) == ts.getPosition()) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID22!=null?ID22.getText():null), ts.getLine(), ts.getPosition()), (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0), this.file_path) );
								}
							}
							else {
								Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();
								TinySymbol ts = content_stack.peek().name.hasValue((ID22!=null?ID22.getText():null), s_id);

								if ( ts != null && !((ID22!=null?ID22.getLine():0) == ts.getLine() && (ID22!=null?ID22.getCharPositionInLine():0) == ts.getPosition())){ //rever
									local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID22!=null?ID22.getText():null), ts.getLine(), ts.getPosition()), (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0), this.file_path) );
								}
							}
							errors = local_errors;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:509:4: assignment[true]
					{
					pushFollow(FOLLOW_assignment_in_var_def667);
					assignment23=assignment(true);
					state._fsp--;


							local_errors.addAll(assignment23);
							errors = local_errors; 
						
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
		return errors;
	}
	// $ANTLR end "var_def"



	// $ANTLR start "assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:516:1: assignment[boolean isDeclaration] returns [ArrayList<Error> errors] : ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] ) ;
	public final ArrayList<Error> assignment(boolean isDeclaration) throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree ID24=null;
		ArrayList<Error> assignment_member25 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			TinySymbol ts = new TinySymbol();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:522:2: ( ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:522:4: ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment692); 
			match(input, Token.DOWN, null); 
			ID24=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment694); 
					
					Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();	
			/*		
					ts = content_stack.peek().current_scope.containsSymbol((ID24!=null?ID24.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((ID24!=null?ID24.getText():null)) : content_stack.peek().name.hasValue((ID24!=null?ID24.getText():null), s_id);	

					if (isDeclaration){
						if ( ts != null && !((ID24!=null?ID24.getLine():0) == ts.getLine() && (ID24!=null?ID24.getCharPositionInLine():0) == ts.getPosition()) ){
							local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID24!=null?ID24.getText():null), ts.getLine(), ts.getPosition()), (ID24!=null?ID24.getLine():0), (ID24!=null?ID24.getCharPositionInLine():0), this.file_path) );
						}
					}
					else{
						if ( ts == null){
							local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID24!=null?ID24.getText():null)), (ID24!=null?ID24.getLine():0), (ID24!=null?ID24.getCharPositionInLine():0), this.file_path) );
						}
					}				
			*/				
					if (isDeclaration){
						if (content_stack.peek().current_scope.containsSymbol((ID24!=null?ID24.getText():null))) {
							ts = content_stack.peek().current_scope.getSymbols().get((ID24!=null?ID24.getText():null));
							if ( !((ID24!=null?ID24.getLine():0) == ts.getLine() && (ID24!=null?ID24.getCharPositionInLine():0) == ts.getPosition()) ){
								local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID24!=null?ID24.getText():null), ts.getLine(), ts.getPosition()), (ID24!=null?ID24.getLine():0), (ID24!=null?ID24.getCharPositionInLine():0), this.file_path) );
							}
						}
						else {
							ts = content_stack.peek().name.hasValue((ID24!=null?ID24.getText():null), s_id);
							if ( ts != null && !((ID24!=null?ID24.getLine():0) == ts.getLine() && (ID24!=null?ID24.getCharPositionInLine():0) == ts.getPosition())){ //rever
								local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID24!=null?ID24.getText():null), ts.getLine(), ts.getPosition()), (ID24!=null?ID24.getLine():0), (ID24!=null?ID24.getCharPositionInLine():0), this.file_path) );
							}
						}
					}
					else{
						ts = content_stack.peek().current_scope.containsSymbol((ID24!=null?ID24.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((ID24!=null?ID24.getText():null)) : content_stack.peek().name.hasValue((ID24!=null?ID24.getText():null), s_id);
				
						if ( ts == null || (ID24!=null?ID24.getLine():0) < ts.getLine() ){
							local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID24!=null?ID24.getText():null)), (ID24!=null?ID24.getLine():0), (ID24!=null?ID24.getCharPositionInLine():0), this.file_path) );
						}
					}

					ts = content_stack.peek().current_scope.containsSymbol((ID24!=null?ID24.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((ID24!=null?ID24.getText():null)) : content_stack.peek().name.hasValue((ID24!=null?ID24.getText():null), s_id);	
				
			pushFollow(FOLLOW_assignment_member_in_assignment700);
			assignment_member25=assignment_member(ts, (ID24!=null?ID24.getLine():0), (ID24!=null?ID24.getCharPositionInLine():0));
			state._fsp--;

			match(input, Token.UP, null); 


					local_errors.addAll(assignment_member25);
					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "assignment_member"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:570:1: assignment_member[TinySymbol symbol, int id_line, int id_pos] returns [ArrayList<Error> errors] : ( expression | reconfiguration_apply );
	public final ArrayList<Error> assignment_member(TinySymbol symbol, int id_line, int id_pos) throws RecognitionException {
		ArrayList<Error> errors = null;


		TreeRuleReturnScope expression26 =null;
		ArrayList<Error> reconfiguration_apply27 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			TinySymbol ts = symbol;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:575:2: ( expression | reconfiguration_apply )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= OP_PATH && LA14_0 <= OP_UPDATE)||(LA14_0 >= OP_UNION && LA14_0 <= OP_MINUS)||LA14_0==ID||LA14_0==ACCESS||LA14_0==PAIR||LA14_0==SET||LA14_0==TRIPLE) ) {
				alt14=1;
			}
			else if ( (LA14_0==OP_APPLY) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:575:4: expression
					{
					pushFollow(FOLLOW_expression_in_assignment_member726);
					expression26=expression();
					state._fsp--;


					/**/		if (!(expression26!=null?((RecSA.expression_return)expression26).errors:null).isEmpty()){
								local_errors.addAll((expression26!=null?((RecSA.expression_return)expression26).errors:null));
							}
							else{
					//*/
								if (ts != null) {	
									if ( !ts.getDataType().equals((expression26!=null?((RecSA.expression_return)expression26).datatype:null)) ){
										local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((expression26!=null?((RecSA.expression_return)expression26).name:null), ts.dataTypeToString()), (expression26!=null?((CommonTree)expression26.start):null).getLine(), (expression26!=null?((CommonTree)expression26.start):null).getCharPositionInLine(), this.file_path) );
								 	}
								}
							}
					/*
							if (local_errors.isEmpty()){
								local_errors.addAll((expression26!=null?((RecSA.expression_return)expression26).errors:null));
							}
					*/
							errors = local_errors; 
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:595:4: reconfiguration_apply
					{
					pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member735);
					reconfiguration_apply27=reconfiguration_apply();
					state._fsp--;

					 
							if (ts != null){
								List<Type> dt = new ArrayList<Type>();
								dt.add(Type.PATTERN);
								if (!ts.getDataType().equals(dt)){
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(ts.getId(), "Pattern") , id_line, id_pos, this.file_path) );
								}	
								else{
									local_errors.addAll(reconfiguration_apply27); 
								}
							}
							errors = local_errors; 
						
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
		return errors;
	}
	// $ANTLR end "assignment_member"


	protected static class reconfiguration_call_scope {
		List<TinySymbol> args;
		String name;
	}
	protected Stack<reconfiguration_call_scope> reconfiguration_call_stack = new Stack<reconfiguration_call_scope>();


	// $ANTLR start "reconfiguration_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:611:1: reconfiguration_call returns [ArrayList<Error> errors] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
	public final ArrayList<Error> reconfiguration_call() throws RecognitionException {
		reconfiguration_call_stack.push(new reconfiguration_call_scope());
		ArrayList<Error> errors = null;


		CommonTree OP_JOIN29=null;
		CommonTree OP_SPLIT31=null;
		CommonTree OP_PAR33=null;
		CommonTree OP_REMOVE35=null;
		CommonTree OP_CONST37=null;
		CommonTree OP_ID39=null;
		CommonTree ID40=null;
		TreeRuleReturnScope operation_args28 =null;
		TreeRuleReturnScope operation_args30 =null;
		TreeRuleReturnScope operation_args32 =null;
		TreeRuleReturnScope operation_args34 =null;
		TreeRuleReturnScope operation_args36 =null;
		TreeRuleReturnScope operation_args38 =null;
		TreeRuleReturnScope operation_args41 =null;


			reconfiguration_call_stack.peek().name = "";
			reconfiguration_call_stack.peek().args = new ArrayList<TinySymbol>();
			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:621:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
			int alt15=7;
			switch ( input.LA(1) ) {
			case OP_JOIN:
				{
				alt15=1;
				}
				break;
			case OP_SPLIT:
				{
				alt15=2;
				}
				break;
			case OP_PAR:
				{
				alt15=3;
				}
				break;
			case OP_REMOVE:
				{
				alt15=4;
				}
				break;
			case OP_CONST:
				{
				alt15=5;
				}
				break;
			case OP_ID:
				{
				alt15=6;
				}
				break;
			case ID:
				{
				alt15=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:621:4: ^( OP_JOIN operation_args )
					{
					OP_JOIN29=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call761); 
					 content_stack.peek().rec_type = "join"; 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call767);
						operation_args28=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					 
							if((operation_args28!=null?((CommonTree)operation_args28.start):null) != null){
								local_errors.addAll((operation_args28!=null?((RecSA.operation_args_return)operation_args28).errors:null));
							}
							else{
								local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_JOIN29!=null?OP_JOIN29.getText():null)) , (OP_JOIN29!=null?OP_JOIN29.getLine():0), (OP_JOIN29!=null?OP_JOIN29.getCharPositionInLine():0), this.file_path) );
							}
							errors = local_errors;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:633:4: ^( OP_SPLIT operation_args )
					{
					OP_SPLIT31=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call779); 
					 content_stack.peek().rec_type = "split"; 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call785);
						operation_args30=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					 
							if((operation_args30!=null?((CommonTree)operation_args30.start):null) != null){
								local_errors.addAll((operation_args30!=null?((RecSA.operation_args_return)operation_args30).errors:null));
							}
							else{
								local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_SPLIT31!=null?OP_SPLIT31.getText():null)) , (OP_SPLIT31!=null?OP_SPLIT31.getLine():0), (OP_SPLIT31!=null?OP_SPLIT31.getCharPositionInLine():0), this.file_path) );
							}
							errors = local_errors;
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:645:4: ^( OP_PAR operation_args )
					{
					OP_PAR33=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call797); 
					 content_stack.peek().rec_type = "par"; 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call803);
						operation_args32=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					 
							if((operation_args32!=null?((CommonTree)operation_args32.start):null) != null){
								local_errors.addAll((operation_args32!=null?((RecSA.operation_args_return)operation_args32).errors:null));
							}
							else{
								local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_PAR33!=null?OP_PAR33.getText():null)) , (OP_PAR33!=null?OP_PAR33.getLine():0), (OP_PAR33!=null?OP_PAR33.getCharPositionInLine():0), this.file_path) ); 
							}
							errors = local_errors;
						
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:657:4: ^( OP_REMOVE operation_args )
					{
					OP_REMOVE35=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call814); 
					 content_stack.peek().rec_type = "remove"; 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call820);
						operation_args34=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					 
							if((operation_args34!=null?((CommonTree)operation_args34.start):null) != null){
								local_errors.addAll((operation_args34!=null?((RecSA.operation_args_return)operation_args34).errors:null));
							}
							else{
								local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_REMOVE35!=null?OP_REMOVE35.getText():null)) , (OP_REMOVE35!=null?OP_REMOVE35.getLine():0), (OP_REMOVE35!=null?OP_REMOVE35.getCharPositionInLine():0), this.file_path) );
							}
							errors = local_errors;
						
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:669:4: ^( OP_CONST operation_args )
					{
					OP_CONST37=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call832); 
					 content_stack.peek().rec_type = "const"; 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call838);
						operation_args36=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					 
							if((operation_args36!=null?((CommonTree)operation_args36.start):null) != null){
								local_errors.addAll((operation_args36!=null?((RecSA.operation_args_return)operation_args36).errors:null));
							}
							else{
								local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_CONST37!=null?OP_CONST37.getText():null)) , (OP_CONST37!=null?OP_CONST37.getLine():0), (OP_CONST37!=null?OP_CONST37.getCharPositionInLine():0), this.file_path) );
							}
							errors = local_errors;
						
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:681:4: ^( OP_ID operation_args )
					{
					OP_ID39=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call849); 
					 content_stack.peek().rec_type = "id"; 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call855);
						operation_args38=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}


							if((operation_args38!=null?((CommonTree)operation_args38.start):null) != null){
								local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(content_stack.peek().rec_type) , (OP_ID39!=null?OP_ID39.getLine():0), (OP_ID39!=null?OP_ID39.getCharPositionInLine():0), this.file_path) );
								//local_errors.add( Error.report(ErrorType.ERROR, Error.invalidArgument((operation_args38!=null?((CommonTree)operation_args38.start):null).toString()) , (OP_ID39!=null?OP_ID39.getLine():0), (OP_ID39!=null?OP_ID39.getCharPositionInLine():0)+4, this.file_path) );			

								////is not necessary since 'id' has no arguments
								//local_errors.addAll((operation_args38!=null?((RecSA.operation_args_return)operation_args38).errors:null));
							}


							errors = local_errors;
						
					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:696:4: ^( ID operation_args )
					{
					ID40=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call868); 
					 
							content_stack.peek().rec_type = "custom"; 
							reconfiguration_call_stack.peek().name = (ID40!=null?ID40.getText():null);

							if (reclang_stack.peek().ids_table.containsSymbol((ID40!=null?ID40.getText():null))){
								TinySymbol ts = reclang_stack.peek().ids_table.getSymbols().get((ID40!=null?ID40.getText():null));
									
								if (ts.getLine() > content_stack.peek().name.getLine()){
									local_errors.add( Error.report(ErrorType.ERROR, Error.recNotDefined((ID40!=null?ID40.getText():null)), (ID40!=null?ID40.getLine():0), (ID40!=null?ID40.getCharPositionInLine():0), this.file_path) );
								}
								else{
									TinySymbolsTable tst = ts.getScopes().get(0);
									List<TinySymbol> symbols = new ArrayList<TinySymbol>(tst.getSymbols().values());

									Collections.sort(symbols, new Comparator<TinySymbol>() {
								        	public int compare(TinySymbol ts1, TinySymbol ts2) {
											int value;

									        	if (ts1.getLine() == ts2.getLine()){
									        		value = ts1.getPosition() - ts2.getPosition();
									        	}
									        	else{
									    	        	value = ts1.getLine() - ts2.getLine();
									        	}
											return value;
									        }
									});

									for (TinySymbol symbol : symbols){		
										if (symbol.getClassType().equals(Type.ARG)){
											reconfiguration_call_stack.peek().args.add(symbol);
										}
									}
								}
							}
							else{
								local_errors.add( Error.report(ErrorType.ERROR, Error.recNotDefined((ID40!=null?ID40.getText():null)), (ID40!=null?ID40.getLine():0), (ID40!=null?ID40.getCharPositionInLine():0), this.file_path) );
							}
						
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call877);
						operation_args41=operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

						
							if((operation_args41!=null?((CommonTree)operation_args41.start):null) != null){
								local_errors.addAll((operation_args41!=null?((RecSA.operation_args_return)operation_args41).errors:null));
							}
							else{
								if (!reconfiguration_call_stack.peek().args.isEmpty()){
									local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((ID40!=null?ID40.getText():null)) , (ID40!=null?ID40.getLine():0), (ID40!=null?ID40.getCharPositionInLine():0), this.file_path) ); //(ID40!=null?ID40.getCharPositionInLine():0)
								}
							}
							errors = local_errors;
						
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
			reconfiguration_call_stack.pop();
		}
		return errors;
	}
	// $ANTLR end "reconfiguration_call"



	// $ANTLR start "structure_operation_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:751:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
	public final void structure_operation_call() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:752:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==OP_PATH) ) {
				alt16=1;
			}
			else if ( (LA16_0==OP_UPDATE) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:752:4: ^( OP_PATH operation_args )
					{
					match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call895); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_structure_operation_call897);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:753:4: ^( OP_UPDATE operation_args )
					{
					match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call904); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_structure_operation_call906);
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
	}
	// $ANTLR end "structure_operation_call"


	public static class operation_args_return extends TreeRuleReturnScope {
		public ArrayList<Error> errors;
	};


	// $ANTLR start "operation_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:757:1: operation_args returns [ArrayList<Error> errors] : ( args )? ;
	public final RecSA.operation_args_return operation_args() throws RecognitionException {
		RecSA.operation_args_return retval = new RecSA.operation_args_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope args42 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:761:2: ( ( args )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:761:4: ( args )?
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:761:4: ( args )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= OP_PATH && LA17_0 <= OP_UPDATE)||(LA17_0 >= OP_UNION && LA17_0 <= OP_MINUS)||LA17_0==ID||LA17_0==ACCESS||LA17_0==PAIR||LA17_0==SET||LA17_0==TRIPLE) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:761:5: args
					{
					pushFollow(FOLLOW_args_in_operation_args927);
					args42=args();
					state._fsp--;


							//reconfiguration of type "custom" can have more than one argument; id primitive tested before (do not even have one argument)
							if ((args42!=null?((RecSA.args_return)args42).counter:0) > 1 && !content_stack.peek().rec_type.equals("custom") && !content_stack.peek().rec_type.equals("id")){
								local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(content_stack.peek().rec_type) , (args42!=null?((CommonTree)args42.start):null).getLine(), (args42!=null?((CommonTree)args42.start):null).getCharPositionInLine(), this.file_path) );
							}
							//if the number of arguments are correct, check their type (possible errors)
							else {
								if (content_stack.peek().rec_type.equals("custom") && (args42!=null?((RecSA.args_return)args42).counter:0) < reconfiguration_call_stack.peek().args.size()){
									local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(reconfiguration_call_stack.peek().name) , (args42!=null?((CommonTree)args42.start):null).getLine(), (args42!=null?((CommonTree)args42.start):null).getCharPositionInLine(), this.file_path) );
								}
								else{
									local_errors.addAll((args42!=null?((RecSA.args_return)args42).errors:null));
								}
							}
						
					}
					break;

			}


					retval.errors = local_errors; 
				
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
		public ArrayList<Error> errors;
		public int counter;
	};


	// $ANTLR start "args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:783:1: args returns [ArrayList<Error> errors, int counter] : ( expression )+ ;
	public final RecSA.args_return args() throws RecognitionException {
		RecSA.args_return retval = new RecSA.args_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression43 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			ArrayList<Error> global_errors = new ArrayList<Error>();
			int i = 0;
			boolean exceeded = false;
			List<Type> dt = new ArrayList<Type>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:791:2: ( ( expression )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:791:4: ( expression )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:791:4: ( expression )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= OP_PATH && LA18_0 <= OP_UPDATE)||(LA18_0 >= OP_UNION && LA18_0 <= OP_MINUS)||LA18_0==ID||LA18_0==ACCESS||LA18_0==PAIR||LA18_0==SET||LA18_0==TRIPLE) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:791:5: expression
					{
					pushFollow(FOLLOW_expression_in_args957);
					expression43=expression();
					state._fsp--;


							if (content_stack.peek().rec_type.equals("custom")){
								if (reconfiguration_call_stack.peek().args.size() > i){
									//original argument
									TinySymbol ts1 = reconfiguration_call_stack.peek().args.get(i);

					//			if (ts1 != null){				
									String value = (expression43!=null?((RecSA.expression_return)expression43).name:null);
									Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();
									//if contains symbol, value of new argument is obtained from content_stack.peek().current_scope, else from content_stack.peek().name
									TinySymbol ts2 = content_stack.peek().current_scope.containsSymbol(value) ? content_stack.peek().current_scope.getSymbols().get(value) : content_stack.peek().name.hasValue(value, s_id);
									
									if (ts2 != null){
										dt = ts2.getDataType();
									} else {
										dt = (expression43!=null?((RecSA.expression_return)expression43).datatype:null);
									}
									
									//if ( ts2 != null && !ts2.getDataType().equals(ts1.getDataType()) ){
									if ( !dt.equals(ts1.getDataType()) ){
										String datatype = ts1.dataTypeToString();
										local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, datatype) , (expression43!=null?((CommonTree)expression43.start):null).getLine(), (expression43!=null?((CommonTree)expression43.start):null).getCharPositionInLine(), this.file_path ) );
									}
								}
								else{
									exceeded = true;
								}
							}
							local_errors.addAll((expression43!=null?((RecSA.expression_return)expression43).errors:null));
							i++;
						
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}


					if (exceeded){
						global_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(reconfiguration_call_stack.peek().name) , (expression43!=null?((CommonTree)expression43.start):null).getLine(), (expression43!=null?((CommonTree)expression43.start):null).getCharPositionInLine(), this.file_path ) );
					}
					else{
						global_errors.addAll(local_errors);
					}
					retval.errors = global_errors;
					retval.counter = i;
				
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



	// $ANTLR start "for_instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:839:1: for_instruction returns [ArrayList<Error> errors] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
	public final ArrayList<Error> for_instruction() throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree id1=null;
		CommonTree id2=null;
		ArrayList<Error> reconfiguration_block44 =null;


			if (reclang_stack.peek().scopes.contains(reclang_stack.peek().aux_id)){
				reclang_stack.peek().parent_id = reclang_stack.peek().aux_id;
			}
			else{
				reclang_stack.peek().parent_id = reclang_stack.peek().scopes.get(reclang_stack.peek().scopes.size()-1);
			}
			reclang_stack.peek().scope_id++;
			reclang_stack.peek().scope_rel.put(reclang_stack.peek().scope_id, reclang_stack.peek().parent_id); 

			reclang_stack.peek().scopes.add(reclang_stack.peek().scope_id);
			reclang_stack.peek().aux_id++;

			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:855:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:855:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
			{
			match(input,FORALL,FOLLOW_FORALL_in_for_instruction989); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_for_instruction991);
			datatype();
			state._fsp--;

			id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction995); 
				
					content_stack.peek().current_scope = this.getScope(reclang_stack.peek().parent_id); //rever

					Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();
					TinySymbol ts = content_stack.peek().name.hasValue((id1!=null?id1.getText():null), s_id);
					if ( ts != null ){
						local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((id1!=null?id1.getText():null), ts.getLine(), ts.getPosition()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
					}
				
			id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction1004); 

					ts = content_stack.peek().current_scope.containsSymbol((id2!=null?id2.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((id2!=null?id2.getText():null)) : content_stack.peek().name.hasValue((id2!=null?id2.getText():null), s_id);

					if ( ts == null || (id2!=null?id2.getLine():0) < ts.getLine() ){
						local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id2!=null?id2.getText():null)), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0), this.file_path) );
					}
					//if (local_errors.isEmpty()){
					else{
						TinySymbol ts1 = content_stack.peek().current_scope.containsSymbol((id1!=null?id1.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((id1!=null?id1.getText():null)) : content_stack.peek().name.hasValue((id1!=null?id1.getText():null), s_id);
						TinySymbol ts2 = content_stack.peek().current_scope.containsSymbol((id2!=null?id2.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((id2!=null?id2.getText():null)) : content_stack.peek().name.hasValue((id2!=null?id2.getText():null), s_id);				

							if (!ts2.getDataType().get(0).equals(Type.SET)){
							local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id2!=null?id2.getText():null), "Set<T>"), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0), this.file_path) );
						}
						else{
							if (ts1 != null){
								List<Type> datatype = new ArrayList<Type>(ts2.getDataType());
								datatype.remove(0);
								if (!ts1.getDataType().equals(datatype)){
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id1!=null?id1.getText():null), ts2.dataTypeToString()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
								}
							}
						}
					}
				
			pushFollow(FOLLOW_reconfiguration_block_in_for_instruction1012);
			reconfiguration_block44=reconfiguration_block();
			state._fsp--;


					local_errors.addAll(reconfiguration_block44);
				
			match(input, Token.UP, null); 


					errors = local_errors;
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return errors;
	}
	// $ANTLR end "for_instruction"


	public static class expression_return extends TreeRuleReturnScope {
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "expression"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:906:1: expression returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( OP_UNION f1= factor f2= factor ) | ^( OP_INTERSECTION f1= factor f2= factor ) | ^( OP_MINUS f1= factor f2= factor ) | factor );
	public final RecSA.expression_return expression() throws RecognitionException {
		RecSA.expression_return retval = new RecSA.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope f1 =null;
		TreeRuleReturnScope f2 =null;
		TreeRuleReturnScope factor45 =null;


			Triple<List<Error>, HashSet<List<Type>>, Integer> res = null;

			ArrayList<Error> local_errors = new ArrayList<Error>();
			List<Type> dt = new ArrayList<Type>();

			HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
			int nulls = 0;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:917:2: ( ^( OP_UNION f1= factor f2= factor ) | ^( OP_INTERSECTION f1= factor f2= factor ) | ^( OP_MINUS f1= factor f2= factor ) | factor )
			int alt19=4;
			switch ( input.LA(1) ) {
			case OP_UNION:
				{
				alt19=1;
				}
				break;
			case OP_INTERSECTION:
				{
				alt19=2;
				}
				break;
			case OP_MINUS:
				{
				alt19=3;
				}
				break;
			case OP_PATH:
			case OP_UPDATE:
			case ID:
			case ACCESS:
			case PAIR:
			case SET:
			case TRIPLE:
				{
				alt19=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:917:4: ^( OP_UNION f1= factor f2= factor )
					{
					match(input,OP_UNION,FOLLOW_OP_UNION_in_expression1044); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression1048);
					f1=factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression1052);
					f2=factor();
					state._fsp--;


							res = getData((f1!=null?((RecSA.factor_return)f1).name:null), (f1!=null?((RecSA.factor_return)f1).datatype:null), (f1!=null?((RecSA.factor_return)f1).errors:null), (f1!=null?((CommonTree)f1.start):null));
							local_errors.addAll( res.fst() );
							datatypes.addAll( res.snd() );
							nulls = nulls + res.trd();

							res = getData((f2!=null?((RecSA.factor_return)f2).name:null), (f2!=null?((RecSA.factor_return)f2).datatype:null), (f2!=null?((RecSA.factor_return)f2).errors:null), (f2!=null?((CommonTree)f2.start):null));
							local_errors.addAll( res.fst() );
							datatypes.addAll( res.snd() );
							nulls = nulls + res.trd();

							retval.errors = local_errors;
							retval.name = (f1!=null?((RecSA.factor_return)f1).name:null) + " + " + (f2!=null?((RecSA.factor_return)f2).name:null);

							if(datatypes.size() + nulls == 1){
								dt.addAll(datatypes.iterator().next());
							}
							retval.datatype = dt;
						
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:939:4: ^( OP_INTERSECTION f1= factor f2= factor )
					{
					match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1065); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression1069);
					f1=factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression1073);
					f2=factor();
					state._fsp--;


							res = getData((f1!=null?((RecSA.factor_return)f1).name:null), (f1!=null?((RecSA.factor_return)f1).datatype:null), (f1!=null?((RecSA.factor_return)f1).errors:null), (f1!=null?((CommonTree)f1.start):null));
							local_errors.addAll( res.fst() );
							datatypes.addAll( res.snd() );
							nulls = nulls + res.trd();

							res = getData((f2!=null?((RecSA.factor_return)f2).name:null), (f2!=null?((RecSA.factor_return)f2).datatype:null), (f2!=null?((RecSA.factor_return)f2).errors:null), (f2!=null?((CommonTree)f2.start):null));
							local_errors.addAll( res.fst() );
							datatypes.addAll( res.snd() );
							nulls = nulls + res.trd();

							retval.errors = local_errors;
							retval.name = (f1!=null?((RecSA.factor_return)f1).name:null) + "& " + (f2!=null?((RecSA.factor_return)f2).name:null);

							if(datatypes.size() + nulls == 1){
								dt.addAll(datatypes.iterator().next());
							}
							/*
							else {
								local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements("SET"), $SET.line, $SET.pos, this.file_path) );
							}
							*/
							retval.datatype = dt;
						
					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:966:4: ^( OP_MINUS f1= factor f2= factor )
					{
					match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1086); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression1090);
					f1=factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression1094);
					f2=factor();
					state._fsp--;


							res = getData((f1!=null?((RecSA.factor_return)f1).name:null), (f1!=null?((RecSA.factor_return)f1).datatype:null), (f1!=null?((RecSA.factor_return)f1).errors:null), (f1!=null?((CommonTree)f1.start):null));
							local_errors.addAll( res.fst() );
							datatypes.addAll( res.snd() );
							nulls = nulls + res.trd();

							res = getData((f2!=null?((RecSA.factor_return)f2).name:null), (f2!=null?((RecSA.factor_return)f2).datatype:null), (f2!=null?((RecSA.factor_return)f2).errors:null), (f2!=null?((CommonTree)f2.start):null));
							local_errors.addAll( res.fst() );
							datatypes.addAll( res.snd() );
							nulls = nulls + res.trd();

							retval.errors = local_errors;
							retval.name = (f1!=null?((RecSA.factor_return)f1).name:null) + "- " + (f2!=null?((RecSA.factor_return)f2).name:null);

							if(datatypes.size() + nulls == 1){
								dt.addAll(datatypes.iterator().next());
							}
							retval.datatype = dt;
						
					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:988:4: factor
					{
					pushFollow(FOLLOW_factor_in_expression1106);
					factor45=factor();
					state._fsp--;


							retval.errors = (factor45!=null?((RecSA.factor_return)factor45).errors:null); 
							retval.name = (factor45!=null?((RecSA.factor_return)factor45).name:null); 
							retval.datatype = (factor45!=null?((RecSA.factor_return)factor45).datatype:null);
						
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
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "factor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:997:1: factor returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( ID ID ) | ID | operation | constructor );
	public final RecSA.factor_return factor() throws RecognitionException {
		RecSA.factor_return retval = new RecSA.factor_return();
		retval.start = input.LT(1);

		CommonTree ID46=null;
		TreeRuleReturnScope operation47 =null;
		TreeRuleReturnScope constructor48 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			List<Type> dt = new ArrayList<Type>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1002:2: ( ^( ID ID ) | ID | operation | constructor )
			int alt20=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					alt20=1;
				}
				else if ( (LA20_1==UP||(LA20_1 >= OP_PATH && LA20_1 <= OP_UPDATE)||(LA20_1 >= OP_UNION && LA20_1 <= OP_MINUS)||LA20_1==ID||LA20_1==ACCESS||LA20_1==PAIR||LA20_1==SET||LA20_1==TRIPLE) ) {
					alt20=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
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
				alt20=3;
				}
				break;
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1002:4: ^( ID ID )
					{
					match(input,ID,FOLLOW_ID_in_factor1130); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_factor1132); 
					match(input, Token.UP, null); 


							retval.errors = local_errors;
							retval.datatype = dt;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1008:4: ID
					{
					ID46=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1143); 

							retval.name = (ID46!=null?ID46.getText():null);
							
							Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();
							TinySymbol ts = content_stack.peek().current_scope.containsSymbol((ID46!=null?ID46.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((ID46!=null?ID46.getText():null)) : content_stack.peek().name.hasValue((ID46!=null?ID46.getText():null), s_id);

							if ( ts == null || (ID46!=null?ID46.getLine():0) < ts.getLine() ){
								local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID46!=null?ID46.getText():null)), (ID46!=null?ID46.getLine():0), (ID46!=null?ID46.getCharPositionInLine():0), this.file_path) );
							}
							
							//if (local_errors.isEmpty()){
							else{
								TinySymbol symbol = ts;

								dt.clear();
								dt.add(Type.PATTERN);
								if (content_stack.peek().rec_type.equals("const") && !symbol.getDataType().containsAll(dt) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID46!=null?ID46.getText():null), "Pattern"), (ID46!=null?ID46.getLine():0), (ID46!=null?ID46.getCharPositionInLine():0), this.file_path) );
								}

								if (content_stack.peek().rec_type.equals("par") && !symbol.getDataType().containsAll(dt) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID46!=null?ID46.getText():null), "Pattern"), (ID46!=null?ID46.getLine():0), (ID46!=null?ID46.getCharPositionInLine():0), this.file_path) );
								}

								dt.clear();
								dt.add(Type.SET);
								dt.add(Type.NODE);
								if (content_stack.peek().rec_type.equals("join") && !symbol.getDataType().containsAll(dt) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID46!=null?ID46.getText():null), "Set<Node>"), (ID46!=null?ID46.getLine():0), (ID46!=null?ID46.getCharPositionInLine():0), this.file_path) );
								}

								dt.clear();
								dt.add(Type.NODE);
								if (content_stack.peek().rec_type.equals("split") && !symbol.getDataType().containsAll(dt) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID46!=null?ID46.getText():null), "Node"), (ID46!=null?ID46.getLine():0), (ID46!=null?ID46.getCharPositionInLine():0), this.file_path) );
								}

								dt.clear();
								dt.add(Type.NAME);
								if (content_stack.peek().rec_type.equals("remove") && !symbol.getDataType().containsAll(dt) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID46!=null?ID46.getText():null), "Name"), (ID46!=null?ID46.getLine():0), (ID46!=null?ID46.getCharPositionInLine():0), this.file_path) );
								}

								dt.clear();
								dt.addAll( symbol.getDataType() );
							}

							retval.datatype = dt;
							retval.errors = local_errors; 
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1059:4: operation
					{
					pushFollow(FOLLOW_operation_in_factor1151);
					operation47=operation();
					state._fsp--;


							retval.name = (operation47!=null?((RecSA.operation_return)operation47).name:null);
							retval.datatype = (operation47!=null?((RecSA.operation_return)operation47).datatype:null);
							retval.errors = (operation47!=null?((RecSA.operation_return)operation47).errors:null); 
						
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1066:4: constructor
					{
					pushFollow(FOLLOW_constructor_in_factor1161);
					constructor48=constructor();
					state._fsp--;


							retval.name = (constructor48!=null?((RecSA.constructor_return)constructor48).name:null);
							retval.datatype = (constructor48!=null?((RecSA.constructor_return)constructor48).datatype:null);
							retval.errors = (constructor48!=null?((RecSA.constructor_return)constructor48).errors:null); 

						
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


	protected static class operation_scope {
		String id;
		int line;
		int pos;
	}
	protected Stack<operation_scope> operation_stack = new Stack<operation_scope>();

	public static class operation_return extends TreeRuleReturnScope {
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "operation"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1075:1: operation returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts, accessed] ) | structure_operation_call );
	public final RecSA.operation_return operation() throws RecognitionException {
		operation_stack.push(new operation_scope());
		RecSA.operation_return retval = new RecSA.operation_return();
		retval.start = input.LT(1);

		CommonTree id1=null;
		CommonTree id2=null;
		TreeRuleReturnScope attribute_call49 =null;


			operation_stack.peek().id = "";
			operation_stack.peek().line = 0;
			operation_stack.peek().pos = 0;

			boolean accessed = false;	
			ArrayList<Error> local_errors = new ArrayList<Error>();


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1090:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts, accessed] ) | structure_operation_call )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ACCESS) ) {
				alt22=1;
			}
			else if ( ((LA22_0 >= OP_PATH && LA22_0 <= OP_UPDATE)) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1090:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts, accessed] )
					{
					match(input,ACCESS,FOLLOW_ACCESS_in_operation1187); 
					match(input, Token.DOWN, null); 
					id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1191); 

							operation_stack.peek().id = (id1!=null?id1.getText():null);
							operation_stack.peek().line = (id1!=null?id1.getLine():0);
							operation_stack.peek().pos = (id1!=null?id1.getCharPositionInLine():0);

							Integer s_id = content_stack.peek().current_scope.getScopeRel().fst();
							//if contains symbol, tiny symbol is obtained from content_stack.peek().current_scope, else from content_stack.peek().name
							TinySymbol ts = content_stack.peek().current_scope.containsSymbol((id1!=null?id1.getText():null)) ? content_stack.peek().current_scope.getSymbols().get((id1!=null?id1.getText():null)) : content_stack.peek().name.hasValue((id1!=null?id1.getText():null), s_id);

							if ( ts == null || (id1!=null?id1.getLine():0) < ts.getLine() ){
								local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
							}
							
						
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1105:2: ( ^( STRUCTURE id2= ID ) )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==STRUCTURE) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1105:3: ^( STRUCTURE id2= ID )
							{
							match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1199); 
							match(input, Token.DOWN, null); 
							id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1203); 

									operation_stack.peek().id += "#" + (id2!=null?id2.getText():null);
									operation_stack.peek().line = (id2!=null?id2.getLine():0);
									operation_stack.peek().pos = (id2!=null?id2.getCharPositionInLine():0);
									accessed = true;
								
							match(input, Token.UP, null); 

							}
							break;

					}

					pushFollow(FOLLOW_attribute_call_in_operation1213);
					attribute_call49=attribute_call(ts, accessed);
					state._fsp--;

					match(input, Token.UP, null); 


							if((attribute_call49!=null?((RecSA.attribute_call_return)attribute_call49).errors:null) != null){
								local_errors.addAll((attribute_call49!=null?((RecSA.attribute_call_return)attribute_call49).errors:null));
							}

							retval.errors = local_errors;
							retval.name = operation_stack.peek().id + "." + (attribute_call49!=null?((RecSA.attribute_call_return)attribute_call49).name:null);
							retval.datatype = (attribute_call49!=null?((RecSA.attribute_call_return)attribute_call49).datatype:null);
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1124:4: structure_operation_call
					{
					pushFollow(FOLLOW_structure_operation_call_in_operation1225);
					structure_operation_call();
					state._fsp--;

					 
							retval.errors = local_errors; 
						
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
			operation_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "operation"


	public static class constructor_return extends TreeRuleReturnScope {
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "constructor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1130:1: constructor returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( triple_cons | pair_cons | set_cons );
	public final RecSA.constructor_return constructor() throws RecognitionException {
		RecSA.constructor_return retval = new RecSA.constructor_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope triple_cons50 =null;
		TreeRuleReturnScope pair_cons51 =null;
		TreeRuleReturnScope set_cons52 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1131:2: ( triple_cons | pair_cons | set_cons )
			int alt23=3;
			switch ( input.LA(1) ) {
			case TRIPLE:
				{
				alt23=1;
				}
				break;
			case PAIR:
				{
				alt23=2;
				}
				break;
			case SET:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1131:4: triple_cons
					{
					pushFollow(FOLLOW_triple_cons_in_constructor1245);
					triple_cons50=triple_cons();
					state._fsp--;

					 
							retval.errors = (triple_cons50!=null?((RecSA.triple_cons_return)triple_cons50).errors:null); 
							retval.name = (triple_cons50!=null?((RecSA.triple_cons_return)triple_cons50).name:null); 
							retval.datatype = (triple_cons50!=null?((RecSA.triple_cons_return)triple_cons50).datatype:null); 
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1138:4: pair_cons
					{
					pushFollow(FOLLOW_pair_cons_in_constructor1255);
					pair_cons51=pair_cons();
					state._fsp--;

					 
							retval.errors = (pair_cons51!=null?((RecSA.pair_cons_return)pair_cons51).errors:null); 		
							retval.name = (pair_cons51!=null?((RecSA.pair_cons_return)pair_cons51).name:null); 
							retval.datatype = (pair_cons51!=null?((RecSA.pair_cons_return)pair_cons51).datatype:null); 

						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1146:4: set_cons
					{
					pushFollow(FOLLOW_set_cons_in_constructor1265);
					set_cons52=set_cons();
					state._fsp--;

					 
							retval.errors = (set_cons52!=null?((RecSA.set_cons_return)set_cons52).errors:null);
							retval.name = (set_cons52!=null?((RecSA.set_cons_return)set_cons52).name:null); 
							retval.datatype = (set_cons52!=null?((RecSA.set_cons_return)set_cons52).datatype:null); 
					 
						
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
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "attribute_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1178:1: attribute_call[TinySymbol ts, boolean accessed] returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
	public final RecSA.attribute_call_return attribute_call(TinySymbol ts, boolean accessed) throws RecognitionException {
		RecSA.attribute_call_return retval = new RecSA.attribute_call_return();
		retval.start = input.LT(1);

		CommonTree INT53=null;
		CommonTree OP_IN54=null;
		CommonTree INT55=null;
		CommonTree OP_OUT56=null;
		CommonTree ID57=null;


			ArrayList<Error> local_errors = new ArrayList<Error>();	
			List<Type> datatype = new ArrayList<Type>();
			if (ts != null){
				if (accessed){			
					datatype.add(Type.CHANNEL);
				} else{
					datatype = new ArrayList<Type>(ts.getDataType());
				}
			}

			List<Type> dt = new ArrayList<Type>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1192:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
			int alt26=9;
			switch ( input.LA(1) ) {
			case OP_IN:
				{
				alt26=1;
				}
				break;
			case OP_OUT:
				{
				alt26=2;
				}
				break;
			case OP_NAME:
				{
				alt26=3;
				}
				break;
			case OP_NODES:
				{
				alt26=4;
				}
				break;
			case OP_NAMES:
				{
				alt26=5;
				}
				break;
			case OP_FST:
				{
				alt26=6;
				}
				break;
			case OP_SND:
				{
				alt26=7;
				}
				break;
			case OP_TRD:
				{
				alt26=8;
				}
				break;
			case ID:
				{
				alt26=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1192:4: ^( OP_IN ( INT )? )
					{
					OP_IN54=(CommonTree)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1299); 

							if (ts != null){
								dt = new ArrayList<Type>();
								dt.add(Type.SET);
								dt.add(Type.NODE);
							}
						
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1201:2: ( INT )?
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==INT) ) {
							alt24=1;
						}
						switch (alt24) {
							case 1 :
								// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1201:3: INT
								{
								INT53=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1308); 

										if (ts != null){		
											dt = new ArrayList<Type>();
											dt.add(Type.CHANNEL);
											if ( Integer.parseInt((INT53!=null?INT53.getText():null)) > 1 && datatype.containsAll(dt) ){
												local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments("attribute", (OP_IN54!=null?OP_IN54.getText():null)) , (INT53!=null?INT53.getLine():0), (INT53!=null?INT53.getCharPositionInLine():0), this.file_path) );
											}

											dt = new ArrayList<Type>();
											dt.add(Type.NODE);
										}
									
								}
								break;

						}

						match(input, Token.UP, null); 
					}


							if (ts != null){
								Type t = datatype.get(0);
							 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Pattern' or 'Channel"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
							}

							if (!local_errors.isEmpty()){
								dt = new ArrayList<Type>();
							}

							retval.datatype = dt;
							retval.name = "in";
							retval.errors = local_errors;
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1233:4: ^( OP_OUT ( INT )? )
					{
					OP_OUT56=(CommonTree)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1328); 

							if (ts != null){
								dt = new ArrayList<Type>();
								dt.add(Type.SET);
								dt.add(Type.NODE);
							}
						
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1242:2: ( INT )?
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==INT) ) {
							alt25=1;
						}
						switch (alt25) {
							case 1 :
								// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1242:3: INT
								{
								INT55=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1337); 

										if (ts != null){		
											dt = new ArrayList<Type>();
											dt.add(Type.CHANNEL);
											if ( Integer.parseInt((INT55!=null?INT55.getText():null)) > 1 && datatype.containsAll(dt) ){
												local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments("attribute", (OP_OUT56!=null?OP_OUT56.getText():null)) , (INT55!=null?INT55.getLine():0), (INT55!=null?INT55.getCharPositionInLine():0), this.file_path) );
											}

											dt = new ArrayList<Type>();
											dt.add(Type.NODE);
										}
									
								}
								break;

						}

						match(input, Token.UP, null); 
					}


							if (ts != null){
								Type t = datatype.get(0);
							 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Pattern' or 'Channel"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
							}

							if (!local_errors.isEmpty()){
								dt = new ArrayList<Type>();
							}

							retval.datatype = dt;
							retval.name = "out";
							retval.errors = local_errors;
						
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1274:4: OP_NAME
					{
					match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1355); 

							if (ts != null){
								Type t = datatype.get(0);
							 	if( !t.equals(Type.CHANNEL) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Channel"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
								if (local_errors.isEmpty()){
									dt.add(Type.NAME);
								}
							}

							retval.datatype = dt;
							retval.name = "name";
							retval.errors = local_errors;
						
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1292:4: OP_NODES
					{
					match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1366); 

					//		System.out.println(ts);
							if (ts != null){
								Type t = datatype.get(0);
							 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Pattern' or 'Channel"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
								if (local_errors.isEmpty()){
									dt.add(Type.SET);
									dt.add(Type.NODE);
								}
							}

							retval.datatype = dt;		
							retval.name = "nodes";
							retval.errors = local_errors;
						
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1312:4: OP_NAMES
					{
					match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1377); 

							if (ts != null){
								Type t = datatype.get(0);
							 	if( !t.equals(Type.PATTERN) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Pattern"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
								if (local_errors.isEmpty()){
									dt.add(Type.SET);
									dt.add(Type.NAME);
								}
							}

							retval.datatype = dt;		
							retval.name = "names";
							retval.errors = local_errors;
						
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1352:4: OP_FST
					{
					match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1391); 

							if (ts != null){
								Type t = datatype.get(0);
							 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Pair' or 'Triple"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
								if (local_errors.isEmpty()){
									datatype.remove(0);
									dt.addAll(datatype);
								}
							}

							retval.datatype = dt;				
							retval.name = "fst";
							retval.errors = local_errors;
						
					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1371:4: OP_SND
					{
					match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1402); 

							if (ts != null){
								Type t = datatype.get(0);
							 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Pair' or 'Triple"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
								if (local_errors.isEmpty()){
									datatype.remove(0);
									dt.addAll(datatype);
								}
							}

							retval.datatype = dt;		
							retval.name = "snd";
							retval.errors = local_errors;
						
					}
					break;
				case 8 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1389:4: OP_TRD
					{
					match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1412); 

							if (ts != null){
								Type t = datatype.get(0);
							 	if( !t.equals(Type.TRIPLE) ) {
									local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(operation_stack.peek().id, "Triple"), operation_stack.peek().line, operation_stack.peek().pos, this.file_path) );
								}
								//else
								if (local_errors.isEmpty()){
									datatype.remove(0);
									dt.addAll(datatype);
								}
							}

							retval.datatype = dt;		
							retval.name = "trd";
							retval.errors = local_errors;
						
					}
					break;
				case 9 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1408:4: ID
					{
					ID57=(CommonTree)match(input,ID,FOLLOW_ID_in_attribute_call1423); 

							retval.datatype = dt;
							retval.name = (ID57!=null?ID57.getText():null);		
							retval.errors = local_errors;
						
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
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "triple_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1417:1: triple_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( TRIPLE e1= expression e2= expression e3= expression ) ;
	public final RecSA.triple_cons_return triple_cons() throws RecognitionException {
		RecSA.triple_cons_return retval = new RecSA.triple_cons_return();
		retval.start = input.LT(1);

		CommonTree TRIPLE58=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope e3 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			List<Type> dt = new ArrayList<Type>();
			HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
			int nulls = 0;
			String name = "T(";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1425:2: ( ^( TRIPLE e1= expression e2= expression e3= expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1425:4: ^( TRIPLE e1= expression e2= expression e3= expression )
			{
			TRIPLE58=(CommonTree)match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1449); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_triple_cons1453);
			e1=expression();
			state._fsp--;


					local_errors.addAll((e1!=null?((RecSA.expression_return)e1).errors:null));
					if ( !(e1!=null?((RecSA.expression_return)e1).datatype:null).isEmpty() ) {
						datatypes.add((e1!=null?((RecSA.expression_return)e1).datatype:null));
					}
					else{
						nulls++;
					}
					name += (e1!=null?((RecSA.expression_return)e1).name:null) + ", ";
				
			pushFollow(FOLLOW_expression_in_triple_cons1463);
			e2=expression();
			state._fsp--;


					local_errors.addAll((e2!=null?((RecSA.expression_return)e2).errors:null));
					if ( !(e2!=null?((RecSA.expression_return)e2).datatype:null).isEmpty() ) {
						datatypes.add((e2!=null?((RecSA.expression_return)e2).datatype:null));
					}
					else{
						nulls++;
					}
					name += (e2!=null?((RecSA.expression_return)e2).name:null) + ", ";
				
			pushFollow(FOLLOW_expression_in_triple_cons1474);
			e3=expression();
			state._fsp--;


					local_errors.addAll((e3!=null?((RecSA.expression_return)e3).errors:null));
					if ( !(e3!=null?((RecSA.expression_return)e3).datatype:null).isEmpty() ) {
						datatypes.add((e3!=null?((RecSA.expression_return)e3).datatype:null));
					}
					else{
						nulls++;
					}
					name += (e3!=null?((RecSA.expression_return)e3).name:null);
				
			match(input, Token.UP, null); 



					retval.errors = local_errors;

					name = name.substring(0, name.length()-1);
					retval.name = name + ")";

					if (local_errors.isEmpty()){
						if(datatypes.size() + nulls == 1){
							dt.add(Type.TRIPLE);
							dt.addAll(datatypes.iterator().next());
						}
						else {
							local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements(retval.name), (TRIPLE58!=null?TRIPLE58.getLine():0), (TRIPLE58!=null?TRIPLE58.getCharPositionInLine():0), this.file_path) );
						}
					}

					retval.datatype = dt;
				
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


	public static class set_cons_return extends TreeRuleReturnScope {
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "set_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1485:1: set_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( SET ( expression )* ) ;
	public final RecSA.set_cons_return set_cons() throws RecognitionException {
		RecSA.set_cons_return retval = new RecSA.set_cons_return();
		retval.start = input.LT(1);

		CommonTree SET60=null;
		TreeRuleReturnScope expression59 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();	
			List<Type> dt = new ArrayList<Type>();
			HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
			int nulls = 0;
			String name = "S(";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1493:2: ( ^( SET ( expression )* ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1493:4: ^( SET ( expression )* )
			{
			SET60=(CommonTree)match(input,SET,FOLLOW_SET_in_set_cons1505); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1493:10: ( expression )*
				loop27:
				while (true) {
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( ((LA27_0 >= OP_PATH && LA27_0 <= OP_UPDATE)||(LA27_0 >= OP_UNION && LA27_0 <= OP_MINUS)||LA27_0==ID||LA27_0==ACCESS||LA27_0==PAIR||LA27_0==SET||LA27_0==TRIPLE) ) {
						alt27=1;
					}

					switch (alt27) {
					case 1 :
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1493:11: expression
						{
						pushFollow(FOLLOW_expression_in_set_cons1508);
						expression59=expression();
						state._fsp--;


								local_errors.addAll((expression59!=null?((RecSA.expression_return)expression59).errors:null));
								if ( !(expression59!=null?((RecSA.expression_return)expression59).datatype:null).isEmpty() ) {
									datatypes.add((expression59!=null?((RecSA.expression_return)expression59).datatype:null));
								}
								else{
									nulls++;
								}
								name += (expression59!=null?((RecSA.expression_return)expression59).name:null) + ",";
							
						}
						break;

					default :
						break loop27;
					}
				}



						retval.errors = local_errors;

						name = name.substring(0, name.length()-1);
						retval.name = name + ")";

						if (local_errors.isEmpty()){
							if(datatypes.size() + nulls == 1){
								dt.add(Type.SET);
								dt.addAll(datatypes.iterator().next());
							}
							else {
								local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements(retval.name), (SET60!=null?SET60.getLine():0), (SET60!=null?SET60.getCharPositionInLine():0), this.file_path) );
							}
						}

						retval.datatype = dt;
					
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


	public static class pair_cons_return extends TreeRuleReturnScope {
		public ArrayList<Error> errors;
		public List<Type> datatype;
		public String name;
	};


	// $ANTLR start "pair_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1527:1: pair_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( PAIR e1= expression e2= expression ) ;
	public final RecSA.pair_cons_return pair_cons() throws RecognitionException {
		RecSA.pair_cons_return retval = new RecSA.pair_cons_return();
		retval.start = input.LT(1);

		CommonTree PAIR61=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();
			List<Type> dt = new ArrayList<Type>();
			HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
			int nulls = 0;
			String name = "P(";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1535:2: ( ^( PAIR e1= expression e2= expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1535:4: ^( PAIR e1= expression e2= expression )
			{
			PAIR61=(CommonTree)match(input,PAIR,FOLLOW_PAIR_in_pair_cons1541); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_pair_cons1545);
			e1=expression();
			state._fsp--;


					local_errors.addAll((e1!=null?((RecSA.expression_return)e1).errors:null));
					if ( !(e1!=null?((RecSA.expression_return)e1).datatype:null).isEmpty() ) {
						datatypes.add((e1!=null?((RecSA.expression_return)e1).datatype:null));
					}
					else{
						nulls++;
					}
					name += (e1!=null?((RecSA.expression_return)e1).name:null) + ", ";
				
			pushFollow(FOLLOW_expression_in_pair_cons1554);
			e2=expression();
			state._fsp--;


					local_errors.addAll((e2!=null?((RecSA.expression_return)e2).errors:null));

					if ( !(e2!=null?((RecSA.expression_return)e2).datatype:null).isEmpty() ) {
						datatypes.add((e2!=null?((RecSA.expression_return)e2).datatype:null));
					}
					else{
						nulls++;
					}
					name += (e2!=null?((RecSA.expression_return)e2).name:null);
				
			match(input, Token.UP, null); 



					retval.errors = local_errors;

					name = name.substring(0, name.length()-1);
					retval.name = name + ")";

					if (local_errors.isEmpty()){
						if(datatypes.size() + nulls == 1){
							dt.add(Type.PAIR);
							dt.addAll(datatypes.iterator().next());
						}
						else {
							local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements(retval.name), (PAIR61!=null?PAIR61.getLine():0), (PAIR61!=null?PAIR61.getCharPositionInLine():0), this.file_path) );
						}
					}

					retval.datatype = dt;
				
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



	// $ANTLR start "applicaiton_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1727:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
	public final void applicaiton_def() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1728:2: ( ID list_reconfigurations ( trigger_def )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1728:4: ID list_reconfigurations ( trigger_def )?
			{
			match(input,ID,FOLLOW_ID_in_applicaiton_def1584); 
			pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1586);
			list_reconfigurations();
			state._fsp--;

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1728:29: ( trigger_def )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==SEP_BLOCK_START) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1728:29: trigger_def
					{
					pushFollow(FOLLOW_trigger_def_in_applicaiton_def1588);
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
	}
	// $ANTLR end "applicaiton_def"



	// $ANTLR start "list_reconfigurations"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1731:1: list_reconfigurations : ( reconfiguration_call )+ ;
	public final void list_reconfigurations() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1732:2: ( ( reconfiguration_call )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1732:4: ( reconfiguration_call )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1732:4: ( reconfiguration_call )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= OP_PAR && LA29_0 <= OP_ID)||LA29_0==ID) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1732:4: reconfiguration_call
					{
					pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1600);
					reconfiguration_call();
					state._fsp--;

					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
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
	}
	// $ANTLR end "list_reconfigurations"



	// $ANTLR start "trigger_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1735:1: trigger_def : trigger_block ;
	public final void trigger_def() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1736:2: ( trigger_block )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1736:4: trigger_block
			{
			pushFollow(FOLLOW_trigger_block_in_trigger_def1612);
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
	}
	// $ANTLR end "trigger_def"



	// $ANTLR start "trigger_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1739:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
	public final void trigger_block() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1740:2: ( SEP_BLOCK_START SEP_BLOCK_END )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1740:4: SEP_BLOCK_START SEP_BLOCK_END
			{
			match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1623); 
			match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1625); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "trigger_block"


	protected static class main_def_scope {
		List<String> patterns;
	}
	protected Stack<main_def_scope> main_def_stack = new Stack<main_def_scope>();


	// $ANTLR start "main_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1746:1: main_def returns [ArrayList<Error> errors] : ( main_args )? main_block ;
	public final ArrayList<Error> main_def() throws RecognitionException {
		main_def_stack.push(new main_def_scope());
		ArrayList<Error> errors = null;


		ArrayList<Error> main_args62 =null;
		TreeRuleReturnScope main_block63 =null;


			content_stack.peek().name = reclang_stack.peek().ids_table.getSymbols().get("$main");
			content_stack.peek().current_scope = content_stack.peek().name.getScopes().get(0); //main has only one scope
			
			ArrayList<Error> local_errors = new ArrayList<Error>();

			// coopla data
			main_def_stack.peek().patterns = new ArrayList<String>();

			HashMap<String, Symbol> coopla_symbols = reclang_stack.peek().coopla_table.getSymbols();
			for (String key : coopla_symbols.keySet()){
				Symbol s = coopla_symbols.get(key);
				if (s.getType().equals("PATTERN")){
					main_def_stack.peek().patterns.add(s.getId());
				}
			}
			
			
			boolean recAlreadyDefined = false;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1771:2: ( ( main_args )? main_block )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1771:4: ( main_args )? main_block
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1771:4: ( main_args )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==ARGUMENTS) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1771:5: main_args
					{
					pushFollow(FOLLOW_main_args_in_main_def1650);
					main_args62=main_args();
					state._fsp--;

							
							local_errors.addAll(main_args62);
						
					}
					break;

			}

			pushFollow(FOLLOW_main_block_in_main_def1659);
			main_block63=main_block();
			state._fsp--;


					local_errors.addAll((main_block63!=null?((RecSA.main_block_return)main_block63).errors:null));
					
					TinySymbol ts = content_stack.peek().name;
					String resource = this.retriveResourceFromFilePath(ts.getFile());
					if ( !(ts.getLine() == (main_block63!=null?((CommonTree)main_block63.start):null).getLine() && ts.getPosition() == 0 && ts.getFile().equals(this.file_path)) ){
						local_errors = new ArrayList<Error>(); //ignore other main errors
						local_errors.add( Error.report(ErrorType.WARNING, Error.multipleMain(ts.getLine(), ts.getPosition(), resource), (main_block63!=null?((CommonTree)main_block63.start):null).getLine(), 0, this.file_path) );
					}
					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "main_def"



	// $ANTLR start "main_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1790:1: main_args returns [ArrayList<Error> errors] : ^( ARGUMENTS ( main_arg )+ ) ;
	public final ArrayList<Error> main_args() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> main_arg64 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1794:2: ( ^( ARGUMENTS ( main_arg )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1794:4: ^( ARGUMENTS ( main_arg )+ )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1682); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1794:16: ( main_arg )+
			int cnt31=0;
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==ARGUMENT) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1794:17: main_arg
					{
					pushFollow(FOLLOW_main_arg_in_main_args1685);
					main_arg64=main_arg();
					state._fsp--;


							local_errors.addAll(main_arg64);
						
					}
					break;

				default :
					if ( cnt31 >= 1 ) break loop31;
					EarlyExitException eee = new EarlyExitException(31, input);
					throw eee;
				}
				cnt31++;
			}


					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "main_args"



	// $ANTLR start "main_arg"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1806:1: main_arg returns [ArrayList<Error> errors] : ^( ARGUMENT dt= ID ids[true] ) ;
	public final ArrayList<Error> main_arg() throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree dt=null;
		ArrayList<Error> ids65 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1810:2: ( ^( ARGUMENT dt= ID ids[true] ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1810:4: ^( ARGUMENT dt= ID ids[true] )
			{
			match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1719); 
			match(input, Token.DOWN, null); 
			dt=(CommonTree)match(input,ID,FOLLOW_ID_in_main_arg1723); 

					if (!main_def_stack.peek().patterns.contains((dt!=null?dt.getText():null))){
						local_errors.add( Error.report(ErrorType.ERROR, Error.patternNotDefined((dt!=null?dt.getText():null)), (dt!=null?dt.getLine():0), (dt!=null?dt.getCharPositionInLine():0), this.file_path) );
					}
				
			pushFollow(FOLLOW_ids_in_main_arg1729);
			ids65=ids(true);
			state._fsp--;


					if (local_errors.isEmpty()){
						local_errors.addAll(ids65);
					}
					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "main_arg"



	// $ANTLR start "ids"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1826:1: ids[boolean toTest] returns [ArrayList<Error> errors] : ^( IDS ( ID )+ ) ;
	public final ArrayList<Error> ids(boolean toTest) throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree ID66=null;


			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1830:2: ( ^( IDS ( ID )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1830:4: ^( IDS ( ID )+ )
			{
			match(input,IDS,FOLLOW_IDS_in_ids1757); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1830:10: ( ID )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==ID) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1830:11: ID
					{
					ID66=(CommonTree)match(input,ID,FOLLOW_ID_in_ids1760); 

							if (toTest && content_stack.peek().current_scope.containsSymbol((ID66!=null?ID66.getText():null))){
								TinySymbol ts = content_stack.peek().current_scope.getSymbols().get((ID66!=null?ID66.getText():null));
								if ( !((ID66!=null?ID66.getLine():0) == ts.getLine() && (ID66!=null?ID66.getCharPositionInLine():0) == ts.getPosition()) ){
									local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID66!=null?ID66.getText():null), ts.getLine(), ts.getPosition()), (ID66!=null?ID66.getLine():0), (ID66!=null?ID66.getCharPositionInLine():0), this.file_path) );
								}
							}
						
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}


					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "ids"


	public static class main_block_return extends TreeRuleReturnScope {
		public ArrayList<Error> errors;
	};


	// $ANTLR start "main_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1848:1: main_block returns [ArrayList<Error> errors] : ^( INSTRUCTIONS ( main_instruction )+ ) ;
	public final RecSA.main_block_return main_block() throws RecognitionException {
		RecSA.main_block_return retval = new RecSA.main_block_return();
		retval.start = input.LT(1);

		ArrayList<Error> main_instruction67 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1852:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1852:4: ^( INSTRUCTIONS ( main_instruction )+ )
			{
			match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1797); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1852:19: ( main_instruction )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==APPLICATION||LA33_0==DECLARATION) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1852:20: main_instruction
					{
					pushFollow(FOLLOW_main_instruction_in_main_block1800);
					main_instruction67=main_instruction();
					state._fsp--;


							local_errors.addAll(main_instruction67);
						
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}


					retval.errors = local_errors;
				
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
	// $ANTLR end "main_block"



	// $ANTLR start "main_instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1864:1: main_instruction returns [ArrayList<Error> errors] : ( main_declaration | main_assignment );
	public final ArrayList<Error> main_instruction() throws RecognitionException {
		ArrayList<Error> errors = null;


		ArrayList<Error> main_declaration68 =null;
		ArrayList<Error> main_assignment69 =null;


			content_stack.peek().rec_type = "";

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1868:2: ( main_declaration | main_assignment )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==DECLARATION) ) {
				alt34=1;
			}
			else if ( (LA34_0==APPLICATION) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1868:4: main_declaration
					{
					pushFollow(FOLLOW_main_declaration_in_main_instruction1833);
					main_declaration68=main_declaration();
					state._fsp--;

					 errors = main_declaration68; 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1869:4: main_assignment
					{
					pushFollow(FOLLOW_main_assignment_in_main_instruction1840);
					main_assignment69=main_assignment();
					state._fsp--;

					 errors = main_assignment69; 
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
		return errors;
	}
	// $ANTLR end "main_instruction"



	// $ANTLR start "main_declaration"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1872:1: main_declaration returns [ArrayList<Error> errors] : ^( DECLARATION dt= ID ids[true] ) ;
	public final ArrayList<Error> main_declaration() throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree dt=null;
		ArrayList<Error> ids70 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1876:2: ( ^( DECLARATION dt= ID ids[true] ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1876:4: ^( DECLARATION dt= ID ids[true] )
			{
			match(input,DECLARATION,FOLLOW_DECLARATION_in_main_declaration1861); 
			match(input, Token.DOWN, null); 
			dt=(CommonTree)match(input,ID,FOLLOW_ID_in_main_declaration1865); 

					if (!main_def_stack.peek().patterns.contains((dt!=null?dt.getText():null))){
						local_errors.add( Error.report(ErrorType.ERROR, Error.patternNotDefined((dt!=null?dt.getText():null)), (dt!=null?dt.getLine():0), (dt!=null?dt.getCharPositionInLine():0), this.file_path) );
					}
				
			pushFollow(FOLLOW_ids_in_main_declaration1875);
			ids70=ids(true);
			state._fsp--;


					if (local_errors.isEmpty()){
						local_errors.addAll(ids70);
					}
					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "main_declaration"



	// $ANTLR start "main_assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1893:1: main_assignment returns [ArrayList<Error> errors] : ^( APPLICATION ( ^( DECLARATION (dt= ID )? ids[toTest] ) )? ^( OP_APPLY ID reconfiguration_call ) ) ;
	public final ArrayList<Error> main_assignment() throws RecognitionException {
		ArrayList<Error> errors = null;


		CommonTree dt=null;
		ArrayList<Error> ids71 =null;
		ArrayList<Error> reconfiguration_call72 =null;


			ArrayList<Error> local_errors = new ArrayList<Error>();	
			boolean toTest = false;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1898:2: ( ^( APPLICATION ( ^( DECLARATION (dt= ID )? ids[toTest] ) )? ^( OP_APPLY ID reconfiguration_call ) ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1898:4: ^( APPLICATION ( ^( DECLARATION (dt= ID )? ids[toTest] ) )? ^( OP_APPLY ID reconfiguration_call ) )
			{
			match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1902); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1898:19: ( ^( DECLARATION (dt= ID )? ids[toTest] ) )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==DECLARATION) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1898:21: ^( DECLARATION (dt= ID )? ids[toTest] )
					{
					match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1907); 
					match(input, Token.DOWN, null); 
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1898:35: (dt= ID )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==ID) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecSA.g:1898:36: dt= ID
							{
							dt=(CommonTree)match(input,ID,FOLLOW_ID_in_main_assignment1912); 
								
									if (main_def_stack.peek().patterns.contains((dt!=null?dt.getText():null))){
										local_errors.add( Error.report(ErrorType.ERROR, Error.patternAlreadyDefined((dt!=null?dt.getText():null)), (dt!=null?dt.getLine():0), (dt!=null?dt.getCharPositionInLine():0), this.file_path) );
									} else {
										main_def_stack.peek().patterns.add((dt!=null?dt.getText():null));
									}
									
									if ((dt!=null?dt.getText():null) != null){ //if is declaration
										toTest = true;
									}
								
							}
							break;

					}

					pushFollow(FOLLOW_ids_in_main_assignment1921);
					ids71=ids(toTest);
					state._fsp--;


							local_errors.addAll(ids71);
						
					match(input, Token.UP, null); 

					}
					break;

			}

			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1938); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_main_assignment1940); 
			pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1942);
			reconfiguration_call72=reconfiguration_call();
			state._fsp--;


					local_errors.addAll(reconfiguration_call72);
				
			match(input, Token.UP, null); 


					errors = local_errors;
				
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
		return errors;
	}
	// $ANTLR end "main_assignment"

	// Delegated rules



	public static final BitSet FOLLOW_RECONFIGS_in_reclang62 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_directive_def_in_reclang65 = new BitSet(new long[]{0x0000000000000008L,0x0000000000424080L});
	public static final BitSet FOLLOW_content_in_reclang80 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_directive_import_in_directive_def111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_directive_import135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_directive_import137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_element_in_content168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000420080L});
	public static final BitSet FOLLOW_main_in_content182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECONFIGURATION_in_element210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_reconfiguration_def_in_element212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_APPLICATION_in_element227 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_applicaiton_def_in_element229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MAIN_in_main246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_def_in_main248 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_def279 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_args_def_in_reconfiguration_def287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def296 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGUMENTS_in_args_def329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arg_def_in_args_def332 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_ARGUMENT_in_arg_def365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_arg_def367 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_list_ids_in_arg_def369 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DT_PATTERN_in_datatype390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_CHANNEL_in_datatype395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NAME_in_datatype400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NODE_in_datatype405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_XOR_in_datatype410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_other_type_in_datatype418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subtype_in_datatype420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_datatype_in_subtype454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_ids473 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_reconfiguration_block507 = new BitSet(new long[]{0x0000001000000008L,0x0000000000001C00L});
	public static final BitSet FOLLOW_declaration_in_instruction539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_instruction548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_instruction558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_instruction_in_instruction567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply591 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_apply598 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARATION_in_declaration623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_declaration625 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_var_def_in_declaration628 = new BitSet(new long[]{0x2000000000000008L,0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_var_def658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_var_def667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment692 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignment694 = new BitSet(new long[]{0x200000F000C00000L,0x0000000008900040L});
	public static final BitSet FOLLOW_assignment_member_in_assignment700 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_assignment_member726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call767 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call785 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call797 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call803 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call814 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call838 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call849 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_call868 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call895 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_structure_operation_call897 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call904 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_structure_operation_call906 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_args_in_operation_args927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_args957 = new BitSet(new long[]{0x200000E000C00002L,0x0000000008900040L});
	public static final BitSet FOLLOW_FORALL_in_for_instruction989 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_for_instruction991 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_for_instruction995 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_for_instruction1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction1012 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_UNION_in_expression1044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression1048 = new BitSet(new long[]{0x2000000000C00000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression1052 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1065 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression1069 = new BitSet(new long[]{0x2000000000C00000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression1073 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_MINUS_in_expression1086 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression1090 = new BitSet(new long[]{0x2000000000C00000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression1094 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_factor_in_expression1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor1130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_factor1132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_factor1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_factor1151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructor_in_factor1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_in_operation1187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_operation1191 = new BitSet(new long[]{0x20000001BF000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_STRUCTURE_in_operation1199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_operation1203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_attribute_call_in_operation1213 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_structure_operation_call_in_operation1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triple_cons_in_constructor1245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pair_cons_in_constructor1255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_cons_in_constructor1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_IN_in_attribute_call1299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_attribute_call1308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_OUT_in_attribute_call1328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_attribute_call1337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_NAME_in_attribute_call1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NODES_in_attribute_call1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_FST_in_attribute_call1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_SND_in_attribute_call1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_TRD_in_attribute_call1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attribute_call1423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIPLE_in_triple_cons1449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_triple_cons1453 = new BitSet(new long[]{0x200000E000C00000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_triple_cons1463 = new BitSet(new long[]{0x200000E000C00000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_triple_cons1474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set_cons1505 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_set_cons1508 = new BitSet(new long[]{0x200000E000C00008L,0x0000000008900040L});
	public static final BitSet FOLLOW_PAIR_in_pair_cons1541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_pair_cons1545 = new BitSet(new long[]{0x200000E000C00000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_pair_cons1554 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_applicaiton_def1584 = new BitSet(new long[]{0x20000000003F0000L});
	public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1586 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1600 = new BitSet(new long[]{0x20000000003F0002L});
	public static final BitSet FOLLOW_trigger_block_in_trigger_def1612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1623 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_args_in_main_def1650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_main_block_in_main_def1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARGUMENTS_in_main_args1682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_arg_in_main_args1685 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_ARGUMENT_in_main_arg1719 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_arg1723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ids_in_main_arg1729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDS_in_ids1757 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ids1760 = new BitSet(new long[]{0x2000000000000008L});
	public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1797 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_instruction_in_main_block1800 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000880L});
	public static final BitSet FOLLOW_main_declaration_in_main_instruction1833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_assignment_in_main_instruction1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARATION_in_main_declaration1861 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_declaration1865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ids_in_main_declaration1875 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_APPLICATION_in_main_assignment1902 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DECLARATION_in_main_assignment1907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_assignment1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ids_in_main_assignment1921 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1938 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_assignment1940 = new BitSet(new long[]{0x20000000003F0000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1942 = new BitSet(new long[]{0x0000000000000008L});
}
