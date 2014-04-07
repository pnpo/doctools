// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g 2014-04-07 22:52:04

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.SimpleError;
	import pt.uminho.di.reolang.parsing.util.*;
	//import java.util.*;
	import java.util.HashMap;
	import java.util.Collections;
	import java.util.Comparator;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RecSA extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_XOR", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_ENDS", "OP_NODES", "OP_NAMES", "OP_CHANNELS", "OP_READ", "OP_WRITE", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", "CONS_SET", "CONS_NODE", "CONS_XOR", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "ARGUMENTS", "ARGUMENT", "SUBTYPE", "INSTRUCTIONS", "DECLARATION", "ASSIGNMENT", "FORALL", "TRIPLE", "PAIR", "SET", "NODE", "IDS", "STOCHASTIC", "XOR", "IN", "OUT", "ACCESS", "STRUCTURE", "APPLICATION", "SIGNATURE"
    };
    public static final int OP_NODES=30;
    public static final int CONS_PAIR=55;
    public static final int SEP_OPTIONAL=47;
    public static final int CONS_NODE=58;
    public static final int APPLICATION=90;
    public static final int SEP_SUBTYPE_END=52;
    public static final int SEP_COLON=44;
    public static final int OP_TRD=25;
    public static final int OCTAL_ESC=68;
    public static final int OP_JOIN=16;
    public static final int DT_PAIR=13;
    public static final int IDS=83;
    public static final int ID=60;
    public static final int OP_INTERSECTION=37;
    public static final int SUBTYPE=74;
    public static final int EOF=-1;
    public static final int DECLARATION=76;
    public static final int DT_NODE=10;
    public static final int STRUCTURE=89;
    public static final int DT_SET=12;
    public static final int OP_ID=20;
    public static final int INSTRUCTIONS=75;
    public static final int IMPORT=70;
    public static final int ESC_SEQ=64;
    public static final int SEP_ACCESSOR=53;
    public static final int IN=86;
    public static final int OP_MINUS=38;
    public static final int RECONFIGS=69;
    public static final int DT_XOR=11;
    public static final int RW_FORALL=5;
    public static final int ARGUMENT=73;
    public static final int SEP_LIST_START=49;
    public static final int RW_RECONFIGURATION=4;
    public static final int ACCESS=88;
    public static final int SEP_ARGS_END=46;
    public static final int OP_FST=23;
    public static final int PAIR=80;
    public static final int STOCHASTIC=84;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=29;
    public static final int OP_APPLY=35;
    public static final int TRIPLE=79;
    public static final int COMMENT=62;
    public static final int OP_PATH=21;
    public static final int OP_SND=24;
    public static final int SEP_LIST_END=50;
    public static final int OP_OUT=27;
    public static final int OP_SPLIT=17;
    public static final int SEP_STRUCTURE=54;
    public static final int CONS_SET=57;
    public static final int XOR=85;
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
    public static final int SIGNATURE=91;
    public static final int OP_IN=26;
    public static final int OP_WRITE=34;
    public static final int CONS_XOR=59;
    public static final int OP_READ=33;
    public static final int RECONFIGURATION=71;
    public static final int WS=63;
    public static final int OP_CHANNELS=32;
    public static final int OUT=87;
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


    protected static class reclang_scope {
        TinySymbolsTable ids_table;
        int scope_id;
        int parent_id;
        int id;
        HashMap<Integer,Integer> scope_rel;
    }
    protected Stack reclang_stack = new Stack();


    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:39:1: reclang[TinySymbolsTable global_table] returns [ArrayList<SimpleError> errors] : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final ArrayList<SimpleError> reclang(TinySymbolsTable global_table) throws RecognitionException {
        reclang_stack.push(new reclang_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> directive_def1 = null;

        ArrayList<SimpleError> element2 = null;



        	((reclang_scope)reclang_stack.peek()).ids_table = global_table;
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	((reclang_scope)reclang_stack.peek()).parent_id = 0;
        	((reclang_scope)reclang_stack.peek()).scope_rel = new HashMap<Integer,Integer>();
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:54:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:54:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang62); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:54:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:54:17: directive_def
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

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:59:5: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||LA2_0==APPLICATION) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:59:6: element
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

            		System.out.println(((reclang_scope)reclang_stack.peek()).scope_rel);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:88:1: directive_def returns [ArrayList<SimpleError> errors] : directive_import ;
    public final ArrayList<SimpleError> directive_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> directive_import3 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:89:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:89:4: directive_import
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:96:1: directive_import returns [ArrayList<SimpleError> errors] : ^( IMPORT STRING ) ;
    public final ArrayList<SimpleError> directive_import() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:97:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:97:4: ^( IMPORT STRING )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:108:1: element returns [ArrayList<SimpleError> errors] : ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) );
    public final ArrayList<SimpleError> element() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_def4 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:109:2: ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:109:4: ^( RECONFIGURATION reconfiguration_def )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:114:4: ^( APPLICATION applicaiton_def )
                    {
                    match(input,APPLICATION,FOLLOW_APPLICATION_in_element174); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_applicaiton_def_in_element176);
                    applicaiton_def();

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:119:1: reconfiguration_def returns [ArrayList<SimpleError> errors] : ^( ID ( args_def )? reconfiguration_block ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:131:2: ( ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:131:4: ^( ID ( args_def )? reconfiguration_block )
            {
            ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def202); 

            		
            		TinySymbol ts = ((reclang_scope)reclang_stack.peek()).ids_table.getSymbols().get((ID5!=null?ID5.getText():null));
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name = ts;
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes = (ArrayList<TinySymbolsTable>) ts.getScopes();
            		
            		if (((reclang_scope)reclang_stack.peek()).ids_table.containsSymbol((ID5!=null?ID5.getText():null))){
            			if ( !((ID5!=null?ID5.getLine():0) == ts.getLine() && (ID5!=null?ID5.getCharPositionInLine():0) == ts.getPosition()) ){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID5!=null?ID5.getText():null), ts.getLine(), ts.getPosition()), (ID5!=null?ID5.getLine():0), (ID5!=null?ID5.getCharPositionInLine():0)) );
            			}
            		}
            	

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:143:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:143:3: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def210);
                    args_def6=args_def();

                    state._fsp--;


                    		local_errors.addAll(args_def6);
                    	

                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def219);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:158:1: args_def returns [ArrayList<SimpleError> errors] : ^( ARGUMENTS ( arg_def )+ ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:172:2: ( ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:172:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def253); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:172:16: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:172:17: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def256);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:184:1: arg_def returns [ArrayList<SimpleError> errors] : ^( ARGUMENT datatype list_ids ) ;
    public final ArrayList<SimpleError> arg_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> list_ids9 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:189:2: ( ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:189:4: ^( ARGUMENT datatype list_ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def291); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def293);
            datatype();

            state._fsp--;

            pushFollow(FOLLOW_list_ids_in_arg_def295);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:200:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final void datatype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:201:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:201:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype318); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:202:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype323); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:203:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype328); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:204:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype333); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:205:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype338); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:206:5: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype346);
                    other_type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype348);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:209:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final void other_type() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:210:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:215:1: subtype : datatype ;
    public final void subtype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:216:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:216:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype383);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:219:1: list_ids returns [ArrayList<SimpleError> errors] : ( ID )+ ;
    public final ArrayList<SimpleError> list_ids() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID10=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:224:2: ( ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:224:4: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:224:4: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:224:5: ID
            	    {
            	    ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids403); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:242:1: reconfiguration_block returns [ArrayList<SimpleError> errors] : ^( INSTRUCTIONS ( instruction )+ ) ;
    public final ArrayList<SimpleError> reconfiguration_block() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> instruction11 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:247:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:247:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block437); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:247:19: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:247:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block440);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:259:1: instruction returns [ArrayList<SimpleError> errors] : ( declaration | assignment[false] | reconfiguration_apply | for_instruction );
    public final ArrayList<SimpleError> instruction() throws RecognitionException {
        instruction_stack.push(new instruction_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> declaration12 = null;

        ArrayList<SimpleError> assignment13 = null;

        ArrayList<SimpleError> reconfiguration_apply14 = null;

        ArrayList<SimpleError> for_instruction15 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	((instruction_scope)instruction_stack.peek()).rec_type = "";
        	((instruction_scope)instruction_stack.peek()).scope = this.getScope(((reclang_scope)reclang_stack.peek()).id);

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:269:2: ( declaration | assignment[false] | reconfiguration_apply | for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:269:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction477);
                    declaration12=declaration();

                    state._fsp--;

                     
                    		local_errors.addAll(declaration12); 
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:274:4: assignment[false]
                    {
                    pushFollow(FOLLOW_assignment_in_instruction486);
                    assignment13=assignment(false);

                    state._fsp--;

                     
                    		local_errors.addAll(assignment13); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:279:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction496);
                    reconfiguration_apply14=reconfiguration_apply();

                    state._fsp--;

                     
                    		local_errors.addAll(reconfiguration_apply14); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:284:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction505);
                    for_instruction15=for_instruction();

                    state._fsp--;


                    		local_errors.addAll(for_instruction15);
                    		errors = local_errors;
                    		((reclang_scope)reclang_stack.peek()).parent_id--;
                    		((reclang_scope)reclang_stack.peek()).id = ((reclang_scope)reclang_stack.peek()).scope_rel.get(((reclang_scope)reclang_stack.peek()).scope_id);
                    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:293:1: reconfiguration_apply returns [ArrayList<SimpleError> errors] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final ArrayList<SimpleError> reconfiguration_apply() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_call16 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:298:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:298:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply528); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply530);
            reconfiguration_call16=reconfiguration_call();

            state._fsp--;


            		local_errors.addAll(reconfiguration_call16);
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:303:2: ( ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:303:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply538); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:310:1: declaration returns [ArrayList<SimpleError> errors] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final ArrayList<SimpleError> declaration() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> var_def17 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:315:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:315:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration565); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration567);
            datatype();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:315:27: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:315:28: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration570);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:326:1: var_def returns [ArrayList<SimpleError> errors] : ( ID | assignment[true] );
    public final ArrayList<SimpleError> var_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID18=null;
        ArrayList<SimpleError> assignment19 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:331:2: ( ID | assignment[true] )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:331:4: ID
                    {
                    ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def602); 

                    		if (((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID18!=null?ID18.getText():null))){
                    			TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID18!=null?ID18.getText():null));
                    			if ( !((ID18!=null?ID18.getLine():0) == ts.getLine() && (ID18!=null?ID18.getCharPositionInLine():0) == ts.getPosition()) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID18!=null?ID18.getText():null), ts.getLine(), ts.getPosition()), (ID18!=null?ID18.getLine():0), (ID18!=null?ID18.getCharPositionInLine():0)) );
                    			}
                    		}
                    		else {
                    			Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    			TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID18!=null?ID18.getText():null), s_id);
                    			
                    			if ( ts != null ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID18!=null?ID18.getText():null), ts.getLine(), ts.getPosition()), (ID18!=null?ID18.getLine():0), (ID18!=null?ID18.getCharPositionInLine():0)) );
                    			}
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:350:4: assignment[true]
                    {
                    pushFollow(FOLLOW_assignment_in_var_def612);
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

    protected static class assignment_scope {
        TinySymbol ts;
    }
    protected Stack assignment_stack = new Stack();


    // $ANTLR start "assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:357:1: assignment[boolean isDeclaration] returns [ArrayList<SimpleError> errors] : ^( ASSIGNMENT ID assignment_member[$ID.line, $ID.pos] ) ;
    public final ArrayList<SimpleError> assignment(boolean isDeclaration) throws RecognitionException {
        assignment_stack.push(new assignment_scope());
        ArrayList<SimpleError> errors = null;

        CommonTree ID20=null;
        ArrayList<SimpleError> assignment_member21 = null;



        	((assignment_scope)assignment_stack.peek()).ts = new TinySymbol();
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:366:2: ( ^( ASSIGNMENT ID assignment_member[$ID.line, $ID.pos] ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:366:4: ^( ASSIGNMENT ID assignment_member[$ID.line, $ID.pos] )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment641); 

            match(input, Token.DOWN, null); 
            ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment643); 
            	
            		if (isDeclaration) {
            			if (((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null))){
            				TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID20!=null?ID20.getText():null));
            				if ( !((ID20!=null?ID20.getLine():0) == ts.getLine() && (ID20!=null?ID20.getCharPositionInLine():0) == ts.getPosition()) ){
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID20!=null?ID20.getText():null), ts.getLine(), ts.getPosition()), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            				}
            			}
            			else {
            				Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            				TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);
            				
            				if ( ts != null){
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID20!=null?ID20.getText():null), ts.getLine(), ts.getPosition()), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            				}
            			}
            		}
            		else{
            			Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            			TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);
            			if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null)) && ts == null){
            				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID20!=null?ID20.getText():null)), (ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0)) );
            			}
            		}
            		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            		((assignment_scope)assignment_stack.peek()).ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID20!=null?ID20.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID20!=null?ID20.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID20!=null?ID20.getText():null), s_id);
            	
            pushFollow(FOLLOW_assignment_member_in_assignment649);
            assignment_member21=assignment_member((ID20!=null?ID20.getLine():0), (ID20!=null?ID20.getCharPositionInLine():0));

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
            assignment_stack.pop();
        }
        return errors;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "assignment_member"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:401:1: assignment_member[int id_line, int id_pos] returns [ArrayList<SimpleError> errors] : ( expression | reconfiguration_apply );
    public final ArrayList<SimpleError> assignment_member(int id_line, int id_pos) throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        RecSA.expression_return expression22 = null;

        ArrayList<SimpleError> reconfiguration_apply23 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:405:2: ( expression | reconfiguration_apply )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=OP_PATH && LA13_0<=OP_UPDATE)||(LA13_0>=OP_UNION && LA13_0<=OP_MINUS)||LA13_0==ID||(LA13_0>=TRIPLE && LA13_0<=NODE)||LA13_0==XOR||LA13_0==ACCESS) ) {
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:405:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member676);
                    expression22=expression();

                    state._fsp--;

                     
                    		//System.out.println((expression22!=null?expression22.errors:null));
                    		if ((expression22!=null?expression22.errors:null) != null){
                    			local_errors.addAll((expression22!=null?expression22.errors:null));
                    		}
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:413:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member685);
                    reconfiguration_apply23=reconfiguration_apply();

                    state._fsp--;

                     
                    		
                    		if (!((assignment_scope)assignment_stack.peek()).ts.getDataType().equals(Type.PATTERN)){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((assignment_scope)assignment_stack.peek()).ts.getId(), "Pattern") , id_line, id_pos) );
                    		}	
                    		else{
                    			local_errors.addAll(reconfiguration_apply23); 
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:426:1: reconfiguration_call returns [ArrayList<SimpleError> errors] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:436:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:436:4: ^( OP_JOIN operation_args )
                    {
                    OP_JOIN25=(CommonTree)match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call712); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "join"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call718);
                        operation_args24=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args24!=null?((CommonTree)operation_args24.start):null) != null){
                    			local_errors.addAll((operation_args24!=null?operation_args24.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_JOIN25!=null?OP_JOIN25.getText():null)) , (OP_JOIN25!=null?OP_JOIN25.getLine():0)) ); //$ID.pos
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:448:4: ^( OP_SPLIT operation_args )
                    {
                    OP_SPLIT27=(CommonTree)match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call731); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "split"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call737);
                        operation_args26=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args26!=null?((CommonTree)operation_args26.start):null) != null){
                    			local_errors.addAll((operation_args26!=null?operation_args26.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_SPLIT27!=null?OP_SPLIT27.getText():null)) , (OP_SPLIT27!=null?OP_SPLIT27.getLine():0)) ); //$ID.pos
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:460:4: ^( OP_PAR operation_args )
                    {
                    OP_PAR29=(CommonTree)match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call750); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "par"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call756);
                        operation_args28=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args28!=null?((CommonTree)operation_args28.start):null) != null){
                    			local_errors.addAll((operation_args28!=null?operation_args28.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_PAR29!=null?OP_PAR29.getText():null)) , (OP_PAR29!=null?OP_PAR29.getLine():0)) ); //$ID.pos
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:472:4: ^( OP_REMOVE operation_args )
                    {
                    OP_REMOVE31=(CommonTree)match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call768); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "remove"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call774);
                        operation_args30=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args30!=null?((CommonTree)operation_args30.start):null) != null){
                    			local_errors.addAll((operation_args30!=null?operation_args30.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_REMOVE31!=null?OP_REMOVE31.getText():null)) , (OP_REMOVE31!=null?OP_REMOVE31.getLine():0)) ); //$ID.pos
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:484:4: ^( OP_CONST operation_args )
                    {
                    OP_CONST33=(CommonTree)match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call787); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "const"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call793);
                        operation_args32=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     
                    		if((operation_args32!=null?((CommonTree)operation_args32.start):null) != null){
                    			local_errors.addAll((operation_args32!=null?operation_args32.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((OP_CONST33!=null?OP_CONST33.getText():null)) , (OP_CONST33!=null?OP_CONST33.getLine():0)) ); //$ID.pos
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:496:4: ^( OP_ID operation_args )
                    {
                    OP_ID35=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call805); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "id"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call811);
                        operation_args34=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		if((operation_args34!=null?((CommonTree)operation_args34.start):null) != null){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((instruction_scope)instruction_stack.peek()).rec_type) , (OP_ID35!=null?OP_ID35.getLine():0)) ); //(OP_ID35!=null?OP_ID35.getCharPositionInLine():0)
                    			//local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidArgument((operation_args34!=null?((CommonTree)operation_args34.start):null).toString()) , (OP_ID35!=null?OP_ID35.getLine():0), (OP_ID35!=null?OP_ID35.getCharPositionInLine():0)+4) );			
                    			
                    			////is not necessary since 'id' has no arguments
                    			//local_errors.addAll((operation_args34!=null?operation_args34.errors:null));
                    		}
                    		
                    		
                    		errors = local_errors;
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:511:4: ^( ID operation_args )
                    {
                    ID36=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_call825); 

                     
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
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call834);
                        operation_args37=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                    	
                    		if((operation_args37!=null?((CommonTree)operation_args37.start):null) != null){
                    			local_errors.addAll((operation_args37!=null?operation_args37.errors:null));
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments((ID36!=null?ID36.getText():null)) , (ID36!=null?ID36.getLine():0)) ); //(ID36!=null?ID36.getCharPositionInLine():0)
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:563:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final void structure_operation_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:564:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:564:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call854); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call856);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:565:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call863); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call865);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:569:1: operation_args returns [ArrayList<SimpleError> errors] : ( args )? ;
    public final RecSA.operation_args_return operation_args() throws RecognitionException {
        RecSA.operation_args_return retval = new RecSA.operation_args_return();
        retval.start = input.LT(1);

        RecSA.args_return args38 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:573:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:573:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:573:4: ( args )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=OP_PATH && LA16_0<=OP_UPDATE)||(LA16_0>=OP_UNION && LA16_0<=OP_MINUS)||LA16_0==ID||(LA16_0>=TRIPLE && LA16_0<=NODE)||LA16_0==XOR||LA16_0==ACCESS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:573:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args888);
                    args38=args();

                    state._fsp--;


                    		//reconfiguration of type "custom" can have more than one argument; id primitive tested before (do not even have one argument)
                    		if ((args38!=null?args38.counter:0) > 1 && !((instruction_scope)instruction_stack.peek()).rec_type.equals("custom") && !((instruction_scope)instruction_stack.peek()).rec_type.equals("id")){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((instruction_scope)instruction_stack.peek()).rec_type) , (args38!=null?((CommonTree)args38.start):null).getLine()) );
                    		}
                    		//if the number of arguments are correct, check their type (possible errors)
                    		else {
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("custom") && (args38!=null?args38.counter:0) < ((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.size()){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name) , (args38!=null?((CommonTree)args38.start):null).getLine()) );
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:595:1: args returns [ArrayList<SimpleError> errors, int counter] : ( expression )+ ;
    public final RecSA.args_return args() throws RecognitionException {
        RecSA.args_return retval = new RecSA.args_return();
        retval.start = input.LT(1);

        RecSA.expression_return expression39 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	ArrayList<SimpleError> global_errors = new ArrayList<SimpleError>();
        	int i = 0;
        	boolean exceeded = false;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:602:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:602:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:602:4: ( expression )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=NODE)||LA17_0==XOR||LA17_0==ACCESS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:602:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args920);
            	    expression39=expression();

            	    state._fsp--;


            	    		if (((instruction_scope)instruction_stack.peek()).rec_type.equals("custom")){
            	    			if (((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.size() > i){
            	    				//original argument
            	    				TinySymbol ts1 = ((reconfiguration_call_scope)reconfiguration_call_stack.peek()).args.get(i);

            	    //			if (ts1 != null){				
            	    				String value = (expression39!=null?expression39.value:null);
            	    				Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            	    				//if contains symbol, value of new argument is obtained from ((instruction_scope)instruction_stack.peek()).scope, else from ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name
            	    				TinySymbol ts2 = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol(value) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get(value) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue(value, s_id);
            	    				if ( ts2 != null && !ts2.getDataType().equals(ts1.getDataType()) ){
            	    					String datatype = ts1.dataTypeToString();
            	    					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(value, datatype) , (expression39!=null?((CommonTree)expression39.start):null).getLine()) );
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
            			global_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments(((reconfiguration_call_scope)reconfiguration_call_stack.peek()).name) , (expression39!=null?((CommonTree)expression39.start):null).getLine()) );
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:642:1: for_instruction returns [ArrayList<SimpleError> errors] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
    public final ArrayList<SimpleError> for_instruction() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree id1=null;
        CommonTree id2=null;
        ArrayList<SimpleError> reconfiguration_block40 = null;



        	((reclang_scope)reclang_stack.peek()).scope_id++;
        	((reclang_scope)reclang_stack.peek()).id = ((reclang_scope)reclang_stack.peek()).scope_id;
        	((reclang_scope)reclang_stack.peek()).scope_rel.put(((reclang_scope)reclang_stack.peek()).scope_id, ((reclang_scope)reclang_stack.peek()).parent_id);
        	((reclang_scope)reclang_stack.peek()).parent_id++;
        	
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:651:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:651:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction957); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction959);
            datatype();

            state._fsp--;

            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction963); 

            		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            		if ( ts != null ){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((id1!=null?id1.getText():null), ts.getLine(), ts.getPosition()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            		}
            	
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction973); 

            		ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);
            		if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id2!=null?id2.getText():null)) && ts == null){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id2!=null?id2.getText():null)), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0)) );
            		}
            		else{
            			if (local_errors.isEmpty()){
            				((instruction_scope)instruction_stack.peek()).scope = this.getScope(((reclang_scope)reclang_stack.peek()).id);

            				TinySymbol ts1 = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            				TinySymbol ts2 = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id2!=null?id2.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id2!=null?id2.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id2!=null?id2.getText():null), s_id);				

            				if (!ts2.getDataType().get(0).equals(Type.SET)){
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id2!=null?id2.getText():null), "Set<T>"), (id2!=null?id2.getLine():0), (id2!=null?id2.getCharPositionInLine():0)) );
            				}
            				else{
            					if (ts1 != null){
            						ts2.getDataType().remove(0);
            						List<Type> datatype = ts2.getDataType();
            						if (!ts1.getDataType().equals(datatype)){
            							local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), ts2.dataTypeToString()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            						}
            					}
            				}
            			}
            		}
            	
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction982);
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
        public String value;
    };

    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:702:1: expression returns [ArrayList<SimpleError> errors, String value] : ( ^( OP_UNION e1= expression e2= expression ) | ^( OP_INTERSECTION e1= expression e2= expression ) | ^( OP_MINUS e1= expression e2= expression ) | factor );
    public final RecSA.expression_return expression() throws RecognitionException {
        RecSA.expression_return retval = new RecSA.expression_return();
        retval.start = input.LT(1);

        RecSA.expression_return e1 = null;

        RecSA.expression_return e2 = null;

        RecSA.factor_return factor41 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:706:2: ( ^( OP_UNION e1= expression e2= expression ) | ^( OP_INTERSECTION e1= expression e2= expression ) | ^( OP_MINUS e1= expression e2= expression ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:706:4: ^( OP_UNION e1= expression e2= expression )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression1016); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1020);
                    e1=expression();

                    state._fsp--;

                     local_errors.addAll((e1!=null?e1.errors:null));
                    pushFollow(FOLLOW_expression_in_expression1026);
                    e2=expression();

                    state._fsp--;


                    		if ((e2!=null?e2.errors:null) != null){
                    			local_errors.addAll((e2!=null?e2.errors:null));
                    		}
                    		retval.errors = local_errors; 
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:715:4: ^( OP_INTERSECTION e1= expression e2= expression )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression1040); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1044);
                    e1=expression();

                    state._fsp--;

                     local_errors.addAll((e1!=null?e1.errors:null));
                    pushFollow(FOLLOW_expression_in_expression1050);
                    e2=expression();

                    state._fsp--;


                    		if ((e2!=null?e2.errors:null) != null){
                    			local_errors.addAll((e2!=null?e2.errors:null));
                    		}
                    		retval.errors = local_errors; 
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:724:4: ^( OP_MINUS e1= expression e2= expression )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression1064); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1068);
                    e1=expression();

                    state._fsp--;

                     local_errors.addAll((e1!=null?e1.errors:null));
                    pushFollow(FOLLOW_expression_in_expression1074);
                    e2=expression();

                    state._fsp--;


                    		if ((e2!=null?e2.errors:null) != null){
                    			local_errors.addAll((e2!=null?e2.errors:null));
                    		}
                    		retval.errors = local_errors; 
                    	

                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:733:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression1087);
                    factor41=factor();

                    state._fsp--;

                     
                    		retval.errors = (factor41!=null?factor41.errors:null); 
                    		retval.value = (factor41!=null?factor41.value:null); 
                    	

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
        public String value;
    };

    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:741:1: factor returns [ArrayList<SimpleError> errors, String value] : ( ^( ID ID ) | ID | operation | constructor );
    public final RecSA.factor_return factor() throws RecognitionException {
        RecSA.factor_return retval = new RecSA.factor_return();
        retval.start = input.LT(1);

        CommonTree ID42=null;
        ArrayList<SimpleError> operation43 = null;

        ArrayList<SimpleError> constructor44 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:745:2: ( ^( ID ID ) | ID | operation | constructor )
            int alt19=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    alt19=1;
                }
                else if ( (LA19_1==UP||(LA19_1>=OP_PATH && LA19_1<=OP_UPDATE)||(LA19_1>=OP_UNION && LA19_1<=OP_MINUS)||LA19_1==ID||(LA19_1>=TRIPLE && LA19_1<=NODE)||LA19_1==XOR||LA19_1==ACCESS) ) {
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:745:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1111); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1113); 

                    match(input, Token.UP, null); 
                     retval.errors = local_errors; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:746:4: ID
                    {
                    ID42=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1121); 

                    		retval.value = (ID42!=null?ID42.getText():null);
                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID42!=null?ID42.getText():null), s_id);
                    		if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID42!=null?ID42.getText():null)) && ts == null){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID42!=null?ID42.getText():null)), (ID42!=null?ID42.getLine():0), (ID42!=null?ID42.getCharPositionInLine():0)) );
                    		}
                    		else{
                    			//System.out.println((ID42!=null?ID42.getText():null));
                    			TinySymbol symbol = ts != null ? ts : ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID42!=null?ID42.getText():null));
                    			//System.out.println(ts);
                    			List<Type> dt = new ArrayList<Type>();
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
                    		}
                    		retval.errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:789:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1129);
                    operation43=operation();

                    state._fsp--;

                     retval.errors = operation43; 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:790:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1136);
                    constructor44=constructor();

                    state._fsp--;

                     retval.errors = constructor44; 

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


    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:793:1: operation returns [ArrayList<SimpleError> errors] : ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[datatype] ) | structure_operation_call );
    public final ArrayList<SimpleError> operation() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree id1=null;
        CommonTree id2=null;
        RecSA.attribute_call_return attribute_call45 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:798:2: ( ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[datatype] ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:798:4: ^( ACCESS id1= ID ( ^( STRUCTURE id2= ID ) )? attribute_call[datatype] )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1158); 

                    match(input, Token.DOWN, null); 
                    id1=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1162); 

                    		List<Type> datatype = new ArrayList<Type>();
                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    		//if contains symbol, tiny symbol is obtained from ((instruction_scope)instruction_stack.peek()).scope, else from ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name
                    		TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
                    //		System.out.println(ts);
                    		if (ts != null){
                    			datatype = ts.getDataType();
                    		}
                    		else{
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                    		}
                    	
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:812:2: ( ^( STRUCTURE id2= ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==STRUCTURE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:812:3: ^( STRUCTURE id2= ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1170); 

                            match(input, Token.DOWN, null); 
                            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_operation1174); 

                            		//if contains symbol, tiny symbol is obtained from ((instruction_scope)instruction_stack.peek()).scope, else from ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name
                            		ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((id1!=null?id1.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((id1!=null?id1.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
                            //		System.out.println(ts);
                            		if (ts != null){
                            			datatype = ts.getDataType();
                            		}
                            		else{
                            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((id1!=null?id1.getText():null)), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                            		}
                            	

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1184);
                    attribute_call45=attribute_call(datatype);

                    state._fsp--;


                    match(input, Token.UP, null); 

                    	 	if (ts != null){
                    			Type t = datatype.get(0);
                    	 		if( ((attribute_call45!=null?attribute_call45.op:null).equals("in") || (attribute_call45!=null?attribute_call45.op:null).equals("out")) && !(t.equals(Type.PATTERN) || t.equals(Type.CHANNEL)) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), "Pattern' or 'Channel"), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                    			}
                    			if( ((attribute_call45!=null?attribute_call45.op:null).equals("name") || (attribute_call45!=null?attribute_call45.op:null).equals("ends")) && !t.equals(Type.CHANNEL) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), "Channel"), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                    			}
                    			if( ((attribute_call45!=null?attribute_call45.op:null).equals("nodes") || (attribute_call45!=null?attribute_call45.op:null).equals("names")) && !t.equals(Type.PATTERN) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), "Pattern"), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                    			}
                    			if( ((attribute_call45!=null?attribute_call45.op:null).equals("fst") || (attribute_call45!=null?attribute_call45.op:null).equals("snd")) && !(t.equals(Type.PAIR) || t.equals(Type.TRIPLE)) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), "Pair' or 'Triple"), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                    			}
                    			if( (attribute_call45!=null?attribute_call45.op:null).equals("trd") && !t.equals(Type.TRIPLE) ) {
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((id1!=null?id1.getText():null), "Triple"), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
                    			}
                    		}
                    		
                    		if((attribute_call45!=null?attribute_call45.errors:null) != null){
                    			local_errors.addAll((attribute_call45!=null?attribute_call45.errors:null));
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:852:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1198);
                    structure_operation_call();

                    state._fsp--;

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
    // $ANTLR end "operation"


    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:855:1: constructor returns [ArrayList<SimpleError> errors] : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final ArrayList<SimpleError> constructor() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> triple_cons46 = null;

        ArrayList<SimpleError> pair_cons47 = null;

        ArrayList<SimpleError> set_cons48 = null;

        ArrayList<SimpleError> node_cons49 = null;

        ArrayList<SimpleError> xor_cons50 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:856:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:856:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1216);
                    triple_cons46=triple_cons();

                    state._fsp--;

                     errors = triple_cons46; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:857:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1223);
                    pair_cons47=pair_cons();

                    state._fsp--;

                     errors = pair_cons47; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:858:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1230);
                    set_cons48=set_cons();

                    state._fsp--;

                     errors = set_cons48; 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:859:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1237);
                    node_cons49=node_cons();

                    state._fsp--;

                     errors = node_cons49; 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:860:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor1244);
                    xor_cons50=xor_cons();

                    state._fsp--;

                     errors = xor_cons50; 

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
    // $ANTLR end "constructor"

    public static class attribute_call_return extends TreeRuleReturnScope {
        public ArrayList<SimpleError> errors;
        public String op;
    };

    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:869:1: attribute_call[List<Type> datatype] returns [ArrayList<SimpleError> errors, String op] : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | OP_READ | OP_WRITE | ID );
    public final RecSA.attribute_call_return attribute_call(List<Type> datatype) throws RecognitionException {
        RecSA.attribute_call_return retval = new RecSA.attribute_call_return();
        retval.start = input.LT(1);

        CommonTree INT51=null;
        CommonTree OP_IN52=null;
        CommonTree INT53=null;
        CommonTree OP_OUT54=null;
        CommonTree ID55=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:874:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | OP_READ | OP_WRITE | ID )
            int alt25=12;
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
            case OP_ENDS:
                {
                alt25=6;
                }
                break;
            case OP_FST:
                {
                alt25=7;
                }
                break;
            case OP_SND:
                {
                alt25=8;
                }
                break;
            case OP_TRD:
                {
                alt25=9;
                }
                break;
            case OP_READ:
                {
                alt25=10;
                }
                break;
            case OP_WRITE:
                {
                alt25=11;
                }
                break;
            case ID:
                {
                alt25=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:874:4: ^( OP_IN ( INT )? )
                    {
                    OP_IN52=(CommonTree)match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1274); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:874:12: ( INT )?
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==INT) ) {
                            alt23=1;
                        }
                        switch (alt23) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:874:13: INT
                                {
                                INT51=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1277); 

                                		List<Type> dt = new ArrayList<Type>();
                                		dt.add(Type.CHANNEL);
                                		if ( Integer.parseInt((INT51!=null?INT51.getText():null)) > 1 && datatype.containsAll(dt) ){
                                			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments("attribute", (OP_IN52!=null?OP_IN52.getText():null)) , (INT51!=null?INT51.getLine():0), (INT51!=null?INT51.getCharPositionInLine():0)) );
                                		}
                                	

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		retval.op = "in";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:888:4: ^( OP_OUT ( INT )? )
                    {
                    OP_OUT54=(CommonTree)match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1298); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:888:13: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:888:14: INT
                                {
                                INT53=(CommonTree)match(input,INT,FOLLOW_INT_in_attribute_call1301); 

                                		List<Type> dt = new ArrayList<Type>();
                                		dt.add(Type.CHANNEL);
                                		if ( Integer.parseInt((INT53!=null?INT53.getText():null)) > 1 && datatype.containsAll(dt) ){
                                			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.numberOfArguments("attribute", (OP_OUT54!=null?OP_OUT54.getText():null)) , (INT53!=null?INT53.getLine():0), (INT53!=null?INT53.getCharPositionInLine():0)) );
                                		}
                                	

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    		retval.op = "out";
                    		retval.errors = local_errors;
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:902:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1320); 
                    retval.op = "name";

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:903:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1328); 
                    retval.op = "nodes";

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:904:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1336); 
                    retval.op = "names";

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:905:4: ^( OP_ENDS expression )
                    {
                    match(input,OP_ENDS,FOLLOW_OP_ENDS_in_attribute_call1345); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_attribute_call1347);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    retval.op = "ends";

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:906:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1355); 
                    retval.op = "fst";

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:907:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1363); 
                    retval.op = "snd";

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:908:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1371); 
                    retval.op = "trd";

                    }
                    break;
                case 10 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:909:4: OP_READ
                    {
                    match(input,OP_READ,FOLLOW_OP_READ_in_attribute_call1379); 
                    retval.op = "read";

                    }
                    break;
                case 11 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:910:4: OP_WRITE
                    {
                    match(input,OP_WRITE,FOLLOW_OP_WRITE_in_attribute_call1387); 
                    retval.op = "write";

                    }
                    break;
                case 12 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:911:4: ID
                    {
                    ID55=(CommonTree)match(input,ID,FOLLOW_ID_in_attribute_call1395); 
                    retval.op = (ID55!=null?ID55.getText():null);

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


    // $ANTLR start "triple_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:915:1: triple_cons returns [ArrayList<SimpleError> errors] : ^( TRIPLE expression expression expression ) ;
    public final ArrayList<SimpleError> triple_cons() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:916:2: ( ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:916:4: ^( TRIPLE expression expression expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1417); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1419);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1421);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1423);
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
        return errors;
    }
    // $ANTLR end "triple_cons"


    // $ANTLR start "pair_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:920:1: pair_cons returns [ArrayList<SimpleError> errors] : ^( PAIR expression expression ) ;
    public final ArrayList<SimpleError> pair_cons() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:921:2: ( ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:921:4: ^( PAIR expression expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons1442); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1444);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons1446);
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
        return errors;
    }
    // $ANTLR end "pair_cons"


    // $ANTLR start "set_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:926:1: set_cons returns [ArrayList<SimpleError> errors] : ^( SET ( expression )* ) ;
    public final ArrayList<SimpleError> set_cons() throws RecognitionException {
        ArrayList<SimpleError> errors = null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:931:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:931:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons1471); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:931:10: ( expression )*
                loop26:
                do {
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=OP_PATH && LA26_0<=OP_UPDATE)||(LA26_0>=OP_UNION && LA26_0<=OP_MINUS)||LA26_0==ID||(LA26_0>=TRIPLE && LA26_0<=NODE)||LA26_0==XOR||LA26_0==ACCESS) ) {
                        alt26=1;
                    }


                    switch (alt26) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:931:11: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1474);
                	    expression();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop26;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

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
    // $ANTLR end "set_cons"


    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:966:1: node_cons returns [ArrayList<SimpleError> errors] : ^( NODE ^( IDS ( ID )+ ) ( ^( STOCHASTIC INT INT ) )? ) ;
    public final ArrayList<SimpleError> node_cons() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID56=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:971:2: ( ^( NODE ^( IDS ( ID )+ ) ( ^( STOCHASTIC INT INT ) )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:971:4: ^( NODE ^( IDS ( ID )+ ) ( ^( STOCHASTIC INT INT ) )? )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1515); 

            match(input, Token.DOWN, null); 
            match(input,IDS,FOLLOW_IDS_in_node_cons1518); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:971:17: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:971:18: ID
            	    {
            	    ID56=(CommonTree)match(input,ID,FOLLOW_ID_in_node_cons1521); 

            	    		List<Type> dt = new ArrayList<Type>();
            	    		dt.add(Type.NODE);	//change
            	    		
            	    		if(!((assignment_scope)assignment_stack.peek()).ts.getDataType().equals(dt)){
            	    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype(((assignment_scope)assignment_stack.peek()).ts.getId(), "Node"), (ID56!=null?ID56.getLine():0)) );
            	    		}
            	    		else{
            	    			Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            	    			TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID56!=null?ID56.getText():null)) ? ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID56!=null?ID56.getText():null)) : ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID56!=null?ID56.getText():null), s_id);
            	    			
            	    			if (ts == null){
            	    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID56!=null?ID56.getText():null)), (ID56!=null?ID56.getLine():0), (ID56!=null?ID56.getCharPositionInLine():0)) );
            	    			}
            	    			else{
            	    				if (!ts.getDataType().equals(dt)){
            	    					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID56!=null?ID56.getText():null), "Node"), (ID56!=null?ID56.getLine():0), (ID56!=null?ID56.getCharPositionInLine():0)) );
            	    				}
            	    			}
            	    		}
            	    	

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


            match(input, Token.UP, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:993:6: ( ^( STOCHASTIC INT INT ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==STOCHASTIC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:993:7: ^( STOCHASTIC INT INT )
                    {
                    match(input,STOCHASTIC,FOLLOW_STOCHASTIC_in_node_cons1533); 

                    match(input, Token.DOWN, null); 
                    match(input,INT,FOLLOW_INT_in_node_cons1535); 
                    match(input,INT,FOLLOW_INT_in_node_cons1537); 

                    match(input, Token.UP, null); 

                    }
                    break;

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
    // $ANTLR end "node_cons"


    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1002:1: xor_cons returns [ArrayList<SimpleError> errors] : ^( XOR ^( IN ( ID )+ ) ^( OUT ID ( ID )+ ) ) ;
    public final ArrayList<SimpleError> xor_cons() throws RecognitionException {
        ArrayList<SimpleError> errors = null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1007:2: ( ^( XOR ^( IN ( ID )+ ) ^( OUT ID ( ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1007:4: ^( XOR ^( IN ( ID )+ ) ^( OUT ID ( ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons1568); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons1572); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1007:16: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1007:16: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1574); 

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
            match(input,OUT,FOLLOW_OUT_in_xor_cons1579); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1581); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1007:30: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1007:30: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1583); 

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
    // $ANTLR end "xor_cons"


    // $ANTLR start "applicaiton_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1016:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final void applicaiton_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1017:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1017:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1606); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1608);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1017:29: ( trigger_def )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_BLOCK_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1017:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1610);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1020:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final void list_reconfigurations() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1021:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1021:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1021:4: ( reconfiguration_call )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1021:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1623);
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
        return ;
    }
    // $ANTLR end "list_reconfigurations"


    // $ANTLR start "trigger_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1024:1: trigger_def : trigger_block ;
    public final void trigger_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1025:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1025:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1636);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1028:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final void trigger_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1029:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:1029:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1648); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1650); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_RECONFIGS_in_reclang62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reclang65 = new BitSet(new long[]{0x0000000000000008L,0x00000000040000C0L});
    public static final BitSet FOLLOW_element_in_reclang77 = new BitSet(new long[]{0x0000000000000008L,0x0000000004000080L});
    public static final BitSet FOLLOW_directive_import_in_directive_def112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECONFIGURATION_in_element159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def256 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def293 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids403 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block437 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block440 = new BitSet(new long[]{0x0000000800000008L,0x0000000000007000L});
    public static final BitSet FOLLOW_declaration_in_instruction477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply530 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration567 = new BitSet(new long[]{0x1000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_var_def_in_declaration570 = new BitSet(new long[]{0x1000000000000008L,0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_var_def602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment643 = new BitSet(new long[]{0x1000007800600000L,0x0000000001278000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment649 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call712 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call756 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call774 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call805 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call863 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args920 = new BitSet(new long[]{0x1000007000600002L,0x0000000001278000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction959 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction963 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression1016 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1020 = new BitSet(new long[]{0x1000007000600000L,0x0000000001278000L});
    public static final BitSet FOLLOW_expression_in_expression1026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression1040 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1044 = new BitSet(new long[]{0x1000007000600000L,0x0000000001278000L});
    public static final BitSet FOLLOW_expression_in_expression1050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression1064 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1068 = new BitSet(new long[]{0x1000007000600000L,0x0000000001278000L});
    public static final BitSet FOLLOW_expression_in_expression1074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1158 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1162 = new BitSet(new long[]{0x10000006FF800000L,0x0000000002000000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ENDS_in_attribute_call1345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_attribute_call1347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_READ_in_attribute_call1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_WRITE_in_attribute_call1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1419 = new BitSet(new long[]{0x1000007000600000L,0x0000000001278000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1421 = new BitSet(new long[]{0x1000007000600000L,0x0000000001278000L});
    public static final BitSet FOLLOW_expression_in_triple_cons1423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1442 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1444 = new BitSet(new long[]{0x1000007000600000L,0x0000000001278000L});
    public static final BitSet FOLLOW_expression_in_pair_cons1446 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1471 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1474 = new BitSet(new long[]{0x1000007000600008L,0x0000000001278000L});
    public static final BitSet FOLLOW_NODE_in_node_cons1515 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDS_in_node_cons1518 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1521 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_STOCHASTIC_in_node_cons1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_node_cons1535 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_INT_in_node_cons1537 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons1568 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons1572 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1574 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons1579 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1581 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1583 = new BitSet(new long[]{0x1000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1606 = new BitSet(new long[]{0x10000000001F8000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1608 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1623 = new BitSet(new long[]{0x10000000001F8002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1648 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1650 = new BitSet(new long[]{0x0000000000000002L});

}