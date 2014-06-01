// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g 2014-06-01 18:52:23

	package pt.uminho.di.reolang.reclang;
		
	import pt.uminho.di.reolang.ReoLangSemantics;
	import pt.uminho.di.reolang.parsing.Semantics;
	import pt.uminho.di.reolang.parsing.util.Error;
	import pt.uminho.di.reolang.parsing.util.*;
	//import java.util.*;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Collections;
	import java.util.Comparator;
	import java.io.File;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RecSA extends TreeParser {
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


        public RecSA(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public RecSA(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return RecSA.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g"; }


    	private String file_path;

    	public void setFilePath(String file) {
    		this.file_path = file;
    	}



    	//Error se = new Error();
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
    	
    	
    	private ArrayList<Error> removeRepeatedErrors(ArrayList<Error> errors){
    		ArrayList<Error> local_errors = new ArrayList<Error>(errors);
    		
    		for (int i=0; i<local_errors.size(); i++) {
    			for (int j=0; j<local_errors.size(); j++) {
    				if (local_errors.get(i).getMessage().equals(local_errors.get(j).getMessage()) && i != j) {
    					if (local_errors.get(i).getLine() < local_errors.get(j).getLine()){
    						local_errors.remove(j);
    					} else{
    						local_errors.remove(i);
    					}
    				}
    			}
    		}
    		
    		return local_errors;
    	}
           	
           		
    	
    	//method used in expression prduction
    	private Triple<List<Error>, HashSet<List<Type>>, Integer> getData(String n, List<Type> t, List<Error> e, CommonTree v){
        		
        		List<Error> local_errors = new ArrayList<Error>();
        		HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        		Integer nulls = 0;
        		
        		if (t.isEmpty()){
        			local_errors.addAll(e);
        			nulls++;
        		}
        		else{
        			//if dt is a Set<T>
        			if (t.get(0).equals(Type.SET)){
        				datatypes.add(t);
        			}
        			else{
        				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(n, "Set<T>"), v.getLine(), v.getCharPositionInLine(), this.file_path) );
        				nulls++;
        			}
        		}
        		
        		Triple<List<Error>, HashSet<List<Type>>, Integer> res = new Triple<List<Error>, HashSet<List<Type>>, Integer>();
        		res.setFirst(local_errors);
        		res.setSecond(datatypes);
        		res.setThird(nulls);
        		
        		return res;
        	}


    protected static class reclang_scope {
        TinySymbolsTable ids_table;
        SymbolsTable coopla_table;
        int scope_id;
        int parent_id;
        int aux_id;
        List<Integer> scopes;
        HashMap<Integer,Integer> scope_rel;
    }
    protected Stack reclang_stack = new Stack();


    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:102:1: reclang[TinySymbolsTable global_table] returns [ArrayList<Error> errors] : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final ArrayList<Error> reclang(TinySymbolsTable global_table) throws RecognitionException {
        reclang_stack.push(new reclang_scope());
        ArrayList<Error> errors = null;

        ArrayList<Error> directive_def1 = null;

        ArrayList<Error> element2 = null;



        	((reclang_scope)reclang_stack.peek()).ids_table = global_table;
        	((reclang_scope)reclang_stack.peek()).coopla_table = new SymbolsTable();
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	((reclang_scope)reclang_stack.peek()).parent_id = 0;	
        	((reclang_scope)reclang_stack.peek()).aux_id = 0;
        	((reclang_scope)reclang_stack.peek()).scopes = new ArrayList<Integer>(); //LinkedList
        	((reclang_scope)reclang_stack.peek()).scopes.add(0);
        	((reclang_scope)reclang_stack.peek()).scope_rel = new HashMap<Integer,Integer>();

        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	boolean exist_imported_errors = false;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:125:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:125:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang62); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:125:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:125:17: directive_def
                	    {
                	    pushFollow(FOLLOW_directive_def_in_reclang65);
                	    directive_def1=directive_def();

                	    state._fsp--;


                	    		local_errors.addAll(directive_def1);
                	    		if ( !directive_def1.isEmpty() ){
                	    			exist_imported_errors = true;
                	    		}
                	    	

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:133:5: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||(LA2_0>=APPLICATION && LA2_0<=MAIN)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:133:6: element
                	    {
                	    pushFollow(FOLLOW_element_in_reclang77);
                	    element2=element();

                	    state._fsp--;


                	    		//rever -> join imported errors to file errors?
                	    		/*
                	    		if( !exist_imported_errors ){ 
                	    			local_errors.addAll(element2);
                	    		}
                	    		*/
                	    		local_errors.addAll(element2);
                	    	

                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            		//System.out.println(((reclang_scope)reclang_stack.peek()).scope_rel);
            		
            		//local_errors = this.removeRepeatedErrors(local_errors);
            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            reclang_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "reclang"


    // $ANTLR start "directive_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:158:1: directive_def returns [ArrayList<Error> errors] : directive_import ;
    public final ArrayList<Error> directive_def() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> directive_import3 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:159:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:159:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def112);
            directive_import3=directive_import();

            state._fsp--;


            		errors = directive_import3;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "directive_def"


    // $ANTLR start "directive_import"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:166:1: directive_import returns [ArrayList<Error> errors] : ^( IMPORT STRING ) ;
    public final ArrayList<Error> directive_import() throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree STRING4=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:171:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:171:4: ^( IMPORT STRING )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import136); 

            match(input, Token.DOWN, null); 
            STRING4=(CommonTree)match(input,STRING,FOLLOW_STRING_in_directive_import138); 

            		String file_name = (STRING4!=null?STRING4.getText():null);
            		String file = file_name.substring(1, file_name.length()-1); //remove " from string
            		
            	    	File f = new File( file );
            	    	if( !f.exists() ){
            	    		local_errors.add( Error.report(ErrorType.ERROR, Error.fileDoesNotExist(file), (STRING4!=null?STRING4.getLine():0), (STRING4!=null?STRING4.getCharPositionInLine():0), this.file_path) );
            	    	}
            	    	else{
            			String file_extension = file_name.substring(file_name.length()-5, file_name.length()-1); //eg: "overlap.rpl" -> rpl
            			
            			if (file_extension.equals(Constants.RECOOPLA_FILE_EXTENSION)) {		//*.rpla
            				Processor p = new Processor(file);
            				TinySymbolsTable imported_ids_table = p.getIdentifiersTable(((reclang_scope)reclang_stack.peek()).ids_table);
            				ArrayList<Error> imported_semantic_errors = p.getSemanticErrors( imported_ids_table );
            				
            				if ( !imported_semantic_errors.isEmpty() ){
            					local_errors.addAll( imported_semantic_errors );
            				}
            			}
            			else if (file_extension.equals(Constants.COOPLA_FILE_EXTENSION)) {	//*.cpla
            				Semantics semantics = new Semantics(file);
            				
            				ReoLangSemantics.reolang_return imported_atts = semantics.performSemanticAnalysis(((reclang_scope)reclang_stack.peek()).coopla_table);
            				ArrayList<Error> coopla_errors = imported_atts != null ? imported_atts.errors : new ArrayList<Error>(0);
            				if ( !coopla_errors.isEmpty() ){
            					local_errors.addAll( coopla_errors );
            				}
            				
            				((reclang_scope)reclang_stack.peek()).coopla_table = imported_atts != null ? imported_atts.symbols : ((reclang_scope)reclang_stack.peek()).coopla_table ;
            			}
            			else{
            				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidFile(file), (STRING4!=null?STRING4.getLine():0), (STRING4!=null?STRING4.getCharPositionInLine():0), this.file_path) );
            			}
            		}
            		
            		errors = local_errors;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "directive_import"

    protected static class element_scope {
        TinySymbol name;
        //attributes changed on instruction
        	TinySymbolsTable current_scope;
        String rec_type;
    }
    protected Stack element_stack = new Stack();


    // $ANTLR start "element"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:218:1: element returns [ArrayList<Error> errors] : ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) | ^( MAIN main_def ) );
    public final ArrayList<Error> element() throws RecognitionException {
        element_stack.push(new element_scope());
        ArrayList<Error> errors = null;

        ArrayList<Error> reconfiguration_def5 = null;

        ArrayList<Error> main_def6 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:226:2: ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) | ^( MAIN main_def ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:226:4: ^( RECONFIGURATION reconfiguration_def )
                    {
                    match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element168); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_reconfiguration_def_in_element170);
                    reconfiguration_def5=reconfiguration_def();

                    state._fsp--;


                    		errors = reconfiguration_def5;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:232:4: ^( APPLICATION applicaiton_def )
                    {
                    match(input,APPLICATION,FOLLOW_APPLICATION_in_element185); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_applicaiton_def_in_element187);
                    applicaiton_def();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:234:4: ^( MAIN main_def )
                    {
                    match(input,MAIN,FOLLOW_MAIN_in_element197); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_main_def_in_element199);
                    main_def6=main_def();

                    state._fsp--;


                    		errors = main_def6;
                    	

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
            element_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "element"

    protected static class reconfiguration_def_scope {
        ArrayList<TinySymbolsTable> scopes;
    }
    protected Stack reconfiguration_def_stack = new Stack();


    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:243:1: reconfiguration_def returns [ArrayList<Error> errors] : ^( ID ( args_def )? reconfiguration_block ) ;
    public final ArrayList<Error> reconfiguration_def() throws RecognitionException {
        reconfiguration_def_stack.push(new reconfiguration_def_scope());
        ArrayList<Error> errors = null;

        CommonTree ID7=null;
        ArrayList<Error> args_def8 = null;

        ArrayList<Error> reconfiguration_block9 = null;



        	((element_scope)element_stack.peek()).name = new TinySymbol();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = new ArrayList<TinySymbolsTable>();
        	ArrayList<Error> local_errors = new ArrayList<Error>();

        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	
        	boolean recAlreadyDefined = false;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:256:2: ( ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:256:4: ^( ID ( args_def )? reconfiguration_block )
            {
            ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def229); 

            		
            		TinySymbol ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get((ID7!=null?ID7.getText():null));
            		((element_scope)element_stack.peek()).name = ts;
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();

            		if (((reclang_scope)reclang_stack.peek()).ids_table.containsSymbol((ID7!=null?ID7.getText():null))){
            			int idx = this.file_path.lastIndexOf('/');
            			String resource = file_path.substring(idx + 1);
            			if ( !((ID7!=null?ID7.getLine():0) == ts.getLine() && (ID7!=null?ID7.getCharPositionInLine():0) == ts.getPosition() && resource.equals(ts.getFile())) ){
            				//System.out.println(resource + " -> rec: " + (ID7!=null?ID7.getText():null));
            				local_errors.add( Error.report(ErrorType.ERROR, Error.recAlreadyDefined((ID7!=null?ID7.getText():null), ts.getLine(), ts.getPosition(), ts.getFile()), (ID7!=null?ID7.getLine():0), (ID7!=null?ID7.getCharPositionInLine():0), this.file_path) );
            				recAlreadyDefined = true;
            			}
            		}
            	

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:272:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:272:3: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def237);
                    args_def8=args_def();

                    state._fsp--;


                    		if (!recAlreadyDefined){
                    			local_errors.addAll(args_def8);
                    		}
                    	

                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def246);
            reconfiguration_block9=reconfiguration_block();

            state._fsp--;


            		if (!recAlreadyDefined){
            			local_errors.addAll(reconfiguration_block9);
            		}
            	

            match(input, Token.UP, null); 

            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            reconfiguration_def_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "reconfiguration_def"

    protected static class args_def_scope {
        TinySymbolsTable scope;
    }
    protected Stack args_def_stack = new Stack();


    // $ANTLR start "args_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:291:1: args_def returns [ArrayList<Error> errors] : ^( ARGUMENTS ( arg_def )+ ) ;
    public final ArrayList<Error> args_def() throws RecognitionException {
        args_def_stack.push(new args_def_scope());
        ArrayList<Error> errors = null;

        ArrayList<Error> arg_def10 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	((args_def_scope)args_def_stack.peek()).scope = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.get(0);
        	//((reclang_scope)reclang_stack.peek()).scope_id++;
        	TinySymbolsTable tst = new TinySymbolsTable(((reclang_scope)reclang_stack.peek()).ids_table);
        	for (TinySymbol ts : tst.getSymbols().values()){
        		ts.getScopes().clear();
        		((args_def_scope)args_def_stack.peek()).scope.addSymbol(ts);
        	}

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:305:2: ( ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:305:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def279); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:305:16: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:305:17: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def282);
            	    arg_def10=arg_def();

            	    state._fsp--;


            	    		local_errors.addAll(arg_def10);
            	    	

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

            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            args_def_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "args_def"


    // $ANTLR start "arg_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:317:1: arg_def returns [ArrayList<Error> errors] : ^( ARGUMENT datatype list_ids ) ;
    public final ArrayList<Error> arg_def() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> list_ids11 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:322:2: ( ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:322:4: ^( ARGUMENT datatype list_ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def315); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def317);
            datatype();

            state._fsp--;

            pushFollow(FOLLOW_list_ids_in_arg_def319);
            list_ids11=list_ids();

            state._fsp--;


            		local_errors.addAll(list_ids11);
            	

            match(input, Token.UP, null); 

            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "arg_def"


    // $ANTLR start "datatype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:333:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final void datatype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:334:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:334:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype340); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:335:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype345); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:336:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype350); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:337:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype355); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:338:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype360); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:339:5: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype368);
                    other_type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype370);
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
        return ;
    }
    // $ANTLR end "datatype"


    // $ANTLR start "other_type"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:342:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final void other_type() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:343:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:
            {
            if ( (input.LA(1)>=DT_SET && input.LA(1)<=DT_TRIPLE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
    // $ANTLR end "other_type"


    // $ANTLR start "subtype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:348:1: subtype : datatype ;
    public final void subtype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:349:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:349:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype404);
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
        return ;
    }
    // $ANTLR end "subtype"


    // $ANTLR start "list_ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:352:1: list_ids returns [ArrayList<Error> errors] : ( ID )+ ;
    public final ArrayList<Error> list_ids() throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree ID12=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:2: ( ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:4: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:4: ( ID )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:5: ID
            	    {
            	    ID12=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids423); 

            	    		//if (((reclang_scope)reclang_stack.peek()).ids_table
            	    		if (((args_def_scope)args_def_stack.peek()).scope.containsSymbol((ID12!=null?ID12.getText():null))){
            	    			TinySymbol ts = ((args_def_scope)args_def_stack.peek()).scope.getSymbols().get((ID12!=null?ID12.getText():null));
            	    			if ( !((ID12!=null?ID12.getLine():0) == ts.getLine() && (ID12!=null?ID12.getCharPositionInLine():0) == ts.getPosition()) ){
            	    				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID12!=null?ID12.getText():null), ts.getLine(), ts.getPosition()), (ID12!=null?ID12.getLine():0), (ID12!=null?ID12.getCharPositionInLine():0), this.file_path) );
            	    			}
            	    		}
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "list_ids"


    // $ANTLR start "reconfiguration_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:375:1: reconfiguration_block returns [ArrayList<Error> errors] : ^( INSTRUCTIONS ( instruction )+ ) ;
    public final ArrayList<Error> reconfiguration_block() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> instruction13 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:380:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:380:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block454); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:380:19: ( instruction )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==OP_APPLY||(LA8_0>=DECLARATION && LA8_0<=FORALL)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:380:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block457);
            	    instruction13=instruction();

            	    state._fsp--;


            	    		local_errors.addAll(instruction13);
            	    	

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


            match(input, Token.UP, null); 

            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "reconfiguration_block"


    // $ANTLR start "instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:392:1: instruction returns [ArrayList<Error> errors] : ( declaration | assignment[false] | reconfiguration_apply | for_instruction );
    public final ArrayList<Error> instruction() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> declaration14 = null;

        ArrayList<Error> assignment15 = null;

        ArrayList<Error> reconfiguration_apply16 = null;

        ArrayList<Error> for_instruction17 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	((element_scope)element_stack.peek()).rec_type = "";
        	((element_scope)element_stack.peek()).current_scope = this.getScope( ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1) ); //rever

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:398:2: ( declaration | assignment[false] | reconfiguration_apply | for_instruction )
            int alt9=4;
            switch ( input.LA(1) ) {
            case DECLARATION:
                {
                alt9=1;
                }
                break;
            case ASSIGNMENT:
                {
                alt9=2;
                }
                break;
            case OP_APPLY:
                {
                alt9=3;
                }
                break;
            case FORALL:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:398:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction489);
                    declaration14=declaration();

                    state._fsp--;

                     
                    		local_errors.addAll(declaration14); 
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:403:4: assignment[false]
                    {
                    pushFollow(FOLLOW_assignment_in_instruction498);
                    assignment15=assignment(false);

                    state._fsp--;

                     
                    		local_errors.addAll(assignment15); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:408:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction508);
                    reconfiguration_apply16=reconfiguration_apply();

                    state._fsp--;

                     
                    		local_errors.addAll(reconfiguration_apply16); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:413:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction517);
                    for_instruction17=for_instruction();

                    state._fsp--;


                    		local_errors.addAll(for_instruction17);
                    		errors = local_errors;	

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
        }
        return errors;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "reconfiguration_apply"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:424:1: reconfiguration_apply returns [ArrayList<Error> errors] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final ArrayList<Error> reconfiguration_apply() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> reconfiguration_call18 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:429:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:429:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply539); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply541);
            reconfiguration_call18=reconfiguration_call();

            state._fsp--;


            		local_errors.addAll(reconfiguration_call18);
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:434:2: ( ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:434:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply548); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "reconfiguration_apply"


    // $ANTLR start "declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:441:1: declaration returns [ArrayList<Error> errors] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final ArrayList<Error> declaration() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> var_def19 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:446:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:446:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration573); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration575);
            datatype();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:446:27: ( var_def )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ID||LA11_0==ASSIGNMENT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:446:28: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration578);
            	    var_def19=var_def();

            	    state._fsp--;


            	    		local_errors.addAll(var_def19);
            	    	

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


            match(input, Token.UP, null); 

            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "var_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:457:1: var_def returns [ArrayList<Error> errors] : ( ID | assignment[true] );
    public final ArrayList<Error> var_def() throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree ID20=null;
        ArrayList<Error> assignment21 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:462:2: ( ID | assignment[true] )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==ASSIGNMENT) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:462:4: ID
                    {
                    ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def608); 

                    		if (((element_scope)element_stack.peek()).current_scope.containsSymbol((ID20!=null?ID20.getText():null))){
                    			TinySymbol ts = ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID20!=null?ID20.getText():null));
                    			if ( !((ID20!=null?ID20.getLine():0) == ts.getLine() && (ID20!=null?ID20.getCharPositionInLine():0) == ts.getPosition()) ){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID20!=null?ID20.getText():null), ts.getLine(), ts.getPosition()), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0), this.file_path) );
                    			}
                    		}
                    		else {
                    			Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();
                    			TinySymbol ts = ((element_scope)element_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);

                    			if ( ts != null && !((ID20!=null?ID20.getLine():0) == ts.getLine() && (ID20!=null?ID20.getCharPositionInLine():0) == ts.getPosition())){ //rever
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID20!=null?ID20.getText():null), ts.getLine(), ts.getPosition()), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0), this.file_path) );
                    			}
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:481:4: assignment[true]
                    {
                    pushFollow(FOLLOW_assignment_in_var_def617);
                    assignment21=assignment(true);

                    state._fsp--;


                    		local_errors.addAll(assignment21);
                    		errors = local_errors; 
                    	

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
        return errors;
    }
    // $ANTLR end "var_def"


    // $ANTLR start "assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:488:1: assignment[boolean isDeclaration] returns [ArrayList<Error> errors] : ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] ) ;
    public final ArrayList<Error> assignment(boolean isDeclaration) throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree ID22=null;
        ArrayList<Error> assignment_member23 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	TinySymbol ts = new TinySymbol();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:494:2: ( ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:494:4: ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment642); 

            match(input, Token.DOWN, null); 
            ID22=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment644); 
            		
            		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();	
            /*		
            		ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID22!=null?ID22.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID22!=null?ID22.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((ID22!=null?ID22.getText():null), s_id);	

            		if (isDeclaration){
            			if ( ts != null && !((ID22!=null?ID22.getLine():0) == ts.getLine() && (ID22!=null?ID22.getCharPositionInLine():0) == ts.getPosition()) ){
            				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID22!=null?ID22.getText():null), ts.getLine(), ts.getPosition()), (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0), this.file_path) );
            			}
            		}
            		else{
            			if ( ts == null){
            				local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID22!=null?ID22.getText():null)), (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0), this.file_path) );
            			}
            		}				
            */				
            		if (isDeclaration){
            			if (((element_scope)element_stack.peek()).current_scope.containsSymbol((ID22!=null?ID22.getText():null))) {
            				ts = ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID22!=null?ID22.getText():null));
            				if ( !((ID22!=null?ID22.getLine():0) == ts.getLine() && (ID22!=null?ID22.getCharPositionInLine():0) == ts.getPosition()) ){
            					local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID22!=null?ID22.getText():null), ts.getLine(), ts.getPosition()), (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0), this.file_path) );
            				}
            			}
            			else {
            				ts = ((element_scope)element_stack.peek()).name.hasValue((ID22!=null?ID22.getText():null), s_id);
            				if ( ts != null && !((ID22!=null?ID22.getLine():0) == ts.getLine() && (ID22!=null?ID22.getCharPositionInLine():0) == ts.getPosition())){ //rever
            					local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID22!=null?ID22.getText():null), ts.getLine(), ts.getPosition()), (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0), this.file_path) );
            				}
            			}
            		}
            		else{
            			ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID22!=null?ID22.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID22!=null?ID22.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((ID22!=null?ID22.getText():null), s_id);
            	
            			if ( ts == null || (ID22!=null?ID22.getLine():0) < ts.getLine() ){
            				local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID22!=null?ID22.getText():null)), (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0), this.file_path) );
            			}
            		}

            		ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID22!=null?ID22.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID22!=null?ID22.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((ID22!=null?ID22.getText():null), s_id);	
            	
            pushFollow(FOLLOW_assignment_member_in_assignment650);
            assignment_member23=assignment_member(ts, (ID22!=null?ID22.getLine():0), (ID22!=null?ID22.getCharPositionInLine():0));

            state._fsp--;


            match(input, Token.UP, null); 

            		local_errors.addAll(assignment_member23);
            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "assignment_member"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:542:1: assignment_member[TinySymbol symbol, int id_line, int id_pos] returns [ArrayList<Error> errors] : ( expression | reconfiguration_apply );
    public final ArrayList<Error> assignment_member(TinySymbol symbol, int id_line, int id_pos) throws RecognitionException {
        ArrayList<Error> errors = null;

        RecSA.expression_return expression24 = null;

        ArrayList<Error> reconfiguration_apply25 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	TinySymbol ts = symbol;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:547:2: ( expression | reconfiguration_apply )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=OP_PATH && LA13_0<=OP_UPDATE)||(LA13_0>=OP_UNION && LA13_0<=OP_MINUS)||LA13_0==ID||(LA13_0>=TRIPLE && LA13_0<=XOR)||LA13_0==ACCESS) ) {
                alt13=1;
            }
            else if ( (LA13_0==OP_APPLY) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:547:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member676);
                    expression24=expression();

                    state._fsp--;


                    /**/		if (!(expression24!=null?expression24.errors:null).isEmpty()){
                    			local_errors.addAll((expression24!=null?expression24.errors:null));
                    		}
                    		else{
                    //*/
                    			if (ts != null) {	
                    				if ( !ts.getDataType().equals((expression24!=null?expression24.datatype:null)) ){
                    					local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((expression24!=null?expression24.name:null), ts.dataTypeToString()), (expression24!=null?((CommonTree)expression24.start):null).getLine(), (expression24!=null?((CommonTree)expression24.start):null).getCharPositionInLine(), this.file_path) );
                    			 	}
                    			}
                    		}
                    /*
                    		if (local_errors.isEmpty()){
                    			local_errors.addAll((expression24!=null?expression24.errors:null));
                    		}
                    */
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:567:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member685);
                    reconfiguration_apply25=reconfiguration_apply();

                    state._fsp--;

                     
                    		if (ts != null){
                    			List<Type> dt = new ArrayList<Type>();
                    			dt.add(Type.PATTERN);
                    			if (!ts.getDataType().equals(dt)){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(ts.getId(), "Pattern") , id_line, id_pos, this.file_path) );
                    			}	
                    			else{
                    				local_errors.addAll(reconfiguration_apply25); 
                    			}
                    		}
                    		errors = local_errors; 
                    	

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
        return errors;
    }
    // $ANTLR end "assignment_member"

    protected static class reconfiguration_call_scope {
        List<TinySymbol> args;
        String name;
    }
    protected Stack reconfiguration_call_stack = new Stack();


    // $ANTLR start "reconfiguration_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:583:1: reconfiguration_call returns [ArrayList<Error> errors] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final ArrayList<Error> reconfiguration_call() throws RecognitionException {
        reconfiguration_call_stack.push(new reconfiguration_call_scope());
        ArrayList<Error> errors = null;

        CommonTree OP_JOIN27=null;
        CommonTree OP_SPLIT29=null;
        CommonTree OP_PAR31=null;
        CommonTree OP_REMOVE33=null;
        CommonTree OP_CONST35=null;
        CommonTree OP_ID37=null;
        CommonTree ID38=null;
        RecSA.operation_args_return operation_args26 = null;

        RecSA.operation_args_return operation_args28 = null;

        RecSA.operation_args_return operation_args30 = null;

        RecSA.operation_args_return operation_args32 = null;

        RecSA.operation_args_return operation_args34 = null;

        RecSA.operation_args_return operation_args36 = null;

        RecSA.operation_args_return operation_args39 = null;



        	((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name = "";
        	((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args = new ArrayList<TinySymbol>();
        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:593:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case OP_JOIN:
                {
                alt14=1;
                }
                break;
            case OP_SPLIT:
                {
                alt14=2;
                }
                break;
            case OP_PAR:
                {
                alt14=3;
                }
                break;
            case OP_REMOVE:
                {
                alt14=4;
                }
                break;
            case OP_CONST:
                {
                alt14=5;
                }
                break;
            case OP_ID:
                {
                alt14=6;
                }
                break;
            case ID:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:593:4: ^( OP_JOIN operation_args )
                    {
                    OP_JOIN27=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call711); 

                     ((element_scope)element_stack.peek()).rec_type = "join"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call717);
                        operation_args26=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args26!=null?((CommonTree)operation_args26.start):null) != null){
                    			local_errors.addAll((operation_args26!=null?operation_args26.errors:null));
                    		}
                    		else{
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_JOIN27!=null?OP_JOIN27.getText():null)) , (OP_JOIN27!=null?OP_JOIN27.getLine():0), (OP_JOIN27!=null?OP_JOIN27.getCharPositionInLine():0), this.file_path) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:605:4: ^( OP_SPLIT operation_args )
                    {
                    OP_SPLIT29=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call729); 

                     ((element_scope)element_stack.peek()).rec_type = "split"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call735);
                        operation_args28=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args28!=null?((CommonTree)operation_args28.start):null) != null){
                    			local_errors.addAll((operation_args28!=null?operation_args28.errors:null));
                    		}
                    		else{
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_SPLIT29!=null?OP_SPLIT29.getText():null)) , (OP_SPLIT29!=null?OP_SPLIT29.getLine():0), (OP_SPLIT29!=null?OP_SPLIT29.getCharPositionInLine():0), this.file_path) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:617:4: ^( OP_PAR operation_args )
                    {
                    OP_PAR31=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call747); 

                     ((element_scope)element_stack.peek()).rec_type = "par"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call753);
                        operation_args30=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args30!=null?((CommonTree)operation_args30.start):null) != null){
                    			local_errors.addAll((operation_args30!=null?operation_args30.errors:null));
                    		}
                    		else{
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_PAR31!=null?OP_PAR31.getText():null)) , (OP_PAR31!=null?OP_PAR31.getLine():0), (OP_PAR31!=null?OP_PAR31.getCharPositionInLine():0), this.file_path) ); 
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:629:4: ^( OP_REMOVE operation_args )
                    {
                    OP_REMOVE33=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call764); 

                     ((element_scope)element_stack.peek()).rec_type = "remove"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call770);
                        operation_args32=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args32!=null?((CommonTree)operation_args32.start):null) != null){
                    			local_errors.addAll((operation_args32!=null?operation_args32.errors:null));
                    		}
                    		else{
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_REMOVE33!=null?OP_REMOVE33.getText():null)) , (OP_REMOVE33!=null?OP_REMOVE33.getLine():0), (OP_REMOVE33!=null?OP_REMOVE33.getCharPositionInLine():0), this.file_path) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:641:4: ^( OP_CONST operation_args )
                    {
                    OP_CONST35=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call782); 

                     ((element_scope)element_stack.peek()).rec_type = "const"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call788);
                        operation_args34=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args34!=null?((CommonTree)operation_args34.start):null) != null){
                    			local_errors.addAll((operation_args34!=null?operation_args34.errors:null));
                    		}
                    		else{
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((OP_CONST35!=null?OP_CONST35.getText():null)) , (OP_CONST35!=null?OP_CONST35.getLine():0), (OP_CONST35!=null?OP_CONST35.getCharPositionInLine():0), this.file_path) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:653:4: ^( OP_ID operation_args )
                    {
                    OP_ID37=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call799); 

                     ((element_scope)element_stack.peek()).rec_type = "id"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call805);
                        operation_args36=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		if((operation_args36!=null?((CommonTree)operation_args36.start):null) != null){
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(((element_scope)element_stack.peek()).rec_type) , (OP_ID37!=null?OP_ID37.getLine():0), (OP_ID37!=null?OP_ID37.getCharPositionInLine():0), this.file_path) );
                    			//local_errors.add( Error.report(ErrorType.ERROR, Error.invalidArgument((operation_args36!=null?((CommonTree)operation_args36.start):null).toString()) , (OP_ID37!=null?OP_ID37.getLine():0), (OP_ID37!=null?OP_ID37.getCharPositionInLine():0)+4, this.file_path) );			

                    			////is not necessary since 'id' has no arguments
                    			//local_errors.addAll((operation_args36!=null?operation_args36.errors:null));
                    		}


                    		errors = local_errors;
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:668:4: ^( ID operation_args )
                    {
                    ID38=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call818); 

                     
                    		((element_scope)element_stack.peek()).rec_type = "custom"; 
                    		((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name = (ID38!=null?ID38.getText():null);

                    		if (((reclang_scope)reclang_stack.peek()).ids_table.containsSymbol((ID38!=null?ID38.getText():null))){
                    			TinySymbol ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get((ID38!=null?ID38.getText():null));
                    				
                    			if (ts.getLine() > ((element_scope)element_stack.peek()).name.getLine()){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.recNotDefined((ID38!=null?ID38.getText():null)), (ID38!=null?ID38.getLine():0), (ID38!=null?ID38.getCharPositionInLine():0), this.file_path) );
                    			}
                    			else{
                    				TinySymbolsTable tst = ts.getScopes().get(0);
                    				List<TinySymbol> symbols = new ArrayList<TinySymbol>(tst.getSymbols().values());

                    				Collections.sort(symbols, new Comparator<TinySymbol>() {
                    			        	public int compare(TinySymbol ts1, TinySymbol ts2) {
                    						int value;

                    				        	if (ts1.getLine() == ts2.getLine()){
                    				        		value = ts1.getPosition() - ts2.getPosition();
                    				        	}
                    				        	else{
                    				    	        	value = ts1.getLine() - ts2.getLine();
                    				        	}
                    						return value;
                    				        }
                    				});

                    				for (TinySymbol symbol : symbols){		
                    					if (symbol.getClassType().equals(Type.ARG)){
                    						((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.add(symbol);
                    					}
                    				}
                    			}
                    		}
                    		else{
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.recNotDefined((ID38!=null?ID38.getText():null)), (ID38!=null?ID38.getLine():0), (ID38!=null?ID38.getCharPositionInLine():0), this.file_path) );
                    		}
                    	

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call827);
                        operation_args39=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                    	
                    		if((operation_args39!=null?((CommonTree)operation_args39.start):null) != null){
                    			local_errors.addAll((operation_args39!=null?operation_args39.errors:null));
                    		}
                    		else{
                    			if (!((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.isEmpty()){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments((ID38!=null?ID38.getText():null)) , (ID38!=null?ID38.getLine():0), (ID38!=null?ID38.getCharPositionInLine():0), this.file_path) ); //(ID38!=null?ID38.getCharPositionInLine():0)
                    			}
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            reconfiguration_call_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "reconfiguration_call"


    // $ANTLR start "structure_operation_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:723:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final void structure_operation_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:724:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OP_PATH) ) {
                alt15=1;
            }
            else if ( (LA15_0==OP_UPDATE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:724:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call845); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call847);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:725:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call854); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call856);
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
        return ;
    }
    // $ANTLR end "structure_operation_call"

    public static class operation_args_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:729:1: operation_args returns [ArrayList<Error> errors] : ( args )? ;
    public final RecSA.operation_args_return operation_args() throws RecognitionException {
        RecSA.operation_args_return retval = new RecSA.operation_args_return();
        retval.start = input.LT(1);

        RecSA.args_return args40 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:733:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:733:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:733:4: ( args )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=OP_PATH && LA16_0<=OP_UPDATE)||(LA16_0>=OP_UNION && LA16_0<=OP_MINUS)||LA16_0==ID||(LA16_0>=TRIPLE && LA16_0<=XOR)||LA16_0==ACCESS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:733:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args877);
                    args40=args();

                    state._fsp--;


                    		//reconfiguration of type "custom" can have more than one argument; id primitive tested before (do not even have one argument)
                    		if ((args40!=null?args40.counter:0) > 1 && !((element_scope)element_stack.peek()).rec_type.equals("custom") && !((element_scope)element_stack.peek()).rec_type.equals("id")){
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(((element_scope)element_stack.peek()).rec_type) , (args40!=null?((CommonTree)args40.start):null).getLine(), (args40!=null?((CommonTree)args40.start):null).getCharPositionInLine(), this.file_path) );
                    		}
                    		//if the number of arguments are correct, check their type (possible errors)
                    		else {
                    			if (((element_scope)element_stack.peek()).rec_type.equals("custom") && (args40!=null?args40.counter:0) < ((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.size()){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name) , (args40!=null?((CommonTree)args40.start):null).getLine(), (args40!=null?((CommonTree)args40.start):null).getCharPositionInLine(), this.file_path) );
                    			}
                    			else{
                    				local_errors.addAll((args40!=null?args40.errors:null));
                    			}
                    		}
                    	

                    }
                    break;

            }


            		retval.errors = local_errors; 
            	

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
        public ArrayList<Error> errors;
        public int counter;
    };

    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:755:1: args returns [ArrayList<Error> errors, int counter] : ( expression )+ ;
    public final RecSA.args_return args() throws RecognitionException {
        RecSA.args_return retval = new RecSA.args_return();
        retval.start = input.LT(1);

        RecSA.expression_return expression41 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	ArrayList<Error> global_errors = new ArrayList<Error>();
        	int i = 0;
        	boolean exceeded = false;
        	List<Type> dt = new ArrayList<Type>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:763:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:763:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:763:4: ( expression )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=XOR)||LA17_0==ACCESS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:763:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args907);
            	    expression41=expression();

            	    state._fsp--;


            	    		if (((element_scope)element_stack.peek()).rec_type.equals("custom")){
            	    			if (((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.size() > i){
            	    				//original argument
            	    				TinySymbol ts1 = ((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.get(i);

            	    //			if (ts1 != null){				
            	    				String value = (expression41!=null?expression41.name:null);
            	    				Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();
            	    				//if contains symbol, value of new argument is obtained from ((element_scope)element_stack.peek()).current_scope, else from ((element_scope)element_stack.peek()).name
            	    				TinySymbol ts2 = ((element_scope)element_stack.peek()).current_scope.containsSymbol(value) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get(value) : ((element_scope)element_stack.peek()).name.hasValue(value, s_id);
            	    				
            	    				if (ts2 != null){
            	    					dt = ts2.getDataType();
            	    				} else {
            	    					dt = (expression41!=null?expression41.datatype:null);
            	    				}
            	    				
            	    				//if ( ts2 != null && !ts2.getDataType().equals(ts1.getDataType()) ){
            	    				if ( !dt.equals(ts1.getDataType()) ){
            	    					String datatype = ts1.dataTypeToString();
            	    					local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(value, datatype) , (expression41!=null?((CommonTree)expression41.start):null).getLine(), (expression41!=null?((CommonTree)expression41.start):null).getCharPositionInLine(), this.file_path ) );
            	    				}
            	    			}
            	    			else{
            	    				exceeded = true;
            	    			}
            	    		}
            	    		local_errors.addAll((expression41!=null?expression41.errors:null));
            	    		i++;
            	    	

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


            		if (exceeded){
            			global_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments(((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name) , (expression41!=null?((CommonTree)expression41.start):null).getLine(), (expression41!=null?((CommonTree)expression41.start):null).getCharPositionInLine(), this.file_path ) );
            		}
            		else{
            			global_errors.addAll(local_errors);
            		}
            		retval.errors = global_errors;
            		retval.counter = i;
            	

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


    // $ANTLR start "for_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:811:1: for_instruction returns [ArrayList<Error> errors] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
    public final ArrayList<Error> for_instruction() throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree id1=null;
        CommonTree id2=null;
        ArrayList<Error> reconfiguration_block42 = null;



        	if (((reclang_scope)reclang_stack.peek()).scopes.contains(((reclang_scope)reclang_stack.peek()).aux_id)){
        		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).aux_id;
        	}
        	else{
        		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1);
        	}
        	((reclang_scope)reclang_stack.peek()).scope_id++;
        	((reclang_scope)reclang_stack.peek()).scope_rel.put(((reclang_scope)reclang_stack.peek()).scope_id, ((reclang_scope)reclang_stack.peek()).parent_id); 

        	((reclang_scope)reclang_stack.peek()).scopes.add(((reclang_scope)reclang_stack.peek()).scope_id);
        	((reclang_scope)reclang_stack.peek()).aux_id++;

        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:827:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:827:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction939); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction941);
            datatype();

            state._fsp--;

            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction945); 
            	
            		((element_scope)element_stack.peek()).current_scope = this.getScope(((reclang_scope)reclang_stack.peek()).parent_id); //rever

            		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();
            		TinySymbol ts = ((element_scope)element_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            		if ( ts != null ){
            			local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((id1!=null?id1.getText():null), ts.getLine(), ts.getPosition()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
            		}
            	
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction954); 

            		ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id2!=null?id2.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id2!=null?id2.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);

            		if ( ts == null || (id2!=null?id2.getLine():0) < ts.getLine() ){
            			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id2!=null?id2.getText():null)), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0), this.file_path) );
            		}
            		//if (local_errors.isEmpty()){
            		else{
            			TinySymbol ts1 = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id1!=null?id1.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id1!=null?id1.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            			TinySymbol ts2 = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id2!=null?id2.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id2!=null?id2.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);				

            				if (!ts2.getDataType().get(0).equals(Type.SET)){
            				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id2!=null?id2.getText():null), "Set<T>"), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0), this.file_path) );
            			}
            			else{
            				if (ts1 != null){
            					List<Type> datatype = new ArrayList<Type>(ts2.getDataType());
            					datatype.remove(0);
            					if (!ts1.getDataType().equals(datatype)){
            						local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id1!=null?id1.getText():null), ts2.dataTypeToString()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
            					}
            				}
            			}
            		}
            	
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction962);
            reconfiguration_block42=reconfiguration_block();

            state._fsp--;


            		local_errors.addAll(reconfiguration_block42);
            	

            match(input, Token.UP, null); 

            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "for_instruction"

    public static class expression_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:878:1: expression returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( OP_UNION f1= factor f2= factor ) | ^( OP_INTERSECTION f1= factor f2= factor ) | ^( OP_MINUS f1= factor f2= factor ) | factor );
    public final RecSA.expression_return expression() throws RecognitionException {
        RecSA.expression_return retval = new RecSA.expression_return();
        retval.start = input.LT(1);

        RecSA.factor_return f1 = null;

        RecSA.factor_return f2 = null;

        RecSA.factor_return factor43 = null;



        	Triple<List<Error>, HashSet<List<Type>>, Integer> res = null;

        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	List<Type> dt = new ArrayList<Type>();

        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:889:2: ( ^( OP_UNION f1= factor f2= factor ) | ^( OP_INTERSECTION f1= factor f2= factor ) | ^( OP_MINUS f1= factor f2= factor ) | factor )
            int alt18=4;
            switch ( input.LA(1) ) {
            case OP_UNION:
                {
                alt18=1;
                }
                break;
            case OP_INTERSECTION:
                {
                alt18=2;
                }
                break;
            case OP_MINUS:
                {
                alt18=3;
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
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:889:4: ^( OP_UNION f1= factor f2= factor )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression994); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression998);
                    f1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1002);
                    f2=factor();

                    state._fsp--;


                    		res = getData((f1!=null?f1.name:null), (f1!=null?f1.datatype:null), (f1!=null?f1.errors:null), (f1!=null?((CommonTree)f1.start):null));
                    		local_errors.addAll( res.fst() );
                    		datatypes.addAll( res.snd() );
                    		nulls = nulls + res.trd();

                    		res = getData((f2!=null?f2.name:null), (f2!=null?f2.datatype:null), (f2!=null?f2.errors:null), (f2!=null?((CommonTree)f2.start):null));
                    		local_errors.addAll( res.fst() );
                    		datatypes.addAll( res.snd() );
                    		nulls = nulls + res.trd();

                    		retval.errors = local_errors;
                    		retval.name = (f1!=null?f1.name:null) + " + " + (f2!=null?f2.name:null);

                    		if(datatypes.size() + nulls == 1){
                    			dt.addAll(datatypes.iterator().next());
                    		}
                    		retval.datatype = dt;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:911:4: ^( OP_INTERSECTION f1= factor f2= factor )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1015); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1019);
                    f1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1023);
                    f2=factor();

                    state._fsp--;


                    		res = getData((f1!=null?f1.name:null), (f1!=null?f1.datatype:null), (f1!=null?f1.errors:null), (f1!=null?((CommonTree)f1.start):null));
                    		local_errors.addAll( res.fst() );
                    		datatypes.addAll( res.snd() );
                    		nulls = nulls + res.trd();

                    		res = getData((f2!=null?f2.name:null), (f2!=null?f2.datatype:null), (f2!=null?f2.errors:null), (f2!=null?((CommonTree)f2.start):null));
                    		local_errors.addAll( res.fst() );
                    		datatypes.addAll( res.snd() );
                    		nulls = nulls + res.trd();

                    		retval.errors = local_errors;
                    		retval.name = (f1!=null?f1.name:null) + "& " + (f2!=null?f2.name:null);

                    		if(datatypes.size() + nulls == 1){
                    			dt.addAll(datatypes.iterator().next());
                    		}
                    		/*
                    		else {
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements("SET"), $SET.line, $SET.pos, this.file_path) );
                    		}
                    		*/
                    		retval.datatype = dt;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:938:4: ^( OP_MINUS f1= factor f2= factor )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1036); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1040);
                    f1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1044);
                    f2=factor();

                    state._fsp--;


                    		res = getData((f1!=null?f1.name:null), (f1!=null?f1.datatype:null), (f1!=null?f1.errors:null), (f1!=null?((CommonTree)f1.start):null));
                    		local_errors.addAll( res.fst() );
                    		datatypes.addAll( res.snd() );
                    		nulls = nulls + res.trd();

                    		res = getData((f2!=null?f2.name:null), (f2!=null?f2.datatype:null), (f2!=null?f2.errors:null), (f2!=null?((CommonTree)f2.start):null));
                    		local_errors.addAll( res.fst() );
                    		datatypes.addAll( res.snd() );
                    		nulls = nulls + res.trd();

                    		retval.errors = local_errors;
                    		retval.name = (f1!=null?f1.name:null) + "- " + (f2!=null?f2.name:null);

                    		if(datatypes.size() + nulls == 1){
                    			dt.addAll(datatypes.iterator().next());
                    		}
                    		retval.datatype = dt;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:960:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression1056);
                    factor43=factor();

                    state._fsp--;


                    		retval.errors = (factor43!=null?factor43.errors:null); 
                    		retval.name = (factor43!=null?factor43.name:null); 
                    		retval.datatype = (factor43!=null?factor43.datatype:null);
                    	

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
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:969:1: factor returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( ID ID ) | ID | operation | constructor );
    public final RecSA.factor_return factor() throws RecognitionException {
        RecSA.factor_return retval = new RecSA.factor_return();
        retval.start = input.LT(1);

        CommonTree ID44=null;
        RecSA.operation_return operation45 = null;

        RecSA.constructor_return constructor46 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	List<Type> dt = new ArrayList<Type>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:974:2: ( ^( ID ID ) | ID | operation | constructor )
            int alt19=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    alt19=1;
                }
                else if ( (LA19_1==UP||(LA19_1>=OP_PATH && LA19_1<=OP_UPDATE)||(LA19_1>=OP_UNION && LA19_1<=OP_MINUS)||LA19_1==ID||(LA19_1>=TRIPLE && LA19_1<=XOR)||LA19_1==ACCESS) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case OP_PATH:
            case OP_UPDATE:
            case ACCESS:
                {
                alt19=3;
                }
                break;
            case TRIPLE:
            case PAIR:
            case SET:
            case NODE:
            case XOR:
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:974:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1080); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1082); 

                    match(input, Token.UP, null); 

                    		retval.errors = local_errors;
                    		retval.datatype = dt;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:980:4: ID
                    {
                    ID44=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1093); 

                    		retval.name = (ID44!=null?ID44.getText():null);
                    		
                    		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();
                    		TinySymbol ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID44!=null?ID44.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID44!=null?ID44.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((ID44!=null?ID44.getText():null), s_id);

                    		if ( ts == null || (ID44!=null?ID44.getLine():0) < ts.getLine() ){
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID44!=null?ID44.getText():null)), (ID44!=null?ID44.getLine():0), (ID44!=null?ID44.getCharPositionInLine():0), this.file_path) );
                    		}
                    		
                    		//if (local_errors.isEmpty()){
                    		else{
                    			TinySymbol symbol = ts;

                    			dt.clear();
                    			dt.add(Type.PATTERN);
                    			if (((element_scope)element_stack.peek()).rec_type.equals("const") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID44!=null?ID44.getText():null), "Pattern"), (ID44!=null?ID44.getLine():0), (ID44!=null?ID44.getCharPositionInLine():0), this.file_path) );
                    			}

                    			if (((element_scope)element_stack.peek()).rec_type.equals("par") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID44!=null?ID44.getText():null), "Pattern"), (ID44!=null?ID44.getLine():0), (ID44!=null?ID44.getCharPositionInLine():0), this.file_path) );
                    			}

                    			dt.clear();
                    			dt.add(Type.SET);
                    			dt.add(Type.NODE);
                    			if (((element_scope)element_stack.peek()).rec_type.equals("join") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID44!=null?ID44.getText():null), "Set<Node>"), (ID44!=null?ID44.getLine():0), (ID44!=null?ID44.getCharPositionInLine():0), this.file_path) );
                    			}

                    			dt.clear();
                    			dt.add(Type.NODE);
                    			if (((element_scope)element_stack.peek()).rec_type.equals("split") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID44!=null?ID44.getText():null), "Node"), (ID44!=null?ID44.getLine():0), (ID44!=null?ID44.getCharPositionInLine():0), this.file_path) );
                    			}

                    			dt.clear();
                    			dt.add(Type.NAME);
                    			if (((element_scope)element_stack.peek()).rec_type.equals("remove") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID44!=null?ID44.getText():null), "Name"), (ID44!=null?ID44.getLine():0), (ID44!=null?ID44.getCharPositionInLine():0), this.file_path) );
                    			}

                    			dt.clear();
                    			dt.addAll( symbol.getDataType() );
                    		}

                    		retval.datatype = dt;
                    		retval.errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1031:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1101);
                    operation45=operation();

                    state._fsp--;


                    		retval.name = (operation45!=null?operation45.name:null);
                    		retval.datatype = (operation45!=null?operation45.datatype:null);
                    		retval.errors = (operation45!=null?operation45.errors:null); 
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1038:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1111);
                    constructor46=constructor();

                    state._fsp--;


                    		retval.name = (constructor46!=null?constructor46.name:null);
                    		retval.datatype = (constructor46!=null?constructor46.datatype:null);
                    		retval.errors = (constructor46!=null?constructor46.errors:null); 

                    	

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

    protected static class operation_scope {
        String id;
        int line;
        int pos;
    }
    protected Stack operation_stack = new Stack();

    public static class operation_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1047:1: operation returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts, accessed] ) | structure_operation_call );
    public final RecSA.operation_return operation() throws RecognitionException {
        operation_stack.push(new operation_scope());
        RecSA.operation_return retval = new RecSA.operation_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        RecSA.attribute_call_return attribute_call47 = null;



        	((operation_scope)operation_stack.peek()).id = "";
        	((operation_scope)operation_stack.peek()).line = 0;
        	((operation_scope)operation_stack.peek()).pos = 0;

        	boolean accessed = false;	
        	ArrayList<Error> local_errors = new ArrayList<Error>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1062:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts, accessed] ) | structure_operation_call )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ACCESS) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=OP_PATH && LA21_0<=OP_UPDATE)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1062:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts, accessed] )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1137); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1141); 

                    		((operation_scope)operation_stack.peek()).id = (id1!=null?id1.getText():null);
                    		((operation_scope)operation_stack.peek()).line = (id1!=null?id1.getLine():0);
                    		((operation_scope)operation_stack.peek()).pos = (id1!=null?id1.getCharPositionInLine():0);

                    		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();
                    		//if contains symbol, tiny symbol is obtained from ((element_scope)element_stack.peek()).current_scope, else from ((element_scope)element_stack.peek()).name
                    		TinySymbol ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id1!=null?id1.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id1!=null?id1.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);

                    		if ( ts == null || (id1!=null?id1.getLine():0) < ts.getLine() ){
                    			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
                    		}
                    		
                    	
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1077:2: ( ^( STRUCTURE id2= ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==STRUCTURE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1077:3: ^( STRUCTURE id2= ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1149); 

                            match(input, Token.DOWN, null); 
                            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1153); 

                            		((operation_scope)operation_stack.peek()).id += "#" + (id2!=null?id2.getText():null);
                            		((operation_scope)operation_stack.peek()).line = (id2!=null?id2.getLine():0);
                            		((operation_scope)operation_stack.peek()).pos = (id2!=null?id2.getCharPositionInLine():0);
                            		accessed = true;
                            	

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1163);
                    attribute_call47=attribute_call(ts, accessed);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		if((attribute_call47!=null?attribute_call47.errors:null) != null){
                    			local_errors.addAll((attribute_call47!=null?attribute_call47.errors:null));
                    		}

                    		retval.errors = local_errors;
                    		retval.name = ((operation_scope)operation_stack.peek()).id + "." + (attribute_call47!=null?attribute_call47.name:null);
                    		retval.datatype = (attribute_call47!=null?attribute_call47.datatype:null);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1096:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1175);
                    structure_operation_call();

                    state._fsp--;

                     
                    		retval.errors = local_errors; 
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            operation_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "operation"

    public static class constructor_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1102:1: constructor returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final RecSA.constructor_return constructor() throws RecognitionException {
        RecSA.constructor_return retval = new RecSA.constructor_return();
        retval.start = input.LT(1);

        RecSA.triple_cons_return triple_cons48 = null;

        RecSA.pair_cons_return pair_cons49 = null;

        RecSA.set_cons_return set_cons50 = null;

        RecSA.node_cons_return node_cons51 = null;

        RecSA.xor_cons_return xor_cons52 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1103:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
            int alt22=5;
            switch ( input.LA(1) ) {
            case TRIPLE:
                {
                alt22=1;
                }
                break;
            case PAIR:
                {
                alt22=2;
                }
                break;
            case SET:
                {
                alt22=3;
                }
                break;
            case NODE:
                {
                alt22=4;
                }
                break;
            case XOR:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1103:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1195);
                    triple_cons48=triple_cons();

                    state._fsp--;

                     
                    		retval.errors = (triple_cons48!=null?triple_cons48.errors:null); 
                    		retval.name = (triple_cons48!=null?triple_cons48.name:null); 
                    		retval.datatype = (triple_cons48!=null?triple_cons48.datatype:null); 
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1110:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1205);
                    pair_cons49=pair_cons();

                    state._fsp--;

                     
                    		retval.errors = (pair_cons49!=null?pair_cons49.errors:null); 		
                    		retval.name = (pair_cons49!=null?pair_cons49.name:null); 
                    		retval.datatype = (pair_cons49!=null?pair_cons49.datatype:null); 

                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1118:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1215);
                    set_cons50=set_cons();

                    state._fsp--;

                     
                    		retval.errors = (set_cons50!=null?set_cons50.errors:null);
                    		retval.name = (set_cons50!=null?set_cons50.name:null); 
                    		retval.datatype = (set_cons50!=null?set_cons50.datatype:null); 
                     
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1126:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1225);
                    node_cons51=node_cons();

                    state._fsp--;

                     
                    		retval.errors = (node_cons51!=null?node_cons51.errors:null); 
                    		retval.name = (node_cons51!=null?node_cons51.name:null); 
                    		retval.datatype = (node_cons51!=null?node_cons51.datatype:null); 

                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1134:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1235);
                    xor_cons52=xor_cons();

                    state._fsp--;

                     
                    		retval.errors = (xor_cons52!=null?xor_cons52.errors:null); 
                    		retval.name = (xor_cons52!=null?xor_cons52.name:null); 
                    		retval.datatype = (xor_cons52!=null?xor_cons52.datatype:null); 
                    	

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
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1148:1: attribute_call[TinySymbol ts, boolean accessed] returns [ArrayList<Error> errors, List<Type> datatype, String name] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
    public final RecSA.attribute_call_return attribute_call(TinySymbol ts, boolean accessed) throws RecognitionException {
        RecSA.attribute_call_return retval = new RecSA.attribute_call_return();
        retval.start = input.LT(1);

        CommonTree INT53=null;
        CommonTree OP_IN54=null;
        CommonTree INT55=null;
        CommonTree OP_OUT56=null;
        CommonTree ID57=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();	
        	List<Type> datatype = new ArrayList<Type>();
        	if (ts != null){
        		if (accessed){			
        			datatype.add(Type.CHANNEL);
        		} else{
        			datatype = new ArrayList<Type>(ts.getDataType());
        		}
        	}

        	List<Type> dt = new ArrayList<Type>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1162:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
            int alt25=9;
            switch ( input.LA(1) ) {
            case OP_IN:
                {
                alt25=1;
                }
                break;
            case OP_OUT:
                {
                alt25=2;
                }
                break;
            case OP_NAME:
                {
                alt25=3;
                }
                break;
            case OP_NODES:
                {
                alt25=4;
                }
                break;
            case OP_NAMES:
                {
                alt25=5;
                }
                break;
            case OP_FST:
                {
                alt25=6;
                }
                break;
            case OP_SND:
                {
                alt25=7;
                }
                break;
            case OP_TRD:
                {
                alt25=8;
                }
                break;
            case ID:
                {
                alt25=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1162:4: ^( OP_IN ( INT )? )
                    {
                    OP_IN54=(CommonTree)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1265); 


                    		if (ts != null){
                    			dt = new ArrayList<Type>();
                    			dt.add(Type.SET);
                    			dt.add(Type.NODE);
                    		}
                    	

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1171:2: ( INT )?
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==INT) ) {
                            alt23=1;
                        }
                        switch (alt23) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1171:3: INT
                                {
                                INT53=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1274); 

                                		if (ts != null){		
                                			dt = new ArrayList<Type>();
                                			dt.add(Type.CHANNEL);
                                			if ( Integer.parseInt((INT53!=null?INT53.getText():null)) > 1 && datatype.containsAll(dt) ){
                                				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments("attribute", (OP_IN54!=null?OP_IN54.getText():null)) , (INT53!=null?INT53.getLine():0), (INT53!=null?INT53.getCharPositionInLine():0), this.file_path) );
                                			}

                                			dt = new ArrayList<Type>();
                                			dt.add(Type.NODE);
                                		}
                                	

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern' or 'Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    		}

                    		if (!local_errors.isEmpty()){
                    			dt = new ArrayList<Type>();
                    		}

                    		retval.datatype = dt;
                    		retval.name = "in";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1203:4: ^( OP_OUT ( INT )? )
                    {
                    OP_OUT56=(CommonTree)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1294); 


                    		if (ts != null){
                    			dt = new ArrayList<Type>();
                    			dt.add(Type.SET);
                    			dt.add(Type.NODE);
                    		}
                    	

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1212:2: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1212:3: INT
                                {
                                INT55=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1303); 

                                		if (ts != null){		
                                			dt = new ArrayList<Type>();
                                			dt.add(Type.CHANNEL);
                                			if ( Integer.parseInt((INT55!=null?INT55.getText():null)) > 1 && datatype.containsAll(dt) ){
                                				local_errors.add( Error.report(ErrorType.ERROR, Error.numberOfArguments("attribute", (OP_OUT56!=null?OP_OUT56.getText():null)) , (INT55!=null?INT55.getLine():0), (INT55!=null?INT55.getCharPositionInLine():0), this.file_path) );
                                			}

                                			dt = new ArrayList<Type>();
                                			dt.add(Type.NODE);
                                		}
                                	

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern' or 'Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    		}

                    		if (!local_errors.isEmpty()){
                    			dt = new ArrayList<Type>();
                    		}

                    		retval.datatype = dt;
                    		retval.name = "out";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1244:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1321); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !t.equals(Type.CHANNEL) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    			if (local_errors.isEmpty()){
                    				dt.add(Type.NAME);
                    			}
                    		}

                    		retval.datatype = dt;
                    		retval.name = "name";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1262:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1332); 

                    //		System.out.println(ts);
                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern' or 'Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    			if (local_errors.isEmpty()){
                    				dt.add(Type.SET);
                    				dt.add(Type.NODE);
                    			}
                    		}

                    		retval.datatype = dt;		
                    		retval.name = "nodes";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1282:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1343); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !t.equals(Type.PATTERN) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    			if (local_errors.isEmpty()){
                    				dt.add(Type.SET);
                    				dt.add(Type.NAME);
                    			}
                    		}

                    		retval.datatype = dt;		
                    		retval.name = "names";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1322:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1357); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pair' or 'Triple"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    			if (local_errors.isEmpty()){
                    				datatype.remove(0);
                    				dt.addAll(datatype);
                    			}
                    		}

                    		retval.datatype = dt;				
                    		retval.name = "fst";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1341:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1368); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pair' or 'Triple"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    			if (local_errors.isEmpty()){
                    				datatype.remove(0);
                    				dt.addAll(datatype);
                    			}
                    		}

                    		retval.datatype = dt;		
                    		retval.name = "snd";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1359:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1378); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !t.equals(Type.TRIPLE) ) {
                    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Triple"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos, this.file_path) );
                    			}
                    			//else
                    			if (local_errors.isEmpty()){
                    				datatype.remove(0);
                    				dt.addAll(datatype);
                    			}
                    		}

                    		retval.datatype = dt;		
                    		retval.name = "trd";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1378:4: ID
                    {
                    ID57=(CommonTree)match(input,ID,FOLLOW_ID_in_attribute_call1389); 

                    		retval.datatype = dt;
                    		retval.name = (ID57!=null?ID57.getText():null);		
                    		retval.errors = local_errors;
                    	

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
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "triple_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1387:1: triple_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( TRIPLE e1= expression e2= expression e3= expression ) ;
    public final RecSA.triple_cons_return triple_cons() throws RecognitionException {
        RecSA.triple_cons_return retval = new RecSA.triple_cons_return();
        retval.start = input.LT(1);

        CommonTree TRIPLE58=null;
        RecSA.expression_return e1 = null;

        RecSA.expression_return e2 = null;

        RecSA.expression_return e3 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	List<Type> dt = new ArrayList<Type>();
        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;
        	String name = "T(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1395:2: ( ^( TRIPLE e1= expression e2= expression e3= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1395:4: ^( TRIPLE e1= expression e2= expression e3= expression )
            {
            TRIPLE58=(CommonTree)match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1415); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1419);
            e1=expression();

            state._fsp--;


            		local_errors.addAll((e1!=null?e1.errors:null));
            		if ( !(e1!=null?e1.datatype:null).isEmpty() ) {
            			datatypes.add((e1!=null?e1.datatype:null));
            		}
            		else{
            			nulls++;
            		}
            		name += (e1!=null?e1.name:null) + ", ";
            	
            pushFollow(FOLLOW_expression_in_triple_cons1429);
            e2=expression();

            state._fsp--;


            		local_errors.addAll((e2!=null?e2.errors:null));
            		if ( !(e2!=null?e2.datatype:null).isEmpty() ) {
            			datatypes.add((e2!=null?e2.datatype:null));
            		}
            		else{
            			nulls++;
            		}
            		name += (e2!=null?e2.name:null) + ", ";
            	
            pushFollow(FOLLOW_expression_in_triple_cons1440);
            e3=expression();

            state._fsp--;


            		local_errors.addAll((e3!=null?e3.errors:null));
            		if ( !(e3!=null?e3.datatype:null).isEmpty() ) {
            			datatypes.add((e3!=null?e3.datatype:null));
            		}
            		else{
            			nulls++;
            		}
            		name += (e3!=null?e3.name:null);
            	

            match(input, Token.UP, null); 


            		retval.errors = local_errors;

            		name = name.substring(0, name.length()-1);
            		retval.name = name + ")";

            		if (local_errors.isEmpty()){
            			if(datatypes.size() + nulls == 1){
            				dt.add(Type.TRIPLE);
            				dt.addAll(datatypes.iterator().next());
            			}
            			else {
            				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements(retval.name), (TRIPLE58!=null?TRIPLE58.getLine():0), (TRIPLE58!=null?TRIPLE58.getCharPositionInLine():0), this.file_path) );
            			}
            		}

            		retval.datatype = dt;
            	

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

    public static class set_cons_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "set_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1455:1: set_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( SET ( expression )* ) ;
    public final RecSA.set_cons_return set_cons() throws RecognitionException {
        RecSA.set_cons_return retval = new RecSA.set_cons_return();
        retval.start = input.LT(1);

        CommonTree SET60=null;
        RecSA.expression_return expression59 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();	
        	List<Type> dt = new ArrayList<Type>();
        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;
        	String name = "S(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1463:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1463:4: ^( SET ( expression )* )
            {
            SET60=(CommonTree)match(input,SET,FOLLOW_SET_in_set_cons1471); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1463:10: ( expression )*
                loop26:
                do {
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=OP_PATH && LA26_0<=OP_UPDATE)||(LA26_0>=OP_UNION && LA26_0<=OP_MINUS)||LA26_0==ID||(LA26_0>=TRIPLE && LA26_0<=XOR)||LA26_0==ACCESS) ) {
                        alt26=1;
                    }


                    switch (alt26) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1463:11: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1474);
                	    expression59=expression();

                	    state._fsp--;


                	    		local_errors.addAll((expression59!=null?expression59.errors:null));
                	    		if ( !(expression59!=null?expression59.datatype:null).isEmpty() ) {
                	    			datatypes.add((expression59!=null?expression59.datatype:null));
                	    		}
                	    		else{
                	    			nulls++;
                	    		}
                	    		name += (expression59!=null?expression59.name:null) + ",";
                	    	

                	    }
                	    break;

                	default :
                	    break loop26;
                    }
                } while (true);



                		retval.errors = local_errors;

                		name = name.substring(0, name.length()-1);
                		retval.name = name + ")";

                		if (local_errors.isEmpty()){
                			if(datatypes.size() + nulls == 1){
                				dt.add(Type.SET);
                				dt.addAll(datatypes.iterator().next());
                			}
                			else {
                				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements(retval.name), (SET60!=null?SET60.getLine():0), (SET60!=null?SET60.getCharPositionInLine():0), this.file_path) );
                			}
                		}

                		retval.datatype = dt;
                	

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

    public static class pair_cons_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "pair_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1497:1: pair_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( PAIR e1= expression e2= expression ) ;
    public final RecSA.pair_cons_return pair_cons() throws RecognitionException {
        RecSA.pair_cons_return retval = new RecSA.pair_cons_return();
        retval.start = input.LT(1);

        CommonTree PAIR61=null;
        RecSA.expression_return e1 = null;

        RecSA.expression_return e2 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();
        	List<Type> dt = new ArrayList<Type>();
        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;
        	String name = "P(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1505:2: ( ^( PAIR e1= expression e2= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1505:4: ^( PAIR e1= expression e2= expression )
            {
            PAIR61=(CommonTree)match(input,PAIR,FOLLOW_PAIR_in_pair_cons1507); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1511);
            e1=expression();

            state._fsp--;


            		local_errors.addAll((e1!=null?e1.errors:null));
            		if ( !(e1!=null?e1.datatype:null).isEmpty() ) {
            			datatypes.add((e1!=null?e1.datatype:null));
            		}
            		else{
            			nulls++;
            		}
            		name += (e1!=null?e1.name:null) + ", ";
            	
            pushFollow(FOLLOW_expression_in_pair_cons1520);
            e2=expression();

            state._fsp--;


            		local_errors.addAll((e2!=null?e2.errors:null));

            		if ( !(e2!=null?e2.datatype:null).isEmpty() ) {
            			datatypes.add((e2!=null?e2.datatype:null));
            		}
            		else{
            			nulls++;
            		}
            		name += (e2!=null?e2.name:null);
            	

            match(input, Token.UP, null); 


            		retval.errors = local_errors;

            		name = name.substring(0, name.length()-1);
            		retval.name = name + ")";

            		if (local_errors.isEmpty()){
            			if(datatypes.size() + nulls == 1){
            				dt.add(Type.PAIR);
            				dt.addAll(datatypes.iterator().next());
            			}
            			else {
            				local_errors.add( Error.report(ErrorType.ERROR, Error.invalidElements(retval.name), (PAIR61!=null?PAIR61.getLine():0), (PAIR61!=null?PAIR61.getCharPositionInLine():0), this.file_path) );
            			}
            		}

            		retval.datatype = dt;
            	

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

    public static class node_cons_return extends TreeRuleReturnScope {
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1555:1: node_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( NODE ( ID )+ ) ;
    public final RecSA.node_cons_return node_cons() throws RecognitionException {
        RecSA.node_cons_return retval = new RecSA.node_cons_return();
        retval.start = input.LT(1);

        CommonTree ID62=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();	
        	List<Type> dt = new ArrayList<Type>();
        	String name = "N(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1561:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1561:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1553); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1561:11: ( ID )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1561:12: ID
            	    {
            	    ID62=(CommonTree)match(input,ID,FOLLOW_ID_in_node_cons1556); 

            	    		Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();
            	    		TinySymbol ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID62!=null?ID62.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID62!=null?ID62.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((ID62!=null?ID62.getText():null), s_id);

            	    		if (ts == null || (ID62!=null?ID62.getLine():0) < ts.getLine()){
            	    			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((ID62!=null?ID62.getText():null)), (ID62!=null?ID62.getLine():0), (ID62!=null?ID62.getCharPositionInLine():0), this.file_path) );
            	    		}
            	    		else{
            	    			dt = new ArrayList<Type>();
            	    			dt.add(Type.NAME);
            	    			if (!ts.getDataType().equals(dt)){
            	    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((ID62!=null?ID62.getText():null), "Name"), (ID62!=null?ID62.getLine():0), (ID62!=null?ID62.getCharPositionInLine():0), this.file_path) );
            	    			}
            	    		}
            	    		name += (ID62!=null?ID62.getText():null) + ",";

            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            		retval.errors = local_errors;

            		name = name.substring(0, name.length()-1);
            		retval.name = name + ")";

            		if (local_errors.isEmpty()){
            			dt = new ArrayList<Type>();
            			dt.add(Type.NODE);
            		}	
            		retval.datatype = dt;
            	

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
        public ArrayList<Error> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1597:1: xor_cons returns [ArrayList<Error> errors, List<Type> datatype, String name] : ^( XOR ^( IN id1= ID (id2= ID )* ) ^( OUT id3= ID (id4= ID )+ ) ) ;
    public final RecSA.xor_cons_return xor_cons() throws RecognitionException {
        RecSA.xor_cons_return retval = new RecSA.xor_cons_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        CommonTree id4=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();	

        	Integer s_id = ((element_scope)element_stack.peek()).current_scope.getScopeRel().fst();
        	TinySymbol ts = null;

        	List<Type> dt = new ArrayList<Type>();
        	String name = "X(";


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1608:2: ( ^( XOR ^( IN id1= ID (id2= ID )* ) ^( OUT id3= ID (id4= ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1608:4: ^( XOR ^( IN id1= ID (id2= ID )* ) ^( OUT id3= ID (id4= ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons1590); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons1594); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1598); 

            		ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id1!=null?id1.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id1!=null?id1.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);

            		if (ts == null || (id1!=null?id1.getLine():0) < ts.getLine()){
            			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
            		}
            		else{
            			dt = new ArrayList<Type>();
            			dt.add(Type.NAME);
            			if (!ts.getDataType().equals(dt)){
            				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id1!=null?id1.getText():null), "Name"), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0), this.file_path) );
            			}
            		}
            		name += (id1!=null?id1.getText():null) + ",";		
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1625:2: (id2= ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1625:3: id2= ID
            	    {
            	    id2=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1609); 

            	    		ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id2!=null?id2.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id2!=null?id2.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);

            	    		if (ts == null || (id2!=null?id2.getLine():0) < ts.getLine()){
            	    			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id2!=null?id2.getText():null)), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0), this.file_path) );
            	    		}
            	    		else{
            	    			dt = new ArrayList<Type>();
            	    			dt.add(Type.NAME);
            	    			if (!ts.getDataType().equals(dt)){
            	    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id2!=null?id2.getText():null), "Name"), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0), this.file_path) );
            	    			}
            	    		}
            	    		name += (id2!=null?id2.getText():null) + ",";
            	    	

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,OUT,FOLLOW_OUT_in_xor_cons1623); 

            match(input, Token.DOWN, null); 
            id3=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1627); 

            		name = name.substring(0, name.length()-1);
            		name += ":";

            		ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id3!=null?id3.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id3!=null?id3.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id3!=null?id3.getText():null), s_id);

            		if (ts == null || (id3!=null?id3.getLine():0) < ts.getLine()){
            			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id3!=null?id3.getText():null)), (id3!=null?id3.getLine():0), (id3!=null?id3.getCharPositionInLine():0), this.file_path) );
            		}
            		else{
            			dt = new ArrayList<Type>();
            			dt.add(Type.NAME);
            			if (!ts.getDataType().equals(dt)){
            				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id3!=null?id3.getText():null), "Name"), (id3!=null?id3.getLine():0), (id3!=null?id3.getCharPositionInLine():0), this.file_path) );
            			}
            		}
            		name += (id3!=null?id3.getText():null) + ",";		
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1661:2: (id4= ID )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1661:3: id4= ID
            	    {
            	    id4=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1637); 

            	    		ts = ((element_scope)element_stack.peek()).current_scope.containsSymbol((id4!=null?id4.getText():null)) ? ((element_scope)element_stack.peek()).current_scope.getSymbols().get((id4!=null?id4.getText():null)) : ((element_scope)element_stack.peek()).name.hasValue((id4!=null?id4.getText():null), s_id);

            	    		if (ts == null || (id4!=null?id4.getLine():0) < ts.getLine()){
            	    			local_errors.add( Error.report(ErrorType.ERROR, Error.nameNotDefined((id4!=null?id4.getText():null)), (id4!=null?id4.getLine():0), (id4!=null?id4.getCharPositionInLine():0), this.file_path) );
            	    		}
            	    		else{
            	    			dt = new ArrayList<Type>();
            	    			dt.add(Type.NAME);
            	    			if (!ts.getDataType().equals(dt)){
            	    				local_errors.add( Error.report(ErrorType.ERROR, Error.wrongDatatype((id4!=null?id4.getText():null), "Name"), (id4!=null?id4.getLine():0), (id4!=null?id4.getCharPositionInLine():0), this.file_path) );
            	    			}
            	    		}
            	    		name += (id4!=null?id4.getText():null) + ",";
            	    	

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

            		retval.errors = local_errors;

            		name = name.substring(0, name.length()-1);
            		retval.name = name + ")";

            		if (local_errors.isEmpty()){
            			dt = new ArrayList<Type>();
            			dt.add(Type.XOR);
            		}

            		retval.datatype = dt;
            	

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


    // $ANTLR start "applicaiton_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1697:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final void applicaiton_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1698:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1698:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1667); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1669);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1698:29: ( trigger_def )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SEP_BLOCK_START) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1698:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1671);
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
        return ;
    }
    // $ANTLR end "applicaiton_def"


    // $ANTLR start "list_reconfigurations"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1701:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final void list_reconfigurations() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1702:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1702:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1702:4: ( reconfiguration_call )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=OP_PAR && LA31_0<=OP_ID)||LA31_0==ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1702:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1683);
            	    reconfiguration_call();

            	    state._fsp--;


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
    // $ANTLR end "list_reconfigurations"


    // $ANTLR start "trigger_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1705:1: trigger_def : trigger_block ;
    public final void trigger_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1706:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1706:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1695);
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
        return ;
    }
    // $ANTLR end "trigger_def"


    // $ANTLR start "trigger_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1709:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final void trigger_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1710:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1710:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1706); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1708); 

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
    // $ANTLR end "trigger_block"

    protected static class main_def_scope {
        //imported coopla patterns
        	List<String> patterns;
    }
    protected Stack main_def_stack = new Stack();


    // $ANTLR start "main_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1716:1: main_def returns [ArrayList<Error> errors] : ( main_args )? main_block ;
    public final ArrayList<Error> main_def() throws RecognitionException {
        main_def_stack.push(new main_def_scope());
        ArrayList<Error> errors = null;

        ArrayList<Error> main_args63 = null;

        ArrayList<Error> main_block64 = null;



        	((element_scope)element_stack.peek()).name = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get("$main");
        	((element_scope)element_stack.peek()).current_scope = ((element_scope)element_stack.peek()).name.getScopes().get(0); //main has only one scope
        	
        	ArrayList<Error> local_errors = new ArrayList<Error>();

        	// coopla data
        	((main_def_scope)main_def_stack.peek()).patterns = new ArrayList<String>();

        	HashMap<String, Symbol> coopla_symbols = ((reclang_scope)reclang_stack.peek()).coopla_table.getSymbols();
        	for (String key : coopla_symbols.keySet()){
        		Symbol s = coopla_symbols.get(key);
        		if (s.getType().equals("PATTERN")){
        			((main_def_scope)main_def_stack.peek()).patterns.add(s.getId());
        		}
        	}

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1738:2: ( ( main_args )? main_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1738:4: ( main_args )? main_block
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1738:4: ( main_args )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARGUMENTS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1738:5: main_args
                    {
                    pushFollow(FOLLOW_main_args_in_main_def1733);
                    main_args63=main_args();

                    state._fsp--;


                    		local_errors.addAll(main_args63);
                    	

                    }
                    break;

            }

            pushFollow(FOLLOW_main_block_in_main_def1742);
            main_block64=main_block();

            state._fsp--;


            		local_errors.addAll(main_block64);
            		errors = local_errors;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            main_def_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "main_def"


    // $ANTLR start "main_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1750:1: main_args returns [ArrayList<Error> errors] : ^( ARGUMENTS ( main_arg )+ ) ;
    public final ArrayList<Error> main_args() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> main_arg65 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1754:2: ( ^( ARGUMENTS ( main_arg )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1754:4: ^( ARGUMENTS ( main_arg )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1765); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1754:16: ( main_arg )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==ARGUMENT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1754:17: main_arg
            	    {
            	    pushFollow(FOLLOW_main_arg_in_main_args1768);
            	    main_arg65=main_arg();

            	    state._fsp--;


            	    		local_errors.addAll(main_arg65);
            	    	

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


            		errors = local_errors;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "main_args"


    // $ANTLR start "main_arg"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1766:1: main_arg returns [ArrayList<Error> errors] : ^( ARGUMENT dt= ID ids[true] ) ;
    public final ArrayList<Error> main_arg() throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree dt=null;
        ArrayList<Error> ids66 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1770:2: ( ^( ARGUMENT dt= ID ids[true] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1770:4: ^( ARGUMENT dt= ID ids[true] )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1802); 

            match(input, Token.DOWN, null); 
            dt=(CommonTree)match(input,ID,FOLLOW_ID_in_main_arg1806); 

            		if (!((main_def_scope)main_def_stack.peek()).patterns.contains((dt!=null?dt.getText():null))){
            			local_errors.add( Error.report(ErrorType.ERROR, Error.patternNotDefined((dt!=null?dt.getText():null)), (dt!=null?dt.getLine():0), (dt!=null?dt.getCharPositionInLine():0), this.file_path) );
            		}
            	
            pushFollow(FOLLOW_ids_in_main_arg1812);
            ids66=ids(true);

            state._fsp--;


            		if (local_errors.isEmpty()){
            			local_errors.addAll(ids66);
            		}
            		errors = local_errors;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "main_arg"


    // $ANTLR start "ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1786:1: ids[boolean toTest] returns [ArrayList<Error> errors] : ^( IDS ( ID )+ ) ;
    public final ArrayList<Error> ids(boolean toTest) throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree ID67=null;


        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1790:2: ( ^( IDS ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1790:4: ^( IDS ( ID )+ )
            {
            match(input,IDS,FOLLOW_IDS_in_ids1840); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1790:10: ( ID )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1790:11: ID
            	    {
            	    ID67=(CommonTree)match(input,ID,FOLLOW_ID_in_ids1843); 

            	    		if (toTest && ((element_scope)element_stack.peek()).current_scope.containsSymbol((ID67!=null?ID67.getText():null))){
            	    			TinySymbol ts = ((element_scope)element_stack.peek()).current_scope.getSymbols().get((ID67!=null?ID67.getText():null));
            	    			if ( !((ID67!=null?ID67.getLine():0) == ts.getLine() && (ID67!=null?ID67.getCharPositionInLine():0) == ts.getPosition()) ){
            	    				local_errors.add( Error.report(ErrorType.ERROR, Error.nameAlreadyDefined((ID67!=null?ID67.getText():null), ts.getLine(), ts.getPosition()), (ID67!=null?ID67.getLine():0), (ID67!=null?ID67.getCharPositionInLine():0), this.file_path) );
            	    			}
            	    		}
            	    	

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


            		errors = local_errors;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "ids"


    // $ANTLR start "main_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1808:1: main_block returns [ArrayList<Error> errors] : ^( INSTRUCTIONS ( main_instruction )+ ) ;
    public final ArrayList<Error> main_block() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> main_instruction68 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1812:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1812:4: ^( INSTRUCTIONS ( main_instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1880); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1812:19: ( main_instruction )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==DECLARATION||LA35_0==APPLICATION) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1812:20: main_instruction
            	    {
            	    pushFollow(FOLLOW_main_instruction_in_main_block1883);
            	    main_instruction68=main_instruction();

            	    state._fsp--;


            	    		local_errors.addAll(main_instruction68);
            	    	

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


            		errors = local_errors;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "main_block"


    // $ANTLR start "main_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1824:1: main_instruction returns [ArrayList<Error> errors] : ( main_declaration | main_assignment );
    public final ArrayList<Error> main_instruction() throws RecognitionException {
        ArrayList<Error> errors = null;

        ArrayList<Error> main_declaration69 = null;

        ArrayList<Error> main_assignment70 = null;



        	((element_scope)element_stack.peek()).rec_type = "";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1828:2: ( main_declaration | main_assignment )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DECLARATION) ) {
                alt36=1;
            }
            else if ( (LA36_0==APPLICATION) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1828:4: main_declaration
                    {
                    pushFollow(FOLLOW_main_declaration_in_main_instruction1916);
                    main_declaration69=main_declaration();

                    state._fsp--;

                     errors = main_declaration69; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1829:4: main_assignment
                    {
                    pushFollow(FOLLOW_main_assignment_in_main_instruction1923);
                    main_assignment70=main_assignment();

                    state._fsp--;

                     errors = main_assignment70; 

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
        return errors;
    }
    // $ANTLR end "main_instruction"


    // $ANTLR start "main_declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1832:1: main_declaration returns [ArrayList<Error> errors] : ^( DECLARATION dt= ID ids[true] ) ;
    public final ArrayList<Error> main_declaration() throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree dt=null;
        ArrayList<Error> ids71 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1836:2: ( ^( DECLARATION dt= ID ids[true] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1836:4: ^( DECLARATION dt= ID ids[true] )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_main_declaration1944); 

            match(input, Token.DOWN, null); 
            dt=(CommonTree)match(input,ID,FOLLOW_ID_in_main_declaration1948); 

            		if (!((main_def_scope)main_def_stack.peek()).patterns.contains((dt!=null?dt.getText():null))){
            			local_errors.add( Error.report(ErrorType.ERROR, Error.patternNotDefined((dt!=null?dt.getText():null)), (dt!=null?dt.getLine():0), (dt!=null?dt.getCharPositionInLine():0), this.file_path) );
            		}
            	
            pushFollow(FOLLOW_ids_in_main_declaration1958);
            ids71=ids(true);

            state._fsp--;


            		if (local_errors.isEmpty()){
            			local_errors.addAll(ids71);
            		}
            		errors = local_errors;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "main_declaration"


    // $ANTLR start "main_assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1853:1: main_assignment returns [ArrayList<Error> errors] : ^( APPLICATION ( ^( DECLARATION (dt= ID )? ids[toTest] ) )? ^( OP_APPLY ID reconfiguration_call ) ) ;
    public final ArrayList<Error> main_assignment() throws RecognitionException {
        ArrayList<Error> errors = null;

        CommonTree dt=null;
        ArrayList<Error> ids72 = null;

        ArrayList<Error> reconfiguration_call73 = null;



        	ArrayList<Error> local_errors = new ArrayList<Error>();	
        	boolean toTest = false;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1858:2: ( ^( APPLICATION ( ^( DECLARATION (dt= ID )? ids[toTest] ) )? ^( OP_APPLY ID reconfiguration_call ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1858:4: ^( APPLICATION ( ^( DECLARATION (dt= ID )? ids[toTest] ) )? ^( OP_APPLY ID reconfiguration_call ) )
            {
            match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1985); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1858:19: ( ^( DECLARATION (dt= ID )? ids[toTest] ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==DECLARATION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1858:21: ^( DECLARATION (dt= ID )? ids[toTest] )
                    {
                    match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1990); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1858:35: (dt= ID )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ID) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1858:36: dt= ID
                            {
                            dt=(CommonTree)match(input,ID,FOLLOW_ID_in_main_assignment1995); 
                            	
                            		if (((main_def_scope)main_def_stack.peek()).patterns.contains((dt!=null?dt.getText():null))){
                            			local_errors.add( Error.report(ErrorType.ERROR, Error.patternAlreadyDefined((dt!=null?dt.getText():null)), (dt!=null?dt.getLine():0), (dt!=null?dt.getCharPositionInLine():0), this.file_path) );
                            		} else {
                            			((main_def_scope)main_def_stack.peek()).patterns.add((dt!=null?dt.getText():null));
                            		}
                            		
                            		if ((dt!=null?dt.getText():null) != null){ //if is declaration
                            			toTest = true;
                            		}
                            	

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ids_in_main_assignment2004);
                    ids72=ids(toTest);

                    state._fsp--;


                    		local_errors.addAll(ids72);
                    	

                    match(input, Token.UP, null); 

                    }
                    break;

            }

            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment2021); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_assignment2023); 
            pushFollow(FOLLOW_reconfiguration_call_in_main_assignment2025);
            reconfiguration_call73=reconfiguration_call();

            state._fsp--;


            		local_errors.addAll(reconfiguration_call73);
            	

            match(input, Token.UP, null); 

            		errors = local_errors;
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return errors;
    }
    // $ANTLR end "main_assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_RECONFIGS_in_reclang62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reclang65 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000180L});
    public static final BitSet FOLLOW_element_in_reclang77 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000100L});
    public static final BitSet FOLLOW_directive_import_in_directive_def112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECONFIGURATION_in_element168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_element197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_def_in_element199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def282 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def317 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids423 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block457 = new BitSet(new long[]{0x0000001000000008L,0x000000000000E000L});
    public static final BitSet FOLLOW_declaration_in_instruction489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply539 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply541 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply548 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration575 = new BitSet(new long[]{0x2000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_var_def_in_declaration578 = new BitSet(new long[]{0x2000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_var_def608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment642 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment644 = new BitSet(new long[]{0x200000F000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment650 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call717 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call729 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call735 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call747 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call753 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call799 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call818 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call847 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args907 = new BitSet(new long[]{0x200000E000C00002L,0x00000000009F0000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction941 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction945 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction962 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression998 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1019 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression1036 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1040 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1080 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1082 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1137 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1141 = new BitSet(new long[]{0x20000001BF000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1163 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1419 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1429 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1440 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1474 = new BitSet(new long[]{0x200000E000C00008L,0x00000000009F0000L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1511 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1520 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NODE_in_node_cons1553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1556 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons1590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons1594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1598 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_xor_cons1609 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons1623 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1627 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1637 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1667 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1669 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1683 = new BitSet(new long[]{0x20000000003F0002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1706 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_args_in_main_def1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_main_block_in_main_def1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTS_in_main_args1765 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_arg_in_main_args1768 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_main_arg1802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_arg1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_arg1812 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDS_in_ids1840 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ids1843 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1880 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_instruction_in_main_block1883 = new BitSet(new long[]{0x0000000000000008L,0x0000000002002000L});
    public static final BitSet FOLLOW_main_declaration_in_main_instruction1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_assignment_in_main_instruction1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARATION_in_main_declaration1944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_declaration1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_declaration1958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_main_assignment1985 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECLARATION_in_main_assignment1990 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_assignment2004 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_APPLY_in_main_assignment2021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment2023 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment2025 = new BitSet(new long[]{0x0000000000000008L});

}