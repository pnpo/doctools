// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g 2014-05-06 19:47:38

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
        String class_name;
        List<String> args;
        //body	
        	List<String> reconfs;
        List<String> insts;
        //tabs
        	String adv;
    }
    protected Stack reconfiguration_def_stack = new Stack();

    public static class reconfiguration_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:90:1: reconfiguration_def : ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namerec_pkg=PkgConstants.CP_RECONFIGURATIONSattributes=$args_def.valuesconstructor=$args_def.stbody=\"\");
    public final RecTranslator.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
        reconfiguration_def_stack.push(new reconfiguration_def_scope());
        RecTranslator.reconfiguration_def_return retval = new RecTranslator.reconfiguration_def_return();
        retval.start = input.LT(1);

        CommonTree ID4=null;
        RecTranslator.args_def_return args_def5 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name = "";
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args = new ArrayList<String>();
        	
        	//body
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs = new ArrayList<String>();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts = new ArrayList<String>();
        	
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:113:2: ( ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namerec_pkg=PkgConstants.CP_RECONFIGURATIONSattributes=$args_def.valuesconstructor=$args_def.stbody=\"\"))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:113:4: ^( ID ( args_def )? reconfiguration_block[false] )
            {
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def170); 


            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name = Character.toUpperCase((ID4!=null?ID4.getText():null).charAt(0)) + (ID4!=null?ID4.getText():null).substring(1);
            	

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:118:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:118:2: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def179);
                    args_def5=args_def();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def182);
            reconfiguration_block(false);

            state._fsp--;


            		System.out.println(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs.toString());
            		System.out.println(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts.toString());
            	

            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 124:4: -> mkclass(name=$reconfiguration_def::class_namerec_pkg=PkgConstants.CP_RECONFIGURATIONSattributes=$args_def.valuesconstructor=$args_def.stbody=\"\")
            {
                retval.st = templateLib.getInstanceOf("mkclass",
              new STAttrMap().put("name", ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name).put("rec_pkg", PkgConstants.CP_RECONFIGURATIONS).put("attributes", (args_def5!=null?args_def5.values:null)).put("constructor", (args_def5!=null?args_def5.st:null)).put("body", ""));
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
        public List<String> values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "args_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:128:1: args_def returns [List<String> values] : ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids);
    public final RecTranslator.args_def_return args_def() throws RecognitionException {
        RecTranslator.args_def_return retval = new RecTranslator.args_def_return();
        retval.start = input.LT(1);

        RecTranslator.arg_def_return arg_def6 = null;



        	List<String> ctfields = new ArrayList<String>();
        	List<String> ids = new ArrayList<String>();
        	List<String> dts = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:134:2: ( ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:134:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def242); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:2: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:3: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def247);
            	    arg_def6=arg_def();

            	    state._fsp--;


            	    		ctfields.add((arg_def6!=null?arg_def6.st:null).toString());
            	    		ids.addAll((arg_def6!=null?arg_def6.values:null));
            	    		for (int i = 0; i < (arg_def6!=null?arg_def6.values:null).size(); i++){
            	    			dts.add((arg_def6!=null?arg_def6.datatype:null));
            	    		}
            	    	

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
            	
            		retval.values = ctfields;// + constructor;
            	


            // TEMPLATE REWRITE
            // 148:2: -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids)
            {
                retval.st = templateLib.getInstanceOf("constructor",
              new STAttrMap().put("n", ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name).put("dts", dts).put("ids", ids));
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
    // $ANTLR end "args_def"

    public static class arg_def_return extends TreeRuleReturnScope {
        public String datatype;
        public List<String> values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arg_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:151:1: arg_def returns [String datatype, List<String> values] : ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st};
    public final RecTranslator.arg_def_return arg_def() throws RecognitionException {
        RecTranslator.arg_def_return retval = new RecTranslator.arg_def_return();
        retval.start = input.LT(1);

        RecTranslator.list_ids_return list_ids7 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();
        	List<String> args = new ArrayList<String>();	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:156:2: ( ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st})
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:156:4: ^( ARGUMENT datatype list_ids[dt] )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def301); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def303);
            datatype();

            state._fsp--;


            		String dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            pushFollow(FOLLOW_list_ids_in_arg_def310);
            list_ids7=list_ids(dt);

            state._fsp--;


            match(input, Token.UP, null); 

            		retval.values = (list_ids7!=null?list_ids7.values:null);
            		retval.datatype = dt;
            	


            // TEMPLATE REWRITE
            // 166:2: -> {$list_ids.st}
            {
                retval.st = (list_ids7!=null?list_ids7.st:null);
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
    // $ANTLR end "arg_def"

    public static class datatype_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "datatype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:169:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final RecTranslator.datatype_return datatype() throws RecognitionException {
        RecTranslator.datatype_return retval = new RecTranslator.datatype_return();
        retval.start = input.LT(1);

        RecTranslator.other_type_return other_type8 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:170:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:170:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype335); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CoordinationPattern2"); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:171:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype342); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CommunicationMean2"); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:172:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype349); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("String"); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:173:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype357); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:174:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype364); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:175:4: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype375);
                    other_type8=other_type();

                    state._fsp--;


                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add((other_type8!=null?other_type8.name:null)); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype380);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:179:1: other_type returns [String name] : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final RecTranslator.other_type_return other_type() throws RecognitionException {
        RecTranslator.other_type_return retval = new RecTranslator.other_type_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:180:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:180:4: DT_SET
                    {
                    match(input,DT_SET,FOLLOW_DT_SET_in_other_type397); 
                     retval.name = "LinkedHashSet"; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:181:4: DT_PAIR
                    {
                    match(input,DT_PAIR,FOLLOW_DT_PAIR_in_other_type408); 
                     retval.name = "Pair"; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:182:4: DT_TRIPLE
                    {
                    match(input,DT_TRIPLE,FOLLOW_DT_TRIPLE_in_other_type416); 
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:185:1: subtype : datatype ;
    public final RecTranslator.subtype_return subtype() throws RecognitionException {
        RecTranslator.subtype_return retval = new RecTranslator.subtype_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:186:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:186:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype429);
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
        public List<String> values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "list_ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:189:1: list_ids[String dt] returns [List<String> values] : ( ID )+ -> list_args(datatype=$list_ids.dtids=ids);
    public final RecTranslator.list_ids_return list_ids(String dt) throws RecognitionException {
        RecTranslator.list_ids_return retval = new RecTranslator.list_ids_return();
        retval.start = input.LT(1);

        CommonTree ID9=null;


        	List<String> ids = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:193:2: ( ( ID )+ -> list_args(datatype=$list_ids.dtids=ids))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:193:3: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:193:3: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:193:4: ID
            	    {
            	    ID9=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids450); 

            	    		ids.add((ID9!=null?ID9.getText():null));
            	    		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.add((ID9!=null?ID9.getText():null));
            	    	

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


            		retval.values = ids; 
            		//System.out.println(ids);
            	


            // TEMPLATE REWRITE
            // 204:2: -> list_args(datatype=$list_ids.dtids=ids)
            {
                retval.st = templateLib.getInstanceOf("list_args",
              new STAttrMap().put("datatype", dt).put("ids", ids));
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
    // $ANTLR end "list_ids"

    public static class reconfiguration_block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:209:1: reconfiguration_block[boolean isForall] : ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(body=\"\");
    public final RecTranslator.reconfiguration_block_return reconfiguration_block(boolean isForall) throws RecognitionException {
        RecTranslator.reconfiguration_block_return retval = new RecTranslator.reconfiguration_block_return();
        retval.start = input.LT(1);

        RecTranslator.instruction_return instruction10 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:210:2: ( ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(body=\"\"))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:210:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block496); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:210:19: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:210:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block499);
            	    instruction10=instruction();

            	    state._fsp--;


            	    		if (isForall){
            	    			((for_instruction_scope)for_instruction_stack.peek()).insts.add((instruction10!=null?instruction10.value:null));
            	    		}
            	    		else{
            	    			((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts.add((instruction10!=null?instruction10.value:null));
            	    		}
            	    	

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


            // TEMPLATE REWRITE
            // 220:4: -> apply_method(body=\"\")
            {
                retval.st = templateLib.getInstanceOf("apply_method",
              new STAttrMap().put("body", ""));
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
    // $ANTLR end "reconfiguration_block"

    public static class instruction_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:223:1: instruction returns [String value] : ( declaration | assignment | reconfiguration_apply[false] | for_instruction );
    public final RecTranslator.instruction_return instruction() throws RecognitionException {
        RecTranslator.instruction_return retval = new RecTranslator.instruction_return();
        retval.start = input.LT(1);

        RecTranslator.declaration_return declaration11 = null;

        RecTranslator.assignment_return assignment12 = null;

        RecTranslator.reconfiguration_apply_return reconfiguration_apply13 = null;

        RecTranslator.for_instruction_return for_instruction14 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:224:2: ( declaration | assignment | reconfiguration_apply[false] | for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:224:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction533);
                    declaration11=declaration();

                    state._fsp--;

                     retval.value = (declaration11!=null?declaration11.value:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:225:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_instruction542);
                    assignment12=assignment();

                    state._fsp--;

                     retval.value = (assignment12!=null?assignment12.value:null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:226:4: reconfiguration_apply[false]
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction551);
                    reconfiguration_apply13=reconfiguration_apply(false);

                    state._fsp--;

                     retval.value = (reconfiguration_apply13!=null?reconfiguration_apply13.value:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:227:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction559);
                    for_instruction14=for_instruction();

                    state._fsp--;

                     retval.value = (for_instruction14!=null?for_instruction14.value:null); 

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_apply"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:230:1: reconfiguration_apply[boolean isAssign] returns [String value] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final RecTranslator.reconfiguration_apply_return reconfiguration_apply(boolean isAssign) throws RecognitionException {
        RecTranslator.reconfiguration_apply_return retval = new RecTranslator.reconfiguration_apply_return();
        retval.start = input.LT(1);

        RecTranslator.reconfiguration_call_return reconfiguration_call15 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:231:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:231:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply579); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply581);
            reconfiguration_call15=reconfiguration_call();

            state._fsp--;


            		String op = (reconfiguration_call15!=null?reconfiguration_call15.name:null);
            		//eg: par -> P + ar = Par
            		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs.add(class_name + " " + op + ";");
            		
            		String args = (reconfiguration_call15!=null?reconfiguration_call15.args:null);
            		
            		String rec = op + " = new " + class_name + "(" + args + ");\n" + op + ".apply($cp);"; //add template
            		retval.value = rec;
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:244:2: ( ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:244:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply590); 

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

    protected static class declaration_scope {
        String dt;
    }
    protected Stack declaration_stack = new Stack();

    public static class declaration_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:247:1: declaration returns [String value] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final RecTranslator.declaration_return declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        RecTranslator.declaration_return retval = new RecTranslator.declaration_return();
        retval.start = input.LT(1);

        RecTranslator.var_def_return var_def16 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();
        	
        	((declaration_scope)declaration_stack.peek()).dt = "";
        	List<String> decls = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:257:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:257:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration615); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration617);
            datatype();

            state._fsp--;


            		((declaration_scope)declaration_stack.peek()).dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:262:2: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:262:3: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration627);
            	    var_def16=var_def();

            	    state._fsp--;


            	    		decls.add(((declaration_scope)declaration_stack.peek()).dt + " " + (var_def16!=null?var_def16.value:null) + ";");
            	    	

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


            		//convert list decls to string
            		String all_decls = "";
            		for (String d : decls){
            			all_decls += d + "\n";
            		}		
            		retval.value = all_decls;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            declaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class var_def_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:278:1: var_def returns [String value] : ( ID | assignment );
    public final RecTranslator.var_def_return var_def() throws RecognitionException {
        RecTranslator.var_def_return retval = new RecTranslator.var_def_return();
        retval.start = input.LT(1);

        CommonTree ID17=null;
        RecTranslator.assignment_return assignment18 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:279:2: ( ID | assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:279:4: ID
                    {
                    ID17=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def655); 
                     retval.value = (ID17!=null?ID17.getText():null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:280:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_var_def662);
                    assignment18=assignment();

                    state._fsp--;

                     retval.value = (assignment18!=null?assignment18.value:null); 

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:283:1: assignment returns [String value] : ^( ASSIGNMENT ID assignment_member ) ;
    public final RecTranslator.assignment_return assignment() throws RecognitionException {
        RecTranslator.assignment_return retval = new RecTranslator.assignment_return();
        retval.start = input.LT(1);

        CommonTree ID19=null;
        RecTranslator.assignment_member_return assignment_member20 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:284:2: ( ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:284:4: ^( ASSIGNMENT ID assignment_member )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment680); 

            match(input, Token.DOWN, null); 
            ID19=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment682); 
            pushFollow(FOLLOW_assignment_member_in_assignment684);
            assignment_member20=assignment_member();

            state._fsp--;


            		retval.value = (ID19!=null?ID19.getText():null) + " = " + (assignment_member20!=null?assignment_member20.value:null);
            	

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment_member"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:291:1: assignment_member returns [String value] : ( expression | reconfiguration_apply[true] );
    public final RecTranslator.assignment_member_return assignment_member() throws RecognitionException {
        RecTranslator.assignment_member_return retval = new RecTranslator.assignment_member_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression21 = null;

        RecTranslator.reconfiguration_apply_return reconfiguration_apply22 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:292:2: ( expression | reconfiguration_apply[true] )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:292:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member708);
                    expression21=expression();

                    state._fsp--;

                     retval.value = (expression21!=null?expression21.value:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:293:4: reconfiguration_apply[true]
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member718);
                    reconfiguration_apply22=reconfiguration_apply(true);

                    state._fsp--;

                     retval.value = (reconfiguration_apply22!=null?reconfiguration_apply22.value:null); 

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
        public String name;
        public String args;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:296:1: reconfiguration_call returns [String name, String args] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final RecTranslator.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecTranslator.reconfiguration_call_return retval = new RecTranslator.reconfiguration_call_return();
        retval.start = input.LT(1);

        CommonTree OP_JOIN23=null;
        CommonTree OP_SPLIT25=null;
        CommonTree OP_PAR27=null;
        CommonTree OP_REMOVE29=null;
        CommonTree OP_CONST31=null;
        CommonTree OP_ID33=null;
        CommonTree ID35=null;
        RecTranslator.operation_args_return operation_args24 = null;

        RecTranslator.operation_args_return operation_args26 = null;

        RecTranslator.operation_args_return operation_args28 = null;

        RecTranslator.operation_args_return operation_args30 = null;

        RecTranslator.operation_args_return operation_args32 = null;

        RecTranslator.operation_args_return operation_args34 = null;

        RecTranslator.operation_args_return operation_args36 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:297:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:297:4: ^( OP_JOIN operation_args )
                    {
                    OP_JOIN23=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call738); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call740);
                        operation_args24=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_JOIN23!=null?OP_JOIN23.getText():null);
                    		retval.args = (operation_args24!=null?operation_args24.values:null);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:302:4: ^( OP_SPLIT operation_args )
                    {
                    OP_SPLIT25=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call750); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call752);
                        operation_args26=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_SPLIT25!=null?OP_SPLIT25.getText():null);
                    		retval.args = (operation_args26!=null?operation_args26.values:null);
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:307:4: ^( OP_PAR operation_args )
                    {
                    OP_PAR27=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call762); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call764);
                        operation_args28=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_PAR27!=null?OP_PAR27.getText():null);
                    		retval.args = (operation_args28!=null?operation_args28.values:null);
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:312:4: ^( OP_REMOVE operation_args )
                    {
                    OP_REMOVE29=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call774); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call776);
                        operation_args30=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_REMOVE29!=null?OP_REMOVE29.getText():null);
                    		retval.args = (operation_args30!=null?operation_args30.values:null);
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:317:4: ^( OP_CONST operation_args )
                    {
                    OP_CONST31=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call786); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call788);
                        operation_args32=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_CONST31!=null?OP_CONST31.getText():null);
                    		retval.args = (operation_args32!=null?operation_args32.values:null);
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:322:4: ^( OP_ID operation_args )
                    {
                    OP_ID33=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call798); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call800);
                        operation_args34=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_ID33!=null?OP_ID33.getText():null);
                    		retval.args = (operation_args34!=null?operation_args34.values:null);
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:327:4: ^( ID operation_args )
                    {
                    ID35=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call810); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call812);
                        operation_args36=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (ID35!=null?ID35.getText():null);
                    		retval.args = (operation_args36!=null?operation_args36.values:null);
                    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:335:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final RecTranslator.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecTranslator.structure_operation_call_return retval = new RecTranslator.structure_operation_call_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:336:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:336:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call831); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call833);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:337:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call840); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call842);
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
        public String values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:341:1: operation_args returns [String values] : ( args )? ;
    public final RecTranslator.operation_args_return operation_args() throws RecognitionException {
        RecTranslator.operation_args_return retval = new RecTranslator.operation_args_return();
        retval.start = input.LT(1);

        RecTranslator.args_return args37 = null;



        	String args = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:345:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:345:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:345:4: ( args )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=XOR)||LA17_0==ACCESS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:345:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args865);
                    args37=args();

                    state._fsp--;


                    		args = (args37!=null?args37.values:null);
                    	

                    }
                    break;

            }


            		retval.values = args;
            	

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
        public String values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:356:1: args returns [String values] : ( expression )+ ;
    public final RecTranslator.args_return args() throws RecognitionException {
        RecTranslator.args_return retval = new RecTranslator.args_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression38 = null;



        	List<String> args = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:360:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:360:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:360:4: ( expression )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:360:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args897);
            	    expression38=expression();

            	    state._fsp--;


            	    		args.add((expression38!=null?expression38.value:null));
            	    	

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


            		//convert list args to string, separated by ','
            		String sep = "";
            		String values = "";
            		for (String a : args){
            			values += sep;
            			values += a;
            			
            		        sep = ", ";
            		}
            		
            		retval.values = values;
            	

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

    protected static class for_instruction_scope {
        List<String> insts;
    }
    protected Stack for_instruction_stack = new Stack();

    public static class for_instruction_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:382:1: for_instruction returns [String value] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) ;
    public final RecTranslator.for_instruction_return for_instruction() throws RecognitionException {
        for_instruction_stack.push(new for_instruction_scope());
        RecTranslator.for_instruction_return retval = new RecTranslator.for_instruction_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;


        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv += "\t";
        	
        	((for_instruction_scope)for_instruction_stack.peek()).insts = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:392:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:392:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction934); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction936);
            datatype();

            state._fsp--;


            		String dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction947); 
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction951); 

            		String value = (id1!=null?id1.getText():null);
            		
            		//name of set to iterate
            		String set_name = "";
            		if (((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.contains((id2!=null?id2.getText():null))){
            			set_name = "this." + (id2!=null?id2.getText():null);
            		}
            		else{
            			set_name = (id2!=null?id2.getText():null);
            		}
            	
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction960);
            reconfiguration_block(true);

            state._fsp--;


            		//String adv = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv.substring(0, ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv.length() - 2);
            		String for_insts = "for(" + dt + " " + value + " : " + set_name + ") {\n"; //add template -> for(dt,v,set,insts)
            		
            		for (String i : ((for_instruction_scope)for_instruction_stack.peek()).insts) {
            			for_insts += i + "\n";
            		}
            		for_insts += "}";
            		
            		retval.value = for_insts;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            for_instruction_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "for_instruction"

    public static class expression_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:427:1: expression returns [String value] : ( ^( OP_UNION s1= expression s2= expression ) | ^( OP_INTERSECTION s1= expression s2= expression ) | ^( OP_MINUS s1= expression s2= expression ) | factor );
    public final RecTranslator.expression_return expression() throws RecognitionException {
        RecTranslator.expression_return retval = new RecTranslator.expression_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return s1 = null;

        RecTranslator.expression_return s2 = null;

        RecTranslator.factor_return factor39 = null;



        	String value = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:431:2: ( ^( OP_UNION s1= expression s2= expression ) | ^( OP_INTERSECTION s1= expression s2= expression ) | ^( OP_MINUS s1= expression s2= expression ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:431:4: ^( OP_UNION s1= expression s2= expression )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression989); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression993);
                    s1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression997);
                    s2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		value = "(new LinkedHashSet<T>(" + s1 + ")).addAll(" + s2 + ")";
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:436:4: ^( OP_INTERSECTION s1= expression s2= expression )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1009); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1013);
                    s1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1017);
                    s2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		value = "(new LinkedHashSet<T>(" + s1 + ")).removeAll(" + s2 + ")";
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:441:4: ^( OP_MINUS s1= expression s2= expression )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1029); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1033);
                    s1=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression1037);
                    s2=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		value = "(new LinkedHashSet<T>(" + s1 + ")).retainAll(" + s2 + ")";
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:446:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression1049);
                    factor39=factor();

                    state._fsp--;


                    		retval.value = (factor39!=null?factor39.value:null);
                    	

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:453:1: factor returns [String value] : ( ^( ID ID ) | ID | operation | constructor );
    public final RecTranslator.factor_return factor() throws RecognitionException {
        RecTranslator.factor_return retval = new RecTranslator.factor_return();
        retval.start = input.LT(1);

        CommonTree ID40=null;
        RecTranslator.operation_return operation41 = null;

        RecTranslator.constructor_return constructor42 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:454:2: ( ^( ID ID ) | ID | operation | constructor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:454:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1069); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1071); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:455:4: ID
                    {
                    ID40=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1077); 

                    		if (((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.contains((ID40!=null?ID40.getText():null))){
                    			retval.value = "this." + (ID40!=null?ID40.getText():null);
                    		}
                    		else{
                    			retval.value = (ID40!=null?ID40.getText():null);
                    		}
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:464:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1086);
                    operation41=operation();

                    state._fsp--;

                     retval.value = (operation41!=null?operation41.value:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:465:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1094);
                    constructor42=constructor();

                    state._fsp--;

                     retval.value = (constructor42!=null?constructor42.value:null); 

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:468:1: operation returns [String value] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[var] ) | structure_operation_call );
    public final RecTranslator.operation_return operation() throws RecognitionException {
        RecTranslator.operation_return retval = new RecTranslator.operation_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        RecTranslator.attribute_call_return attribute_call43 = null;



        	String op = "";
        	String var = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:473:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[var] ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:473:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[var] )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1116); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1120); 

                    		op += (id1!=null?id1.getText():null);
                    		var = (id1!=null?id1.getText():null);
                    	
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:478:2: ( ^( STRUCTURE id2= ID ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==STRUCTURE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:478:3: ^( STRUCTURE id2= ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1129); 

                            match(input, Token.DOWN, null); 
                            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1133); 

                            match(input, Token.UP, null); 

                            		op += ".getChannel(" + (id2!=null?id2.getText():null) + ")";
                            		var = (id2!=null?id2.getText():null);
                            	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1147);
                    attribute_call43=attribute_call(var);

                    state._fsp--;


                    		op += "." + (attribute_call43!=null?attribute_call43.value:null) + ";";
                    		
                    		retval.value = op;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:493:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1161);
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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:496:1: constructor returns [String value] : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final RecTranslator.constructor_return constructor() throws RecognitionException {
        RecTranslator.constructor_return retval = new RecTranslator.constructor_return();
        retval.start = input.LT(1);

        RecTranslator.triple_cons_return triple_cons44 = null;

        RecTranslator.pair_cons_return pair_cons45 = null;

        RecTranslator.set_cons_return set_cons46 = null;

        RecTranslator.node_cons_return node_cons47 = null;

        RecTranslator.xor_cons_return xor_cons48 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:497:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:497:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1176);
                    triple_cons44=triple_cons();

                    state._fsp--;

                     retval.value = (triple_cons44!=null?triple_cons44.value:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:498:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1183);
                    pair_cons45=pair_cons();

                    state._fsp--;

                     retval.value = (pair_cons45!=null?pair_cons45.value:null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:499:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1190);
                    set_cons46=set_cons();

                    state._fsp--;

                     retval.value = (set_cons46!=null?set_cons46.value:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:500:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1198);
                    node_cons47=node_cons();

                    state._fsp--;

                     retval.value = (node_cons47!=null?node_cons47.value:null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:501:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1205);
                    xor_cons48=xor_cons();

                    state._fsp--;

                     retval.value = (xor_cons48!=null?xor_cons48.value:null); 

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:510:1: attribute_call[String var] returns [String value] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS ID ) | OP_FST | OP_SND | OP_TRD | ID );
    public final RecTranslator.attribute_call_return attribute_call(String var) throws RecognitionException {
        RecTranslator.attribute_call_return retval = new RecTranslator.attribute_call_return();
        retval.start = input.LT(1);

        CommonTree INT49=null;
        CommonTree INT50=null;


        	String value = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:514:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS ID ) | OP_FST | OP_SND | OP_TRD | ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:514:4: ^( OP_IN ( INT )? )
                    {
                    match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1235); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:514:12: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:514:12: INT
                                {
                                INT49=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1237); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if ((INT49!=null?INT49.getText():null) != null){
                    			value = "getIn(" + (INT49!=null?INT49.getText():null) + ")";
                    		}
                    		else{
                    			value = "getInodes()";
                    		}
                    		
                    		retval.value = value;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:526:4: ^( OP_OUT ( INT )? )
                    {
                    match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1250); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:526:13: ( INT )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==INT) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:526:13: INT
                                {
                                INT50=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1252); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if ((INT50!=null?INT50.getText():null) != null){
                    			value = "getOut(" + (INT50!=null?INT50.getText():null) + ")";
                    		}
                    		else{
                    			value = "getOnodes()";
                    		}
                    		
                    		retval.value = value;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:538:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1264); 
                     retval.value = "getId()"; 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:539:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1273); 
                     retval.value = "getNodes()"; 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:540:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1281); 
                     retval.value = "getNames()"; 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:541:4: ^( OP_ENDS ID )
                    {
                    match(input,OP_ENDS,FOLLOW_OP_ENDS_in_attribute_call1290); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_attribute_call1292); 

                    match(input, Token.UP, null); 
                     retval.value = "getEnds()"; 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:542:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1301); 
                     retval.value = "fst()"; 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:543:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1309); 
                     retval.value = "snd()"; 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:544:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1317); 
                     retval.value = "trd()"; 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:545:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_attribute_call1325); 

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
        public String value;
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "triple_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:549:1: triple_cons returns [String value, String dt] : ^( TRIPLE expression expression expression ) ;
    public final RecTranslator.triple_cons_return triple_cons() throws RecognitionException {
        RecTranslator.triple_cons_return retval = new RecTranslator.triple_cons_return();
        retval.start = input.LT(1);


        	String dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:553:2: ( ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:553:4: ^( TRIPLE expression expression expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1348); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1350);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1352);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1354);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            		retval.dt = "Triple<" + dt + ", " + dt + ", " + dt + ">";
            	

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
        public String value;
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pair_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:560:1: pair_cons returns [String value, String dt] : ^( PAIR expression expression ) ;
    public final RecTranslator.pair_cons_return pair_cons() throws RecognitionException {
        RecTranslator.pair_cons_return retval = new RecTranslator.pair_cons_return();
        retval.start = input.LT(1);


        	String dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:564:2: ( ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:564:4: ^( PAIR expression expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons1380); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1382);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons1384);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            		retval.dt = "Pair<" + dt + ", " + dt + ">";
            	

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
        public String value;
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "set_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:572:1: set_cons returns [String value, String dt] : ^( SET ( expression )* ) ;
    public final RecTranslator.set_cons_return set_cons() throws RecognitionException {
        RecTranslator.set_cons_return retval = new RecTranslator.set_cons_return();
        retval.start = input.LT(1);


        	String dt = "";
        	String value = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:577:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:577:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons1412); 


            		value += "new " + ((declaration_scope)declaration_stack.peek()).dt + "();\n"; //rever
            	

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:582:2: ( expression )*
                loop27:
                do {
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=OP_PATH && LA27_0<=OP_UPDATE)||(LA27_0>=OP_UNION && LA27_0<=OP_MINUS)||LA27_0==ID||(LA27_0>=TRIPLE && LA27_0<=XOR)||LA27_0==ACCESS) ) {
                        alt27=1;
                    }


                    switch (alt27) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:582:2: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1421);
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

            		retval.dt = "LinkedHashSet<" + dt + ">";
            	

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
        public String value;
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:590:1: node_cons returns [String value, String dt] : ^( NODE ( ID )+ ) ;
    public final RecTranslator.node_cons_return node_cons() throws RecognitionException {
        RecTranslator.node_cons_return retval = new RecTranslator.node_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:591:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:591:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1448); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:591:11: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:591:11: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_node_cons1450); 

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

            		retval.dt = "Node";
            	

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
        public String value;
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:597:1: xor_cons returns [String value, String dt] : ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) ;
    public final RecTranslator.xor_cons_return xor_cons() throws RecognitionException {
        RecTranslator.xor_cons_return retval = new RecTranslator.xor_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:598:2: ( ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:598:4: ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons1472); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons1476); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1478); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:598:19: ( ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:598:19: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1480); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,OUT,FOLLOW_OUT_in_xor_cons1485); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1487); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:598:33: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:598:33: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1489); 

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

            		retval.dt = "Node";
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:606:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final RecTranslator.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecTranslator.applicaiton_def_return retval = new RecTranslator.applicaiton_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:607:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:607:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1510); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1512);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:607:29: ( trigger_def )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_BLOCK_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:607:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1514);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:610:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final RecTranslator.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecTranslator.list_reconfigurations_return retval = new RecTranslator.list_reconfigurations_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:611:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:611:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:611:4: ( reconfiguration_call )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:611:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1527);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:614:1: trigger_def : trigger_block ;
    public final RecTranslator.trigger_def_return trigger_def() throws RecognitionException {
        RecTranslator.trigger_def_return retval = new RecTranslator.trigger_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:615:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:615:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1541);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:618:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecTranslator.trigger_block_return trigger_block() throws RecognitionException {
        RecTranslator.trigger_block_return retval = new RecTranslator.trigger_block_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:619:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:619:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1553); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1555); 

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
    public static final BitSet FOLLOW_ID_in_reconfiguration_def170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def247 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def303 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_SET_in_other_type397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PAIR_in_other_type408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_TRIPLE_in_other_type416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids450 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block496 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block499 = new BitSet(new long[]{0x0000000800000008L,0x0000000000007000L});
    public static final BitSet FOLLOW_declaration_in_instruction533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply581 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply590 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration617 = new BitSet(new long[]{0x1000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_var_def_in_declaration627 = new BitSet(new long[]{0x1000000000000008L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_var_def655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment682 = new BitSet(new long[]{0x1000007800600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call740 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call764 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call842 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args897 = new BitSet(new long[]{0x1000007000600002L,0x00000000004F8000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction934 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction936 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction947 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction960 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression993 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_expression997 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1009 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1013 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_expression1017 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression1029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1033 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_expression1037 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1120 = new BitSet(new long[]{0x10000000FF800000L,0x0000000000800000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1129 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1133 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1237 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ENDS_in_attribute_call1290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_attribute_call1292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1350 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1352 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1382 = new BitSet(new long[]{0x1000007000600000L,0x00000000004F8000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1421 = new BitSet(new long[]{0x1000007000600008L,0x00000000004F8000L});
    public static final BitSet FOLLOW_NODE_in_node_cons1448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1450 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons1472 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons1476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1478 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_xor_cons1480 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons1485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1487 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1489 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1510 = new BitSet(new long[]{0x10000000001F8000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1512 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1527 = new BitSet(new long[]{0x10000000001F8002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1553 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1555 = new BitSet(new long[]{0x0000000000000002L});

}