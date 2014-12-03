// $ANTLR 3.5.1 /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g 2014-12-03 20:43:02

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.ReoLangSemantics;
	import pt.uminho.di.reolang.parsing.Semantics;
	
	import pt.uminho.di.reolang.ReoLangCP2;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.cp.model.CPModelInternal;
	
	import pt.uminho.di.reolang.parsing.util.*;
	import java.util.Set;
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.io.File;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RecTG extends TreeParser {
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


	public RecTG(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecTG(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return RecTG.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g"; }


		private TinySymbolsTable ids_table = new TinySymbolsTable();
		
		
		private String file_path;

		public void setFilePath(String file) {
			this.file_path = file;
		}
		
		private String retriveResourceFromFilePath(String file_path) {
			int idx = file_path.lastIndexOf('/');
			String resource = file_path.substring(idx + 1);
			return resource;
		}
		
		private String retrivePathFromFilePath(String file_path) {
			int idx = file_path.lastIndexOf('/');
			String path = file_path.substring(0, idx + 1);
			return path;
		}


	protected static class reclang_scope {
		int scope_id;
		int parent_id;
		int aux_id;
		List<Integer> scopes;
		SymbolsTable coopla_table;
		LinkedHashMap<String, CPModelInternal> patterns;
	}
	protected Stack<reclang_scope> reclang_stack = new Stack<reclang_scope>();


	// $ANTLR start "reclang"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:53:1: reclang[TinySymbolsTable i_global_table] returns [TinySymbolsTable o_global_table] : ^( RECONFIGS ( directive_def )* content ) ;
	public final TinySymbolsTable reclang(TinySymbolsTable i_global_table) throws RecognitionException {
		reclang_stack.push(new reclang_scope());
		TinySymbolsTable o_global_table = null;



			this.ids_table = i_global_table;
			reclang_stack.peek().scope_id = 0;
			reclang_stack.peek().parent_id = 0;
			reclang_stack.peek().aux_id = 0;
			
			reclang_stack.peek().scopes = new ArrayList<Integer>(); //LinkedList or Stack
			reclang_stack.peek().scopes.add(0);
			
			
			reclang_stack.peek().coopla_table = new SymbolsTable();
			reclang_stack.peek().patterns = new LinkedHashMap<String, CPModelInternal>();
			

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:77:2: ( ^( RECONFIGS ( directive_def )* content ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:77:4: ^( RECONFIGS ( directive_def )* content )
			{
			match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang62); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:77:16: ( directive_def )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==IMPORT) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:77:16: directive_def
						{
						pushFollow(FOLLOW_directive_def_in_reclang64);
						directive_def();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				pushFollow(FOLLOW_content_in_reclang67);
				content();
				state._fsp--;


						//ids_table.removeRepeatedSymbols();
						o_global_table = ids_table;
					
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
		return o_global_table;
	}
	// $ANTLR end "reclang"



	// $ANTLR start "directive_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:90:1: directive_def : directive_import ;
	public final void directive_def() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:91:2: ( directive_import )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:91:4: directive_import
			{
			pushFollow(FOLLOW_directive_import_in_directive_def92);
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
	}
	// $ANTLR end "directive_def"



	// $ANTLR start "directive_import"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:95:1: directive_import : ^( IMPORT STRING ) ;
	public final void directive_import() throws RecognitionException {
		CommonTree STRING1=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:96:2: ( ^( IMPORT STRING ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:96:4: ^( IMPORT STRING )
			{
			match(input,IMPORT,FOLLOW_IMPORT_in_directive_import106); 
			match(input, Token.DOWN, null); 
			STRING1=(CommonTree)match(input,STRING,FOLLOW_STRING_in_directive_import108); 

					String file_name = (STRING1!=null?STRING1.getText():null);
					String file = file_name.substring(1, file_name.length()-1); //remove " from string
					
				    	File f = new File( file );
				    	if( !f.exists() ){
				    		String path = retrivePathFromFilePath(this.file_path);
				    		file = path + file;
				    		f = new File( file );
				    	}
				    	if( f.exists() ){
						String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
						
						if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {	//*.rpla
							ReCooPLaProcessor p = new ReCooPLaProcessor(file, "");
							
							TinySymbolsTable imported_ids_table = p.getIdentifiersTable(this.ids_table);
							if (imported_ids_table.containsSymbol("$main")){
								imported_ids_table.getSymbols().remove("$main"); //ignore imported main's
							}
							this.ids_table = imported_ids_table;
							
							/*
							TinySymbolsTable changed_table = new TinySymbolsTable(imported_ids_table);
							for (TinySymbol ts : changed_table.getSymbols().values()){
								ts.setLine(0);
							}
							this.ids_table = changed_table;
							*/
							
						}
						else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//*.cpla
							Semantics semantics = new Semantics(file);
							
							ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis(reclang_stack.peek().coopla_table);
							reclang_stack.peek().coopla_table = imported_atts != null ? imported_atts.symbols : reclang_stack.peek().coopla_table ;
							
							CPBuilder cp_model_builder = new CPBuilder(file);
							ReoLangCP2 res = cp_model_builder.performModelConstruction(reclang_stack.peek().patterns, reclang_stack.peek().coopla_table);
							reclang_stack.peek().patterns = res.getPatterns() != null ? res.getPatterns() : reclang_stack.peek().patterns;
			//				if(reclang_stack.peek().patterns != null){
			//					System.out.println(reclang_stack.peek().patterns);
			//				}
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
	}
	// $ANTLR end "directive_import"



	// $ANTLR start "content"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:149:1: content : ( element )* ( main )? ;
	public final void content() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:150:2: ( ( element )* ( main )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:150:4: ( element )* ( main )?
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:150:4: ( element )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==APPLICATION||LA2_0==RECONFIGURATION) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:150:4: element
					{
					pushFollow(FOLLOW_element_in_content128);
					element();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:150:13: ( main )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MAIN) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:150:13: main
					{
					pushFollow(FOLLOW_main_in_content131);
					main();
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
	// $ANTLR end "content"



	// $ANTLR start "element"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:153:1: element : ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) );
	public final void element() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:154:2: ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:154:4: ^( RECONFIGURATION reconfiguration_def )
					{
					match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element145); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_reconfiguration_def_in_element147);
					reconfiguration_def();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:155:4: ^( APPLICATION applicaiton_def )
					{
					match(input,APPLICATION,FOLLOW_APPLICATION_in_element154); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_applicaiton_def_in_element156);
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
	}
	// $ANTLR end "element"



	// $ANTLR start "main"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:158:1: main : ^( MAIN main_def ) ;
	public final void main() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:159:2: ( ^( MAIN main_def ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:159:4: ^( MAIN main_def )
			{
			match(input,MAIN,FOLLOW_MAIN_in_main169); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_main_def_in_main171);
			main_def();
			state._fsp--;

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
	}
	// $ANTLR end "main"


	protected static class reconfiguration_def_scope {
		TinySymbol rec_symbol;
		TinySymbolsTable main_scope;
		List<TinySymbolsTable> sub_scopes;
		List<Type> datatype;
		String scope;
	}
	protected Stack<reconfiguration_def_scope> reconfiguration_def_stack = new Stack<reconfiguration_def_scope>();


	// $ANTLR start "reconfiguration_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:164:1: reconfiguration_def : ^( ID ( args_def )? reconfiguration_block ) ;
	public final void reconfiguration_def() throws RecognitionException {
		reconfiguration_def_stack.push(new reconfiguration_def_scope());
		CommonTree ID2=null;


			reconfiguration_def_stack.peek().rec_symbol = new TinySymbol();
			reconfiguration_def_stack.peek().main_scope = new TinySymbolsTable();
			reconfiguration_def_stack.peek().sub_scopes = new ArrayList<TinySymbolsTable>();
			reconfiguration_def_stack.peek().datatype = new ArrayList<Type>();
			reconfiguration_def_stack.peek().scope = "main";
			
			reclang_stack.peek().scope_id = 0;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:181:2: ( ^( ID ( args_def )? reconfiguration_block ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:181:4: ^( ID ( args_def )? reconfiguration_block )
			{
			ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def193); 

					
					reconfiguration_def_stack.peek().rec_symbol.setId((ID2!=null?ID2.getText():null));
					
					reconfiguration_def_stack.peek().datatype.add( Type.PATTERN );	//Type.values()[0]
					reconfiguration_def_stack.peek().rec_symbol.setDataType(reconfiguration_def_stack.peek().datatype);
					
					Type classtype = Type.RECONFIG; 	//Type.valueOf("RECONFIG")
					reconfiguration_def_stack.peek().rec_symbol.setClassType(classtype);
					
					reconfiguration_def_stack.peek().rec_symbol.setLine((ID2!=null?ID2.getLine():0));
					reconfiguration_def_stack.peek().rec_symbol.setPosition((ID2!=null?ID2.getCharPositionInLine():0));
				
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:196:2: ( args_def )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ARGUMENTS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:196:2: args_def
					{
					pushFollow(FOLLOW_args_def_in_reconfiguration_def202);
					args_def();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def205);
			reconfiguration_block();
			state._fsp--;


					reconfiguration_def_stack.peek().rec_symbol.addScopes(reconfiguration_def_stack.peek().main_scope, reconfiguration_def_stack.peek().sub_scopes);
							
					reconfiguration_def_stack.peek().rec_symbol.setFile( this.file_path ); //retriveResourceFromFilePath(this.file_path)
					
					reconfiguration_def_stack.peek().rec_symbol.removeRepeatedIds();
					if(!ids_table.containsSymbol((ID2!=null?ID2.getText():null))){
						ids_table.addSymbol(reconfiguration_def_stack.peek().rec_symbol);
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
			reconfiguration_def_stack.pop();
		}
	}
	// $ANTLR end "reconfiguration_def"



	// $ANTLR start "args_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:210:1: args_def : ^( ARGUMENTS ( arg_def )+ ) ;
	public final void args_def() throws RecognitionException {

			reconfiguration_def_stack.peek().main_scope.setScopeRel( new Pair<Integer, Integer>(reclang_stack.peek().scope_id, reclang_stack.peek().parent_id) );
			reclang_stack.peek().scope_id++;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:215:2: ( ^( ARGUMENTS ( arg_def )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:215:4: ^( ARGUMENTS ( arg_def )+ )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def228); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:215:16: ( arg_def )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:215:16: arg_def
					{
					pushFollow(FOLLOW_arg_def_in_args_def230);
					arg_def();
					state._fsp--;

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
	// $ANTLR end "args_def"



	// $ANTLR start "arg_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:219:1: arg_def : ^( ARGUMENT datatype list_ids ) ;
	public final void arg_def() throws RecognitionException {

			reconfiguration_def_stack.peek().datatype = new ArrayList<Type>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:223:2: ( ^( ARGUMENT datatype list_ids ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:223:4: ^( ARGUMENT datatype list_ids )
			{
			match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def251); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_arg_def253);
			datatype();
			state._fsp--;

			pushFollow(FOLLOW_list_ids_in_arg_def255);
			list_ids();
			state._fsp--;

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
	}
	// $ANTLR end "arg_def"



	// $ANTLR start "datatype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:226:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
	public final void datatype() throws RecognitionException {
		Type other_type3 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:227:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:227:4: DT_PATTERN
					{
					match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype268); 
					 reconfiguration_def_stack.peek().datatype.add( Type.PATTERN ); 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:228:4: DT_CHANNEL
					{
					match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype275); 
					 reconfiguration_def_stack.peek().datatype.add( Type.CHANNEL ); 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:229:4: DT_NAME
					{
					match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype282); 
					 reconfiguration_def_stack.peek().datatype.add( Type.NAME ); 
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:230:4: DT_NODE
					{
					match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype289); 
					 reconfiguration_def_stack.peek().datatype.add( Type.NODE ); 
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:231:4: DT_XOR
					{
					match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype297); 
					 reconfiguration_def_stack.peek().datatype.add( Type.XOR ); 
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:233:5: ^( other_type subtype )
					{
					pushFollow(FOLLOW_other_type_in_datatype309);
					other_type3=other_type();
					state._fsp--;


							reconfiguration_def_stack.peek().datatype.add( other_type3 );
						
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subtype_in_datatype315);
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
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:241:1: other_type returns [Type type] : ( DT_SET | DT_PAIR | DT_TRIPLE );
	public final Type other_type() throws RecognitionException {
		Type type = null;


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:242:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:242:4: DT_SET
					{
					match(input,DT_SET,FOLLOW_DT_SET_in_other_type333); 
					 type = Type.SET; 
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:243:4: DT_PAIR
					{
					match(input,DT_PAIR,FOLLOW_DT_PAIR_in_other_type343); 
					 type = Type.PAIR; 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:244:4: DT_TRIPLE
					{
					match(input,DT_TRIPLE,FOLLOW_DT_TRIPLE_in_other_type352); 
					 type = Type.TRIPLE; 
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
		return type;
	}
	// $ANTLR end "other_type"



	// $ANTLR start "subtype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:247:1: subtype : datatype ;
	public final void subtype() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:248:2: ( datatype )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:248:4: datatype
			{
			pushFollow(FOLLOW_datatype_in_subtype365);
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
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:251:1: list_ids : ( ID )+ ;
	public final void list_ids() throws RecognitionException {
		CommonTree ID4=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:252:2: ( ( ID )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:252:4: ( ID )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:252:4: ( ID )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:252:5: ID
					{
					ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids378); 

							TinySymbol s = new TinySymbol();
							s.setId((ID4!=null?ID4.getText():null));
							
							s.setDataType( reconfiguration_def_stack.peek().datatype );
							
							Type classtype = Type.ARG;
							s.setClassType(classtype);
							
							s.setLine((ID4!=null?ID4.getLine():0));
							s.setPosition((ID4!=null?ID4.getCharPositionInLine():0));
							
							if (!reconfiguration_def_stack.peek().main_scope.containsSymbol((ID4!=null?ID4.getText():null))){
								reconfiguration_def_stack.peek().main_scope.addSymbol(s);
							}
						
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
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
	// $ANTLR end "list_ids"



	// $ANTLR start "reconfiguration_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:273:1: reconfiguration_block : ^( INSTRUCTIONS ( instruction )+ ) ;
	public final void reconfiguration_block() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:274:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:274:4: ^( INSTRUCTIONS ( instruction )+ )
			{
			match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block400); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:274:19: ( instruction )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:274:19: instruction
					{
					pushFollow(FOLLOW_instruction_in_reconfiguration_block402);
					instruction();
					state._fsp--;

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
	// $ANTLR end "reconfiguration_block"



	// $ANTLR start "instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:277:1: instruction : ( declaration | assignment | reconfiguration_apply | for_instruction );
	public final void instruction() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:278:2: ( declaration | assignment | reconfiguration_apply | for_instruction )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:278:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_instruction416);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:279:4: assignment
					{
					pushFollow(FOLLOW_assignment_in_instruction421);
					assignment();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:280:4: reconfiguration_apply
					{
					pushFollow(FOLLOW_reconfiguration_apply_in_instruction426);
					reconfiguration_apply();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:281:4: for_instruction
					{
					pushFollow(FOLLOW_for_instruction_in_instruction431);
					for_instruction();
					state._fsp--;


							reclang_stack.peek().scopes.remove(reclang_stack.peek().scopes.size()-1);
							reclang_stack.peek().parent_id = reclang_stack.peek().scopes.get(reclang_stack.peek().scopes.size()-1);
							reclang_stack.peek().aux_id--;
								
							if (reclang_stack.peek().parent_id == 0) {
								reconfiguration_def_stack.peek().scope = "main";
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
	// $ANTLR end "instruction"



	// $ANTLR start "reconfiguration_apply"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:293:1: reconfiguration_apply : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
	public final void reconfiguration_apply() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:294:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:294:4: ^( OP_APPLY reconfiguration_call ( ID )? )
			{
			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply447); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply449);
			reconfiguration_call();
			state._fsp--;

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:294:36: ( ID )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:294:36: ID
					{
					match(input,ID,FOLLOW_ID_in_reconfiguration_apply451); 
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
	}
	// $ANTLR end "reconfiguration_apply"



	// $ANTLR start "declaration"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:297:1: declaration : ^( DECLARATION datatype ( var_def )+ ) ;
	public final void declaration() throws RecognitionException {

			reconfiguration_def_stack.peek().datatype = new ArrayList<Type>();

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:301:2: ( ^( DECLARATION datatype ( var_def )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:301:4: ^( DECLARATION datatype ( var_def )+ )
			{
			match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration471); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_declaration473);
			datatype();
			state._fsp--;

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:301:27: ( var_def )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:301:27: var_def
					{
					pushFollow(FOLLOW_var_def_in_declaration475);
					var_def();
					state._fsp--;

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
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
	}
	// $ANTLR end "declaration"



	// $ANTLR start "var_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:304:1: var_def : ( ID | assignment );
	public final void var_def() throws RecognitionException {
		CommonTree ID5=null;
		TinySymbol assignment6 =null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:305:2: ( ID | assignment )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:305:4: ID
					{
					ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def489); 

							TinySymbol s = new TinySymbol();
							s.setId((ID5!=null?ID5.getText():null));
							
							s.setDataType( reconfiguration_def_stack.peek().datatype );
							
							Type classtype = Type.VAR;
							s.setClassType(classtype);
							
							s.setLine((ID5!=null?ID5.getLine():0));
							s.setPosition((ID5!=null?ID5.getCharPositionInLine():0));
							
							if (reconfiguration_def_stack.peek().scope.equals("main")){
								if (!reconfiguration_def_stack.peek().main_scope.containsSymbol((ID5!=null?ID5.getText():null))){
									reconfiguration_def_stack.peek().main_scope.addSymbol(s);
								}
							}
							else {
								if (!for_instruction_stack.peek().forall_table.containsSymbol((ID5!=null?ID5.getText():null))){
									for_instruction_stack.peek().forall_table.addSymbol(s);
								}
							}
							
						
						
					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:331:4: assignment
					{
					pushFollow(FOLLOW_assignment_in_var_def497);
					assignment6=assignment();
					state._fsp--;


							if (reconfiguration_def_stack.peek().scope.equals("main")){
								if ( !reconfiguration_def_stack.peek().main_scope.containsSymbol(assignment6.getId()) ){
									reconfiguration_def_stack.peek().main_scope.addSymbol(assignment6);
								}
							}
							else {
								if ( !for_instruction_stack.peek().forall_table.containsSymbol(assignment6.getId()) ){
									for_instruction_stack.peek().forall_table.addSymbol(assignment6);
								}
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
	// $ANTLR end "var_def"



	// $ANTLR start "assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:346:1: assignment returns [TinySymbol symbol] : ^( ASSIGNMENT ID assignment_member ) ;
	public final TinySymbol assignment() throws RecognitionException {
		TinySymbol symbol = null;


		CommonTree ID7=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:347:2: ( ^( ASSIGNMENT ID assignment_member ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:347:4: ^( ASSIGNMENT ID assignment_member )
			{
			match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment516); 
			match(input, Token.DOWN, null); 
			ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment518); 

					TinySymbol s = new TinySymbol();
					s.setId((ID7!=null?ID7.getText():null));
					
					s.setDataType( reconfiguration_def_stack.peek().datatype );
					
					Type classtype = Type.VAR;
					s.setClassType(classtype);
					
					s.setLine((ID7!=null?ID7.getLine():0));
					s.setPosition((ID7!=null?ID7.getCharPositionInLine():0));
					
					symbol = s;
				
			pushFollow(FOLLOW_assignment_member_in_assignment527);
			assignment_member();
			state._fsp--;

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
		return symbol;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "assignment_member"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:366:1: assignment_member : ( expression | reconfiguration_apply );
	public final void assignment_member() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:367:2: ( expression | reconfiguration_apply )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:367:4: expression
					{
					pushFollow(FOLLOW_expression_in_assignment_member542);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:368:4: reconfiguration_apply
					{
					pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member548);
					reconfiguration_apply();
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
	}
	// $ANTLR end "assignment_member"



	// $ANTLR start "reconfiguration_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:371:1: reconfiguration_call : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
	public final void reconfiguration_call() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:372:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:372:4: ^( OP_JOIN operation_args )
					{
					match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call561); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call563);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:373:4: ^( OP_SPLIT operation_args )
					{
					match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call570); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call572);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:374:4: ^( OP_PAR operation_args )
					{
					match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call579); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call581);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:375:4: ^( OP_REMOVE operation_args )
					{
					match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call588); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call590);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:376:4: ^( OP_CONST operation_args )
					{
					match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call597); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call599);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:377:4: ^( OP_ID operation_args )
					{
					match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call606); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call608);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:378:4: ^( ID operation_args )
					{
					match(input,ID,FOLLOW_ID_in_reconfiguration_call615); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_reconfiguration_call617);
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
	// $ANTLR end "reconfiguration_call"



	// $ANTLR start "structure_operation_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:382:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
	public final void structure_operation_call() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:383:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:383:4: ^( OP_PATH operation_args )
					{
					match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call633); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_structure_operation_call635);
						operation_args();
						state._fsp--;

						match(input, Token.UP, null); 
					}

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:384:4: ^( OP_UPDATE operation_args )
					{
					match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call642); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						pushFollow(FOLLOW_operation_args_in_structure_operation_call644);
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



	// $ANTLR start "operation_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:388:1: operation_args : ( args )? ;
	public final void operation_args() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:389:2: ( ( args )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:389:4: ( args )?
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:389:4: ( args )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID||LA18_0==OP_INTERSECTION||LA18_0==OP_MINUS||LA18_0==OP_PATH||(LA18_0 >= OP_UNION && LA18_0 <= OP_UPDATE)||LA18_0==ACCESS||LA18_0==PAIR||LA18_0==SET||LA18_0==TRIPLE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:389:4: args
					{
					pushFollow(FOLLOW_args_in_operation_args659);
					args();
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
	// $ANTLR end "operation_args"



	// $ANTLR start "args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:392:1: args : ( expression )+ ;
	public final void args() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:393:2: ( ( expression )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:393:4: ( expression )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:393:4: ( expression )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:393:4: expression
					{
					pushFollow(FOLLOW_expression_in_args672);
					expression();
					state._fsp--;

					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
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
	// $ANTLR end "args"


	protected static class for_instruction_scope {
		TinySymbolsTable forall_table;
	}
	protected Stack<for_instruction_scope> for_instruction_stack = new Stack<for_instruction_scope>();


	// $ANTLR start "for_instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:397:1: for_instruction : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
	public final void for_instruction() throws RecognitionException {
		for_instruction_stack.push(new for_instruction_scope());
		CommonTree id1=null;
		CommonTree id2=null;


			
			reconfiguration_def_stack.peek().datatype = new ArrayList<Type>();
			for_instruction_stack.peek().forall_table = new TinySymbolsTable();
			reconfiguration_def_stack.peek().scope = "forall";
			
			if (reclang_stack.peek().scopes.contains(reclang_stack.peek().aux_id)){
				reclang_stack.peek().parent_id = reclang_stack.peek().aux_id;
			}
			else{
				reclang_stack.peek().parent_id = reclang_stack.peek().scopes.get(reclang_stack.peek().scopes.size()-1);
			}
			
			for_instruction_stack.peek().forall_table.setScopeRel( new Pair<Integer, Integer>(reclang_stack.peek().scope_id, reclang_stack.peek().parent_id) );
			
			reclang_stack.peek().scopes.add(reclang_stack.peek().scope_id);	
			reclang_stack.peek().scope_id++;
			reclang_stack.peek().aux_id++;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:420:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:420:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
			{
			match(input,FORALL,FOLLOW_FORALL_in_for_instruction695); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_datatype_in_for_instruction697);
			datatype();
			state._fsp--;

			id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction701); 

					TinySymbol s = new TinySymbol();
					s.setId((id1!=null?id1.getText():null));
					
					s.setDataType( reconfiguration_def_stack.peek().datatype );
					
					Type classtype = Type.VAR;
					s.setClassType(classtype);
					
					s.setLine((id1!=null?id1.getLine():0));
					s.setPosition((id1!=null?id1.getCharPositionInLine():0));
					
					if (!for_instruction_stack.peek().forall_table.containsSymbol((id1!=null?id1.getText():null))){
						for_instruction_stack.peek().forall_table.addSymbol(s);
					}
				
			id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction711); 
			pushFollow(FOLLOW_reconfiguration_block_in_for_instruction713);
			reconfiguration_block();
			state._fsp--;


					reconfiguration_def_stack.peek().sub_scopes.add(for_instruction_stack.peek().forall_table);
				
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
	}
	// $ANTLR end "for_instruction"



	// $ANTLR start "expression"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:446:1: expression : ( ^( OP_UNION factor factor ) | ^( OP_INTERSECTION factor factor ) | ^( OP_MINUS factor factor ) | factor );
	public final void expression() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:447:2: ( ^( OP_UNION factor factor ) | ^( OP_INTERSECTION factor factor ) | ^( OP_MINUS factor factor ) | factor )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:447:4: ^( OP_UNION factor factor )
					{
					match(input,OP_UNION,FOLLOW_OP_UNION_in_expression734); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression736);
					factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression738);
					factor();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:448:4: ^( OP_INTERSECTION factor factor )
					{
					match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression745); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression747);
					factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression749);
					factor();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:449:4: ^( OP_MINUS factor factor )
					{
					match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression756); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_factor_in_expression758);
					factor();
					state._fsp--;

					pushFollow(FOLLOW_factor_in_expression760);
					factor();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:450:4: factor
					{
					pushFollow(FOLLOW_factor_in_expression766);
					factor();
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
	}
	// $ANTLR end "expression"



	// $ANTLR start "factor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:453:1: factor : ( ^( ID ID ) | ID | operation | constructor );
	public final void factor() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:454:2: ( ^( ID ID ) | ID | operation | constructor )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:454:4: ^( ID ID )
					{
					match(input,ID,FOLLOW_ID_in_factor778); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_factor780); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:455:4: ID
					{
					match(input,ID,FOLLOW_ID_in_factor786); 
					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:456:4: operation
					{
					pushFollow(FOLLOW_operation_in_factor791);
					operation();
					state._fsp--;

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:457:4: constructor
					{
					pushFollow(FOLLOW_constructor_in_factor796);
					constructor();
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
	}
	// $ANTLR end "factor"



	// $ANTLR start "operation"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:460:1: operation : ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call );
	public final void operation() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:461:2: ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:461:4: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
					{
					match(input,ACCESS,FOLLOW_ACCESS_in_operation809); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_operation811); 
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:461:16: ( ^( STRUCTURE ID ) )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==STRUCTURE) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:461:17: ^( STRUCTURE ID )
							{
							match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation815); 
							match(input, Token.DOWN, null); 
							match(input,ID,FOLLOW_ID_in_operation817); 
							match(input, Token.UP, null); 

							}
							break;

					}

					pushFollow(FOLLOW_attribute_call_in_operation822);
					attribute_call();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:463:4: structure_operation_call
					{
					pushFollow(FOLLOW_structure_operation_call_in_operation829);
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
	}
	// $ANTLR end "operation"



	// $ANTLR start "constructor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:466:1: constructor : ( triple_cons | pair_cons | set_cons );
	public final void constructor() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:467:2: ( triple_cons | pair_cons | set_cons )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:467:4: triple_cons
					{
					pushFollow(FOLLOW_triple_cons_in_constructor841);
					triple_cons();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:468:4: pair_cons
					{
					pushFollow(FOLLOW_pair_cons_in_constructor846);
					pair_cons();
					state._fsp--;

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:469:4: set_cons
					{
					pushFollow(FOLLOW_set_cons_in_constructor851);
					set_cons();
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
	}
	// $ANTLR end "constructor"



	// $ANTLR start "attribute_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:480:1: attribute_call : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
	public final void attribute_call() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:481:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:481:4: ^( OP_IN ( INT )? )
					{
					match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call873); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:481:12: ( INT )?
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==INT) ) {
							alt25=1;
						}
						switch (alt25) {
							case 1 :
								// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:481:12: INT
								{
								match(input,INT,FOLLOW_INT_in_attribute_call875); 
								}
								break;

						}

						match(input, Token.UP, null); 
					}

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:482:4: ^( OP_OUT ( INT )? )
					{
					match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call883); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:482:13: ( INT )?
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==INT) ) {
							alt26=1;
						}
						switch (alt26) {
							case 1 :
								// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:482:13: INT
								{
								match(input,INT,FOLLOW_INT_in_attribute_call885); 
								}
								break;

						}

						match(input, Token.UP, null); 
					}

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:483:4: OP_NAME
					{
					match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call892); 
					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:484:4: OP_NODES
					{
					match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call897); 
					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:485:4: OP_NAMES
					{
					match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call902); 
					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:487:4: OP_FST
					{
					match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call908); 
					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:488:4: OP_SND
					{
					match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call913); 
					}
					break;
				case 8 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:489:4: OP_TRD
					{
					match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call918); 
					}
					break;
				case 9 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:490:4: ID
					{
					match(input,ID,FOLLOW_ID_in_attribute_call923); 
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
	// $ANTLR end "attribute_call"



	// $ANTLR start "triple_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:494:1: triple_cons : ^( TRIPLE expression expression expression ) ;
	public final void triple_cons() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:495:2: ( ^( TRIPLE expression expression expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:495:4: ^( TRIPLE expression expression expression )
			{
			match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons938); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_triple_cons940);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_triple_cons942);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_triple_cons944);
			expression();
			state._fsp--;

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
	}
	// $ANTLR end "triple_cons"



	// $ANTLR start "pair_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:499:1: pair_cons : ^( PAIR expression expression ) ;
	public final void pair_cons() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:500:2: ( ^( PAIR expression expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:500:4: ^( PAIR expression expression )
			{
			match(input,PAIR,FOLLOW_PAIR_in_pair_cons961); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_pair_cons963);
			expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_pair_cons965);
			expression();
			state._fsp--;

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
	}
	// $ANTLR end "pair_cons"



	// $ANTLR start "set_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:505:1: set_cons : ^( SET ( expression )* ) ;
	public final void set_cons() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:506:2: ( ^( SET ( expression )* ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:506:4: ^( SET ( expression )* )
			{
			match(input,SET,FOLLOW_SET_in_set_cons983); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:506:10: ( expression )*
				loop28:
				while (true) {
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ID||LA28_0==OP_INTERSECTION||LA28_0==OP_MINUS||LA28_0==OP_PATH||(LA28_0 >= OP_UNION && LA28_0 <= OP_UPDATE)||LA28_0==ACCESS||LA28_0==PAIR||LA28_0==SET||LA28_0==TRIPLE) ) {
						alt28=1;
					}

					switch (alt28) {
					case 1 :
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:506:10: expression
						{
						pushFollow(FOLLOW_expression_in_set_cons985);
						expression();
						state._fsp--;

						}
						break;

					default :
						break loop28;
					}
				}

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
	}
	// $ANTLR end "set_cons"



	// $ANTLR start "applicaiton_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:520:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
	public final void applicaiton_def() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:521:2: ( ID list_reconfigurations ( trigger_def )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:521:4: ID list_reconfigurations ( trigger_def )?
			{
			match(input,ID,FOLLOW_ID_in_applicaiton_def1005); 
			pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1007);
			list_reconfigurations();
			state._fsp--;

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:521:29: ( trigger_def )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==SEP_BLOCK_START) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:521:29: trigger_def
					{
					pushFollow(FOLLOW_trigger_def_in_applicaiton_def1009);
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
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:524:1: list_reconfigurations : ( reconfiguration_call )+ ;
	public final void list_reconfigurations() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:525:2: ( ( reconfiguration_call )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:525:4: ( reconfiguration_call )+
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:525:4: ( reconfiguration_call )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:525:4: reconfiguration_call
					{
					pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1022);
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
	}
	// $ANTLR end "list_reconfigurations"



	// $ANTLR start "trigger_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:528:1: trigger_def : trigger_block ;
	public final void trigger_def() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:529:2: ( trigger_block )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:529:4: trigger_block
			{
			pushFollow(FOLLOW_trigger_block_in_trigger_def1035);
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
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:532:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
	public final void trigger_block() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:533:2: ( SEP_BLOCK_START SEP_BLOCK_END )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:533:4: SEP_BLOCK_START SEP_BLOCK_END
			{
			match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1047); 
			match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1049); 
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
		TinySymbol symbol;
		TinySymbolsTable scope;
	}
	protected Stack<main_def_scope> main_def_stack = new Stack<main_def_scope>();


	// $ANTLR start "main_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:539:1: main_def : ( main_args )? main_block ;
	public final void main_def() throws RecognitionException {
		main_def_stack.push(new main_def_scope());
		TreeRuleReturnScope main_block8 =null;


			main_def_stack.peek().symbol = new TinySymbol();
			main_def_stack.peek().scope = new TinySymbolsTable();
					
			for (String key : reclang_stack.peek().patterns.keySet()){
				//CPModelInternal -> Set<stoch_instances (String, CP2)> -> Set<String>
				Set<String> instances = reclang_stack.peek().patterns.get(key).getStochInstances().keySet();
				
				for(String instance : instances){
					//imported instances
					TinySymbol s = new TinySymbol();
					s.setId(instance);
					
					List<Type> datatype = new ArrayList<Type>();
					datatype.add( Type.PATTERN );
					s.setDataType(datatype);
					
					Type classtype = Type.ARG;
					s.setClassType(classtype);
					
					s.setLine(0);
					s.setPosition(0);
					
					if (!main_def_stack.peek().scope.containsSymbol(instance)){
						main_def_stack.peek().scope.addSymbol(s);
					}
				}
			}

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:573:2: ( ( main_args )? main_block )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:573:4: ( main_args )? main_block
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:573:4: ( main_args )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ARGUMENTS) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:573:4: main_args
					{
					pushFollow(FOLLOW_main_args_in_main_def1070);
					main_args();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_main_block_in_main_def1073);
			main_block8=main_block();
			state._fsp--;


					
					main_def_stack.peek().symbol.setId("$main");
					
					List<Type> datatype = new ArrayList<Type>();
					datatype.add( Type.NULL ); 	//main returns void
					main_def_stack.peek().symbol.setDataType(datatype);
					
					Type classtype = Type.MAIN; 	//Type.valueOf("MAIN")
					main_def_stack.peek().symbol.setClassType(classtype);
					
					main_def_stack.peek().symbol.setLine( (main_block8!=null?((CommonTree)main_block8.start):null).getLine() );
					main_def_stack.peek().symbol.setPosition( 0 );
					main_def_stack.peek().symbol.setFile( this.file_path ); //retriveResourceFromFilePath(this.file_path)
					
					List<TinySymbolsTable> scopes = new ArrayList<TinySymbolsTable>();
					scopes.add(main_def_stack.peek().scope);
					main_def_stack.peek().symbol.setScopes( scopes );
					
					//main_def_stack.peek().symbol.removeRepeatedIds();
							if(!ids_table.containsSymbol("$main")){
						ids_table.addSymbol(main_def_stack.peek().symbol);
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
	}
	// $ANTLR end "main_def"



	// $ANTLR start "main_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:600:1: main_args : ^( ARGUMENTS ( main_arg )+ ) ;
	public final void main_args() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:601:2: ( ^( ARGUMENTS ( main_arg )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:601:4: ^( ARGUMENTS ( main_arg )+ )
			{
			match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1088); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:601:16: ( main_arg )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:601:16: main_arg
					{
					pushFollow(FOLLOW_main_arg_in_main_args1090);
					main_arg();
					state._fsp--;

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
	// $ANTLR end "main_args"



	// $ANTLR start "main_arg"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:604:1: main_arg : ^( ARGUMENT ID ids[true] ) ;
	public final void main_arg() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:605:2: ( ^( ARGUMENT ID ids[true] ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:605:4: ^( ARGUMENT ID ids[true] )
			{
			match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1104); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_main_arg1106); 
			pushFollow(FOLLOW_ids_in_main_arg1108);
			ids(true);
			state._fsp--;

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
	}
	// $ANTLR end "main_arg"



	// $ANTLR start "ids"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:608:1: ids[boolean isArg] : ^( IDS ( ID )+ ) ;
	public final void ids(boolean isArg) throws RecognitionException {
		CommonTree ID9=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:609:2: ( ^( IDS ( ID )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:609:4: ^( IDS ( ID )+ )
			{
			match(input,IDS,FOLLOW_IDS_in_ids1124); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:609:10: ( ID )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:609:11: ID
					{
					ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_ids1127); 

							TinySymbol s = new TinySymbol();
							s.setId((ID9!=null?ID9.getText():null));
							
							List<Type> datatype = new ArrayList<Type>();
							datatype.add( Type.PATTERN );
							s.setDataType(datatype);
							
							Type classtype;
							if (isArg){ 
								classtype = Type.ARG;
							} else {
								classtype = Type.VAR;
							}
							s.setClassType(classtype);
							
							s.setLine((ID9!=null?ID9.getLine():0));
							s.setPosition((ID9!=null?ID9.getCharPositionInLine():0));
							
							if (!main_def_stack.peek().scope.containsSymbol((ID9!=null?ID9.getText():null))){
								main_def_stack.peek().scope.addSymbol(s);
							}
						
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
	// $ANTLR end "ids"


	public static class main_block_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "main_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:638:1: main_block : ^( INSTRUCTIONS ( main_instruction )+ ) ;
	public final RecTG.main_block_return main_block() throws RecognitionException {
		RecTG.main_block_return retval = new RecTG.main_block_return();
		retval.start = input.LT(1);

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:639:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:639:4: ^( INSTRUCTIONS ( main_instruction )+ )
			{
			match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1152); 
			match(input, Token.DOWN, null); 
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:639:19: ( main_instruction )+
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:639:19: main_instruction
					{
					pushFollow(FOLLOW_main_instruction_in_main_block1154);
					main_instruction();
					state._fsp--;

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
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:642:1: main_instruction : ( main_assignment | reconf_apply );
	public final void main_instruction() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:644:2: ( main_assignment | reconf_apply )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:644:4: main_assignment
					{
					pushFollow(FOLLOW_main_assignment_in_main_instruction1168);
					main_assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:645:4: reconf_apply
					{
					pushFollow(FOLLOW_reconf_apply_in_main_instruction1173);
					reconf_apply();
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
	}
	// $ANTLR end "main_instruction"



	// $ANTLR start "main_assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:652:1: main_assignment : ^( APPLICATION ^( DECLARATION dt= ID ids[false] ) ^( OP_APPLY ID reconfiguration_call ) ) ;
	public final void main_assignment() throws RecognitionException {
		CommonTree dt=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:653:2: ( ^( APPLICATION ^( DECLARATION dt= ID ids[false] ) ^( OP_APPLY ID reconfiguration_call ) ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:653:4: ^( APPLICATION ^( DECLARATION dt= ID ids[false] ) ^( OP_APPLY ID reconfiguration_call ) )
			{
			match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1190); 
			match(input, Token.DOWN, null); 
			match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1193); 
			match(input, Token.DOWN, null); 
			dt=(CommonTree)match(input,ID,FOLLOW_ID_in_main_assignment1197); 
			pushFollow(FOLLOW_ids_in_main_assignment1199);
			ids(false);
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1204); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_main_assignment1206); 
			pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1208);
			reconfiguration_call();
			state._fsp--;

			match(input, Token.UP, null); 

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
	}
	// $ANTLR end "main_assignment"



	// $ANTLR start "reconf_apply"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:656:1: reconf_apply : ^( OP_APPLY ID reconfiguration_call ) ;
	public final void reconf_apply() throws RecognitionException {
		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:657:2: ( ^( OP_APPLY ID reconfiguration_call ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecTG.g:657:4: ^( OP_APPLY ID reconfiguration_call )
			{
			match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconf_apply1224); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_reconf_apply1226); 
			pushFollow(FOLLOW_reconfiguration_call_in_reconf_apply1228);
			reconfiguration_call();
			state._fsp--;

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
	}
	// $ANTLR end "reconf_apply"

	// Delegated rules



	public static final BitSet FOLLOW_RECONFIGS_in_reclang62 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_directive_def_in_reclang64 = new BitSet(new long[]{0x0000000000000008L,0x0000000000424080L});
	public static final BitSet FOLLOW_content_in_reclang67 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_directive_import_in_directive_def92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPORT_in_directive_import106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_STRING_in_directive_import108 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_element_in_content128 = new BitSet(new long[]{0x0000000000000002L,0x0000000000420080L});
	public static final BitSet FOLLOW_main_in_content131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RECONFIGURATION_in_element145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_reconfiguration_def_in_element147 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_APPLICATION_in_element154 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_applicaiton_def_in_element156 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MAIN_in_main169 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_def_in_main171 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_def193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_args_def_in_reconfiguration_def202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def205 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGUMENTS_in_args_def228 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arg_def_in_args_def230 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_ARGUMENT_in_arg_def251 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_arg_def253 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_list_ids_in_arg_def255 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DT_PATTERN_in_datatype268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_CHANNEL_in_datatype275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NAME_in_datatype282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NODE_in_datatype289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_XOR_in_datatype297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_other_type_in_datatype309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subtype_in_datatype315 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DT_SET_in_other_type333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_PAIR_in_other_type343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_TRIPLE_in_other_type352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datatype_in_subtype365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_ids378 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block400 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_reconfiguration_block402 = new BitSet(new long[]{0x0000000000800008L,0x0000000000001C00L});
	public static final BitSet FOLLOW_declaration_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_instruction421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_instruction426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_instruction_in_instruction431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply449 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_apply451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARATION_in_declaration471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_declaration473 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000400L});
	public static final BitSet FOLLOW_var_def_in_declaration475 = new BitSet(new long[]{0x0000000000100008L,0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_var_def489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_var_def497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGNMENT_in_assignment516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignment518 = new BitSet(new long[]{0x0000608280900000L,0x0000000008900040L});
	public static final BitSet FOLLOW_assignment_member_in_assignment527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_assignment_member542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call561 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call570 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call572 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call581 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call608 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_call615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call617 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call633 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_structure_operation_call635 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_operation_args_in_structure_operation_call644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_args_in_operation_args659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_args672 = new BitSet(new long[]{0x0000608280100002L,0x0000000008900040L});
	public static final BitSet FOLLOW_FORALL_in_for_instruction695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_datatype_in_for_instruction697 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_for_instruction701 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_for_instruction711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction713 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_UNION_in_expression734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression736 = new BitSet(new long[]{0x0000408000100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_INTERSECTION_in_expression745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression747 = new BitSet(new long[]{0x0000408000100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression749 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_MINUS_in_expression756 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_factor_in_expression758 = new BitSet(new long[]{0x0000408000100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_factor_in_expression760 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_factor_in_expression766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_factor780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_factor786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_factor791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructor_in_factor796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_in_operation809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_operation811 = new BitSet(new long[]{0x0000143C50100000L,0x0000000002000000L});
	public static final BitSet FOLLOW_STRUCTURE_in_operation815 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_operation817 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_attribute_call_in_operation822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_structure_operation_call_in_operation829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triple_cons_in_constructor841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pair_cons_in_constructor846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_cons_in_constructor851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_IN_in_attribute_call873 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_attribute_call875 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_OUT_in_attribute_call883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_attribute_call885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_NAME_in_attribute_call892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NODES_in_attribute_call897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NAMES_in_attribute_call902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_FST_in_attribute_call908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_SND_in_attribute_call913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_TRD_in_attribute_call918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attribute_call923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIPLE_in_triple_cons938 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_triple_cons940 = new BitSet(new long[]{0x0000608280100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_triple_cons942 = new BitSet(new long[]{0x0000608280100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_triple_cons944 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PAIR_in_pair_cons961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_pair_cons963 = new BitSet(new long[]{0x0000608280100000L,0x0000000008900040L});
	public static final BitSet FOLLOW_expression_in_pair_cons965 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SET_in_set_cons983 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_set_cons985 = new BitSet(new long[]{0x0000608280100008L,0x0000000008900040L});
	public static final BitSet FOLLOW_ID_in_applicaiton_def1005 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1007 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1022 = new BitSet(new long[]{0x00000A4122100002L});
	public static final BitSet FOLLOW_trigger_block_in_trigger_def1035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1047 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_args_in_main_def1070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_main_block_in_main_def1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARGUMENTS_in_main_args1088 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_arg_in_main_args1090 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000100L});
	public static final BitSet FOLLOW_ARGUMENT_in_main_arg1104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_arg1106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ids_in_main_arg1108 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDS_in_ids1124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ids1127 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1152 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_main_instruction_in_main_block1154 = new BitSet(new long[]{0x0000000000800008L,0x0000000000000080L});
	public static final BitSet FOLLOW_main_assignment_in_main_instruction1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconf_apply_in_main_instruction1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APPLICATION_in_main_assignment1190 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DECLARATION_in_main_assignment1193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_assignment1197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ids_in_main_assignment1199 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_main_assignment1206 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1208 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OP_APPLY_in_reconf_apply1224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_reconf_apply1226 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_reconf_apply1228 = new BitSet(new long[]{0x0000000000000008L});
}
