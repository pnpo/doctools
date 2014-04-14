// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g 2014-04-14 15:00:46

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_DECIDE", "RW_JOIN", "RW_AS", "RW_OF", "RW_USE", "RW_IN", "RW_NULL", "RW_PATTERN", "RW_EXTENDS", "RW_FLOW", "RW_TO", "RW_OBSERVERS", "RW_STATE", "RW_CHANNEL", "RW_IMPORT", "RW_STOCHASTIC", "LIST_OPEN", "LIST_CLOSE", "EQUALS", "SEMICOLON", "COMMA", "COLON", "PORTS_OPEN", "PORTS_CLOSE", "BODY_OPEN", "BODY_CLOSE", "ACCESS_MARK", "QUESTION_MARK", "NOT_MARK", "ARROW_MARK", "LABEL_MARK", "STRUCTURE_MARK", "TIME_MARK", "OP_SYNC", "COND_OPEN", "COND_CLOSE", "STRING", "FILE_PATH", "ID", "INT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "REO_LANG", "ELEMENT", "DIRECTIVE", "IMPORT", "CHANNEL", "SIGNATURE", "OPTION", "TIMED", "TIME", "STRUCTURED", "DIMENSION", "CHANNEL_PORTS", "IN_PORTS", "OUT_PORTS", "PORT", "CONDITION", "COND_ELEMENTS", "EXTENSION", "CHANNEL_BODY", "FLOWS", "CHANNEL_STATE", "STATE_REF", "STATE_OBS", "FLOW", "REQUESTS", "REQUEST", "FLOW_TYPE", "NORMAL_FLOW", "FLOW_POINT", "FLOW_OP", "IF_FLOW", "FLOW_TRUE", "FLOW_FALSE", "PATTERN", "PATTERN_SIGNATURE", "PATTERN_PORTS", "PATTERN_BODY", "PATTERN_DECLARATIONS", "DECLARATION", "INSTANCES", "DECLARATION_TYPE", "PATTERN_COMPOSITIONS", "PORT_DEFINITION", "PORT_ACTUAL_DEFINITION", "PORT_ACCESS", "JOIN_OP", "PORT_ACCESS_LIST", "STOCH", "STOCH_VAL"
    };
    public static final int PATTERN_PORTS=86;
    public static final int IN_PORTS=63;
    public static final int PORT_ACTUAL_DEFINITION=94;
    public static final int INSTANCES=90;
    public static final int STOCH=98;
    public static final int OCTAL_ESC=50;
    public static final int CONDITION=66;
    public static final int EQUALS=22;
    public static final int RW_USE=8;
    public static final int RW_FLOW=13;
    public static final int FLOW_TYPE=77;
    public static final int PATTERN_DECLARATIONS=88;
    public static final int EOF=-1;
    public static final int RW_CHANNEL=17;
    public static final int PATTERN_COMPOSITIONS=92;
    public static final int PATTERN=84;
    public static final int ARROW_MARK=33;
    public static final int IMPORT=54;
    public static final int RW_TO=14;
    public static final int COND_OPEN=38;
    public static final int ACCESS_MARK=30;
    public static final int RW_JOIN=5;
    public static final int STRUCTURED=60;
    public static final int FLOWS=70;
    public static final int RW_NULL=10;
    public static final int QUESTION_MARK=31;
    public static final int ELEMENT=52;
    public static final int CHANNEL=55;
    public static final int DIMENSION=61;
    public static final int COND_ELEMENTS=67;
    public static final int FLOW_TRUE=82;
    public static final int LIST_OPEN=20;
    public static final int RW_EXTENDS=12;
    public static final int COMMENT=45;
    public static final int PORTS_OPEN=26;
    public static final int REO_LANG=51;
    public static final int BODY_OPEN=28;
    public static final int REQUESTS=75;
    public static final int IF_FLOW=81;
    public static final int RW_STOCHASTIC=19;
    public static final int PATTERN_BODY=87;
    public static final int INT=43;
    public static final int SEMICOLON=23;
    public static final int SIGNATURE=56;
    public static final int WS=46;
    public static final int NOT_MARK=32;
    public static final int FLOW=74;
    public static final int FLOW_FALSE=83;
    public static final int STRUCTURE_MARK=35;
    public static final int BODY_CLOSE=29;
    public static final int NORMAL_FLOW=78;
    public static final int STOCH_VAL=99;
    public static final int OPTION=57;
    public static final int RW_PATTERN=11;
    public static final int RW_OF=7;
    public static final int DECLARATION_TYPE=91;
    public static final int PORTS_CLOSE=27;
    public static final int FLOAT=44;
    public static final int ID=42;
    public static final int DIRECTIVE=53;
    public static final int DECLARATION=89;
    public static final int LABEL_MARK=34;
    public static final int TIME=59;
    public static final int ESC_SEQ=47;
    public static final int COMMA=24;
    public static final int CHANNEL_STATE=71;
    public static final int RW_IMPORT=18;
    public static final int RW_OBSERVERS=15;
    public static final int COND_CLOSE=39;
    public static final int PORT_DEFINITION=93;
    public static final int TIMED=58;
    public static final int UNICODE_ESC=49;
    public static final int HEX_DIGIT=48;
    public static final int PORT=65;
    public static final int TIME_MARK=36;
    public static final int RW_AS=6;
    public static final int STATE_REF=72;
    public static final int OP_SYNC=37;
    public static final int CHANNEL_BODY=69;
    public static final int LIST_CLOSE=21;
    public static final int JOIN_OP=96;
    public static final int CHANNEL_PORTS=62;
    public static final int FLOW_OP=80;
    public static final int COLON=25;
    public static final int OUT_PORTS=64;
    public static final int PATTERN_SIGNATURE=85;
    public static final int REQUEST=76;
    public static final int RW_STATE=16;
    public static final int STATE_OBS=73;
    public static final int PORT_ACCESS_LIST=97;
    public static final int FLOW_POINT=79;
    public static final int RW_DECIDE=4;
    public static final int RW_IN=9;
    public static final int PORT_ACCESS=95;
    public static final int EXTENSION=68;
    public static final int FILE_PATH=41;
    public static final int STRING=40;

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
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g"; }


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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:95:1: reolang : ( directive_def )* ( element )* -> ^( REO_LANG ( directive_def )* ( element )* ) ;
    public final ReoLangParser.reolang_return reolang() throws RecognitionException {
        ReoLangParser.reolang_return retval = new ReoLangParser.reolang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.directive_def_return directive_def1 = null;

        ReoLangParser.element_return element2 = null;


        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        RewriteRuleSubtreeStream stream_directive_def=new RewriteRuleSubtreeStream(adaptor,"rule directive_def");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:2: ( ( directive_def )* ( element )* -> ^( REO_LANG ( directive_def )* ( element )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:4: ( directive_def )* ( element )*
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:4: ( directive_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RW_IMPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:4: directive_def
            	    {
            	    pushFollow(FOLLOW_directive_def_in_reolang255);
            	    directive_def1=directive_def();

            	    state._fsp--;

            	    stream_directive_def.add(directive_def1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:19: ( element )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RW_PATTERN||LA2_0==RW_CHANNEL||LA2_0==RW_STOCHASTIC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:19: element
            	    {
            	    pushFollow(FOLLOW_element_in_reolang258);
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
            // 96:28: -> ^( REO_LANG ( directive_def )* ( element )* )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:31: ^( REO_LANG ( directive_def )* ( element )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(REO_LANG, "REO_LANG"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:42: ( directive_def )*
                while ( stream_directive_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_directive_def.nextTree());

                }
                stream_directive_def.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:96:57: ( element )*
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:99:1: element : ( channel_def -> ^( ELEMENT channel_def ) | pattern_def -> ^( ELEMENT pattern_def ) | stochastic_def -> ^( ELEMENT stochastic_def ) );
    public final ReoLangParser.element_return element() throws RecognitionException {
        ReoLangParser.element_return retval = new ReoLangParser.element_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.channel_def_return channel_def3 = null;

        ReoLangParser.pattern_def_return pattern_def4 = null;

        ReoLangParser.stochastic_def_return stochastic_def5 = null;


        RewriteRuleSubtreeStream stream_channel_def=new RewriteRuleSubtreeStream(adaptor,"rule channel_def");
        RewriteRuleSubtreeStream stream_pattern_def=new RewriteRuleSubtreeStream(adaptor,"rule pattern_def");
        RewriteRuleSubtreeStream stream_stochastic_def=new RewriteRuleSubtreeStream(adaptor,"rule stochastic_def");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:100:2: ( channel_def -> ^( ELEMENT channel_def ) | pattern_def -> ^( ELEMENT pattern_def ) | stochastic_def -> ^( ELEMENT stochastic_def ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RW_CHANNEL:
                {
                alt3=1;
                }
                break;
            case RW_PATTERN:
                {
                alt3=2;
                }
                break;
            case RW_STOCHASTIC:
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:100:4: channel_def
                    {
                    pushFollow(FOLLOW_channel_def_in_element283);
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
                    // 100:17: -> ^( ELEMENT channel_def )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:100:20: ^( ELEMENT channel_def )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:101:4: pattern_def
                    {
                    pushFollow(FOLLOW_pattern_def_in_element297);
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
                    // 101:17: -> ^( ELEMENT pattern_def )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:101:20: ^( ELEMENT pattern_def )
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
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:102:4: stochastic_def
                    {
                    pushFollow(FOLLOW_stochastic_def_in_element311);
                    stochastic_def5=stochastic_def();

                    state._fsp--;

                    stream_stochastic_def.add(stochastic_def5.getTree());


                    // AST REWRITE
                    // elements: stochastic_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:20: -> ^( ELEMENT stochastic_def )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:102:23: ^( ELEMENT stochastic_def )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELEMENT, "ELEMENT"), root_1);

                        adaptor.addChild(root_1, stream_stochastic_def.nextTree());

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:109:1: directive_def : directive_import -> ^( DIRECTIVE directive_import ) ;
    public final ReoLangParser.directive_def_return directive_def() throws RecognitionException {
        ReoLangParser.directive_def_return retval = new ReoLangParser.directive_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.directive_import_return directive_import6 = null;


        RewriteRuleSubtreeStream stream_directive_import=new RewriteRuleSubtreeStream(adaptor,"rule directive_import");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:110:2: ( directive_import -> ^( DIRECTIVE directive_import ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:110:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def335);
            directive_import6=directive_import();

            state._fsp--;

            stream_directive_import.add(directive_import6.getTree());


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
            // 110:21: -> ^( DIRECTIVE directive_import )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:110:24: ^( DIRECTIVE directive_import )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:114:1: directive_import : RW_IMPORT FILE_PATH SEMICOLON -> ^( IMPORT FILE_PATH ) ;
    public final ReoLangParser.directive_import_return directive_import() throws RecognitionException {
        ReoLangParser.directive_import_return retval = new ReoLangParser.directive_import_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_IMPORT7=null;
        Token FILE_PATH8=null;
        Token SEMICOLON9=null;

        Object RW_IMPORT7_tree=null;
        Object FILE_PATH8_tree=null;
        Object SEMICOLON9_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_RW_IMPORT=new RewriteRuleTokenStream(adaptor,"token RW_IMPORT");
        RewriteRuleTokenStream stream_FILE_PATH=new RewriteRuleTokenStream(adaptor,"token FILE_PATH");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:115:2: ( RW_IMPORT FILE_PATH SEMICOLON -> ^( IMPORT FILE_PATH ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:115:4: RW_IMPORT FILE_PATH SEMICOLON
            {
            RW_IMPORT7=(Token)match(input,RW_IMPORT,FOLLOW_RW_IMPORT_in_directive_import356);  
            stream_RW_IMPORT.add(RW_IMPORT7);

            FILE_PATH8=(Token)match(input,FILE_PATH,FOLLOW_FILE_PATH_in_directive_import358);  
            stream_FILE_PATH.add(FILE_PATH8);

            SEMICOLON9=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_directive_import360);  
            stream_SEMICOLON.add(SEMICOLON9);



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
            // 115:34: -> ^( IMPORT FILE_PATH )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:115:37: ^( IMPORT FILE_PATH )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:129:1: channel_def : RW_CHANNEL channel_signature ( extension )? BODY_OPEN channel_body BODY_CLOSE -> ^( CHANNEL channel_signature ( extension )? channel_body ) ;
    public final ReoLangParser.channel_def_return channel_def() throws RecognitionException {
        ReoLangParser.channel_def_return retval = new ReoLangParser.channel_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_CHANNEL10=null;
        Token BODY_OPEN13=null;
        Token BODY_CLOSE15=null;
        ReoLangParser.channel_signature_return channel_signature11 = null;

        ReoLangParser.extension_return extension12 = null;

        ReoLangParser.channel_body_return channel_body14 = null;


        Object RW_CHANNEL10_tree=null;
        Object BODY_OPEN13_tree=null;
        Object BODY_CLOSE15_tree=null;
        RewriteRuleTokenStream stream_BODY_OPEN=new RewriteRuleTokenStream(adaptor,"token BODY_OPEN");
        RewriteRuleTokenStream stream_RW_CHANNEL=new RewriteRuleTokenStream(adaptor,"token RW_CHANNEL");
        RewriteRuleTokenStream stream_BODY_CLOSE=new RewriteRuleTokenStream(adaptor,"token BODY_CLOSE");
        RewriteRuleSubtreeStream stream_extension=new RewriteRuleSubtreeStream(adaptor,"rule extension");
        RewriteRuleSubtreeStream stream_channel_body=new RewriteRuleSubtreeStream(adaptor,"rule channel_body");
        RewriteRuleSubtreeStream stream_channel_signature=new RewriteRuleSubtreeStream(adaptor,"rule channel_signature");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:130:2: ( RW_CHANNEL channel_signature ( extension )? BODY_OPEN channel_body BODY_CLOSE -> ^( CHANNEL channel_signature ( extension )? channel_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:130:4: RW_CHANNEL channel_signature ( extension )? BODY_OPEN channel_body BODY_CLOSE
            {
            RW_CHANNEL10=(Token)match(input,RW_CHANNEL,FOLLOW_RW_CHANNEL_in_channel_def391);  
            stream_RW_CHANNEL.add(RW_CHANNEL10);

            pushFollow(FOLLOW_channel_signature_in_channel_def393);
            channel_signature11=channel_signature();

            state._fsp--;

            stream_channel_signature.add(channel_signature11.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:130:33: ( extension )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RW_EXTENDS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:130:33: extension
                    {
                    pushFollow(FOLLOW_extension_in_channel_def395);
                    extension12=extension();

                    state._fsp--;

                    stream_extension.add(extension12.getTree());

                    }
                    break;

            }

            BODY_OPEN13=(Token)match(input,BODY_OPEN,FOLLOW_BODY_OPEN_in_channel_def398);  
            stream_BODY_OPEN.add(BODY_OPEN13);

            pushFollow(FOLLOW_channel_body_in_channel_def400);
            channel_body14=channel_body();

            state._fsp--;

            stream_channel_body.add(channel_body14.getTree());
            BODY_CLOSE15=(Token)match(input,BODY_CLOSE,FOLLOW_BODY_CLOSE_in_channel_def402);  
            stream_BODY_CLOSE.add(BODY_CLOSE15);



            // AST REWRITE
            // elements: channel_body, channel_signature, extension
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 131:3: -> ^( CHANNEL channel_signature ( extension )? channel_body )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:131:6: ^( CHANNEL channel_signature ( extension )? channel_body )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL, "CHANNEL"), root_1);

                adaptor.addChild(root_1, stream_channel_signature.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:131:34: ( extension )?
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:136:1: channel_signature : ID ( option )? PORTS_OPEN (in= ports )? COLON (out= ports )? ( COLON ID EQUALS condition )? PORTS_CLOSE -> ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? ) ;
    public final ReoLangParser.channel_signature_return channel_signature() throws RecognitionException {
        ReoLangParser.channel_signature_return retval = new ReoLangParser.channel_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID16=null;
        Token PORTS_OPEN18=null;
        Token COLON19=null;
        Token COLON20=null;
        Token ID21=null;
        Token EQUALS22=null;
        Token PORTS_CLOSE24=null;
        ReoLangParser.ports_return in = null;

        ReoLangParser.ports_return out = null;

        ReoLangParser.option_return option17 = null;

        ReoLangParser.condition_return condition23 = null;


        Object ID16_tree=null;
        Object PORTS_OPEN18_tree=null;
        Object COLON19_tree=null;
        Object COLON20_tree=null;
        Object ID21_tree=null;
        Object EQUALS22_tree=null;
        Object PORTS_CLOSE24_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PORTS_OPEN=new RewriteRuleTokenStream(adaptor,"token PORTS_OPEN");
        RewriteRuleTokenStream stream_PORTS_CLOSE=new RewriteRuleTokenStream(adaptor,"token PORTS_CLOSE");
        RewriteRuleSubtreeStream stream_ports=new RewriteRuleSubtreeStream(adaptor,"rule ports");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:2: ( ID ( option )? PORTS_OPEN (in= ports )? COLON (out= ports )? ( COLON ID EQUALS condition )? PORTS_CLOSE -> ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:4: ID ( option )? PORTS_OPEN (in= ports )? COLON (out= ports )? ( COLON ID EQUALS condition )? PORTS_CLOSE
            {
            ID16=(Token)match(input,ID,FOLLOW_ID_in_channel_signature432);  
            stream_ID.add(ID16);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:7: ( option )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=STRUCTURE_MARK && LA5_0<=TIME_MARK)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:7: option
                    {
                    pushFollow(FOLLOW_option_in_channel_signature434);
                    option17=option();

                    state._fsp--;

                    stream_option.add(option17.getTree());

                    }
                    break;

            }

            PORTS_OPEN18=(Token)match(input,PORTS_OPEN,FOLLOW_PORTS_OPEN_in_channel_signature437);  
            stream_PORTS_OPEN.add(PORTS_OPEN18);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:28: (in= ports )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:28: in= ports
                    {
                    pushFollow(FOLLOW_ports_in_channel_signature441);
                    in=ports();

                    state._fsp--;

                    stream_ports.add(in.getTree());

                    }
                    break;

            }

            COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_channel_signature444);  
            stream_COLON.add(COLON19);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:45: (out= ports )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:45: out= ports
                    {
                    pushFollow(FOLLOW_ports_in_channel_signature448);
                    out=ports();

                    state._fsp--;

                    stream_ports.add(out.getTree());

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:53: ( COLON ID EQUALS condition )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==COLON) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:137:54: COLON ID EQUALS condition
                    {
                    COLON20=(Token)match(input,COLON,FOLLOW_COLON_in_channel_signature452);  
                    stream_COLON.add(COLON20);

                    ID21=(Token)match(input,ID,FOLLOW_ID_in_channel_signature454);  
                    stream_ID.add(ID21);

                    EQUALS22=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_channel_signature456);  
                    stream_EQUALS.add(EQUALS22);

                    pushFollow(FOLLOW_condition_in_channel_signature458);
                    condition23=condition();

                    state._fsp--;

                    stream_condition.add(condition23.getTree());

                    }
                    break;

            }

            PORTS_CLOSE24=(Token)match(input,PORTS_CLOSE,FOLLOW_PORTS_CLOSE_in_channel_signature462);  
            stream_PORTS_CLOSE.add(PORTS_CLOSE24);



            // AST REWRITE
            // elements: condition, option, in, ID, out, ID
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
            // 138:3: -> ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:6: ^( SIGNATURE ID ( option )? ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ( ^( CONDITION ID condition ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIGNATURE, "SIGNATURE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:21: ( option )?
                if ( stream_option.hasNext() ) {
                    adaptor.addChild(root_1, stream_option.nextTree());

                }
                stream_option.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:29: ^( CHANNEL_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL_PORTS, "CHANNEL_PORTS"), root_2);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:45: ( ^( IN_PORTS $in) )?
                if ( stream_in.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:46: ^( IN_PORTS $in)
                    {
                    Object root_3 = (Object)adaptor.nil();
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_PORTS, "IN_PORTS"), root_3);

                    adaptor.addChild(root_3, stream_in.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_in.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:64: ( ^( OUT_PORTS $out) )?
                if ( stream_out.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:65: ^( OUT_PORTS $out)
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
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:86: ( ^( CONDITION ID condition ) )?
                if ( stream_condition.hasNext()||stream_ID.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:138:87: ^( CONDITION ID condition )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITION, "CONDITION"), root_2);

                    adaptor.addChild(root_2, stream_ID.nextNode());
                    adaptor.addChild(root_2, stream_condition.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_condition.reset();
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
    // $ANTLR end "channel_signature"

    public static class option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:142:1: option : ( timed -> ^( OPTION timed ) | structured -> ^( OPTION structured ) );
    public final ReoLangParser.option_return option() throws RecognitionException {
        ReoLangParser.option_return retval = new ReoLangParser.option_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.timed_return timed25 = null;

        ReoLangParser.structured_return structured26 = null;


        RewriteRuleSubtreeStream stream_timed=new RewriteRuleSubtreeStream(adaptor,"rule timed");
        RewriteRuleSubtreeStream stream_structured=new RewriteRuleSubtreeStream(adaptor,"rule structured");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:143:2: ( timed -> ^( OPTION timed ) | structured -> ^( OPTION structured ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:143:4: timed
                    {
                    pushFollow(FOLLOW_timed_in_option522);
                    timed25=timed();

                    state._fsp--;

                    stream_timed.add(timed25.getTree());


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
                    // 143:11: -> ^( OPTION timed )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:143:14: ^( OPTION timed )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:144:4: structured
                    {
                    pushFollow(FOLLOW_structured_in_option536);
                    structured26=structured();

                    state._fsp--;

                    stream_structured.add(structured26.getTree());


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
                    // 144:15: -> ^( OPTION structured )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:144:18: ^( OPTION structured )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:148:1: timed : TIME_MARK time -> ^( TIMED time ) ;
    public final ReoLangParser.timed_return timed() throws RecognitionException {
        ReoLangParser.timed_return retval = new ReoLangParser.timed_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TIME_MARK27=null;
        ReoLangParser.time_return time28 = null;


        Object TIME_MARK27_tree=null;
        RewriteRuleTokenStream stream_TIME_MARK=new RewriteRuleTokenStream(adaptor,"token TIME_MARK");
        RewriteRuleSubtreeStream stream_time=new RewriteRuleSubtreeStream(adaptor,"rule time");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:149:2: ( TIME_MARK time -> ^( TIMED time ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:149:4: TIME_MARK time
            {
            TIME_MARK27=(Token)match(input,TIME_MARK,FOLLOW_TIME_MARK_in_timed556);  
            stream_TIME_MARK.add(TIME_MARK27);

            pushFollow(FOLLOW_time_in_timed558);
            time28=time();

            state._fsp--;

            stream_time.add(time28.getTree());


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
            // 150:3: -> ^( TIMED time )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:150:6: ^( TIMED time )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:154:1: time : ( ID -> ^( TIME ID ) | INT -> ^( TIME INT ) );
    public final ReoLangParser.time_return time() throws RecognitionException {
        ReoLangParser.time_return retval = new ReoLangParser.time_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID29=null;
        Token INT30=null;

        Object ID29_tree=null;
        Object INT30_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:155:2: ( ID -> ^( TIME ID ) | INT -> ^( TIME INT ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:155:4: ID
                    {
                    ID29=(Token)match(input,ID,FOLLOW_ID_in_time581);  
                    stream_ID.add(ID29);



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
                    // 155:11: -> ^( TIME ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:155:14: ^( TIME ID )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:156:4: INT
                    {
                    INT30=(Token)match(input,INT,FOLLOW_INT_in_time598);  
                    stream_INT.add(INT30);



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
                    // 156:11: -> ^( TIME INT )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:156:14: ^( TIME INT )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:160:1: structured : STRUCTURE_MARK structure_dimension ( COMMA structure_dimension )* -> ^( STRUCTURED ( structure_dimension )+ ) ;
    public final ReoLangParser.structured_return structured() throws RecognitionException {
        ReoLangParser.structured_return retval = new ReoLangParser.structured_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRUCTURE_MARK31=null;
        Token COMMA33=null;
        ReoLangParser.structure_dimension_return structure_dimension32 = null;

        ReoLangParser.structure_dimension_return structure_dimension34 = null;


        Object STRUCTURE_MARK31_tree=null;
        Object COMMA33_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_STRUCTURE_MARK=new RewriteRuleTokenStream(adaptor,"token STRUCTURE_MARK");
        RewriteRuleSubtreeStream stream_structure_dimension=new RewriteRuleSubtreeStream(adaptor,"rule structure_dimension");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:161:2: ( STRUCTURE_MARK structure_dimension ( COMMA structure_dimension )* -> ^( STRUCTURED ( structure_dimension )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:161:4: STRUCTURE_MARK structure_dimension ( COMMA structure_dimension )*
            {
            STRUCTURE_MARK31=(Token)match(input,STRUCTURE_MARK,FOLLOW_STRUCTURE_MARK_in_structured622);  
            stream_STRUCTURE_MARK.add(STRUCTURE_MARK31);

            pushFollow(FOLLOW_structure_dimension_in_structured624);
            structure_dimension32=structure_dimension();

            state._fsp--;

            stream_structure_dimension.add(structure_dimension32.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:161:39: ( COMMA structure_dimension )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:161:40: COMMA structure_dimension
            	    {
            	    COMMA33=(Token)match(input,COMMA,FOLLOW_COMMA_in_structured627);  
            	    stream_COMMA.add(COMMA33);

            	    pushFollow(FOLLOW_structure_dimension_in_structured629);
            	    structure_dimension34=structure_dimension();

            	    state._fsp--;

            	    stream_structure_dimension.add(structure_dimension34.getTree());

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
            // 162:3: -> ^( STRUCTURED ( structure_dimension )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:162:6: ^( STRUCTURED ( structure_dimension )+ )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:166:1: structure_dimension : ( ID -> ^( DIMENSION ID ) | INT -> ^( DIMENSION INT ) );
    public final ReoLangParser.structure_dimension_return structure_dimension() throws RecognitionException {
        ReoLangParser.structure_dimension_return retval = new ReoLangParser.structure_dimension_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID35=null;
        Token INT36=null;

        Object ID35_tree=null;
        Object INT36_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:167:2: ( ID -> ^( DIMENSION ID ) | INT -> ^( DIMENSION INT ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:167:4: ID
                    {
                    ID35=(Token)match(input,ID,FOLLOW_ID_in_structure_dimension656);  
                    stream_ID.add(ID35);



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
                    // 167:10: -> ^( DIMENSION ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:167:13: ^( DIMENSION ID )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:168:4: INT
                    {
                    INT36=(Token)match(input,INT,FOLLOW_INT_in_structure_dimension672);  
                    stream_INT.add(INT36);



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
                    // 168:11: -> ^( DIMENSION INT )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:168:14: ^( DIMENSION INT )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:172:1: ports : ID ( COMMA ID )* -> ^( PORT ( ID )+ ) ;
    public final ReoLangParser.ports_return ports() throws RecognitionException {
        ReoLangParser.ports_return retval = new ReoLangParser.ports_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID37=null;
        Token COMMA38=null;
        Token ID39=null;

        Object ID37_tree=null;
        Object COMMA38_tree=null;
        Object ID39_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:173:2: ( ID ( COMMA ID )* -> ^( PORT ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:173:4: ID ( COMMA ID )*
            {
            ID37=(Token)match(input,ID,FOLLOW_ID_in_ports695);  
            stream_ID.add(ID37);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:173:7: ( COMMA ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:173:8: COMMA ID
            	    {
            	    COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_ports698);  
            	    stream_COMMA.add(COMMA38);

            	    ID39=(Token)match(input,ID,FOLLOW_ID_in_ports700);  
            	    stream_ID.add(ID39);


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
            // 173:20: -> ^( PORT ( ID )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:173:23: ^( PORT ( ID )+ )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:177:1: condition : COND_OPEN ID ( COMMA ID )* COND_CLOSE -> ^( COND_ELEMENTS ( ID )+ ) ;
    public final ReoLangParser.condition_return condition() throws RecognitionException {
        ReoLangParser.condition_return retval = new ReoLangParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COND_OPEN40=null;
        Token ID41=null;
        Token COMMA42=null;
        Token ID43=null;
        Token COND_CLOSE44=null;

        Object COND_OPEN40_tree=null;
        Object ID41_tree=null;
        Object COMMA42_tree=null;
        Object ID43_tree=null;
        Object COND_CLOSE44_tree=null;
        RewriteRuleTokenStream stream_COND_OPEN=new RewriteRuleTokenStream(adaptor,"token COND_OPEN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COND_CLOSE=new RewriteRuleTokenStream(adaptor,"token COND_CLOSE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:178:2: ( COND_OPEN ID ( COMMA ID )* COND_CLOSE -> ^( COND_ELEMENTS ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:178:4: COND_OPEN ID ( COMMA ID )* COND_CLOSE
            {
            COND_OPEN40=(Token)match(input,COND_OPEN,FOLLOW_COND_OPEN_in_condition727);  
            stream_COND_OPEN.add(COND_OPEN40);

            ID41=(Token)match(input,ID,FOLLOW_ID_in_condition729);  
            stream_ID.add(ID41);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:178:17: ( COMMA ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:178:18: COMMA ID
            	    {
            	    COMMA42=(Token)match(input,COMMA,FOLLOW_COMMA_in_condition732);  
            	    stream_COMMA.add(COMMA42);

            	    ID43=(Token)match(input,ID,FOLLOW_ID_in_condition734);  
            	    stream_ID.add(ID43);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            COND_CLOSE44=(Token)match(input,COND_CLOSE,FOLLOW_COND_CLOSE_in_condition738);  
            stream_COND_CLOSE.add(COND_CLOSE44);



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
            // 178:40: -> ^( COND_ELEMENTS ( ID )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:178:43: ^( COND_ELEMENTS ( ID )+ )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:182:1: extension : RW_EXTENDS ID -> ^( EXTENSION ID ) ;
    public final ReoLangParser.extension_return extension() throws RecognitionException {
        ReoLangParser.extension_return retval = new ReoLangParser.extension_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_EXTENDS45=null;
        Token ID46=null;

        Object RW_EXTENDS45_tree=null;
        Object ID46_tree=null;
        RewriteRuleTokenStream stream_RW_EXTENDS=new RewriteRuleTokenStream(adaptor,"token RW_EXTENDS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:183:2: ( RW_EXTENDS ID -> ^( EXTENSION ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:183:4: RW_EXTENDS ID
            {
            RW_EXTENDS45=(Token)match(input,RW_EXTENDS,FOLLOW_RW_EXTENDS_in_extension760);  
            stream_RW_EXTENDS.add(RW_EXTENDS45);

            ID46=(Token)match(input,ID,FOLLOW_ID_in_extension762);  
            stream_ID.add(ID46);



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
            // 183:18: -> ^( EXTENSION ID )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:183:21: ^( EXTENSION ID )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:187:1: channel_body : ( state_def )? flow_def SEMICOLON ( flow_def SEMICOLON )* -> ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) ;
    public final ReoLangParser.channel_body_return channel_body() throws RecognitionException {
        ReoLangParser.channel_body_return retval = new ReoLangParser.channel_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON49=null;
        Token SEMICOLON51=null;
        ReoLangParser.state_def_return state_def47 = null;

        ReoLangParser.flow_def_return flow_def48 = null;

        ReoLangParser.flow_def_return flow_def50 = null;


        Object SEMICOLON49_tree=null;
        Object SEMICOLON51_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_flow_def=new RewriteRuleSubtreeStream(adaptor,"rule flow_def");
        RewriteRuleSubtreeStream stream_state_def=new RewriteRuleSubtreeStream(adaptor,"rule state_def");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:188:2: ( ( state_def )? flow_def SEMICOLON ( flow_def SEMICOLON )* -> ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:188:4: ( state_def )? flow_def SEMICOLON ( flow_def SEMICOLON )*
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:188:4: ( state_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RW_STATE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:188:4: state_def
                    {
                    pushFollow(FOLLOW_state_def_in_channel_body783);
                    state_def47=state_def();

                    state._fsp--;

                    stream_state_def.add(state_def47.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_flow_def_in_channel_body786);
            flow_def48=flow_def();

            state._fsp--;

            stream_flow_def.add(flow_def48.getTree());
            SEMICOLON49=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_channel_body788);  
            stream_SEMICOLON.add(SEMICOLON49);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:188:34: ( flow_def SEMICOLON )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==NOT_MARK||LA16_0==ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:188:35: flow_def SEMICOLON
            	    {
            	    pushFollow(FOLLOW_flow_def_in_channel_body791);
            	    flow_def50=flow_def();

            	    state._fsp--;

            	    stream_flow_def.add(flow_def50.getTree());
            	    SEMICOLON51=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_channel_body793);  
            	    stream_SEMICOLON.add(SEMICOLON51);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: state_def, flow_def
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 189:3: -> ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:189:6: ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL_BODY, "CHANNEL_BODY"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:189:21: ( state_def )?
                if ( stream_state_def.hasNext() ) {
                    adaptor.addChild(root_1, stream_state_def.nextTree());

                }
                stream_state_def.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:189:32: ^( FLOWS ( flow_def )+ )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:193:1: state_def : RW_STATE COLON ID SEMICOLON RW_OBSERVERS COLON ID ( COMMA ID )* SEMICOLON -> ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) ;
    public final ReoLangParser.state_def_return state_def() throws RecognitionException {
        ReoLangParser.state_def_return retval = new ReoLangParser.state_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_STATE52=null;
        Token COLON53=null;
        Token ID54=null;
        Token SEMICOLON55=null;
        Token RW_OBSERVERS56=null;
        Token COLON57=null;
        Token ID58=null;
        Token COMMA59=null;
        Token ID60=null;
        Token SEMICOLON61=null;

        Object RW_STATE52_tree=null;
        Object COLON53_tree=null;
        Object ID54_tree=null;
        Object SEMICOLON55_tree=null;
        Object RW_OBSERVERS56_tree=null;
        Object COLON57_tree=null;
        Object ID58_tree=null;
        Object COMMA59_tree=null;
        Object ID60_tree=null;
        Object SEMICOLON61_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RW_OBSERVERS=new RewriteRuleTokenStream(adaptor,"token RW_OBSERVERS");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_RW_STATE=new RewriteRuleTokenStream(adaptor,"token RW_STATE");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:194:2: ( RW_STATE COLON ID SEMICOLON RW_OBSERVERS COLON ID ( COMMA ID )* SEMICOLON -> ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:194:4: RW_STATE COLON ID SEMICOLON RW_OBSERVERS COLON ID ( COMMA ID )* SEMICOLON
            {
            RW_STATE52=(Token)match(input,RW_STATE,FOLLOW_RW_STATE_in_state_def827);  
            stream_RW_STATE.add(RW_STATE52);

            COLON53=(Token)match(input,COLON,FOLLOW_COLON_in_state_def829);  
            stream_COLON.add(COLON53);

            ID54=(Token)match(input,ID,FOLLOW_ID_in_state_def831);  
            stream_ID.add(ID54);

            SEMICOLON55=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_state_def833);  
            stream_SEMICOLON.add(SEMICOLON55);

            RW_OBSERVERS56=(Token)match(input,RW_OBSERVERS,FOLLOW_RW_OBSERVERS_in_state_def835);  
            stream_RW_OBSERVERS.add(RW_OBSERVERS56);

            COLON57=(Token)match(input,COLON,FOLLOW_COLON_in_state_def837);  
            stream_COLON.add(COLON57);

            ID58=(Token)match(input,ID,FOLLOW_ID_in_state_def839);  
            stream_ID.add(ID58);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:194:54: ( COMMA ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:194:55: COMMA ID
            	    {
            	    COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_state_def842);  
            	    stream_COMMA.add(COMMA59);

            	    ID60=(Token)match(input,ID,FOLLOW_ID_in_state_def844);  
            	    stream_ID.add(ID60);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            SEMICOLON61=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_state_def848);  
            stream_SEMICOLON.add(SEMICOLON61);



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
            // 195:3: -> ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:195:6: ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CHANNEL_STATE, "CHANNEL_STATE"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:195:22: ^( STATE_REF ID )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATE_REF, "STATE_REF"), root_2);

                adaptor.addChild(root_2, stream_ID.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:195:38: ^( STATE_OBS ( ID )+ )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:199:1: flow_def : requests ARROW_MARK flow_type -> ^( FLOW requests flow_type ) ;
    public final ReoLangParser.flow_def_return flow_def() throws RecognitionException {
        ReoLangParser.flow_def_return retval = new ReoLangParser.flow_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ARROW_MARK63=null;
        ReoLangParser.requests_return requests62 = null;

        ReoLangParser.flow_type_return flow_type64 = null;


        Object ARROW_MARK63_tree=null;
        RewriteRuleTokenStream stream_ARROW_MARK=new RewriteRuleTokenStream(adaptor,"token ARROW_MARK");
        RewriteRuleSubtreeStream stream_requests=new RewriteRuleSubtreeStream(adaptor,"rule requests");
        RewriteRuleSubtreeStream stream_flow_type=new RewriteRuleSubtreeStream(adaptor,"rule flow_type");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:200:2: ( requests ARROW_MARK flow_type -> ^( FLOW requests flow_type ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:200:4: requests ARROW_MARK flow_type
            {
            pushFollow(FOLLOW_requests_in_flow_def883);
            requests62=requests();

            state._fsp--;

            stream_requests.add(requests62.getTree());
            ARROW_MARK63=(Token)match(input,ARROW_MARK,FOLLOW_ARROW_MARK_in_flow_def885);  
            stream_ARROW_MARK.add(ARROW_MARK63);

            pushFollow(FOLLOW_flow_type_in_flow_def887);
            flow_type64=flow_type();

            state._fsp--;

            stream_flow_type.add(flow_type64.getTree());


            // AST REWRITE
            // elements: flow_type, requests
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 200:35: -> ^( FLOW requests flow_type )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:200:38: ^( FLOW requests flow_type )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:205:1: requests : request ( COMMA request )* -> ^( REQUESTS ( request )+ ) ;
    public final ReoLangParser.requests_return requests() throws RecognitionException {
        ReoLangParser.requests_return retval = new ReoLangParser.requests_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA66=null;
        ReoLangParser.request_return request65 = null;

        ReoLangParser.request_return request67 = null;


        Object COMMA66_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_request=new RewriteRuleSubtreeStream(adaptor,"rule request");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:206:2: ( request ( COMMA request )* -> ^( REQUESTS ( request )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:206:4: request ( COMMA request )*
            {
            pushFollow(FOLLOW_request_in_requests912);
            request65=request();

            state._fsp--;

            stream_request.add(request65.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:206:12: ( COMMA request )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:206:13: COMMA request
            	    {
            	    COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_requests915);  
            	    stream_COMMA.add(COMMA66);

            	    pushFollow(FOLLOW_request_in_requests917);
            	    request67=request();

            	    state._fsp--;

            	    stream_request.add(request67.getTree());

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
            // 206:29: -> ^( REQUESTS ( request )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:206:32: ^( REQUESTS ( request )+ )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:210:1: request : ( ID -> ^( REQUEST ID ) | NOT_MARK ID -> ^( REQUEST NOT_MARK ID ) );
    public final ReoLangParser.request_return request() throws RecognitionException {
        ReoLangParser.request_return retval = new ReoLangParser.request_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID68=null;
        Token NOT_MARK69=null;
        Token ID70=null;

        Object ID68_tree=null;
        Object NOT_MARK69_tree=null;
        Object ID70_tree=null;
        RewriteRuleTokenStream stream_NOT_MARK=new RewriteRuleTokenStream(adaptor,"token NOT_MARK");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:211:2: ( ID -> ^( REQUEST ID ) | NOT_MARK ID -> ^( REQUEST NOT_MARK ID ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:211:4: ID
                    {
                    ID68=(Token)match(input,ID,FOLLOW_ID_in_request942);  
                    stream_ID.add(ID68);



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
                    // 211:7: -> ^( REQUEST ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:211:10: ^( REQUEST ID )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:212:4: NOT_MARK ID
                    {
                    NOT_MARK69=(Token)match(input,NOT_MARK,FOLLOW_NOT_MARK_in_request955);  
                    stream_NOT_MARK.add(NOT_MARK69);

                    ID70=(Token)match(input,ID,FOLLOW_ID_in_request957);  
                    stream_ID.add(ID70);



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
                    // 212:16: -> ^( REQUEST NOT_MARK ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:212:19: ^( REQUEST NOT_MARK ID )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:216:1: flow_type : ( normal_flow ( flow_operation normal_flow )? ( flow_label )? -> ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | if_flow -> ^( FLOW_TYPE if_flow ) );
    public final ReoLangParser.flow_type_return flow_type() throws RecognitionException {
        ReoLangParser.flow_type_return retval = new ReoLangParser.flow_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.normal_flow_return normal_flow71 = null;

        ReoLangParser.flow_operation_return flow_operation72 = null;

        ReoLangParser.normal_flow_return normal_flow73 = null;

        ReoLangParser.flow_label_return flow_label74 = null;

        ReoLangParser.if_flow_return if_flow75 = null;


        RewriteRuleSubtreeStream stream_flow_operation=new RewriteRuleSubtreeStream(adaptor,"rule flow_operation");
        RewriteRuleSubtreeStream stream_if_flow=new RewriteRuleSubtreeStream(adaptor,"rule if_flow");
        RewriteRuleSubtreeStream stream_normal_flow=new RewriteRuleSubtreeStream(adaptor,"rule normal_flow");
        RewriteRuleSubtreeStream stream_flow_label=new RewriteRuleSubtreeStream(adaptor,"rule flow_label");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:217:2: ( normal_flow ( flow_operation normal_flow )? ( flow_label )? -> ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | if_flow -> ^( FLOW_TYPE if_flow ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:217:4: normal_flow ( flow_operation normal_flow )? ( flow_label )?
                    {
                    pushFollow(FOLLOW_normal_flow_in_flow_type980);
                    normal_flow71=normal_flow();

                    state._fsp--;

                    stream_normal_flow.add(normal_flow71.getTree());
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:217:16: ( flow_operation normal_flow )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OP_SYNC) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:217:17: flow_operation normal_flow
                            {
                            pushFollow(FOLLOW_flow_operation_in_flow_type983);
                            flow_operation72=flow_operation();

                            state._fsp--;

                            stream_flow_operation.add(flow_operation72.getTree());
                            pushFollow(FOLLOW_normal_flow_in_flow_type985);
                            normal_flow73=normal_flow();

                            state._fsp--;

                            stream_normal_flow.add(normal_flow73.getTree());

                            }
                            break;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:217:46: ( flow_label )?
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
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:217:46: flow_label
                            {
                            pushFollow(FOLLOW_flow_label_in_flow_type989);
                            flow_label74=flow_label();

                            state._fsp--;

                            stream_flow_label.add(flow_label74.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: normal_flow, flow_operation, normal_flow, flow_label
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:3: -> ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:218:6: ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_TYPE, "FLOW_TYPE"), root_1);

                        adaptor.addChild(root_1, stream_normal_flow.nextTree());
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:218:30: ( flow_operation normal_flow )?
                        if ( stream_flow_operation.hasNext()||stream_normal_flow.hasNext() ) {
                            adaptor.addChild(root_1, stream_flow_operation.nextTree());
                            adaptor.addChild(root_1, stream_normal_flow.nextTree());

                        }
                        stream_flow_operation.reset();
                        stream_normal_flow.reset();
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:218:60: ( flow_label )?
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:219:4: if_flow
                    {
                    pushFollow(FOLLOW_if_flow_in_flow_type1015);
                    if_flow75=if_flow();

                    state._fsp--;

                    stream_if_flow.add(if_flow75.getTree());


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
                    // 220:3: -> ^( FLOW_TYPE if_flow )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:220:6: ^( FLOW_TYPE if_flow )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:224:1: normal_flow : RW_FLOW flow_point RW_TO ( timed )? flow_point -> ^( NORMAL_FLOW flow_point ( timed )? flow_point ) ;
    public final ReoLangParser.normal_flow_return normal_flow() throws RecognitionException {
        ReoLangParser.normal_flow_return retval = new ReoLangParser.normal_flow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_FLOW76=null;
        Token RW_TO78=null;
        ReoLangParser.flow_point_return flow_point77 = null;

        ReoLangParser.timed_return timed79 = null;

        ReoLangParser.flow_point_return flow_point80 = null;


        Object RW_FLOW76_tree=null;
        Object RW_TO78_tree=null;
        RewriteRuleTokenStream stream_RW_TO=new RewriteRuleTokenStream(adaptor,"token RW_TO");
        RewriteRuleTokenStream stream_RW_FLOW=new RewriteRuleTokenStream(adaptor,"token RW_FLOW");
        RewriteRuleSubtreeStream stream_timed=new RewriteRuleSubtreeStream(adaptor,"rule timed");
        RewriteRuleSubtreeStream stream_flow_point=new RewriteRuleSubtreeStream(adaptor,"rule flow_point");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:225:2: ( RW_FLOW flow_point RW_TO ( timed )? flow_point -> ^( NORMAL_FLOW flow_point ( timed )? flow_point ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:225:4: RW_FLOW flow_point RW_TO ( timed )? flow_point
            {
            RW_FLOW76=(Token)match(input,RW_FLOW,FOLLOW_RW_FLOW_in_normal_flow1038);  
            stream_RW_FLOW.add(RW_FLOW76);

            pushFollow(FOLLOW_flow_point_in_normal_flow1040);
            flow_point77=flow_point();

            state._fsp--;

            stream_flow_point.add(flow_point77.getTree());
            RW_TO78=(Token)match(input,RW_TO,FOLLOW_RW_TO_in_normal_flow1042);  
            stream_RW_TO.add(RW_TO78);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:225:29: ( timed )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TIME_MARK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:225:29: timed
                    {
                    pushFollow(FOLLOW_timed_in_normal_flow1044);
                    timed79=timed();

                    state._fsp--;

                    stream_timed.add(timed79.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_flow_point_in_normal_flow1047);
            flow_point80=flow_point();

            state._fsp--;

            stream_flow_point.add(flow_point80.getTree());


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
            // 226:3: -> ^( NORMAL_FLOW flow_point ( timed )? flow_point )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:226:6: ^( NORMAL_FLOW flow_point ( timed )? flow_point )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NORMAL_FLOW, "NORMAL_FLOW"), root_1);

                adaptor.addChild(root_1, stream_flow_point.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:226:31: ( timed )?
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:230:1: flow_point : ( ID -> ^( FLOW_POINT ID ) | RW_NULL -> ^( FLOW_POINT RW_NULL ) );
    public final ReoLangParser.flow_point_return flow_point() throws RecognitionException {
        ReoLangParser.flow_point_return retval = new ReoLangParser.flow_point_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID81=null;
        Token RW_NULL82=null;

        Object ID81_tree=null;
        Object RW_NULL82_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RW_NULL=new RewriteRuleTokenStream(adaptor,"token RW_NULL");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:231:2: ( ID -> ^( FLOW_POINT ID ) | RW_NULL -> ^( FLOW_POINT RW_NULL ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:231:4: ID
                    {
                    ID81=(Token)match(input,ID,FOLLOW_ID_in_flow_point1076);  
                    stream_ID.add(ID81);



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
                    // 231:10: -> ^( FLOW_POINT ID )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:231:13: ^( FLOW_POINT ID )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:232:5: RW_NULL
                    {
                    RW_NULL82=(Token)match(input,RW_NULL,FOLLOW_RW_NULL_in_flow_point1093);  
                    stream_RW_NULL.add(RW_NULL82);



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
                    // 232:14: -> ^( FLOW_POINT RW_NULL )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:232:17: ^( FLOW_POINT RW_NULL )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:235:1: flow_operation : OP_SYNC -> ^( FLOW_OP OP_SYNC ) ;
    public final ReoLangParser.flow_operation_return flow_operation() throws RecognitionException {
        ReoLangParser.flow_operation_return retval = new ReoLangParser.flow_operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OP_SYNC83=null;

        Object OP_SYNC83_tree=null;
        RewriteRuleTokenStream stream_OP_SYNC=new RewriteRuleTokenStream(adaptor,"token OP_SYNC");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:236:2: ( OP_SYNC -> ^( FLOW_OP OP_SYNC ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:236:4: OP_SYNC
            {
            OP_SYNC83=(Token)match(input,OP_SYNC,FOLLOW_OP_SYNC_in_flow_operation1113);  
            stream_OP_SYNC.add(OP_SYNC83);



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
            // 236:13: -> ^( FLOW_OP OP_SYNC )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:236:16: ^( FLOW_OP OP_SYNC )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:240:1: if_flow : ID QUESTION_MARK flow_type (f1= flow_label )? COLON flow_type (f2= flow_label )? -> ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) ) ;
    public final ReoLangParser.if_flow_return if_flow() throws RecognitionException {
        ReoLangParser.if_flow_return retval = new ReoLangParser.if_flow_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID84=null;
        Token QUESTION_MARK85=null;
        Token COLON87=null;
        ReoLangParser.flow_label_return f1 = null;

        ReoLangParser.flow_label_return f2 = null;

        ReoLangParser.flow_type_return flow_type86 = null;

        ReoLangParser.flow_type_return flow_type88 = null;


        Object ID84_tree=null;
        Object QUESTION_MARK85_tree=null;
        Object COLON87_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_QUESTION_MARK=new RewriteRuleTokenStream(adaptor,"token QUESTION_MARK");
        RewriteRuleSubtreeStream stream_flow_label=new RewriteRuleSubtreeStream(adaptor,"rule flow_label");
        RewriteRuleSubtreeStream stream_flow_type=new RewriteRuleSubtreeStream(adaptor,"rule flow_type");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:241:2: ( ID QUESTION_MARK flow_type (f1= flow_label )? COLON flow_type (f2= flow_label )? -> ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:241:4: ID QUESTION_MARK flow_type (f1= flow_label )? COLON flow_type (f2= flow_label )?
            {
            ID84=(Token)match(input,ID,FOLLOW_ID_in_if_flow1135);  
            stream_ID.add(ID84);

            QUESTION_MARK85=(Token)match(input,QUESTION_MARK,FOLLOW_QUESTION_MARK_in_if_flow1137);  
            stream_QUESTION_MARK.add(QUESTION_MARK85);

            pushFollow(FOLLOW_flow_type_in_if_flow1139);
            flow_type86=flow_type();

            state._fsp--;

            stream_flow_type.add(flow_type86.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:241:33: (f1= flow_label )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LABEL_MARK) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:241:33: f1= flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow1143);
                    f1=flow_label();

                    state._fsp--;

                    stream_flow_label.add(f1.getTree());

                    }
                    break;

            }

            COLON87=(Token)match(input,COLON,FOLLOW_COLON_in_if_flow1146);  
            stream_COLON.add(COLON87);

            pushFollow(FOLLOW_flow_type_in_if_flow1148);
            flow_type88=flow_type();

            state._fsp--;

            stream_flow_type.add(flow_type88.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:241:64: (f2= flow_label )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LABEL_MARK) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:241:64: f2= flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow1152);
                    f2=flow_label();

                    state._fsp--;

                    stream_flow_label.add(f2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: flow_type, flow_type, ID, f1, f2
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
            // 242:3: -> ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:242:6: ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( $f1)? ) ^( FLOW_FALSE flow_type ( $f2)? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF_FLOW, "IF_FLOW"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:242:19: ^( FLOW_TRUE flow_type ( $f1)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_TRUE, "FLOW_TRUE"), root_2);

                adaptor.addChild(root_2, stream_flow_type.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:242:41: ( $f1)?
                if ( stream_f1.hasNext() ) {
                    adaptor.addChild(root_2, stream_f1.nextTree());

                }
                stream_f1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:242:47: ^( FLOW_FALSE flow_type ( $f2)? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(FLOW_FALSE, "FLOW_FALSE"), root_2);

                adaptor.addChild(root_2, stream_flow_type.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:242:70: ( $f2)?
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:247:1: flow_label : LABEL_MARK ID -> ID ;
    public final ReoLangParser.flow_label_return flow_label() throws RecognitionException {
        ReoLangParser.flow_label_return retval = new ReoLangParser.flow_label_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LABEL_MARK89=null;
        Token ID90=null;

        Object LABEL_MARK89_tree=null;
        Object ID90_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LABEL_MARK=new RewriteRuleTokenStream(adaptor,"token LABEL_MARK");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:248:2: ( LABEL_MARK ID -> ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:248:4: LABEL_MARK ID
            {
            LABEL_MARK89=(Token)match(input,LABEL_MARK,FOLLOW_LABEL_MARK_in_flow_label1199);  
            stream_LABEL_MARK.add(LABEL_MARK89);

            ID90=(Token)match(input,ID,FOLLOW_ID_in_flow_label1201);  
            stream_ID.add(ID90);



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
            // 249:3: -> ID
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:262:1: pattern_def : RW_PATTERN pattern_signature BODY_OPEN pattern_body BODY_CLOSE -> ^( PATTERN pattern_signature pattern_body ) ;
    public final ReoLangParser.pattern_def_return pattern_def() throws RecognitionException {
        ReoLangParser.pattern_def_return retval = new ReoLangParser.pattern_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_PATTERN91=null;
        Token BODY_OPEN93=null;
        Token BODY_CLOSE95=null;
        ReoLangParser.pattern_signature_return pattern_signature92 = null;

        ReoLangParser.pattern_body_return pattern_body94 = null;


        Object RW_PATTERN91_tree=null;
        Object BODY_OPEN93_tree=null;
        Object BODY_CLOSE95_tree=null;
        RewriteRuleTokenStream stream_RW_PATTERN=new RewriteRuleTokenStream(adaptor,"token RW_PATTERN");
        RewriteRuleTokenStream stream_BODY_OPEN=new RewriteRuleTokenStream(adaptor,"token BODY_OPEN");
        RewriteRuleTokenStream stream_BODY_CLOSE=new RewriteRuleTokenStream(adaptor,"token BODY_CLOSE");
        RewriteRuleSubtreeStream stream_pattern_body=new RewriteRuleSubtreeStream(adaptor,"rule pattern_body");
        RewriteRuleSubtreeStream stream_pattern_signature=new RewriteRuleSubtreeStream(adaptor,"rule pattern_signature");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:263:2: ( RW_PATTERN pattern_signature BODY_OPEN pattern_body BODY_CLOSE -> ^( PATTERN pattern_signature pattern_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:263:4: RW_PATTERN pattern_signature BODY_OPEN pattern_body BODY_CLOSE
            {
            RW_PATTERN91=(Token)match(input,RW_PATTERN,FOLLOW_RW_PATTERN_in_pattern_def1229);  
            stream_RW_PATTERN.add(RW_PATTERN91);

            pushFollow(FOLLOW_pattern_signature_in_pattern_def1231);
            pattern_signature92=pattern_signature();

            state._fsp--;

            stream_pattern_signature.add(pattern_signature92.getTree());
            BODY_OPEN93=(Token)match(input,BODY_OPEN,FOLLOW_BODY_OPEN_in_pattern_def1233);  
            stream_BODY_OPEN.add(BODY_OPEN93);

            pushFollow(FOLLOW_pattern_body_in_pattern_def1235);
            pattern_body94=pattern_body();

            state._fsp--;

            stream_pattern_body.add(pattern_body94.getTree());
            BODY_CLOSE95=(Token)match(input,BODY_CLOSE,FOLLOW_BODY_CLOSE_in_pattern_def1237);  
            stream_BODY_CLOSE.add(BODY_CLOSE95);



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
            // 264:3: -> ^( PATTERN pattern_signature pattern_body )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:264:6: ^( PATTERN pattern_signature pattern_body )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:267:1: pattern_signature : ID PORTS_OPEN (in= ports )? COLON (out= ports )? PORTS_CLOSE -> ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ) ;
    public final ReoLangParser.pattern_signature_return pattern_signature() throws RecognitionException {
        ReoLangParser.pattern_signature_return retval = new ReoLangParser.pattern_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID96=null;
        Token PORTS_OPEN97=null;
        Token COLON98=null;
        Token PORTS_CLOSE99=null;
        ReoLangParser.ports_return in = null;

        ReoLangParser.ports_return out = null;


        Object ID96_tree=null;
        Object PORTS_OPEN97_tree=null;
        Object COLON98_tree=null;
        Object PORTS_CLOSE99_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PORTS_OPEN=new RewriteRuleTokenStream(adaptor,"token PORTS_OPEN");
        RewriteRuleTokenStream stream_PORTS_CLOSE=new RewriteRuleTokenStream(adaptor,"token PORTS_CLOSE");
        RewriteRuleSubtreeStream stream_ports=new RewriteRuleSubtreeStream(adaptor,"rule ports");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:268:2: ( ID PORTS_OPEN (in= ports )? COLON (out= ports )? PORTS_CLOSE -> ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:268:4: ID PORTS_OPEN (in= ports )? COLON (out= ports )? PORTS_CLOSE
            {
            ID96=(Token)match(input,ID,FOLLOW_ID_in_pattern_signature1263);  
            stream_ID.add(ID96);

            PORTS_OPEN97=(Token)match(input,PORTS_OPEN,FOLLOW_PORTS_OPEN_in_pattern_signature1265);  
            stream_PORTS_OPEN.add(PORTS_OPEN97);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:268:20: (in= ports )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:268:20: in= ports
                    {
                    pushFollow(FOLLOW_ports_in_pattern_signature1269);
                    in=ports();

                    state._fsp--;

                    stream_ports.add(in.getTree());

                    }
                    break;

            }

            COLON98=(Token)match(input,COLON,FOLLOW_COLON_in_pattern_signature1272);  
            stream_COLON.add(COLON98);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:268:37: (out= ports )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:268:37: out= ports
                    {
                    pushFollow(FOLLOW_ports_in_pattern_signature1276);
                    out=ports();

                    state._fsp--;

                    stream_ports.add(out.getTree());

                    }
                    break;

            }

            PORTS_CLOSE99=(Token)match(input,PORTS_CLOSE,FOLLOW_PORTS_CLOSE_in_pattern_signature1279);  
            stream_PORTS_CLOSE.add(PORTS_CLOSE99);



            // AST REWRITE
            // elements: ID, in, out
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
            // 269:3: -> ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:269:6: ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN_SIGNATURE, "PATTERN_SIGNATURE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:269:29: ^( PATTERN_PORTS ( ^( IN_PORTS $in) )? ( ^( OUT_PORTS $out) )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PATTERN_PORTS, "PATTERN_PORTS"), root_2);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:269:45: ( ^( IN_PORTS $in) )?
                if ( stream_in.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:269:46: ^( IN_PORTS $in)
                    {
                    Object root_3 = (Object)adaptor.nil();
                    root_3 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN_PORTS, "IN_PORTS"), root_3);

                    adaptor.addChild(root_3, stream_in.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_in.reset();
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:269:64: ( ^( OUT_PORTS $out) )?
                if ( stream_out.hasNext() ) {
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:269:65: ^( OUT_PORTS $out)
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:272:1: pattern_body : RW_USE COLON pattern_declarations RW_IN COLON pattern_compositions -> ^( PATTERN_BODY pattern_declarations pattern_compositions ) ;
    public final ReoLangParser.pattern_body_return pattern_body() throws RecognitionException {
        ReoLangParser.pattern_body_return retval = new ReoLangParser.pattern_body_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_USE100=null;
        Token COLON101=null;
        Token RW_IN103=null;
        Token COLON104=null;
        ReoLangParser.pattern_declarations_return pattern_declarations102 = null;

        ReoLangParser.pattern_compositions_return pattern_compositions105 = null;


        Object RW_USE100_tree=null;
        Object COLON101_tree=null;
        Object RW_IN103_tree=null;
        Object COLON104_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RW_USE=new RewriteRuleTokenStream(adaptor,"token RW_USE");
        RewriteRuleTokenStream stream_RW_IN=new RewriteRuleTokenStream(adaptor,"token RW_IN");
        RewriteRuleSubtreeStream stream_pattern_declarations=new RewriteRuleSubtreeStream(adaptor,"rule pattern_declarations");
        RewriteRuleSubtreeStream stream_pattern_compositions=new RewriteRuleSubtreeStream(adaptor,"rule pattern_compositions");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:273:2: ( RW_USE COLON pattern_declarations RW_IN COLON pattern_compositions -> ^( PATTERN_BODY pattern_declarations pattern_compositions ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:273:4: RW_USE COLON pattern_declarations RW_IN COLON pattern_compositions
            {
            RW_USE100=(Token)match(input,RW_USE,FOLLOW_RW_USE_in_pattern_body1327);  
            stream_RW_USE.add(RW_USE100);

            COLON101=(Token)match(input,COLON,FOLLOW_COLON_in_pattern_body1329);  
            stream_COLON.add(COLON101);

            pushFollow(FOLLOW_pattern_declarations_in_pattern_body1331);
            pattern_declarations102=pattern_declarations();

            state._fsp--;

            stream_pattern_declarations.add(pattern_declarations102.getTree());
            RW_IN103=(Token)match(input,RW_IN,FOLLOW_RW_IN_in_pattern_body1333);  
            stream_RW_IN.add(RW_IN103);

            COLON104=(Token)match(input,COLON,FOLLOW_COLON_in_pattern_body1335);  
            stream_COLON.add(COLON104);

            pushFollow(FOLLOW_pattern_compositions_in_pattern_body1337);
            pattern_compositions105=pattern_compositions();

            state._fsp--;

            stream_pattern_compositions.add(pattern_compositions105.getTree());


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
            // 274:3: -> ^( PATTERN_BODY pattern_declarations pattern_compositions )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:274:6: ^( PATTERN_BODY pattern_declarations pattern_compositions )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:277:1: pattern_declarations : declaration SEMICOLON ( declaration SEMICOLON )* -> ^( PATTERN_DECLARATIONS ( declaration )+ ) ;
    public final ReoLangParser.pattern_declarations_return pattern_declarations() throws RecognitionException {
        ReoLangParser.pattern_declarations_return retval = new ReoLangParser.pattern_declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON107=null;
        Token SEMICOLON109=null;
        ReoLangParser.declaration_return declaration106 = null;

        ReoLangParser.declaration_return declaration108 = null;


        Object SEMICOLON107_tree=null;
        Object SEMICOLON109_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:278:2: ( declaration SEMICOLON ( declaration SEMICOLON )* -> ^( PATTERN_DECLARATIONS ( declaration )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:278:4: declaration SEMICOLON ( declaration SEMICOLON )*
            {
            pushFollow(FOLLOW_declaration_in_pattern_declarations1361);
            declaration106=declaration();

            state._fsp--;

            stream_declaration.add(declaration106.getTree());
            SEMICOLON107=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_declarations1363);  
            stream_SEMICOLON.add(SEMICOLON107);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:278:26: ( declaration SEMICOLON )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==PORTS_OPEN||LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:278:27: declaration SEMICOLON
            	    {
            	    pushFollow(FOLLOW_declaration_in_pattern_declarations1366);
            	    declaration108=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration108.getTree());
            	    SEMICOLON109=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_declarations1368);  
            	    stream_SEMICOLON.add(SEMICOLON109);


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
            // 279:3: -> ^( PATTERN_DECLARATIONS ( declaration )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:279:6: ^( PATTERN_DECLARATIONS ( declaration )+ )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:282:1: declaration : reference_signature RW_AS instances -> ^( DECLARATION reference_signature instances ) ;
    public final ReoLangParser.declaration_return declaration() throws RecognitionException {
        ReoLangParser.declaration_return retval = new ReoLangParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_AS111=null;
        ReoLangParser.reference_signature_return reference_signature110 = null;

        ReoLangParser.instances_return instances112 = null;


        Object RW_AS111_tree=null;
        RewriteRuleTokenStream stream_RW_AS=new RewriteRuleTokenStream(adaptor,"token RW_AS");
        RewriteRuleSubtreeStream stream_reference_signature=new RewriteRuleSubtreeStream(adaptor,"rule reference_signature");
        RewriteRuleSubtreeStream stream_instances=new RewriteRuleSubtreeStream(adaptor,"rule instances");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:283:2: ( reference_signature RW_AS instances -> ^( DECLARATION reference_signature instances ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:283:4: reference_signature RW_AS instances
            {
            pushFollow(FOLLOW_reference_signature_in_declaration1394);
            reference_signature110=reference_signature();

            state._fsp--;

            stream_reference_signature.add(reference_signature110.getTree());
            RW_AS111=(Token)match(input,RW_AS,FOLLOW_RW_AS_in_declaration1396);  
            stream_RW_AS.add(RW_AS111);

            pushFollow(FOLLOW_instances_in_declaration1398);
            instances112=instances();

            state._fsp--;

            stream_instances.add(instances112.getTree());


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
            // 284:3: -> ^( DECLARATION reference_signature instances )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:284:6: ^( DECLARATION reference_signature instances )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:287:1: reference_signature : ( PORTS_OPEN ID PORTS_CLOSE )? channel_signature -> ^( DECLARATION_TYPE ( ID )? channel_signature ) ;
    public final ReoLangParser.reference_signature_return reference_signature() throws RecognitionException {
        ReoLangParser.reference_signature_return retval = new ReoLangParser.reference_signature_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PORTS_OPEN113=null;
        Token ID114=null;
        Token PORTS_CLOSE115=null;
        ReoLangParser.channel_signature_return channel_signature116 = null;


        Object PORTS_OPEN113_tree=null;
        Object ID114_tree=null;
        Object PORTS_CLOSE115_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PORTS_OPEN=new RewriteRuleTokenStream(adaptor,"token PORTS_OPEN");
        RewriteRuleTokenStream stream_PORTS_CLOSE=new RewriteRuleTokenStream(adaptor,"token PORTS_CLOSE");
        RewriteRuleSubtreeStream stream_channel_signature=new RewriteRuleSubtreeStream(adaptor,"rule channel_signature");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:288:2: ( ( PORTS_OPEN ID PORTS_CLOSE )? channel_signature -> ^( DECLARATION_TYPE ( ID )? channel_signature ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:288:4: ( PORTS_OPEN ID PORTS_CLOSE )? channel_signature
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:288:4: ( PORTS_OPEN ID PORTS_CLOSE )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==PORTS_OPEN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:288:5: PORTS_OPEN ID PORTS_CLOSE
                    {
                    PORTS_OPEN113=(Token)match(input,PORTS_OPEN,FOLLOW_PORTS_OPEN_in_reference_signature1423);  
                    stream_PORTS_OPEN.add(PORTS_OPEN113);

                    ID114=(Token)match(input,ID,FOLLOW_ID_in_reference_signature1425);  
                    stream_ID.add(ID114);

                    PORTS_CLOSE115=(Token)match(input,PORTS_CLOSE,FOLLOW_PORTS_CLOSE_in_reference_signature1427);  
                    stream_PORTS_CLOSE.add(PORTS_CLOSE115);


                    }
                    break;

            }

            pushFollow(FOLLOW_channel_signature_in_reference_signature1431);
            channel_signature116=channel_signature();

            state._fsp--;

            stream_channel_signature.add(channel_signature116.getTree());


            // AST REWRITE
            // elements: channel_signature, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 289:3: -> ^( DECLARATION_TYPE ( ID )? channel_signature )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:289:6: ^( DECLARATION_TYPE ( ID )? channel_signature )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLARATION_TYPE, "DECLARATION_TYPE"), root_1);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:289:25: ( ID )?
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:292:1: instances : i1= ID ( COMMA i2= ID )* -> ^( INSTANCES ID ( ID )* ) ;
    public final ReoLangParser.instances_return instances() throws RecognitionException {
        ReoLangParser.instances_return retval = new ReoLangParser.instances_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token COMMA117=null;

        Object i1_tree=null;
        Object i2_tree=null;
        Object COMMA117_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:293:2: (i1= ID ( COMMA i2= ID )* -> ^( INSTANCES ID ( ID )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:293:4: i1= ID ( COMMA i2= ID )*
            {
            i1=(Token)match(input,ID,FOLLOW_ID_in_instances1459);  
            stream_ID.add(i1);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:293:11: ( COMMA i2= ID )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==COMMA) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:293:12: COMMA i2= ID
            	    {
            	    COMMA117=(Token)match(input,COMMA,FOLLOW_COMMA_in_instances1463);  
            	    stream_COMMA.add(COMMA117);

            	    i2=(Token)match(input,ID,FOLLOW_ID_in_instances1467);  
            	    stream_ID.add(i2);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



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
            // 294:3: -> ^( INSTANCES ID ( ID )* )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:294:6: ^( INSTANCES ID ( ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INSTANCES, "INSTANCES"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:294:22: ( ID )*
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
    // $ANTLR end "instances"

    public static class pattern_compositions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_compositions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:303:1: pattern_compositions : port_definition SEMICOLON ( port_definition SEMICOLON )* ( join_operation SEMICOLON ( join_operation SEMICOLON )* )? -> ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* ) ;
    public final ReoLangParser.pattern_compositions_return pattern_compositions() throws RecognitionException {
        ReoLangParser.pattern_compositions_return retval = new ReoLangParser.pattern_compositions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON119=null;
        Token SEMICOLON121=null;
        Token SEMICOLON123=null;
        Token SEMICOLON125=null;
        ReoLangParser.port_definition_return port_definition118 = null;

        ReoLangParser.port_definition_return port_definition120 = null;

        ReoLangParser.join_operation_return join_operation122 = null;

        ReoLangParser.join_operation_return join_operation124 = null;


        Object SEMICOLON119_tree=null;
        Object SEMICOLON121_tree=null;
        Object SEMICOLON123_tree=null;
        Object SEMICOLON125_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_port_definition=new RewriteRuleSubtreeStream(adaptor,"rule port_definition");
        RewriteRuleSubtreeStream stream_join_operation=new RewriteRuleSubtreeStream(adaptor,"rule join_operation");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:2: ( port_definition SEMICOLON ( port_definition SEMICOLON )* ( join_operation SEMICOLON ( join_operation SEMICOLON )* )? -> ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:5: port_definition SEMICOLON ( port_definition SEMICOLON )* ( join_operation SEMICOLON ( join_operation SEMICOLON )* )?
            {
            pushFollow(FOLLOW_port_definition_in_pattern_compositions1506);
            port_definition118=port_definition();

            state._fsp--;

            stream_port_definition.add(port_definition118.getTree());
            SEMICOLON119=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1508);  
            stream_SEMICOLON.add(SEMICOLON119);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:31: ( port_definition SEMICOLON )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:32: port_definition SEMICOLON
            	    {
            	    pushFollow(FOLLOW_port_definition_in_pattern_compositions1511);
            	    port_definition120=port_definition();

            	    state._fsp--;

            	    stream_port_definition.add(port_definition120.getTree());
            	    SEMICOLON121=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1513);  
            	    stream_SEMICOLON.add(SEMICOLON121);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:60: ( join_operation SEMICOLON ( join_operation SEMICOLON )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RW_DECIDE && LA34_0<=RW_JOIN)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:61: join_operation SEMICOLON ( join_operation SEMICOLON )*
                    {
                    pushFollow(FOLLOW_join_operation_in_pattern_compositions1518);
                    join_operation122=join_operation();

                    state._fsp--;

                    stream_join_operation.add(join_operation122.getTree());
                    SEMICOLON123=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1520);  
                    stream_SEMICOLON.add(SEMICOLON123);

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:86: ( join_operation SEMICOLON )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=RW_DECIDE && LA33_0<=RW_JOIN)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:304:87: join_operation SEMICOLON
                    	    {
                    	    pushFollow(FOLLOW_join_operation_in_pattern_compositions1523);
                    	    join_operation124=join_operation();

                    	    state._fsp--;

                    	    stream_join_operation.add(join_operation124.getTree());
                    	    SEMICOLON125=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_pattern_compositions1525);  
                    	    stream_SEMICOLON.add(SEMICOLON125);


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: join_operation, port_definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 305:3: -> ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:305:6: ^( PATTERN_COMPOSITIONS ( port_definition )+ ( join_operation )* )
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
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:305:46: ( join_operation )*
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:308:1: port_definition : ID EQUALS port_actual_definition -> ^( PORT_DEFINITION ID port_actual_definition ) ;
    public final ReoLangParser.port_definition_return port_definition() throws RecognitionException {
        ReoLangParser.port_definition_return retval = new ReoLangParser.port_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID126=null;
        Token EQUALS127=null;
        ReoLangParser.port_actual_definition_return port_actual_definition128 = null;


        Object ID126_tree=null;
        Object EQUALS127_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_port_actual_definition=new RewriteRuleSubtreeStream(adaptor,"rule port_actual_definition");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:309:2: ( ID EQUALS port_actual_definition -> ^( PORT_DEFINITION ID port_actual_definition ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:309:4: ID EQUALS port_actual_definition
            {
            ID126=(Token)match(input,ID,FOLLOW_ID_in_port_definition1556);  
            stream_ID.add(ID126);

            EQUALS127=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_port_definition1558);  
            stream_EQUALS.add(EQUALS127);

            pushFollow(FOLLOW_port_actual_definition_in_port_definition1560);
            port_actual_definition128=port_actual_definition();

            state._fsp--;

            stream_port_actual_definition.add(port_actual_definition128.getTree());


            // AST REWRITE
            // elements: ID, port_actual_definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:3: -> ^( PORT_DEFINITION ID port_actual_definition )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:310:6: ^( PORT_DEFINITION ID port_actual_definition )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:313:1: port_actual_definition : ( port_access -> ^( PORT_ACTUAL_DEFINITION port_access ) | join_part -> ^( PORT_ACTUAL_DEFINITION join_part ) );
    public final ReoLangParser.port_actual_definition_return port_actual_definition() throws RecognitionException {
        ReoLangParser.port_actual_definition_return retval = new ReoLangParser.port_actual_definition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ReoLangParser.port_access_return port_access129 = null;

        ReoLangParser.join_part_return join_part130 = null;


        RewriteRuleSubtreeStream stream_join_part=new RewriteRuleSubtreeStream(adaptor,"rule join_part");
        RewriteRuleSubtreeStream stream_port_access=new RewriteRuleSubtreeStream(adaptor,"rule port_access");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:314:2: ( port_access -> ^( PORT_ACTUAL_DEFINITION port_access ) | join_part -> ^( PORT_ACTUAL_DEFINITION join_part ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ID) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RW_DECIDE && LA35_0<=RW_JOIN)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:314:5: port_access
                    {
                    pushFollow(FOLLOW_port_access_in_port_actual_definition1585);
                    port_access129=port_access();

                    state._fsp--;

                    stream_port_access.add(port_access129.getTree());


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
                    // 314:17: -> ^( PORT_ACTUAL_DEFINITION port_access )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:314:20: ^( PORT_ACTUAL_DEFINITION port_access )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:315:5: join_part
                    {
                    pushFollow(FOLLOW_join_part_in_port_actual_definition1599);
                    join_part130=join_part();

                    state._fsp--;

                    stream_join_part.add(join_part130.getTree());


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
                    // 315:15: -> ^( PORT_ACTUAL_DEFINITION join_part )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:315:18: ^( PORT_ACTUAL_DEFINITION join_part )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:318:1: port_access : ID ACCESS_MARK ID -> ^( PORT_ACCESS ID ID ) ;
    public final ReoLangParser.port_access_return port_access() throws RecognitionException {
        ReoLangParser.port_access_return retval = new ReoLangParser.port_access_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID131=null;
        Token ACCESS_MARK132=null;
        Token ID133=null;

        Object ID131_tree=null;
        Object ACCESS_MARK132_tree=null;
        Object ID133_tree=null;
        RewriteRuleTokenStream stream_ACCESS_MARK=new RewriteRuleTokenStream(adaptor,"token ACCESS_MARK");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:319:2: ( ID ACCESS_MARK ID -> ^( PORT_ACCESS ID ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:319:4: ID ACCESS_MARK ID
            {
            ID131=(Token)match(input,ID,FOLLOW_ID_in_port_access1618);  
            stream_ID.add(ID131);

            ACCESS_MARK132=(Token)match(input,ACCESS_MARK,FOLLOW_ACCESS_MARK_in_port_access1620);  
            stream_ACCESS_MARK.add(ACCESS_MARK132);

            ID133=(Token)match(input,ID,FOLLOW_ID_in_port_access1622);  
            stream_ID.add(ID133);



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
            // 320:3: -> ^( PORT_ACCESS ID ID )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:320:6: ^( PORT_ACCESS ID ID )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:323:1: join_operation : join_part RW_AS ID -> ^( JOIN_OP ID join_part ) ;
    public final ReoLangParser.join_operation_return join_operation() throws RecognitionException {
        ReoLangParser.join_operation_return retval = new ReoLangParser.join_operation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_AS135=null;
        Token ID136=null;
        ReoLangParser.join_part_return join_part134 = null;


        Object RW_AS135_tree=null;
        Object ID136_tree=null;
        RewriteRuleTokenStream stream_RW_AS=new RewriteRuleTokenStream(adaptor,"token RW_AS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_join_part=new RewriteRuleSubtreeStream(adaptor,"rule join_part");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:324:2: ( join_part RW_AS ID -> ^( JOIN_OP ID join_part ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:324:4: join_part RW_AS ID
            {
            pushFollow(FOLLOW_join_part_in_join_operation1646);
            join_part134=join_part();

            state._fsp--;

            stream_join_part.add(join_part134.getTree());
            RW_AS135=(Token)match(input,RW_AS,FOLLOW_RW_AS_in_join_operation1648);  
            stream_RW_AS.add(RW_AS135);

            ID136=(Token)match(input,ID,FOLLOW_ID_in_join_operation1650);  
            stream_ID.add(ID136);



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
            // 325:3: -> ^( JOIN_OP ID join_part )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:325:6: ^( JOIN_OP ID join_part )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:328:1: join_part : ( RW_JOIN port_access_list -> ^( RW_JOIN port_access_list ) | RW_DECIDE special_port_access_list -> ^( RW_DECIDE special_port_access_list ) );
    public final ReoLangParser.join_part_return join_part() throws RecognitionException {
        ReoLangParser.join_part_return retval = new ReoLangParser.join_part_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RW_JOIN137=null;
        Token RW_DECIDE139=null;
        ReoLangParser.port_access_list_return port_access_list138 = null;

        ReoLangParser.special_port_access_list_return special_port_access_list140 = null;


        Object RW_JOIN137_tree=null;
        Object RW_DECIDE139_tree=null;
        RewriteRuleTokenStream stream_RW_DECIDE=new RewriteRuleTokenStream(adaptor,"token RW_DECIDE");
        RewriteRuleTokenStream stream_RW_JOIN=new RewriteRuleTokenStream(adaptor,"token RW_JOIN");
        RewriteRuleSubtreeStream stream_special_port_access_list=new RewriteRuleSubtreeStream(adaptor,"rule special_port_access_list");
        RewriteRuleSubtreeStream stream_port_access_list=new RewriteRuleSubtreeStream(adaptor,"rule port_access_list");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:329:2: ( RW_JOIN port_access_list -> ^( RW_JOIN port_access_list ) | RW_DECIDE special_port_access_list -> ^( RW_DECIDE special_port_access_list ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RW_JOIN) ) {
                alt36=1;
            }
            else if ( (LA36_0==RW_DECIDE) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:329:5: RW_JOIN port_access_list
                    {
                    RW_JOIN137=(Token)match(input,RW_JOIN,FOLLOW_RW_JOIN_in_join_part1676);  
                    stream_RW_JOIN.add(RW_JOIN137);

                    pushFollow(FOLLOW_port_access_list_in_join_part1678);
                    port_access_list138=port_access_list();

                    state._fsp--;

                    stream_port_access_list.add(port_access_list138.getTree());


                    // AST REWRITE
                    // elements: RW_JOIN, port_access_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 330:3: -> ^( RW_JOIN port_access_list )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:330:6: ^( RW_JOIN port_access_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RW_JOIN.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_port_access_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:331:5: RW_DECIDE special_port_access_list
                    {
                    RW_DECIDE139=(Token)match(input,RW_DECIDE,FOLLOW_RW_DECIDE_in_join_part1695);  
                    stream_RW_DECIDE.add(RW_DECIDE139);

                    pushFollow(FOLLOW_special_port_access_list_in_join_part1697);
                    special_port_access_list140=special_port_access_list();

                    state._fsp--;

                    stream_special_port_access_list.add(special_port_access_list140.getTree());


                    // AST REWRITE
                    // elements: special_port_access_list, RW_DECIDE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 332:3: -> ^( RW_DECIDE special_port_access_list )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:332:6: ^( RW_DECIDE special_port_access_list )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_RW_DECIDE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_special_port_access_list.nextTree());

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
    // $ANTLR end "join_part"

    public static class port_access_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:336:1: port_access_list : LIST_OPEN port_access ( COMMA port_access )* LIST_CLOSE -> ^( PORT_ACCESS_LIST ( port_access )+ ) ;
    public final ReoLangParser.port_access_list_return port_access_list() throws RecognitionException {
        ReoLangParser.port_access_list_return retval = new ReoLangParser.port_access_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LIST_OPEN141=null;
        Token COMMA143=null;
        Token LIST_CLOSE145=null;
        ReoLangParser.port_access_return port_access142 = null;

        ReoLangParser.port_access_return port_access144 = null;


        Object LIST_OPEN141_tree=null;
        Object COMMA143_tree=null;
        Object LIST_CLOSE145_tree=null;
        RewriteRuleTokenStream stream_LIST_OPEN=new RewriteRuleTokenStream(adaptor,"token LIST_OPEN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIST_CLOSE=new RewriteRuleTokenStream(adaptor,"token LIST_CLOSE");
        RewriteRuleSubtreeStream stream_port_access=new RewriteRuleSubtreeStream(adaptor,"rule port_access");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:337:2: ( LIST_OPEN port_access ( COMMA port_access )* LIST_CLOSE -> ^( PORT_ACCESS_LIST ( port_access )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:337:4: LIST_OPEN port_access ( COMMA port_access )* LIST_CLOSE
            {
            LIST_OPEN141=(Token)match(input,LIST_OPEN,FOLLOW_LIST_OPEN_in_port_access_list1724);  
            stream_LIST_OPEN.add(LIST_OPEN141);

            pushFollow(FOLLOW_port_access_in_port_access_list1726);
            port_access142=port_access();

            state._fsp--;

            stream_port_access.add(port_access142.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:337:26: ( COMMA port_access )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==COMMA) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:337:27: COMMA port_access
            	    {
            	    COMMA143=(Token)match(input,COMMA,FOLLOW_COMMA_in_port_access_list1729);  
            	    stream_COMMA.add(COMMA143);

            	    pushFollow(FOLLOW_port_access_in_port_access_list1731);
            	    port_access144=port_access();

            	    state._fsp--;

            	    stream_port_access.add(port_access144.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            LIST_CLOSE145=(Token)match(input,LIST_CLOSE,FOLLOW_LIST_CLOSE_in_port_access_list1735);  
            stream_LIST_CLOSE.add(LIST_CLOSE145);



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
            // 338:3: -> ^( PORT_ACCESS_LIST ( port_access )+ )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:338:6: ^( PORT_ACCESS_LIST ( port_access )+ )
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

    public static class special_port_access_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "special_port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:343:1: special_port_access_list : LIST_OPEN p1= port_access COLON p2= port_access COMMA p3= port_access ( COMMA p4= port_access )* LIST_CLOSE -> ^( PORT_ACCESS_LIST $p1 $p2 $p3 ( $p4)* ) ;
    public final ReoLangParser.special_port_access_list_return special_port_access_list() throws RecognitionException {
        ReoLangParser.special_port_access_list_return retval = new ReoLangParser.special_port_access_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LIST_OPEN146=null;
        Token COLON147=null;
        Token COMMA148=null;
        Token COMMA149=null;
        Token LIST_CLOSE150=null;
        ReoLangParser.port_access_return p1 = null;

        ReoLangParser.port_access_return p2 = null;

        ReoLangParser.port_access_return p3 = null;

        ReoLangParser.port_access_return p4 = null;


        Object LIST_OPEN146_tree=null;
        Object COLON147_tree=null;
        Object COMMA148_tree=null;
        Object COMMA149_tree=null;
        Object LIST_CLOSE150_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_LIST_OPEN=new RewriteRuleTokenStream(adaptor,"token LIST_OPEN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LIST_CLOSE=new RewriteRuleTokenStream(adaptor,"token LIST_CLOSE");
        RewriteRuleSubtreeStream stream_port_access=new RewriteRuleSubtreeStream(adaptor,"rule port_access");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:344:2: ( LIST_OPEN p1= port_access COLON p2= port_access COMMA p3= port_access ( COMMA p4= port_access )* LIST_CLOSE -> ^( PORT_ACCESS_LIST $p1 $p2 $p3 ( $p4)* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:344:4: LIST_OPEN p1= port_access COLON p2= port_access COMMA p3= port_access ( COMMA p4= port_access )* LIST_CLOSE
            {
            LIST_OPEN146=(Token)match(input,LIST_OPEN,FOLLOW_LIST_OPEN_in_special_port_access_list1762);  
            stream_LIST_OPEN.add(LIST_OPEN146);

            pushFollow(FOLLOW_port_access_in_special_port_access_list1766);
            p1=port_access();

            state._fsp--;

            stream_port_access.add(p1.getTree());
            COLON147=(Token)match(input,COLON,FOLLOW_COLON_in_special_port_access_list1768);  
            stream_COLON.add(COLON147);

            pushFollow(FOLLOW_port_access_in_special_port_access_list1772);
            p2=port_access();

            state._fsp--;

            stream_port_access.add(p2.getTree());
            COMMA148=(Token)match(input,COMMA,FOLLOW_COMMA_in_special_port_access_list1774);  
            stream_COMMA.add(COMMA148);

            pushFollow(FOLLOW_port_access_in_special_port_access_list1778);
            p3=port_access();

            state._fsp--;

            stream_port_access.add(p3.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:344:71: ( COMMA p4= port_access )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:344:72: COMMA p4= port_access
            	    {
            	    COMMA149=(Token)match(input,COMMA,FOLLOW_COMMA_in_special_port_access_list1781);  
            	    stream_COMMA.add(COMMA149);

            	    pushFollow(FOLLOW_port_access_in_special_port_access_list1785);
            	    p4=port_access();

            	    state._fsp--;

            	    stream_port_access.add(p4.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            LIST_CLOSE150=(Token)match(input,LIST_CLOSE,FOLLOW_LIST_CLOSE_in_special_port_access_list1789);  
            stream_LIST_CLOSE.add(LIST_CLOSE150);



            // AST REWRITE
            // elements: p3, p1, p2, p4
            // token labels: 
            // rule labels: retval, p4, p3, p2, p1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_p4=new RewriteRuleSubtreeStream(adaptor,"rule p4",p4!=null?p4.tree:null);
            RewriteRuleSubtreeStream stream_p3=new RewriteRuleSubtreeStream(adaptor,"rule p3",p3!=null?p3.tree:null);
            RewriteRuleSubtreeStream stream_p2=new RewriteRuleSubtreeStream(adaptor,"rule p2",p2!=null?p2.tree:null);
            RewriteRuleSubtreeStream stream_p1=new RewriteRuleSubtreeStream(adaptor,"rule p1",p1!=null?p1.tree:null);

            root_0 = (Object)adaptor.nil();
            // 345:3: -> ^( PORT_ACCESS_LIST $p1 $p2 $p3 ( $p4)* )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:345:6: ^( PORT_ACCESS_LIST $p1 $p2 $p3 ( $p4)* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PORT_ACCESS_LIST, "PORT_ACCESS_LIST"), root_1);

                adaptor.addChild(root_1, stream_p1.nextTree());
                adaptor.addChild(root_1, stream_p2.nextTree());
                adaptor.addChild(root_1, stream_p3.nextTree());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:345:37: ( $p4)*
                while ( stream_p4.hasNext() ) {
                    adaptor.addChild(root_1, stream_p4.nextTree());

                }
                stream_p4.reset();

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
    // $ANTLR end "special_port_access_list"

    public static class stochastic_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stochastic_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:353:1: stochastic_def : RW_STOCHASTIC i1= ID stochastic_list i2= ID -> ^( RW_STOCHASTIC $i1 $i2 stochastic_list ) ;
    public final ReoLangParser.stochastic_def_return stochastic_def() throws RecognitionException {
        ReoLangParser.stochastic_def_return retval = new ReoLangParser.stochastic_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token RW_STOCHASTIC151=null;
        ReoLangParser.stochastic_list_return stochastic_list152 = null;


        Object i1_tree=null;
        Object i2_tree=null;
        Object RW_STOCHASTIC151_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RW_STOCHASTIC=new RewriteRuleTokenStream(adaptor,"token RW_STOCHASTIC");
        RewriteRuleSubtreeStream stream_stochastic_list=new RewriteRuleSubtreeStream(adaptor,"rule stochastic_list");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:354:2: ( RW_STOCHASTIC i1= ID stochastic_list i2= ID -> ^( RW_STOCHASTIC $i1 $i2 stochastic_list ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:354:4: RW_STOCHASTIC i1= ID stochastic_list i2= ID
            {
            RW_STOCHASTIC151=(Token)match(input,RW_STOCHASTIC,FOLLOW_RW_STOCHASTIC_in_stochastic_def1831);  
            stream_RW_STOCHASTIC.add(RW_STOCHASTIC151);

            i1=(Token)match(input,ID,FOLLOW_ID_in_stochastic_def1835);  
            stream_ID.add(i1);

            pushFollow(FOLLOW_stochastic_list_in_stochastic_def1838);
            stochastic_list152=stochastic_list();

            state._fsp--;

            stream_stochastic_list.add(stochastic_list152.getTree());
            i2=(Token)match(input,ID,FOLLOW_ID_in_stochastic_def1842);  
            stream_ID.add(i2);



            // AST REWRITE
            // elements: stochastic_list, i2, i1, RW_STOCHASTIC
            // token labels: i2, i1
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
            RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 355:3: -> ^( RW_STOCHASTIC $i1 $i2 stochastic_list )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:355:6: ^( RW_STOCHASTIC $i1 $i2 stochastic_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_RW_STOCHASTIC.nextNode(), root_1);

                adaptor.addChild(root_1, stream_i1.nextNode());
                adaptor.addChild(root_1, stream_i2.nextNode());
                adaptor.addChild(root_1, stream_stochastic_list.nextTree());

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
    // $ANTLR end "stochastic_def"

    public static class stochastic_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stochastic_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:358:1: stochastic_list : BODY_OPEN ( stoch_elem )+ BODY_CLOSE -> ( stoch_elem )+ ;
    public final ReoLangParser.stochastic_list_return stochastic_list() throws RecognitionException {
        ReoLangParser.stochastic_list_return retval = new ReoLangParser.stochastic_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BODY_OPEN153=null;
        Token BODY_CLOSE155=null;
        ReoLangParser.stoch_elem_return stoch_elem154 = null;


        Object BODY_OPEN153_tree=null;
        Object BODY_CLOSE155_tree=null;
        RewriteRuleTokenStream stream_BODY_OPEN=new RewriteRuleTokenStream(adaptor,"token BODY_OPEN");
        RewriteRuleTokenStream stream_BODY_CLOSE=new RewriteRuleTokenStream(adaptor,"token BODY_CLOSE");
        RewriteRuleSubtreeStream stream_stoch_elem=new RewriteRuleSubtreeStream(adaptor,"rule stoch_elem");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:359:2: ( BODY_OPEN ( stoch_elem )+ BODY_CLOSE -> ( stoch_elem )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:359:4: BODY_OPEN ( stoch_elem )+ BODY_CLOSE
            {
            BODY_OPEN153=(Token)match(input,BODY_OPEN,FOLLOW_BODY_OPEN_in_stochastic_list1870);  
            stream_BODY_OPEN.add(BODY_OPEN153);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:359:14: ( stoch_elem )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ID) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:359:14: stoch_elem
            	    {
            	    pushFollow(FOLLOW_stoch_elem_in_stochastic_list1872);
            	    stoch_elem154=stoch_elem();

            	    state._fsp--;

            	    stream_stoch_elem.add(stoch_elem154.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            BODY_CLOSE155=(Token)match(input,BODY_CLOSE,FOLLOW_BODY_CLOSE_in_stochastic_list1875);  
            stream_BODY_CLOSE.add(BODY_CLOSE155);



            // AST REWRITE
            // elements: stoch_elem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 360:3: -> ( stoch_elem )+
            {
                if ( !(stream_stoch_elem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_stoch_elem.hasNext() ) {
                    adaptor.addChild(root_0, stream_stoch_elem.nextTree());

                }
                stream_stoch_elem.reset();

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
    // $ANTLR end "stochastic_list"

    public static class stoch_elem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stoch_elem"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:363:1: stoch_elem : ( ID ( LABEL_MARK ID )? TIME_MARK stoch_val SEMICOLON ) -> ^( STOCH ID ( ID )? stoch_val ) ;
    public final ReoLangParser.stoch_elem_return stoch_elem() throws RecognitionException {
        ReoLangParser.stoch_elem_return retval = new ReoLangParser.stoch_elem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID156=null;
        Token LABEL_MARK157=null;
        Token ID158=null;
        Token TIME_MARK159=null;
        Token SEMICOLON161=null;
        ReoLangParser.stoch_val_return stoch_val160 = null;


        Object ID156_tree=null;
        Object LABEL_MARK157_tree=null;
        Object ID158_tree=null;
        Object TIME_MARK159_tree=null;
        Object SEMICOLON161_tree=null;
        RewriteRuleTokenStream stream_TIME_MARK=new RewriteRuleTokenStream(adaptor,"token TIME_MARK");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LABEL_MARK=new RewriteRuleTokenStream(adaptor,"token LABEL_MARK");
        RewriteRuleSubtreeStream stream_stoch_val=new RewriteRuleSubtreeStream(adaptor,"rule stoch_val");
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:364:2: ( ( ID ( LABEL_MARK ID )? TIME_MARK stoch_val SEMICOLON ) -> ^( STOCH ID ( ID )? stoch_val ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:364:4: ( ID ( LABEL_MARK ID )? TIME_MARK stoch_val SEMICOLON )
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:364:4: ( ID ( LABEL_MARK ID )? TIME_MARK stoch_val SEMICOLON )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:364:5: ID ( LABEL_MARK ID )? TIME_MARK stoch_val SEMICOLON
            {
            ID156=(Token)match(input,ID,FOLLOW_ID_in_stoch_elem1896);  
            stream_ID.add(ID156);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:364:8: ( LABEL_MARK ID )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==LABEL_MARK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:364:9: LABEL_MARK ID
                    {
                    LABEL_MARK157=(Token)match(input,LABEL_MARK,FOLLOW_LABEL_MARK_in_stoch_elem1899);  
                    stream_LABEL_MARK.add(LABEL_MARK157);

                    ID158=(Token)match(input,ID,FOLLOW_ID_in_stoch_elem1901);  
                    stream_ID.add(ID158);


                    }
                    break;

            }

            TIME_MARK159=(Token)match(input,TIME_MARK,FOLLOW_TIME_MARK_in_stoch_elem1905);  
            stream_TIME_MARK.add(TIME_MARK159);

            pushFollow(FOLLOW_stoch_val_in_stoch_elem1907);
            stoch_val160=stoch_val();

            state._fsp--;

            stream_stoch_val.add(stoch_val160.getTree());
            SEMICOLON161=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stoch_elem1909);  
            stream_SEMICOLON.add(SEMICOLON161);


            }



            // AST REWRITE
            // elements: ID, ID, stoch_val
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 365:3: -> ^( STOCH ID ( ID )? stoch_val )
            {
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:365:6: ^( STOCH ID ( ID )? stoch_val )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STOCH, "STOCH"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:365:17: ( ID )?
                if ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();
                adaptor.addChild(root_1, stream_stoch_val.nextTree());

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
    // $ANTLR end "stoch_elem"

    public static class stoch_val_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stoch_val"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:368:1: stoch_val : ( FLOAT -> ^( STOCH_VAL FLOAT ) | PORTS_OPEN FLOAT COMMA FLOAT PORTS_CLOSE -> ^( STOCH_VAL FLOAT FLOAT ) );
    public final ReoLangParser.stoch_val_return stoch_val() throws RecognitionException {
        ReoLangParser.stoch_val_return retval = new ReoLangParser.stoch_val_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FLOAT162=null;
        Token PORTS_OPEN163=null;
        Token FLOAT164=null;
        Token COMMA165=null;
        Token FLOAT166=null;
        Token PORTS_CLOSE167=null;

        Object FLOAT162_tree=null;
        Object PORTS_OPEN163_tree=null;
        Object FLOAT164_tree=null;
        Object COMMA165_tree=null;
        Object FLOAT166_tree=null;
        Object PORTS_CLOSE167_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_PORTS_OPEN=new RewriteRuleTokenStream(adaptor,"token PORTS_OPEN");
        RewriteRuleTokenStream stream_PORTS_CLOSE=new RewriteRuleTokenStream(adaptor,"token PORTS_CLOSE");

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:369:2: ( FLOAT -> ^( STOCH_VAL FLOAT ) | PORTS_OPEN FLOAT COMMA FLOAT PORTS_CLOSE -> ^( STOCH_VAL FLOAT FLOAT ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==FLOAT) ) {
                alt41=1;
            }
            else if ( (LA41_0==PORTS_OPEN) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:369:4: FLOAT
                    {
                    FLOAT162=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_stoch_val1937);  
                    stream_FLOAT.add(FLOAT162);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 370:3: -> ^( STOCH_VAL FLOAT )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:370:6: ^( STOCH_VAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STOCH_VAL, "STOCH_VAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:371:4: PORTS_OPEN FLOAT COMMA FLOAT PORTS_CLOSE
                    {
                    PORTS_OPEN163=(Token)match(input,PORTS_OPEN,FOLLOW_PORTS_OPEN_in_stoch_val1958);  
                    stream_PORTS_OPEN.add(PORTS_OPEN163);

                    FLOAT164=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_stoch_val1960);  
                    stream_FLOAT.add(FLOAT164);

                    COMMA165=(Token)match(input,COMMA,FOLLOW_COMMA_in_stoch_val1962);  
                    stream_COMMA.add(COMMA165);

                    FLOAT166=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_stoch_val1964);  
                    stream_FLOAT.add(FLOAT166);

                    PORTS_CLOSE167=(Token)match(input,PORTS_CLOSE,FOLLOW_PORTS_CLOSE_in_stoch_val1966);  
                    stream_PORTS_CLOSE.add(PORTS_CLOSE167);



                    // AST REWRITE
                    // elements: FLOAT, FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 372:3: -> ^( STOCH_VAL FLOAT FLOAT )
                    {
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangParser.g:372:6: ^( STOCH_VAL FLOAT FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STOCH_VAL, "STOCH_VAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());
                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

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
    // $ANTLR end "stoch_val"

    // Delegated rules


 

    public static final BitSet FOLLOW_directive_def_in_reolang255 = new BitSet(new long[]{0x00000000000E0802L});
    public static final BitSet FOLLOW_element_in_reolang258 = new BitSet(new long[]{0x00000000000A0802L});
    public static final BitSet FOLLOW_channel_def_in_element283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pattern_def_in_element297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stochastic_def_in_element311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directive_import_in_directive_def335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_IMPORT_in_directive_import356 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_FILE_PATH_in_directive_import358 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_directive_import360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_CHANNEL_in_channel_def391 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_channel_signature_in_channel_def393 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_extension_in_channel_def395 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BODY_OPEN_in_channel_def398 = new BitSet(new long[]{0x0000040100010000L});
    public static final BitSet FOLLOW_channel_body_in_channel_def400 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_BODY_CLOSE_in_channel_def402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_channel_signature432 = new BitSet(new long[]{0x0000001804000000L});
    public static final BitSet FOLLOW_option_in_channel_signature434 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PORTS_OPEN_in_channel_signature437 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_ports_in_channel_signature441 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_channel_signature444 = new BitSet(new long[]{0x000004000A000000L});
    public static final BitSet FOLLOW_ports_in_channel_signature448 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COLON_in_channel_signature452 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_channel_signature454 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUALS_in_channel_signature456 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_condition_in_channel_signature458 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PORTS_CLOSE_in_channel_signature462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timed_in_option522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structured_in_option536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIME_MARK_in_timed556 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_time_in_timed558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_time581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_time598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRUCTURE_MARK_in_structured622 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_structure_dimension_in_structured624 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COMMA_in_structured627 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_structure_dimension_in_structured629 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ID_in_structure_dimension656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_structure_dimension672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_ports695 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COMMA_in_ports698 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_ports700 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COND_OPEN_in_condition727 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_condition729 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_COMMA_in_condition732 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_condition734 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_COND_CLOSE_in_condition738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_EXTENDS_in_extension760 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_extension762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_def_in_channel_body783 = new BitSet(new long[]{0x0000040100010000L});
    public static final BitSet FOLLOW_flow_def_in_channel_body786 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_channel_body788 = new BitSet(new long[]{0x0000040100010002L});
    public static final BitSet FOLLOW_flow_def_in_channel_body791 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_channel_body793 = new BitSet(new long[]{0x0000040100010002L});
    public static final BitSet FOLLOW_RW_STATE_in_state_def827 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_state_def829 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_state_def831 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_state_def833 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RW_OBSERVERS_in_state_def835 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_state_def837 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_state_def839 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_COMMA_in_state_def842 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_state_def844 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_state_def848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requests_in_flow_def883 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ARROW_MARK_in_flow_def885 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_flow_type_in_flow_def887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_request_in_requests912 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COMMA_in_requests915 = new BitSet(new long[]{0x0000040100010000L});
    public static final BitSet FOLLOW_request_in_requests917 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ID_in_request942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_MARK_in_request955 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_request957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type980 = new BitSet(new long[]{0x0000002400000002L});
    public static final BitSet FOLLOW_flow_operation_in_flow_type983 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type985 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_flow_label_in_flow_type989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_flow_in_flow_type1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_FLOW_in_normal_flow1038 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow1040 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RW_TO_in_normal_flow1042 = new BitSet(new long[]{0x0000041000000400L});
    public static final BitSet FOLLOW_timed_in_normal_flow1044 = new BitSet(new long[]{0x0000040000000400L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_flow_point1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_NULL_in_flow_point1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SYNC_in_flow_operation1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_if_flow1135 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_QUESTION_MARK_in_if_flow1137 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_flow_type_in_if_flow1139 = new BitSet(new long[]{0x0000000402000000L});
    public static final BitSet FOLLOW_flow_label_in_if_flow1143 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_if_flow1146 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_flow_type_in_if_flow1148 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_flow_label_in_if_flow1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_MARK_in_flow_label1199 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_flow_label1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_PATTERN_in_pattern_def1229 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_pattern_signature_in_pattern_def1231 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_BODY_OPEN_in_pattern_def1233 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_pattern_body_in_pattern_def1235 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_BODY_CLOSE_in_pattern_def1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_pattern_signature1263 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_PORTS_OPEN_in_pattern_signature1265 = new BitSet(new long[]{0x0000040002000000L});
    public static final BitSet FOLLOW_ports_in_pattern_signature1269 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_pattern_signature1272 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_ports_in_pattern_signature1276 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PORTS_CLOSE_in_pattern_signature1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_USE_in_pattern_body1327 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_pattern_body1329 = new BitSet(new long[]{0x0000040004000000L});
    public static final BitSet FOLLOW_pattern_declarations_in_pattern_body1331 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RW_IN_in_pattern_body1333 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_pattern_body1335 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_pattern_compositions_in_pattern_body1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations1361 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_declarations1363 = new BitSet(new long[]{0x0000040004000002L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations1366 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_declarations1368 = new BitSet(new long[]{0x0000040004000002L});
    public static final BitSet FOLLOW_reference_signature_in_declaration1394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RW_AS_in_declaration1396 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_instances_in_declaration1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PORTS_OPEN_in_reference_signature1423 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_reference_signature1425 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PORTS_CLOSE_in_reference_signature1427 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_channel_signature_in_reference_signature1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instances1459 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_COMMA_in_instances1463 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_instances1467 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions1506 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1508 = new BitSet(new long[]{0x0000040000000032L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions1511 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1513 = new BitSet(new long[]{0x0000040000000032L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions1518 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1520 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions1523 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_pattern_compositions1525 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ID_in_port_definition1556 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUALS_in_port_definition1558 = new BitSet(new long[]{0x0000040000000030L});
    public static final BitSet FOLLOW_port_actual_definition_in_port_definition1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_port_access_in_port_actual_definition1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_part_in_port_actual_definition1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_port_access1618 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ACCESS_MARK_in_port_access1620 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_port_access1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_part_in_join_operation1646 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RW_AS_in_join_operation1648 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_join_operation1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_JOIN_in_join_part1676 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_port_access_list_in_join_part1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_DECIDE_in_join_part1695 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_special_port_access_list_in_join_part1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_OPEN_in_port_access_list1724 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_port_access_in_port_access_list1726 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_COMMA_in_port_access_list1729 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_port_access_in_port_access_list1731 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_LIST_CLOSE_in_port_access_list1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_OPEN_in_special_port_access_list1762 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1766 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COLON_in_special_port_access_list1768 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1772 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_special_port_access_list1774 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1778 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_COMMA_in_special_port_access_list1781 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1785 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_LIST_CLOSE_in_special_port_access_list1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RW_STOCHASTIC_in_stochastic_def1831 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_stochastic_def1835 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_stochastic_list_in_stochastic_def1838 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_stochastic_def1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BODY_OPEN_in_stochastic_list1870 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_stoch_elem_in_stochastic_list1872 = new BitSet(new long[]{0x0000040020000000L});
    public static final BitSet FOLLOW_BODY_CLOSE_in_stochastic_list1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stoch_elem1896 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_LABEL_MARK_in_stoch_elem1899 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_stoch_elem1901 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_TIME_MARK_in_stoch_elem1905 = new BitSet(new long[]{0x0000100004000000L});
    public static final BitSet FOLLOW_stoch_val_in_stoch_elem1907 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SEMICOLON_in_stoch_elem1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_stoch_val1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PORTS_OPEN_in_stoch_val1958 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stoch_val1960 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COMMA_in_stoch_val1962 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stoch_val1964 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PORTS_CLOSE_in_stoch_val1966 = new BitSet(new long[]{0x0000000000000002L});

}