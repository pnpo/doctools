// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g 2014-03-27 22:53:15

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

        ArrayList<SimpleError> reconfiguration_apply13 = null;

        ArrayList<SimpleError> for_instruction14 = null;



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
                    assignment(false);

                    state._fsp--;

                     errors = local_errors; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:244:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction489);
                    reconfiguration_apply13=reconfiguration_apply();

                    state._fsp--;

                     
                    		local_errors.addAll(reconfiguration_apply13); 
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:249:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction498);
                    for_instruction14=for_instruction();

                    state._fsp--;


                    		local_errors.addAll(for_instruction14);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:257:1: reconfiguration_apply returns [ArrayList<SimpleError> errors] : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final ArrayList<SimpleError> reconfiguration_apply() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_call15 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:262:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:262:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply521); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply523);
            reconfiguration_call15=reconfiguration_call();

            state._fsp--;


            		local_errors.addAll(reconfiguration_call15);
            	
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:267:2: ( ID )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:267:2: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply531); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:274:1: declaration returns [ArrayList<SimpleError> errors] : ^( DECLARATION datatype ( var_def )+ ) ;
    public final ArrayList<SimpleError> declaration() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> var_def16 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:279:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:279:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration558); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration560);
            datatype();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:279:27: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:279:28: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration563);
            	    var_def16=var_def();

            	    state._fsp--;


            	    		local_errors.addAll(var_def16);
            	    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:290:1: var_def returns [ArrayList<SimpleError> errors] : ( ID | assignment[true] );
    public final ArrayList<SimpleError> var_def() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID17=null;
        ArrayList<SimpleError> assignment18 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:295:2: ( ID | assignment[true] )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:295:4: ID
                    {
                    ID17=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def595); 

                    		if (((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID17!=null?ID17.getText():null))){
                    			TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID17!=null?ID17.getText():null));
                    			if ( !((ID17!=null?ID17.getLine():0) == ts.getLine() && (ID17!=null?ID17.getCharPositionInLine():0) == ts.getPosition()) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID17!=null?ID17.getText():null), ts.getLine(), ts.getPosition()), (ID17!=null?ID17.getLine():0), (ID17!=null?ID17.getCharPositionInLine():0)) );
                    			}
                    		}
                    		else {
                    			Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    			TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID17!=null?ID17.getText():null), s_id);
                    			if ( ts != null ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID17!=null?ID17.getText():null), ts.getLine(), ts.getPosition()), (ID17!=null?ID17.getLine():0), (ID17!=null?ID17.getCharPositionInLine():0)) );
                    			}
                    		}
                    		errors = local_errors;
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:313:4: assignment[true]
                    {
                    pushFollow(FOLLOW_assignment_in_var_def605);
                    assignment18=assignment(true);

                    state._fsp--;


                    		local_errors.addAll(assignment18);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:320:1: assignment[boolean isDeclaration] returns [ArrayList<SimpleError> errors] : ^( ASSIGNMENT ID assignment_member ) ;
    public final ArrayList<SimpleError> assignment(boolean isDeclaration) throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID19=null;
        ArrayList<SimpleError> assignment_member20 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:325:2: ( ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:325:4: ^( ASSIGNMENT ID assignment_member )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment631); 

            match(input, Token.DOWN, null); 
            ID19=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment633); 

            		if (isDeclaration) {
            			if (((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID19!=null?ID19.getText():null))){
            				TinySymbol ts = ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID19!=null?ID19.getText():null));
            				if ( !((ID19!=null?ID19.getLine():0) == ts.getLine() && (ID19!=null?ID19.getCharPositionInLine():0) == ts.getPosition()) ){
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID19!=null?ID19.getText():null), ts.getLine(), ts.getPosition()), (ID19!=null?ID19.getLine():0), (ID19!=null?ID19.getCharPositionInLine():0)) );
            				}
            			}
            			else {
            				Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            				TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID19!=null?ID19.getText():null), s_id);
            				if ( ts != null ){
            					local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((ID19!=null?ID19.getText():null), ts.getLine(), ts.getPosition()), (ID19!=null?ID19.getLine():0), (ID19!=null?ID19.getCharPositionInLine():0)) );
            				}
            			}
            		}
            	
            pushFollow(FOLLOW_assignment_member_in_assignment639);
            assignment_member20=assignment_member();

            state._fsp--;


            match(input, Token.UP, null); 

            		local_errors.addAll(assignment_member20);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:350:1: assignment_member returns [ArrayList<SimpleError> errors] : ( expression | reconfiguration_apply );
    public final ArrayList<SimpleError> assignment_member() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> reconfiguration_apply21 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:351:2: ( expression | reconfiguration_apply )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:351:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member660);
                    expression();

                    state._fsp--;

                     errors = new ArrayList<SimpleError>(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:352:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member667);
                    reconfiguration_apply21=reconfiguration_apply();

                    state._fsp--;

                     errors = reconfiguration_apply21; 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:355:1: reconfiguration_call returns [ArrayList<SimpleError> errors] : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final ArrayList<SimpleError> reconfiguration_call() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> operation_args22 = null;

        ArrayList<SimpleError> operation_args23 = null;

        ArrayList<SimpleError> operation_args24 = null;

        ArrayList<SimpleError> operation_args25 = null;

        ArrayList<SimpleError> operation_args26 = null;

        ArrayList<SimpleError> operation_args27 = null;

        ArrayList<SimpleError> operation_args28 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:356:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:356:4: ^( OP_JOIN operation_args )
                    {
                    match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call685); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "join"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call691);
                        operation_args22=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = operation_args22; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:359:4: ^( OP_SPLIT operation_args )
                    {
                    match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call702); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "split"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call708);
                        operation_args23=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = operation_args23; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:362:4: ^( OP_PAR operation_args )
                    {
                    match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call719); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "par"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call725);
                        operation_args24=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = operation_args24; 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:365:4: ^( OP_REMOVE operation_args )
                    {
                    match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call736); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "remove"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call742);
                        operation_args25=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = operation_args25; 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:368:4: ^( OP_CONST operation_args )
                    {
                    match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call753); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "const"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call759);
                        operation_args26=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = operation_args26; 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:371:4: ^( OP_ID operation_args )
                    {
                    match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call770); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "id"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call776);
                        operation_args27=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = operation_args27; 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:374:4: ^( ID operation_args )
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_call787); 

                     ((instruction_scope)instruction_stack.peek()).rec_type = "custom"; 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call794);
                        operation_args28=operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }
                     errors = operation_args28; 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:379:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final void structure_operation_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:380:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:380:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call812); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call814);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:381:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call821); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call823);
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


    // $ANTLR start "operation_args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:385:1: operation_args returns [ArrayList<SimpleError> errors] : ( args )? ;
    public final ArrayList<SimpleError> operation_args() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> args29 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:386:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:386:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:386:4: ( args )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=OP_PATH && LA16_0<=OP_UPDATE)||(LA16_0>=OP_UNION && LA16_0<=OP_MINUS)||LA16_0==ID||(LA16_0>=TRIPLE && LA16_0<=ACCESS)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:386:5: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args842);
                    args29=args();

                    state._fsp--;

                     errors = args29; 

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
        return errors;
    }
    // $ANTLR end "operation_args"


    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:389:1: args returns [ArrayList<SimpleError> errors] : ( expression )+ ;
    public final ArrayList<SimpleError> args() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> expression30 = null;



        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:393:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:393:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:393:4: ( expression )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:393:5: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args866);
            	    expression30=expression();

            	    state._fsp--;


            	    		local_errors.addAll(expression30);
            	    	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:406:1: for_instruction returns [ArrayList<SimpleError> errors] : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
    public final ArrayList<SimpleError> for_instruction() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree id1=null;
        CommonTree id2=null;
        ArrayList<SimpleError> reconfiguration_block31 = null;



        	((reclang_scope)reclang_stack.peek()).scope_id++;
        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:411:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:411:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction903); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction905);
            datatype();

            state._fsp--;

            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction909); 

            		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
            		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((id1!=null?id1.getText():null), s_id);
            		if ( ts != null ){
            			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameAlreadyDefined((id1!=null?id1.getText():null), ts.getLine(), ts.getPosition()), (id1!=null?id1.getLine():0), (id1!=null?id1.getCharPositionInLine():0)) );
            		}
            	
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction919); 
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction921);
            reconfiguration_block31=reconfiguration_block();

            state._fsp--;


            		local_errors.addAll(reconfiguration_block31);
            	

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:433:1: expression returns [ArrayList<SimpleError> errors] : ( ^( OP_UNION expression expression ) | ^( OP_INTERSECTION expression expression ) | ^( OP_MINUS expression expression ) | factor );
    public final ArrayList<SimpleError> expression() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        ArrayList<SimpleError> factor32 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:434:2: ( ^( OP_UNION expression expression ) | ^( OP_INTERSECTION expression expression ) | ^( OP_MINUS expression expression ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:434:4: ^( OP_UNION expression expression )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression951); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression953);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression955);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:435:4: ^( OP_INTERSECTION expression expression )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression962); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression964);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression966);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:436:4: ^( OP_MINUS expression expression )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression973); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression975);
                    expression();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_expression977);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:437:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression983);
                    factor32=factor();

                    state._fsp--;

                     errors = factor32; 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:441:1: factor returns [ArrayList<SimpleError> errors] : ( ^( ID ID ) | ID | operation | constructor );
    public final ArrayList<SimpleError> factor() throws RecognitionException {
        ArrayList<SimpleError> errors = null;

        CommonTree ID33=null;


        	ArrayList<SimpleError> local_errors = new ArrayList<SimpleError>();


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:446:2: ( ^( ID ID ) | ID | operation | constructor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:446:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor1005); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor1007); 

                    match(input, Token.UP, null); 
                     errors = local_errors; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:447:4: ID
                    {
                    ID33=(CommonTree)match(input,ID,FOLLOW_ID_in_factor1015); 

                    		Integer s_id = ((instruction_scope)instruction_stack.peek()).scope.getScopeRel().fst();
                    		TinySymbol ts = ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).name.hasValue((ID33!=null?ID33.getText():null), s_id);
                    		if (!((instruction_scope)instruction_stack.peek()).scope.containsSymbol((ID33!=null?ID33.getText():null)) && ts == null){
                    			local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.nameNotDefined((ID33!=null?ID33.getText():null)), (ID33!=null?ID33.getLine():0), (ID33!=null?ID33.getCharPositionInLine():0)) );
                    		}
                    		else{
                    			//System.out.println((ID33!=null?ID33.getText():null));
                    			TinySymbol symbol = ts != null ? ts : ((instruction_scope)instruction_stack.peek()).scope.getSymbols().get((ID33!=null?ID33.getText():null));
                    			//System.out.println(ts);
                    			if (((instruction_scope)instruction_stack.peek()).rec_type.equals("par") && !symbol.getDataType().contains(Type.PATTERN) ){
                    				local_errors.add( SimpleError.report(ErrorType.ERROR, SimpleError.wrongDatatype((ID33!=null?ID33.getText():null), "Pattern"), (ID33!=null?ID33.getLine():0), (ID33!=null?ID33.getCharPositionInLine():0)) );
                    			}
                    		}
                    		errors = local_errors; 
                    	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:464:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor1023);
                    operation();

                    state._fsp--;

                     errors = local_errors; 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:465:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor1030);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:468:1: operation : ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call );
    public final void operation() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:469:2: ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:469:4: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation1045); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_operation1047); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:469:16: ( ^( STRUCTURE ID ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==STRUCTURE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:469:17: ^( STRUCTURE ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation1051); 

                            match(input, Token.DOWN, null); 
                            match(input,ID,FOLLOW_ID_in_operation1053); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation1058);
                    attribute_call();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:471:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation1065);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:474:1: constructor : ( triple_cons | pair_cons | set_cons | node_cons );
    public final void constructor() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:475:2: ( triple_cons | pair_cons | set_cons | node_cons )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:475:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor1077);
                    triple_cons();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:476:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor1082);
                    pair_cons();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:477:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor1087);
                    set_cons();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:478:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor1092);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:487:1: attribute_call : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | ID );
    public final void attribute_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:488:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | ^( OP_ENDS expression ) | OP_FST | OP_SND | OP_TRD | ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:488:4: ^( OP_IN ( INT )? )
                    {
                    match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call1112); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:488:12: ( INT )?
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==INT) ) {
                            alt23=1;
                        }
                        switch (alt23) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:488:12: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call1114); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:489:4: ^( OP_OUT ( INT )? )
                    {
                    match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call1122); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:489:13: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:489:13: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call1124); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:490:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call1131); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:491:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call1136); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:492:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call1141); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:493:4: ^( OP_ENDS expression )
                    {
                    match(input,OP_ENDS,FOLLOW_OP_ENDS_in_attribute_call1147); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_attribute_call1149);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:494:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call1156); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:495:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call1161); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:496:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call1166); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:497:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_attribute_call1171); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:501:1: triple_cons : ^( TRIPLE expression expression expression ) ;
    public final void triple_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:502:2: ( ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:502:4: ^( TRIPLE expression expression expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons1186); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons1188);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1190);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons1192);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:506:1: pair_cons : ^( PAIR expression expression ) ;
    public final void pair_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:507:2: ( ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:507:4: ^( PAIR expression expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons1209); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons1211);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons1213);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:512:1: set_cons : ^( SET ( expression )* ) ;
    public final void set_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:513:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:513:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons1231); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:513:10: ( expression )*
                loop26:
                do {
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=OP_PATH && LA26_0<=OP_UPDATE)||(LA26_0>=OP_UNION && LA26_0<=OP_MINUS)||LA26_0==ID||(LA26_0>=TRIPLE && LA26_0<=ACCESS)) ) {
                        alt26=1;
                    }


                    switch (alt26) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:513:10: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons1233);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:517:1: node_cons : ^( NODE ( ID )+ ) ;
    public final void node_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:518:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:518:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons1252); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:518:11: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:518:11: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_node_cons1254); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:525:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final void applicaiton_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:526:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:526:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1272); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1274);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:526:29: ( trigger_def )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SEP_BLOCK_START) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:526:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1276);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:529:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final void list_reconfigurations() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:530:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:530:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:530:4: ( reconfiguration_call )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:530:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1289);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:533:1: trigger_def : trigger_block ;
    public final void trigger_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:534:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:534:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1302);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:537:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final void trigger_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:538:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecSA.g:538:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1314); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1316); 

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
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply523 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply531 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration560 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_var_def_in_declaration563 = new BitSet(new long[]{0x0100000000000008L,0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_var_def595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment631 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment633 = new BitSet(new long[]{0x0100000F00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_assignment_member_in_assignment639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call708 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call770 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call776 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call814 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call821 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args866 = new BitSet(new long[]{0x0100000E00300002L,0x000000000000F800L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction905 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction909 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction921 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression953 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_expression955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression964 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_expression966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression975 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_expression977 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1005 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor1007 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation1045 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1047 = new BitSet(new long[]{0x010000007FC00000L,0x0000000000010000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation1051 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation1053 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation1058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call1112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call1122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call1124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_ENDS_in_attribute_call1147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_attribute_call1149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons1186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons1188 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_triple_cons1190 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_triple_cons1192 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons1209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons1211 = new BitSet(new long[]{0x0100000E00300000L,0x000000000000F800L});
    public static final BitSet FOLLOW_expression_in_pair_cons1213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons1231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons1233 = new BitSet(new long[]{0x0100000E00300008L,0x000000000000F800L});
    public static final BitSet FOLLOW_NODE_in_node_cons1252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons1254 = new BitSet(new long[]{0x0100000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1272 = new BitSet(new long[]{0x01000000000FC000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1274 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1289 = new BitSet(new long[]{0x01000000000FC002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1314 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1316 = new BitSet(new long[]{0x0000000000000002L});

}