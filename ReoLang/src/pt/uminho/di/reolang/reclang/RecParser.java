// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g 2012-06-15 17:37:29

	package pt.uminho.di.reolang.reclang;
	import java.text.*;
	import java.util.Date;
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.ErrorType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_LIST", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "CONS_PAIR", "CONS_TRIPLE", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "APPLICATION", "SIGNATURE"
    };
    public static final int SEP_LIST_END=38;
    public static final int UNICODE_ESC=51;
    public static final int OP_INTERSECTION=25;
    public static final int DT_TRIPLE=13;
    public static final int SEP_ACCESSOR=41;
    public static final int DT_NODE=10;
    public static final int SEP_ARGS_END=34;
    public static final int RECONFIGURATION=55;
    public static final int OP_FST=20;
    public static final int OP_UPDATE=19;
    public static final int IMPORT=54;
    public static final int SEP_BLOCK_START=28;
    public static final int OP_SND=21;
    public static final int DT_PATTERN=7;
    public static final int OP_EQUAL=27;
    public static final int INT=45;
    public static final int OP_APPLY=23;
    public static final int DT_PAIR=12;
    public static final int OP_TRD=22;
    public static final int SEP_OPTIONAL=35;
    public static final int CONS_PAIR=42;
    public static final int OP_PATH=18;
    public static final int RW_FORALL=5;
    public static final int HEX_DIGIT=50;
    public static final int OP_PAR=14;
    public static final int SEP_COMMA=30;
    public static final int OCTAL_ESC=52;
    public static final int OP_REMOVE=17;
    public static final int ID=44;
    public static final int DT_NAME=9;
    public static final int APPLICATION=56;
    public static final int WS=47;
    public static final int DT_CHANNEL=8;
    public static final int STRING=49;
    public static final int RW_IMPORT=6;
    public static final int CONS_TRIPLE=43;
    public static final int COMMENT=46;
    public static final int SEP_LIST_START=37;
    public static final int ESC_SEQ=48;
    public static final int OP_UNION=24;
    public static final int SEP_COLON=32;
    public static final int SEP_ARGS_START=33;
    public static final int SEP_TRIGGER=36;
    public static final int SEP_SEMICOLON=31;
    public static final int OP_MINUS=26;
    public static final int SIGNATURE=57;
    public static final int EOF=-1;
    public static final int OP_JOIN=15;
    public static final int SEP_SUBTYPE_END=40;
    public static final int SEP_BLOCK_END=29;
    public static final int DT_LIST=11;
    public static final int RW_RECONFIGURATION=4;
    public static final int RECONFIGS=53;
    public static final int SEP_SUBTYPE_START=39;
    public static final int OP_SPLIT=16;

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
    public String getGrammarFileName() { return "/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g"; }


    	private ArrayList<Error> syntax_errors = new ArrayList<Error>();
    	private String file_path;
    	
    	public void emitErrorMessage(String msg) {
            syntax_errors.add(new Error(ErrorType.ERROR, msg, this.file_path));
        }
    	
    	//Notice the access to the errors of the imported grammars
    	public ArrayList<Error> getErrors() {
    		return this.syntax_errors;
    	}
    	
    	public String getFilePath() {
    		return this.file_path;
    	}

    	public void setFilePath(String file) {
    		this.file_path = file;
    	}


    public static class reclang_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reclang"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:54:1: reclang : ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final RecParser.reclang_return reclang() throws RecognitionException {
        RecParser.reclang_return retval = new RecParser.reclang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_def_return directive_def1 = null;

        RecParser.element_return element2 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        RewriteRuleSubtreeStream stream_directive_def=new RewriteRuleSubtreeStream(adaptor,"rule directive_def");
        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:55:2: ( ( directive_def )* ( element )* -> ^( RECONFIGS ( directive_def )* ( element )* ) )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:55:5: ( directive_def )* ( element )*
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:55:5: ( directive_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RW_IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:55:5: directive_def
            	    {
            	    pushFollow(FOLLOW_directive_def_in_reclang75);
            	    directive_def1=directive_def();

            	    state._fsp--;

            	    stream_directive_def.add(directive_def1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:55:20: ( element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RW_RECONFIGURATION||LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:55:20: element
            	    {
            	    pushFollow(FOLLOW_element_in_reclang78);
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
            // elements: directive_def, element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:3: -> ^( RECONFIGS ( directive_def )* ( element )* )
            {
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:56:6: ^( RECONFIGS ( directive_def )* ( element )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RECONFIGS, "RECONFIGS"), root_1);

                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:56:18: ( directive_def )*
                while ( stream_directive_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_directive_def.nextTree());

                }
                stream_directive_def.reset();
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:56:33: ( element )*
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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:62:1: directive_def : directive_import -> directive_import ;
    public final RecParser.directive_def_return directive_def() throws RecognitionException {
        RecParser.directive_def_return retval = new RecParser.directive_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.directive_import_return directive_import3 = null;


        RewriteRuleSubtreeStream stream_directive_import=new RewriteRuleSubtreeStream(adaptor,"rule directive_import");
        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:63:2: ( directive_import -> directive_import )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:63:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def107);
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
            // 64:3: -> directive_import
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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:68:1: directive_import : RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) ;
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
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:69:2: ( RW_IMPORT STRING SEP_SEMICOLON -> ^( IMPORT STRING ) )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:69:4: RW_IMPORT STRING SEP_SEMICOLON
            {
            RW_IMPORT4=(Token)match(input,RW_IMPORT,FOLLOW_RW_IMPORT_in_directive_import127);  
            stream_RW_IMPORT.add(RW_IMPORT4);

            STRING5=(Token)match(input,STRING,FOLLOW_STRING_in_directive_import129);  
            stream_STRING.add(STRING5);

            SEP_SEMICOLON6=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_directive_import131);  
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
            // 70:3: -> ^( IMPORT STRING )
            {
                // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:70:6: ^( IMPORT STRING )
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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:78:1: element : ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) );
    public final RecParser.element_return element() throws RecognitionException {
        RecParser.element_return retval = new RecParser.element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.reconfiguration_def_return reconfiguration_def7 = null;

        RecParser.applicaiton_def_return applicaiton_def8 = null;


        RewriteRuleSubtreeStream stream_applicaiton_def=new RewriteRuleSubtreeStream(adaptor,"rule applicaiton_def");
        RewriteRuleSubtreeStream stream_reconfiguration_def=new RewriteRuleSubtreeStream(adaptor,"rule reconfiguration_def");
        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:79:2: ( reconfiguration_def -> ^( RECONFIGURATION reconfiguration_def ) | applicaiton_def -> ^( APPLICATION applicaiton_def ) )
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:79:4: reconfiguration_def
                    {
                    pushFollow(FOLLOW_reconfiguration_def_in_element159);
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
                    // 79:24: -> ^( RECONFIGURATION reconfiguration_def )
                    {
                        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:79:27: ^( RECONFIGURATION reconfiguration_def )
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:80:4: applicaiton_def
                    {
                    pushFollow(FOLLOW_applicaiton_def_in_element172);
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
                    // 80:21: -> ^( APPLICATION applicaiton_def )
                    {
                        // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:80:24: ^( APPLICATION applicaiton_def )
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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:85:1: reconfiguration_def : RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? ( SEP_OPTIONAL args_def )? SEP_ARGS_END reconfiguration_block ;
    public final RecParser.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
        RecParser.reconfiguration_def_return retval = new RecParser.reconfiguration_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_RECONFIGURATION9=null;
        Token ID10=null;
        Token SEP_ARGS_START11=null;
        Token SEP_OPTIONAL13=null;
        Token SEP_ARGS_END15=null;
        RecParser.args_def_return args_def12 = null;

        RecParser.args_def_return args_def14 = null;

        RecParser.reconfiguration_block_return reconfiguration_block16 = null;


        Object RW_RECONFIGURATION9_tree=null;
        Object ID10_tree=null;
        Object SEP_ARGS_START11_tree=null;
        Object SEP_OPTIONAL13_tree=null;
        Object SEP_ARGS_END15_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:86:2: ( RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? ( SEP_OPTIONAL args_def )? SEP_ARGS_END reconfiguration_block )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:86:4: RW_RECONFIGURATION ID SEP_ARGS_START ( args_def )? ( SEP_OPTIONAL args_def )? SEP_ARGS_END reconfiguration_block
            {
            root_0 = (Object)adaptor.nil();

            RW_RECONFIGURATION9=(Token)match(input,RW_RECONFIGURATION,FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def195); 
            RW_RECONFIGURATION9_tree = (Object)adaptor.create(RW_RECONFIGURATION9);
            adaptor.addChild(root_0, RW_RECONFIGURATION9_tree);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_reconfiguration_def197); 
            ID10_tree = (Object)adaptor.create(ID10);
            adaptor.addChild(root_0, ID10_tree);

            SEP_ARGS_START11=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_reconfiguration_def199); 
            SEP_ARGS_START11_tree = (Object)adaptor.create(SEP_ARGS_START11);
            adaptor.addChild(root_0, SEP_ARGS_START11_tree);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:86:41: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=DT_PATTERN && LA4_0<=DT_TRIPLE)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:86:41: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def201);
                    args_def12=args_def();

                    state._fsp--;

                    adaptor.addChild(root_0, args_def12.getTree());

                    }
                    break;

            }

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:86:51: ( SEP_OPTIONAL args_def )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==SEP_OPTIONAL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:86:52: SEP_OPTIONAL args_def
                    {
                    SEP_OPTIONAL13=(Token)match(input,SEP_OPTIONAL,FOLLOW_SEP_OPTIONAL_in_reconfiguration_def205); 
                    SEP_OPTIONAL13_tree = (Object)adaptor.create(SEP_OPTIONAL13);
                    adaptor.addChild(root_0, SEP_OPTIONAL13_tree);

                    pushFollow(FOLLOW_args_def_in_reconfiguration_def207);
                    args_def14=args_def();

                    state._fsp--;

                    adaptor.addChild(root_0, args_def14.getTree());

                    }
                    break;

            }

            SEP_ARGS_END15=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_reconfiguration_def211); 
            SEP_ARGS_END15_tree = (Object)adaptor.create(SEP_ARGS_END15);
            adaptor.addChild(root_0, SEP_ARGS_END15_tree);

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def213);
            reconfiguration_block16=reconfiguration_block();

            state._fsp--;

            adaptor.addChild(root_0, reconfiguration_block16.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:89:1: args_def : datatype list_ids ( SEP_SEMICOLON datatype list_ids )* ;
    public final RecParser.args_def_return args_def() throws RecognitionException {
        RecParser.args_def_return retval = new RecParser.args_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON19=null;
        RecParser.datatype_return datatype17 = null;

        RecParser.list_ids_return list_ids18 = null;

        RecParser.datatype_return datatype20 = null;

        RecParser.list_ids_return list_ids21 = null;


        Object SEP_SEMICOLON19_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:90:2: ( datatype list_ids ( SEP_SEMICOLON datatype list_ids )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:90:4: datatype list_ids ( SEP_SEMICOLON datatype list_ids )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_args_def224);
            datatype17=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype17.getTree());
            pushFollow(FOLLOW_list_ids_in_args_def226);
            list_ids18=list_ids();

            state._fsp--;

            adaptor.addChild(root_0, list_ids18.getTree());
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:90:22: ( SEP_SEMICOLON datatype list_ids )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==SEP_SEMICOLON) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:90:23: SEP_SEMICOLON datatype list_ids
            	    {
            	    SEP_SEMICOLON19=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_args_def229); 
            	    SEP_SEMICOLON19_tree = (Object)adaptor.create(SEP_SEMICOLON19);
            	    adaptor.addChild(root_0, SEP_SEMICOLON19_tree);

            	    pushFollow(FOLLOW_datatype_in_args_def231);
            	    datatype20=datatype();

            	    state._fsp--;

            	    adaptor.addChild(root_0, datatype20.getTree());
            	    pushFollow(FOLLOW_list_ids_in_args_def233);
            	    list_ids21=list_ids();

            	    state._fsp--;

            	    adaptor.addChild(root_0, list_ids21.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "args_def"

    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datatype"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:93:1: datatype : ( DT_PATTERN | DT_CHANNEL | other_type ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )? );
    public final RecParser.datatype_return datatype() throws RecognitionException {
        RecParser.datatype_return retval = new RecParser.datatype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DT_PATTERN22=null;
        Token DT_CHANNEL23=null;
        Token SEP_SUBTYPE_START25=null;
        Token SEP_SUBTYPE_END27=null;
        RecParser.other_type_return other_type24 = null;

        RecParser.subtype_return subtype26 = null;


        Object DT_PATTERN22_tree=null;
        Object DT_CHANNEL23_tree=null;
        Object SEP_SUBTYPE_START25_tree=null;
        Object SEP_SUBTYPE_END27_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:94:2: ( DT_PATTERN | DT_CHANNEL | other_type ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )? )
            int alt8=3;
            switch ( input.LA(1) ) {
            case DT_PATTERN:
                {
                alt8=1;
                }
                break;
            case DT_CHANNEL:
                {
                alt8=2;
                }
                break;
            case DT_NAME:
            case DT_NODE:
            case DT_LIST:
            case DT_PAIR:
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:94:5: DT_PATTERN
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_PATTERN22=(Token)match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype248); 
                    DT_PATTERN22_tree = (Object)adaptor.create(DT_PATTERN22);
                    adaptor.addChild(root_0, DT_PATTERN22_tree);


                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:95:5: DT_CHANNEL
                    {
                    root_0 = (Object)adaptor.nil();

                    DT_CHANNEL23=(Token)match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype254); 
                    DT_CHANNEL23_tree = (Object)adaptor.create(DT_CHANNEL23);
                    adaptor.addChild(root_0, DT_CHANNEL23_tree);


                    }
                    break;
                case 3 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:96:4: other_type ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )?
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_other_type_in_datatype259);
                    other_type24=other_type();

                    state._fsp--;

                    adaptor.addChild(root_0, other_type24.getTree());
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:96:15: ( SEP_SUBTYPE_START subtype SEP_SUBTYPE_END )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==SEP_SUBTYPE_START) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:96:16: SEP_SUBTYPE_START subtype SEP_SUBTYPE_END
                            {
                            SEP_SUBTYPE_START25=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_datatype262); 
                            SEP_SUBTYPE_START25_tree = (Object)adaptor.create(SEP_SUBTYPE_START25);
                            adaptor.addChild(root_0, SEP_SUBTYPE_START25_tree);

                            pushFollow(FOLLOW_subtype_in_datatype264);
                            subtype26=subtype();

                            state._fsp--;

                            adaptor.addChild(root_0, subtype26.getTree());
                            SEP_SUBTYPE_END27=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_datatype266); 
                            SEP_SUBTYPE_END27_tree = (Object)adaptor.create(SEP_SUBTYPE_END27);
                            adaptor.addChild(root_0, SEP_SUBTYPE_END27_tree);


                            }
                            break;

                    }


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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:99:1: other_type : ( DT_NAME | DT_NODE | DT_LIST | DT_PAIR | DT_TRIPLE );
    public final RecParser.other_type_return other_type() throws RecognitionException {
        RecParser.other_type_return retval = new RecParser.other_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set28=null;

        Object set28_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:100:2: ( DT_NAME | DT_NODE | DT_LIST | DT_PAIR | DT_TRIPLE )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:
            {
            root_0 = (Object)adaptor.nil();

            set28=(Token)input.LT(1);
            if ( (input.LA(1)>=DT_NAME && input.LA(1)<=DT_TRIPLE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set28));
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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:103:1: subtype : datatype ;
    public final RecParser.subtype_return subtype() throws RecognitionException {
        RecParser.subtype_return retval = new RecParser.subtype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RecParser.datatype_return datatype29 = null;



        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:104:2: ( datatype )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:104:4: datatype
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_subtype307);
            datatype29=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype29.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:107:1: list_ids : ID ( SEP_COMMA ID )* ;
    public final RecParser.list_ids_return list_ids() throws RecognitionException {
        RecParser.list_ids_return retval = new RecParser.list_ids_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID30=null;
        Token SEP_COMMA31=null;
        Token ID32=null;

        Object ID30_tree=null;
        Object SEP_COMMA31_tree=null;
        Object ID32_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:108:2: ( ID ( SEP_COMMA ID )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:108:4: ID ( SEP_COMMA ID )*
            {
            root_0 = (Object)adaptor.nil();

            ID30=(Token)match(input,ID,FOLLOW_ID_in_list_ids319); 
            ID30_tree = (Object)adaptor.create(ID30);
            adaptor.addChild(root_0, ID30_tree);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:108:7: ( SEP_COMMA ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==SEP_COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:108:8: SEP_COMMA ID
            	    {
            	    SEP_COMMA31=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_ids322); 
            	    SEP_COMMA31_tree = (Object)adaptor.create(SEP_COMMA31);
            	    adaptor.addChild(root_0, SEP_COMMA31_tree);

            	    ID32=(Token)match(input,ID,FOLLOW_ID_in_list_ids324); 
            	    ID32_tree = (Object)adaptor.create(ID32);
            	    adaptor.addChild(root_0, ID32_tree);


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "list_ids"

    public static class reconfiguration_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reconfiguration_block"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:112:1: reconfiguration_block : SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END ;
    public final RecParser.reconfiguration_block_return reconfiguration_block() throws RecognitionException {
        RecParser.reconfiguration_block_return retval = new RecParser.reconfiguration_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START33=null;
        Token SEP_BLOCK_END35=null;
        RecParser.instruction_return instruction34 = null;


        Object SEP_BLOCK_START33_tree=null;
        Object SEP_BLOCK_END35_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:113:2: ( SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:113:4: SEP_BLOCK_START ( instruction )+ SEP_BLOCK_END
            {
            root_0 = (Object)adaptor.nil();

            SEP_BLOCK_START33=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_reconfiguration_block341); 
            SEP_BLOCK_START33_tree = (Object)adaptor.create(SEP_BLOCK_START33);
            adaptor.addChild(root_0, SEP_BLOCK_START33_tree);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:113:20: ( instruction )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RW_FORALL||(LA10_0>=DT_PATTERN && LA10_0<=DT_TRIPLE)||(LA10_0>=OP_PATH && LA10_0<=OP_UPDATE)||LA10_0==OP_APPLY||LA10_0==ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:113:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block343);
            	    instruction34=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction34.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            SEP_BLOCK_END35=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_reconfiguration_block346); 
            SEP_BLOCK_END35_tree = (Object)adaptor.create(SEP_BLOCK_END35);
            adaptor.addChild(root_0, SEP_BLOCK_END35_tree);


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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:116:1: instruction : ( declaration SEP_SEMICOLON | assignement SEP_SEMICOLON | structure_operation_call SEP_SEMICOLON | OP_APPLY reconfiguration_call SEP_SEMICOLON | for_instruction );
    public final RecParser.instruction_return instruction() throws RecognitionException {
        RecParser.instruction_return retval = new RecParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_SEMICOLON37=null;
        Token SEP_SEMICOLON39=null;
        Token SEP_SEMICOLON41=null;
        Token OP_APPLY42=null;
        Token SEP_SEMICOLON44=null;
        RecParser.declaration_return declaration36 = null;

        RecParser.assignement_return assignement38 = null;

        RecParser.structure_operation_call_return structure_operation_call40 = null;

        RecParser.reconfiguration_call_return reconfiguration_call43 = null;

        RecParser.for_instruction_return for_instruction45 = null;


        Object SEP_SEMICOLON37_tree=null;
        Object SEP_SEMICOLON39_tree=null;
        Object SEP_SEMICOLON41_tree=null;
        Object OP_APPLY42_tree=null;
        Object SEP_SEMICOLON44_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:117:2: ( declaration SEP_SEMICOLON | assignement SEP_SEMICOLON | structure_operation_call SEP_SEMICOLON | OP_APPLY reconfiguration_call SEP_SEMICOLON | for_instruction )
            int alt11=5;
            switch ( input.LA(1) ) {
            case DT_PATTERN:
            case DT_CHANNEL:
            case DT_NAME:
            case DT_NODE:
            case DT_LIST:
            case DT_PAIR:
            case DT_TRIPLE:
                {
                alt11=1;
                }
                break;
            case ID:
                {
                alt11=2;
                }
                break;
            case OP_PATH:
            case OP_UPDATE:
                {
                alt11=3;
                }
                break;
            case OP_APPLY:
                {
                alt11=4;
                }
                break;
            case RW_FORALL:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:117:4: declaration SEP_SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_declaration_in_instruction358);
                    declaration36=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration36.getTree());
                    SEP_SEMICOLON37=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction360); 
                    SEP_SEMICOLON37_tree = (Object)adaptor.create(SEP_SEMICOLON37);
                    adaptor.addChild(root_0, SEP_SEMICOLON37_tree);


                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:118:4: assignement SEP_SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignement_in_instruction365);
                    assignement38=assignement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignement38.getTree());
                    SEP_SEMICOLON39=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction367); 
                    SEP_SEMICOLON39_tree = (Object)adaptor.create(SEP_SEMICOLON39);
                    adaptor.addChild(root_0, SEP_SEMICOLON39_tree);


                    }
                    break;
                case 3 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:119:4: structure_operation_call SEP_SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_structure_operation_call_in_instruction372);
                    structure_operation_call40=structure_operation_call();

                    state._fsp--;

                    adaptor.addChild(root_0, structure_operation_call40.getTree());
                    SEP_SEMICOLON41=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction374); 
                    SEP_SEMICOLON41_tree = (Object)adaptor.create(SEP_SEMICOLON41);
                    adaptor.addChild(root_0, SEP_SEMICOLON41_tree);


                    }
                    break;
                case 4 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:120:4: OP_APPLY reconfiguration_call SEP_SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();

                    OP_APPLY42=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_instruction379); 
                    OP_APPLY42_tree = (Object)adaptor.create(OP_APPLY42);
                    adaptor.addChild(root_0, OP_APPLY42_tree);

                    pushFollow(FOLLOW_reconfiguration_call_in_instruction381);
                    reconfiguration_call43=reconfiguration_call();

                    state._fsp--;

                    adaptor.addChild(root_0, reconfiguration_call43.getTree());
                    SEP_SEMICOLON44=(Token)match(input,SEP_SEMICOLON,FOLLOW_SEP_SEMICOLON_in_instruction383); 
                    SEP_SEMICOLON44_tree = (Object)adaptor.create(SEP_SEMICOLON44);
                    adaptor.addChild(root_0, SEP_SEMICOLON44_tree);


                    }
                    break;
                case 5 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:121:4: for_instruction
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_for_instruction_in_instruction388);
                    for_instruction45=for_instruction();

                    state._fsp--;

                    adaptor.addChild(root_0, for_instruction45.getTree());

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

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:124:1: declaration : datatype var_def ( SEP_COMMA var_def )* ;
    public final RecParser.declaration_return declaration() throws RecognitionException {
        RecParser.declaration_return retval = new RecParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA48=null;
        RecParser.datatype_return datatype46 = null;

        RecParser.var_def_return var_def47 = null;

        RecParser.var_def_return var_def49 = null;


        Object SEP_COMMA48_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:125:2: ( datatype var_def ( SEP_COMMA var_def )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:125:4: datatype var_def ( SEP_COMMA var_def )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_datatype_in_declaration401);
            datatype46=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype46.getTree());
            pushFollow(FOLLOW_var_def_in_declaration403);
            var_def47=var_def();

            state._fsp--;

            adaptor.addChild(root_0, var_def47.getTree());
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:125:21: ( SEP_COMMA var_def )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SEP_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:125:22: SEP_COMMA var_def
            	    {
            	    SEP_COMMA48=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_declaration406); 
            	    SEP_COMMA48_tree = (Object)adaptor.create(SEP_COMMA48);
            	    adaptor.addChild(root_0, SEP_COMMA48_tree);

            	    pushFollow(FOLLOW_var_def_in_declaration408);
            	    var_def49=var_def();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_def49.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "declaration"

    public static class var_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_def"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:128:1: var_def : ( ID | assignement );
    public final RecParser.var_def_return var_def() throws RecognitionException {
        RecParser.var_def_return retval = new RecParser.var_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID50=null;
        RecParser.assignement_return assignement51 = null;


        Object ID50_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:129:2: ( ID | assignement )
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:129:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID50=(Token)match(input,ID,FOLLOW_ID_in_var_def422); 
                    ID50_tree = (Object)adaptor.create(ID50);
                    adaptor.addChild(root_0, ID50_tree);


                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:130:4: assignement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignement_in_var_def427);
                    assignement51=assignement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignement51.getTree());

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

    public static class assignement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignement"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:133:1: assignement : ID OP_EQUAL expression ;
    public final RecParser.assignement_return assignement() throws RecognitionException {
        RecParser.assignement_return retval = new RecParser.assignement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID52=null;
        Token OP_EQUAL53=null;
        RecParser.expression_return expression54 = null;


        Object ID52_tree=null;
        Object OP_EQUAL53_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:134:2: ( ID OP_EQUAL expression )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:134:4: ID OP_EQUAL expression
            {
            root_0 = (Object)adaptor.nil();

            ID52=(Token)match(input,ID,FOLLOW_ID_in_assignement440); 
            ID52_tree = (Object)adaptor.create(ID52);
            adaptor.addChild(root_0, ID52_tree);

            OP_EQUAL53=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_assignement442); 
            OP_EQUAL53_tree = (Object)adaptor.create(OP_EQUAL53);
            adaptor.addChild(root_0, OP_EQUAL53_tree);

            pushFollow(FOLLOW_expression_in_assignement444);
            expression54=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression54.getTree());

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
    // $ANTLR end "assignement"

    public static class reconfiguration_call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reconfiguration_call"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:138:1: reconfiguration_call : ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | ID ) operation_args ;
    public final RecParser.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecParser.reconfiguration_call_return retval = new RecParser.reconfiguration_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set55=null;
        RecParser.operation_args_return operation_args56 = null;


        Object set55_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:139:2: ( ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | ID ) operation_args )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:139:4: ( OP_JOIN | OP_SPLIT | OP_PAR | OP_REMOVE | ID ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            set55=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PAR && input.LA(1)<=OP_REMOVE)||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set55));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_operation_args_in_reconfiguration_call480);
            operation_args56=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args56.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:144:1: structure_operation_call : ( OP_PATH | OP_UPDATE ) operation_args ;
    public final RecParser.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecParser.structure_operation_call_return retval = new RecParser.structure_operation_call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set57=null;
        RecParser.operation_args_return operation_args58 = null;


        Object set57_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:145:2: ( ( OP_PATH | OP_UPDATE ) operation_args )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:145:4: ( OP_PATH | OP_UPDATE ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            set57=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_PATH && input.LA(1)<=OP_UPDATE) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set57));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_operation_args_in_structure_operation_call506);
            operation_args58=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args58.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:149:1: operation_args : SEP_ARGS_START ( args )? ( SEP_OPTIONAL args )? SEP_ARGS_END ;
    public final RecParser.operation_args_return operation_args() throws RecognitionException {
        RecParser.operation_args_return retval = new RecParser.operation_args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_ARGS_START59=null;
        Token SEP_OPTIONAL61=null;
        Token SEP_ARGS_END63=null;
        RecParser.args_return args60 = null;

        RecParser.args_return args62 = null;


        Object SEP_ARGS_START59_tree=null;
        Object SEP_OPTIONAL61_tree=null;
        Object SEP_ARGS_END63_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:150:2: ( SEP_ARGS_START ( args )? ( SEP_OPTIONAL args )? SEP_ARGS_END )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:150:4: SEP_ARGS_START ( args )? ( SEP_OPTIONAL args )? SEP_ARGS_END
            {
            root_0 = (Object)adaptor.nil();

            SEP_ARGS_START59=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_operation_args520); 
            SEP_ARGS_START59_tree = (Object)adaptor.create(SEP_ARGS_START59);
            adaptor.addChild(root_0, SEP_ARGS_START59_tree);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:150:19: ( args )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=OP_FST && LA14_0<=OP_TRD)||LA14_0==SEP_LIST_START||(LA14_0>=SEP_ACCESSOR && LA14_0<=ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:150:19: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args522);
                    args60=args();

                    state._fsp--;

                    adaptor.addChild(root_0, args60.getTree());

                    }
                    break;

            }

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:150:25: ( SEP_OPTIONAL args )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==SEP_OPTIONAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:150:26: SEP_OPTIONAL args
                    {
                    SEP_OPTIONAL61=(Token)match(input,SEP_OPTIONAL,FOLLOW_SEP_OPTIONAL_in_operation_args526); 
                    SEP_OPTIONAL61_tree = (Object)adaptor.create(SEP_OPTIONAL61);
                    adaptor.addChild(root_0, SEP_OPTIONAL61_tree);

                    pushFollow(FOLLOW_args_in_operation_args528);
                    args62=args();

                    state._fsp--;

                    adaptor.addChild(root_0, args62.getTree());

                    }
                    break;

            }

            SEP_ARGS_END63=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_operation_args532); 
            SEP_ARGS_END63_tree = (Object)adaptor.create(SEP_ARGS_END63);
            adaptor.addChild(root_0, SEP_ARGS_END63_tree);


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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:153:1: args : expression ( SEP_COMMA expression )* ;
    public final RecParser.args_return args() throws RecognitionException {
        RecParser.args_return retval = new RecParser.args_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_COMMA65=null;
        RecParser.expression_return expression64 = null;

        RecParser.expression_return expression66 = null;


        Object SEP_COMMA65_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:154:2: ( expression ( SEP_COMMA expression )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:154:4: expression ( SEP_COMMA expression )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_args545);
            expression64=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression64.getTree());
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:154:15: ( SEP_COMMA expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==SEP_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:154:16: SEP_COMMA expression
            	    {
            	    SEP_COMMA65=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_args548); 
            	    SEP_COMMA65_tree = (Object)adaptor.create(SEP_COMMA65);
            	    adaptor.addChild(root_0, SEP_COMMA65_tree);

            	    pushFollow(FOLLOW_expression_in_args550);
            	    expression66=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression66.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "args"

    public static class for_instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_instruction"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:158:1: for_instruction : RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block ;
    public final RecParser.for_instruction_return for_instruction() throws RecognitionException {
        RecParser.for_instruction_return retval = new RecParser.for_instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_FORALL67=null;
        Token SEP_ARGS_START68=null;
        Token ID70=null;
        Token SEP_COLON71=null;
        Token ID72=null;
        Token SEP_ARGS_END73=null;
        RecParser.datatype_return datatype69 = null;

        RecParser.reconfiguration_block_return reconfiguration_block74 = null;


        Object RW_FORALL67_tree=null;
        Object SEP_ARGS_START68_tree=null;
        Object ID70_tree=null;
        Object SEP_COLON71_tree=null;
        Object ID72_tree=null;
        Object SEP_ARGS_END73_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:158:17: ( RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:158:19: RW_FORALL SEP_ARGS_START datatype ID SEP_COLON ID SEP_ARGS_END reconfiguration_block
            {
            root_0 = (Object)adaptor.nil();

            RW_FORALL67=(Token)match(input,RW_FORALL,FOLLOW_RW_FORALL_in_for_instruction565); 
            RW_FORALL67_tree = (Object)adaptor.create(RW_FORALL67);
            adaptor.addChild(root_0, RW_FORALL67_tree);

            SEP_ARGS_START68=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_for_instruction567); 
            SEP_ARGS_START68_tree = (Object)adaptor.create(SEP_ARGS_START68);
            adaptor.addChild(root_0, SEP_ARGS_START68_tree);

            pushFollow(FOLLOW_datatype_in_for_instruction569);
            datatype69=datatype();

            state._fsp--;

            adaptor.addChild(root_0, datatype69.getTree());
            ID70=(Token)match(input,ID,FOLLOW_ID_in_for_instruction571); 
            ID70_tree = (Object)adaptor.create(ID70);
            adaptor.addChild(root_0, ID70_tree);

            SEP_COLON71=(Token)match(input,SEP_COLON,FOLLOW_SEP_COLON_in_for_instruction573); 
            SEP_COLON71_tree = (Object)adaptor.create(SEP_COLON71);
            adaptor.addChild(root_0, SEP_COLON71_tree);

            ID72=(Token)match(input,ID,FOLLOW_ID_in_for_instruction575); 
            ID72_tree = (Object)adaptor.create(ID72);
            adaptor.addChild(root_0, ID72_tree);

            SEP_ARGS_END73=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_for_instruction577); 
            SEP_ARGS_END73_tree = (Object)adaptor.create(SEP_ARGS_END73);
            adaptor.addChild(root_0, SEP_ARGS_END73_tree);

            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction579);
            reconfiguration_block74=reconfiguration_block();

            state._fsp--;

            adaptor.addChild(root_0, reconfiguration_block74.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:162:1: expression : union_expr ( OP_UNION union_expr )* ;
    public final RecParser.expression_return expression() throws RecognitionException {
        RecParser.expression_return retval = new RecParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_UNION76=null;
        RecParser.union_expr_return union_expr75 = null;

        RecParser.union_expr_return union_expr77 = null;


        Object OP_UNION76_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:163:2: ( union_expr ( OP_UNION union_expr )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:163:4: union_expr ( OP_UNION union_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_union_expr_in_expression593);
            union_expr75=union_expr();

            state._fsp--;

            adaptor.addChild(root_0, union_expr75.getTree());
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:163:15: ( OP_UNION union_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==OP_UNION) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:163:16: OP_UNION union_expr
            	    {
            	    OP_UNION76=(Token)match(input,OP_UNION,FOLLOW_OP_UNION_in_expression596); 
            	    OP_UNION76_tree = (Object)adaptor.create(OP_UNION76);
            	    adaptor.addChild(root_0, OP_UNION76_tree);

            	    pushFollow(FOLLOW_union_expr_in_expression598);
            	    union_expr77=union_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, union_expr77.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:166:1: union_expr : intersect_expr ( OP_INTERSECTION intersect_expr )* ;
    public final RecParser.union_expr_return union_expr() throws RecognitionException {
        RecParser.union_expr_return retval = new RecParser.union_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_INTERSECTION79=null;
        RecParser.intersect_expr_return intersect_expr78 = null;

        RecParser.intersect_expr_return intersect_expr80 = null;


        Object OP_INTERSECTION79_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:167:2: ( intersect_expr ( OP_INTERSECTION intersect_expr )* )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:167:4: intersect_expr ( OP_INTERSECTION intersect_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_intersect_expr_in_union_expr612);
            intersect_expr78=intersect_expr();

            state._fsp--;

            adaptor.addChild(root_0, intersect_expr78.getTree());
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:167:19: ( OP_INTERSECTION intersect_expr )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==OP_INTERSECTION) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:167:20: OP_INTERSECTION intersect_expr
            	    {
            	    OP_INTERSECTION79=(Token)match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_union_expr615); 
            	    OP_INTERSECTION79_tree = (Object)adaptor.create(OP_INTERSECTION79);
            	    adaptor.addChild(root_0, OP_INTERSECTION79_tree);

            	    pushFollow(FOLLOW_intersect_expr_in_union_expr617);
            	    intersect_expr80=intersect_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, intersect_expr80.getTree());

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
    // $ANTLR end "union_expr"

    public static class intersect_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "intersect_expr"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:170:1: intersect_expr : factor ( OP_MINUS factor )? ;
    public final RecParser.intersect_expr_return intersect_expr() throws RecognitionException {
        RecParser.intersect_expr_return retval = new RecParser.intersect_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_MINUS82=null;
        RecParser.factor_return factor81 = null;

        RecParser.factor_return factor83 = null;


        Object OP_MINUS82_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:171:2: ( factor ( OP_MINUS factor )? )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:171:4: factor ( OP_MINUS factor )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_intersect_expr631);
            factor81=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor81.getTree());
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:171:11: ( OP_MINUS factor )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==OP_MINUS) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:171:12: OP_MINUS factor
                    {
                    OP_MINUS82=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_intersect_expr634); 
                    OP_MINUS82_tree = (Object)adaptor.create(OP_MINUS82);
                    adaptor.addChild(root_0, OP_MINUS82_tree);

                    pushFollow(FOLLOW_factor_in_intersect_expr636);
                    factor83=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor83.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:175:1: factor : ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END | ID SEP_ACCESSOR ID | SEP_ACCESSOR ID | ID | single_return_operation | triple_cons | pair_cons | list_cons );
    public final RecParser.factor_return factor() throws RecognitionException {
        RecParser.factor_return retval = new RecParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID84=null;
        Token SEP_SUBTYPE_START85=null;
        Token ID86=null;
        Token SEP_SUBTYPE_END87=null;
        Token ID88=null;
        Token SEP_ACCESSOR89=null;
        Token ID90=null;
        Token SEP_ACCESSOR91=null;
        Token ID92=null;
        Token ID93=null;
        RecParser.single_return_operation_return single_return_operation94 = null;

        RecParser.triple_cons_return triple_cons95 = null;

        RecParser.pair_cons_return pair_cons96 = null;

        RecParser.list_cons_return list_cons97 = null;


        Object ID84_tree=null;
        Object SEP_SUBTYPE_START85_tree=null;
        Object ID86_tree=null;
        Object SEP_SUBTYPE_END87_tree=null;
        Object ID88_tree=null;
        Object SEP_ACCESSOR89_tree=null;
        Object ID90_tree=null;
        Object SEP_ACCESSOR91_tree=null;
        Object ID92_tree=null;
        Object ID93_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:176:2: ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END | ID SEP_ACCESSOR ID | SEP_ACCESSOR ID | ID | single_return_operation | triple_cons | pair_cons | list_cons )
            int alt20=8;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:176:4: ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END
                    {
                    root_0 = (Object)adaptor.nil();

                    ID84=(Token)match(input,ID,FOLLOW_ID_in_factor650); 
                    ID84_tree = (Object)adaptor.create(ID84);
                    adaptor.addChild(root_0, ID84_tree);

                    SEP_SUBTYPE_START85=(Token)match(input,SEP_SUBTYPE_START,FOLLOW_SEP_SUBTYPE_START_in_factor652); 
                    SEP_SUBTYPE_START85_tree = (Object)adaptor.create(SEP_SUBTYPE_START85);
                    adaptor.addChild(root_0, SEP_SUBTYPE_START85_tree);

                    ID86=(Token)match(input,ID,FOLLOW_ID_in_factor654); 
                    ID86_tree = (Object)adaptor.create(ID86);
                    adaptor.addChild(root_0, ID86_tree);

                    SEP_SUBTYPE_END87=(Token)match(input,SEP_SUBTYPE_END,FOLLOW_SEP_SUBTYPE_END_in_factor656); 
                    SEP_SUBTYPE_END87_tree = (Object)adaptor.create(SEP_SUBTYPE_END87);
                    adaptor.addChild(root_0, SEP_SUBTYPE_END87_tree);


                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:177:4: ID SEP_ACCESSOR ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID88=(Token)match(input,ID,FOLLOW_ID_in_factor661); 
                    ID88_tree = (Object)adaptor.create(ID88);
                    adaptor.addChild(root_0, ID88_tree);

                    SEP_ACCESSOR89=(Token)match(input,SEP_ACCESSOR,FOLLOW_SEP_ACCESSOR_in_factor663); 
                    SEP_ACCESSOR89_tree = (Object)adaptor.create(SEP_ACCESSOR89);
                    adaptor.addChild(root_0, SEP_ACCESSOR89_tree);

                    ID90=(Token)match(input,ID,FOLLOW_ID_in_factor665); 
                    ID90_tree = (Object)adaptor.create(ID90);
                    adaptor.addChild(root_0, ID90_tree);


                    }
                    break;
                case 3 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:178:4: SEP_ACCESSOR ID
                    {
                    root_0 = (Object)adaptor.nil();

                    SEP_ACCESSOR91=(Token)match(input,SEP_ACCESSOR,FOLLOW_SEP_ACCESSOR_in_factor671); 
                    SEP_ACCESSOR91_tree = (Object)adaptor.create(SEP_ACCESSOR91);
                    adaptor.addChild(root_0, SEP_ACCESSOR91_tree);

                    ID92=(Token)match(input,ID,FOLLOW_ID_in_factor673); 
                    ID92_tree = (Object)adaptor.create(ID92);
                    adaptor.addChild(root_0, ID92_tree);


                    }
                    break;
                case 4 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:179:4: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID93=(Token)match(input,ID,FOLLOW_ID_in_factor678); 
                    ID93_tree = (Object)adaptor.create(ID93);
                    adaptor.addChild(root_0, ID93_tree);


                    }
                    break;
                case 5 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:180:4: single_return_operation
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_single_return_operation_in_factor683);
                    single_return_operation94=single_return_operation();

                    state._fsp--;

                    adaptor.addChild(root_0, single_return_operation94.getTree());

                    }
                    break;
                case 6 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:181:4: triple_cons
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_triple_cons_in_factor688);
                    triple_cons95=triple_cons();

                    state._fsp--;

                    adaptor.addChild(root_0, triple_cons95.getTree());

                    }
                    break;
                case 7 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:182:4: pair_cons
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pair_cons_in_factor693);
                    pair_cons96=pair_cons();

                    state._fsp--;

                    adaptor.addChild(root_0, pair_cons96.getTree());

                    }
                    break;
                case 8 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:183:4: list_cons
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_cons_in_factor698);
                    list_cons97=list_cons();

                    state._fsp--;

                    adaptor.addChild(root_0, list_cons97.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:187:1: single_return_operation : ( OP_FST | OP_SND | OP_TRD ) operation_args ;
    public final RecParser.single_return_operation_return single_return_operation() throws RecognitionException {
        RecParser.single_return_operation_return retval = new RecParser.single_return_operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set98=null;
        RecParser.operation_args_return operation_args99 = null;


        Object set98_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:188:2: ( ( OP_FST | OP_SND | OP_TRD ) operation_args )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:188:5: ( OP_FST | OP_SND | OP_TRD ) operation_args
            {
            root_0 = (Object)adaptor.nil();

            set98=(Token)input.LT(1);
            if ( (input.LA(1)>=OP_FST && input.LA(1)<=OP_TRD) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set98));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            pushFollow(FOLLOW_operation_args_in_single_return_operation725);
            operation_args99=operation_args();

            state._fsp--;

            adaptor.addChild(root_0, operation_args99.getTree());

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

    public static class triple_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "triple_cons"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:192:1: triple_cons : CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END ;
    public final RecParser.triple_cons_return triple_cons() throws RecognitionException {
        RecParser.triple_cons_return retval = new RecParser.triple_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_TRIPLE100=null;
        Token SEP_ARGS_START101=null;
        Token SEP_COMMA103=null;
        Token SEP_COMMA105=null;
        Token SEP_ARGS_END107=null;
        RecParser.expression_return expression102 = null;

        RecParser.expression_return expression104 = null;

        RecParser.expression_return expression106 = null;


        Object CONS_TRIPLE100_tree=null;
        Object SEP_ARGS_START101_tree=null;
        Object SEP_COMMA103_tree=null;
        Object SEP_COMMA105_tree=null;
        Object SEP_ARGS_END107_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:193:2: ( CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:193:4: CONS_TRIPLE SEP_ARGS_START expression SEP_COMMA expression SEP_COMMA expression SEP_ARGS_END
            {
            root_0 = (Object)adaptor.nil();

            CONS_TRIPLE100=(Token)match(input,CONS_TRIPLE,FOLLOW_CONS_TRIPLE_in_triple_cons739); 
            CONS_TRIPLE100_tree = (Object)adaptor.create(CONS_TRIPLE100);
            adaptor.addChild(root_0, CONS_TRIPLE100_tree);

            SEP_ARGS_START101=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_triple_cons741); 
            SEP_ARGS_START101_tree = (Object)adaptor.create(SEP_ARGS_START101);
            adaptor.addChild(root_0, SEP_ARGS_START101_tree);

            pushFollow(FOLLOW_expression_in_triple_cons743);
            expression102=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression102.getTree());
            SEP_COMMA103=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons745); 
            SEP_COMMA103_tree = (Object)adaptor.create(SEP_COMMA103);
            adaptor.addChild(root_0, SEP_COMMA103_tree);

            pushFollow(FOLLOW_expression_in_triple_cons747);
            expression104=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression104.getTree());
            SEP_COMMA105=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_triple_cons749); 
            SEP_COMMA105_tree = (Object)adaptor.create(SEP_COMMA105);
            adaptor.addChild(root_0, SEP_COMMA105_tree);

            pushFollow(FOLLOW_expression_in_triple_cons751);
            expression106=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression106.getTree());
            SEP_ARGS_END107=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_triple_cons753); 
            SEP_ARGS_END107_tree = (Object)adaptor.create(SEP_ARGS_END107);
            adaptor.addChild(root_0, SEP_ARGS_END107_tree);


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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:197:1: pair_cons : CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END ;
    public final RecParser.pair_cons_return pair_cons() throws RecognitionException {
        RecParser.pair_cons_return retval = new RecParser.pair_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS_PAIR108=null;
        Token SEP_ARGS_START109=null;
        Token SEP_COMMA111=null;
        Token SEP_ARGS_END113=null;
        RecParser.expression_return expression110 = null;

        RecParser.expression_return expression112 = null;


        Object CONS_PAIR108_tree=null;
        Object SEP_ARGS_START109_tree=null;
        Object SEP_COMMA111_tree=null;
        Object SEP_ARGS_END113_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:198:2: ( CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:198:4: CONS_PAIR SEP_ARGS_START expression SEP_COMMA expression SEP_ARGS_END
            {
            root_0 = (Object)adaptor.nil();

            CONS_PAIR108=(Token)match(input,CONS_PAIR,FOLLOW_CONS_PAIR_in_pair_cons768); 
            CONS_PAIR108_tree = (Object)adaptor.create(CONS_PAIR108);
            adaptor.addChild(root_0, CONS_PAIR108_tree);

            SEP_ARGS_START109=(Token)match(input,SEP_ARGS_START,FOLLOW_SEP_ARGS_START_in_pair_cons770); 
            SEP_ARGS_START109_tree = (Object)adaptor.create(SEP_ARGS_START109);
            adaptor.addChild(root_0, SEP_ARGS_START109_tree);

            pushFollow(FOLLOW_expression_in_pair_cons772);
            expression110=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression110.getTree());
            SEP_COMMA111=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_pair_cons774); 
            SEP_COMMA111_tree = (Object)adaptor.create(SEP_COMMA111);
            adaptor.addChild(root_0, SEP_COMMA111_tree);

            pushFollow(FOLLOW_expression_in_pair_cons776);
            expression112=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression112.getTree());
            SEP_ARGS_END113=(Token)match(input,SEP_ARGS_END,FOLLOW_SEP_ARGS_END_in_pair_cons778); 
            SEP_ARGS_END113_tree = (Object)adaptor.create(SEP_ARGS_END113);
            adaptor.addChild(root_0, SEP_ARGS_END113_tree);


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

    public static class list_cons_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_cons"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:203:1: list_cons : SEP_LIST_START ( expression ( SEP_COMMA expression )* )? SEP_LIST_END ;
    public final RecParser.list_cons_return list_cons() throws RecognitionException {
        RecParser.list_cons_return retval = new RecParser.list_cons_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_LIST_START114=null;
        Token SEP_COMMA116=null;
        Token SEP_LIST_END118=null;
        RecParser.expression_return expression115 = null;

        RecParser.expression_return expression117 = null;


        Object SEP_LIST_START114_tree=null;
        Object SEP_COMMA116_tree=null;
        Object SEP_LIST_END118_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:204:2: ( SEP_LIST_START ( expression ( SEP_COMMA expression )* )? SEP_LIST_END )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:204:4: SEP_LIST_START ( expression ( SEP_COMMA expression )* )? SEP_LIST_END
            {
            root_0 = (Object)adaptor.nil();

            SEP_LIST_START114=(Token)match(input,SEP_LIST_START,FOLLOW_SEP_LIST_START_in_list_cons794); 
            SEP_LIST_START114_tree = (Object)adaptor.create(SEP_LIST_START114);
            adaptor.addChild(root_0, SEP_LIST_START114_tree);

            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:204:20: ( expression ( SEP_COMMA expression )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=OP_FST && LA22_0<=OP_TRD)||LA22_0==SEP_LIST_START||(LA22_0>=SEP_ACCESSOR && LA22_0<=ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:204:22: expression ( SEP_COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_list_cons799);
                    expression115=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression115.getTree());
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:204:33: ( SEP_COMMA expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==SEP_COMMA) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:204:34: SEP_COMMA expression
                    	    {
                    	    SEP_COMMA116=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_cons802); 
                    	    SEP_COMMA116_tree = (Object)adaptor.create(SEP_COMMA116);
                    	    adaptor.addChild(root_0, SEP_COMMA116_tree);

                    	    pushFollow(FOLLOW_expression_in_list_cons804);
                    	    expression117=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression117.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            SEP_LIST_END118=(Token)match(input,SEP_LIST_END,FOLLOW_SEP_LIST_END_in_list_cons811); 
            SEP_LIST_END118_tree = (Object)adaptor.create(SEP_LIST_END118);
            adaptor.addChild(root_0, SEP_LIST_END118_tree);


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
    // $ANTLR end "list_cons"

    public static class applicaiton_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "applicaiton_def"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:214:1: applicaiton_def : ID OP_APPLY list_reconfigurations ( trigger_def )? ;
    public final RecParser.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecParser.applicaiton_def_return retval = new RecParser.applicaiton_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID119=null;
        Token OP_APPLY120=null;
        RecParser.list_reconfigurations_return list_reconfigurations121 = null;

        RecParser.trigger_def_return trigger_def122 = null;


        Object ID119_tree=null;
        Object OP_APPLY120_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:215:2: ( ID OP_APPLY list_reconfigurations ( trigger_def )? )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:215:4: ID OP_APPLY list_reconfigurations ( trigger_def )?
            {
            root_0 = (Object)adaptor.nil();

            ID119=(Token)match(input,ID,FOLLOW_ID_in_applicaiton_def834); 
            ID119_tree = (Object)adaptor.create(ID119);
            adaptor.addChild(root_0, ID119_tree);

            OP_APPLY120=(Token)match(input,OP_APPLY,FOLLOW_OP_APPLY_in_applicaiton_def836); 
            OP_APPLY120_tree = (Object)adaptor.create(OP_APPLY120);
            adaptor.addChild(root_0, OP_APPLY120_tree);

            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def839);
            list_reconfigurations121=list_reconfigurations();

            state._fsp--;

            adaptor.addChild(root_0, list_reconfigurations121.getTree());
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:215:40: ( trigger_def )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==SEP_TRIGGER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:215:40: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def842);
                    trigger_def122=trigger_def();

                    state._fsp--;

                    adaptor.addChild(root_0, trigger_def122.getTree());

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
    // $ANTLR end "applicaiton_def"

    public static class list_reconfigurations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_reconfigurations"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:218:1: list_reconfigurations : ( SEP_BLOCK_START reconfiguration_call ( SEP_COMMA reconfiguration_call )* SEP_BLOCK_END | reconfiguration_call );
    public final RecParser.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecParser.list_reconfigurations_return retval = new RecParser.list_reconfigurations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START123=null;
        Token SEP_COMMA125=null;
        Token SEP_BLOCK_END127=null;
        RecParser.reconfiguration_call_return reconfiguration_call124 = null;

        RecParser.reconfiguration_call_return reconfiguration_call126 = null;

        RecParser.reconfiguration_call_return reconfiguration_call128 = null;


        Object SEP_BLOCK_START123_tree=null;
        Object SEP_COMMA125_tree=null;
        Object SEP_BLOCK_END127_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:219:2: ( SEP_BLOCK_START reconfiguration_call ( SEP_COMMA reconfiguration_call )* SEP_BLOCK_END | reconfiguration_call )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==SEP_BLOCK_START) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=OP_PAR && LA25_0<=OP_REMOVE)||LA25_0==ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:219:5: SEP_BLOCK_START reconfiguration_call ( SEP_COMMA reconfiguration_call )* SEP_BLOCK_END
                    {
                    root_0 = (Object)adaptor.nil();

                    SEP_BLOCK_START123=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_list_reconfigurations856); 
                    SEP_BLOCK_START123_tree = (Object)adaptor.create(SEP_BLOCK_START123);
                    adaptor.addChild(root_0, SEP_BLOCK_START123_tree);

                    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations858);
                    reconfiguration_call124=reconfiguration_call();

                    state._fsp--;

                    adaptor.addChild(root_0, reconfiguration_call124.getTree());
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:219:42: ( SEP_COMMA reconfiguration_call )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==SEP_COMMA) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:219:43: SEP_COMMA reconfiguration_call
                    	    {
                    	    SEP_COMMA125=(Token)match(input,SEP_COMMA,FOLLOW_SEP_COMMA_in_list_reconfigurations861); 
                    	    SEP_COMMA125_tree = (Object)adaptor.create(SEP_COMMA125);
                    	    adaptor.addChild(root_0, SEP_COMMA125_tree);

                    	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations863);
                    	    reconfiguration_call126=reconfiguration_call();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, reconfiguration_call126.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    SEP_BLOCK_END127=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_list_reconfigurations867); 
                    SEP_BLOCK_END127_tree = (Object)adaptor.create(SEP_BLOCK_END127);
                    adaptor.addChild(root_0, SEP_BLOCK_END127_tree);


                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:220:4: reconfiguration_call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations872);
                    reconfiguration_call128=reconfiguration_call();

                    state._fsp--;

                    adaptor.addChild(root_0, reconfiguration_call128.getTree());

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
    // $ANTLR end "list_reconfigurations"

    public static class trigger_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "trigger_def"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:223:1: trigger_def : SEP_TRIGGER trigger_block ;
    public final RecParser.trigger_def_return trigger_def() throws RecognitionException {
        RecParser.trigger_def_return retval = new RecParser.trigger_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_TRIGGER129=null;
        RecParser.trigger_block_return trigger_block130 = null;


        Object SEP_TRIGGER129_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:224:2: ( SEP_TRIGGER trigger_block )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:224:4: SEP_TRIGGER trigger_block
            {
            root_0 = (Object)adaptor.nil();

            SEP_TRIGGER129=(Token)match(input,SEP_TRIGGER,FOLLOW_SEP_TRIGGER_in_trigger_def884); 
            SEP_TRIGGER129_tree = (Object)adaptor.create(SEP_TRIGGER129);
            adaptor.addChild(root_0, SEP_TRIGGER129_tree);

            pushFollow(FOLLOW_trigger_block_in_trigger_def886);
            trigger_block130=trigger_block();

            state._fsp--;

            adaptor.addChild(root_0, trigger_block130.getTree());

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:227:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecParser.trigger_block_return trigger_block() throws RecognitionException {
        RecParser.trigger_block_return retval = new RecParser.trigger_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEP_BLOCK_START131=null;
        Token SEP_BLOCK_END132=null;

        Object SEP_BLOCK_START131_tree=null;
        Object SEP_BLOCK_END132_tree=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:228:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/RecParser.g:228:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            root_0 = (Object)adaptor.nil();

            SEP_BLOCK_START131=(Token)match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block898); 
            SEP_BLOCK_START131_tree = (Object)adaptor.create(SEP_BLOCK_START131);
            adaptor.addChild(root_0, SEP_BLOCK_START131_tree);

            SEP_BLOCK_END132=(Token)match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block900); 
            SEP_BLOCK_END132_tree = (Object)adaptor.create(SEP_BLOCK_END132);
            adaptor.addChild(root_0, SEP_BLOCK_END132_tree);


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


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\12\uffff";
    static final String DFA20_eofS =
        "\12\uffff";
    static final String DFA20_minS =
        "\1\24\1\30\10\uffff";
    static final String DFA20_maxS =
        "\1\54\1\51\10\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\1\5\1\6\1\7\1\10\1\1\1\2\1\4";
    static final String DFA20_specialS =
        "\12\uffff}>";
    static final String[] DFA20_transitionS = {
            "\3\3\16\uffff\1\6\3\uffff\1\2\1\5\1\4\1\1",
            "\3\11\3\uffff\2\11\2\uffff\2\11\2\uffff\1\11\1\7\1\uffff\1"+
            "\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "175:1: factor : ( ID SEP_SUBTYPE_START ID SEP_SUBTYPE_END | ID SEP_ACCESSOR ID | SEP_ACCESSOR ID | ID | single_return_operation | triple_cons | pair_cons | list_cons );";
        }
    }
 

    public static final BitSet FOLLOW_directive_def_in_reclang75 = new BitSet(new long[]{0x0000100000000052L});
    public static final BitSet FOLLOW_element_in_reclang78 = new BitSet(new long[]{0x0000100000000012L});
    public static final BitSet FOLLOW_directive_import_in_directive_def107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_IMPORT_in_directive_import127 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_directive_import129 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_directive_import131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_applicaiton_def_in_element172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_RECONFIGURATION_in_reconfiguration_def195 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def197 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_reconfiguration_def199 = new BitSet(new long[]{0x0000000C00003F80L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def201 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_SEP_OPTIONAL_in_reconfiguration_def205 = new BitSet(new long[]{0x0000000000003F80L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def207 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_reconfiguration_def211 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_args_def224 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_list_ids_in_args_def226 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_args_def229 = new BitSet(new long[]{0x0000000000003F80L});
    public static final BitSet FOLLOW_datatype_in_args_def231 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_list_ids_in_args_def233 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype259 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_datatype262 = new BitSet(new long[]{0x0000000000003F80L});
    public static final BitSet FOLLOW_subtype_in_datatype264 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_datatype266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids319 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_ids322 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_list_ids324 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_reconfiguration_block341 = new BitSet(new long[]{0x00001000008C3FA0L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block343 = new BitSet(new long[]{0x00001000208C3FA0L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_reconfiguration_block346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_instruction358 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignement_in_instruction365 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structure_operation_call_in_instruction372 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_instruction379 = new BitSet(new long[]{0x000010000003C000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_instruction381 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SEP_SEMICOLON_in_instruction383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_declaration401 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration403 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_declaration406 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_var_def_in_declaration408 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ID_in_var_def422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignement_in_var_def427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignement440 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_OP_EQUAL_in_assignement442 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_assignement444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reconfiguration_call458 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_structure_operation_call496 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_operation_args520 = new BitSet(new long[]{0x00001E2C00700000L});
    public static final BitSet FOLLOW_args_in_operation_args522 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_SEP_OPTIONAL_in_operation_args526 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_args_in_operation_args528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_operation_args532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args545 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_SEP_COMMA_in_args548 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_args550 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RW_FORALL_in_for_instruction565 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_for_instruction567 = new BitSet(new long[]{0x0000000000003F80L});
    public static final BitSet FOLLOW_datatype_in_for_instruction569 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction571 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_SEP_COLON_in_for_instruction573 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction575 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_for_instruction577 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_union_expr_in_expression593 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_OP_UNION_in_expression596 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_union_expr_in_expression598 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_intersect_expr_in_union_expr612 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_union_expr615 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_intersect_expr_in_union_expr617 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_factor_in_intersect_expr631 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_OP_MINUS_in_intersect_expr634 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_factor_in_intersect_expr636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor650 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_START_in_factor652 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_factor654 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_SEP_SUBTYPE_END_in_factor656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor661 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_ACCESSOR_in_factor663 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_factor665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_ACCESSOR_in_factor671 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ID_in_factor673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_return_operation_in_factor683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_factor688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_factor693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_cons_in_factor698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_single_return_operation711 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_operation_args_in_single_return_operation725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_TRIPLE_in_triple_cons739 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_triple_cons741 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_triple_cons743 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons745 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_triple_cons747 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_triple_cons749 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_triple_cons751 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_triple_cons753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONS_PAIR_in_pair_cons768 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEP_ARGS_START_in_pair_cons770 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_pair_cons772 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_pair_cons774 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_pair_cons776 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_SEP_ARGS_END_in_pair_cons778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_LIST_START_in_list_cons794 = new BitSet(new long[]{0x00001E6000700000L});
    public static final BitSet FOLLOW_expression_in_list_cons799 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_cons802 = new BitSet(new long[]{0x00001E2000700000L});
    public static final BitSet FOLLOW_expression_in_list_cons804 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_SEP_LIST_END_in_list_cons811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def834 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_OP_APPLY_in_applicaiton_def836 = new BitSet(new long[]{0x000010001003C000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def839 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_list_reconfigurations856 = new BitSet(new long[]{0x000010000003C000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations858 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEP_COMMA_in_list_reconfigurations861 = new BitSet(new long[]{0x000010000003C000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations863 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_list_reconfigurations867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_TRIGGER_in_trigger_def884 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block898 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block900 = new BitSet(new long[]{0x0000000000000002L});

}