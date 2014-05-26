// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g 2014-05-22 21:28:45

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.*;
	//import pt.uminho.di.reolang.reclang.PkgConstants;
	import java.util.Set;
	import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class RecTranslator extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "RW_MAIN", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_XOR", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_ENDS", "OP_NODES", "OP_NAMES", "OP_CHANNELS", "OP_READ", "OP_WRITE", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", "CONS_SET", "CONS_NODE", "CONS_XOR", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "ARGUMENTS", "ARGUMENT", "SUBTYPE", "INSTRUCTIONS", "DECLARATION", "ASSIGNMENT", "FORALL", "TRIPLE", "PAIR", "SET", "NODE", "XOR", "IN", "OUT", "ACCESS", "STRUCTURE", "APPLICATION", "MAIN", "IDS", "SIGNATURE"
    };
    public static final int OP_NODES=31;
    public static final int MAIN=90;
    public static final int CONS_PAIR=56;
    public static final int SEP_OPTIONAL=48;
    public static final int CONS_NODE=59;
    public static final int APPLICATION=89;
    public static final int SEP_SUBTYPE_END=53;
    public static final int SEP_COLON=45;
    public static final int OP_TRD=26;
    public static final int OCTAL_ESC=69;
    public static final int OP_JOIN=17;
    public static final int DT_PAIR=14;
    public static final int IDS=91;
    public static final int OP_INTERSECTION=38;
    public static final int SUBTYPE=75;
    public static final int ID=61;
    public static final int EOF=-1;
    public static final int DECLARATION=77;
    public static final int DT_NODE=11;
    public static final int STRUCTURE=88;
    public static final int DT_SET=13;
    public static final int OP_ID=21;
    public static final int INSTRUCTIONS=76;
    public static final int IMPORT=71;
    public static final int ESC_SEQ=65;
    public static final int SEP_ACCESSOR=54;
    public static final int IN=85;
    public static final int OP_MINUS=39;
    public static final int RECONFIGS=70;
    public static final int DT_XOR=12;
    public static final int RW_FORALL=5;
    public static final int ARGUMENT=74;
    public static final int SEP_LIST_START=50;
    public static final int RW_RECONFIGURATION=4;
    public static final int ACCESS=87;
    public static final int SEP_ARGS_END=47;
    public static final int OP_FST=24;
    public static final int PAIR=81;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=30;
    public static final int OP_APPLY=36;
    public static final int TRIPLE=80;
    public static final int COMMENT=63;
    public static final int OP_PATH=22;
    public static final int OP_SND=25;
    public static final int SEP_LIST_END=51;
    public static final int OP_OUT=28;
    public static final int OP_SPLIT=18;
    public static final int SEP_STRUCTURE=55;
    public static final int CONS_SET=58;
    public static final int XOR=84;
    public static final int OP_NAMES=32;
    public static final int ARGUMENTS=73;
    public static final int NODE=83;
    public static final int SEP_COMMA=43;
    public static final int DT_TRIPLE=15;
    public static final int SEP_ARGS_START=46;
    public static final int OP_UPDATE=23;
    public static final int SEP_BLOCK_START=41;
    public static final int UNICODE_ESC=68;
    public static final int OP_PAR=16;
    public static final int OP_REMOVE=19;
    public static final int FORALL=79;
    public static final int HEX_DIGIT=67;
    public static final int SET=82;
    public static final int INT=62;
    public static final int SIGNATURE=92;
    public static final int OP_IN=27;
    public static final int OP_WRITE=35;
    public static final int CONS_XOR=60;
    public static final int OP_READ=34;
    public static final int RECONFIGURATION=72;
    public static final int WS=64;
    public static final int OP_CHANNELS=33;
    public static final int OUT=86;
    public static final int CONS_TRIPLE=57;
    public static final int SEP_SUBTYPE_START=52;
    public static final int SEP_SEMICOLON=44;
    public static final int RW_MAIN=7;
    public static final int SEP_BLOCK_END=42;
    public static final int OP_CONST=20;
    public static final int DT_PATTERN=8;
    public static final int OP_EQUAL=40;
    public static final int ASSIGNMENT=78;
    public static final int OP_NAME=29;
    public static final int DT_CHANNEL=9;
    public static final int OP_UNION=37;
    public static final int SEP_TRIGGER=49;
    public static final int STRING=66;
    public static final int DT_NAME=10;

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




    	private HashMap<String,String> reconfigurations;
    	
    	public HashMap<String,String> getReconfigurations(){
    		return this.reconfigurations;
    	}
    	
    	
    	private String datatypeToString(List<String> full_dt){
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
    	
    	private List<String> convertRecooplaDatatype(List<Type> recoopla_datatype){
    		List<String> datatype = new ArrayList<String>();
    		for (Type t : recoopla_datatype){
    			String type = t.toString().toLowerCase();
    			type = Character.toUpperCase(type.charAt(0)) + type.substring(1);
    						
    			//convert ReCooPLa datatypes to java datatypes
    			type = type.replace("Set", "LinkedHashSet").replace("Pattern", "CoordinationPattern2").replace("Channel", "CommunicationMean2").replace("Name", "String");
    			
    			datatype.add(type);
    		}
    		return datatype;
    	}
    	
    	//convert list args to string, separated by ','
    	private String listToString(List<String> args){
    		String sep = "";
    		String values = "";
    		for (String a : args){
    			values += sep;
    			values += a;
    			
    		        sep = ", ";
    		}
    		return values;
    	}
    	
    	private TinySymbolsTable getScope(Integer id){
    		TinySymbolsTable scope = null;
    		for (int i = 0; i < ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.size(); i++){
    			TinySymbolsTable tst = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.get(i);
    			if ( tst.getScopeRel().fst().equals(id) ) {
    				scope = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.get(i);
    				break;
    			}
    		}
    		return scope;
    	}


    protected static class reclang_scope {
        TinySymbolsTable ids_table;
        int scope_id;
        int parent_id;
        int aux_id;
        List<Integer> scopes;
    }
    protected Stack reclang_stack = new Stack();

    public static class reclang_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:95:1: reclang[TinySymbolsTable identifiers_table] : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final RecTranslator.reclang_return reclang(TinySymbolsTable identifiers_table) throws RecognitionException {
        reclang_stack.push(new reclang_scope());
        RecTranslator.reclang_return retval = new RecTranslator.reclang_return();
        retval.start = input.LT(1);

        RecTranslator.element_return element1 = null;



        	((reclang_scope)reclang_stack.peek()).ids_table = identifiers_table;
        	this.reconfigurations = new HashMap<String, String>();
        	
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	((reclang_scope)reclang_stack.peek()).parent_id = 0;
        	((reclang_scope)reclang_stack.peek()).aux_id = 0;
        	
        	((reclang_scope)reclang_stack.peek()).scopes = new ArrayList<Integer>(); //LinkedList or Stack
        	((reclang_scope)reclang_stack.peek()).scopes.add(0);
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:116:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:116:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang67); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:116:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:116:16: directive_def
                	    {
                	    pushFollow(FOLLOW_directive_def_in_reclang69);
                	    directive_def();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:116:31: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||(LA2_0>=APPLICATION && LA2_0<=MAIN)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:116:32: element
                	    {
                	    pushFollow(FOLLOW_element_in_reclang73);
                	    element1=element();

                	    state._fsp--;

                	    	
                	    		this.reconfigurations.put((element1!=null?element1.name:null), (element1!=null?element1.st:null).toString()); 
                	    	

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
            reclang_stack.pop();
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:127:1: directive_def : directive_import ;
    public final RecTranslator.directive_def_return directive_def() throws RecognitionException {
        RecTranslator.directive_def_return retval = new RecTranslator.directive_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:128:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:128:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def97);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:132:1: directive_import : ^( IMPORT STRING ) ;
    public final RecTranslator.directive_import_return directive_import() throws RecognitionException {
        RecTranslator.directive_import_return retval = new RecTranslator.directive_import_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:133:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:133:4: ^( IMPORT STRING )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import111); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_directive_import113); 

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
        public String name;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "element"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:141:1: element returns [String name] : ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st} | ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st} | ^( MAIN main_def ) );
    public final RecTranslator.element_return element() throws RecognitionException {
        RecTranslator.element_return retval = new RecTranslator.element_return();
        retval.start = input.LT(1);

        RecTranslator.reconfiguration_def_return reconfiguration_def2 = null;

        RecTranslator.applicaiton_def_return applicaiton_def3 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:142:2: ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st} | ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st} | ^( MAIN main_def ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RECONFIGURATION:
                {
                alt3=1;
                }
                break;
            case APPLICATION:
                {
                alt3=2;
                }
                break;
            case MAIN:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:142:4: ^( RECONFIGURATION reconfiguration_def )
                    {
                    match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element135); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_reconfiguration_def_in_element137);
                    reconfiguration_def2=reconfiguration_def();

                    state._fsp--;


                    		retval.name = (reconfiguration_def2!=null?reconfiguration_def2.id:null);
                    	

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 147:2: -> {$reconfiguration_def.st}
                    {
                        retval.st = (reconfiguration_def2!=null?reconfiguration_def2.st:null);
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:149:4: ^( APPLICATION applicaiton_def )
                    {
                    match(input,APPLICATION,FOLLOW_APPLICATION_in_element156); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_applicaiton_def_in_element158);
                    applicaiton_def3=applicaiton_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 150:2: -> {$applicaiton_def.st}
                    {
                        retval.st = (applicaiton_def3!=null?applicaiton_def3.st:null);
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:152:4: ^( MAIN main_def )
                    {
                    match(input,MAIN,FOLLOW_MAIN_in_element174); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_main_def_in_element176);
                    main_def();

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
    // $ANTLR end "element"

    protected static class reconfiguration_def_scope {
        TinySymbol name;
        ArrayList<TinySymbolsTable> scopes;
        List<String> datatype;
        String class_name;
        List<String> args;
        //body	
        	Set<String> reconfs;
        List<String> insts;
        //tabs
        	String adv;
    }
    protected Stack reconfiguration_def_stack = new Stack();

    public static class reconfiguration_def_return extends TreeRuleReturnScope {
        public String id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:157:1: reconfiguration_def returns [String id] : ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st);
    public final RecTranslator.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
        reconfiguration_def_stack.push(new reconfiguration_def_scope());
        RecTranslator.reconfiguration_def_return retval = new RecTranslator.reconfiguration_def_return();
        retval.start = input.LT(1);

        CommonTree ID4=null;
        RecTranslator.args_def_return args_def5 = null;

        RecTranslator.reconfiguration_block_return reconfiguration_block6 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name = new TinySymbol();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = new ArrayList<TinySymbolsTable>();
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name = "";
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args = new ArrayList<String>();
        	
        	//body
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs = new HashSet<String>();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts = new ArrayList<String>();
        	
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:187:2: ( ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:187:4: ^( ID ( args_def )? reconfiguration_block[false] )
            {
            ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def201); 


            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name = Character.toUpperCase((ID4!=null?ID4.getText():null).charAt(0)) + (ID4!=null?ID4.getText():null).substring(1);
            		
            		TinySymbol ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get((ID4!=null?ID4.getText():null));
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name = ts;
            		retval.id = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name;
            		
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
            	

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:198:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:198:2: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def210);
                    args_def5=args_def();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def213);
            reconfiguration_block6=reconfiguration_block(false);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 198:43: -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st)
            {
                retval.st = templateLib.getInstanceOf("mkclass",
              new STAttrMap().put("name", ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name).put("fields", (args_def5!=null?args_def5.values:null)).put("constructor", (args_def5!=null?args_def5.st:null)).put("method", (reconfiguration_block6!=null?reconfiguration_block6.st:null)));
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:202:1: args_def returns [List<String> values] : ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids);
    public final RecTranslator.args_def_return args_def() throws RecognitionException {
        RecTranslator.args_def_return retval = new RecTranslator.args_def_return();
        retval.start = input.LT(1);

        RecTranslator.arg_def_return arg_def7 = null;



        	List<String> ctfields = new ArrayList<String>();
        	List<String> ids = new ArrayList<String>();
        	List<String> dts = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:208:2: ( ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:208:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def260); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:209:2: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:209:3: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def265);
            	    arg_def7=arg_def();

            	    state._fsp--;


            	    		ctfields.add((arg_def7!=null?arg_def7.st:null).toString());
            	    		ids.addAll((arg_def7!=null?arg_def7.values:null));
            	    		for (int i = 0; i < (arg_def7!=null?arg_def7.values:null).size(); i++){
            	    			dts.add((arg_def7!=null?arg_def7.datatype:null));
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
            // 222:2: -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids)
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:225:1: arg_def returns [String datatype, List<String> values] : ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st};
    public final RecTranslator.arg_def_return arg_def() throws RecognitionException {
        RecTranslator.arg_def_return retval = new RecTranslator.arg_def_return();
        retval.start = input.LT(1);

        RecTranslator.list_ids_return list_ids8 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:229:2: ( ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st})
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:229:4: ^( ARGUMENT datatype list_ids[dt] )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def319); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def321);
            datatype();

            state._fsp--;


            		String dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            pushFollow(FOLLOW_list_ids_in_arg_def328);
            list_ids8=list_ids(dt);

            state._fsp--;


            match(input, Token.UP, null); 

            		retval.values = (list_ids8!=null?list_ids8.values:null);
            		retval.datatype = dt;
            	


            // TEMPLATE REWRITE
            // 239:2: -> {$list_ids.st}
            {
                retval.st = (list_ids8!=null?list_ids8.st:null);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:242:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final RecTranslator.datatype_return datatype() throws RecognitionException {
        RecTranslator.datatype_return retval = new RecTranslator.datatype_return();
        retval.start = input.LT(1);

        RecTranslator.other_type_return other_type9 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:243:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:243:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype353); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CoordinationPattern2"); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:244:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype360); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CommunicationMean2"); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:245:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype367); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("String"); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:246:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype375); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:247:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype382); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:248:4: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype393);
                    other_type9=other_type();

                    state._fsp--;


                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add((other_type9!=null?other_type9.name:null)); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype398);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:252:1: other_type returns [String name] : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final RecTranslator.other_type_return other_type() throws RecognitionException {
        RecTranslator.other_type_return retval = new RecTranslator.other_type_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:253:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:253:4: DT_SET
                    {
                    match(input,DT_SET,FOLLOW_DT_SET_in_other_type415); 
                     retval.name = "LinkedHashSet"; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:254:4: DT_PAIR
                    {
                    match(input,DT_PAIR,FOLLOW_DT_PAIR_in_other_type426); 
                     retval.name = "Pair"; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:255:4: DT_TRIPLE
                    {
                    match(input,DT_TRIPLE,FOLLOW_DT_TRIPLE_in_other_type434); 
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:258:1: subtype : datatype ;
    public final RecTranslator.subtype_return subtype() throws RecognitionException {
        RecTranslator.subtype_return retval = new RecTranslator.subtype_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:259:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:259:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype447);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:262:1: list_ids[String dt] returns [List<String> values] : ( ID )+ -> list_fields(datatype=$list_ids.dtids=ids);
    public final RecTranslator.list_ids_return list_ids(String dt) throws RecognitionException {
        RecTranslator.list_ids_return retval = new RecTranslator.list_ids_return();
        retval.start = input.LT(1);

        CommonTree ID10=null;


        	List<String> ids = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:266:2: ( ( ID )+ -> list_fields(datatype=$list_ids.dtids=ids))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:266:3: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:266:3: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:266:4: ID
            	    {
            	    ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids468); 

            	    		ids.add("_" + (ID10!=null?ID10.getText():null));
            	    		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.add((ID10!=null?ID10.getText():null));
            	    	

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
            // 277:2: -> list_fields(datatype=$list_ids.dtids=ids)
            {
                retval.st = templateLib.getInstanceOf("list_fields",
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:282:1: reconfiguration_block[boolean isForall] : ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts);
    public final RecTranslator.reconfiguration_block_return reconfiguration_block(boolean isForall) throws RecognitionException {
        RecTranslator.reconfiguration_block_return retval = new RecTranslator.reconfiguration_block_return();
        retval.start = input.LT(1);

        RecTranslator.instruction_return instruction11 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:283:2: ( ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:283:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block514); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:283:19: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:283:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block517);
            	    instruction11=instruction();

            	    state._fsp--;


            	    		if (isForall){
            	    			((for_instruction_scope)for_instruction_stack.peek()).insts.add((instruction11!=null?instruction11.value:null));
            	    		}
            	    		else{
            	    			((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts.add((instruction11!=null?instruction11.value:null));
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
            // 293:4: -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts)
            {
                retval.st = templateLib.getInstanceOf("apply_method",
              new STAttrMap().put("reconfs", ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs).put("insts", ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts));
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

    protected static class instruction_scope {
        TinySymbolsTable scope;
        String dt;
    }
    protected Stack instruction_stack = new Stack();

    public static class instruction_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:296:1: instruction returns [String value] : ( declaration | assignment | reconfiguration_apply[false] | for_instruction );
    public final RecTranslator.instruction_return instruction() throws RecognitionException {
        instruction_stack.push(new instruction_scope());
        RecTranslator.instruction_return retval = new RecTranslator.instruction_return();
        retval.start = input.LT(1);

        RecTranslator.declaration_return declaration12 = null;

        RecTranslator.assignment_return assignment13 = null;

        RecTranslator.reconfiguration_apply_return reconfiguration_apply14 = null;

        RecTranslator.for_instruction_return for_instruction15 = null;



        	((instruction_scope)instruction_stack.peek()).scope = this.getScope( ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1) ); //rever
        	((instruction_scope)instruction_stack.peek()).dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:305:2: ( declaration | assignment | reconfiguration_apply[false] | for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:305:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction563);
                    declaration12=declaration();

                    state._fsp--;

                     retval.value = (declaration12!=null?declaration12.value:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:306:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_instruction572);
                    assignment13=assignment();

                    state._fsp--;

                     retval.value = (assignment13!=null?assignment13.value:null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:307:4: reconfiguration_apply[false]
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction581);
                    reconfiguration_apply14=reconfiguration_apply(false);

                    state._fsp--;

                     retval.value = (reconfiguration_apply14!=null?reconfiguration_apply14.value:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:308:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction589);
                    for_instruction15=for_instruction();

                    state._fsp--;

                     
                    		retval.value = (for_instruction15!=null?for_instruction15.value:null); 

                    		((reclang_scope)reclang_stack.peek()).scopes.remove(((reclang_scope)reclang_stack.peek()).scopes.size()-1);
                    		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1);
                    		((reclang_scope)reclang_stack.peek()).aux_id--;
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            instruction_stack.pop();
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:318:1: reconfiguration_apply[boolean isAssignment] returns [String value] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final RecTranslator.reconfiguration_apply_return reconfiguration_apply(boolean isAssignment) throws RecognitionException {
        RecTranslator.reconfiguration_apply_return retval = new RecTranslator.reconfiguration_apply_return();
        retval.start = input.LT(1);

        RecTranslator.reconfiguration_call_return reconfiguration_call16 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:319:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:319:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply611); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply613);
            reconfiguration_call16=reconfiguration_call();

            state._fsp--;


            		String op = (reconfiguration_call16!=null?reconfiguration_call16.name:null);
            		//eg: par -> P + ar = Par
            		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs.add(class_name + " " + op + ";");
            		
            		String args = (reconfiguration_call16!=null?reconfiguration_call16.args:null);
            		
            		String rec = "";
            		if (isAssignment){
            			String var_name = "_" + ((assignment_scope)assignment_stack.peek()).ts.getId();
            			String dt = ((instruction_scope)instruction_stack.peek()).dt;
            			//List<String> dt = new ArrayList<String>( this.convertRecooplaDatatype( ((assignment_scope)assignment_stack.peek()).ts.getDataType() ) );
            			//String datatype = datatypeToString(dt);
            			rec = op + " = new " + class_name + "(" + args + ");\n";
            			rec += "final " + dt + var_name + " = " + op + ".apply($cp)"; //add template
            		}
            		else{
            			rec = op + " = new " + class_name + "(" + args + ");\n" + op + ".apply($cp)"; //add template
            		}
            		
            		retval.value = rec + ";";
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:344:2: ( ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:344:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply622); 

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:347:1: declaration returns [String value] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final RecTranslator.declaration_return declaration() throws RecognitionException {
        RecTranslator.declaration_return retval = new RecTranslator.declaration_return();
        retval.start = input.LT(1);

        RecTranslator.var_def_return var_def17 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();
        	
        	List<String> decls = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:353:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:353:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration644); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration646);
            datatype();

            state._fsp--;


            		((instruction_scope)instruction_stack.peek()).dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype) + " ";
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:358:2: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:358:3: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration656);
            	    var_def17=var_def();

            	    state._fsp--;

            	    	
            	    		if ((var_def17!=null?var_def17.isRec:false)) {
            	    			decls.add((var_def17!=null?var_def17.value:null));
            	    		}
            	    		else {
            	    			if ((var_def17!=null?var_def17.isAssignment:false)){
            	    				decls.add("final " + ((instruction_scope)instruction_stack.peek()).dt + (var_def17!=null?var_def17.value:null));
            	    			}
            	    			else {
            	    				String v = (var_def17!=null?var_def17.value:null);
            	    				v = v.substring(0, v.length()-1); //remove ';'
            	    				decls.add("final " + ((instruction_scope)instruction_stack.peek()).dt + v + " = null;");
            	    			}
            	    		}
            	    	

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
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class var_def_return extends TreeRuleReturnScope {
        public String value;
        public boolean isRec;
        public boolean isAssignment;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:386:1: var_def returns [String value, boolean isRec, boolean isAssignment] : ( ID | assignment );
    public final RecTranslator.var_def_return var_def() throws RecognitionException {
        RecTranslator.var_def_return retval = new RecTranslator.var_def_return();
        retval.start = input.LT(1);

        CommonTree ID18=null;
        RecTranslator.assignment_return assignment19 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:387:2: ( ID | assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:387:4: ID
                    {
                    ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def684); 
                     
                    		retval.value = "_" + (ID18!=null?ID18.getText():null) + ";"; 
                    		retval.isAssignment = false;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:393:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_var_def695);
                    assignment19=assignment();

                    state._fsp--;

                     
                    		retval.value = (assignment19!=null?assignment19.value:null);
                    		retval.isRec = (assignment19!=null?assignment19.isRec:false);		
                    		retval.isAssignment = true;
                    		
                    	

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

    protected static class assignment_scope {
        TinySymbol ts;
    }
    protected Stack assignment_stack = new Stack();

    public static class assignment_return extends TreeRuleReturnScope {
        public String value;
        public boolean isRec;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:402:1: assignment returns [String value, boolean isRec] : ^( ASSIGNMENT ID assignment_member ) ;
    public final RecTranslator.assignment_return assignment() throws RecognitionException {
        assignment_stack.push(new assignment_scope());
        RecTranslator.assignment_return retval = new RecTranslator.assignment_return();
        retval.start = input.LT(1);

        CommonTree ID20=null;
        RecTranslator.assignment_member_return assignment_member21 = null;



        	((assignment_scope)assignment_stack.peek()).ts = new TinySymbol();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:409:2: ( ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:409:4: ^( ASSIGNMENT ID assignment_member )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment722); 

            match(input, Token.DOWN, null); 
            ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment724); 

            		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();	
            		((assignment_scope)assignment_stack.peek()).ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID20!=null?ID20.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);	
            	
            pushFollow(FOLLOW_assignment_member_in_assignment733);
            assignment_member21=assignment_member();

            state._fsp--;


            		if ((assignment_member21!=null?assignment_member21.isRec:false)) {
            			retval.value = (assignment_member21!=null?assignment_member21.value:null);
            		}
            		else{	
            			retval.value = "_" + (ID20!=null?ID20.getText():null) + " = " + (assignment_member21!=null?assignment_member21.value:null) + ";";
            		}
            		retval.isRec = (assignment_member21!=null?assignment_member21.isRec:false);
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            assignment_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class assignment_member_return extends TreeRuleReturnScope {
        public String value;
        public boolean isRec;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignment_member"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:428:1: assignment_member returns [String value, boolean isRec] : ( expression | reconfiguration_apply[true] );
    public final RecTranslator.assignment_member_return assignment_member() throws RecognitionException {
        RecTranslator.assignment_member_return retval = new RecTranslator.assignment_member_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression22 = null;

        RecTranslator.reconfiguration_apply_return reconfiguration_apply23 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:429:2: ( expression | reconfiguration_apply[true] )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:429:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member756);
                    expression22=expression();

                    state._fsp--;

                     
                    		//conditional isOp -> if (isOp) { retval.value = " bla bla" + (expression22!=null?expression22.value:null);}
                    		retval.value = (expression22!=null?expression22.value:null);
                    		retval.isRec = false;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:436:4: reconfiguration_apply[true]
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member770);
                    reconfiguration_apply23=reconfiguration_apply(true);

                    state._fsp--;

                     
                    		retval.value = (reconfiguration_apply23!=null?reconfiguration_apply23.value:null);
                    		retval.isRec = true; 	
                    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:443:1: reconfiguration_call returns [String name, String args] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final RecTranslator.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecTranslator.reconfiguration_call_return retval = new RecTranslator.reconfiguration_call_return();
        retval.start = input.LT(1);

        CommonTree OP_JOIN24=null;
        CommonTree OP_SPLIT26=null;
        CommonTree OP_PAR28=null;
        CommonTree OP_REMOVE30=null;
        CommonTree OP_CONST32=null;
        CommonTree OP_ID34=null;
        CommonTree ID35=null;
        RecTranslator.operation_args_return operation_args25 = null;

        RecTranslator.operation_args_return operation_args27 = null;

        RecTranslator.operation_args_return operation_args29 = null;

        RecTranslator.operation_args_return operation_args31 = null;

        RecTranslator.operation_args_return operation_args33 = null;

        RecTranslator.operation_args_return operation_args36 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:444:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:444:4: ^( OP_JOIN operation_args )
                    {
                    OP_JOIN24=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call791); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call793);
                        operation_args25=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_JOIN24!=null?OP_JOIN24.getText():null);
                    		retval.args = (operation_args25!=null?operation_args25.values:null);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:449:4: ^( OP_SPLIT operation_args )
                    {
                    OP_SPLIT26=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call803); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call805);
                        operation_args27=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_SPLIT26!=null?OP_SPLIT26.getText():null);
                    		retval.args = (operation_args27!=null?operation_args27.values:null);
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:454:4: ^( OP_PAR operation_args )
                    {
                    OP_PAR28=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call815); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call817);
                        operation_args29=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_PAR28!=null?OP_PAR28.getText():null);
                    		retval.args = (operation_args29!=null?operation_args29.values:null);
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:459:4: ^( OP_REMOVE operation_args )
                    {
                    OP_REMOVE30=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call827); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call829);
                        operation_args31=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_REMOVE30!=null?OP_REMOVE30.getText():null);
                    		retval.args = (operation_args31!=null?operation_args31.values:null);
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:464:4: ^( OP_CONST operation_args )
                    {
                    OP_CONST32=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call839); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call841);
                        operation_args33=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_CONST32!=null?OP_CONST32.getText():null);
                    		retval.args = (operation_args33!=null?operation_args33.values:null);
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:469:4: ^( OP_ID operation_args )
                    {
                    OP_ID34=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call851); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call853);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_ID34!=null?OP_ID34.getText():null);
                    		retval.args = ""; //id does not have args
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:474:4: ^( ID operation_args )
                    {
                    ID35=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call863); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call865);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:482:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final RecTranslator.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecTranslator.structure_operation_call_return retval = new RecTranslator.structure_operation_call_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:483:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:483:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call884); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call886);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:484:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call893); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call895);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:488:1: operation_args returns [String values] : ( args )? ;
    public final RecTranslator.operation_args_return operation_args() throws RecognitionException {
        RecTranslator.operation_args_return retval = new RecTranslator.operation_args_return();
        retval.start = input.LT(1);

        RecTranslator.args_return args37 = null;



        	String args = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:492:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:492:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:492:4: ( args )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=XOR)||LA17_0==ACCESS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:492:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args918);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:503:1: args returns [String values] : ( expression )+ ;
    public final RecTranslator.args_return args() throws RecognitionException {
        RecTranslator.args_return retval = new RecTranslator.args_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression38 = null;



        	List<String> args = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:507:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:507:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:507:4: ( expression )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:507:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args950);
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
            		retval.values = listToString(args);
            	

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
        TinySymbolsTable forall_table;
    }
    protected Stack for_instruction_stack = new Stack();

    public static class for_instruction_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:520:1: for_instruction returns [String value] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) ;
    public final RecTranslator.for_instruction_return for_instruction() throws RecognitionException {
        for_instruction_stack.push(new for_instruction_scope());
        RecTranslator.for_instruction_return retval = new RecTranslator.for_instruction_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;


        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv += "\t";
        	
        	((for_instruction_scope)for_instruction_stack.peek()).insts = new ArrayList<String>();
        	
        	
        	if (((reclang_scope)reclang_stack.peek()).scopes.contains(((reclang_scope)reclang_stack.peek()).aux_id)){
        		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).aux_id;
        	}
        	else{
        		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1);
        	}
        	((reclang_scope)reclang_stack.peek()).scope_id++;
        	
        	((reclang_scope)reclang_stack.peek()).scopes.add(((reclang_scope)reclang_stack.peek()).scope_id);
        	((reclang_scope)reclang_stack.peek()).aux_id++;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:545:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:545:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction989); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction991);
            datatype();

            state._fsp--;


            		String dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction1002); 
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction1006); 

            		((instruction_scope)instruction_stack.peek()).scope = this.getScope(((reclang_scope)reclang_stack.peek()).parent_id); //rever
            	
            		String value = "_" + (id1!=null?id1.getText():null);
            		
            		//name of set to iterate
            		String set_name = "";
            		/*
            		if (((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.contains((id2!=null?id2.getText():null))){
            			set_name = "this." + "_" + (id2!=null?id2.getText():null);
            		}
            		else{
            			set_name = "_" + (id2!=null?id2.getText():null);
            		}
            		*/
            		set_name = "_" + (id2!=null?id2.getText():null);
            	
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction1015);
            reconfiguration_block(true);

            state._fsp--;


            		//String adv = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv.substring(0, ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv.length() - 2);
            		String for_insts = "for(" + dt + " " + value + " : " + set_name + ") {\n"; //add template -> for(dt,v,set,insts)
            		
            		for (String i : ((for_instruction_scope)for_instruction_stack.peek()).insts) {
            			String[] parts = i.split("\n"); //separate instructions by line breaks
            			for (String p : parts){
            				for_insts += "\t" + p + "\n";
            			}
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
        public String dt;
        public boolean isOp;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:588:1: expression returns [String value, String dt, boolean isOp] : ( ^( OP_UNION s1= factor s2= factor ) | ^( OP_INTERSECTION s1= factor s2= factor ) | ^( OP_MINUS s1= factor s2= factor ) | factor );
    public final RecTranslator.expression_return expression() throws RecognitionException {
        RecTranslator.expression_return retval = new RecTranslator.expression_return();
        retval.start = input.LT(1);

        RecTranslator.factor_return s1 = null;

        RecTranslator.factor_return s2 = null;

        RecTranslator.factor_return factor39 = null;



        	String value = "";
        	
        	List<String> dt = new ArrayList<String>();
        	String datatype = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:595:2: ( ^( OP_UNION s1= factor s2= factor ) | ^( OP_INTERSECTION s1= factor s2= factor ) | ^( OP_MINUS s1= factor s2= factor ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:595:4: ^( OP_UNION s1= factor s2= factor )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression1044); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1048);
                    s1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1052);
                    s2=factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		dt = this.convertRecooplaDatatype( ((assignment_scope)assignment_stack.peek()).ts.getDataType() );
                    		datatype = this.datatypeToString(dt);
                    	
                    		value += "new " + datatype + "(" + (s1!=null?s1.value:null) + "){{ \n";
                    		
                    		value += "\taddAll( ";
                    		if ((s2!=null?s2.value:null).contains("\n")){
                    			String[] parts = (s2!=null?s2.value:null).split("\n"); //separate instructions by line breaks
                    			for (String p : parts){
                    				value += p + "\n\t\t";
                    			}
                    			value = value.substring(0, value.length()-1) + ");";
                    		}
                    		else {
                    			value += (s2!=null?s2.value:null) + " );";
                    		}
                    		value += "\n}}";
                    		
                    		retval.value = value;
                    				
                    		retval.dt = (s1!=null?s1.dt:null); //s1 and s2 have the same datatype
                    		retval.isOp = false; //true
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:621:4: ^( OP_INTERSECTION s1= factor s2= factor )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1064); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1068);
                    s1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1072);
                    s2=factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		dt = this.convertRecooplaDatatype( ((assignment_scope)assignment_stack.peek()).ts.getDataType() );
                    		datatype = this.datatypeToString(dt);
                    		
                    		//rever
                    		value += "new " + datatype + "(" + (s1!=null?s1.value:null) + "){{ \n";
                    		//value += "retainAll( " + (s1!=null?s1.value:null) + " ); \n}}";
                    		////value += "_" + ((assignment_scope)assignment_stack.peek()).ts.getId() + ".retainAll( " + (s2!=null?s2.value:null) + " )";
                    		value += "\tretainAll( ";
                    		if ((s2!=null?s2.value:null).contains("\n")){
                    			String[] parts = (s2!=null?s2.value:null).split("\n"); //separate instructions by line breaks
                    			for (String p : parts){
                    				value += p + "\n\t\t";
                    			}
                    			value = value.substring(0, value.length()-1) + ");";
                    		}
                    		else {
                    			value += (s2!=null?s2.value:null) + " );";
                    		}
                    		value += "\n}}";
                    		
                    		retval.value = value;
                    				
                    		retval.dt = (s1!=null?s1.dt:null); //s1 and s2 have the same datatype
                    		retval.isOp = false; //true
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:649:4: ^( OP_MINUS s1= factor s2= factor )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1084); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1088);
                    s1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1092);
                    s2=factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		dt = this.convertRecooplaDatatype( ((assignment_scope)assignment_stack.peek()).ts.getDataType() );
                    		datatype = this.datatypeToString(dt);
                    		
                    		//rever
                    		value += "new " + datatype + "(" + (s1!=null?s1.value:null) + "){{ \n";
                    		//value += "removeAll( " + (s1!=null?s1.value:null) + " ); \n}}";
                    		////value += "_" + ((assignment_scope)assignment_stack.peek()).ts.getId() + ".removeAll( " + (s2!=null?s2.value:null) + " )";
                    		value += "\tremoveAll( ";
                    		if ((s2!=null?s2.value:null).contains("\n")){
                    			String[] parts = (s2!=null?s2.value:null).split("\n"); //separate instructions by line breaks
                    			for (String p : parts){
                    				value += p + "\n\t\t";
                    			}
                    			value = value.substring(0, value.length()-1) + ");";
                    		}
                    		else {
                    			value += (s2!=null?s2.value:null) + " );";
                    		}
                    		value += "\n}}";
                    		
                    		retval.value = value;
                    				
                    		retval.dt = (s1!=null?s1.dt:null); //s1 and s2 have the same datatype
                    		retval.isOp = false; //true
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:677:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression1104);
                    factor39=factor();

                    state._fsp--;


                    		retval.value = (factor39!=null?factor39.value:null);
                    		retval.dt = (factor39!=null?factor39.dt:null);
                    		retval.isOp = false;		
                    	

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
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:686:1: factor returns [String value, String dt] : ( ^( ID ID ) | ID | operation | constructor );
    public final RecTranslator.factor_return factor() throws RecognitionException {
        RecTranslator.factor_return retval = new RecTranslator.factor_return();
        retval.start = input.LT(1);

        CommonTree ID40=null;
        RecTranslator.operation_return operation41 = null;

        RecTranslator.constructor_return constructor42 = null;



        	List<String> dt = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:690:2: ( ^( ID ID ) | ID | operation | constructor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:690:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1128); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1130); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:691:4: ID
                    {
                    ID40=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1136); 

                    		/*
                    		if (((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.contains((ID40!=null?ID40.getText():null))){
                    			retval.value = "this." + "_" + (ID40!=null?ID40.getText():null);
                    		}
                    		else{
                    			retval.value = "_" + (ID40!=null?ID40.getText():null);
                    		}
                    		*/
                    		retval.value = "_" + (ID40!=null?ID40.getText():null);
                    		
                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();	
                    		TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID40!=null?ID40.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID40!=null?ID40.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID40!=null?ID40.getText():null), s_id);	
                    		
                    		dt = this.convertRecooplaDatatype( ts.getDataType() );
                    		retval.dt = this.datatypeToString(dt);
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:709:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1145);
                    operation41=operation();

                    state._fsp--;

                     retval.value = (operation41!=null?operation41.value:null); 	retval.dt = (operation41!=null?operation41.dt:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:710:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1153);
                    constructor42=constructor();

                    state._fsp--;

                     retval.value = (constructor42!=null?constructor42.value:null); 	retval.dt = (constructor42!=null?constructor42.dt:null); 

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
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:713:1: operation returns [String value, String dt] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call );
    public final RecTranslator.operation_return operation() throws RecognitionException {
        RecTranslator.operation_return retval = new RecTranslator.operation_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        RecTranslator.attribute_call_return attribute_call43 = null;



        	String op = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:717:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:717:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1175); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1179); 

                    		op += "_" + (id1!=null?id1.getText():null);
                    		
                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();	
                    		TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);	
                    	
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:724:2: ( ^( STRUCTURE id2= ID ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==STRUCTURE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:724:3: ^( STRUCTURE id2= ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1188); 

                            match(input, Token.DOWN, null); 
                            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1192); 

                            match(input, Token.UP, null); 

                            		op += ".getChannel(" + "_" + (id2!=null?id2.getText():null) + ")";
                            	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1206);
                    attribute_call43=attribute_call(ts);

                    state._fsp--;


                    		op += "." + (attribute_call43!=null?attribute_call43.value:null);
                    		
                    		retval.value = op;
                    		retval.dt = (attribute_call43!=null?attribute_call43.dt:null);
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:739:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1219);
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
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:742:1: constructor returns [String value, String dt] : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final RecTranslator.constructor_return constructor() throws RecognitionException {
        RecTranslator.constructor_return retval = new RecTranslator.constructor_return();
        retval.start = input.LT(1);

        RecTranslator.triple_cons_return triple_cons44 = null;

        RecTranslator.pair_cons_return pair_cons45 = null;

        RecTranslator.set_cons_return set_cons46 = null;

        RecTranslator.node_cons_return node_cons47 = null;

        RecTranslator.xor_cons_return xor_cons48 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:743:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:743:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1234);
                    triple_cons44=triple_cons();

                    state._fsp--;

                     retval.value = (triple_cons44!=null?triple_cons44.value:null); 	retval.dt = (triple_cons44!=null?triple_cons44.dt:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:744:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1241);
                    pair_cons45=pair_cons();

                    state._fsp--;

                     retval.value = (pair_cons45!=null?pair_cons45.value:null); 	retval.dt = (pair_cons45!=null?pair_cons45.dt:null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:745:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1248);
                    set_cons46=set_cons();

                    state._fsp--;

                     retval.value = (set_cons46!=null?set_cons46.value:null); 	retval.dt = (set_cons46!=null?set_cons46.dt:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:746:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1256);
                    node_cons47=node_cons();

                    state._fsp--;

                     retval.value = (node_cons47!=null?node_cons47.value:null); 	retval.dt = (node_cons47!=null?node_cons47.dt:null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:747:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1263);
                    xor_cons48=xor_cons();

                    state._fsp--;

                     retval.value = (xor_cons48!=null?xor_cons48.value:null); 	retval.dt = (xor_cons48!=null?xor_cons48.dt:null); 

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
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:756:1: attribute_call[TinySymbol ts] returns [String value, String dt] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
    public final RecTranslator.attribute_call_return attribute_call(TinySymbol ts) throws RecognitionException {
        RecTranslator.attribute_call_return retval = new RecTranslator.attribute_call_return();
        retval.start = input.LT(1);

        CommonTree INT49=null;
        CommonTree INT50=null;


        	String value = "";
        	String dt = "";
        	
        	List<String> datatype = new ArrayList<String>( this.convertRecooplaDatatype(ts.getDataType()) );

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:763:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
            int alt26=9;
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
            case OP_FST:
                {
                alt26=6;
                }
                break;
            case OP_SND:
                {
                alt26=7;
                }
                break;
            case OP_TRD:
                {
                alt26=8;
                }
                break;
            case ID:
                {
                alt26=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:763:4: ^( OP_IN ( INT )? )
                    {
                    match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1293); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:763:12: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:763:12: INT
                                {
                                INT49=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1295); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if ((INT49!=null?INT49.getText():null) != null){
                    			value = "getIn(" + (INT49!=null?INT49.getText():null) + ")";
                    			dt = "Node";
                    		}
                    		else{
                    			value = "getIn()";
                    			dt = "LinkedHashSet<Node>";
                    		}
                    		
                    		retval.value = value;
                    		retval.dt = dt;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:778:4: ^( OP_OUT ( INT )? )
                    {
                    match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1308); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:778:13: ( INT )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==INT) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:778:13: INT
                                {
                                INT50=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1310); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if ((INT50!=null?INT50.getText():null) != null){
                    			value = "getOut(" + (INT50!=null?INT50.getText():null) + ")";
                    			dt = "Node";
                    		}
                    		else{
                    			value = "getOut()";
                    			dt = "LinkedHashSet<Node>";
                    		}
                    		
                    		retval.value = value;
                    		retval.dt = dt;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:793:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1322); 
                     
                    		retval.value = "getId()"; 
                    		retval.dt = "String";
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:799:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1334); 
                     
                    		retval.value = "getNodes()"; 
                    		retval.dt = "LinkedHashSet<Node>";
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:805:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1345); 
                     
                    		retval.value = "getNames()"; 
                    		retval.dt = "LinkedHashSet<String>";
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:818:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1359); 
                     
                    		retval.value = "fst()";
                    		retval.dt = this.datatypeToString(datatype);
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:824:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1370); 
                     
                    		retval.value = "snd()"; 
                    		retval.dt = this.datatypeToString(datatype);
                    	

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:830:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1381); 
                     
                    		retval.value = "trd()"; 
                    		retval.dt = this.datatypeToString(datatype);
                    	

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:836:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_attribute_call1393); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:840:1: triple_cons returns [String value, String dt] : ^( TRIPLE e1= expression e2= expression e3= expression ) ;
    public final RecTranslator.triple_cons_return triple_cons() throws RecognitionException {
        RecTranslator.triple_cons_return retval = new RecTranslator.triple_cons_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return e1 = null;

        RecTranslator.expression_return e2 = null;

        RecTranslator.expression_return e3 = null;



        	String dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:844:2: ( ^( TRIPLE e1= expression e2= expression e3= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:844:4: ^( TRIPLE e1= expression e2= expression e3= expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1416); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1420);
            e1=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1424);
            e2=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1428);
            e3=expression();

            state._fsp--;


            match(input, Token.UP, null); 

            		dt = (e1!=null?e1.dt:null);
            		retval.dt = "Triple<" + dt + ", " + dt + ", " + dt + ">";
            		retval.value = "new " + retval.dt + "(" + (e1!=null?e1.value:null) + ", " + (e2!=null?e2.value:null) + ", " + (e3!=null?e3.value:null) + ")"; //add template		
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:853:1: pair_cons returns [String value, String dt] : ^( PAIR e1= expression e2= expression ) ;
    public final RecTranslator.pair_cons_return pair_cons() throws RecognitionException {
        RecTranslator.pair_cons_return retval = new RecTranslator.pair_cons_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return e1 = null;

        RecTranslator.expression_return e2 = null;



        	String dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:857:2: ( ^( PAIR e1= expression e2= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:857:4: ^( PAIR e1= expression e2= expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons1454); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1458);
            e1=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons1462);
            e2=expression();

            state._fsp--;


            match(input, Token.UP, null); 

            		dt = (e1!=null?e1.dt:null);
            		retval.dt = "Pair<" + dt + ", " + dt + ">";		
            		retval.value = "new " + retval.dt + "(" + (e1!=null?e1.value:null) + ", " + (e2!=null?e2.value:null) + ")"; //add template
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:867:1: set_cons returns [String value, String dt] : ^( SET ( expression )* ) ;
    public final RecTranslator.set_cons_return set_cons() throws RecognitionException {
        RecTranslator.set_cons_return retval = new RecTranslator.set_cons_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression51 = null;



        	//List<String> exps = new ArrayList<String>();
        	String exps = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:872:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:872:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons1490); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:872:10: ( expression )*
                loop27:
                do {
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=OP_PATH && LA27_0<=OP_UPDATE)||(LA27_0>=OP_UNION && LA27_0<=OP_MINUS)||LA27_0==ID||(LA27_0>=TRIPLE && LA27_0<=XOR)||LA27_0==ACCESS) ) {
                        alt27=1;
                    }


                    switch (alt27) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:872:11: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1493);
                	    expression51=expression();

                	    state._fsp--;


                	    		exps += "\tadd(" + (expression51!=null?expression51.value:null) + "); \n";
                	    	

                	    }
                	    break;

                	default :
                	    break loop27;
                    }
                } while (true);


                		retval.dt = "LinkedHashSet<" + (expression51!=null?expression51.dt:null) + ">";
                		retval.value = "new " + retval.dt + "() {{ \n" + exps + "}}";  //add template
                		//Arrays.asList(" + listToString(exps) + "))"; //add template
                	

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
        public String value;
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:887:1: node_cons returns [String value, String dt] : ^( NODE ( ID )+ ) ;
    public final RecTranslator.node_cons_return node_cons() throws RecognitionException {
        RecTranslator.node_cons_return retval = new RecTranslator.node_cons_return();
        retval.start = input.LT(1);

        CommonTree ID52=null;


        	String ends = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:891:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:891:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1532); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:891:11: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:891:12: ID
            	    {
            	    ID52=(CommonTree)match(input,ID,FOLLOW_ID_in_node_cons1535); 

            	    		ends += "addEnd(\"" + (ID52!=null?ID52.getText():null) + "\"); "; //rever -> "id" ou id
            	    	

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


            		retval.dt = "Node";
            		retval.value = "new " + retval.dt + "(){{ " + ends + "}}"; //add template
            	

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
        public String value;
        public String dt;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:904:1: xor_cons returns [String value, String dt] : ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) ;
    public final RecTranslator.xor_cons_return xor_cons() throws RecognitionException {
        RecTranslator.xor_cons_return retval = new RecTranslator.xor_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:905:2: ( ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:905:4: ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons1565); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons1569); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1571); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:905:19: ( ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:905:19: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1573); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,OUT,FOLLOW_OUT_in_xor_cons1578); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1580); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:905:33: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:905:33: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1582); 

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

            		retval.dt = "";
            		retval.value = "";
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:914:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final RecTranslator.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecTranslator.applicaiton_def_return retval = new RecTranslator.applicaiton_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:915:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:915:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1603); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1605);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:915:29: ( trigger_def )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_BLOCK_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:915:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1607);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:918:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final RecTranslator.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecTranslator.list_reconfigurations_return retval = new RecTranslator.list_reconfigurations_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:919:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:919:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:919:4: ( reconfiguration_call )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:919:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1620);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:922:1: trigger_def : trigger_block ;
    public final RecTranslator.trigger_def_return trigger_def() throws RecognitionException {
        RecTranslator.trigger_def_return retval = new RecTranslator.trigger_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:923:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:923:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1634);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:926:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecTranslator.trigger_block_return trigger_block() throws RecognitionException {
        RecTranslator.trigger_block_return retval = new RecTranslator.trigger_block_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:927:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:927:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1646); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1648); 

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

    public static class main_def_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:934:1: main_def : ( main_args )? main_block ;
    public final RecTranslator.main_def_return main_def() throws RecognitionException {
        RecTranslator.main_def_return retval = new RecTranslator.main_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:935:2: ( ( main_args )? main_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:935:4: ( main_args )? main_block
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:935:4: ( main_args )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ARGUMENTS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:935:4: main_args
                    {
                    pushFollow(FOLLOW_main_args_in_main_def1663);
                    main_args();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_main_block_in_main_def1666);
            main_block();

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
    // $ANTLR end "main_def"

    public static class main_args_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:938:1: main_args : ^( ARGUMENTS ( main_arg )+ ) ;
    public final RecTranslator.main_args_return main_args() throws RecognitionException {
        RecTranslator.main_args_return retval = new RecTranslator.main_args_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:939:2: ( ^( ARGUMENTS ( main_arg )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:939:4: ^( ARGUMENTS ( main_arg )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1678); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:939:16: ( main_arg )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ARGUMENT) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:939:16: main_arg
            	    {
            	    pushFollow(FOLLOW_main_arg_in_main_args1680);
            	    main_arg();

            	    state._fsp--;


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
    // $ANTLR end "main_args"

    public static class main_arg_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_arg"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:942:1: main_arg : ^( ARGUMENT ID ids ) ;
    public final RecTranslator.main_arg_return main_arg() throws RecognitionException {
        RecTranslator.main_arg_return retval = new RecTranslator.main_arg_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:943:2: ( ^( ARGUMENT ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:943:4: ^( ARGUMENT ID ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1694); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_arg1696); 
            pushFollow(FOLLOW_ids_in_main_arg1698);
            ids();

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
    // $ANTLR end "main_arg"

    public static class ids_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:946:1: ids : ^( IDS ( ID )+ ) ;
    public final RecTranslator.ids_return ids() throws RecognitionException {
        RecTranslator.ids_return retval = new RecTranslator.ids_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:947:2: ( ^( IDS ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:947:4: ^( IDS ( ID )+ )
            {
            match(input,IDS,FOLLOW_IDS_in_ids1712); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:947:10: ( ID )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:947:10: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_ids1714); 

            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // $ANTLR end "ids"

    public static class main_block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:951:1: main_block : ^( INSTRUCTIONS ( main_instruction )+ ) ;
    public final RecTranslator.main_block_return main_block() throws RecognitionException {
        RecTranslator.main_block_return retval = new RecTranslator.main_block_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:952:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:952:4: ^( INSTRUCTIONS ( main_instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1731); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:952:19: ( main_instruction )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==DECLARATION||LA36_0==APPLICATION) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:952:19: main_instruction
            	    {
            	    pushFollow(FOLLOW_main_instruction_in_main_block1733);
            	    main_instruction();

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
        return retval;
    }
    // $ANTLR end "main_block"

    public static class main_instruction_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:955:1: main_instruction : ( main_declaration | main_assignment );
    public final RecTranslator.main_instruction_return main_instruction() throws RecognitionException {
        RecTranslator.main_instruction_return retval = new RecTranslator.main_instruction_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:956:2: ( main_declaration | main_assignment )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==DECLARATION) ) {
                alt37=1;
            }
            else if ( (LA37_0==APPLICATION) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:956:4: main_declaration
                    {
                    pushFollow(FOLLOW_main_declaration_in_main_instruction1746);
                    main_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:957:4: main_assignment
                    {
                    pushFollow(FOLLOW_main_assignment_in_main_instruction1751);
                    main_assignment();

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
    // $ANTLR end "main_instruction"

    public static class main_declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:960:1: main_declaration : ^( DECLARATION ID ids ) ;
    public final RecTranslator.main_declaration_return main_declaration() throws RecognitionException {
        RecTranslator.main_declaration_return retval = new RecTranslator.main_declaration_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:961:2: ( ^( DECLARATION ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:961:4: ^( DECLARATION ID ids )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_main_declaration1763); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_declaration1765); 
            pushFollow(FOLLOW_ids_in_main_declaration1767);
            ids();

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
    // $ANTLR end "main_declaration"

    public static class main_assignment_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:964:1: main_assignment : ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) ) ;
    public final RecTranslator.main_assignment_return main_assignment() throws RecognitionException {
        RecTranslator.main_assignment_return retval = new RecTranslator.main_assignment_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:965:2: ( ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:965:4: ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) )
            {
            match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1781); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:965:19: ( ^( DECLARATION ( ID )? ids ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DECLARATION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:965:21: ^( DECLARATION ( ID )? ids )
                    {
                    match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1786); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:965:35: ( ID )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:965:35: ID
                            {
                            match(input,ID,FOLLOW_ID_in_main_assignment1788); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ids_in_main_assignment1791);
                    ids();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1798); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_assignment1800); 
            pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1802);
            reconfiguration_call();

            state._fsp--;


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
    // $ANTLR end "main_assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_RECONFIGS_in_reclang67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reclang69 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000180L});
    public static final BitSet FOLLOW_element_in_reclang73 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000100L});
    public static final BitSet FOLLOW_directive_import_in_directive_def97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECONFIGURATION_in_element135 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_element174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_def_in_element176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def201 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def265 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def321 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype398 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_SET_in_other_type415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PAIR_in_other_type426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_TRIPLE_in_other_type434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids468 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block517 = new BitSet(new long[]{0x0000001000000008L,0x000000000000E000L});
    public static final BitSet FOLLOW_declaration_in_instruction563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply611 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply613 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration646 = new BitSet(new long[]{0x2000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_var_def_in_declaration656 = new BitSet(new long[]{0x2000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_var_def684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment724 = new BitSet(new long[]{0x200000F000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call829 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call839 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call841 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call853 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call886 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call893 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call895 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args950 = new BitSet(new long[]{0x200000E000C00002L,0x00000000009F0000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction991 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction1002 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction1015 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression1044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1048 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1068 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression1084 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1088 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1092 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1179 = new BitSet(new long[]{0x20000001BF000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1188 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1293 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1420 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1424 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1458 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1462 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1493 = new BitSet(new long[]{0x200000E000C00008L,0x00000000009F0000L});
    public static final BitSet FOLLOW_NODE_in_node_cons1532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1535 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons1565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons1569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1571 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_xor_cons1573 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons1578 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1580 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1582 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1603 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1605 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1620 = new BitSet(new long[]{0x20000000003F0002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1646 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_args_in_main_def1663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_main_block_in_main_def1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTS_in_main_args1678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_arg_in_main_args1680 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_main_arg1694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_arg1696 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_arg1698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDS_in_ids1712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ids1714 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_instruction_in_main_block1733 = new BitSet(new long[]{0x0000000000000008L,0x0000000002002000L});
    public static final BitSet FOLLOW_main_declaration_in_main_instruction1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_assignment_in_main_instruction1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARATION_in_main_declaration1763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_declaration1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_declaration1767 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_main_assignment1781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECLARATION_in_main_assignment1786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_assignment1791 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1800 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1802 = new BitSet(new long[]{0x0000000000000008L});

}