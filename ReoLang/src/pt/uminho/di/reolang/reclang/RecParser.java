// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g 2013-12-12 15:12:03

	package pt.uminho.di.reolang.reclang; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_NODES", "OP_NAMES", "OP_ENDS", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", "CONS_SET", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "ARGUMENTS", "ARGUMENT", "SUBTYPE", "INSTRUCTIONS", "DECLARATION", "ASSIGNMENT", "FORALL", "TRIPLE", "PAIR", "SET", "ACCESS", "STRUCTURE", "APPLICATION", "SIGNATURE"
    };
    public static final int OP_NODES=28;
    public static final int CONS_PAIR=51;
    public static final int SEP_OPTIONAL=43;
    public static final int APPLICATION=78;
    public static final int SEP_COLON=40;
    public static final int SEP_SUBTYPE_END=48;
    public static final int OP_TRD=24;
    public static final int OP_JOIN=15;
    public static final int OCTAL_ESC=62;
    public static final int DT_PAIR=12;
    public static final int SUBTYPE=68;
    public static final int OP_INTERSECTION=33;
    public static final int ID=54;
    public static final int EOF=-1;
    public static final int DECLARATION=70;
    public static final int DT_NODE=10;
    public static final int STRUCTURE=77;
    public static final int DT_SET=11;
    public static final int OP_ID=19;
    public static final int INSTRUCTIONS=69;
    public static final int IMPORT=64;
    public static final int ESC_SEQ=58;
    public static final int SEP_ACCESSOR=49;
    public static final int OP_MINUS=34;
    public static final int RECONFIGS=63;
    public static final int RW_FORALL=5;
    public static final int ARGUMENT=67;
    public static final int SEP_LIST_START=45;
    public static final int RW_RECONFIGURATION=4;
    public static final int ACCESS=76;
    public static final int SEP_ARGS_END=42;
    public static final int OP_FST=22;
    public static final int PAIR=74;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=30;
    public static final int TRIPLE=73;
    public static final int OP_APPLY=31;
    public static final int COMMENT=56;
    public static final int OP_PATH=20;
    public static final int OP_SND=23;
    public static final int SEP_LIST_END=46;
    public static final int SEP_STRUCTURE=50;
    public static final int OP_SPLIT=16;
    public static final int OP_OUT=26;
    public static final int CONS_SET=53;
    public static final int ARGUMENTS=66;
    public static final int OP_NAMES=29;
    public static final int SEP_COMMA=38;
    public static final int DT_TRIPLE=13;
    public static final int SEP_ARGS_START=41;
    public static final int OP_UPDATE=21;
    public static final int SEP_BLOCK_START=36;
    public static final int UNICODE_ESC=61;
    public static final int FORALL=72;
    public static final int OP_PAR=14;
    public static final int OP_REMOVE=17;
    public static final int HEX_DIGIT=60;
    public static final int SET=75;
    public static final int INT=55;
    public static final int SIGNATURE=79;
    public static final int OP_IN=25;
    public static final int RECONFIGURATION=65;
    public static final int WS=57;
    public static final int CONS_TRIPLE=52;
    public static final int SEP_SEMICOLON=39;
    public static final int SEP_SUBTYPE_START=47;
    public static final int SEP_BLOCK_END=37;
    public static final int OP_CONST=18;
    public static final int ASSIGNMENT=71;
    public static final int OP_EQUAL=35;
    public static final int DT_PATTERN=7;
    public static final int OP_NAME=27;
    public static final int DT_CHANNEL=8;
    public static final int OP_UNION=32;
    public static final int SEP_TRIGGER=44;
    public static final int STRING=59;
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:39:1: reclang : ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final RecParser.reclang_return reclang() throws RecognitionException {
        RecParser.reclang_return retval = new RecParser.reclang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_def_return directive_def1 = null;

        RecParser.element_return element2 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        RewriteRuleSubtreeStream stream_directive_def=new RewriteRuleSubtreeStream(adaptor,"rule directive_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:40:2: ( ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:40:5: ( directive_def )* ( element )*
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:40:5: ( directive_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RW_IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:40:5: directive_def
            	    {
            	    pushFollow(FOLLOW_directive_def_in_reclang119);
            	    directive_def1=directive_def();

            	    state._fsp--;

            	    stream_directive_def.add(directive_def1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:40:20: ( element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RW_RECONFIGURATION||LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:40:20: element
            	    {
            	    pushFollow(FOLLOW_element_in_reclang122);
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
            // 41:3: -> ^( RECONFIGS ( directive_def )* ( element )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:41:6: ^( RECONFIGS ( directive_def )* ( element )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECONFIGS, "RECONFIGS"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:41:18: ( directive_def )*
                while ( stream_directive_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_directive_def.nextTree());

                }
                stream_directive_def.reset();
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:41:33: ( element )*
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:47:1: directive_def : directive_import -> directive_import ;
    public final RecParser.directive_def_return directive_def() throws RecognitionException {
        RecParser.directive_def_return retval = new RecParser.directive_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_import_return directive_import3 = null;


        RewriteRuleSubtreeStream stream_directive_import=new RewriteRuleSubtreeStream(adaptor,"rule directive_import");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:48:2: ( directive_import -> directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:48:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def152);
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
            // 49:3: -> directive_import
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:53:1: directive_import : RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:54:2: ( RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:54:4: RW_IMPORT STRING SEP_SEMICOLON
            {
            RW_IMPORT4=(Token)match(input,RW_IMPORT,FOLLOW_RW_IMPORT_in_directive_import172);  
            stream_RW_IMPORT.add(RW_IMPORT4);

            STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_directive_import174);  
            stream_STRING.add(STRING5);

            SEP_SEMICOLON6=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_directive_import176);  
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
            // 55:3: -> ^( IMPORT STRING )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:55:6: ^( IMPORT STRING )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:63:1: element : ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) );
    public final RecParser.element_return element() throws RecognitionException {
        RecParser.element_return retval = new RecParser.element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.reconfiguration_def_return reconfiguration_def7 = null;

        RecParser.applicaiton_def_return applicaiton_def8 = null;


        RewriteRuleSubtreeStream stream_reconfiguration_def=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_def");
        RewriteRuleSubtreeStream stream_applicaiton_def=new RewriteRuleSubtreeStream(adaptor,"rule applicaiton_def");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:64:2: ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:64:4: reconfiguration_def
                    {
                    pushFollow(FOLLOW_reconfiguration_def_in_element204);
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
                    // 64:24: -> ^( RECONFIGURATION reconfiguration_def )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:64:27: ^( RECONFIGURATION reconfiguration_def )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:65:4: applicaiton_def
                    {
                    pushFollow(FOLLOW_applicaiton_def_in_element217);
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
                    // 65:21: -> ^( APPLICATION applicaiton_def )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:65:24: ^( APPLICATION applicaiton_def )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:70:1: reconfiguration_def : RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:71:2: ( RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block -> ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:71:4: RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? SEP_ARGS_END reconfiguration_block
            {
            RW_RECONFIGURATION9=(Token)match(input,RW_RECONFIGURATION,FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def240);  
            stream_RW_RECONFIGURATION.add(RW_RECONFIGURATION9);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_def242);  
            stream_ID.add(ID10);

            SEP_ARGS_START11=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_reconfiguration_def244);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START11);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:71:41: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=DT_PATTERN && LA4_0<=DT_TRIPLE)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:71:41: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def246);
                    args_def12=args_def();

                    state._fsp--;

                    stream_args_def.add(args_def12.getTree());

                    }
                    break;

            }

            SEP_ARGS_END13=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_reconfiguration_def249);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END13);

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def251);
            reconfiguration_block14=reconfiguration_block();

            state._fsp--;

            stream_reconfiguration_block.add(reconfiguration_block14.getTree());


            // AST REWRITE
            // elements: args_def, reconfiguration_block, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:3: -> ^( ID ( args_def )? reconfiguration_block )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:72:6: ^( ID ( args_def )? reconfiguration_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:72:11: ( args_def )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:75:1: args_def : arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:76:2: ( arg_def ( SEP_SEMICOLON arg_def )* -> ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:76:4: arg_def ( SEP_SEMICOLON arg_def )*
            {
            pushFollow(FOLLOW_arg_def_in_args_def276);
            arg_def15=arg_def();

            state._fsp--;

            stream_arg_def.add(arg_def15.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:76:12: ( SEP_SEMICOLON arg_def )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==SEP_SEMICOLON) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:76:13: SEP_SEMICOLON arg_def
            	    {
            	    SEP_SEMICOLON16=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_args_def279);  
            	    stream_SEP_SEMICOLON.add(SEP_SEMICOLON16);

            	    pushFollow(FOLLOW_arg_def_in_args_def281);
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
            // 77:3: -> ^( ARGUMENTS ( arg_def )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:77:6: ^( ARGUMENTS ( arg_def )+ )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:80:1: arg_def : datatype list_ids -> ^( ARGUMENT datatype list_ids ) ;
    public final RecParser.arg_def_return arg_def() throws RecognitionException {
        RecParser.arg_def_return retval = new RecParser.arg_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.datatype_return datatype18 = null;

        RecParser.list_ids_return list_ids19 = null;


        RewriteRuleSubtreeStream stream_list_ids=new RewriteRuleSubtreeStream(adaptor,"rule list_ids");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:81:2: ( datatype list_ids -> ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:81:5: datatype list_ids
            {
            pushFollow(FOLLOW_datatype_in_arg_def307);
            datatype18=datatype();

            state._fsp--;

            stream_datatype.add(datatype18.getTree());
            pushFollow(FOLLOW_list_ids_in_arg_def309);
            list_ids19=list_ids();

            state._fsp--;

            stream_list_ids.add(list_ids19.getTree());


            // AST REWRITE
            // elements: list_ids, datatype
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:3: -> ^( ARGUMENT datatype list_ids )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:82:6: ^( ARGUMENT datatype list_ids )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:85:1: datatype : ( DT_PATTERN | DT_CHANNEL | other_type ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )? -> ^( other_type ( subtype )? ) );
    public final RecParser.datatype_return datatype() throws RecognitionException {
        RecParser.datatype_return retval = new RecParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DT_PATTERN20=null;
        Token DT_CHANNEL21=null;
        Token SEP_SUBTYPE_START23=null;
        Token SEP_SUBTYPE_END25=null;
        RecParser.other_type_return other_type22 = null;

        RecParser.subtype_return subtype24 = null;


        Object DT_PATTERN20_tree=null;
        Object DT_CHANNEL21_tree=null;
        Object SEP_SUBTYPE_START23_tree=null;
        Object SEP_SUBTYPE_END25_tree=null;
        RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");
        RewriteRuleSubtreeStream stream_subtype=new RewriteRuleSubtreeStream(adaptor,"rule subtype");
        RewriteRuleSubtreeStream stream_other_type=new RewriteRuleSubtreeStream(adaptor,"rule other_type");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:86:2: ( DT_PATTERN | DT_CHANNEL | other_type ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )? -> ^( other_type ( subtype )? ) )
            int alt7=3;
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
            case DT_NODE:
            case DT_SET:
            case DT_PAIR:
            case DT_TRIPLE:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:86:5: DT_PATTERN
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_PATTERN20=(Token)match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype334); 
                    DT_PATTERN20_tree = (Object)adaptor.create(DT_PATTERN20);
                    adaptor.addChild(root_0, DT_PATTERN20_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:87:5: DT_CHANNEL
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_CHANNEL21=(Token)match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype341); 
                    DT_CHANNEL21_tree = (Object)adaptor.create(DT_CHANNEL21);
                    adaptor.addChild(root_0, DT_CHANNEL21_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:88:4: other_type ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )?
                    {
                    pushFollow(FOLLOW_other_type_in_datatype346);
                    other_type22=other_type();

                    state._fsp--;

                    stream_other_type.add(other_type22.getTree());
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:88:15: ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==SEP_SUBTYPE_START) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:88:16: SEP_SUBTYPE_START subtype SEP_SUBTYPE_END
                            {
                            SEP_SUBTYPE_START23=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_datatype349);  
                            stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START23);

                            pushFollow(FOLLOW_subtype_in_datatype351);
                            subtype24=subtype();

                            state._fsp--;

                            stream_subtype.add(subtype24.getTree());
                            SEP_SUBTYPE_END25=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_datatype353);  
                            stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END25);


                            }
                            break;

                    }



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
                    // 88:60: -> ^( other_type ( subtype )? )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:88:63: ^( other_type ( subtype )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_other_type.nextNode(), root_1);

                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:88:76: ( subtype )?
                        if ( stream_subtype.hasNext() ) {
                            adaptor.addChild(root_1, stream_subtype.nextTree());

                        }
                        stream_subtype.reset();

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:91:1: other_type : ( DT_NAME | DT_NODE | DT_SET | DT_PAIR | DT_TRIPLE );
    public final RecParser.other_type_return other_type() throws RecognitionException {
        RecParser.other_type_return retval = new RecParser.other_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set26=null;

        Object set26_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:92:2: ( DT_NAME | DT_NODE | DT_SET | DT_PAIR | DT_TRIPLE )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set26=(Token)input.LT(1);
            if ( (input.LA(1)>=DT_NAME && input.LA(1)<=DT_TRIPLE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set26));
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:95:1: subtype : datatype ;
    public final RecParser.subtype_return subtype() throws RecognitionException {
        RecParser.subtype_return retval = new RecParser.subtype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.datatype_return datatype27 = null;



        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:96:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:96:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_subtype404);
            datatype27=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype27.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:99:1: list_ids : ID ( SEP_COMMA ID )* -> ( ID )+ ;
    public final RecParser.list_ids_return list_ids() throws RecognitionException {
        RecParser.list_ids_return retval = new RecParser.list_ids_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID28=null;
        Token SEP_COMMA29=null;
        Token ID30=null;

        Object ID28_tree=null;
        Object SEP_COMMA29_tree=null;
        Object ID30_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:100:2: ( ID ( SEP_COMMA ID )* -> ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:100:4: ID ( SEP_COMMA ID )*
            {
            ID28=(Token)match(input,ID,FOLLOW_ID_in_list_ids417);  
            stream_ID.add(ID28);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:100:7: ( SEP_COMMA ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==SEP_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:100:8: SEP_COMMA ID
            	    {
            	    SEP_COMMA29=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_ids420);  
            	    stream_SEP_COMMA.add(SEP_COMMA29);

            	    ID30=(Token)match(input,ID,FOLLOW_ID_in_list_ids422);  
            	    stream_ID.add(ID30);


            	    }
            	    break;

            	default :
            	    break loop8;
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
            // 100:23: -> ( ID )+
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:104:1: reconfiguration_block : SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) ;
    public final RecParser.reconfiguration_block_return reconfiguration_block() throws RecognitionException {
        RecParser.reconfiguration_block_return retval = new RecParser.reconfiguration_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START31=null;
        Token SEP_BLOCK_END33=null;
        RecParser.instruction_return instruction32 = null;


        Object SEP_BLOCK_START31_tree=null;
        Object SEP_BLOCK_END33_tree=null;
        RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
        RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:105:2: ( SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END -> ^( INSTRUCTIONS instruction ( instruction )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:105:4: SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END
            {
            SEP_BLOCK_START31=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_reconfiguration_block444);  
            stream_SEP_BLOCK_START.add(SEP_BLOCK_START31);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:105:20: ( instruction )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RW_FORALL||(LA9_0>=DT_PATTERN && LA9_0<=DT_TRIPLE)||LA9_0==OP_APPLY||LA9_0==ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:105:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block446);
            	    instruction32=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction32.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            SEP_BLOCK_END33=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_reconfiguration_block449);  
            stream_SEP_BLOCK_END.add(SEP_BLOCK_END33);



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
            // 106:3: -> ^( INSTRUCTIONS instruction ( instruction )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:106:6: ^( INSTRUCTIONS instruction ( instruction )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTRUCTIONS, "INSTRUCTIONS"), root_1);

                adaptor.addChild(root_1, stream_instruction.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:106:33: ( instruction )*
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:109:1: instruction : ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction );
    public final RecParser.instruction_return instruction() throws RecognitionException {
        RecParser.instruction_return retval = new RecParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON35=null;
        Token SEP_SEMICOLON37=null;
        Token SEP_SEMICOLON39=null;
        RecParser.declaration_return declaration34 = null;

        RecParser.assignment_return assignment36 = null;

        RecParser.reconfiguration_apply_return reconfiguration_apply38 = null;

        RecParser.for_instruction_return for_instruction40 = null;


        Object SEP_SEMICOLON35_tree=null;
        Object SEP_SEMICOLON37_tree=null;
        Object SEP_SEMICOLON39_tree=null;
        RewriteRuleTokenStream stream_SEP_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEP_SEMICOLON");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_for_instruction=new RewriteRuleSubtreeStream(adaptor,"rule for_instruction");
        RewriteRuleSubtreeStream stream_reconfiguration_apply=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_apply");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:110:2: ( declaration SEP_SEMICOLON -> declaration | assignment SEP_SEMICOLON -> assignment | reconfiguration_apply SEP_SEMICOLON -> reconfiguration_apply | for_instruction -> for_instruction )
            int alt10=4;
            switch ( input.LA(1) ) {
            case DT_PATTERN:
            case DT_CHANNEL:
            case DT_NAME:
            case DT_NODE:
            case DT_SET:
            case DT_PAIR:
            case DT_TRIPLE:
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:110:4: declaration SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_declaration_in_instruction477);
                    declaration34=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration34.getTree());
                    SEP_SEMICOLON35=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction479);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON35);



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
                    // 110:32: -> declaration
                    {
                        adaptor.addChild(root_0, stream_declaration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:111:4: assignment SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_assignment_in_instruction490);
                    assignment36=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment36.getTree());
                    SEP_SEMICOLON37=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction492);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON37);



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
                    // 111:30: -> assignment
                    {
                        adaptor.addChild(root_0, stream_assignment.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:112:4: reconfiguration_apply SEP_SEMICOLON
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction502);
                    reconfiguration_apply38=reconfiguration_apply();

                    state._fsp--;

                    stream_reconfiguration_apply.add(reconfiguration_apply38.getTree());
                    SEP_SEMICOLON39=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction504);  
                    stream_SEP_SEMICOLON.add(SEP_SEMICOLON39);



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
                    // 112:40: -> reconfiguration_apply
                    {
                        adaptor.addChild(root_0, stream_reconfiguration_apply.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:113:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction513);
                    for_instruction40=for_instruction();

                    state._fsp--;

                    stream_for_instruction.add(for_instruction40.getTree());


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
                    // 113:23: -> for_instruction
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:116:1: reconfiguration_apply : ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final RecParser.reconfiguration_apply_return reconfiguration_apply() throws RecognitionException {
        RecParser.reconfiguration_apply_return retval = new RecParser.reconfiguration_apply_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID41=null;
        Token OP_APPLY42=null;
        RecParser.reconfiguration_call_return reconfiguration_call43 = null;


        Object ID41_tree=null;
        Object OP_APPLY42_tree=null;
        RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:117:2: ( ( ID )? OP_APPLY reconfiguration_call -> ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:117:4: ( ID )? OP_APPLY reconfiguration_call
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:117:4: ( ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:117:4: ID
                    {
                    ID41=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_apply532);  
                    stream_ID.add(ID41);


                    }
                    break;

            }

            OP_APPLY42=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply535);  
            stream_OP_APPLY.add(OP_APPLY42);

            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply537);
            reconfiguration_call43=reconfiguration_call();

            state._fsp--;

            stream_reconfiguration_call.add(reconfiguration_call43.getTree());


            // AST REWRITE
            // elements: reconfiguration_call, OP_APPLY, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 117:38: -> ^( OP_APPLY reconfiguration_call ( ID )? )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:117:41: ^( OP_APPLY reconfiguration_call ( ID )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_OP_APPLY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_reconfiguration_call.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:117:73: ( ID )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:120:1: declaration : datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) ;
    public final RecParser.declaration_return declaration() throws RecognitionException {
        RecParser.declaration_return retval = new RecParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA46=null;
        RecParser.datatype_return datatype44 = null;

        RecParser.var_def_return var_def45 = null;

        RecParser.var_def_return var_def47 = null;


        Object SEP_COMMA46_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleSubtreeStream stream_var_def=new RewriteRuleSubtreeStream(adaptor,"rule var_def");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:121:2: ( datatype var_def ( SEP_COMMA var_def )* -> ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:121:4: datatype var_def ( SEP_COMMA var_def )*
            {
            pushFollow(FOLLOW_datatype_in_declaration561);
            datatype44=datatype();

            state._fsp--;

            stream_datatype.add(datatype44.getTree());
            pushFollow(FOLLOW_var_def_in_declaration563);
            var_def45=var_def();

            state._fsp--;

            stream_var_def.add(var_def45.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:121:21: ( SEP_COMMA var_def )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SEP_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:121:22: SEP_COMMA var_def
            	    {
            	    SEP_COMMA46=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_declaration566);  
            	    stream_SEP_COMMA.add(SEP_COMMA46);

            	    pushFollow(FOLLOW_var_def_in_declaration568);
            	    var_def47=var_def();

            	    state._fsp--;

            	    stream_var_def.add(var_def47.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // 121:42: -> ^( DECLARATION datatype ( var_def )+ )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:121:45: ^( DECLARATION datatype ( var_def )+ )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:124:1: var_def : ( ID | assignment );
    public final RecParser.var_def_return var_def() throws RecognitionException {
        RecParser.var_def_return retval = new RecParser.var_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID48=null;
        RecParser.assignment_return assignment49 = null;


        Object ID48_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:125:2: ( ID | assignment )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==OP_EQUAL) ) {
                    alt13=2;
                }
                else if ( ((LA13_1>=SEP_COMMA && LA13_1<=SEP_SEMICOLON)) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:125:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID48=(Token)match(input,ID,FOLLOW_ID_in_var_def593); 
                    ID48_tree = (Object)adaptor.create(ID48);
                    adaptor.addChild(root_0, ID48_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:126:4: assignment
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_var_def598);
                    assignment49=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment49.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:129:1: assignment : ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) ;
    public final RecParser.assignment_return assignment() throws RecognitionException {
        RecParser.assignment_return retval = new RecParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID50=null;
        Token OP_EQUAL51=null;
        RecParser.assignment_member_return assignment_member52 = null;


        Object ID50_tree=null;
        Object OP_EQUAL51_tree=null;
        RewriteRuleTokenStream stream_OP_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_assignment_member=new RewriteRuleSubtreeStream(adaptor,"rule assignment_member");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:130:2: ( ID OP_EQUAL assignment_member -> ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:130:4: ID OP_EQUAL assignment_member
            {
            ID50=(Token)match(input,ID,FOLLOW_ID_in_assignment611);  
            stream_ID.add(ID50);

            OP_EQUAL51=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_assignment613);  
            stream_OP_EQUAL.add(OP_EQUAL51);

            pushFollow(FOLLOW_assignment_member_in_assignment615);
            assignment_member52=assignment_member();

            state._fsp--;

            stream_assignment_member.add(assignment_member52.getTree());


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
            // 130:36: -> ^( ASSIGNMENT ID assignment_member )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:130:39: ^( ASSIGNMENT ID assignment_member )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:133:1: assignment_member : ( expression | reconfiguration_apply );
    public final RecParser.assignment_member_return assignment_member() throws RecognitionException {
        RecParser.assignment_member_return retval = new RecParser.assignment_member_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.expression_return expression53 = null;

        RecParser.reconfiguration_apply_return reconfiguration_apply54 = null;



        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:134:2: ( expression | reconfiguration_apply )
            int alt14=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=OP_UNION && LA14_1<=OP_MINUS)||(LA14_1>=SEP_COMMA && LA14_1<=SEP_SEMICOLON)||LA14_1==SEP_SUBTYPE_START||(LA14_1>=SEP_ACCESSOR && LA14_1<=SEP_STRUCTURE)) ) {
                    alt14=1;
                }
                else if ( (LA14_1==OP_APPLY) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_PATH:
            case OP_UPDATE:
            case OP_FST:
            case OP_SND:
            case OP_TRD:
            case CONS_PAIR:
            case CONS_TRIPLE:
            case CONS_SET:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:134:4: expression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_assignment_member641);
                    expression53=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression53.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:135:4: reconfiguration_apply
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member647);
                    reconfiguration_apply54=reconfiguration_apply();

                    state._fsp--;

                    adaptor.addChild(root_0, reconfiguration_apply54.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:138:1: reconfiguration_call : ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args ;
    public final RecParser.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecParser.reconfiguration_call_return retval = new RecParser.reconfiguration_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_JOIN55=null;
        Token OP_SPLIT56=null;
        Token OP_PAR57=null;
        Token OP_REMOVE58=null;
        Token OP_CONST59=null;
        Token OP_ID60=null;
        Token ID61=null;
        RecParser.operation_args_return operation_args62 = null;


        Object OP_JOIN55_tree=null;
        Object OP_SPLIT56_tree=null;
        Object OP_PAR57_tree=null;
        Object OP_REMOVE58_tree=null;
        Object OP_CONST59_tree=null;
        Object OP_ID60_tree=null;
        Object ID61_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:2: ( ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:5: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:5: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | OP_CONST | OP_ID | ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:6: OP_JOIN
                    {
                    OP_JOIN55=(Token)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call661); 
                    OP_JOIN55_tree = (Object)adaptor.create(OP_JOIN55);
                    root_0 = (Object)adaptor.becomeRoot(OP_JOIN55_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:17: OP_SPLIT
                    {
                    OP_SPLIT56=(Token)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call666); 
                    OP_SPLIT56_tree = (Object)adaptor.create(OP_SPLIT56);
                    root_0 = (Object)adaptor.becomeRoot(OP_SPLIT56_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:29: OP_PAR
                    {
                    OP_PAR57=(Token)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call671); 
                    OP_PAR57_tree = (Object)adaptor.create(OP_PAR57);
                    root_0 = (Object)adaptor.becomeRoot(OP_PAR57_tree, root_0);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:39: OP_REMOVE
                    {
                    OP_REMOVE58=(Token)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call676); 
                    OP_REMOVE58_tree = (Object)adaptor.create(OP_REMOVE58);
                    root_0 = (Object)adaptor.becomeRoot(OP_REMOVE58_tree, root_0);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:52: OP_CONST
                    {
                    OP_CONST59=(Token)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call681); 
                    OP_CONST59_tree = (Object)adaptor.create(OP_CONST59);
                    root_0 = (Object)adaptor.becomeRoot(OP_CONST59_tree, root_0);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:64: OP_ID
                    {
                    OP_ID60=(Token)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call686); 
                    OP_ID60_tree = (Object)adaptor.create(OP_ID60);
                    root_0 = (Object)adaptor.becomeRoot(OP_ID60_tree, root_0);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:139:73: ID
                    {
                    ID61=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_call691); 
                    ID61_tree = (Object)adaptor.create(ID61);
                    root_0 = (Object)adaptor.becomeRoot(ID61_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_operation_args_in_reconfiguration_call695);
            operation_args62=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args62.getTree());

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:143:1: structure_operation_call : ( OP_PATH | OP_UPDATE ) operation_args ;
    public final RecParser.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecParser.structure_operation_call_return retval = new RecParser.structure_operation_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_PATH63=null;
        Token OP_UPDATE64=null;
        RecParser.operation_args_return operation_args65 = null;


        Object OP_PATH63_tree=null;
        Object OP_UPDATE64_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:144:2: ( ( OP_PATH | OP_UPDATE ) operation_args )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:144:4: ( OP_PATH | OP_UPDATE ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:144:4: ( OP_PATH | OP_UPDATE )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:144:6: OP_PATH
                    {
                    OP_PATH63=(Token)match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call711); 
                    OP_PATH63_tree = (Object)adaptor.create(OP_PATH63);
                    root_0 = (Object)adaptor.becomeRoot(OP_PATH63_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:144:17: OP_UPDATE
                    {
                    OP_UPDATE64=(Token)match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call716); 
                    OP_UPDATE64_tree = (Object)adaptor.create(OP_UPDATE64);
                    root_0 = (Object)adaptor.becomeRoot(OP_UPDATE64_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_operation_args_in_structure_operation_call721);
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
    // $ANTLR end "structure_operation_call"

    public static class operation_args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:148:1: operation_args : SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? ;
    public final RecParser.operation_args_return operation_args() throws RecognitionException {
        RecParser.operation_args_return retval = new RecParser.operation_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_ARGS_START66=null;
        Token SEP_ARGS_END68=null;
        RecParser.args_return args67 = null;


        Object SEP_ARGS_START66_tree=null;
        Object SEP_ARGS_END68_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:2: ( SEP_ARGS_START ( args )? SEP_ARGS_END -> ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:4: SEP_ARGS_START ( args )? SEP_ARGS_END
            {
            SEP_ARGS_START66=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_operation_args736);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START66);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:19: ( args )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=OP_PATH && LA17_0<=OP_TRD)||(LA17_0>=CONS_PAIR && LA17_0<=ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:19: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args738);
                    args67=args();

                    state._fsp--;

                    stream_args.add(args67.getTree());

                    }
                    break;

            }

            SEP_ARGS_END68=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_operation_args741);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END68);



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
            // 149:38: -> ( args )?
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:149:41: ( args )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:152:1: args : expression ( SEP_COMMA expression )* -> ( expression )+ ;
    public final RecParser.args_return args() throws RecognitionException {
        RecParser.args_return retval = new RecParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA70=null;
        RecParser.expression_return expression69 = null;

        RecParser.expression_return expression71 = null;


        Object SEP_COMMA70_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:153:2: ( expression ( SEP_COMMA expression )* -> ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:153:4: expression ( SEP_COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_args758);
            expression69=expression();

            state._fsp--;

            stream_expression.add(expression69.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:153:15: ( SEP_COMMA expression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==SEP_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:153:16: SEP_COMMA expression
            	    {
            	    SEP_COMMA70=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_args761);  
            	    stream_SEP_COMMA.add(SEP_COMMA70);

            	    pushFollow(FOLLOW_expression_in_args763);
            	    expression71=expression();

            	    state._fsp--;

            	    stream_expression.add(expression71.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // 154:3: -> ( expression )+
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:158:1: for_instruction : RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) ;
    public final RecParser.for_instruction_return for_instruction() throws RecognitionException {
        RecParser.for_instruction_return retval = new RecParser.for_instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_FORALL72=null;
        Token SEP_ARGS_START73=null;
        Token ID75=null;
        Token SEP_COLON76=null;
        Token ID77=null;
        Token SEP_ARGS_END78=null;
        RecParser.datatype_return datatype74 = null;

        RecParser.reconfiguration_block_return reconfiguration_block79 = null;


        Object RW_FORALL72_tree=null;
        Object SEP_ARGS_START73_tree=null;
        Object ID75_tree=null;
        Object SEP_COLON76_tree=null;
        Object ID77_tree=null;
        Object SEP_ARGS_END78_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_COLON=new RewriteRuleTokenStream(adaptor,"token SEP_COLON");
        RewriteRuleTokenStream stream_RW_FORALL=new RewriteRuleTokenStream(adaptor,"token RW_FORALL");
        RewriteRuleSubtreeStream stream_reconfiguration_block=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_block");
        RewriteRuleSubtreeStream stream_datatype=new RewriteRuleSubtreeStream(adaptor,"rule datatype");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:159:2: ( RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block -> ^( FORALL datatype ID ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:159:4: RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
            {
            RW_FORALL72=(Token)match(input,RW_FORALL,FOLLOW_RW_FORALL_in_for_instruction787);  
            stream_RW_FORALL.add(RW_FORALL72);

            SEP_ARGS_START73=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_for_instruction789);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START73);

            pushFollow(FOLLOW_datatype_in_for_instruction791);
            datatype74=datatype();

            state._fsp--;

            stream_datatype.add(datatype74.getTree());
            ID75=(Token)match(input,ID,FOLLOW_ID_in_for_instruction793);  
            stream_ID.add(ID75);

            SEP_COLON76=(Token)match(input,SEP_COLON,FOLLOW_SEP_COLON_in_for_instruction795);  
            stream_SEP_COLON.add(SEP_COLON76);

            ID77=(Token)match(input,ID,FOLLOW_ID_in_for_instruction797);  
            stream_ID.add(ID77);

            SEP_ARGS_END78=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_for_instruction799);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END78);

            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction801);
            reconfiguration_block79=reconfiguration_block();

            state._fsp--;

            stream_reconfiguration_block.add(reconfiguration_block79.getTree());


            // AST REWRITE
            // elements: ID, datatype, reconfiguration_block, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:3: -> ^( FORALL datatype ID ID reconfiguration_block )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:160:6: ^( FORALL datatype ID ID reconfiguration_block )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:164:1: expression : union_expr ( OP_UNION union_expr )* ;
    public final RecParser.expression_return expression() throws RecognitionException {
        RecParser.expression_return retval = new RecParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_UNION81=null;
        RecParser.union_expr_return union_expr80 = null;

        RecParser.union_expr_return union_expr82 = null;


        Object OP_UNION81_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:165:2: ( union_expr ( OP_UNION union_expr )* )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:165:4: union_expr ( OP_UNION union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_union_expr_in_expression831);
            union_expr80=union_expr();

            state._fsp--;

            adaptor.addChild(root_0, union_expr80.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:165:15: ( OP_UNION union_expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OP_UNION) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:165:16: OP_UNION union_expr
            	    {
            	    OP_UNION81=(Token)match(input,OP_UNION,FOLLOW_OP_UNION_in_expression834); 
            	    OP_UNION81_tree = (Object)adaptor.create(OP_UNION81);
            	    root_0 = (Object)adaptor.becomeRoot(OP_UNION81_tree, root_0);

            	    pushFollow(FOLLOW_union_expr_in_expression837);
            	    union_expr82=union_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, union_expr82.getTree());

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
    // $ANTLR end "expression"

    public static class union_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "union_expr"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:169:1: union_expr : intersect_expr ( OP_INTERSECTION intersect_expr )* ;
    public final RecParser.union_expr_return union_expr() throws RecognitionException {
        RecParser.union_expr_return retval = new RecParser.union_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_INTERSECTION84=null;
        RecParser.intersect_expr_return intersect_expr83 = null;

        RecParser.intersect_expr_return intersect_expr85 = null;


        Object OP_INTERSECTION84_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:170:2: ( intersect_expr ( OP_INTERSECTION intersect_expr )* )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:170:4: intersect_expr ( OP_INTERSECTION intersect_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_intersect_expr_in_union_expr854);
            intersect_expr83=intersect_expr();

            state._fsp--;

            adaptor.addChild(root_0, intersect_expr83.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:170:19: ( OP_INTERSECTION intersect_expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==OP_INTERSECTION) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:170:20: OP_INTERSECTION intersect_expr
            	    {
            	    OP_INTERSECTION84=(Token)match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_union_expr857); 
            	    OP_INTERSECTION84_tree = (Object)adaptor.create(OP_INTERSECTION84);
            	    root_0 = (Object)adaptor.becomeRoot(OP_INTERSECTION84_tree, root_0);

            	    pushFollow(FOLLOW_intersect_expr_in_union_expr860);
            	    intersect_expr85=intersect_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, intersect_expr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:174:1: intersect_expr : factor ( OP_MINUS factor )? ;
    public final RecParser.intersect_expr_return intersect_expr() throws RecognitionException {
        RecParser.intersect_expr_return retval = new RecParser.intersect_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS87=null;
        RecParser.factor_return factor86 = null;

        RecParser.factor_return factor88 = null;


        Object OP_MINUS87_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:175:2: ( factor ( OP_MINUS factor )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:175:4: factor ( OP_MINUS factor )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_intersect_expr877);
            factor86=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor86.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:175:11: ( OP_MINUS factor )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==OP_MINUS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:175:12: OP_MINUS factor
                    {
                    OP_MINUS87=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_intersect_expr880); 
                    OP_MINUS87_tree = (Object)adaptor.create(OP_MINUS87);
                    root_0 = (Object)adaptor.becomeRoot(OP_MINUS87_tree, root_0);

                    pushFollow(FOLLOW_factor_in_intersect_expr883);
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
        }
        return retval;
    }
    // $ANTLR end "intersect_expr"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:180:1: factor : ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | single_return_operation -> single_return_operation | triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons | structure_operation_call -> structure_operation_call );
    public final RecParser.factor_return factor() throws RecognitionException {
        RecParser.factor_return retval = new RecParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID89=null;
        Token SEP_SUBTYPE_START90=null;
        Token ID91=null;
        Token SEP_SUBTYPE_END92=null;
        Token ID93=null;
        Token ID94=null;
        Token SEP_STRUCTURE95=null;
        Token ID96=null;
        Token SEP_ACCESSOR97=null;
        RecParser.attribute_call_return attribute_call98 = null;

        RecParser.single_return_operation_return single_return_operation99 = null;

        RecParser.triple_cons_return triple_cons100 = null;

        RecParser.pair_cons_return pair_cons101 = null;

        RecParser.set_cons_return set_cons102 = null;

        RecParser.structure_operation_call_return structure_operation_call103 = null;


        Object ID89_tree=null;
        Object SEP_SUBTYPE_START90_tree=null;
        Object ID91_tree=null;
        Object SEP_SUBTYPE_END92_tree=null;
        Object ID93_tree=null;
        Object ID94_tree=null;
        Object SEP_STRUCTURE95_tree=null;
        Object ID96_tree=null;
        Object SEP_ACCESSOR97_tree=null;
        RewriteRuleTokenStream stream_SEP_STRUCTURE=new RewriteRuleTokenStream(adaptor,"token SEP_STRUCTURE");
        RewriteRuleTokenStream stream_SEP_ACCESSOR=new RewriteRuleTokenStream(adaptor,"token SEP_ACCESSOR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_START=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_START");
        RewriteRuleTokenStream stream_SEP_SUBTYPE_END=new RewriteRuleTokenStream(adaptor,"token SEP_SUBTYPE_END");
        RewriteRuleSubtreeStream stream_triple_cons=new RewriteRuleSubtreeStream(adaptor,"rule triple_cons");
        RewriteRuleSubtreeStream stream_set_cons=new RewriteRuleSubtreeStream(adaptor,"rule set_cons");
        RewriteRuleSubtreeStream stream_single_return_operation=new RewriteRuleSubtreeStream(adaptor,"rule single_return_operation");
        RewriteRuleSubtreeStream stream_structure_operation_call=new RewriteRuleSubtreeStream(adaptor,"rule structure_operation_call");
        RewriteRuleSubtreeStream stream_pair_cons=new RewriteRuleSubtreeStream(adaptor,"rule pair_cons");
        RewriteRuleSubtreeStream stream_attribute_call=new RewriteRuleSubtreeStream(adaptor,"rule attribute_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:181:2: ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | single_return_operation -> single_return_operation | triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons | structure_operation_call -> structure_operation_call )
            int alt23=8;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:181:4: ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END
                    {
                    ID89=(Token)match(input,ID,FOLLOW_ID_in_factor901);  
                    stream_ID.add(ID89);

                    SEP_SUBTYPE_START90=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_factor903);  
                    stream_SEP_SUBTYPE_START.add(SEP_SUBTYPE_START90);

                    ID91=(Token)match(input,ID,FOLLOW_ID_in_factor905);  
                    stream_ID.add(ID91);

                    SEP_SUBTYPE_END92=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_factor907);  
                    stream_SEP_SUBTYPE_END.add(SEP_SUBTYPE_END92);



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
                    // 181:47: -> ^( ID ID )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:181:50: ^( ID ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:182:4: ID
                    {
                    ID93=(Token)match(input,ID,FOLLOW_ID_in_factor923);  
                    stream_ID.add(ID93);



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
                    // 182:14: -> ID
                    {
                        adaptor.addChild(root_0, stream_ID.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:4: ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call
                    {
                    ID94=(Token)match(input,ID,FOLLOW_ID_in_factor939);  
                    stream_ID.add(ID94);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:7: ( SEP_STRUCTURE ID )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==SEP_STRUCTURE) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:8: SEP_STRUCTURE ID
                            {
                            SEP_STRUCTURE95=(Token)match(input,SEP_STRUCTURE,FOLLOW_SEP_STRUCTURE_in_factor942);  
                            stream_SEP_STRUCTURE.add(SEP_STRUCTURE95);

                            ID96=(Token)match(input,ID,FOLLOW_ID_in_factor944);  
                            stream_ID.add(ID96);


                            }
                            break;

                    }

                    SEP_ACCESSOR97=(Token)match(input,SEP_ACCESSOR,FOLLOW_SEP_ACCESSOR_in_factor948);  
                    stream_SEP_ACCESSOR.add(SEP_ACCESSOR97);

                    pushFollow(FOLLOW_attribute_call_in_factor950);
                    attribute_call98=attribute_call();

                    state._fsp--;

                    stream_attribute_call.add(attribute_call98.getTree());


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
                    // 183:56: -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:59: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ACCESS, "ACCESS"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:71: ( ^( STRUCTURE ID ) )?
                        if ( stream_ID.hasNext() ) {
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:183:71: ^( STRUCTURE ID )
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
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:184:4: single_return_operation
                    {
                    pushFollow(FOLLOW_single_return_operation_in_factor973);
                    single_return_operation99=single_return_operation();

                    state._fsp--;

                    stream_single_return_operation.add(single_return_operation99.getTree());


                    // AST REWRITE
                    // elements: single_return_operation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 184:33: -> single_return_operation
                    {
                        adaptor.addChild(root_0, stream_single_return_operation.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:185:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_factor987);
                    triple_cons100=triple_cons();

                    state._fsp--;

                    stream_triple_cons.add(triple_cons100.getTree());


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
                    // 185:22: -> triple_cons
                    {
                        adaptor.addChild(root_0, stream_triple_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:186:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_factor1002);
                    pair_cons101=pair_cons();

                    state._fsp--;

                    stream_pair_cons.add(pair_cons101.getTree());


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
                    // 186:20: -> pair_cons
                    {
                        adaptor.addChild(root_0, stream_pair_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:187:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_factor1017);
                    set_cons102=set_cons();

                    state._fsp--;

                    stream_set_cons.add(set_cons102.getTree());


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
                    // 187:20: -> set_cons
                    {
                        adaptor.addChild(root_0, stream_set_cons.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:188:5: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_factor1035);
                    structure_operation_call103=structure_operation_call();

                    state._fsp--;

                    stream_structure_operation_call.add(structure_operation_call103.getTree());


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
                    // 188:35: -> structure_operation_call
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
    // $ANTLR end "factor"

    public static class single_return_operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single_return_operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:192:1: single_return_operation : ( OP_FST | OP_SND | OP_TRD ) operation_args ;
    public final RecParser.single_return_operation_return single_return_operation() throws RecognitionException {
        RecParser.single_return_operation_return retval = new RecParser.single_return_operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_FST104=null;
        Token OP_SND105=null;
        Token OP_TRD106=null;
        RecParser.operation_args_return operation_args107 = null;


        Object OP_FST104_tree=null;
        Object OP_SND105_tree=null;
        Object OP_TRD106_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:193:2: ( ( OP_FST | OP_SND | OP_TRD ) operation_args )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:193:5: ( OP_FST | OP_SND | OP_TRD ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:193:5: ( OP_FST | OP_SND | OP_TRD )
            int alt24=3;
            switch ( input.LA(1) ) {
            case OP_FST:
                {
                alt24=1;
                }
                break;
            case OP_SND:
                {
                alt24=2;
                }
                break;
            case OP_TRD:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:193:7: OP_FST
                    {
                    OP_FST104=(Token)match(input,OP_FST,FOLLOW_OP_FST_in_single_return_operation1059); 
                    OP_FST104_tree = (Object)adaptor.create(OP_FST104);
                    root_0 = (Object)adaptor.becomeRoot(OP_FST104_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:193:17: OP_SND
                    {
                    OP_SND105=(Token)match(input,OP_SND,FOLLOW_OP_SND_in_single_return_operation1064); 
                    OP_SND105_tree = (Object)adaptor.create(OP_SND105);
                    root_0 = (Object)adaptor.becomeRoot(OP_SND105_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:193:27: OP_TRD
                    {
                    OP_TRD106=(Token)match(input,OP_TRD,FOLLOW_OP_TRD_in_single_return_operation1069); 
                    OP_TRD106_tree = (Object)adaptor.create(OP_TRD106);
                    root_0 = (Object)adaptor.becomeRoot(OP_TRD106_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_operation_args_in_single_return_operation1074);
            operation_args107=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args107.getTree());

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
    // $ANTLR end "single_return_operation"

    public static class attribute_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:196:1: attribute_call : ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_ENDS SEP_ARGS_START expression SEP_ARGS_END -> ^( OP_ENDS expression ) | ID -> ID );
    public final RecParser.attribute_call_return attribute_call() throws RecognitionException {
        RecParser.attribute_call_return retval = new RecParser.attribute_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_IN108=null;
        Token SEP_LIST_START109=null;
        Token INT110=null;
        Token SEP_LIST_END111=null;
        Token OP_OUT112=null;
        Token SEP_LIST_START113=null;
        Token INT114=null;
        Token SEP_LIST_END115=null;
        Token OP_NAME116=null;
        Token OP_NODES117=null;
        Token OP_NAMES118=null;
        Token OP_ENDS119=null;
        Token SEP_ARGS_START120=null;
        Token SEP_ARGS_END122=null;
        Token ID123=null;
        RecParser.expression_return expression121 = null;


        Object OP_IN108_tree=null;
        Object SEP_LIST_START109_tree=null;
        Object INT110_tree=null;
        Object SEP_LIST_END111_tree=null;
        Object OP_OUT112_tree=null;
        Object SEP_LIST_START113_tree=null;
        Object INT114_tree=null;
        Object SEP_LIST_END115_tree=null;
        Object OP_NAME116_tree=null;
        Object OP_NODES117_tree=null;
        Object OP_NAMES118_tree=null;
        Object OP_ENDS119_tree=null;
        Object SEP_ARGS_START120_tree=null;
        Object SEP_ARGS_END122_tree=null;
        Object ID123_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_OP_NODES=new RewriteRuleTokenStream(adaptor,"token OP_NODES");
        RewriteRuleTokenStream stream_SEP_LIST_END=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_END");
        RewriteRuleTokenStream stream_OP_OUT=new RewriteRuleTokenStream(adaptor,"token OP_OUT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_OP_ENDS=new RewriteRuleTokenStream(adaptor,"token OP_ENDS");
        RewriteRuleTokenStream stream_OP_NAME=new RewriteRuleTokenStream(adaptor,"token OP_NAME");
        RewriteRuleTokenStream stream_OP_NAMES=new RewriteRuleTokenStream(adaptor,"token OP_NAMES");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_OP_IN=new RewriteRuleTokenStream(adaptor,"token OP_IN");
        RewriteRuleTokenStream stream_SEP_LIST_START=new RewriteRuleTokenStream(adaptor,"token SEP_LIST_START");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:197:2: ( OP_IN ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_IN ( INT )? ) | OP_OUT ( SEP_LIST_START INT SEP_LIST_END )? -> ^( OP_OUT ( INT )? ) | OP_NAME -> OP_NAME | OP_NODES -> OP_NODES | OP_NAMES -> OP_NAMES | OP_ENDS SEP_ARGS_START expression SEP_ARGS_END -> ^( OP_ENDS expression ) | ID -> ID )
            int alt27=7;
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
            case OP_ENDS:
                {
                alt27=6;
                }
                break;
            case ID:
                {
                alt27=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:197:4: OP_IN ( SEP_LIST_START INT SEP_LIST_END )?
                    {
                    OP_IN108=(Token)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1086);  
                    stream_OP_IN.add(OP_IN108);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:197:10: ( SEP_LIST_START INT SEP_LIST_END )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==SEP_LIST_START) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:197:11: SEP_LIST_START INT SEP_LIST_END
                            {
                            SEP_LIST_START109=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_attribute_call1089);  
                            stream_SEP_LIST_START.add(SEP_LIST_START109);

                            INT110=(Token)match(input,INT,FOLLOW_INT_in_attribute_call1091);  
                            stream_INT.add(INT110);

                            SEP_LIST_END111=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_attribute_call1093);  
                            stream_SEP_LIST_END.add(SEP_LIST_END111);


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
                    // 197:47: -> ^( OP_IN ( INT )? )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:197:50: ^( OP_IN ( INT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_IN.nextNode(), root_1);

                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:197:58: ( INT )?
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:198:5: OP_OUT ( SEP_LIST_START INT SEP_LIST_END )?
                    {
                    OP_OUT112=(Token)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1112);  
                    stream_OP_OUT.add(OP_OUT112);

                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:198:12: ( SEP_LIST_START INT SEP_LIST_END )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==SEP_LIST_START) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:198:13: SEP_LIST_START INT SEP_LIST_END
                            {
                            SEP_LIST_START113=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_attribute_call1115);  
                            stream_SEP_LIST_START.add(SEP_LIST_START113);

                            INT114=(Token)match(input,INT,FOLLOW_INT_in_attribute_call1117);  
                            stream_INT.add(INT114);

                            SEP_LIST_END115=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_attribute_call1119);  
                            stream_SEP_LIST_END.add(SEP_LIST_END115);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: INT, OP_OUT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:47: -> ^( OP_OUT ( INT )? )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:198:50: ^( OP_OUT ( INT )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_OUT.nextNode(), root_1);

                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:198:59: ( INT )?
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:199:4: OP_NAME
                    {
                    OP_NAME116=(Token)match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1135);  
                    stream_OP_NAME.add(OP_NAME116);



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
                    // 199:17: -> OP_NAME
                    {
                        adaptor.addChild(root_0, stream_OP_NAME.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:200:4: OP_NODES
                    {
                    OP_NODES117=(Token)match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1149);  
                    stream_OP_NODES.add(OP_NODES117);



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
                    // 200:17: -> OP_NODES
                    {
                        adaptor.addChild(root_0, stream_OP_NODES.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:201:4: OP_NAMES
                    {
                    OP_NAMES118=(Token)match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1162);  
                    stream_OP_NAMES.add(OP_NAMES118);



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
                    // 201:17: -> OP_NAMES
                    {
                        adaptor.addChild(root_0, stream_OP_NAMES.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:202:4: OP_ENDS SEP_ARGS_START expression SEP_ARGS_END
                    {
                    OP_ENDS119=(Token)match(input,OP_ENDS,FOLLOW_OP_ENDS_in_attribute_call1175);  
                    stream_OP_ENDS.add(OP_ENDS119);

                    SEP_ARGS_START120=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_attribute_call1177);  
                    stream_SEP_ARGS_START.add(SEP_ARGS_START120);

                    pushFollow(FOLLOW_expression_in_attribute_call1179);
                    expression121=expression();

                    state._fsp--;

                    stream_expression.add(expression121.getTree());
                    SEP_ARGS_END122=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_attribute_call1181);  
                    stream_SEP_ARGS_END.add(SEP_ARGS_END122);



                    // AST REWRITE
                    // elements: expression, OP_ENDS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:51: -> ^( OP_ENDS expression )
                    {
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:202:54: ^( OP_ENDS expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_OP_ENDS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:203:4: ID
                    {
                    ID123=(Token)match(input,ID,FOLLOW_ID_in_attribute_call1195);  
                    stream_ID.add(ID123);



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
                    // 203:12: -> ID
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:207:1: triple_cons : CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) ;
    public final RecParser.triple_cons_return triple_cons() throws RecognitionException {
        RecParser.triple_cons_return retval = new RecParser.triple_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_TRIPLE124=null;
        Token SEP_ARGS_START125=null;
        Token SEP_COMMA127=null;
        Token SEP_COMMA129=null;
        Token SEP_ARGS_END131=null;
        RecParser.expression_return expression126 = null;

        RecParser.expression_return expression128 = null;

        RecParser.expression_return expression130 = null;


        Object CONS_TRIPLE124_tree=null;
        Object SEP_ARGS_START125_tree=null;
        Object SEP_COMMA127_tree=null;
        Object SEP_COMMA129_tree=null;
        Object SEP_ARGS_END131_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleTokenStream stream_CONS_TRIPLE=new RewriteRuleTokenStream(adaptor,"token CONS_TRIPLE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:208:2: ( CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END -> ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:208:4: CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END
            {
            CONS_TRIPLE124=(Token)match(input,CONS_TRIPLE,FOLLOW_CONS_TRIPLE_in_triple_cons1218);  
            stream_CONS_TRIPLE.add(CONS_TRIPLE124);

            SEP_ARGS_START125=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_triple_cons1220);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START125);

            pushFollow(FOLLOW_expression_in_triple_cons1222);
            expression126=expression();

            state._fsp--;

            stream_expression.add(expression126.getTree());
            SEP_COMMA127=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons1224);  
            stream_SEP_COMMA.add(SEP_COMMA127);

            pushFollow(FOLLOW_expression_in_triple_cons1226);
            expression128=expression();

            state._fsp--;

            stream_expression.add(expression128.getTree());
            SEP_COMMA129=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons1228);  
            stream_SEP_COMMA.add(SEP_COMMA129);

            pushFollow(FOLLOW_expression_in_triple_cons1230);
            expression130=expression();

            state._fsp--;

            stream_expression.add(expression130.getTree());
            SEP_ARGS_END131=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_triple_cons1232);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END131);



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
            // 209:3: -> ^( TRIPLE expression expression expression )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:209:6: ^( TRIPLE expression expression expression )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:213:1: pair_cons : CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) ;
    public final RecParser.pair_cons_return pair_cons() throws RecognitionException {
        RecParser.pair_cons_return retval = new RecParser.pair_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_PAIR132=null;
        Token SEP_ARGS_START133=null;
        Token SEP_COMMA135=null;
        Token SEP_ARGS_END137=null;
        RecParser.expression_return expression134 = null;

        RecParser.expression_return expression136 = null;


        Object CONS_PAIR132_tree=null;
        Object SEP_ARGS_START133_tree=null;
        Object SEP_COMMA135_tree=null;
        Object SEP_ARGS_END137_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_CONS_PAIR=new RewriteRuleTokenStream(adaptor,"token CONS_PAIR");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:214:2: ( CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END -> ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:214:4: CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END
            {
            CONS_PAIR132=(Token)match(input,CONS_PAIR,FOLLOW_CONS_PAIR_in_pair_cons1261);  
            stream_CONS_PAIR.add(CONS_PAIR132);

            SEP_ARGS_START133=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_pair_cons1263);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START133);

            pushFollow(FOLLOW_expression_in_pair_cons1265);
            expression134=expression();

            state._fsp--;

            stream_expression.add(expression134.getTree());
            SEP_COMMA135=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_pair_cons1267);  
            stream_SEP_COMMA.add(SEP_COMMA135);

            pushFollow(FOLLOW_expression_in_pair_cons1269);
            expression136=expression();

            state._fsp--;

            stream_expression.add(expression136.getTree());
            SEP_ARGS_END137=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_pair_cons1271);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END137);



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
            // 215:3: -> ^( PAIR expression expression )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:215:6: ^( PAIR expression expression )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:220:1: set_cons : CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) ;
    public final RecParser.set_cons_return set_cons() throws RecognitionException {
        RecParser.set_cons_return retval = new RecParser.set_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_SET138=null;
        Token SEP_ARGS_START139=null;
        Token SEP_COMMA141=null;
        Token SEP_ARGS_END143=null;
        RecParser.expression_return expression140 = null;

        RecParser.expression_return expression142 = null;


        Object CONS_SET138_tree=null;
        Object SEP_ARGS_START139_tree=null;
        Object SEP_COMMA141_tree=null;
        Object SEP_ARGS_END143_tree=null;
        RewriteRuleTokenStream stream_SEP_ARGS_END=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_END");
        RewriteRuleTokenStream stream_CONS_SET=new RewriteRuleTokenStream(adaptor,"token CONS_SET");
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_ARGS_START=new RewriteRuleTokenStream(adaptor,"token SEP_ARGS_START");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:2: ( CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END -> ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:4: CONS_SET SEP_ARGS_START ( expression ( SEP_COMMA expression )* )? SEP_ARGS_END
            {
            CONS_SET138=(Token)match(input,CONS_SET,FOLLOW_CONS_SET_in_set_cons1299);  
            stream_CONS_SET.add(CONS_SET138);

            SEP_ARGS_START139=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_set_cons1301);  
            stream_SEP_ARGS_START.add(SEP_ARGS_START139);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:29: ( expression ( SEP_COMMA expression )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=OP_PATH && LA29_0<=OP_TRD)||(LA29_0>=CONS_PAIR && LA29_0<=ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:31: expression ( SEP_COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_set_cons1306);
                    expression140=expression();

                    state._fsp--;

                    stream_expression.add(expression140.getTree());
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:42: ( SEP_COMMA expression )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==SEP_COMMA) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:221:43: SEP_COMMA expression
                    	    {
                    	    SEP_COMMA141=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_set_cons1309);  
                    	    stream_SEP_COMMA.add(SEP_COMMA141);

                    	    pushFollow(FOLLOW_expression_in_set_cons1311);
                    	    expression142=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression142.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            SEP_ARGS_END143=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_set_cons1318);  
            stream_SEP_ARGS_END.add(SEP_ARGS_END143);



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
            // 222:3: -> ^( SET ( expression )* )
            {
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:222:6: ^( SET ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:222:12: ( expression )*
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

    public static class applicaiton_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "applicaiton_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:232:1: applicaiton_def : ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? ;
    public final RecParser.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecParser.applicaiton_def_return retval = new RecParser.applicaiton_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID144=null;
        Token OP_APPLY145=null;
        RecParser.list_reconfigurations_return list_reconfigurations146 = null;

        RecParser.trigger_def_return trigger_def147 = null;


        Object ID144_tree=null;
        Object OP_APPLY145_tree=null;
        RewriteRuleTokenStream stream_OP_APPLY=new RewriteRuleTokenStream(adaptor,"token OP_APPLY");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_trigger_def=new RewriteRuleSubtreeStream(adaptor,"rule trigger_def");
        RewriteRuleSubtreeStream stream_list_reconfigurations=new RewriteRuleSubtreeStream(adaptor,"rule list_reconfigurations");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:233:2: ( ID OP_APPLY list_reconfigurations ( trigger_def )? -> ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:233:4: ID OP_APPLY list_reconfigurations ( trigger_def )?
            {
            ID144=(Token)match(input,ID,FOLLOW_ID_in_applicaiton_def1353);  
            stream_ID.add(ID144);

            OP_APPLY145=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_applicaiton_def1355);  
            stream_OP_APPLY.add(OP_APPLY145);

            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1358);
            list_reconfigurations146=list_reconfigurations();

            state._fsp--;

            stream_list_reconfigurations.add(list_reconfigurations146.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:233:40: ( trigger_def )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SEP_TRIGGER) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:233:40: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1361);
                    trigger_def147=trigger_def();

                    state._fsp--;

                    stream_trigger_def.add(trigger_def147.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: list_reconfigurations, trigger_def, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:3: -> ID list_reconfigurations ( trigger_def )?
            {
                adaptor.addChild(root_0, stream_ID.nextNode());
                adaptor.addChild(root_0, stream_list_reconfigurations.nextTree());
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:234:31: ( trigger_def )?
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:237:1: list_reconfigurations : ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ ;
    public final RecParser.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecParser.list_reconfigurations_return retval = new RecParser.list_reconfigurations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START148=null;
        Token SEP_COMMA150=null;
        Token SEP_BLOCK_END152=null;
        RecParser.reconfiguration_call_return reconfiguration_call149 = null;

        RecParser.reconfiguration_call_return reconfiguration_call151 = null;


        Object SEP_BLOCK_START148_tree=null;
        Object SEP_COMMA150_tree=null;
        Object SEP_BLOCK_END152_tree=null;
        RewriteRuleTokenStream stream_SEP_COMMA=new RewriteRuleTokenStream(adaptor,"token SEP_COMMA");
        RewriteRuleTokenStream stream_SEP_BLOCK_START=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_START");
        RewriteRuleTokenStream stream_SEP_BLOCK_END=new RewriteRuleTokenStream(adaptor,"token SEP_BLOCK_END");
        RewriteRuleSubtreeStream stream_reconfiguration_call=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_call");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:2: ( ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )? -> ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:5: ( SEP_BLOCK_START )? reconfiguration_call ( SEP_COMMA reconfiguration_call )* ( SEP_BLOCK_END )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:5: ( SEP_BLOCK_START )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_BLOCK_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:5: SEP_BLOCK_START
                    {
                    SEP_BLOCK_START148=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1386);  
                    stream_SEP_BLOCK_START.add(SEP_BLOCK_START148);


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1389);
            reconfiguration_call149=reconfiguration_call();

            state._fsp--;

            stream_reconfiguration_call.add(reconfiguration_call149.getTree());
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:43: ( SEP_COMMA reconfiguration_call )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SEP_COMMA) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:44: SEP_COMMA reconfiguration_call
            	    {
            	    SEP_COMMA150=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_reconfigurations1392);  
            	    stream_SEP_COMMA.add(SEP_COMMA150);

            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1394);
            	    reconfiguration_call151=reconfiguration_call();

            	    state._fsp--;

            	    stream_reconfiguration_call.add(reconfiguration_call151.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:77: ( SEP_BLOCK_END )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SEP_BLOCK_END) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:238:77: SEP_BLOCK_END
                    {
                    SEP_BLOCK_END152=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1398);  
                    stream_SEP_BLOCK_END.add(SEP_BLOCK_END152);


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
            // 238:93: -> ( reconfiguration_call )+
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:241:1: trigger_def : SEP_TRIGGER trigger_block -> trigger_block ;
    public final RecParser.trigger_def_return trigger_def() throws RecognitionException {
        RecParser.trigger_def_return retval = new RecParser.trigger_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_TRIGGER153=null;
        RecParser.trigger_block_return trigger_block154 = null;


        Object SEP_TRIGGER153_tree=null;
        RewriteRuleTokenStream stream_SEP_TRIGGER=new RewriteRuleTokenStream(adaptor,"token SEP_TRIGGER");
        RewriteRuleSubtreeStream stream_trigger_block=new RewriteRuleSubtreeStream(adaptor,"rule trigger_block");
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:242:2: ( SEP_TRIGGER trigger_block -> trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:242:4: SEP_TRIGGER trigger_block
            {
            SEP_TRIGGER153=(Token)match(input,SEP_TRIGGER,FOLLOW_SEP_TRIGGER_in_trigger_def1417);  
            stream_SEP_TRIGGER.add(SEP_TRIGGER153);

            pushFollow(FOLLOW_trigger_block_in_trigger_def1419);
            trigger_block154=trigger_block();

            state._fsp--;

            stream_trigger_block.add(trigger_block154.getTree());


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
            // 243:3: -> trigger_block
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:246:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecParser.trigger_block_return trigger_block() throws RecognitionException {
        RecParser.trigger_block_return retval = new RecParser.trigger_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START155=null;
        Token SEP_BLOCK_END156=null;

        Object SEP_BLOCK_START155_tree=null;
        Object SEP_BLOCK_END156_tree=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:247:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecParser.g:247:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            root_0 = (Object)adaptor.nil();

            SEP_BLOCK_START155=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1438); 
            SEP_BLOCK_START155_tree = (Object)adaptor.create(SEP_BLOCK_START155);
            adaptor.addChild(root_0, SEP_BLOCK_START155_tree);

            SEP_BLOCK_END156=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1440); 
            SEP_BLOCK_END156_tree = (Object)adaptor.create(SEP_BLOCK_END156);
            adaptor.addChild(root_0, SEP_BLOCK_END156_tree);


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


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\12\uffff";
    static final String DFA23_eofS =
        "\12\uffff";
    static final String DFA23_minS =
        "\1\24\1\40\10\uffff";
    static final String DFA23_maxS =
        "\1\66\1\62\10\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\4\1\5\1\6\1\7\1\10\1\1\1\2\1\3";
    static final String DFA23_specialS =
        "\12\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\6\3\2\32\uffff\1\4\1\3\1\5\1\1",
            "\3\10\3\uffff\2\10\2\uffff\1\10\4\uffff\1\7\1\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "180:1: factor : ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END -> ^( ID ID ) | ID -> ID | ID ( SEP_STRUCTURE ID )? SEP_ACCESSOR attribute_call -> ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | single_return_operation -> single_return_operation | triple_cons -> triple_cons | pair_cons -> pair_cons | set_cons -> set_cons | structure_operation_call -> structure_operation_call );";
        }
    }
 

    public static final BitSet FOLLOW_directive_def_in_reclang119 = new BitSet(new long[]{0x0040000000000052L});
    public static final BitSet FOLLOW_element_in_reclang122 = new BitSet(new long[]{0x0040000000000012L});
    public static final BitSet FOLLOW_directive_import_in_directive_def152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_IMPORT_in_directive_import172 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_STRING_in_directive_import174 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_directive_import176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_applicaiton_def_in_element217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def240 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def242 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_reconfiguration_def244 = new BitSet(new long[]{0x0000040000003F80L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def246 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_reconfiguration_def249 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_def_in_args_def276 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_args_def279 = new BitSet(new long[]{0x0000000000003F80L});
    public static final BitSet FOLLOW_arg_def_in_args_def281 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_datatype_in_arg_def307 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype346 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_datatype349 = new BitSet(new long[]{0x0000000000003F80L});
    public static final BitSet FOLLOW_subtype_in_datatype351 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_datatype353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids417 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_ids420 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_list_ids422 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_reconfiguration_block444 = new BitSet(new long[]{0x0040000080003FA0L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block446 = new BitSet(new long[]{0x0040002080003FA0L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_reconfiguration_block449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_instruction477 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction490 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction502 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply532 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply535 = new BitSet(new long[]{0x00400000000FC000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_declaration561 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration563 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_declaration566 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration568 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ID_in_var_def593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment611 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_assignment613 = new BitSet(new long[]{0x0078000081F00000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_assignment_member641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call661 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call666 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call671 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call676 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call681 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call686 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call691 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call711 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call716 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_operation_args736 = new BitSet(new long[]{0x0078040001F00000L});
    public static final BitSet FOLLOW_args_in_operation_args738 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_operation_args741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args758 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_args761 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_args763 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_RW_FORALL_in_for_instruction787 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_for_instruction789 = new BitSet(new long[]{0x0000000000003F80L});
    public static final BitSet FOLLOW_datatype_in_for_instruction791 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction793 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEP_COLON_in_for_instruction795 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction797 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_for_instruction799 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_expr_in_expression831 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_OP_UNION_in_expression834 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_union_expr_in_expression837 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_intersect_expr_in_union_expr854 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_union_expr857 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_intersect_expr_in_union_expr860 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_factor_in_intersect_expr877 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OP_MINUS_in_intersect_expr880 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_factor_in_intersect_expr883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor901 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_factor903 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_factor905 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_factor907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor939 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_SEP_STRUCTURE_in_factor942 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ID_in_factor944 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_SEP_ACCESSOR_in_factor948 = new BitSet(new long[]{0x004000007E000000L});
    public static final BitSet FOLLOW_attribute_call_in_factor950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_return_operation_in_factor973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_factor987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_factor1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_factor1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_operation_call_in_factor1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_single_return_operation1059 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_SND_in_single_return_operation1064 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OP_TRD_in_single_return_operation1069 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_operation_args_in_single_return_operation1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1086 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1089 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INT_in_attribute_call1091 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1112 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_attribute_call1115 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_INT_in_attribute_call1117 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_attribute_call1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ENDS_in_attribute_call1175 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_attribute_call1177 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_attribute_call1179 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_attribute_call1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_TRIPLE_in_triple_cons1218 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_triple_cons1220 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1222 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1224 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1226 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons1228 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1230 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_triple_cons1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_PAIR_in_pair_cons1261 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_pair_cons1263 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1265 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_pair_cons1267 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1269 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_pair_cons1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_SET_in_set_cons1299 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_set_cons1301 = new BitSet(new long[]{0x0078040001F00000L});
    public static final BitSet FOLLOW_expression_in_set_cons1306 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_set_cons1309 = new BitSet(new long[]{0x0078000001F00000L});
    public static final BitSet FOLLOW_expression_in_set_cons1311 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_set_cons1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1353 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OP_APPLY_in_applicaiton_def1355 = new BitSet(new long[]{0x00400010000FC000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1358 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_list_reconfigurations1386 = new BitSet(new long[]{0x00400000000FC000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1389 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_reconfigurations1392 = new BitSet(new long[]{0x00400000000FC000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1394 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_list_reconfigurations1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_TRIGGER_in_trigger_def1417 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1438 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1440 = new BitSet(new long[]{0x0000000000000002L});

}