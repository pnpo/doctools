// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g 2014-03-28 21:51:48

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.SimpleError;
	import pt.uminho.di.reolang.parsing.util.*;
	import pt.uminho.di.reolang.parsing.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RecSA extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RW_RECONFIGURATION", "RW_FORALL", "RW_IMPORT", "DT_PATTERN", "DT_CHANNEL", "DT_NAME", "DT_NODE", "DT_SET", "DT_PAIR", "DT_TRIPLE", "OP_PAR", "OP_JOIN", "OP_SPLIT", "OP_REMOVE", "OP_CONST", "OP_ID", "OP_PATH", "OP_UPDATE", "OP_FST", "OP_SND", "OP_TRD", "OP_IN", "OP_OUT", "OP_NAME", "OP_ENDS", "OP_NODES", "OP_NAMES", "OP_CHANNELS", "OP_APPLY", "OP_UNION", "OP_INTERSECTION", "OP_MINUS", "OP_EQUAL", "SEP_BLOCK_START", "SEP_BLOCK_END", "SEP_COMMA", "SEP_SEMICOLON", "SEP_COLON", "SEP_ARGS_START", "SEP_ARGS_END", "SEP_OPTIONAL", "SEP_TRIGGER", "SEP_LIST_START", "SEP_LIST_END", "SEP_SUBTYPE_START", "SEP_SUBTYPE_END", "SEP_ACCESSOR", "SEP_STRUCTURE", "CONS_PAIR", "CONS_TRIPLE", "CONS_SET", "CONS_NODE", "ID", "INT", "COMMENT", "WS", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "RECONFIGS", "IMPORT", "RECONFIGURATION", "ARGUMENTS", "ARGUMENT", "SUBTYPE", "INSTRUCTIONS", "DECLARATION", "ASSIGNMENT", "FORALL", "TRIPLE", "PAIR", "SET", "NODE", "ACCESS", "STRUCTURE", "APPLICATION", "SIGNATURE"
    };
    public static final int OP_NODES=29;
    public static final int CONS_PAIR=52;
    public static final int SEP_OPTIONAL=44;
    public static final int CONS_NODE=55;
    public static final int APPLICATION=81;
    public static final int SEP_SUBTYPE_END=49;
    public static final int SEP_COLON=41;
    public static final int OP_TRD=24;
    public static final int OCTAL_ESC=64;
    public static final int OP_JOIN=15;
    public static final int DT_PAIR=12;
    public static final int ID=56;
    public static final int OP_INTERSECTION=34;
    public static final int SUBTYPE=70;
    public static final int EOF=-1;
    public static final int DECLARATION=72;
    public static final int DT_NODE=10;
    public static final int STRUCTURE=80;
    public static final int DT_SET=11;
    public static final int OP_ID=19;
    public static final int INSTRUCTIONS=71;
    public static final int IMPORT=66;
    public static final int ESC_SEQ=60;
    public static final int SEP_ACCESSOR=50;
    public static final int OP_MINUS=35;
    public static final int RECONFIGS=65;
    public static final int RW_FORALL=5;
    public static final int ARGUMENT=69;
    public static final int SEP_LIST_START=46;
    public static final int RW_RECONFIGURATION=4;
    public static final int ACCESS=79;
    public static final int SEP_ARGS_END=43;
    public static final int OP_FST=22;
    public static final int PAIR=76;
    public static final int RW_IMPORT=6;
    public static final int OP_ENDS=28;
    public static final int TRIPLE=75;
    public static final int OP_APPLY=32;
    public static final int COMMENT=58;
    public static final int OP_PATH=20;
    public static final int OP_SND=23;
    public static final int SEP_LIST_END=47;
    public static final int OP_OUT=26;
    public static final int OP_SPLIT=16;
    public static final int SEP_STRUCTURE=51;
    public static final int CONS_SET=54;
    public static final int OP_NAMES=30;
    public static final int ARGUMENTS=68;
    public static final int NODE=78;
    public static final int SEP_COMMA=39;
    public static final int SEP_ARGS_START=42;
    public static final int DT_TRIPLE=13;
    public static final int OP_UPDATE=21;
    public static final int SEP_BLOCK_START=37;
    public static final int UNICODE_ESC=63;
    public static final int OP_REMOVE=17;
    public static final int OP_PAR=14;
    public static final int FORALL=74;
    public static final int HEX_DIGIT=62;
    public static final int SET=77;
    public static final int INT=57;
    public static final int SIGNATURE=82;
    public static final int OP_IN=25;
    public static final int RECONFIGURATION=67;
    public static final int WS=59;
    public static final int OP_CHANNELS=31;
    public static final int CONS_TRIPLE=53;
    public static final int SEP_SUBTYPE_START=48;
    public static final int SEP_SEMICOLON=40;
    public static final int SEP_BLOCK_END=38;
    public static final int OP_CONST=18;
    public static final int DT_PATTERN=7;
    public static final int OP_EQUAL=36;
    public static final int ASSIGNMENT=73;
    public static final int OP_NAME=27;
    public static final int DT_CHANNEL=8;
    public static final int OP_UNION=33;
    public static final int SEP_TRIGGER=45;
    public static final int STRING=61;
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


    protected static class reclang_scope {
        TinySymbolsTable ids_table;
        int scope_id;
    }
    protected Stack reclang_stack = new Stack();


    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:25:1: reclang[TinySymbolsTable global_table] returns [ArrayList<SimpleError> errors] : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final ArrayList<SimpleError> reclang(TinySymbolsTable global_table) throws RecognitionException {
        reclang_stack.push(new reclang_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> directive_def1 = null;

        ArrayList<SimpleError> element2 = null;



        	((reclang_scope)reclang_stack.peek()).ids_table = global_table;
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:35:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:35:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang62); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:35:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:35:17: directive_def
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

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:40:5: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||LA2_0==APPLICATION) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:40:6: element
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:56:1: directive_def returns [ArrayList<SimpleError> errors] : directive_import ;
    public final ArrayList<SimpleError> directive_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> directive_import3 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:57:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:57:4: directive_import
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:64:1: directive_import returns [ArrayList<SimpleError> errors] : ^( IMPORT STRING ) ;
    public final ArrayList<SimpleError> directive_import() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:65:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:65:4: ^( IMPORT STRING )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:76:1: element returns [ArrayList<SimpleError> errors] : ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) );
    public final ArrayList<SimpleError> element() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_def4 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:77:2: ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:77:4: ^( RECONFIGURATION reconfiguration_def )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:82:4: ^( APPLICATION applicaiton_def )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:87:1: reconfiguration_def returns [ArrayList<SimpleError> errors] : ^( ID ( args_def )? reconfiguration_block ) ;
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:99:2: ( ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:99:4: ^( ID ( args_def )? reconfiguration_block )
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
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:111:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:111:3: args_def
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:126:1: args_def returns [ArrayList<SimpleError> errors] : ^( ARGUMENTS ( arg_def )+ ) ;
    public final ArrayList<SimpleError> args_def() throws RecognitionException {
        args_def_stack.push(new args_def_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> arg_def8 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	((args_def_scope)args_def_stack.peek()).scope = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.get(0);
        	((reclang_scope)reclang_stack.peek()).scope_id++;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:135:2: ( ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:135:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def253); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:135:16: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:135:17: arg_def
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:147:1: arg_def returns [ArrayList<SimpleError> errors] : ^( ARGUMENT datatype list_ids ) ;
    public final ArrayList<SimpleError> arg_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> list_ids9 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:152:2: ( ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:152:4: ^( ARGUMENT datatype list_ids )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:163:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | ^( other_type subtype ) );
    public final void datatype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:164:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | ^( other_type subtype ) )
            int alt6=5;
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
            case DT_SET:
            case DT_PAIR:
            case DT_TRIPLE:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:164:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype318); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:165:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype323); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:166:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype328); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:167:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype333); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:168:5: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype341);
                    other_type();

                    state._fsp--;


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_subtype_in_datatype343);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:171:1: other_type : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final void other_type() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:172:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:177:1: subtype : datatype ;
    public final void subtype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:178:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:178:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype378);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:181:1: list_ids returns [ArrayList<SimpleError> errors] : ( ID )+ ;
    public final ArrayList<SimpleError> list_ids() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID10=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:186:2: ( ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:186:4: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:186:4: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:186:5: ID
            	    {
            	    ID10=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids398); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:203:1: reconfiguration_block returns [ArrayList<SimpleError> errors] : ^( INSTRUCTIONS ( instruction )+ ) ;
    public final ArrayList<SimpleError> reconfiguration_block() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> instruction11 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:208:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:208:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block432); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:208:19: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:208:20: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block435);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:220:1: instruction returns [ArrayList<SimpleError> errors] : ( declaration | assignment[false] | reconfiguration_apply | for_instruction );
    public final ArrayList<SimpleError> instruction() throws RecognitionException {
        instruction_stack.push(new instruction_scope());
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> declaration12 = null;

        ArrayList<SimpleError> assignment13 = null;

        ArrayList<SimpleError> reconfiguration_apply14 = null;

        ArrayList<SimpleError> for_instruction15 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
        	((instruction_scope)instruction_stack.peek()).rec_type = "";

        	Integer scope_id = ((reclang_scope)reclang_stack.peek()).scope_id;
        	for (int i = 0; i < ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.size(); i++){
        		TinySymbolsTable tst = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.get(i);
        		if ( tst.getScopeRel().fst().equals(scope_id) ) {
        			((instruction_scope)instruction_stack.peek()).scope = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scopes.get(i-1);
        			break;
        		}
        	}

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:238:2: ( declaration | assignment[false] | reconfiguration_apply | for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:238:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction472);
                    declaration12=declaration();

                    state._fsp--;

                     
                    		local_errors.addAll(declaration12); 
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:243:4: assignment[false]
                    {
                    pushFollow(FOLLOW_assignment_in_instruction481);
                    assignment13=assignment(false);

                    state._fsp--;

                     
                    		local_errors.addAll(assignment13); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:248:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction491);
                    reconfiguration_apply14=reconfiguration_apply();

                    state._fsp--;

                     
                    		local_errors.addAll(reconfiguration_apply14); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:253:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction500);
                    for_instruction15=for_instruction();

                    state._fsp--;


                    		local_errors.addAll(for_instruction15);
                    		errors = local_errors;
                    		((reclang_scope)reclang_stack.peek()).scope_id--;
                    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:261:1: reconfiguration_apply returns [ArrayList<SimpleError> errors] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final ArrayList<SimpleError> reconfiguration_apply() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_call16 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:266:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:266:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply523); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply525);
            reconfiguration_call16=reconfiguration_call();

            state._fsp--;


            		local_errors.addAll(reconfiguration_call16);
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:271:2: ( ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:271:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply533); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:278:1: declaration returns [ArrayList<SimpleError> errors] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final ArrayList<SimpleError> declaration() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> var_def17 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:283:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:283:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration560); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration562);
            datatype();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:283:27: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:283:28: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration565);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:294:1: var_def returns [ArrayList<SimpleError> errors] : ( ID | assignment[true] );
    public final ArrayList<SimpleError> var_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID18=null;
        ArrayList<SimpleError> assignment19 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:299:2: ( ID | assignment[true] )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:299:4: ID
                    {
                    ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def597); 

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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:317:4: assignment[true]
                    {
                    pushFollow(FOLLOW_assignment_in_var_def607);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:324:1: assignment[boolean isDeclaration] returns [ArrayList<SimpleError> errors] : ^( ASSIGNMENT ID assignment_member ) ;
    public final ArrayList<SimpleError> assignment(boolean isDeclaration) throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID20=null;
        ArrayList<SimpleError> assignment_member21 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:329:2: ( ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:329:4: ^( ASSIGNMENT ID assignment_member )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment633); 

            match(input, Token.DOWN, null); 
            ID20=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment635); 

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
            				if ( ts != null ){
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
            	
            pushFollow(FOLLOW_assignment_member_in_assignment641);
            assignment_member21=assignment_member();

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:361:1: assignment_member returns [ArrayList<SimpleError> errors] : ( expression | reconfiguration_apply );
    public final ArrayList<SimpleError> assignment_member() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_apply22 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:362:2: ( expression | reconfiguration_apply )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=OP_PATH && LA13_0<=OP_UPDATE)||(LA13_0>=OP_UNION && LA13_0<=OP_MINUS)||LA13_0==ID||(LA13_0>=TRIPLE && LA13_0<=ACCESS)) ) {
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:362:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member662);
                    expression();

                    state._fsp--;

                     errors = new ArrayList<SimpleError>(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:363:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member669);
                    reconfiguration_apply22=reconfiguration_apply();

                    state._fsp--;

                     errors = reconfiguration_apply22; 

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


    // $ANTLR start "reconfiguration_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:366:1: reconfiguration_call returns [ArrayList<SimpleError> errors] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final ArrayList<SimpleError> reconfiguration_call() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree OP_ID29=null;
        RecSA.operation_args_return operation_args23 = null;

        RecSA.operation_args_return operation_args24 = null;

        RecSA.operation_args_return operation_args25 = null;

        RecSA.operation_args_return operation_args26 = null;

        RecSA.operation_args_return operation_args27 = null;

        RecSA.operation_args_return operation_args28 = null;

        RecSA.operation_args_return operation_args30 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:367:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:367:4: ^( OP_JOIN operation_args )
                    {
                    match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call687); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "join"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call693);
                        operation_args23=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = (operation_args23!=null?operation_args23.errors:null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:370:4: ^( OP_SPLIT operation_args )
                    {
                    match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call704); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "split"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call710);
                        operation_args24=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = (operation_args24!=null?operation_args24.errors:null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:373:4: ^( OP_PAR operation_args )
                    {
                    match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call721); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "par"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call727);
                        operation_args25=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = (operation_args25!=null?operation_args25.errors:null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:376:4: ^( OP_REMOVE operation_args )
                    {
                    match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call738); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "remove"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call744);
                        operation_args26=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = (operation_args26!=null?operation_args26.errors:null); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:379:4: ^( OP_CONST operation_args )
                    {
                    match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call755); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "const"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call761);
                        operation_args27=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = (operation_args27!=null?operation_args27.errors:null); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:382:4: ^( OP_ID operation_args )
                    {
                    OP_ID29=(CommonTree)match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call772); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "id"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call778);
                        operation_args28=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    		ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();
                    		errors = new ArrayList<SimpleError>();
                    		if(!(operation_args28!=null?((CommonTree)operation_args28.start):null).isNil()){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.invalidArgument((operation_args28!=null?((CommonTree)operation_args28.start):null).toString()) , (OP_ID29!=null?OP_ID29.getLine():0), (OP_ID29!=null?OP_ID29.getCharPositionInLine():0)+4) );
                    		}
                    		
                    		local_errors.addAll((operation_args28!=null?operation_args28.errors:null));
                    		errors = local_errors;
                    	

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:395:4: ^( ID operation_args )
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_call792); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "custom"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call799);
                        operation_args30=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = (operation_args30!=null?operation_args30.errors:null); 

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
    // $ANTLR end "reconfiguration_call"


    // $ANTLR start "structure_operation_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:400:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final void structure_operation_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:401:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:401:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call817); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call819);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:402:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call826); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call828);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:406:1: operation_args returns [ArrayList<SimpleError> errors] : ( args )? ;
    public final RecSA.operation_args_return operation_args() throws RecognitionException {
        RecSA.operation_args_return retval = new RecSA.operation_args_return();
        retval.start = input.LT(1);

        ArrayList<SimpleError> args31 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:407:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:407:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:407:4: ( args )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=OP_PATH && LA16_0<=OP_UPDATE)||(LA16_0>=OP_UNION && LA16_0<=OP_MINUS)||LA16_0==ID||(LA16_0>=TRIPLE && LA16_0<=ACCESS)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:407:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args847);
                    args31=args();

                    state._fsp--;

                     retval.errors = args31; 

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


    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:410:1: args returns [ArrayList<SimpleError> errors] : ( expression )+ ;
    public final ArrayList<SimpleError> args() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> expression32 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:414:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:414:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:414:4: ( expression )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=ACCESS)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:414:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args872);
            	    expression32=expression();

            	    state._fsp--;


            	    		local_errors.addAll(expression32);
            	    	

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
    // $ANTLR end "args"


    // $ANTLR start "for_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:427:1: for_instruction returns [ArrayList<SimpleError> errors] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
    public final ArrayList<SimpleError> for_instruction() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree id1=null;
        CommonTree id2=null;
        ArrayList<SimpleError> reconfiguration_block33 = null;



        	((reclang_scope)reclang_stack.peek()).scope_id++;
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:432:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:432:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction909); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction911);
            datatype();

            state._fsp--;

            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction915); 

            		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            		if ( ts != null ){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((id1!=null?id1.getText():null), ts.getLine(), ts.getPosition()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            		}
            	
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction925); 
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction927);
            reconfiguration_block33=reconfiguration_block();

            state._fsp--;


            		local_errors.addAll(reconfiguration_block33);
            	

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


    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:454:1: expression returns [ArrayList<SimpleError> errors] : ( ^( OP_UNION expression expression ) | ^( OP_INTERSECTION expression expression ) | ^( OP_MINUS expression expression ) | factor );
    public final ArrayList<SimpleError> expression() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> factor34 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:455:2: ( ^( OP_UNION expression expression ) | ^( OP_INTERSECTION expression expression ) | ^( OP_MINUS expression expression ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:455:4: ^( OP_UNION expression expression )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression957); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression959);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression961);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:456:4: ^( OP_INTERSECTION expression expression )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression968); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression970);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression972);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:457:4: ^( OP_MINUS expression expression )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression979); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression981);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression983);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:458:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression989);
                    factor34=factor();

                    state._fsp--;

                     errors = factor34; 

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
    // $ANTLR end "expression"


    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:462:1: factor returns [ArrayList<SimpleError> errors] : ( ^( ID ID ) | ID | operation | constructor );
    public final ArrayList<SimpleError> factor() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID35=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:467:2: ( ^( ID ID ) | ID | operation | constructor )
            int alt19=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    alt19=1;
                }
                else if ( (LA19_1==UP||(LA19_1>=OP_PATH && LA19_1<=OP_UPDATE)||(LA19_1>=OP_UNION && LA19_1<=OP_MINUS)||LA19_1==ID||(LA19_1>=TRIPLE && LA19_1<=ACCESS)) ) {
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:467:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1011); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1013); 

                    match(input, Token.UP, null); 
                     errors = local_errors; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:468:4: ID
                    {
                    ID35=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1021); 

                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID35!=null?ID35.getText():null), s_id);
                    		if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID35!=null?ID35.getText():null)) && ts == null){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID35!=null?ID35.getText():null)), (ID35!=null?ID35.getLine():0), (ID35!=null?ID35.getCharPositionInLine():0)) );
                    		}
                    		else{
                    			//System.out.println((ID35!=null?ID35.getText():null));
                    			TinySymbol symbol = ts != null ? ts : ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID35!=null?ID35.getText():null));
                    			//System.out.println(ts);
                    			List<Type> dt = new ArrayList<Type>();
                    			dt.add(Type.PATTERN);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("const") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID35!=null?ID35.getText():null), "Pattern"), (ID35!=null?ID35.getLine():0), (ID35!=null?ID35.getCharPositionInLine():0)) );
                    			}
                    			
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("par") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID35!=null?ID35.getText():null), "Pattern"), (ID35!=null?ID35.getLine():0), (ID35!=null?ID35.getCharPositionInLine():0)) );
                    			}
                    			
                    			dt.clear();
                    			dt.add(Type.SET);
                    			dt.add(Type.NODE);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("join") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID35!=null?ID35.getText():null), "Set<Node>"), (ID35!=null?ID35.getLine():0), (ID35!=null?ID35.getCharPositionInLine():0)) );
                    			}
                    			
                    			dt.clear();
                    			dt.add(Type.NODE);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("split") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID35!=null?ID35.getText():null), "Node"), (ID35!=null?ID35.getLine():0), (ID35!=null?ID35.getCharPositionInLine():0)) );
                    			}
                    			
                    			dt.clear();
                    			dt.add(Type.NAME);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("remove") && !symbol.getDataType().containsAll(dt) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID35!=null?ID35.getText():null), "Name"), (ID35!=null?ID35.getLine():0), (ID35!=null?ID35.getCharPositionInLine():0)) );
                    			}
                    		}
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:510:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1029);
                    operation();

                    state._fsp--;

                     errors = local_errors; 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:511:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1036);
                    constructor();

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
    // $ANTLR end "factor"


    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:514:1: operation : ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call );
    public final void operation() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:515:2: ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:515:4: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1051); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_operation1053); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:515:16: ( ^( STRUCTURE ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==STRUCTURE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:515:17: ^( STRUCTURE ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1057); 

                            match(input, Token.DOWN, null); 
                            match(input,ID,FOLLOW_ID_in_operation1059); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1064);
                    attribute_call();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:517:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1071);
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
        return ;
    }
    // $ANTLR end "operation"


    // $ANTLR start "constructor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:520:1: constructor : ( triple_cons | pair_cons | set_cons | node_cons );
    public final void constructor() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:521:2: ( triple_cons | pair_cons | set_cons | node_cons )
            int alt22=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:521:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1083);
                    triple_cons();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:522:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1088);
                    pair_cons();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:523:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1093);
                    set_cons();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:524:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1098);
                    node_cons();

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
    // $ANTLR end "constructor"


    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:533:1: attribute_call : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | ID );
    public final void attribute_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:534:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | ID )
            int alt25=10;
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
            case ID:
                {
                alt25=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:534:4: ^( OP_IN ( INT )? )
                    {
                    match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1118); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:534:12: ( INT )?
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==INT) ) {
                            alt23=1;
                        }
                        switch (alt23) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:534:12: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call1120); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:535:4: ^( OP_OUT ( INT )? )
                    {
                    match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1128); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:535:13: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:535:13: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call1130); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:536:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1137); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:537:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1142); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:538:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1147); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:539:4: ^( OP_ENDS expression )
                    {
                    match(input,OP_ENDS,FOLLOW_OP_ENDS_in_attribute_call1153); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_attribute_call1155);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:540:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1162); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:541:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1167); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:542:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1172); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:543:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_attribute_call1177); 

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
    // $ANTLR end "attribute_call"


    // $ANTLR start "triple_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:547:1: triple_cons : ^( TRIPLE expression expression expression ) ;
    public final void triple_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:548:2: ( ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:548:4: ^( TRIPLE expression expression expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1192); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1194);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1196);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1198);
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
        return ;
    }
    // $ANTLR end "triple_cons"


    // $ANTLR start "pair_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:552:1: pair_cons : ^( PAIR expression expression ) ;
    public final void pair_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:553:2: ( ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:553:4: ^( PAIR expression expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons1215); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1217);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons1219);
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
        return ;
    }
    // $ANTLR end "pair_cons"


    // $ANTLR start "set_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:558:1: set_cons : ^( SET ( expression )* ) ;
    public final void set_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:559:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:559:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons1237); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:559:10: ( expression )*
                loop26:
                do {
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=OP_PATH && LA26_0<=OP_UPDATE)||(LA26_0>=OP_UNION && LA26_0<=OP_MINUS)||LA26_0==ID||(LA26_0>=TRIPLE && LA26_0<=ACCESS)) ) {
                        alt26=1;
                    }


                    switch (alt26) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:559:10: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1239);
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
    // $ANTLR end "set_cons"


    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:563:1: node_cons : ^( NODE ( ID )+ ) ;
    public final void node_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:564:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:564:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1258); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:564:11: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:564:11: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_node_cons1260); 

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
    // $ANTLR end "node_cons"


    // $ANTLR start "applicaiton_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:571:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final void applicaiton_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:572:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:572:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1278); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1280);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:572:29: ( trigger_def )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SEP_BLOCK_START) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:572:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1282);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:575:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final void list_reconfigurations() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:576:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:576:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:576:4: ( reconfiguration_call )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=OP_PAR && LA29_0<=OP_ID)||LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:576:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1295);
            	    reconfiguration_call();

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:579:1: trigger_def : trigger_block ;
    public final void trigger_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:580:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:580:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1308);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:583:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final void trigger_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:584:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:584:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1320); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1322); 

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
    public static final BitSet FOLLOW_directive_def_in_reclang65 = new BitSet(new long[]{0x0000000000000008L,0x000000000002000CL});
    public static final BitSet FOLLOW_element_in_reclang77 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020008L});
    public static final BitSet FOLLOW_directive_import_in_directive_def112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECONFIGURATION_in_element159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def256 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def293 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype343 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_other_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids398 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block435 = new BitSet(new long[]{0x0000000100000008L,0x0000000000000700L});
    public static final BitSet FOLLOW_declaration_in_instruction472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply523 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply525 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply533 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration560 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration562 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_var_def_in_declaration565 = new BitSet(new long[]{0x0100000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_var_def597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment635 = new BitSet(new long[]{0x0100000F00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_assignment_member_in_assignment641 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call693 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call721 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call738 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args872 = new BitSet(new long[]{0x0100000E00300002L,0x000000000000F800L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction909 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction911 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction915 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression959 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_expression961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression970 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_expression972 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression981 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_expression983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1013 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1053 = new BitSet(new long[]{0x010000007FC00000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1057 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ENDS_in_attribute_call1153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_attribute_call1155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1194 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_triple_cons1196 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_triple_cons1198 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1217 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_pair_cons1219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1239 = new BitSet(new long[]{0x0100000E00300008L,0x000000000000F800L});
    public static final BitSet FOLLOW_NODE_in_node_cons1258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1260 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1278 = new BitSet(new long[]{0x01000000000FC000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1280 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1295 = new BitSet(new long[]{0x01000000000FC002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1320 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1322 = new BitSet(new long[]{0x0000000000000002L});

}