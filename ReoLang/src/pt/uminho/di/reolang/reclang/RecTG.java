// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g 2014-05-22 21:28:08

	package pt.uminho.di.reolang.reclang;
	
	import pt.uminho.di.reolang.parsing.util.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RecTG extends TreeParser {
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


        public RecTG(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public RecTG(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return RecTG.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g"; }


    	private TinySymbolsTable ids_table = new TinySymbolsTable();


    protected static class reclang_scope {
        int scope_id;
        int parent_id;
        int aux_id;
        List<Integer> scopes;
    }
    protected Stack reclang_stack = new Stack();


    // $ANTLR start "reclang"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:23:1: reclang returns [TinySymbolsTable global_table] : ^( RECONFIGS ( directive_def )* ( element )* ) ;
    public final TinySymbolsTable reclang() throws RecognitionException {
        reclang_stack.push(new reclang_scope());
        TinySymbolsTable global_table = null;


        	((reclang_scope)reclang_stack.peek()).scope_id = 0;
        	((reclang_scope)reclang_stack.peek()).parent_id = 0;
        	((reclang_scope)reclang_stack.peek()).aux_id = 0;
        	
        	((reclang_scope)reclang_stack.peek()).scopes = new ArrayList<Integer>(); //LinkedList or Stack
        	((reclang_scope)reclang_stack.peek()).scopes.add(0);
        	

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:39:2: ( ^( RECONFIGS ( directive_def )* ( element )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:39:4: ^( RECONFIGS ( directive_def )* ( element )* )
            {
            match(input,RECONFIGS,FOLLOW_RECONFIGS_in_reclang61); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:39:16: ( directive_def )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==IMPORT) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:39:16: directive_def
                	    {
                	    pushFollow(FOLLOW_directive_def_in_reclang63);
                	    directive_def();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);

                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:39:31: ( element )*
                loop2:
                do {
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RECONFIGURATION||(LA2_0>=APPLICATION && LA2_0<=MAIN)) ) {
                        alt2=1;
                    }


                    switch (alt2) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:39:31: element
                	    {
                	    pushFollow(FOLLOW_element_in_reclang66);
                	    element();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                		//ids_table.removeRepeatedSymbols();
                		global_table = ids_table;
                	

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
        return global_table;
    }
    // $ANTLR end "reclang"


    // $ANTLR start "directive_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:52:1: directive_def : directive_import ;
    public final void directive_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:53:2: ( directive_import )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:53:4: directive_import
            {
            pushFollow(FOLLOW_directive_import_in_directive_def92);
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
        return ;
    }
    // $ANTLR end "directive_def"


    // $ANTLR start "directive_import"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:57:1: directive_import : ^( IMPORT STRING ) ;
    public final void directive_import() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:58:2: ( ^( IMPORT STRING ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:58:4: ^( IMPORT STRING )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_directive_import106); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_directive_import108); 

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
    // $ANTLR end "directive_import"


    // $ANTLR start "element"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:66:1: element : ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) | ^( MAIN main_def ) );
    public final void element() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:67:2: ( ^( RECONFIGURATION reconfiguration_def ) | ^( APPLICATION applicaiton_def ) | ^( MAIN main_def ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:67:4: ^( RECONFIGURATION reconfiguration_def )
                    {
                    match(input,RECONFIGURATION,FOLLOW_RECONFIGURATION_in_element127); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_reconfiguration_def_in_element129);
                    reconfiguration_def();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:68:4: ^( APPLICATION applicaiton_def )
                    {
                    match(input,APPLICATION,FOLLOW_APPLICATION_in_element136); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_applicaiton_def_in_element138);
                    applicaiton_def();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:69:4: ^( MAIN main_def )
                    {
                    match(input,MAIN,FOLLOW_MAIN_in_element146); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_main_def_in_element148);
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
        return ;
    }
    // $ANTLR end "element"

    protected static class reconfiguration_def_scope {
        TinySymbol rec_symbol;
        TinySymbolsTable main_scope;
        List<TinySymbolsTable> sub_scopes;
        List<Type> datatype;
        String scope;
    }
    protected Stack reconfiguration_def_stack = new Stack();


    // $ANTLR start "reconfiguration_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:74:1: reconfiguration_def : ^( ID ( args_def )? reconfiguration_block ) ;
    public final void reconfiguration_def() throws RecognitionException {
        reconfiguration_def_stack.push(new reconfiguration_def_scope());
        CommonTree ID1=null;


        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol = new TinySymbol();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope = new TinySymbolsTable();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).sub_scopes = new ArrayList<TinySymbolsTable>();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<Type>();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scope = "main";
        	
        	((reclang_scope)reclang_stack.peek()).scope_id = 0;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:91:2: ( ^( ID ( args_def )? reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:91:4: ^( ID ( args_def )? reconfiguration_block )
            {
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_reconfiguration_def170); 


            		
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol.setId((ID1!=null?ID1.getText():null));
            		
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add( Type.PATTERN );	//Type.values()[0]
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol.setDataType(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype);
            		
            		Type classtype = Type.RECONFIG; 	//Type.valueOf("RECONFIG")
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol.setClassType(classtype);
            		
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol.setLine((ID1!=null?ID1.getLine():0));
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol.setPosition((ID1!=null?ID1.getCharPositionInLine():0));
            	

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:106:2: ( args_def )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGUMENTS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:106:2: args_def
                    {
                    pushFollow(FOLLOW_args_def_in_reconfiguration_def179);
                    args_def();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_reconfiguration_block_in_reconfiguration_def182);
            reconfiguration_block();

            state._fsp--;


            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol.addScopes(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope, ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).sub_scopes);
            		
            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol.removeRepeatedIds();
            		if(!ids_table.containsSymbol((ID1!=null?ID1.getText():null))){
            			ids_table.addSymbol(((reconfiguration_def_scope)reconfiguration_def_stack.peek()).rec_symbol);
            		}
            	

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            reconfiguration_def_stack.pop();
        }
        return ;
    }
    // $ANTLR end "reconfiguration_def"


    // $ANTLR start "args_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:118:1: args_def : ^( ARGUMENTS ( arg_def )+ ) ;
    public final void args_def() throws RecognitionException {

        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope.setScopeRel( new Pair<Integer, Integer>(((reclang_scope)reclang_stack.peek()).scope_id, ((reclang_scope)reclang_stack.peek()).parent_id) );
        	((reclang_scope)reclang_stack.peek()).scope_id++;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:123:2: ( ^( ARGUMENTS ( arg_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:123:4: ^( ARGUMENTS ( arg_def )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_args_def205); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:123:16: ( arg_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:123:16: arg_def
            	    {
            	    pushFollow(FOLLOW_arg_def_in_args_def207);
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
        return ;
    }
    // $ANTLR end "args_def"


    // $ANTLR start "arg_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:127:1: arg_def : ^( ARGUMENT datatype list_ids ) ;
    public final void arg_def() throws RecognitionException {

        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<Type>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:131:2: ( ^( ARGUMENT datatype list_ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:131:4: ^( ARGUMENT datatype list_ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_arg_def228); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_arg_def230);
            datatype();

            state._fsp--;

            pushFollow(FOLLOW_list_ids_in_arg_def232);
            list_ids();

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
    // $ANTLR end "arg_def"


    // $ANTLR start "datatype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:134:1: datatype : ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) );
    public final void datatype() throws RecognitionException {
        Type other_type2 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:135:2: ( DT_PATTERN | DT_CHANNEL | DT_NAME | DT_NODE | DT_XOR | ^( other_type subtype ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:135:4: DT_PATTERN
                    {
                    match(input,DT_PATTERN,FOLLOW_DT_PATTERN_in_datatype245); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add( Type.PATTERN ); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:136:4: DT_CHANNEL
                    {
                    match(input,DT_CHANNEL,FOLLOW_DT_CHANNEL_in_datatype252); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add( Type.CHANNEL ); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:137:4: DT_NAME
                    {
                    match(input,DT_NAME,FOLLOW_DT_NAME_in_datatype259); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add( Type.NAME ); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:138:4: DT_NODE
                    {
                    match(input,DT_NODE,FOLLOW_DT_NODE_in_datatype266); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add( Type.NODE ); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:139:4: DT_XOR
                    {
                    match(input,DT_XOR,FOLLOW_DT_XOR_in_datatype274); 
                     ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add( Type.XOR ); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:141:5: ^( other_type subtype )
                    {
                    pushFollow(FOLLOW_other_type_in_datatype286);
                    other_type2=other_type();

                    state._fsp--;



                    		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype.add( other_type2 );
                    	

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
        return ;
    }
    // $ANTLR end "datatype"


    // $ANTLR start "other_type"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:149:1: other_type returns [Type type] : ( DT_SET | DT_PAIR | DT_TRIPLE );
    public final Type other_type() throws RecognitionException {
        Type type = null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:150:2: ( DT_SET | DT_PAIR | DT_TRIPLE )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:150:4: DT_SET
                    {
                    match(input,DT_SET,FOLLOW_DT_SET_in_other_type310); 
                     type = Type.SET; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:151:4: DT_PAIR
                    {
                    match(input,DT_PAIR,FOLLOW_DT_PAIR_in_other_type320); 
                     type = Type.PAIR; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:152:4: DT_TRIPLE
                    {
                    match(input,DT_TRIPLE,FOLLOW_DT_TRIPLE_in_other_type329); 
                     type = Type.TRIPLE; 

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
        return type;
    }
    // $ANTLR end "other_type"


    // $ANTLR start "subtype"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:155:1: subtype : datatype ;
    public final void subtype() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:156:2: ( datatype )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:156:4: datatype
            {
            pushFollow(FOLLOW_datatype_in_subtype342);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:159:1: list_ids : ( ID )+ ;
    public final void list_ids() throws RecognitionException {
        CommonTree ID3=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:160:2: ( ( ID )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:160:4: ( ID )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:160:4: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:160:5: ID
            	    {
            	    ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_list_ids355); 

            	    		TinySymbol s = new TinySymbol();
            	    		s.setId((ID3!=null?ID3.getText():null));
            	    		
            	    		s.setDataType( ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype );
            	    		
            	    		Type classtype = Type.ARG;
            	    		s.setClassType(classtype);
            	    		
            	    		s.setLine((ID3!=null?ID3.getLine():0));
            	    		s.setPosition((ID3!=null?ID3.getCharPositionInLine():0));
            	    		
            	    		if (!((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope.containsSymbol((ID3!=null?ID3.getText():null))){
            	    			((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope.addSymbol(s);
            	    		}
            	    	

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
        return ;
    }
    // $ANTLR end "list_ids"


    // $ANTLR start "reconfiguration_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:181:1: reconfiguration_block : ^( INSTRUCTIONS ( instruction )+ ) ;
    public final void reconfiguration_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:182:2: ( ^( INSTRUCTIONS ( instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:182:4: ^( INSTRUCTIONS ( instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_reconfiguration_block377); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:182:19: ( instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:182:19: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_reconfiguration_block379);
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
        return ;
    }
    // $ANTLR end "reconfiguration_block"


    // $ANTLR start "instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:185:1: instruction : ( declaration | assignment | reconfiguration_apply | for_instruction );
    public final void instruction() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:186:2: ( declaration | assignment | reconfiguration_apply | for_instruction )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:186:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_instruction393);
                    declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:187:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_instruction398);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:188:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_instruction403);
                    reconfiguration_apply();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:189:4: for_instruction
                    {
                    pushFollow(FOLLOW_for_instruction_in_instruction408);
                    for_instruction();

                    state._fsp--;


                    		((reclang_scope)reclang_stack.peek()).scopes.remove(((reclang_scope)reclang_stack.peek()).scopes.size()-1);
                    		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1);
                    		((reclang_scope)reclang_stack.peek()).aux_id--;
                    			
                    		if (((reclang_scope)reclang_stack.peek()).parent_id == 0) {
                    			((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scope = "main";
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
    // $ANTLR end "instruction"


    // $ANTLR start "reconfiguration_apply"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:201:1: reconfiguration_apply : ^( OP_APPLY reconfiguration_call ( ID )? ) ;
    public final void reconfiguration_apply() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:202:2: ( ^( OP_APPLY reconfiguration_call ( ID )? ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:202:4: ^( OP_APPLY reconfiguration_call ( ID )? )
            {
            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_reconfiguration_apply424); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_reconfiguration_call_in_reconfiguration_apply426);
            reconfiguration_call();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:202:36: ( ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:202:36: ID
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_apply428); 

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
        return ;
    }
    // $ANTLR end "reconfiguration_apply"


    // $ANTLR start "declaration"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:205:1: declaration : ^( DECLARATION datatype ( var_def )+ ) ;
    public final void declaration() throws RecognitionException {

        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<Type>();

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:209:2: ( ^( DECLARATION datatype ( var_def )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:209:4: ^( DECLARATION datatype ( var_def )+ )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration448); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_declaration450);
            datatype();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:209:27: ( var_def )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:209:27: var_def
            	    {
            	    pushFollow(FOLLOW_var_def_in_declaration452);
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
        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "var_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:212:1: var_def : ( ID | assignment );
    public final void var_def() throws RecognitionException {
        CommonTree ID4=null;
        TinySymbol assignment5 = null;


        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:213:2: ( ID | assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:213:4: ID
                    {
                    ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_var_def466); 

                    		TinySymbol s = new TinySymbol();
                    		s.setId((ID4!=null?ID4.getText():null));
                    		
                    		s.setDataType( ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype );
                    		
                    		Type classtype = Type.VAR;
                    		s.setClassType(classtype);
                    		
                    		s.setLine((ID4!=null?ID4.getLine():0));
                    		s.setPosition((ID4!=null?ID4.getCharPositionInLine():0));
                    		
                    		if (((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scope.equals("main")){
                    			if (!((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope.containsSymbol((ID4!=null?ID4.getText():null))){
                    				((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope.addSymbol(s);
                    			}
                    		}
                    		else {
                    			if (!((for_instruction_scope)for_instruction_stack.peek()).forall_table.containsSymbol((ID4!=null?ID4.getText():null))){
                    				((for_instruction_scope)for_instruction_stack.peek()).forall_table.addSymbol(s);
                    			}
                    		}
                    		
                    	
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:239:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_var_def474);
                    assignment5=assignment();

                    state._fsp--;


                    		if (((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scope.equals("main")){
                    			if ( !((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope.containsSymbol(assignment5.getId()) ){
                    				((reconfiguration_def_scope)reconfiguration_def_stack.peek()).main_scope.addSymbol(assignment5);
                    			}
                    		}
                    		else {
                    			if ( !((for_instruction_scope)for_instruction_stack.peek()).forall_table.containsSymbol(assignment5.getId()) ){
                    				((for_instruction_scope)for_instruction_stack.peek()).forall_table.addSymbol(assignment5);
                    			}
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
    // $ANTLR end "var_def"


    // $ANTLR start "assignment"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:254:1: assignment returns [TinySymbol symbol] : ^( ASSIGNMENT ID assignment_member ) ;
    public final TinySymbol assignment() throws RecognitionException {
        TinySymbol symbol = null;

        CommonTree ID6=null;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:255:2: ( ^( ASSIGNMENT ID assignment_member ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:255:4: ^( ASSIGNMENT ID assignment_member )
            {
            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment493); 

            match(input, Token.DOWN, null); 
            ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment495); 

            		TinySymbol s = new TinySymbol();
            		s.setId((ID6!=null?ID6.getText():null));
            		
            		s.setDataType( ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype );
            		
            		Type classtype = Type.VAR;
            		s.setClassType(classtype);
            		
            		s.setLine((ID6!=null?ID6.getLine():0));
            		s.setPosition((ID6!=null?ID6.getCharPositionInLine():0));
            		
            		symbol = s;
            	
            pushFollow(FOLLOW_assignment_member_in_assignment504);
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
        return symbol;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "assignment_member"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:274:1: assignment_member : ( expression | reconfiguration_apply );
    public final void assignment_member() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:275:2: ( expression | reconfiguration_apply )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:275:4: expression
                    {
                    pushFollow(FOLLOW_expression_in_assignment_member519);
                    expression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:276:4: reconfiguration_apply
                    {
                    pushFollow(FOLLOW_reconfiguration_apply_in_assignment_member525);
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
        return ;
    }
    // $ANTLR end "assignment_member"


    // $ANTLR start "reconfiguration_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:279:1: reconfiguration_call : ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) );
    public final void reconfiguration_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:280:2: ( ^( OP_JOIN operation_args ) | ^( OP_SPLIT operation_args ) | ^( OP_PAR operation_args ) | ^( OP_REMOVE operation_args ) | ^( OP_CONST operation_args ) | ^( OP_ID operation_args ) | ^( ID operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:280:4: ^( OP_JOIN operation_args )
                    {
                    match(input,OP_JOIN,FOLLOW_OP_JOIN_in_reconfiguration_call538); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call540);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:281:4: ^( OP_SPLIT operation_args )
                    {
                    match(input,OP_SPLIT,FOLLOW_OP_SPLIT_in_reconfiguration_call547); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call549);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:282:4: ^( OP_PAR operation_args )
                    {
                    match(input,OP_PAR,FOLLOW_OP_PAR_in_reconfiguration_call556); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call558);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:283:4: ^( OP_REMOVE operation_args )
                    {
                    match(input,OP_REMOVE,FOLLOW_OP_REMOVE_in_reconfiguration_call565); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call567);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:284:4: ^( OP_CONST operation_args )
                    {
                    match(input,OP_CONST,FOLLOW_OP_CONST_in_reconfiguration_call574); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call576);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:285:4: ^( OP_ID operation_args )
                    {
                    match(input,OP_ID,FOLLOW_OP_ID_in_reconfiguration_call583); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call585);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:286:4: ^( ID operation_args )
                    {
                    match(input,ID,FOLLOW_ID_in_reconfiguration_call592); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_reconfiguration_call594);
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
    // $ANTLR end "reconfiguration_call"


    // $ANTLR start "structure_operation_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:290:1: structure_operation_call : ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) );
    public final void structure_operation_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:291:2: ( ^( OP_PATH operation_args ) | ^( OP_UPDATE operation_args ) )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:291:4: ^( OP_PATH operation_args )
                    {
                    match(input,OP_PATH,FOLLOW_OP_PATH_in_structure_operation_call610); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call612);
                        operation_args();

                        state._fsp--;


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:292:4: ^( OP_UPDATE operation_args )
                    {
                    match(input,OP_UPDATE,FOLLOW_OP_UPDATE_in_structure_operation_call619); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        pushFollow(FOLLOW_operation_args_in_structure_operation_call621);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:296:1: operation_args : ( args )? ;
    public final void operation_args() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:297:2: ( ( args )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:297:4: ( args )?
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:297:4: ( args )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=OP_PATH && LA17_0<=OP_UPDATE)||(LA17_0>=OP_UNION && LA17_0<=OP_MINUS)||LA17_0==ID||(LA17_0>=TRIPLE && LA17_0<=XOR)||LA17_0==ACCESS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:297:4: args
                    {
                    pushFollow(FOLLOW_args_in_operation_args636);
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
        return ;
    }
    // $ANTLR end "operation_args"


    // $ANTLR start "args"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:300:1: args : ( expression )+ ;
    public final void args() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:301:2: ( ( expression )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:301:4: ( expression )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:301:4: ( expression )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:301:4: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_args649);
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
        return ;
    }
    // $ANTLR end "args"

    protected static class for_instruction_scope {
        TinySymbolsTable forall_table;
    }
    protected Stack for_instruction_stack = new Stack();


    // $ANTLR start "for_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:305:1: for_instruction : ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) ;
    public final void for_instruction() throws RecognitionException {
        for_instruction_stack.push(new for_instruction_scope());
        CommonTree id1=null;
        CommonTree id2=null;


        	
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype = new ArrayList<Type>();
        	((for_instruction_scope)for_instruction_stack.peek()).forall_table = new TinySymbolsTable();
        	((reconfiguration_def_scope)reconfiguration_def_stack.peek()).scope = "forall";
        	
        	if (((reclang_scope)reclang_stack.peek()).scopes.contains(((reclang_scope)reclang_stack.peek()).aux_id)){
        		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).aux_id;
        	}
        	else{
        		((reclang_scope)reclang_stack.peek()).parent_id = ((reclang_scope)reclang_stack.peek()).scopes.get(((reclang_scope)reclang_stack.peek()).scopes.size()-1);
        	}
        	
        	((for_instruction_scope)for_instruction_stack.peek()).forall_table.setScopeRel( new Pair<Integer, Integer>(((reclang_scope)reclang_stack.peek()).scope_id, ((reclang_scope)reclang_stack.peek()).parent_id) );
        	
        	((reclang_scope)reclang_stack.peek()).scopes.add(((reclang_scope)reclang_stack.peek()).scope_id);	
        	((reclang_scope)reclang_stack.peek()).scope_id++;
        	((reclang_scope)reclang_stack.peek()).aux_id++;

        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:328:2: ( ^( FORALL datatype id1= ID id2= ID reconfiguration_block ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:328:4: ^( FORALL datatype id1= ID id2= ID reconfiguration_block )
            {
            match(input,FORALL,FOLLOW_FORALL_in_for_instruction672); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_datatype_in_for_instruction674);
            datatype();

            state._fsp--;

            id1=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction678); 

            		TinySymbol s = new TinySymbol();
            		s.setId((id1!=null?id1.getText():null));
            		
            		s.setDataType( ((reconfiguration_def_scope)reconfiguration_def_stack.peek()).datatype );
            		
            		Type classtype = Type.VAR;
            		s.setClassType(classtype);
            		
            		s.setLine((id1!=null?id1.getLine():0));
            		s.setPosition((id1!=null?id1.getCharPositionInLine():0));
            		
            		if (!((for_instruction_scope)for_instruction_stack.peek()).forall_table.containsSymbol((id1!=null?id1.getText():null))){
            			((for_instruction_scope)for_instruction_stack.peek()).forall_table.addSymbol(s);
            		}
            	
            id2=(CommonTree)match(input,ID,FOLLOW_ID_in_for_instruction688); 
            pushFollow(FOLLOW_reconfiguration_block_in_for_instruction690);
            reconfiguration_block();

            state._fsp--;


            		((reconfiguration_def_scope)reconfiguration_def_stack.peek()).sub_scopes.add(((for_instruction_scope)for_instruction_stack.peek()).forall_table);
            	

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
        return ;
    }
    // $ANTLR end "for_instruction"


    // $ANTLR start "expression"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:354:1: expression : ( ^( OP_UNION factor factor ) | ^( OP_INTERSECTION factor factor ) | ^( OP_MINUS factor factor ) | factor );
    public final void expression() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:355:2: ( ^( OP_UNION factor factor ) | ^( OP_INTERSECTION factor factor ) | ^( OP_MINUS factor factor ) | factor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:355:4: ^( OP_UNION factor factor )
                    {
                    match(input,OP_UNION,FOLLOW_OP_UNION_in_expression711); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression713);
                    factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression715);
                    factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:356:4: ^( OP_INTERSECTION factor factor )
                    {
                    match(input,OP_INTERSECTION,FOLLOW_OP_INTERSECTION_in_expression722); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression724);
                    factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression726);
                    factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:357:4: ^( OP_MINUS factor factor )
                    {
                    match(input,OP_MINUS,FOLLOW_OP_MINUS_in_expression733); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factor_in_expression735);
                    factor();

                    state._fsp--;

                    pushFollow(FOLLOW_factor_in_expression737);
                    factor();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:358:4: factor
                    {
                    pushFollow(FOLLOW_factor_in_expression743);
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
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "factor"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:361:1: factor : ( ^( ID ID ) | ID | operation | constructor );
    public final void factor() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:362:2: ( ^( ID ID ) | ID | operation | constructor )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:362:4: ^( ID ID )
                    {
                    match(input,ID,FOLLOW_ID_in_factor755); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_factor757); 

                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:363:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_factor763); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:364:4: operation
                    {
                    pushFollow(FOLLOW_operation_in_factor768);
                    operation();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:365:4: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_factor773);
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
        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "operation"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:368:1: operation : ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call );
    public final void operation() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:369:2: ( ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call ) | structure_operation_call )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:369:4: ^( ACCESS ID ( ^( STRUCTURE ID ) )? attribute_call )
                    {
                    match(input,ACCESS,FOLLOW_ACCESS_in_operation786); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_operation788); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:369:16: ( ^( STRUCTURE ID ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==STRUCTURE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:369:17: ^( STRUCTURE ID )
                            {
                            match(input,STRUCTURE,FOLLOW_STRUCTURE_in_operation792); 

                            match(input, Token.DOWN, null); 
                            match(input,ID,FOLLOW_ID_in_operation794); 

                            match(input, Token.UP, null); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_attribute_call_in_operation799);
                    attribute_call();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:371:4: structure_operation_call
                    {
                    pushFollow(FOLLOW_structure_operation_call_in_operation806);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:374:1: constructor : ( triple_cons | pair_cons | set_cons | node_cons | xor_cons );
    public final void constructor() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:375:2: ( triple_cons | pair_cons | set_cons | node_cons | xor_cons )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:375:4: triple_cons
                    {
                    pushFollow(FOLLOW_triple_cons_in_constructor818);
                    triple_cons();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:376:4: pair_cons
                    {
                    pushFollow(FOLLOW_pair_cons_in_constructor823);
                    pair_cons();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:377:4: set_cons
                    {
                    pushFollow(FOLLOW_set_cons_in_constructor828);
                    set_cons();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:378:4: node_cons
                    {
                    pushFollow(FOLLOW_node_cons_in_constructor833);
                    node_cons();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:379:4: xor_cons
                    {
                    pushFollow(FOLLOW_xor_cons_in_constructor838);
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
        return ;
    }
    // $ANTLR end "constructor"


    // $ANTLR start "attribute_call"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:388:1: attribute_call : ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID );
    public final void attribute_call() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:389:2: ( ^( OP_IN ( INT )? ) | ^( OP_OUT ( INT )? ) | OP_NAME | OP_NODES | OP_NAMES | OP_FST | OP_SND | OP_TRD | ID )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:389:4: ^( OP_IN ( INT )? )
                    {
                    match(input,OP_IN,FOLLOW_OP_IN_in_attribute_call858); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:389:12: ( INT )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==INT) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:389:12: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call860); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:390:4: ^( OP_OUT ( INT )? )
                    {
                    match(input,OP_OUT,FOLLOW_OP_OUT_in_attribute_call868); 

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:390:13: ( INT )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==INT) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:390:13: INT
                                {
                                match(input,INT,FOLLOW_INT_in_attribute_call870); 

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:391:4: OP_NAME
                    {
                    match(input,OP_NAME,FOLLOW_OP_NAME_in_attribute_call877); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:392:4: OP_NODES
                    {
                    match(input,OP_NODES,FOLLOW_OP_NODES_in_attribute_call882); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:393:4: OP_NAMES
                    {
                    match(input,OP_NAMES,FOLLOW_OP_NAMES_in_attribute_call887); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:395:4: OP_FST
                    {
                    match(input,OP_FST,FOLLOW_OP_FST_in_attribute_call893); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:396:4: OP_SND
                    {
                    match(input,OP_SND,FOLLOW_OP_SND_in_attribute_call898); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:397:4: OP_TRD
                    {
                    match(input,OP_TRD,FOLLOW_OP_TRD_in_attribute_call903); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:398:4: ID
                    {
                    match(input,ID,FOLLOW_ID_in_attribute_call908); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:402:1: triple_cons : ^( TRIPLE expression expression expression ) ;
    public final void triple_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:403:2: ( ^( TRIPLE expression expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:403:4: ^( TRIPLE expression expression expression )
            {
            match(input,TRIPLE,FOLLOW_TRIPLE_in_triple_cons923); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_triple_cons925);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons927);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_triple_cons929);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:407:1: pair_cons : ^( PAIR expression expression ) ;
    public final void pair_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:408:2: ( ^( PAIR expression expression ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:408:4: ^( PAIR expression expression )
            {
            match(input,PAIR,FOLLOW_PAIR_in_pair_cons946); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_pair_cons948);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_pair_cons950);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:413:1: set_cons : ^( SET ( expression )* ) ;
    public final void set_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:414:2: ( ^( SET ( expression )* ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:414:4: ^( SET ( expression )* )
            {
            match(input,SET,FOLLOW_SET_in_set_cons968); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:414:10: ( expression )*
                loop27:
                do {
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=OP_PATH && LA27_0<=OP_UPDATE)||(LA27_0>=OP_UNION && LA27_0<=OP_MINUS)||LA27_0==ID||(LA27_0>=TRIPLE && LA27_0<=XOR)||LA27_0==ACCESS) ) {
                        alt27=1;
                    }


                    switch (alt27) {
                	case 1 :
                	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:414:10: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_set_cons970);
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
        return ;
    }
    // $ANTLR end "set_cons"


    // $ANTLR start "node_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:418:1: node_cons : ^( NODE ( ID )+ ) ;
    public final void node_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:419:2: ( ^( NODE ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:419:4: ^( NODE ( ID )+ )
            {
            match(input,NODE,FOLLOW_NODE_in_node_cons989); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:419:11: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:419:11: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_node_cons991); 

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
        return ;
    }
    // $ANTLR end "node_cons"


    // $ANTLR start "xor_cons"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:422:1: xor_cons : ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) ;
    public final void xor_cons() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:423:2: ( ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:423:4: ^( XOR ^( IN ID ( ID )* ) ^( OUT ID ( ID )+ ) )
            {
            match(input,XOR,FOLLOW_XOR_in_xor_cons1007); 

            match(input, Token.DOWN, null); 
            match(input,IN,FOLLOW_IN_in_xor_cons1011); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1013); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:423:19: ( ID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:423:19: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1015); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match(input, Token.UP, null); 
            match(input,OUT,FOLLOW_OUT_in_xor_cons1020); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_xor_cons1022); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:423:33: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:423:33: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_xor_cons1024); 

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
        return ;
    }
    // $ANTLR end "xor_cons"


    // $ANTLR start "applicaiton_def"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:428:1: applicaiton_def : ID list_reconfigurations ( trigger_def )? ;
    public final void applicaiton_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:429:2: ( ID list_reconfigurations ( trigger_def )? )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:429:4: ID list_reconfigurations ( trigger_def )?
            {
            match(input,ID,FOLLOW_ID_in_applicaiton_def1042); 
            pushFollow(FOLLOW_list_reconfigurations_in_applicaiton_def1044);
            list_reconfigurations();

            state._fsp--;

            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:429:29: ( trigger_def )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SEP_BLOCK_START) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:429:29: trigger_def
                    {
                    pushFollow(FOLLOW_trigger_def_in_applicaiton_def1046);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:432:1: list_reconfigurations : ( reconfiguration_call )+ ;
    public final void list_reconfigurations() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:433:2: ( ( reconfiguration_call )+ )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:433:4: ( reconfiguration_call )+
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:433:4: ( reconfiguration_call )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:433:4: reconfiguration_call
            	    {
            	    pushFollow(FOLLOW_reconfiguration_call_in_list_reconfigurations1059);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:436:1: trigger_def : trigger_block ;
    public final void trigger_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:437:2: ( trigger_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:437:4: trigger_block
            {
            pushFollow(FOLLOW_trigger_block_in_trigger_def1072);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:440:1: trigger_block : SEP_BLOCK_START SEP_BLOCK_END ;
    public final void trigger_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:441:2: ( SEP_BLOCK_START SEP_BLOCK_END )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:441:4: SEP_BLOCK_START SEP_BLOCK_END
            {
            match(input,SEP_BLOCK_START,FOLLOW_SEP_BLOCK_START_in_trigger_block1084); 
            match(input,SEP_BLOCK_END,FOLLOW_SEP_BLOCK_END_in_trigger_block1086); 

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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:447:1: main_def : ( main_args )? main_block ;
    public final void main_def() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:448:2: ( ( main_args )? main_block )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:448:4: ( main_args )? main_block
            {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:448:4: ( main_args )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ARGUMENTS) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:448:4: main_args
                    {
                    pushFollow(FOLLOW_main_args_in_main_def1100);
                    main_args();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_main_block_in_main_def1103);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:451:1: main_args : ^( ARGUMENTS ( main_arg )+ ) ;
    public final void main_args() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:452:2: ( ^( ARGUMENTS ( main_arg )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:452:4: ^( ARGUMENTS ( main_arg )+ )
            {
            match(input,ARGUMENTS,FOLLOW_ARGUMENTS_in_main_args1115); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:452:16: ( main_arg )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:452:16: main_arg
            	    {
            	    pushFollow(FOLLOW_main_arg_in_main_args1117);
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
        return ;
    }
    // $ANTLR end "main_args"


    // $ANTLR start "main_arg"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:455:1: main_arg : ^( ARGUMENT ID ids ) ;
    public final void main_arg() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:456:2: ( ^( ARGUMENT ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:456:4: ^( ARGUMENT ID ids )
            {
            match(input,ARGUMENT,FOLLOW_ARGUMENT_in_main_arg1131); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_arg1133); 
            pushFollow(FOLLOW_ids_in_main_arg1135);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:459:1: ids : ^( IDS ( ID )+ ) ;
    public final void ids() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:460:2: ( ^( IDS ( ID )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:460:4: ^( IDS ( ID )+ )
            {
            match(input,IDS,FOLLOW_IDS_in_ids1149); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:460:10: ( ID )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:460:10: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_ids1151); 

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
    // $ANTLR end "ids"


    // $ANTLR start "main_block"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:464:1: main_block : ^( INSTRUCTIONS ( main_instruction )+ ) ;
    public final void main_block() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:465:2: ( ^( INSTRUCTIONS ( main_instruction )+ ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:465:4: ^( INSTRUCTIONS ( main_instruction )+ )
            {
            match(input,INSTRUCTIONS,FOLLOW_INSTRUCTIONS_in_main_block1168); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:465:19: ( main_instruction )+
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
            	    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:465:19: main_instruction
            	    {
            	    pushFollow(FOLLOW_main_instruction_in_main_block1170);
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
        return ;
    }
    // $ANTLR end "main_block"


    // $ANTLR start "main_instruction"
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:468:1: main_instruction : ( main_declaration | main_assignment );
    public final void main_instruction() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:469:2: ( main_declaration | main_assignment )
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
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:469:4: main_declaration
                    {
                    pushFollow(FOLLOW_main_declaration_in_main_instruction1183);
                    main_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:470:4: main_assignment
                    {
                    pushFollow(FOLLOW_main_assignment_in_main_instruction1188);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:473:1: main_declaration : ^( DECLARATION ID ids ) ;
    public final void main_declaration() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:474:2: ( ^( DECLARATION ID ids ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:474:4: ^( DECLARATION ID ids )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_main_declaration1200); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_declaration1202); 
            pushFollow(FOLLOW_ids_in_main_declaration1204);
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
    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:477:1: main_assignment : ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) ) ;
    public final void main_assignment() throws RecognitionException {
        try {
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:478:2: ( ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) ) )
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:478:4: ^( APPLICATION ( ^( DECLARATION ( ID )? ids ) )? ^( OP_APPLY ID reconfiguration_call ) )
            {
            match(input,APPLICATION,FOLLOW_APPLICATION_in_main_assignment1218); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:478:19: ( ^( DECLARATION ( ID )? ids ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==DECLARATION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:478:21: ^( DECLARATION ( ID )? ids )
                    {
                    match(input,DECLARATION,FOLLOW_DECLARATION_in_main_assignment1223); 

                    match(input, Token.DOWN, null); 
                    // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:478:35: ( ID )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\Users\\Flavio\\Documents\\GitHub\\doctools\\ReoLang\\ReoLangSpecs\\RecTG.g:478:35: ID
                            {
                            match(input,ID,FOLLOW_ID_in_main_assignment1225); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ids_in_main_assignment1228);
                    ids();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            match(input,OP_APPLY,FOLLOW_OP_APPLY_in_main_assignment1235); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_main_assignment1237); 
            pushFollow(FOLLOW_reconfiguration_call_in_main_assignment1239);
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


 

    public static final BitSet FOLLOW_RECONFIGS_in_reclang61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_def_in_reclang63 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000180L});
    public static final BitSet FOLLOW_element_in_reclang66 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000100L});
    public static final BitSet FOLLOW_directive_import_in_directive_def92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_directive_import106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_directive_import108 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RECONFIGURATION_in_element127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_def_in_element129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_element136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_applicaiton_def_in_element138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MAIN_in_element146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_def_in_element148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_def170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_args_def_in_reconfiguration_def179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_reconfiguration_def182 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGUMENTS_in_args_def205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arg_def_in_args_def207 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_arg_def228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_arg_def230 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_list_ids_in_arg_def232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_PATTERN_in_datatype245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_CHANNEL_in_datatype252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NAME_in_datatype259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_NODE_in_datatype266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_XOR_in_datatype274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_type_in_datatype286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_in_datatype292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DT_SET_in_other_type310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_PAIR_in_other_type320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DT_TRIPLE_in_other_type329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_subtype342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_list_ids355 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_reconfiguration_block377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_reconfiguration_block379 = new BitSet(new long[]{0x0000001000000008L,0x000000000000E000L});
    public static final BitSet FOLLOW_declaration_in_instruction393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_instruction398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_instruction403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_instruction_in_instruction408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_APPLY_in_reconfiguration_apply424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reconfiguration_call_in_reconfiguration_apply426 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_apply428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_declaration450 = new BitSet(new long[]{0x2000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_var_def_in_declaration452 = new BitSet(new long[]{0x2000000000000008L,0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_var_def466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_var_def474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment493 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment495 = new BitSet(new long[]{0x200000F000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_assignment_member_in_assignment504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_assignment_member519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_apply_in_assignment_member525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_JOIN_in_reconfiguration_call538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call540 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_SPLIT_in_reconfiguration_call547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PAR_in_reconfiguration_call556 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_REMOVE_in_reconfiguration_call565 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_CONST_in_reconfiguration_call574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call576 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_ID_in_reconfiguration_call583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call585 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_reconfiguration_call592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_reconfiguration_call594 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_PATH_in_structure_operation_call610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UPDATE_in_structure_operation_call619 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_operation_args_in_structure_operation_call621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_args_in_operation_args636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_args649 = new BitSet(new long[]{0x200000E000C00002L,0x00000000009F0000L});
    public static final BitSet FOLLOW_FORALL_in_for_instruction672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_datatype_in_for_instruction674 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction678 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_for_instruction688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_reconfiguration_block_in_for_instruction690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_UNION_in_expression711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression713 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_INTERSECTION_in_expression722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression724 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression726 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_MINUS_in_expression733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_expression735 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_factor_in_expression737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_expression743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_factor757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_factor763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operation_in_factor768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_factor773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_operation786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation788 = new BitSet(new long[]{0x20000001BF000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_STRUCTURE_in_operation792 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_operation794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_attribute_call_in_operation799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_structure_operation_call_in_operation806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triple_cons_in_constructor818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_cons_in_constructor823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_cons_in_constructor828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_cons_in_constructor833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xor_cons_in_constructor838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_IN_in_attribute_call858 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call860 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_OUT_in_attribute_call868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_attribute_call870 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_NAME_in_attribute_call877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NODES_in_attribute_call882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NAMES_in_attribute_call887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_FST_in_attribute_call893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_SND_in_attribute_call898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_TRD_in_attribute_call903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_attribute_call908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRIPLE_in_triple_cons923 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_triple_cons925 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons927 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_triple_cons929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PAIR_in_pair_cons946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_pair_cons948 = new BitSet(new long[]{0x200000E000C00000L,0x00000000009F0000L});
    public static final BitSet FOLLOW_expression_in_pair_cons950 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set_cons968 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_set_cons970 = new BitSet(new long[]{0x200000E000C00008L,0x00000000009F0000L});
    public static final BitSet FOLLOW_NODE_in_node_cons989 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_node_cons991 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_XOR_in_xor_cons1007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_in_xor_cons1011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1013 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_xor_cons1015 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_OUT_in_xor_cons1020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_xor_cons1022 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_ID_in_xor_cons1024 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_ID_in_applicaiton_def1042 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_list_reconfigurations_in_applicaiton_def1044 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_trigger_def_in_applicaiton_def1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reconfiguration_call_in_list_reconfigurations1059 = new BitSet(new long[]{0x20000000003F0002L});
    public static final BitSet FOLLOW_trigger_block_in_trigger_def1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEP_BLOCK_START_in_trigger_block1084 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SEP_BLOCK_END_in_trigger_block1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_args_in_main_def1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_main_block_in_main_def1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENTS_in_main_args1115 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_arg_in_main_args1117 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARGUMENT_in_main_arg1131 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_arg1133 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_arg1135 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDS_in_ids1149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_ids1151 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_INSTRUCTIONS_in_main_block1168 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_main_instruction_in_main_block1170 = new BitSet(new long[]{0x0000000000000008L,0x0000000002002000L});
    public static final BitSet FOLLOW_main_declaration_in_main_instruction1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_assignment_in_main_instruction1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARATION_in_main_declaration1200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_declaration1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_declaration1204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_APPLICATION_in_main_assignment1218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DECLARATION_in_main_assignment1223 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ids_in_main_assignment1228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OP_APPLY_in_main_assignment1235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_main_assignment1237 = new BitSet(new long[]{0x20000000003F0000L});
    public static final BitSet FOLLOW_reconfiguration_call_in_main_assignment1239 = new BitSet(new long[]{0x0000000000000008L});

}