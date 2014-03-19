// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g 2014-03-19 15:21:13

	package pt.uminho.di.reolang;
	
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import pt.uminho.di.cp.model.*;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.reolang.parsing.util.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ReoLangCPModel extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_DECIDE", "RW_JOIN", "RW_AS", "RW_OF", "RW_USE", "RW_IN", "RW_NULL", "RW_PATTERN", "RW_EXTENDS", "RW_FLOW", "RW_TO", "RW_OBSERVERS", "RW_STATE", "RW_CHANNEL", "RW_IMPORT", "RW_STOCHASTIC", "LIST_OPEN", "LIST_CLOSE", "EQUALS", "SEMICOLON", "COMMA", "COLON", "PORTS_OPEN", "PORTS_CLOSE", "BODY_OPEN", "BODY_CLOSE", "ACCESS_MARK", "QUESTION_MARK", "NOT_MARK", "ARROW_MARK", "LABEL_MARK", "STRUCTURE_MARK", "TIME_MARK", "OP_SYNC", "COND_OPEN", "COND_CLOSE", "STRING", "FILE_PATH", "ID", "INT", "FLOAT", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "REO_LANG", "ELEMENT", "DIRECTIVE", "IMPORT", "CHANNEL", "SIGNATURE", "OPTION", "TIMED", "TIME", "STRUCTURED", "DIMENSION", "CHANNEL_PORTS", "IN_PORTS", "OUT_PORTS", "PORT", "CONDITION", "COND_ELEMENTS", "EXTENSION", "CHANNEL_BODY", "FLOWS", "CHANNEL_STATE", "STATE_REF", "STATE_OBS", "FLOW", "REQUESTS", "REQUEST", "FLOW_TYPE", "NORMAL_FLOW", "FLOW_POINT", "FLOW_OP", "IF_FLOW", "FLOW_TRUE", "FLOW_FALSE", "PATTERN", "PATTERN_SIGNATURE", "PATTERN_PORTS", "PATTERN_BODY", "PATTERN_DECLARATIONS", "DECLARATION", "INSTANCES", "DECLARATION_TYPE", "PATTERN_COMPOSITIONS", "PORT_DEFINITION", "PORT_ACTUAL_DEFINITION", "PORT_ACCESS", "JOIN_OP", "PORT_ACCESS_LIST", "STOCH"
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


        public ReoLangCPModel(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public ReoLangCPModel(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ReoLangCPModel.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g"; }



    	private LinkedHashMap<String, CPModelInternal> patterns;
    	public LinkedHashMap<String, CPModelInternal> getPatterns() {return patterns;}
    	public void setPatterns(LinkedHashMap<String, CPModelInternal> p) {patterns = p;}

    	private LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Double>>> stoch_instances;
    	public LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Double>>> getStochInstances() {return stoch_instances;}
    	public void setStochInstances(LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Double>>> p) {stoch_instances = p;}
    	
    	
    	public static class CPModelInternal {
    		private ArrayList<String> in_ports;
    		private ArrayList<String> out_ports;
    		private CoordinationPattern cp;
    		
    		public ArrayList<String> getInPorts() {return in_ports;}
    		public ArrayList<String> getOutPorts() {return out_ports;}
    		public CoordinationPattern getCP() {return cp;}
    		public void setInPorts(ArrayList<String> p) {in_ports = p;}
    		public void setOutPorts(ArrayList<String> p) {out_ports = p;}
    		public void setCP(CoordinationPattern p) {cp = p;}
    		
    		public String toString(){return cp.toString();}
    	}


    protected static class reolang_scope {
        SymbolsTable global_table;
    }
    protected Stack reolang_stack = new Stack();


    // $ANTLR start "reolang"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:53:1: reolang[String file, LinkedHashMap<String, ReoLangCPModel.CPModelInternal> ps, LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Double>>> is, SymbolsTable symbols] : ^( REO_LANG ( directive_def )* ( element )* ) ;
    public final void reolang(String file, LinkedHashMap<String, ReoLangCPModel.CPModelInternal> ps, LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Double>>> is, SymbolsTable symbols) throws RecognitionException {
        reolang_stack.push(new reolang_scope());

        	((reolang_scope)reolang_stack.peek()).global_table = symbols;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:60:2: ( ^( REO_LANG ( directive_def )* ( element )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:60:4: ^( REO_LANG ( directive_def )* ( element )* )
            {
            match(input,REO_LANG,FOLLOW_REO_LANG_in_reolang61); 


            		this.patterns = ps==null? new LinkedHashMap<String, ReoLangCPModel.CPModelInternal>() : ps;
            		this.stoch_instances = is==null? new LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap<String, Double>>>() : is;
            	

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:65:3: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==DIRECTIVE) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:65:3: directive_def
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

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:65:18: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==ELEMENT) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:65:18: element
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:68:1: element : ( ^( ELEMENT channel_def ) | ^( ELEMENT pattern_def ) | ^( ELEMENT stochastic_def ) );
    public final void element() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:69:2: ( ^( ELEMENT channel_def ) | ^( ELEMENT pattern_def ) | ^( ELEMENT stochastic_def ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ELEMENT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case RW_STOCHASTIC:
                        {
                        alt3=3;
                        }
                        break;
                    case CHANNEL:
                        {
                        alt3=1;
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:69:4: ^( ELEMENT channel_def )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:70:4: ^( ELEMENT pattern_def )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:71:4: ^( ELEMENT stochastic_def )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:78:1: directive_def : ^( DIRECTIVE directive_import ) ;
    public final void directive_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:79:2: ( ^( DIRECTIVE directive_import ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:79:4: ^( DIRECTIVE directive_import )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:83:1: directive_import : ^( IMPORT FILE_PATH ) ;
    public final void directive_import() throws RecognitionException {
        CommonTree FILE_PATH1=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:84:2: ( ^( IMPORT FILE_PATH ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:84:4: ^( IMPORT FILE_PATH )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import141); 

            match(input, Token.DOWN, null); 
            FILE_PATH1=(CommonTree)match(input,FILE_PATH,FOLLOW_FILE_PATH_in_directive_import143); 

            match(input, Token.UP, null); 

            		String file_string = (FILE_PATH1!=null?FILE_PATH1.getText():null);
            		String file = file_string.substring(1,file_string.length()-1);
            		CPBuilder cp_model_builder = new CPBuilder(file);
            		ReoLangCPModel res = cp_model_builder.performModelConstruction(this.patterns, this.stoch_instances, ((reolang_scope)reolang_stack.peek()).global_table);
            		this.patterns = res.getPatterns() != null ? res.getPatterns() : this.patterns;
            		this.stoch_instances = res.getStochInstances()!= null ? res.getStochInstances() : this.stoch_instances;
            	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:106:1: channel_def : ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body ) ;
    public final void channel_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:107:2: ( ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:107:5: ^( CHANNEL channel_signature[InspectionMode.DECLARATION] ( extension )? channel_body )
            {
            match(input,CHANNEL,FOLLOW_CHANNEL_in_channel_def172); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_channel_signature_in_channel_def174);
            channel_signature(InspectionMode.DECLARATION);

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:107:61: ( extension )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EXTENSION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:107:61: extension
                    {
                    pushFollow(FOLLOW_extension_in_channel_def177);
                    extension();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_channel_body_in_channel_def180);
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
        public ArrayList<String> o_ins;
        public ArrayList<String> o_outs;
    };

    // $ANTLR start "channel_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:112:1: channel_signature[InspectionMode mode] returns [String o_name, int o_dim, ArrayList<String> o_ins, ArrayList<String> o_outs] : ^( SIGNATURE id1= ID (o= option )? ^( CHANNEL_PORTS ( ^( IN_PORTS p1= ports ) )? ( ^( OUT_PORTS p2= ports ) )? ) ( ^( CONDITION ID condition ) )? ) ;
    public final ReoLangCPModel.channel_signature_return channel_signature(InspectionMode mode) throws RecognitionException {
        ReoLangCPModel.channel_signature_return retval = new ReoLangCPModel.channel_signature_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        int o = 0;

        ArrayList<String> p1 = null;

        ArrayList<String> p2 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:2: ( ^( SIGNATURE id1= ID (o= option )? ^( CHANNEL_PORTS ( ^( IN_PORTS p1= ports ) )? ( ^( OUT_PORTS p2= ports ) )? ) ( ^( CONDITION ID condition ) )? ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:5: ^( SIGNATURE id1= ID (o= option )? ^( CHANNEL_PORTS ( ^( IN_PORTS p1= ports ) )? ( ^( OUT_PORTS p2= ports ) )? ) ( ^( CONDITION ID condition ) )? )
            {
            match(input,SIGNATURE,FOLLOW_SIGNATURE_in_channel_signature204); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_channel_signature208); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:25: (o= option )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==OPTION) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:25: o= option
                    {
                    pushFollow(FOLLOW_option_in_channel_signature212);
                    o=option();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CHANNEL_PORTS,FOLLOW_CHANNEL_PORTS_in_channel_signature216); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:50: ( ^( IN_PORTS p1= ports ) )?
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IN_PORTS) ) {
                    alt6=1;
                }
                switch (alt6) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:51: ^( IN_PORTS p1= ports )
                        {
                        match(input,IN_PORTS,FOLLOW_IN_PORTS_in_channel_signature220); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_channel_signature224);
                        p1=ports();

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:74: ( ^( OUT_PORTS p2= ports ) )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==OUT_PORTS) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:75: ^( OUT_PORTS p2= ports )
                        {
                        match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_channel_signature231); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_channel_signature235);
                        p2=ports();

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:100: ( ^( CONDITION ID condition ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CONDITION) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:113:101: ^( CONDITION ID condition )
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
            		retval.o_ins = p1 != null ? p1 : new ArrayList<String>(0);
            		retval.o_outs = p2 != null ? p2 : new ArrayList<String>(0);
            	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:125:1: option returns [int dim] : ( ^( OPTION timed ) | ^( OPTION structured ) );
    public final int option() throws RecognitionException {
        int dim = 0;

        int structured2 = 0;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:126:2: ( ^( OPTION timed ) | ^( OPTION structured ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:126:4: ^( OPTION timed )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:127:4: ^( OPTION structured )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:131:1: timed : ^( TIMED time ) ;
    public final void timed() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:132:2: ( ^( TIMED time ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:132:5: ^( TIMED time )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:136:1: time : ( ^( TIME ID ) | ^( TIME INT ) );
    public final void time() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:137:2: ( ^( TIME ID ) | ^( TIME INT ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:137:5: ^( TIME ID )
                    {
                    match(input,TIME,FOLLOW_TIME_in_time324); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_time326); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:138:5: ^( TIME INT )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:142:1: structured returns [int dim] : ^( STRUCTURED ( structure_dimension )+ ) ;
    public final int structured() throws RecognitionException {
        int dim = 0;

        int structure_dimension3 = 0;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:143:2: ( ^( STRUCTURED ( structure_dimension )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:143:5: ^( STRUCTURED ( structure_dimension )+ )
            {
            match(input,STRUCTURED,FOLLOW_STRUCTURED_in_structured356); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:143:18: ( structure_dimension )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:143:18: structure_dimension
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:152:1: structure_dimension returns [int dim] : ( ^( DIMENSION ID ) | ^( DIMENSION INT ) );
    public final int structure_dimension() throws RecognitionException {
        int dim = 0;

        CommonTree INT4=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:153:2: ( ^( DIMENSION ID ) | ^( DIMENSION INT ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:153:4: ^( DIMENSION ID )
                    {
                    match(input,DIMENSION,FOLLOW_DIMENSION_in_structure_dimension385); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_structure_dimension387); 
                    dim = 0;

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:154:5: ^( DIMENSION INT )
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:158:1: ports returns [ArrayList<String> o_ports] : ^( PORT ( ID )+ ) ;
    public final ArrayList<String> ports() throws RecognitionException {
        ArrayList<String> o_ports = null;

        CommonTree ID5=null;


        	ArrayList<String> _ports = new ArrayList<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:162:2: ( ^( PORT ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:162:5: ^( PORT ( ID )+ )
            {
            match(input,PORT,FOLLOW_PORT_in_ports425); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:162:12: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:162:13: ID
            	    {
            	    ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_ports428); 

            	    		_ports.add((ID5!=null?ID5.getText():null));
            	    	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:174:1: condition : ^( COND_ELEMENTS ( ID )+ ) ;
    public final void condition() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:175:2: ( ^( COND_ELEMENTS ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:175:5: ^( COND_ELEMENTS ( ID )+ )
            {
            match(input,COND_ELEMENTS,FOLLOW_COND_ELEMENTS_in_condition456); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:175:21: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:175:21: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_condition458); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:179:1: extension : ^( EXTENSION ID ) ;
    public final void extension() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:180:2: ( ^( EXTENSION ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:180:5: ^( EXTENSION ID )
            {
            match(input,EXTENSION,FOLLOW_EXTENSION_in_extension475); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_extension477); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:184:1: channel_body : ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) ;
    public final void channel_body() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:185:2: ( ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:185:4: ^( CHANNEL_BODY ( state_def )? ^( FLOWS ( flow_def )+ ) )
            {
            match(input,CHANNEL_BODY,FOLLOW_CHANNEL_BODY_in_channel_body492); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:185:19: ( state_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CHANNEL_STATE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:185:19: state_def
                    {
                    pushFollow(FOLLOW_state_def_in_channel_body494);
                    state_def();

                    state._fsp--;


                    }
                    break;

            }

            match(input,FLOWS,FOLLOW_FLOWS_in_channel_body499); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:185:39: ( flow_def )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:185:39: flow_def
            	    {
            	    pushFollow(FOLLOW_flow_def_in_channel_body501);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:189:1: state_def : ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) ;
    public final void state_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:190:2: ( ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:190:5: ^( CHANNEL_STATE ^( STATE_REF ID ) ^( STATE_OBS ( ID )+ ) )
            {
            match(input,CHANNEL_STATE,FOLLOW_CHANNEL_STATE_in_state_def519); 

            match(input, Token.DOWN, null); 
            match(input,STATE_REF,FOLLOW_STATE_REF_in_state_def522); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_state_def524); 

            match(input, Token.UP, null); 
            match(input,STATE_OBS,FOLLOW_STATE_OBS_in_state_def528); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:190:49: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:190:49: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_state_def530); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:194:1: flow_def : ^( FLOW requests flow_type ) ;
    public final void flow_def() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:195:2: ( ^( FLOW requests flow_type ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:195:5: ^( FLOW requests flow_type )
            {
            match(input,FLOW,FOLLOW_FLOW_in_flow_def549); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_requests_in_flow_def551);
            requests();

            state._fsp--;

            pushFollow(FOLLOW_flow_type_in_flow_def553);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:200:1: requests : ^( REQUESTS ( request )+ ) ;
    public final void requests() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:201:2: ( ^( REQUESTS ( request )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:201:4: ^( REQUESTS ( request )+ )
            {
            match(input,REQUESTS,FOLLOW_REQUESTS_in_requests569); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:201:15: ( request )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:201:15: request
            	    {
            	    pushFollow(FOLLOW_request_in_requests571);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:205:1: request : ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) );
    public final void request() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:206:2: ( ^( REQUEST ID ) | ^( REQUEST NOT_MARK ID ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:206:4: ^( REQUEST ID )
                    {
                    match(input,REQUEST,FOLLOW_REQUEST_in_request588); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_request590); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:207:4: ^( REQUEST NOT_MARK ID )
                    {
                    match(input,REQUEST,FOLLOW_REQUEST_in_request597); 

                    match(input, Token.DOWN, null); 
                    match(input,NOT_MARK,FOLLOW_NOT_MARK_in_request599); 
                    match(input,ID,FOLLOW_ID_in_request601); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:211:1: flow_type : ( ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | ^( FLOW_TYPE if_flow ) );
    public final void flow_type() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:212:2: ( ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? ) | ^( FLOW_TYPE if_flow ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:212:4: ^( FLOW_TYPE normal_flow ( flow_operation normal_flow )? ( flow_label )? )
                    {
                    match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type616); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_normal_flow_in_flow_type618);
                    normal_flow();

                    state._fsp--;

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:212:28: ( flow_operation normal_flow )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==FLOW_OP) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:212:29: flow_operation normal_flow
                            {
                            pushFollow(FOLLOW_flow_operation_in_flow_type621);
                            flow_operation();

                            state._fsp--;

                            pushFollow(FOLLOW_normal_flow_in_flow_type623);
                            normal_flow();

                            state._fsp--;


                            }
                            break;

                    }

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:212:58: ( flow_label )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:212:58: flow_label
                            {
                            pushFollow(FOLLOW_flow_label_in_flow_type627);
                            flow_label();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:213:4: ^( FLOW_TYPE if_flow )
                    {
                    match(input,FLOW_TYPE,FOLLOW_FLOW_TYPE_in_flow_type635); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_if_flow_in_flow_type637);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:217:1: normal_flow : ^( NORMAL_FLOW flow_point ( timed )? flow_point ) ;
    public final void normal_flow() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:218:2: ( ^( NORMAL_FLOW flow_point ( timed )? flow_point ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:218:5: ^( NORMAL_FLOW flow_point ( timed )? flow_point )
            {
            match(input,NORMAL_FLOW,FOLLOW_NORMAL_FLOW_in_normal_flow653); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_point_in_normal_flow655);
            flow_point();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:218:30: ( timed )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==TIMED) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:218:30: timed
                    {
                    pushFollow(FOLLOW_timed_in_normal_flow657);
                    timed();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_flow_point_in_normal_flow660);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:222:1: flow_point : ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) );
    public final void flow_point() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:223:2: ( ^( FLOW_POINT ID ) | ^( FLOW_POINT RW_NULL ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:223:4: ^( FLOW_POINT ID )
                    {
                    match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point676); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_flow_point678); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:224:5: ^( FLOW_POINT RW_NULL )
                    {
                    match(input,FLOW_POINT,FOLLOW_FLOW_POINT_in_flow_point686); 

                    match(input, Token.DOWN, null); 
                    match(input,RW_NULL,FOLLOW_RW_NULL_in_flow_point688); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:227:1: flow_operation : ^( FLOW_OP OP_SYNC ) ;
    public final void flow_operation() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:228:2: ( ^( FLOW_OP OP_SYNC ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:228:5: ^( FLOW_OP OP_SYNC )
            {
            match(input,FLOW_OP,FOLLOW_FLOW_OP_in_flow_operation702); 

            match(input, Token.DOWN, null); 
            match(input,OP_SYNC,FOLLOW_OP_SYNC_in_flow_operation704); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:232:1: if_flow : ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) ) ;
    public final void if_flow() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:233:2: ( ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:233:4: ^( IF_FLOW ID ^( FLOW_TRUE flow_type ( flow_label )? ) ^( FLOW_FALSE flow_type ( flow_label )? ) )
            {
            match(input,IF_FLOW,FOLLOW_IF_FLOW_in_if_flow719); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_if_flow721); 
            match(input,FLOW_TRUE,FOLLOW_FLOW_TRUE_in_if_flow724); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_type_in_if_flow726);
            flow_type();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:233:39: ( flow_label )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:233:39: flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow728);
                    flow_label();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 
            match(input,FLOW_FALSE,FOLLOW_FLOW_FALSE_in_if_flow733); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_flow_type_in_if_flow735);
            flow_type();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:233:75: ( flow_label )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:233:75: flow_label
                    {
                    pushFollow(FOLLOW_flow_label_in_if_flow737);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:238:1: flow_label : ID ;
    public final void flow_label() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:239:2: ( ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:239:5: ID
            {
            match(input,ID,FOLLOW_ID_in_flow_label757); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:252:1: pattern_def : ^( PATTERN ps= pattern_signature pattern_body[$ps.o_name] ) ;
    public final void pattern_def() throws RecognitionException {
        String ps = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:253:2: ( ^( PATTERN ps= pattern_signature pattern_body[$ps.o_name] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:253:4: ^( PATTERN ps= pattern_signature pattern_body[$ps.o_name] )
            {
            match(input,PATTERN,FOLLOW_PATTERN_in_pattern_def779); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pattern_signature_in_pattern_def783);
            ps=pattern_signature();

            state._fsp--;

            pushFollow(FOLLOW_pattern_body_in_pattern_def785);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:261:1: pattern_signature returns [String o_name] : ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS p1= ports ) )? ( ^( OUT_PORTS p2= ports ) )? ) ) ;
    public final String pattern_signature() throws RecognitionException {
        String o_name = null;

        CommonTree ID6=null;
        ArrayList<String> p1 = null;

        ArrayList<String> p2 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:262:2: ( ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS p1= ports ) )? ( ^( OUT_PORTS p2= ports ) )? ) ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:262:5: ^( PATTERN_SIGNATURE ID ^( PATTERN_PORTS ( ^( IN_PORTS p1= ports ) )? ( ^( OUT_PORTS p2= ports ) )? ) )
            {
            match(input,PATTERN_SIGNATURE,FOLLOW_PATTERN_SIGNATURE_in_pattern_signature816); 

            match(input, Token.DOWN, null); 
            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_pattern_signature818); 
            match(input,PATTERN_PORTS,FOLLOW_PATTERN_PORTS_in_pattern_signature821); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:262:44: ( ^( IN_PORTS p1= ports ) )?
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IN_PORTS) ) {
                    alt27=1;
                }
                switch (alt27) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:262:45: ^( IN_PORTS p1= ports )
                        {
                        match(input,IN_PORTS,FOLLOW_IN_PORTS_in_pattern_signature825); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_pattern_signature829);
                        p1=ports();

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }

                // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:262:68: ( ^( OUT_PORTS p2= ports ) )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OUT_PORTS) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:262:69: ^( OUT_PORTS p2= ports )
                        {
                        match(input,OUT_PORTS,FOLLOW_OUT_PORTS_in_pattern_signature836); 

                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_ports_in_pattern_signature840);
                        p2=ports();

                        state._fsp--;


                        match(input, Token.UP, null); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            	
            		o_name = (ID6!=null?ID6.getText():null);
            		
            		CPModelInternal cpmi = new CPModelInternal();
            		cpmi.setInPorts(p1 !=null ? p1 : new ArrayList<String>(0));
            		cpmi.setOutPorts(p2 !=null ? p2 : new ArrayList<String>(0));
            		cpmi.setCP(new CoordinationPattern((ID6!=null?ID6.getText():null)));
            		this.patterns.put((ID6!=null?ID6.getText():null),cpmi);
            	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:282:1: pattern_body[String patt_name] : ^( PATTERN_BODY pattern_declarations[$pattern_body.patt_name] pattern_compositions[$pattern_body.patt_name] ) ;
    public final void pattern_body(String patt_name) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:283:2: ( ^( PATTERN_BODY pattern_declarations[$pattern_body.patt_name] pattern_compositions[$pattern_body.patt_name] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:283:5: ^( PATTERN_BODY pattern_declarations[$pattern_body.patt_name] pattern_compositions[$pattern_body.patt_name] )
            {
            match(input,PATTERN_BODY,FOLLOW_PATTERN_BODY_in_pattern_body881); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_pattern_declarations_in_pattern_body883);
            pattern_declarations(patt_name);

            state._fsp--;

            pushFollow(FOLLOW_pattern_compositions_in_pattern_body886);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:286:1: pattern_declarations[String patt_name] : ^( PATTERN_DECLARATIONS ( declaration[$pattern_declarations.patt_name] )+ ) ;
    public final void pattern_declarations(String patt_name) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:287:2: ( ^( PATTERN_DECLARATIONS ( declaration[$pattern_declarations.patt_name] )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:287:5: ^( PATTERN_DECLARATIONS ( declaration[$pattern_declarations.patt_name] )+ )
            {
            match(input,PATTERN_DECLARATIONS,FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations904); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:287:28: ( declaration[$pattern_declarations.patt_name] )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:287:28: declaration[$pattern_declarations.patt_name]
            	    {
            	    pushFollow(FOLLOW_declaration_in_pattern_declarations906);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:297:1: declaration[String patt_name] : ^( DECLARATION sig= reference_signature instances[$sig.o_name, $sig.o_type, $sig.o_ins, $sig.o_outs, $declaration.patt_name] ) ;
    public final void declaration(String patt_name) throws RecognitionException {
        ReoLangCPModel.reference_signature_return sig = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:298:2: ( ^( DECLARATION sig= reference_signature instances[$sig.o_name, $sig.o_type, $sig.o_ins, $sig.o_outs, $declaration.patt_name] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:298:5: ^( DECLARATION sig= reference_signature instances[$sig.o_name, $sig.o_type, $sig.o_ins, $sig.o_outs, $declaration.patt_name] )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration939); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reference_signature_in_declaration943);
            sig=reference_signature();

            state._fsp--;

            pushFollow(FOLLOW_instances_in_declaration945);
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
        public ArrayList<String> o_ins;
        public ArrayList<String> o_outs;
    };

    // $ANTLR start "reference_signature"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:308:1: reference_signature returns [String o_name, String o_type, int o_dim, ArrayList<String> o_ins, ArrayList<String> o_outs] : ^( DECLARATION_TYPE ( ID )? cs= channel_signature[InspectionMode.REF_BY_INSTANCE] ) ;
    public final ReoLangCPModel.reference_signature_return reference_signature() throws RecognitionException {
        ReoLangCPModel.reference_signature_return retval = new ReoLangCPModel.reference_signature_return();
        retval.start = input.LT(1);

        CommonTree ID7=null;
        ReoLangCPModel.channel_signature_return cs = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:309:2: ( ^( DECLARATION_TYPE ( ID )? cs= channel_signature[InspectionMode.REF_BY_INSTANCE] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:309:4: ^( DECLARATION_TYPE ( ID )? cs= channel_signature[InspectionMode.REF_BY_INSTANCE] )
            {
            match(input,DECLARATION_TYPE,FOLLOW_DECLARATION_TYPE_in_reference_signature978); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:309:23: ( ID )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:309:23: ID
                    {
                    ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_reference_signature980); 

                    }
                    break;

            }

            pushFollow(FOLLOW_channel_signature_in_reference_signature985);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:329:1: instances[String i_name, String i_type, ArrayList<String> i_ins, ArrayList<String> i_outs, String patt_name] : ^( INSTANCES ( ID )+ ) ;
    public final void instances(String i_name, String i_type, ArrayList<String> i_ins, ArrayList<String> i_outs, String patt_name) throws RecognitionException {
        CommonTree ID8=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:330:2: ( ^( INSTANCES ( ID )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:330:5: ^( INSTANCES ( ID )+ )
            {
            match(input,INSTANCES,FOLLOW_INSTANCES_in_instances1027); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:330:17: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:330:18: ID
            	    {
            	    ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_instances1030); 

            	    		//CHANNELS
            	    		if(! this.patterns.containsKey(i_name)) {
            	    			//if it is a channel then it always has 2 ports
            	    			//lets check the number of in ports and decide how to
            	    			//build the communicationmeans.
            	    			int n_ports = i_ins.size();
            	    			switch(n_ports){
            	    				case 1 : {
            	    					CommunicationMean cm;
            	    					//if($sv.o_values != null && $sv.o_values.size()>0) {
            	    					//	cm = new StochasticCommunicationMean(
            	    					//		i_ins.get(0), (ID8!=null?ID8.getText():null), i_type, i_outs.get(0), new LinkedHashMap<String, Double>($sv.o_values)
            	    					//		);
            	    					//}
            	    					//else {
            	    						cm = new CommunicationMean(
            	    							i_ins.get(0), (ID8!=null?ID8.getText():null), i_type, i_outs.get(0)
            	    							);
            	    					//}
            	    					this.patterns.get(patt_name).getCP().getPattern().add(cm);
            	    				} ; break;
            	    				
            	    				case 2 : {
            	    					CommunicationMean cm1, cm2;
            	    					//if($sv.o_values != null && $sv.o_values.size()>0) {
            	    					//	cm1 = new StochasticCommunicationMean(
            	    					//		i_ins.get(0), (ID8!=null?ID8.getText():null), i_type, "NULL", new LinkedHashMap<String, Double>($sv.o_values)
            	    					//		);
            	    					//	cm2 = new StochasticCommunicationMean(
            	    					//		i_ins.get(1), (ID8!=null?ID8.getText():null), i_type, "NULL", new LinkedHashMap<String, Double>($sv.o_values)
            	    					//		);
            	    					//}
            	    					//else {
            	    						cm1 = new CommunicationMean(
            	    							i_ins.get(0), (ID8!=null?ID8.getText():null), i_type, "NULL"
            	    							);
            	    						cm2 = new CommunicationMean(
            	    							i_ins.get(1), (ID8!=null?ID8.getText():null), i_type, "NULL"
            	    							);
            	    					//}	
            	    					this.patterns.get(patt_name).getCP().getPattern().add(cm1);
            	    					this.patterns.get(patt_name).getCP().getPattern().add(cm2);
            	    				} ; break;
            	    				
            	    				default : {
            	    					CommunicationMean cm1, cm2;
            	    					//if($sv.o_values != null && $sv.o_values.size()>0) {
            	    					//	cm1 = new StochasticCommunicationMean(
            	    					//		"NULL", (ID8!=null?ID8.getText():null), i_type, i_outs.get(0), new LinkedHashMap<String, Double>($sv.o_values)
            	    					//		);
            	    					//	cm2 = new StochasticCommunicationMean(
            	    					//		"NULL", (ID8!=null?ID8.getText():null), i_type, i_outs.get(1), new LinkedHashMap<String, Double>($sv.o_values)
            	    					//		);
            	    					//}
            	    					//else {
            	    						cm1 = new CommunicationMean(
            	    							"NULL", (ID8!=null?ID8.getText():null), i_type,  i_outs.get(0)
            	    							);
            	    						cm2 = new CommunicationMean(
            	    							"NULL", (ID8!=null?ID8.getText():null), i_type,  i_outs.get(1)
            	    							);
            	    					//}	
            	    					this.patterns.get(patt_name).getCP().getPattern().add(cm1);
            	    					this.patterns.get(patt_name).getCP().getPattern().add(cm2);
            	    				} ; break;
            	    			}				
            	    			
            	    			//if($sv.o_values!=null) {$sv.o_values.clear();}
            	    		
            	    		}
            	    		else { //PATTERNS
            	    			CPModelInternal cpmi = this.patterns.get(i_name);
            	    			CoordinationPattern p = new CoordinationPattern(cpmi.getCP());
            	    			for(CommunicationMean cm : p.getPattern() ){
            	    				cm.setInode(cpmi.getInPorts().contains(cm.getInode()) ? 
            	    						(ID8!=null?ID8.getText():null) + "." + i_ins.get(cpmi.getInPorts().indexOf(cm.getInode())) :
            	    						(cm.getInode().equals("NULL")) ? "NULL" : (ID8!=null?ID8.getText():null) + "::" + cm.getInode()
            	    					);
            	    				
            	    				cm.setFnode(cpmi.getOutPorts().contains(cm.getFnode()) ? 
            	    						(ID8!=null?ID8.getText():null) + "." + i_outs.get(cpmi.getOutPorts().indexOf(cm.getFnode())) :
            	    						(cm.getFnode().equals("NULL")) ? "NULL" : (ID8!=null?ID8.getText():null) + "::" + cm.getFnode()
            	    					); 
            	    				cm.setId((ID8!=null?ID8.getText():null) + "::" + cm.getId());
            	    			}
            	    			this.patterns.get(patt_name).getCP().getPattern().addAll(p.getPattern());
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:460:1: pattern_compositions[String patt_name] : ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.patt_name] )+ ( join_operation[$pattern_compositions.patt_name] )* ) ;
    public final void pattern_compositions(String patt_name) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:461:2: ( ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.patt_name] )+ ( join_operation[$pattern_compositions.patt_name] )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:461:6: ^( PATTERN_COMPOSITIONS ( port_definition[$pattern_compositions.patt_name] )+ ( join_operation[$pattern_compositions.patt_name] )* )
            {
            match(input,PATTERN_COMPOSITIONS,FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions1078); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:461:29: ( port_definition[$pattern_compositions.patt_name] )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:461:29: port_definition[$pattern_compositions.patt_name]
            	    {
            	    pushFollow(FOLLOW_port_definition_in_pattern_compositions1080);
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

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:461:79: ( join_operation[$pattern_compositions.patt_name] )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==JOIN_OP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:461:79: join_operation[$pattern_compositions.patt_name]
            	    {
            	    pushFollow(FOLLOW_join_operation_in_pattern_compositions1084);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:467:1: port_definition[String patt_name] : ^( PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text] ) ;
    public final void port_definition(String patt_name) throws RecognitionException {
        CommonTree ID9=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:468:2: ( ^( PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:468:5: ^( PORT_DEFINITION ID port_actual_definition[$port_definition.patt_name, $ID.text] )
            {
            match(input,PORT_DEFINITION,FOLLOW_PORT_DEFINITION_in_port_definition1109); 

            match(input, Token.DOWN, null); 
            ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_port_definition1111); 
            pushFollow(FOLLOW_port_actual_definition_in_port_definition1113);
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:471:1: port_actual_definition[String patt_name, String port] : ( ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name, $port_actual_definition.port, false] ) | ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port] ) );
    public final void port_actual_definition(String patt_name, String port) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:472:2: ( ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name, $port_actual_definition.port, false] ) | ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port] ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==PORT_ACTUAL_DEFINITION) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==DOWN) ) {
                    int LA34_2 = input.LA(3);

                    if ( (LA34_2==PORT_ACCESS) ) {
                        alt34=1;
                    }
                    else if ( ((LA34_2>=RW_DECIDE && LA34_2<=RW_JOIN)) ) {
                        alt34=2;
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:472:5: ^( PORT_ACTUAL_DEFINITION port_access[$port_actual_definition.patt_name, $port_actual_definition.port, false] )
                    {
                    match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1131); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_port_access_in_port_actual_definition1133);
                    port_access(patt_name, port, false);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:473:5: ^( PORT_ACTUAL_DEFINITION join_part[$port_actual_definition.patt_name, $port_actual_definition.port] )
                    {
                    match(input,PORT_ACTUAL_DEFINITION,FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1142); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_join_part_in_port_actual_definition1144);
                    join_part(patt_name, port);

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
    // $ANTLR end "port_actual_definition"


    // $ANTLR start "port_access"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:476:1: port_access[String patt_name, String port, boolean isXOR] : ^( PORT_ACCESS i1= ID i2= ID ) ;
    public final void port_access(String patt_name, String port, boolean isXOR) throws RecognitionException {
        CommonTree i1=null;
        CommonTree i2=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:477:2: ( ^( PORT_ACCESS i1= ID i2= ID ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:477:4: ^( PORT_ACCESS i1= ID i2= ID )
            {
            match(input,PORT_ACCESS,FOLLOW_PORT_ACCESS_in_port_access1160); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access1164); 
            i2=(CommonTree)match(input,ID,FOLLOW_ID_in_port_access1168); 

            		CoordinationPattern p = this.patterns.get(patt_name).getCP();
            		p.replacePortNames((i2!=null?i2.getText():null), (i1!=null?i1.getText():null), port);
            		if(isXOR){
            			p.getRouter_nodes().add(port);
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
    // $ANTLR end "port_access"


    // $ANTLR start "join_operation"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:489:1: join_operation[String patt_name] : ^( JOIN_OP ID join_part[$join_operation.patt_name, $ID.text] ) ;
    public final void join_operation(String patt_name) throws RecognitionException {
        CommonTree ID10=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:490:2: ( ^( JOIN_OP ID join_part[$join_operation.patt_name, $ID.text] ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:490:4: ^( JOIN_OP ID join_part[$join_operation.patt_name, $ID.text] )
            {
            match(input,JOIN_OP,FOLLOW_JOIN_OP_in_join_operation1189); 

            match(input, Token.DOWN, null); 
            ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_join_operation1191); 
            pushFollow(FOLLOW_join_part_in_join_operation1193);
            join_part(patt_name, (ID10!=null?ID10.getText():null));

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
    // $ANTLR end "join_operation"


    // $ANTLR start "join_part"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:493:1: join_part[String patt_name, String port] : ( ^( RW_JOIN port_access_list[$join_part.patt_name, $join_part.port] ) | ^( RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port] ) );
    public final void join_part(String patt_name, String port) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:494:2: ( ^( RW_JOIN port_access_list[$join_part.patt_name, $join_part.port] ) | ^( RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port] ) )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:494:5: ^( RW_JOIN port_access_list[$join_part.patt_name, $join_part.port] )
                    {
                    match(input,RW_JOIN,FOLLOW_RW_JOIN_in_join_part1213); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_port_access_list_in_join_part1215);
                    port_access_list(patt_name, port);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:495:5: ^( RW_DECIDE special_port_access_list[$join_part.patt_name, $join_part.port] )
                    {
                    match(input,RW_DECIDE,FOLLOW_RW_DECIDE_in_join_part1225); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_special_port_access_list_in_join_part1227);
                    special_port_access_list(patt_name, port);

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
    // $ANTLR end "join_part"


    // $ANTLR start "port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:499:1: port_access_list[String patt_name, String port] : ^( PORT_ACCESS_LIST ( port_access[$port_access_list.patt_name, $port_access_list.port, false] )+ ) ;
    public final void port_access_list(String patt_name, String port) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:500:2: ( ^( PORT_ACCESS_LIST ( port_access[$port_access_list.patt_name, $port_access_list.port, false] )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:500:4: ^( PORT_ACCESS_LIST ( port_access[$port_access_list.patt_name, $port_access_list.port, false] )+ )
            {
            match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_port_access_list1249); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:500:23: ( port_access[$port_access_list.patt_name, $port_access_list.port, false] )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:500:23: port_access[$port_access_list.patt_name, $port_access_list.port, false]
            	    {
            	    pushFollow(FOLLOW_port_access_in_port_access_list1251);
            	    port_access(patt_name, port, false);

            	    state._fsp--;


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
    // $ANTLR end "port_access_list"


    // $ANTLR start "special_port_access_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:505:1: special_port_access_list[String patt_name, String port] : ^( PORT_ACCESS_LIST ( port_access[$special_port_access_list.patt_name, $special_port_access_list.port, true] )+ ) ;
    public final void special_port_access_list(String patt_name, String port) throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:506:2: ( ^( PORT_ACCESS_LIST ( port_access[$special_port_access_list.patt_name, $special_port_access_list.port, true] )+ ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:506:4: ^( PORT_ACCESS_LIST ( port_access[$special_port_access_list.patt_name, $special_port_access_list.port, true] )+ )
            {
            match(input,PORT_ACCESS_LIST,FOLLOW_PORT_ACCESS_LIST_in_special_port_access_list1273); 

            match(input, Token.DOWN, null); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:506:23: ( port_access[$special_port_access_list.patt_name, $special_port_access_list.port, true] )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:506:23: port_access[$special_port_access_list.patt_name, $special_port_access_list.port, true]
            	    {
            	    pushFollow(FOLLOW_port_access_in_special_port_access_list1275);
            	    port_access(patt_name, port, true);

            	    state._fsp--;


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
    // $ANTLR end "special_port_access_list"


    // $ANTLR start "stochastic_def"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:513:1: stochastic_def : ^( RW_STOCHASTIC i1= ID i2= ID stochastic_list ) ;
    public final void stochastic_def() throws RecognitionException {
        CommonTree i1=null;
        CommonTree i2=null;
        LinkedHashMap<String, Double> stochastic_list11 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:514:2: ( ^( RW_STOCHASTIC i1= ID i2= ID stochastic_list ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:514:4: ^( RW_STOCHASTIC i1= ID i2= ID stochastic_list )
            {
            match(input,RW_STOCHASTIC,FOLLOW_RW_STOCHASTIC_in_stochastic_def1295); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_stochastic_def1299); 
            i2=(CommonTree)match(input,ID,FOLLOW_ID_in_stochastic_def1303); 
            pushFollow(FOLLOW_stochastic_list_in_stochastic_def1305);
            stochastic_list11=stochastic_list();

            state._fsp--;


            		String patt_name = (i1!=null?i1.getText():null);
            		String inst_name = (i2!=null?i2.getText():null);
            		if(this.stoch_instances.containsKey(patt_name)){
            			this.stoch_instances.get(patt_name).put(inst_name, stochastic_list11);	
            		}
            		else {
            			this.stoch_instances.put(patt_name, new LinkedHashMap<String, LinkedHashMap<String, Double>>() );
            			this.stoch_instances.get(patt_name).put(inst_name, stochastic_list11);
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
    // $ANTLR end "stochastic_def"


    // $ANTLR start "stochastic_list"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:529:1: stochastic_list returns [LinkedHashMap<String, Double> o_values] : (a= stoch_elem[stoch_map] (b= stoch_elem[$a.o_stoch_map] )* ) ;
    public final LinkedHashMap<String, Double> stochastic_list() throws RecognitionException {
        LinkedHashMap<String, Double> o_values = null;

        LinkedHashMap<String, Double> a = null;

        LinkedHashMap<String, Double> b = null;



        	LinkedHashMap<String, Double> stoch_map = new LinkedHashMap<String, Double>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:533:2: ( (a= stoch_elem[stoch_map] (b= stoch_elem[$a.o_stoch_map] )* ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:533:4: (a= stoch_elem[stoch_map] (b= stoch_elem[$a.o_stoch_map] )* )
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:533:4: (a= stoch_elem[stoch_map] (b= stoch_elem[$a.o_stoch_map] )* )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:533:6: a= stoch_elem[stoch_map] (b= stoch_elem[$a.o_stoch_map] )*
            {
            pushFollow(FOLLOW_stoch_elem_in_stochastic_list1335);
            a=stoch_elem(stoch_map);

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:533:30: (b= stoch_elem[$a.o_stoch_map] )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==STOCH) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:533:32: b= stoch_elem[$a.o_stoch_map]
            	    {
            	    pushFollow(FOLLOW_stoch_elem_in_stochastic_list1342);
            	    b=stoch_elem(a);

            	    state._fsp--;

            	    a = b ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            		o_values = stoch_map;
            		//TODO : complete with undefined stochastic values...
            	

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return o_values;
    }
    // $ANTLR end "stochastic_list"


    // $ANTLR start "stoch_elem"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:545:1: stoch_elem[LinkedHashMap<String, Double> i_stoch_map] returns [LinkedHashMap<String, Double> o_stoch_map] : ^( STOCH i1= ID (i2= ID )? FLOAT ) ;
    public final LinkedHashMap<String, Double> stoch_elem(LinkedHashMap<String, Double> i_stoch_map) throws RecognitionException {
        LinkedHashMap<String, Double> o_stoch_map = null;

        CommonTree i1=null;
        CommonTree i2=null;
        CommonTree FLOAT12=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:546:2: ( ^( STOCH i1= ID (i2= ID )? FLOAT ) )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:546:4: ^( STOCH i1= ID (i2= ID )? FLOAT )
            {
            match(input,STOCH,FOLLOW_STOCH_in_stoch_elem1376); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_stoch_elem1380); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:546:18: (i2= ID )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/ReoLang/ReoLangSpecs/ReoLangCPModel.g:546:19: i2= ID
                    {
                    i2=(CommonTree)match(input,ID,FOLLOW_ID_in_stoch_elem1385); 

                    }
                    break;

            }

            FLOAT12=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_stoch_elem1389); 

            		o_stoch_map = i_stoch_map;
            		o_stoch_map.put(i2==null? (i1!=null?i1.getText():null) : i1+"#"+(i2!=null?i2.getText():null), Double.parseDouble((FLOAT12!=null?FLOAT12.getText():null)) );
            		
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return o_stoch_map;
    }
    // $ANTLR end "stoch_elem"

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
    public static final BitSet FOLLOW_CHANNEL_in_channel_def172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_channel_signature_in_channel_def174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_extension_in_channel_def177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_channel_body_in_channel_def180 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNATURE_in_channel_signature204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_channel_signature208 = new BitSet(new long[]{0x4200000000000000L});
    public static final BitSet FOLLOW_option_in_channel_signature212 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_CHANNEL_PORTS_in_channel_signature216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_channel_signature220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_channel_signature231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_channel_signature235 = new BitSet(new long[]{0x0000000000000008L});
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
    public static final BitSet FOLLOW_PORT_in_ports425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ports428 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_COND_ELEMENTS_in_condition456 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_condition458 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_EXTENSION_in_extension475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_extension477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CHANNEL_BODY_in_channel_body492 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_state_def_in_channel_body494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FLOWS_in_channel_body499 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_def_in_channel_body501 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_CHANNEL_STATE_in_state_def519 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATE_REF_in_state_def522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATE_OBS_in_state_def528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_state_def530 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_FLOW_in_flow_def549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_requests_in_flow_def551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_flow_type_in_flow_def553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUESTS_in_requests569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_request_in_requests571 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L});
    public static final BitSet FOLLOW_REQUEST_in_request588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_request590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUEST_in_request597 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NOT_MARK_in_request599 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_request601 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type616 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type618 = new BitSet(new long[]{0x0000040000000008L,0x0000000000010000L});
    public static final BitSet FOLLOW_flow_operation_in_flow_type621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_normal_flow_in_flow_type623 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_flow_type627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_TYPE_in_flow_type635 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_if_flow_in_flow_type637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NORMAL_FLOW_in_normal_flow653 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow655 = new BitSet(new long[]{0x0400000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_timed_in_normal_flow657 = new BitSet(new long[]{0x0400000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_flow_point_in_normal_flow660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_flow_point678 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_POINT_in_flow_point686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_RW_NULL_in_flow_point688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_OP_in_flow_operation702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OP_SYNC_in_flow_operation704 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_FLOW_in_if_flow719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_if_flow721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_FLOW_TRUE_in_if_flow724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow726 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow728 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FLOW_FALSE_in_if_flow733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_flow_type_in_if_flow735 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_flow_label_in_if_flow737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_flow_label757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PATTERN_in_pattern_def779 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_signature_in_pattern_def783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_pattern_body_in_pattern_def785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_SIGNATURE_in_pattern_signature816 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_pattern_signature818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_PATTERN_PORTS_in_pattern_signature821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_PORTS_in_pattern_signature825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature829 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_PORTS_in_pattern_signature836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ports_in_pattern_signature840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_BODY_in_pattern_body881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pattern_declarations_in_pattern_body883 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_pattern_compositions_in_pattern_body886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_DECLARATIONS_in_pattern_declarations904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_pattern_declarations906 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reference_signature_in_declaration943 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_instances_in_declaration945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_TYPE_in_reference_signature978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_reference_signature980 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_channel_signature_in_reference_signature985 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCES_in_instances1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_instances1030 = new BitSet(new long[]{0x0000040000000008L});
    public static final BitSet FOLLOW_PATTERN_COMPOSITIONS_in_pattern_compositions1078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_definition_in_pattern_compositions1080 = new BitSet(new long[]{0x0000000000000008L,0x0000000120000000L});
    public static final BitSet FOLLOW_join_operation_in_pattern_compositions1084 = new BitSet(new long[]{0x0000000000000008L,0x0000000100000000L});
    public static final BitSet FOLLOW_PORT_DEFINITION_in_port_definition1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_definition1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_port_actual_definition_in_port_definition1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_actual_definition1133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACTUAL_DEFINITION_in_port_actual_definition1142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_join_part_in_port_actual_definition1144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_in_port_access1160 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_port_access1164 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_port_access1168 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_OP_in_join_operation1189 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_join_operation1191 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_join_part_in_join_operation1193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RW_JOIN_in_join_part1213 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_list_in_join_part1215 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RW_DECIDE_in_join_part1225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_special_port_access_list_in_join_part1227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_port_access_list1249 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_port_access_list1251 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_PORT_ACCESS_LIST_in_special_port_access_list1273 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_port_access_in_special_port_access_list1275 = new BitSet(new long[]{0x0000000000000008L,0x0000000080000000L});
    public static final BitSet FOLLOW_RW_STOCHASTIC_in_stochastic_def1295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stochastic_def1299 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_stochastic_def1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_stochastic_list_in_stochastic_def1305 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_stoch_elem_in_stochastic_list1335 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_stoch_elem_in_stochastic_list1342 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_STOCH_in_stoch_elem1376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_stoch_elem1380 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_ID_in_stoch_elem1385 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FLOAT_in_stoch_elem1389 = new BitSet(new long[]{0x0000000000000008L});

}