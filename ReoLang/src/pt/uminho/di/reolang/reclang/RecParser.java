// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g 2014-05-06 16:52:46

	package pt.uminho.di.reolang.reclang; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_XOR", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_ENDS", "OP_NODES", "OP_NAMES", "OP_CHANNELS", "OP_READ", "OP_WRITE", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", "CONS_SET", "CONS_NODE", "CONS_XOR", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "ARGUMENTS", "ARGUMENT", "SUBTYPE", "INSTRUCTIONS", "DECLARATION", "ASSIGNMENT", "FORALL", "TRIPLE", "PAIR", "SET", "NODE", "XOR", "IN", "OUT", "ACCESS", "STRUCTURE", "APPLICATION", "SIGNATURE"
    };
    public static final int OP_NODES=30;
    public static final int CONS_PAIR=55;
    public static final int SEP_OPTIONAL=47;
    public static final int APPLICATION=88;
    public static final int CONS_NODE=58;
    public static final int SEP_COLON=44;
    public static final int SEP_SUBTYPE_END=52;
    public static final int OP_TRD=25;
    public static final int OP_JOIN=16;
    public static final int OCTAL_ESC=68;
    public static final int DT_PAIR=13;
    public static final int SUBTYPE=74;
    public static final int OP_INTERSECTION=37;
    public static final int ID=60;
    public static final int EOF=-1;
    public static final int DECLARATION=76;
    public static final int DT_NODE=10;
    public static final int STRUCTURE=87;
    public static final int DT_SET=12;
    public static final int OP_ID=20;
    public static final int INSTRUCTIONS=75;
    public static final int IMPORT=70;
    public static final int ESC_SEQ=64;
    public static final int SEP_ACCESSOR=53;
    public static final int IN=84;
    public static final int OP_MINUS=38;
    public static final int RECONFIGS=69;
    public static final int DT_XOR=11;
    public static final int RW_FORALL=5;
    public static final int ARGUMENT=73;
    public static final int SEP_LIST_START=49;
    public static final int RW_RECONFIGURATION=4;
    public static final int ACCESS=86;
    public static final int SEP_ARGS_END=46;
    public static final int OP_FST=23;
    public static final int PAIR=80;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=29;
    public static final int TRIPLE=79;
    public static final int OP_APPLY=35;
    public static final int COMMENT=62;
    public static final int OP_PATH=21;
    public static final int OP_SND=24;
    public static final int SEP_LIST_END=50;
    public static final int SEP_STRUCTURE=54;
    public static final int OP_SPLIT=17;
    public static final int OP_OUT=27;
    public static final int CONS_SET=57;
    public static final int XOR=83;
    public static final int NODE=82;
    public static final int ARGUMENTS=72;
    public static final int OP_NAMES=31;
    public static final int SEP_COMMA=42;
    public static final int SEP_ARGS_START=45;
    public static final int DT_TRIPLE=14;
    public static final int SEP_BLOCK_START=40;
    public static final int OP_UPDATE=22;
    public static final int UNICODE_ESC=67;
    public static final int FORALL=78;
    public static final int OP_PAR=15;
    public static final int OP_REMOVE=18;
    public static final int HEX_DIGIT=66;
    public static final int SET=81;
    public static final int INT=61;
    public static final int SIGNATURE=89;
    public static final int OP_IN=26;
    public static final int OP_WRITE=34;
    public static final int CONS_XOR=59;
    public static final int OP_READ=33;
    public static final int RECONFIGURATION=71;
    public static final int WS=63;
    public static final int OUT=85;
    public static final int OP_CHANNELS=32;
    public static final int CONS_TRIPLE=56;
    public static final int SEP_SEMICOLON=43;
    public static final int SEP_SUBTYPE_START=51;
    public static final int SEP_BLOCK_END=41;
    public static final int OP_CONST=19;
    public static final int ASSIGNMENT=77;
    public static final int OP_EQUAL=39;
    public static final int DT_PATTERN=7;
    public static final int OP_NAME=28;
    public static final int DT_CHANNEL=8;
    public static final int OP_UNION=36;
    public static final int SEP_TRIGGER=48;
    public static final int STRING=65;
    public static final int DT_NAME=9;

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


    public static class reclang_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:42:1: reclang : ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final RecParser.reclang_return reclang() throws RecognitionException {
        RecParser.reclang_return retval = new RecParser.reclang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_def_return directive_def1 = null;

        RecParser.element_return element2 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        RewriteRuleSubtreeStream stream_directive_def=new RewriteRuleSubtreeStream(adaptor,"rule directive_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:43:2: ( ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:43:5: ( directive_def )* ( element )*
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:43:5: ( directive_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RW_IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:43:5: directive_def
            	    {
            	    pushFollow(FOLLOW_directive_def_in_reclang134);
            	    directive_def1=directive_def();

            	    state._fsp--;

            	    stream_directive_def.add(directive_def1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:43:20: ( element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RW_RECONFIGURATION||LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:43:20: element
            	    {
            	    pushFollow(FOLLOW_element_in_reclang137);
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
            // 44:3: -> ^( RECONFIGS ( directive_def )* ( element )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:44:6: ^( RECONFIGS ( directive_def )* ( element )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECONFIGS, "RECONFIGS"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:44:18: ( directive_def )*
                while ( stream_directive_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_directive_def.nextTree());

                }
                stream_directive_def.reset();
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:44:33: ( element )*
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:50:1: directive_def : directive_import -> directive_import ;
    public final RecParser.directive_def_return directive_def() throws RecognitionException {
        RecParser.directive_def_return retval = new RecParser.directive_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_import_return directive_import3 = null;


        RewriteRuleSubtreeStream stream_directive_import=new RewriteRuleSubtreeStream(adaptor,"rule directive_import");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:51:2: ( directive_import -> directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:51:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def167);
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
            // 52:3: -> directive_import
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:56:1: directive_import : RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:57:2: ( RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:57:4: RW_IMPORT STRING SEP_SEMICOLON
            {
            RW_IMPORT4=(Token)match(input,RW_IMPORT,FOLLOW_RW_IMPORT_in_directive_import187);  
            stream_RW_IMPORT.add(RW_IMPORT4);

            STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_directive_import189);  
            stream_STRING.add(STRING5);

            SEP_SEMICOLON6=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_directive_import191);  
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
            // 58:3: -> ^( IMPORT STRING )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:58:6: ^( IMPORT STRING )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:66:1: element : ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) );
    public final RecParser.element_return element() throws RecognitionException {
        RecParser.element_return retval = new RecParser.element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.reconfiguration_def_return reconfiguration_def7 = null;

        RecParser.applicaiton_def_return applicaiton_def8 = null;


        RewriteRuleSubtreeStream stream_reconfiguration_def=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_def");
        RewriteRuleSubtreeStream stream_applicaiton_def=new RewriteRuleSubtreeStream(adaptor,"rule applicaiton_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:67:2: ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RW_RECONFIGURATION) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:67:4: reconfiguration_def
                    {
                    pushFollow(FOLLOW_reconfiguration_def_in_element219);
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
                    // 67:24: -> ^( RECONFIGURATION reconfiguration_def )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:67:27: ^( RECONFIGURATION reconfiguration_def )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:68:4: applicaiton_def
                    {
                    pushFollow(FOLLOW_applicaiton_def_in_element232);
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
                    // 68:21: -> ^( APPLICATION applicaiton_def )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:68:24: ^( APPLICATION applicaiton_def )
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
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class reconfiguration_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:73:1: reconfiguration_def : RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) ;
    public final RecParser.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
        RecParser.reconfiguration_def_return retval = new RecParser.reconfiguration_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_RECONFIGURATION9=null;
        Token ID10=null;
        Token SEP_ARGS_START11=null;
        Token SEP_ARGS_END13=null;
        RecParser.args_def_return args_def12 = null;

        RecParser.reconfiguration_block_return reconfiguration_block14 = null;


        Object RW_RECONFIGURATION9_tree=null;
        Object ID10_tree=null;
        Object SEP_ARGS_START11_tree=null;
        Object SEP_ARGS_END13_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_RW_RECONFIGURATION=new RewriteRuleTokenStream(adaptor,"token RW_RECONFIGURATION");
        RewriteRuleSubtreeStream stream_reconfiguration_block=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_block");
        RewriteRuleSubtreeStream stream_args_def=new RewriteRuleSubtreeStream(adaptor,"rule args_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:74:2: ( RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:74:4: RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block
            {
            RW_RECONFIGURATION9=(Token)match(input,RW_RECONFIGURATION,FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def255);  
            stream_RW_RECONFIGURATION.add(RW_RECONFIGURATION9);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_def257);  
            stream_ID.add(ID10);

            SEP_ARGS_START11=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_reconfiguration_def259);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START11);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:74:41: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=DT_PATTERN && LA4_0<=DT_TRIPLE)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:74:41: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def261);
                    args_def12=args_def();

                    state._fsp--;

                    stream_args_def.add(args_def12.getTree());

                    }
                    break;

            }

            SEP_ARGS_END13=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_reconfiguration_def264);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END13);

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def266);
            reconfiguration_block14=reconfiguration_block();

            state._fsp--;

            stream_reconfiguration_block.add(reconfiguration_block14.getTree());


            // AST REWRITE
            // elements: reconfiguration_block, args_def, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:3: -> ^( ID ( args_def )? reconfiguration_block )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:75:6: ^( ID ( args_def )? reconfiguration_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:75:11: ( args_def )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:78:1: args_def : arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) ;
    public final RecParser.args_def_return args_def() throws RecognitionException {
        RecParser.args_def_return retval = new RecParser.args_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON16=null;
        RecParser.arg_def_return arg_def15 = null;

        RecParser.arg_def_return arg_def17 = null;


        Object SEP_SEMICOLON16_tree=null;
        RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
        RewriteRuleSubtreeStream stream_arg_def=new RewriteRuleSubtreeStream(adaptor,"rule arg_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:79:2: ( arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:79:4: arg_def ( SEP_SEMICOLON arg_def )*
            {
            pushFollow(FOLLOW_arg_def_in_args_def291);
            arg_def15=arg_def();

            state._fsp--;

            stream_arg_def.add(arg_def15.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:79:12: ( SEP_SEMICOLON arg_def )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==SEP_SEMICOLON) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:79:13: SEP_SEMICOLON arg_def
            	    {
            	    SEP_SEMICOLON16=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_args_def294);  
            	    stream_SEP_SEMICOLON.add(SEP_SEMICOLON16);

            	    pushFollow(FOLLOW_arg_def_in_args_def296);
            	    arg_def17=arg_def();

            	    state._fsp--;

            	    stream_arg_def.add(arg_def17.getTree());

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
            // 80:3: -> ^( ARGUMENTS ( arg_def )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:80:6: ^( ARGUMENTS ( arg_def )+ )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:83:1: arg_def : datatype list_ids -> ^( ARGUMENT datatype list_ids ) ;
    public final RecParser.arg_def_return arg_def() throws RecognitionException {
        RecParser.arg_def_return retval = new RecParser.arg_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.datatype_return datatype18 = null;

        RecParser.list_ids_return list_ids19 = null;


        RewriteRuleSubtreeStream stream_list_ids=new RewriteRuleSubtreeStream(adaptor,"rule list_ids");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:84:2: ( datatype list_ids -> ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:84:5: datatype list_ids
            {
            pushFollow(FOLLOW_datatype_in_arg_def322);
            datatype18=datatype();

            state._fsp--;

            stream_datatype.add(datatype18.getTree());
            pushFollow(FOLLOW_list_ids_in_arg_def324);
            list_ids19=list_ids();

            state._fsp--;

            stream_list_ids.add(list_ids19.getTree());


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
            // 85:3: -> ^( ARGUMENT datatype list_ids )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:85:6: ^( ARGUMENT datatype list_ids )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:88:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END -> ^( other_type subtype ) );
    public final RecParser.datatype_return datatype() throws RecognitionException {
        RecParser.datatype_return retval = new RecParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DT_PATTERN20=null;
        Token DT_CHANNEL21=null;
        Token DT_NAME22=null;
        Token DT_NODE23=null;
        Token DT_XOR24=null;
        Token SEP_SUBTYPE_START26=null;
        Token SEP_SUBTYPE_END28=null;
        RecParser.other_type_return other_type25 = null;

        RecParser.subtype_return subtype27 = null;


        Object DT_PATTERN20_tree=null;
        Object DT_CHANNEL21_tree=null;
        Object DT_NAME22_tree=null;
        Object DT_NODE23_tree=null;
        Object DT_XOR24_tree=null;
        Object SEP_SUBTYPE_START26_tree=null;
        Object SEP_SUBTYPE_END28_tree=null;
        RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");
        RewriteRuleSubtreeStream stream_subtype=new RewriteRuleSubtreeStream(adaptor,"rule subtype");
        RewriteRuleSubtreeStream stream_other_type=new RewriteRuleSubtreeStream(adaptor,"rule other_type");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:89:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END -> ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:89:5: DT_PATTERN
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_PATTERN20=(Token)match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype349); 
                    DT_PATTERN20_tree = (Object)adaptor.create(DT_PATTERN20);
                    adaptor.addChild(root_0, DT_PATTERN20_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:90:5: DT_CHANNEL
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_CHANNEL21=(Token)match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype356); 
                    DT_CHANNEL21_tree = (Object)adaptor.create(DT_CHANNEL21);
                    adaptor.addChild(root_0, DT_CHANNEL21_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:91:4: DT_NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_NAME22=(Token)match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype361); 
                    DT_NAME22_tree = (Object)adaptor.create(DT_NAME22);
                    adaptor.addChild(root_0, DT_NAME22_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:92:4: DT_NODE
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_NODE23=(Token)match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype366); 
                    DT_NODE23_tree = (Object)adaptor.create(DT_NODE23);
                    adaptor.addChild(root_0, DT_NODE23_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:93:4: DT_XOR
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_XOR24=(Token)match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype371); 
                    DT_XOR24_tree = (Object)adaptor.create(DT_XOR24);
                    adaptor.addChild(root_0, DT_XOR24_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:94:4: other_type SEP_SUBTYPE_START subtype SEP_SUBTYPE_END
                    {
                    pushFollow(FOLLOW_other_type_in_datatype376);
                    other_type25=other_type();

                    state._fsp--;

                    stream_other_type.add(other_type25.getTree());
                    SEP_SUBTYPE_START26=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_datatype378);  
                    stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START26);

                    pushFollow(FOLLOW_subtype_in_datatype380);
                    subtype27=subtype();

                    state._fsp--;

                    stream_subtype.add(subtype27.getTree());
                    SEP_SUBTYPE_END28=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_datatype382);  
                    stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END28);



                    // AST REWRITE
                    // elements: other_type, subtype
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:57: -> ^( other_type subtype )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:94:60: ^( other_type subtype )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:97:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final RecParser.other_type_return other_type() throws RecognitionException {
        RecParser.other_type_return retval = new RecParser.other_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set29=null;

        Object set29_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:98:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set29=(Token)input.LT(1);
            if ( (input.LA(1)>=DT_SET && input.LA(1)<=DT_TRIPLE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set29));
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:101:1: subtype : datatype ;
    public final RecParser.subtype_return subtype() throws RecognitionException {
        RecParser.subtype_return retval = new RecParser.subtype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.datatype_return datatype30 = null;



        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:102:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:102:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_subtype422);
            datatype30=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype30.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:105:1: list_ids : ID ( SEP_COMMA ID )* -> ( ID )+ ;
    public final RecParser.list_ids_return list_ids() throws RecognitionException {
        RecParser.list_ids_return retval = new RecParser.list_ids_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID31=null;
        Token SEP_COMMA32=null;
        Token ID33=null;

        Object ID31_tree=null;
        Object SEP_COMMA32_tree=null;
        Object ID33_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:106:2: ( ID ( SEP_COMMA ID )* -> ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:106:4: ID ( SEP_COMMA ID )*
            {
            ID31=(Token)match(input,ID,FOLLOW_ID_in_list_ids435);  
            stream_ID.add(ID31);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:106:7: ( SEP_COMMA ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==SEP_COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:106:8: SEP_COMMA ID
            	    {
            	    SEP_COMMA32=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_ids438);  
            	    stream_SEP_COMMA.add(SEP_COMMA32);

            	    ID33=(Token)match(input,ID,FOLLOW_ID_in_list_ids440);  
            	    stream_ID.add(ID33);


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
            // 106:23: -> ( ID )+
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:110:1: reconfiguration_block : SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) ;
    public final RecParser.reconfiguration_block_return reconfiguration_block() throws RecognitionException {
        RecParser.reconfiguration_block_return retval = new RecParser.reconfiguration_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START34=null;
        Token SEP_BLOCK_END36=null;
        RecParser.instruction_return instruction35 = null;


        Object SEP_BLOCK_START34_tree=null;
        Object SEP_BLOCK_END36_tree=null;
        RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
        RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:111:2: ( SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:111:4: SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END
            {
            SEP_BLOCK_START34=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_reconfiguration_block462);  
            stream_SEP_BLOCK_START.add(SEP_BLOCK_START34);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:111:20: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:111:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block464);
            	    instruction35=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction35.getTree());

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

            SEP_BLOCK_END36=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_reconfiguration_block467);  
            stream_SEP_BLOCK_END.add(SEP_BLOCK_END36);



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
            // 112:3: -> ^( INSTRUCTIONS instruction ( instruction )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:112:6: ^( INSTRUCTIONS instruction ( instruction )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTIONS, "INSTRUCTIONS"), root_1);

                adaptor.addChild(root_1, stream_instruction.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:112:33: ( instruction )*
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:115:1: instruction : ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction );
    public final RecParser.instruction_return instruction() throws RecognitionException {
        RecParser.instruction_return retval = new RecParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON38=null;
        Token SEP_SEMICOLON40=null;
        Token SEP_SEMICOLON42=null;
        RecParser.declaration_return declaration37 = null;

        RecParser.assignment_return assignment39 = null;

        RecParser.reconfiguration_apply_return reconfiguration_apply41 = null;

        RecParser.for_instruction_return for_instruction43 = null;


        Object SEP_SEMICOLON38_tree=null;
        Object SEP_SEMICOLON40_tree=null;
        Object SEP_SEMICOLON42_tree=null;
        RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_for_instruction=new RewriteRuleSubtreeStream(adaptor,"rule for_instruction");
        RewriteRuleSubtreeStream stream_reconfiguration_apply=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_apply");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:116:2: ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:116:4: declaration SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_declaration_in_instruction495);
                    declaration37=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration37.getTree());
                    SEP_SEMICOLON38=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction497);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON38);



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
                    // 116:32: -> declaration
                    {
                        adaptor.addChild(root_0, stream_declaration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:117:4: assignment SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_assignment_in_instruction508);
                    assignment39=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment39.getTree());
                    SEP_SEMICOLON40=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction510);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON40);



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
                    // 117:30: -> assignment
                    {
                        adaptor.addChild(root_0, stream_assignment.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:118:4: reconfiguration_apply SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction520);
                    reconfiguration_apply41=reconfiguration_apply();

                    state._fsp--;

                    stream_reconfiguration_apply.add(reconfiguration_apply41.getTree());
                    SEP_SEMICOLON42=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction522);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON42);



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
                    // 118:40: -> reconfiguration_apply
                    {
                        adaptor.addChild(root_0, stream_reconfiguration_apply.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:119:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction531);
                    for_instruction43=for_instruction();

                    state._fsp--;

                    stream_for_instruction.add(for_instruction43.getTree());


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
                    // 119:23: -> for_instruction
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:122:1: reconfiguration_apply : ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final RecParser.reconfiguration_apply_return reconfiguration_apply() throws RecognitionException {
        RecParser.reconfiguration_apply_return retval = new RecParser.reconfiguration_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID44=null;
        Token OP_APPLY45=null;
        RecParser.reconfiguration_call_return reconfiguration_call46 = null;


        Object ID44_tree=null;
        Object OP_APPLY45_tree=null;
        RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:123:2: ( ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:123:4: ( ID )? OP_APPLY reconfiguration_call
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:123:4: ( ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:123:4: ID
                    {
                    ID44=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_apply550);  
                    stream_ID.add(ID44);


                    }
                    break;

            }

            OP_APPLY45=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply553);  
            stream_OP_APPLY.add(OP_APPLY45);

            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply555);
            reconfiguration_call46=reconfiguration_call();

            state._fsp--;

            stream_reconfiguration_call.add(reconfiguration_call46.getTree());


            // AST REWRITE
            // elements: ID, reconfiguration_call, OP_APPLY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:38: -> ^( OP_APPLY reconfiguration_call ( ID )? )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:123:41: ^( OP_APPLY reconfiguration_call ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_OP_APPLY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_reconfiguration_call.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:123:73: ( ID )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:126:1: declaration : datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) ;
    public final RecParser.declaration_return declaration() throws RecognitionException {
        RecParser.declaration_return retval = new RecParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA49=null;
        RecParser.datatype_return datatype47 = null;

        RecParser.var_def_return var_def48 = null;

        RecParser.var_def_return var_def50 = null;


        Object SEP_COMMA49_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleSubtreeStream stream_var_def=new RewriteRuleSubtreeStream(adaptor,"rule var_def");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:127:2: ( datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:127:4: datatype var_def ( SEP_COMMA var_def )*
            {
            pushFollow(FOLLOW_datatype_in_declaration579);
            datatype47=datatype();

            state._fsp--;

            stream_datatype.add(datatype47.getTree());
            pushFollow(FOLLOW_var_def_in_declaration581);
            var_def48=var_def();

            state._fsp--;

            stream_var_def.add(var_def48.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:127:21: ( SEP_COMMA var_def )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==SEP_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:127:22: SEP_COMMA var_def
            	    {
            	    SEP_COMMA49=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_declaration584);  
            	    stream_SEP_COMMA.add(SEP_COMMA49);

            	    pushFollow(FOLLOW_var_def_in_declaration586);
            	    var_def50=var_def();

            	    state._fsp--;

            	    stream_var_def.add(var_def50.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: datatype, var_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 127:42: -> ^( DECLARATION datatype ( var_def )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:127:45: ^( DECLARATION datatype ( var_def )+ )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:130:1: var_def : ( ID | assignment );
    public final RecParser.var_def_return var_def() throws RecognitionException {
        RecParser.var_def_return retval = new RecParser.var_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID51=null;
        RecParser.assignment_return assignment52 = null;


        Object ID51_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:131:2: ( ID | assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:131:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID51=(Token)match(input,ID,FOLLOW_ID_in_var_def611); 
                    ID51_tree = (Object)adaptor.create(ID51);
                    adaptor.addChild(root_0, ID51_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:132:4: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_var_def616);
                    assignment52=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment52.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:135:1: assignment : ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) ;
    public final RecParser.assignment_return assignment() throws RecognitionException {
        RecParser.assignment_return retval = new RecParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID53=null;
        Token OP_EQUAL54=null;
        RecParser.assignment_member_return assignment_member55 = null;


        Object ID53_tree=null;
        Object OP_EQUAL54_tree=null;
        RewriteRuleTokenStream stream_OP_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_assignment_member=new RewriteRuleSubtreeStream(adaptor,"rule assignment_member");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:136:2: ( ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:136:4: ID OP_EQUAL assignment_member
            {
            ID53=(Token)match(input,ID,FOLLOW_ID_in_assignment629);  
            stream_ID.add(ID53);

            OP_EQUAL54=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_assignment631);  
            stream_OP_EQUAL.add(OP_EQUAL54);

            pushFollow(FOLLOW_assignment_member_in_assignment633);
            assignment_member55=assignment_member();

            state._fsp--;

            stream_assignment_member.add(assignment_member55.getTree());


            // AST REWRITE
            // elements: ID, assignment_member
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 136:36: -> ^( ASSIGNMENT ID assignment_member )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:136:39: ^( ASSIGNMENT ID assignment_member )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:1: assignment_member : ( expression | reconfiguration_apply );
    public final RecParser.assignment_member_return assignment_member() throws RecognitionException {
        RecParser.assignment_member_return retval = new RecParser.assignment_member_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.expression_return expression56 = null;

        RecParser.reconfiguration_apply_return reconfiguration_apply57 = null;



        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:140:2: ( expression | reconfiguration_apply )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:140:4: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_assignment_member659);
                    expression56=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression56.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:141:4: reconfiguration_apply
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member665);
                    reconfiguration_apply57=reconfiguration_apply();

                    state._fsp--;

                    adaptor.addChild(root_0, reconfiguration_apply57.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:144:1: reconfiguration_call : ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args ;
    public final RecParser.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecParser.reconfiguration_call_return retval = new RecParser.reconfiguration_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_JOIN58=null;
        Token OP_SPLIT59=null;
        Token OP_PAR60=null;
        Token OP_REMOVE61=null;
        Token OP_CONST62=null;
        Token OP_ID63=null;
        Token ID64=null;
        RecParser.operation_args_return operation_args65 = null;


        Object OP_JOIN58_tree=null;
        Object OP_SPLIT59_tree=null;
        Object OP_PAR60_tree=null;
        Object OP_REMOVE61_tree=null;
        Object OP_CONST62_tree=null;
        Object OP_ID63_tree=null;
        Object ID64_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:2: ( ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:5: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:5: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:6: OP_JOIN
                    {
                    OP_JOIN58=(Token)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call679); 
                    OP_JOIN58_tree = (Object)adaptor.create(OP_JOIN58);
                    root_0 = (Object)adaptor.becomeRoot(OP_JOIN58_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:17: OP_SPLIT
                    {
                    OP_SPLIT59=(Token)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call684); 
                    OP_SPLIT59_tree = (Object)adaptor.create(OP_SPLIT59);
                    root_0 = (Object)adaptor.becomeRoot(OP_SPLIT59_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:29: OP_PAR
                    {
                    OP_PAR60=(Token)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call689); 
                    OP_PAR60_tree = (Object)adaptor.create(OP_PAR60);
                    root_0 = (Object)adaptor.becomeRoot(OP_PAR60_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:39: OP_REMOVE
                    {
                    OP_REMOVE61=(Token)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call694); 
                    OP_REMOVE61_tree = (Object)adaptor.create(OP_REMOVE61);
                    root_0 = (Object)adaptor.becomeRoot(OP_REMOVE61_tree, root_0);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:52: OP_CONST
                    {
                    OP_CONST62=(Token)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call699); 
                    OP_CONST62_tree = (Object)adaptor.create(OP_CONST62);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONST62_tree, root_0);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:64: OP_ID
                    {
                    OP_ID63=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call704); 
                    OP_ID63_tree = (Object)adaptor.create(OP_ID63);
                    root_0 = (Object)adaptor.becomeRoot(OP_ID63_tree, root_0);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:145:73: ID
                    {
                    ID64=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_call709); 
                    ID64_tree = (Object)adaptor.create(ID64);
                    root_0 = (Object)adaptor.becomeRoot(ID64_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_operation_args_in_reconfiguration_call713);
            operation_args65=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args65.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:1: structure_operation_call : ( OP_PATH | OP_UPDATE ) operation_args ;
    public final RecParser.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecParser.structure_operation_call_return retval = new RecParser.structure_operation_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PATH66=null;
        Token OP_UPDATE67=null;
        RecParser.operation_args_return operation_args68 = null;


        Object OP_PATH66_tree=null;
        Object OP_UPDATE67_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:150:2: ( ( OP_PATH | OP_UPDATE ) operation_args )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:150:4: ( OP_PATH | OP_UPDATE ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:150:4: ( OP_PATH | OP_UPDATE )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:150:6: OP_PATH
                    {
                    OP_PATH66=(Token)match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call729); 
                    OP_PATH66_tree = (Object)adaptor.create(OP_PATH66);
                    root_0 = (Object)adaptor.becomeRoot(OP_PATH66_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:150:17: OP_UPDATE
                    {
                    OP_UPDATE67=(Token)match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call734); 
                    OP_UPDATE67_tree = (Object)adaptor.create(OP_UPDATE67);
                    root_0 = (Object)adaptor.becomeRoot(OP_UPDATE67_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_operation_args_in_structure_operation_call739);
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
        }
        return retval;
    }
    // $ANTLR end "structure_operation_call"

    public static class operation_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:154:1: operation_args : SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? ;
    public final RecParser.operation_args_return operation_args() throws RecognitionException {
        RecParser.operation_args_return retval = new RecParser.operation_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_ARGS_START69=null;
        Token SEP_ARGS_END71=null;
        RecParser.args_return args70 = null;


        Object SEP_ARGS_START69_tree=null;
        Object SEP_ARGS_END71_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:155:2: ( SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:155:4: SEP_ARGS_START ( args )? SEP_ARGS_END
            {
            SEP_ARGS_START69=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_operation_args754);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START69);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:155:19: ( args )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=OP_PATH && LA16_0<=OP_UPDATE)||(LA16_0>=CONS_PAIR && LA16_0<=ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:155:19: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args756);
                    args70=args();

                    state._fsp--;

                    stream_args.add(args70.getTree());

                    }
                    break;

            }

            SEP_ARGS_END71=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_operation_args759);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END71);



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
            // 155:38: -> ( args )?
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:155:41: ( args )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:158:1: args : expression ( SEP_COMMA expression )* -> ( expression )+ ;
    public final RecParser.args_return args() throws RecognitionException {
        RecParser.args_return retval = new RecParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA73=null;
        RecParser.expression_return expression72 = null;

        RecParser.expression_return expression74 = null;


        Object SEP_COMMA73_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:159:2: ( expression ( SEP_COMMA expression )* -> ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:159:4: expression ( SEP_COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_args776);
            expression72=expression();

            state._fsp--;

            stream_expression.add(expression72.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:159:15: ( SEP_COMMA expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SEP_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:159:16: SEP_COMMA expression
            	    {
            	    SEP_COMMA73=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_args779);  
            	    stream_SEP_COMMA.add(SEP_COMMA73);

            	    pushFollow(FOLLOW_expression_in_args781);
            	    expression74=expression();

            	    state._fsp--;

            	    stream_expression.add(expression74.getTree());

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
            // 160:3: -> ( expression )+
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:164:1: for_instruction : RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) ;
    public final RecParser.for_instruction_return for_instruction() throws RecognitionException {
        RecParser.for_instruction_return retval = new RecParser.for_instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_FORALL75=null;
        Token SEP_ARGS_START76=null;
        Token ID78=null;
        Token SEP_COLON79=null;
        Token ID80=null;
        Token SEP_ARGS_END81=null;
        RecParser.datatype_return datatype77 = null;

        RecParser.reconfiguration_block_return reconfiguration_block82 = null;


        Object RW_FORALL75_tree=null;
        Object SEP_ARGS_START76_tree=null;
        Object ID78_tree=null;
        Object SEP_COLON79_tree=null;
        Object ID80_tree=null;
        Object SEP_ARGS_END81_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_COLON=new RewriteRuleTokenStream(adaptor,"token SEP_COLON");
        RewriteRuleTokenStream stream_RW_FORALL=new RewriteRuleTokenStream(adaptor,"token RW_FORALL");
        RewriteRuleSubtreeStream stream_reconfiguration_block=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_block");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:165:2: ( RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:165:4: RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
            {
            RW_FORALL75=(Token)match(input,RW_FORALL,FOLLOW_RW_FORALL_in_for_instruction805);  
            stream_RW_FORALL.add(RW_FORALL75);

            SEP_ARGS_START76=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_for_instruction807);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START76);

            pushFollow(FOLLOW_datatype_in_for_instruction809);
            datatype77=datatype();

            state._fsp--;

            stream_datatype.add(datatype77.getTree());
            ID78=(Token)match(input,ID,FOLLOW_ID_in_for_instruction811);  
            stream_ID.add(ID78);

            SEP_COLON79=(Token)match(input,SEP_COLON,FOLLOW_SEP_COLON_in_for_instruction813);  
            stream_SEP_COLON.add(SEP_COLON79);

            ID80=(Token)match(input,ID,FOLLOW_ID_in_for_instruction815);  
            stream_ID.add(ID80);

            SEP_ARGS_END81=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_for_instruction817);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END81);

            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction819);
            reconfiguration_block82=reconfiguration_block();

            state._fsp--;

            stream_reconfiguration_block.add(reconfiguration_block82.getTree());


            // AST REWRITE
            // elements: reconfiguration_block, ID, ID, datatype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 166:3: -> ^( FORALL datatype ID ID reconfiguration_block )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:166:6: ^( FORALL datatype ID ID reconfiguration_block )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:170:1: expression : union_expr ( OP_UNION union_expr )* ;
    public final RecParser.expression_return expression() throws RecognitionException {
        RecParser.expression_return retval = new RecParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_UNION84=null;
        RecParser.union_expr_return union_expr83 = null;

        RecParser.union_expr_return union_expr85 = null;


        Object OP_UNION84_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:171:2: ( union_expr ( OP_UNION union_expr )* )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:171:4: union_expr ( OP_UNION union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_union_expr_in_expression849);
            union_expr83=union_expr();

            state._fsp--;

            adaptor.addChild(root_0, union_expr83.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:171:15: ( OP_UNION union_expr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==OP_UNION) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:171:16: OP_UNION union_expr
            	    {
            	    OP_UNION84=(Token)match(input,OP_UNION,FOLLOW_OP_UNION_in_expression852); 
            	    OP_UNION84_tree = (Object)adaptor.create(OP_UNION84);
            	    root_0 = (Object)adaptor.becomeRoot(OP_UNION84_tree, root_0);

            	    pushFollow(FOLLOW_union_expr_in_expression855);
            	    union_expr85=union_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, union_expr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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

    public static class union_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "union_expr"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:175:1: union_expr : intersect_expr ( OP_INTERSECTION intersect_expr )* ;
    public final RecParser.union_expr_return union_expr() throws RecognitionException {
        RecParser.union_expr_return retval = new RecParser.union_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_INTERSECTION87=null;
        RecParser.intersect_expr_return intersect_expr86 = null;

        RecParser.intersect_expr_return intersect_expr88 = null;


        Object OP_INTERSECTION87_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:176:2: ( intersect_expr ( OP_INTERSECTION intersect_expr )* )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:176:4: intersect_expr ( OP_INTERSECTION intersect_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_intersect_expr_in_union_expr872);
            intersect_expr86=intersect_expr();

            state._fsp--;

            adaptor.addChild(root_0, intersect_expr86.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:176:19: ( OP_INTERSECTION intersect_expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OP_INTERSECTION) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:176:20: OP_INTERSECTION intersect_expr
            	    {
            	    OP_INTERSECTION87=(Token)match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_union_expr875); 
            	    OP_INTERSECTION87_tree = (Object)adaptor.create(OP_INTERSECTION87);
            	    root_0 = (Object)adaptor.becomeRoot(OP_INTERSECTION87_tree, root_0);

            	    pushFollow(FOLLOW_intersect_expr_in_union_expr878);
            	    intersect_expr88=intersect_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, intersect_expr88.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "union_expr"

    public static class intersect_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "intersect_expr"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:180:1: intersect_expr : factor ( OP_MINUS factor )? ;
    public final RecParser.intersect_expr_return intersect_expr() throws RecognitionException {
        RecParser.intersect_expr_return retval = new RecParser.intersect_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS90=null;
        RecParser.factor_return factor89 = null;

        RecParser.factor_return factor91 = null;


        Object OP_MINUS90_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:181:2: ( factor ( OP_MINUS factor )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:181:4: factor ( OP_MINUS factor )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_intersect_expr895);
            factor89=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor89.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:181:11: ( OP_MINUS factor )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==OP_MINUS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:181:12: OP_MINUS factor
                    {
                    OP_MINUS90=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_intersect_expr898); 
                    OP_MINUS90_tree = (Object)adaptor.create(OP_MINUS90);
                    root_0 = (Object)adaptor.becomeRoot(OP_MINUS90_tree, root_0);

                    pushFollow(FOLLOW_factor_in_intersect_expr901);
                    factor91=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor91.getTree());

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
    // $ANTLR end "intersect_expr"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:186:1: factor : ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | operation | constructor );
    public final RecParser.factor_return factor() throws RecognitionException {
        RecParser.factor_return retval = new RecParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID92=null;
        Token SEP_SUBTYPE_START93=null;
        Token ID94=null;
        Token SEP_SUBTYPE_END95=null;
        Token ID96=null;
        RecParser.operation_return operation97 = null;

        RecParser.constructor_return constructor98 = null;


        Object ID92_tree=null;
        Object SEP_SUBTYPE_START93_tree=null;
        Object ID94_tree=null;
        Object SEP_SUBTYPE_END95_tree=null;
        Object ID96_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:187:2: ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | operation | constructor )
            int alt21=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case SEP_SUBTYPE_START:
                    {
                    alt21=1;
                    }
                    break;
                case OP_UNION:
                case OP_INTERSECTION:
                case OP_MINUS:
                case SEP_COMMA:
                case SEP_SEMICOLON:
                case SEP_ARGS_END:
                    {
                    alt21=2;
                    }
                    break;
                case SEP_ACCESSOR:
                case SEP_STRUCTURE:
                    {
                    alt21=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

                }
                break;
            case OP_PATH:
            case OP_UPDATE:
                {
                alt21=3;
                }
                break;
            case CONS_PAIR:
            case CONS_TRIPLE:
            case CONS_SET:
            case CONS_NODE:
            case CONS_XOR:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:187:4: ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END
                    {
                    ID92=(Token)match(input,ID,FOLLOW_ID_in_factor919);  
                    stream_ID.add(ID92);

                    SEP_SUBTYPE_START93=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_factor921);  
                    stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START93);

                    ID94=(Token)match(input,ID,FOLLOW_ID_in_factor923);  
                    stream_ID.add(ID94);

                    SEP_SUBTYPE_END95=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_factor925);  
                    stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END95);



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
                    // 187:47: -> ^( ID ID )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:187:50: ^( ID ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:188:4: ID
                    {
                    ID96=(Token)match(input,ID,FOLLOW_ID_in_factor943);  
                    stream_ID.add(ID96);



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
                    // 188:14: -> ID
                    {
                        adaptor.addChild(root_0, stream_ID.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:189:4: operation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_operation_in_factor959);
                    operation97=operation();

                    state._fsp--;

                    adaptor.addChild(root_0, operation97.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:190:4: constructor
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constructor_in_factor964);
                    constructor98=constructor();

                    state._fsp--;

                    adaptor.addChild(root_0, constructor98.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:193:1: operation : ( ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call -> structure_operation_call );
    public final RecParser.operation_return operation() throws RecognitionException {
        RecParser.operation_return retval = new RecParser.operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID99=null;
        Token SEP_STRUCTURE100=null;
        Token ID101=null;
        Token SEP_ACCESSOR102=null;
        RecParser.attribute_call_return attribute_call103 = null;

        RecParser.structure_operation_call_return structure_operation_call104 = null;


        Object ID99_tree=null;
        Object SEP_STRUCTURE100_tree=null;
        Object ID101_tree=null;
        Object SEP_ACCESSOR102_tree=null;
        RewriteRuleTokenStream stream_SEP_STRUCTURE=new RewriteRuleTokenStream(adaptor,"token SEP_STRUCTURE");
        RewriteRuleTokenStream stream_SEP_ACCESSOR=new RewriteRuleTokenStream(adaptor,"token SEP_ACCESSOR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_structure_operation_call=new RewriteRuleSubtreeStream(adaptor,"rule structure_operation_call");
        RewriteRuleSubtreeStream stream_attribute_call=new RewriteRuleSubtreeStream(adaptor,"rule attribute_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:194:2: ( ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call -> structure_operation_call )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=OP_PATH && LA23_0<=OP_UPDATE)) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:194:5: ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call
                    {
                    ID99=(Token)match(input,ID,FOLLOW_ID_in_operation976);  
                    stream_ID.add(ID99);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:194:8: ( SEP_STRUCTURE ID )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==SEP_STRUCTURE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:194:9: SEP_STRUCTURE ID
                            {
                            SEP_STRUCTURE100=(Token)match(input,SEP_STRUCTURE,FOLLOW_SEP_STRUCTURE_in_operation979);  
                            stream_SEP_STRUCTURE.add(SEP_STRUCTURE100);

                            ID101=(Token)match(input,ID,FOLLOW_ID_in_operation981);  
                            stream_ID.add(ID101);


                            }
                            break;

                    }

                    SEP_ACCESSOR102=(Token)match(input,SEP_ACCESSOR,FOLLOW_SEP_ACCESSOR_in_operation985);  
                    stream_SEP_ACCESSOR.add(SEP_ACCESSOR102);

                    pushFollow(FOLLOW_attribute_call_in_operation987);
                    attribute_call103=attribute_call();

                    state._fsp--;

                    stream_attribute_call.add(attribute_call103.getTree());


                    // AST REWRITE
                    // elements: attribute_call, ID, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:57: -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:194:60: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCESS, "ACCESS"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:194:72: ( ^( STRUCTURE ID ) )?
                        if ( stream_ID.hasNext() ) {
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:194:72: ^( STRUCTURE ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:196:5: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1012);
                    structure_operation_call104=structure_operation_call();

                    state._fsp--;

                    stream_structure_operation_call.add(structure_operation_call104.getTree());


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
                    // 196:35: -> structure_operation_call
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:199:1: constructor : ( triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons | node_cons -> node_cons | xor_cons -> xor_cons );
    public final RecParser.constructor_return constructor() throws RecognitionException {
        RecParser.constructor_return retval = new RecParser.constructor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.triple_cons_return triple_cons105 = null;

        RecParser.pair_cons_return pair_cons106 = null;

        RecParser.set_cons_return set_cons107 = null;

        RecParser.node_cons_return node_cons108 = null;

        RecParser.xor_cons_return xor_cons109 = null;


        RewriteRuleSubtreeStream stream_triple_cons=new RewriteRuleSubtreeStream(adaptor,"rule triple_cons");
        RewriteRuleSubtreeStream stream_node_cons=new RewriteRuleSubtreeStream(adaptor,"rule node_cons");
        RewriteRuleSubtreeStream stream_set_cons=new RewriteRuleSubtreeStream(adaptor,"rule set_cons");
        RewriteRuleSubtreeStream stream_xor_cons=new RewriteRuleSubtreeStream(adaptor,"rule xor_cons");
        RewriteRuleSubtreeStream stream_pair_cons=new RewriteRuleSubtreeStream(adaptor,"rule pair_cons");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:200:2: ( triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons | node_cons -> node_cons | xor_cons -> xor_cons )
            int alt24=5;
            switch ( input.LA(1) ) {
            case CONS_TRIPLE:
                {
                alt24=1;
                }
                break;
            case CONS_PAIR:
                {
                alt24=2;
                }
                break;
            case CONS_SET:
                {
                alt24=3;
                }
                break;
            case CONS_NODE:
                {
                alt24=4;
                }
                break;
            case CONS_XOR:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:200:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1033);
                    triple_cons105=triple_cons();

                    state._fsp--;

                    stream_triple_cons.add(triple_cons105.getTree());


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
                    // 200:22: -> triple_cons
                    {
                        adaptor.addChild(root_0, stream_triple_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:201:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1048);
                    pair_cons106=pair_cons();

                    state._fsp--;

                    stream_pair_cons.add(pair_cons106.getTree());


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
                    // 201:20: -> pair_cons
                    {
                        adaptor.addChild(root_0, stream_pair_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:202:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1063);
                    set_cons107=set_cons();

                    state._fsp--;

                    stream_set_cons.add(set_cons107.getTree());


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
                    // 202:20: -> set_cons
                    {
                        adaptor.addChild(root_0, stream_set_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:203:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1080);
                    node_cons108=node_cons();

                    state._fsp--;

                    stream_node_cons.add(node_cons108.getTree());


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
                    // 203:19: -> node_cons
                    {
                        adaptor.addChild(root_0, stream_node_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:204:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1094);
                    xor_cons109=xor_cons();

                    state._fsp--;

                    stream_xor_cons.add(xor_cons109.getTree());


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
                    // 204:18: -> xor_cons
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:211:1: attribute_call : ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_ENDS SEP_ARGS_START ID SEP_ARGS_END -> ^( OP_ENDS ID ) | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_CHANNELS -> OP_CHANNELS | OP_FST -> OP_FST | OP_SND -> OP_SND | OP_TRD -> OP_TRD | ID -> ID );
    public final RecParser.attribute_call_return attribute_call() throws RecognitionException {
        RecParser.attribute_call_return retval = new RecParser.attribute_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_IN110=null;
        Token SEP_LIST_START111=null;
        Token INT112=null;
        Token SEP_LIST_END113=null;
        Token OP_OUT114=null;
        Token SEP_LIST_START115=null;
        Token INT116=null;
        Token SEP_LIST_END117=null;
        Token OP_NAME118=null;
        Token OP_ENDS119=null;
        Token SEP_ARGS_START120=null;
        Token ID121=null;
        Token SEP_ARGS_END122=null;
        Token OP_NODES123=null;
        Token OP_NAMES124=null;
        Token OP_CHANNELS125=null;
        Token OP_FST126=null;
        Token OP_SND127=null;
        Token OP_TRD128=null;
        Token ID129=null;

        Object OP_IN110_tree=null;
        Object SEP_LIST_START111_tree=null;
        Object INT112_tree=null;
        Object SEP_LIST_END113_tree=null;
        Object OP_OUT114_tree=null;
        Object SEP_LIST_START115_tree=null;
        Object INT116_tree=null;
        Object SEP_LIST_END117_tree=null;
        Object OP_NAME118_tree=null;
        Object OP_ENDS119_tree=null;
        Object SEP_ARGS_START120_tree=null;
        Object ID121_tree=null;
        Object SEP_ARGS_END122_tree=null;
        Object OP_NODES123_tree=null;
        Object OP_NAMES124_tree=null;
        Object OP_CHANNELS125_tree=null;
        Object OP_FST126_tree=null;
        Object OP_SND127_tree=null;
        Object OP_TRD128_tree=null;
        Object ID129_tree=null;
        RewriteRuleTokenStream stream_SEP_LIST_END=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_END");
        RewriteRuleTokenStream stream_OP_NODES=new RewriteRuleTokenStream(adaptor,"token OP_NODES");
        RewriteRuleTokenStream stream_OP_OUT=new RewriteRuleTokenStream(adaptor,"token OP_OUT");
        RewriteRuleTokenStream stream_OP_NAMES=new RewriteRuleTokenStream(adaptor,"token OP_NAMES");
        RewriteRuleTokenStream stream_OP_CHANNELS=new RewriteRuleTokenStream(adaptor,"token OP_CHANNELS");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_OP_TRD=new RewriteRuleTokenStream(adaptor,"token OP_TRD");
        RewriteRuleTokenStream stream_SEP_LIST_START=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_START");
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_OP_FST=new RewriteRuleTokenStream(adaptor,"token OP_FST");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_OP_NAME=new RewriteRuleTokenStream(adaptor,"token OP_NAME");
        RewriteRuleTokenStream stream_OP_ENDS=new RewriteRuleTokenStream(adaptor,"token OP_ENDS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_OP_IN=new RewriteRuleTokenStream(adaptor,"token OP_IN");
        RewriteRuleTokenStream stream_OP_SND=new RewriteRuleTokenStream(adaptor,"token OP_SND");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:212:2: ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_ENDS SEP_ARGS_START ID SEP_ARGS_END -> ^( OP_ENDS ID ) | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_CHANNELS -> OP_CHANNELS | OP_FST -> OP_FST | OP_SND -> OP_SND | OP_TRD -> OP_TRD | ID -> ID )
            int alt27=11;
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
            case OP_ENDS:
                {
                alt27=4;
                }
                break;
            case OP_NODES:
                {
                alt27=5;
                }
                break;
            case OP_NAMES:
                {
                alt27=6;
                }
                break;
            case OP_CHANNELS:
                {
                alt27=7;
                }
                break;
            case OP_FST:
                {
                alt27=8;
                }
                break;
            case OP_SND:
                {
                alt27=9;
                }
                break;
            case OP_TRD:
                {
                alt27=10;
                }
                break;
            case ID:
                {
                alt27=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:212:4: OP_IN ( SEP_LIST_START INT SEP_LIST_END )?
                    {
                    OP_IN110=(Token)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1119);  
                    stream_OP_IN.add(OP_IN110);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:212:10: ( SEP_LIST_START INT SEP_LIST_END )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==SEP_LIST_START) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:212:11: SEP_LIST_START INT SEP_LIST_END
                            {
                            SEP_LIST_START111=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_attribute_call1122);  
                            stream_SEP_LIST_START.add(SEP_LIST_START111);

                            INT112=(Token)match(input,INT,FOLLOW_INT_in_attribute_call1124);  
                            stream_INT.add(INT112);

                            SEP_LIST_END113=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_attribute_call1126);  
                            stream_SEP_LIST_END.add(SEP_LIST_END113);


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
                    // 212:47: -> ^( OP_IN ( INT )? )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:212:50: ^( OP_IN ( INT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_IN.nextNode(), root_1);

                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:212:58: ( INT )?
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:5: OP_OUT ( SEP_LIST_START INT SEP_LIST_END )?
                    {
                    OP_OUT114=(Token)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1145);  
                    stream_OP_OUT.add(OP_OUT114);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:12: ( SEP_LIST_START INT SEP_LIST_END )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==SEP_LIST_START) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:13: SEP_LIST_START INT SEP_LIST_END
                            {
                            SEP_LIST_START115=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_attribute_call1148);  
                            stream_SEP_LIST_START.add(SEP_LIST_START115);

                            INT116=(Token)match(input,INT,FOLLOW_INT_in_attribute_call1150);  
                            stream_INT.add(INT116);

                            SEP_LIST_END117=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_attribute_call1152);  
                            stream_SEP_LIST_END.add(SEP_LIST_END117);


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
                    // 213:47: -> ^( OP_OUT ( INT )? )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:50: ^( OP_OUT ( INT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_OUT.nextNode(), root_1);

                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:59: ( INT )?
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:214:4: OP_NAME
                    {
                    OP_NAME118=(Token)match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1168);  
                    stream_OP_NAME.add(OP_NAME118);



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
                    // 214:17: -> OP_NAME
                    {
                        adaptor.addChild(root_0, stream_OP_NAME.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:215:4: OP_ENDS SEP_ARGS_START ID SEP_ARGS_END
                    {
                    OP_ENDS119=(Token)match(input,OP_ENDS,FOLLOW_OP_ENDS_in_attribute_call1182);  
                    stream_OP_ENDS.add(OP_ENDS119);

                    SEP_ARGS_START120=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_attribute_call1184);  
                    stream_SEP_ARGS_START.add(SEP_ARGS_START120);

                    ID121=(Token)match(input,ID,FOLLOW_ID_in_attribute_call1186);  
                    stream_ID.add(ID121);

                    SEP_ARGS_END122=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_attribute_call1188);  
                    stream_SEP_ARGS_END.add(SEP_ARGS_END122);



                    // AST REWRITE
                    // elements: OP_ENDS, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:44: -> ^( OP_ENDS ID )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:215:47: ^( OP_ENDS ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_ENDS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:216:4: OP_NODES
                    {
                    OP_NODES123=(Token)match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1202);  
                    stream_OP_NODES.add(OP_NODES123);



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
                    // 216:17: -> OP_NODES
                    {
                        adaptor.addChild(root_0, stream_OP_NODES.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:217:4: OP_NAMES
                    {
                    OP_NAMES124=(Token)match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1215);  
                    stream_OP_NAMES.add(OP_NAMES124);



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
                    // 217:17: -> OP_NAMES
                    {
                        adaptor.addChild(root_0, stream_OP_NAMES.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:218:4: OP_CHANNELS
                    {
                    OP_CHANNELS125=(Token)match(input,OP_CHANNELS,FOLLOW_OP_CHANNELS_in_attribute_call1228);  
                    stream_OP_CHANNELS.add(OP_CHANNELS125);



                    // AST REWRITE
                    // elements: OP_CHANNELS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:20: -> OP_CHANNELS
                    {
                        adaptor.addChild(root_0, stream_OP_CHANNELS.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:219:4: OP_FST
                    {
                    OP_FST126=(Token)match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1241);  
                    stream_OP_FST.add(OP_FST126);



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
                    // 219:16: -> OP_FST
                    {
                        adaptor.addChild(root_0, stream_OP_FST.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:220:4: OP_SND
                    {
                    OP_SND127=(Token)match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1255);  
                    stream_OP_SND.add(OP_SND127);



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
                    // 220:16: -> OP_SND
                    {
                        adaptor.addChild(root_0, stream_OP_SND.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:4: OP_TRD
                    {
                    OP_TRD128=(Token)match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1269);  
                    stream_OP_TRD.add(OP_TRD128);



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
                    // 221:16: -> OP_TRD
                    {
                        adaptor.addChild(root_0, stream_OP_TRD.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 11 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:222:4: ID
                    {
                    ID129=(Token)match(input,ID,FOLLOW_ID_in_attribute_call1283);  
                    stream_ID.add(ID129);



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
                    // 222:12: -> ID
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:226:1: triple_cons : CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) ;
    public final RecParser.triple_cons_return triple_cons() throws RecognitionException {
        RecParser.triple_cons_return retval = new RecParser.triple_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_TRIPLE130=null;
        Token SEP_ARGS_START131=null;
        Token SEP_COMMA133=null;
        Token SEP_COMMA135=null;
        Token SEP_ARGS_END137=null;
        RecParser.expression_return expression132 = null;

        RecParser.expression_return expression134 = null;

        RecParser.expression_return expression136 = null;


        Object CONS_TRIPLE130_tree=null;
        Object SEP_ARGS_START131_tree=null;
        Object SEP_COMMA133_tree=null;
        Object SEP_COMMA135_tree=null;
        Object SEP_ARGS_END137_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_CONS_TRIPLE=new RewriteRuleTokenStream(adaptor,"token CONS_TRIPLE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:227:2: ( CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:227:4: CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END
            {
            CONS_TRIPLE130=(Token)match(input,CONS_TRIPLE,FOLLOW_CONS_TRIPLE_in_triple_cons1306);  
            stream_CONS_TRIPLE.add(CONS_TRIPLE130);

            SEP_ARGS_START131=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_triple_cons1308);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START131);

            pushFollow(FOLLOW_expression_in_triple_cons1310);
            expression132=expression();

            state._fsp--;

            stream_expression.add(expression132.getTree());
            SEP_COMMA133=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons1312);  
            stream_SEP_COMMA.add(SEP_COMMA133);

            pushFollow(FOLLOW_expression_in_triple_cons1314);
            expression134=expression();

            state._fsp--;

            stream_expression.add(expression134.getTree());
            SEP_COMMA135=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons1316);  
            stream_SEP_COMMA.add(SEP_COMMA135);

            pushFollow(FOLLOW_expression_in_triple_cons1318);
            expression136=expression();

            state._fsp--;

            stream_expression.add(expression136.getTree());
            SEP_ARGS_END137=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_triple_cons1320);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END137);



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
            // 228:3: -> ^( TRIPLE expression expression expression )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:228:6: ^( TRIPLE expression expression expression )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:232:1: pair_cons : CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) ;
    public final RecParser.pair_cons_return pair_cons() throws RecognitionException {
        RecParser.pair_cons_return retval = new RecParser.pair_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_PAIR138=null;
        Token SEP_ARGS_START139=null;
        Token SEP_COMMA141=null;
        Token SEP_ARGS_END143=null;
        RecParser.expression_return expression140 = null;

        RecParser.expression_return expression142 = null;


        Object CONS_PAIR138_tree=null;
        Object SEP_ARGS_START139_tree=null;
        Object SEP_COMMA141_tree=null;
        Object SEP_ARGS_END143_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_CONS_PAIR=new RewriteRuleTokenStream(adaptor,"token CONS_PAIR");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:233:2: ( CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:233:4: CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END
            {
            CONS_PAIR138=(Token)match(input,CONS_PAIR,FOLLOW_CONS_PAIR_in_pair_cons1349);  
            stream_CONS_PAIR.add(CONS_PAIR138);

            SEP_ARGS_START139=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_pair_cons1351);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START139);

            pushFollow(FOLLOW_expression_in_pair_cons1353);
            expression140=expression();

            state._fsp--;

            stream_expression.add(expression140.getTree());
            SEP_COMMA141=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_pair_cons1355);  
            stream_SEP_COMMA.add(SEP_COMMA141);

            pushFollow(FOLLOW_expression_in_pair_cons1357);
            expression142=expression();

            state._fsp--;

            stream_expression.add(expression142.getTree());
            SEP_ARGS_END143=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_pair_cons1359);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END143);



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
            // 234:3: -> ^( PAIR expression expression )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:234:6: ^( PAIR expression expression )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:239:1: set_cons : CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) ;
    public final RecParser.set_cons_return set_cons() throws RecognitionException {
        RecParser.set_cons_return retval = new RecParser.set_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_SET144=null;
        Token SEP_ARGS_START145=null;
        Token SEP_COMMA147=null;
        Token SEP_ARGS_END149=null;
        RecParser.expression_return expression146 = null;

        RecParser.expression_return expression148 = null;


        Object CONS_SET144_tree=null;
        Object SEP_ARGS_START145_tree=null;
        Object SEP_COMMA147_tree=null;
        Object SEP_ARGS_END149_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_CONS_SET=new RewriteRuleTokenStream(adaptor,"token CONS_SET");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:240:2: ( CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:240:4: CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END
            {
            CONS_SET144=(Token)match(input,CONS_SET,FOLLOW_CONS_SET_in_set_cons1387);  
            stream_CONS_SET.add(CONS_SET144);

            SEP_ARGS_START145=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_set_cons1389);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START145);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:240:29: ( expression ( SEP_COMMA expression )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=OP_PATH && LA29_0<=OP_UPDATE)||(LA29_0>=CONS_PAIR && LA29_0<=ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:240:31: expression ( SEP_COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_set_cons1394);
                    expression146=expression();

                    state._fsp--;

                    stream_expression.add(expression146.getTree());
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:240:42: ( SEP_COMMA expression )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==SEP_COMMA) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:240:43: SEP_COMMA expression
                    	    {
                    	    SEP_COMMA147=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_set_cons1397);  
                    	    stream_SEP_COMMA.add(SEP_COMMA147);

                    	    pushFollow(FOLLOW_expression_in_set_cons1399);
                    	    expression148=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression148.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            SEP_ARGS_END149=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_set_cons1406);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END149);



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
            // 241:3: -> ^( SET ( expression )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:241:6: ^( SET ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:241:12: ( expression )*
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:245:1: node_cons : CONS_NODE SEP_ARGS_START ID ( SEP_COMMA ID )* SEP_ARGS_END -> ^( NODE ( ID )+ ) ;
    public final RecParser.node_cons_return node_cons() throws RecognitionException {
        RecParser.node_cons_return retval = new RecParser.node_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_NODE150=null;
        Token SEP_ARGS_START151=null;
        Token ID152=null;
        Token SEP_COMMA153=null;
        Token ID154=null;
        Token SEP_ARGS_END155=null;

        Object CONS_NODE150_tree=null;
        Object SEP_ARGS_START151_tree=null;
        Object ID152_tree=null;
        Object SEP_COMMA153_tree=null;
        Object ID154_tree=null;
        Object SEP_ARGS_END155_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CONS_NODE=new RewriteRuleTokenStream(adaptor,"token CONS_NODE");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:246:2: ( CONS_NODE SEP_ARGS_START ID ( SEP_COMMA ID )* SEP_ARGS_END -> ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:246:4: CONS_NODE SEP_ARGS_START ID ( SEP_COMMA ID )* SEP_ARGS_END
            {
            CONS_NODE150=(Token)match(input,CONS_NODE,FOLLOW_CONS_NODE_in_node_cons1433);  
            stream_CONS_NODE.add(CONS_NODE150);

            SEP_ARGS_START151=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_node_cons1435);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START151);

            ID152=(Token)match(input,ID,FOLLOW_ID_in_node_cons1438);  
            stream_ID.add(ID152);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:246:33: ( SEP_COMMA ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==SEP_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:246:34: SEP_COMMA ID
            	    {
            	    SEP_COMMA153=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_node_cons1441);  
            	    stream_SEP_COMMA.add(SEP_COMMA153);

            	    ID154=(Token)match(input,ID,FOLLOW_ID_in_node_cons1443);  
            	    stream_ID.add(ID154);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            SEP_ARGS_END155=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_node_cons1447);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END155);



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
            // 247:3: -> ^( NODE ( ID )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:247:6: ^( NODE ( ID )+ )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:250:1: xor_cons : CONS_XOR SEP_ARGS_START id1= ID ( SEP_COMMA id2= ID )* SEP_COLON id3= ID ( SEP_COMMA id4= ID )+ SEP_ARGS_END -> ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) ) ;
    public final RecParser.xor_cons_return xor_cons() throws RecognitionException {
        RecParser.xor_cons_return retval = new RecParser.xor_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token id1=null;
        Token id2=null;
        Token id3=null;
        Token id4=null;
        Token CONS_XOR156=null;
        Token SEP_ARGS_START157=null;
        Token SEP_COMMA158=null;
        Token SEP_COLON159=null;
        Token SEP_COMMA160=null;
        Token SEP_ARGS_END161=null;

        Object id1_tree=null;
        Object id2_tree=null;
        Object id3_tree=null;
        Object id4_tree=null;
        Object CONS_XOR156_tree=null;
        Object SEP_ARGS_START157_tree=null;
        Object SEP_COMMA158_tree=null;
        Object SEP_COLON159_tree=null;
        Object SEP_COMMA160_tree=null;
        Object SEP_ARGS_END161_tree=null;
        RewriteRuleTokenStream stream_CONS_XOR=new RewriteRuleTokenStream(adaptor,"token CONS_XOR");
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_COLON=new RewriteRuleTokenStream(adaptor,"token SEP_COLON");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:2: ( CONS_XOR SEP_ARGS_START id1= ID ( SEP_COMMA id2= ID )* SEP_COLON id3= ID ( SEP_COMMA id4= ID )+ SEP_ARGS_END -> ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:4: CONS_XOR SEP_ARGS_START id1= ID ( SEP_COMMA id2= ID )* SEP_COLON id3= ID ( SEP_COMMA id4= ID )+ SEP_ARGS_END
            {
            CONS_XOR156=(Token)match(input,CONS_XOR,FOLLOW_CONS_XOR_in_xor_cons1472);  
            stream_CONS_XOR.add(CONS_XOR156);

            SEP_ARGS_START157=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_xor_cons1474);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START157);

            id1=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1478);  
            stream_ID.add(id1);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:35: ( SEP_COMMA id2= ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==SEP_COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:36: SEP_COMMA id2= ID
            	    {
            	    SEP_COMMA158=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_xor_cons1481);  
            	    stream_SEP_COMMA.add(SEP_COMMA158);

            	    id2=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1485);  
            	    stream_ID.add(id2);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            SEP_COLON159=(Token)match(input,SEP_COLON,FOLLOW_SEP_COLON_in_xor_cons1489);  
            stream_SEP_COLON.add(SEP_COLON159);

            id3=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1493);  
            stream_ID.add(id3);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:72: ( SEP_COMMA id4= ID )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SEP_COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:251:73: SEP_COMMA id4= ID
            	    {
            	    SEP_COMMA160=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_xor_cons1496);  
            	    stream_SEP_COMMA.add(SEP_COMMA160);

            	    id4=(Token)match(input,ID,FOLLOW_ID_in_xor_cons1500);  
            	    stream_ID.add(id4);


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            SEP_ARGS_END161=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_xor_cons1504);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END161);



            // AST REWRITE
            // elements: id1, id2, id4, id3
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
            // 252:3: -> ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:252:6: ^( XOR ^( IN $id1 ( $id2)* ) ^( OUT $id3 ( $id4)+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(XOR, "XOR"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:252:13: ^( IN $id1 ( $id2)* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);

                adaptor.addChild(root_2, stream_id1.nextNode());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:252:23: ( $id2)*
                while ( stream_id2.hasNext() ) {
                    adaptor.addChild(root_2, stream_id2.nextNode());

                }
                stream_id2.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:252:30: ^( OUT $id3 ( $id4)+ )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:258:1: applicaiton_def : ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? ;
    public final RecParser.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecParser.applicaiton_def_return retval = new RecParser.applicaiton_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID162=null;
        Token OP_APPLY163=null;
        RecParser.list_reconfigurations_return list_reconfigurations164 = null;

        RecParser.trigger_def_return trigger_def165 = null;


        Object ID162_tree=null;
        Object OP_APPLY163_tree=null;
        RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_trigger_def=new RewriteRuleSubtreeStream(adaptor,"rule trigger_def");
        RewriteRuleSubtreeStream stream_list_reconfigurations=new RewriteRuleSubtreeStream(adaptor,"rule list_reconfigurations");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:259:2: ( ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:259:4: ID OP_APPLY list_reconfigurations ( trigger_def )?
            {
            ID162=(Token)match(input,ID,FOLLOW_ID_in_applicaiton_def1551);  
            stream_ID.add(ID162);

            OP_APPLY163=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_applicaiton_def1553);  
            stream_OP_APPLY.add(OP_APPLY163);

            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1556);
            list_reconfigurations164=list_reconfigurations();

            state._fsp--;

            stream_list_reconfigurations.add(list_reconfigurations164.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:259:40: ( trigger_def )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SEP_TRIGGER) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:259:40: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1559);
                    trigger_def165=trigger_def();

                    state._fsp--;

                    stream_trigger_def.add(trigger_def165.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, list_reconfigurations, trigger_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 260:3: -> ID list_reconfigurations ( trigger_def )?
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                adaptor.addChild(root_0, stream_list_reconfigurations.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:260:31: ( trigger_def )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:263:1: list_reconfigurations : ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ ;
    public final RecParser.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecParser.list_reconfigurations_return retval = new RecParser.list_reconfigurations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START166=null;
        Token SEP_COMMA168=null;
        Token SEP_BLOCK_END170=null;
        RecParser.reconfiguration_call_return reconfiguration_call167 = null;

        RecParser.reconfiguration_call_return reconfiguration_call169 = null;


        Object SEP_BLOCK_START166_tree=null;
        Object SEP_COMMA168_tree=null;
        Object SEP_BLOCK_END170_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
        RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
        RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:2: ( ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:5: ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:5: ( SEP_BLOCK_START )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SEP_BLOCK_START) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:5: SEP_BLOCK_START
                    {
                    SEP_BLOCK_START166=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1584);  
                    stream_SEP_BLOCK_START.add(SEP_BLOCK_START166);


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1587);
            reconfiguration_call167=reconfiguration_call();

            state._fsp--;

            stream_reconfiguration_call.add(reconfiguration_call167.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:43: ( SEP_COMMA reconfiguration_call )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==SEP_COMMA) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:44: SEP_COMMA reconfiguration_call
            	    {
            	    SEP_COMMA168=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_reconfigurations1590);  
            	    stream_SEP_COMMA.add(SEP_COMMA168);

            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1592);
            	    reconfiguration_call169=reconfiguration_call();

            	    state._fsp--;

            	    stream_reconfiguration_call.add(reconfiguration_call169.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:77: ( SEP_BLOCK_END )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==SEP_BLOCK_END) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:264:77: SEP_BLOCK_END
                    {
                    SEP_BLOCK_END170=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1596);  
                    stream_SEP_BLOCK_END.add(SEP_BLOCK_END170);


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
            // 264:93: -> ( reconfiguration_call )+
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:267:1: trigger_def : SEP_TRIGGER trigger_block -> trigger_block ;
    public final RecParser.trigger_def_return trigger_def() throws RecognitionException {
        RecParser.trigger_def_return retval = new RecParser.trigger_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_TRIGGER171=null;
        RecParser.trigger_block_return trigger_block172 = null;


        Object SEP_TRIGGER171_tree=null;
        RewriteRuleTokenStream stream_SEP_TRIGGER=new RewriteRuleTokenStream(adaptor,"token SEP_TRIGGER");
        RewriteRuleSubtreeStream stream_trigger_block=new RewriteRuleSubtreeStream(adaptor,"rule trigger_block");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:268:2: ( SEP_TRIGGER trigger_block -> trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:268:4: SEP_TRIGGER trigger_block
            {
            SEP_TRIGGER171=(Token)match(input,SEP_TRIGGER,FOLLOW_SEP_TRIGGER_in_trigger_def1615);  
            stream_SEP_TRIGGER.add(SEP_TRIGGER171);

            pushFollow(FOLLOW_trigger_block_in_trigger_def1617);
            trigger_block172=trigger_block();

            state._fsp--;

            stream_trigger_block.add(trigger_block172.getTree());


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
            // 269:3: -> trigger_block
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:272:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecParser.trigger_block_return trigger_block() throws RecognitionException {
        RecParser.trigger_block_return retval = new RecParser.trigger_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START173=null;
        Token SEP_BLOCK_END174=null;

        Object SEP_BLOCK_START173_tree=null;
        Object SEP_BLOCK_END174_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:273:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:273:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            root_0 = (Object)adaptor.nil();

            SEP_BLOCK_START173=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1636); 
            SEP_BLOCK_START173_tree = (Object)adaptor.create(SEP_BLOCK_START173);
            adaptor.addChild(root_0, SEP_BLOCK_START173_tree);

            SEP_BLOCK_END174=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1638); 
            SEP_BLOCK_END174_tree = (Object)adaptor.create(SEP_BLOCK_END174);
            adaptor.addChild(root_0, SEP_BLOCK_END174_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_directive_def_in_reclang134 = new BitSet(new long[]{0x1000000000000052L});
    public static final BitSet FOLLOW_element_in_reclang137 = new BitSet(new long[]{0x1000000000000012L});
    public static final BitSet FOLLOW_directive_import_in_directive_def167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_IMPORT_in_directive_import187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_directive_import189 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_directive_import191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_applicaiton_def_in_element232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def255 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def257 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_reconfiguration_def259 = new BitSet(new long[]{0x0000400000007F80L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def261 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_reconfiguration_def264 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_def_in_args_def291 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_args_def294 = new BitSet(new long[]{0x0000000000007F80L});
    public static final BitSet FOLLOW_arg_def_in_args_def296 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_datatype_in_arg_def322 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype376 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_datatype378 = new BitSet(new long[]{0x0000000000007F80L});
    public static final BitSet FOLLOW_subtype_in_datatype380 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_datatype382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids435 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_ids438 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_list_ids440 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_reconfiguration_block462 = new BitSet(new long[]{0x1000000800007FA0L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block464 = new BitSet(new long[]{0x1000020800007FA0L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_reconfiguration_block467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_instruction495 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction508 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction520 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply550 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply553 = new BitSet(new long[]{0x10000000001F8000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_declaration579 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration581 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_declaration584 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration586 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ID_in_var_def611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment629 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_assignment631 = new BitSet(new long[]{0x1F80000800600000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_member659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call679 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call684 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call689 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call694 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call699 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call704 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call709 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call729 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call734 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_operation_args754 = new BitSet(new long[]{0x1F80400000600000L});
    public static final BitSet FOLLOW_args_in_operation_args756 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_operation_args759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args776 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_args779 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_expression_in_args781 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RW_FORALL_in_for_instruction805 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_for_instruction807 = new BitSet(new long[]{0x0000000000007F80L});
    public static final BitSet FOLLOW_datatype_in_for_instruction809 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction811 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_SEP_COLON_in_for_instruction813 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction815 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_for_instruction817 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_expr_in_expression849 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_OP_UNION_in_expression852 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_union_expr_in_expression855 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_intersect_expr_in_union_expr872 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_union_expr875 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_intersect_expr_in_union_expr878 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_factor_in_intersect_expr895 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OP_MINUS_in_intersect_expr898 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_factor_in_intersect_expr901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor919 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_factor921 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_factor923 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_factor925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_operation976 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_SEP_STRUCTURE_in_operation979 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_operation981 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_SEP_ACCESSOR_in_operation985 = new BitSet(new long[]{0x10000001FF800000L});
    public static final BitSet FOLLOW_attribute_call_in_operation987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1119 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1122 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_INT_in_attribute_call1124 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1145 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1148 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_INT_in_attribute_call1150 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ENDS_in_attribute_call1182 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_attribute_call1184 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_attribute_call1186 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_attribute_call1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_CHANNELS_in_attribute_call1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_TRIPLE_in_triple_cons1306 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_triple_cons1308 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1310 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1312 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1314 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1316 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1318 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_triple_cons1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_PAIR_in_pair_cons1349 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_pair_cons1351 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1353 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_pair_cons1355 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1357 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_pair_cons1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_SET_in_set_cons1387 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_set_cons1389 = new BitSet(new long[]{0x1F80400000600000L});
    public static final BitSet FOLLOW_expression_in_set_cons1394 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_set_cons1397 = new BitSet(new long[]{0x1F80000000600000L});
    public static final BitSet FOLLOW_expression_in_set_cons1399 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_set_cons1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_NODE_in_node_cons1433 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_node_cons1435 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_node_cons1438 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_node_cons1441 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_node_cons1443 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_node_cons1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_XOR_in_xor_cons1472 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_xor_cons1474 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1478 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_xor_cons1481 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1485 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_SEP_COLON_in_xor_cons1489 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1493 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_xor_cons1496 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1500 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_xor_cons1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1551 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_OP_APPLY_in_applicaiton_def1553 = new BitSet(new long[]{0x10000100001F8000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1556 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1584 = new BitSet(new long[]{0x10000000001F8000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1587 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_reconfigurations1590 = new BitSet(new long[]{0x10000000001F8000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1592 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_TRIGGER_in_trigger_def1615 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1636 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1638 = new BitSet(new long[]{0x0000000000000002L});

}