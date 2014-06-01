// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g 2014-05-30 18:41:04

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.ReoLangCP2;
	import pt.uminho.di.reolang.parsing.CPBuilder;
	import pt.uminho.di.reolang.reclang.Constants;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.cp.model.CPModelInternal;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.LinkedHashMap;
	import java.io.File;


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


    	private String template_file = "resources/template.stg";


    	private HashMap<String,String> reconfigurations;
    	
    	public HashMap<String,String> getReconfigurations(){
    		return this.reconfigurations;
    	}
    	
    	/* unused */
    	private Pair<String,String> main;
    	
    	public Pair<String,String> getMain(){
    		return this.main;
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
        SymbolsTable coopla_table;
        List<String> imported_coopla_files;
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:109:1: reclang[TinySymbolsTable identifiers_table] : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final RecTranslator.reclang_return reclang(TinySymbolsTable identifiers_table) throws RecognitionException {
        reclang_stack.push(new reclang_scope());
        RecTranslator.reclang_return retval = new RecTranslator.reclang_return();
        retval.start = input.LT(1);

        RecTranslator.element_return element1 = null;



        	((reclang_scope)reclang_stack.peek()).ids_table = identifiers_table;
        	((reclang_scope)reclang_stack.peek()).coopla_table = new SymbolsTable();
        	((reclang_scope)reclang_stack.peek()).imported_coopla_files = new ArrayList<String>();
        	
        	this.reconfigurations = new HashMap<String, String>();
        	
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	((reclang_scope)reclang_stack.peek()).parent_id = 0;
        	((reclang_scope)reclang_stack.peek()).aux_id = 0;
        	
        	((reclang_scope)reclang_stack.peek()).scopes = new ArrayList<Integer>(); //LinkedList or Stack
        	((reclang_scope)reclang_stack.peek()).scopes.add(0);
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang67); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:16: directive_def
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

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:31: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||(LA2_0>=APPLICATION && LA2_0<=MAIN)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:135:32: element
                	    {
                	    pushFollow(FOLLOW_element_in_reclang73);
                	    element1=element();

                	    state._fsp--;

                	    	
                	    		this.reconfigurations.put((element1!=null?element1.name:null), (element1!=null?element1.st:null).toString()); 
                	    		//this.main = new Pair<String, String>((element1!=null?element1.name:null), (element1!=null?element1.st:null).toString()); //if element.type.equals("main")
                	    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:147:1: directive_def : directive_import ;
    public final RecTranslator.directive_def_return directive_def() throws RecognitionException {
        RecTranslator.directive_def_return retval = new RecTranslator.directive_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:148:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:148:4: directive_import
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:152:1: directive_import : ^( IMPORT STRING ) ;
    public final RecTranslator.directive_import_return directive_import() throws RecognitionException {
        RecTranslator.directive_import_return retval = new RecTranslator.directive_import_return();
        retval.start = input.LT(1);

        CommonTree STRING2=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:153:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:153:4: ^( IMPORT STRING )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import111); 

            match(input, Token.DOWN, null); 
            STRING2=(CommonTree)match(input,STRING,FOLLOW_STRING_in_directive_import113); 

            		String file_name = (STRING2!=null?STRING2.getText():null);
            		String file = file_name.substring(1, file_name.length()-1); //remove " from string
            		
            	    	File f = new File( file );
            	    	if( f.exists() ){
            			String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
            			
            			if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {	//rpla
            				Processor p = new Processor(file);
            				TinySymbolsTable imported_ids_table = p.getIdentifiersTable();
            				HashMap<String, String> imported_translation = p.getTranslation(this.template_file, imported_ids_table);
            				
            				this.reconfigurations.putAll(imported_translation);
            			}
            			else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//*.cpla
            				((reclang_scope)reclang_stack.peek()).imported_coopla_files.add(file);
            				/*
            				CPBuilder cp_model_builder = new CPBuilder(file);
            				ReoLangCP2 res = cp_model_builder.performModelConstruction(this.patterns, ((reclang_scope)reclang_stack.peek()).coopla_table);
            				this.patterns = res.getPatterns() != null ? res.getPatterns() : this.patterns;
            				*/
            			}
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
    // $ANTLR end "directive_import"

    protected static class element_scope {
        TinySymbol ts;
        TinySymbolsTable current_scope;
    }
    protected Stack element_stack = new Stack();

    public static class element_return extends TreeRuleReturnScope {
        public String name;
        public String type;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "element"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:187:1: element returns [String name, String type] : ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st} | ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st} | ^( MAIN main_def ) -> {$main_def.st});
    public final RecTranslator.element_return element() throws RecognitionException {
        element_stack.push(new element_scope());
        RecTranslator.element_return retval = new RecTranslator.element_return();
        retval.start = input.LT(1);

        RecTranslator.reconfiguration_def_return reconfiguration_def3 = null;

        RecTranslator.applicaiton_def_return applicaiton_def4 = null;

        RecTranslator.main_def_return main_def5 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:192:2: ( ^( RECONFIGURATION reconfiguration_def ) -> {$reconfiguration_def.st} | ^( APPLICATION applicaiton_def ) -> {$applicaiton_def.st} | ^( MAIN main_def ) -> {$main_def.st})
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:192:4: ^( RECONFIGURATION reconfiguration_def )
                    {
                    match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element143); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_reconfiguration_def_in_element145);
                    reconfiguration_def3=reconfiguration_def();

                    state._fsp--;


                    		retval.name = (reconfiguration_def3!=null?reconfiguration_def3.id:null);
                    		retval.type = "reconf";
                    	

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 198:2: -> {$reconfiguration_def.st}
                    {
                        retval.st = (reconfiguration_def3!=null?reconfiguration_def3.st:null);
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:200:4: ^( APPLICATION applicaiton_def )
                    {
                    match(input,APPLICATION,FOLLOW_APPLICATION_in_element164); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_applicaiton_def_in_element166);
                    applicaiton_def4=applicaiton_def();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 201:2: -> {$applicaiton_def.st}
                    {
                        retval.st = (applicaiton_def4!=null?applicaiton_def4.st:null);
                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:203:4: ^( MAIN main_def )
                    {
                    match(input,MAIN,FOLLOW_MAIN_in_element180); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_main_def_in_element182);
                    main_def5=main_def();

                    state._fsp--;


                    		retval.name = (main_def5!=null?main_def5.id:null);
                    		retval.type = "main";
                    	

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 209:2: -> {$main_def.st}
                    {
                        retval.st = (main_def5!=null?main_def5.st:null);
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
            element_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "element"

    protected static class reconfiguration_def_scope {
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:214:1: reconfiguration_def returns [String id] : ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st);
    public final RecTranslator.reconfiguration_def_return reconfiguration_def() throws RecognitionException {
        reconfiguration_def_stack.push(new reconfiguration_def_scope());
        RecTranslator.reconfiguration_def_return retval = new RecTranslator.reconfiguration_def_return();
        retval.start = input.LT(1);

        CommonTree ID6=null;
        RecTranslator.args_def_return args_def7 = null;

        RecTranslator.reconfiguration_block_return reconfiguration_block8 = null;



        	((element_scope)element_stack.peek()).ts = new TinySymbol();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = new ArrayList<TinySymbolsTable>();
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name = "";
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args = new ArrayList<String>();
        	
        	//body
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs = new HashSet<String>();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts = new ArrayList<String>();
        	
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).adv = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:243:2: ( ^( ID ( args_def )? reconfiguration_block[false] ) -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:243:4: ^( ID ( args_def )? reconfiguration_block[false] )
            {
            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def217); 


            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name = Character.toUpperCase((ID6!=null?ID6.getText():null).charAt(0)) + (ID6!=null?ID6.getText():null).substring(1);
            		
            		TinySymbol ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get((ID6!=null?ID6.getText():null));
            		((element_scope)element_stack.peek()).ts = ts;
            		retval.id = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name;
            		
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
            	

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:254:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:254:2: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def226);
                    args_def7=args_def();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def229);
            reconfiguration_block8=reconfiguration_block(false);

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 254:43: -> mkclass(name=$reconfiguration_def::class_namefields=$args_def.valuesconstructor=$args_def.stmethod=$reconfiguration_block.st)
            {
                retval.st = templateLib.getInstanceOf("mkclass",
              new STAttrMap().put("name", ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).class_name).put("fields", (args_def7!=null?args_def7.values:null)).put("constructor", (args_def7!=null?args_def7.st:null)).put("method", (reconfiguration_block8!=null?reconfiguration_block8.st:null)));
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:258:1: args_def returns [List<String> values] : ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids);
    public final RecTranslator.args_def_return args_def() throws RecognitionException {
        RecTranslator.args_def_return retval = new RecTranslator.args_def_return();
        retval.start = input.LT(1);

        RecTranslator.arg_def_return arg_def9 = null;



        	List<String> ctfields = new ArrayList<String>();
        	List<String> ids = new ArrayList<String>();
        	List<String> dts = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:264:2: ( ^( ARGUMENTS ( arg_def )+ ) -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:264:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def276); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:265:2: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:265:3: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def281);
            	    arg_def9=arg_def();

            	    state._fsp--;


            	    		ctfields.add((arg_def9!=null?arg_def9.st:null).toString());
            	    		ids.addAll((arg_def9!=null?arg_def9.values:null));
            	    		for (int i = 0; i < (arg_def9!=null?arg_def9.values:null).size(); i++){
            	    			dts.add((arg_def9!=null?arg_def9.datatype:null));
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
            // 278:2: -> constructor(n=$reconfiguration_def::class_namedts=dtsids=ids)
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:281:1: arg_def returns [String datatype, List<String> values] : ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st};
    public final RecTranslator.arg_def_return arg_def() throws RecognitionException {
        RecTranslator.arg_def_return retval = new RecTranslator.arg_def_return();
        retval.start = input.LT(1);

        RecTranslator.list_ids_return list_ids10 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:285:2: ( ^( ARGUMENT datatype list_ids[dt] ) -> {$list_ids.st})
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:285:4: ^( ARGUMENT datatype list_ids[dt] )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def335); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def337);
            datatype();

            state._fsp--;


            		String dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            pushFollow(FOLLOW_list_ids_in_arg_def344);
            list_ids10=list_ids(dt);

            state._fsp--;


            match(input, Token.UP, null); 

            		retval.values = (list_ids10!=null?list_ids10.values:null);
            		retval.datatype = dt;
            	


            // TEMPLATE REWRITE
            // 295:2: -> {$list_ids.st}
            {
                retval.st = (list_ids10!=null?list_ids10.st:null);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:298:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final RecTranslator.datatype_return datatype() throws RecognitionException {
        RecTranslator.datatype_return retval = new RecTranslator.datatype_return();
        retval.start = input.LT(1);

        RecTranslator.other_type_return other_type11 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:299:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:299:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype369); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CoordinationPattern2"); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:300:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype376); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("CommunicationMean2"); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:301:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype383); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("String"); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:302:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype391); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:303:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype398); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add("Node"); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:304:4: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype409);
                    other_type11=other_type();

                    state._fsp--;


                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add((other_type11!=null?other_type11.name:null)); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype414);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:308:1: other_type returns [String name] : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final RecTranslator.other_type_return other_type() throws RecognitionException {
        RecTranslator.other_type_return retval = new RecTranslator.other_type_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:309:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:309:4: DT_SET
                    {
                    match(input,DT_SET,FOLLOW_DT_SET_in_other_type431); 
                     retval.name = "LinkedHashSet"; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:310:4: DT_PAIR
                    {
                    match(input,DT_PAIR,FOLLOW_DT_PAIR_in_other_type442); 
                     retval.name = "Pair"; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:311:4: DT_TRIPLE
                    {
                    match(input,DT_TRIPLE,FOLLOW_DT_TRIPLE_in_other_type450); 
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:314:1: subtype : datatype ;
    public final RecTranslator.subtype_return subtype() throws RecognitionException {
        RecTranslator.subtype_return retval = new RecTranslator.subtype_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:315:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:315:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype463);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:318:1: list_ids[String dt] returns [List<String> values] : ( ID )+ -> list_fields(datatype=$list_ids.dtids=ids);
    public final RecTranslator.list_ids_return list_ids(String dt) throws RecognitionException {
        RecTranslator.list_ids_return retval = new RecTranslator.list_ids_return();
        retval.start = input.LT(1);

        CommonTree ID12=null;


        	List<String> ids = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:322:2: ( ( ID )+ -> list_fields(datatype=$list_ids.dtids=ids))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:322:3: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:322:3: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:322:4: ID
            	    {
            	    ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids484); 

            	    		ids.add("_" + (ID12!=null?ID12.getText():null));
            	    		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.add((ID12!=null?ID12.getText():null));
            	    	

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
            // 333:2: -> list_fields(datatype=$list_ids.dtids=ids)
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:338:1: reconfiguration_block[boolean isForall] : ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts);
    public final RecTranslator.reconfiguration_block_return reconfiguration_block(boolean isForall) throws RecognitionException {
        RecTranslator.reconfiguration_block_return retval = new RecTranslator.reconfiguration_block_return();
        retval.start = input.LT(1);

        RecTranslator.instruction_return instruction13 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:339:2: ( ^( INSTRUCTIONS ( instruction )+ ) -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:339:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block530); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:339:19: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:339:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block533);
            	    instruction13=instruction();

            	    state._fsp--;


            	    		if (isForall){
            	    			((for_instruction_scope)for_instruction_stack.peek()).insts.add((instruction13!=null?instruction13.value:null));
            	    		}
            	    		else{
            	    			((reconfiguration_def_scope)reconfiguration_def_stack.peek()).insts.add((instruction13!=null?instruction13.value:null));
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
            // 349:4: -> apply_method(reconfs=$reconfiguration_def::reconfsinsts=$reconfiguration_def::insts)
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:352:1: instruction returns [String value] : ( declaration | assignment | reconfiguration_apply[false] | for_instruction );
    public final RecTranslator.instruction_return instruction() throws RecognitionException {
        instruction_stack.push(new instruction_scope());
        RecTranslator.instruction_return retval = new RecTranslator.instruction_return();
        retval.start = input.LT(1);

        RecTranslator.declaration_return declaration14 = null;

        RecTranslator.assignment_return assignment15 = null;

        RecTranslator.reconfiguration_apply_return reconfiguration_apply16 = null;

        RecTranslator.for_instruction_return for_instruction17 = null;



        	((element_scope)element_stack.peek()).current_scope = this.getScope( ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1) ); //rever
        	((instruction_scope)instruction_stack.peek()).dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:360:2: ( declaration | assignment | reconfiguration_apply[false] | for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:360:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction579);
                    declaration14=declaration();

                    state._fsp--;

                     retval.value = (declaration14!=null?declaration14.value:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:361:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_instruction588);
                    assignment15=assignment();

                    state._fsp--;

                     retval.value = (assignment15!=null?assignment15.value:null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:362:4: reconfiguration_apply[false]
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction597);
                    reconfiguration_apply16=reconfiguration_apply(false);

                    state._fsp--;

                     retval.value = (reconfiguration_apply16!=null?reconfiguration_apply16.value:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:363:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction605);
                    for_instruction17=for_instruction();

                    state._fsp--;

                     
                    		retval.value = (for_instruction17!=null?for_instruction17.value:null); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:373:1: reconfiguration_apply[boolean isAssignment] returns [String value] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final RecTranslator.reconfiguration_apply_return reconfiguration_apply(boolean isAssignment) throws RecognitionException {
        RecTranslator.reconfiguration_apply_return retval = new RecTranslator.reconfiguration_apply_return();
        retval.start = input.LT(1);

        RecTranslator.reconfiguration_call_return reconfiguration_call18 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:374:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:374:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply627); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply629);
            reconfiguration_call18=reconfiguration_call();

            state._fsp--;


            		String op = (reconfiguration_call18!=null?reconfiguration_call18.name:null);
            		//eg: par -> P + ar = Par
            		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).reconfs.add(class_name + " " + op + ";");
            		
            		String args = (reconfiguration_call18!=null?reconfiguration_call18.args:null);
            		
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
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:399:2: ( ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:399:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply638); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:402:1: declaration returns [String value] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final RecTranslator.declaration_return declaration() throws RecognitionException {
        RecTranslator.declaration_return retval = new RecTranslator.declaration_return();
        retval.start = input.LT(1);

        RecTranslator.var_def_return var_def19 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<String>();
        	
        	List<String> decls = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:408:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:408:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration660); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration662);
            datatype();

            state._fsp--;


            		((instruction_scope)instruction_stack.peek()).dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype) + " ";
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:413:2: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:413:3: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration672);
            	    var_def19=var_def();

            	    state._fsp--;

            	    	
            	    		if ((var_def19!=null?var_def19.isRec:false)) {
            	    			decls.add((var_def19!=null?var_def19.value:null));
            	    		}
            	    		else {
            	    			if ((var_def19!=null?var_def19.isAssignment:false)){
            	    				decls.add("final " + ((instruction_scope)instruction_stack.peek()).dt + (var_def19!=null?var_def19.value:null));
            	    			}
            	    			else {
            	    				String v = (var_def19!=null?var_def19.value:null);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:441:1: var_def returns [String value, boolean isRec, boolean isAssignment] : ( ID | assignment );
    public final RecTranslator.var_def_return var_def() throws RecognitionException {
        RecTranslator.var_def_return retval = new RecTranslator.var_def_return();
        retval.start = input.LT(1);

        CommonTree ID20=null;
        RecTranslator.assignment_return assignment21 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:442:2: ( ID | assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:442:4: ID
                    {
                    ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def700); 
                     
                    		retval.value = "_" + (ID20!=null?ID20.getText():null) + ";"; 
                    		retval.isAssignment = false;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:448:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_var_def711);
                    assignment21=assignment();

                    state._fsp--;

                     
                    		retval.value = (assignment21!=null?assignment21.value:null);
                    		retval.isRec = (assignment21!=null?assignment21.isRec:false);		
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:457:1: assignment returns [String value, boolean isRec] : ^( ASSIGNMENT ID assignment_member ) ;
    public final RecTranslator.assignment_return assignment() throws RecognitionException {
        assignment_stack.push(new assignment_scope());
        RecTranslator.assignment_return retval = new RecTranslator.assignment_return();
        retval.start = input.LT(1);

        CommonTree ID22=null;
        RecTranslator.assignment_member_return assignment_member23 = null;



        	((assignment_scope)assignment_stack.peek()).ts = new TinySymbol();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:464:2: ( ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:464:4: ^( ASSIGNMENT ID assignment_member )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment738); 

            match(input, Token.DOWN, null); 
            ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment740); 

            		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();	
            		((assignment_scope)assignment_stack.peek()).ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID22!=null?ID22.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID22!=null?ID22.getText():null)) : ((element_scope)element_stack.peek()).ts.hasValue((ID22!=null?ID22.getText():null), s_id);	
            	
            pushFollow(FOLLOW_assignment_member_in_assignment749);
            assignment_member23=assignment_member();

            state._fsp--;


            		if ((assignment_member23!=null?assignment_member23.isRec:false)) {
            			retval.value = (assignment_member23!=null?assignment_member23.value:null);
            		}
            		else{	
            			retval.value = "_" + (ID22!=null?ID22.getText():null) + " = " + (assignment_member23!=null?assignment_member23.value:null) + ";";
            		}
            		retval.isRec = (assignment_member23!=null?assignment_member23.isRec:false);
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:483:1: assignment_member returns [String value, boolean isRec] : ( expression | reconfiguration_apply[true] );
    public final RecTranslator.assignment_member_return assignment_member() throws RecognitionException {
        RecTranslator.assignment_member_return retval = new RecTranslator.assignment_member_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression24 = null;

        RecTranslator.reconfiguration_apply_return reconfiguration_apply25 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:484:2: ( expression | reconfiguration_apply[true] )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:484:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member772);
                    expression24=expression();

                    state._fsp--;

                     
                    		//conditional isOp -> if (isOp) { retval.value = " bla bla" + (expression24!=null?expression24.value:null);}
                    		retval.value = (expression24!=null?expression24.value:null);
                    		retval.isRec = false;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:491:4: reconfiguration_apply[true]
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member786);
                    reconfiguration_apply25=reconfiguration_apply(true);

                    state._fsp--;

                     
                    		retval.value = (reconfiguration_apply25!=null?reconfiguration_apply25.value:null);
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
        public List<String> dts;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "reconfiguration_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:498:1: reconfiguration_call returns [String name, String args, List<String> dts] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final RecTranslator.reconfiguration_call_return reconfiguration_call() throws RecognitionException {
        RecTranslator.reconfiguration_call_return retval = new RecTranslator.reconfiguration_call_return();
        retval.start = input.LT(1);

        CommonTree OP_JOIN26=null;
        CommonTree OP_SPLIT28=null;
        CommonTree OP_PAR30=null;
        CommonTree OP_REMOVE32=null;
        CommonTree OP_CONST34=null;
        CommonTree OP_ID36=null;
        CommonTree ID37=null;
        RecTranslator.operation_args_return operation_args27 = null;

        RecTranslator.operation_args_return operation_args29 = null;

        RecTranslator.operation_args_return operation_args31 = null;

        RecTranslator.operation_args_return operation_args33 = null;

        RecTranslator.operation_args_return operation_args35 = null;

        RecTranslator.operation_args_return operation_args38 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:499:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:499:4: ^( OP_JOIN operation_args )
                    {
                    OP_JOIN26=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call807); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call809);
                        operation_args27=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_JOIN26!=null?OP_JOIN26.getText():null);
                    		retval.args = (operation_args27!=null?operation_args27.values:null);
                    		retval.dts = (operation_args27!=null?operation_args27.datatypes:null);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:505:4: ^( OP_SPLIT operation_args )
                    {
                    OP_SPLIT28=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call819); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call821);
                        operation_args29=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_SPLIT28!=null?OP_SPLIT28.getText():null);
                    		retval.args = (operation_args29!=null?operation_args29.values:null);
                    		retval.dts = (operation_args29!=null?operation_args29.datatypes:null);
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:511:4: ^( OP_PAR operation_args )
                    {
                    OP_PAR30=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call831); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call833);
                        operation_args31=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_PAR30!=null?OP_PAR30.getText():null);
                    		retval.args = (operation_args31!=null?operation_args31.values:null);
                    		retval.dts = (operation_args31!=null?operation_args31.datatypes:null);		
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:517:4: ^( OP_REMOVE operation_args )
                    {
                    OP_REMOVE32=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call843); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call845);
                        operation_args33=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_REMOVE32!=null?OP_REMOVE32.getText():null);
                    		retval.args = (operation_args33!=null?operation_args33.values:null);
                    		retval.dts = (operation_args33!=null?operation_args33.datatypes:null);
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:523:4: ^( OP_CONST operation_args )
                    {
                    OP_CONST34=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call855); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call857);
                        operation_args35=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_CONST34!=null?OP_CONST34.getText():null);
                    		retval.args = (operation_args35!=null?operation_args35.values:null);
                    		retval.dts = (operation_args35!=null?operation_args35.datatypes:null);
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:529:4: ^( OP_ID operation_args )
                    {
                    OP_ID36=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call867); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call869);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (OP_ID36!=null?OP_ID36.getText():null);
                    		retval.args = ""; //id does not have args
                    		retval.dts = new ArrayList<String>();
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:535:4: ^( ID operation_args )
                    {
                    ID37=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call879); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call881);
                        operation_args38=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		retval.name = (ID37!=null?ID37.getText():null);
                    		retval.args = (operation_args38!=null?operation_args38.values:null);
                    		retval.dts = (operation_args38!=null?operation_args38.datatypes:null);
                    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:544:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final RecTranslator.structure_operation_call_return structure_operation_call() throws RecognitionException {
        RecTranslator.structure_operation_call_return retval = new RecTranslator.structure_operation_call_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:545:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:545:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call900); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call902);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:546:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call909); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call911);
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
        public List<String> datatypes;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:550:1: operation_args returns [String values, List<String> datatypes] : ( args )? ;
    public final RecTranslator.operation_args_return operation_args() throws RecognitionException {
        RecTranslator.operation_args_return retval = new RecTranslator.operation_args_return();
        retval.start = input.LT(1);

        RecTranslator.args_return args39 = null;



        	String args = "";
        	List<String> datatypes = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:555:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:555:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:555:4: ( args )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=XOR)||LA17_0==ACCESS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:555:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args934);
                    args39=args();

                    state._fsp--;


                    		args = (args39!=null?args39.values:null);
                    		datatypes = (args39!=null?args39.datatypes:null);
                    	

                    }
                    break;

            }


            		retval.values = args;
            		retval.datatypes = datatypes;
            	

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
        public List<String> datatypes;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:568:1: args returns [String values, List<String> datatypes] : ( expression )+ ;
    public final RecTranslator.args_return args() throws RecognitionException {
        RecTranslator.args_return retval = new RecTranslator.args_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression40 = null;



        	List<String> args = new ArrayList<String>();
        	List<String> datatypes = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:573:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:573:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:573:4: ( expression )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:573:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args966);
            	    expression40=expression();

            	    state._fsp--;


            	    		args.add((expression40!=null?expression40.value:null));
            	    		datatypes.add((expression40!=null?expression40.dt:null));
            	    	

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
            		retval.datatypes = datatypes;
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:588:1: for_instruction returns [String value] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:613:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:613:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block[true] )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction1005); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction1007);
            datatype();

            state._fsp--;


            		String dt = datatypeToString(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            	
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction1018); 
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction1022); 

            		((element_scope)element_stack.peek()).current_scope = this.getScope(((reclang_scope)reclang_stack.peek()).parent_id); //rever
            	
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
            	
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction1031);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:656:1: expression returns [String value, String dt, boolean isOp] : ( ^( OP_UNION s1= factor s2= factor ) | ^( OP_INTERSECTION s1= factor s2= factor ) | ^( OP_MINUS s1= factor s2= factor ) | factor );
    public final RecTranslator.expression_return expression() throws RecognitionException {
        RecTranslator.expression_return retval = new RecTranslator.expression_return();
        retval.start = input.LT(1);

        RecTranslator.factor_return s1 = null;

        RecTranslator.factor_return s2 = null;

        RecTranslator.factor_return factor41 = null;



        	String value = "";
        	
        	List<String> dt = new ArrayList<String>();
        	String datatype = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:663:2: ( ^( OP_UNION s1= factor s2= factor ) | ^( OP_INTERSECTION s1= factor s2= factor ) | ^( OP_MINUS s1= factor s2= factor ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:663:4: ^( OP_UNION s1= factor s2= factor )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression1060); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1064);
                    s1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1068);
                    s2=factor();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    	
                    		if (((element_scope)element_stack.peek()).ts.getId().equals("$main")){
                    			datatype = "LinkedHashSet<" + (s1!=null?s1.dt:null) + ">";
                    		} else{
                    			dt = this.convertRecooplaDatatype( ((assignment_scope)assignment_stack.peek()).ts.getDataType() );
                    			datatype = this.datatypeToString(dt);
                    		}
                    	
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:693:4: ^( OP_INTERSECTION s1= factor s2= factor )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1080); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1084);
                    s1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1088);
                    s2=factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		if (((element_scope)element_stack.peek()).ts.getId().equals("$main")){
                    			datatype = "LinkedHashSet<" + (s1!=null?s1.dt:null) + ">";
                    		} else{
                    			dt = this.convertRecooplaDatatype( ((assignment_scope)assignment_stack.peek()).ts.getDataType() );
                    			datatype = this.datatypeToString(dt);
                    		}
                    		
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:725:4: ^( OP_MINUS s1= factor s2= factor )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1100); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1104);
                    s1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1108);
                    s2=factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		if (((element_scope)element_stack.peek()).ts.getId().equals("$main")){
                    			datatype = "LinkedHashSet<" + (s1!=null?s1.dt:null) + ">";
                    		} else{
                    			dt = this.convertRecooplaDatatype( ((assignment_scope)assignment_stack.peek()).ts.getDataType() );
                    			datatype = this.datatypeToString(dt);
                    		}
                    		
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:757:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression1120);
                    factor41=factor();

                    state._fsp--;


                    		retval.value = (factor41!=null?factor41.value:null);
                    		retval.dt = (factor41!=null?factor41.dt:null);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:766:1: factor returns [String value, String dt] : ( ^( ID ID ) | ID | operation | constructor );
    public final RecTranslator.factor_return factor() throws RecognitionException {
        RecTranslator.factor_return retval = new RecTranslator.factor_return();
        retval.start = input.LT(1);

        CommonTree ID42=null;
        RecTranslator.operation_return operation43 = null;

        RecTranslator.constructor_return constructor44 = null;



        	List<String> dt = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:770:2: ( ^( ID ID ) | ID | operation | constructor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:770:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1144); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1146); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:771:4: ID
                    {
                    ID42=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1152); 

                    		/*
                    		if (((reconfiguration_def_scope)reconfiguration_def_stack.peek()).args.contains((ID42!=null?ID42.getText():null))){
                    			retval.value = "this." + "_" + (ID42!=null?ID42.getText():null);
                    		}
                    		else{
                    			retval.value = "_" + (ID42!=null?ID42.getText():null);
                    		}
                    		*/
                    		retval.value = "_" + (ID42!=null?ID42.getText():null);
                    		
                    		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();	
                    		TinySymbol ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID42!=null?ID42.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID42!=null?ID42.getText():null)) : ((element_scope)element_stack.peek()).ts.hasValue((ID42!=null?ID42.getText():null), s_id);	
                    		
                    		dt = this.convertRecooplaDatatype( ts.getDataType() );
                    		retval.dt = this.datatypeToString(dt);
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:789:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1161);
                    operation43=operation();

                    state._fsp--;

                     retval.value = (operation43!=null?operation43.value:null); 	retval.dt = (operation43!=null?operation43.dt:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:790:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1169);
                    constructor44=constructor();

                    state._fsp--;

                     retval.value = (constructor44!=null?constructor44.value:null); 	retval.dt = (constructor44!=null?constructor44.dt:null); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:793:1: operation returns [String value, String dt] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call );
    public final RecTranslator.operation_return operation() throws RecognitionException {
        RecTranslator.operation_return retval = new RecTranslator.operation_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        RecTranslator.attribute_call_return attribute_call45 = null;



        	String op = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:797:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:797:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1191); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1195); 

                    		op += "_" + (id1!=null?id1.getText():null);
                    		
                    		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();	
                    		TinySymbol ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id1!=null?id1.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id1!=null?id1.getText():null)) : ((element_scope)element_stack.peek()).ts.hasValue((id1!=null?id1.getText():null), s_id);	
                    	
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:804:2: ( ^( STRUCTURE id2= ID ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==STRUCTURE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:804:3: ^( STRUCTURE id2= ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1204); 

                            match(input, Token.DOWN, null); 
                            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1208); 

                            match(input, Token.UP, null); 

                            		op += ".getChannel(\"" + (id2!=null?id2.getText():null) + "\")"; //"_" + id
                            	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1222);
                    attribute_call45=attribute_call(ts);

                    state._fsp--;


                    		op += "." + (attribute_call45!=null?attribute_call45.value:null);
                    		
                    		retval.value = op;
                    		retval.dt = (attribute_call45!=null?attribute_call45.dt:null);
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:819:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1235);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:822:1: constructor returns [String value, String dt] : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final RecTranslator.constructor_return constructor() throws RecognitionException {
        RecTranslator.constructor_return retval = new RecTranslator.constructor_return();
        retval.start = input.LT(1);

        RecTranslator.triple_cons_return triple_cons46 = null;

        RecTranslator.pair_cons_return pair_cons47 = null;

        RecTranslator.set_cons_return set_cons48 = null;

        RecTranslator.node_cons_return node_cons49 = null;

        RecTranslator.xor_cons_return xor_cons50 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:823:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:823:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1250);
                    triple_cons46=triple_cons();

                    state._fsp--;

                     retval.value = (triple_cons46!=null?triple_cons46.value:null); 	retval.dt = (triple_cons46!=null?triple_cons46.dt:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:824:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1257);
                    pair_cons47=pair_cons();

                    state._fsp--;

                     retval.value = (pair_cons47!=null?pair_cons47.value:null); 	retval.dt = (pair_cons47!=null?pair_cons47.dt:null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:825:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1264);
                    set_cons48=set_cons();

                    state._fsp--;

                     retval.value = (set_cons48!=null?set_cons48.value:null); 	retval.dt = (set_cons48!=null?set_cons48.dt:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:826:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1272);
                    node_cons49=node_cons();

                    state._fsp--;

                     retval.value = (node_cons49!=null?node_cons49.value:null); 	retval.dt = (node_cons49!=null?node_cons49.dt:null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:827:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1279);
                    xor_cons50=xor_cons();

                    state._fsp--;

                     retval.value = (xor_cons50!=null?xor_cons50.value:null); 	retval.dt = (xor_cons50!=null?xor_cons50.dt:null); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:836:1: attribute_call[TinySymbol ts] returns [String value, String dt] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
    public final RecTranslator.attribute_call_return attribute_call(TinySymbol ts) throws RecognitionException {
        RecTranslator.attribute_call_return retval = new RecTranslator.attribute_call_return();
        retval.start = input.LT(1);

        CommonTree INT51=null;
        CommonTree INT52=null;


        	String value = "";
        	String dt = "";
        	
        	List<String> datatype = new ArrayList<String>( this.convertRecooplaDatatype(ts.getDataType()) );
        	datatype.remove(0); //remove Pair or Triple type -> eg: Pair<Node> ([PAIR,NODE]) => [Node]

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:844:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:844:4: ^( OP_IN ( INT )? )
                    {
                    match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1309); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:844:12: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:844:12: INT
                                {
                                INT51=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1311); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if ((INT51!=null?INT51.getText():null) != null){
                    			value = "getIn(" + (INT51!=null?INT51.getText():null) + ")";
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:859:4: ^( OP_OUT ( INT )? )
                    {
                    match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1324); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:859:13: ( INT )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==INT) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:859:13: INT
                                {
                                INT52=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1326); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if ((INT52!=null?INT52.getText():null) != null){
                    			value = "getOut(" + (INT52!=null?INT52.getText():null) + ")";
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:874:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1338); 
                     
                    		retval.value = "getId()"; 
                    		retval.dt = "String";
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:880:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1350); 
                     
                    		retval.value = "getNodes()"; 
                    		retval.dt = "LinkedHashSet<Node>";
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:886:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1361); 
                     
                    		retval.value = "getNames()"; 
                    		retval.dt = "LinkedHashSet<String>";
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:899:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1375); 
                     
                    		retval.value = "fst()";
                    		retval.dt = this.datatypeToString(datatype);
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:905:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1386); 
                     
                    		retval.value = "snd()"; 
                    		retval.dt = this.datatypeToString(datatype);
                    	

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:911:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1397); 
                     
                    		retval.value = "trd()"; 
                    		retval.dt = this.datatypeToString(datatype);
                    	

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:917:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_attribute_call1409); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:921:1: triple_cons returns [String value, String dt] : ^( TRIPLE e1= expression e2= expression e3= expression ) ;
    public final RecTranslator.triple_cons_return triple_cons() throws RecognitionException {
        RecTranslator.triple_cons_return retval = new RecTranslator.triple_cons_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return e1 = null;

        RecTranslator.expression_return e2 = null;

        RecTranslator.expression_return e3 = null;



        	String dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:925:2: ( ^( TRIPLE e1= expression e2= expression e3= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:925:4: ^( TRIPLE e1= expression e2= expression e3= expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1432); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1436);
            e1=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1440);
            e2=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1444);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:934:1: pair_cons returns [String value, String dt] : ^( PAIR e1= expression e2= expression ) ;
    public final RecTranslator.pair_cons_return pair_cons() throws RecognitionException {
        RecTranslator.pair_cons_return retval = new RecTranslator.pair_cons_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return e1 = null;

        RecTranslator.expression_return e2 = null;



        	String dt = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:938:2: ( ^( PAIR e1= expression e2= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:938:4: ^( PAIR e1= expression e2= expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons1470); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1474);
            e1=expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons1478);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:948:1: set_cons returns [String value, String dt] : ^( SET ( expression )* ) ;
    public final RecTranslator.set_cons_return set_cons() throws RecognitionException {
        RecTranslator.set_cons_return retval = new RecTranslator.set_cons_return();
        retval.start = input.LT(1);

        RecTranslator.expression_return expression53 = null;



        	//List<String> exps = new ArrayList<String>();
        	String exps = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:953:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:953:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons1506); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:953:10: ( expression )*
                loop27:
                do {
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=OP_PATH && LA27_0<=OP_UPDATE)||(LA27_0>=OP_UNION && LA27_0<=OP_MINUS)||LA27_0==ID||(LA27_0>=TRIPLE && LA27_0<=XOR)||LA27_0==ACCESS) ) {
                        alt27=1;
                    }


                    switch (alt27) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:953:11: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1509);
                	    expression53=expression();

                	    state._fsp--;


                	    		exps += "\tadd(" + (expression53!=null?expression53.value:null) + "); \n";
                	    	

                	    }
                	    break;

                	default :
                	    break loop27;
                    }
                } while (true);


                		retval.dt = "LinkedHashSet<" + (expression53!=null?expression53.dt:null) + ">";
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:968:1: node_cons returns [String value, String dt] : ^( NODE ( ID )+ ) ;
    public final RecTranslator.node_cons_return node_cons() throws RecognitionException {
        RecTranslator.node_cons_return retval = new RecTranslator.node_cons_return();
        retval.start = input.LT(1);

        CommonTree ID54=null;


        	String ends = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:972:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:972:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1548); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:972:11: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:972:12: ID
            	    {
            	    ID54=(CommonTree)match(input,ID,FOLLOW_ID_in_node_cons1551); 

            	    		ends += "addEnd(\"" + (ID54!=null?ID54.getText():null) + "\"); "; //rever -> "id" ou id
            	    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:985:1: xor_cons returns [String value, String dt] : ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) ;
    public final RecTranslator.xor_cons_return xor_cons() throws RecognitionException {
        RecTranslator.xor_cons_return retval = new RecTranslator.xor_cons_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:986:2: ( ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:986:4: ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons1581); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons1585); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1587); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:986:19: ( ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:986:19: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1589); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,OUT,FOLLOW_OUT_in_xor_cons1594); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1596); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:986:33: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:986:33: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1598); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:995:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final RecTranslator.applicaiton_def_return applicaiton_def() throws RecognitionException {
        RecTranslator.applicaiton_def_return retval = new RecTranslator.applicaiton_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:996:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:996:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1619); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1621);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:996:29: ( trigger_def )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_BLOCK_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:996:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1623);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:999:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final RecTranslator.list_reconfigurations_return list_reconfigurations() throws RecognitionException {
        RecTranslator.list_reconfigurations_return retval = new RecTranslator.list_reconfigurations_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1000:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1000:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1000:4: ( reconfiguration_call )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1000:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1636);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1003:1: trigger_def : trigger_block ;
    public final RecTranslator.trigger_def_return trigger_def() throws RecognitionException {
        RecTranslator.trigger_def_return retval = new RecTranslator.trigger_def_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1004:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1004:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1650);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1007:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final RecTranslator.trigger_block_return trigger_block() throws RecognitionException {
        RecTranslator.trigger_block_return retval = new RecTranslator.trigger_block_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1008:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1008:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1662); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1664); 

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
        public String id;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1015:1: main_def returns [String id] : ( main_args )? main_block -> mkmain(files=$reclang::imported_coopla_filesargs=$main_args.valuesinsts=$main_block.values);
    public final RecTranslator.main_def_return main_def() throws RecognitionException {
        RecTranslator.main_def_return retval = new RecTranslator.main_def_return();
        retval.start = input.LT(1);

        RecTranslator.main_args_return main_args55 = null;

        RecTranslator.main_block_return main_block56 = null;



        	((element_scope)element_stack.peek()).ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get("$main");
        	((element_scope)element_stack.peek()).current_scope = ((element_scope)element_stack.peek()).ts.getScopes().get(0); //main has only one scope
        	
        	retval.id = "Main";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1022:2: ( ( main_args )? main_block -> mkmain(files=$reclang::imported_coopla_filesargs=$main_args.valuesinsts=$main_block.values))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1022:4: ( main_args )? main_block
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1022:4: ( main_args )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ARGUMENTS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1022:4: main_args
                    {
                    pushFollow(FOLLOW_main_args_in_main_def1686);
                    main_args55=main_args();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_main_block_in_main_def1689);
            main_block56=main_block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 1024:2: -> mkmain(files=$reclang::imported_coopla_filesargs=$main_args.valuesinsts=$main_block.values)
            {
                retval.st = templateLib.getInstanceOf("mkmain",
              new STAttrMap().put("files", ((reclang_scope)reclang_stack.peek()).imported_coopla_files).put("args", (main_args55!=null?main_args55.values:null)).put("insts", (main_block56!=null?main_block56.values:null)));
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
    // $ANTLR end "main_def"

    public static class main_args_return extends TreeRuleReturnScope {
        public List<String> values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1027:1: main_args returns [List<String> values] : ^( ARGUMENTS ( main_arg )+ ) ;
    public final RecTranslator.main_args_return main_args() throws RecognitionException {
        RecTranslator.main_args_return retval = new RecTranslator.main_args_return();
        retval.start = input.LT(1);

        RecTranslator.main_arg_return main_arg57 = null;



        	List<String> args = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1031:2: ( ^( ARGUMENTS ( main_arg )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1031:4: ^( ARGUMENTS ( main_arg )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1731); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1031:16: ( main_arg )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1031:17: main_arg
            	    {
            	    pushFollow(FOLLOW_main_arg_in_main_args1734);
            	    main_arg57=main_arg();

            	    state._fsp--;


            	    		args.add((main_arg57!=null?main_arg57.st:null).toString());
            	    	

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
    // $ANTLR end "main_args"

    public static class main_arg_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_arg"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1044:1: main_arg : ^( ARGUMENT ID ids ) -> list_args(cp=$ID.textids=$ids.values);
    public final RecTranslator.main_arg_return main_arg() throws RecognitionException {
        RecTranslator.main_arg_return retval = new RecTranslator.main_arg_return();
        retval.start = input.LT(1);

        CommonTree ID58=null;
        RecTranslator.ids_return ids59 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1045:2: ( ^( ARGUMENT ID ids ) -> list_args(cp=$ID.textids=$ids.values))
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1045:4: ^( ARGUMENT ID ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1763); 

            match(input, Token.DOWN, null); 
            ID58=(CommonTree)match(input,ID,FOLLOW_ID_in_main_arg1765); 
            pushFollow(FOLLOW_ids_in_main_arg1767);
            ids59=ids();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 1046:2: -> list_args(cp=$ID.textids=$ids.values)
            {
                retval.st = templateLib.getInstanceOf("list_args",
              new STAttrMap().put("cp", (ID58!=null?ID58.getText():null)).put("ids", (ids59!=null?ids59.values:null)));
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
    // $ANTLR end "main_arg"

    public static class ids_return extends TreeRuleReturnScope {
        public List<String> values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1049:1: ids returns [List<String> values] : ^( IDS ( ID )+ ) ;
    public final RecTranslator.ids_return ids() throws RecognitionException {
        RecTranslator.ids_return retval = new RecTranslator.ids_return();
        retval.start = input.LT(1);

        CommonTree ID60=null;


        	List<String> ids = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1053:2: ( ^( IDS ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1053:4: ^( IDS ( ID )+ )
            {
            match(input,IDS,FOLLOW_IDS_in_ids1804); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1053:10: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1053:11: ID
            	    {
            	    ID60=(CommonTree)match(input,ID,FOLLOW_ID_in_ids1807); 

            	    		ids.add("_" + (ID60!=null?ID60.getText():null));
            	    	

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

            		retval.values = ids;
            	

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

    protected static class main_block_scope {
        Set<String> reconfs;
        Integer i;
    }
    protected Stack main_block_stack = new Stack();

    public static class main_block_return extends TreeRuleReturnScope {
        public List<String> values;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1065:1: main_block returns [List<String> values] : ^( INSTRUCTIONS ( main_instruction )+ ) ;
    public final RecTranslator.main_block_return main_block() throws RecognitionException {
        main_block_stack.push(new main_block_scope());
        RecTranslator.main_block_return retval = new RecTranslator.main_block_return();
        retval.start = input.LT(1);

        RecTranslator.main_instruction_return main_instruction61 = null;



        	((main_block_scope)main_block_stack.peek()).reconfs = new HashSet<String>();
        	((main_block_scope)main_block_stack.peek()).i = 0;
        	List<String> insts = new ArrayList<String>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1075:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1075:4: ^( INSTRUCTIONS ( main_instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1846); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1075:19: ( main_instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1075:20: main_instruction
            	    {
            	    pushFollow(FOLLOW_main_instruction_in_main_block1849);
            	    main_instruction61=main_instruction();

            	    state._fsp--;


            	    		insts.add((main_instruction61!=null?main_instruction61.value:null));
            	    	

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

            		List<String> all_instructions = new ArrayList<String>(((main_block_scope)main_block_stack.peek()).reconfs);
            		all_instructions.addAll(insts);
            		
            		retval.values = all_instructions;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            main_block_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "main_block"

    public static class main_instruction_return extends TreeRuleReturnScope {
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1090:1: main_instruction returns [String value] : ( main_declaration | main_assignment );
    public final RecTranslator.main_instruction_return main_instruction() throws RecognitionException {
        RecTranslator.main_instruction_return retval = new RecTranslator.main_instruction_return();
        retval.start = input.LT(1);

        RecTranslator.main_declaration_return main_declaration62 = null;

        RecTranslator.main_assignment_return main_assignment63 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1091:2: ( main_declaration | main_assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1091:4: main_declaration
                    {
                    pushFollow(FOLLOW_main_declaration_in_main_instruction1878);
                    main_declaration62=main_declaration();

                    state._fsp--;

                     retval.value = (main_declaration62!=null?main_declaration62.value:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1094:4: main_assignment
                    {
                    pushFollow(FOLLOW_main_assignment_in_main_instruction1889);
                    main_assignment63=main_assignment();

                    state._fsp--;

                     retval.value = (main_assignment63!=null?main_assignment63.value:null); 

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1098:1: main_declaration returns [String value] : ^( DECLARATION cp= ID ids ) ;
    public final RecTranslator.main_declaration_return main_declaration() throws RecognitionException {
        RecTranslator.main_declaration_return retval = new RecTranslator.main_declaration_return();
        retval.start = input.LT(1);

        CommonTree cp=null;
        RecTranslator.ids_return ids64 = null;



        	String value = "";	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1102:2: ( ^( DECLARATION cp= ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1102:4: ^( DECLARATION cp= ID ids )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_main_declaration1912); 

            match(input, Token.DOWN, null); 
            cp=(CommonTree)match(input,ID,FOLLOW_ID_in_main_declaration1916); 
            pushFollow(FOLLOW_ids_in_main_declaration1918);
            ids64=ids();

            state._fsp--;


            		for (String id : (ids64!=null?ids64.values:null)){
            			value += "\nfinal CoordinationPattern2 " + id + " = new CoordinationPattern2(patterns.get(\"" + cp + "\").getSimplePattern());\n";
            		}
            	

            match(input, Token.UP, null); 

            		retval.value = value;
            	

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
        public String value;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1115:1: main_assignment returns [String value] : ^( APPLICATION ( ^( DECLARATION (id1= ID )? ids ) )? ^( OP_APPLY id2= ID reconfiguration_call ) ) ;
    public final RecTranslator.main_assignment_return main_assignment() throws RecognitionException {
        RecTranslator.main_assignment_return retval = new RecTranslator.main_assignment_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        RecTranslator.ids_return ids65 = null;

        RecTranslator.reconfiguration_call_return reconfiguration_call66 = null;



        	Integer i = ((main_block_scope)main_block_stack.peek()).i++;
        	String value = "";
        	
        	String first_id = "";
        	String first_decl = "";
        	String remaining = "";
        	
        	boolean isDeclaration = false;
        	String add_pattern = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1127:2: ( ^( APPLICATION ( ^( DECLARATION (id1= ID )? ids ) )? ^( OP_APPLY id2= ID reconfiguration_call ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1127:4: ^( APPLICATION ( ^( DECLARATION (id1= ID )? ids ) )? ^( OP_APPLY id2= ID reconfiguration_call ) )
            {
            match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1949); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1127:19: ( ^( DECLARATION (id1= ID )? ids ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DECLARATION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1127:21: ^( DECLARATION (id1= ID )? ids )
                    {
                    match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1954); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1127:35: (id1= ID )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTranslator.g:1127:36: id1= ID
                            {
                            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_main_assignment1959); 

                            		isDeclaration = true;
                            	
                            	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ids_in_main_assignment1968);
                    ids65=ids();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		first_id = (ids65!=null?ids65.values:null).get(0);
                    		first_decl = "final CoordinationPattern2 " + first_id + " = (CoordinationPattern2) ";
                    				
                    		(ids65!=null?ids65.values:null).remove(0);
                    		for (String id : (ids65!=null?ids65.values:null)){
                    			remaining += "final CoordinationPattern2 " + id + " = new CoordinationPattern2(" + first_id + ");\n";
                    		}
                    		
                    		
                    		if (isDeclaration){
                    			//adiciona novo tipo de padrão a um map de padroes (eg: Replicator x = ... -> add "Replicator")
                    			add_pattern += "\n$new_cp = new CoordinationPattern2(" + first_id + ");\n";
                    			add_pattern += "$new_cp.setId(\"" + id1 + "\");\n";
                    			add_pattern += "$cpmi = new CPModelInternal();\n";
                    			add_pattern += "$cpmi.setSimplePattern($new_cp);\n";
                    			add_pattern += "patterns.put( \"" + id1 + "\", $cpmi );\n";
                    		}
                    	

                    }
                    break;

            }

            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1984); 

            match(input, Token.DOWN, null); 
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_main_assignment1988); 
            pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1990);
            reconfiguration_call66=reconfiguration_call();

            state._fsp--;


            	
            		String op = (reconfiguration_call66!=null?reconfiguration_call66.name:null);
            		//String var_name = op.toLowerCase();
            		
            		//eg: par -> P + ar = Par
            		String class_name = Character.toUpperCase(op.charAt(0)) + op.substring(1);
            		
            		String args = (reconfiguration_call66!=null?reconfiguration_call66.args:null);
            		List<String> dts = new ArrayList<String>();
            		for (String dt : (reconfiguration_call66!=null?reconfiguration_call66.dts:null)){
            			int j = dt.indexOf('<');
            			if (j > 0){
            				dts.add(dt.substring(0, i) + ".class"); //eg: Pair<Node,Node> -> Pair
            			} else {
            				dts.add(dt + ".class");
            			}
            		}
            		String datatypes = listToString(dts);
            		
            		String rec = "\nClass " + op + " = Class.forName( \"" + class_name + "\" );\n";
            		rec += "Constructor " + op + "_constructor = " + op + ".getConstructor(" + datatypes + ");\n";	
            		((main_block_scope)main_block_stack.peek()).reconfs.add(rec);
            		
            		value = "\nObject " + op + i + "_obj = " + op + "_constructor.newInstance(" + args + ");\n";
            		value += "Method " + op + i + "_apply = " + op + ".getMethod(\"apply\", CoordinationPattern2.class);\n";
            		value += first_decl + op + i + "_apply.invoke(" + op + i + "_obj, _" + id2 + " );\n";
            		value += remaining;
            		
            		value += add_pattern;
            	

            match(input, Token.UP, null); 

            		retval.value = value;
            	

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
    public static final BitSet FOLLOW_RECONFIGURATION_in_element143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_element180 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_def_in_element182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def281 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def337 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype414 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_SET_in_other_type431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PAIR_in_other_type442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_TRIPLE_in_other_type450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids484 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block533 = new BitSet(new long[]{0x0000001000000008L,0x000000000000E000L});
    public static final BitSet FOLLOW_declaration_in_instruction579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply627 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply629 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration662 = new BitSet(new long[]{0x2000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_var_def_in_declaration672 = new BitSet(new long[]{0x2000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_var_def700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment740 = new BitSet(new long[]{0x200000F000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call857 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call867 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call869 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call879 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call881 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args966 = new BitSet(new long[]{0x200000E000C00002L,0x00000000009F0000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction1007 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction1018 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction1031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression1060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1064 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1084 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1088 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression1100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1104 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1195 = new BitSet(new long[]{0x20000001BF000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1208 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1436 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1440 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1444 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1474 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1509 = new BitSet(new long[]{0x200000E000C00008L,0x00000000009F0000L});
    public static final BitSet FOLLOW_NODE_in_node_cons1548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1551 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons1581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons1585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1587 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_xor_cons1589 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons1594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1596 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1598 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1619 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1621 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1636 = new BitSet(new long[]{0x20000000003F0002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1662 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_args_in_main_def1686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_main_block_in_main_def1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTS_in_main_args1731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_arg_in_main_args1734 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_main_arg1763 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_arg1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_arg1767 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDS_in_ids1804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ids1807 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_instruction_in_main_block1849 = new BitSet(new long[]{0x0000000000000008L,0x0000000002002000L});
    public static final BitSet FOLLOW_main_declaration_in_main_instruction1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_assignment_in_main_instruction1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARATION_in_main_declaration1912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_declaration1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_declaration1918 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_main_assignment1949 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECLARATION_in_main_assignment1954 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_assignment1968 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1984 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1988 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1990 = new BitSet(new long[]{0x0000000000000008L});

}