// $ANTLR 3.4 /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g 2012-11-28 13:23:42

	package pt.uminho.di.imc.parsing;
	import pt.uminho.di.imc.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MAParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "EXPONENT", "FLOAT", "NAME", "NUMBER", "STATE_ID", "WS", "'!'", "'#GOALS'", "'#INITIALS'", "'#TRANSITIONS'", "'*'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
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


    public MAParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MAParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return MAParserParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g"; }


    	private IMC imc;
    	
    	public IMC getIMC(){
    		return this.imc;
    	}



    // $ANTLR start "imc"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:23:1: imc : '#INITIALS' initial_states '#GOALS' goal_states '#TRANSITIONS' transitions ;
    public final void imc() throws RecognitionException {

        	this.imc = new IMC();

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:27:2: ( '#INITIALS' initial_states '#GOALS' goal_states '#TRANSITIONS' transitions )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:27:4: '#INITIALS' initial_states '#GOALS' goal_states '#TRANSITIONS' transitions
            {
            match(input,13,FOLLOW_13_in_imc38); 

            pushFollow(FOLLOW_initial_states_in_imc40);
            initial_states();

            state._fsp--;


            match(input,12,FOLLOW_12_in_imc42); 

            pushFollow(FOLLOW_goal_states_in_imc44);
            goal_states();

            state._fsp--;


            match(input,14,FOLLOW_14_in_imc46); 

            pushFollow(FOLLOW_transitions_in_imc48);
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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:32:1: initial_states : ( state )+ ;
    public final void initial_states() throws RecognitionException {
        String state1 =null;


        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:33:2: ( ( state )+ )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:33:4: ( state )+
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:33:4: ( state )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NAME||LA1_0==STATE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:33:6: state
            	    {
            	    pushFollow(FOLLOW_state_in_initial_states64);
            	    state1=state();

            	    state._fsp--;



            	    		this.imc.addInitialState(state1);
            	    	

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:43:1: goal_states : ( state )+ ;
    public final void goal_states() throws RecognitionException {
        String state2 =null;


        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:44:2: ( ( state )+ )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:44:4: ( state )+
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:44:4: ( state )+
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
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:44:6: state
            	    {
            	    pushFollow(FOLLOW_state_in_goal_states89);
            	    state2=state();

            	    state._fsp--;



            	    		this.imc.addGoalState(state2);
            	    	

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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "goal_states"



    // $ANTLR start "transitions"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:54:1: transitions : ( state transition_label ( transition_edge[$state.name, $transition_label.label, $transition_label.type] )+ )+ ;
    public final void transitions() throws RecognitionException {
        String state3 =null;

        MAParserParser.transition_label_return transition_label4 =null;


        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:55:2: ( ( state transition_label ( transition_edge[$state.name, $transition_label.label, $transition_label.type] )+ )+ )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:55:4: ( state transition_label ( transition_edge[$state.name, $transition_label.label, $transition_label.type] )+ )+
            {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:55:4: ( state transition_label ( transition_edge[$state.name, $transition_label.label, $transition_label.type] )+ )+
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
            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:55:5: state transition_label ( transition_edge[$state.name, $transition_label.label, $transition_label.type] )+
            	    {
            	    pushFollow(FOLLOW_state_in_transitions113);
            	    state3=state();

            	    state._fsp--;


            	    pushFollow(FOLLOW_transition_label_in_transitions115);
            	    transition_label4=transition_label();

            	    state._fsp--;


            	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:55:28: ( transition_edge[$state.name, $transition_label.label, $transition_label.type] )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:55:29: transition_edge[$state.name, $transition_label.label, $transition_label.type]
            	    	    {
            	    	    pushFollow(FOLLOW_transition_edge_in_transitions118);
            	    	    transition_edge(state3, (transition_label4!=null?transition_label4.label:null), (transition_label4!=null?transition_label4.type:null));

            	    	    state._fsp--;


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



            	    		this.imc.addState(state3);
            	    	

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:65:1: transition_label returns [String label, String type] : ( action | '!' );
    public final MAParserParser.transition_label_return transition_label() throws RecognitionException {
        MAParserParser.transition_label_return retval = new MAParserParser.transition_label_return();
        retval.start = input.LT(1);


        String action5 =null;


        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:66:2: ( action | '!' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==NAME) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:66:4: action
                    {
                    pushFollow(FOLLOW_action_in_transition_label147);
                    action5=action();

                    state._fsp--;



                    		retval.label = action5;
                    		retval.type = "INTERACTIVE";
                    	

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:71:4: '!'
                    {
                    match(input,11,FOLLOW_11_in_transition_label156); 


                    		retval.label = "";
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



    // $ANTLR start "transition_edge"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:81:1: transition_edge[String initial_state, String action, String trans_type] : '*' state rate ;
    public final void transition_edge(String initial_state, String action, String trans_type) throws RecognitionException {
        String state6 =null;

        Double rate7 =null;



        	Transition t;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:85:2: ( '*' state rate )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:85:4: '*' state rate
            {
            match(input,15,FOLLOW_15_in_transition_edge179); 

            pushFollow(FOLLOW_state_in_transition_edge181);
            state6=state();

            state._fsp--;


            pushFollow(FOLLOW_rate_in_transition_edge183);
            rate7=rate();

            state._fsp--;



            		if(trans_type.equals("MARKOVIAN")){
            			t = new MarkovianTransition(initial_state, state6, rate7);		
            		}
            		else {
            			t = new InteractiveTransition(initial_state, state6, action);
            		}
            		
            		this.imc.addTransition(t);
            		this.imc.addState(state6);
            	

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
    // $ANTLR end "transition_edge"



    // $ANTLR start "state"
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:101:1: state returns [String name] : ( STATE_ID | NAME );
    public final String state() throws RecognitionException {
        String name = null;


        Token STATE_ID8=null;
        Token NAME9=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:102:2: ( STATE_ID | NAME )
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
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:102:5: STATE_ID
                    {
                    STATE_ID8=(Token)match(input,STATE_ID,FOLLOW_STATE_ID_in_state204); 


                    		name = (STATE_ID8!=null?STATE_ID8.getText():null);
                    	

                    }
                    break;
                case 2 :
                    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:106:5: NAME
                    {
                    NAME9=(Token)match(input,NAME,FOLLOW_NAME_in_state213); 


                    		name = (NAME9!=null?NAME9.getText():null);
                    	

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:115:1: action returns [String name] : NAME ;
    public final String action() throws RecognitionException {
        String name = null;


        Token NAME10=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:116:2: ( NAME )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:116:4: NAME
            {
            NAME10=(Token)match(input,NAME,FOLLOW_NAME_in_action238); 


            		name = (NAME10!=null?NAME10.getText():null);
            	

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
    // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:124:1: rate returns [Double value] : NUMBER ;
    public final Double rate() throws RecognitionException {
        Double value = null;


        Token NUMBER11=null;

        try {
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:125:2: ( NUMBER )
            // /Users/macbook/Dropbox/NunoOliveira_Thesis/Thesis/Language/IMCUtil/IMCSpecs/MAParser.g:125:4: NUMBER
            {
            NUMBER11=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rate261); 


            		value = Double.parseDouble((NUMBER11!=null?NUMBER11.getText():null));
            	

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


 

    public static final BitSet FOLLOW_13_in_imc38 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_initial_states_in_imc40 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_imc42 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_goal_states_in_imc44 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_imc46 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_transitions_in_imc48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_initial_states64 = new BitSet(new long[]{0x0000000000000282L});
    public static final BitSet FOLLOW_state_in_goal_states89 = new BitSet(new long[]{0x0000000000000282L});
    public static final BitSet FOLLOW_state_in_transitions113 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_transition_label_in_transitions115 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_transition_edge_in_transitions118 = new BitSet(new long[]{0x0000000000008282L});
    public static final BitSet FOLLOW_action_in_transition_label147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_transition_label156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_transition_edge179 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_state_in_transition_edge181 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rate_in_transition_edge183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATE_ID_in_state204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_state213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_action238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_rate261 = new BitSet(new long[]{0x0000000000000002L});

}