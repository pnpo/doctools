// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g 2014-05-22 21:28:26

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.SimpleError;
	import pt.uminho.di.reolang.parsing.util.*;
	//import java.util.*;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Collections;
	import java.util.Comparator;


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


    	//SimpleError se = new SimpleError();
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
    	
    	//method used in expression prduction
    	public Triple<List<SimpleError>, HashSet<List<Type>>, Integer> getData(String n, List<Type> t, List<SimpleError> e, CommonTree v){
        		
        		Triple<List<SimpleError>, HashSet<List<Type>>, Integer> res = new Triple<List<SimpleError>, HashSet<List<Type>>, Integer>();
        		
        		List<SimpleError> local_errors = new ArrayList<SimpleError>();
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
        				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(n, "Set<T>"), v.getLine(), v.getCharPositionInLine()) );
        				nulls++;
        			}
        		}
        		
        		res.setFirst(local_errors);
        		res.setSecond(datatypes);
        		res.setThird(nulls);
        		
        		return res;
        	}


    protected static class reclang_scope {
        TinySymbolsTable ids_table;
        int scope_id;
        int parent_id;
        int aux_id;
        List<Integer> scopes;
        HashMap<Integer,Integer> scope_rel;
    }
    protected Stack reclang_stack = new Stack();


    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:71:1: reclang[TinySymbolsTable global_table] returns [ArrayList<SimpleError> errors] : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final ArrayList<SimpleError> reclang(TinySymbolsTable global_table) throws RecognitionException {
        reclang_stack.push(new reclang_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> directive_def1 = null;

        ArrayList<SimpleError> element2 = null;



        	((reclang_scope)reclang_stack.peek()).ids_table = global_table;

        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	((reclang_scope)reclang_stack.peek()).parent_id = 0;	
        	((reclang_scope)reclang_stack.peek()).aux_id = 0;
        	((reclang_scope)reclang_stack.peek()).scopes = new ArrayList<Integer>(); //LinkedList
        	((reclang_scope)reclang_stack.peek()).scopes.add(0);
        	((reclang_scope)reclang_stack.peek()).scope_rel = new HashMap<Integer,Integer>();

        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:92:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:92:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang62); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:92:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:92:17: directive_def
                	    {
                	    pushFollow(FOLLOW_directive_def_in_reclang65);
                	    directive_def1=directive_def();

                	    state._fsp--;


                	    		local_errors.addAll(directive_def1);
                	    	

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:97:5: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||(LA2_0>=APPLICATION && LA2_0<=MAIN)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:97:6: element
                	    {
                	    pushFollow(FOLLOW_element_in_reclang77);
                	    element2=element();

                	    state._fsp--;


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
            		for (int i=0; i<local_errors.size(); i++) {
                      		for (int j=0; j<local_errors.size(); j++) {
                   		        	if (local_errors.get(i).getMessage().equals(local_errors.get(j).getMessage()) && i != j) {
            					if (local_errors.get(i).getLine() < local_errors.get(j).getLine()){
                               		        	local_errors.remove(j);
                               			}
                               		       	else{
                               		        	local_errors.remove(i);
                               		        }
                   		         	}
                   		    	}
                   		}
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:126:1: directive_def returns [ArrayList<SimpleError> errors] : directive_import ;
    public final ArrayList<SimpleError> directive_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> directive_import3 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:127:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:127:4: directive_import
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:134:1: directive_import returns [ArrayList<SimpleError> errors] : ^( IMPORT STRING ) ;
    public final ArrayList<SimpleError> directive_import() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:135:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:135:4: ^( IMPORT STRING )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import132); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_directive_import134); 

            match(input, Token.UP, null); 

            		errors = new ArrayList<SimpleError>(0);
            	

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


    // $ANTLR start "element"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:146:1: element returns [ArrayList<SimpleError> errors] : ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) | ^( MAIN main_def ) );
    public final ArrayList<SimpleError> element() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_def4 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:147:2: ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) | ^( MAIN main_def ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:147:4: ^( RECONFIGURATION reconfiguration_def )
                    {
                    match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element159); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_reconfiguration_def_in_element161);
                    reconfiguration_def4=reconfiguration_def();

                    state._fsp--;


                    		errors = reconfiguration_def4;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:152:4: ^( APPLICATION applicaiton_def )
                    {
                    match(input,APPLICATION,FOLLOW_APPLICATION_in_element174); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_applicaiton_def_in_element176);
                    applicaiton_def();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:153:4: ^( MAIN main_def )
                    {
                    match(input,MAIN,FOLLOW_MAIN_in_element184); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_main_def_in_element186);
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
        return errors;
    }
    // $ANTLR end "element"

    protected static class reconfiguration_def_scope {
        TinySymbol name;
        ArrayList<TinySymbolsTable> scopes;
    }
    protected Stack reconfiguration_def_stack = new Stack();


    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:158:1: reconfiguration_def returns [ArrayList<SimpleError> errors] : ^( ID ( args_def )? reconfiguration_block ) ;
    public final ArrayList<SimpleError> reconfiguration_def() throws RecognitionException {
        reconfiguration_def_stack.push(new reconfiguration_def_scope());
        ArrayList<SimpleError> errors = null;

        CommonTree ID5=null;
        ArrayList<SimpleError> args_def6 = null;

        ArrayList<SimpleError> reconfiguration_block7 = null;



        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name = new TinySymbol();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = new ArrayList<TinySymbolsTable>();
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:171:2: ( ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:171:4: ^( ID ( args_def )? reconfiguration_block )
            {
            ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def211); 

            		
            		TinySymbol ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get((ID5!=null?ID5.getText():null));
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name = ts;
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
            		
            		if (((reclang_scope)reclang_stack.peek()).ids_table.containsSymbol((ID5!=null?ID5.getText():null))){
            			if ( !((ID5!=null?ID5.getLine():0) == ts.getLine() && (ID5!=null?ID5.getCharPositionInLine():0) == ts.getPosition()) ){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID5!=null?ID5.getText():null), ts.getLine(), ts.getPosition()), (ID5!=null?ID5.getLine():0), (ID5!=null?ID5.getCharPositionInLine():0)) );
            			}
            		}
            	

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:183:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:183:3: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def219);
                    args_def6=args_def();

                    state._fsp--;


                    		local_errors.addAll(args_def6);
                    	

                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def228);
            reconfiguration_block7=reconfiguration_block();

            state._fsp--;


            		local_errors.addAll(reconfiguration_block7);
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:198:1: args_def returns [ArrayList<SimpleError> errors] : ^( ARGUMENTS ( arg_def )+ ) ;
    public final ArrayList<SimpleError> args_def() throws RecognitionException {
        args_def_stack.push(new args_def_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> arg_def8 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	((args_def_scope)args_def_stack.peek()).scope = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.get(0);
        	//((reclang_scope)reclang_stack.peek()).scope_id++;
        	TinySymbolsTable tst = new TinySymbolsTable(((reclang_scope)reclang_stack.peek()).ids_table);
        	for (TinySymbol ts : tst.getSymbols().values()){
        		ts.getScopes().clear();
        		((args_def_scope)args_def_stack.peek()).scope.addSymbol(ts);
        	}

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:212:2: ( ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:212:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def262); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:212:16: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:212:17: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def265);
            	    arg_def8=arg_def();

            	    state._fsp--;


            	    		local_errors.addAll(arg_def8);
            	    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:224:1: arg_def returns [ArrayList<SimpleError> errors] : ^( ARGUMENT datatype list_ids ) ;
    public final ArrayList<SimpleError> arg_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> list_ids9 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:229:2: ( ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:229:4: ^( ARGUMENT datatype list_ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def300); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def302);
            datatype();

            state._fsp--;

            pushFollow(FOLLOW_list_ids_in_arg_def304);
            list_ids9=list_ids();

            state._fsp--;


            		local_errors.addAll(list_ids9);
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:240:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final void datatype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:241:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:241:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype327); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:242:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype332); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:243:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype337); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:244:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype342); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:245:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype347); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:246:5: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype355);
                    other_type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype357);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:249:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final void other_type() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:250:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:255:1: subtype : datatype ;
    public final void subtype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:256:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:256:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype392);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:259:1: list_ids returns [ArrayList<SimpleError> errors] : ( ID )+ ;
    public final ArrayList<SimpleError> list_ids() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID10=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:264:2: ( ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:264:4: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:264:4: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:264:5: ID
            	    {
            	    ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids412); 

            	    		//if (((reclang_scope)reclang_stack.peek()).ids_table
            	    		if (((args_def_scope)args_def_stack.peek()).scope.containsSymbol((ID10!=null?ID10.getText():null))){
            	    			TinySymbol ts = ((args_def_scope)args_def_stack.peek()).scope.getSymbols().get((ID10!=null?ID10.getText():null));
            	    			if ( !((ID10!=null?ID10.getLine():0) == ts.getLine() && (ID10!=null?ID10.getCharPositionInLine():0) == ts.getPosition()) ){
            	    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID10!=null?ID10.getText():null), ts.getLine(), ts.getPosition()), (ID10!=null?ID10.getLine():0), (ID10!=null?ID10.getCharPositionInLine():0)) );
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:282:1: reconfiguration_block returns [ArrayList<SimpleError> errors] : ^( INSTRUCTIONS ( instruction )+ ) ;
    public final ArrayList<SimpleError> reconfiguration_block() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> instruction11 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:287:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:287:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block446); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:287:19: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:287:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block449);
            	    instruction11=instruction();

            	    state._fsp--;


            	    		local_errors.addAll(instruction11);
            	    	

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

    protected static class instruction_scope {
        TinySymbolsTable scope;
        String rec_type;
    }
    protected Stack instruction_stack = new Stack();


    // $ANTLR start "instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:299:1: instruction returns [ArrayList<SimpleError> errors] : ( declaration | assignment[false] | reconfiguration_apply | for_instruction );
    public final ArrayList<SimpleError> instruction() throws RecognitionException {
        instruction_stack.push(new instruction_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> declaration12 = null;

        ArrayList<SimpleError> assignment13 = null;

        ArrayList<SimpleError> reconfiguration_apply14 = null;

        ArrayList<SimpleError> for_instruction15 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	((instruction_scope)instruction_stack.peek()).rec_type = "";
        	((instruction_scope)instruction_stack.peek()).scope = this.getScope( ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1) ); //rever

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:309:2: ( declaration | assignment[false] | reconfiguration_apply | for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:309:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction486);
                    declaration12=declaration();

                    state._fsp--;

                     
                    		local_errors.addAll(declaration12); 
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:314:4: assignment[false]
                    {
                    pushFollow(FOLLOW_assignment_in_instruction495);
                    assignment13=assignment(false);

                    state._fsp--;

                     
                    		local_errors.addAll(assignment13); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:319:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction505);
                    reconfiguration_apply14=reconfiguration_apply();

                    state._fsp--;

                     
                    		local_errors.addAll(reconfiguration_apply14); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:324:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction514);
                    for_instruction15=for_instruction();

                    state._fsp--;


                    		local_errors.addAll(for_instruction15);
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
            instruction_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "instruction"


    // $ANTLR start "reconfiguration_apply"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:335:1: reconfiguration_apply returns [ArrayList<SimpleError> errors] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final ArrayList<SimpleError> reconfiguration_apply() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_call16 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:340:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:340:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply537); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply539);
            reconfiguration_call16=reconfiguration_call();

            state._fsp--;


            		local_errors.addAll(reconfiguration_call16);
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:345:2: ( ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:345:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply547); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:352:1: declaration returns [ArrayList<SimpleError> errors] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final ArrayList<SimpleError> declaration() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> var_def17 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration574); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration576);
            datatype();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:27: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:28: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration579);
            	    var_def17=var_def();

            	    state._fsp--;


            	    		local_errors.addAll(var_def17);
            	    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:368:1: var_def returns [ArrayList<SimpleError> errors] : ( ID | assignment[true] );
    public final ArrayList<SimpleError> var_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID18=null;
        ArrayList<SimpleError> assignment19 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:373:2: ( ID | assignment[true] )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:373:4: ID
                    {
                    ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def611); 

                    		if (((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID18!=null?ID18.getText():null))){
                    			TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID18!=null?ID18.getText():null));
                    			if ( !((ID18!=null?ID18.getLine():0) == ts.getLine() && (ID18!=null?ID18.getCharPositionInLine():0) == ts.getPosition()) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID18!=null?ID18.getText():null), ts.getLine(), ts.getPosition()), (ID18!=null?ID18.getLine():0), (ID18!=null?ID18.getCharPositionInLine():0)) );
                    			}
                    		}
                    		else {
                    			Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    			TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID18!=null?ID18.getText():null), s_id);
                    			
                    			if ( ts != null && !((ID18!=null?ID18.getLine():0) == ts.getLine() && (ID18!=null?ID18.getCharPositionInLine():0) == ts.getPosition())){ //rever
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID18!=null?ID18.getText():null), ts.getLine(), ts.getPosition()), (ID18!=null?ID18.getLine():0), (ID18!=null?ID18.getCharPositionInLine():0)) );
                    			}
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:392:4: assignment[true]
                    {
                    pushFollow(FOLLOW_assignment_in_var_def621);
                    assignment19=assignment(true);

                    state._fsp--;


                    		local_errors.addAll(assignment19);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:399:1: assignment[boolean isDeclaration] returns [ArrayList<SimpleError> errors] : ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] ) ;
    public final ArrayList<SimpleError> assignment(boolean isDeclaration) throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID20=null;
        ArrayList<SimpleError> assignment_member21 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	TinySymbol ts = new TinySymbol();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:405:2: ( ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:405:4: ^( ASSIGNMENT ID assignment_member[ts, $ID.line, $ID.pos] )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment647); 

            match(input, Token.DOWN, null); 
            ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment649); 
            		
            		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();	
            /*		
            		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID20!=null?ID20.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);	
            		
            		if (isDeclaration){
            			if ( ts != null && !((ID20!=null?ID20.getLine():0) == ts.getLine() && (ID20!=null?ID20.getCharPositionInLine():0) == ts.getPosition()) ){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID20!=null?ID20.getText():null), ts.getLine(), ts.getPosition()), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            			}
            		}
            		else{
            			if ( ts == null){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID20!=null?ID20.getText():null)), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            			}
            		}				
            */				
            		if (isDeclaration){
            			if (((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null))) {
            				ts = ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID20!=null?ID20.getText():null));
            				if ( !((ID20!=null?ID20.getLine():0) == ts.getLine() && (ID20!=null?ID20.getCharPositionInLine():0) == ts.getPosition()) ){
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID20!=null?ID20.getText():null), ts.getLine(), ts.getPosition()), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            				}
            			}
            			else {
            				ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);
            				if ( ts != null && !((ID20!=null?ID20.getLine():0) == ts.getLine() && (ID20!=null?ID20.getCharPositionInLine():0) == ts.getPosition())){ //rever
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID20!=null?ID20.getText():null), ts.getLine(), ts.getPosition()), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            				}
            			}
            		}
            		else{
            			ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);
            			if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null)) && ts == null){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID20!=null?ID20.getText():null)), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            			}
            		}
            		
            		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID20!=null?ID20.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);	
            	
            pushFollow(FOLLOW_assignment_member_in_assignment655);
            assignment_member21=assignment_member(ts, (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0));

            state._fsp--;


            match(input, Token.UP, null); 

            		local_errors.addAll(assignment_member21);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:452:1: assignment_member[TinySymbol symbol, int id_line, int id_pos] returns [ArrayList<SimpleError> errors] : ( expression | reconfiguration_apply );
    public final ArrayList<SimpleError> assignment_member(TinySymbol symbol, int id_line, int id_pos) throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        RecSA.expression_return expression22 = null;

        ArrayList<SimpleError> reconfiguration_apply23 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	TinySymbol ts = symbol;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:457:2: ( expression | reconfiguration_apply )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:457:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member682);
                    expression22=expression();

                    state._fsp--;


                    /**/		if (!(expression22!=null?expression22.errors:null).isEmpty()){
                    			local_errors.addAll((expression22!=null?expression22.errors:null));
                    		}
                    		else{
                    //*/
                    			if (ts != null) {	
                    				if ( !ts.getDataType().equals((expression22!=null?expression22.datatype:null)) ){
                    					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((expression22!=null?expression22.name:null), ts.dataTypeToString()), (expression22!=null?((CommonTree)expression22.start):null).getLine(), (expression22!=null?((CommonTree)expression22.start):null).getCharPositionInLine()) );
                    			 	}
                    			}
                    		}
                    /*
                    		if (local_errors.isEmpty()){
                    			local_errors.addAll((expression22!=null?expression22.errors:null));
                    		}
                    */
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:477:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member691);
                    reconfiguration_apply23=reconfiguration_apply();

                    state._fsp--;

                     
                    		if (ts != null){
                    			List<Type> dt = new ArrayList<Type>();
                    			dt.add(Type.PATTERN);
                    			if (!ts.getDataType().equals(dt)){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(ts.getId(), "Pattern") , id_line, id_pos) );
                    			}	
                    			else{
                    				local_errors.addAll(reconfiguration_apply23); 
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:493:1: reconfiguration_call returns [ArrayList<SimpleError> errors] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final ArrayList<SimpleError> reconfiguration_call() throws RecognitionException {
        reconfiguration_call_stack.push(new reconfiguration_call_scope());
        ArrayList<SimpleError> errors = null;

        CommonTree OP_JOIN25=null;
        CommonTree OP_SPLIT27=null;
        CommonTree OP_PAR29=null;
        CommonTree OP_REMOVE31=null;
        CommonTree OP_CONST33=null;
        CommonTree OP_ID35=null;
        CommonTree ID36=null;
        RecSA.operation_args_return operation_args24 = null;

        RecSA.operation_args_return operation_args26 = null;

        RecSA.operation_args_return operation_args28 = null;

        RecSA.operation_args_return operation_args30 = null;

        RecSA.operation_args_return operation_args32 = null;

        RecSA.operation_args_return operation_args34 = null;

        RecSA.operation_args_return operation_args37 = null;



        	((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name = "";
        	((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args = new ArrayList<TinySymbol>();
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:503:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:503:4: ^( OP_JOIN operation_args )
                    {
                    OP_JOIN25=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call718); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "join"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call724);
                        operation_args24=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args24!=null?((CommonTree)operation_args24.start):null) != null){
                    			local_errors.addAll((operation_args24!=null?operation_args24.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_JOIN25!=null?OP_JOIN25.getText():null)) , (OP_JOIN25!=null?OP_JOIN25.getLine():0), (OP_JOIN25!=null?OP_JOIN25.getCharPositionInLine():0)) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:515:4: ^( OP_SPLIT operation_args )
                    {
                    OP_SPLIT27=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call737); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "split"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call743);
                        operation_args26=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args26!=null?((CommonTree)operation_args26.start):null) != null){
                    			local_errors.addAll((operation_args26!=null?operation_args26.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_SPLIT27!=null?OP_SPLIT27.getText():null)) , (OP_SPLIT27!=null?OP_SPLIT27.getLine():0), (OP_SPLIT27!=null?OP_SPLIT27.getCharPositionInLine():0)) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:527:4: ^( OP_PAR operation_args )
                    {
                    OP_PAR29=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call756); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "par"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call762);
                        operation_args28=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args28!=null?((CommonTree)operation_args28.start):null) != null){
                    			local_errors.addAll((operation_args28!=null?operation_args28.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_PAR29!=null?OP_PAR29.getText():null)) , (OP_PAR29!=null?OP_PAR29.getLine():0), (OP_PAR29!=null?OP_PAR29.getCharPositionInLine():0)) ); 
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:539:4: ^( OP_REMOVE operation_args )
                    {
                    OP_REMOVE31=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call774); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "remove"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call780);
                        operation_args30=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args30!=null?((CommonTree)operation_args30.start):null) != null){
                    			local_errors.addAll((operation_args30!=null?operation_args30.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_REMOVE31!=null?OP_REMOVE31.getText():null)) , (OP_REMOVE31!=null?OP_REMOVE31.getLine():0), (OP_REMOVE31!=null?OP_REMOVE31.getCharPositionInLine():0)) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:551:4: ^( OP_CONST operation_args )
                    {
                    OP_CONST33=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call793); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "const"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call799);
                        operation_args32=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args32!=null?((CommonTree)operation_args32.start):null) != null){
                    			local_errors.addAll((operation_args32!=null?operation_args32.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_CONST33!=null?OP_CONST33.getText():null)) , (OP_CONST33!=null?OP_CONST33.getLine():0), (OP_CONST33!=null?OP_CONST33.getCharPositionInLine():0)) );
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:563:4: ^( OP_ID operation_args )
                    {
                    OP_ID35=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call811); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "id"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call817);
                        operation_args34=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		if((operation_args34!=null?((CommonTree)operation_args34.start):null) != null){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((instruction_scope)instruction_stack.peek()).rec_type) , (OP_ID35!=null?OP_ID35.getLine():0), (OP_ID35!=null?OP_ID35.getCharPositionInLine():0)) );
                    			//local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidArgument((operation_args34!=null?((CommonTree)operation_args34.start):null).toString()) , (OP_ID35!=null?OP_ID35.getLine():0), (OP_ID35!=null?OP_ID35.getCharPositionInLine():0)+4) );			
                    			
                    			////is not necessary since 'id' has no arguments
                    			//local_errors.addAll((operation_args34!=null?operation_args34.errors:null));
                    		}
                    		
                    		
                    		errors = local_errors;
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:578:4: ^( ID operation_args )
                    {
                    ID36=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call831); 

                     
                    		((instruction_scope)instruction_stack.peek()).rec_type = "custom"; 
                    		((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name = (ID36!=null?ID36.getText():null);
                    		
                    		if (((reclang_scope)reclang_stack.peek()).ids_table.containsSymbol((ID36!=null?ID36.getText():null))){
                    			TinySymbol ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get((ID36!=null?ID36.getText():null));
                    			if (ts.getLine() > ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.getLine()){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.recNotDefined((ID36!=null?ID36.getText():null)), (ID36!=null?ID36.getLine():0), (ID36!=null?ID36.getCharPositionInLine():0)) );
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
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.recNotDefined((ID36!=null?ID36.getText():null)), (ID36!=null?ID36.getLine():0), (ID36!=null?ID36.getCharPositionInLine():0)) );
                    		}
                    	

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call840);
                        operation_args37=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                    	
                    		if((operation_args37!=null?((CommonTree)operation_args37.start):null) != null){
                    			local_errors.addAll((operation_args37!=null?operation_args37.errors:null));
                    		}
                    		else{
                    			if (!((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.isEmpty()){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((ID36!=null?ID36.getText():null)) , (ID36!=null?ID36.getLine():0), (ID36!=null?ID36.getCharPositionInLine():0)) ); //(ID36!=null?ID36.getCharPositionInLine():0)
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:632:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final void structure_operation_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:633:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:633:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call860); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call862);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:634:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call869); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call871);
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
        public ArrayList<SimpleError> errors;
    };

    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:638:1: operation_args returns [ArrayList<SimpleError> errors] : ( args )? ;
    public final RecSA.operation_args_return operation_args() throws RecognitionException {
        RecSA.operation_args_return retval = new RecSA.operation_args_return();
        retval.start = input.LT(1);

        RecSA.args_return args38 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:642:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:642:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:642:4: ( args )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=OP_PATH && LA16_0<=OP_UPDATE)||(LA16_0>=OP_UNION && LA16_0<=OP_MINUS)||LA16_0==ID||(LA16_0>=TRIPLE && LA16_0<=XOR)||LA16_0==ACCESS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:642:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args894);
                    args38=args();

                    state._fsp--;


                    		//reconfiguration of type "custom" can have more than one argument; id primitive tested before (do not even have one argument)
                    		if ((args38!=null?args38.counter:0) > 1 && !((instruction_scope)instruction_stack.peek()).rec_type.equals("custom") && !((instruction_scope)instruction_stack.peek()).rec_type.equals("id")){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((instruction_scope)instruction_stack.peek()).rec_type) , (args38!=null?((CommonTree)args38.start):null).getLine(), (args38!=null?((CommonTree)args38.start):null).getCharPositionInLine()) );
                    		}
                    		//if the number of arguments are correct, check their type (possible errors)
                    		else {
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("custom") && (args38!=null?args38.counter:0) < ((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.size()){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name) , (args38!=null?((CommonTree)args38.start):null).getLine(), (args38!=null?((CommonTree)args38.start):null).getCharPositionInLine()) );
                    			}
                    			else{
                    				local_errors.addAll((args38!=null?args38.errors:null));
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
        public ArrayList<SimpleError> errors;
        public int counter;
    };

    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:664:1: args returns [ArrayList<SimpleError> errors, int counter] : ( expression )+ ;
    public final RecSA.args_return args() throws RecognitionException {
        RecSA.args_return retval = new RecSA.args_return();
        retval.start = input.LT(1);

        RecSA.expression_return expression39 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	ArrayList<SimpleError> global_errors = new ArrayList<SimpleError>();
        	int i = 0;
        	boolean exceeded = false;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:671:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:671:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:671:4: ( expression )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:671:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args926);
            	    expression39=expression();

            	    state._fsp--;


            	    		if (((instruction_scope)instruction_stack.peek()).rec_type.equals("custom")){
            	    			if (((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.size() > i){
            	    				//original argument
            	    				TinySymbol ts1 = ((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.get(i);

            	    //			if (ts1 != null){				
            	    				String value = (expression39!=null?expression39.name:null);
            	    				Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            	    				//if contains symbol, value of new argument is obtained from ((instruction_scope)instruction_stack.peek()).scope, else from ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name
            	    				TinySymbol ts2 = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol(value) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get(value) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue(value, s_id);
            	    				if ( ts2 != null && !ts2.getDataType().equals(ts1.getDataType()) ){
            	    					String datatype = ts1.dataTypeToString();
            	    					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(value, datatype) , (expression39!=null?((CommonTree)expression39.start):null).getLine(), (expression39!=null?((CommonTree)expression39.start):null).getCharPositionInLine() ) );
            	    				}
            	    			}
            	    			else{
            	    				exceeded = true;
            	    			}
            	    		}
            	    		local_errors.addAll((expression39!=null?expression39.errors:null));
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
            			global_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name) , (expression39!=null?((CommonTree)expression39.start):null).getLine(), (expression39!=null?((CommonTree)expression39.start):null).getCharPositionInLine() ) );
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:711:1: for_instruction returns [ArrayList<SimpleError> errors] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
    public final ArrayList<SimpleError> for_instruction() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree id1=null;
        CommonTree id2=null;
        ArrayList<SimpleError> reconfiguration_block40 = null;



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
        	
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:727:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:727:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction963); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction965);
            datatype();

            state._fsp--;

            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction969); 
            	
            		((instruction_scope)instruction_stack.peek()).scope = this.getScope(((reclang_scope)reclang_stack.peek()).parent_id); //rever
            		
            		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            		if ( ts != null ){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((id1!=null?id1.getText():null), ts.getLine(), ts.getPosition()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            		}
            	
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction979); 

            		ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);
            		if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id2!=null?id2.getText():null)) && ts == null){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id2!=null?id2.getText():null)), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0)) );
            		}
            		else{
            			if (local_errors.isEmpty()){
            				TinySymbol ts1 = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            				TinySymbol ts2 = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id2!=null?id2.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id2!=null?id2.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);				

            				if (!ts2.getDataType().get(0).equals(Type.SET)){
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id2!=null?id2.getText():null), "Set<T>"), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0)) );
            				}
            				else{
            					if (ts1 != null){
            						List<Type> datatype = new ArrayList<Type>(ts2.getDataType());
            						datatype.remove(0);
            						if (!ts1.getDataType().equals(datatype)){
            							local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), ts2.dataTypeToString()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            						}
            					}
            				}
            			}
            		}
            	
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction988);
            reconfiguration_block40=reconfiguration_block();

            state._fsp--;


            		local_errors.addAll(reconfiguration_block40);
            	

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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:778:1: expression returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ( ^( OP_UNION f1= factor f2= factor ) | ^( OP_INTERSECTION f1= factor f2= factor ) | ^( OP_MINUS f1= factor f2= factor ) | factor );
    public final RecSA.expression_return expression() throws RecognitionException {
        RecSA.expression_return retval = new RecSA.expression_return();
        retval.start = input.LT(1);

        RecSA.factor_return f1 = null;

        RecSA.factor_return f2 = null;

        RecSA.factor_return factor41 = null;



        	Triple<List<SimpleError>, HashSet<List<Type>>, Integer> res = null;

        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	List<Type> dt = new ArrayList<Type>();
        	
        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:789:2: ( ^( OP_UNION f1= factor f2= factor ) | ^( OP_INTERSECTION f1= factor f2= factor ) | ^( OP_MINUS f1= factor f2= factor ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:789:4: ^( OP_UNION f1= factor f2= factor )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression1023); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1027);
                    f1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1031);
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:811:4: ^( OP_INTERSECTION f1= factor f2= factor )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1045); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1049);
                    f1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1053);
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
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidElements("SET"), $SET.line, $SET.pos) );
                    		}
                    		*/
                    		retval.datatype = dt;
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:838:4: ^( OP_MINUS f1= factor f2= factor )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1067); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression1071);
                    f1=factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression1075);
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:860:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression1088);
                    factor41=factor();

                    state._fsp--;


                    		retval.errors = (factor41!=null?factor41.errors:null); 
                    		retval.name = (factor41!=null?factor41.name:null); 
                    		retval.datatype = (factor41!=null?factor41.datatype:null);
                    	

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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:869:1: factor returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ( ^( ID ID ) | ID | operation | constructor );
    public final RecSA.factor_return factor() throws RecognitionException {
        RecSA.factor_return retval = new RecSA.factor_return();
        retval.start = input.LT(1);

        CommonTree ID42=null;
        RecSA.operation_return operation43 = null;

        RecSA.constructor_return constructor44 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	List<Type> dt = new ArrayList<Type>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:874:2: ( ^( ID ID ) | ID | operation | constructor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:874:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1112); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1114); 

                    match(input, Token.UP, null); 

                    		retval.errors = local_errors;
                    		retval.datatype = dt;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:880:4: ID
                    {
                    ID42=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1126); 

                    		retval.name = (ID42!=null?ID42.getText():null);
                    		
                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID42!=null?ID42.getText():null), s_id);
                    		if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID42!=null?ID42.getText():null)) && ts == null){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID42!=null?ID42.getText():null)), (ID42!=null?ID42.getLine():0), (ID42!=null?ID42.getCharPositionInLine():0)) );
                    		}
                    		else{
                    			TinySymbol symbol = ts != null ? ts : ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID42!=null?ID42.getText():null));
                    			
                    			dt.clear();
                    			dt.add(Type.PATTERN);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("const") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID42!=null?ID42.getText():null), "Pattern"), (ID42!=null?ID42.getLine():0), (ID42!=null?ID42.getCharPositionInLine():0)) );
                    			}
                    			
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("par") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID42!=null?ID42.getText():null), "Pattern"), (ID42!=null?ID42.getLine():0), (ID42!=null?ID42.getCharPositionInLine():0)) );
                    			}
                    			
                    			dt.clear();
                    			dt.add(Type.SET);
                    			dt.add(Type.NODE);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("join") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID42!=null?ID42.getText():null), "Set<Node>"), (ID42!=null?ID42.getLine():0), (ID42!=null?ID42.getCharPositionInLine():0)) );
                    											}
                    			
                    			dt.clear();
                    			dt.add(Type.NODE);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("split") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID42!=null?ID42.getText():null), "Node"), (ID42!=null?ID42.getLine():0), (ID42!=null?ID42.getCharPositionInLine():0)) );
                    			}
                    			
                    			dt.clear();
                    			dt.add(Type.NAME);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("remove") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID42!=null?ID42.getText():null), "Name"), (ID42!=null?ID42.getLine():0), (ID42!=null?ID42.getCharPositionInLine():0)) );
                    			}
                    			
                    			dt.clear();
                    			dt.addAll( symbol.getDataType() );
                    		}
                    		
                    		retval.datatype = dt;
                    		retval.errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:928:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1134);
                    operation43=operation();

                    state._fsp--;


                    		retval.name = (operation43!=null?operation43.name:null);
                    		retval.datatype = (operation43!=null?operation43.datatype:null);
                    		retval.errors = (operation43!=null?operation43.errors:null); 
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:935:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1145);
                    constructor44=constructor();

                    state._fsp--;


                    		retval.name = (constructor44!=null?constructor44.name:null);
                    		retval.datatype = (constructor44!=null?constructor44.datatype:null);
                    		retval.errors = (constructor44!=null?constructor44.errors:null); 
                    		
                    	

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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:944:1: operation returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call );
    public final RecSA.operation_return operation() throws RecognitionException {
        operation_stack.push(new operation_scope());
        RecSA.operation_return retval = new RecSA.operation_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        RecSA.attribute_call_return attribute_call45 = null;



        	((operation_scope)operation_stack.peek()).id = "";
        	((operation_scope)operation_stack.peek()).line = 0;
        	((operation_scope)operation_stack.peek()).pos = 0;
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:957:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:957:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[ts] )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1172); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1176); 

                    		((operation_scope)operation_stack.peek()).id = (id1!=null?id1.getText():null);
                    		((operation_scope)operation_stack.peek()).line = (id1!=null?id1.getLine():0);
                    		((operation_scope)operation_stack.peek()).pos = (id1!=null?id1.getCharPositionInLine():0);
                    		
                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    		//if contains symbol, tiny symbol is obtained from ((instruction_scope)instruction_stack.peek()).scope, else from ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name
                    		TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);

                    		if (ts == null){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                    		}
                    	
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:971:2: ( ^( STRUCTURE id2= ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==STRUCTURE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:971:3: ^( STRUCTURE id2= ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1184); 

                            match(input, Token.DOWN, null); 
                            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1188); 

                            		((operation_scope)operation_stack.peek()).id = (id2!=null?id2.getText():null);
                            		((operation_scope)operation_stack.peek()).line = (id2!=null?id2.getLine():0);
                            		((operation_scope)operation_stack.peek()).pos = (id2!=null?id2.getCharPositionInLine():0);
                            		
                            		//if contains symbol, tiny symbol is obtained from ((instruction_scope)instruction_stack.peek()).scope, else from ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name
                            		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);

                            		if (ts == null){
                            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                            		}
                            	

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1198);
                    attribute_call45=attribute_call(ts);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    		if((attribute_call45!=null?attribute_call45.errors:null) != null){
                    			local_errors.addAll((attribute_call45!=null?attribute_call45.errors:null));
                    		}
                    		
                    		retval.errors = local_errors;
                    		retval.name = ((operation_scope)operation_stack.peek()).id + "." + (attribute_call45!=null?attribute_call45.name:null);
                    		retval.datatype = (attribute_call45!=null?attribute_call45.datatype:null);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:996:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1212);
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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1002:1: constructor returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final RecSA.constructor_return constructor() throws RecognitionException {
        RecSA.constructor_return retval = new RecSA.constructor_return();
        retval.start = input.LT(1);

        RecSA.triple_cons_return triple_cons46 = null;

        RecSA.pair_cons_return pair_cons47 = null;

        RecSA.set_cons_return set_cons48 = null;

        RecSA.node_cons_return node_cons49 = null;

        RecSA.xor_cons_return xor_cons50 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1003:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1003:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1232);
                    triple_cons46=triple_cons();

                    state._fsp--;

                     
                    		retval.errors = (triple_cons46!=null?triple_cons46.errors:null); 
                    		retval.name = (triple_cons46!=null?triple_cons46.name:null); 
                    		retval.datatype = (triple_cons46!=null?triple_cons46.datatype:null); 
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1010:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1243);
                    pair_cons47=pair_cons();

                    state._fsp--;

                     
                    		retval.errors = (pair_cons47!=null?pair_cons47.errors:null); 		
                    		retval.name = (pair_cons47!=null?pair_cons47.name:null); 
                    		retval.datatype = (pair_cons47!=null?pair_cons47.datatype:null); 

                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1018:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1254);
                    set_cons48=set_cons();

                    state._fsp--;

                     
                    		retval.errors = (set_cons48!=null?set_cons48.errors:null);
                    		retval.name = (set_cons48!=null?set_cons48.name:null); 
                    		retval.datatype = (set_cons48!=null?set_cons48.datatype:null); 
                     
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1026:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1265);
                    node_cons49=node_cons();

                    state._fsp--;

                     
                    		retval.errors = (node_cons49!=null?node_cons49.errors:null); 
                    		retval.name = (node_cons49!=null?node_cons49.name:null); 
                    		retval.datatype = (node_cons49!=null?node_cons49.datatype:null); 

                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1034:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1276);
                    xor_cons50=xor_cons();

                    state._fsp--;

                     
                    		retval.errors = (xor_cons50!=null?xor_cons50.errors:null); 
                    		retval.name = (xor_cons50!=null?xor_cons50.name:null); 
                    		retval.datatype = (xor_cons50!=null?xor_cons50.datatype:null); 
                    	

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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1048:1: attribute_call[TinySymbol ts] returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
    public final RecSA.attribute_call_return attribute_call(TinySymbol ts) throws RecognitionException {
        RecSA.attribute_call_return retval = new RecSA.attribute_call_return();
        retval.start = input.LT(1);

        CommonTree INT51=null;
        CommonTree OP_IN52=null;
        CommonTree INT53=null;
        CommonTree OP_OUT54=null;
        CommonTree ID55=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();	
        	List<Type> datatype = new ArrayList<Type>();
        	if (ts != null){
        		datatype = new ArrayList<Type>(ts.getDataType());
        	}
        	
        	List<Type> dt = new ArrayList<Type>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1058:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1058:4: ^( OP_IN ( INT )? )
                    {
                    OP_IN52=(CommonTree)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1308); 


                    		if (ts != null){
                    			dt = new ArrayList<Type>();
                    			dt.add(Type.SET);
                    			dt.add(Type.NODE);
                    		}
                    	

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1067:2: ( INT )?
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==INT) ) {
                            alt23=1;
                        }
                        switch (alt23) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1067:3: INT
                                {
                                INT51=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1318); 

                                		if (ts != null){		
                                			dt = new ArrayList<Type>();
                                			dt.add(Type.CHANNEL);
                                			if ( Integer.parseInt((INT51!=null?INT51.getText():null)) > 1 && datatype.containsAll(dt) ){
                                				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments("attribute", (OP_IN52!=null?OP_IN52.getText():null)) , (INT51!=null?INT51.getLine():0), (INT51!=null?INT51.getCharPositionInLine():0)) );
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
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern' or 'Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1099:4: ^( OP_OUT ( INT )? )
                    {
                    OP_OUT54=(CommonTree)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1339); 


                    		if (ts != null){
                    			dt = new ArrayList<Type>();
                    			dt.add(Type.SET);
                    			dt.add(Type.NODE);
                    		}
                    	

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1108:2: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1108:3: INT
                                {
                                INT53=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1349); 

                                		if (ts != null){		
                                			dt = new ArrayList<Type>();
                                			dt.add(Type.CHANNEL);
                                			if ( Integer.parseInt((INT53!=null?INT53.getText():null)) > 1 && datatype.containsAll(dt) ){
                                				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments("attribute", (OP_OUT54!=null?OP_OUT54.getText():null)) , (INT53!=null?INT53.getLine():0), (INT53!=null?INT53.getCharPositionInLine():0)) );
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
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern' or 'Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1140:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1368); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !t.equals(Type.CHANNEL) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1158:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1380); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !t.equals(Type.PATTERN) || !t.equals(Type.CHANNEL) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern' or 'Channel"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1177:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1392); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !t.equals(Type.PATTERN) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pattern"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1217:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1407); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pair' or 'Triple"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1236:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1419); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Pair' or 'Triple"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1254:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1429); 

                    		if (ts != null){
                    			Type t = datatype.get(0);
                    		 	if( !t.equals(Type.TRIPLE) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((operation_scope)operation_stack.peek()).id, "Triple"), ((operation_scope)operation_stack.peek()).line, ((operation_scope)operation_stack.peek()).pos) );
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1273:4: ID
                    {
                    ID55=(CommonTree)match(input,ID,FOLLOW_ID_in_attribute_call1441); 

                    		retval.datatype = dt;
                    		retval.name = (ID55!=null?ID55.getText():null);		
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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "triple_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1282:1: triple_cons returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ^( TRIPLE e1= expression e2= expression e3= expression ) ;
    public final RecSA.triple_cons_return triple_cons() throws RecognitionException {
        RecSA.triple_cons_return retval = new RecSA.triple_cons_return();
        retval.start = input.LT(1);

        CommonTree TRIPLE56=null;
        RecSA.expression_return e1 = null;

        RecSA.expression_return e2 = null;

        RecSA.expression_return e3 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	List<Type> dt = new ArrayList<Type>();
        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;
        	String name = "T(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1290:2: ( ^( TRIPLE e1= expression e2= expression e3= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1290:4: ^( TRIPLE e1= expression e2= expression e3= expression )
            {
            TRIPLE56=(CommonTree)match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1469); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1473);
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
            	
            pushFollow(FOLLOW_expression_in_triple_cons1484);
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
            	
            pushFollow(FOLLOW_expression_in_triple_cons1496);
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
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidElements(retval.name), (TRIPLE56!=null?TRIPLE56.getLine():0), (TRIPLE56!=null?TRIPLE56.getCharPositionInLine():0)) );
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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "set_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1350:1: set_cons returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ^( SET ( expression )* ) ;
    public final RecSA.set_cons_return set_cons() throws RecognitionException {
        RecSA.set_cons_return retval = new RecSA.set_cons_return();
        retval.start = input.LT(1);

        CommonTree SET58=null;
        RecSA.expression_return expression57 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();	
        	List<Type> dt = new ArrayList<Type>();
        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;
        	String name = "S(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1358:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1358:4: ^( SET ( expression )* )
            {
            SET58=(CommonTree)match(input,SET,FOLLOW_SET_in_set_cons1530); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1358:10: ( expression )*
                loop26:
                do {
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=OP_PATH && LA26_0<=OP_UPDATE)||(LA26_0>=OP_UNION && LA26_0<=OP_MINUS)||LA26_0==ID||(LA26_0>=TRIPLE && LA26_0<=XOR)||LA26_0==ACCESS) ) {
                        alt26=1;
                    }


                    switch (alt26) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1358:11: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1533);
                	    expression57=expression();

                	    state._fsp--;


                	    		local_errors.addAll((expression57!=null?expression57.errors:null));
                	    		if ( !(expression57!=null?expression57.datatype:null).isEmpty() ) {
                	    			datatypes.add((expression57!=null?expression57.datatype:null));
                	    		}
                	    		else{
                	    			nulls++;
                	    		}
                	    		name += (expression57!=null?expression57.name:null) + ",";
                	    	

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
                				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidElements(retval.name), (SET58!=null?SET58.getLine():0), (SET58!=null?SET58.getCharPositionInLine():0)) );
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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "pair_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1392:1: pair_cons returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ^( PAIR e1= expression e2= expression ) ;
    public final RecSA.pair_cons_return pair_cons() throws RecognitionException {
        RecSA.pair_cons_return retval = new RecSA.pair_cons_return();
        retval.start = input.LT(1);

        CommonTree PAIR59=null;
        RecSA.expression_return e1 = null;

        RecSA.expression_return e2 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	List<Type> dt = new ArrayList<Type>();
        	HashSet<List<Type>> datatypes = new HashSet<List<Type>>();
        	int nulls = 0;
        	String name = "P(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1400:2: ( ^( PAIR e1= expression e2= expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1400:4: ^( PAIR e1= expression e2= expression )
            {
            PAIR59=(CommonTree)match(input,PAIR,FOLLOW_PAIR_in_pair_cons1567); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1571);
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
            	
            pushFollow(FOLLOW_expression_in_pair_cons1580);
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
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidElements(retval.name), (PAIR59!=null?PAIR59.getLine():0), (PAIR59!=null?PAIR59.getCharPositionInLine():0)) );
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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1450:1: node_cons returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ^( NODE ( ID )+ ) ;
    public final RecSA.node_cons_return node_cons() throws RecognitionException {
        RecSA.node_cons_return retval = new RecSA.node_cons_return();
        retval.start = input.LT(1);

        CommonTree ID60=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();	
        	List<Type> dt = new ArrayList<Type>();
        	String name = "N(";

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1456:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1456:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1622); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1456:11: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1456:12: ID
            	    {
            	    ID60=(CommonTree)match(input,ID,FOLLOW_ID_in_node_cons1625); 

            	    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            	    		TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID60!=null?ID60.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID60!=null?ID60.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID60!=null?ID60.getText():null), s_id);
            	    		
            	    		if (ts == null){
            	    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID60!=null?ID60.getText():null)), (ID60!=null?ID60.getLine():0), (ID60!=null?ID60.getCharPositionInLine():0)) );
            	    		}
            	    		else{
            	    			dt = new ArrayList<Type>();
            	    			dt.add(Type.NAME);
            	    			if (!ts.getDataType().equals(dt)){
            	    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID60!=null?ID60.getText():null), "Name"), (ID60!=null?ID60.getLine():0), (ID60!=null?ID60.getCharPositionInLine():0)) );
            	    			}
            	    		}
            	    		name += (ID60!=null?ID60.getText():null) + ",";
            	    		
            	    	

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
        public ArrayList<SimpleError> errors;
        public List<Type> datatype;
        public String name;
    };

    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1492:1: xor_cons returns [ArrayList<SimpleError> errors, List<Type> datatype, String name] : ^( XOR ^( IN id1= ID (id2= ID )* ) ^( OUT id3= ID (id4= ID )+ ) ) ;
    public final RecSA.xor_cons_return xor_cons() throws RecognitionException {
        RecSA.xor_cons_return retval = new RecSA.xor_cons_return();
        retval.start = input.LT(1);

        CommonTree id1=null;
        CommonTree id2=null;
        CommonTree id3=null;
        CommonTree id4=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();	

        	Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
        	TinySymbol ts = null;
        	
        	List<Type> dt = new ArrayList<Type>();
        	String name = "X(";
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1503:2: ( ^( XOR ^( IN id1= ID (id2= ID )* ) ^( OUT id3= ID (id4= ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1503:4: ^( XOR ^( IN id1= ID (id2= ID )* ) ^( OUT id3= ID (id4= ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons1660); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons1664); 

            match(input, Token.DOWN, null); 
            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1668); 

            		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            		
            		if (ts == null){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            		}
            		else{
            			dt = new ArrayList<Type>();
            			dt.add(Type.NAME);
            			if (!ts.getDataType().equals(dt)){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), "Name"), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            			}
            		}
            		name += (id1!=null?id1.getText():null) + ",";		
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1520:2: (id2= ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1520:3: id2= ID
            	    {
            	    id2=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1680); 

            	    		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id2!=null?id2.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id2!=null?id2.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);
            	    		
            	    		if (ts == null){
            	    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id2!=null?id2.getText():null)), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0)) );
            	    		}
            	    		else{
            	    			dt = new ArrayList<Type>();
            	    			dt.add(Type.NAME);
            	    			if (!ts.getDataType().equals(dt)){
            	    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id2!=null?id2.getText():null), "Name"), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0)) );
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
            match(input,OUT,FOLLOW_OUT_in_xor_cons1694); 

            match(input, Token.DOWN, null); 
            id3=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1698); 

            		name = name.substring(0, name.length()-1);
            		name += ":";
            		
            		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id3!=null?id3.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id3!=null?id3.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id3!=null?id3.getText():null), s_id);
            		
            		if (ts == null){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id3!=null?id3.getText():null)), (id3!=null?id3.getLine():0), (id3!=null?id3.getCharPositionInLine():0)) );
            		}
            		else{
            			dt = new ArrayList<Type>();
            			dt.add(Type.NAME);
            			if (!ts.getDataType().equals(dt)){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id3!=null?id3.getText():null), "Name"), (id3!=null?id3.getLine():0), (id3!=null?id3.getCharPositionInLine():0)) );
            			}
            		}
            		name += (id3!=null?id3.getText():null) + ",";		
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1556:2: (id4= ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1556:3: id4= ID
            	    {
            	    id4=(CommonTree)match(input,ID,FOLLOW_ID_in_xor_cons1708); 

            	    		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id4!=null?id4.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id4!=null?id4.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id4!=null?id4.getText():null), s_id);
            	    		
            	    		if (ts == null){
            	    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id4!=null?id4.getText():null)), (id4!=null?id4.getLine():0), (id4!=null?id4.getCharPositionInLine():0)) );
            	    		}
            	    		else{
            	    			dt = new ArrayList<Type>();
            	    			dt.add(Type.NAME);
            	    			if (!ts.getDataType().equals(dt)){
            	    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id4!=null?id4.getText():null), "Name"), (id4!=null?id4.getLine():0), (id4!=null?id4.getCharPositionInLine():0)) );
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1592:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final void applicaiton_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1593:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1593:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1739); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1741);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1593:29: ( trigger_def )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SEP_BLOCK_START) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1593:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1743);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1596:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final void list_reconfigurations() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1597:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1597:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1597:4: ( reconfiguration_call )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1597:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1756);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1600:1: trigger_def : trigger_block ;
    public final void trigger_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1601:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1601:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1769);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1604:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final void trigger_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1605:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1605:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1781); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1783); 

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


    // $ANTLR start "main_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1611:1: main_def : ( main_args )? main_block ;
    public final void main_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1612:2: ( ( main_args )? main_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1612:4: ( main_args )? main_block
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1612:4: ( main_args )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==ARGUMENTS) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1612:4: main_args
                    {
                    pushFollow(FOLLOW_main_args_in_main_def1797);
                    main_args();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_main_block_in_main_def1800);
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
        return ;
    }
    // $ANTLR end "main_def"


    // $ANTLR start "main_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1615:1: main_args : ^( ARGUMENTS ( main_arg )+ ) ;
    public final void main_args() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1616:2: ( ^( ARGUMENTS ( main_arg )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1616:4: ^( ARGUMENTS ( main_arg )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1812); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1616:16: ( main_arg )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1616:16: main_arg
            	    {
            	    pushFollow(FOLLOW_main_arg_in_main_args1814);
            	    main_arg();

            	    state._fsp--;


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
    // $ANTLR end "main_args"


    // $ANTLR start "main_arg"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1619:1: main_arg : ^( ARGUMENT ID ids ) ;
    public final void main_arg() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1620:2: ( ^( ARGUMENT ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1620:4: ^( ARGUMENT ID ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1828); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_arg1830); 
            pushFollow(FOLLOW_ids_in_main_arg1832);
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
        return ;
    }
    // $ANTLR end "main_arg"


    // $ANTLR start "ids"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1623:1: ids : ^( IDS ( ID )+ ) ;
    public final void ids() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1624:2: ( ^( IDS ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1624:4: ^( IDS ( ID )+ )
            {
            match(input,IDS,FOLLOW_IDS_in_ids1846); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1624:10: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1624:10: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_ids1848); 

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
        return ;
    }
    // $ANTLR end "ids"


    // $ANTLR start "main_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1628:1: main_block : ^( INSTRUCTIONS ( main_instruction )+ ) ;
    public final void main_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1629:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1629:4: ^( INSTRUCTIONS ( main_instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1865); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1629:19: ( main_instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1629:19: main_instruction
            	    {
            	    pushFollow(FOLLOW_main_instruction_in_main_block1867);
            	    main_instruction();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "main_block"


    // $ANTLR start "main_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1632:1: main_instruction : ( main_declaration | main_assignment );
    public final void main_instruction() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1633:2: ( main_declaration | main_assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1633:4: main_declaration
                    {
                    pushFollow(FOLLOW_main_declaration_in_main_instruction1880);
                    main_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1634:4: main_assignment
                    {
                    pushFollow(FOLLOW_main_assignment_in_main_instruction1885);
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
        return ;
    }
    // $ANTLR end "main_instruction"


    // $ANTLR start "main_declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1637:1: main_declaration : ^( DECLARATION ID ids ) ;
    public final void main_declaration() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1638:2: ( ^( DECLARATION ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1638:4: ^( DECLARATION ID ids )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_main_declaration1897); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_declaration1899); 
            pushFollow(FOLLOW_ids_in_main_declaration1901);
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
        return ;
    }
    // $ANTLR end "main_declaration"


    // $ANTLR start "main_assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1641:1: main_assignment : ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) ) ;
    public final void main_assignment() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1642:2: ( ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1642:4: ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) )
            {
            match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1915); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1642:19: ( ^( DECLARATION ( ID )? ids ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==DECLARATION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1642:21: ^( DECLARATION ( ID )? ids )
                    {
                    match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1920); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1642:35: ( ID )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ID) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1642:35: ID
                            {
                            match(input,ID,FOLLOW_ID_in_main_assignment1922); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ids_in_main_assignment1925);
                    ids();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1932); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_assignment1934); 
            pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1936);
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
        return ;
    }
    // $ANTLR end "main_assignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_RECONFIGS_in_reclang62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reclang65 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000180L});
    public static final BitSet FOLLOW_element_in_reclang77 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000100L});
    public static final BitSet FOLLOW_directive_import_in_directive_def112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECONFIGURATION_in_element159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_element184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_def_in_element186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def265 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def300 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def302 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype355 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids412 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block449 = new BitSet(new long[]{0x0000001000000008L,0x000000000000E000L});
    public static final BitSet FOLLOW_declaration_in_instruction486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply539 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply547 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration576 = new BitSet(new long[]{0x2000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_var_def_in_declaration579 = new BitSet(new long[]{0x2000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_var_def611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment647 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment649 = new BitSet(new long[]{0x200000F000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment655 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call756 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call762 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call793 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call817 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call869 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args926 = new BitSet(new long[]{0x200000E000C00002L,0x00000000009F0000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction965 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction969 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression1023 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1027 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1031 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1049 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1053 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression1067 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression1071 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression1075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1176 = new BitSet(new long[]{0x20000001BF000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1339 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1473 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1484 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1533 = new BitSet(new long[]{0x200000E000C00008L,0x00000000009F0000L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1567 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1571 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1580 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NODE_in_node_cons1622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1625 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons1660 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons1664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1668 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_xor_cons1680 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons1694 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1698 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1708 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1739 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1741 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1756 = new BitSet(new long[]{0x20000000003F0002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1781 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_args_in_main_def1797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_main_block_in_main_def1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTS_in_main_args1812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_arg_in_main_args1814 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_main_arg1828 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_arg1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_arg1832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDS_in_ids1846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ids1848 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1865 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_instruction_in_main_block1867 = new BitSet(new long[]{0x0000000000000008L,0x0000000002002000L});
    public static final BitSet FOLLOW_main_declaration_in_main_instruction1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_assignment_in_main_instruction1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARATION_in_main_declaration1897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_declaration1899 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_declaration1901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_main_assignment1915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECLARATION_in_main_assignment1920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1922 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_assignment1925 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1934 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1936 = new BitSet(new long[]{0x0000000000000008L});

}