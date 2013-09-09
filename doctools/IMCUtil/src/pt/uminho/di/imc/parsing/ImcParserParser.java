// $ANTLR 3.4 /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g 2012-11-20 17:40:33

	package pt.uminho.di.imc.parsing;
	import pt.uminho.di.imc.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ImcParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "EXPONENT", "FLOAT", "NAME", "NUMBER", "STATE_ID", "WS"
    };

    public static final int EOF=-1;
    public static final int COMMENT=4;
    public static final int EXPONENT=5;
    public static final int FLOAT=6;
    public static final int NAME=7;
    public static final int NUMBER=8;
    public static final int STATE_ID=9;
    public static final int WS=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ImcParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ImcParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ImcParserParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g"; }


    	private IMC imc;
    	
    	public IMC getIMC(){
    		return this.imc;
    	}



    // $ANTLR start "imc"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:23:1: imc : initial_states ( goal_states )? transitions ;
    public final void imc() throws RecognitionException {

        	this.imc = new IMC();

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:27:2: ( initial_states ( goal_states )? transitions )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:27:4: initial_states ( goal_states )? transitions
            {
            pushFollow(FOLLOW_initial_states_in_imc38);
            initial_states();

            state._fsp--;


            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:27:19: ( goal_states )?
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:27:19: goal_states
                    {
                    pushFollow(FOLLOW_goal_states_in_imc40);
                    goal_states();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_transitions_in_imc43);
            transitions();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "imc"



    // $ANTLR start "initial_states"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:32:1: initial_states : ( state )+ COMMENT ;
    public final void initial_states() throws RecognitionException {
        String state1 =null;


        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:33:2: ( ( state )+ COMMENT )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:33:4: ( state )+ COMMENT
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:33:4: ( state )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NAME||LA2_0==STATE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:33:6: state
            	    {
            	    pushFollow(FOLLOW_state_in_initial_states59);
            	    state1=state();

            	    state._fsp--;



            	    		this.imc.addInitialState(state1);
            	    	

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


            match(input,COMMENT,FOLLOW_COMMENT_in_initial_states69); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "initial_states"



    // $ANTLR start "goal_states"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:43:1: goal_states : ( state )+ COMMENT ;
    public final void goal_states() throws RecognitionException {
        String state2 =null;


        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:44:2: ( ( state )+ COMMENT )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:44:4: ( state )+ COMMENT
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:44:4: ( state )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NAME||LA3_0==STATE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:44:6: state
            	    {
            	    pushFollow(FOLLOW_state_in_goal_states86);
            	    state2=state();

            	    state._fsp--;



            	    		this.imc.addGoalState(state2);
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input,COMMENT,FOLLOW_COMMENT_in_goal_states96); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "goal_states"



    // $ANTLR start "transitions"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:54:1: transitions : (i= state f= state transition_label )+ ;
    public final void transitions() throws RecognitionException {
        String i =null;

        String f =null;

        ImcParserParser.transition_label_return transition_label3 =null;



        	Transition t;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:58:2: ( (i= state f= state transition_label )+ )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:58:4: (i= state f= state transition_label )+
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:58:4: (i= state f= state transition_label )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NAME||LA4_0==STATE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:58:5: i= state f= state transition_label
            	    {
            	    pushFollow(FOLLOW_state_in_transitions118);
            	    i=state();

            	    state._fsp--;


            	    pushFollow(FOLLOW_state_in_transitions122);
            	    f=state();

            	    state._fsp--;


            	    pushFollow(FOLLOW_transition_label_in_transitions124);
            	    transition_label3=transition_label();

            	    state._fsp--;



            	    		if((transition_label3!=null?transition_label3.type:null).equals("MARKOVIAN")){
            	    			t = new MarkovianTransition(i, f, Double.parseDouble((transition_label3!=null?transition_label3.label:null)));		
            	    		}
            	    		else {
            	    			t = new InteractiveTransition(i, f, (transition_label3!=null?transition_label3.label:null));
            	    		}
            	    		
            	    		this.imc.addTransition(t);
            	    		this.imc.addState(i);
            	    		this.imc.addState(f);
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "transitions"


    public static class transition_label_return extends ParserRuleReturnScope {
        public String label;
        public String type;
    };


    // $ANTLR start "transition_label"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:77:1: transition_label returns [String label, String type] : ( action | rate );
    public final ImcParserParser.transition_label_return transition_label() throws RecognitionException {
        ImcParserParser.transition_label_return retval = new ImcParserParser.transition_label_return();
        retval.start = input.LT(1);


        String action4 =null;

        String rate5 =null;


        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:78:2: ( action | rate )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAME) ) {
                alt5=1;
            }
            else if ( (LA5_0==NUMBER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:78:4: action
                    {
                    pushFollow(FOLLOW_action_in_transition_label149);
                    action4=action();

                    state._fsp--;



                    		retval.label = action4;
                    		retval.type = "INTERACTIVE";
                    	

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:83:4: rate
                    {
                    pushFollow(FOLLOW_rate_in_transition_label158);
                    rate5=rate();

                    state._fsp--;



                    		retval.label = rate5;
                    		retval.type = "MARKOVIAN";
                    	

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "transition_label"



    // $ANTLR start "state"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:94:1: state returns [String name] : ( STATE_ID | NAME );
    public final String state() throws RecognitionException {
        String name = null;


        Token STATE_ID6=null;
        Token NAME7=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:95:2: ( STATE_ID | NAME )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==STATE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==NAME) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:95:5: STATE_ID
                    {
                    STATE_ID6=(Token)match(input,STATE_ID,FOLLOW_STATE_ID_in_state181); 


                    		name = (STATE_ID6!=null?STATE_ID6.getText():null);
                    	

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:99:4: NAME
                    {
                    NAME7=(Token)match(input,NAME,FOLLOW_NAME_in_state189); 


                    		name = (NAME7!=null?NAME7.getText():null);
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "state"



    // $ANTLR start "action"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:108:1: action returns [String name] : NAME ;
    public final String action() throws RecognitionException {
        String name = null;


        Token NAME8=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:109:2: ( NAME )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:109:4: NAME
            {
            NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_action215); 


            		name = (NAME8!=null?NAME8.getText():null);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return name;
    }
    // $ANTLR end "action"



    // $ANTLR start "rate"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:117:1: rate returns [String value] : NUMBER ;
    public final String rate() throws RecognitionException {
        String value = null;


        Token NUMBER9=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:118:2: ( NUMBER )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/ImcParser.g:118:4: NUMBER
            {
            NUMBER9=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rate238); 


            		value = (NUMBER9!=null?NUMBER9.getText():null);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "rate"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\10\uffff";
    static final String DFA1_eofS =
        "\6\uffff\1\7\1\uffff";
    static final String DFA1_minS =
        "\1\7\2\4\1\uffff\3\4\1\uffff";
    static final String DFA1_maxS =
        "\3\11\1\uffff\3\11\1\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\3\uffff\1\2";
    static final String DFA1_specialS =
        "\10\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\1\1",
            "\1\3\2\uffff\1\5\1\uffff\1\4",
            "\1\3\2\uffff\1\5\1\uffff\1\4",
            "",
            "\1\3\2\uffff\1\6\1\7\1\3",
            "\1\3\2\uffff\1\6\1\7\1\3",
            "\1\3\2\uffff\1\2\1\uffff\1\1",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "27:19: ( goal_states )?";
        }
    }
 

    public static final BitSet FOLLOW_initial_states_in_imc38 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_goal_states_in_imc40 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_transitions_in_imc43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_initial_states59 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_COMMENT_in_initial_states69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_goal_states86 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_COMMENT_in_goal_states96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_transitions118 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_state_in_transitions122 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_transition_label_in_transitions124 = new BitSet(new long[]{0x0000000000000282L});
    public static final BitSet FOLLOW_action_in_transition_label149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rate_in_transition_label158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATE_ID_in_state181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_state189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_action215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_rate238 = new BitSet(new long[]{0x0000000000000002L});

}