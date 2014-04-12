// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g 2014-04-12 16:58:50

	package pt.uminho.di.reolang;
	
	import java.util.ArrayList;
	import java.util.LinkedHashMap;
	import java.util.LinkedHashSet;
	import pt.uminho.di.cp.model.*;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.reolang.parsing.util.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ReoLangCP2 extends TreeParser {
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
    public static final int IMPORT=54;
    public static final int ARROW_MARK=33;
    public static final int RW_TO=14;
    public static final int COND_OPEN=38;
    public static final int RW_JOIN=5;
    public static final int ACCESS_MARK=30;
    public static final int STRUCTURED=60;
    public static final int FLOWS=70;
    public static final int RW_NULL=10;
    public static final int QUESTION_MARK=31;
    public static final int CHANNEL=55;
    public static final int ELEMENT=52;
    public static final int DIMENSION=61;
    public static final int COND_ELEMENTS=67;
    public static final int FLOW_TRUE=82;
    public static final int RW_EXTENDS=12;
    public static final int LIST_OPEN=20;
    public static final int COMMENT=45;
    public static final int PORTS_OPEN=26;
    public static final int REO_LANG=51;
    public static final int IF_FLOW=81;
    public static final int REQUESTS=75;
    public static final int BODY_OPEN=28;
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


        public ReoLangCP2(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ReoLangCP2(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ReoLangCP2.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g"; }


    	
    	private LinkedHashMap<String, CPModelInternal> patterns;
    	public LinkedHashMap<String, CPModelInternal> getPatterns() {
    		return this.patterns;
    	}
    	
    	


    protected static class reolang_scope {
        SymbolsTable global_table;
    }
    protected Stack reolang_stack = new Stack();


    // $ANTLR start "reolang"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:36:1: reolang[String file, LinkedHashMap<String, CPModelInternal> cps, SymbolsTable symbols] : ^( REO_LANG ( directive_def )* ( element )* ) ;
    public final void reolang(String file, LinkedHashMap<String, CPModelInternal> cps, SymbolsTable symbols) throws RecognitionException {
        reolang_stack.push(new reolang_scope());

        	((reolang_scope)reolang_stack.peek()).global_table = symbols;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:43:2: ( ^( REO_LANG ( directive_def )* ( element )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:43:4: ^( REO_LANG ( directive_def )* ( element )* )
            {
            match(input,REO_LANG,FOLLOW_REO_LANG_in_reolang61); 


            		this.patterns = cps==null? new LinkedHashMap<String, CPModelInternal>() : cps;
            	

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:47:3: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DIRECTIVE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:47:3: directive_def
                	    {
                	    pushFollow(FOLLOW_directive_def_in_reolang69);
                	    directive_def();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:47:18: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ELEMENT) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:47:18: element
                	    {
                	    pushFollow(FOLLOW_element_in_reolang72);
                	    element();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            reolang_stack.pop();
        }
        return ;
    }
    // $ANTLR end "reolang"


    // $ANTLR start "element"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:50:1: element : ( ^( ELEMENT channel_def ) | ^( ELEMENT pattern_def ) | ^( ELEMENT stochastic_def ) );
    public final void element() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:51:2: ( ^( ELEMENT channel_def ) | ^( ELEMENT pattern_def ) | ^( ELEMENT stochastic_def ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ELEMENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case CHANNEL:
                        {
                        alt3=1;
                        }
                        break;
                    case RW_STOCHASTIC:
                        {
                        alt3=3;
                        }
                        break;
                    case PATTERN:
                        {
                        alt3=2;
                        }
                        break;
                    default:
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:51:4: ^( ELEMENT channel_def )
                    {
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_element87); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_channel_def_in_element89);
                    channel_def();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:52:4: ^( ELEMENT pattern_def )
                    {
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_element96); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_pattern_def_in_element98);
                    pattern_def();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:53:4: ^( ELEMENT stochastic_def )
                    {
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_element105); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_stochastic_def_in_element107);
                    stochastic_def();

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
        }
        return ;
    }
    // $ANTLR end "element"


    // $ANTLR start "directive_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:60:1: directive_def : ^( DIRECTIVE directive_import ) ;
    public final void directive_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:61:2: ( ^( DIRECTIVE directive_import ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:61:4: ^( DIRECTIVE directive_import )
            {
            match(input,DIRECTIVE,FOLLOW_DIRECTIVE_in_directive_def124); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_directive_import_in_directive_def126);
            directive_import();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "directive_def"


    // $ANTLR start "directive_import"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:65:1: directive_import : ^( IMPORT FILE_PATH ) ;
    public final void directive_import() throws RecognitionException {
        CommonTree FILE_PATH1=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:66:2: ( ^( IMPORT FILE_PATH ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:66:4: ^( IMPORT FILE_PATH )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import141); 

            match(input, Token.DOWN, null); 
            FILE_PATH1=(CommonTree)match(input,FILE_PATH,FOLLOW_FILE_PATH_in_directive_import143); 

            match(input, Token.UP, null); 

            		String file_string = (FILE_PATH1!=null?FILE_PATH1.getText():null);
            		String file = file_string.substring(1,file_string.length()-1);
            		CPBuilder cp_model_builder = new CPBuilder(file);
            		ReoLangCP2 res = cp_model_builder.performModelConstruction(this.patterns, ((reolang_scope)reolang_stack.peek()).global_table);
            		this.patterns = res.getPatterns() != null ? res.getPatterns() : this.patterns;
            		
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "directive_import"


    // $ANTLR start "channel_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:86:1: channel_def : ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body ) ;
    public final void channel_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:87:2: ( ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:87:5: ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body )
            {
            match(input,CHANNEL,FOLLOW_CHANNEL_in_channel_def170); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_channel_signature_in_channel_def172);
            channel_signature(InspectionMode.DECLARATION);

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:87:61: ( extension )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENSION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:87:61: extension
                    {
                    pushFollow(FOLLOW_extension_in_channel_def175);
                    extension();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_channel_body_in_channel_def178);
            channel_body();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "channel_def"

    public static class channel_signature_return extends TreeRuleReturnScope {
        public String o_name;
        public int o_dim;
        public LinkedHashSet<Node> o_ins;
        public LinkedHashSet<Node> o_outs;
    };

    // $ANTLR start "channel_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:92:1: channel_signature[InspectionMode mode] returns [String o_name, int o_dim, LinkedHashSet<Node> o_ins, LinkedHashSet<Node> o_outs] : ^( SIGNATURE id1= ID (o= option )? ^( CHANNEL_PORTS ( ^( IN_PORTS p1= ports[$id1.text] ) )? ( ^( OUT_PORTS p2= ports[$id1.text] ) )? ) ( ^( CONDITION ID condition ) )? ) ;
    public final ReoLangCP2.channel_signature_return channel_signature(InspectionMode mode) throws RecognitionException {
        ReoLangCP2.channel_signature_return retval = new ReoLangCP2.channel_signature_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        int o = 0;

        LinkedHashSet<Node> p1 = null;

        LinkedHashSet<Node> p2 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:2: ( ^( SIGNATURE id1= ID (o= option )? ^( CHANNEL_PORTS ( ^( IN_PORTS p1= ports[$id1.text] ) )? ( ^( OUT_PORTS p2= ports[$id1.text] ) )? ) ( ^( CONDITION ID condition ) )? ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:5: ^( SIGNATURE id1= ID (o= option )? ^( CHANNEL_PORTS ( ^( IN_PORTS p1= ports[$id1.text] ) )? ( ^( OUT_PORTS p2= ports[$id1.text] ) )? ) ( ^( CONDITION ID condition ) )? )
            {
            match(input,SIGNATURE,FOLLOW_SIGNATURE_in_channel_signature202); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_channel_signature206); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:25: (o= option )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==OPTION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:25: o= option
                    {
                    pushFollow(FOLLOW_option_in_channel_signature210);
                    o=option();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CHANNEL_PORTS,FOLLOW_CHANNEL_PORTS_in_channel_signature214); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:50: ( ^( IN_PORTS p1= ports[$id1.text] ) )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IN_PORTS) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:51: ^( IN_PORTS p1= ports[$id1.text] )
                        {
                        match(input,IN_PORTS,FOLLOW_IN_PORTS_in_channel_signature218); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_channel_signature222);
                        p1=ports((id1!=null?id1.getText():null));

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:85: ( ^( OUT_PORTS p2= ports[$id1.text] ) )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OUT_PORTS) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:86: ^( OUT_PORTS p2= ports[$id1.text] )
                        {
                        match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_channel_signature230); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_channel_signature234);
                        p2=ports((id1!=null?id1.getText():null));

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:122: ( ^( CONDITION ID condition ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CONDITION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:93:123: ^( CONDITION ID condition )
                    {
                    match(input,CONDITION,FOLLOW_CONDITION_in_channel_signature243); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_channel_signature245); 
                    pushFollow(FOLLOW_condition_in_channel_signature247);
                    condition();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }


            		retval.o_name = (id1!=null?id1.getText():null);
            		retval.o_dim = o;
            		retval.o_ins = p1 != null ? p1 : new LinkedHashSet<Node>(0);
            		retval.o_outs = p2 != null ? p2 : new LinkedHashSet<Node>(0);
            	

            match(input, Token.UP, null); 

            }

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


    // $ANTLR start "option"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:105:1: option returns [int dim] : ( ^( OPTION timed ) | ^( OPTION structured ) );
    public final int option() throws RecognitionException {
        int dim = 0;

        int structured2 = 0;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:106:2: ( ^( OPTION timed ) | ^( OPTION structured ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:106:4: ^( OPTION timed )
                    {
                    match(input,OPTION,FOLLOW_OPTION_in_option276); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_timed_in_option278);
                    timed();

                    state._fsp--;

                    dim = 0;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:107:4: ^( OPTION structured )
                    {
                    match(input,OPTION,FOLLOW_OPTION_in_option287); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_structured_in_option289);
                    structured2=structured();

                    state._fsp--;

                    dim = structured2;

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
        }
        return dim;
    }
    // $ANTLR end "option"


    // $ANTLR start "timed"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:111:1: timed : ^( TIMED time ) ;
    public final void timed() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:112:2: ( ^( TIMED time ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:112:5: ^( TIMED time )
            {
            match(input,TIMED,FOLLOW_TIMED_in_timed306); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_time_in_timed308);
            time();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "timed"


    // $ANTLR start "time"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:116:1: time : ( ^( TIME ID ) | ^( TIME INT ) );
    public final void time() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:117:2: ( ^( TIME ID ) | ^( TIME INT ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:117:5: ^( TIME ID )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time324); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_time326); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:118:5: ^( TIME INT )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time334); 

                    match(input, Token.DOWN, null); 
                    match(input,INT,FOLLOW_INT_in_time336); 

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
        }
        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "structured"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:122:1: structured returns [int dim] : ^( STRUCTURED ( structure_dimension )+ ) ;
    public final int structured() throws RecognitionException {
        int dim = 0;

        int structure_dimension3 = 0;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:123:2: ( ^( STRUCTURED ( structure_dimension )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:123:5: ^( STRUCTURED ( structure_dimension )+ )
            {
            match(input,STRUCTURED,FOLLOW_STRUCTURED_in_structured356); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:123:18: ( structure_dimension )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:123:18: structure_dimension
            	    {
            	    pushFollow(FOLLOW_structure_dimension_in_structured358);
            	    structure_dimension3=structure_dimension();

            	    state._fsp--;


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


            		//get only the last one (this will only work for 1 dimensino channels)
            		dim = structure_dimension3;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dim;
    }
    // $ANTLR end "structured"


    // $ANTLR start "structure_dimension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:132:1: structure_dimension returns [int dim] : ( ^( DIMENSION ID ) | ^( DIMENSION INT ) );
    public final int structure_dimension() throws RecognitionException {
        int dim = 0;

        CommonTree INT4=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:133:2: ( ^( DIMENSION ID ) | ^( DIMENSION INT ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:133:4: ^( DIMENSION ID )
                    {
                    match(input,DIMENSION,FOLLOW_DIMENSION_in_structure_dimension385); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_structure_dimension387); 
                    dim = 0;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:134:5: ^( DIMENSION INT )
                    {
                    match(input,DIMENSION,FOLLOW_DIMENSION_in_structure_dimension397); 

                    match(input, Token.DOWN, null); 
                    INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_structure_dimension399); 
                    dim = (INT4!=null?Integer.valueOf(INT4.getText()):0);

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
        }
        return dim;
    }
    // $ANTLR end "structure_dimension"


    // $ANTLR start "ports"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:138:1: ports[String inst_name] returns [LinkedHashSet<Node> o_ports] : ^( PORT ( ID )+ ) ;
    public final LinkedHashSet<Node> ports(String inst_name) throws RecognitionException {
        LinkedHashSet<Node> o_ports = null;

        CommonTree ID5=null;


        	LinkedHashSet<Node> _ports = new LinkedHashSet<Node>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:142:2: ( ^( PORT ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:142:5: ^( PORT ( ID )+ )
            {
            match(input,PORT,FOLLOW_PORT_in_ports427); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:142:12: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:142:13: ID
            	    {
            	    ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_ports430); 

            	    		LinkedHashSet<String> ends = new LinkedHashSet<String>();
            	    		ends.add(( ! inst_name.equals("") ? inst_name + "_" : "") +(ID5!=null?ID5.getText():null));
            	    		_ports.add(new Node(ends));
            	    	

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


            		o_ports = _ports;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return o_ports;
    }
    // $ANTLR end "ports"


    // $ANTLR start "condition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:156:1: condition : ^( COND_ELEMENTS ( ID )+ ) ;
    public final void condition() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:157:2: ( ^( COND_ELEMENTS ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:157:5: ^( COND_ELEMENTS ( ID )+ )
            {
            match(input,COND_ELEMENTS,FOLLOW_COND_ELEMENTS_in_condition458); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:157:21: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:157:21: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_condition460); 

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


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "condition"


    // $ANTLR start "extension"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:161:1: extension : ^( EXTENSION ID ) ;
    public final void extension() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:162:2: ( ^( EXTENSION ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:162:5: ^( EXTENSION ID )
            {
            match(input,EXTENSION,FOLLOW_EXTENSION_in_extension477); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_extension479); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "extension"


    // $ANTLR start "channel_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:166:1: channel_body : ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) ;
    public final void channel_body() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:167:2: ( ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:167:4: ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) )
            {
            match(input,CHANNEL_BODY,FOLLOW_CHANNEL_BODY_in_channel_body494); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:167:19: ( state_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CHANNEL_STATE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:167:19: state_def
                    {
                    pushFollow(FOLLOW_state_def_in_channel_body496);
                    state_def();

                    state._fsp--;


                    }
                    break;

            }

            match(input,FLOWS,FOLLOW_FLOWS_in_channel_body501); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:167:39: ( flow_def )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:167:39: flow_def
            	    {
            	    pushFollow(FOLLOW_flow_def_in_channel_body503);
            	    flow_def();

            	    state._fsp--;


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


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "channel_body"


    // $ANTLR start "state_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:171:1: state_def : ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) ;
    public final void state_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:172:2: ( ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:172:5: ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) )
            {
            match(input,CHANNEL_STATE,FOLLOW_CHANNEL_STATE_in_state_def521); 

            match(input, Token.DOWN, null); 
            match(input,STATE_REF,FOLLOW_STATE_REF_in_state_def524); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_state_def526); 

            match(input, Token.UP, null); 
            match(input,STATE_OBS,FOLLOW_STATE_OBS_in_state_def530); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:172:49: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:172:49: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_state_def532); 

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


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "state_def"


    // $ANTLR start "flow_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:176:1: flow_def : ^( FLOW requests flow_type ) ;
    public final void flow_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:177:2: ( ^( FLOW requests flow_type ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:177:5: ^( FLOW requests flow_type )
            {
            match(input,FLOW,FOLLOW_FLOW_in_flow_def551); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_requests_in_flow_def553);
            requests();

            state._fsp--;

            pushFollow(FOLLOW_flow_type_in_flow_def555);
            flow_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "flow_def"


    // $ANTLR start "requests"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:182:1: requests : ^( REQUESTS ( request )+ ) ;
    public final void requests() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:183:2: ( ^( REQUESTS ( request )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:183:4: ^( REQUESTS ( request )+ )
            {
            match(input,REQUESTS,FOLLOW_REQUESTS_in_requests571); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:183:15: ( request )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:183:15: request
            	    {
            	    pushFollow(FOLLOW_request_in_requests573);
            	    request();

            	    state._fsp--;


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


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "requests"


    // $ANTLR start "request"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:187:1: request : ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) );
    public final void request() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:188:2: ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:188:4: ^( REQUEST ID )
                    {
                    match(input,REQUEST,FOLLOW_REQUEST_in_request590); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_request592); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:189:4: ^( REQUEST NOT_MARK ID )
                    {
                    match(input,REQUEST,FOLLOW_REQUEST_in_request599); 

                    match(input, Token.DOWN, null); 
                    match(input,NOT_MARK,FOLLOW_NOT_MARK_in_request601); 
                    match(input,ID,FOLLOW_ID_in_request603); 

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
        }
        return ;
    }
    // $ANTLR end "request"


    // $ANTLR start "flow_type"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:193:1: flow_type : ( ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | ^( FLOW_TYPE if_flow ) );
    public final void flow_type() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:194:2: ( ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | ^( FLOW_TYPE if_flow ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:194:4: ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? )
                    {
                    match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type618); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_normal_flow_in_flow_type620);
                    normal_flow();

                    state._fsp--;

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:194:28: ( flow_operation normal_flow )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==FLOW_OP) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:194:29: flow_operation normal_flow
                            {
                            pushFollow(FOLLOW_flow_operation_in_flow_type623);
                            flow_operation();

                            state._fsp--;

                            pushFollow(FOLLOW_normal_flow_in_flow_type625);
                            normal_flow();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:194:58: ( flow_label )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:194:58: flow_label
                            {
                            pushFollow(FOLLOW_flow_label_in_flow_type629);
                            flow_label();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:195:4: ^( FLOW_TYPE if_flow )
                    {
                    match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type637); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_if_flow_in_flow_type639);
                    if_flow();

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
        }
        return ;
    }
    // $ANTLR end "flow_type"


    // $ANTLR start "normal_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:199:1: normal_flow : ^( NORMAL_FLOW flow_point ( timed )? flow_point ) ;
    public final void normal_flow() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:200:2: ( ^( NORMAL_FLOW flow_point ( timed )? flow_point ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:200:5: ^( NORMAL_FLOW flow_point ( timed )? flow_point )
            {
            match(input,NORMAL_FLOW,FOLLOW_NORMAL_FLOW_in_normal_flow655); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_point_in_normal_flow657);
            flow_point();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:200:30: ( timed )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TIMED) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:200:30: timed
                    {
                    pushFollow(FOLLOW_timed_in_normal_flow659);
                    timed();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_flow_point_in_normal_flow662);
            flow_point();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "normal_flow"


    // $ANTLR start "flow_point"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:204:1: flow_point : ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) );
    public final void flow_point() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:205:2: ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:205:4: ^( FLOW_POINT ID )
                    {
                    match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point678); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_flow_point680); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:206:5: ^( FLOW_POINT RW_NULL )
                    {
                    match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point688); 

                    match(input, Token.DOWN, null); 
                    match(input,RW_NULL,FOLLOW_RW_NULL_in_flow_point690); 

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
        }
        return ;
    }
    // $ANTLR end "flow_point"


    // $ANTLR start "flow_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:209:1: flow_operation : ^( FLOW_OP OP_SYNC ) ;
    public final void flow_operation() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:210:2: ( ^( FLOW_OP OP_SYNC ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:210:5: ^( FLOW_OP OP_SYNC )
            {
            match(input,FLOW_OP,FOLLOW_FLOW_OP_in_flow_operation704); 

            match(input, Token.DOWN, null); 
            match(input,OP_SYNC,FOLLOW_OP_SYNC_in_flow_operation706); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "flow_operation"


    // $ANTLR start "if_flow"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:214:1: if_flow : ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) ) ;
    public final void if_flow() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:215:2: ( ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:215:4: ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) )
            {
            match(input,IF_FLOW,FOLLOW_IF_FLOW_in_if_flow721); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_if_flow723); 
            match(input,FLOW_TRUE,FOLLOW_FLOW_TRUE_in_if_flow726); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_type_in_if_flow728);
            flow_type();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:215:39: ( flow_label )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:215:39: flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow730);
                    flow_label();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            match(input,FLOW_FALSE,FOLLOW_FLOW_FALSE_in_if_flow735); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_type_in_if_flow737);
            flow_type();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:215:75: ( flow_label )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:215:75: flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow739);
                    flow_label();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "if_flow"


    // $ANTLR start "flow_label"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:220:1: flow_label : ID ;
    public final void flow_label() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:221:2: ( ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:221:5: ID
            {
            match(input,ID,FOLLOW_ID_in_flow_label759); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "flow_label"


    // $ANTLR start "pattern_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:234:1: pattern_def : ^( PATTERN ps= pattern_signature pattern_body[$ps.o_name] ) ;
    public final void pattern_def() throws RecognitionException {
        String ps = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:235:2: ( ^( PATTERN ps= pattern_signature pattern_body[$ps.o_name] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:235:4: ^( PATTERN ps= pattern_signature pattern_body[$ps.o_name] )
            {
            match(input,PATTERN,FOLLOW_PATTERN_in_pattern_def781); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pattern_signature_in_pattern_def785);
            ps=pattern_signature();

            state._fsp--;

            pushFollow(FOLLOW_pattern_body_in_pattern_def787);
            pattern_body(ps);

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pattern_def"


    // $ANTLR start "pattern_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:243:1: pattern_signature returns [String o_name] : ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS p1= ports[\"\"] ) )? ( ^( OUT_PORTS p2= ports[\"\"] ) )? ) ) ;
    public final String pattern_signature() throws RecognitionException {
        String o_name = null;

        CommonTree ID6=null;
        LinkedHashSet<Node> p1 = null;

        LinkedHashSet<Node> p2 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:244:2: ( ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS p1= ports[\"\"] ) )? ( ^( OUT_PORTS p2= ports[\"\"] ) )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:244:5: ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS p1= ports[\"\"] ) )? ( ^( OUT_PORTS p2= ports[\"\"] ) )? ) )
            {
            match(input,PATTERN_SIGNATURE,FOLLOW_PATTERN_SIGNATURE_in_pattern_signature818); 

            match(input, Token.DOWN, null); 
            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_pattern_signature820); 
            match(input,PATTERN_PORTS,FOLLOW_PATTERN_PORTS_in_pattern_signature823); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:244:44: ( ^( IN_PORTS p1= ports[\"\"] ) )?
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IN_PORTS) ) {
                    alt27=1;
                }
                switch (alt27) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:244:45: ^( IN_PORTS p1= ports[\"\"] )
                        {
                        match(input,IN_PORTS,FOLLOW_IN_PORTS_in_pattern_signature827); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_pattern_signature831);
                        p1=ports("");

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:244:72: ( ^( OUT_PORTS p2= ports[\"\"] ) )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OUT_PORTS) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:244:73: ^( OUT_PORTS p2= ports[\"\"] )
                        {
                        match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_pattern_signature839); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_pattern_signature843);
                        p2=ports("");

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            	
            		o_name = (ID6!=null?ID6.getText():null);
            		
            		CPModelInternal cpmi = new CPModelInternal();
            		CoordinationPattern2 cp = new CoordinationPattern2();
            		cp.setId((ID6!=null?ID6.getText():null));
            		cpmi.setSimplePattern(cp);
            		
            		LinkedHashSet<Node> env = new LinkedHashSet<Node>(p1);
            		env.addAll(p2);
            		cpmi.setEnvironment(env);
            		this.patterns.put((ID6!=null?ID6.getText():null), cpmi);
            		
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return o_name;
    }
    // $ANTLR end "pattern_signature"


    // $ANTLR start "pattern_body"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:269:1: pattern_body[String patt_name] : ^( PATTERN_BODY pattern_declarations[$pattern_body.patt_name] pattern_compositions[$pattern_body.patt_name] ) ;
    public final void pattern_body(String patt_name) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:270:2: ( ^( PATTERN_BODY pattern_declarations[$pattern_body.patt_name] pattern_compositions[$pattern_body.patt_name] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:270:5: ^( PATTERN_BODY pattern_declarations[$pattern_body.patt_name] pattern_compositions[$pattern_body.patt_name] )
            {
            match(input,PATTERN_BODY,FOLLOW_PATTERN_BODY_in_pattern_body885); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pattern_declarations_in_pattern_body887);
            pattern_declarations(patt_name);

            state._fsp--;

            pushFollow(FOLLOW_pattern_compositions_in_pattern_body890);
            pattern_compositions(patt_name);

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pattern_body"


    // $ANTLR start "pattern_declarations"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:273:1: pattern_declarations[String patt_name] : ^( PATTERN_DECLARATIONS ( declaration[$pattern_declarations.patt_name] )+ ) ;
    public final void pattern_declarations(String patt_name) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:274:2: ( ^( PATTERN_DECLARATIONS ( declaration[$pattern_declarations.patt_name] )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:274:5: ^( PATTERN_DECLARATIONS ( declaration[$pattern_declarations.patt_name] )+ )
            {
            match(input,PATTERN_DECLARATIONS,FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations908); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:274:28: ( declaration[$pattern_declarations.patt_name] )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:274:28: declaration[$pattern_declarations.patt_name]
            	    {
            	    pushFollow(FOLLOW_declaration_in_pattern_declarations910);
            	    declaration(patt_name);

            	    state._fsp--;


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


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pattern_declarations"


    // $ANTLR start "declaration"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:284:1: declaration[String patt_name] : ^( DECLARATION sig= reference_signature instances[$sig.o_name, $sig.o_type, $sig.o_ins, $sig.o_outs, $declaration.patt_name] ) ;
    public final void declaration(String patt_name) throws RecognitionException {
        ReoLangCP2.reference_signature_return sig = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:285:2: ( ^( DECLARATION sig= reference_signature instances[$sig.o_name, $sig.o_type, $sig.o_ins, $sig.o_outs, $declaration.patt_name] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:285:5: ^( DECLARATION sig= reference_signature instances[$sig.o_name, $sig.o_type, $sig.o_ins, $sig.o_outs, $declaration.patt_name] )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration943); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reference_signature_in_declaration947);
            sig=reference_signature();

            state._fsp--;

            pushFollow(FOLLOW_instances_in_declaration949);
            instances((sig!=null?sig.o_name:null), (sig!=null?sig.o_type:null), (sig!=null?sig.o_ins:null), (sig!=null?sig.o_outs:null), patt_name);

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaration"

    public static class reference_signature_return extends TreeRuleReturnScope {
        public String o_name;
        public String o_type;
        public int o_dim;
        public LinkedHashSet<Node> o_ins;
        public LinkedHashSet<Node> o_outs;
    };

    // $ANTLR start "reference_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:295:1: reference_signature returns [String o_name, String o_type, int o_dim, LinkedHashSet<Node> o_ins, LinkedHashSet<Node> o_outs] : ^( DECLARATION_TYPE ( ID )? cs= channel_signature[InspectionMode.REF_BY_INSTANCE] ) ;
    public final ReoLangCP2.reference_signature_return reference_signature() throws RecognitionException {
        ReoLangCP2.reference_signature_return retval = new ReoLangCP2.reference_signature_return();
        retval.start = input.LT(1);

        CommonTree ID7=null;
        ReoLangCP2.channel_signature_return cs = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:296:2: ( ^( DECLARATION_TYPE ( ID )? cs= channel_signature[InspectionMode.REF_BY_INSTANCE] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:296:4: ^( DECLARATION_TYPE ( ID )? cs= channel_signature[InspectionMode.REF_BY_INSTANCE] )
            {
            match(input,DECLARATION_TYPE,FOLLOW_DECLARATION_TYPE_in_reference_signature982); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:296:23: ( ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:296:23: ID
                    {
                    ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_reference_signature984); 

                    }
                    break;

            }

            pushFollow(FOLLOW_channel_signature_in_reference_signature989);
            cs=channel_signature(InspectionMode.REF_BY_INSTANCE);

            state._fsp--;


            		retval.o_name = (cs!=null?cs.o_name:null);
            		retval.o_type = 
            			(cs!=null?cs.o_name:null) + ((cs!=null?cs.o_dim:0) > 0 ? (cs!=null?cs.o_dim:0) : "") + ((ID7!=null?ID7.getText():null)!=null ? (ID7!=null?ID7.getText():null).toLowerCase() : "") ;
            		retval.o_ins = (cs!=null?cs.o_ins:null);
            		retval.o_outs = (cs!=null?cs.o_outs:null);
            	

            match(input, Token.UP, null); 

            }

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


    // $ANTLR start "instances"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:316:1: instances[String i_name, String i_type, LinkedHashSet<Node> i_ins, LinkedHashSet<Node> i_outs, String patt_name] : ^( INSTANCES ( ID )+ ) ;
    public final void instances(String i_name, String i_type, LinkedHashSet<Node> i_ins, LinkedHashSet<Node> i_outs, String patt_name) throws RecognitionException {
        CommonTree ID8=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:317:2: ( ^( INSTANCES ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:317:5: ^( INSTANCES ( ID )+ )
            {
            match(input,INSTANCES,FOLLOW_INSTANCES_in_instances1031); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:317:17: ( ID )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:317:18: ID
            	    {
            	    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_instances1034); 

            	    		//CHANNELS
            	    		if(! this.patterns.containsKey(i_name)) {
            	    			
            	    			CommunicationMean2 cm;
            	    			cm = new CommunicationMean2(
            	    				i_ins, i_outs, (ID8!=null?ID8.getText():null), 
            	    				i_type, new LinkedHashMap<String, Double>()
            	    			);
            	    			this.patterns.get(patt_name).getSimplePattern().getPattern().add(cm);

            	    		}
            	    		else { //PATTERNS
            	    			CPModelInternal cpmi = this.patterns.get(i_name);
            	    			CoordinationPattern2 cp = cpmi.getSimplePattern();
            	    			CPModelInternal cpmi_in_creation = this.patterns.get(patt_name);
            	    			//CoordinationPattern p = new CoordinationPattern(cpmi.getCP());
            	    			for(CommunicationMean2 cm : cp.getPattern() ){
            	    				CommunicationMean2 cm_new = new CommunicationMean2(cm);
            	    				cm_new.setId(cp.getId() + "::" + cm.getId());
            	    				cpmi_in_creation.getSimplePattern().getPattern().add(cm_new);
            	    				//TODO: copy of internal nodes...
            	    				
            	    			}
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "instances"


    // $ANTLR start "pattern_compositions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:360:1: pattern_compositions[String patt_name] : ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.patt_name] )+ ( join_operation[$pattern_compositions.patt_name] )* ) ;
    public final void pattern_compositions(String patt_name) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:361:2: ( ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.patt_name] )+ ( join_operation[$pattern_compositions.patt_name] )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:361:6: ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.patt_name] )+ ( join_operation[$pattern_compositions.patt_name] )* )
            {
            match(input,PATTERN_COMPOSITIONS,FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions1077); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:361:29: ( port_definition[$pattern_compositions.patt_name] )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PORT_DEFINITION) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:361:29: port_definition[$pattern_compositions.patt_name]
            	    {
            	    pushFollow(FOLLOW_port_definition_in_pattern_compositions1079);
            	    port_definition(patt_name);

            	    state._fsp--;


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

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:361:79: ( join_operation[$pattern_compositions.patt_name] )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==JOIN_OP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:361:79: join_operation[$pattern_compositions.patt_name]
            	    {
            	    pushFollow(FOLLOW_join_operation_in_pattern_compositions1083);
            	    join_operation(patt_name);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pattern_compositions"


    // $ANTLR start "port_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:367:1: port_definition[String patt_name] : ^( PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text] ) ;
    public final void port_definition(String patt_name) throws RecognitionException {
        CommonTree ID9=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:368:2: ( ^( PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:368:5: ^( PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text] )
            {
            match(input,PORT_DEFINITION,FOLLOW_PORT_DEFINITION_in_port_definition1108); 

            match(input, Token.DOWN, null); 
            ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_port_definition1110); 
            pushFollow(FOLLOW_port_actual_definition_in_port_definition1112);
            port_actual_definition(patt_name, (ID9!=null?ID9.getText():null));

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "port_definition"


    // $ANTLR start "port_actual_definition"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:371:1: port_actual_definition[String patt_name, String port] : ( ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name] ) | ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port] ) );
    public final void port_actual_definition(String patt_name, String port) throws RecognitionException {
        String port_access10 = null;

        ReoLangCP2.join_part_return join_part11 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:372:2: ( ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name] ) | ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port] ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==PORT_ACTUAL_DEFINITION) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==DOWN) ) {
                    int LA34_2 = input.LA(3);

                    if ( ((LA34_2>=RW_DECIDE && LA34_2<=RW_JOIN)) ) {
                        alt34=2;
                    }
                    else if ( (LA34_2==PORT_ACCESS) ) {
                        alt34=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:372:5: ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name] )
                    {
                    match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1130); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_port_access_in_port_actual_definition1132);
                    port_access10=port_access(patt_name);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		CPModelInternal cpmi = this.patterns.get(patt_name);
                    		LinkedHashSet<String> access_node = new LinkedHashSet<String>();
                    				access_node.add(port_access10);
                    		cpmi.getNodes().put(port, new Node(access_node));
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:379:5: ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port] )
                    {
                    match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1144); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_join_part_in_port_actual_definition1146);
                    join_part11=join_part(patt_name, port);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		CPModelInternal cpmi = this.patterns.get(patt_name);
                    		cpmi.getNodes().put(port, new Node((join_part11!=null?join_part11.node:null)));
                    		//replaces the nodes on the channels...
                    		cpmi.getSimplePattern().replaceNodesBy((join_part11!=null?join_part11.node:null));
                    		if((join_part11!=null?join_part11.isXOR:null)){
                    			cpmi.getSimplePattern().getXors().add((join_part11!=null?join_part11.node:null));
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
        }
        return ;
    }
    // $ANTLR end "port_actual_definition"


    // $ANTLR start "port_access"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:391:1: port_access[String patt_name] returns [String port_str] : ^( PORT_ACCESS i1= ID i2= ID ) ;
    public final String port_access(String patt_name) throws RecognitionException {
        String port_str = null;

        CommonTree i1=null;
        CommonTree i2=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:392:2: ( ^( PORT_ACCESS i1= ID i2= ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:392:4: ^( PORT_ACCESS i1= ID i2= ID )
            {
            match(input,PORT_ACCESS,FOLLOW_PORT_ACCESS_in_port_access1170); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access1174); 
            i2=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access1178); 

            		port_str = (i1!=null?i1.getText():null) + "_" + (i2!=null?i2.getText():null);	
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return port_str;
    }
    // $ANTLR end "port_access"


    // $ANTLR start "join_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:399:1: join_operation[String patt_name] : ^( JOIN_OP ID join_part[$join_operation.patt_name, $ID.text] ) ;
    public final void join_operation(String patt_name) throws RecognitionException {
        CommonTree ID12=null;
        ReoLangCP2.join_part_return join_part13 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:400:2: ( ^( JOIN_OP ID join_part[$join_operation.patt_name, $ID.text] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:400:4: ^( JOIN_OP ID join_part[$join_operation.patt_name, $ID.text] )
            {
            match(input,JOIN_OP,FOLLOW_JOIN_OP_in_join_operation1199); 

            match(input, Token.DOWN, null); 
            ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_join_operation1201); 
            pushFollow(FOLLOW_join_part_in_join_operation1203);
            join_part13=join_part(patt_name, (ID12!=null?ID12.getText():null));

            state._fsp--;


            		CPModelInternal cpmi = this.patterns.get(patt_name);
            		cpmi.getNodes().put((ID12!=null?ID12.getText():null), new Node((join_part13!=null?join_part13.node:null)));
            		//replaces the nodes on the channels...
            		cpmi.getSimplePattern().replaceNodesBy((join_part13!=null?join_part13.node:null));
            		if((join_part13!=null?join_part13.isXOR:null)){
            			cpmi.getSimplePattern().getXors().add((join_part13!=null?join_part13.node:null));
            		}
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "join_operation"

    public static class join_part_return extends TreeRuleReturnScope {
        public Node node;
        public Boolean isXOR;
    };

    // $ANTLR start "join_part"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:413:1: join_part[String patt_name, String port] returns [Node node, Boolean isXOR] : ( ^( RW_JOIN port_access_list[$join_part.patt_name, $join_part.port] ) | ^( RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port] ) );
    public final ReoLangCP2.join_part_return join_part(String patt_name, String port) throws RecognitionException {
        ReoLangCP2.join_part_return retval = new ReoLangCP2.join_part_return();
        retval.start = input.LT(1);

        Node port_access_list14 = null;

        Node special_port_access_list15 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:414:2: ( ^( RW_JOIN port_access_list[$join_part.patt_name, $join_part.port] ) | ^( RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port] ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RW_JOIN) ) {
                alt35=1;
            }
            else if ( (LA35_0==RW_DECIDE) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:414:5: ^( RW_JOIN port_access_list[$join_part.patt_name, $join_part.port] )
                    {
                    match(input,RW_JOIN,FOLLOW_RW_JOIN_in_join_part1232); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_port_access_list_in_join_part1234);
                    port_access_list14=port_access_list(patt_name, port);

                    state._fsp--;


                    		retval.node = port_access_list14;
                    		retval.isXOR = false;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:420:5: ^( RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port] )
                    {
                    match(input,RW_DECIDE,FOLLOW_RW_DECIDE_in_join_part1251); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_special_port_access_list_in_join_part1253);
                    special_port_access_list15=special_port_access_list(patt_name, port);

                    state._fsp--;


                    		retval.node = special_port_access_list15;
                    		retval.isXOR = true;
                    	

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
        }
        return retval;
    }
    // $ANTLR end "join_part"


    // $ANTLR start "port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:429:1: port_access_list[String patt_name, String port] returns [Node node] : ^( PORT_ACCESS_LIST ( port_access[$port_access_list.patt_name] )+ ) ;
    public final Node port_access_list(String patt_name, String port) throws RecognitionException {
        Node node = null;

        String port_access16 = null;



        	Node _node = new Node(); 

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:433:2: ( ^( PORT_ACCESS_LIST ( port_access[$port_access_list.patt_name] )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:433:4: ^( PORT_ACCESS_LIST ( port_access[$port_access_list.patt_name] )+ )
            {
            match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_port_access_list1288); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:433:23: ( port_access[$port_access_list.patt_name] )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==PORT_ACCESS) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:433:24: port_access[$port_access_list.patt_name]
            	    {
            	    pushFollow(FOLLOW_port_access_in_port_access_list1291);
            	    port_access16=port_access(patt_name);

            	    state._fsp--;


            	    		_node.addEnd(port_access16);
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            		node = _node;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "port_access_list"


    // $ANTLR start "special_port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:445:1: special_port_access_list[String patt_name, String port] returns [Node node] : ^( PORT_ACCESS_LIST ( port_access[$special_port_access_list.patt_name] )+ ) ;
    public final Node special_port_access_list(String patt_name, String port) throws RecognitionException {
        Node node = null;

        String port_access17 = null;



        	Node _node = new Node();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:449:2: ( ^( PORT_ACCESS_LIST ( port_access[$special_port_access_list.patt_name] )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:449:4: ^( PORT_ACCESS_LIST ( port_access[$special_port_access_list.patt_name] )+ )
            {
            match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_special_port_access_list1331); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:449:23: ( port_access[$special_port_access_list.patt_name] )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:449:24: port_access[$special_port_access_list.patt_name]
            	    {
            	    pushFollow(FOLLOW_port_access_in_special_port_access_list1334);
            	    port_access17=port_access(patt_name);

            	    state._fsp--;


            	    		_node.addEnd(port_access17);
            	    	

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


            		node = _node;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "special_port_access_list"


    // $ANTLR start "stochastic_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:464:1: stochastic_def : ^( RW_STOCHASTIC i1= ID i2= ID stochastic_list[patt_name, inst_name] ) ;
    public final void stochastic_def() throws RecognitionException {
        CommonTree i1=null;
        CommonTree i2=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:465:2: ( ^( RW_STOCHASTIC i1= ID i2= ID stochastic_list[patt_name, inst_name] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:465:4: ^( RW_STOCHASTIC i1= ID i2= ID stochastic_list[patt_name, inst_name] )
            {
            match(input,RW_STOCHASTIC,FOLLOW_RW_STOCHASTIC_in_stochastic_def1366); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_stochastic_def1370); 
            i2=(CommonTree)match(input,ID,FOLLOW_ID_in_stochastic_def1374); 

            		String patt_name = (i1!=null?i1.getText():null);
            		String inst_name = (i2!=null?i2.getText():null);
            		
            		CPModelInternal cpmi = this.patterns.get(patt_name);
            		cpmi.getStochInstances().put(inst_name, new CoordinationPattern2(cpmi.getSimplePattern()));
            	
            pushFollow(FOLLOW_stochastic_list_in_stochastic_def1382);
            stochastic_list(patt_name, inst_name);

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stochastic_def"


    // $ANTLR start "stochastic_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:476:1: stochastic_list[String p, String i] : ( stoch_elem[p, i] ( stoch_elem[p, i] )* ) ;
    public final void stochastic_list(String p, String i) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:477:2: ( ( stoch_elem[p, i] ( stoch_elem[p, i] )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:477:4: ( stoch_elem[p, i] ( stoch_elem[p, i] )* )
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:477:4: ( stoch_elem[p, i] ( stoch_elem[p, i] )* )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:477:6: stoch_elem[p, i] ( stoch_elem[p, i] )*
            {
            pushFollow(FOLLOW_stoch_elem_in_stochastic_list1401);
            stoch_elem(p, i);

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:477:23: ( stoch_elem[p, i] )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==STOCH) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:477:25: stoch_elem[p, i]
            	    {
            	    pushFollow(FOLLOW_stoch_elem_in_stochastic_list1406);
            	    stoch_elem(p, i);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stochastic_list"


    // $ANTLR start "stoch_elem"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:484:1: stoch_elem[String p, String i] : ^( STOCH i1= ID (i2= ID )? stoch_val ) ;
    public final void stoch_elem(String p, String i) throws RecognitionException {
        CommonTree i1=null;
        CommonTree i2=null;
        Pair<Double, Double> stoch_val18 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:485:2: ( ^( STOCH i1= ID (i2= ID )? stoch_val ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:485:4: ^( STOCH i1= ID (i2= ID )? stoch_val )
            {
            match(input,STOCH,FOLLOW_STOCH_in_stoch_elem1427); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_stoch_elem1431); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:485:18: (i2= ID )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:485:19: i2= ID
                    {
                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_stoch_elem1436); 

                    }
                    break;

            }

            pushFollow(FOLLOW_stoch_val_in_stoch_elem1440);
            stoch_val18=stoch_val();

            state._fsp--;


            		CPModelInternal cpmi = this.patterns.get(p);
            		CoordinationPattern2 si = cpmi.getStochInstances().get(i);
            		if(i2==null){
            			si.getDelays().put(cpmi.getNodes().get((i1!=null?i1.getText():null)), stoch_val18);
            		}
            		else {
            			
            			CommunicationMean2 cm = new CommunicationMean2();
            			for(CommunicationMean2 _cm : si.getPattern()){
            				if(_cm.getId().equals((i2!=null?i2.getText():null))){
            					cm = _cm;
            					break;
            				}
            			}
            			cm.getDelays().put((i2!=null?i2.getText():null), stoch_val18.fst());
            		}
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stoch_elem"


    // $ANTLR start "stoch_val"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:508:1: stoch_val returns [Pair<Double, Double> val] : ( ^( STOCH_VAL FLOAT ) | ^( STOCH_VAL f1= FLOAT f2= FLOAT ) );
    public final Pair<Double, Double> stoch_val() throws RecognitionException {
        Pair<Double, Double> val = null;

        CommonTree f1=null;
        CommonTree f2=null;
        CommonTree FLOAT19=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:509:2: ( ^( STOCH_VAL FLOAT ) | ^( STOCH_VAL f1= FLOAT f2= FLOAT ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==STOCH_VAL) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==DOWN) ) {
                    int LA40_2 = input.LA(3);

                    if ( (LA40_2==FLOAT) ) {
                        int LA40_3 = input.LA(4);

                        if ( (LA40_3==FLOAT) ) {
                            alt40=2;
                        }
                        else if ( (LA40_3==UP) ) {
                            alt40=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 40, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:509:4: ^( STOCH_VAL FLOAT )
                    {
                    match(input,STOCH_VAL,FOLLOW_STOCH_VAL_in_stoch_val1466); 

                    match(input, Token.DOWN, null); 
                    FLOAT19=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_stoch_val1468); 

                    //		$stoch_val.isRW = false;
                    		val = new Pair<Double, Double>(Double.parseDouble((FLOAT19!=null?FLOAT19.getText():null)),0.0);
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCP2.g:515:4: ^( STOCH_VAL f1= FLOAT f2= FLOAT )
                    {
                    match(input,STOCH_VAL,FOLLOW_STOCH_VAL_in_stoch_val1480); 

                    match(input, Token.DOWN, null); 
                    f1=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_stoch_val1484); 
                    f2=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_stoch_val1488); 

                    //		$stoch_val.isRW = true;
                    		val = new Pair<Double, Double>(Double.parseDouble((f1!=null?f1.getText():null)),Double.parseDouble((f2!=null?f2.getText():null)));
                    	

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
        }
        return val;
    }
    // $ANTLR end "stoch_val"

    // Delegated rules


 

    public static final BitSet FOLLOW_REO_LANG_in_reolang61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reolang69 = new BitSet(new long[]{0x0030000000000008L});
    public static final BitSet FOLLOW_element_in_reolang72 = new BitSet(new long[]{0x0010000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_channel_def_in_element89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_def_in_element98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stochastic_def_in_element107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIRECTIVE_in_directive_def124 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_import_in_directive_def126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FILE_PATH_in_directive_import143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHANNEL_in_channel_def170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_channel_signature_in_channel_def172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_extension_in_channel_def175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_channel_body_in_channel_def178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNATURE_in_channel_signature202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_channel_signature206 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_option_in_channel_signature210 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_CHANNEL_PORTS_in_channel_signature214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_channel_signature218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_channel_signature230 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_in_channel_signature243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_channel_signature245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_condition_in_channel_signature247 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPTION_in_option276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timed_in_option278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPTION_in_option287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structured_in_option289 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIMED_in_timed306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_time_in_timed308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_time326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_in_time334 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_time336 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRUCTURED_in_structured356 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_structure_dimension_in_structured358 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_DIMENSION_in_structure_dimension385 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_structure_dimension387 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIMENSION_in_structure_dimension397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_structure_dimension399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_in_ports427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ports430 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_COND_ELEMENTS_in_condition458 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_condition460 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_EXTENSION_in_extension477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_extension479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHANNEL_BODY_in_channel_body494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_state_def_in_channel_body496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FLOWS_in_channel_body501 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_def_in_channel_body503 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_CHANNEL_STATE_in_state_def521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATE_REF_in_state_def524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATE_OBS_in_state_def530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def532 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_FLOW_in_flow_def551 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_requests_in_flow_def553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_flow_type_in_flow_def555 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUESTS_in_requests571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_request_in_requests573 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L});
    public static final BitSet FOLLOW_REQUEST_in_request590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_request592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUEST_in_request599 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_MARK_in_request601 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_request603 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type620 = new BitSet(new long[]{0x0000040000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_flow_operation_in_flow_type623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type625 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_flow_type629 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_if_flow_in_flow_type639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NORMAL_FLOW_in_normal_flow655 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow657 = new BitSet(new long[]{0x0400000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_timed_in_normal_flow659 = new BitSet(new long[]{0x0400000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_flow_point680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RW_NULL_in_flow_point690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_OP_in_flow_operation704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OP_SYNC_in_flow_operation706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_FLOW_in_if_flow721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_if_flow723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_FLOW_TRUE_in_if_flow726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow728 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow730 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_FALSE_in_if_flow735 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow737 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_flow_label759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATTERN_in_pattern_def781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_signature_in_pattern_def785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_pattern_body_in_pattern_def787 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_SIGNATURE_in_pattern_signature818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_pattern_signature820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_PATTERN_PORTS_in_pattern_signature823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_pattern_signature827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_pattern_signature839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature843 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_BODY_in_pattern_body885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_declarations_in_pattern_body887 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_pattern_compositions_in_pattern_body890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations910 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reference_signature_in_declaration947 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_instances_in_declaration949 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_TYPE_in_reference_signature982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_reference_signature984 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_channel_signature_in_reference_signature989 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCES_in_instances1031 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instances1034 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions1077 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions1079 = new BitSet(new long[]{0x0000000000000008L,0x0000000120000000L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions1083 = new BitSet(new long[]{0x0000000000000008L,0x0000000100000000L});
    public static final BitSet FOLLOW_PORT_DEFINITION_in_port_definition1108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_definition1110 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_port_actual_definition_in_port_definition1112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_actual_definition1132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_part_in_port_actual_definition1146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_in_port_access1170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_access1174 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_port_access1178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_OP_in_join_operation1199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_join_operation1201 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_join_part_in_join_operation1203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RW_JOIN_in_join_part1232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_list_in_join_part1234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RW_DECIDE_in_join_part1251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_special_port_access_list_in_join_part1253 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_port_access_list1288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_access_list1291 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_special_port_access_list1331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1334 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_RW_STOCHASTIC_in_stochastic_def1366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stochastic_def1370 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_stochastic_def1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stochastic_list_in_stochastic_def1382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_stoch_elem_in_stochastic_list1401 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_stoch_elem_in_stochastic_list1406 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_STOCH_in_stoch_elem1427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stoch_elem1431 = new BitSet(new long[]{0x0000040000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_stoch_elem1436 = new BitSet(new long[]{0x0000040000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_stoch_val_in_stoch_elem1440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOCH_VAL_in_stoch_val1466 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_stoch_val1468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STOCH_VAL_in_stoch_val1480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_stoch_val1484 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stoch_val1488 = new BitSet(new long[]{0x0000000000000008L});

}