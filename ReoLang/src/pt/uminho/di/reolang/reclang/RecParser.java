// $ANTLR 3.5.1 /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g 2014-08-12 16:25:26

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.ReoLangLexer;
	import pt.uminho.di.reolang.ReoLangParser;	
	import pt.uminho.di.reolang.reclang.Constants;
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.ErrorType;
	import java.io.File;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class RecParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RecParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return RecParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g"; }


		private String file_path;
		private ArrayList<Error> syntax_errors = new ArrayList<Error>();
		
		@Override
		public void emitErrorMessage(String msg) {
	        	syntax_errors.add(Error.report(ErrorType.ERROR, msg, file_path));
		}
		
		//Notice the access to the errors of the imported grammars
		public ArrayList<Error> getErrors() {
			return this.syntax_errors;
		}
		
		public void setFilePath(String file) {
			this.file_path = file;
		}


	public static class reclang_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reclang"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:68:1: reclang : ( directive_def )* content -> ^( RECONFIGS ( directive_def )* content ) ;
	public final RecParser.reclang_return reclang() throws RecognitionException {
		RecParser.reclang_return retval = new RecParser.reclang_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope directive_def1 =null;
		ParserRuleReturnScope content2 =null;

		RewriteRuleSubtreeStream stream_content=new RewriteRuleSubtreeStream(adaptor,"rule content");
		RewriteRuleSubtreeStream stream_directive_def=new RewriteRuleSubtreeStream(adaptor,"rule directive_def");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:69:2: ( ( directive_def )* content -> ^( RECONFIGS ( directive_def )* content ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:69:5: ( directive_def )* content
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:69:5: ( directive_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==RW_IMPORT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:69:5: directive_def
					{
					pushFollow(FOLLOW_directive_def_in_reclang144);
					directive_def1=directive_def();
					state._fsp--;

					stream_directive_def.add(directive_def1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_content_in_reclang147);
			content2=content();
			state._fsp--;

			stream_content.add(content2.getTree());
			// AST REWRITE
			// elements: content, directive_def
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 70:3: -> ^( RECONFIGS ( directive_def )* content )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:70:6: ^( RECONFIGS ( directive_def )* content )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECONFIGS, "RECONFIGS"), root_1);
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:70:18: ( directive_def )*
				while ( stream_directive_def.hasNext() ) {
					adaptor.addChild(root_1, stream_directive_def.nextTree());
				}
				stream_directive_def.reset();

				adaptor.addChild(root_1, stream_content.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reclang"


	public static class directive_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "directive_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:76:1: directive_def : directive_import -> directive_import ;
	public final RecParser.directive_def_return directive_def() throws RecognitionException {
		RecParser.directive_def_return retval = new RecParser.directive_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope directive_import3 =null;

		RewriteRuleSubtreeStream stream_directive_import=new RewriteRuleSubtreeStream(adaptor,"rule directive_import");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:77:2: ( directive_import -> directive_import )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:77:4: directive_import
			{
			pushFollow(FOLLOW_directive_import_in_directive_def174);
			directive_import3=directive_import();
			state._fsp--;

			stream_directive_import.add(directive_import3.getTree());
			// AST REWRITE
			// elements: directive_import
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:3: -> directive_import
			{
				adaptor.addChild(root_0, stream_directive_import.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "directive_def"


	public static class directive_import_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "directive_import"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:82:1: directive_import : RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) ;
	public final RecParser.directive_import_return directive_import() throws RecognitionException {
		RecParser.directive_import_return retval = new RecParser.directive_import_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RW_IMPORT4=null;
		Token STRING5=null;
		Token SEP_SEMICOLON6=null;

		Object RW_IMPORT4_tree=null;
		Object STRING5_tree=null;
		Object SEP_SEMICOLON6_tree=null;
		RewriteRuleTokenStream stream_RW_IMPORT=new RewriteRuleTokenStream(adaptor,"token RW_IMPORT");
		RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:83:2: ( RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:83:4: RW_IMPORT STRING SEP_SEMICOLON
			{
			RW_IMPORT4=(Token)match(input,RW_IMPORT,FOLLOW_RW_IMPORT_in_directive_import194);  
			stream_RW_IMPORT.add(RW_IMPORT4);

			STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_directive_import196);  
			stream_STRING.add(STRING5);


					String file_name = (STRING5!=null?STRING5.getText():null);
					String file = file_name.substring(1, file_name.length()-1); //remove " from string
					
				    	File f = new File( file );
				    	if( f.exists() ){
						String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
						
						if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {	//rpla
							ReCooPLaProcessor p = new ReCooPLaProcessor(file, "");
							ArrayList<Error> imported_syntax_errors = p.getSyntaxErrors();
							if ( !imported_syntax_errors.isEmpty() ){
								this.syntax_errors.addAll( imported_syntax_errors );
							}
						}
						else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//if is a CooPLa file
							ReoLangParser.reolang_return final_result = null;
							try{
								CharStream stream = new ANTLRFileStream(file, "UTF8");
								//LEXER
								ReoLangLexer lex = new ReoLangLexer(stream);
								CommonTokenStream tokens = new CommonTokenStream(lex);
						        	//PARSER
								ReoLangParser parser = new ReoLangParser(tokens);
								parser.setFilePath(file);
								final_result = parser.reolang();
								//this.setErrors(parser.getErrors());
								if ( !parser.getErrors().isEmpty() ){
									this.syntax_errors.addAll( parser.getErrors() );
								}
								/*
								for (Error e : parser.getErrors()){
									this.syntax_errors.add( SimpleError.report(ErrorType.ERROR, e.getMessage(), e.getLine(), e.getPosition()) );
								}
								*/
							}
							catch(Throwable t){
								System.out.println("exception: " + t);
							        System.out.println(Error.report(ErrorType.WARNING, "See Console for more details...", 0, this.file_path));
								t.printStackTrace();
							}
						}
						else {
							//emit error -> import file invalid
						}
					}
				
			SEP_SEMICOLON6=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_directive_import202);  
			stream_SEP_SEMICOLON.add(SEP_SEMICOLON6);

			// AST REWRITE
			// elements: STRING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 133:3: -> ^( IMPORT STRING )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:133:6: ^( IMPORT STRING )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPORT, "IMPORT"), root_1);
				adaptor.addChild(root_1, stream_STRING.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "directive_import"


	public static class content_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "content"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:139:1: content : ( element )* ( main )? ;
	public final RecParser.content_return content() throws RecognitionException {
		RecParser.content_return retval = new RecParser.content_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope element7 =null;
		ParserRuleReturnScope main8 =null;


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:140:2: ( ( element )* ( main )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:140:5: ( element )* ( main )?
			{
			root_0 = (Object)adaptor.nil();


			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:140:5: ( element )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||LA2_0==RW_RECONFIGURATION) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:140:5: element
					{
					pushFollow(FOLLOW_element_in_content231);
					element7=element();
					state._fsp--;

					adaptor.addChild(root_0, element7.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:140:14: ( main )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==RW_MAIN) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:140:14: main
					{
					pushFollow(FOLLOW_main_in_content234);
					main8=main();
					state._fsp--;

					adaptor.addChild(root_0, main8.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "content"


	public static class element_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "element"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:144:1: element : ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) );
	public final RecParser.element_return element() throws RecognitionException {
		RecParser.element_return retval = new RecParser.element_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope reconfiguration_def9 =null;
		ParserRuleReturnScope applicaiton_def10 =null;

		RewriteRuleSubtreeStream stream_reconfiguration_def=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_def");
		RewriteRuleSubtreeStream stream_applicaiton_def=new RewriteRuleSubtreeStream(adaptor,"rule applicaiton_def");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:145:2: ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RW_RECONFIGURATION) ) {
				alt4=1;
			}
			else if ( (LA4_0==ID) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:145:4: reconfiguration_def
					{
					pushFollow(FOLLOW_reconfiguration_def_in_element249);
					reconfiguration_def9=reconfiguration_def();
					state._fsp--;

					stream_reconfiguration_def.add(reconfiguration_def9.getTree());
					// AST REWRITE
					// elements: reconfiguration_def
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 145:24: -> ^( RECONFIGURATION reconfiguration_def )
					{
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:145:27: ^( RECONFIGURATION reconfiguration_def )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECONFIGURATION, "RECONFIGURATION"), root_1);
						adaptor.addChild(root_1, stream_reconfiguration_def.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:146:4: applicaiton_def
					{
					pushFollow(FOLLOW_applicaiton_def_in_element262);
					applicaiton_def10=applicaiton_def();
					state._fsp--;

					stream_applicaiton_def.add(applicaiton_def10.getTree());
					// AST REWRITE
					// elements: applicaiton_def
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 146:21: -> ^( APPLICATION applicaiton_def )
					{
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:146:24: ^( APPLICATION applicaiton_def )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPLICATION, "APPLICATION"), root_1);
						adaptor.addChild(root_1, stream_applicaiton_def.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element"


	public static class main_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:150:1: main : main_def -> ^( MAIN main_def ) ;
	public final RecParser.main_return main() throws RecognitionException {
		RecParser.main_return retval = new RecParser.main_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope main_def11 =null;

		RewriteRuleSubtreeStream stream_main_def=new RewriteRuleSubtreeStream(adaptor,"rule main_def");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:151:2: ( main_def -> ^( MAIN main_def ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:151:4: main_def
			{
			pushFollow(FOLLOW_main_def_in_main284);
			main_def11=main_def();
			state._fsp--;

			stream_main_def.add(main_def11.getTree());
			// AST REWRITE
			// elements: main_def
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 151:14: -> ^( MAIN main_def )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:151:17: ^( MAIN main_def )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAIN, "MAIN"), root_1);
				adaptor.addChild(root_1, stream_main_def.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main"


	public static class reconfiguration_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reconfiguration_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:156:1: reconfiguration_def : RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) ;
	public final RecParser.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
		RecParser.reconfiguration_def_return retval = new RecParser.reconfiguration_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RW_RECONFIGURATION12=null;
		Token ID13=null;
		Token SEP_ARGS_START14=null;
		Token SEP_ARGS_END16=null;
		ParserRuleReturnScope args_def15 =null;
		ParserRuleReturnScope reconfiguration_block17 =null;

		Object RW_RECONFIGURATION12_tree=null;
		Object ID13_tree=null;
		Object SEP_ARGS_START14_tree=null;
		Object SEP_ARGS_END16_tree=null;
		RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
		RewriteRuleTokenStream stream_RW_RECONFIGURATION=new RewriteRuleTokenStream(adaptor,"token RW_RECONFIGURATION");
		RewriteRuleSubtreeStream stream_reconfiguration_block=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_block");
		RewriteRuleSubtreeStream stream_args_def=new RewriteRuleSubtreeStream(adaptor,"rule args_def");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:157:2: ( RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:157:4: RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block
			{
			RW_RECONFIGURATION12=(Token)match(input,RW_RECONFIGURATION,FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def306);  
			stream_RW_RECONFIGURATION.add(RW_RECONFIGURATION12);

			ID13=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_def308);  
			stream_ID.add(ID13);

			SEP_ARGS_START14=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_reconfiguration_def310);  
			stream_SEP_ARGS_START.add(SEP_ARGS_START14);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:157:41: ( args_def )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= DT_CHANNEL && LA5_0 <= DT_XOR)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:157:41: args_def
					{
					pushFollow(FOLLOW_args_def_in_reconfiguration_def312);
					args_def15=args_def();
					state._fsp--;

					stream_args_def.add(args_def15.getTree());
					}
					break;

			}

			SEP_ARGS_END16=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_reconfiguration_def315);  
			stream_SEP_ARGS_END.add(SEP_ARGS_END16);

			pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def317);
			reconfiguration_block17=reconfiguration_block();
			state._fsp--;

			stream_reconfiguration_block.add(reconfiguration_block17.getTree());
			// AST REWRITE
			// elements: reconfiguration_block, args_def, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 158:3: -> ^( ID ( args_def )? reconfiguration_block )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:158:6: ^( ID ( args_def )? reconfiguration_block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:158:11: ( args_def )?
				if ( stream_args_def.hasNext() ) {
					adaptor.addChild(root_1, stream_args_def.nextTree());
				}
				stream_args_def.reset();

				adaptor.addChild(root_1, stream_reconfiguration_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_def"


	public static class args_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "args_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:161:1: args_def : arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) ;
	public final RecParser.args_def_return args_def() throws RecognitionException {
		RecParser.args_def_return retval = new RecParser.args_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_SEMICOLON19=null;
		ParserRuleReturnScope arg_def18 =null;
		ParserRuleReturnScope arg_def20 =null;

		Object SEP_SEMICOLON19_tree=null;
		RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
		RewriteRuleSubtreeStream stream_arg_def=new RewriteRuleSubtreeStream(adaptor,"rule arg_def");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:162:2: ( arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:162:4: arg_def ( SEP_SEMICOLON arg_def )*
			{
			pushFollow(FOLLOW_arg_def_in_args_def342);
			arg_def18=arg_def();
			state._fsp--;

			stream_arg_def.add(arg_def18.getTree());
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:162:12: ( SEP_SEMICOLON arg_def )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==SEP_SEMICOLON) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:162:13: SEP_SEMICOLON arg_def
					{
					SEP_SEMICOLON19=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_args_def345);  
					stream_SEP_SEMICOLON.add(SEP_SEMICOLON19);

					pushFollow(FOLLOW_arg_def_in_args_def347);
					arg_def20=arg_def();
					state._fsp--;

					stream_arg_def.add(arg_def20.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: arg_def
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 163:3: -> ^( ARGUMENTS ( arg_def )+ )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:163:6: ^( ARGUMENTS ( arg_def )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				if ( !(stream_arg_def.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_arg_def.hasNext() ) {
					adaptor.addChild(root_1, stream_arg_def.nextTree());
				}
				stream_arg_def.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "args_def"


	public static class arg_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arg_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:166:1: arg_def : datatype list_ids -> ^( ARGUMENT datatype list_ids ) ;
	public final RecParser.arg_def_return arg_def() throws RecognitionException {
		RecParser.arg_def_return retval = new RecParser.arg_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope datatype21 =null;
		ParserRuleReturnScope list_ids22 =null;

		RewriteRuleSubtreeStream stream_list_ids=new RewriteRuleSubtreeStream(adaptor,"rule list_ids");
		RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:167:2: ( datatype list_ids -> ^( ARGUMENT datatype list_ids ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:167:5: datatype list_ids
			{
			pushFollow(FOLLOW_datatype_in_arg_def373);
			datatype21=datatype();
			state._fsp--;

			stream_datatype.add(datatype21.getTree());
			pushFollow(FOLLOW_list_ids_in_arg_def375);
			list_ids22=list_ids();
			state._fsp--;

			stream_list_ids.add(list_ids22.getTree());
			// AST REWRITE
			// elements: list_ids, datatype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 168:3: -> ^( ARGUMENT datatype list_ids )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:168:6: ^( ARGUMENT datatype list_ids )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);
				adaptor.addChild(root_1, stream_datatype.nextTree());
				adaptor.addChild(root_1, stream_list_ids.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arg_def"


	public static class datatype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "datatype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:171:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END -> ^( other_type subtype ) );
	public final RecParser.datatype_return datatype() throws RecognitionException {
		RecParser.datatype_return retval = new RecParser.datatype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DT_PATTERN23=null;
		Token DT_CHANNEL24=null;
		Token DT_NAME25=null;
		Token DT_NODE26=null;
		Token DT_XOR27=null;
		Token SEP_SUBTYPE_START29=null;
		Token SEP_SUBTYPE_END31=null;
		ParserRuleReturnScope other_type28 =null;
		ParserRuleReturnScope subtype30 =null;

		Object DT_PATTERN23_tree=null;
		Object DT_CHANNEL24_tree=null;
		Object DT_NAME25_tree=null;
		Object DT_NODE26_tree=null;
		Object DT_XOR27_tree=null;
		Object SEP_SUBTYPE_START29_tree=null;
		Object SEP_SUBTYPE_END31_tree=null;
		RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
		RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");
		RewriteRuleSubtreeStream stream_subtype=new RewriteRuleSubtreeStream(adaptor,"rule subtype");
		RewriteRuleSubtreeStream stream_other_type=new RewriteRuleSubtreeStream(adaptor,"rule other_type");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:172:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END -> ^( other_type subtype ) )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:172:5: DT_PATTERN
					{
					root_0 = (Object)adaptor.nil();


					DT_PATTERN23=(Token)match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype400); 
					DT_PATTERN23_tree = (Object)adaptor.create(DT_PATTERN23);
					adaptor.addChild(root_0, DT_PATTERN23_tree);

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:173:5: DT_CHANNEL
					{
					root_0 = (Object)adaptor.nil();


					DT_CHANNEL24=(Token)match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype407); 
					DT_CHANNEL24_tree = (Object)adaptor.create(DT_CHANNEL24);
					adaptor.addChild(root_0, DT_CHANNEL24_tree);

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:174:4: DT_NAME
					{
					root_0 = (Object)adaptor.nil();


					DT_NAME25=(Token)match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype412); 
					DT_NAME25_tree = (Object)adaptor.create(DT_NAME25);
					adaptor.addChild(root_0, DT_NAME25_tree);

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:175:4: DT_NODE
					{
					root_0 = (Object)adaptor.nil();


					DT_NODE26=(Token)match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype417); 
					DT_NODE26_tree = (Object)adaptor.create(DT_NODE26);
					adaptor.addChild(root_0, DT_NODE26_tree);

					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:176:4: DT_XOR
					{
					root_0 = (Object)adaptor.nil();


					DT_XOR27=(Token)match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype422); 
					DT_XOR27_tree = (Object)adaptor.create(DT_XOR27);
					adaptor.addChild(root_0, DT_XOR27_tree);

					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:177:4: other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END
					{
					pushFollow(FOLLOW_other_type_in_datatype427);
					other_type28=other_type();
					state._fsp--;

					stream_other_type.add(other_type28.getTree());
					SEP_SUBTYPE_START29=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_datatype429);  
					stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START29);

					pushFollow(FOLLOW_subtype_in_datatype431);
					subtype30=subtype();
					state._fsp--;

					stream_subtype.add(subtype30.getTree());
					SEP_SUBTYPE_END31=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_datatype433);  
					stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END31);

					// AST REWRITE
					// elements: subtype, other_type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 177:57: -> ^( other_type subtype )
					{
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:177:60: ^( other_type subtype )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_other_type.nextNode(), root_1);
						adaptor.addChild(root_1, stream_subtype.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "datatype"


	public static class other_type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "other_type"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:180:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
	public final RecParser.other_type_return other_type() throws RecognitionException {
		RecParser.other_type_return retval = new RecParser.other_type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set32=null;

		Object set32_tree=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:181:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set32=input.LT(1);
			if ( input.LA(1)==DT_PAIR||(input.LA(1) >= DT_SET && input.LA(1) <= DT_TRIPLE) ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set32));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "other_type"


	public static class subtype_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subtype"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:184:1: subtype : datatype ;
	public final RecParser.subtype_return subtype() throws RecognitionException {
		RecParser.subtype_return retval = new RecParser.subtype_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope datatype33 =null;


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:185:2: ( datatype )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:185:4: datatype
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_datatype_in_subtype473);
			datatype33=datatype();
			state._fsp--;

			adaptor.addChild(root_0, datatype33.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subtype"


	public static class list_ids_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list_ids"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:188:1: list_ids : ID ( SEP_COMMA ID )* -> ( ID )+ ;
	public final RecParser.list_ids_return list_ids() throws RecognitionException {
		RecParser.list_ids_return retval = new RecParser.list_ids_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID34=null;
		Token SEP_COMMA35=null;
		Token ID36=null;

		Object ID34_tree=null;
		Object SEP_COMMA35_tree=null;
		Object ID36_tree=null;
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:189:2: ( ID ( SEP_COMMA ID )* -> ( ID )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:189:4: ID ( SEP_COMMA ID )*
			{
			ID34=(Token)match(input,ID,FOLLOW_ID_in_list_ids486);  
			stream_ID.add(ID34);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:189:7: ( SEP_COMMA ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==SEP_COMMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:189:8: SEP_COMMA ID
					{
					SEP_COMMA35=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_ids489);  
					stream_SEP_COMMA.add(SEP_COMMA35);

					ID36=(Token)match(input,ID,FOLLOW_ID_in_list_ids491);  
					stream_ID.add(ID36);

					}
					break;

				default :
					break loop8;
				}
			}

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 189:23: -> ( ID )+
			{
				if ( !(stream_ID.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_0, stream_ID.nextNode());
				}
				stream_ID.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_ids"


	public static class reconfiguration_block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reconfiguration_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:193:1: reconfiguration_block : SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) ;
	public final RecParser.reconfiguration_block_return reconfiguration_block() throws RecognitionException {
		RecParser.reconfiguration_block_return retval = new RecParser.reconfiguration_block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_BLOCK_START37=null;
		Token SEP_BLOCK_END39=null;
		ParserRuleReturnScope instruction38 =null;

		Object SEP_BLOCK_START37_tree=null;
		Object SEP_BLOCK_END39_tree=null;
		RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
		RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
		RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:194:2: ( SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:194:4: SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END
			{
			SEP_BLOCK_START37=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_reconfiguration_block513);  
			stream_SEP_BLOCK_START.add(SEP_BLOCK_START37);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:194:20: ( instruction )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= DT_CHANNEL && LA9_0 <= DT_XOR)||LA9_0==ID||LA9_0==OP_APPLY||LA9_0==RW_FORALL) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:194:20: instruction
					{
					pushFollow(FOLLOW_instruction_in_reconfiguration_block515);
					instruction38=instruction();
					state._fsp--;

					stream_instruction.add(instruction38.getTree());
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			SEP_BLOCK_END39=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_reconfiguration_block518);  
			stream_SEP_BLOCK_END.add(SEP_BLOCK_END39);

			// AST REWRITE
			// elements: instruction, instruction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 195:3: -> ^( INSTRUCTIONS instruction ( instruction )* )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:195:6: ^( INSTRUCTIONS instruction ( instruction )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTIONS, "INSTRUCTIONS"), root_1);
				adaptor.addChild(root_1, stream_instruction.nextTree());
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:195:33: ( instruction )*
				while ( stream_instruction.hasNext() ) {
					adaptor.addChild(root_1, stream_instruction.nextTree());
				}
				stream_instruction.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_block"


	public static class instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:198:1: instruction : ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction );
	public final RecParser.instruction_return instruction() throws RecognitionException {
		RecParser.instruction_return retval = new RecParser.instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_SEMICOLON41=null;
		Token SEP_SEMICOLON43=null;
		Token SEP_SEMICOLON45=null;
		ParserRuleReturnScope declaration40 =null;
		ParserRuleReturnScope assignment42 =null;
		ParserRuleReturnScope reconfiguration_apply44 =null;
		ParserRuleReturnScope for_instruction46 =null;

		Object SEP_SEMICOLON41_tree=null;
		Object SEP_SEMICOLON43_tree=null;
		Object SEP_SEMICOLON45_tree=null;
		RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
		RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
		RewriteRuleSubtreeStream stream_for_instruction=new RewriteRuleSubtreeStream(adaptor,"rule for_instruction");
		RewriteRuleSubtreeStream stream_reconfiguration_apply=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_apply");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:199:2: ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction )
			int alt10=4;
			switch ( input.LA(1) ) {
			case DT_CHANNEL:
			case DT_NAME:
			case DT_NODE:
			case DT_PAIR:
			case DT_PATTERN:
			case DT_SET:
			case DT_TRIPLE:
			case DT_XOR:
				{
				alt10=1;
				}
				break;
			case ID:
				{
				int LA10_2 = input.LA(2);
				if ( (LA10_2==OP_EQUAL) ) {
					alt10=2;
				}
				else if ( (LA10_2==OP_APPLY) ) {
					alt10=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OP_APPLY:
				{
				alt10=3;
				}
				break;
			case RW_FORALL:
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:199:4: declaration SEP_SEMICOLON
					{
					pushFollow(FOLLOW_declaration_in_instruction546);
					declaration40=declaration();
					state._fsp--;

					stream_declaration.add(declaration40.getTree());
					SEP_SEMICOLON41=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction548);  
					stream_SEP_SEMICOLON.add(SEP_SEMICOLON41);

					// AST REWRITE
					// elements: declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 199:32: -> declaration
					{
						adaptor.addChild(root_0, stream_declaration.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:200:4: assignment SEP_SEMICOLON
					{
					pushFollow(FOLLOW_assignment_in_instruction559);
					assignment42=assignment();
					state._fsp--;

					stream_assignment.add(assignment42.getTree());
					SEP_SEMICOLON43=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction561);  
					stream_SEP_SEMICOLON.add(SEP_SEMICOLON43);

					// AST REWRITE
					// elements: assignment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 200:30: -> assignment
					{
						adaptor.addChild(root_0, stream_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:201:4: reconfiguration_apply SEP_SEMICOLON
					{
					pushFollow(FOLLOW_reconfiguration_apply_in_instruction571);
					reconfiguration_apply44=reconfiguration_apply();
					state._fsp--;

					stream_reconfiguration_apply.add(reconfiguration_apply44.getTree());
					SEP_SEMICOLON45=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction573);  
					stream_SEP_SEMICOLON.add(SEP_SEMICOLON45);

					// AST REWRITE
					// elements: reconfiguration_apply
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 201:40: -> reconfiguration_apply
					{
						adaptor.addChild(root_0, stream_reconfiguration_apply.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:202:4: for_instruction
					{
					pushFollow(FOLLOW_for_instruction_in_instruction582);
					for_instruction46=for_instruction();
					state._fsp--;

					stream_for_instruction.add(for_instruction46.getTree());
					// AST REWRITE
					// elements: for_instruction
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 202:23: -> for_instruction
					{
						adaptor.addChild(root_0, stream_for_instruction.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class reconfiguration_apply_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reconfiguration_apply"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:205:1: reconfiguration_apply : ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) ;
	public final RecParser.reconfiguration_apply_return reconfiguration_apply() throws RecognitionException {
		RecParser.reconfiguration_apply_return retval = new RecParser.reconfiguration_apply_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID47=null;
		Token OP_APPLY48=null;
		ParserRuleReturnScope reconfiguration_call49 =null;

		Object ID47_tree=null;
		Object OP_APPLY48_tree=null;
		RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:206:2: ( ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:206:4: ( ID )? OP_APPLY reconfiguration_call
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:206:4: ( ID )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:206:4: ID
					{
					ID47=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_apply601);  
					stream_ID.add(ID47);

					}
					break;

			}

			OP_APPLY48=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply604);  
			stream_OP_APPLY.add(OP_APPLY48);

			pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply606);
			reconfiguration_call49=reconfiguration_call();
			state._fsp--;

			stream_reconfiguration_call.add(reconfiguration_call49.getTree());
			// AST REWRITE
			// elements: OP_APPLY, reconfiguration_call, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 206:38: -> ^( OP_APPLY reconfiguration_call ( ID )? )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:206:41: ^( OP_APPLY reconfiguration_call ( ID )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_OP_APPLY.nextNode(), root_1);
				adaptor.addChild(root_1, stream_reconfiguration_call.nextTree());
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:206:73: ( ID )?
				if ( stream_ID.hasNext() ) {
					adaptor.addChild(root_1, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_apply"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:209:1: declaration : datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) ;
	public final RecParser.declaration_return declaration() throws RecognitionException {
		RecParser.declaration_return retval = new RecParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_COMMA52=null;
		ParserRuleReturnScope datatype50 =null;
		ParserRuleReturnScope var_def51 =null;
		ParserRuleReturnScope var_def53 =null;

		Object SEP_COMMA52_tree=null;
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleSubtreeStream stream_var_def=new RewriteRuleSubtreeStream(adaptor,"rule var_def");
		RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:210:2: ( datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:210:4: datatype var_def ( SEP_COMMA var_def )*
			{
			pushFollow(FOLLOW_datatype_in_declaration630);
			datatype50=datatype();
			state._fsp--;

			stream_datatype.add(datatype50.getTree());
			pushFollow(FOLLOW_var_def_in_declaration632);
			var_def51=var_def();
			state._fsp--;

			stream_var_def.add(var_def51.getTree());
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:210:21: ( SEP_COMMA var_def )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==SEP_COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:210:22: SEP_COMMA var_def
					{
					SEP_COMMA52=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_declaration635);  
					stream_SEP_COMMA.add(SEP_COMMA52);

					pushFollow(FOLLOW_var_def_in_declaration637);
					var_def53=var_def();
					state._fsp--;

					stream_var_def.add(var_def53.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			// AST REWRITE
			// elements: var_def, datatype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 210:42: -> ^( DECLARATION datatype ( var_def )+ )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:210:45: ^( DECLARATION datatype ( var_def )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION, "DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_datatype.nextTree());
				if ( !(stream_var_def.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_var_def.hasNext() ) {
					adaptor.addChild(root_1, stream_var_def.nextTree());
				}
				stream_var_def.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class var_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:213:1: var_def : ( ID | assignment );
	public final RecParser.var_def_return var_def() throws RecognitionException {
		RecParser.var_def_return retval = new RecParser.var_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID54=null;
		ParserRuleReturnScope assignment55 =null;

		Object ID54_tree=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:214:2: ( ID | assignment )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==ID) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==OP_EQUAL) ) {
					alt13=2;
				}
				else if ( (LA13_1==SEP_COMMA||LA13_1==SEP_SEMICOLON) ) {
					alt13=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:214:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID54=(Token)match(input,ID,FOLLOW_ID_in_var_def662); 
					ID54_tree = (Object)adaptor.create(ID54);
					adaptor.addChild(root_0, ID54_tree);

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:215:4: assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_var_def667);
					assignment55=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment55.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_def"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:218:1: assignment : ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) ;
	public final RecParser.assignment_return assignment() throws RecognitionException {
		RecParser.assignment_return retval = new RecParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID56=null;
		Token OP_EQUAL57=null;
		ParserRuleReturnScope assignment_member58 =null;

		Object ID56_tree=null;
		Object OP_EQUAL57_tree=null;
		RewriteRuleTokenStream stream_OP_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_EQUAL");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_assignment_member=new RewriteRuleSubtreeStream(adaptor,"rule assignment_member");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:219:2: ( ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:219:4: ID OP_EQUAL assignment_member
			{
			ID56=(Token)match(input,ID,FOLLOW_ID_in_assignment680);  
			stream_ID.add(ID56);

			OP_EQUAL57=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_assignment682);  
			stream_OP_EQUAL.add(OP_EQUAL57);

			pushFollow(FOLLOW_assignment_member_in_assignment684);
			assignment_member58=assignment_member();
			state._fsp--;

			stream_assignment_member.add(assignment_member58.getTree());
			// AST REWRITE
			// elements: assignment_member, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 219:36: -> ^( ASSIGNMENT ID assignment_member )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:219:39: ^( ASSIGNMENT ID assignment_member )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_assignment_member.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class assignment_member_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment_member"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:222:1: assignment_member : ( expression | reconfiguration_apply );
	public final RecParser.assignment_member_return assignment_member() throws RecognitionException {
		RecParser.assignment_member_return retval = new RecParser.assignment_member_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression59 =null;
		ParserRuleReturnScope reconfiguration_apply60 =null;


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:223:2: ( expression | reconfiguration_apply )
			int alt14=2;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA14_1 = input.LA(2);
				if ( (LA14_1==OP_INTERSECTION||LA14_1==OP_MINUS||LA14_1==OP_UNION||LA14_1==SEP_ACCESSOR||LA14_1==SEP_COMMA||(LA14_1 >= SEP_SEMICOLON && LA14_1 <= SEP_STRUCTURE)||LA14_1==SEP_SUBTYPE_START) ) {
					alt14=1;
				}
				else if ( (LA14_1==OP_APPLY) ) {
					alt14=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CONS_PAIR:
			case CONS_SET:
			case CONS_TRIPLE:
			case OP_PATH:
			case OP_UPDATE:
				{
				alt14=1;
				}
				break;
			case OP_APPLY:
				{
				alt14=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:223:4: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assignment_member710);
					expression59=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression59.getTree());

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:224:4: reconfiguration_apply
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member716);
					reconfiguration_apply60=reconfiguration_apply();
					state._fsp--;

					adaptor.addChild(root_0, reconfiguration_apply60.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_member"


	public static class reconfiguration_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reconfiguration_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:227:1: reconfiguration_call : ( OP_JOIN ^| OP_SPLIT ^| OP_PAR ^| OP_REMOVE ^| OP_CONST ^| OP_ID ^| ID ^) operation_args ;
	public final RecParser.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
		RecParser.reconfiguration_call_return retval = new RecParser.reconfiguration_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OP_JOIN61=null;
		Token OP_SPLIT62=null;
		Token OP_PAR63=null;
		Token OP_REMOVE64=null;
		Token OP_CONST65=null;
		Token OP_ID66=null;
		Token ID67=null;
		ParserRuleReturnScope operation_args68 =null;

		Object OP_JOIN61_tree=null;
		Object OP_SPLIT62_tree=null;
		Object OP_PAR63_tree=null;
		Object OP_REMOVE64_tree=null;
		Object OP_CONST65_tree=null;
		Object OP_ID66_tree=null;
		Object ID67_tree=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:2: ( ( OP_JOIN ^| OP_SPLIT ^| OP_PAR ^| OP_REMOVE ^| OP_CONST ^| OP_ID ^| ID ^) operation_args )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:5: ( OP_JOIN ^| OP_SPLIT ^| OP_PAR ^| OP_REMOVE ^| OP_CONST ^| OP_ID ^| ID ^) operation_args
			{
			root_0 = (Object)adaptor.nil();


			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:5: ( OP_JOIN ^| OP_SPLIT ^| OP_PAR ^| OP_REMOVE ^| OP_CONST ^| OP_ID ^| ID ^)
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:6: OP_JOIN ^
					{
					OP_JOIN61=(Token)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call730); 
					OP_JOIN61_tree = (Object)adaptor.create(OP_JOIN61);
					root_0 = (Object)adaptor.becomeRoot(OP_JOIN61_tree, root_0);

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:17: OP_SPLIT ^
					{
					OP_SPLIT62=(Token)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call735); 
					OP_SPLIT62_tree = (Object)adaptor.create(OP_SPLIT62);
					root_0 = (Object)adaptor.becomeRoot(OP_SPLIT62_tree, root_0);

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:29: OP_PAR ^
					{
					OP_PAR63=(Token)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call740); 
					OP_PAR63_tree = (Object)adaptor.create(OP_PAR63);
					root_0 = (Object)adaptor.becomeRoot(OP_PAR63_tree, root_0);

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:39: OP_REMOVE ^
					{
					OP_REMOVE64=(Token)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call745); 
					OP_REMOVE64_tree = (Object)adaptor.create(OP_REMOVE64);
					root_0 = (Object)adaptor.becomeRoot(OP_REMOVE64_tree, root_0);

					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:52: OP_CONST ^
					{
					OP_CONST65=(Token)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call750); 
					OP_CONST65_tree = (Object)adaptor.create(OP_CONST65);
					root_0 = (Object)adaptor.becomeRoot(OP_CONST65_tree, root_0);

					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:64: OP_ID ^
					{
					OP_ID66=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call755); 
					OP_ID66_tree = (Object)adaptor.create(OP_ID66);
					root_0 = (Object)adaptor.becomeRoot(OP_ID66_tree, root_0);

					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:228:73: ID ^
					{
					ID67=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_call760); 
					ID67_tree = (Object)adaptor.create(ID67);
					root_0 = (Object)adaptor.becomeRoot(ID67_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operation_args_in_reconfiguration_call764);
			operation_args68=operation_args();
			state._fsp--;

			adaptor.addChild(root_0, operation_args68.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reconfiguration_call"


	public static class structure_operation_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "structure_operation_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:232:1: structure_operation_call : ( OP_PATH ^| OP_UPDATE ^) operation_args ;
	public final RecParser.structure_operation_call_return structure_operation_call() throws RecognitionException {
		RecParser.structure_operation_call_return retval = new RecParser.structure_operation_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OP_PATH69=null;
		Token OP_UPDATE70=null;
		ParserRuleReturnScope operation_args71 =null;

		Object OP_PATH69_tree=null;
		Object OP_UPDATE70_tree=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:233:2: ( ( OP_PATH ^| OP_UPDATE ^) operation_args )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:233:4: ( OP_PATH ^| OP_UPDATE ^) operation_args
			{
			root_0 = (Object)adaptor.nil();


			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:233:4: ( OP_PATH ^| OP_UPDATE ^)
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:233:6: OP_PATH ^
					{
					OP_PATH69=(Token)match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call780); 
					OP_PATH69_tree = (Object)adaptor.create(OP_PATH69);
					root_0 = (Object)adaptor.becomeRoot(OP_PATH69_tree, root_0);

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:233:17: OP_UPDATE ^
					{
					OP_UPDATE70=(Token)match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call785); 
					OP_UPDATE70_tree = (Object)adaptor.create(OP_UPDATE70);
					root_0 = (Object)adaptor.becomeRoot(OP_UPDATE70_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operation_args_in_structure_operation_call790);
			operation_args71=operation_args();
			state._fsp--;

			adaptor.addChild(root_0, operation_args71.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structure_operation_call"


	public static class operation_args_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operation_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:237:1: operation_args : SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? ;
	public final RecParser.operation_args_return operation_args() throws RecognitionException {
		RecParser.operation_args_return retval = new RecParser.operation_args_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_ARGS_START72=null;
		Token SEP_ARGS_END74=null;
		ParserRuleReturnScope args73 =null;

		Object SEP_ARGS_START72_tree=null;
		Object SEP_ARGS_END74_tree=null;
		RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
		RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:238:2: ( SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:238:4: SEP_ARGS_START ( args )? SEP_ARGS_END
			{
			SEP_ARGS_START72=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_operation_args805);  
			stream_SEP_ARGS_START.add(SEP_ARGS_START72);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:238:19: ( args )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= CONS_PAIR && LA17_0 <= CONS_TRIPLE)||LA17_0==ID||LA17_0==OP_PATH||LA17_0==OP_UPDATE) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:238:19: args
					{
					pushFollow(FOLLOW_args_in_operation_args807);
					args73=args();
					state._fsp--;

					stream_args.add(args73.getTree());
					}
					break;

			}

			SEP_ARGS_END74=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_operation_args810);  
			stream_SEP_ARGS_END.add(SEP_ARGS_END74);

			// AST REWRITE
			// elements: args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 238:38: -> ( args )?
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:238:41: ( args )?
				if ( stream_args.hasNext() ) {
					adaptor.addChild(root_0, stream_args.nextTree());
				}
				stream_args.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operation_args"


	public static class args_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:241:1: args : expression ( SEP_COMMA expression )* -> ( expression )+ ;
	public final RecParser.args_return args() throws RecognitionException {
		RecParser.args_return retval = new RecParser.args_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_COMMA76=null;
		ParserRuleReturnScope expression75 =null;
		ParserRuleReturnScope expression77 =null;

		Object SEP_COMMA76_tree=null;
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:242:2: ( expression ( SEP_COMMA expression )* -> ( expression )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:242:4: expression ( SEP_COMMA expression )*
			{
			pushFollow(FOLLOW_expression_in_args827);
			expression75=expression();
			state._fsp--;

			stream_expression.add(expression75.getTree());
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:242:15: ( SEP_COMMA expression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==SEP_COMMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:242:16: SEP_COMMA expression
					{
					SEP_COMMA76=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_args830);  
					stream_SEP_COMMA.add(SEP_COMMA76);

					pushFollow(FOLLOW_expression_in_args832);
					expression77=expression();
					state._fsp--;

					stream_expression.add(expression77.getTree());
					}
					break;

				default :
					break loop18;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 243:3: -> ( expression )+
			{
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_expression.nextTree());
				}
				stream_expression.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "args"


	public static class for_instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:247:1: for_instruction : RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) ;
	public final RecParser.for_instruction_return for_instruction() throws RecognitionException {
		RecParser.for_instruction_return retval = new RecParser.for_instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RW_FORALL78=null;
		Token SEP_ARGS_START79=null;
		Token ID81=null;
		Token SEP_COLON82=null;
		Token ID83=null;
		Token SEP_ARGS_END84=null;
		ParserRuleReturnScope datatype80 =null;
		ParserRuleReturnScope reconfiguration_block85 =null;

		Object RW_FORALL78_tree=null;
		Object SEP_ARGS_START79_tree=null;
		Object ID81_tree=null;
		Object SEP_COLON82_tree=null;
		Object ID83_tree=null;
		Object SEP_ARGS_END84_tree=null;
		RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
		RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_SEP_COLON=new RewriteRuleTokenStream(adaptor,"token SEP_COLON");
		RewriteRuleTokenStream stream_RW_FORALL=new RewriteRuleTokenStream(adaptor,"token RW_FORALL");
		RewriteRuleSubtreeStream stream_reconfiguration_block=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_block");
		RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:248:2: ( RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:248:4: RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
			{
			RW_FORALL78=(Token)match(input,RW_FORALL,FOLLOW_RW_FORALL_in_for_instruction856);  
			stream_RW_FORALL.add(RW_FORALL78);

			SEP_ARGS_START79=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_for_instruction858);  
			stream_SEP_ARGS_START.add(SEP_ARGS_START79);

			pushFollow(FOLLOW_datatype_in_for_instruction860);
			datatype80=datatype();
			state._fsp--;

			stream_datatype.add(datatype80.getTree());
			ID81=(Token)match(input,ID,FOLLOW_ID_in_for_instruction862);  
			stream_ID.add(ID81);

			SEP_COLON82=(Token)match(input,SEP_COLON,FOLLOW_SEP_COLON_in_for_instruction864);  
			stream_SEP_COLON.add(SEP_COLON82);

			ID83=(Token)match(input,ID,FOLLOW_ID_in_for_instruction866);  
			stream_ID.add(ID83);

			SEP_ARGS_END84=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_for_instruction868);  
			stream_SEP_ARGS_END.add(SEP_ARGS_END84);

			pushFollow(FOLLOW_reconfiguration_block_in_for_instruction870);
			reconfiguration_block85=reconfiguration_block();
			state._fsp--;

			stream_reconfiguration_block.add(reconfiguration_block85.getTree());
			// AST REWRITE
			// elements: ID, datatype, reconfiguration_block, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 249:3: -> ^( FORALL datatype ID ID reconfiguration_block )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:249:6: ^( FORALL datatype ID ID reconfiguration_block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORALL, "FORALL"), root_1);
				adaptor.addChild(root_1, stream_datatype.nextTree());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_reconfiguration_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_instruction"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:260:1: expression : factor ( expr_op ^ factor )? ;
	public final RecParser.expression_return expression() throws RecognitionException {
		RecParser.expression_return retval = new RecParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope factor86 =null;
		ParserRuleReturnScope expr_op87 =null;
		ParserRuleReturnScope factor88 =null;


		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:261:2: ( factor ( expr_op ^ factor )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:261:4: factor ( expr_op ^ factor )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_expression900);
			factor86=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor86.getTree());

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:261:11: ( expr_op ^ factor )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==OP_INTERSECTION||LA19_0==OP_MINUS||LA19_0==OP_UNION) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:261:12: expr_op ^ factor
					{
					pushFollow(FOLLOW_expr_op_in_expression903);
					expr_op87=expr_op();
					state._fsp--;

					root_0 = (Object)adaptor.becomeRoot(expr_op87.getTree(), root_0);
					pushFollow(FOLLOW_factor_in_expression906);
					factor88=factor();
					state._fsp--;

					adaptor.addChild(root_0, factor88.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class expr_op_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_op"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:264:1: expr_op : ( OP_UNION | OP_INTERSECTION | OP_MINUS );
	public final RecParser.expr_op_return expr_op() throws RecognitionException {
		RecParser.expr_op_return retval = new RecParser.expr_op_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set89=null;

		Object set89_tree=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:265:2: ( OP_UNION | OP_INTERSECTION | OP_MINUS )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:
			{
			root_0 = (Object)adaptor.nil();


			set89=input.LT(1);
			if ( input.LA(1)==OP_INTERSECTION||input.LA(1)==OP_MINUS||input.LA(1)==OP_UNION ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set89));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_op"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:270:1: factor : ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | operation | constructor );
	public final RecParser.factor_return factor() throws RecognitionException {
		RecParser.factor_return retval = new RecParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID90=null;
		Token SEP_SUBTYPE_START91=null;
		Token ID92=null;
		Token SEP_SUBTYPE_END93=null;
		Token ID94=null;
		ParserRuleReturnScope operation95 =null;
		ParserRuleReturnScope constructor96 =null;

		Object ID90_tree=null;
		Object SEP_SUBTYPE_START91_tree=null;
		Object ID92_tree=null;
		Object SEP_SUBTYPE_END93_tree=null;
		Object ID94_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
		RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:271:2: ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | operation | constructor )
			int alt20=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case SEP_SUBTYPE_START:
					{
					alt20=1;
					}
					break;
				case OP_INTERSECTION:
				case OP_MINUS:
				case OP_UNION:
				case SEP_ARGS_END:
				case SEP_COMMA:
				case SEP_SEMICOLON:
					{
					alt20=2;
					}
					break;
				case SEP_ACCESSOR:
				case SEP_STRUCTURE:
					{
					alt20=3;
					}
					break;
				default:
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
				{
				alt20=3;
				}
				break;
			case CONS_PAIR:
			case CONS_SET:
			case CONS_TRIPLE:
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:271:4: ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END
					{
					ID90=(Token)match(input,ID,FOLLOW_ID_in_factor943);  
					stream_ID.add(ID90);

					SEP_SUBTYPE_START91=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_factor945);  
					stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START91);

					ID92=(Token)match(input,ID,FOLLOW_ID_in_factor947);  
					stream_ID.add(ID92);

					SEP_SUBTYPE_END93=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_factor949);  
					stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END93);

					// AST REWRITE
					// elements: ID, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 271:47: -> ^( ID ID )
					{
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:271:50: ^( ID ID )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:272:4: ID
					{
					ID94=(Token)match(input,ID,FOLLOW_ID_in_factor967);  
					stream_ID.add(ID94);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 272:14: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:273:4: operation
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_operation_in_factor983);
					operation95=operation();
					state._fsp--;

					adaptor.addChild(root_0, operation95.getTree());

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:274:4: constructor
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_constructor_in_factor988);
					constructor96=constructor();
					state._fsp--;

					adaptor.addChild(root_0, constructor96.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class operation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operation"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:277:1: operation : ( ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call -> structure_operation_call );
	public final RecParser.operation_return operation() throws RecognitionException {
		RecParser.operation_return retval = new RecParser.operation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID97=null;
		Token SEP_STRUCTURE98=null;
		Token ID99=null;
		Token SEP_ACCESSOR100=null;
		ParserRuleReturnScope attribute_call101 =null;
		ParserRuleReturnScope structure_operation_call102 =null;

		Object ID97_tree=null;
		Object SEP_STRUCTURE98_tree=null;
		Object ID99_tree=null;
		Object SEP_ACCESSOR100_tree=null;
		RewriteRuleTokenStream stream_SEP_STRUCTURE=new RewriteRuleTokenStream(adaptor,"token SEP_STRUCTURE");
		RewriteRuleTokenStream stream_SEP_ACCESSOR=new RewriteRuleTokenStream(adaptor,"token SEP_ACCESSOR");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_structure_operation_call=new RewriteRuleSubtreeStream(adaptor,"rule structure_operation_call");
		RewriteRuleSubtreeStream stream_attribute_call=new RewriteRuleSubtreeStream(adaptor,"rule attribute_call");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:278:2: ( ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call -> structure_operation_call )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ID) ) {
				alt22=1;
			}
			else if ( (LA22_0==OP_PATH||LA22_0==OP_UPDATE) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:278:5: ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call
					{
					ID97=(Token)match(input,ID,FOLLOW_ID_in_operation1000);  
					stream_ID.add(ID97);

					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:278:8: ( SEP_STRUCTURE ID )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==SEP_STRUCTURE) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:278:9: SEP_STRUCTURE ID
							{
							SEP_STRUCTURE98=(Token)match(input,SEP_STRUCTURE,FOLLOW_SEP_STRUCTURE_in_operation1003);  
							stream_SEP_STRUCTURE.add(SEP_STRUCTURE98);

							ID99=(Token)match(input,ID,FOLLOW_ID_in_operation1005);  
							stream_ID.add(ID99);

							}
							break;

					}

					SEP_ACCESSOR100=(Token)match(input,SEP_ACCESSOR,FOLLOW_SEP_ACCESSOR_in_operation1009);  
					stream_SEP_ACCESSOR.add(SEP_ACCESSOR100);

					pushFollow(FOLLOW_attribute_call_in_operation1011);
					attribute_call101=attribute_call();
					state._fsp--;

					stream_attribute_call.add(attribute_call101.getTree());
					// AST REWRITE
					// elements: attribute_call, ID, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 278:57: -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
					{
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:278:60: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCESS, "ACCESS"), root_1);
						adaptor.addChild(root_1, stream_ID.nextNode());
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:278:72: ( ^( STRUCTURE ID ) )?
						if ( stream_ID.hasNext() ) {
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:278:72: ^( STRUCTURE ID )
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCTURE, "STRUCTURE"), root_2);
							adaptor.addChild(root_2, stream_ID.nextNode());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_ID.reset();

						adaptor.addChild(root_1, stream_attribute_call.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:280:5: structure_operation_call
					{
					pushFollow(FOLLOW_structure_operation_call_in_operation1036);
					structure_operation_call102=structure_operation_call();
					state._fsp--;

					stream_structure_operation_call.add(structure_operation_call102.getTree());
					// AST REWRITE
					// elements: structure_operation_call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 280:35: -> structure_operation_call
					{
						adaptor.addChild(root_0, stream_structure_operation_call.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operation"


	public static class constructor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constructor"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:283:1: constructor : ( triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons );
	public final RecParser.constructor_return constructor() throws RecognitionException {
		RecParser.constructor_return retval = new RecParser.constructor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope triple_cons103 =null;
		ParserRuleReturnScope pair_cons104 =null;
		ParserRuleReturnScope set_cons105 =null;

		RewriteRuleSubtreeStream stream_triple_cons=new RewriteRuleSubtreeStream(adaptor,"rule triple_cons");
		RewriteRuleSubtreeStream stream_set_cons=new RewriteRuleSubtreeStream(adaptor,"rule set_cons");
		RewriteRuleSubtreeStream stream_pair_cons=new RewriteRuleSubtreeStream(adaptor,"rule pair_cons");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:284:2: ( triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons )
			int alt23=3;
			switch ( input.LA(1) ) {
			case CONS_TRIPLE:
				{
				alt23=1;
				}
				break;
			case CONS_PAIR:
				{
				alt23=2;
				}
				break;
			case CONS_SET:
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:284:4: triple_cons
					{
					pushFollow(FOLLOW_triple_cons_in_constructor1057);
					triple_cons103=triple_cons();
					state._fsp--;

					stream_triple_cons.add(triple_cons103.getTree());
					// AST REWRITE
					// elements: triple_cons
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 284:22: -> triple_cons
					{
						adaptor.addChild(root_0, stream_triple_cons.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:285:4: pair_cons
					{
					pushFollow(FOLLOW_pair_cons_in_constructor1072);
					pair_cons104=pair_cons();
					state._fsp--;

					stream_pair_cons.add(pair_cons104.getTree());
					// AST REWRITE
					// elements: pair_cons
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 285:20: -> pair_cons
					{
						adaptor.addChild(root_0, stream_pair_cons.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:286:4: set_cons
					{
					pushFollow(FOLLOW_set_cons_in_constructor1087);
					set_cons105=set_cons();
					state._fsp--;

					stream_set_cons.add(set_cons105.getTree());
					// AST REWRITE
					// elements: set_cons
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 286:20: -> set_cons
					{
						adaptor.addChild(root_0, stream_set_cons.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructor"


	public static class attribute_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "attribute_call"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:295:1: attribute_call : ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_FST -> OP_FST | OP_SND -> OP_SND | OP_TRD -> OP_TRD | ID -> ID );
	public final RecParser.attribute_call_return attribute_call() throws RecognitionException {
		RecParser.attribute_call_return retval = new RecParser.attribute_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OP_IN106=null;
		Token SEP_LIST_START107=null;
		Token INT108=null;
		Token SEP_LIST_END109=null;
		Token OP_OUT110=null;
		Token SEP_LIST_START111=null;
		Token INT112=null;
		Token SEP_LIST_END113=null;
		Token OP_NAME114=null;
		Token OP_NODES115=null;
		Token OP_NAMES116=null;
		Token OP_FST117=null;
		Token OP_SND118=null;
		Token OP_TRD119=null;
		Token ID120=null;

		Object OP_IN106_tree=null;
		Object SEP_LIST_START107_tree=null;
		Object INT108_tree=null;
		Object SEP_LIST_END109_tree=null;
		Object OP_OUT110_tree=null;
		Object SEP_LIST_START111_tree=null;
		Object INT112_tree=null;
		Object SEP_LIST_END113_tree=null;
		Object OP_NAME114_tree=null;
		Object OP_NODES115_tree=null;
		Object OP_NAMES116_tree=null;
		Object OP_FST117_tree=null;
		Object OP_SND118_tree=null;
		Object OP_TRD119_tree=null;
		Object ID120_tree=null;
		RewriteRuleTokenStream stream_OP_NODES=new RewriteRuleTokenStream(adaptor,"token OP_NODES");
		RewriteRuleTokenStream stream_SEP_LIST_END=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_END");
		RewriteRuleTokenStream stream_OP_OUT=new RewriteRuleTokenStream(adaptor,"token OP_OUT");
		RewriteRuleTokenStream stream_OP_FST=new RewriteRuleTokenStream(adaptor,"token OP_FST");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_OP_NAME=new RewriteRuleTokenStream(adaptor,"token OP_NAME");
		RewriteRuleTokenStream stream_OP_NAMES=new RewriteRuleTokenStream(adaptor,"token OP_NAMES");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_OP_IN=new RewriteRuleTokenStream(adaptor,"token OP_IN");
		RewriteRuleTokenStream stream_OP_TRD=new RewriteRuleTokenStream(adaptor,"token OP_TRD");
		RewriteRuleTokenStream stream_OP_SND=new RewriteRuleTokenStream(adaptor,"token OP_SND");
		RewriteRuleTokenStream stream_SEP_LIST_START=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_START");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:296:2: ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_FST -> OP_FST | OP_SND -> OP_SND | OP_TRD -> OP_TRD | ID -> ID )
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
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:296:4: OP_IN ( SEP_LIST_START INT SEP_LIST_END )?
					{
					OP_IN106=(Token)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1117);  
					stream_OP_IN.add(OP_IN106);

					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:296:10: ( SEP_LIST_START INT SEP_LIST_END )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==SEP_LIST_START) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:296:11: SEP_LIST_START INT SEP_LIST_END
							{
							SEP_LIST_START107=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_attribute_call1120);  
							stream_SEP_LIST_START.add(SEP_LIST_START107);

							INT108=(Token)match(input,INT,FOLLOW_INT_in_attribute_call1122);  
							stream_INT.add(INT108);

							SEP_LIST_END109=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_attribute_call1124);  
							stream_SEP_LIST_END.add(SEP_LIST_END109);

							}
							break;

					}

					// AST REWRITE
					// elements: INT, OP_IN
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 296:47: -> ^( OP_IN ( INT )? )
					{
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:296:50: ^( OP_IN ( INT )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_OP_IN.nextNode(), root_1);
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:296:58: ( INT )?
						if ( stream_INT.hasNext() ) {
							adaptor.addChild(root_1, stream_INT.nextNode());
						}
						stream_INT.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:297:5: OP_OUT ( SEP_LIST_START INT SEP_LIST_END )?
					{
					OP_OUT110=(Token)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1143);  
					stream_OP_OUT.add(OP_OUT110);

					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:297:12: ( SEP_LIST_START INT SEP_LIST_END )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==SEP_LIST_START) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:297:13: SEP_LIST_START INT SEP_LIST_END
							{
							SEP_LIST_START111=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_attribute_call1146);  
							stream_SEP_LIST_START.add(SEP_LIST_START111);

							INT112=(Token)match(input,INT,FOLLOW_INT_in_attribute_call1148);  
							stream_INT.add(INT112);

							SEP_LIST_END113=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_attribute_call1150);  
							stream_SEP_LIST_END.add(SEP_LIST_END113);

							}
							break;

					}

					// AST REWRITE
					// elements: OP_OUT, INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 297:47: -> ^( OP_OUT ( INT )? )
					{
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:297:50: ^( OP_OUT ( INT )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_OP_OUT.nextNode(), root_1);
						// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:297:59: ( INT )?
						if ( stream_INT.hasNext() ) {
							adaptor.addChild(root_1, stream_INT.nextNode());
						}
						stream_INT.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:298:4: OP_NAME
					{
					OP_NAME114=(Token)match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1166);  
					stream_OP_NAME.add(OP_NAME114);

					// AST REWRITE
					// elements: OP_NAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 298:17: -> OP_NAME
					{
						adaptor.addChild(root_0, stream_OP_NAME.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:300:4: OP_NODES
					{
					OP_NODES115=(Token)match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1181);  
					stream_OP_NODES.add(OP_NODES115);

					// AST REWRITE
					// elements: OP_NODES
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 300:17: -> OP_NODES
					{
						adaptor.addChild(root_0, stream_OP_NODES.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:301:4: OP_NAMES
					{
					OP_NAMES116=(Token)match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1194);  
					stream_OP_NAMES.add(OP_NAMES116);

					// AST REWRITE
					// elements: OP_NAMES
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 301:17: -> OP_NAMES
					{
						adaptor.addChild(root_0, stream_OP_NAMES.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:302:4: OP_FST
					{
					OP_FST117=(Token)match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1207);  
					stream_OP_FST.add(OP_FST117);

					// AST REWRITE
					// elements: OP_FST
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 302:16: -> OP_FST
					{
						adaptor.addChild(root_0, stream_OP_FST.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:303:4: OP_SND
					{
					OP_SND118=(Token)match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1221);  
					stream_OP_SND.add(OP_SND118);

					// AST REWRITE
					// elements: OP_SND
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 303:16: -> OP_SND
					{
						adaptor.addChild(root_0, stream_OP_SND.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:304:4: OP_TRD
					{
					OP_TRD119=(Token)match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1235);  
					stream_OP_TRD.add(OP_TRD119);

					// AST REWRITE
					// elements: OP_TRD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 304:16: -> OP_TRD
					{
						adaptor.addChild(root_0, stream_OP_TRD.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:305:4: ID
					{
					ID120=(Token)match(input,ID,FOLLOW_ID_in_attribute_call1249);  
					stream_ID.add(ID120);

					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 305:12: -> ID
					{
						adaptor.addChild(root_0, stream_ID.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attribute_call"


	public static class triple_cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "triple_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:309:1: triple_cons : CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) ;
	public final RecParser.triple_cons_return triple_cons() throws RecognitionException {
		RecParser.triple_cons_return retval = new RecParser.triple_cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONS_TRIPLE121=null;
		Token SEP_ARGS_START122=null;
		Token SEP_COMMA124=null;
		Token SEP_COMMA126=null;
		Token SEP_ARGS_END128=null;
		ParserRuleReturnScope expression123 =null;
		ParserRuleReturnScope expression125 =null;
		ParserRuleReturnScope expression127 =null;

		Object CONS_TRIPLE121_tree=null;
		Object SEP_ARGS_START122_tree=null;
		Object SEP_COMMA124_tree=null;
		Object SEP_COMMA126_tree=null;
		Object SEP_ARGS_END128_tree=null;
		RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
		RewriteRuleTokenStream stream_CONS_TRIPLE=new RewriteRuleTokenStream(adaptor,"token CONS_TRIPLE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:310:2: ( CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:310:4: CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END
			{
			CONS_TRIPLE121=(Token)match(input,CONS_TRIPLE,FOLLOW_CONS_TRIPLE_in_triple_cons1272);  
			stream_CONS_TRIPLE.add(CONS_TRIPLE121);

			SEP_ARGS_START122=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_triple_cons1274);  
			stream_SEP_ARGS_START.add(SEP_ARGS_START122);

			pushFollow(FOLLOW_expression_in_triple_cons1276);
			expression123=expression();
			state._fsp--;

			stream_expression.add(expression123.getTree());
			SEP_COMMA124=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons1278);  
			stream_SEP_COMMA.add(SEP_COMMA124);

			pushFollow(FOLLOW_expression_in_triple_cons1280);
			expression125=expression();
			state._fsp--;

			stream_expression.add(expression125.getTree());
			SEP_COMMA126=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons1282);  
			stream_SEP_COMMA.add(SEP_COMMA126);

			pushFollow(FOLLOW_expression_in_triple_cons1284);
			expression127=expression();
			state._fsp--;

			stream_expression.add(expression127.getTree());
			SEP_ARGS_END128=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_triple_cons1286);  
			stream_SEP_ARGS_END.add(SEP_ARGS_END128);

			// AST REWRITE
			// elements: expression, expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 311:3: -> ^( TRIPLE expression expression expression )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:311:6: ^( TRIPLE expression expression expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRIPLE, "TRIPLE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triple_cons"


	public static class pair_cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pair_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:315:1: pair_cons : CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) ;
	public final RecParser.pair_cons_return pair_cons() throws RecognitionException {
		RecParser.pair_cons_return retval = new RecParser.pair_cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONS_PAIR129=null;
		Token SEP_ARGS_START130=null;
		Token SEP_COMMA132=null;
		Token SEP_ARGS_END134=null;
		ParserRuleReturnScope expression131 =null;
		ParserRuleReturnScope expression133 =null;

		Object CONS_PAIR129_tree=null;
		Object SEP_ARGS_START130_tree=null;
		Object SEP_COMMA132_tree=null;
		Object SEP_ARGS_END134_tree=null;
		RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
		RewriteRuleTokenStream stream_CONS_PAIR=new RewriteRuleTokenStream(adaptor,"token CONS_PAIR");
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:316:2: ( CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:316:4: CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END
			{
			CONS_PAIR129=(Token)match(input,CONS_PAIR,FOLLOW_CONS_PAIR_in_pair_cons1315);  
			stream_CONS_PAIR.add(CONS_PAIR129);

			SEP_ARGS_START130=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_pair_cons1317);  
			stream_SEP_ARGS_START.add(SEP_ARGS_START130);

			pushFollow(FOLLOW_expression_in_pair_cons1319);
			expression131=expression();
			state._fsp--;

			stream_expression.add(expression131.getTree());
			SEP_COMMA132=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_pair_cons1321);  
			stream_SEP_COMMA.add(SEP_COMMA132);

			pushFollow(FOLLOW_expression_in_pair_cons1323);
			expression133=expression();
			state._fsp--;

			stream_expression.add(expression133.getTree());
			SEP_ARGS_END134=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_pair_cons1325);  
			stream_SEP_ARGS_END.add(SEP_ARGS_END134);

			// AST REWRITE
			// elements: expression, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 317:3: -> ^( PAIR expression expression )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:317:6: ^( PAIR expression expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAIR, "PAIR"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pair_cons"


	public static class set_cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "set_cons"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:322:1: set_cons : CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) ;
	public final RecParser.set_cons_return set_cons() throws RecognitionException {
		RecParser.set_cons_return retval = new RecParser.set_cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CONS_SET135=null;
		Token SEP_ARGS_START136=null;
		Token SEP_COMMA138=null;
		Token SEP_ARGS_END140=null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope expression139 =null;

		Object CONS_SET135_tree=null;
		Object SEP_ARGS_START136_tree=null;
		Object SEP_COMMA138_tree=null;
		Object SEP_ARGS_END140_tree=null;
		RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
		RewriteRuleTokenStream stream_CONS_SET=new RewriteRuleTokenStream(adaptor,"token CONS_SET");
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:323:2: ( CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:323:4: CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END
			{
			CONS_SET135=(Token)match(input,CONS_SET,FOLLOW_CONS_SET_in_set_cons1353);  
			stream_CONS_SET.add(CONS_SET135);

			SEP_ARGS_START136=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_set_cons1355);  
			stream_SEP_ARGS_START.add(SEP_ARGS_START136);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:323:29: ( expression ( SEP_COMMA expression )* )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= CONS_PAIR && LA28_0 <= CONS_TRIPLE)||LA28_0==ID||LA28_0==OP_PATH||LA28_0==OP_UPDATE) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:323:31: expression ( SEP_COMMA expression )*
					{
					pushFollow(FOLLOW_expression_in_set_cons1360);
					expression137=expression();
					state._fsp--;

					stream_expression.add(expression137.getTree());
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:323:42: ( SEP_COMMA expression )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==SEP_COMMA) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:323:43: SEP_COMMA expression
							{
							SEP_COMMA138=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_set_cons1363);  
							stream_SEP_COMMA.add(SEP_COMMA138);

							pushFollow(FOLLOW_expression_in_set_cons1365);
							expression139=expression();
							state._fsp--;

							stream_expression.add(expression139.getTree());
							}
							break;

						default :
							break loop27;
						}
					}

					}
					break;

			}

			SEP_ARGS_END140=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_set_cons1372);  
			stream_SEP_ARGS_END.add(SEP_ARGS_END140);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 324:3: -> ^( SET ( expression )* )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:324:6: ^( SET ( expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:324:12: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "set_cons"


	public static class applicaiton_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "applicaiton_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:342:1: applicaiton_def : ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? ;
	public final RecParser.applicaiton_def_return applicaiton_def() throws RecognitionException {
		RecParser.applicaiton_def_return retval = new RecParser.applicaiton_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID141=null;
		Token OP_APPLY142=null;
		ParserRuleReturnScope list_reconfigurations143 =null;
		ParserRuleReturnScope trigger_def144 =null;

		Object ID141_tree=null;
		Object OP_APPLY142_tree=null;
		RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_trigger_def=new RewriteRuleSubtreeStream(adaptor,"rule trigger_def");
		RewriteRuleSubtreeStream stream_list_reconfigurations=new RewriteRuleSubtreeStream(adaptor,"rule list_reconfigurations");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:343:2: ( ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:343:4: ID OP_APPLY list_reconfigurations ( trigger_def )?
			{
			ID141=(Token)match(input,ID,FOLLOW_ID_in_applicaiton_def1403);  
			stream_ID.add(ID141);

			OP_APPLY142=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_applicaiton_def1405);  
			stream_OP_APPLY.add(OP_APPLY142);

			pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1408);
			list_reconfigurations143=list_reconfigurations();
			state._fsp--;

			stream_list_reconfigurations.add(list_reconfigurations143.getTree());
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:343:40: ( trigger_def )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==SEP_TRIGGER) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:343:40: trigger_def
					{
					pushFollow(FOLLOW_trigger_def_in_applicaiton_def1411);
					trigger_def144=trigger_def();
					state._fsp--;

					stream_trigger_def.add(trigger_def144.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: trigger_def, ID, list_reconfigurations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 344:3: -> ID list_reconfigurations ( trigger_def )?
			{
				adaptor.addChild(root_0, stream_ID.nextNode());
				adaptor.addChild(root_0, stream_list_reconfigurations.nextTree());
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:344:31: ( trigger_def )?
				if ( stream_trigger_def.hasNext() ) {
					adaptor.addChild(root_0, stream_trigger_def.nextTree());
				}
				stream_trigger_def.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "applicaiton_def"


	public static class list_reconfigurations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list_reconfigurations"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:347:1: list_reconfigurations : ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ ;
	public final RecParser.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
		RecParser.list_reconfigurations_return retval = new RecParser.list_reconfigurations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_BLOCK_START145=null;
		Token SEP_COMMA147=null;
		Token SEP_BLOCK_END149=null;
		ParserRuleReturnScope reconfiguration_call146 =null;
		ParserRuleReturnScope reconfiguration_call148 =null;

		Object SEP_BLOCK_START145_tree=null;
		Object SEP_COMMA147_tree=null;
		Object SEP_BLOCK_END149_tree=null;
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
		RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
		RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:2: ( ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:5: ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )?
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:5: ( SEP_BLOCK_START )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==SEP_BLOCK_START) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:5: SEP_BLOCK_START
					{
					SEP_BLOCK_START145=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1437);  
					stream_SEP_BLOCK_START.add(SEP_BLOCK_START145);

					}
					break;

			}

			pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1440);
			reconfiguration_call146=reconfiguration_call();
			state._fsp--;

			stream_reconfiguration_call.add(reconfiguration_call146.getTree());
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:43: ( SEP_COMMA reconfiguration_call )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==SEP_COMMA) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:44: SEP_COMMA reconfiguration_call
					{
					SEP_COMMA147=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_reconfigurations1443);  
					stream_SEP_COMMA.add(SEP_COMMA147);

					pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1445);
					reconfiguration_call148=reconfiguration_call();
					state._fsp--;

					stream_reconfiguration_call.add(reconfiguration_call148.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:77: ( SEP_BLOCK_END )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==SEP_BLOCK_END) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:348:77: SEP_BLOCK_END
					{
					SEP_BLOCK_END149=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1449);  
					stream_SEP_BLOCK_END.add(SEP_BLOCK_END149);

					}
					break;

			}

			// AST REWRITE
			// elements: reconfiguration_call
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 348:93: -> ( reconfiguration_call )+
			{
				if ( !(stream_reconfiguration_call.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_reconfiguration_call.hasNext() ) {
					adaptor.addChild(root_0, stream_reconfiguration_call.nextTree());
				}
				stream_reconfiguration_call.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_reconfigurations"


	public static class trigger_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "trigger_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:351:1: trigger_def : SEP_TRIGGER trigger_block -> trigger_block ;
	public final RecParser.trigger_def_return trigger_def() throws RecognitionException {
		RecParser.trigger_def_return retval = new RecParser.trigger_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_TRIGGER150=null;
		ParserRuleReturnScope trigger_block151 =null;

		Object SEP_TRIGGER150_tree=null;
		RewriteRuleTokenStream stream_SEP_TRIGGER=new RewriteRuleTokenStream(adaptor,"token SEP_TRIGGER");
		RewriteRuleSubtreeStream stream_trigger_block=new RewriteRuleSubtreeStream(adaptor,"rule trigger_block");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:352:2: ( SEP_TRIGGER trigger_block -> trigger_block )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:352:4: SEP_TRIGGER trigger_block
			{
			SEP_TRIGGER150=(Token)match(input,SEP_TRIGGER,FOLLOW_SEP_TRIGGER_in_trigger_def1468);  
			stream_SEP_TRIGGER.add(SEP_TRIGGER150);

			pushFollow(FOLLOW_trigger_block_in_trigger_def1470);
			trigger_block151=trigger_block();
			state._fsp--;

			stream_trigger_block.add(trigger_block151.getTree());
			// AST REWRITE
			// elements: trigger_block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 353:3: -> trigger_block
			{
				adaptor.addChild(root_0, stream_trigger_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_def"


	public static class trigger_block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "trigger_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:356:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
	public final RecParser.trigger_block_return trigger_block() throws RecognitionException {
		RecParser.trigger_block_return retval = new RecParser.trigger_block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_BLOCK_START152=null;
		Token SEP_BLOCK_END153=null;

		Object SEP_BLOCK_START152_tree=null;
		Object SEP_BLOCK_END153_tree=null;

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:357:2: ( SEP_BLOCK_START SEP_BLOCK_END )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:357:4: SEP_BLOCK_START SEP_BLOCK_END
			{
			root_0 = (Object)adaptor.nil();


			SEP_BLOCK_START152=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1489); 
			SEP_BLOCK_START152_tree = (Object)adaptor.create(SEP_BLOCK_START152);
			adaptor.addChild(root_0, SEP_BLOCK_START152_tree);

			SEP_BLOCK_END153=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1491); 
			SEP_BLOCK_END153_tree = (Object)adaptor.create(SEP_BLOCK_END153);
			adaptor.addChild(root_0, SEP_BLOCK_END153_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trigger_block"


	public static class main_def_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_def"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:363:1: main_def : RW_MAIN SEP_LIST_START ( main_args )? SEP_LIST_END main_block -> ( main_args )? main_block ;
	public final RecParser.main_def_return main_def() throws RecognitionException {
		RecParser.main_def_return retval = new RecParser.main_def_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token RW_MAIN154=null;
		Token SEP_LIST_START155=null;
		Token SEP_LIST_END157=null;
		ParserRuleReturnScope main_args156 =null;
		ParserRuleReturnScope main_block158 =null;

		Object RW_MAIN154_tree=null;
		Object SEP_LIST_START155_tree=null;
		Object SEP_LIST_END157_tree=null;
		RewriteRuleTokenStream stream_SEP_LIST_END=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_END");
		RewriteRuleTokenStream stream_RW_MAIN=new RewriteRuleTokenStream(adaptor,"token RW_MAIN");
		RewriteRuleTokenStream stream_SEP_LIST_START=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_START");
		RewriteRuleSubtreeStream stream_main_args=new RewriteRuleSubtreeStream(adaptor,"rule main_args");
		RewriteRuleSubtreeStream stream_main_block=new RewriteRuleSubtreeStream(adaptor,"rule main_block");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:364:2: ( RW_MAIN SEP_LIST_START ( main_args )? SEP_LIST_END main_block -> ( main_args )? main_block )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:364:4: RW_MAIN SEP_LIST_START ( main_args )? SEP_LIST_END main_block
			{
			RW_MAIN154=(Token)match(input,RW_MAIN,FOLLOW_RW_MAIN_in_main_def1505);  
			stream_RW_MAIN.add(RW_MAIN154);

			SEP_LIST_START155=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_main_def1507);  
			stream_SEP_LIST_START.add(SEP_LIST_START155);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:364:27: ( main_args )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ID) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:364:27: main_args
					{
					pushFollow(FOLLOW_main_args_in_main_def1509);
					main_args156=main_args();
					state._fsp--;

					stream_main_args.add(main_args156.getTree());
					}
					break;

			}

			SEP_LIST_END157=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_main_def1512);  
			stream_SEP_LIST_END.add(SEP_LIST_END157);

			pushFollow(FOLLOW_main_block_in_main_def1514);
			main_block158=main_block();
			state._fsp--;

			stream_main_block.add(main_block158.getTree());
			// AST REWRITE
			// elements: main_block, main_args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 365:3: -> ( main_args )? main_block
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:365:6: ( main_args )?
				if ( stream_main_args.hasNext() ) {
					adaptor.addChild(root_0, stream_main_args.nextTree());
				}
				stream_main_args.reset();

				adaptor.addChild(root_0, stream_main_block.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_def"


	public static class main_args_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_args"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:368:1: main_args : main_arg ( SEP_SEMICOLON main_arg )* -> ^( ARGUMENTS ( main_arg )+ ) ;
	public final RecParser.main_args_return main_args() throws RecognitionException {
		RecParser.main_args_return retval = new RecParser.main_args_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_SEMICOLON160=null;
		ParserRuleReturnScope main_arg159 =null;
		ParserRuleReturnScope main_arg161 =null;

		Object SEP_SEMICOLON160_tree=null;
		RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
		RewriteRuleSubtreeStream stream_main_arg=new RewriteRuleSubtreeStream(adaptor,"rule main_arg");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:369:2: ( main_arg ( SEP_SEMICOLON main_arg )* -> ^( ARGUMENTS ( main_arg )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:369:4: main_arg ( SEP_SEMICOLON main_arg )*
			{
			pushFollow(FOLLOW_main_arg_in_main_args1534);
			main_arg159=main_arg();
			state._fsp--;

			stream_main_arg.add(main_arg159.getTree());
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:369:13: ( SEP_SEMICOLON main_arg )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==SEP_SEMICOLON) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:369:14: SEP_SEMICOLON main_arg
					{
					SEP_SEMICOLON160=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_main_args1537);  
					stream_SEP_SEMICOLON.add(SEP_SEMICOLON160);

					pushFollow(FOLLOW_main_arg_in_main_args1539);
					main_arg161=main_arg();
					state._fsp--;

					stream_main_arg.add(main_arg161.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			// AST REWRITE
			// elements: main_arg
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 370:3: -> ^( ARGUMENTS ( main_arg )+ )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:370:6: ^( ARGUMENTS ( main_arg )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);
				if ( !(stream_main_arg.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_main_arg.hasNext() ) {
					adaptor.addChild(root_1, stream_main_arg.nextTree());
				}
				stream_main_arg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_args"


	public static class main_arg_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_arg"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:373:1: main_arg : dt= ID ids -> ^( ARGUMENT ID ids ) ;
	public final RecParser.main_arg_return main_arg() throws RecognitionException {
		RecParser.main_arg_return retval = new RecParser.main_arg_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token dt=null;
		ParserRuleReturnScope ids162 =null;

		Object dt_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_ids=new RewriteRuleSubtreeStream(adaptor,"rule ids");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:374:2: (dt= ID ids -> ^( ARGUMENT ID ids ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:374:5: dt= ID ids
			{
			dt=(Token)match(input,ID,FOLLOW_ID_in_main_arg1566);  
			stream_ID.add(dt);

			pushFollow(FOLLOW_ids_in_main_arg1568);
			ids162=ids();
			state._fsp--;

			stream_ids.add(ids162.getTree());
			// AST REWRITE
			// elements: ID, ids
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 375:3: -> ^( ARGUMENT ID ids )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:375:6: ^( ARGUMENT ID ids )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_ids.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_arg"


	public static class ids_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ids"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:378:1: ids : ID ( SEP_COMMA ID )* -> ^( IDS ( ID )+ ) ;
	public final RecParser.ids_return ids() throws RecognitionException {
		RecParser.ids_return retval = new RecParser.ids_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID163=null;
		Token SEP_COMMA164=null;
		Token ID165=null;

		Object ID163_tree=null;
		Object SEP_COMMA164_tree=null;
		Object ID165_tree=null;
		RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:379:2: ( ID ( SEP_COMMA ID )* -> ^( IDS ( ID )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:379:4: ID ( SEP_COMMA ID )*
			{
			ID163=(Token)match(input,ID,FOLLOW_ID_in_ids1592);  
			stream_ID.add(ID163);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:379:7: ( SEP_COMMA ID )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==SEP_COMMA) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:379:8: SEP_COMMA ID
					{
					SEP_COMMA164=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_ids1595);  
					stream_SEP_COMMA.add(SEP_COMMA164);

					ID165=(Token)match(input,ID,FOLLOW_ID_in_ids1597);  
					stream_ID.add(ID165);

					}
					break;

				default :
					break loop35;
				}
			}

			// AST REWRITE
			// elements: ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 379:23: -> ^( IDS ( ID )+ )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:379:26: ^( IDS ( ID )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDS, "IDS"), root_1);
				if ( !(stream_ID.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ID.hasNext() ) {
					adaptor.addChild(root_1, stream_ID.nextNode());
				}
				stream_ID.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ids"


	public static class main_block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_block"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:383:1: main_block : SEP_BLOCK_START ( main_instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS ( main_instruction )+ ) ;
	public final RecParser.main_block_return main_block() throws RecognitionException {
		RecParser.main_block_return retval = new RecParser.main_block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_BLOCK_START166=null;
		Token SEP_BLOCK_END168=null;
		ParserRuleReturnScope main_instruction167 =null;

		Object SEP_BLOCK_START166_tree=null;
		Object SEP_BLOCK_END168_tree=null;
		RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
		RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
		RewriteRuleSubtreeStream stream_main_instruction=new RewriteRuleSubtreeStream(adaptor,"rule main_instruction");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:384:2: ( SEP_BLOCK_START ( main_instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS ( main_instruction )+ ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:384:4: SEP_BLOCK_START ( main_instruction )+ SEP_BLOCK_END
			{
			SEP_BLOCK_START166=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_main_block1622);  
			stream_SEP_BLOCK_START.add(SEP_BLOCK_START166);

			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:384:20: ( main_instruction )+
			int cnt36=0;
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==ID) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:384:20: main_instruction
					{
					pushFollow(FOLLOW_main_instruction_in_main_block1624);
					main_instruction167=main_instruction();
					state._fsp--;

					stream_main_instruction.add(main_instruction167.getTree());
					}
					break;

				default :
					if ( cnt36 >= 1 ) break loop36;
					EarlyExitException eee = new EarlyExitException(36, input);
					throw eee;
				}
				cnt36++;
			}

			SEP_BLOCK_END168=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_main_block1627);  
			stream_SEP_BLOCK_END.add(SEP_BLOCK_END168);

			// AST REWRITE
			// elements: main_instruction
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 385:3: -> ^( INSTRUCTIONS ( main_instruction )+ )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:385:6: ^( INSTRUCTIONS ( main_instruction )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTIONS, "INSTRUCTIONS"), root_1);
				if ( !(stream_main_instruction.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_main_instruction.hasNext() ) {
					adaptor.addChild(root_1, stream_main_instruction.nextTree());
				}
				stream_main_instruction.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_block"


	public static class main_instruction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_instruction"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:388:1: main_instruction : ( main_declaration SEP_SEMICOLON -> main_declaration | main_assignment SEP_SEMICOLON -> main_assignment );
	public final RecParser.main_instruction_return main_instruction() throws RecognitionException {
		RecParser.main_instruction_return retval = new RecParser.main_instruction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEP_SEMICOLON170=null;
		Token SEP_SEMICOLON172=null;
		ParserRuleReturnScope main_declaration169 =null;
		ParserRuleReturnScope main_assignment171 =null;

		Object SEP_SEMICOLON170_tree=null;
		Object SEP_SEMICOLON172_tree=null;
		RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
		RewriteRuleSubtreeStream stream_main_assignment=new RewriteRuleSubtreeStream(adaptor,"rule main_assignment");
		RewriteRuleSubtreeStream stream_main_declaration=new RewriteRuleSubtreeStream(adaptor,"rule main_declaration");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:389:2: ( main_declaration SEP_SEMICOLON -> main_declaration | main_assignment SEP_SEMICOLON -> main_assignment )
			int alt37=2;
			alt37 = dfa37.predict(input);
			switch (alt37) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:389:4: main_declaration SEP_SEMICOLON
					{
					pushFollow(FOLLOW_main_declaration_in_main_instruction1649);
					main_declaration169=main_declaration();
					state._fsp--;

					stream_main_declaration.add(main_declaration169.getTree());
					SEP_SEMICOLON170=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_main_instruction1651);  
					stream_SEP_SEMICOLON.add(SEP_SEMICOLON170);

					// AST REWRITE
					// elements: main_declaration
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 389:37: -> main_declaration
					{
						adaptor.addChild(root_0, stream_main_declaration.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:390:4: main_assignment SEP_SEMICOLON
					{
					pushFollow(FOLLOW_main_assignment_in_main_instruction1662);
					main_assignment171=main_assignment();
					state._fsp--;

					stream_main_assignment.add(main_assignment171.getTree());
					SEP_SEMICOLON172=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_main_instruction1664);  
					stream_SEP_SEMICOLON.add(SEP_SEMICOLON172);

					// AST REWRITE
					// elements: main_assignment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 390:35: -> main_assignment
					{
						adaptor.addChild(root_0, stream_main_assignment.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_instruction"


	public static class main_declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_declaration"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:393:1: main_declaration : dt= ID ids -> ^( DECLARATION $dt ids ) ;
	public final RecParser.main_declaration_return main_declaration() throws RecognitionException {
		RecParser.main_declaration_return retval = new RecParser.main_declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token dt=null;
		ParserRuleReturnScope ids173 =null;

		Object dt_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_ids=new RewriteRuleSubtreeStream(adaptor,"rule ids");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:394:2: (dt= ID ids -> ^( DECLARATION $dt ids ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:394:4: dt= ID ids
			{
			dt=(Token)match(input,ID,FOLLOW_ID_in_main_declaration1682);  
			stream_ID.add(dt);

			pushFollow(FOLLOW_ids_in_main_declaration1684);
			ids173=ids();
			state._fsp--;

			stream_ids.add(ids173.getTree());
			// AST REWRITE
			// elements: dt, ids
			// token labels: dt
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_dt=new RewriteRuleTokenStream(adaptor,"token dt",dt);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 395:3: -> ^( DECLARATION $dt ids )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:395:6: ^( DECLARATION $dt ids )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION, "DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_dt.nextNode());
				adaptor.addChild(root_1, stream_ids.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_declaration"


	public static class main_assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "main_assignment"
	// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:398:1: main_assignment : ( (dt= ID )? ids OP_EQUAL )? id2= ID OP_APPLY reconfiguration_call -> ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) ) ;
	public final RecParser.main_assignment_return main_assignment() throws RecognitionException {
		RecParser.main_assignment_return retval = new RecParser.main_assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token dt=null;
		Token id2=null;
		Token OP_EQUAL175=null;
		Token OP_APPLY176=null;
		ParserRuleReturnScope ids174 =null;
		ParserRuleReturnScope reconfiguration_call177 =null;

		Object dt_tree=null;
		Object id2_tree=null;
		Object OP_EQUAL175_tree=null;
		Object OP_APPLY176_tree=null;
		RewriteRuleTokenStream stream_OP_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_EQUAL");
		RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_ids=new RewriteRuleSubtreeStream(adaptor,"rule ids");
		RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");

		try {
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:399:2: ( ( (dt= ID )? ids OP_EQUAL )? id2= ID OP_APPLY reconfiguration_call -> ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) ) )
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:399:4: ( (dt= ID )? ids OP_EQUAL )? id2= ID OP_APPLY reconfiguration_call
			{
			// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:399:4: ( (dt= ID )? ids OP_EQUAL )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==ID) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==ID||LA39_1==OP_EQUAL||LA39_1==SEP_COMMA) ) {
					alt39=1;
				}
			}
			switch (alt39) {
				case 1 :
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:399:5: (dt= ID )? ids OP_EQUAL
					{
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:399:7: (dt= ID )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==ID) ) {
						int LA38_1 = input.LA(2);
						if ( (LA38_1==ID) ) {
							alt38=1;
						}
					}
					switch (alt38) {
						case 1 :
							// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:399:7: dt= ID
							{
							dt=(Token)match(input,ID,FOLLOW_ID_in_main_assignment1711);  
							stream_ID.add(dt);

							}
							break;

					}

					pushFollow(FOLLOW_ids_in_main_assignment1714);
					ids174=ids();
					state._fsp--;

					stream_ids.add(ids174.getTree());
					OP_EQUAL175=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_main_assignment1716);  
					stream_OP_EQUAL.add(OP_EQUAL175);

					}
					break;

			}

			id2=(Token)match(input,ID,FOLLOW_ID_in_main_assignment1722);  
			stream_ID.add(id2);

			OP_APPLY176=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1724);  
			stream_OP_APPLY.add(OP_APPLY176);

			pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1726);
			reconfiguration_call177=reconfiguration_call();
			state._fsp--;

			stream_reconfiguration_call.add(reconfiguration_call177.getTree());
			// AST REWRITE
			// elements: ids, dt, OP_APPLY, reconfiguration_call, id2
			// token labels: dt, id2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_dt=new RewriteRuleTokenStream(adaptor,"token dt",dt);
			RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 400:3: -> ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) )
			{
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:400:6: ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPLICATION, "APPLICATION"), root_1);
				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:400:20: ( ^( DECLARATION ( $dt)? ids ) )?
				if ( stream_ids.hasNext()||stream_dt.hasNext() ) {
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:400:22: ^( DECLARATION ( $dt)? ids )
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION, "DECLARATION"), root_2);
					// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:400:37: ( $dt)?
					if ( stream_dt.hasNext() ) {
						adaptor.addChild(root_2, stream_dt.nextNode());
					}
					stream_dt.reset();

					adaptor.addChild(root_2, stream_ids.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_ids.reset();
				stream_dt.reset();

				// /Users/flaviorodrigues/Documents/GitHub/doctools/ReoLang/ReoLangSpecs/RecParser.g:400:49: ^( OP_APPLY $id2 reconfiguration_call )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_OP_APPLY.nextNode(), root_2);
				adaptor.addChild(root_2, stream_id2.nextNode());
				adaptor.addChild(root_2, stream_reconfiguration_call.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "main_assignment"

	// Delegated rules


	protected DFA37 dfa37 = new DFA37(this);
	static final String DFA37_eotS =
		"\7\uffff";
	static final String DFA37_eofS =
		"\7\uffff";
	static final String DFA37_minS =
		"\2\24\1\uffff\1\33\1\24\1\uffff\1\33";
	static final String DFA37_maxS =
		"\1\24\1\72\1\uffff\1\76\1\24\1\uffff\1\76";
	static final String DFA37_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\1\uffff";
	static final String DFA37_specialS =
		"\7\uffff}>";
	static final String[] DFA37_transitionS = {
			"\1\1",
			"\1\3\2\uffff\1\2\3\uffff\1\2\36\uffff\1\2",
			"",
			"\1\2\36\uffff\1\4\3\uffff\1\5",
			"\1\6",
			"",
			"\1\2\36\uffff\1\4\3\uffff\1\5"
	};

	static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
	static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
	static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
	static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
	static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
	static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
	static final short[][] DFA37_transition;

	static {
		int numStates = DFA37_transitionS.length;
		DFA37_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
		}
	}

	protected class DFA37 extends DFA {

		public DFA37(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 37;
			this.eot = DFA37_eot;
			this.eof = DFA37_eof;
			this.min = DFA37_min;
			this.max = DFA37_max;
			this.accept = DFA37_accept;
			this.special = DFA37_special;
			this.transition = DFA37_transition;
		}
		@Override
		public String getDescription() {
			return "388:1: main_instruction : ( main_declaration SEP_SEMICOLON -> main_declaration | main_assignment SEP_SEMICOLON -> main_assignment );";
		}
	}

	public static final BitSet FOLLOW_directive_def_in_reclang144 = new BitSet(new long[]{0x000E000000100000L});
	public static final BitSet FOLLOW_content_in_reclang147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_directive_import_in_directive_def174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RW_IMPORT_in_directive_import194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_STRING_in_directive_import196 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_directive_import202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_element_in_content231 = new BitSet(new long[]{0x000C000000100002L});
	public static final BitSet FOLLOW_main_in_content234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_def_in_element249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_applicaiton_def_in_element262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_def_in_main284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def306 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_def308 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_START_in_reconfiguration_def310 = new BitSet(new long[]{0x002000000003FC00L});
	public static final BitSet FOLLOW_args_def_in_reconfiguration_def312 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_END_in_reconfiguration_def315 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arg_def_in_args_def342 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_args_def345 = new BitSet(new long[]{0x000000000003FC00L});
	public static final BitSet FOLLOW_arg_def_in_args_def347 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_datatype_in_arg_def373 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_list_ids_in_arg_def375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_PATTERN_in_datatype400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_CHANNEL_in_datatype407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NAME_in_datatype412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_NODE_in_datatype417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DT_XOR_in_datatype422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_other_type_in_datatype427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_datatype429 = new BitSet(new long[]{0x000000000003FC00L});
	public static final BitSet FOLLOW_subtype_in_datatype431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_datatype433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datatype_in_subtype473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_list_ids486 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_SEP_COMMA_in_list_ids489 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_list_ids491 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_START_in_reconfiguration_block513 = new BitSet(new long[]{0x000100000093FC00L});
	public static final BitSet FOLLOW_instruction_in_reconfiguration_block515 = new BitSet(new long[]{0x008100000093FC00L});
	public static final BitSet FOLLOW_SEP_BLOCK_END_in_reconfiguration_block518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_instruction546 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_instruction559 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_instruction571 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_instruction_in_instruction582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_apply601 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply604 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_datatype_in_declaration630 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_var_def_in_declaration632 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_SEP_COMMA_in_declaration635 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_var_def_in_declaration637 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_var_def662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_var_def667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment680 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_OP_EQUAL_in_assignment682 = new BitSet(new long[]{0x00004080009001C0L});
	public static final BitSet FOLLOW_assignment_member_in_assignment684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assignment_member710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call730 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call735 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call740 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call745 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call750 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call755 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_ID_in_reconfiguration_call760 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_operation_args_in_reconfiguration_call764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call780 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call785 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_operation_args_in_structure_operation_call790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_ARGS_START_in_operation_args805 = new BitSet(new long[]{0x00204080001001C0L});
	public static final BitSet FOLLOW_args_in_operation_args807 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_END_in_operation_args810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_args827 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_SEP_COMMA_in_args830 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_expression_in_args832 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_RW_FORALL_in_for_instruction856 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_START_in_for_instruction858 = new BitSet(new long[]{0x000000000003FC00L});
	public static final BitSet FOLLOW_datatype_in_for_instruction860 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_for_instruction862 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_SEP_COLON_in_for_instruction864 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_for_instruction866 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_END_in_for_instruction868 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_factor_in_expression900 = new BitSet(new long[]{0x0000200280000002L});
	public static final BitSet FOLLOW_expr_op_in_expression903 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_factor_in_expression906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_factor945 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_factor947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_factor949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operation_in_factor983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructor_in_factor988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operation1000 = new BitSet(new long[]{0x8010000000000000L});
	public static final BitSet FOLLOW_SEP_STRUCTURE_in_operation1003 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_operation1005 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_SEP_ACCESSOR_in_operation1009 = new BitSet(new long[]{0x0000143C50100000L});
	public static final BitSet FOLLOW_attribute_call_in_operation1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_structure_operation_call_in_operation1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triple_cons_in_constructor1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_pair_cons_in_constructor1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_cons_in_constructor1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_IN_in_attribute_call1117 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1120 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_INT_in_attribute_call1122 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_OUT_in_attribute_call1143 = new BitSet(new long[]{0x1000000000000002L});
	public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1146 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_INT_in_attribute_call1148 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NAME_in_attribute_call1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NODES_in_attribute_call1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_FST_in_attribute_call1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_SND_in_attribute_call1221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_TRD_in_attribute_call1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_attribute_call1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONS_TRIPLE_in_triple_cons1272 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_START_in_triple_cons1274 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_expression_in_triple_cons1276 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1278 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_expression_in_triple_cons1280 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1282 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_expression_in_triple_cons1284 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_END_in_triple_cons1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONS_PAIR_in_pair_cons1315 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_START_in_pair_cons1317 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_expression_in_pair_cons1319 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_SEP_COMMA_in_pair_cons1321 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_expression_in_pair_cons1323 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_END_in_pair_cons1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONS_SET_in_set_cons1353 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_START_in_set_cons1355 = new BitSet(new long[]{0x00204080001001C0L});
	public static final BitSet FOLLOW_expression_in_set_cons1360 = new BitSet(new long[]{0x0420000000000000L});
	public static final BitSet FOLLOW_SEP_COMMA_in_set_cons1363 = new BitSet(new long[]{0x00004080001001C0L});
	public static final BitSet FOLLOW_expression_in_set_cons1365 = new BitSet(new long[]{0x0420000000000000L});
	public static final BitSet FOLLOW_SEP_ARGS_END_in_set_cons1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_applicaiton_def1403 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OP_APPLY_in_applicaiton_def1405 = new BitSet(new long[]{0x01000A4122100000L});
	public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1408 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
	public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1437 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1440 = new BitSet(new long[]{0x0480000000000002L});
	public static final BitSet FOLLOW_SEP_COMMA_in_list_reconfigurations1443 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1445 = new BitSet(new long[]{0x0480000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_TRIGGER_in_trigger_def1468 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_trigger_block_in_trigger_def1470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1489 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RW_MAIN_in_main_def1505 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SEP_LIST_START_in_main_def1507 = new BitSet(new long[]{0x0800000000100000L});
	public static final BitSet FOLLOW_main_args_in_main_def1509 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SEP_LIST_END_in_main_def1512 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_main_block_in_main_def1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_arg_in_main_args1534 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_main_args1537 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_main_arg_in_main_args1539 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_ID_in_main_arg1566 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ids_in_main_arg1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ids1592 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_SEP_COMMA_in_ids1595 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_ids1597 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_SEP_BLOCK_START_in_main_block1622 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_main_instruction_in_main_block1624 = new BitSet(new long[]{0x0080000000100000L});
	public static final BitSet FOLLOW_SEP_BLOCK_END_in_main_block1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_declaration_in_main_instruction1649 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_main_instruction1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_main_assignment_in_main_instruction1662 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_SEP_SEMICOLON_in_main_instruction1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_main_declaration1682 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ids_in_main_declaration1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_main_assignment1711 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ids_in_main_assignment1714 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_OP_EQUAL_in_main_assignment1716 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_main_assignment1722 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1724 = new BitSet(new long[]{0x00000A4122100000L});
	public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1726 = new BitSet(new long[]{0x0000000000000002L});
}
