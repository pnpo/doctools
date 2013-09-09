// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g 2013-04-11 03:11:56

	package pt.uminho.di.reolang;
	
	import java.text.*;
	import java.util.Date;
	import java.util.Iterator;	
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.reolang.parsing.*;
	


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class ReoLangSemantics extends TreeParser {
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
    public static final int IMPORT=53;
    public static final int ARROW_MARK=32;
    public static final int RW_TO=14;
    public static final int COND_OPEN=37;
    public static final int RW_JOIN=5;
    public static final int ACCESS_MARK=29;
    public static final int STRUCTURED=59;
    public static final int FLOWS=69;
    public static final int RW_NULL=10;
    public static final int QUESTION_MARK=30;
    public static final int CHANNEL=54;
    public static final int ELEMENT=51;
    public static final int DIMENSION=60;
    public static final int COND_ELEMENTS=66;
    public static final int FLOW_TRUE=81;
    public static final int LIST_OPEN=19;
    public static final int RW_EXTENDS=12;
    public static final int COMMENT=44;
    public static final int PORTS_OPEN=25;
    public static final int REO_LANG=50;
    public static final int IF_FLOW=80;
    public static final int REQUESTS=74;
    public static final int BODY_OPEN=27;
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


        public ReoLangSemantics(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ReoLangSemantics(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ReoLangSemantics.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g"; }


    protected static class reolang_scope {
        SymbolsTable global_table;
        String file;
        SymbolsTable actual_scope;
    }
    protected Stack reolang_stack = new Stack();

    public static class reolang_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
        public SymbolsTable symbols;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reolang"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:25:1: reolang[ArrayList<Error> i_errors, String i_file, SymbolsTable i_gtable] returns [ArrayList<Error> errors, SymbolsTable symbols] : ^( REO_LANG (e1= directive_def )* (e2= element )+ ) ;
    public final ReoLangSemantics.reolang_return reolang(ArrayList<Error> i_errors, String i_file, SymbolsTable i_gtable) throws RecognitionException {
        reolang_stack.push(new reolang_scope());
        ReoLangSemantics.reolang_return retval = new ReoLangSemantics.reolang_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REO_LANG1=null;
        ReoLangSemantics.directive_def_return e1 = null;

        ReoLangSemantics.element_return e2 = null;


        CommonTree REO_LANG1_tree=null;


        		((reolang_scope)reolang_stack.peek()).global_table = i_gtable;
        		((reolang_scope)reolang_stack.peek()).file = i_file;
        		((reolang_scope)reolang_stack.peek()).actual_scope = null;
        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:40:2: ( ^( REO_LANG (e1= directive_def )* (e2= element )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:40:3: ^( REO_LANG (e1= directive_def )* (e2= element )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            REO_LANG1=(CommonTree)match(input,REO_LANG,FOLLOW_REO_LANG_in_reolang66); 
            REO_LANG1_tree = (CommonTree)adaptor.dupNode(REO_LANG1);

            root_1 = (CommonTree)adaptor.becomeRoot(REO_LANG1_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:40:14: (e1= directive_def )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DIRECTIVE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:40:15: e1= directive_def
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_directive_def_in_reolang71);
            	    e1=directive_def();

            	    state._fsp--;

            	    adaptor.addChild(root_1, e1.getTree());

            	    		local_errors.addAll((e1!=null?e1.o_errors:null));
            	    	

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:44:5: (e2= element )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ELEMENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:44:6: e2= element
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_element_in_reolang84);
            	    e2=element();

            	    state._fsp--;

            	    adaptor.addChild(root_1, e2.getTree());

            	    		local_errors.addAll((e2!=null?e2.o_errors:null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		local_errors.addAll(i_errors);
            		retval.errors = local_errors;
            		retval.symbols = ((reolang_scope)reolang_stack.peek()).global_table;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            reolang_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "reolang"

    public static class element_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:63:1: element returns [ArrayList<Error> o_errors] : ( ^( ELEMENT channel_def ) | ^( ELEMENT pattern_def ) );
    public final ReoLangSemantics.element_return element() throws RecognitionException {
        ReoLangSemantics.element_return retval = new ReoLangSemantics.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ELEMENT2=null;
        CommonTree ELEMENT4=null;
        ReoLangSemantics.channel_def_return channel_def3 = null;

        ReoLangSemantics.pattern_def_return pattern_def5 = null;


        CommonTree ELEMENT2_tree=null;
        CommonTree ELEMENT4_tree=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:65:2: ( ^( ELEMENT channel_def ) | ^( ELEMENT pattern_def ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ELEMENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==PATTERN) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==CHANNEL) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:65:4: ^( ELEMENT channel_def )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ELEMENT2=(CommonTree)match(input,ELEMENT,FOLLOW_ELEMENT_in_element129); 
                    ELEMENT2_tree = (CommonTree)adaptor.dupNode(ELEMENT2);

                    root_1 = (CommonTree)adaptor.becomeRoot(ELEMENT2_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_channel_def_in_element131);
                    channel_def3=channel_def();

                    state._fsp--;

                    adaptor.addChild(root_1, channel_def3.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		retval.o_errors = (channel_def3!=null?channel_def3.o_errors:null);
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:71:4: ^( ELEMENT pattern_def )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ELEMENT4=(CommonTree)match(input,ELEMENT,FOLLOW_ELEMENT_in_element146); 
                    ELEMENT4_tree = (CommonTree)adaptor.dupNode(ELEMENT4);

                    root_1 = (CommonTree)adaptor.becomeRoot(ELEMENT4_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_pattern_def_in_element148);
                    pattern_def5=pattern_def();

                    state._fsp--;

                    adaptor.addChild(root_1, pattern_def5.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		retval.o_errors = (pattern_def5!=null?pattern_def5.o_errors:null);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class directive_def_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:96:1: directive_def returns [ArrayList<Error> o_errors] : ^( DIRECTIVE directive_import ) ;
    public final ReoLangSemantics.directive_def_return directive_def() throws RecognitionException {
        ReoLangSemantics.directive_def_return retval = new ReoLangSemantics.directive_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DIRECTIVE6=null;
        ReoLangSemantics.directive_import_return directive_import7 = null;


        CommonTree DIRECTIVE6_tree=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:98:2: ( ^( DIRECTIVE directive_import ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:98:4: ^( DIRECTIVE directive_import )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DIRECTIVE6=(CommonTree)match(input,DIRECTIVE,FOLLOW_DIRECTIVE_in_directive_def201); 
            DIRECTIVE6_tree = (CommonTree)adaptor.dupNode(DIRECTIVE6);

            root_1 = (CommonTree)adaptor.becomeRoot(DIRECTIVE6_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_directive_import_in_directive_def203);
            directive_import7=directive_import();

            state._fsp--;

            adaptor.addChild(root_1, directive_import7.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.o_errors = (directive_import7!=null?directive_import7.o_errors:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "directive_def"

    public static class directive_import_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive_import"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:105:1: directive_import returns [ArrayList<Error> o_errors] : ^( IMPORT FILE_PATH ) ;
    public final ReoLangSemantics.directive_import_return directive_import() throws RecognitionException {
        ReoLangSemantics.directive_import_return retval = new ReoLangSemantics.directive_import_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IMPORT8=null;
        CommonTree FILE_PATH9=null;

        CommonTree IMPORT8_tree=null;
        CommonTree FILE_PATH9_tree=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:106:2: ( ^( IMPORT FILE_PATH ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:106:4: ^( IMPORT FILE_PATH )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IMPORT8=(CommonTree)match(input,IMPORT,FOLLOW_IMPORT_in_directive_import227); 
            IMPORT8_tree = (CommonTree)adaptor.dupNode(IMPORT8);

            root_1 = (CommonTree)adaptor.becomeRoot(IMPORT8_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            FILE_PATH9=(CommonTree)match(input,FILE_PATH,FOLLOW_FILE_PATH_in_directive_import229); 
            FILE_PATH9_tree = (CommonTree)adaptor.dupNode(FILE_PATH9);

            adaptor.addChild(root_1, FILE_PATH9_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		String file_string = (FILE_PATH9!=null?FILE_PATH9.getText():null);
            		String file = file_string.substring(1,file_string.length()-1);
            		Semantics semantics = new Semantics(file);
            		ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis(((reolang_scope)reolang_stack.peek()).global_table);
            		retval.o_errors = imported_atts != null ? imported_atts.errors : new ArrayList<Error>(0);
            		((reolang_scope)reolang_stack.peek()).global_table = imported_atts != null ? imported_atts.symbols : ((reolang_scope)reolang_stack.peek()).global_table ;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "directive_import"

    protected static class channel_def_scope {
        SymbolsTable channel_table;
        String channel_name;
        int channel_line;
        int channel_pos;
    }
    protected Stack channel_def_stack = new Stack();

    public static class channel_def_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "channel_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:134:1: channel_def returns [ArrayList<Error> o_errors] : ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body ) ;
    public final ReoLangSemantics.channel_def_return channel_def() throws RecognitionException {
        channel_def_stack.push(new channel_def_scope());
        ReoLangSemantics.channel_def_return retval = new ReoLangSemantics.channel_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CHANNEL10=null;
        ReoLangSemantics.channel_signature_return channel_signature11 = null;

        ReoLangSemantics.extension_return extension12 = null;

        ReoLangSemantics.channel_body_return channel_body13 = null;


        CommonTree CHANNEL10_tree=null;


        		((channel_def_scope)channel_def_stack.peek()).channel_table = new SymbolsTable();
        		((channel_def_scope)channel_def_stack.peek()).channel_name = "";
        		((channel_def_scope)channel_def_stack.peek()).channel_line = 0;
        		((channel_def_scope)channel_def_stack.peek()).channel_pos = 0;
        		((reolang_scope)reolang_stack.peek()).actual_scope = ((channel_def_scope)channel_def_stack.peek()).channel_table;
        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:150:2: ( ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:150:4: ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CHANNEL10=(CommonTree)match(input,CHANNEL,FOLLOW_CHANNEL_in_channel_def288); 
            CHANNEL10_tree = (CommonTree)adaptor.dupNode(CHANNEL10);

            root_1 = (CommonTree)adaptor.becomeRoot(CHANNEL10_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_channel_signature_in_channel_def290);
            channel_signature11=channel_signature(InspectionMode.DECLARATION);

            state._fsp--;

            adaptor.addChild(root_1, channel_signature11.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:150:60: ( extension )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENSION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:150:61: extension
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_extension_in_channel_def294);
                    extension12=extension();

                    state._fsp--;

                    adaptor.addChild(root_1, extension12.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_channel_body_in_channel_def298);
            channel_body13=channel_body();

            state._fsp--;

            adaptor.addChild(root_1, channel_body13.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		local_errors.addAll((channel_signature11!=null?channel_signature11.o_errors:null));
            		local_errors.addAll((extension12!=null?extension12.o_errors:null) == null? new ArrayList<Error>(0) : (extension12!=null?extension12.o_errors:null) );
            		local_errors.addAll((channel_body13!=null?channel_body13.o_errors:null));
            		retval.o_errors = local_errors;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            channel_def_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "channel_def"

    public static class channel_signature_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public Symbol o_channel_sig;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "channel_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:174:1: channel_signature[InspectionMode mode] returns [ArrayList<Error> o_errors, Symbol o_channel_sig] : ^( SIGNATURE name= ID ( option[$channel_signature.mode] )? ^( CHANNEL_PORTS ( ^( IN_PORTS in= ports[$channel_signature.mode, PortOrientation.IN] ) )? ( ^( OUT_PORTS out= ports[$channel_signature.mode, PortOrientation.OUT] ) )? ) ( ^( CONDITION condname= ID condition[$channel_signature.mode] ) )? ) ;
    public final ReoLangSemantics.channel_signature_return channel_signature(InspectionMode mode) throws RecognitionException {
        ReoLangSemantics.channel_signature_return retval = new ReoLangSemantics.channel_signature_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree name=null;
        CommonTree condname=null;
        CommonTree SIGNATURE14=null;
        CommonTree CHANNEL_PORTS16=null;
        CommonTree IN_PORTS17=null;
        CommonTree OUT_PORTS18=null;
        CommonTree CONDITION19=null;
        ReoLangSemantics.ports_return in = null;

        ReoLangSemantics.ports_return out = null;

        ReoLangSemantics.option_return option15 = null;

        ReoLangSemantics.condition_return condition20 = null;


        CommonTree name_tree=null;
        CommonTree condname_tree=null;
        CommonTree SIGNATURE14_tree=null;
        CommonTree CHANNEL_PORTS16_tree=null;
        CommonTree IN_PORTS17_tree=null;
        CommonTree OUT_PORTS18_tree=null;
        CommonTree CONDITION19_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		Symbol sym = new Symbol(); 
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:2: ( ^( SIGNATURE name= ID ( option[$channel_signature.mode] )? ^( CHANNEL_PORTS ( ^( IN_PORTS in= ports[$channel_signature.mode, PortOrientation.IN] ) )? ( ^( OUT_PORTS out= ports[$channel_signature.mode, PortOrientation.OUT] ) )? ) ( ^( CONDITION condname= ID condition[$channel_signature.mode] ) )? ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:4: ^( SIGNATURE name= ID ( option[$channel_signature.mode] )? ^( CHANNEL_PORTS ( ^( IN_PORTS in= ports[$channel_signature.mode, PortOrientation.IN] ) )? ( ^( OUT_PORTS out= ports[$channel_signature.mode, PortOrientation.OUT] ) )? ) ( ^( CONDITION condname= ID condition[$channel_signature.mode] ) )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SIGNATURE14=(CommonTree)match(input,SIGNATURE,FOLLOW_SIGNATURE_in_channel_signature359); 
            SIGNATURE14_tree = (CommonTree)adaptor.dupNode(SIGNATURE14);

            root_1 = (CommonTree)adaptor.becomeRoot(SIGNATURE14_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            name=(CommonTree)match(input,ID,FOLLOW_ID_in_channel_signature363); 
            name_tree = (CommonTree)adaptor.dupNode(name);

            adaptor.addChild(root_1, name_tree);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:24: ( option[$channel_signature.mode] )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==OPTION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:25: option[$channel_signature.mode]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_option_in_channel_signature366);
                    option15=option(mode);

                    state._fsp--;

                    adaptor.addChild(root_1, option15.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CHANNEL_PORTS16=(CommonTree)match(input,CHANNEL_PORTS,FOLLOW_CHANNEL_PORTS_in_channel_signature373); 
            CHANNEL_PORTS16_tree = (CommonTree)adaptor.dupNode(CHANNEL_PORTS16);

            root_2 = (CommonTree)adaptor.becomeRoot(CHANNEL_PORTS16_tree, root_2);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:76: ( ^( IN_PORTS in= ports[$channel_signature.mode, PortOrientation.IN] ) )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IN_PORTS) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:77: ^( IN_PORTS in= ports[$channel_signature.mode, PortOrientation.IN] )
                        {
                        _last = (CommonTree)input.LT(1);
                        {
                        CommonTree _save_last_3 = _last;
                        CommonTree _first_3 = null;
                        CommonTree root_3 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                        IN_PORTS17=(CommonTree)match(input,IN_PORTS,FOLLOW_IN_PORTS_in_channel_signature377); 
                        IN_PORTS17_tree = (CommonTree)adaptor.dupNode(IN_PORTS17);

                        root_3 = (CommonTree)adaptor.becomeRoot(IN_PORTS17_tree, root_3);



                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_ports_in_channel_signature381);
                        in=ports(mode, PortOrientation.IN);

                        state._fsp--;

                        adaptor.addChild(root_3, in.getTree());

                        match(input, Token.UP, null); adaptor.addChild(root_2, root_3);_last = _save_last_3;
                        }


                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:146: ( ^( OUT_PORTS out= ports[$channel_signature.mode, PortOrientation.OUT] ) )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OUT_PORTS) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:147: ^( OUT_PORTS out= ports[$channel_signature.mode, PortOrientation.OUT] )
                        {
                        _last = (CommonTree)input.LT(1);
                        {
                        CommonTree _save_last_3 = _last;
                        CommonTree _first_3 = null;
                        CommonTree root_3 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                        OUT_PORTS18=(CommonTree)match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_channel_signature390); 
                        OUT_PORTS18_tree = (CommonTree)adaptor.dupNode(OUT_PORTS18);

                        root_3 = (CommonTree)adaptor.becomeRoot(OUT_PORTS18_tree, root_3);



                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_ports_in_channel_signature394);
                        out=ports(mode, PortOrientation.OUT);

                        state._fsp--;

                        adaptor.addChild(root_3, out.getTree());

                        match(input, Token.UP, null); adaptor.addChild(root_2, root_3);_last = _save_last_3;
                        }


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:220: ( ^( CONDITION condname= ID condition[$channel_signature.mode] ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CONDITION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:180:221: ^( CONDITION condname= ID condition[$channel_signature.mode] )
                    {
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONDITION19=(CommonTree)match(input,CONDITION,FOLLOW_CONDITION_in_channel_signature404); 
                    CONDITION19_tree = (CommonTree)adaptor.dupNode(CONDITION19);

                    root_2 = (CommonTree)adaptor.becomeRoot(CONDITION19_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    condname=(CommonTree)match(input,ID,FOLLOW_ID_in_channel_signature408); 
                    condname_tree = (CommonTree)adaptor.dupNode(condname);

                    adaptor.addChild(root_2, condname_tree);

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_channel_signature410);
                    condition20=condition(mode);

                    state._fsp--;

                    adaptor.addChild(root_2, condition20.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		// MODE DECLARATION
            		if(mode==InspectionMode.DECLARATION){
            			
            			//see if there's a channel with the name in ID in the symbols table
            			if(((reolang_scope)reolang_stack.peek()).global_table.isDefined((name!=null?name.getText():null))){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((name!=null?name.getText():null)), (name!=null?name.getLine():0), (name!=null?name.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			else{ //Create new global symbol and add to the table
            				
            				sym.setId((name!=null?name.getText():null));
            				sym.setLine((name!=null?name.getLine():0));
            				sym.setPosition((name!=null?name.getCharPositionInLine():0));
            				sym.setType(Type.CHANNEL.toString());
            				if((option15!=null?option15.dimensions:null) != null) {sym.setOptDimension((option15!=null?option15.dimensions:null));}
            				if((option15!=null?option15.optionalType:null) != null) {sym.setOptType((option15!=null?option15.optionalType:null));}
            				if((in!=null?in.ports_list:null) != null) {sym.setInArgs((in!=null?in.ports_list:null));}
            				if((out!=null?out.ports_list:null) != null) {sym.setOutArgs((out!=null?out.ports_list:null));}
            				if((condname!=null?condname.getText():null) != null) {sym.setCondName((condname!=null?condname.getText():null));}
            				if((condition20!=null?condition20.patterns:null) !=null) {sym.setCondPatterns((condition20!=null?condition20.patterns:null));}
            				((reolang_scope)reolang_stack.peek()).global_table.add(sym);
            			}
            			
            			//check existence of condname in scope 
            			if(condname != null && (((reolang_scope)reolang_stack.peek()).global_table.isDefined((condname!=null?condname.getText():null)) || ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((condname!=null?condname.getText():null)))){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((condname!=null?condname.getText():null)), (condname!=null?condname.getLine():0), (condname!=null?condname.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			else {
            				if(condname != null){
            					Symbol local_symbol = new Symbol();
            					local_symbol.setId((condname!=null?condname.getText():null));
            					local_symbol.setType(Type.CONDITION.toString());
            					local_symbol.setLine((condname!=null?condname.getLine():0));
            					local_symbol.setPosition((condname!=null?condname.getCharPositionInLine():0));
            					((channel_def_scope)channel_def_stack.peek()).channel_table.add(local_symbol);
            				}
            			}
            			
            			//check number of ports in total
            			if(sym.getNumberOfPorts() != 2){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfPortsInChannels((name!=null?name.getText():null)), (name!=null?name.getLine():0), (name!=null?name.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			
            			((channel_def_scope)channel_def_stack.peek()).channel_name = (name!=null?name.getText():null);
            			((channel_def_scope)channel_def_stack.peek()).channel_line = (name!=null?name.getLine():0);
            			((channel_def_scope)channel_def_stack.peek()).channel_pos = (name!=null?name.getCharPositionInLine():0);
            			
            		}
            		
            		//MODE REFERENCE
            		if(mode == InspectionMode.REF_BY_INSTANCE){
            			sym.setId((name!=null?name.getText():null));
            			sym.setLine((name!=null?name.getLine():0));
            			sym.setPosition((name!=null?name.getCharPositionInLine():0));
            			//sym.setType(Type.CHANNEL.toString()); //we don't know the type
            			if((option15!=null?option15.dimensions:null) != null) {sym.setOptDimension((option15!=null?option15.dimensions:null));}
            			if((option15!=null?option15.optionalType:null) != null) {sym.setOptType((option15!=null?option15.optionalType:null));}
            			if((in!=null?in.ports_list:null) != null) {sym.setInArgs((in!=null?in.ports_list:null));}
            			if((out!=null?out.ports_list:null) != null) {sym.setOutArgs((out!=null?out.ports_list:null));}
            			if((condname!=null?condname.getText():null) != null) {sym.setCondName((condname!=null?condname.getText():null));}
            			if((condition20!=null?condition20.patterns:null) !=null) {sym.setCondPatterns((condition20!=null?condition20.patterns:null));}
            		}
            		
            		
            		local_errors.addAll(((option15!=null?option15.o_errors:null) == null ? new ArrayList<Error>(0) : (option15!=null?option15.o_errors:null)));
            		local_errors.addAll(((in!=null?in.o_errors:null) == null ? new ArrayList<Error>(0) : (in!=null?in.o_errors:null)));
            		local_errors.addAll(((out!=null?out.o_errors:null) == null ? new ArrayList<Error>(0) : (out!=null?out.o_errors:null)));
            		local_errors.addAll(((condition20!=null?condition20.o_errors:null) == null ? new ArrayList<Error>(0) : (condition20!=null?condition20.o_errors:null)));
            		
            		retval.o_errors = local_errors ;
            									  
            		retval.o_channel_sig = sym;
            		
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "channel_signature"

    public static class option_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public Type optionalType;
        public ArrayList<Object> dimensions;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:272:1: option[InspectionMode mode] returns [ArrayList<Error> o_errors, Type optionalType, ArrayList<Object> dimensions] : ( ^( OPTION timed[$option.mode] ) | ^( OPTION structured[$option.mode] ) );
    public final ReoLangSemantics.option_return option(InspectionMode mode) throws RecognitionException {
        ReoLangSemantics.option_return retval = new ReoLangSemantics.option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OPTION21=null;
        CommonTree OPTION23=null;
        ReoLangSemantics.timed_return timed22 = null;

        ReoLangSemantics.structured_return structured24 = null;


        CommonTree OPTION21_tree=null;
        CommonTree OPTION23_tree=null;


        		ArrayList<Object> dims = new ArrayList<Object>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:276:2: ( ^( OPTION timed[$option.mode] ) | ^( OPTION structured[$option.mode] ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==OPTION) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==DOWN) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==TIMED) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==STRUCTURED) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:276:4: ^( OPTION timed[$option.mode] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OPTION21=(CommonTree)match(input,OPTION,FOLLOW_OPTION_in_option457); 
                    OPTION21_tree = (CommonTree)adaptor.dupNode(OPTION21);

                    root_1 = (CommonTree)adaptor.becomeRoot(OPTION21_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timed_in_option459);
                    timed22=timed(mode);

                    state._fsp--;

                    adaptor.addChild(root_1, timed22.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		retval.o_errors = (timed22!=null?timed22.o_errors:null);
                    		retval.optionalType = Type.TIME;
                    		dims.add((timed22!=null?timed22.time_value:null));
                    		retval.dimensions = dims;
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:284:4: ^( OPTION structured[$option.mode] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OPTION23=(CommonTree)match(input,OPTION,FOLLOW_OPTION_in_option473); 
                    OPTION23_tree = (CommonTree)adaptor.dupNode(OPTION23);

                    root_1 = (CommonTree)adaptor.becomeRoot(OPTION23_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_structured_in_option475);
                    structured24=structured(mode);

                    state._fsp--;

                    adaptor.addChild(root_1, structured24.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		retval.o_errors = (structured24!=null?structured24.o_errors:null);
                    		retval.optionalType = Type.STRUCTURE;
                    		retval.dimensions = (structured24!=null?structured24.dimensions:null); 
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "option"

    public static class timed_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public Object time_value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "timed"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:305:1: timed[InspectionMode mode] returns [ArrayList<Error> o_errors, Object time_value] : ^( TIMED time[$timed.mode] ) ;
    public final ReoLangSemantics.timed_return timed(InspectionMode mode) throws RecognitionException {
        ReoLangSemantics.timed_return retval = new ReoLangSemantics.timed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIMED25=null;
        ReoLangSemantics.time_return time26 = null;


        CommonTree TIMED25_tree=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:306:2: ( ^( TIMED time[$timed.mode] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:306:4: ^( TIMED time[$timed.mode] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TIMED25=(CommonTree)match(input,TIMED,FOLLOW_TIMED_in_timed526); 
            TIMED25_tree = (CommonTree)adaptor.dupNode(TIMED25);

            root_1 = (CommonTree)adaptor.becomeRoot(TIMED25_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_time_in_timed528);
            time26=time(mode);

            state._fsp--;

            adaptor.addChild(root_1, time26.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.o_errors = (time26!=null?time26.o_errors:null);
            		retval.time_value = (time26!=null?time26.time_value:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "timed"

    public static class time_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public Object time_value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:326:1: time[InspectionMode mode] returns [ArrayList<Error> o_errors, Object time_value] : ( ^( TIME ID ) | ^( TIME INT ) );
    public final ReoLangSemantics.time_return time(InspectionMode mode) throws RecognitionException {
        ReoLangSemantics.time_return retval = new ReoLangSemantics.time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TIME27=null;
        CommonTree ID28=null;
        CommonTree TIME29=null;
        CommonTree INT30=null;

        CommonTree TIME27_tree=null;
        CommonTree ID28_tree=null;
        CommonTree TIME29_tree=null;
        CommonTree INT30_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:331:2: ( ^( TIME ID ) | ^( TIME INT ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TIME) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==DOWN) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==ID) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==INT) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:331:4: ^( TIME ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TIME27=(CommonTree)match(input,TIME,FOLLOW_TIME_in_time586); 
                    TIME27_tree = (CommonTree)adaptor.dupNode(TIME27);

                    root_1 = (CommonTree)adaptor.becomeRoot(TIME27_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID28=(CommonTree)match(input,ID,FOLLOW_ID_in_time588); 
                    ID28_tree = (CommonTree)adaptor.dupNode(ID28);

                    adaptor.addChild(root_1, ID28_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		if(mode==InspectionMode.DECLARATION) { 
                    			//check for single and capital letter
                    			if( ((ID28!=null?ID28.getText():null)).length() > 1 || !Character.isUpperCase(((ID28!=null?ID28.getText():null)).charAt(0)) ) {
                    				local_errors.add(Error.report(ErrorType.WARNING, Error.nameConventionForDimension((ID28!=null?ID28.getText():null)), (ID28!=null?ID28.getLine():0), (ID28!=null?ID28.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			//check if the ID is defined globally or locally
                    			if( ((reolang_scope)reolang_stack.peek()).global_table.isDefined((ID28!=null?ID28.getText():null)) || ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID28!=null?ID28.getText():null))){
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID28!=null?ID28.getText():null)), (ID28!=null?ID28.getLine():0), (ID28!=null?ID28.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			else {
                    				Symbol new_local_symb = new Symbol();
                    				new_local_symb.setId((ID28!=null?ID28.getText():null));
                    				new_local_symb.setType(Type.TIME.toString());
                    				new_local_symb.setLine((ID28!=null?ID28.getLine():0));
                    				new_local_symb.setPosition((ID28!=null?ID28.getCharPositionInLine():0));
                    				//Add symbol to local scope
                    				((channel_def_scope)channel_def_stack.peek()).channel_table.add(new_local_symb);
                    			}	
                    		}
                    		
                    		if(mode==InspectionMode.REF_BY_USE) {
                    			
                    			//check if ID is declared locally
                    			if(!((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID28!=null?ID28.getText():null))){
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined((ID28!=null?ID28.getText():null)), (ID28!=null?ID28.getLine():0), (ID28!=null?ID28.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			else { //if it is declared
                    				
                    				//check if the channel allows for time
                    				if( ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getOptType() != Type.TIME) {
                    					local_errors.add(Error.report(ErrorType.ERROR, Error.notATimeChannel(((channel_def_scope)channel_def_stack.peek()).channel_name), (ID28!=null?ID28.getLine():0), (ID28!=null?ID28.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    				} 
                    				else {
                    					//check if ID is time in the channel scope
                    					if(! ((channel_def_scope)channel_def_stack.peek()).channel_table.get((ID28!=null?ID28.getText():null)).getType().equals(Type.TIME.toString()) ){
                    						local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBeTime((ID28!=null?ID28.getText():null)), (ID28!=null?ID28.getLine():0), (ID28!=null?ID28.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    					}
                    				}
                    			} 
                    		}
                    		
                    		retval.time_value = (ID28!=null?ID28.getText():null);
                    		retval.o_errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:379:4: ^( TIME INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TIME29=(CommonTree)match(input,TIME,FOLLOW_TIME_in_time603); 
                    TIME29_tree = (CommonTree)adaptor.dupNode(TIME29);

                    root_1 = (CommonTree)adaptor.becomeRoot(TIME29_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    INT30=(CommonTree)match(input,INT,FOLLOW_INT_in_time605); 
                    INT30_tree = (CommonTree)adaptor.dupNode(INT30);

                    adaptor.addChild(root_1, INT30_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		// In this case we don't add to channel scope as it is a constant 
                    		// and is accessible via optDimension attribute of the channel
                    		
                    		
                    		if(mode==InspectionMode.REF_BY_USE){
                    			
                    			//check if the channel allows for time
                    			if( ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getOptType() != Type.TIME) {
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.notATimeChannel(((channel_def_scope)channel_def_stack.peek()).channel_name), (INT30!=null?INT30.getLine():0), (INT30!=null?INT30.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			} 
                    			else {
                    				//check if INT is declared as a dimension in the channel scope
                    				if(! ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getOptDimension().contains(Integer.parseInt((INT30!=null?INT30.getText():null)))) {
                    					local_errors.add(Error.report(ErrorType.ERROR, Error.notAValidTimeDimension((INT30!=null?INT30.getText():null)), (INT30!=null?INT30.getLine():0), (INT30!=null?INT30.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));	
                    				}
                    			}			
                    			
                    		}
                    		
                    		retval.o_errors = local_errors;
                    		retval.time_value = Integer.parseInt((INT30!=null?INT30.getText():null));
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "time"

    public static class structured_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<Object> dimensions;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structured"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:419:1: structured[InspectionMode mode ] returns [ ArrayList<Error> o_errors, ArrayList<Object> dimensions] : ^( STRUCTURED ( structure_dimension[mode, dim_type] )+ ) ;
    public final ReoLangSemantics.structured_return structured(InspectionMode mode) throws RecognitionException {
        ReoLangSemantics.structured_return retval = new ReoLangSemantics.structured_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STRUCTURED31=null;
        ReoLangSemantics.structure_dimension_return structure_dimension32 = null;


        CommonTree STRUCTURED31_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>(); 
        		ArrayList<Object>dims = new ArrayList<Object>();
        		String dim_type = "";
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:426:2: ( ^( STRUCTURED ( structure_dimension[mode, dim_type] )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:426:4: ^( STRUCTURED ( structure_dimension[mode, dim_type] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            STRUCTURED31=(CommonTree)match(input,STRUCTURED,FOLLOW_STRUCTURED_in_structured663); 
            STRUCTURED31_tree = (CommonTree)adaptor.dupNode(STRUCTURED31);

            root_1 = (CommonTree)adaptor.becomeRoot(STRUCTURED31_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:426:17: ( structure_dimension[mode, dim_type] )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DIMENSION) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:426:18: structure_dimension[mode, dim_type]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_structure_dimension_in_structured666);
            	    structure_dimension32=structure_dimension(mode, dim_type);

            	    state._fsp--;

            	    adaptor.addChild(root_1, structure_dimension32.getTree());

            	    		dims.add((structure_dimension32!=null?structure_dimension32.dimension:null));
            	    		local_errors.addAll((structure_dimension32!=null?structure_dimension32.o_errors:null));
            	    		dim_type = (structure_dimension32!=null?structure_dimension32.o_dim_type:null);
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.o_errors = local_errors;
            		retval.dimensions = dims; 
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structured"

    public static class structure_dimension_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public Object dimension;
        public String o_dim_type;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "structure_dimension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:452:1: structure_dimension[InspectionMode mode, String i_dim_type] returns [ArrayList<Error> o_errors, Object dimension, String o_dim_type] : ( ^( DIMENSION ID ) | ^( DIMENSION INT ) );
    public final ReoLangSemantics.structure_dimension_return structure_dimension(InspectionMode mode, String i_dim_type) throws RecognitionException {
        ReoLangSemantics.structure_dimension_return retval = new ReoLangSemantics.structure_dimension_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DIMENSION33=null;
        CommonTree ID34=null;
        CommonTree DIMENSION35=null;
        CommonTree INT36=null;

        CommonTree DIMENSION33_tree=null;
        CommonTree ID34_tree=null;
        CommonTree DIMENSION35_tree=null;
        CommonTree INT36_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:457:2: ( ^( DIMENSION ID ) | ^( DIMENSION INT ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==DIMENSION) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==DOWN) ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2==ID) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==INT) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;
                    }
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:457:4: ^( DIMENSION ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIMENSION33=(CommonTree)match(input,DIMENSION,FOLLOW_DIMENSION_in_structure_dimension730); 
                    DIMENSION33_tree = (CommonTree)adaptor.dupNode(DIMENSION33);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIMENSION33_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID34=(CommonTree)match(input,ID,FOLLOW_ID_in_structure_dimension732); 
                    ID34_tree = (CommonTree)adaptor.dupNode(ID34);

                    adaptor.addChild(root_1, ID34_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		if(mode==InspectionMode.DECLARATION) { 
                    			//check for single and capital letter
                    			if( ((ID34!=null?ID34.getText():null)).length() > 1 || !Character.isUpperCase(((ID34!=null?ID34.getText():null)).charAt(0)) ) {
                    				local_errors.add( Error.report(ErrorType.WARNING, Error.nameConventionForDimension((ID34!=null?ID34.getText():null)), (ID34!=null?ID34.getLine():0), (ID34!=null?ID34.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			//check if the type is mixed
                    			if(i_dim_type.equals("INT")){
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedMixedDimensions(), (ID34!=null?ID34.getLine():0), (ID34!=null?ID34.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			
                    			//check if the ID is defined globally 
                    			if( ((reolang_scope)reolang_stack.peek()).global_table.isDefined((ID34!=null?ID34.getText():null)) || ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID34!=null?ID34.getText():null))){
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID34!=null?ID34.getText():null)), (ID34!=null?ID34.getLine():0), (ID34!=null?ID34.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			else {
                    				Symbol new_local_symb = new Symbol();
                    				new_local_symb.setId((ID34!=null?ID34.getText():null));
                    				new_local_symb.setType(Type.STRUCTURE.toString());
                    				new_local_symb.setLine((ID34!=null?ID34.getLine():0));
                    				new_local_symb.setPosition((ID34!=null?ID34.getCharPositionInLine():0));
                    				//Add symbol to local scope
                    				((channel_def_scope)channel_def_stack.peek()).channel_table.add(new_local_symb);
                    			}
                    		}
                    		
                    		retval.dimension = (ID34!=null?ID34.getText():null);
                    		retval.o_errors = local_errors;
                    		retval.o_dim_type = "STRING";
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:490:4: ^( DIMENSION INT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIMENSION35=(CommonTree)match(input,DIMENSION,FOLLOW_DIMENSION_in_structure_dimension747); 
                    DIMENSION35_tree = (CommonTree)adaptor.dupNode(DIMENSION35);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIMENSION35_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    INT36=(CommonTree)match(input,INT,FOLLOW_INT_in_structure_dimension749); 
                    INT36_tree = (CommonTree)adaptor.dupNode(INT36);

                    adaptor.addChild(root_1, INT36_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		if(mode==InspectionMode.DECLARATION) {
                    			//check if the type is the same as the previous one (avoid mixed types)
                    			if(i_dim_type.equals("STRING")){
                    					local_errors.add(Error.report(ErrorType.ERROR, Error.unauthorizedMixedDimensions(), (INT36!=null?INT36.getLine():0), (INT36!=null?INT36.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    				}
                    		}
                    		
                    		// Don't need to add to channel scope as it is a constant and is accessible 
                    		// from the optDimension attribute of the channel symbol
                    		retval.dimension = Integer.parseInt((INT36!=null?INT36.getText():null));
                    		retval.o_errors = local_errors;
                    		retval.o_dim_type = "INT";
                    		
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "structure_dimension"

    public static class ports_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> ports_list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ports"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:520:1: ports[InspectionMode mode, PortOrientation i_orientation] returns [ArrayList<Error> o_errors, ArrayList<String> ports_list] : ^( PORT (id1= ID )+ ) ;
    public final ReoLangSemantics.ports_return ports(InspectionMode mode, PortOrientation i_orientation) throws RecognitionException {
        ReoLangSemantics.ports_return retval = new ReoLangSemantics.ports_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id1=null;
        CommonTree PORT37=null;

        CommonTree id1_tree=null;
        CommonTree PORT37_tree=null;


        		ArrayList<String> port_names = new ArrayList<String>();
        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:525:2: ( ^( PORT (id1= ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:525:4: ^( PORT (id1= ID )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PORT37=(CommonTree)match(input,PORT,FOLLOW_PORT_in_ports802); 
            PORT37_tree = (CommonTree)adaptor.dupNode(PORT37);

            root_1 = (CommonTree)adaptor.becomeRoot(PORT37_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:525:11: (id1= ID )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:525:12: id1= ID
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    id1=(CommonTree)match(input,ID,FOLLOW_ID_in_ports807); 
            	    id1_tree = (CommonTree)adaptor.dupNode(id1);

            	    adaptor.addChild(root_1, id1_tree);


            	    		if(mode == InspectionMode.DECLARATION){
            	    			//Test if the name is in scope (global or channel/pattern -- the one that is inherited)
            	    			// This allows to verify whether there are repeated ports...
            	    			if(((reolang_scope)reolang_stack.peek()).global_table.isDefined((id1!=null?id1.getText():null)) || ((reolang_scope)reolang_stack.peek()).actual_scope.isDefined((id1!=null?id1.getText():null))){
            	    				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            	    			}
            	    			else {
            	    				//Add name to the scope
            	    				Symbol new_port_symbol = new Symbol();
            	    				new_port_symbol.setId((id1!=null?id1.getText():null));
            	    				new_port_symbol.setType(Type.PORT.toString());
            	    				new_port_symbol.setOrientation(i_orientation);
            	    				new_port_symbol.setLine((id1!=null?id1.getLine():0));
            	    				new_port_symbol.setPosition((id1!=null?id1.getCharPositionInLine():0));
            	    				((reolang_scope)reolang_stack.peek()).actual_scope.add(new_port_symbol);
            	    			}
            	    		}
            	    		port_names.add((id1!=null?id1.getText():null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.o_errors = local_errors;
            		retval.ports_list = port_names;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ports"

    public static class condition_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> patterns;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:567:1: condition[InspectionMode mode] returns [ArrayList<Error> o_errors, ArrayList<String> patterns] : ^( COND_ELEMENTS ( ID )+ ) ;
    public final ReoLangSemantics.condition_return condition(InspectionMode mode) throws RecognitionException {
        ReoLangSemantics.condition_return retval = new ReoLangSemantics.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COND_ELEMENTS38=null;
        CommonTree ID39=null;

        CommonTree COND_ELEMENTS38_tree=null;
        CommonTree ID39_tree=null;


        		ArrayList<String> patterns_list = new ArrayList<String>();
        		ArrayList<Error> local_errors = new ArrayList<Error>(); 
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:573:2: ( ^( COND_ELEMENTS ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:573:4: ^( COND_ELEMENTS ( ID )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            COND_ELEMENTS38=(CommonTree)match(input,COND_ELEMENTS,FOLLOW_COND_ELEMENTS_in_condition872); 
            COND_ELEMENTS38_tree = (CommonTree)adaptor.dupNode(COND_ELEMENTS38);

            root_1 = (CommonTree)adaptor.becomeRoot(COND_ELEMENTS38_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:573:20: ( ID )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:573:21: ID
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    ID39=(CommonTree)match(input,ID,FOLLOW_ID_in_condition875); 
            	    ID39_tree = (CommonTree)adaptor.dupNode(ID39);

            	    adaptor.addChild(root_1, ID39_tree);


            	    		if(mode == InspectionMode.DECLARATION){
            	    			//check if the name exists in global scope
            	    			if(((reolang_scope)reolang_stack.peek()).global_table.isDefined((ID39!=null?ID39.getText():null))){
            	    				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID39!=null?ID39.getText():null)), (ID39!=null?ID39.getLine():0), (ID39!=null?ID39.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            	    			}
            	    			if(!((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID39!=null?ID39.getText():null))){
            	    				Symbol new_local_symbol = new Symbol();
            	    				new_local_symbol.setId((ID39!=null?ID39.getText():null));
            	    				new_local_symbol.setType(Type.CONDITION_ELEMENT.toString());
            	    				new_local_symbol.setLine((ID39!=null?ID39.getLine():0));
            	    				new_local_symbol.setPosition((ID39!=null?ID39.getCharPositionInLine():0));
            	    				((channel_def_scope)channel_def_stack.peek()).channel_table.add(new_local_symbol); 
            	    			}	
            	    		}
            	    		patterns_list.add((ID39!=null?ID39.getText():null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            			retval.o_errors = local_errors;
            			retval.patterns = patterns_list;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condition"

    public static class extension_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:614:1: extension returns [ArrayList<Error> o_errors] : ^( EXTENSION name= ID ) ;
    public final ReoLangSemantics.extension_return extension() throws RecognitionException {
        ReoLangSemantics.extension_return retval = new ReoLangSemantics.extension_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree name=null;
        CommonTree EXTENSION40=null;

        CommonTree name_tree=null;
        CommonTree EXTENSION40_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:619:2: ( ^( EXTENSION name= ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:619:4: ^( EXTENSION name= ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EXTENSION40=(CommonTree)match(input,EXTENSION,FOLLOW_EXTENSION_in_extension943); 
            EXTENSION40_tree = (CommonTree)adaptor.dupNode(EXTENSION40);

            root_1 = (CommonTree)adaptor.becomeRoot(EXTENSION40_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            name=(CommonTree)match(input,ID,FOLLOW_ID_in_extension947); 
            name_tree = (CommonTree)adaptor.dupNode(name);

            adaptor.addChild(root_1, name_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		//If symbol does not exist...
            		if(!((reolang_scope)reolang_stack.peek()).global_table.isDefined((name!=null?name.getText():null))){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined((name!=null?name.getText():null)), (name!=null?name.getLine():0), (name!=null?name.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else { //if it exists...
            			Symbol base_symbol = ((reolang_scope)reolang_stack.peek()).global_table.get((name!=null?name.getText():null));
            			Symbol extending_symbol = ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name);
            			
            			//check if there is a match between the two symbols
            			local_errors.addAll(extending_symbol.isMatchForExtension(base_symbol, ((reolang_scope)reolang_stack.peek()).file));
            			
            			//set the extends name in the channel symbol
            			((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).setExtendsName((name!=null?name.getText():null));
            			
            			//if the base symbol has state + obs defined, the extending symbol inherits state + obs
            			if(! base_symbol.getStateName().equals("")) {
            				((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).setStateName(base_symbol.getStateName());
            				((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).setObservers(base_symbol.getObservers());
            				
            				//The local table is added of the obs + state  
            				Symbol state_inh = new Symbol();
            				state_inh.setId(base_symbol.getStateName());
            				state_inh.setType(Type.STATE.toString());
            				((channel_def_scope)channel_def_stack.peek()).channel_table.add(state_inh);
            				
            				Iterator<String> it =  base_symbol.getObservers().iterator();
            				Symbol obs_inh;
            				while(it.hasNext()){
            					obs_inh = new Symbol();
            					obs_inh.setId(it.next());
            					obs_inh.setType(Type.OBSERVER.toString());
            					((channel_def_scope)channel_def_stack.peek()).channel_table.add(obs_inh);
            				}
            			}
            		}
            	
            		retval.o_errors = local_errors;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "extension"

    public static class channel_body_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "channel_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:676:1: channel_body returns [ArrayList<Error> o_errors] : ^( CHANNEL_BODY (st= state_def )? ^( FLOWS (f= flow_def )+ ) ) ;
    public final ReoLangSemantics.channel_body_return channel_body() throws RecognitionException {
        ReoLangSemantics.channel_body_return retval = new ReoLangSemantics.channel_body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CHANNEL_BODY41=null;
        CommonTree FLOWS42=null;
        ReoLangSemantics.state_def_return st = null;

        ReoLangSemantics.flow_def_return f = null;


        CommonTree CHANNEL_BODY41_tree=null;
        CommonTree FLOWS42_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> local_labels = new ArrayList<String>();
        		boolean was_if_defined = false;
        		boolean was_time_flow_defined = false;
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:684:2: ( ^( CHANNEL_BODY (st= state_def )? ^( FLOWS (f= flow_def )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:684:4: ^( CHANNEL_BODY (st= state_def )? ^( FLOWS (f= flow_def )+ ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CHANNEL_BODY41=(CommonTree)match(input,CHANNEL_BODY,FOLLOW_CHANNEL_BODY_in_channel_body1006); 
            CHANNEL_BODY41_tree = (CommonTree)adaptor.dupNode(CHANNEL_BODY41);

            root_1 = (CommonTree)adaptor.becomeRoot(CHANNEL_BODY41_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:684:21: (st= state_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CHANNEL_STATE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:684:21: st= state_def
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_state_def_in_channel_body1010);
                    st=state_def();

                    state._fsp--;

                    adaptor.addChild(root_1, st.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FLOWS42=(CommonTree)match(input,FLOWS,FOLLOW_FLOWS_in_channel_body1015); 
            FLOWS42_tree = (CommonTree)adaptor.dupNode(FLOWS42);

            root_2 = (CommonTree)adaptor.becomeRoot(FLOWS42_tree, root_2);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:684:42: (f= flow_def )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==FLOW) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:684:43: f= flow_def
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_flow_def_in_channel_body1020);
            	    f=flow_def();

            	    state._fsp--;

            	    adaptor.addChild(root_2, f.getTree());

            	    		local_labels.addAll((f!=null?f.o_labels:null));
            	    		local_errors.addAll((f!=null?f.o_errors:null));
            	    		was_if_defined = was_if_defined || (f!=null?f.defined_if:false);
            	    		was_time_flow_defined = was_time_flow_defined || (f!=null?f.defined_time:false);
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }



            		//check if the channel requires state and it is not defined
            		if((st!=null?st.o_errors:null) == null && ((reolang_scope)reolang_stack.peek()).global_table.requiresStateDefinition(((channel_def_scope)channel_def_stack.peek()).channel_name)) {
            			local_errors.add(Error.report(ErrorType.ERROR, Error.stateDefinitionIsRequired(((channel_def_scope)channel_def_stack.peek()).channel_name),((channel_def_scope)channel_def_stack.peek()).channel_line, ((channel_def_scope)channel_def_stack.peek()).channel_pos, ((reolang_scope)reolang_stack.peek()).file));
            		}
            		
            		 
            		//check if the channel does not define a if flow but it is necessary
            		if(! ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getCondName().equals("") && ! was_if_defined) {
            			local_errors.add(Error.report(ErrorType.WARNING, Error.ifFlowIsRequired(((channel_def_scope)channel_def_stack.peek()).channel_name), ((channel_def_scope)channel_def_stack.peek()).channel_line, ((channel_def_scope)channel_def_stack.peek()).channel_pos, ((reolang_scope)reolang_stack.peek()).file));
            		}
            		
            		//check if the channel allows for time, but never defined a timed flow
            		if(((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getOptType() == Type.TIME && ! was_time_flow_defined) {
            			local_errors.add(Error.report(ErrorType.WARNING, Error.timeFlowIsRequired(((channel_def_scope)channel_def_stack.peek()).channel_name), ((channel_def_scope)channel_def_stack.peek()).channel_line, ((channel_def_scope)channel_def_stack.peek()).channel_pos, ((reolang_scope)reolang_stack.peek()).file));
            		}
            		
            		local_errors.addAll(((st!=null?st.o_errors:null) == null ? new ArrayList<Error>(0) : (st!=null?st.o_errors:null)));
            		retval.o_errors = local_errors;
            		
            		
            		
            		//Add labels from the base channel (if the current one extends any)
            		String base_name = ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getExtendsName();
            		ArrayList<String> base_labels = new ArrayList<String>();
            		if(! base_name.equals("")){
            			base_labels = ((reolang_scope)reolang_stack.peek()).global_table.get(base_name).getFlowLabels();
            			(((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name)).getFlowLabels().addAll(base_labels);
            		}
            		//Add labels to channel..
            		local_labels.addAll(base_labels);
            		((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).setFlowLabels(local_labels);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "channel_body"

    public static class state_def_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "state_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:744:1: state_def returns [ArrayList<Error> o_errors] : ^( CHANNEL_STATE ^( STATE_REF i1= ID ) ^( STATE_OBS (i2= ID )+ ) ) ;
    public final ReoLangSemantics.state_def_return state_def() throws RecognitionException {
        ReoLangSemantics.state_def_return retval = new ReoLangSemantics.state_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree CHANNEL_STATE43=null;
        CommonTree STATE_REF44=null;
        CommonTree STATE_OBS45=null;

        CommonTree i1_tree=null;
        CommonTree i2_tree=null;
        CommonTree CHANNEL_STATE43_tree=null;
        CommonTree STATE_REF44_tree=null;
        CommonTree STATE_OBS45_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> observers_list = new ArrayList();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:749:2: ( ^( CHANNEL_STATE ^( STATE_REF i1= ID ) ^( STATE_OBS (i2= ID )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:749:4: ^( CHANNEL_STATE ^( STATE_REF i1= ID ) ^( STATE_OBS (i2= ID )+ ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CHANNEL_STATE43=(CommonTree)match(input,CHANNEL_STATE,FOLLOW_CHANNEL_STATE_in_state_def1087); 
            CHANNEL_STATE43_tree = (CommonTree)adaptor.dupNode(CHANNEL_STATE43);

            root_1 = (CommonTree)adaptor.becomeRoot(CHANNEL_STATE43_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            STATE_REF44=(CommonTree)match(input,STATE_REF,FOLLOW_STATE_REF_in_state_def1090); 
            STATE_REF44_tree = (CommonTree)adaptor.dupNode(STATE_REF44);

            root_2 = (CommonTree)adaptor.becomeRoot(STATE_REF44_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_state_def1094); 
            i1_tree = (CommonTree)adaptor.dupNode(i1);

            adaptor.addChild(root_2, i1_tree);


            		//check existence of the symbol
            		if(((reolang_scope)reolang_stack.peek()).global_table.isDefined((i1!=null?i1.getText():null)) || ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((i1!=null?i1.getText():null))){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((i1!=null?i1.getText():null)), (i1!=null?i1.getLine():0), (i1!=null?i1.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else {
            		
            			//check if the channel does not require state but state was defined... Warning!
            			if(!((reolang_scope)reolang_stack.peek()).global_table.requiresStateDefinition(((channel_def_scope)channel_def_stack.peek()).channel_name)) {
            				local_errors.add(Error.report(ErrorType.WARNING, Error.stateDefinitionIsNotRequired(((channel_def_scope)channel_def_stack.peek()).channel_name),((channel_def_scope)channel_def_stack.peek()).channel_line, ((channel_def_scope)channel_def_stack.peek()).channel_pos, ((reolang_scope)reolang_stack.peek()).file));
            			}
            			
            			//Add state name to channel...
            			(((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name)).setStateName((i1!=null?i1.getText():null));
            			
            			//Add symbol to local_table
            			Symbol local_symbol = new Symbol();
            			local_symbol.setId((i1!=null?i1.getText():null));
            			local_symbol.setLine((i1!=null?i1.getLine():0));
            			local_symbol.setPosition((i1!=null?i1.getCharPositionInLine():0));
            			local_symbol.setType(Type.STATE.toString());
            			((channel_def_scope)channel_def_stack.peek()).channel_table.add(local_symbol);
            			 
            		}
            	

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            STATE_OBS45=(CommonTree)match(input,STATE_OBS,FOLLOW_STATE_OBS_in_state_def1107); 
            STATE_OBS45_tree = (CommonTree)adaptor.dupNode(STATE_OBS45);

            root_2 = (CommonTree)adaptor.becomeRoot(STATE_OBS45_tree, root_2);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:777:17: (i2= ID )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:777:18: i2= ID
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_state_def1113); 
            	    i2_tree = (CommonTree)adaptor.dupNode(i2);

            	    adaptor.addChild(root_2, i2_tree);


            	    		if(((reolang_scope)reolang_stack.peek()).global_table.isDefined((i2!=null?i2.getText():null)) || ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((i2!=null?i2.getText():null))){
            	    			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((i2!=null?i2.getText():null)), (i2!=null?i2.getLine():0), (i2!=null?i2.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            	    		}
            	    		else {
            	    			//Add symbol to local_table
            	    			Symbol local_symbol = new Symbol();
            	    			local_symbol.setId((i2!=null?i2.getText():null));
            	    			local_symbol.setLine((i2!=null?i2.getLine():0));
            	    			local_symbol.setPosition((i1!=null?i1.getCharPositionInLine():0));
            	    			local_symbol.setType(Type.OBSERVER.toString());
            	    			((channel_def_scope)channel_def_stack.peek()).channel_table.add(local_symbol);
            	    			observers_list.add((i2!=null?i2.getText():null)); 
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            	
            		retval.o_errors = local_errors;
            		
            		//Add observers to channel...
            		(((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name)).setObservers(observers_list);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "state_def"

    public static class flow_def_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public boolean defined_if;
        public boolean defined_time;
        public ArrayList<String> o_labels;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:815:1: flow_def returns [ArrayList<Error> o_errors, boolean defined_if, boolean defined_time, ArrayList<String> o_labels] : ^( FLOW requests flow_type[$requests.o_requests] ) ;
    public final ReoLangSemantics.flow_def_return flow_def() throws RecognitionException {
        ReoLangSemantics.flow_def_return retval = new ReoLangSemantics.flow_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FLOW46=null;
        ReoLangSemantics.requests_return requests47 = null;

        ReoLangSemantics.flow_type_return flow_type48 = null;


        CommonTree FLOW46_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:819:2: ( ^( FLOW requests flow_type[$requests.o_requests] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:819:4: ^( FLOW requests flow_type[$requests.o_requests] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FLOW46=(CommonTree)match(input,FLOW,FOLLOW_FLOW_in_flow_def1174); 
            FLOW46_tree = (CommonTree)adaptor.dupNode(FLOW46);

            root_1 = (CommonTree)adaptor.becomeRoot(FLOW46_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_requests_in_flow_def1176);
            requests47=requests();

            state._fsp--;

            adaptor.addChild(root_1, requests47.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flow_type_in_flow_def1178);
            flow_type48=flow_type((requests47!=null?requests47.o_requests:null));

            state._fsp--;

            adaptor.addChild(root_1, flow_type48.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		ArrayList<String> requests_updated = new ArrayList<String>();
            		//Copy NON-Observers from the remaining requests...
            		for(String s : (flow_type48!=null?flow_type48.o_requests:null)){
            			if(!((channel_def_scope)channel_def_stack.peek()).channel_table.isState(s)){
            				requests_updated.add(s);
            			}
            		}
            		
            		//check if all the requests were used as ports
            		if(requests_updated.size() > 0){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.requestsNotActioned(), (requests47!=null?requests47.o_line:0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		
            		local_errors.addAll((requests47!=null?requests47.o_errors:null));
            		local_errors.addAll((flow_type48!=null?flow_type48.o_errors:null));
            		
            		retval.o_errors = local_errors; 
            		retval.defined_if = (flow_type48!=null?flow_type48.defined_if:false);
            		retval.defined_time = (flow_type48!=null?flow_type48.defined_time:false);
            		retval.o_labels = (flow_type48!=null?flow_type48.o_labels:null);
            		
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_def"

    public static class requests_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_requests;
        public int o_line;
        public int o_pos;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "requests"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:858:1: requests returns [ArrayList<Error> o_errors, ArrayList<String> o_requests, int o_line, int o_pos] : ^( REQUESTS (a= request )+ ) ;
    public final ReoLangSemantics.requests_return requests() throws RecognitionException {
        ReoLangSemantics.requests_return retval = new ReoLangSemantics.requests_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REQUESTS49=null;
        ReoLangSemantics.request_return a = null;


        CommonTree REQUESTS49_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> requests_list = new ArrayList<String>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:864:2: ( ^( REQUESTS (a= request )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:864:4: ^( REQUESTS (a= request )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            REQUESTS49=(CommonTree)match(input,REQUESTS,FOLLOW_REQUESTS_in_requests1233); 
            REQUESTS49_tree = (CommonTree)adaptor.dupNode(REQUESTS49);

            root_1 = (CommonTree)adaptor.becomeRoot(REQUESTS49_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:864:15: (a= request )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==REQUEST) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:864:16: a= request
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_request_in_requests1238);
            	    a=request();

            	    state._fsp--;

            	    adaptor.addChild(root_1, a.getTree());

            	    		local_errors.addAll((a!=null?a.o_errors:null));
            	    		if(!(a!=null?a.o_request_name:null).equals("")){
            	    			requests_list.add((a!=null?a.o_request_name:null));
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.o_errors = local_errors;
            		retval.o_requests = requests_list;
            		retval.o_line = (a!=null?a.o_line:0);
            		retval.o_pos = (a!=null?a.o_pos:0);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "requests"

    public static class request_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public String o_request_name;
        public int o_line;
        public int o_pos;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "request"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:894:1: request returns [ArrayList<Error> o_errors, String o_request_name, int o_line, int o_pos] : ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) );
    public final ReoLangSemantics.request_return request() throws RecognitionException {
        ReoLangSemantics.request_return retval = new ReoLangSemantics.request_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REQUEST50=null;
        CommonTree ID51=null;
        CommonTree REQUEST52=null;
        CommonTree NOT_MARK53=null;
        CommonTree ID54=null;

        CommonTree REQUEST50_tree=null;
        CommonTree ID51_tree=null;
        CommonTree REQUEST52_tree=null;
        CommonTree NOT_MARK53_tree=null;
        CommonTree ID54_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		String final_name = "";
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:899:2: ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==REQUEST) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==ID) ) {
                        alt19=1;
                    }
                    else if ( (LA19_2==NOT_MARK) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:899:4: ^( REQUEST ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    REQUEST50=(CommonTree)match(input,REQUEST,FOLLOW_REQUEST_in_request1300); 
                    REQUEST50_tree = (CommonTree)adaptor.dupNode(REQUEST50);

                    root_1 = (CommonTree)adaptor.becomeRoot(REQUEST50_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID51=(CommonTree)match(input,ID,FOLLOW_ID_in_request1302); 
                    ID51_tree = (CommonTree)adaptor.dupNode(ID51);

                    adaptor.addChild(root_1, ID51_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		final_name = (ID51!=null?ID51.getText():null);
                    		
                    		//check if it exists -- IT MUST EXIST LOCALLY
                    		if(! ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID51!=null?ID51.getText():null))){
                    			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined((ID51!=null?ID51.getText():null)), (ID51!=null?ID51.getLine():0), (ID51!=null?ID51.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file)); 
                    		}
                    		else { //If exists...
                    			//check if it is a port or an observer
                    			if(! (((channel_def_scope)channel_def_stack.peek()).channel_table.get((ID51!=null?ID51.getText():null)).getType().equals(Type.PORT.toString()) || ((channel_def_scope)channel_def_stack.peek()).channel_table.get((ID51!=null?ID51.getText():null)).getType().equals(Type.OBSERVER.toString()))){
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBePortOrObserver((ID51!=null?ID51.getText():null)), (ID51!=null?ID51.getLine():0), (ID51!=null?ID51.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			
                    			//if it is an observer, set final_name as empty string...
                    			if(((channel_def_scope)channel_def_stack.peek()).channel_table.isObserver((ID51!=null?ID51.getText():null))){
                    				final_name = ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getStateName();
                    			} 
                    		}
                    		
                    		retval.o_errors = local_errors;
                    		retval.o_request_name = final_name;
                    		retval.o_line = (ID51!=null?ID51.getLine():0);
                    		retval.o_pos = (ID51!=null?ID51.getCharPositionInLine():0);
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:926:4: ^( REQUEST NOT_MARK ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    REQUEST52=(CommonTree)match(input,REQUEST,FOLLOW_REQUEST_in_request1317); 
                    REQUEST52_tree = (CommonTree)adaptor.dupNode(REQUEST52);

                    root_1 = (CommonTree)adaptor.becomeRoot(REQUEST52_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NOT_MARK53=(CommonTree)match(input,NOT_MARK,FOLLOW_NOT_MARK_in_request1319); 
                    NOT_MARK53_tree = (CommonTree)adaptor.dupNode(NOT_MARK53);

                    adaptor.addChild(root_1, NOT_MARK53_tree);

                    _last = (CommonTree)input.LT(1);
                    ID54=(CommonTree)match(input,ID,FOLLOW_ID_in_request1321); 
                    ID54_tree = (CommonTree)adaptor.dupNode(ID54);

                    adaptor.addChild(root_1, ID54_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		
                    		final_name = "";
                    		
                    		//check if it exists -- IT MUST EXIST LOCALLY
                    		if(! ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID54!=null?ID54.getText():null))){
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID54!=null?ID54.getText():null)), (ID54!=null?ID54.getLine():0), (ID54!=null?ID54.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file)); 
                    		}
                    		else { //If exists...
                    			//check if it is an observer // otherwise it is a context dependent port
                    			if(((channel_def_scope)channel_def_stack.peek()).channel_table.get((ID54!=null?ID54.getText():null)).getType().equals(Type.OBSERVER.toString())){
                    				final_name = ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getStateName();
                    			}
                    			
                    		}
                    		
                    		
                    		
                    		retval.o_errors = local_errors;
                    		retval.o_request_name = final_name;
                    		retval.o_line = (ID54!=null?ID54.getLine():0);
                    		retval.o_pos = (ID54!=null?ID54.getCharPositionInLine():0);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "request"

    public static class flow_type_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_requests;
        public boolean defined_if;
        public boolean defined_time;
        public ArrayList<String> o_labels;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_type"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:964:1: flow_type[ArrayList<String> i_requests] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests, boolean defined_if, boolean defined_time, ArrayList<String> o_labels] : ( ^( FLOW_TYPE nf1= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] ( flow_operation nf2= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] )? ( flow_label )? ) | ^( FLOW_TYPE if_flow[$flow_type.i_requests] ) );
    public final ReoLangSemantics.flow_type_return flow_type(ArrayList<String> i_requests) throws RecognitionException {
        ReoLangSemantics.flow_type_return retval = new ReoLangSemantics.flow_type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FLOW_TYPE55=null;
        CommonTree FLOW_TYPE58=null;
        ReoLangSemantics.normal_flow_return nf1 = null;

        ReoLangSemantics.normal_flow_return nf2 = null;

        ReoLangSemantics.flow_operation_return flow_operation56 = null;

        ReoLangSemantics.flow_label_return flow_label57 = null;

        ReoLangSemantics.if_flow_return if_flow59 = null;


        CommonTree FLOW_TYPE55_tree=null;
        CommonTree FLOW_TYPE58_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> local_labels = new ArrayList<String>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:970:2: ( ^( FLOW_TYPE nf1= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] ( flow_operation nf2= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] )? ( flow_label )? ) | ^( FLOW_TYPE if_flow[$flow_type.i_requests] ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FLOW_TYPE) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==IF_FLOW) ) {
                        alt22=2;
                    }
                    else if ( (LA22_2==NORMAL_FLOW) ) {
                        alt22=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:970:4: ^( FLOW_TYPE nf1= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] ( flow_operation nf2= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] )? ( flow_label )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FLOW_TYPE55=(CommonTree)match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type1377); 
                    FLOW_TYPE55_tree = (CommonTree)adaptor.dupNode(FLOW_TYPE55);

                    root_1 = (CommonTree)adaptor.becomeRoot(FLOW_TYPE55_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_normal_flow_in_flow_type1381);
                    nf1=normal_flow((ArrayList<String>)i_requests.clone());

                    state._fsp--;

                    adaptor.addChild(root_1, nf1.getTree());
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:970:82: ( flow_operation nf2= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()] )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==FLOW_OP) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:970:83: flow_operation nf2= normal_flow[(ArrayList<String>)$flow_type.i_requests.clone()]
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_flow_operation_in_flow_type1385);
                            flow_operation56=flow_operation();

                            state._fsp--;

                            adaptor.addChild(root_1, flow_operation56.getTree());
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_normal_flow_in_flow_type1389);
                            nf2=normal_flow((ArrayList<String>)i_requests.clone());

                            state._fsp--;

                            adaptor.addChild(root_1, nf2.getTree());

                            }
                            break;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:970:166: ( flow_label )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:970:166: flow_label
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_flow_label_in_flow_type1394);
                            flow_label57=flow_label();

                            state._fsp--;

                            adaptor.addChild(root_1, flow_label57.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    	
                    		
                    		ArrayList<String> less_remaining_requests = (nf1!=null?nf1.o_requests_remaining:null); 
                    		ArrayList<String> other_used;
                    		
                    		//remove from the smallest remaining the used ports of the other member
                    		if((nf2!=null?nf2.o_requests_remaining:null) != null){
                    			if((nf2!=null?nf2.o_requests_remaining:null).size() < (nf1!=null?nf1.o_requests_remaining:null).size()){
                    				less_remaining_requests = (nf2!=null?nf2.o_requests_remaining:null);
                    				other_used = (nf1!=null?nf1.o_requests_used:null);
                    			}
                    			else{
                    				other_used = (nf2!=null?nf2.o_requests_used:null);
                    			}
                    			
                    			Iterator<String> it = other_used.iterator();
                    			while(it.hasNext()){
                    				less_remaining_requests.remove(it.next());
                    			}
                    		}
                    		
                    		if((flow_label57!=null?flow_label57.o_errors:null) != null) {
                    			local_labels.add((flow_label57!=null?flow_label57.label:null));
                    			local_errors.addAll((flow_label57!=null?flow_label57.o_errors:null));
                    		}
                    		
                    		
                    		
                    		local_errors.addAll((nf1!=null?nf1.o_errors:null));
                    		local_errors.addAll(((nf2!=null?nf2.o_errors:null) == null ? new ArrayList<Error>(0): (nf2!=null?nf2.o_errors:null)));
                    		
                    		retval.o_errors =  local_errors ;
                    		retval.o_requests = less_remaining_requests;
                    		retval.defined_if = (nf1!=null?nf1.defined_if:false) || ((nf2!=null?nf2.o_requests_remaining:null) != null ? nf2.defined_if : false );
                    		retval.defined_time = (nf1!=null?nf1.defined_time:false) || ((nf2!=null?nf2.o_requests_remaining:null) != null ? nf2.defined_time : false );
                    		retval.o_labels = local_labels;
                    		
                    		
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1012:4: ^( FLOW_TYPE if_flow[$flow_type.i_requests] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FLOW_TYPE58=(CommonTree)match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type1409); 
                    FLOW_TYPE58_tree = (CommonTree)adaptor.dupNode(FLOW_TYPE58);

                    root_1 = (CommonTree)adaptor.becomeRoot(FLOW_TYPE58_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_if_flow_in_flow_type1411);
                    if_flow59=if_flow(i_requests);

                    state._fsp--;

                    adaptor.addChild(root_1, if_flow59.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		retval.o_errors = (if_flow59!=null?if_flow59.o_errors:null);
                    		retval.o_requests = (if_flow59!=null?if_flow59.o_requests:null);
                    		retval.defined_if = (if_flow59!=null?if_flow59.defined_if:false);
                    		retval.defined_time = (if_flow59!=null?if_flow59.defined_time:false);
                    		retval.o_labels = (if_flow59!=null?if_flow59.o_labels:null);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_type"

    public static class normal_flow_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_requests_remaining;
        public ArrayList<String> o_requests_used;
        public boolean defined_if;
        public boolean defined_time;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "normal_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1035:1: normal_flow[ArrayList<String> i_requests] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests_remaining, ArrayList<String> o_requests_used, boolean defined_if, boolean defined_time] : ^( NORMAL_FLOW fp1= flow_point[$normal_flow.i_requests, new ArrayList(2), PortOrientation.IN] ( timed[InspectionMode.REF_BY_USE] )? fp2= flow_point[$fp1.o_requests_remaining, $fp1.o_requests_used, PortOrientation.OUT] ) ;
    public final ReoLangSemantics.normal_flow_return normal_flow(ArrayList<String> i_requests) throws RecognitionException {
        ReoLangSemantics.normal_flow_return retval = new ReoLangSemantics.normal_flow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NORMAL_FLOW60=null;
        ReoLangSemantics.flow_point_return fp1 = null;

        ReoLangSemantics.flow_point_return fp2 = null;

        ReoLangSemantics.timed_return timed61 = null;


        CommonTree NORMAL_FLOW60_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1039:2: ( ^( NORMAL_FLOW fp1= flow_point[$normal_flow.i_requests, new ArrayList(2), PortOrientation.IN] ( timed[InspectionMode.REF_BY_USE] )? fp2= flow_point[$fp1.o_requests_remaining, $fp1.o_requests_used, PortOrientation.OUT] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1039:4: ^( NORMAL_FLOW fp1= flow_point[$normal_flow.i_requests, new ArrayList(2), PortOrientation.IN] ( timed[InspectionMode.REF_BY_USE] )? fp2= flow_point[$fp1.o_requests_remaining, $fp1.o_requests_used, PortOrientation.OUT] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            NORMAL_FLOW60=(CommonTree)match(input,NORMAL_FLOW,FOLLOW_NORMAL_FLOW_in_normal_flow1466); 
            NORMAL_FLOW60_tree = (CommonTree)adaptor.dupNode(NORMAL_FLOW60);

            root_1 = (CommonTree)adaptor.becomeRoot(NORMAL_FLOW60_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flow_point_in_normal_flow1470);
            fp1=flow_point(i_requests, new ArrayList(2), PortOrientation.IN);

            state._fsp--;

            adaptor.addChild(root_1, fp1.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1039:96: ( timed[InspectionMode.REF_BY_USE] )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TIMED) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1039:97: timed[InspectionMode.REF_BY_USE]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_timed_in_normal_flow1474);
                    timed61=timed(InspectionMode.REF_BY_USE);

                    state._fsp--;

                    adaptor.addChild(root_1, timed61.getTree());

                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flow_point_in_normal_flow1481);
            fp2=flow_point((fp1!=null?fp1.o_requests_remaining:null), (fp1!=null?fp1.o_requests_used:null), PortOrientation.OUT);

            state._fsp--;

            adaptor.addChild(root_1, fp2.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }



            		
            		local_errors.addAll((fp1!=null?fp1.o_errors:null));
            		local_errors.addAll(((timed61!=null?timed61.o_errors:null) == null ? new ArrayList<Error>(0) : (timed61!=null?timed61.o_errors:null)));
            		local_errors.addAll((fp2!=null?fp2.o_errors:null));
            		retval.o_errors =  local_errors;
            		
            		retval.o_requests_remaining = (fp2!=null?fp2.o_requests_remaining:null);
            		retval.o_requests_used = (fp2!=null?fp2.o_requests_used:null);
            		retval.defined_if = false;
            		retval.defined_time = (timed61!=null?timed61.time_value:null) != null;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "normal_flow"

    public static class flow_point_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_requests_remaining;
        public ArrayList<String> o_requests_used;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_point"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1066:1: flow_point[ArrayList<String> i_requests, ArrayList<String> i_requests_used, PortOrientation i_orientation] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests_remaining, ArrayList<String> o_requests_used] : ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) );
    public final ReoLangSemantics.flow_point_return flow_point(ArrayList<String> i_requests, ArrayList<String> i_requests_used, PortOrientation i_orientation) throws RecognitionException {
        ReoLangSemantics.flow_point_return retval = new ReoLangSemantics.flow_point_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FLOW_POINT62=null;
        CommonTree ID63=null;
        CommonTree FLOW_POINT64=null;
        CommonTree RW_NULL65=null;

        CommonTree FLOW_POINT62_tree=null;
        CommonTree ID63_tree=null;
        CommonTree FLOW_POINT64_tree=null;
        CommonTree RW_NULL65_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1070:2: ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FLOW_POINT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    int LA24_2 = input.LA(3);

                    if ( (LA24_2==ID) ) {
                        alt24=1;
                    }
                    else if ( (LA24_2==RW_NULL) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1070:4: ^( FLOW_POINT ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FLOW_POINT62=(CommonTree)match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point1533); 
                    FLOW_POINT62_tree = (CommonTree)adaptor.dupNode(FLOW_POINT62);

                    root_1 = (CommonTree)adaptor.becomeRoot(FLOW_POINT62_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID63=(CommonTree)match(input,ID,FOLLOW_ID_in_flow_point1535); 
                    ID63_tree = (CommonTree)adaptor.dupNode(ID63);

                    adaptor.addChild(root_1, ID63_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		if(!((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID63!=null?ID63.getText():null))){
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID63!=null?ID63.getText():null)), (ID63!=null?ID63.getLine():0), (ID63!=null?ID63.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file)); 
                    		}
                    		else{
                    			//check existence of ID in i_requests and is not a state reference
                    			if(/*! ((channel_def_scope)channel_def_stack.peek()).channel_table.isState((ID63!=null?ID63.getText():null)) && */!i_requests.contains((ID63!=null?ID63.getText():null))){
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.noRequestForPort((ID63!=null?ID63.getText():null)), (ID63!=null?ID63.getLine():0), (ID63!=null?ID63.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    			else { //If exists...
                    				//check if ID is a STATE or PORT
                    				switch(i_orientation){
                    					case IN : {
                    						//If it is not an in port nor a state
                    						if( ( !((channel_def_scope)channel_def_stack.peek()).channel_table.isInPort((ID63!=null?ID63.getText():null)) ) && ( !((channel_def_scope)channel_def_stack.peek()).channel_table.isState((ID63!=null?ID63.getText():null)) ) ){
                    							local_errors.add(Error.report(ErrorType.ERROR, Error.requiredAPortOrState((ID63!=null?ID63.getText():null), i_orientation), (ID63!=null?ID63.getLine():0), (ID63!=null?ID63.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));	
                    						}	
                    					} break;
                    					case OUT : {
                    						//If it is not an out port nor a state
                    						if( ( !((channel_def_scope)channel_def_stack.peek()).channel_table.isOutPort((ID63!=null?ID63.getText():null)) ) && ( !((channel_def_scope)channel_def_stack.peek()).channel_table.isState((ID63!=null?ID63.getText():null)) ) ){
                    							local_errors.add(Error.report(ErrorType.ERROR, Error.requiredAPortOrState((ID63!=null?ID63.getText():null), i_orientation), (ID63!=null?ID63.getLine():0), (ID63!=null?ID63.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));	
                    						}
                    					} break;
                    					default : break;
                    				}
                    				
                    				//Remove request from list...
                    				i_requests.remove((ID63!=null?ID63.getText():null)); 
                    				//Add requests actioned
                    				i_requests_used.add((ID63!=null?ID63.getText():null));
                    				
                    			}
                    		}		
                    		
                    		retval.o_errors = local_errors;
                    		retval.o_requests_remaining = i_requests;
                    		retval.o_requests_used = i_requests_used;
                    		
                    		
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1114:5: ^( FLOW_POINT RW_NULL )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FLOW_POINT64=(CommonTree)match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point1551); 
                    FLOW_POINT64_tree = (CommonTree)adaptor.dupNode(FLOW_POINT64);

                    root_1 = (CommonTree)adaptor.becomeRoot(FLOW_POINT64_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    RW_NULL65=(CommonTree)match(input,RW_NULL,FOLLOW_RW_NULL_in_flow_point1553); 
                    RW_NULL65_tree = (CommonTree)adaptor.dupNode(RW_NULL65);

                    adaptor.addChild(root_1, RW_NULL65_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    			retval.o_errors = new ArrayList<Error>(0);
                    			retval.o_requests_remaining = i_requests;
                    			retval.o_requests_used = i_requests_used;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_point"

    public static class flow_operation_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1133:1: flow_operation : ^( FLOW_OP OP_SYNC ) ;
    public final ReoLangSemantics.flow_operation_return flow_operation() throws RecognitionException {
        ReoLangSemantics.flow_operation_return retval = new ReoLangSemantics.flow_operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FLOW_OP66=null;
        CommonTree OP_SYNC67=null;

        CommonTree FLOW_OP66_tree=null;
        CommonTree OP_SYNC67_tree=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1134:2: ( ^( FLOW_OP OP_SYNC ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1134:4: ^( FLOW_OP OP_SYNC )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FLOW_OP66=(CommonTree)match(input,FLOW_OP,FOLLOW_FLOW_OP_in_flow_operation1592); 
            FLOW_OP66_tree = (CommonTree)adaptor.dupNode(FLOW_OP66);

            root_1 = (CommonTree)adaptor.becomeRoot(FLOW_OP66_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            OP_SYNC67=(CommonTree)match(input,OP_SYNC,FOLLOW_OP_SYNC_in_flow_operation1594); 
            OP_SYNC67_tree = (CommonTree)adaptor.dupNode(OP_SYNC67);

            adaptor.addChild(root_1, OP_SYNC67_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_operation"

    public static class if_flow_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_requests;
        public boolean defined_if;
        public boolean defined_time;
        public ArrayList<String> o_labels;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1146:1: if_flow[ArrayList<String> i_requests] returns [ArrayList<Error> o_errors, ArrayList<String> o_requests, boolean defined_if, boolean defined_time, ArrayList<String> o_labels] : ^( IF_FLOW ID ^( FLOW_TRUE ft1= flow_type[(ArrayList<String>)$if_flow.i_requests.clone()] (fl1= flow_label )? ) ^( FLOW_FALSE ft2= flow_type[(ArrayList<String>)$if_flow.i_requests.clone()] (fl2= flow_label )? ) ) ;
    public final ReoLangSemantics.if_flow_return if_flow(ArrayList<String> i_requests) throws RecognitionException {
        ReoLangSemantics.if_flow_return retval = new ReoLangSemantics.if_flow_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IF_FLOW68=null;
        CommonTree ID69=null;
        CommonTree FLOW_TRUE70=null;
        CommonTree FLOW_FALSE71=null;
        ReoLangSemantics.flow_type_return ft1 = null;

        ReoLangSemantics.flow_label_return fl1 = null;

        ReoLangSemantics.flow_type_return ft2 = null;

        ReoLangSemantics.flow_label_return fl2 = null;


        CommonTree IF_FLOW68_tree=null;
        CommonTree ID69_tree=null;
        CommonTree FLOW_TRUE70_tree=null;
        CommonTree FLOW_FALSE71_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> local_labels = new ArrayList<String>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1151:2: ( ^( IF_FLOW ID ^( FLOW_TRUE ft1= flow_type[(ArrayList<String>)$if_flow.i_requests.clone()] (fl1= flow_label )? ) ^( FLOW_FALSE ft2= flow_type[(ArrayList<String>)$if_flow.i_requests.clone()] (fl2= flow_label )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1151:4: ^( IF_FLOW ID ^( FLOW_TRUE ft1= flow_type[(ArrayList<String>)$if_flow.i_requests.clone()] (fl1= flow_label )? ) ^( FLOW_FALSE ft2= flow_type[(ArrayList<String>)$if_flow.i_requests.clone()] (fl2= flow_label )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IF_FLOW68=(CommonTree)match(input,IF_FLOW,FOLLOW_IF_FLOW_in_if_flow1637); 
            IF_FLOW68_tree = (CommonTree)adaptor.dupNode(IF_FLOW68);

            root_1 = (CommonTree)adaptor.becomeRoot(IF_FLOW68_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID69=(CommonTree)match(input,ID,FOLLOW_ID_in_if_flow1639); 
            ID69_tree = (CommonTree)adaptor.dupNode(ID69);

            adaptor.addChild(root_1, ID69_tree);

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FLOW_TRUE70=(CommonTree)match(input,FLOW_TRUE,FOLLOW_FLOW_TRUE_in_if_flow1642); 
            FLOW_TRUE70_tree = (CommonTree)adaptor.dupNode(FLOW_TRUE70);

            root_2 = (CommonTree)adaptor.becomeRoot(FLOW_TRUE70_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flow_type_in_if_flow1646);
            ft1=flow_type((ArrayList<String>)i_requests.clone());

            state._fsp--;

            adaptor.addChild(root_2, ft1.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1151:94: (fl1= flow_label )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1151:94: fl1= flow_label
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_flow_label_in_if_flow1651);
                    fl1=flow_label();

                    state._fsp--;

                    adaptor.addChild(root_2, fl1.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FLOW_FALSE71=(CommonTree)match(input,FLOW_FALSE,FOLLOW_FLOW_FALSE_in_if_flow1656); 
            FLOW_FALSE71_tree = (CommonTree)adaptor.dupNode(FLOW_FALSE71);

            root_2 = (CommonTree)adaptor.becomeRoot(FLOW_FALSE71_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_flow_type_in_if_flow1660);
            ft2=flow_type((ArrayList<String>)i_requests.clone());

            state._fsp--;

            adaptor.addChild(root_2, ft2.getTree());
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1151:186: (fl2= flow_label )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1151:186: fl2= flow_label
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_flow_label_in_if_flow1665);
                    fl2=flow_label();

                    state._fsp--;

                    adaptor.addChild(root_2, fl2.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		
            		//ID must exist locally
            		if(! ((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID69!=null?ID69.getText():null))){
            			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID69!=null?ID69.getText():null)), (ID69!=null?ID69.getLine():0), (ID69!=null?ID69.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else {
            			//ID must be a reference to a condition
            			if(!((channel_def_scope)channel_def_stack.peek()).channel_table.get((ID69!=null?ID69.getText():null)).getType().equals(Type.CONDITION.toString())){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.notAReferenceToConditionName((ID69!=null?ID69.getText():null)), (ID69!=null?ID69.getLine():0), (ID69!=null?ID69.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            		}
            		
            		local_errors.addAll((ft1!=null?ft1.o_errors:null));
            		local_errors.addAll((ft2!=null?ft2.o_errors:null));

            		
            		//set the list with less requests not fired
            		retval.o_requests = (ft1!=null?ft1.o_requests:null).size() > (ft2!=null?ft2.o_requests:null).size() ? (ft2!=null?ft2.o_requests:null): (ft1!=null?ft1.o_requests:null);
            		
            		retval.defined_if = true; 
            		retval.defined_time = (ft1!=null?ft1.defined_time:false) || (ft2!=null?ft2.defined_time:false); 
            		
            		if((fl1!=null?fl1.label:null) != null) {
            			local_labels.add((fl1!=null?fl1.label:null));
            			local_errors.addAll((fl1!=null?fl1.o_errors:null));
            		}
            		if((fl2!=null?fl2.label:null) != null) {
            			local_labels.add((fl2!=null?fl2.label:null));
            			local_errors.addAll((fl2!=null?fl2.o_errors:null));
            		}
            		
            		retval.o_errors =  local_errors;
            		retval.o_labels = local_labels;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_flow"

    public static class flow_label_return extends TreeRuleReturnScope {
        public String label;
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "flow_label"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1200:1: flow_label returns [String label, ArrayList<Error> o_errors] : ID ;
    public final ReoLangSemantics.flow_label_return flow_label() throws RecognitionException {
        ReoLangSemantics.flow_label_return retval = new ReoLangSemantics.flow_label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID72=null;

        CommonTree ID72_tree=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	Symbol local_symbol = new Symbol();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1205:2: ( ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1205:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            ID72=(CommonTree)match(input,ID,FOLLOW_ID_in_flow_label1705); 
            ID72_tree = (CommonTree)adaptor.dupNode(ID72);

            adaptor.addChild(root_0, ID72_tree);


            		//if it was already defined in local scope
            		if(((channel_def_scope)channel_def_stack.peek()).channel_table.isDefined((ID72!=null?ID72.getText():null))){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID72!=null?ID72.getText():null)), (ID72!=null?ID72.getLine():0), (ID72!=null?ID72.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else {
            			String base_name = ((reolang_scope)reolang_stack.peek()).global_table.get(((channel_def_scope)channel_def_stack.peek()).channel_name).getExtendsName();
            			if( ! base_name.equals("") && ((reolang_scope)reolang_stack.peek()).global_table.get(base_name).getFlowLabels().contains((ID72!=null?ID72.getText():null)) ){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID72!=null?ID72.getText():null)), (ID72!=null?ID72.getLine():0), (ID72!=null?ID72.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			else {
            				local_symbol = new Symbol();
            				local_symbol.setId((ID72!=null?ID72.getText():null));
            				local_symbol.setType(((channel_def_scope)channel_def_stack.peek()).channel_name);
            				local_symbol.setOptType(Type.LABEL);
            				local_symbol.setLine((ID72!=null?ID72.getLine():0));
            				local_symbol.setPosition((ID72!=null?ID72.getCharPositionInLine():0));
            				((channel_def_scope)channel_def_stack.peek()).channel_table.add(local_symbol);
            			}
            			
            		}
            		
            		retval.label = (ID72!=null?ID72.getText():null);
            		retval.o_errors = local_errors;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "flow_label"

    protected static class pattern_def_scope {
        SymbolsTable pattern_table;
        String pattern_name;
        int pattern_line;
        int pattern_pos;
    }
    protected Stack pattern_def_stack = new Stack();

    public static class pattern_def_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1258:1: pattern_def returns [ArrayList<Error> o_errors] : ^( PATTERN pattern_signature pattern_body ) ;
    public final ReoLangSemantics.pattern_def_return pattern_def() throws RecognitionException {
        pattern_def_stack.push(new pattern_def_scope());
        ReoLangSemantics.pattern_def_return retval = new ReoLangSemantics.pattern_def_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATTERN73=null;
        ReoLangSemantics.pattern_signature_return pattern_signature74 = null;

        ReoLangSemantics.pattern_body_return pattern_body75 = null;


        CommonTree PATTERN73_tree=null;


        		((pattern_def_scope)pattern_def_stack.peek()).pattern_table = new SymbolsTable();
        		((pattern_def_scope)pattern_def_stack.peek()).pattern_name = "";
        		((pattern_def_scope)pattern_def_stack.peek()).pattern_line = 0;
        		((pattern_def_scope)pattern_def_stack.peek()).pattern_pos = 0;
        		((reolang_scope)reolang_stack.peek()).actual_scope = ((pattern_def_scope)pattern_def_stack.peek()).pattern_table;
        		
        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1276:2: ( ^( PATTERN pattern_signature pattern_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1276:4: ^( PATTERN pattern_signature pattern_body )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATTERN73=(CommonTree)match(input,PATTERN,FOLLOW_PATTERN_in_pattern_def1772); 
            PATTERN73_tree = (CommonTree)adaptor.dupNode(PATTERN73);

            root_1 = (CommonTree)adaptor.becomeRoot(PATTERN73_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pattern_signature_in_pattern_def1774);
            pattern_signature74=pattern_signature();

            state._fsp--;

            adaptor.addChild(root_1, pattern_signature74.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pattern_body_in_pattern_def1776);
            pattern_body75=pattern_body();

            state._fsp--;

            adaptor.addChild(root_1, pattern_body75.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		local_errors.addAll((pattern_signature74!=null?pattern_signature74.o_errors:null));
            		local_errors.addAll((pattern_body75!=null?pattern_body75.o_errors:null));
            		retval.o_errors =  local_errors;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            pattern_def_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "pattern_def"

    public static class pattern_signature_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1298:1: pattern_signature returns [ArrayList<Error> o_errors] : ^( PATTERN_SIGNATURE name= ID ^( PATTERN_PORTS ( ^( IN_PORTS in= ports[InspectionMode.DECLARATION, PortOrientation.IN] ) )? ( ^( OUT_PORTS out= ports[InspectionMode.DECLARATION, PortOrientation.OUT] ) )? ) ) ;
    public final ReoLangSemantics.pattern_signature_return pattern_signature() throws RecognitionException {
        ReoLangSemantics.pattern_signature_return retval = new ReoLangSemantics.pattern_signature_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree name=null;
        CommonTree PATTERN_SIGNATURE76=null;
        CommonTree PATTERN_PORTS77=null;
        CommonTree IN_PORTS78=null;
        CommonTree OUT_PORTS79=null;
        ReoLangSemantics.ports_return in = null;

        ReoLangSemantics.ports_return out = null;


        CommonTree name_tree=null;
        CommonTree PATTERN_SIGNATURE76_tree=null;
        CommonTree PATTERN_PORTS77_tree=null;
        CommonTree IN_PORTS78_tree=null;
        CommonTree OUT_PORTS79_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		Symbol patt_symbol = new Symbol();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1304:2: ( ^( PATTERN_SIGNATURE name= ID ^( PATTERN_PORTS ( ^( IN_PORTS in= ports[InspectionMode.DECLARATION, PortOrientation.IN] ) )? ( ^( OUT_PORTS out= ports[InspectionMode.DECLARATION, PortOrientation.OUT] ) )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1304:4: ^( PATTERN_SIGNATURE name= ID ^( PATTERN_PORTS ( ^( IN_PORTS in= ports[InspectionMode.DECLARATION, PortOrientation.IN] ) )? ( ^( OUT_PORTS out= ports[InspectionMode.DECLARATION, PortOrientation.OUT] ) )? ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATTERN_SIGNATURE76=(CommonTree)match(input,PATTERN_SIGNATURE,FOLLOW_PATTERN_SIGNATURE_in_pattern_signature1832); 
            PATTERN_SIGNATURE76_tree = (CommonTree)adaptor.dupNode(PATTERN_SIGNATURE76);

            root_1 = (CommonTree)adaptor.becomeRoot(PATTERN_SIGNATURE76_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            name=(CommonTree)match(input,ID,FOLLOW_ID_in_pattern_signature1836); 
            name_tree = (CommonTree)adaptor.dupNode(name);

            adaptor.addChild(root_1, name_tree);

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATTERN_PORTS77=(CommonTree)match(input,PATTERN_PORTS,FOLLOW_PATTERN_PORTS_in_pattern_signature1839); 
            PATTERN_PORTS77_tree = (CommonTree)adaptor.dupNode(PATTERN_PORTS77);

            root_2 = (CommonTree)adaptor.becomeRoot(PATTERN_PORTS77_tree, root_2);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1304:48: ( ^( IN_PORTS in= ports[InspectionMode.DECLARATION, PortOrientation.IN] ) )?
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IN_PORTS) ) {
                    alt27=1;
                }
                switch (alt27) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1304:49: ^( IN_PORTS in= ports[InspectionMode.DECLARATION, PortOrientation.IN] )
                        {
                        _last = (CommonTree)input.LT(1);
                        {
                        CommonTree _save_last_3 = _last;
                        CommonTree _first_3 = null;
                        CommonTree root_3 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                        IN_PORTS78=(CommonTree)match(input,IN_PORTS,FOLLOW_IN_PORTS_in_pattern_signature1843); 
                        IN_PORTS78_tree = (CommonTree)adaptor.dupNode(IN_PORTS78);

                        root_3 = (CommonTree)adaptor.becomeRoot(IN_PORTS78_tree, root_3);



                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_ports_in_pattern_signature1847);
                        in=ports(InspectionMode.DECLARATION, PortOrientation.IN);

                        state._fsp--;

                        adaptor.addChild(root_3, in.getTree());

                        match(input, Token.UP, null); adaptor.addChild(root_2, root_3);_last = _save_last_3;
                        }


                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1304:122: ( ^( OUT_PORTS out= ports[InspectionMode.DECLARATION, PortOrientation.OUT] ) )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OUT_PORTS) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1304:123: ^( OUT_PORTS out= ports[InspectionMode.DECLARATION, PortOrientation.OUT] )
                        {
                        _last = (CommonTree)input.LT(1);
                        {
                        CommonTree _save_last_3 = _last;
                        CommonTree _first_3 = null;
                        CommonTree root_3 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                        OUT_PORTS79=(CommonTree)match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_pattern_signature1857); 
                        OUT_PORTS79_tree = (CommonTree)adaptor.dupNode(OUT_PORTS79);

                        root_3 = (CommonTree)adaptor.becomeRoot(OUT_PORTS79_tree, root_3);



                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_ports_in_pattern_signature1861);
                        out=ports(InspectionMode.DECLARATION, PortOrientation.OUT);

                        state._fsp--;

                        adaptor.addChild(root_3, out.getTree());

                        match(input, Token.UP, null); adaptor.addChild(root_2, root_3);_last = _save_last_3;
                        }


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		//check if ID is globally declared
            		if(((reolang_scope)reolang_stack.peek()).global_table.isDefined((name!=null?name.getText():null))){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((name!=null?name.getText():null)), (name!=null?name.getLine():0), (name!=null?name.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}	
            		else { //if it is not declared yet...
            			
            			//add symbol to global table
            			patt_symbol.setId((name!=null?name.getText():null));
            			patt_symbol.setType(Type.PATTERN.toString());
            			patt_symbol.setLine((name!=null?name.getLine():0));
            			patt_symbol.setPosition((name!=null?name.getCharPositionInLine():0));
            			if((in!=null?in.ports_list:null) != null) {patt_symbol.setInArgs((in!=null?in.ports_list:null));}
            			if((out!=null?out.ports_list:null) != null) {patt_symbol.setOutArgs((out!=null?out.ports_list:null));}	
            			((reolang_scope)reolang_stack.peek()).global_table.add(patt_symbol);
            			
            			//add fields to scope definition
            			((pattern_def_scope)pattern_def_stack.peek()).pattern_name = (name!=null?name.getText():null);
            			((pattern_def_scope)pattern_def_stack.peek()).pattern_line = (name!=null?name.getLine():0);
            			((pattern_def_scope)pattern_def_stack.peek()).pattern_pos = (name!=null?name.getCharPositionInLine():0);
            		
            			
            			//check if number of ports > 0
            			if(patt_symbol.getNumberOfPorts() <= 0) {
            				local_errors.add( Error.report(ErrorType.ERROR, Error.unauthorizedNumberOfPortsInPatterns((name!=null?name.getText():null)), (name!=null?name.getLine():0), (name!=null?name.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            		}
            		
            		local_errors.addAll(((in!=null?in.o_errors:null) != null ? (in!=null?in.o_errors:null) : new ArrayList<Error>(0)));
            		local_errors.addAll(((out!=null?out.o_errors:null) != null ? (out!=null?out.o_errors:null) : new ArrayList<Error>(0)));
            			
            		retval.o_errors = local_errors ;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_signature"

    public static class pattern_body_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1356:1: pattern_body returns [ArrayList<Error> o_errors] : ^( PATTERN_BODY pattern_declarations pattern_compositions[$pattern_declarations.access_words] ) ;
    public final ReoLangSemantics.pattern_body_return pattern_body() throws RecognitionException {
        ReoLangSemantics.pattern_body_return retval = new ReoLangSemantics.pattern_body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATTERN_BODY80=null;
        ReoLangSemantics.pattern_declarations_return pattern_declarations81 = null;

        ReoLangSemantics.pattern_compositions_return pattern_compositions82 = null;


        CommonTree PATTERN_BODY80_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1361:2: ( ^( PATTERN_BODY pattern_declarations pattern_compositions[$pattern_declarations.access_words] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1361:4: ^( PATTERN_BODY pattern_declarations pattern_compositions[$pattern_declarations.access_words] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATTERN_BODY80=(CommonTree)match(input,PATTERN_BODY,FOLLOW_PATTERN_BODY_in_pattern_body1931); 
            PATTERN_BODY80_tree = (CommonTree)adaptor.dupNode(PATTERN_BODY80);

            root_1 = (CommonTree)adaptor.becomeRoot(PATTERN_BODY80_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pattern_declarations_in_pattern_body1933);
            pattern_declarations81=pattern_declarations();

            state._fsp--;

            adaptor.addChild(root_1, pattern_declarations81.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_pattern_compositions_in_pattern_body1935);
            pattern_compositions82=pattern_compositions((pattern_declarations81!=null?pattern_declarations81.access_words:null));

            state._fsp--;

            adaptor.addChild(root_1, pattern_compositions82.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		local_errors.addAll((pattern_declarations81!=null?pattern_declarations81.o_errors:null));
            		local_errors.addAll((pattern_compositions82!=null?pattern_compositions82.o_errors:null));
            		retval.o_errors = local_errors ;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_body"

    public static class pattern_declarations_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> access_words;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_declarations"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1384:1: pattern_declarations returns [ArrayList<Error> o_errors, ArrayList<String> access_words] : ^( PATTERN_DECLARATIONS ( declaration )+ ) ;
    public final ReoLangSemantics.pattern_declarations_return pattern_declarations() throws RecognitionException {
        ReoLangSemantics.pattern_declarations_return retval = new ReoLangSemantics.pattern_declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATTERN_DECLARATIONS83=null;
        ReoLangSemantics.declaration_return declaration84 = null;


        CommonTree PATTERN_DECLARATIONS83_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> accesses = new ArrayList();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1390:2: ( ^( PATTERN_DECLARATIONS ( declaration )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1390:4: ^( PATTERN_DECLARATIONS ( declaration )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATTERN_DECLARATIONS83=(CommonTree)match(input,PATTERN_DECLARATIONS,FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations1995); 
            PATTERN_DECLARATIONS83_tree = (CommonTree)adaptor.dupNode(PATTERN_DECLARATIONS83);

            root_1 = (CommonTree)adaptor.becomeRoot(PATTERN_DECLARATIONS83_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1390:27: ( declaration )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==DECLARATION) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1390:28: declaration
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_declaration_in_pattern_declarations1998);
            	    declaration84=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_1, declaration84.getTree());

            	    		local_errors.addAll((declaration84!=null?declaration84.o_errors:null));
            	    		accesses.addAll((declaration84!=null?declaration84.access_words:null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.o_errors = local_errors;
            		retval.access_words = accesses;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_declarations"

    public static class declaration_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> access_words;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1417:1: declaration returns [ArrayList<Error> o_errors, ArrayList<String> access_words] : ^( DECLARATION reference_signature instances[$reference_signature.instance_type.getInArgs(), $reference_signature.instance_type.getOutArgs(), $reference_signature.instance_type.getId()] ) ;
    public final ReoLangSemantics.declaration_return declaration() throws RecognitionException {
        ReoLangSemantics.declaration_return retval = new ReoLangSemantics.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DECLARATION85=null;
        ReoLangSemantics.reference_signature_return reference_signature86 = null;

        ReoLangSemantics.instances_return instances87 = null;


        CommonTree DECLARATION85_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> accesses = new ArrayList<String>();
        		ArrayList<String> ports = new ArrayList<String>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1424:2: ( ^( DECLARATION reference_signature instances[$reference_signature.instance_type.getInArgs(), $reference_signature.instance_type.getOutArgs(), $reference_signature.instance_type.getId()] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1424:4: ^( DECLARATION reference_signature instances[$reference_signature.instance_type.getInArgs(), $reference_signature.instance_type.getOutArgs(), $reference_signature.instance_type.getId()] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DECLARATION85=(CommonTree)match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration2063); 
            DECLARATION85_tree = (CommonTree)adaptor.dupNode(DECLARATION85);

            root_1 = (CommonTree)adaptor.becomeRoot(DECLARATION85_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_reference_signature_in_declaration2065);
            reference_signature86=reference_signature();

            state._fsp--;

            adaptor.addChild(root_1, reference_signature86.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_instances_in_declaration2067);
            instances87=instances((reference_signature86!=null?reference_signature86.instance_type:null).getInArgs(), (reference_signature86!=null?reference_signature86.instance_type:null).getOutArgs(), (reference_signature86!=null?reference_signature86.instance_type:null).getId());

            state._fsp--;

            adaptor.addChild(root_1, instances87.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		
            		//create list of access_words
            		ports.addAll((reference_signature86!=null?reference_signature86.instance_type:null).getInArgs());
            		ports.addAll((reference_signature86!=null?reference_signature86.instance_type:null).getOutArgs());
            		
            		
            		for (String p : ports) {
            			for(String inst : (instances87!=null?instances87.instances:null)){
            				accesses.add(inst + '.' + p);
            			}
            		}
            		
            		local_errors.addAll((reference_signature86!=null?reference_signature86.o_errors:null));
            		local_errors.addAll((instances87!=null?instances87.o_errors:null));
            		retval.o_errors = local_errors ;
            		retval.access_words = accesses;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class reference_signature_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public Symbol instance_type;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1458:1: reference_signature returns [ArrayList<Error> o_errors, Symbol instance_type] : ^( DECLARATION_TYPE ( ID )? channel_signature[InspectionMode.REF_BY_INSTANCE] ) ;
    public final ReoLangSemantics.reference_signature_return reference_signature() throws RecognitionException {
        ReoLangSemantics.reference_signature_return retval = new ReoLangSemantics.reference_signature_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DECLARATION_TYPE88=null;
        CommonTree ID89=null;
        ReoLangSemantics.channel_signature_return channel_signature90 = null;


        CommonTree DECLARATION_TYPE88_tree=null;
        CommonTree ID89_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>(0);
        		Symbol inst;
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1463:2: ( ^( DECLARATION_TYPE ( ID )? channel_signature[InspectionMode.REF_BY_INSTANCE] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1463:4: ^( DECLARATION_TYPE ( ID )? channel_signature[InspectionMode.REF_BY_INSTANCE] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DECLARATION_TYPE88=(CommonTree)match(input,DECLARATION_TYPE,FOLLOW_DECLARATION_TYPE_in_reference_signature2120); 
            DECLARATION_TYPE88_tree = (CommonTree)adaptor.dupNode(DECLARATION_TYPE88);

            root_1 = (CommonTree)adaptor.becomeRoot(DECLARATION_TYPE88_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1463:23: ( ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1463:23: ID
                    {
                    _last = (CommonTree)input.LT(1);
                    ID89=(CommonTree)match(input,ID,FOLLOW_ID_in_reference_signature2122); 
                    ID89_tree = (CommonTree)adaptor.dupNode(ID89);

                    adaptor.addChild(root_1, ID89_tree);


                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_channel_signature_in_reference_signature2125);
            channel_signature90=channel_signature(InspectionMode.REF_BY_INSTANCE);

            state._fsp--;

            adaptor.addChild(root_1, channel_signature90.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		//Here we have a complete symbol that comes from channel_signature nonterminal
            		//To check the errors, it is needed to inspect over the symbol structure...
            	
            		inst = (channel_signature90!=null?channel_signature90.o_channel_sig:null);
            	
            		//check if the instance is a reference to a declared symbol
            		if(!((reolang_scope)reolang_stack.peek()).global_table.isDefined(inst.getId())){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined(inst.getId()), inst.getLine(), inst.getPosition(), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else {
            			
            			Symbol reference = ((reolang_scope)reolang_stack.peek()).global_table.get(inst.getId()); 
            			
            			//check if ID exists but no state in the symbol definition
            			if((ID89!=null?ID89.getText():null) != null && !reference.hasState()){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.stateNOTDefined(inst.getId()), inst.getLine(), inst.getPosition(), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			
            			//check if ID exists, symbol has state, but ID is not an observer
            			if((ID89!=null?ID89.getText():null) != null && reference.hasState() && !reference.isReferenceToObserver((ID89!=null?ID89.getText():null)) ){
            				local_errors.add( Error.report(ErrorType.ERROR, Error.nameShouldBeObserver((ID89!=null?ID89.getText():null)), (ID89!=null?ID89.getLine():0), (ID89!=null?ID89.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			
            			
            			//check if each port used is already defined locally
            			Iterator<String> it_in 	= inst.getInArgs().iterator(); 
            			Iterator<String> it_out = inst.getOutArgs().iterator();
            			while(it_in.hasNext()){
            				String it_in_name = it_in.next();
            				if(((pattern_def_scope)pattern_def_stack.peek()).pattern_table.isDefined(it_in_name)){
            					local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined(it_in_name), inst.getLine(), inst.getPosition(), ((reolang_scope)reolang_stack.peek()).file));
            				}
            			}
            			
            			while(it_out.hasNext()){
            				String it_out_name = it_out.next();
            				if(((pattern_def_scope)pattern_def_stack.peek()).pattern_table.isDefined(it_out_name)){
            					local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined(it_out_name), inst.getLine(), inst.getPosition(), ((reolang_scope)reolang_stack.peek()).file));
            				}
            			}
            			//------------------------
            			
            			//check if ports are repeated ports
            			if(inst.areThereReplicatedPorts()){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.portsAreRepeted(inst.getId()), inst.getLine(), inst.getPosition(), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			
            			//check if the signature matches the globally declared symbol		
            			local_errors.addAll(inst.isMatchForInstantiation(reference, ((reolang_scope)reolang_stack.peek()).file));
            			
            		}
            		
            		retval.o_errors = local_errors;
            		retval.instance_type = inst;	
            		
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reference_signature"

    public static class instances_return extends TreeRuleReturnScope {
        public ArrayList<String> instances;
        public ArrayList<Error> o_errors;;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instances"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1528:1: instances[ArrayList<String> in_ports, ArrayList<String> out_ports, String i_type] returns [ArrayList<String> instances, ArrayList<Error> o_errors;] : ^( INSTANCES ( ID ( stochastic_values[$instances.in_ports, $instances.out_ports, $instances.i_type] )? )+ ) ;
    public final ReoLangSemantics.instances_return instances(ArrayList<String> in_ports, ArrayList<String> out_ports, String i_type) throws RecognitionException {
        ReoLangSemantics.instances_return retval = new ReoLangSemantics.instances_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSTANCES91=null;
        CommonTree ID92=null;
        ReoLangSemantics.stochastic_values_return stochastic_values93 = null;


        CommonTree INSTANCES91_tree=null;
        CommonTree ID92_tree=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>(0);
        	ArrayList<String> processed_instances = new ArrayList<String>(0); 

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1533:2: ( ^( INSTANCES ( ID ( stochastic_values[$instances.in_ports, $instances.out_ports, $instances.i_type] )? )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1533:4: ^( INSTANCES ( ID ( stochastic_values[$instances.in_ports, $instances.out_ports, $instances.i_type] )? )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INSTANCES91=(CommonTree)match(input,INSTANCES,FOLLOW_INSTANCES_in_instances2165); 
            INSTANCES91_tree = (CommonTree)adaptor.dupNode(INSTANCES91);

            root_1 = (CommonTree)adaptor.becomeRoot(INSTANCES91_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1533:16: ( ID ( stochastic_values[$instances.in_ports, $instances.out_ports, $instances.i_type] )? )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1533:17: ID ( stochastic_values[$instances.in_ports, $instances.out_ports, $instances.i_type] )?
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    ID92=(CommonTree)match(input,ID,FOLLOW_ID_in_instances2168); 
            	    ID92_tree = (CommonTree)adaptor.dupNode(ID92);

            	    adaptor.addChild(root_1, ID92_tree);

            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1533:20: ( stochastic_values[$instances.in_ports, $instances.out_ports, $instances.i_type] )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==STOCH) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1533:21: stochastic_values[$instances.in_ports, $instances.out_ports, $instances.i_type]
            	            {
            	            _last = (CommonTree)input.LT(1);
            	            pushFollow(FOLLOW_stochastic_values_in_instances2171);
            	            stochastic_values93=stochastic_values(in_ports, out_ports, i_type);

            	            state._fsp--;

            	            adaptor.addChild(root_1, stochastic_values93.getTree());

            	            			local_errors.addAll((stochastic_values93!=null?stochastic_values93.o_errors:null));
            	            		

            	            }
            	            break;

            	    }


            	    		//ID should not exist in a local context
            	    		if(((pattern_def_scope)pattern_def_stack.peek()).pattern_table.isDefined((ID92!=null?ID92.getText():null)) || ((reolang_scope)reolang_stack.peek()).global_table.isDefined((ID92!=null?ID92.getText():null))) {
            	    			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID92!=null?ID92.getText():null)), (ID92!=null?ID92.getLine():0), (ID92!=null?ID92.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            	    		}
            	    		else {
            	    			//add the instance name to local scope
            	    			Symbol local_symbol = new Symbol();
            	    			local_symbol.setId((ID92!=null?ID92.getText():null));
            	    			//local_symbol.setQuantity(Integer.parseInt($INT.text));
            	    			local_symbol.setLine((ID92!=null?ID92.getLine():0));
            	    			local_symbol.setPosition((ID92!=null?ID92.getCharPositionInLine():0));
            	    			local_symbol.setInArgs(in_ports);
            	    			local_symbol.setOutArgs(out_ports);
            	    			local_symbol.setType(i_type);
            	    			local_symbol.setOptType(Type.INSTANCE);
            	    			((pattern_def_scope)pattern_def_stack.peek()).pattern_table.add(local_symbol);
            	    			
            	    			processed_instances.add((ID92!=null?ID92.getText():null));
            	    		}
            	    		
            	    		
            	    	

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


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.instances = processed_instances;
            		retval.o_errors = local_errors;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instances"

    public static class stochastic_values_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stochastic_values"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1577:1: stochastic_values[ArrayList<String> in_ports, ArrayList<String> out_ports, String i_type] returns [ArrayList<Error> o_errors] : ^( STOCH ( ID FLOAT )+ ) ;
    public final ReoLangSemantics.stochastic_values_return stochastic_values(ArrayList<String> in_ports, ArrayList<String> out_ports, String i_type) throws RecognitionException {
        ReoLangSemantics.stochastic_values_return retval = new ReoLangSemantics.stochastic_values_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STOCH94=null;
        CommonTree ID95=null;
        CommonTree FLOAT96=null;

        CommonTree STOCH94_tree=null;
        CommonTree ID95_tree=null;
        CommonTree FLOAT96_tree=null;


        	ArrayList<String> ports = new ArrayList<String>(in_ports);	
        	ports.addAll(out_ports);
        	ArrayList<String> used_labels = new ArrayList<String>();
        	boolean is_type_in_scope = ((reolang_scope)reolang_stack.peek()).global_table.isDefined(i_type) ;
        	ArrayList<String> existing_labels = is_type_in_scope ? new ArrayList<String>(((reolang_scope)reolang_stack.peek()).global_table.get(i_type).getFlowLabels()) : null;
        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1586:2: ( ^( STOCH ( ID FLOAT )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1586:5: ^( STOCH ( ID FLOAT )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            STOCH94=(CommonTree)match(input,STOCH,FOLLOW_STOCH_in_stochastic_values2233); 
            STOCH94_tree = (CommonTree)adaptor.dupNode(STOCH94);

            root_1 = (CommonTree)adaptor.becomeRoot(STOCH94_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1587:2: ( ID FLOAT )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1587:3: ID FLOAT
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    ID95=(CommonTree)match(input,ID,FOLLOW_ID_in_stochastic_values2238); 
            	    ID95_tree = (CommonTree)adaptor.dupNode(ID95);

            	    adaptor.addChild(root_1, ID95_tree);

            	    _last = (CommonTree)input.LT(1);
            	    FLOAT96=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_stochastic_values2240); 
            	    FLOAT96_tree = (CommonTree)adaptor.dupNode(FLOAT96);

            	    adaptor.addChild(root_1, FLOAT96_tree);


            	    		//check wether the label was already used
            	    		if(used_labels.contains((ID95!=null?ID95.getText():null))){
            	    			local_errors.add( new Error(ErrorType.ERROR, Error.stochasticLabelAlreadyDefined((ID95!=null?ID95.getText():null)), (ID95!=null?ID95.getLine():0), (ID95!=null?ID95.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            	    		}
            	    		else {
            	    			if(is_type_in_scope){
            	    				//check if it is a label defined for the the channel or a port
            	    				if(! (existing_labels.contains((ID95!=null?ID95.getText():null)) || ports.contains((ID95!=null?ID95.getText():null)))) {
            	    					local_errors.add(new Error(ErrorType.ERROR, Error.noStochasticLabelDefined((ID95!=null?ID95.getText():null), i_type), (ID95!=null?ID95.getLine():0), (ID95!=null?ID95.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            	    				}
            	    				else {
            	    					used_labels.add((ID95!=null?ID95.getText():null));
            	    				}	
            	    			}
            	    			
            	    		}
            	    		
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


            		//check if all labels and all ports were defined a stoch value
            		if(is_type_in_scope) {
            			existing_labels.addAll(ports);
            			if(! used_labels.containsAll(existing_labels)){
            				existing_labels.removeAll(used_labels);
            				local_errors.add(new Error(ErrorType.WARNING, Error.incompleteStochasticValuesList(existing_labels), (ID95!=null?ID95.getLine():0), (ID95!=null?ID95.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			existing_labels.clear();
            		}
            		retval.o_errors = local_errors;
            	

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stochastic_values"

    public static class pattern_compositions_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern_compositions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1635:1: pattern_compositions[ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors] : ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.i_unused_accesses, pattern_ports] )+ ( join_operation[$pattern_compositions.i_unused_accesses] )* ) ;
    public final ReoLangSemantics.pattern_compositions_return pattern_compositions(ArrayList<String> i_unused_accesses) throws RecognitionException {
        ReoLangSemantics.pattern_compositions_return retval = new ReoLangSemantics.pattern_compositions_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PATTERN_COMPOSITIONS97=null;
        ReoLangSemantics.port_definition_return port_definition98 = null;

        ReoLangSemantics.join_operation_return join_operation99 = null;


        CommonTree PATTERN_COMPOSITIONS97_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		ArrayList<String> pattern_ports = new ArrayList<String>();
        		pattern_ports.addAll(((reolang_scope)reolang_stack.peek()).global_table.get(((pattern_def_scope)pattern_def_stack.peek()).pattern_name).getInArgs());
        		pattern_ports.addAll(((reolang_scope)reolang_stack.peek()).global_table.get(((pattern_def_scope)pattern_def_stack.peek()).pattern_name).getOutArgs());
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1642:2: ( ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.i_unused_accesses, pattern_ports] )+ ( join_operation[$pattern_compositions.i_unused_accesses] )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1642:5: ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.i_unused_accesses, pattern_ports] )+ ( join_operation[$pattern_compositions.i_unused_accesses] )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PATTERN_COMPOSITIONS97=(CommonTree)match(input,PATTERN_COMPOSITIONS,FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions2305); 
            PATTERN_COMPOSITIONS97_tree = (CommonTree)adaptor.dupNode(PATTERN_COMPOSITIONS97);

            root_1 = (CommonTree)adaptor.becomeRoot(PATTERN_COMPOSITIONS97_tree, root_1);



            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1642:28: ( port_definition[$pattern_compositions.i_unused_accesses, pattern_ports] )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==PORT_DEFINITION) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1642:29: port_definition[$pattern_compositions.i_unused_accesses, pattern_ports]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_port_definition_in_pattern_compositions2308);
            	    port_definition98=port_definition(i_unused_accesses, pattern_ports);

            	    state._fsp--;

            	    adaptor.addChild(root_1, port_definition98.getTree());

            	    		i_unused_accesses = (port_definition98!=null?port_definition98.o_unused_accesses:null);
            	    		pattern_ports = (port_definition98!=null?port_definition98.o_unused_ports:null);
            	    		local_errors.addAll((port_definition98!=null?port_definition98.o_errors:null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1650:5: ( join_operation[$pattern_compositions.i_unused_accesses] )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==JOIN_OP) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1650:6: join_operation[$pattern_compositions.i_unused_accesses]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_join_operation_in_pattern_compositions2323);
            	    join_operation99=join_operation(i_unused_accesses);

            	    state._fsp--;

            	    adaptor.addChild(root_1, join_operation99.getTree());

            	    		i_unused_accesses = (join_operation99!=null?join_operation99.o_unused_accesses:null);
            	    		local_errors.addAll((join_operation99!=null?join_operation99.o_errors:null));
            	    	

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		
            		//check if all ports of the pattern were used
            		if((port_definition98!=null?port_definition98.o_unused_ports:null).size() > 0){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.patternPortsWereNotDefined((port_definition98!=null?port_definition98.o_unused_ports:null), ((pattern_def_scope)pattern_def_stack.peek()).pattern_name), ((pattern_def_scope)pattern_def_stack.peek()).pattern_line, ((pattern_def_scope)pattern_def_stack.peek()).pattern_pos, ((reolang_scope)reolang_stack.peek()).file));
            		}
            		
            		//check if all the accesses were used
            		int unused_accesses = (join_operation99!=null?join_operation99.o_unused_accesses:null)!=null ? (join_operation99!=null?join_operation99.o_unused_accesses:null).size() : (port_definition98!=null?port_definition98.o_unused_accesses:null).size();
            		if(unused_accesses > 0){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.somePortsWereNotUsed((join_operation99!=null?join_operation99.o_unused_accesses:null)==null ? (port_definition98!=null?port_definition98.o_unused_accesses:null) : (join_operation99!=null?join_operation99.o_unused_accesses:null), ((pattern_def_scope)pattern_def_stack.peek()).pattern_name), ((pattern_def_scope)pattern_def_stack.peek()).pattern_line, ((pattern_def_scope)pattern_def_stack.peek()).pattern_pos, ((reolang_scope)reolang_stack.peek()).file));
            		}
            	
            		retval.o_errors = local_errors ;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern_compositions"

    public static class port_definition_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_unused_accesses;
        public ArrayList<String> o_unused_ports;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1689:1: port_definition[ArrayList<String> i_unused_accesses, ArrayList<String> i_unused_ports] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses, ArrayList<String> o_unused_ports] : ^( PORT_DEFINITION ID port_actual_definition[$port_definition.i_unused_accesses, $ID.text, $ID.line, $ID.pos] ) ;
    public final ReoLangSemantics.port_definition_return port_definition(ArrayList<String> i_unused_accesses, ArrayList<String> i_unused_ports) throws RecognitionException {
        ReoLangSemantics.port_definition_return retval = new ReoLangSemantics.port_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PORT_DEFINITION100=null;
        CommonTree ID101=null;
        ReoLangSemantics.port_actual_definition_return port_actual_definition102 = null;


        CommonTree PORT_DEFINITION100_tree=null;
        CommonTree ID101_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1694:2: ( ^( PORT_DEFINITION ID port_actual_definition[$port_definition.i_unused_accesses, $ID.text, $ID.line, $ID.pos] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1694:4: ^( PORT_DEFINITION ID port_actual_definition[$port_definition.i_unused_accesses, $ID.text, $ID.line, $ID.pos] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PORT_DEFINITION100=(CommonTree)match(input,PORT_DEFINITION,FOLLOW_PORT_DEFINITION_in_port_definition2394); 
            PORT_DEFINITION100_tree = (CommonTree)adaptor.dupNode(PORT_DEFINITION100);

            root_1 = (CommonTree)adaptor.becomeRoot(PORT_DEFINITION100_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID101=(CommonTree)match(input,ID,FOLLOW_ID_in_port_definition2396); 
            ID101_tree = (CommonTree)adaptor.dupNode(ID101);

            adaptor.addChild(root_1, ID101_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_port_actual_definition_in_port_definition2398);
            port_actual_definition102=port_actual_definition(i_unused_accesses, (ID101!=null?ID101.getText():null), (ID101!=null?ID101.getLine():0), (ID101!=null?ID101.getCharPositionInLine():0));

            state._fsp--;

            adaptor.addChild(root_1, port_actual_definition102.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		//check if ID exists
            		if(!((pattern_def_scope)pattern_def_stack.peek()).pattern_table.isDefined((ID101!=null?ID101.getText():null))){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined((ID101!=null?ID101.getText():null)), (ID101!=null?ID101.getLine():0), (ID101!=null?ID101.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else {
            			//try to check & remove the port from the list of unused ports
            			if(!i_unused_ports.remove((ID101!=null?ID101.getText():null))){
            				local_errors.add(Error.report(ErrorType.ERROR, Error.portAlreadyDefined((ID101!=null?ID101.getText():null)), (ID101!=null?ID101.getLine():0), (ID101!=null?ID101.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            		}
            		
            		
            		
            		
            		local_errors.addAll((port_actual_definition102!=null?port_actual_definition102.o_errors:null));
            		retval.o_errors = local_errors;
            		retval.o_unused_accesses = (port_actual_definition102!=null?port_actual_definition102.o_unused_accesses:null);
            		retval.o_unused_ports = i_unused_ports;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port_definition"

    public static class port_actual_definition_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_unused_accesses;
        public ArrayList<String> o_unused_ports;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_actual_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1725:1: port_actual_definition[ArrayList<String> i_unused_accesses, String i_port_name, int i_line, int i_pos] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses, ArrayList<String> o_unused_ports] : ( ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.i_unused_accesses] ) | ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.i_unused_accesses] ) );
    public final ReoLangSemantics.port_actual_definition_return port_actual_definition(ArrayList<String> i_unused_accesses, String i_port_name, int i_line, int i_pos) throws RecognitionException {
        ReoLangSemantics.port_actual_definition_return retval = new ReoLangSemantics.port_actual_definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PORT_ACTUAL_DEFINITION103=null;
        CommonTree PORT_ACTUAL_DEFINITION105=null;
        ReoLangSemantics.port_access_return port_access104 = null;

        ReoLangSemantics.join_part_return join_part106 = null;


        CommonTree PORT_ACTUAL_DEFINITION103_tree=null;
        CommonTree PORT_ACTUAL_DEFINITION105_tree=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1729:2: ( ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.i_unused_accesses] ) | ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.i_unused_accesses] ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==PORT_ACTUAL_DEFINITION) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==DOWN) ) {
                    int LA36_2 = input.LA(3);

                    if ( (LA36_2==PORT_ACCESS) ) {
                        alt36=1;
                    }
                    else if ( (LA36_2==RW_JOIN) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1729:4: ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.i_unused_accesses] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PORT_ACTUAL_DEFINITION103=(CommonTree)match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition2435); 
                    PORT_ACTUAL_DEFINITION103_tree = (CommonTree)adaptor.dupNode(PORT_ACTUAL_DEFINITION103);

                    root_1 = (CommonTree)adaptor.becomeRoot(PORT_ACTUAL_DEFINITION103_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_port_access_in_port_actual_definition2437);
                    port_access104=port_access(i_unused_accesses);

                    state._fsp--;

                    adaptor.addChild(root_1, port_access104.getTree());

                    		if(! ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.isDefined(i_port_name) || ! ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get(i_port_name).getType().equals(Type.PORT.toString() ) ) {
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.notAPortOfPattern(i_port_name, ((pattern_def_scope)pattern_def_stack.peek()).pattern_name), i_line, i_line, ((reolang_scope)reolang_stack.peek()).file));
                    		}
                    		else {
                    			//check the orientation of the ID port and the port accessed
                    			if(((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get(i_port_name).getOrientation() != (port_access104!=null?port_access104.ori:null)) {
                    				local_errors.add(Error.report(ErrorType.ERROR, Error.badPortOrientationDefinition(i_port_name, ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get(i_port_name).getOrientation(), (port_access104!=null?port_access104.ori:null)), i_line, i_line, ((reolang_scope)reolang_stack.peek()).file));
                    			}
                    		}
                    		local_errors.addAll((port_access104!=null?port_access104.o_errors:null));
                    		retval.o_errors = local_errors;
                    		retval.o_unused_accesses = (port_access104!=null?port_access104.o_unused_accesses:null);
                    		
                    	

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1747:5: ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.i_unused_accesses] )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PORT_ACTUAL_DEFINITION105=(CommonTree)match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition2454); 
                    PORT_ACTUAL_DEFINITION105_tree = (CommonTree)adaptor.dupNode(PORT_ACTUAL_DEFINITION105);

                    root_1 = (CommonTree)adaptor.becomeRoot(PORT_ACTUAL_DEFINITION105_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_join_part_in_port_actual_definition2456);
                    join_part106=join_part(i_unused_accesses);

                    state._fsp--;

                    adaptor.addChild(root_1, join_part106.getTree());

                    		
                    		if(((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get(i_port_name).getOrientation() != (join_part106!=null?join_part106.ori:null)) {
                    			local_errors.add(Error.report(ErrorType.ERROR, Error.badPortOrientationDefinition(i_port_name, ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get(i_port_name).getOrientation(), (join_part106!=null?join_part106.ori:null)), i_line, i_pos, ((reolang_scope)reolang_stack.peek()).file));
                    		}
                    		
                    		local_errors.addAll((join_part106!=null?join_part106.o_errors:null));
                    		retval.o_errors = local_errors;
                    		retval.o_unused_accesses = (join_part106!=null?join_part106.o_unused_accesses:null);
                    	

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port_actual_definition"

    public static class port_access_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_unused_accesses;
        public PortOrientation ori;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_access"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1769:1: port_access[ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses, PortOrientation ori] : ^( PORT_ACCESS id1= ID id2= ID ) ;
    public final ReoLangSemantics.port_access_return port_access(ArrayList<String> i_unused_accesses) throws RecognitionException {
        ReoLangSemantics.port_access_return retval = new ReoLangSemantics.port_access_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree PORT_ACCESS107=null;

        CommonTree id1_tree=null;
        CommonTree id2_tree=null;
        CommonTree PORT_ACCESS107_tree=null;


        		ArrayList<Error> local_errors = new ArrayList<Error>();
        		PortOrientation access_ori = PortOrientation.NONE;
        	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1775:2: ( ^( PORT_ACCESS id1= ID id2= ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1775:4: ^( PORT_ACCESS id1= ID id2= ID )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PORT_ACCESS107=(CommonTree)match(input,PORT_ACCESS,FOLLOW_PORT_ACCESS_in_port_access2497); 
            PORT_ACCESS107_tree = (CommonTree)adaptor.dupNode(PORT_ACCESS107);

            root_1 = (CommonTree)adaptor.becomeRoot(PORT_ACCESS107_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access2501); 
            id1_tree = (CommonTree)adaptor.dupNode(id1);

            adaptor.addChild(root_1, id1_tree);

            _last = (CommonTree)input.LT(1);
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access2505); 
            id2_tree = (CommonTree)adaptor.dupNode(id2);

            adaptor.addChild(root_1, id2_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		
            		//check id1 exists
            		if(!((pattern_def_scope)pattern_def_stack.peek()).pattern_table.isDefined((id1!=null?id1.getText():null))){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else {
            			//check id1 is reference to instance name
            			if(((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get((id1!=null?id1.getText():null)).getOptType() != Type.INSTANCE ) {
            				local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBeInstance((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			
            			
            			//check INT is within the quantity of the instance
            			//if(Integer.parseInt($INT.text) > ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get((id1!=null?id1.getText():null)).getQuantity() || Integer.parseInt($INT.text) < 0){
            			//	local_errors.add(Error.report(ErrorType.ERROR, Error.indexOutOfBounds($INT.text), $INT.line, $INT.pos, ((reolang_scope)reolang_stack.peek()).file));
            			//}
            			
            			//check id2 is a port of the instance
            			if(! ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get((id1!=null?id1.getText():null)).isPort((id2!=null?id2.getText():null))) {
            				local_errors.add(Error.report(ErrorType.ERROR, Error.nameShouldBePort((id2!=null?id2.getText():null)), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            			}
            			else {
            				//get orientation of the port
            				 access_ori =  ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get((id1!=null?id1.getText():null)).isInPort((id2!=null?id2.getText():null)) ? PortOrientation.IN : PortOrientation.OUT ;
            			}
            			 
            		}
            		

            		
            		//try to remove access from accesses_list
            		String port_access = (id1!=null?id1.getText():null) + "." + (id2!=null?id2.getText():null);
            		if(!i_unused_accesses.remove(port_access)) {
            			local_errors.add(Error.report(ErrorType.ERROR, Error.portNotAvailable(port_access), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		
            		
            		retval.ori = access_ori;
            		retval.o_errors = local_errors;
            		retval.o_unused_accesses = i_unused_accesses;
            		
            		
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port_access"

    public static class join_operation_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_unused_accesses;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1834:1: join_operation[ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses] : ^( JOIN_OP ID join_part[$join_operation.i_unused_accesses] ) ;
    public final ReoLangSemantics.join_operation_return join_operation(ArrayList<String> i_unused_accesses) throws RecognitionException {
        ReoLangSemantics.join_operation_return retval = new ReoLangSemantics.join_operation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree JOIN_OP108=null;
        CommonTree ID109=null;
        ReoLangSemantics.join_part_return join_part110 = null;


        CommonTree JOIN_OP108_tree=null;
        CommonTree ID109_tree=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1838:2: ( ^( JOIN_OP ID join_part[$join_operation.i_unused_accesses] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1838:4: ^( JOIN_OP ID join_part[$join_operation.i_unused_accesses] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            JOIN_OP108=(CommonTree)match(input,JOIN_OP,FOLLOW_JOIN_OP_in_join_operation2547); 
            JOIN_OP108_tree = (CommonTree)adaptor.dupNode(JOIN_OP108);

            root_1 = (CommonTree)adaptor.becomeRoot(JOIN_OP108_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID109=(CommonTree)match(input,ID,FOLLOW_ID_in_join_operation2549); 
            ID109_tree = (CommonTree)adaptor.dupNode(ID109);

            adaptor.addChild(root_1, ID109_tree);

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_join_part_in_join_operation2551);
            join_part110=join_part(i_unused_accesses);

            state._fsp--;

            adaptor.addChild(root_1, join_part110.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		//verify if ID is in the symbols table
            		//if it is -- error
            		//if it is not, add to symbols table (as a node)  
            		if(((pattern_def_scope)pattern_def_stack.peek()).pattern_table.isDefined((ID109!=null?ID109.getText():null))){
            			local_errors.add(Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID109!=null?ID109.getText():null)), (ID109!=null?ID109.getLine():0), (ID109!=null?ID109.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
            		}
            		else{
            			Symbol local_symbol = new Symbol();
            			local_symbol.setId((ID109!=null?ID109.getText():null));
            			local_symbol.setLine((ID109!=null?ID109.getLine():0));
            			local_symbol.setPosition((ID109!=null?ID109.getCharPositionInLine():0));
            			local_symbol.setType(Type.NODE.toString());
            			((pattern_def_scope)pattern_def_stack.peek()).pattern_table.add(local_symbol);
            		}
            		
            		local_errors.addAll((join_part110!=null?join_part110.o_errors:null));
            		retval.o_errors = local_errors;
            		retval.o_unused_accesses = (join_part110!=null?join_part110.o_unused_accesses:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_operation"

    public static class join_part_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_unused_accesses;
        public PortOrientation ori;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "join_part"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1869:1: join_part[ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses, PortOrientation ori] : ^( RW_JOIN port_access_list[$join_part.i_unused_accesses] ) ;
    public final ReoLangSemantics.join_part_return join_part(ArrayList<String> i_unused_accesses) throws RecognitionException {
        ReoLangSemantics.join_part_return retval = new ReoLangSemantics.join_part_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RW_JOIN111=null;
        ReoLangSemantics.port_access_list_return port_access_list112 = null;


        CommonTree RW_JOIN111_tree=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1870:2: ( ^( RW_JOIN port_access_list[$join_part.i_unused_accesses] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1870:4: ^( RW_JOIN port_access_list[$join_part.i_unused_accesses] )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            RW_JOIN111=(CommonTree)match(input,RW_JOIN,FOLLOW_RW_JOIN_in_join_part2584); 
            RW_JOIN111_tree = (CommonTree)adaptor.dupNode(RW_JOIN111);

            root_1 = (CommonTree)adaptor.becomeRoot(RW_JOIN111_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_port_access_list_in_join_part2586);
            port_access_list112=port_access_list(i_unused_accesses);

            state._fsp--;

            adaptor.addChild(root_1, port_access_list112.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            		retval.o_errors = (port_access_list112!=null?port_access_list112.o_errors:null);
            		retval.o_unused_accesses = (port_access_list112!=null?port_access_list112.o_unused_accesses:null);
            		retval.ori = (port_access_list112!=null?port_access_list112.ori:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "join_part"

    public static class port_access_list_return extends TreeRuleReturnScope {
        public ArrayList<Error> o_errors;
        public ArrayList<String> o_unused_accesses;
        public PortOrientation ori;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1885:1: port_access_list[ArrayList<String> i_unused_accesses] returns [ArrayList<Error> o_errors, ArrayList<String> o_unused_accesses, PortOrientation ori] : ( ^( PORT_ACCESS_LIST ( port_access[$port_access_list.i_unused_accesses] )+ ) | ^( PORT_ACCESS_LIST RW_REMAINING ) );
    public final ReoLangSemantics.port_access_list_return port_access_list(ArrayList<String> i_unused_accesses) throws RecognitionException {
        ReoLangSemantics.port_access_list_return retval = new ReoLangSemantics.port_access_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PORT_ACCESS_LIST113=null;
        CommonTree PORT_ACCESS_LIST115=null;
        CommonTree RW_REMAINING116=null;
        ReoLangSemantics.port_access_return port_access114 = null;


        CommonTree PORT_ACCESS_LIST113_tree=null;
        CommonTree PORT_ACCESS_LIST115_tree=null;
        CommonTree RW_REMAINING116_tree=null;


         		ArrayList<Error> local_errors = new ArrayList<Error>();
         		PortOrientation access_ori= PortOrientation.NONE;
         	
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1891:3: ( ^( PORT_ACCESS_LIST ( port_access[$port_access_list.i_unused_accesses] )+ ) | ^( PORT_ACCESS_LIST RW_REMAINING ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==PORT_ACCESS_LIST) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==DOWN) ) {
                    int LA38_2 = input.LA(3);

                    if ( (LA38_2==RW_REMAINING) ) {
                        alt38=2;
                    }
                    else if ( (LA38_2==PORT_ACCESS) ) {
                        alt38=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1891:5: ^( PORT_ACCESS_LIST ( port_access[$port_access_list.i_unused_accesses] )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PORT_ACCESS_LIST113=(CommonTree)match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_port_access_list2630); 
                    PORT_ACCESS_LIST113_tree = (CommonTree)adaptor.dupNode(PORT_ACCESS_LIST113);

                    root_1 = (CommonTree)adaptor.becomeRoot(PORT_ACCESS_LIST113_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1891:24: ( port_access[$port_access_list.i_unused_accesses] )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==PORT_ACCESS) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1891:25: port_access[$port_access_list.i_unused_accesses]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_port_access_in_port_access_list2633);
                    	    port_access114=port_access(i_unused_accesses);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, port_access114.getTree());

                    	     		i_unused_accesses = (port_access114!=null?port_access114.o_unused_accesses:null);
                    	     		local_errors.addAll((port_access114!=null?port_access114.o_errors:null));
                    	     		access_ori = access_ori == PortOrientation.NONE? (port_access114!=null?port_access114.ori:null) : ((port_access114!=null?port_access114.ori:null).equals(access_ori)? (port_access114!=null?port_access114.ori:null) : PortOrientation.MIXED) ;
                    	     	

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                     		retval.o_errors = local_errors;
                     		retval.o_unused_accesses = i_unused_accesses;
                     		retval.ori = access_ori;
                     	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Language/ReoLang/ReoLangSpecs/ReoLangSemantics.g:1907:4: ^( PORT_ACCESS_LIST RW_REMAINING )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PORT_ACCESS_LIST115=(CommonTree)match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_port_access_list2666); 
                    PORT_ACCESS_LIST115_tree = (CommonTree)adaptor.dupNode(PORT_ACCESS_LIST115);

                    root_1 = (CommonTree)adaptor.becomeRoot(PORT_ACCESS_LIST115_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    RW_REMAINING116=(CommonTree)match(input,RW_REMAINING,FOLLOW_RW_REMAINING_in_port_access_list2668); 
                    RW_REMAINING116_tree = (CommonTree)adaptor.dupNode(RW_REMAINING116);

                    adaptor.addChild(root_1, RW_REMAINING116_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    		//find port orientation of remaining accesses
                    		PortOrientation remaining_ori = PortOrientation.NONE;
                    		
                    		if(i_unused_accesses.size()==0){
                    			local_errors.add(Error.report(ErrorType.ERROR, Error.noMorePortsAvailable(), (RW_REMAINING116!=null?RW_REMAINING116.getLine():0), (RW_REMAINING116!=null?RW_REMAINING116.getCharPositionInLine():0), ((reolang_scope)reolang_stack.peek()).file));
                    		}
                    		else{
                    			for(String x : i_unused_accesses){
                    				int index_of_point = x.indexOf('.');
                    				String name, port;
                    				name = x.substring(0, index_of_point);
                    				port = x.substring(index_of_point + 1);
                    				remaining_ori = ((pattern_def_scope)pattern_def_stack.peek()).pattern_table.get(name).isInPort(port) ? PortOrientation.IN : PortOrientation.OUT ;
                    				access_ori = access_ori == PortOrientation.NONE? remaining_ori : (remaining_ori.equals(access_ori)? remaining_ori : PortOrientation.MIXED) ;
                    			}
                    		}
                    		
                    		
                    		retval.o_unused_accesses = new ArrayList<String>(0);
                    		retval.o_errors = local_errors;
                    		retval.ori = access_ori;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "port_access_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_REO_LANG_in_reolang66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reolang71 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_element_in_reolang84 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_channel_def_in_element131 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_def_in_element148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTIVE_in_directive_def201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_import_in_directive_def203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FILE_PATH_in_directive_import229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHANNEL_in_channel_def288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_channel_signature_in_channel_def290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_extension_in_channel_def294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_channel_body_in_channel_def298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNATURE_in_channel_signature359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_channel_signature363 = new BitSet(new long[]{0x2100000000000000L});
    public static final BitSet FOLLOW_option_in_channel_signature366 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CHANNEL_PORTS_in_channel_signature373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_channel_signature377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_channel_signature390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_channel_signature404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_channel_signature408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_channel_signature410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPTION_in_option457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timed_in_option459 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPTION_in_option473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structured_in_option475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMED_in_timed526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_time_in_timed528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time586 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_time588 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time605 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCTURED_in_structured663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structure_dimension_in_structured666 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_DIMENSION_in_structure_dimension730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_structure_dimension732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIMENSION_in_structure_dimension747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_structure_dimension749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_in_ports802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ports807 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_COND_ELEMENTS_in_condition872 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_condition875 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_EXTENSION_in_extension943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_extension947 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHANNEL_BODY_in_channel_body1006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_state_def_in_channel_body1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FLOWS_in_channel_body1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_def_in_channel_body1020 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_CHANNEL_STATE_in_state_def1087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATE_REF_in_state_def1090 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def1094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATE_OBS_in_state_def1107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def1113 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_FLOW_in_flow_def1174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_requests_in_flow_def1176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_flow_type_in_flow_def1178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUESTS_in_requests1233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_request_in_requests1238 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
    public static final BitSet FOLLOW_REQUEST_in_request1300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_request1302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUEST_in_request1317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_MARK_in_request1319 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_request1321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type1377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type1381 = new BitSet(new long[]{0x0000020000000008L,0x0000000000008000L});
    public static final BitSet FOLLOW_flow_operation_in_flow_type1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type1389 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_flow_label_in_flow_type1394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type1409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_if_flow_in_flow_type1411 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NORMAL_FLOW_in_normal_flow1466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow1470 = new BitSet(new long[]{0x0200000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_timed_in_normal_flow1474 = new BitSet(new long[]{0x0200000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow1481 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_flow_point1535 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point1551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RW_NULL_in_flow_point1553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_OP_in_flow_operation1592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OP_SYNC_in_flow_operation1594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_FLOW_in_if_flow1637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_if_flow1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_FLOW_TRUE_in_if_flow1642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow1646 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow1651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_FALSE_in_if_flow1656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow1660 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow1665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_flow_label1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATTERN_in_pattern_def1772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_signature_in_pattern_def1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_pattern_body_in_pattern_def1776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_SIGNATURE_in_pattern_signature1832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_pattern_signature1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_PATTERN_PORTS_in_pattern_signature1839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_pattern_signature1843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature1847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_pattern_signature1857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature1861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_BODY_in_pattern_body1931 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_declarations_in_pattern_body1933 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_pattern_compositions_in_pattern_body1935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations1995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations1998 = new BitSet(new long[]{0x0000000000000008L,0x0000000001000000L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration2063 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reference_signature_in_declaration2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_instances_in_declaration2067 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_TYPE_in_reference_signature2120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_reference_signature2122 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_channel_signature_in_reference_signature2125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCES_in_instances2165 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instances2168 = new BitSet(new long[]{0x0000020000000008L,0x0000000200000000L});
    public static final BitSet FOLLOW_stochastic_values_in_instances2171 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_STOCH_in_stochastic_values2233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stochastic_values2238 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stochastic_values2240 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions2305 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions2308 = new BitSet(new long[]{0x0000000000000008L,0x0000000090000000L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions2323 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_PORT_DEFINITION_in_port_definition2394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_definition2396 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_port_actual_definition_in_port_definition2398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition2435 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_actual_definition2437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition2454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_part_in_port_actual_definition2456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_in_port_access2497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_access2501 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_port_access2505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_OP_in_join_operation2547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_join_operation2549 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_join_part_in_join_operation2551 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RW_JOIN_in_join_part2584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_list_in_join_part2586 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_port_access_list2630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_access_list2633 = new BitSet(new long[]{0x0000000000000008L,0x0000000040000000L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_port_access_list2666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RW_REMAINING_in_port_access_list2668 = new BitSet(new long[]{0x0000000000000008L});

}