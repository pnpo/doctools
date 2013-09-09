// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g 2013-04-11 01:51:07

	package pt.uminho.di.reolang;
	import java.text.*;
	import java.util.Date;
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.ErrorType;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ReoLangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_REMAINING", "RW_JOIN", "RW_AS", "RW_OF", "RW_USE", "RW_IN", "RW_NULL", "RW_PATTERN", "RW_EXTENDS", "RW_FLOW", "RW_TO", "RW_OBSERVERS", "RW_STATE", "RW_CHANNEL", "RW_IMPORT", "LIST_OPEN", "LIST_CLOSE", "EQUALS", "SEMICOLON", "COMMA", "COLON", "PORTS_OPEN", "PORTS_CLOSE", "BODY_OPEN", "BODY_CLOSE", "ACCESS_MARK", "QUESTION_MARK", "NOT_MARK", "ARROW_MARK", "LABEL_MARK", "STRUCTURE_MARK", "TIME_MARK", "OP_SYNC", "COND_OPEN", "COND_CLOSE", "STRING", "FILE_PATH", "ID", "INT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "REO_LANG", "ELEMENT", "DIRECTIVE", "IMPORT", "CHANNEL", "SIGNATURE", "OPTION", "TIMED", "TIME", "STRUCTURED", "DIMENSION", "CHANNEL_PORTS", "IN_PORTS", "OUT_PORTS", "PORT", "CONDITION", "COND_ELEMENTS", "EXTENSION", "CHANNEL_BODY", "FLOWS", "CHANNEL_STATE", "STATE_REF", "STATE_OBS", "FLOW", "REQUESTS", "REQUEST", "FLOW_TYPE", "NORMAL_FLOW", "FLOW_POINT", "FLOW_OP", "IF_FLOW", "FLOW_TRUE", "FLOW_FALSE", "PATTERN", "PATTERN_SIGNATURE", "PATTERN_PORTS", "PATTERN_BODY", "PATTERN_DECLARATIONS", "DECLARATION", "INSTANCES", "DECLARATION_TYPE", "PATTERN_COMPOSITIONS", "PORT_DEFINITION", "PORT_ACTUAL_DEFINITION", "PORT_ACCESS", "JOIN_OP", "PORT_ACCESS_LIST", "STOCH"
    };
    public static final int PATTERN_PORTS=85;
    public static final int IN_PORTS=62;
    public static final int PORT_ACTUAL_DEFINITION=93;
    public static final int INSTANCES=89;
    public static final int STOCH=97;
    public static final int OCTAL_ESC=49;
    public static final int CONDITION=65;
    public static final int EQUALS=21;
    public static final int RW_USE=8;
    public static final int RW_FLOW=13;
    public static final int FLOW_TYPE=76;
    public static final int PATTERN_DECLARATIONS=87;
    public static final int EOF=-1;
    public static final int RW_CHANNEL=17;
    public static final int PATTERN_COMPOSITIONS=91;
    public static final int PATTERN=83;
    public static final int ARROW_MARK=32;
    public static final int IMPORT=53;
    public static final int RW_TO=14;
    public static final int COND_OPEN=37;
    public static final int ACCESS_MARK=29;
    public static final int RW_JOIN=5;
    public static final int STRUCTURED=59;
    public static final int FLOWS=69;
    public static final int RW_NULL=10;
    public static final int QUESTION_MARK=30;
    public static final int ELEMENT=51;
    public static final int CHANNEL=54;
    public static final int DIMENSION=60;
    public static final int COND_ELEMENTS=66;
    public static final int FLOW_TRUE=81;
    public static final int RW_EXTENDS=12;
    public static final int LIST_OPEN=19;
    public static final int COMMENT=44;
    public static final int PORTS_OPEN=25;
    public static final int REO_LANG=50;
    public static final int BODY_OPEN=27;
    public static final int REQUESTS=74;
    public static final int IF_FLOW=80;
    public static final int PATTERN_BODY=86;
    public static final int INT=42;
    public static final int SEMICOLON=22;
    public static final int SIGNATURE=55;
    public static final int WS=45;
    public static final int NOT_MARK=31;
    public static final int FLOW=73;
    public static final int FLOW_FALSE=82;
    public static final int STRUCTURE_MARK=34;
    public static final int BODY_CLOSE=28;
    public static final int NORMAL_FLOW=77;
    public static final int OPTION=56;
    public static final int RW_PATTERN=11;
    public static final int RW_OF=7;
    public static final int DECLARATION_TYPE=90;
    public static final int PORTS_CLOSE=26;
    public static final int FLOAT=43;
    public static final int ID=41;
    public static final int DIRECTIVE=52;
    public static final int DECLARATION=88;
    public static final int LABEL_MARK=33;
    public static final int TIME=58;
    public static final int ESC_SEQ=46;
    public static final int COMMA=23;
    public static final int CHANNEL_STATE=70;
    public static final int RW_IMPORT=18;
    public static final int RW_OBSERVERS=15;
    public static final int COND_CLOSE=38;
    public static final int PORT_DEFINITION=92;
    public static final int TIMED=57;
    public static final int UNICODE_ESC=48;
    public static final int HEX_DIGIT=47;
    public static final int PORT=64;
    public static final int TIME_MARK=35;
    public static final int RW_AS=6;
    public static final int STATE_REF=71;
    public static final int OP_SYNC=36;
    public static final int RW_REMAINING=4;
    public static final int CHANNEL_BODY=68;
    public static final int LIST_CLOSE=20;
    public static final int JOIN_OP=95;
    public static final int CHANNEL_PORTS=61;
    public static final int FLOW_OP=79;
    public static final int COLON=24;
    public static final int OUT_PORTS=63;
    public static final int PATTERN_SIGNATURE=84;
    public static final int REQUEST=75;
    public static final int RW_STATE=16;
    public static final int STATE_OBS=72;
    public static final int PORT_ACCESS_LIST=96;
    public static final int FLOW_POINT=78;
    public static final int RW_IN=9;
    public static final int PORT_ACCESS=94;
    public static final int EXTENSION=67;
    public static final int FILE_PATH=40;
    public static final int STRING=39;

    // delegates
    // delegators


        public ReoLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ReoLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ReoLangParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g"; }


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


    public static class reolang_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reolang"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:94:1: reolang : ( directive_def )* ( element )* -> ^( REO_LANG ( directive_def )* ( element )* ) ;
    public final ReoLangParser.reolang_return reolang() throws RecognitionException {
        ReoLangParser.reolang_return retval = new ReoLangParser.reolang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.directive_def_return directive_def1 = null;

        ReoLangParser.element_return element2 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        RewriteRuleSubtreeStream stream_directive_def=new RewriteRuleSubtreeStream(adaptor,"rule directive_def");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:2: ( ( directive_def )* ( element )* -> ^( REO_LANG ( directive_def )* ( element )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:4: ( directive_def )* ( element )*
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:4: ( directive_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RW_IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:4: directive_def
            	    {
            	    pushFollow(FOLLOW_directive_def_in_reolang251);
            	    directive_def1=directive_def();

            	    state._fsp--;

            	    stream_directive_def.add(directive_def1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:19: ( element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RW_PATTERN||LA2_0==RW_CHANNEL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:19: element
            	    {
            	    pushFollow(FOLLOW_element_in_reolang254);
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
            // 95:28: -> ^( REO_LANG ( directive_def )* ( element )* )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:31: ^( REO_LANG ( directive_def )* ( element )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REO_LANG, "REO_LANG"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:42: ( directive_def )*
                while ( stream_directive_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_directive_def.nextTree());

                }
                stream_directive_def.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:95:57: ( element )*
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
    // $ANTLR end "reolang"

    public static class element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:98:1: element : ( channel_def -> ^( ELEMENT channel_def ) | pattern_def -> ^( ELEMENT pattern_def ) );
    public final ReoLangParser.element_return element() throws RecognitionException {
        ReoLangParser.element_return retval = new ReoLangParser.element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.channel_def_return channel_def3 = null;

        ReoLangParser.pattern_def_return pattern_def4 = null;


        RewriteRuleSubtreeStream stream_channel_def=new RewriteRuleSubtreeStream(adaptor,"rule channel_def");
        RewriteRuleSubtreeStream stream_pattern_def=new RewriteRuleSubtreeStream(adaptor,"rule pattern_def");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:99:2: ( channel_def -> ^( ELEMENT channel_def ) | pattern_def -> ^( ELEMENT pattern_def ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RW_CHANNEL) ) {
                alt3=1;
            }
            else if ( (LA3_0==RW_PATTERN) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:99:4: channel_def
                    {
                    pushFollow(FOLLOW_channel_def_in_element279);
                    channel_def3=channel_def();

                    state._fsp--;

                    stream_channel_def.add(channel_def3.getTree());


                    // AST REWRITE
                    // elements: channel_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 99:17: -> ^( ELEMENT channel_def )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:99:20: ^( ELEMENT channel_def )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELEMENT, "ELEMENT"), root_1);

                        adaptor.addChild(root_1, stream_channel_def.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:100:4: pattern_def
                    {
                    pushFollow(FOLLOW_pattern_def_in_element293);
                    pattern_def4=pattern_def();

                    state._fsp--;

                    stream_pattern_def.add(pattern_def4.getTree());


                    // AST REWRITE
                    // elements: pattern_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:17: -> ^( ELEMENT pattern_def )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:100:20: ^( ELEMENT pattern_def )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELEMENT, "ELEMENT"), root_1);

                        adaptor.addChild(root_1, stream_pattern_def.nextTree());

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

    public static class directive_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:107:1: directive_def : directive_import -> ^( DIRECTIVE directive_import ) ;
    public final ReoLangParser.directive_def_return directive_def() throws RecognitionException {
        ReoLangParser.directive_def_return retval = new ReoLangParser.directive_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.directive_import_return directive_import5 = null;


        RewriteRuleSubtreeStream stream_directive_import=new RewriteRuleSubtreeStream(adaptor,"rule directive_import");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:108:2: ( directive_import -> ^( DIRECTIVE directive_import ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:108:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def317);
            directive_import5=directive_import();

            state._fsp--;

            stream_directive_import.add(directive_import5.getTree());


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
            // 108:21: -> ^( DIRECTIVE directive_import )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:108:24: ^( DIRECTIVE directive_import )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIRECTIVE, "DIRECTIVE"), root_1);

                adaptor.addChild(root_1, stream_directive_import.nextTree());

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
    // $ANTLR end "directive_def"

    public static class directive_import_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive_import"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:112:1: directive_import : RW_IMPORT FILE_PATH SEMICOLON -> ^( IMPORT FILE_PATH ) ;
    public final ReoLangParser.directive_import_return directive_import() throws RecognitionException {
        ReoLangParser.directive_import_return retval = new ReoLangParser.directive_import_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_IMPORT6=null;
        Token FILE_PATH7=null;
        Token SEMICOLON8=null;

        Object RW_IMPORT6_tree=null;
        Object FILE_PATH7_tree=null;
        Object SEMICOLON8_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RW_IMPORT=new RewriteRuleTokenStream(adaptor,"token RW_IMPORT");
        RewriteRuleTokenStream stream_FILE_PATH=new RewriteRuleTokenStream(adaptor,"token FILE_PATH");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:113:2: ( RW_IMPORT FILE_PATH SEMICOLON -> ^( IMPORT FILE_PATH ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:113:4: RW_IMPORT FILE_PATH SEMICOLON
            {
            RW_IMPORT6=(Token)match(input,RW_IMPORT,FOLLOW_RW_IMPORT_in_directive_import338);  
            stream_RW_IMPORT.add(RW_IMPORT6);

            FILE_PATH7=(Token)match(input,FILE_PATH,FOLLOW_FILE_PATH_in_directive_import340);  
            stream_FILE_PATH.add(FILE_PATH7);

            SEMICOLON8=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_directive_import342);  
            stream_SEMICOLON.add(SEMICOLON8);



            // AST REWRITE
            // elements: FILE_PATH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:34: -> ^( IMPORT FILE_PATH )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:113:37: ^( IMPORT FILE_PATH )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPORT, "IMPORT"), root_1);

                adaptor.addChild(root_1, stream_FILE_PATH.nextNode());

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

    public static class channel_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "channel_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:127:1: channel_def : RW_CHANNEL channel_signature ( extension )? BODY_OPEN channel_body BODY_CLOSE -> ^( CHANNEL channel_signature ( extension )? channel_body ) ;
    public final ReoLangParser.channel_def_return channel_def() throws RecognitionException {
        ReoLangParser.channel_def_return retval = new ReoLangParser.channel_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_CHANNEL9=null;
        Token BODY_OPEN12=null;
        Token BODY_CLOSE14=null;
        ReoLangParser.channel_signature_return channel_signature10 = null;

        ReoLangParser.extension_return extension11 = null;

        ReoLangParser.channel_body_return channel_body13 = null;


        Object RW_CHANNEL9_tree=null;
        Object BODY_OPEN12_tree=null;
        Object BODY_CLOSE14_tree=null;
        RewriteRuleTokenStream stream_BODY_OPEN=new RewriteRuleTokenStream(adaptor,"token BODY_OPEN");
        RewriteRuleTokenStream stream_RW_CHANNEL=new RewriteRuleTokenStream(adaptor,"token RW_CHANNEL");
        RewriteRuleTokenStream stream_BODY_CLOSE=new RewriteRuleTokenStream(adaptor,"token BODY_CLOSE");
        RewriteRuleSubtreeStream stream_extension=new RewriteRuleSubtreeStream(adaptor,"rule extension");
        RewriteRuleSubtreeStream stream_channel_body=new RewriteRuleSubtreeStream(adaptor,"rule channel_body");
        RewriteRuleSubtreeStream stream_channel_signature=new RewriteRuleSubtreeStream(adaptor,"rule channel_signature");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:128:2: ( RW_CHANNEL channel_signature ( extension )? BODY_OPEN channel_body BODY_CLOSE -> ^( CHANNEL channel_signature ( extension )? channel_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:128:4: RW_CHANNEL channel_signature ( extension )? BODY_OPEN channel_body BODY_CLOSE
            {
            RW_CHANNEL9=(Token)match(input,RW_CHANNEL,FOLLOW_RW_CHANNEL_in_channel_def373);  
            stream_RW_CHANNEL.add(RW_CHANNEL9);

            pushFollow(FOLLOW_channel_signature_in_channel_def375);
            channel_signature10=channel_signature();

            state._fsp--;

            stream_channel_signature.add(channel_signature10.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:128:33: ( extension )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RW_EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:128:33: extension
                    {
                    pushFollow(FOLLOW_extension_in_channel_def377);
                    extension11=extension();

                    state._fsp--;

                    stream_extension.add(extension11.getTree());

                    }
                    break;

            }

            BODY_OPEN12=(Token)match(input,BODY_OPEN,FOLLOW_BODY_OPEN_in_channel_def380);  
            stream_BODY_OPEN.add(BODY_OPEN12);

            pushFollow(FOLLOW_channel_body_in_channel_def382);
            channel_body13=channel_body();

            state._fsp--;

            stream_channel_body.add(channel_body13.getTree());
            BODY_CLOSE14=(Token)match(input,BODY_CLOSE,FOLLOW_BODY_CLOSE_in_channel_def384);  
            stream_BODY_CLOSE.add(BODY_CLOSE14);



            // AST REWRITE
            // elements: channel_signature, extension, channel_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:3: -> ^( CHANNEL channel_signature ( extension )? channel_body )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:129:6: ^( CHANNEL channel_signature ( extension )? channel_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL, "CHANNEL"), root_1);

                adaptor.addChild(root_1, stream_channel_signature.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:129:34: ( extension )?
                if ( stream_extension.hasNext() ) {
                    adaptor.addChild(root_1, stream_extension.nextTree());

                }
                stream_extension.reset();
                adaptor.addChild(root_1, stream_channel_body.nextTree());

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
    // $ANTLR end "channel_def"

    public static class channel_signature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "channel_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:134:1: channel_signature : ID ( option )? PORTS_OPEN (in= ports )? COLON (out= ports )? ( COLON ID EQUALS condition )? PORTS_CLOSE -> ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? ) ;
    public final ReoLangParser.channel_signature_return channel_signature() throws RecognitionException {
        ReoLangParser.channel_signature_return retval = new ReoLangParser.channel_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID15=null;
        Token PORTS_OPEN17=null;
        Token COLON18=null;
        Token COLON19=null;
        Token ID20=null;
        Token EQUALS21=null;
        Token PORTS_CLOSE23=null;
        ReoLangParser.ports_return in = null;

        ReoLangParser.ports_return out = null;

        ReoLangParser.option_return option16 = null;

        ReoLangParser.condition_return condition22 = null;


        Object ID15_tree=null;
        Object PORTS_OPEN17_tree=null;
        Object COLON18_tree=null;
        Object COLON19_tree=null;
        Object ID20_tree=null;
        Object EQUALS21_tree=null;
        Object PORTS_CLOSE23_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PORTS_OPEN=new RewriteRuleTokenStream(adaptor,"token PORTS_OPEN");
        RewriteRuleTokenStream stream_PORTS_CLOSE=new RewriteRuleTokenStream(adaptor,"token PORTS_CLOSE");
        RewriteRuleSubtreeStream stream_ports=new RewriteRuleSubtreeStream(adaptor,"rule ports");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:2: ( ID ( option )? PORTS_OPEN (in= ports )? COLON (out= ports )? ( COLON ID EQUALS condition )? PORTS_CLOSE -> ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:4: ID ( option )? PORTS_OPEN (in= ports )? COLON (out= ports )? ( COLON ID EQUALS condition )? PORTS_CLOSE
            {
            ID15=(Token)match(input,ID,FOLLOW_ID_in_channel_signature414);  
            stream_ID.add(ID15);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:7: ( option )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=STRUCTURE_MARK && LA5_0<=TIME_MARK)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:7: option
                    {
                    pushFollow(FOLLOW_option_in_channel_signature416);
                    option16=option();

                    state._fsp--;

                    stream_option.add(option16.getTree());

                    }
                    break;

            }

            PORTS_OPEN17=(Token)match(input,PORTS_OPEN,FOLLOW_PORTS_OPEN_in_channel_signature419);  
            stream_PORTS_OPEN.add(PORTS_OPEN17);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:28: (in= ports )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:28: in= ports
                    {
                    pushFollow(FOLLOW_ports_in_channel_signature423);
                    in=ports();

                    state._fsp--;

                    stream_ports.add(in.getTree());

                    }
                    break;

            }

            COLON18=(Token)match(input,COLON,FOLLOW_COLON_in_channel_signature426);  
            stream_COLON.add(COLON18);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:45: (out= ports )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:45: out= ports
                    {
                    pushFollow(FOLLOW_ports_in_channel_signature430);
                    out=ports();

                    state._fsp--;

                    stream_ports.add(out.getTree());

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:53: ( COLON ID EQUALS condition )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==COLON) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:135:54: COLON ID EQUALS condition
                    {
                    COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_channel_signature434);  
                    stream_COLON.add(COLON19);

                    ID20=(Token)match(input,ID,FOLLOW_ID_in_channel_signature436);  
                    stream_ID.add(ID20);

                    EQUALS21=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_channel_signature438);  
                    stream_EQUALS.add(EQUALS21);

                    pushFollow(FOLLOW_condition_in_channel_signature440);
                    condition22=condition();

                    state._fsp--;

                    stream_condition.add(condition22.getTree());

                    }
                    break;

            }

            PORTS_CLOSE23=(Token)match(input,PORTS_CLOSE,FOLLOW_PORTS_CLOSE_in_channel_signature444);  
            stream_PORTS_CLOSE.add(PORTS_CLOSE23);



            // AST REWRITE
            // elements: in, option, ID, ID, condition, out
            // token labels: 
            // rule labels: retval, in, out
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_in=new RewriteRuleSubtreeStream(adaptor,"rule in",in!=null?in.tree:null);
            RewriteRuleSubtreeStream stream_out=new RewriteRuleSubtreeStream(adaptor,"rule out",out!=null?out.tree:null);

            root_0 = (Object)adaptor.nil();
            // 136:3: -> ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:6: ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIGNATURE, "SIGNATURE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:21: ( option )?
                if ( stream_option.hasNext() ) {
                    adaptor.addChild(root_1, stream_option.nextTree());

                }
                stream_option.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:29: ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL_PORTS, "CHANNEL_PORTS"), root_2);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:45: ( ^( IN_PORTS $in) )?
                if ( stream_in.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:46: ^( IN_PORTS $in)
                    {
                    Object root_3 = (Object)adaptor.nil();
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_PORTS, "IN_PORTS"), root_3);

                    adaptor.addChild(root_3, stream_in.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_in.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:64: ( ^( OUT_PORTS $out) )?
                if ( stream_out.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:65: ^( OUT_PORTS $out)
                    {
                    Object root_3 = (Object)adaptor.nil();
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUT_PORTS, "OUT_PORTS"), root_3);

                    adaptor.addChild(root_3, stream_out.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_out.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:86: ( ^( CONDITION ID condition ) )?
                if ( stream_ID.hasNext()||stream_condition.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:136:87: ^( CONDITION ID condition )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                    adaptor.addChild(root_2, stream_ID.nextNode());
                    adaptor.addChild(root_2, stream_condition.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_ID.reset();
                stream_condition.reset();

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
    // $ANTLR end "channel_signature"

    public static class option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:140:1: option : ( timed -> ^( OPTION timed ) | structured -> ^( OPTION structured ) );
    public final ReoLangParser.option_return option() throws RecognitionException {
        ReoLangParser.option_return retval = new ReoLangParser.option_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.timed_return timed24 = null;

        ReoLangParser.structured_return structured25 = null;


        RewriteRuleSubtreeStream stream_timed=new RewriteRuleSubtreeStream(adaptor,"rule timed");
        RewriteRuleSubtreeStream stream_structured=new RewriteRuleSubtreeStream(adaptor,"rule structured");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:141:2: ( timed -> ^( OPTION timed ) | structured -> ^( OPTION structured ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==TIME_MARK) ) {
                alt9=1;
            }
            else if ( (LA9_0==STRUCTURE_MARK) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:141:4: timed
                    {
                    pushFollow(FOLLOW_timed_in_option504);
                    timed24=timed();

                    state._fsp--;

                    stream_timed.add(timed24.getTree());


                    // AST REWRITE
                    // elements: timed
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 141:11: -> ^( OPTION timed )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:141:14: ^( OPTION timed )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_timed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:142:4: structured
                    {
                    pushFollow(FOLLOW_structured_in_option518);
                    structured25=structured();

                    state._fsp--;

                    stream_structured.add(structured25.getTree());


                    // AST REWRITE
                    // elements: structured
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:15: -> ^( OPTION structured )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:142:18: ^( OPTION structured )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_structured.nextTree());

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
    // $ANTLR end "option"

    public static class timed_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timed"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:146:1: timed : TIME_MARK time -> ^( TIMED time ) ;
    public final ReoLangParser.timed_return timed() throws RecognitionException {
        ReoLangParser.timed_return retval = new ReoLangParser.timed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TIME_MARK26=null;
        ReoLangParser.time_return time27 = null;


        Object TIME_MARK26_tree=null;
        RewriteRuleTokenStream stream_TIME_MARK=new RewriteRuleTokenStream(adaptor,"token TIME_MARK");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:147:2: ( TIME_MARK time -> ^( TIMED time ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:147:4: TIME_MARK time
            {
            TIME_MARK26=(Token)match(input,TIME_MARK,FOLLOW_TIME_MARK_in_timed538);  
            stream_TIME_MARK.add(TIME_MARK26);

            pushFollow(FOLLOW_time_in_timed540);
            time27=time();

            state._fsp--;

            stream_time.add(time27.getTree());


            // AST REWRITE
            // elements: time
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 148:3: -> ^( TIMED time )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:148:6: ^( TIMED time )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIMED, "TIMED"), root_1);

                adaptor.addChild(root_1, stream_time.nextTree());

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
    // $ANTLR end "timed"

    public static class time_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:152:1: time : ( ID -> ^( TIME ID ) | INT -> ^( TIME INT ) );
    public final ReoLangParser.time_return time() throws RecognitionException {
        ReoLangParser.time_return retval = new ReoLangParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID28=null;
        Token INT29=null;

        Object ID28_tree=null;
        Object INT29_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:153:2: ( ID -> ^( TIME ID ) | INT -> ^( TIME INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:153:4: ID
                    {
                    ID28=(Token)match(input,ID,FOLLOW_ID_in_time563);  
                    stream_ID.add(ID28);



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
                    // 153:11: -> ^( TIME ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:153:14: ^( TIME ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:154:4: INT
                    {
                    INT29=(Token)match(input,INT,FOLLOW_INT_in_time580);  
                    stream_INT.add(INT29);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:11: -> ^( TIME INT )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:154:14: ^( TIME INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIME, "TIME"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

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
    // $ANTLR end "time"

    public static class structured_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structured"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:158:1: structured : STRUCTURE_MARK structure_dimension ( COMMA structure_dimension )* -> ^( STRUCTURED ( structure_dimension )+ ) ;
    public final ReoLangParser.structured_return structured() throws RecognitionException {
        ReoLangParser.structured_return retval = new ReoLangParser.structured_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRUCTURE_MARK30=null;
        Token COMMA32=null;
        ReoLangParser.structure_dimension_return structure_dimension31 = null;

        ReoLangParser.structure_dimension_return structure_dimension33 = null;


        Object STRUCTURE_MARK30_tree=null;
        Object COMMA32_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_STRUCTURE_MARK=new RewriteRuleTokenStream(adaptor,"token STRUCTURE_MARK");
        RewriteRuleSubtreeStream stream_structure_dimension=new RewriteRuleSubtreeStream(adaptor,"rule structure_dimension");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:159:2: ( STRUCTURE_MARK structure_dimension ( COMMA structure_dimension )* -> ^( STRUCTURED ( structure_dimension )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:159:4: STRUCTURE_MARK structure_dimension ( COMMA structure_dimension )*
            {
            STRUCTURE_MARK30=(Token)match(input,STRUCTURE_MARK,FOLLOW_STRUCTURE_MARK_in_structured604);  
            stream_STRUCTURE_MARK.add(STRUCTURE_MARK30);

            pushFollow(FOLLOW_structure_dimension_in_structured606);
            structure_dimension31=structure_dimension();

            state._fsp--;

            stream_structure_dimension.add(structure_dimension31.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:159:39: ( COMMA structure_dimension )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:159:40: COMMA structure_dimension
            	    {
            	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_structured609);  
            	    stream_COMMA.add(COMMA32);

            	    pushFollow(FOLLOW_structure_dimension_in_structured611);
            	    structure_dimension33=structure_dimension();

            	    state._fsp--;

            	    stream_structure_dimension.add(structure_dimension33.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: structure_dimension
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:3: -> ^( STRUCTURED ( structure_dimension )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:160:6: ^( STRUCTURED ( structure_dimension )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRUCTURED, "STRUCTURED"), root_1);

                if ( !(stream_structure_dimension.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_structure_dimension.hasNext() ) {
                    adaptor.addChild(root_1, stream_structure_dimension.nextTree());

                }
                stream_structure_dimension.reset();

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
    // $ANTLR end "structured"

    public static class structure_dimension_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structure_dimension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:164:1: structure_dimension : ( ID -> ^( DIMENSION ID ) | INT -> ^( DIMENSION INT ) );
    public final ReoLangParser.structure_dimension_return structure_dimension() throws RecognitionException {
        ReoLangParser.structure_dimension_return retval = new ReoLangParser.structure_dimension_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID34=null;
        Token INT35=null;

        Object ID34_tree=null;
        Object INT35_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:165:2: ( ID -> ^( DIMENSION ID ) | INT -> ^( DIMENSION INT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==INT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:165:4: ID
                    {
                    ID34=(Token)match(input,ID,FOLLOW_ID_in_structure_dimension638);  
                    stream_ID.add(ID34);



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
                    // 165:10: -> ^( DIMENSION ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:165:13: ^( DIMENSION ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIMENSION, "DIMENSION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:166:4: INT
                    {
                    INT35=(Token)match(input,INT,FOLLOW_INT_in_structure_dimension654);  
                    stream_INT.add(INT35);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:11: -> ^( DIMENSION INT )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:166:14: ^( DIMENSION INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIMENSION, "DIMENSION"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

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
    // $ANTLR end "structure_dimension"

    public static class ports_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ports"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:170:1: ports : ID ( COMMA ID )* -> ^( PORT ( ID )+ ) ;
    public final ReoLangParser.ports_return ports() throws RecognitionException {
        ReoLangParser.ports_return retval = new ReoLangParser.ports_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID36=null;
        Token COMMA37=null;
        Token ID38=null;

        Object ID36_tree=null;
        Object COMMA37_tree=null;
        Object ID38_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:171:2: ( ID ( COMMA ID )* -> ^( PORT ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:171:4: ID ( COMMA ID )*
            {
            ID36=(Token)match(input,ID,FOLLOW_ID_in_ports677);  
            stream_ID.add(ID36);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:171:7: ( COMMA ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:171:8: COMMA ID
            	    {
            	    COMMA37=(Token)match(input,COMMA,FOLLOW_COMMA_in_ports680);  
            	    stream_COMMA.add(COMMA37);

            	    ID38=(Token)match(input,ID,FOLLOW_ID_in_ports682);  
            	    stream_ID.add(ID38);


            	    }
            	    break;

            	default :
            	    break loop13;
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
            // 171:20: -> ^( PORT ( ID )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:171:23: ^( PORT ( ID )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT, "PORT"), root_1);

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
    // $ANTLR end "ports"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:175:1: condition : COND_OPEN ID ( COMMA ID )* COND_CLOSE -> ^( COND_ELEMENTS ( ID )+ ) ;
    public final ReoLangParser.condition_return condition() throws RecognitionException {
        ReoLangParser.condition_return retval = new ReoLangParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COND_OPEN39=null;
        Token ID40=null;
        Token COMMA41=null;
        Token ID42=null;
        Token COND_CLOSE43=null;

        Object COND_OPEN39_tree=null;
        Object ID40_tree=null;
        Object COMMA41_tree=null;
        Object ID42_tree=null;
        Object COND_CLOSE43_tree=null;
        RewriteRuleTokenStream stream_COND_OPEN=new RewriteRuleTokenStream(adaptor,"token COND_OPEN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COND_CLOSE=new RewriteRuleTokenStream(adaptor,"token COND_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:176:2: ( COND_OPEN ID ( COMMA ID )* COND_CLOSE -> ^( COND_ELEMENTS ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:176:4: COND_OPEN ID ( COMMA ID )* COND_CLOSE
            {
            COND_OPEN39=(Token)match(input,COND_OPEN,FOLLOW_COND_OPEN_in_condition709);  
            stream_COND_OPEN.add(COND_OPEN39);

            ID40=(Token)match(input,ID,FOLLOW_ID_in_condition711);  
            stream_ID.add(ID40);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:176:17: ( COMMA ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:176:18: COMMA ID
            	    {
            	    COMMA41=(Token)match(input,COMMA,FOLLOW_COMMA_in_condition714);  
            	    stream_COMMA.add(COMMA41);

            	    ID42=(Token)match(input,ID,FOLLOW_ID_in_condition716);  
            	    stream_ID.add(ID42);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            COND_CLOSE43=(Token)match(input,COND_CLOSE,FOLLOW_COND_CLOSE_in_condition720);  
            stream_COND_CLOSE.add(COND_CLOSE43);



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
            // 176:40: -> ^( COND_ELEMENTS ( ID )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:176:43: ^( COND_ELEMENTS ( ID )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COND_ELEMENTS, "COND_ELEMENTS"), root_1);

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
    // $ANTLR end "condition"

    public static class extension_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:180:1: extension : RW_EXTENDS ID -> ^( EXTENSION ID ) ;
    public final ReoLangParser.extension_return extension() throws RecognitionException {
        ReoLangParser.extension_return retval = new ReoLangParser.extension_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_EXTENDS44=null;
        Token ID45=null;

        Object RW_EXTENDS44_tree=null;
        Object ID45_tree=null;
        RewriteRuleTokenStream stream_RW_EXTENDS=new RewriteRuleTokenStream(adaptor,"token RW_EXTENDS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:181:2: ( RW_EXTENDS ID -> ^( EXTENSION ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:181:4: RW_EXTENDS ID
            {
            RW_EXTENDS44=(Token)match(input,RW_EXTENDS,FOLLOW_RW_EXTENDS_in_extension742);  
            stream_RW_EXTENDS.add(RW_EXTENDS44);

            ID45=(Token)match(input,ID,FOLLOW_ID_in_extension744);  
            stream_ID.add(ID45);



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
            // 181:18: -> ^( EXTENSION ID )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:181:21: ^( EXTENSION ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXTENSION, "EXTENSION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

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
    // $ANTLR end "extension"

    public static class channel_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "channel_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:185:1: channel_body : ( state_def )? flow_def SEMICOLON ( flow_def SEMICOLON )* -> ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) ;
    public final ReoLangParser.channel_body_return channel_body() throws RecognitionException {
        ReoLangParser.channel_body_return retval = new ReoLangParser.channel_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON48=null;
        Token SEMICOLON50=null;
        ReoLangParser.state_def_return state_def46 = null;

        ReoLangParser.flow_def_return flow_def47 = null;

        ReoLangParser.flow_def_return flow_def49 = null;


        Object SEMICOLON48_tree=null;
        Object SEMICOLON50_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_flow_def=new RewriteRuleSubtreeStream(adaptor,"rule flow_def");
        RewriteRuleSubtreeStream stream_state_def=new RewriteRuleSubtreeStream(adaptor,"rule state_def");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:186:2: ( ( state_def )? flow_def SEMICOLON ( flow_def SEMICOLON )* -> ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:186:4: ( state_def )? flow_def SEMICOLON ( flow_def SEMICOLON )*
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:186:4: ( state_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RW_STATE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:186:4: state_def
                    {
                    pushFollow(FOLLOW_state_def_in_channel_body765);
                    state_def46=state_def();

                    state._fsp--;

                    stream_state_def.add(state_def46.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_flow_def_in_channel_body768);
            flow_def47=flow_def();

            state._fsp--;

            stream_flow_def.add(flow_def47.getTree());
            SEMICOLON48=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_channel_body770);  
            stream_SEMICOLON.add(SEMICOLON48);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:186:34: ( flow_def SEMICOLON )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==NOT_MARK||LA16_0==ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:186:35: flow_def SEMICOLON
            	    {
            	    pushFollow(FOLLOW_flow_def_in_channel_body773);
            	    flow_def49=flow_def();

            	    state._fsp--;

            	    stream_flow_def.add(flow_def49.getTree());
            	    SEMICOLON50=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_channel_body775);  
            	    stream_SEMICOLON.add(SEMICOLON50);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: flow_def, state_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:3: -> ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:187:6: ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL_BODY, "CHANNEL_BODY"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:187:21: ( state_def )?
                if ( stream_state_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_state_def.nextTree());

                }
                stream_state_def.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:187:32: ^( FLOWS ( flow_def )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOWS, "FLOWS"), root_2);

                if ( !(stream_flow_def.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_flow_def.hasNext() ) {
                    adaptor.addChild(root_2, stream_flow_def.nextTree());

                }
                stream_flow_def.reset();

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
    // $ANTLR end "channel_body"

    public static class state_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "state_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:191:1: state_def : RW_STATE COLON ID SEMICOLON RW_OBSERVERS COLON ID ( COMMA ID )* SEMICOLON -> ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) ;
    public final ReoLangParser.state_def_return state_def() throws RecognitionException {
        ReoLangParser.state_def_return retval = new ReoLangParser.state_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_STATE51=null;
        Token COLON52=null;
        Token ID53=null;
        Token SEMICOLON54=null;
        Token RW_OBSERVERS55=null;
        Token COLON56=null;
        Token ID57=null;
        Token COMMA58=null;
        Token ID59=null;
        Token SEMICOLON60=null;

        Object RW_STATE51_tree=null;
        Object COLON52_tree=null;
        Object ID53_tree=null;
        Object SEMICOLON54_tree=null;
        Object RW_OBSERVERS55_tree=null;
        Object COLON56_tree=null;
        Object ID57_tree=null;
        Object COMMA58_tree=null;
        Object ID59_tree=null;
        Object SEMICOLON60_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RW_OBSERVERS=new RewriteRuleTokenStream(adaptor,"token RW_OBSERVERS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RW_STATE=new RewriteRuleTokenStream(adaptor,"token RW_STATE");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:192:2: ( RW_STATE COLON ID SEMICOLON RW_OBSERVERS COLON ID ( COMMA ID )* SEMICOLON -> ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:192:4: RW_STATE COLON ID SEMICOLON RW_OBSERVERS COLON ID ( COMMA ID )* SEMICOLON
            {
            RW_STATE51=(Token)match(input,RW_STATE,FOLLOW_RW_STATE_in_state_def809);  
            stream_RW_STATE.add(RW_STATE51);

            COLON52=(Token)match(input,COLON,FOLLOW_COLON_in_state_def811);  
            stream_COLON.add(COLON52);

            ID53=(Token)match(input,ID,FOLLOW_ID_in_state_def813);  
            stream_ID.add(ID53);

            SEMICOLON54=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_state_def815);  
            stream_SEMICOLON.add(SEMICOLON54);

            RW_OBSERVERS55=(Token)match(input,RW_OBSERVERS,FOLLOW_RW_OBSERVERS_in_state_def817);  
            stream_RW_OBSERVERS.add(RW_OBSERVERS55);

            COLON56=(Token)match(input,COLON,FOLLOW_COLON_in_state_def819);  
            stream_COLON.add(COLON56);

            ID57=(Token)match(input,ID,FOLLOW_ID_in_state_def821);  
            stream_ID.add(ID57);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:192:54: ( COMMA ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:192:55: COMMA ID
            	    {
            	    COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_state_def824);  
            	    stream_COMMA.add(COMMA58);

            	    ID59=(Token)match(input,ID,FOLLOW_ID_in_state_def826);  
            	    stream_ID.add(ID59);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            SEMICOLON60=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_state_def830);  
            stream_SEMICOLON.add(SEMICOLON60);



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
            // 193:3: -> ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:193:6: ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL_STATE, "CHANNEL_STATE"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:193:22: ^( STATE_REF ID )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATE_REF, "STATE_REF"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:193:38: ^( STATE_OBS ( ID )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATE_OBS, "STATE_OBS"), root_2);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_2, stream_ID.nextNode());

                }
                stream_ID.reset();

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
    // $ANTLR end "state_def"

    public static class flow_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:197:1: flow_def : requests ARROW_MARK flow_type -> ^( FLOW requests flow_type ) ;
    public final ReoLangParser.flow_def_return flow_def() throws RecognitionException {
        ReoLangParser.flow_def_return retval = new ReoLangParser.flow_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ARROW_MARK62=null;
        ReoLangParser.requests_return requests61 = null;

        ReoLangParser.flow_type_return flow_type63 = null;


        Object ARROW_MARK62_tree=null;
        RewriteRuleTokenStream stream_ARROW_MARK=new RewriteRuleTokenStream(adaptor,"token ARROW_MARK");
        RewriteRuleSubtreeStream stream_requests=new RewriteRuleSubtreeStream(adaptor,"rule requests");
        RewriteRuleSubtreeStream stream_flow_type=new RewriteRuleSubtreeStream(adaptor,"rule flow_type");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:198:2: ( requests ARROW_MARK flow_type -> ^( FLOW requests flow_type ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:198:4: requests ARROW_MARK flow_type
            {
            pushFollow(FOLLOW_requests_in_flow_def865);
            requests61=requests();

            state._fsp--;

            stream_requests.add(requests61.getTree());
            ARROW_MARK62=(Token)match(input,ARROW_MARK,FOLLOW_ARROW_MARK_in_flow_def867);  
            stream_ARROW_MARK.add(ARROW_MARK62);

            pushFollow(FOLLOW_flow_type_in_flow_def869);
            flow_type63=flow_type();

            state._fsp--;

            stream_flow_type.add(flow_type63.getTree());


            // AST REWRITE
            // elements: requests, flow_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 198:35: -> ^( FLOW requests flow_type )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:198:38: ^( FLOW requests flow_type )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW, "FLOW"), root_1);

                adaptor.addChild(root_1, stream_requests.nextTree());
                adaptor.addChild(root_1, stream_flow_type.nextTree());

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
    // $ANTLR end "flow_def"

    public static class requests_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "requests"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:203:1: requests : request ( COMMA request )* -> ^( REQUESTS ( request )+ ) ;
    public final ReoLangParser.requests_return requests() throws RecognitionException {
        ReoLangParser.requests_return retval = new ReoLangParser.requests_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA65=null;
        ReoLangParser.request_return request64 = null;

        ReoLangParser.request_return request66 = null;


        Object COMMA65_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_request=new RewriteRuleSubtreeStream(adaptor,"rule request");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:204:2: ( request ( COMMA request )* -> ^( REQUESTS ( request )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:204:4: request ( COMMA request )*
            {
            pushFollow(FOLLOW_request_in_requests894);
            request64=request();

            state._fsp--;

            stream_request.add(request64.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:204:12: ( COMMA request )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:204:13: COMMA request
            	    {
            	    COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_requests897);  
            	    stream_COMMA.add(COMMA65);

            	    pushFollow(FOLLOW_request_in_requests899);
            	    request66=request();

            	    state._fsp--;

            	    stream_request.add(request66.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: request
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 204:29: -> ^( REQUESTS ( request )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:204:32: ^( REQUESTS ( request )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUESTS, "REQUESTS"), root_1);

                if ( !(stream_request.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_request.hasNext() ) {
                    adaptor.addChild(root_1, stream_request.nextTree());

                }
                stream_request.reset();

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
    // $ANTLR end "requests"

    public static class request_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "request"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:208:1: request : ( ID -> ^( REQUEST ID ) | NOT_MARK ID -> ^( REQUEST NOT_MARK ID ) );
    public final ReoLangParser.request_return request() throws RecognitionException {
        ReoLangParser.request_return retval = new ReoLangParser.request_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID67=null;
        Token NOT_MARK68=null;
        Token ID69=null;

        Object ID67_tree=null;
        Object NOT_MARK68_tree=null;
        Object ID69_tree=null;
        RewriteRuleTokenStream stream_NOT_MARK=new RewriteRuleTokenStream(adaptor,"token NOT_MARK");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:209:2: ( ID -> ^( REQUEST ID ) | NOT_MARK ID -> ^( REQUEST NOT_MARK ID ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==NOT_MARK) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:209:4: ID
                    {
                    ID67=(Token)match(input,ID,FOLLOW_ID_in_request924);  
                    stream_ID.add(ID67);



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
                    // 209:7: -> ^( REQUEST ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:209:10: ^( REQUEST ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUEST, "REQUEST"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:210:4: NOT_MARK ID
                    {
                    NOT_MARK68=(Token)match(input,NOT_MARK,FOLLOW_NOT_MARK_in_request937);  
                    stream_NOT_MARK.add(NOT_MARK68);

                    ID69=(Token)match(input,ID,FOLLOW_ID_in_request939);  
                    stream_ID.add(ID69);



                    // AST REWRITE
                    // elements: ID, NOT_MARK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:16: -> ^( REQUEST NOT_MARK ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:210:19: ^( REQUEST NOT_MARK ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REQUEST, "REQUEST"), root_1);

                        adaptor.addChild(root_1, stream_NOT_MARK.nextNode());
                        adaptor.addChild(root_1, stream_ID.nextNode());

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
    // $ANTLR end "request"

    public static class flow_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_type"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:214:1: flow_type : ( normal_flow ( flow_operation normal_flow )? ( flow_label )? -> ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | if_flow -> ^( FLOW_TYPE if_flow ) );
    public final ReoLangParser.flow_type_return flow_type() throws RecognitionException {
        ReoLangParser.flow_type_return retval = new ReoLangParser.flow_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.normal_flow_return normal_flow70 = null;

        ReoLangParser.flow_operation_return flow_operation71 = null;

        ReoLangParser.normal_flow_return normal_flow72 = null;

        ReoLangParser.flow_label_return flow_label73 = null;

        ReoLangParser.if_flow_return if_flow74 = null;


        RewriteRuleSubtreeStream stream_flow_operation=new RewriteRuleSubtreeStream(adaptor,"rule flow_operation");
        RewriteRuleSubtreeStream stream_if_flow=new RewriteRuleSubtreeStream(adaptor,"rule if_flow");
        RewriteRuleSubtreeStream stream_normal_flow=new RewriteRuleSubtreeStream(adaptor,"rule normal_flow");
        RewriteRuleSubtreeStream stream_flow_label=new RewriteRuleSubtreeStream(adaptor,"rule flow_label");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:215:2: ( normal_flow ( flow_operation normal_flow )? ( flow_label )? -> ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | if_flow -> ^( FLOW_TYPE if_flow ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RW_FLOW) ) {
                alt22=1;
            }
            else if ( (LA22_0==ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:215:4: normal_flow ( flow_operation normal_flow )? ( flow_label )?
                    {
                    pushFollow(FOLLOW_normal_flow_in_flow_type962);
                    normal_flow70=normal_flow();

                    state._fsp--;

                    stream_normal_flow.add(normal_flow70.getTree());
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:215:16: ( flow_operation normal_flow )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OP_SYNC) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:215:17: flow_operation normal_flow
                            {
                            pushFollow(FOLLOW_flow_operation_in_flow_type965);
                            flow_operation71=flow_operation();

                            state._fsp--;

                            stream_flow_operation.add(flow_operation71.getTree());
                            pushFollow(FOLLOW_normal_flow_in_flow_type967);
                            normal_flow72=normal_flow();

                            state._fsp--;

                            stream_normal_flow.add(normal_flow72.getTree());

                            }
                            break;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:215:46: ( flow_label )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==LABEL_MARK) ) {
                        int LA21_1 = input.LA(2);

                        if ( (LA21_1==ID) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:215:46: flow_label
                            {
                            pushFollow(FOLLOW_flow_label_in_flow_type971);
                            flow_label73=flow_label();

                            state._fsp--;

                            stream_flow_label.add(flow_label73.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: normal_flow, flow_label, flow_operation, normal_flow
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:3: -> ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:216:6: ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_TYPE, "FLOW_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_normal_flow.nextTree());
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:216:30: ( flow_operation normal_flow )?
                        if ( stream_normal_flow.hasNext()||stream_flow_operation.hasNext() ) {
                            adaptor.addChild(root_1, stream_flow_operation.nextTree());
                            adaptor.addChild(root_1, stream_normal_flow.nextTree());

                        }
                        stream_normal_flow.reset();
                        stream_flow_operation.reset();
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:216:60: ( flow_label )?
                        if ( stream_flow_label.hasNext() ) {
                            adaptor.addChild(root_1, stream_flow_label.nextTree());

                        }
                        stream_flow_label.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:217:4: if_flow
                    {
                    pushFollow(FOLLOW_if_flow_in_flow_type997);
                    if_flow74=if_flow();

                    state._fsp--;

                    stream_if_flow.add(if_flow74.getTree());


                    // AST REWRITE
                    // elements: if_flow
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:3: -> ^( FLOW_TYPE if_flow )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:218:6: ^( FLOW_TYPE if_flow )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_TYPE, "FLOW_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_if_flow.nextTree());

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
    // $ANTLR end "flow_type"

    public static class normal_flow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "normal_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:222:1: normal_flow : RW_FLOW flow_point RW_TO ( timed )? flow_point -> ^( NORMAL_FLOW flow_point ( timed )? flow_point ) ;
    public final ReoLangParser.normal_flow_return normal_flow() throws RecognitionException {
        ReoLangParser.normal_flow_return retval = new ReoLangParser.normal_flow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_FLOW75=null;
        Token RW_TO77=null;
        ReoLangParser.flow_point_return flow_point76 = null;

        ReoLangParser.timed_return timed78 = null;

        ReoLangParser.flow_point_return flow_point79 = null;


        Object RW_FLOW75_tree=null;
        Object RW_TO77_tree=null;
        RewriteRuleTokenStream stream_RW_TO=new RewriteRuleTokenStream(adaptor,"token RW_TO");
        RewriteRuleTokenStream stream_RW_FLOW=new RewriteRuleTokenStream(adaptor,"token RW_FLOW");
        RewriteRuleSubtreeStream stream_timed=new RewriteRuleSubtreeStream(adaptor,"rule timed");
        RewriteRuleSubtreeStream stream_flow_point=new RewriteRuleSubtreeStream(adaptor,"rule flow_point");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:223:2: ( RW_FLOW flow_point RW_TO ( timed )? flow_point -> ^( NORMAL_FLOW flow_point ( timed )? flow_point ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:223:4: RW_FLOW flow_point RW_TO ( timed )? flow_point
            {
            RW_FLOW75=(Token)match(input,RW_FLOW,FOLLOW_RW_FLOW_in_normal_flow1020);  
            stream_RW_FLOW.add(RW_FLOW75);

            pushFollow(FOLLOW_flow_point_in_normal_flow1022);
            flow_point76=flow_point();

            state._fsp--;

            stream_flow_point.add(flow_point76.getTree());
            RW_TO77=(Token)match(input,RW_TO,FOLLOW_RW_TO_in_normal_flow1024);  
            stream_RW_TO.add(RW_TO77);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:223:29: ( timed )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TIME_MARK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:223:29: timed
                    {
                    pushFollow(FOLLOW_timed_in_normal_flow1026);
                    timed78=timed();

                    state._fsp--;

                    stream_timed.add(timed78.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_flow_point_in_normal_flow1029);
            flow_point79=flow_point();

            state._fsp--;

            stream_flow_point.add(flow_point79.getTree());


            // AST REWRITE
            // elements: flow_point, flow_point, timed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:3: -> ^( NORMAL_FLOW flow_point ( timed )? flow_point )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:224:6: ^( NORMAL_FLOW flow_point ( timed )? flow_point )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NORMAL_FLOW, "NORMAL_FLOW"), root_1);

                adaptor.addChild(root_1, stream_flow_point.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:224:31: ( timed )?
                if ( stream_timed.hasNext() ) {
                    adaptor.addChild(root_1, stream_timed.nextTree());

                }
                stream_timed.reset();
                adaptor.addChild(root_1, stream_flow_point.nextTree());

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
    // $ANTLR end "normal_flow"

    public static class flow_point_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_point"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:228:1: flow_point : ( ID -> ^( FLOW_POINT ID ) | RW_NULL -> ^( FLOW_POINT RW_NULL ) );
    public final ReoLangParser.flow_point_return flow_point() throws RecognitionException {
        ReoLangParser.flow_point_return retval = new ReoLangParser.flow_point_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID80=null;
        Token RW_NULL81=null;

        Object ID80_tree=null;
        Object RW_NULL81_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RW_NULL=new RewriteRuleTokenStream(adaptor,"token RW_NULL");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:229:2: ( ID -> ^( FLOW_POINT ID ) | RW_NULL -> ^( FLOW_POINT RW_NULL ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==RW_NULL) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:229:4: ID
                    {
                    ID80=(Token)match(input,ID,FOLLOW_ID_in_flow_point1058);  
                    stream_ID.add(ID80);



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
                    // 229:10: -> ^( FLOW_POINT ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:229:13: ^( FLOW_POINT ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_POINT, "FLOW_POINT"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:230:5: RW_NULL
                    {
                    RW_NULL81=(Token)match(input,RW_NULL,FOLLOW_RW_NULL_in_flow_point1075);  
                    stream_RW_NULL.add(RW_NULL81);



                    // AST REWRITE
                    // elements: RW_NULL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 230:14: -> ^( FLOW_POINT RW_NULL )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:230:17: ^( FLOW_POINT RW_NULL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_POINT, "FLOW_POINT"), root_1);

                        adaptor.addChild(root_1, stream_RW_NULL.nextNode());

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
    // $ANTLR end "flow_point"

    public static class flow_operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:233:1: flow_operation : OP_SYNC -> ^( FLOW_OP OP_SYNC ) ;
    public final ReoLangParser.flow_operation_return flow_operation() throws RecognitionException {
        ReoLangParser.flow_operation_return retval = new ReoLangParser.flow_operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_SYNC82=null;

        Object OP_SYNC82_tree=null;
        RewriteRuleTokenStream stream_OP_SYNC=new RewriteRuleTokenStream(adaptor,"token OP_SYNC");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:234:2: ( OP_SYNC -> ^( FLOW_OP OP_SYNC ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:234:4: OP_SYNC
            {
            OP_SYNC82=(Token)match(input,OP_SYNC,FOLLOW_OP_SYNC_in_flow_operation1095);  
            stream_OP_SYNC.add(OP_SYNC82);



            // AST REWRITE
            // elements: OP_SYNC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:13: -> ^( FLOW_OP OP_SYNC )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:234:16: ^( FLOW_OP OP_SYNC )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_OP, "FLOW_OP"), root_1);

                adaptor.addChild(root_1, stream_OP_SYNC.nextNode());

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
    // $ANTLR end "flow_operation"

    public static class if_flow_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:238:1: if_flow : ID QUESTION_MARK flow_type (f1= flow_label )? COLON flow_type (f2= flow_label )? -> ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) ) ;
    public final ReoLangParser.if_flow_return if_flow() throws RecognitionException {
        ReoLangParser.if_flow_return retval = new ReoLangParser.if_flow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID83=null;
        Token QUESTION_MARK84=null;
        Token COLON86=null;
        ReoLangParser.flow_label_return f1 = null;

        ReoLangParser.flow_label_return f2 = null;

        ReoLangParser.flow_type_return flow_type85 = null;

        ReoLangParser.flow_type_return flow_type87 = null;


        Object ID83_tree=null;
        Object QUESTION_MARK84_tree=null;
        Object COLON86_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_flow_label=new RewriteRuleSubtreeStream(adaptor,"rule flow_label");
        RewriteRuleSubtreeStream stream_flow_type=new RewriteRuleSubtreeStream(adaptor,"rule flow_type");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:239:2: ( ID QUESTION_MARK flow_type (f1= flow_label )? COLON flow_type (f2= flow_label )? -> ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:239:4: ID QUESTION_MARK flow_type (f1= flow_label )? COLON flow_type (f2= flow_label )?
            {
            ID83=(Token)match(input,ID,FOLLOW_ID_in_if_flow1117);  
            stream_ID.add(ID83);

            QUESTION_MARK84=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_if_flow1119);  
            stream_QUESTION_MARK.add(QUESTION_MARK84);

            pushFollow(FOLLOW_flow_type_in_if_flow1121);
            flow_type85=flow_type();

            state._fsp--;

            stream_flow_type.add(flow_type85.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:239:33: (f1= flow_label )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LABEL_MARK) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:239:33: f1= flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow1125);
                    f1=flow_label();

                    state._fsp--;

                    stream_flow_label.add(f1.getTree());

                    }
                    break;

            }

            COLON86=(Token)match(input,COLON,FOLLOW_COLON_in_if_flow1128);  
            stream_COLON.add(COLON86);

            pushFollow(FOLLOW_flow_type_in_if_flow1130);
            flow_type87=flow_type();

            state._fsp--;

            stream_flow_type.add(flow_type87.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:239:64: (f2= flow_label )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LABEL_MARK) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:239:64: f2= flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow1134);
                    f2=flow_label();

                    state._fsp--;

                    stream_flow_label.add(f2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: f2, flow_type, flow_type, ID, f1
            // token labels: 
            // rule labels: retval, f1, f2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_f1=new RewriteRuleSubtreeStream(adaptor,"rule f1",f1!=null?f1.tree:null);
            RewriteRuleSubtreeStream stream_f2=new RewriteRuleSubtreeStream(adaptor,"rule f2",f2!=null?f2.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:3: -> ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:240:6: ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_FLOW, "IF_FLOW"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:240:19: ^( FLOW_TRUE flow_type ( $f1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_TRUE, "FLOW_TRUE"), root_2);

                adaptor.addChild(root_2, stream_flow_type.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:240:41: ( $f1)?
                if ( stream_f1.hasNext() ) {
                    adaptor.addChild(root_2, stream_f1.nextTree());

                }
                stream_f1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:240:47: ^( FLOW_FALSE flow_type ( $f2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_FALSE, "FLOW_FALSE"), root_2);

                adaptor.addChild(root_2, stream_flow_type.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:240:70: ( $f2)?
                if ( stream_f2.hasNext() ) {
                    adaptor.addChild(root_2, stream_f2.nextTree());

                }
                stream_f2.reset();

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
    // $ANTLR end "if_flow"

    public static class flow_label_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_label"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:245:1: flow_label : LABEL_MARK ID -> ID ;
    public final ReoLangParser.flow_label_return flow_label() throws RecognitionException {
        ReoLangParser.flow_label_return retval = new ReoLangParser.flow_label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LABEL_MARK88=null;
        Token ID89=null;

        Object LABEL_MARK88_tree=null;
        Object ID89_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LABEL_MARK=new RewriteRuleTokenStream(adaptor,"token LABEL_MARK");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:246:2: ( LABEL_MARK ID -> ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:246:4: LABEL_MARK ID
            {
            LABEL_MARK88=(Token)match(input,LABEL_MARK,FOLLOW_LABEL_MARK_in_flow_label1181);  
            stream_LABEL_MARK.add(LABEL_MARK88);

            ID89=(Token)match(input,ID,FOLLOW_ID_in_flow_label1183);  
            stream_ID.add(ID89);



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
            // 247:3: -> ID
            {
                adaptor.addChild(root_0, stream_ID.nextNode());

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
    // $ANTLR end "flow_label"

    public static class pattern_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:260:1: pattern_def : RW_PATTERN pattern_signature BODY_OPEN pattern_body BODY_CLOSE -> ^( PATTERN pattern_signature pattern_body ) ;
    public final ReoLangParser.pattern_def_return pattern_def() throws RecognitionException {
        ReoLangParser.pattern_def_return retval = new ReoLangParser.pattern_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_PATTERN90=null;
        Token BODY_OPEN92=null;
        Token BODY_CLOSE94=null;
        ReoLangParser.pattern_signature_return pattern_signature91 = null;

        ReoLangParser.pattern_body_return pattern_body93 = null;


        Object RW_PATTERN90_tree=null;
        Object BODY_OPEN92_tree=null;
        Object BODY_CLOSE94_tree=null;
        RewriteRuleTokenStream stream_RW_PATTERN=new RewriteRuleTokenStream(adaptor,"token RW_PATTERN");
        RewriteRuleTokenStream stream_BODY_OPEN=new RewriteRuleTokenStream(adaptor,"token BODY_OPEN");
        RewriteRuleTokenStream stream_BODY_CLOSE=new RewriteRuleTokenStream(adaptor,"token BODY_CLOSE");
        RewriteRuleSubtreeStream stream_pattern_body=new RewriteRuleSubtreeStream(adaptor,"rule pattern_body");
        RewriteRuleSubtreeStream stream_pattern_signature=new RewriteRuleSubtreeStream(adaptor,"rule pattern_signature");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:261:2: ( RW_PATTERN pattern_signature BODY_OPEN pattern_body BODY_CLOSE -> ^( PATTERN pattern_signature pattern_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:261:4: RW_PATTERN pattern_signature BODY_OPEN pattern_body BODY_CLOSE
            {
            RW_PATTERN90=(Token)match(input,RW_PATTERN,FOLLOW_RW_PATTERN_in_pattern_def1211);  
            stream_RW_PATTERN.add(RW_PATTERN90);

            pushFollow(FOLLOW_pattern_signature_in_pattern_def1213);
            pattern_signature91=pattern_signature();

            state._fsp--;

            stream_pattern_signature.add(pattern_signature91.getTree());
            BODY_OPEN92=(Token)match(input,BODY_OPEN,FOLLOW_BODY_OPEN_in_pattern_def1215);  
            stream_BODY_OPEN.add(BODY_OPEN92);

            pushFollow(FOLLOW_pattern_body_in_pattern_def1217);
            pattern_body93=pattern_body();

            state._fsp--;

            stream_pattern_body.add(pattern_body93.getTree());
            BODY_CLOSE94=(Token)match(input,BODY_CLOSE,FOLLOW_BODY_CLOSE_in_pattern_def1219);  
            stream_BODY_CLOSE.add(BODY_CLOSE94);



            // AST REWRITE
            // elements: pattern_body, pattern_signature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 262:3: -> ^( PATTERN pattern_signature pattern_body )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:262:6: ^( PATTERN pattern_signature pattern_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN, "PATTERN"), root_1);

                adaptor.addChild(root_1, stream_pattern_signature.nextTree());
                adaptor.addChild(root_1, stream_pattern_body.nextTree());

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
    // $ANTLR end "pattern_def"

    public static class pattern_signature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:265:1: pattern_signature : ID PORTS_OPEN (in= ports )? COLON (out= ports )? PORTS_CLOSE -> ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ) ;
    public final ReoLangParser.pattern_signature_return pattern_signature() throws RecognitionException {
        ReoLangParser.pattern_signature_return retval = new ReoLangParser.pattern_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID95=null;
        Token PORTS_OPEN96=null;
        Token COLON97=null;
        Token PORTS_CLOSE98=null;
        ReoLangParser.ports_return in = null;

        ReoLangParser.ports_return out = null;


        Object ID95_tree=null;
        Object PORTS_OPEN96_tree=null;
        Object COLON97_tree=null;
        Object PORTS_CLOSE98_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PORTS_OPEN=new RewriteRuleTokenStream(adaptor,"token PORTS_OPEN");
        RewriteRuleTokenStream stream_PORTS_CLOSE=new RewriteRuleTokenStream(adaptor,"token PORTS_CLOSE");
        RewriteRuleSubtreeStream stream_ports=new RewriteRuleSubtreeStream(adaptor,"rule ports");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:266:2: ( ID PORTS_OPEN (in= ports )? COLON (out= ports )? PORTS_CLOSE -> ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:266:4: ID PORTS_OPEN (in= ports )? COLON (out= ports )? PORTS_CLOSE
            {
            ID95=(Token)match(input,ID,FOLLOW_ID_in_pattern_signature1245);  
            stream_ID.add(ID95);

            PORTS_OPEN96=(Token)match(input,PORTS_OPEN,FOLLOW_PORTS_OPEN_in_pattern_signature1247);  
            stream_PORTS_OPEN.add(PORTS_OPEN96);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:266:20: (in= ports )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:266:20: in= ports
                    {
                    pushFollow(FOLLOW_ports_in_pattern_signature1251);
                    in=ports();

                    state._fsp--;

                    stream_ports.add(in.getTree());

                    }
                    break;

            }

            COLON97=(Token)match(input,COLON,FOLLOW_COLON_in_pattern_signature1254);  
            stream_COLON.add(COLON97);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:266:37: (out= ports )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:266:37: out= ports
                    {
                    pushFollow(FOLLOW_ports_in_pattern_signature1258);
                    out=ports();

                    state._fsp--;

                    stream_ports.add(out.getTree());

                    }
                    break;

            }

            PORTS_CLOSE98=(Token)match(input,PORTS_CLOSE,FOLLOW_PORTS_CLOSE_in_pattern_signature1261);  
            stream_PORTS_CLOSE.add(PORTS_CLOSE98);



            // AST REWRITE
            // elements: ID, out, in
            // token labels: 
            // rule labels: retval, in, out
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_in=new RewriteRuleSubtreeStream(adaptor,"rule in",in!=null?in.tree:null);
            RewriteRuleSubtreeStream stream_out=new RewriteRuleSubtreeStream(adaptor,"rule out",out!=null?out.tree:null);

            root_0 = (Object)adaptor.nil();
            // 267:3: -> ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:267:6: ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN_SIGNATURE, "PATTERN_SIGNATURE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:267:29: ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN_PORTS, "PATTERN_PORTS"), root_2);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:267:45: ( ^( IN_PORTS $in) )?
                if ( stream_in.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:267:46: ^( IN_PORTS $in)
                    {
                    Object root_3 = (Object)adaptor.nil();
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_PORTS, "IN_PORTS"), root_3);

                    adaptor.addChild(root_3, stream_in.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_in.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:267:64: ( ^( OUT_PORTS $out) )?
                if ( stream_out.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:267:65: ^( OUT_PORTS $out)
                    {
                    Object root_3 = (Object)adaptor.nil();
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUT_PORTS, "OUT_PORTS"), root_3);

                    adaptor.addChild(root_3, stream_out.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_out.reset();

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
    // $ANTLR end "pattern_signature"

    public static class pattern_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:270:1: pattern_body : RW_USE COLON pattern_declarations RW_IN COLON pattern_compositions -> ^( PATTERN_BODY pattern_declarations pattern_compositions ) ;
    public final ReoLangParser.pattern_body_return pattern_body() throws RecognitionException {
        ReoLangParser.pattern_body_return retval = new ReoLangParser.pattern_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_USE99=null;
        Token COLON100=null;
        Token RW_IN102=null;
        Token COLON103=null;
        ReoLangParser.pattern_declarations_return pattern_declarations101 = null;

        ReoLangParser.pattern_compositions_return pattern_compositions104 = null;


        Object RW_USE99_tree=null;
        Object COLON100_tree=null;
        Object RW_IN102_tree=null;
        Object COLON103_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RW_USE=new RewriteRuleTokenStream(adaptor,"token RW_USE");
        RewriteRuleTokenStream stream_RW_IN=new RewriteRuleTokenStream(adaptor,"token RW_IN");
        RewriteRuleSubtreeStream stream_pattern_declarations=new RewriteRuleSubtreeStream(adaptor,"rule pattern_declarations");
        RewriteRuleSubtreeStream stream_pattern_compositions=new RewriteRuleSubtreeStream(adaptor,"rule pattern_compositions");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:271:2: ( RW_USE COLON pattern_declarations RW_IN COLON pattern_compositions -> ^( PATTERN_BODY pattern_declarations pattern_compositions ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:271:4: RW_USE COLON pattern_declarations RW_IN COLON pattern_compositions
            {
            RW_USE99=(Token)match(input,RW_USE,FOLLOW_RW_USE_in_pattern_body1309);  
            stream_RW_USE.add(RW_USE99);

            COLON100=(Token)match(input,COLON,FOLLOW_COLON_in_pattern_body1311);  
            stream_COLON.add(COLON100);

            pushFollow(FOLLOW_pattern_declarations_in_pattern_body1313);
            pattern_declarations101=pattern_declarations();

            state._fsp--;

            stream_pattern_declarations.add(pattern_declarations101.getTree());
            RW_IN102=(Token)match(input,RW_IN,FOLLOW_RW_IN_in_pattern_body1315);  
            stream_RW_IN.add(RW_IN102);

            COLON103=(Token)match(input,COLON,FOLLOW_COLON_in_pattern_body1317);  
            stream_COLON.add(COLON103);

            pushFollow(FOLLOW_pattern_compositions_in_pattern_body1319);
            pattern_compositions104=pattern_compositions();

            state._fsp--;

            stream_pattern_compositions.add(pattern_compositions104.getTree());


            // AST REWRITE
            // elements: pattern_compositions, pattern_declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 272:3: -> ^( PATTERN_BODY pattern_declarations pattern_compositions )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:272:6: ^( PATTERN_BODY pattern_declarations pattern_compositions )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN_BODY, "PATTERN_BODY"), root_1);

                adaptor.addChild(root_1, stream_pattern_declarations.nextTree());
                adaptor.addChild(root_1, stream_pattern_compositions.nextTree());

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
    // $ANTLR end "pattern_body"

    public static class pattern_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_declarations"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:275:1: pattern_declarations : declaration SEMICOLON ( declaration SEMICOLON )* -> ^( PATTERN_DECLARATIONS ( declaration )+ ) ;
    public final ReoLangParser.pattern_declarations_return pattern_declarations() throws RecognitionException {
        ReoLangParser.pattern_declarations_return retval = new ReoLangParser.pattern_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON106=null;
        Token SEMICOLON108=null;
        ReoLangParser.declaration_return declaration105 = null;

        ReoLangParser.declaration_return declaration107 = null;


        Object SEMICOLON106_tree=null;
        Object SEMICOLON108_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:276:2: ( declaration SEMICOLON ( declaration SEMICOLON )* -> ^( PATTERN_DECLARATIONS ( declaration )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:276:4: declaration SEMICOLON ( declaration SEMICOLON )*
            {
            pushFollow(FOLLOW_declaration_in_pattern_declarations1343);
            declaration105=declaration();

            state._fsp--;

            stream_declaration.add(declaration105.getTree());
            SEMICOLON106=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_declarations1345);  
            stream_SEMICOLON.add(SEMICOLON106);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:276:26: ( declaration SEMICOLON )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==PORTS_OPEN||LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:276:27: declaration SEMICOLON
            	    {
            	    pushFollow(FOLLOW_declaration_in_pattern_declarations1348);
            	    declaration107=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration107.getTree());
            	    SEMICOLON108=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_declarations1350);  
            	    stream_SEMICOLON.add(SEMICOLON108);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);



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
            // 277:3: -> ^( PATTERN_DECLARATIONS ( declaration )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:277:6: ^( PATTERN_DECLARATIONS ( declaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN_DECLARATIONS, "PATTERN_DECLARATIONS"), root_1);

                if ( !(stream_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();

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
    // $ANTLR end "pattern_declarations"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:280:1: declaration : reference_signature RW_AS instances -> ^( DECLARATION reference_signature instances ) ;
    public final ReoLangParser.declaration_return declaration() throws RecognitionException {
        ReoLangParser.declaration_return retval = new ReoLangParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_AS110=null;
        ReoLangParser.reference_signature_return reference_signature109 = null;

        ReoLangParser.instances_return instances111 = null;


        Object RW_AS110_tree=null;
        RewriteRuleTokenStream stream_RW_AS=new RewriteRuleTokenStream(adaptor,"token RW_AS");
        RewriteRuleSubtreeStream stream_reference_signature=new RewriteRuleSubtreeStream(adaptor,"rule reference_signature");
        RewriteRuleSubtreeStream stream_instances=new RewriteRuleSubtreeStream(adaptor,"rule instances");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:281:2: ( reference_signature RW_AS instances -> ^( DECLARATION reference_signature instances ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:281:4: reference_signature RW_AS instances
            {
            pushFollow(FOLLOW_reference_signature_in_declaration1376);
            reference_signature109=reference_signature();

            state._fsp--;

            stream_reference_signature.add(reference_signature109.getTree());
            RW_AS110=(Token)match(input,RW_AS,FOLLOW_RW_AS_in_declaration1378);  
            stream_RW_AS.add(RW_AS110);

            pushFollow(FOLLOW_instances_in_declaration1380);
            instances111=instances();

            state._fsp--;

            stream_instances.add(instances111.getTree());


            // AST REWRITE
            // elements: instances, reference_signature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:3: -> ^( DECLARATION reference_signature instances )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:282:6: ^( DECLARATION reference_signature instances )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION, "DECLARATION"), root_1);

                adaptor.addChild(root_1, stream_reference_signature.nextTree());
                adaptor.addChild(root_1, stream_instances.nextTree());

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

    public static class reference_signature_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:285:1: reference_signature : ( PORTS_OPEN ID PORTS_CLOSE )? channel_signature -> ^( DECLARATION_TYPE ( ID )? channel_signature ) ;
    public final ReoLangParser.reference_signature_return reference_signature() throws RecognitionException {
        ReoLangParser.reference_signature_return retval = new ReoLangParser.reference_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PORTS_OPEN112=null;
        Token ID113=null;
        Token PORTS_CLOSE114=null;
        ReoLangParser.channel_signature_return channel_signature115 = null;


        Object PORTS_OPEN112_tree=null;
        Object ID113_tree=null;
        Object PORTS_CLOSE114_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PORTS_OPEN=new RewriteRuleTokenStream(adaptor,"token PORTS_OPEN");
        RewriteRuleTokenStream stream_PORTS_CLOSE=new RewriteRuleTokenStream(adaptor,"token PORTS_CLOSE");
        RewriteRuleSubtreeStream stream_channel_signature=new RewriteRuleSubtreeStream(adaptor,"rule channel_signature");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:286:2: ( ( PORTS_OPEN ID PORTS_CLOSE )? channel_signature -> ^( DECLARATION_TYPE ( ID )? channel_signature ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:286:4: ( PORTS_OPEN ID PORTS_CLOSE )? channel_signature
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:286:4: ( PORTS_OPEN ID PORTS_CLOSE )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==PORTS_OPEN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:286:5: PORTS_OPEN ID PORTS_CLOSE
                    {
                    PORTS_OPEN112=(Token)match(input,PORTS_OPEN,FOLLOW_PORTS_OPEN_in_reference_signature1405);  
                    stream_PORTS_OPEN.add(PORTS_OPEN112);

                    ID113=(Token)match(input,ID,FOLLOW_ID_in_reference_signature1407);  
                    stream_ID.add(ID113);

                    PORTS_CLOSE114=(Token)match(input,PORTS_CLOSE,FOLLOW_PORTS_CLOSE_in_reference_signature1409);  
                    stream_PORTS_CLOSE.add(PORTS_CLOSE114);


                    }
                    break;

            }

            pushFollow(FOLLOW_channel_signature_in_reference_signature1413);
            channel_signature115=channel_signature();

            state._fsp--;

            stream_channel_signature.add(channel_signature115.getTree());


            // AST REWRITE
            // elements: ID, channel_signature
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 287:3: -> ^( DECLARATION_TYPE ( ID )? channel_signature )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:287:6: ^( DECLARATION_TYPE ( ID )? channel_signature )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION_TYPE, "DECLARATION_TYPE"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:287:25: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_channel_signature.nextTree());

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
    // $ANTLR end "reference_signature"

    public static class instances_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instances"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:290:1: instances : i1= ID (s1= stochastic_values )? ( COMMA i2= ID (s2= stochastic_values )? )* -> ^( INSTANCES ID ( $s1)? ( ID ( $s2)? )* ) ;
    public final ReoLangParser.instances_return instances() throws RecognitionException {
        ReoLangParser.instances_return retval = new ReoLangParser.instances_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token COMMA116=null;
        ReoLangParser.stochastic_values_return s1 = null;

        ReoLangParser.stochastic_values_return s2 = null;


        Object i1_tree=null;
        Object i2_tree=null;
        Object COMMA116_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_stochastic_values=new RewriteRuleSubtreeStream(adaptor,"rule stochastic_values");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:2: (i1= ID (s1= stochastic_values )? ( COMMA i2= ID (s2= stochastic_values )? )* -> ^( INSTANCES ID ( $s1)? ( ID ( $s2)? )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:4: i1= ID (s1= stochastic_values )? ( COMMA i2= ID (s2= stochastic_values )? )*
            {
            i1=(Token)match(input,ID,FOLLOW_ID_in_instances1441);  
            stream_ID.add(i1);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:12: (s1= stochastic_values )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==BODY_OPEN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:12: s1= stochastic_values
                    {
                    pushFollow(FOLLOW_stochastic_values_in_instances1445);
                    s1=stochastic_values();

                    state._fsp--;

                    stream_stochastic_values.add(s1.getTree());

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:32: ( COMMA i2= ID (s2= stochastic_values )? )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==COMMA) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:33: COMMA i2= ID (s2= stochastic_values )?
            	    {
            	    COMMA116=(Token)match(input,COMMA,FOLLOW_COMMA_in_instances1449);  
            	    stream_COMMA.add(COMMA116);

            	    i2=(Token)match(input,ID,FOLLOW_ID_in_instances1453);  
            	    stream_ID.add(i2);

            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:47: (s2= stochastic_values )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==BODY_OPEN) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:291:47: s2= stochastic_values
            	            {
            	            pushFollow(FOLLOW_stochastic_values_in_instances1457);
            	            s2=stochastic_values();

            	            state._fsp--;

            	            stream_stochastic_values.add(s2.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: ID, ID, s1, s2
            // token labels: 
            // rule labels: retval, s2, s1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);
            RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:3: -> ^( INSTANCES ID ( $s1)? ( ID ( $s2)? )* )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:292:6: ^( INSTANCES ID ( $s1)? ( ID ( $s2)? )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTANCES, "INSTANCES"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:292:21: ( $s1)?
                if ( stream_s1.hasNext() ) {
                    adaptor.addChild(root_1, stream_s1.nextTree());

                }
                stream_s1.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:292:26: ( ID ( $s2)? )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:292:30: ( $s2)?
                    if ( stream_s2.hasNext() ) {
                        adaptor.addChild(root_1, stream_s2.nextTree());

                    }
                    stream_s2.reset();

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
    // $ANTLR end "instances"

    public static class stochastic_values_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stochastic_values"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:296:1: stochastic_values : BODY_OPEN ID LABEL_MARK FLOAT ( COMMA ID LABEL_MARK FLOAT )* BODY_CLOSE -> ^( STOCH ( ID FLOAT )+ ) ;
    public final ReoLangParser.stochastic_values_return stochastic_values() throws RecognitionException {
        ReoLangParser.stochastic_values_return retval = new ReoLangParser.stochastic_values_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BODY_OPEN117=null;
        Token ID118=null;
        Token LABEL_MARK119=null;
        Token FLOAT120=null;
        Token COMMA121=null;
        Token ID122=null;
        Token LABEL_MARK123=null;
        Token FLOAT124=null;
        Token BODY_CLOSE125=null;

        Object BODY_OPEN117_tree=null;
        Object ID118_tree=null;
        Object LABEL_MARK119_tree=null;
        Object FLOAT120_tree=null;
        Object COMMA121_tree=null;
        Object ID122_tree=null;
        Object LABEL_MARK123_tree=null;
        Object FLOAT124_tree=null;
        Object BODY_CLOSE125_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_BODY_OPEN=new RewriteRuleTokenStream(adaptor,"token BODY_OPEN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_BODY_CLOSE=new RewriteRuleTokenStream(adaptor,"token BODY_CLOSE");
        RewriteRuleTokenStream stream_LABEL_MARK=new RewriteRuleTokenStream(adaptor,"token LABEL_MARK");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:297:2: ( BODY_OPEN ID LABEL_MARK FLOAT ( COMMA ID LABEL_MARK FLOAT )* BODY_CLOSE -> ^( STOCH ( ID FLOAT )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:297:4: BODY_OPEN ID LABEL_MARK FLOAT ( COMMA ID LABEL_MARK FLOAT )* BODY_CLOSE
            {
            BODY_OPEN117=(Token)match(input,BODY_OPEN,FOLLOW_BODY_OPEN_in_stochastic_values1497);  
            stream_BODY_OPEN.add(BODY_OPEN117);

            ID118=(Token)match(input,ID,FOLLOW_ID_in_stochastic_values1499);  
            stream_ID.add(ID118);

            LABEL_MARK119=(Token)match(input,LABEL_MARK,FOLLOW_LABEL_MARK_in_stochastic_values1501);  
            stream_LABEL_MARK.add(LABEL_MARK119);

            FLOAT120=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_stochastic_values1503);  
            stream_FLOAT.add(FLOAT120);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:297:34: ( COMMA ID LABEL_MARK FLOAT )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==COMMA) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:297:35: COMMA ID LABEL_MARK FLOAT
            	    {
            	    COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_stochastic_values1506);  
            	    stream_COMMA.add(COMMA121);

            	    ID122=(Token)match(input,ID,FOLLOW_ID_in_stochastic_values1508);  
            	    stream_ID.add(ID122);

            	    LABEL_MARK123=(Token)match(input,LABEL_MARK,FOLLOW_LABEL_MARK_in_stochastic_values1510);  
            	    stream_LABEL_MARK.add(LABEL_MARK123);

            	    FLOAT124=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_stochastic_values1512);  
            	    stream_FLOAT.add(FLOAT124);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            BODY_CLOSE125=(Token)match(input,BODY_CLOSE,FOLLOW_BODY_CLOSE_in_stochastic_values1516);  
            stream_BODY_CLOSE.add(BODY_CLOSE125);



            // AST REWRITE
            // elements: FLOAT, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 298:3: -> ^( STOCH ( ID FLOAT )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:298:6: ^( STOCH ( ID FLOAT )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STOCH, "STOCH"), root_1);

                if ( !(stream_FLOAT.hasNext()||stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_FLOAT.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());
                    adaptor.addChild(root_1, stream_FLOAT.nextNode());

                }
                stream_FLOAT.reset();
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
    // $ANTLR end "stochastic_values"

    public static class pattern_compositions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_compositions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:301:1: pattern_compositions : port_definition SEMICOLON ( port_definition SEMICOLON )* ( join_operation SEMICOLON ( join_operation SEMICOLON )* )? -> ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* ) ;
    public final ReoLangParser.pattern_compositions_return pattern_compositions() throws RecognitionException {
        ReoLangParser.pattern_compositions_return retval = new ReoLangParser.pattern_compositions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON127=null;
        Token SEMICOLON129=null;
        Token SEMICOLON131=null;
        Token SEMICOLON133=null;
        ReoLangParser.port_definition_return port_definition126 = null;

        ReoLangParser.port_definition_return port_definition128 = null;

        ReoLangParser.join_operation_return join_operation130 = null;

        ReoLangParser.join_operation_return join_operation132 = null;


        Object SEMICOLON127_tree=null;
        Object SEMICOLON129_tree=null;
        Object SEMICOLON131_tree=null;
        Object SEMICOLON133_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_port_definition=new RewriteRuleSubtreeStream(adaptor,"rule port_definition");
        RewriteRuleSubtreeStream stream_join_operation=new RewriteRuleSubtreeStream(adaptor,"rule join_operation");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:2: ( port_definition SEMICOLON ( port_definition SEMICOLON )* ( join_operation SEMICOLON ( join_operation SEMICOLON )* )? -> ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:5: port_definition SEMICOLON ( port_definition SEMICOLON )* ( join_operation SEMICOLON ( join_operation SEMICOLON )* )?
            {
            pushFollow(FOLLOW_port_definition_in_pattern_compositions1545);
            port_definition126=port_definition();

            state._fsp--;

            stream_port_definition.add(port_definition126.getTree());
            SEMICOLON127=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1547);  
            stream_SEMICOLON.add(SEMICOLON127);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:31: ( port_definition SEMICOLON )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:32: port_definition SEMICOLON
            	    {
            	    pushFollow(FOLLOW_port_definition_in_pattern_compositions1550);
            	    port_definition128=port_definition();

            	    state._fsp--;

            	    stream_port_definition.add(port_definition128.getTree());
            	    SEMICOLON129=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1552);  
            	    stream_SEMICOLON.add(SEMICOLON129);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:60: ( join_operation SEMICOLON ( join_operation SEMICOLON )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RW_JOIN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:61: join_operation SEMICOLON ( join_operation SEMICOLON )*
                    {
                    pushFollow(FOLLOW_join_operation_in_pattern_compositions1557);
                    join_operation130=join_operation();

                    state._fsp--;

                    stream_join_operation.add(join_operation130.getTree());
                    SEMICOLON131=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1559);  
                    stream_SEMICOLON.add(SEMICOLON131);

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:86: ( join_operation SEMICOLON )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RW_JOIN) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:302:87: join_operation SEMICOLON
                    	    {
                    	    pushFollow(FOLLOW_join_operation_in_pattern_compositions1562);
                    	    join_operation132=join_operation();

                    	    state._fsp--;

                    	    stream_join_operation.add(join_operation132.getTree());
                    	    SEMICOLON133=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1564);  
                    	    stream_SEMICOLON.add(SEMICOLON133);


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: port_definition, join_operation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:3: -> ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:303:6: ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN_COMPOSITIONS, "PATTERN_COMPOSITIONS"), root_1);

                if ( !(stream_port_definition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_port_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_port_definition.nextTree());

                }
                stream_port_definition.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:303:46: ( join_operation )*
                while ( stream_join_operation.hasNext() ) {
                    adaptor.addChild(root_1, stream_join_operation.nextTree());

                }
                stream_join_operation.reset();

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
    // $ANTLR end "pattern_compositions"

    public static class port_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:306:1: port_definition : ID EQUALS port_actual_definition -> ^( PORT_DEFINITION ID port_actual_definition ) ;
    public final ReoLangParser.port_definition_return port_definition() throws RecognitionException {
        ReoLangParser.port_definition_return retval = new ReoLangParser.port_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID134=null;
        Token EQUALS135=null;
        ReoLangParser.port_actual_definition_return port_actual_definition136 = null;


        Object ID134_tree=null;
        Object EQUALS135_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_port_actual_definition=new RewriteRuleSubtreeStream(adaptor,"rule port_actual_definition");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:307:2: ( ID EQUALS port_actual_definition -> ^( PORT_DEFINITION ID port_actual_definition ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:307:4: ID EQUALS port_actual_definition
            {
            ID134=(Token)match(input,ID,FOLLOW_ID_in_port_definition1595);  
            stream_ID.add(ID134);

            EQUALS135=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_port_definition1597);  
            stream_EQUALS.add(EQUALS135);

            pushFollow(FOLLOW_port_actual_definition_in_port_definition1599);
            port_actual_definition136=port_actual_definition();

            state._fsp--;

            stream_port_actual_definition.add(port_actual_definition136.getTree());


            // AST REWRITE
            // elements: port_actual_definition, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 308:3: -> ^( PORT_DEFINITION ID port_actual_definition )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:308:6: ^( PORT_DEFINITION ID port_actual_definition )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT_DEFINITION, "PORT_DEFINITION"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_port_actual_definition.nextTree());

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
    // $ANTLR end "port_definition"

    public static class port_actual_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_actual_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:311:1: port_actual_definition : ( port_access -> ^( PORT_ACTUAL_DEFINITION port_access ) | join_part -> ^( PORT_ACTUAL_DEFINITION join_part ) );
    public final ReoLangParser.port_actual_definition_return port_actual_definition() throws RecognitionException {
        ReoLangParser.port_actual_definition_return retval = new ReoLangParser.port_actual_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.port_access_return port_access137 = null;

        ReoLangParser.join_part_return join_part138 = null;


        RewriteRuleSubtreeStream stream_join_part=new RewriteRuleSubtreeStream(adaptor,"rule join_part");
        RewriteRuleSubtreeStream stream_port_access=new RewriteRuleSubtreeStream(adaptor,"rule port_access");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:312:2: ( port_access -> ^( PORT_ACTUAL_DEFINITION port_access ) | join_part -> ^( PORT_ACTUAL_DEFINITION join_part ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RW_JOIN) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:312:5: port_access
                    {
                    pushFollow(FOLLOW_port_access_in_port_actual_definition1624);
                    port_access137=port_access();

                    state._fsp--;

                    stream_port_access.add(port_access137.getTree());


                    // AST REWRITE
                    // elements: port_access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 312:17: -> ^( PORT_ACTUAL_DEFINITION port_access )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:312:20: ^( PORT_ACTUAL_DEFINITION port_access )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT_ACTUAL_DEFINITION, "PORT_ACTUAL_DEFINITION"), root_1);

                        adaptor.addChild(root_1, stream_port_access.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:313:5: join_part
                    {
                    pushFollow(FOLLOW_join_part_in_port_actual_definition1638);
                    join_part138=join_part();

                    state._fsp--;

                    stream_join_part.add(join_part138.getTree());


                    // AST REWRITE
                    // elements: join_part
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 313:15: -> ^( PORT_ACTUAL_DEFINITION join_part )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:313:18: ^( PORT_ACTUAL_DEFINITION join_part )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT_ACTUAL_DEFINITION, "PORT_ACTUAL_DEFINITION"), root_1);

                        adaptor.addChild(root_1, stream_join_part.nextTree());

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
    // $ANTLR end "port_actual_definition"

    public static class port_access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_access"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:316:1: port_access : ID ACCESS_MARK ID -> ^( PORT_ACCESS ID ID ) ;
    public final ReoLangParser.port_access_return port_access() throws RecognitionException {
        ReoLangParser.port_access_return retval = new ReoLangParser.port_access_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID139=null;
        Token ACCESS_MARK140=null;
        Token ID141=null;

        Object ID139_tree=null;
        Object ACCESS_MARK140_tree=null;
        Object ID141_tree=null;
        RewriteRuleTokenStream stream_ACCESS_MARK=new RewriteRuleTokenStream(adaptor,"token ACCESS_MARK");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:317:2: ( ID ACCESS_MARK ID -> ^( PORT_ACCESS ID ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:317:4: ID ACCESS_MARK ID
            {
            ID139=(Token)match(input,ID,FOLLOW_ID_in_port_access1657);  
            stream_ID.add(ID139);

            ACCESS_MARK140=(Token)match(input,ACCESS_MARK,FOLLOW_ACCESS_MARK_in_port_access1659);  
            stream_ACCESS_MARK.add(ACCESS_MARK140);

            ID141=(Token)match(input,ID,FOLLOW_ID_in_port_access1661);  
            stream_ID.add(ID141);



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
            // 318:3: -> ^( PORT_ACCESS ID ID )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:318:6: ^( PORT_ACCESS ID ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT_ACCESS, "PORT_ACCESS"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_ID.nextNode());

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
    // $ANTLR end "port_access"

    public static class join_operation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:321:1: join_operation : join_part RW_AS ID -> ^( JOIN_OP ID join_part ) ;
    public final ReoLangParser.join_operation_return join_operation() throws RecognitionException {
        ReoLangParser.join_operation_return retval = new ReoLangParser.join_operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_AS143=null;
        Token ID144=null;
        ReoLangParser.join_part_return join_part142 = null;


        Object RW_AS143_tree=null;
        Object ID144_tree=null;
        RewriteRuleTokenStream stream_RW_AS=new RewriteRuleTokenStream(adaptor,"token RW_AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_join_part=new RewriteRuleSubtreeStream(adaptor,"rule join_part");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:322:2: ( join_part RW_AS ID -> ^( JOIN_OP ID join_part ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:322:4: join_part RW_AS ID
            {
            pushFollow(FOLLOW_join_part_in_join_operation1685);
            join_part142=join_part();

            state._fsp--;

            stream_join_part.add(join_part142.getTree());
            RW_AS143=(Token)match(input,RW_AS,FOLLOW_RW_AS_in_join_operation1687);  
            stream_RW_AS.add(RW_AS143);

            ID144=(Token)match(input,ID,FOLLOW_ID_in_join_operation1689);  
            stream_ID.add(ID144);



            // AST REWRITE
            // elements: ID, join_part
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 323:3: -> ^( JOIN_OP ID join_part )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:323:6: ^( JOIN_OP ID join_part )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(JOIN_OP, "JOIN_OP"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_join_part.nextTree());

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
    // $ANTLR end "join_operation"

    public static class join_part_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_part"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:326:1: join_part : RW_JOIN port_access_list -> ^( RW_JOIN port_access_list ) ;
    public final ReoLangParser.join_part_return join_part() throws RecognitionException {
        ReoLangParser.join_part_return retval = new ReoLangParser.join_part_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_JOIN145=null;
        ReoLangParser.port_access_list_return port_access_list146 = null;


        Object RW_JOIN145_tree=null;
        RewriteRuleTokenStream stream_RW_JOIN=new RewriteRuleTokenStream(adaptor,"token RW_JOIN");
        RewriteRuleSubtreeStream stream_port_access_list=new RewriteRuleSubtreeStream(adaptor,"rule port_access_list");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:327:2: ( RW_JOIN port_access_list -> ^( RW_JOIN port_access_list ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:327:5: RW_JOIN port_access_list
            {
            RW_JOIN145=(Token)match(input,RW_JOIN,FOLLOW_RW_JOIN_in_join_part1715);  
            stream_RW_JOIN.add(RW_JOIN145);

            pushFollow(FOLLOW_port_access_list_in_join_part1717);
            port_access_list146=port_access_list();

            state._fsp--;

            stream_port_access_list.add(port_access_list146.getTree());


            // AST REWRITE
            // elements: port_access_list, RW_JOIN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 328:3: -> ^( RW_JOIN port_access_list )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:328:6: ^( RW_JOIN port_access_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RW_JOIN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_port_access_list.nextTree());

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
    // $ANTLR end "join_part"

    public static class port_access_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:331:1: port_access_list : ( LIST_OPEN port_access ( COMMA port_access )* LIST_CLOSE -> ^( PORT_ACCESS_LIST ( port_access )+ ) | RW_REMAINING -> ^( PORT_ACCESS_LIST RW_REMAINING ) );
    public final ReoLangParser.port_access_list_return port_access_list() throws RecognitionException {
        ReoLangParser.port_access_list_return retval = new ReoLangParser.port_access_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LIST_OPEN147=null;
        Token COMMA149=null;
        Token LIST_CLOSE151=null;
        Token RW_REMAINING152=null;
        ReoLangParser.port_access_return port_access148 = null;

        ReoLangParser.port_access_return port_access150 = null;


        Object LIST_OPEN147_tree=null;
        Object COMMA149_tree=null;
        Object LIST_CLOSE151_tree=null;
        Object RW_REMAINING152_tree=null;
        RewriteRuleTokenStream stream_LIST_OPEN=new RewriteRuleTokenStream(adaptor,"token LIST_OPEN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RW_REMAINING=new RewriteRuleTokenStream(adaptor,"token RW_REMAINING");
        RewriteRuleTokenStream stream_LIST_CLOSE=new RewriteRuleTokenStream(adaptor,"token LIST_CLOSE");
        RewriteRuleSubtreeStream stream_port_access=new RewriteRuleSubtreeStream(adaptor,"rule port_access");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:332:2: ( LIST_OPEN port_access ( COMMA port_access )* LIST_CLOSE -> ^( PORT_ACCESS_LIST ( port_access )+ ) | RW_REMAINING -> ^( PORT_ACCESS_LIST RW_REMAINING ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LIST_OPEN) ) {
                alt40=1;
            }
            else if ( (LA40_0==RW_REMAINING) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:332:4: LIST_OPEN port_access ( COMMA port_access )* LIST_CLOSE
                    {
                    LIST_OPEN147=(Token)match(input,LIST_OPEN,FOLLOW_LIST_OPEN_in_port_access_list1741);  
                    stream_LIST_OPEN.add(LIST_OPEN147);

                    pushFollow(FOLLOW_port_access_in_port_access_list1743);
                    port_access148=port_access();

                    state._fsp--;

                    stream_port_access.add(port_access148.getTree());
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:332:26: ( COMMA port_access )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==COMMA) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:332:27: COMMA port_access
                    	    {
                    	    COMMA149=(Token)match(input,COMMA,FOLLOW_COMMA_in_port_access_list1746);  
                    	    stream_COMMA.add(COMMA149);

                    	    pushFollow(FOLLOW_port_access_in_port_access_list1748);
                    	    port_access150=port_access();

                    	    state._fsp--;

                    	    stream_port_access.add(port_access150.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    LIST_CLOSE151=(Token)match(input,LIST_CLOSE,FOLLOW_LIST_CLOSE_in_port_access_list1752);  
                    stream_LIST_CLOSE.add(LIST_CLOSE151);



                    // AST REWRITE
                    // elements: port_access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 333:3: -> ^( PORT_ACCESS_LIST ( port_access )+ )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:333:6: ^( PORT_ACCESS_LIST ( port_access )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT_ACCESS_LIST, "PORT_ACCESS_LIST"), root_1);

                        if ( !(stream_port_access.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_port_access.hasNext() ) {
                            adaptor.addChild(root_1, stream_port_access.nextTree());

                        }
                        stream_port_access.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:334:4: RW_REMAINING
                    {
                    RW_REMAINING152=(Token)match(input,RW_REMAINING,FOLLOW_RW_REMAINING_in_port_access_list1768);  
                    stream_RW_REMAINING.add(RW_REMAINING152);



                    // AST REWRITE
                    // elements: RW_REMAINING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 335:3: -> ^( PORT_ACCESS_LIST RW_REMAINING )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangParser.g:335:6: ^( PORT_ACCESS_LIST RW_REMAINING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT_ACCESS_LIST, "PORT_ACCESS_LIST"), root_1);

                        adaptor.addChild(root_1, stream_RW_REMAINING.nextNode());

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
    // $ANTLR end "port_access_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_directive_def_in_reolang251 = new BitSet(new long[]{0x0000000000060802L});
    public static final BitSet FOLLOW_element_in_reolang254 = new BitSet(new long[]{0x0000000000020802L});
    public static final BitSet FOLLOW_channel_def_in_element279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_def_in_element293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_import_in_directive_def317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_IMPORT_in_directive_import338 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_FILE_PATH_in_directive_import340 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_directive_import342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_CHANNEL_in_channel_def373 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_channel_signature_in_channel_def375 = new BitSet(new long[]{0x0000000008001000L});
    public static final BitSet FOLLOW_extension_in_channel_def377 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BODY_OPEN_in_channel_def380 = new BitSet(new long[]{0x0000020080010000L});
    public static final BitSet FOLLOW_channel_body_in_channel_def382 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BODY_CLOSE_in_channel_def384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_channel_signature414 = new BitSet(new long[]{0x0000000C02000000L});
    public static final BitSet FOLLOW_option_in_channel_signature416 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PORTS_OPEN_in_channel_signature419 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_ports_in_channel_signature423 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_channel_signature426 = new BitSet(new long[]{0x0000020005000000L});
    public static final BitSet FOLLOW_ports_in_channel_signature430 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_COLON_in_channel_signature434 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_channel_signature436 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_channel_signature438 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_condition_in_channel_signature440 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PORTS_CLOSE_in_channel_signature444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timed_in_option504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structured_in_option518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_MARK_in_timed538 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_time_in_timed540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_time563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_time580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCTURE_MARK_in_structured604 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_structure_dimension_in_structured606 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_structured609 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_structure_dimension_in_structured611 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ID_in_structure_dimension638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_structure_dimension654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ports677 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_ports680 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_ports682 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COND_OPEN_in_condition709 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_condition711 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_COMMA_in_condition714 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_condition716 = new BitSet(new long[]{0x0000004000800000L});
    public static final BitSet FOLLOW_COND_CLOSE_in_condition720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_EXTENDS_in_extension742 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_extension744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_def_in_channel_body765 = new BitSet(new long[]{0x0000020080010000L});
    public static final BitSet FOLLOW_flow_def_in_channel_body768 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_channel_body770 = new BitSet(new long[]{0x0000020080010002L});
    public static final BitSet FOLLOW_flow_def_in_channel_body773 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_channel_body775 = new BitSet(new long[]{0x0000020080010002L});
    public static final BitSet FOLLOW_RW_STATE_in_state_def809 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_state_def811 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_state_def813 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_state_def815 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RW_OBSERVERS_in_state_def817 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_state_def819 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_state_def821 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_COMMA_in_state_def824 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_state_def826 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_SEMICOLON_in_state_def830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requests_in_flow_def865 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ARROW_MARK_in_flow_def867 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_flow_type_in_flow_def869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_request_in_requests894 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_requests897 = new BitSet(new long[]{0x0000020080010000L});
    public static final BitSet FOLLOW_request_in_requests899 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ID_in_request924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_MARK_in_request937 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_request939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type962 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_flow_operation_in_flow_type965 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type967 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_flow_label_in_flow_type971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_flow_in_flow_type997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_FLOW_in_normal_flow1020 = new BitSet(new long[]{0x0000020000000400L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow1022 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RW_TO_in_normal_flow1024 = new BitSet(new long[]{0x0000020800000400L});
    public static final BitSet FOLLOW_timed_in_normal_flow1026 = new BitSet(new long[]{0x0000020000000400L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_flow_point1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_NULL_in_flow_point1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SYNC_in_flow_operation1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_if_flow1117 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_if_flow1119 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_flow_type_in_if_flow1121 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_flow_label_in_if_flow1125 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_if_flow1128 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_flow_type_in_if_flow1130 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_flow_label_in_if_flow1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_MARK_in_flow_label1181 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_flow_label1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_PATTERN_in_pattern_def1211 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_pattern_signature_in_pattern_def1213 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_BODY_OPEN_in_pattern_def1215 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_pattern_body_in_pattern_def1217 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BODY_CLOSE_in_pattern_def1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pattern_signature1245 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_PORTS_OPEN_in_pattern_signature1247 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_ports_in_pattern_signature1251 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pattern_signature1254 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_ports_in_pattern_signature1258 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PORTS_CLOSE_in_pattern_signature1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_USE_in_pattern_body1309 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pattern_body1311 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_pattern_declarations_in_pattern_body1313 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RW_IN_in_pattern_body1315 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COLON_in_pattern_body1317 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_pattern_compositions_in_pattern_body1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations1343 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_declarations1345 = new BitSet(new long[]{0x0000020002000002L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations1348 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_declarations1350 = new BitSet(new long[]{0x0000020002000002L});
    public static final BitSet FOLLOW_reference_signature_in_declaration1376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RW_AS_in_declaration1378 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_instances_in_declaration1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PORTS_OPEN_in_reference_signature1405 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_reference_signature1407 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PORTS_CLOSE_in_reference_signature1409 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_channel_signature_in_reference_signature1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instances1441 = new BitSet(new long[]{0x0000000008800002L});
    public static final BitSet FOLLOW_stochastic_values_in_instances1445 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_COMMA_in_instances1449 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_instances1453 = new BitSet(new long[]{0x0000000008800002L});
    public static final BitSet FOLLOW_stochastic_values_in_instances1457 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_BODY_OPEN_in_stochastic_values1497 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_stochastic_values1499 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LABEL_MARK_in_stochastic_values1501 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stochastic_values1503 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_COMMA_in_stochastic_values1506 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_stochastic_values1508 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_LABEL_MARK_in_stochastic_values1510 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stochastic_values1512 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_BODY_CLOSE_in_stochastic_values1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions1545 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1547 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions1550 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1552 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions1557 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1559 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions1562 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1564 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ID_in_port_definition1595 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUALS_in_port_definition1597 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_port_actual_definition_in_port_definition1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_port_access_in_port_actual_definition1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_part_in_port_actual_definition1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_port_access1657 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ACCESS_MARK_in_port_access1659 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_port_access1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_part_in_join_operation1685 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RW_AS_in_join_operation1687 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_join_operation1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_JOIN_in_join_part1715 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_port_access_list_in_join_part1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_OPEN_in_port_access_list1741 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_port_access_in_port_access_list1743 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_COMMA_in_port_access_list1746 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_port_access_in_port_access_list1748 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_LIST_CLOSE_in_port_access_list1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_REMAINING_in_port_access_list1768 = new BitSet(new long[]{0x0000000000000002L});

}