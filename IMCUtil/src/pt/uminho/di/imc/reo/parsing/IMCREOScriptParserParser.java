// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g 2014-04-02 12:38:07

	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.imc.*;
	import pt.uminho.di.imc.util.Pair;
	import java.util.LinkedHashSet;
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IMCREOScriptParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "FLOAT", "LABEL", "EXPONENT", "COMMENT", "WS", "'sync_'", "'drain_'", "'lossy_'", "'fifo1e_'", "'fifo1f_'", "'mer_rep'", "'mer_xor'", "'['", "']'", "'env'"
    };
    public static final int EXPONENT=8;
    public static final int T__20=20;
    public static final int NUMBER=5;
    public static final int FLOAT=6;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int WS=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int LABEL=7;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int COMMENT=9;

    // delegates
    // delegators


        public IMCREOScriptParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IMCREOScriptParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return IMCREOScriptParserParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g"; }





    // $ANTLR start "script"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:21:1: script : ( element )+ ( environment )+ ;
    public final void script() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:22:2: ( ( element )+ ( environment )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:22:4: ( element )+ ( environment )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:22:4: ( element )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:22:4: element
            	    {
            	    pushFollow(FOLLOW_element_in_script34);
            	    element();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:22:13: ( environment )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:22:13: environment
            	    {
            	    pushFollow(FOLLOW_environment_in_script37);
            	    environment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // $ANTLR end "script"


    // $ANTLR start "element"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:25:1: element : ( channel | node );
    public final void element() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:25:9: ( channel | node )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=15)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:25:11: channel
                    {
                    pushFollow(FOLLOW_channel_in_element48);
                    channel();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:26:5: node
                    {
                    pushFollow(FOLLOW_node_in_element55);
                    node();

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
    // $ANTLR end "element"


    // $ANTLR start "channel"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:29:1: channel : ( 'sync_' identification stoch | 'drain_' identification stoch | 'lossy_' identification stoch stoch | 'fifo1e_' identification stoch stoch | 'fifo1f_' identification stoch stoch );
    public final void channel() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:29:9: ( 'sync_' identification stoch | 'drain_' identification stoch | 'lossy_' identification stoch stoch | 'fifo1e_' identification stoch stoch | 'fifo1f_' identification stoch stoch )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:29:11: 'sync_' identification stoch
                    {
                    match(input,11,FOLLOW_11_in_channel66); 
                    pushFollow(FOLLOW_identification_in_channel68);
                    identification();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel70);
                    stoch();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:30:4: 'drain_' identification stoch
                    {
                    match(input,12,FOLLOW_12_in_channel75); 
                    pushFollow(FOLLOW_identification_in_channel77);
                    identification();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel79);
                    stoch();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:31:4: 'lossy_' identification stoch stoch
                    {
                    match(input,13,FOLLOW_13_in_channel84); 
                    pushFollow(FOLLOW_identification_in_channel86);
                    identification();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel88);
                    stoch();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel90);
                    stoch();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:32:4: 'fifo1e_' identification stoch stoch
                    {
                    match(input,14,FOLLOW_14_in_channel95); 
                    pushFollow(FOLLOW_identification_in_channel97);
                    identification();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel99);
                    stoch();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel101);
                    stoch();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:33:4: 'fifo1f_' identification stoch stoch
                    {
                    match(input,15,FOLLOW_15_in_channel106); 
                    pushFollow(FOLLOW_identification_in_channel108);
                    identification();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel110);
                    stoch();

                    state._fsp--;

                    pushFollow(FOLLOW_stoch_in_channel112);
                    stoch();

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
    // $ANTLR end "channel"


    // $ANTLR start "identification"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:36:1: identification : id= ID p1= ID p2= ID ;
    public final void identification() throws RecognitionException {
        Token id=null;
        Token p1=null;
        Token p2=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:37:2: (id= ID p1= ID p2= ID )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:37:5: id= ID p1= ID p2= ID
            {
            id=(Token)match(input,ID,FOLLOW_ID_in_identification127); 
            p1=(Token)match(input,ID,FOLLOW_ID_in_identification131); 
            p2=(Token)match(input,ID,FOLLOW_ID_in_identification135); 

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
    // $ANTLR end "identification"


    // $ANTLR start "stoch"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:40:1: stoch : NUMBER ;
    public final void stoch() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:40:8: ( NUMBER )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:40:11: NUMBER
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_stoch147); 

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
    // $ANTLR end "stoch"


    // $ANTLR start "node"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:43:1: node : ( 'mer_rep' identification2 ( stoch stoch )? | 'mer_xor' identification2 ( stoch stoch )? );
    public final void node() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:43:6: ( 'mer_rep' identification2 ( stoch stoch )? | 'mer_xor' identification2 ( stoch stoch )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:43:8: 'mer_rep' identification2 ( stoch stoch )?
                    {
                    match(input,16,FOLLOW_16_in_node158); 
                    pushFollow(FOLLOW_identification2_in_node160);
                    identification2();

                    state._fsp--;

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:43:34: ( stoch stoch )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==NUMBER) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:43:35: stoch stoch
                            {
                            pushFollow(FOLLOW_stoch_in_node163);
                            stoch();

                            state._fsp--;

                            pushFollow(FOLLOW_stoch_in_node165);
                            stoch();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:44:4: 'mer_xor' identification2 ( stoch stoch )?
                    {
                    match(input,17,FOLLOW_17_in_node172); 
                    pushFollow(FOLLOW_identification2_in_node174);
                    identification2();

                    state._fsp--;

                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:44:30: ( stoch stoch )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==NUMBER) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:44:31: stoch stoch
                            {
                            pushFollow(FOLLOW_stoch_in_node177);
                            stoch();

                            state._fsp--;

                            pushFollow(FOLLOW_stoch_in_node179);
                            stoch();

                            state._fsp--;


                            }
                            break;

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
    // $ANTLR end "node"


    // $ANTLR start "identification2"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:47:1: identification2 : '[' ( ID )+ ']' '[' ( ID )+ ']' ;
    public final void identification2() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:48:2: ( '[' ( ID )+ ']' '[' ( ID )+ ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:48:4: '[' ( ID )+ ']' '[' ( ID )+ ']'
            {
            match(input,18,FOLLOW_18_in_identification2193); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:48:8: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:48:8: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_identification2195); 

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

            match(input,19,FOLLOW_19_in_identification2197); 
            match(input,18,FOLLOW_18_in_identification2199); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:48:19: ( ID )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:48:19: ID
            	    {
            	    match(input,ID,FOLLOW_ID_in_identification2201); 

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

            match(input,19,FOLLOW_19_in_identification2203); 

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
    // $ANTLR end "identification2"


    // $ANTLR start "environment"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:51:1: environment : 'env' ID stoch ;
    public final void environment() throws RecognitionException {
        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:52:2: ( 'env' ID stoch )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/IMCREOScriptParser.g:52:4: 'env' ID stoch
            {
            match(input,20,FOLLOW_20_in_environment216); 
            match(input,ID,FOLLOW_ID_in_environment218); 
            pushFollow(FOLLOW_stoch_in_environment220);
            stoch();

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
    // $ANTLR end "environment"

    // Delegated rules


 

    public static final BitSet FOLLOW_element_in_script34 = new BitSet(new long[]{0x000000000013F800L});
    public static final BitSet FOLLOW_environment_in_script37 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_channel_in_element48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_node_in_element55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_channel66 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_channel75 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel77 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_channel84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel88 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_channel95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel97 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel99 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_channel106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identification_in_channel108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_channel112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identification127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_stoch147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_node158 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_identification2_in_node160 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_stoch_in_node163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_node165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_node172 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_identification2_in_node174 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_stoch_in_node177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_node179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_identification2193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification2195 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_identification2197 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_identification2199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_identification2201 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_19_in_identification2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_environment216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_environment218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_stoch_in_environment220 = new BitSet(new long[]{0x0000000000000002L});

}