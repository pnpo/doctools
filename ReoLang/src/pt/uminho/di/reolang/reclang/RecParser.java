// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g 2014-05-22 21:27:48

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.SimpleError;
	import pt.uminho.di.reolang.parsing.util.ErrorType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "RW_MAIN", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_XOR", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_ENDS", "OP_NODES", "OP_NAMES", "OP_CHANNELS", "OP_READ", "OP_WRITE", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", "CONS_SET", "CONS_NODE", "CONS_XOR", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "ARGUMENTS", "ARGUMENT", "SUBTYPE", "INSTRUCTIONS", "DECLARATION", "ASSIGNMENT", "FORALL", "TRIPLE", "PAIR", "SET", "NODE", "XOR", "IN", "OUT", "ACCESS", "STRUCTURE", "APPLICATION", "MAIN", "IDS", "SIGNATURE"
    };
    public static final int OP_NODES=31;
    public static final int MAIN=90;
    public static final int CONS_PAIR=56;
    public static final int SEP_OPTIONAL=48;
    public static final int APPLICATION=89;
    public static final int CONS_NODE=59;
    public static final int SEP_COLON=45;
    public static final int SEP_SUBTYPE_END=53;
    public static final int OP_TRD=26;
    public static final int OP_JOIN=17;
    public static final int OCTAL_ESC=69;
    public static final int DT_PAIR=14;
    public static final int IDS=91;
    public static final int SUBTYPE=75;
    public static final int OP_INTERSECTION=38;
    public static final int ID=61;
    public static final int EOF=-1;
    public static final int DECLARATION=77;
    public static final int DT_NODE=11;
    public static final int STRUCTURE=88;
    public static final int DT_SET=13;
    public static final int OP_ID=21;
    public static final int INSTRUCTIONS=76;
    public static final int IMPORT=71;
    public static final int ESC_SEQ=65;
    public static final int SEP_ACCESSOR=54;
    public static final int IN=85;
    public static final int OP_MINUS=39;
    public static final int RECONFIGS=70;
    public static final int DT_XOR=12;
    public static final int RW_FORALL=5;
    public static final int ARGUMENT=74;
    public static final int SEP_LIST_START=50;
    public static final int RW_RECONFIGURATION=4;
    public static final int ACCESS=87;
    public static final int SEP_ARGS_END=47;
    public static final int OP_FST=24;
    public static final int PAIR=81;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=30;
    public static final int TRIPLE=80;
    public static final int OP_APPLY=36;
    public static final int COMMENT=63;
    public static final int OP_PATH=22;
    public static final int OP_SND=25;
    public static final int SEP_LIST_END=51;
    public static final int SEP_STRUCTURE=55;
    public static final int OP_SPLIT=18;
    public static final int OP_OUT=28;
    public static final int CONS_SET=58;
    public static final int XOR=84;
    public static final int NODE=83;
    public static final int ARGUMENTS=73;
    public static final int OP_NAMES=32;
    public static final int SEP_COMMA=43;
    public static final int SEP_ARGS_START=46;
    public static final int DT_TRIPLE=15;
    public static final int SEP_BLOCK_START=41;
    public static final int OP_UPDATE=23;
    public static final int UNICODE_ESC=68;
    public static final int FORALL=79;
    public static final int OP_REMOVE=19;
    public static final int OP_PAR=16;
    public static final int HEX_DIGIT=67;
    public static final int SET=82;
    public static final int INT=62;
    public static final int SIGNATURE=92;
    public static final int OP_IN=27;
    public static final int OP_WRITE=35;
    public static final int CONS_XOR=60;
    public static final int OP_READ=34;
    public static final int RECONFIGURATION=72;
    public static final int WS=64;
    public static final int OUT=86;
    public static final int OP_CHANNELS=33;
    public static final int CONS_TRIPLE=57;
    public static final int RW_MAIN=7;
    public static final int SEP_SEMICOLON=44;
    public static final int SEP_SUBTYPE_START=52;
    public static final int SEP_BLOCK_END=42;
    public static final int OP_CONST=20;
    public static final int ASSIGNMENT=78;
    public static final int OP_EQUAL=40;
    public static final int DT_PATTERN=8;
    public static final int OP_NAME=29;
    public static final int DT_CHANNEL=9;
    public static final int OP_UNION=37;
    public static final int SEP_TRIGGER=49;
    public static final int STRING=66;
    public static final int DT_NAME=10;

    // delegates
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

    public String[] getTokenNames() { return RecParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g"; }


    	private ArrayList<SimpleError> syntax_errors = new ArrayList<SimpleError>();
    	
    	@Override
    	public void emitErrorMessage(String msg) {
            	syntax_errors.add(new SimpleError(ErrorType.ERROR, msg));
    	}
    	
    	//Notice the access to the errors of the imported grammars
    	public ArrayList<SimpleError> getErrors() {
    		return this.syntax_errors;
    	}


    public static class reclang_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:59:1: reclang : ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final RecParser.reclang_return reclang() throws RecognitionException {
        RecParser.reclang_return retval = new RecParser.reclang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_def_return directive_def1 = null;

        RecParser.element_return element2 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        RewriteRuleSubtreeStream stream_directive_def=new RewriteRuleSubtreeStream(adaptor,"rule directive_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:60:2: ( ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:60:5: ( directive_def )* ( element )*
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:60:5: ( directive_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RW_IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:60:5: directive_def
            	    {
            	    pushFollow(FOLLOW_directive_def_in_reclang145);
            	    directive_def1=directive_def();

            	    state._fsp--;

            	    stream_directive_def.add(directive_def1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:60:20: ( element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RW_RECONFIGURATION||LA2_0==RW_MAIN||LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:60:20: element
            	    {
            	    pushFollow(FOLLOW_element_in_reclang148);
            	    element2=element();

            	    state._fsp--;

            	    stream_element.add(element2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);



            // AST REWRITE
            // elements: element, directive_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:3: -> ^( RECONFIGS ( directive_def )* ( element )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:61:6: ^( RECONFIGS ( directive_def )* ( element )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECONFIGS, "RECONFIGS"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:61:18: ( directive_def )*
                while ( stream_directive_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_directive_def.nextTree());

                }
                stream_directive_def.reset();
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:61:33: ( element )*
                while ( stream_element.hasNext() ) {
                    adaptor.addChild(root_1, stream_element.nextTree());

                }
                stream_element.reset();

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
        }
        return retval;
    }
    // $ANTLR end "reclang"

    public static class directive_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:67:1: directive_def : directive_import -> directive_import ;
    public final RecParser.directive_def_return directive_def() throws RecognitionException {
        RecParser.directive_def_return retval = new RecParser.directive_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_import_return directive_import3 = null;


        RewriteRuleSubtreeStream stream_directive_import=new RewriteRuleSubtreeStream(adaptor,"rule directive_import");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:68:2: ( directive_import -> directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:68:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def177);
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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:3: -> directive_import
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
        }
        return retval;
    }
    // $ANTLR end "directive_def"

    public static class directive_import_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive_import"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:73:1: directive_import : RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:74:2: ( RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:74:4: RW_IMPORT STRING SEP_SEMICOLON
            {
            RW_IMPORT4=(Token)match(input,RW_IMPORT,FOLLOW_RW_IMPORT_in_directive_import197);  
            stream_RW_IMPORT.add(RW_IMPORT4);

            STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_directive_import199);  
            stream_STRING.add(STRING5);

            SEP_SEMICOLON6=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_directive_import201);  
            stream_SEP_SEMICOLON.add(SEP_SEMICOLON6);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:3: -> ^( IMPORT STRING )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:75:6: ^( IMPORT STRING )
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
        }
        return retval;
    }
    // $ANTLR end "directive_import"

    public static class element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:83:1: element : ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) | main_def -> ^( MAIN main_def ) );
    public final RecParser.element_return element() throws RecognitionException {
        RecParser.element_return retval = new RecParser.element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.reconfiguration_def_return reconfiguration_def7 = null;

        RecParser.applicaiton_def_return applicaiton_def8 = null;

        RecParser.main_def_return main_def9 = null;


        RewriteRuleSubtreeStream stream_reconfiguration_def=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_def");
        RewriteRuleSubtreeStream stream_applicaiton_def=new RewriteRuleSubtreeStream(adaptor,"rule applicaiton_def");
        RewriteRuleSubtreeStream stream_main_def=new RewriteRuleSubtreeStream(adaptor,"rule main_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:84:2: ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) | main_def -> ^( MAIN main_def ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RW_RECONFIGURATION:
                {
                alt3=1;
                }
                break;
            case ID:
                {
                alt3=2;
                }
                break;
            case RW_MAIN:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:84:4: reconfiguration_def
                    {
                    pushFollow(FOLLOW_reconfiguration_def_in_element229);
                    reconfiguration_def7=reconfiguration_def();

                    state._fsp--;

                    stream_reconfiguration_def.add(reconfiguration_def7.getTree());


                    // AST REWRITE
                    // elements: reconfiguration_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 84:24: -> ^( RECONFIGURATION reconfiguration_def )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:84:27: ^( RECONFIGURATION reconfiguration_def )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:85:4: applicaiton_def
                    {
                    pushFollow(FOLLOW_applicaiton_def_in_element242);
                    applicaiton_def8=applicaiton_def();

                    state._fsp--;

                    stream_applicaiton_def.add(applicaiton_def8.getTree());


                    // AST REWRITE
                    // elements: applicaiton_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 85:21: -> ^( APPLICATION applicaiton_def )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:85:24: ^( APPLICATION applicaiton_def )
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
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:86:5: main_def
                    {
                    pushFollow(FOLLOW_main_def_in_element258);
                    main_def9=main_def();

                    state._fsp--;

                    stream_main_def.add(main_def9.getTree());


                    // AST REWRITE
                    // elements: main_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 86:15: -> ^( MAIN main_def )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:86:18: ^( MAIN main_def )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MAIN, "MAIN"), root_1);

                        adaptor.addChild(root_1, stream_main_def.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class reconfiguration_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:91:1: reconfiguration_def : RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) ;
    public final RecParser.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
        RecParser.reconfiguration_def_return retval = new RecParser.reconfiguration_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_RECONFIGURATION10=null;
        Token ID11=null;
        Token SEP_ARGS_START12=null;
        Token SEP_ARGS_END14=null;
        RecParser.args_def_return args_def13 = null;

        RecParser.reconfiguration_block_return reconfiguration_block15 = null;


        Object RW_RECONFIGURATION10_tree=null;
        Object ID11_tree=null;
        Object SEP_ARGS_START12_tree=null;
        Object SEP_ARGS_END14_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_RW_RECONFIGURATION=new RewriteRuleTokenStream(adaptor,"token RW_RECONFIGURATION");
        RewriteRuleSubtreeStream stream_reconfiguration_block=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_block");
        RewriteRuleSubtreeStream stream_args_def=new RewriteRuleSubtreeStream(adaptor,"rule args_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:92:2: ( RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:92:4: RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block
            {
            RW_RECONFIGURATION10=(Token)match(input,RW_RECONFIGURATION,FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def280);  
            stream_RW_RECONFIGURATION.add(RW_RECONFIGURATION10);

            ID11=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_def282);  
            stream_ID.add(ID11);

            SEP_ARGS_START12=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_reconfiguration_def284);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START12);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:92:41: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=DT_PATTERN && LA4_0<=DT_TRIPLE)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:92:41: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def286);
                    args_def13=args_def();

                    state._fsp--;

                    stream_args_def.add(args_def13.getTree());

                    }
                    break;

            }

            SEP_ARGS_END14=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_reconfiguration_def289);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END14);

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def291);
            reconfiguration_block15=reconfiguration_block();

            state._fsp--;

            stream_reconfiguration_block.add(reconfiguration_block15.getTree());


            // AST REWRITE
            // elements: ID, reconfiguration_block, args_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 93:3: -> ^( ID ( args_def )? reconfiguration_block )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:93:6: ^( ID ( args_def )? reconfiguration_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:93:11: ( args_def )?
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
        }
        return retval;
    }
    // $ANTLR end "reconfiguration_def"

    public static class args_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:96:1: args_def : arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) ;
    public final RecParser.args_def_return args_def() throws RecognitionException {
        RecParser.args_def_return retval = new RecParser.args_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON17=null;
        RecParser.arg_def_return arg_def16 = null;

        RecParser.arg_def_return arg_def18 = null;


        Object SEP_SEMICOLON17_tree=null;
        RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
        RewriteRuleSubtreeStream stream_arg_def=new RewriteRuleSubtreeStream(adaptor,"rule arg_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:97:2: ( arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:97:4: arg_def ( SEP_SEMICOLON arg_def )*
            {
            pushFollow(FOLLOW_arg_def_in_args_def316);
            arg_def16=arg_def();

            state._fsp--;

            stream_arg_def.add(arg_def16.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:97:12: ( SEP_SEMICOLON arg_def )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==SEP_SEMICOLON) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:97:13: SEP_SEMICOLON arg_def
            	    {
            	    SEP_SEMICOLON17=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_args_def319);  
            	    stream_SEP_SEMICOLON.add(SEP_SEMICOLON17);

            	    pushFollow(FOLLOW_arg_def_in_args_def321);
            	    arg_def18=arg_def();

            	    state._fsp--;

            	    stream_arg_def.add(arg_def18.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: arg_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:3: -> ^( ARGUMENTS ( arg_def )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:98:6: ^( ARGUMENTS ( arg_def )+ )
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
        }
        return retval;
    }
    // $ANTLR end "args_def"

    public static class arg_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:101:1: arg_def : datatype list_ids -> ^( ARGUMENT datatype list_ids ) ;
    public final RecParser.arg_def_return arg_def() throws RecognitionException {
        RecParser.arg_def_return retval = new RecParser.arg_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.datatype_return datatype19 = null;

        RecParser.list_ids_return list_ids20 = null;


        RewriteRuleSubtreeStream stream_list_ids=new RewriteRuleSubtreeStream(adaptor,"rule list_ids");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:102:2: ( datatype list_ids -> ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:102:5: datatype list_ids
            {
            pushFollow(FOLLOW_datatype_in_arg_def347);
            datatype19=datatype();

            state._fsp--;

            stream_datatype.add(datatype19.getTree());
            pushFollow(FOLLOW_list_ids_in_arg_def349);
            list_ids20=list_ids();

            state._fsp--;

            stream_list_ids.add(list_ids20.getTree());


            // AST REWRITE
            // elements: datatype, list_ids
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:3: -> ^( ARGUMENT datatype list_ids )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:103:6: ^( ARGUMENT datatype list_ids )
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
        }
        return retval;
    }
    // $ANTLR end "arg_def"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:106:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END -> ^( other_type subtype ) );
    public final RecParser.datatype_return datatype() throws RecognitionException {
        RecParser.datatype_return retval = new RecParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DT_PATTERN21=null;
        Token DT_CHANNEL22=null;
        Token DT_NAME23=null;
        Token DT_NODE24=null;
        Token DT_XOR25=null;
        Token SEP_SUBTYPE_START27=null;
        Token SEP_SUBTYPE_END29=null;
        RecParser.other_type_return other_type26 = null;

        RecParser.subtype_return subtype28 = null;


        Object DT_PATTERN21_tree=null;
        Object DT_CHANNEL22_tree=null;
        Object DT_NAME23_tree=null;
        Object DT_NODE24_tree=null;
        Object DT_XOR25_tree=null;
        Object SEP_SUBTYPE_START27_tree=null;
        Object SEP_SUBTYPE_END29_tree=null;
        RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");
        RewriteRuleSubtreeStream stream_subtype=new RewriteRuleSubtreeStream(adaptor,"rule subtype");
        RewriteRuleSubtreeStream stream_other_type=new RewriteRuleSubtreeStream(adaptor,"rule other_type");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:107:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END -> ^( other_type subtype ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case DT_PATTERN:
                {
                alt6=1;
                }
                break;
            case DT_CHANNEL:
                {
                alt6=2;
                }
                break;
            case DT_NAME:
                {
                alt6=3;
                }
                break;
            case DT_NODE:
                {
                alt6=4;
                }
                break;
            case DT_XOR:
                {
                alt6=5;
                }
                break;
            case DT_SET:
            case DT_PAIR:
            case DT_TRIPLE:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:107:5: DT_PATTERN
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_PATTERN21=(Token)match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype374); 
                    DT_PATTERN21_tree = (Object)adaptor.create(DT_PATTERN21);
                    adaptor.addChild(root_0, DT_PATTERN21_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:108:5: DT_CHANNEL
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_CHANNEL22=(Token)match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype381); 
                    DT_CHANNEL22_tree = (Object)adaptor.create(DT_CHANNEL22);
                    adaptor.addChild(root_0, DT_CHANNEL22_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:109:4: DT_NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_NAME23=(Token)match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype386); 
                    DT_NAME23_tree = (Object)adaptor.create(DT_NAME23);
                    adaptor.addChild(root_0, DT_NAME23_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:110:4: DT_NODE
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_NODE24=(Token)match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype391); 
                    DT_NODE24_tree = (Object)adaptor.create(DT_NODE24);
                    adaptor.addChild(root_0, DT_NODE24_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:111:4: DT_XOR
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_XOR25=(Token)match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype396); 
                    DT_XOR25_tree = (Object)adaptor.create(DT_XOR25);
                    adaptor.addChild(root_0, DT_XOR25_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:112:4: other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END
                    {
                    pushFollow(FOLLOW_other_type_in_datatype401);
                    other_type26=other_type();

                    state._fsp--;

                    stream_other_type.add(other_type26.getTree());
                    SEP_SUBTYPE_START27=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_datatype403);  
                    stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START27);

                    pushFollow(FOLLOW_subtype_in_datatype405);
                    subtype28=subtype();

                    state._fsp--;

                    stream_subtype.add(subtype28.getTree());
                    SEP_SUBTYPE_END29=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_datatype407);  
                    stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END29);



                    // AST REWRITE
                    // elements: subtype, other_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:57: -> ^( other_type subtype )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:112:60: ^( other_type subtype )
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
        }
        return retval;
    }
    // $ANTLR end "datatype"

    public static class other_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "other_type"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:115:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final RecParser.other_type_return other_type() throws RecognitionException {
        RecParser.other_type_return retval = new RecParser.other_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set30=null;

        Object set30_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:116:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set30=(Token)input.LT(1);
            if ( (input.LA(1)>=DT_SET && input.LA(1)<=DT_TRIPLE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set30));
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
        }
        return retval;
    }
    // $ANTLR end "other_type"

    public static class subtype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subtype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:119:1: subtype : datatype ;
    public final RecParser.subtype_return subtype() throws RecognitionException {
        RecParser.subtype_return retval = new RecParser.subtype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.datatype_return datatype31 = null;



        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:120:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:120:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_subtype447);
            datatype31=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype31.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "subtype"

    public static class list_ids_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:123:1: list_ids : ID ( SEP_COMMA ID )* -> ( ID )+ ;
    public final RecParser.list_ids_return list_ids() throws RecognitionException {
        RecParser.list_ids_return retval = new RecParser.list_ids_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID32=null;
        Token SEP_COMMA33=null;
        Token ID34=null;

        Object ID32_tree=null;
        Object SEP_COMMA33_tree=null;
        Object ID34_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:124:2: ( ID ( SEP_COMMA ID )* -> ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:124:4: ID ( SEP_COMMA ID )*
            {
            ID32=(Token)match(input,ID,FOLLOW_ID_in_list_ids460);  
            stream_ID.add(ID32);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:124:7: ( SEP_COMMA ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==SEP_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:124:8: SEP_COMMA ID
            	    {
            	    SEP_COMMA33=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_ids463);  
            	    stream_SEP_COMMA.add(SEP_COMMA33);

            	    ID34=(Token)match(input,ID,FOLLOW_ID_in_list_ids465);  
            	    stream_ID.add(ID34);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 124:23: -> ( ID )+
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
        }
        return retval;
    }
    // $ANTLR end "list_ids"

    public static class reconfiguration_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reconfiguration_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:128:1: reconfiguration_block : SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) ;
    public final RecParser.reconfiguration_block_return reconfiguration_block() throws RecognitionException {
        RecParser.reconfiguration_block_return retval = new RecParser.reconfiguration_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START35=null;
        Token SEP_BLOCK_END37=null;
        RecParser.instruction_return instruction36 = null;


        Object SEP_BLOCK_START35_tree=null;
        Object SEP_BLOCK_END37_tree=null;
        RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
        RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:129:2: ( SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:129:4: SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END
            {
            SEP_BLOCK_START35=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_reconfiguration_block487);  
            stream_SEP_BLOCK_START.add(SEP_BLOCK_START35);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:129:20: ( instruction )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RW_FORALL||(LA8_0>=DT_PATTERN && LA8_0<=DT_TRIPLE)||LA8_0==OP_APPLY||LA8_0==ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:129:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block489);
            	    instruction36=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction36.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            SEP_BLOCK_END37=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_reconfiguration_block492);  
            stream_SEP_BLOCK_END.add(SEP_BLOCK_END37);



            // AST REWRITE
            // elements: instruction, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:3: -> ^( INSTRUCTIONS instruction ( instruction )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:130:6: ^( INSTRUCTIONS instruction ( instruction )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTIONS, "INSTRUCTIONS"), root_1);

                adaptor.addChild(root_1, stream_instruction.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:130:33: ( instruction )*
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
        }
        return retval;
    }
    // $ANTLR end "reconfiguration_block"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:133:1: instruction : ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction );
    public final RecParser.instruction_return instruction() throws RecognitionException {
        RecParser.instruction_return retval = new RecParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON39=null;
        Token SEP_SEMICOLON41=null;
        Token SEP_SEMICOLON43=null;
        RecParser.declaration_return declaration38 = null;

        RecParser.assignment_return assignment40 = null;

        RecParser.reconfiguration_apply_return reconfiguration_apply42 = null;

        RecParser.for_instruction_return for_instruction44 = null;


        Object SEP_SEMICOLON39_tree=null;
        Object SEP_SEMICOLON41_tree=null;
        Object SEP_SEMICOLON43_tree=null;
        RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_for_instruction=new RewriteRuleSubtreeStream(adaptor,"rule for_instruction");
        RewriteRuleSubtreeStream stream_reconfiguration_apply=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_apply");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:134:2: ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction )
            int alt9=4;
            switch ( input.LA(1) ) {
            case DT_PATTERN:
            case DT_CHANNEL:
            case DT_NAME:
            case DT_NODE:
            case DT_XOR:
            case DT_SET:
            case DT_PAIR:
            case DT_TRIPLE:
                {
                alt9=1;
                }
                break;
            case ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==OP_EQUAL) ) {
                    alt9=2;
                }
                else if ( (LA9_2==OP_APPLY) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case OP_APPLY:
                {
                alt9=3;
                }
                break;
            case RW_FORALL:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:134:4: declaration SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_declaration_in_instruction520);
                    declaration38=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration38.getTree());
                    SEP_SEMICOLON39=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction522);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON39);



                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 134:32: -> declaration
                    {
                        adaptor.addChild(root_0, stream_declaration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:135:4: assignment SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_assignment_in_instruction533);
                    assignment40=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment40.getTree());
                    SEP_SEMICOLON41=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction535);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON41);



                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 135:30: -> assignment
                    {
                        adaptor.addChild(root_0, stream_assignment.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:136:4: reconfiguration_apply SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction545);
                    reconfiguration_apply42=reconfiguration_apply();

                    state._fsp--;

                    stream_reconfiguration_apply.add(reconfiguration_apply42.getTree());
                    SEP_SEMICOLON43=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction547);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON43);



                    // AST REWRITE
                    // elements: reconfiguration_apply
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 136:40: -> reconfiguration_apply
                    {
                        adaptor.addChild(root_0, stream_reconfiguration_apply.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:137:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction556);
                    for_instruction44=for_instruction();

                    state._fsp--;

                    stream_for_instruction.add(for_instruction44.getTree());


                    // AST REWRITE
                    // elements: for_instruction
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 137:23: -> for_instruction
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
        }
        return retval;
    }
    // $ANTLR end "instruction"

    public static class reconfiguration_apply_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reconfiguration_apply"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:140:1: reconfiguration_apply : ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final RecParser.reconfiguration_apply_return reconfiguration_apply() throws RecognitionException {
        RecParser.reconfiguration_apply_return retval = new RecParser.reconfiguration_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID45=null;
        Token OP_APPLY46=null;
        RecParser.reconfiguration_call_return reconfiguration_call47 = null;


        Object ID45_tree=null;
        Object OP_APPLY46_tree=null;
        RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:141:2: ( ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:141:4: ( ID )? OP_APPLY reconfiguration_call
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:141:4: ( ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:141:4: ID
                    {
                    ID45=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_apply575);  
                    stream_ID.add(ID45);


                    }
                    break;

            }

            OP_APPLY46=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply578);  
            stream_OP_APPLY.add(OP_APPLY46);

            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply580);
            reconfiguration_call47=reconfiguration_call();

            state._fsp--;

            stream_reconfiguration_call.add(reconfiguration_call47.getTree());


            // AST REWRITE
            // elements: OP_APPLY, reconfiguration_call, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:38: -> ^( OP_APPLY reconfiguration_call ( ID )? )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:141:41: ^( OP_APPLY reconfiguration_call ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_OP_APPLY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_reconfiguration_call.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:141:73: ( ID )?
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
        }
        return retval;
    }
    // $ANTLR end "reconfiguration_apply"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:144:1: declaration : datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) ;
    public final RecParser.declaration_return declaration() throws RecognitionException {
        RecParser.declaration_return retval = new RecParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA50=null;
        RecParser.datatype_return datatype48 = null;

        RecParser.var_def_return var_def49 = null;

        RecParser.var_def_return var_def51 = null;


        Object SEP_COMMA50_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleSubtreeStream stream_var_def=new RewriteRuleSubtreeStream(adaptor,"rule var_def");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:2: ( datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:4: datatype var_def ( SEP_COMMA var_def )*
            {
            pushFollow(FOLLOW_datatype_in_declaration604);
            datatype48=datatype();

            state._fsp--;

            stream_datatype.add(datatype48.getTree());
            pushFollow(FOLLOW_var_def_in_declaration606);
            var_def49=var_def();

            state._fsp--;

            stream_var_def.add(var_def49.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:21: ( SEP_COMMA var_def )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==SEP_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:22: SEP_COMMA var_def
            	    {
            	    SEP_COMMA50=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_declaration609);  
            	    stream_SEP_COMMA.add(SEP_COMMA50);

            	    pushFollow(FOLLOW_var_def_in_declaration611);
            	    var_def51=var_def();

            	    state._fsp--;

            	    stream_var_def.add(var_def51.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: var_def, datatype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:42: -> ^( DECLARATION datatype ( var_def )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:45: ^( DECLARATION datatype ( var_def )+ )
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
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class var_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:148:1: var_def : ( ID | assignment );
    public final RecParser.var_def_return var_def() throws RecognitionException {
        RecParser.var_def_return retval = new RecParser.var_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID52=null;
        RecParser.assignment_return assignment53 = null;


        Object ID52_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:2: ( ID | assignment )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==OP_EQUAL) ) {
                    alt12=2;
                }
                else if ( ((LA12_1>=SEP_COMMA && LA12_1<=SEP_SEMICOLON)) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID52=(Token)match(input,ID,FOLLOW_ID_in_var_def636); 
                    ID52_tree = (Object)adaptor.create(ID52);
                    adaptor.addChild(root_0, ID52_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:150:4: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_var_def641);
                    assignment53=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment53.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "var_def"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:153:1: assignment : ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) ;
    public final RecParser.assignment_return assignment() throws RecognitionException {
        RecParser.assignment_return retval = new RecParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID54=null;
        Token OP_EQUAL55=null;
        RecParser.assignment_member_return assignment_member56 = null;


        Object ID54_tree=null;
        Object OP_EQUAL55_tree=null;
        RewriteRuleTokenStream stream_OP_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_assignment_member=new RewriteRuleSubtreeStream(adaptor,"rule assignment_member");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:154:2: ( ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:154:4: ID OP_EQUAL assignment_member
            {
            ID54=(Token)match(input,ID,FOLLOW_ID_in_assignment654);  
            stream_ID.add(ID54);

            OP_EQUAL55=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_assignment656);  
            stream_OP_EQUAL.add(OP_EQUAL55);

            pushFollow(FOLLOW_assignment_member_in_assignment658);
            assignment_member56=assignment_member();

            state._fsp--;

            stream_assignment_member.add(assignment_member56.getTree());


            // AST REWRITE
            // elements: assignment_member, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 154:36: -> ^( ASSIGNMENT ID assignment_member )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:154:39: ^( ASSIGNMENT ID assignment_member )
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
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class assignment_member_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_member"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:157:1: assignment_member : ( expression | reconfiguration_apply );
    public final RecParser.assignment_member_return assignment_member() throws RecognitionException {
        RecParser.assignment_member_return retval = new RecParser.assignment_member_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.expression_return expression57 = null;

        RecParser.reconfiguration_apply_return reconfiguration_apply58 = null;



        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:158:2: ( expression | reconfiguration_apply )
            int alt13=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=OP_UNION && LA13_1<=OP_MINUS)||(LA13_1>=SEP_COMMA && LA13_1<=SEP_SEMICOLON)||LA13_1==SEP_SUBTYPE_START||(LA13_1>=SEP_ACCESSOR && LA13_1<=SEP_STRUCTURE)) ) {
                    alt13=1;
                }
                else if ( (LA13_1==OP_APPLY) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_PATH:
            case OP_UPDATE:
            case CONS_PAIR:
            case CONS_TRIPLE:
            case CONS_SET:
            case CONS_NODE:
            case CONS_XOR:
                {
                alt13=1;
                }
                break;
            case OP_APPLY:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:158:4: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_assignment_member684);
                    expression57=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression57.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:159:4: reconfiguration_apply
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member690);
                    reconfiguration_apply58=reconfiguration_apply();

                    state._fsp--;

                    adaptor.addChild(root_0, reconfiguration_apply58.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "assignment_member"

    public static class reconfiguration_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reconfiguration_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:162:1: reconfiguration_call : ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args ;
    public final RecParser.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecParser.reconfiguration_call_return retval = new RecParser.reconfiguration_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_JOIN59=null;
        Token OP_SPLIT60=null;
        Token OP_PAR61=null;
        Token OP_REMOVE62=null;
        Token OP_CONST63=null;
        Token OP_ID64=null;
        Token ID65=null;
        RecParser.operation_args_return operation_args66 = null;


        Object OP_JOIN59_tree=null;
        Object OP_SPLIT60_tree=null;
        Object OP_PAR61_tree=null;
        Object OP_REMOVE62_tree=null;
        Object OP_CONST63_tree=null;
        Object OP_ID64_tree=null;
        Object ID65_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:2: ( ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:5: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:5: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID )
            int alt14=7;
            switch ( input.LA(1) ) {
            case OP_JOIN:
                {
                alt14=1;
                }
                break;
            case OP_SPLIT:
                {
                alt14=2;
                }
                break;
            case OP_PAR:
                {
                alt14=3;
                }
                break;
            case OP_REMOVE:
                {
                alt14=4;
                }
                break;
            case OP_CONST:
                {
                alt14=5;
                }
                break;
            case OP_ID:
                {
                alt14=6;
                }
                break;
            case ID:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:6: OP_JOIN
                    {
                    OP_JOIN59=(Token)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call704); 
                    OP_JOIN59_tree = (Object)adaptor.create(OP_JOIN59);
                    root_0 = (Object)adaptor.becomeRoot(OP_JOIN59_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:17: OP_SPLIT
                    {
                    OP_SPLIT60=(Token)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call709); 
                    OP_SPLIT60_tree = (Object)adaptor.create(OP_SPLIT60);
                    root_0 = (Object)adaptor.becomeRoot(OP_SPLIT60_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:29: OP_PAR
                    {
                    OP_PAR61=(Token)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call714); 
                    OP_PAR61_tree = (Object)adaptor.create(OP_PAR61);
                    root_0 = (Object)adaptor.becomeRoot(OP_PAR61_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:39: OP_REMOVE
                    {
                    OP_REMOVE62=(Token)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call719); 
                    OP_REMOVE62_tree = (Object)adaptor.create(OP_REMOVE62);
                    root_0 = (Object)adaptor.becomeRoot(OP_REMOVE62_tree, root_0);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:52: OP_CONST
                    {
                    OP_CONST63=(Token)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call724); 
                    OP_CONST63_tree = (Object)adaptor.create(OP_CONST63);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONST63_tree, root_0);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:64: OP_ID
                    {
                    OP_ID64=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call729); 
                    OP_ID64_tree = (Object)adaptor.create(OP_ID64);
                    root_0 = (Object)adaptor.becomeRoot(OP_ID64_tree, root_0);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:163:73: ID
                    {
                    ID65=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_call734); 
                    ID65_tree = (Object)adaptor.create(ID65);
                    root_0 = (Object)adaptor.becomeRoot(ID65_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_operation_args_in_reconfiguration_call738);
            operation_args66=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args66.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "reconfiguration_call"

    public static class structure_operation_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structure_operation_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:167:1: structure_operation_call : ( OP_PATH | OP_UPDATE ) operation_args ;
    public final RecParser.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecParser.structure_operation_call_return retval = new RecParser.structure_operation_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PATH67=null;
        Token OP_UPDATE68=null;
        RecParser.operation_args_return operation_args69 = null;


        Object OP_PATH67_tree=null;
        Object OP_UPDATE68_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:168:2: ( ( OP_PATH | OP_UPDATE ) operation_args )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:168:4: ( OP_PATH | OP_UPDATE ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:168:4: ( OP_PATH | OP_UPDATE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OP_PATH) ) {
                alt15=1;
            }
            else if ( (LA15_0==OP_UPDATE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:168:6: OP_PATH
                    {
                    OP_PATH67=(Token)match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call754); 
                    OP_PATH67_tree = (Object)adaptor.create(OP_PATH67);
                    root_0 = (Object)adaptor.becomeRoot(OP_PATH67_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:168:17: OP_UPDATE
                    {
                    OP_UPDATE68=(Token)match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call759); 
                    OP_UPDATE68_tree = (Object)adaptor.create(OP_UPDATE68);
                    root_0 = (Object)adaptor.becomeRoot(OP_UPDATE68_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_operation_args_in_structure_operation_call764);
            operation_args69=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args69.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "structure_operation_call"

    public static class operation_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:172:1: operation_args : SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? ;
    public final RecParser.operation_args_return operation_args() throws RecognitionException {
        RecParser.operation_args_return retval = new RecParser.operation_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_ARGS_START70=null;
        Token SEP_ARGS_END72=null;
        RecParser.args_return args71 = null;


        Object SEP_ARGS_START70_tree=null;
        Object SEP_ARGS_END72_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:173:2: ( SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:173:4: SEP_ARGS_START ( args )? SEP_ARGS_END
            {
            SEP_ARGS_START70=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_operation_args779);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START70);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:173:19: ( args )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=OP_PATH && LA16_0<=OP_UPDATE)||(LA16_0>=CONS_PAIR && LA16_0<=ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:173:19: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args781);
                    args71=args();

                    state._fsp--;

                    stream_args.add(args71.getTree());

                    }
                    break;

            }

            SEP_ARGS_END72=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_operation_args784);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END72);



            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 173:38: -> ( args )?
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:173:41: ( args )?
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
        }
        return retval;
    }
    // $ANTLR end "operation_args"

    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:176:1: args : expression ( SEP_COMMA expression )* -> ( expression )+ ;
    public final RecParser.args_return args() throws RecognitionException {
        RecParser.args_return retval = new RecParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA74=null;
        RecParser.expression_return expression73 = null;

        RecParser.expression_return expression75 = null;


        Object SEP_COMMA74_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:177:2: ( expression ( SEP_COMMA expression )* -> ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:177:4: expression ( SEP_COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_args801);
            expression73=expression();

            state._fsp--;

            stream_expression.add(expression73.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:177:15: ( SEP_COMMA expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SEP_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:177:16: SEP_COMMA expression
            	    {
            	    SEP_COMMA74=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_args804);  
            	    stream_SEP_COMMA.add(SEP_COMMA74);

            	    pushFollow(FOLLOW_expression_in_args806);
            	    expression75=expression();

            	    state._fsp--;

            	    stream_expression.add(expression75.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 178:3: -> ( expression )+
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
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class for_instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:182:1: for_instruction : RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) ;
    public final RecParser.for_instruction_return for_instruction() throws RecognitionException {
        RecParser.for_instruction_return retval = new RecParser.for_instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_FORALL76=null;
        Token SEP_ARGS_START77=null;
        Token ID79=null;
        Token SEP_COLON80=null;
        Token ID81=null;
        Token SEP_ARGS_END82=null;
        RecParser.datatype_return datatype78 = null;

        RecParser.reconfiguration_block_return reconfiguration_block83 = null;


        Object RW_FORALL76_tree=null;
        Object SEP_ARGS_START77_tree=null;
        Object ID79_tree=null;
        Object SEP_COLON80_tree=null;
        Object ID81_tree=null;
        Object SEP_ARGS_END82_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_COLON=new RewriteRuleTokenStream(adaptor,"token SEP_COLON");
        RewriteRuleTokenStream stream_RW_FORALL=new RewriteRuleTokenStream(adaptor,"token RW_FORALL");
        RewriteRuleSubtreeStream stream_reconfiguration_block=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_block");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:2: ( RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:4: RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
            {
            RW_FORALL76=(Token)match(input,RW_FORALL,FOLLOW_RW_FORALL_in_for_instruction830);  
            stream_RW_FORALL.add(RW_FORALL76);

            SEP_ARGS_START77=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_for_instruction832);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START77);

            pushFollow(FOLLOW_datatype_in_for_instruction834);
            datatype78=datatype();

            state._fsp--;

            stream_datatype.add(datatype78.getTree());
            ID79=(Token)match(input,ID,FOLLOW_ID_in_for_instruction836);  
            stream_ID.add(ID79);

            SEP_COLON80=(Token)match(input,SEP_COLON,FOLLOW_SEP_COLON_in_for_instruction838);  
            stream_SEP_COLON.add(SEP_COLON80);

            ID81=(Token)match(input,ID,FOLLOW_ID_in_for_instruction840);  
            stream_ID.add(ID81);

            SEP_ARGS_END82=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_for_instruction842);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END82);

            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction844);
            reconfiguration_block83=reconfiguration_block();

            state._fsp--;

            stream_reconfiguration_block.add(reconfiguration_block83.getTree());


            // AST REWRITE
            // elements: reconfiguration_block, ID, datatype, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:3: -> ^( FORALL datatype ID ID reconfiguration_block )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:184:6: ^( FORALL datatype ID ID reconfiguration_block )
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
        }
        return retval;
    }
    // $ANTLR end "for_instruction"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:195:1: expression : factor ( expr_op factor )? ;
    public final RecParser.expression_return expression() throws RecognitionException {
        RecParser.expression_return retval = new RecParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.factor_return factor84 = null;

        RecParser.expr_op_return expr_op85 = null;

        RecParser.factor_return factor86 = null;



        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:196:2: ( factor ( expr_op factor )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:196:4: factor ( expr_op factor )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_expression874);
            factor84=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor84.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:196:11: ( expr_op factor )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=OP_UNION && LA18_0<=OP_MINUS)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:196:12: expr_op factor
                    {
                    pushFollow(FOLLOW_expr_op_in_expression877);
                    expr_op85=expr_op();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(expr_op85.getTree(), root_0);
                    pushFollow(FOLLOW_factor_in_expression880);
                    factor86=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor86.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_op"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:199:1: expr_op : ( OP_UNION | OP_INTERSECTION | OP_MINUS );
    public final RecParser.expr_op_return expr_op() throws RecognitionException {
        RecParser.expr_op_return retval = new RecParser.expr_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;

        Object set87_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:200:2: ( OP_UNION | OP_INTERSECTION | OP_MINUS )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set87=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_UNION && input.LA(1)<=OP_MINUS) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set87));
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
        }
        return retval;
    }
    // $ANTLR end "expr_op"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:205:1: factor : ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | operation | constructor );
    public final RecParser.factor_return factor() throws RecognitionException {
        RecParser.factor_return retval = new RecParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID88=null;
        Token SEP_SUBTYPE_START89=null;
        Token ID90=null;
        Token SEP_SUBTYPE_END91=null;
        Token ID92=null;
        RecParser.operation_return operation93 = null;

        RecParser.constructor_return constructor94 = null;


        Object ID88_tree=null;
        Object SEP_SUBTYPE_START89_tree=null;
        Object ID90_tree=null;
        Object SEP_SUBTYPE_END91_tree=null;
        Object ID92_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:206:2: ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | operation | constructor )
            int alt19=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case SEP_SUBTYPE_START:
                    {
                    alt19=1;
                    }
                    break;
                case SEP_ACCESSOR:
                case SEP_STRUCTURE:
                    {
                    alt19=3;
                    }
                    break;
                case OP_UNION:
                case OP_INTERSECTION:
                case OP_MINUS:
                case SEP_COMMA:
                case SEP_SEMICOLON:
                case SEP_ARGS_END:
                    {
                    alt19=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

                }
                break;
            case OP_PATH:
            case OP_UPDATE:
                {
                alt19=3;
                }
                break;
            case CONS_PAIR:
            case CONS_TRIPLE:
            case CONS_SET:
            case CONS_NODE:
            case CONS_XOR:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:206:4: ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END
                    {
                    ID88=(Token)match(input,ID,FOLLOW_ID_in_factor917);  
                    stream_ID.add(ID88);

                    SEP_SUBTYPE_START89=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_factor919);  
                    stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START89);

                    ID90=(Token)match(input,ID,FOLLOW_ID_in_factor921);  
                    stream_ID.add(ID90);

                    SEP_SUBTYPE_END91=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_factor923);  
                    stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END91);



                    // AST REWRITE
                    // elements: ID, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:47: -> ^( ID ID )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:206:50: ^( ID ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:207:4: ID
                    {
                    ID92=(Token)match(input,ID,FOLLOW_ID_in_factor941);  
                    stream_ID.add(ID92);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:14: -> ID
                    {
                        adaptor.addChild(root_0, stream_ID.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:208:4: operation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operation_in_factor957);
                    operation93=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation93.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:209:4: constructor
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constructor_in_factor962);
                    constructor94=constructor();

                    state._fsp--;

                    adaptor.addChild(root_0, constructor94.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:212:1: operation : ( ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call -> structure_operation_call );
    public final RecParser.operation_return operation() throws RecognitionException {
        RecParser.operation_return retval = new RecParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID95=null;
        Token SEP_STRUCTURE96=null;
        Token ID97=null;
        Token SEP_ACCESSOR98=null;
        RecParser.attribute_call_return attribute_call99 = null;

        RecParser.structure_operation_call_return structure_operation_call100 = null;


        Object ID95_tree=null;
        Object SEP_STRUCTURE96_tree=null;
        Object ID97_tree=null;
        Object SEP_ACCESSOR98_tree=null;
        RewriteRuleTokenStream stream_SEP_STRUCTURE=new RewriteRuleTokenStream(adaptor,"token SEP_STRUCTURE");
        RewriteRuleTokenStream stream_SEP_ACCESSOR=new RewriteRuleTokenStream(adaptor,"token SEP_ACCESSOR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_structure_operation_call=new RewriteRuleSubtreeStream(adaptor,"rule structure_operation_call");
        RewriteRuleSubtreeStream stream_attribute_call=new RewriteRuleSubtreeStream(adaptor,"rule attribute_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:2: ( ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call -> structure_operation_call )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=OP_PATH && LA21_0<=OP_UPDATE)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:5: ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call
                    {
                    ID95=(Token)match(input,ID,FOLLOW_ID_in_operation974);  
                    stream_ID.add(ID95);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:8: ( SEP_STRUCTURE ID )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==SEP_STRUCTURE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:9: SEP_STRUCTURE ID
                            {
                            SEP_STRUCTURE96=(Token)match(input,SEP_STRUCTURE,FOLLOW_SEP_STRUCTURE_in_operation977);  
                            stream_SEP_STRUCTURE.add(SEP_STRUCTURE96);

                            ID97=(Token)match(input,ID,FOLLOW_ID_in_operation979);  
                            stream_ID.add(ID97);


                            }
                            break;

                    }

                    SEP_ACCESSOR98=(Token)match(input,SEP_ACCESSOR,FOLLOW_SEP_ACCESSOR_in_operation983);  
                    stream_SEP_ACCESSOR.add(SEP_ACCESSOR98);

                    pushFollow(FOLLOW_attribute_call_in_operation985);
                    attribute_call99=attribute_call();

                    state._fsp--;

                    stream_attribute_call.add(attribute_call99.getTree());


                    // AST REWRITE
                    // elements: ID, attribute_call, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:57: -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:60: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCESS, "ACCESS"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:72: ( ^( STRUCTURE ID ) )?
                        if ( stream_ID.hasNext() ) {
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:72: ^( STRUCTURE ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:215:5: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1010);
                    structure_operation_call100=structure_operation_call();

                    state._fsp--;

                    stream_structure_operation_call.add(structure_operation_call100.getTree());


                    // AST REWRITE
                    // elements: structure_operation_call
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:35: -> structure_operation_call
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
        }
        return retval;
    }
    // $ANTLR end "operation"

    public static class constructor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:218:1: constructor : ( triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons | node_cons -> node_cons | xor_cons -> xor_cons );
    public final RecParser.constructor_return constructor() throws RecognitionException {
        RecParser.constructor_return retval = new RecParser.constructor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.triple_cons_return triple_cons101 = null;

        RecParser.pair_cons_return pair_cons102 = null;

        RecParser.set_cons_return set_cons103 = null;

        RecParser.node_cons_return node_cons104 = null;

        RecParser.xor_cons_return xor_cons105 = null;


        RewriteRuleSubtreeStream stream_triple_cons=new RewriteRuleSubtreeStream(adaptor,"rule triple_cons");
        RewriteRuleSubtreeStream stream_node_cons=new RewriteRuleSubtreeStream(adaptor,"rule node_cons");
        RewriteRuleSubtreeStream stream_set_cons=new RewriteRuleSubtreeStream(adaptor,"rule set_cons");
        RewriteRuleSubtreeStream stream_xor_cons=new RewriteRuleSubtreeStream(adaptor,"rule xor_cons");
        RewriteRuleSubtreeStream stream_pair_cons=new RewriteRuleSubtreeStream(adaptor,"rule pair_cons");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:219:2: ( triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons | node_cons -> node_cons | xor_cons -> xor_cons )
            int alt22=5;
            switch ( input.LA(1) ) {
            case CONS_TRIPLE:
                {
                alt22=1;
                }
                break;
            case CONS_PAIR:
                {
                alt22=2;
                }
                break;
            case CONS_SET:
                {
                alt22=3;
                }
                break;
            case CONS_NODE:
                {
                alt22=4;
                }
                break;
            case CONS_XOR:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:219:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1031);
                    triple_cons101=triple_cons();

                    state._fsp--;

                    stream_triple_cons.add(triple_cons101.getTree());


                    // AST REWRITE
                    // elements: triple_cons
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:22: -> triple_cons
                    {
                        adaptor.addChild(root_0, stream_triple_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:220:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1046);
                    pair_cons102=pair_cons();

                    state._fsp--;

                    stream_pair_cons.add(pair_cons102.getTree());


                    // AST REWRITE
                    // elements: pair_cons
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:20: -> pair_cons
                    {
                        adaptor.addChild(root_0, stream_pair_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1061);
                    set_cons103=set_cons();

                    state._fsp--;

                    stream_set_cons.add(set_cons103.getTree());


                    // AST REWRITE
                    // elements: set_cons
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:20: -> set_cons
                    {
                        adaptor.addChild(root_0, stream_set_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:222:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1078);
                    node_cons104=node_cons();

                    state._fsp--;

                    stream_node_cons.add(node_cons104.getTree());


                    // AST REWRITE
                    // elements: node_cons
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:19: -> node_cons
                    {
                        adaptor.addChild(root_0, stream_node_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:223:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1092);
                    xor_cons105=xor_cons();

                    state._fsp--;

                    stream_xor_cons.add(xor_cons105.getTree());


                    // AST REWRITE
                    // elements: xor_cons
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:18: -> xor_cons
                    {
                        adaptor.addChild(root_0, stream_xor_cons.nextTree());

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
        }
        return retval;
    }
    // $ANTLR end "constructor"

    public static class attribute_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:230:1: attribute_call : ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_FST -> OP_FST | OP_SND -> OP_SND | OP_TRD -> OP_TRD | ID -> ID );
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:231:2: ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_FST -> OP_FST | OP_SND -> OP_SND | OP_TRD -> OP_TRD | ID -> ID )
            int alt25=9;
            switch ( input.LA(1) ) {
            case OP_IN:
                {
                alt25=1;
                }
                break;
            case OP_OUT:
                {
                alt25=2;
                }
                break;
            case OP_NAME:
                {
                alt25=3;
                }
                break;
            case OP_NODES:
                {
                alt25=4;
                }
                break;
            case OP_NAMES:
                {
                alt25=5;
                }
                break;
            case OP_FST:
                {
                alt25=6;
                }
                break;
            case OP_SND:
                {
                alt25=7;
                }
                break;
            case OP_TRD:
                {
                alt25=8;
                }
                break;
            case ID:
                {
                alt25=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:231:4: OP_IN ( SEP_LIST_START INT SEP_LIST_END )?
                    {
                    OP_IN106=(Token)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1117);  
                    stream_OP_IN.add(OP_IN106);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:231:10: ( SEP_LIST_START INT SEP_LIST_END )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==SEP_LIST_START) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:231:11: SEP_LIST_START INT SEP_LIST_END
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
                    // elements: OP_IN, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:47: -> ^( OP_IN ( INT )? )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:231:50: ^( OP_IN ( INT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_IN.nextNode(), root_1);

                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:231:58: ( INT )?
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:232:5: OP_OUT ( SEP_LIST_START INT SEP_LIST_END )?
                    {
                    OP_OUT110=(Token)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1143);  
                    stream_OP_OUT.add(OP_OUT110);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:232:12: ( SEP_LIST_START INT SEP_LIST_END )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==SEP_LIST_START) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:232:13: SEP_LIST_START INT SEP_LIST_END
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 232:47: -> ^( OP_OUT ( INT )? )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:232:50: ^( OP_OUT ( INT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_OUT.nextNode(), root_1);

                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:232:59: ( INT )?
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:233:4: OP_NAME
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:17: -> OP_NAME
                    {
                        adaptor.addChild(root_0, stream_OP_NAME.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:235:4: OP_NODES
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:17: -> OP_NODES
                    {
                        adaptor.addChild(root_0, stream_OP_NODES.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:236:4: OP_NAMES
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 236:17: -> OP_NAMES
                    {
                        adaptor.addChild(root_0, stream_OP_NAMES.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:237:4: OP_FST
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:16: -> OP_FST
                    {
                        adaptor.addChild(root_0, stream_OP_FST.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:4: OP_SND
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 238:16: -> OP_SND
                    {
                        adaptor.addChild(root_0, stream_OP_SND.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:239:4: OP_TRD
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:16: -> OP_TRD
                    {
                        adaptor.addChild(root_0, stream_OP_TRD.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:240:4: ID
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
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:12: -> ID
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
        }
        return retval;
    }
    // $ANTLR end "attribute_call"

    public static class triple_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triple_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:244:1: triple_cons : CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) ;
    public final RecParser.triple_cons_return triple_cons() throws RecognitionException {
        RecParser.triple_cons_return retval = new RecParser.triple_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_TRIPLE121=null;
        Token SEP_ARGS_START122=null;
        Token SEP_COMMA124=null;
        Token SEP_COMMA126=null;
        Token SEP_ARGS_END128=null;
        RecParser.expression_return expression123 = null;

        RecParser.expression_return expression125 = null;

        RecParser.expression_return expression127 = null;


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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:245:2: ( CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:245:4: CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END
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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 246:3: -> ^( TRIPLE expression expression expression )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:246:6: ^( TRIPLE expression expression expression )
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
        }
        return retval;
    }
    // $ANTLR end "triple_cons"

    public static class pair_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pair_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:250:1: pair_cons : CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) ;
    public final RecParser.pair_cons_return pair_cons() throws RecognitionException {
        RecParser.pair_cons_return retval = new RecParser.pair_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_PAIR129=null;
        Token SEP_ARGS_START130=null;
        Token SEP_COMMA132=null;
        Token SEP_ARGS_END134=null;
        RecParser.expression_return expression131 = null;

        RecParser.expression_return expression133 = null;


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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:2: ( CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:4: CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END
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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 252:3: -> ^( PAIR expression expression )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:252:6: ^( PAIR expression expression )
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
        }
        return retval;
    }
    // $ANTLR end "pair_cons"

    public static class set_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:257:1: set_cons : CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) ;
    public final RecParser.set_cons_return set_cons() throws RecognitionException {
        RecParser.set_cons_return retval = new RecParser.set_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_SET135=null;
        Token SEP_ARGS_START136=null;
        Token SEP_COMMA138=null;
        Token SEP_ARGS_END140=null;
        RecParser.expression_return expression137 = null;

        RecParser.expression_return expression139 = null;


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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:258:2: ( CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:258:4: CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END
            {
            CONS_SET135=(Token)match(input,CONS_SET,FOLLOW_CONS_SET_in_set_cons1353);  
            stream_CONS_SET.add(CONS_SET135);

            SEP_ARGS_START136=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_set_cons1355);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START136);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:258:29: ( expression ( SEP_COMMA expression )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=OP_PATH && LA27_0<=OP_UPDATE)||(LA27_0>=CONS_PAIR && LA27_0<=ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:258:31: expression ( SEP_COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_set_cons1360);
                    expression137=expression();

                    state._fsp--;

                    stream_expression.add(expression137.getTree());
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:258:42: ( SEP_COMMA expression )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==SEP_COMMA) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:258:43: SEP_COMMA expression
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
                    	    break loop26;
                        }
                    } while (true);


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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 259:3: -> ^( SET ( expression )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:259:6: ^( SET ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:259:12: ( expression )*
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
        }
        return retval;
    }
    // $ANTLR end "set_cons"

    public static class node_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:263:1: node_cons : CONS_NODE SEP_ARGS_START ID ( SEP_COMMA ID )* SEP_ARGS_END -> ^( NODE ( ID )+ ) ;
    public final RecParser.node_cons_return node_cons() throws RecognitionException {
        RecParser.node_cons_return retval = new RecParser.node_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_NODE141=null;
        Token SEP_ARGS_START142=null;
        Token ID143=null;
        Token SEP_COMMA144=null;
        Token ID145=null;
        Token SEP_ARGS_END146=null;

        Object CONS_NODE141_tree=null;
        Object SEP_ARGS_START142_tree=null;
        Object ID143_tree=null;
        Object SEP_COMMA144_tree=null;
        Object ID145_tree=null;
        Object SEP_ARGS_END146_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CONS_NODE=new RewriteRuleTokenStream(adaptor,"token CONS_NODE");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:2: ( CONS_NODE SEP_ARGS_START ID ( SEP_COMMA ID )* SEP_ARGS_END -> ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:4: CONS_NODE SEP_ARGS_START ID ( SEP_COMMA ID )* SEP_ARGS_END
            {
            CONS_NODE141=(Token)match(input,CONS_NODE,FOLLOW_CONS_NODE_in_node_cons1399);  
            stream_CONS_NODE.add(CONS_NODE141);

            SEP_ARGS_START142=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_node_cons1401);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START142);

            ID143=(Token)match(input,ID,FOLLOW_ID_in_node_cons1404);  
            stream_ID.add(ID143);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:33: ( SEP_COMMA ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==SEP_COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:34: SEP_COMMA ID
            	    {
            	    SEP_COMMA144=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_node_cons1407);  
            	    stream_SEP_COMMA.add(SEP_COMMA144);

            	    ID145=(Token)match(input,ID,FOLLOW_ID_in_node_cons1409);  
            	    stream_ID.add(ID145);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            SEP_ARGS_END146=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_node_cons1413);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END146);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 265:3: -> ^( NODE ( ID )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:265:6: ^( NODE ( ID )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NODE, "NODE"), root_1);

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
        }
        return retval;
    }
    // $ANTLR end "node_cons"

    public static class xor_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:268:1: xor_cons : CONS_XOR SEP_ARGS_START id1= ID ( SEP_COMMA id2= ID )* SEP_COLON id3= ID ( SEP_COMMA id4= ID )+ SEP_ARGS_END -> ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) ) ;
    public final RecParser.xor_cons_return xor_cons() throws RecognitionException {
        RecParser.xor_cons_return retval = new RecParser.xor_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token id2=null;
        Token id3=null;
        Token id4=null;
        Token CONS_XOR147=null;
        Token SEP_ARGS_START148=null;
        Token SEP_COMMA149=null;
        Token SEP_COLON150=null;
        Token SEP_COMMA151=null;
        Token SEP_ARGS_END152=null;

        Object id1_tree=null;
        Object id2_tree=null;
        Object id3_tree=null;
        Object id4_tree=null;
        Object CONS_XOR147_tree=null;
        Object SEP_ARGS_START148_tree=null;
        Object SEP_COMMA149_tree=null;
        Object SEP_COLON150_tree=null;
        Object SEP_COMMA151_tree=null;
        Object SEP_ARGS_END152_tree=null;
        RewriteRuleTokenStream stream_CONS_XOR=new RewriteRuleTokenStream(adaptor,"token CONS_XOR");
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_COLON=new RewriteRuleTokenStream(adaptor,"token SEP_COLON");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:269:2: ( CONS_XOR SEP_ARGS_START id1= ID ( SEP_COMMA id2= ID )* SEP_COLON id3= ID ( SEP_COMMA id4= ID )+ SEP_ARGS_END -> ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:269:4: CONS_XOR SEP_ARGS_START id1= ID ( SEP_COMMA id2= ID )* SEP_COLON id3= ID ( SEP_COMMA id4= ID )+ SEP_ARGS_END
            {
            CONS_XOR147=(Token)match(input,CONS_XOR,FOLLOW_CONS_XOR_in_xor_cons1438);  
            stream_CONS_XOR.add(CONS_XOR147);

            SEP_ARGS_START148=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_xor_cons1440);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START148);

            id1=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1444);  
            stream_ID.add(id1);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:269:35: ( SEP_COMMA id2= ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==SEP_COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:269:36: SEP_COMMA id2= ID
            	    {
            	    SEP_COMMA149=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_xor_cons1447);  
            	    stream_SEP_COMMA.add(SEP_COMMA149);

            	    id2=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1451);  
            	    stream_ID.add(id2);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            SEP_COLON150=(Token)match(input,SEP_COLON,FOLLOW_SEP_COLON_in_xor_cons1455);  
            stream_SEP_COLON.add(SEP_COLON150);

            id3=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1459);  
            stream_ID.add(id3);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:269:72: ( SEP_COMMA id4= ID )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==SEP_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:269:73: SEP_COMMA id4= ID
            	    {
            	    SEP_COMMA151=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_xor_cons1462);  
            	    stream_SEP_COMMA.add(SEP_COMMA151);

            	    id4=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1466);  
            	    stream_ID.add(id4);


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            SEP_ARGS_END152=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_xor_cons1470);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END152);



            // AST REWRITE
            // elements: id2, id3, id4, id1
            // token labels: id2, id1, id4, id3
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
            RewriteRuleTokenStream stream_id1=new RewriteRuleTokenStream(adaptor,"token id1",id1);
            RewriteRuleTokenStream stream_id4=new RewriteRuleTokenStream(adaptor,"token id4",id4);
            RewriteRuleTokenStream stream_id3=new RewriteRuleTokenStream(adaptor,"token id3",id3);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:3: -> ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:270:6: ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:270:13: ^( IN $id1 ( $id2)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);

                adaptor.addChild(root_2, stream_id1.nextNode());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:270:23: ( $id2)*
                while ( stream_id2.hasNext() ) {
                    adaptor.addChild(root_2, stream_id2.nextNode());

                }
                stream_id2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:270:30: ^( OUT $id3 ( $id4)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUT, "OUT"), root_2);

                adaptor.addChild(root_2, stream_id3.nextNode());
                if ( !(stream_id4.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_id4.hasNext() ) {
                    adaptor.addChild(root_2, stream_id4.nextNode());

                }
                stream_id4.reset();

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
        }
        return retval;
    }
    // $ANTLR end "xor_cons"

    public static class applicaiton_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "applicaiton_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:276:1: applicaiton_def : ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? ;
    public final RecParser.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecParser.applicaiton_def_return retval = new RecParser.applicaiton_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID153=null;
        Token OP_APPLY154=null;
        RecParser.list_reconfigurations_return list_reconfigurations155 = null;

        RecParser.trigger_def_return trigger_def156 = null;


        Object ID153_tree=null;
        Object OP_APPLY154_tree=null;
        RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_trigger_def=new RewriteRuleSubtreeStream(adaptor,"rule trigger_def");
        RewriteRuleSubtreeStream stream_list_reconfigurations=new RewriteRuleSubtreeStream(adaptor,"rule list_reconfigurations");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:277:2: ( ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:277:4: ID OP_APPLY list_reconfigurations ( trigger_def )?
            {
            ID153=(Token)match(input,ID,FOLLOW_ID_in_applicaiton_def1517);  
            stream_ID.add(ID153);

            OP_APPLY154=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_applicaiton_def1519);  
            stream_OP_APPLY.add(OP_APPLY154);

            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1522);
            list_reconfigurations155=list_reconfigurations();

            state._fsp--;

            stream_list_reconfigurations.add(list_reconfigurations155.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:277:40: ( trigger_def )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_TRIGGER) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:277:40: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1525);
                    trigger_def156=trigger_def();

                    state._fsp--;

                    stream_trigger_def.add(trigger_def156.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: list_reconfigurations, ID, trigger_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:3: -> ID list_reconfigurations ( trigger_def )?
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                adaptor.addChild(root_0, stream_list_reconfigurations.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:278:31: ( trigger_def )?
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
        }
        return retval;
    }
    // $ANTLR end "applicaiton_def"

    public static class list_reconfigurations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_reconfigurations"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:281:1: list_reconfigurations : ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ ;
    public final RecParser.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecParser.list_reconfigurations_return retval = new RecParser.list_reconfigurations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START157=null;
        Token SEP_COMMA159=null;
        Token SEP_BLOCK_END161=null;
        RecParser.reconfiguration_call_return reconfiguration_call158 = null;

        RecParser.reconfiguration_call_return reconfiguration_call160 = null;


        Object SEP_BLOCK_START157_tree=null;
        Object SEP_COMMA159_tree=null;
        Object SEP_BLOCK_END161_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
        RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
        RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:2: ( ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:5: ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:5: ( SEP_BLOCK_START )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==SEP_BLOCK_START) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:5: SEP_BLOCK_START
                    {
                    SEP_BLOCK_START157=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1551);  
                    stream_SEP_BLOCK_START.add(SEP_BLOCK_START157);


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1554);
            reconfiguration_call158=reconfiguration_call();

            state._fsp--;

            stream_reconfiguration_call.add(reconfiguration_call158.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:43: ( SEP_COMMA reconfiguration_call )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==SEP_COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:44: SEP_COMMA reconfiguration_call
            	    {
            	    SEP_COMMA159=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_reconfigurations1557);  
            	    stream_SEP_COMMA.add(SEP_COMMA159);

            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1559);
            	    reconfiguration_call160=reconfiguration_call();

            	    state._fsp--;

            	    stream_reconfiguration_call.add(reconfiguration_call160.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:77: ( SEP_BLOCK_END )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SEP_BLOCK_END) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:282:77: SEP_BLOCK_END
                    {
                    SEP_BLOCK_END161=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1563);  
                    stream_SEP_BLOCK_END.add(SEP_BLOCK_END161);


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
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:93: -> ( reconfiguration_call )+
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
        }
        return retval;
    }
    // $ANTLR end "list_reconfigurations"

    public static class trigger_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trigger_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:285:1: trigger_def : SEP_TRIGGER trigger_block -> trigger_block ;
    public final RecParser.trigger_def_return trigger_def() throws RecognitionException {
        RecParser.trigger_def_return retval = new RecParser.trigger_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_TRIGGER162=null;
        RecParser.trigger_block_return trigger_block163 = null;


        Object SEP_TRIGGER162_tree=null;
        RewriteRuleTokenStream stream_SEP_TRIGGER=new RewriteRuleTokenStream(adaptor,"token SEP_TRIGGER");
        RewriteRuleSubtreeStream stream_trigger_block=new RewriteRuleSubtreeStream(adaptor,"rule trigger_block");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:286:2: ( SEP_TRIGGER trigger_block -> trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:286:4: SEP_TRIGGER trigger_block
            {
            SEP_TRIGGER162=(Token)match(input,SEP_TRIGGER,FOLLOW_SEP_TRIGGER_in_trigger_def1582);  
            stream_SEP_TRIGGER.add(SEP_TRIGGER162);

            pushFollow(FOLLOW_trigger_block_in_trigger_def1584);
            trigger_block163=trigger_block();

            state._fsp--;

            stream_trigger_block.add(trigger_block163.getTree());


            // AST REWRITE
            // elements: trigger_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 287:3: -> trigger_block
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
        }
        return retval;
    }
    // $ANTLR end "trigger_def"

    public static class trigger_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trigger_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:290:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecParser.trigger_block_return trigger_block() throws RecognitionException {
        RecParser.trigger_block_return retval = new RecParser.trigger_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START164=null;
        Token SEP_BLOCK_END165=null;

        Object SEP_BLOCK_START164_tree=null;
        Object SEP_BLOCK_END165_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:291:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:291:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            root_0 = (Object)adaptor.nil();

            SEP_BLOCK_START164=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1603); 
            SEP_BLOCK_START164_tree = (Object)adaptor.create(SEP_BLOCK_START164);
            adaptor.addChild(root_0, SEP_BLOCK_START164_tree);

            SEP_BLOCK_END165=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1605); 
            SEP_BLOCK_END165_tree = (Object)adaptor.create(SEP_BLOCK_END165);
            adaptor.addChild(root_0, SEP_BLOCK_END165_tree);


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
        }
        return retval;
    }
    // $ANTLR end "trigger_block"

    public static class main_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:297:1: main_def : RW_MAIN SEP_LIST_START ( main_args )? SEP_LIST_END main_block -> ( main_args )? main_block ;
    public final RecParser.main_def_return main_def() throws RecognitionException {
        RecParser.main_def_return retval = new RecParser.main_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_MAIN166=null;
        Token SEP_LIST_START167=null;
        Token SEP_LIST_END169=null;
        RecParser.main_args_return main_args168 = null;

        RecParser.main_block_return main_block170 = null;


        Object RW_MAIN166_tree=null;
        Object SEP_LIST_START167_tree=null;
        Object SEP_LIST_END169_tree=null;
        RewriteRuleTokenStream stream_SEP_LIST_END=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_END");
        RewriteRuleTokenStream stream_RW_MAIN=new RewriteRuleTokenStream(adaptor,"token RW_MAIN");
        RewriteRuleTokenStream stream_SEP_LIST_START=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_START");
        RewriteRuleSubtreeStream stream_main_args=new RewriteRuleSubtreeStream(adaptor,"rule main_args");
        RewriteRuleSubtreeStream stream_main_block=new RewriteRuleSubtreeStream(adaptor,"rule main_block");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:298:2: ( RW_MAIN SEP_LIST_START ( main_args )? SEP_LIST_END main_block -> ( main_args )? main_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:298:4: RW_MAIN SEP_LIST_START ( main_args )? SEP_LIST_END main_block
            {
            RW_MAIN166=(Token)match(input,RW_MAIN,FOLLOW_RW_MAIN_in_main_def1619);  
            stream_RW_MAIN.add(RW_MAIN166);

            SEP_LIST_START167=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_main_def1621);  
            stream_SEP_LIST_START.add(SEP_LIST_START167);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:298:27: ( main_args )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:298:27: main_args
                    {
                    pushFollow(FOLLOW_main_args_in_main_def1623);
                    main_args168=main_args();

                    state._fsp--;

                    stream_main_args.add(main_args168.getTree());

                    }
                    break;

            }

            SEP_LIST_END169=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_main_def1626);  
            stream_SEP_LIST_END.add(SEP_LIST_END169);

            pushFollow(FOLLOW_main_block_in_main_def1628);
            main_block170=main_block();

            state._fsp--;

            stream_main_block.add(main_block170.getTree());


            // AST REWRITE
            // elements: main_block, main_args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 299:3: -> ( main_args )? main_block
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:299:6: ( main_args )?
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
        }
        return retval;
    }
    // $ANTLR end "main_def"

    public static class main_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:302:1: main_args : main_arg ( SEP_SEMICOLON main_arg )* -> ^( ARGUMENTS ( main_arg )+ ) ;
    public final RecParser.main_args_return main_args() throws RecognitionException {
        RecParser.main_args_return retval = new RecParser.main_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON172=null;
        RecParser.main_arg_return main_arg171 = null;

        RecParser.main_arg_return main_arg173 = null;


        Object SEP_SEMICOLON172_tree=null;
        RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
        RewriteRuleSubtreeStream stream_main_arg=new RewriteRuleSubtreeStream(adaptor,"rule main_arg");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:303:2: ( main_arg ( SEP_SEMICOLON main_arg )* -> ^( ARGUMENTS ( main_arg )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:303:4: main_arg ( SEP_SEMICOLON main_arg )*
            {
            pushFollow(FOLLOW_main_arg_in_main_args1648);
            main_arg171=main_arg();

            state._fsp--;

            stream_main_arg.add(main_arg171.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:303:13: ( SEP_SEMICOLON main_arg )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==SEP_SEMICOLON) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:303:14: SEP_SEMICOLON main_arg
            	    {
            	    SEP_SEMICOLON172=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_main_args1651);  
            	    stream_SEP_SEMICOLON.add(SEP_SEMICOLON172);

            	    pushFollow(FOLLOW_main_arg_in_main_args1653);
            	    main_arg173=main_arg();

            	    state._fsp--;

            	    stream_main_arg.add(main_arg173.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);



            // AST REWRITE
            // elements: main_arg
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 304:3: -> ^( ARGUMENTS ( main_arg )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:304:6: ^( ARGUMENTS ( main_arg )+ )
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
        }
        return retval;
    }
    // $ANTLR end "main_args"

    public static class main_arg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main_arg"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:307:1: main_arg : dt= ID ids -> ^( ARGUMENT ID ids ) ;
    public final RecParser.main_arg_return main_arg() throws RecognitionException {
        RecParser.main_arg_return retval = new RecParser.main_arg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dt=null;
        RecParser.ids_return ids174 = null;


        Object dt_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ids=new RewriteRuleSubtreeStream(adaptor,"rule ids");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:308:2: (dt= ID ids -> ^( ARGUMENT ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:308:5: dt= ID ids
            {
            dt=(Token)match(input,ID,FOLLOW_ID_in_main_arg1680);  
            stream_ID.add(dt);

            pushFollow(FOLLOW_ids_in_main_arg1682);
            ids174=ids();

            state._fsp--;

            stream_ids.add(ids174.getTree());


            // AST REWRITE
            // elements: ids, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 309:3: -> ^( ARGUMENT ID ids )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:309:6: ^( ARGUMENT ID ids )
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
        }
        return retval;
    }
    // $ANTLR end "main_arg"

    public static class ids_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:312:1: ids : ID ( SEP_COMMA ID )* -> ^( IDS ( ID )+ ) ;
    public final RecParser.ids_return ids() throws RecognitionException {
        RecParser.ids_return retval = new RecParser.ids_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID175=null;
        Token SEP_COMMA176=null;
        Token ID177=null;

        Object ID175_tree=null;
        Object SEP_COMMA176_tree=null;
        Object ID177_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:313:2: ( ID ( SEP_COMMA ID )* -> ^( IDS ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:313:4: ID ( SEP_COMMA ID )*
            {
            ID175=(Token)match(input,ID,FOLLOW_ID_in_ids1706);  
            stream_ID.add(ID175);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:313:7: ( SEP_COMMA ID )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==SEP_COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:313:8: SEP_COMMA ID
            	    {
            	    SEP_COMMA176=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_ids1709);  
            	    stream_SEP_COMMA.add(SEP_COMMA176);

            	    ID177=(Token)match(input,ID,FOLLOW_ID_in_ids1711);  
            	    stream_ID.add(ID177);


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:23: -> ^( IDS ( ID )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:313:26: ^( IDS ( ID )+ )
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
        }
        return retval;
    }
    // $ANTLR end "ids"

    public static class main_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:317:1: main_block : SEP_BLOCK_START ( main_instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS ( main_instruction )+ ) ;
    public final RecParser.main_block_return main_block() throws RecognitionException {
        RecParser.main_block_return retval = new RecParser.main_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START178=null;
        Token SEP_BLOCK_END180=null;
        RecParser.main_instruction_return main_instruction179 = null;


        Object SEP_BLOCK_START178_tree=null;
        Object SEP_BLOCK_END180_tree=null;
        RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
        RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
        RewriteRuleSubtreeStream stream_main_instruction=new RewriteRuleSubtreeStream(adaptor,"rule main_instruction");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:318:2: ( SEP_BLOCK_START ( main_instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS ( main_instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:318:4: SEP_BLOCK_START ( main_instruction )+ SEP_BLOCK_END
            {
            SEP_BLOCK_START178=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_main_block1736);  
            stream_SEP_BLOCK_START.add(SEP_BLOCK_START178);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:318:20: ( main_instruction )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:318:20: main_instruction
            	    {
            	    pushFollow(FOLLOW_main_instruction_in_main_block1738);
            	    main_instruction179=main_instruction();

            	    state._fsp--;

            	    stream_main_instruction.add(main_instruction179.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            SEP_BLOCK_END180=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_main_block1741);  
            stream_SEP_BLOCK_END.add(SEP_BLOCK_END180);



            // AST REWRITE
            // elements: main_instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 319:3: -> ^( INSTRUCTIONS ( main_instruction )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:319:6: ^( INSTRUCTIONS ( main_instruction )+ )
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
        }
        return retval;
    }
    // $ANTLR end "main_block"

    public static class main_instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:322:1: main_instruction : ( main_declaration SEP_SEMICOLON -> main_declaration | main_assignment SEP_SEMICOLON -> main_assignment );
    public final RecParser.main_instruction_return main_instruction() throws RecognitionException {
        RecParser.main_instruction_return retval = new RecParser.main_instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON182=null;
        Token SEP_SEMICOLON184=null;
        RecParser.main_declaration_return main_declaration181 = null;

        RecParser.main_assignment_return main_assignment183 = null;


        Object SEP_SEMICOLON182_tree=null;
        Object SEP_SEMICOLON184_tree=null;
        RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
        RewriteRuleSubtreeStream stream_main_assignment=new RewriteRuleSubtreeStream(adaptor,"rule main_assignment");
        RewriteRuleSubtreeStream stream_main_declaration=new RewriteRuleSubtreeStream(adaptor,"rule main_declaration");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:323:2: ( main_declaration SEP_SEMICOLON -> main_declaration | main_assignment SEP_SEMICOLON -> main_assignment )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:323:4: main_declaration SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_main_declaration_in_main_instruction1763);
                    main_declaration181=main_declaration();

                    state._fsp--;

                    stream_main_declaration.add(main_declaration181.getTree());
                    SEP_SEMICOLON182=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_main_instruction1765);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON182);



                    // AST REWRITE
                    // elements: main_declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 323:37: -> main_declaration
                    {
                        adaptor.addChild(root_0, stream_main_declaration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:324:4: main_assignment SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_main_assignment_in_main_instruction1776);
                    main_assignment183=main_assignment();

                    state._fsp--;

                    stream_main_assignment.add(main_assignment183.getTree());
                    SEP_SEMICOLON184=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_main_instruction1778);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON184);



                    // AST REWRITE
                    // elements: main_assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 324:35: -> main_assignment
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
        }
        return retval;
    }
    // $ANTLR end "main_instruction"

    public static class main_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main_declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:327:1: main_declaration : dt= ID ids -> ^( DECLARATION $dt ids ) ;
    public final RecParser.main_declaration_return main_declaration() throws RecognitionException {
        RecParser.main_declaration_return retval = new RecParser.main_declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dt=null;
        RecParser.ids_return ids185 = null;


        Object dt_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ids=new RewriteRuleSubtreeStream(adaptor,"rule ids");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:328:2: (dt= ID ids -> ^( DECLARATION $dt ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:328:4: dt= ID ids
            {
            dt=(Token)match(input,ID,FOLLOW_ID_in_main_declaration1796);  
            stream_ID.add(dt);

            pushFollow(FOLLOW_ids_in_main_declaration1798);
            ids185=ids();

            state._fsp--;

            stream_ids.add(ids185.getTree());


            // AST REWRITE
            // elements: dt, ids
            // token labels: dt
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_dt=new RewriteRuleTokenStream(adaptor,"token dt",dt);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 329:3: -> ^( DECLARATION $dt ids )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:329:6: ^( DECLARATION $dt ids )
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
        }
        return retval;
    }
    // $ANTLR end "main_declaration"

    public static class main_assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main_assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:332:1: main_assignment : ( (dt= ID )? ids OP_EQUAL )? id2= ID OP_APPLY reconfiguration_call -> ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) ) ;
    public final RecParser.main_assignment_return main_assignment() throws RecognitionException {
        RecParser.main_assignment_return retval = new RecParser.main_assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token dt=null;
        Token id2=null;
        Token OP_EQUAL187=null;
        Token OP_APPLY188=null;
        RecParser.ids_return ids186 = null;

        RecParser.reconfiguration_call_return reconfiguration_call189 = null;


        Object dt_tree=null;
        Object id2_tree=null;
        Object OP_EQUAL187_tree=null;
        Object OP_APPLY188_tree=null;
        RewriteRuleTokenStream stream_OP_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_EQUAL");
        RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_ids=new RewriteRuleSubtreeStream(adaptor,"rule ids");
        RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:333:2: ( ( (dt= ID )? ids OP_EQUAL )? id2= ID OP_APPLY reconfiguration_call -> ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:333:4: ( (dt= ID )? ids OP_EQUAL )? id2= ID OP_APPLY reconfiguration_call
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:333:4: ( (dt= ID )? ids OP_EQUAL )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==OP_EQUAL||LA41_1==SEP_COMMA||LA41_1==ID) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:333:5: (dt= ID )? ids OP_EQUAL
                    {
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:333:7: (dt= ID )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==ID) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==ID) ) {
                            alt40=1;
                        }
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:333:7: dt= ID
                            {
                            dt=(Token)match(input,ID,FOLLOW_ID_in_main_assignment1825);  
                            stream_ID.add(dt);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_ids_in_main_assignment1828);
                    ids186=ids();

                    state._fsp--;

                    stream_ids.add(ids186.getTree());
                    OP_EQUAL187=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_main_assignment1830);  
                    stream_OP_EQUAL.add(OP_EQUAL187);


                    }
                    break;

            }

            id2=(Token)match(input,ID,FOLLOW_ID_in_main_assignment1836);  
            stream_ID.add(id2);

            OP_APPLY188=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1838);  
            stream_OP_APPLY.add(OP_APPLY188);

            pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1840);
            reconfiguration_call189=reconfiguration_call();

            state._fsp--;

            stream_reconfiguration_call.add(reconfiguration_call189.getTree());


            // AST REWRITE
            // elements: id2, OP_APPLY, dt, ids, reconfiguration_call
            // token labels: dt, id2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_dt=new RewriteRuleTokenStream(adaptor,"token dt",dt);
            RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2",id2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 334:3: -> ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:334:6: ^( APPLICATION ( ^( DECLARATION ( $dt)? ids ) )? ^( OP_APPLY $id2 reconfiguration_call ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APPLICATION, "APPLICATION"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:334:20: ( ^( DECLARATION ( $dt)? ids ) )?
                if ( stream_dt.hasNext()||stream_ids.hasNext() ) {
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:334:22: ^( DECLARATION ( $dt)? ids )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION, "DECLARATION"), root_2);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:334:36: ( $dt)?
                    if ( stream_dt.hasNext() ) {
                        adaptor.addChild(root_2, stream_dt.nextNode());

                    }
                    stream_dt.reset();
                    adaptor.addChild(root_2, stream_ids.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_dt.reset();
                stream_ids.reset();
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:334:49: ^( OP_APPLY $id2 reconfiguration_call )
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
        }
        return retval;
    }
    // $ANTLR end "main_assignment"

    // Delegated rules


    protected DFA39 dfa39 = new DFA39(this);
    static final String DFA39_eotS =
        "\7\uffff";
    static final String DFA39_eofS =
        "\7\uffff";
    static final String DFA39_minS =
        "\1\75\1\44\1\uffff\1\50\1\75\1\uffff\1\50";
    static final String DFA39_maxS =
        "\2\75\1\uffff\1\54\1\75\1\uffff\1\54";
    static final String DFA39_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA39_specialS =
        "\7\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1",
            "\1\2\3\uffff\1\2\2\uffff\1\2\21\uffff\1\3",
            "",
            "\1\2\2\uffff\1\4\1\5",
            "\1\6",
            "",
            "\1\2\2\uffff\1\4\1\5"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "322:1: main_instruction : ( main_declaration SEP_SEMICOLON -> main_declaration | main_assignment SEP_SEMICOLON -> main_assignment );";
        }
    }
 

    public static final BitSet FOLLOW_directive_def_in_reclang145 = new BitSet(new long[]{0x20000000000000D2L});
    public static final BitSet FOLLOW_element_in_reclang148 = new BitSet(new long[]{0x2000000000000092L});
    public static final BitSet FOLLOW_directive_import_in_directive_def177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_IMPORT_in_directive_import197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import199 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_directive_import201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_applicaiton_def_in_element242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_def_in_element258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def280 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def282 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_reconfiguration_def284 = new BitSet(new long[]{0x000080000000FF00L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def286 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_reconfiguration_def289 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_def_in_args_def316 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_args_def319 = new BitSet(new long[]{0x000000000000FF00L});
    public static final BitSet FOLLOW_arg_def_in_args_def321 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_datatype_in_arg_def347 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype401 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_datatype403 = new BitSet(new long[]{0x000000000000FF00L});
    public static final BitSet FOLLOW_subtype_in_datatype405 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_datatype407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids460 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_ids463 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_list_ids465 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_reconfiguration_block487 = new BitSet(new long[]{0x200000100000FF20L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block489 = new BitSet(new long[]{0x200004100000FF20L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_reconfiguration_block492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_instruction520 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction533 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction545 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply575 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply578 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_declaration604 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration606 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_declaration609 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration611 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ID_in_var_def636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment654 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_assignment656 = new BitSet(new long[]{0x3F00001000C00000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_member684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call704 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call709 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call714 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call719 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call724 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call729 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call734 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call754 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call759 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_operation_args779 = new BitSet(new long[]{0x3F00800000C00000L});
    public static final BitSet FOLLOW_args_in_operation_args781 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_operation_args784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args801 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_args804 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_expression_in_args806 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_RW_FORALL_in_for_instruction830 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_for_instruction832 = new BitSet(new long[]{0x000000000000FF00L});
    public static final BitSet FOLLOW_datatype_in_for_instruction834 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction836 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_COLON_in_for_instruction838 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction840 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_for_instruction842 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expression874 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_expr_op_in_expression877 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_factor_in_expression880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_op0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor917 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_factor919 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_factor921 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_factor923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation974 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_SEP_STRUCTURE_in_operation977 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_operation979 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_SEP_ACCESSOR_in_operation983 = new BitSet(new long[]{0x20000001BF000000L});
    public static final BitSet FOLLOW_attribute_call_in_operation985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1117 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1120 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_INT_in_attribute_call1122 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1143 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1146 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_INT_in_attribute_call1148 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_TRIPLE_in_triple_cons1272 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_triple_cons1274 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1276 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1278 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1280 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1282 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1284 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_triple_cons1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_PAIR_in_pair_cons1315 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_pair_cons1317 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1319 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_pair_cons1321 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1323 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_pair_cons1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_SET_in_set_cons1353 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_set_cons1355 = new BitSet(new long[]{0x3F00800000C00000L});
    public static final BitSet FOLLOW_expression_in_set_cons1360 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_set_cons1363 = new BitSet(new long[]{0x3F00000000C00000L});
    public static final BitSet FOLLOW_expression_in_set_cons1365 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_set_cons1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_NODE_in_node_cons1399 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_node_cons1401 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_node_cons1404 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_node_cons1407 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_node_cons1409 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_node_cons1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_XOR_in_xor_cons1438 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_xor_cons1440 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1444 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_xor_cons1447 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1451 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_SEP_COLON_in_xor_cons1455 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1459 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_xor_cons1462 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1466 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_xor_cons1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1517 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_OP_APPLY_in_applicaiton_def1519 = new BitSet(new long[]{0x20000200003F0000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1522 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1551 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1554 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_reconfigurations1557 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1559 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_TRIGGER_in_trigger_def1582 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1603 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_MAIN_in_main_def1619 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_main_def1621 = new BitSet(new long[]{0x2008000000000000L});
    public static final BitSet FOLLOW_main_args_in_main_def1623 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_main_def1626 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_main_block_in_main_def1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_arg_in_main_args1648 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_main_args1651 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_main_arg_in_main_args1653 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ID_in_main_arg1680 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ids_in_main_arg1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ids1706 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_ids1709 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_ids1711 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_main_block1736 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_main_instruction_in_main_block1738 = new BitSet(new long[]{0x2000040000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_main_block1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_declaration_in_main_instruction1763 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_main_instruction1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_assignment_in_main_instruction1776 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_main_instruction1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_main_declaration1796 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ids_in_main_declaration1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_main_assignment1825 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ids_in_main_assignment1828 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_main_assignment1830 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_main_assignment1836 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1838 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1840 = new BitSet(new long[]{0x0000000000000002L});

}