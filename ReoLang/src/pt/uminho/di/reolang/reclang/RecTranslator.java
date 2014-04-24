// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g 2014-04-25 00:02:26

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.reolang.reclang.PkgConstants;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class RecTranslator extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_XOR", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_ENDS", "OP_NODES", "OP_NAMES", "OP_CHANNELS", "OP_READ", "OP_WRITE", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", "CONS_SET", "CONS_NODE", "CONS_XOR", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "ARGUMENTS", "ARGUMENT", "SUBTYPE", "INSTRUCTIONS", "DECLARATION", "ASSIGNMENT", "FORALL", "TRIPLE", "PAIR", "SET", "NODE", "XOR", "IN", "OUT", "ACCESS", "STRUCTURE", "APPLICATION", "SIGNATURE"
    };
    public static final int OP_NODES=30;
    public static final int CONS_PAIR=55;
    public static final int SEP_OPTIONAL=47;
    public static final int CONS_NODE=58;
    public static final int APPLICATION=88;
    public static final int SEP_SUBTYPE_END=52;
    public static final int SEP_COLON=44;
    public static final int OP_TRD=25;
    public static final int OCTAL_ESC=68;
    public static final int OP_JOIN=16;
    public static final int DT_PAIR=13;
    public static final int ID=60;
    public static final int OP_INTERSECTION=37;
    public static final int SUBTYPE=74;
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
    public static final int OP_OUT=27;
    public static final int OP_SPLIT=17;
    public static final int SEP_STRUCTURE=54;
    public static final int CONS_SET=57;
    public static final int XOR=83;
    public static final int OP_NAMES=31;
    public static final int ARGUMENTS=72;
    public static final int NODE=82;
    public static final int SEP_COMMA=42;
    public static final int DT_TRIPLE=14;
    public static final int SEP_ARGS_START=45;
    public static final int OP_UPDATE=22;
    public static final int SEP_BLOCK_START=40;
    public static final int UNICODE_ESC=67;
    public static final int OP_REMOVE=18;
    public static final int OP_PAR=15;
    public static final int FORALL=78;
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
    public static final int OP_CHANNELS=32;
    public static final int OUT=85;
    public static final int CONS_TRIPLE=56;
    public static final int SEP_SUBTYPE_START=51;
    public static final int SEP_SEMICOLON=43;
    public static final int SEP_BLOCK_END=41;
    public static final int OP_CONST=19;
    public static final int DT_PATTERN=7;
    public static final int OP_EQUAL=39;
    public static final int ASSIGNMENT=77;
    public static final int OP_NAME=28;
    public static final int DT_CHANNEL=8;
    public static final int OP_UNION=36;
    public static final int SEP_TRIGGER=48;
    public static final int STRING=65;
    public static final int DT_NAME=9;

    // delegates
    // delegators


        public RecTranslator(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public RecTranslator(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("RecTranslatorTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return RecTranslator.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g"; }




    	private ArrayList<String> reconfigurations;
    	
    	public ArrayList<String> getReconfigurations(){
    		return this.reconfigurations;
    	}
    	
    	
    	public String datatypeToString(List<String> full_dt){
    		String datatype = "";
    		
    		for (int i = full_dt.size()-1; i>=0; i--){
    			String dt = full_dt.get(i);
    			if (dt.equals("Pair")){
    				datatype = dt + "<" + datatype + ", " + datatype +  ">";
    			}
    			else if(dt.equals("Triple")){
    				datatype = dt + "<" + datatype + ", " + datatype + ", " + datatype + ">";
    			}
    			else if(i != full_dt.size()-1){
    				datatype = dt + "<" + datatype + ">";
    			}
    			else {
    				datatype = dt;		
    			}
    		}
    		
    		return datatype;
    	}


    public static class reclang_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:54:1: reclang : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final RecTranslator.reclang_return reclang() throws RecognitionException {
        RecTranslator.reclang_return retval = new RecTranslator.reclang_return();
        retval.start = input.LT(1);

        RecTranslator.element_return element1 = null;



        	this.reconfigurations = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:58:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:58:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang63); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:58:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:58:16: directive_def
                	    {
                	    pushFollow(FOLLOW_directive_def_in_reclang65);
                	    directive_def();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:58:31: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||LA2_0==APPLICATION) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:58:32: element
                	    {
                	    pushFollow(FOLLOW_element_in_reclang69);
                	    element1=element();

                	    state._fsp--;

                	    	
                	    		this.reconfigurations.add((element1!=null?element1.st:null).toString()); 
                	    	

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
        }
        return retval;
    }
    // $ANTLR end "reclang"

    public static class directive_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "directive_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:69:1: directive_def : directive_import ;
    public final RecTranslator.directive_def_return directive_def() throws RecognitionException {
        RecTranslator.directive_def_return retval = new RecTranslator.directive_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:70:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:70:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def93);
            directive_import();

            state._fsp--;


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
    // $ANTLR end "directive_def"

    public static class directive_import_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "directive_import"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:74:1: directive_import : ^( IMPORT STRING ) ;
    public final RecTranslator.directive_import_return directive_import() throws RecognitionException {
        RecTranslator.directive_import_return retval = new RecTranslator.directive_import_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:75:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:75:4: ^( IMPORT STRING )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import107); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_directive_import109); 

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
    // $ANTLR end "directive_import"

    public static class element_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "element"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:83:1: element : ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st} | ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st});
    public final RecTranslator.element_return element() throws RecognitionException {
        RecTranslator.element_return retval = new RecTranslator.element_return();
        retval.start = input.LT(1);

        RecTranslator.reconfiguration_def_return reconfiguration_def2 = null;

        RecTranslator.applicaiton_def_return applicaiton_def3 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:84:2: ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st} | ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st})
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RECONFIGURATION) ) {
                alt3=1;
            }
            else if ( (LA3_0==APPLICATION) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:84:4: ^( RECONFIGURATION reconfiguration_def )
                    {
                    match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element128); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_reconfiguration_def_in_element130);
                    reconfiguration_def2=reconfiguration_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 84:43: -> {$reconfiguration_def.st}
                    {
                        retval.st = (reconfiguration_def2!=null?reconfiguration_def2.st:null);
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:85:4: ^( APPLICATION applicaiton_def )
                    {
                    match(input,APPLICATION,FOLLOW_APPLICATION_in_element141); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_applicaiton_def_in_element143);
                    applicaiton_def3=applicaiton_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 85:36: -> {$applicaiton_def.st}
                    {
                        retval.st = (applicaiton_def3!=null?applicaiton_def3.st:null);
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
        return retval;
    }
    // $ANTLR end "element"

    protected static class reconfiguration_def_scope {
        List<String> datatype;
    }
    protected Stack reconfiguration_def_stack = new Stack();

    public static class reconfiguration_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:90:1: reconfiguration_def : ^( ID (a= args_def )? reconfiguration_block ) -> mkclass(name=$ID.textrec_pkg=PkgConstants.CP_RECONFIGURATIONS);
    public final RecTranslator.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
        reconfiguration_def_stack.push(new reconfiguration_def_scope());
        RecTranslator.reconfiguration_def_return retval = new RecTranslator.reconfiguration_def_return();
        retval.start = input.LT(1);

        CommonTree ID4=null;
        RecTranslator.args_def_return a = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:94:2: ( ^( ID (a= args_def )? reconfiguration_block ) -> mkclass(name=$ID.textrec_pkg=PkgConstants.CP_RECONFIGURATIONS))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:94:4: ^( ID (a= args_def )? reconfiguration_block )
            {
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def166); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:94:10: (a= args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:94:10: a= args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def170);
                    a=args_def();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def173);
            reconfiguration_block();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 94:44: -> mkclass(name=$ID.textrec_pkg=PkgConstants.CP_RECONFIGURATIONS)
            {
                retval.st = templateLib.getInstanceOf("mkclass",
              new STAttrMap().put("name", (ID4!=null?ID4.getText():null)).put("rec_pkg", PkgConstants.CP_RECONFIGURATIONS));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            reconfiguration_def_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "reconfiguration_def"

    public static class args_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "args_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:97:1: args_def : ^( ARGUMENTS ( arg_def )+ ) ;
    public final RecTranslator.args_def_return args_def() throws RecognitionException {
        RecTranslator.args_def_return retval = new RecTranslator.args_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:98:2: ( ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:98:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def200); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:98:16: ( arg_def )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ARGUMENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:98:16: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def202);
            	    arg_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
        return retval;
    }
    // $ANTLR end "args_def"

    public static class arg_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arg_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:101:1: arg_def : ^( ARGUMENT dt= datatype li= list_ids ) ;
    public final RecTranslator.arg_def_return arg_def() throws RecognitionException {
        RecTranslator.arg_def_return retval = new RecTranslator.arg_def_return();
        retval.start = input.LT(1);

        RecTranslator.datatype_return dt = null;

        RecTranslator.list_ids_return li = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:105:2: ( ^( ARGUMENT dt= datatype li= list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:105:4: ^( ARGUMENT dt= datatype li= list_ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def221); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def225);
            dt=datatype();

            state._fsp--;


            		String dt_name = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            pushFollow(FOLLOW_list_ids_in_arg_def234);
            li=list_ids();

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
        return retval;
    }
    // $ANTLR end "arg_def"

    public static class datatype_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "datatype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:112:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final RecTranslator.datatype_return datatype() throws RecognitionException {
        RecTranslator.datatype_return retval = new RecTranslator.datatype_return();
        retval.start = input.LT(1);

        RecTranslator.other_type_return other_type5 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:113:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:113:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype248); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CoordinationPattern2"); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:114:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype255); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CommunicationMean2"); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:115:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype262); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("String"); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:116:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype270); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:117:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype277); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:118:4: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype287);
                    other_type5=other_type();

                    state._fsp--;


                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add((other_type5!=null?other_type5.name:null)); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype292);
                    subtype();

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
        return retval;
    }
    // $ANTLR end "datatype"

    public static class other_type_return extends TreeRuleReturnScope {
        public String name;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "other_type"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:122:1: other_type returns [String name] : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final RecTranslator.other_type_return other_type() throws RecognitionException {
        RecTranslator.other_type_return retval = new RecTranslator.other_type_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:123:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
            int alt7=3;
            switch ( input.LA(1) ) {
            case DT_SET:
                {
                alt7=1;
                }
                break;
            case DT_PAIR:
                {
                alt7=2;
                }
                break;
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:123:4: DT_SET
                    {
                    match(input,DT_SET,FOLLOW_DT_SET_in_other_type309); 
                     retval.name = "LinkedHashSet"; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:124:4: DT_PAIR
                    {
                    match(input,DT_PAIR,FOLLOW_DT_PAIR_in_other_type320); 
                     retval.name = "Pair"; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:125:4: DT_TRIPLE
                    {
                    match(input,DT_TRIPLE,FOLLOW_DT_TRIPLE_in_other_type328); 
                     retval.name = "Triple"; 

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
    // $ANTLR end "other_type"

    public static class subtype_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "subtype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:128:1: subtype : datatype ;
    public final RecTranslator.subtype_return subtype() throws RecognitionException {
        RecTranslator.subtype_return retval = new RecTranslator.subtype_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:129:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:129:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype341);
            datatype();

            state._fsp--;


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
    // $ANTLR end "subtype"

    public static class list_ids_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "list_ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:132:1: list_ids : ( ID )+ ;
    public final RecTranslator.list_ids_return list_ids() throws RecognitionException {
        RecTranslator.list_ids_return retval = new RecTranslator.list_ids_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:133:2: ( ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:133:4: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:133:4: ( ID )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:133:4: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_list_ids353); 

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
    // $ANTLR end "list_ids"

    public static class reconfiguration_block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:137:1: reconfiguration_block : ^( INSTRUCTIONS ( instruction )+ ) ;
    public final RecTranslator.reconfiguration_block_return reconfiguration_block() throws RecognitionException {
        RecTranslator.reconfiguration_block_return retval = new RecTranslator.reconfiguration_block_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:138:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:138:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block369); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:138:19: ( instruction )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OP_APPLY||(LA9_0>=DECLARATION && LA9_0<=FORALL)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:138:19: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block371);
            	    instruction();

            	    state._fsp--;


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
    // $ANTLR end "reconfiguration_block"

    public static class instruction_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:141:1: instruction : ( declaration | assignment | reconfiguration_apply | for_instruction );
    public final RecTranslator.instruction_return instruction() throws RecognitionException {
        RecTranslator.instruction_return retval = new RecTranslator.instruction_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:142:2: ( declaration | assignment | reconfiguration_apply | for_instruction )
            int alt10=4;
            switch ( input.LA(1) ) {
            case DECLARATION:
                {
                alt10=1;
                }
                break;
            case ASSIGNMENT:
                {
                alt10=2;
                }
                break;
            case OP_APPLY:
                {
                alt10=3;
                }
                break;
            case FORALL:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:142:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction385);
                    declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:143:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_instruction390);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:144:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction395);
                    reconfiguration_apply();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:145:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction400);
                    for_instruction();

                    state._fsp--;


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
    // $ANTLR end "instruction"

    public static class reconfiguration_apply_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_apply"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:148:1: reconfiguration_apply : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final RecTranslator.reconfiguration_apply_return reconfiguration_apply() throws RecognitionException {
        RecTranslator.reconfiguration_apply_return retval = new RecTranslator.reconfiguration_apply_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:149:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:149:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply413); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply415);
            reconfiguration_call();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:149:36: ( ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:149:36: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply417); 

                    }
                    break;

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
        return retval;
    }
    // $ANTLR end "reconfiguration_apply"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:152:1: declaration : ^( DECLARATION datatype ( var_def )+ ) ;
    public final RecTranslator.declaration_return declaration() throws RecognitionException {
        RecTranslator.declaration_return retval = new RecTranslator.declaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:153:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:153:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration433); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration435);
            datatype();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:153:27: ( var_def )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID||LA12_0==ASSIGNMENT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:153:27: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration437);
            	    var_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
        return retval;
    }
    // $ANTLR end "declaration"

    public static class var_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:156:1: var_def : ( ID | assignment );
    public final RecTranslator.var_def_return var_def() throws RecognitionException {
        RecTranslator.var_def_return retval = new RecTranslator.var_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:157:2: ( ID | assignment )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==ASSIGNMENT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:157:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_var_def451); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:158:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_var_def456);
                    assignment();

                    state._fsp--;


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
    // $ANTLR end "var_def"

    public static class assignment_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:161:1: assignment : ^( ASSIGNMENT ID assignment_member ) ;
    public final RecTranslator.assignment_return assignment() throws RecognitionException {
        RecTranslator.assignment_return retval = new RecTranslator.assignment_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:162:2: ( ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:162:4: ^( ASSIGNMENT ID assignment_member )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment469); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_assignment471); 
            pushFollow(FOLLOW_assignment_member_in_assignment473);
            assignment_member();

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
        return retval;
    }
    // $ANTLR end "assignment"

    public static class assignment_member_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment_member"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:165:1: assignment_member : ( expression | reconfiguration_apply );
    public final RecTranslator.assignment_member_return assignment_member() throws RecognitionException {
        RecTranslator.assignment_member_return retval = new RecTranslator.assignment_member_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:166:2: ( expression | reconfiguration_apply )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=OP_PATH && LA14_0<=OP_UPDATE)||(LA14_0>=OP_UNION && LA14_0<=OP_MINUS)||LA14_0==ID||(LA14_0>=TRIPLE && LA14_0<=XOR)||LA14_0==ACCESS) ) {
                alt14=1;
            }
            else if ( (LA14_0==OP_APPLY) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:166:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member488);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:167:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member494);
                    reconfiguration_apply();

                    state._fsp--;


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
    // $ANTLR end "assignment_member"

    public static class reconfiguration_call_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:170:1: reconfiguration_call : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final RecTranslator.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecTranslator.reconfiguration_call_return retval = new RecTranslator.reconfiguration_call_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:171:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:171:4: ^( OP_JOIN operation_args )
                    {
                    match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call507); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call509);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:172:4: ^( OP_SPLIT operation_args )
                    {
                    match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call516); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call518);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:173:4: ^( OP_PAR operation_args )
                    {
                    match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call525); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call527);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:174:4: ^( OP_REMOVE operation_args )
                    {
                    match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call534); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call536);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:175:4: ^( OP_CONST operation_args )
                    {
                    match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call543); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call545);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:176:4: ^( OP_ID operation_args )
                    {
                    match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call552); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call554);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:177:4: ^( ID operation_args )
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_call561); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call563);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
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
        return retval;
    }
    // $ANTLR end "reconfiguration_call"

    public static class structure_operation_call_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "structure_operation_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:181:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final RecTranslator.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecTranslator.structure_operation_call_return retval = new RecTranslator.structure_operation_call_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:182:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:182:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call579); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call581);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:183:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call588); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call590);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
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
        return retval;
    }
    // $ANTLR end "structure_operation_call"

    public static class operation_args_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:187:1: operation_args : ( args )? ;
    public final RecTranslator.operation_args_return operation_args() throws RecognitionException {
        RecTranslator.operation_args_return retval = new RecTranslator.operation_args_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:188:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:188:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:188:4: ( args )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=XOR)||LA17_0==ACCESS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:188:4: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args605);
                    args();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "operation_args"

    public static class args_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:191:1: args : ( expression )+ ;
    public final RecTranslator.args_return args() throws RecognitionException {
        RecTranslator.args_return retval = new RecTranslator.args_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:192:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:192:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:192:4: ( expression )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=OP_PATH && LA18_0<=OP_UPDATE)||(LA18_0>=OP_UNION && LA18_0<=OP_MINUS)||LA18_0==ID||(LA18_0>=TRIPLE && LA18_0<=XOR)||LA18_0==ACCESS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:192:4: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args618);
            	    expression();

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
    // $ANTLR end "args"

    public static class for_instruction_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:196:1: for_instruction : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
    public final RecTranslator.for_instruction_return for_instruction() throws RecognitionException {
        RecTranslator.for_instruction_return retval = new RecTranslator.for_instruction_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:197:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:197:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction634); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction636);
            datatype();

            state._fsp--;

            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction640); 
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction644); 
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction646);
            reconfiguration_block();

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
        return retval;
    }
    // $ANTLR end "for_instruction"

    public static class expression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:201:1: expression : ( ^( OP_UNION expression expression ) | ^( OP_INTERSECTION expression expression ) | ^( OP_MINUS expression expression ) | factor );
    public final RecTranslator.expression_return expression() throws RecognitionException {
        RecTranslator.expression_return retval = new RecTranslator.expression_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:202:2: ( ^( OP_UNION expression expression ) | ^( OP_INTERSECTION expression expression ) | ^( OP_MINUS expression expression ) | factor )
            int alt19=4;
            switch ( input.LA(1) ) {
            case OP_UNION:
                {
                alt19=1;
                }
                break;
            case OP_INTERSECTION:
                {
                alt19=2;
                }
                break;
            case OP_MINUS:
                {
                alt19=3;
                }
                break;
            case OP_PATH:
            case OP_UPDATE:
            case ID:
            case TRIPLE:
            case PAIR:
            case SET:
            case NODE:
            case XOR:
            case ACCESS:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:202:4: ^( OP_UNION expression expression )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression662); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression664);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression666);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:203:4: ^( OP_INTERSECTION expression expression )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression673); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression675);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression677);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:204:4: ^( OP_MINUS expression expression )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression684); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression686);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression688);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:205:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression694);
                    factor();

                    state._fsp--;


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
    // $ANTLR end "expression"

    public static class factor_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:209:1: factor : ( ^( ID ID ) | ID | operation | constructor );
    public final RecTranslator.factor_return factor() throws RecognitionException {
        RecTranslator.factor_return retval = new RecTranslator.factor_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:210:2: ( ^( ID ID ) | ID | operation | constructor )
            int alt20=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DOWN) ) {
                    alt20=1;
                }
                else if ( (LA20_1==UP||(LA20_1>=OP_PATH && LA20_1<=OP_UPDATE)||(LA20_1>=OP_UNION && LA20_1<=OP_MINUS)||LA20_1==ID||(LA20_1>=TRIPLE && LA20_1<=XOR)||LA20_1==ACCESS) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_PATH:
            case OP_UPDATE:
            case ACCESS:
                {
                alt20=3;
                }
                break;
            case TRIPLE:
            case PAIR:
            case SET:
            case NODE:
            case XOR:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:210:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor708); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor710); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:211:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor716); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:212:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor721);
                    operation();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:213:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor726);
                    constructor();

                    state._fsp--;


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
    // $ANTLR end "factor"

    public static class operation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:216:1: operation : ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call );
    public final RecTranslator.operation_return operation() throws RecognitionException {
        RecTranslator.operation_return retval = new RecTranslator.operation_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:217:2: ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ACCESS) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=OP_PATH && LA22_0<=OP_UPDATE)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:217:4: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation739); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_operation741); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:217:16: ( ^( STRUCTURE ID ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==STRUCTURE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:217:17: ^( STRUCTURE ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation745); 

                            match(input, Token.DOWN, null); 
                            match(input,ID,FOLLOW_ID_in_operation747); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation752);
                    attribute_call();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:219:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation759);
                    structure_operation_call();

                    state._fsp--;


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
    // $ANTLR end "operation"

    public static class constructor_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:222:1: constructor : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final RecTranslator.constructor_return constructor() throws RecognitionException {
        RecTranslator.constructor_return retval = new RecTranslator.constructor_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:223:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
            int alt23=5;
            switch ( input.LA(1) ) {
            case TRIPLE:
                {
                alt23=1;
                }
                break;
            case PAIR:
                {
                alt23=2;
                }
                break;
            case SET:
                {
                alt23=3;
                }
                break;
            case NODE:
                {
                alt23=4;
                }
                break;
            case XOR:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:223:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor771);
                    triple_cons();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:224:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor776);
                    pair_cons();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:225:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor781);
                    set_cons();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:226:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor786);
                    node_cons();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:227:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor791);
                    xor_cons();

                    state._fsp--;


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
    // $ANTLR end "constructor"

    public static class attribute_call_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:236:1: attribute_call : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | ID );
    public final RecTranslator.attribute_call_return attribute_call() throws RecognitionException {
        RecTranslator.attribute_call_return retval = new RecTranslator.attribute_call_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:237:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | ID )
            int alt26=10;
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
            case OP_ENDS:
                {
                alt26=6;
                }
                break;
            case OP_FST:
                {
                alt26=7;
                }
                break;
            case OP_SND:
                {
                alt26=8;
                }
                break;
            case OP_TRD:
                {
                alt26=9;
                }
                break;
            case ID:
                {
                alt26=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:237:4: ^( OP_IN ( INT )? )
                    {
                    match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call811); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:237:12: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:237:12: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call813); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:238:4: ^( OP_OUT ( INT )? )
                    {
                    match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call821); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:238:13: ( INT )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==INT) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:238:13: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call823); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:239:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call830); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:240:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call835); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:241:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call840); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:242:4: ^( OP_ENDS expression )
                    {
                    match(input,OP_ENDS,FOLLOW_OP_ENDS_in_attribute_call846); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_attribute_call848);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:243:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call855); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:244:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call860); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:245:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call865); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:246:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_attribute_call870); 

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
    // $ANTLR end "attribute_call"

    public static class triple_cons_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "triple_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:250:1: triple_cons : ^( TRIPLE expression expression expression ) ;
    public final RecTranslator.triple_cons_return triple_cons() throws RecognitionException {
        RecTranslator.triple_cons_return retval = new RecTranslator.triple_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:251:2: ( ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:251:4: ^( TRIPLE expression expression expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons885); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons887);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons889);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons891);
            expression();

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
        return retval;
    }
    // $ANTLR end "triple_cons"

    public static class pair_cons_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pair_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:255:1: pair_cons : ^( PAIR expression expression ) ;
    public final RecTranslator.pair_cons_return pair_cons() throws RecognitionException {
        RecTranslator.pair_cons_return retval = new RecTranslator.pair_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:256:2: ( ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:256:4: ^( PAIR expression expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons908); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons910);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons912);
            expression();

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
        return retval;
    }
    // $ANTLR end "pair_cons"

    public static class set_cons_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "set_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:261:1: set_cons : ^( SET ( expression )* ) ;
    public final RecTranslator.set_cons_return set_cons() throws RecognitionException {
        RecTranslator.set_cons_return retval = new RecTranslator.set_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:262:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:262:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons930); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:262:10: ( expression )*
                loop27:
                do {
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=OP_PATH && LA27_0<=OP_UPDATE)||(LA27_0>=OP_UNION && LA27_0<=OP_MINUS)||LA27_0==ID||(LA27_0>=TRIPLE && LA27_0<=XOR)||LA27_0==ACCESS) ) {
                        alt27=1;
                    }


                    switch (alt27) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:262:10: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons932);
                	    expression();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop27;
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
        }
        return retval;
    }
    // $ANTLR end "set_cons"

    public static class node_cons_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:266:1: node_cons : ^( NODE ( ID )+ ) ;
    public final RecTranslator.node_cons_return node_cons() throws RecognitionException {
        RecTranslator.node_cons_return retval = new RecTranslator.node_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:267:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:267:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons951); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:267:11: ( ID )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:267:11: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_node_cons953); 

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
        return retval;
    }
    // $ANTLR end "node_cons"

    public static class xor_cons_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:270:1: xor_cons : ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) ;
    public final RecTranslator.xor_cons_return xor_cons() throws RecognitionException {
        RecTranslator.xor_cons_return retval = new RecTranslator.xor_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:271:2: ( ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:271:4: ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons969); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons973); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons975); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:271:19: ( ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:271:19: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons977); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,OUT,FOLLOW_OUT_in_xor_cons982); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons984); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:271:33: ( ID )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:271:33: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons986); 

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
        return retval;
    }
    // $ANTLR end "xor_cons"

    public static class applicaiton_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "applicaiton_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:276:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final RecTranslator.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecTranslator.applicaiton_def_return retval = new RecTranslator.applicaiton_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:277:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:277:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1004); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1006);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:277:29: ( trigger_def )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_BLOCK_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:277:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1008);
                    trigger_def();

                    state._fsp--;


                    }
                    break;

            }


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
    // $ANTLR end "applicaiton_def"

    public static class list_reconfigurations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "list_reconfigurations"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:280:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final RecTranslator.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecTranslator.list_reconfigurations_return retval = new RecTranslator.list_reconfigurations_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:281:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:281:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:281:4: ( reconfiguration_call )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=OP_PAR && LA32_0<=OP_ID)||LA32_0==ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:281:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1021);
            	    reconfiguration_call();

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
    // $ANTLR end "list_reconfigurations"

    public static class trigger_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "trigger_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:284:1: trigger_def : trigger_block ;
    public final RecTranslator.trigger_def_return trigger_def() throws RecognitionException {
        RecTranslator.trigger_def_return retval = new RecTranslator.trigger_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:285:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:285:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1034);
            trigger_block();

            state._fsp--;


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
    // $ANTLR end "trigger_def"

    public static class trigger_block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "trigger_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:288:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecTranslator.trigger_block_return trigger_block() throws RecognitionException {
        RecTranslator.trigger_block_return retval = new RecTranslator.trigger_block_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:289:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:289:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1046); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1048); 

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
    // $ANTLR end "trigger_block"

    // Delegated rules


 

    public static final BitSet FOLLOW_RECONFIGS_in_reclang63 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reclang65 = new BitSet(new long[]{0x0000000000000008L,0x00000000010000C0L});
    public static final BitSet FOLLOW_element_in_reclang69 = new BitSet(new long[]{0x0000000000000008L,0x0000000001000080L});
    public static final BitSet FOLLOW_directive_import_in_directive_def93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECONFIGURATION_in_element128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element141 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def173 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def202 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def225 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype287 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_SET_in_other_type309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PAIR_in_other_type320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_TRIPLE_in_other_type328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids353 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block369 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block371 = new BitSet(new long[]{0x0000000800000008L,0x0000000000007000L});
    public static final BitSet FOLLOW_declaration_in_instruction385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply415 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration435 = new BitSet(new long[]{0x1000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_var_def_in_declaration437 = new BitSet(new long[]{0x1000000000000008L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_var_def451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment471 = new BitSet(new long[]{0x1000007800600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment473 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call516 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call527 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call536 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args618 = new BitSet(new long[]{0x1000007000600002L,0x00000000004F8000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction636 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction640 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction646 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression662 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression664 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_expression666 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression673 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression675 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_expression677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression686 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_expression688 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation741 = new BitSet(new long[]{0x10000000FF800000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation745 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation747 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call813 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ENDS_in_attribute_call846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_attribute_call848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons887 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_triple_cons889 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_triple_cons891 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons908 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons910 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_pair_cons912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons932 = new BitSet(new long[]{0x1000007000600008L,0x00000000004F8000L});
    public static final BitSet FOLLOW_NODE_in_node_cons951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons953 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons969 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons975 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_xor_cons977 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons984 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons986 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1004 = new BitSet(new long[]{0x10000000001F8000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1006 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1021 = new BitSet(new long[]{0x10000000001F8002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1046 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1048 = new BitSet(new long[]{0x0000000000000002L});

}