// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g 2013-09-15 17:34:28

	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.imc.*;
	import pt.uminho.di.imc.util.Pair;
	import java.util.LinkedHashSet;
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ReoMAParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "LABEL", "NUMBER", "FLOAT", "EXPONENT", "COMMENT", "WS", "'#PORTS'", "'#INITIALS'", "'#GOALS'", "'#TRANSITIONS'", "'('", "'#'", "','", "')'", "'!'", "'*'", "'@'", "'&'", "'['", "']'", "'{'", "'}'", "'<'", "'>'"
    };
    public static final int EXPONENT=8;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int NUMBER=6;
    public static final int FLOAT=7;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int WS=10;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int LABEL=5;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int COMMENT=9;

    // delegates
    // delegators


        public ReoMAParserParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ReoMAParserParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ReoMAParserParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g"; }


    	private IMCREOimc imc;
    	
    	public IMCREOimc getIMC(){
    		return this.imc;
    	}



    // $ANTLR start "imc"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:26:1: imc : '#PORTS' ( port_relations )? '#INITIALS' initial_state '#GOALS' goal_states '#TRANSITIONS' transitions ;
    public final void imc() throws RecognitionException {

        	this.imc = new IMCREOimc();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:2: ( '#PORTS' ( port_relations )? '#INITIALS' initial_state '#GOALS' goal_states '#TRANSITIONS' transitions )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:4: '#PORTS' ( port_relations )? '#INITIALS' initial_state '#GOALS' goal_states '#TRANSITIONS' transitions
            {
            match(input,11,FOLLOW_11_in_imc38); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:13: ( port_relations )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:13: port_relations
                    {
                    pushFollow(FOLLOW_port_relations_in_imc40);
                    port_relations();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_imc43); 
            pushFollow(FOLLOW_initial_state_in_imc45);
            initial_state();

            state._fsp--;

            match(input,13,FOLLOW_13_in_imc47); 
            pushFollow(FOLLOW_goal_states_in_imc49);
            goal_states();

            state._fsp--;

            match(input,14,FOLLOW_14_in_imc51); 
            pushFollow(FOLLOW_transitions_in_imc53);
            transitions();

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
    // $ANTLR end "imc"


    // $ANTLR start "port_relations"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:33:1: port_relations : ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+ ;
    public final void port_relations() throws RecognitionException {
        Token bfr=null;
        Token aft=null;


        	String p1="", p2="";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:37:2: ( ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:37:4: ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:37:4: ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:3: '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')'
            	    {
            	    match(input,15,FOLLOW_15_in_port_relations73); 
            	    bfr=(Token)match(input,ID,FOLLOW_ID_in_port_relations77); 
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:14: ( '#' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==16) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:16: '#'
            	            {
            	            match(input,16,FOLLOW_16_in_port_relations81); 
            	            p1 += "#";

            	            }
            	            break;

            	    }

            	    match(input,17,FOLLOW_17_in_port_relations88); 
            	    aft=(Token)match(input,ID,FOLLOW_ID_in_port_relations92); 
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:48: ( '#' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:50: '#'
            	            {
            	            match(input,16,FOLLOW_16_in_port_relations97); 
            	            p2 += "#";

            	            }
            	            break;

            	    }

            	    match(input,18,FOLLOW_18_in_port_relations104); 

            	    		this.imc.getPoset().addSinglePOSet(new Pair<String, String>((bfr!=null?bfr.getText():null) + p1, (aft!=null?aft.getText():null) + p2));
            	    	

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
        }
        return ;
    }
    // $ANTLR end "port_relations"


    // $ANTLR start "initial_state"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:46:1: initial_state : state ;
    public final void initial_state() throws RecognitionException {
        IMCREOState state1 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:47:2: ( state )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:47:4: state
            {
            pushFollow(FOLLOW_state_in_initial_state127);
            state1=state();

            state._fsp--;


            		this.imc.setInitial_state(state1);
            	

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
    // $ANTLR end "initial_state"


    // $ANTLR start "goal_states"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:56:1: goal_states : ( state )+ ;
    public final void goal_states() throws RecognitionException {
        IMCREOState state2 = null;



        	LinkedHashSet<IMCREOState> goals = new LinkedHashSet<IMCREOState>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:60:2: ( ( state )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:60:4: ( state )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:60:4: ( state )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:60:6: state
            	    {
            	    pushFollow(FOLLOW_state_in_goal_states151);
            	    state2=state();

            	    state._fsp--;


            	    		//goals.add(state2);
            	    	

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


            		//this.imc.setFinal_states(goals);
            	

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
    // $ANTLR end "goal_states"


    // $ANTLR start "transitions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:73:1: transitions : ( state transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+ ;
    public final void transitions() throws RecognitionException {
        IMCREOState state3 = null;

        ReoMAParserParser.transition_label_return transition_label4 = null;

        IMCREOTransition transition_edge5 = null;



        	LinkedList<IMCREOTransition> trans = new LinkedList<IMCREOTransition>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:2: ( ( state transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:4: ( state transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:4: ( state transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:5: state transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, $transition_label.actions] )+
            	    {
            	    pushFollow(FOLLOW_state_in_transitions182);
            	    state3=state();

            	    state._fsp--;

            	    pushFollow(FOLLOW_transition_label_in_transitions184);
            	    transition_label4=transition_label(state3.getInternalState());

            	    state._fsp--;

            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:61: ( transition_edge[$transition_label.type, $transition_label.actions] )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==20) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:62: transition_edge[$transition_label.type, $transition_label.actions]
            	    	    {
            	    	    pushFollow(FOLLOW_transition_edge_in_transitions188);
            	    	    transition_edge5=transition_edge((transition_label4!=null?transition_label4.type:null), (transition_label4!=null?transition_label4.actions:null));

            	    	    state._fsp--;


            	    	    		trans.add(transition_edge5);
            	    	    	

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    		if(this.imc.getChain().containsKey(state3)){
            	    			this.imc.getChain().get(state3).addAll(trans);
            	    		}
            	    		else{
            	    			this.imc.getChain().put(state3, trans);	
            	    		}
            	    		trans = new LinkedList<IMCREOTransition>();
            	    	

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
    // $ANTLR end "transitions"

    public static class transition_label_return extends ParserRuleReturnScope {
        public String type;
        public LinkedHashSet<String> actions;
    };

    // $ANTLR start "transition_label"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:97:1: transition_label[IMCREOBufferState buf_s] returns [String type, LinkedHashSet<String> actions] : ( actions | '!' );
    public final ReoMAParserParser.transition_label_return transition_label(IMCREOBufferState buf_s) throws RecognitionException {
        ReoMAParserParser.transition_label_return retval = new ReoMAParserParser.transition_label_return();
        retval.start = input.LT(1);

        LinkedHashSet<String> actions6 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:98:2: ( actions | '!' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:98:4: actions
                    {
                    pushFollow(FOLLOW_actions_in_transition_label223);
                    actions6=actions();

                    state._fsp--;


                    		retval.type = "INTERACTIVE";
                    		LinkedHashSet<String> actual_actions = actions6;
                    		if(buf_s.equals(IMCREOBufferState.FULL) || buf_s.equals(IMCREOBufferState.EMPTY)){
                    			actual_actions.add("#");
                    		}
                    		retval.actions = actual_actions;
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:107:4: '!'
                    {
                    match(input,19,FOLLOW_19_in_transition_label232); 

                    		retval.type = "MARKOVIAN";
                    		retval.actions = null;
                    	

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
        }
        return retval;
    }
    // $ANTLR end "transition_label"


    // $ANTLR start "transition_edge"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:117:1: transition_edge[String in_type, LinkedHashSet<String> in_action] returns [IMCREOTransition transition] : '*' state rate ( '@' LABEL '@' )? ;
    public final IMCREOTransition transition_edge(String in_type, LinkedHashSet<String> in_action) throws RecognitionException {
        IMCREOTransition transition = null;

        Token LABEL9=null;
        IMCREOState state7 = null;

        Double rate8 = null;



        	IMCREOTransition t;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:121:2: ( '*' state rate ( '@' LABEL '@' )? )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:121:4: '*' state rate ( '@' LABEL '@' )?
            {
            match(input,20,FOLLOW_20_in_transition_edge260); 
            pushFollow(FOLLOW_state_in_transition_edge262);
            state7=state();

            state._fsp--;

            pushFollow(FOLLOW_rate_in_transition_edge264);
            rate8=rate();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:121:19: ( '@' LABEL '@' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:121:20: '@' LABEL '@'
                    {
                    match(input,21,FOLLOW_21_in_transition_edge267); 
                    LABEL9=(Token)match(input,LABEL,FOLLOW_LABEL_in_transition_edge269); 
                    match(input,21,FOLLOW_21_in_transition_edge271); 

                    }
                    break;

            }


            		if(in_type.equals("INTERACTIVE")){
            			t = new IMCREOInteractiveTransition(state7, in_action);
            		}
            		else {
            			t = new IMCREOMarkovianTransition(state7, rate8, (LABEL9!=null?LABEL9.getText():null) == null ? "" : (LABEL9!=null?LABEL9.getText():null));	
            		}
            		
            		transition = t;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return transition;
    }
    // $ANTLR end "transition_edge"


    // $ANTLR start "state"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:137:1: state returns [IMCREOState value] : requests ( transmissions )? ( '#' | '&' )* ;
    public final IMCREOState state() throws RecognitionException {
        IMCREOState value = null;

        String requests10 = null;

        String transmissions11 = null;



        	IMCREOState st = new IMCREOState();
        	String bs = null;
        	String state_id = "";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:144:2: ( requests ( transmissions )? ( '#' | '&' )* )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:144:5: requests ( transmissions )? ( '#' | '&' )*
            {
            pushFollow(FOLLOW_requests_in_state300);
            requests10=requests();

            state._fsp--;


            		state_id = requests10;
            	
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:148:2: ( transmissions )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:148:3: transmissions
                    {
                    pushFollow(FOLLOW_transmissions_in_state308);
                    transmissions11=transmissions();

                    state._fsp--;


                    		state_id = ( state_id.equals("E") && ! transmissions11.equals("") ) ? transmissions11 : state_id + transmissions11;
                    	

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:153:2: ( '#' | '&' )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }
                else if ( (LA11_0==22) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:153:3: '#'
            	    {
            	    match(input,16,FOLLOW_16_in_state320); 
            	    bs="#"; st.getBuffer().add(IMCREOBufferState.FULL);

            	    }
            	    break;
            	case 2 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:154:3: '&'
            	    {
            	    match(input,22,FOLLOW_22_in_state327); 
            	    bs="&"; st.getBuffer().add(IMCREOBufferState.EMPTY);

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            		
            		if(bs==null){st.getBuffer().add(IMCREOBufferState.NONE);}
            		st.setId(state_id);
            		value = st;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "state"


    // $ANTLR start "requests"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:166:1: requests returns [String reqset] : '[' ( ID )* ']' ;
    public final String requests() throws RecognitionException {
        String reqset = null;

        Token ID12=null;


        	String reqs = "";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:170:2: ( '[' ( ID )* ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:170:4: '[' ( ID )* ']'
            {
            match(input,23,FOLLOW_23_in_requests360); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:170:8: ( ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:170:9: ID
            	    {
            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_requests363); 

            	    		reqs += (ID12!=null?ID12.getText():null) + ",";
            	    	

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_requests373); 

            		reqset = reqs.length() == 0 ? "E" : "[" + reqs.substring(0,reqs.length()-1) + "]";
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return reqset;
    }
    // $ANTLR end "requests"


    // $ANTLR start "transmissions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:182:1: transmissions returns [String transset] : '{' ( ID )+ '}' ;
    public final String transmissions() throws RecognitionException {
        String transset = null;

        Token ID13=null;


        	String trans = "{";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:186:2: ( '{' ( ID )+ '}' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:186:4: '{' ( ID )+ '}'
            {
            match(input,25,FOLLOW_25_in_transmissions398); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:186:8: ( ID )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:186:9: ID
            	    {
            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_transmissions401); 

            	    		trans += (ID13!=null?ID13.getText():null) + ",";
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match(input,26,FOLLOW_26_in_transmissions411); 

            		transset = trans.substring(0,trans.length()-1) + "}";
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return transset;
    }
    // $ANTLR end "transmissions"


    // $ANTLR start "actions"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:198:1: actions returns [LinkedHashSet<String> actions] : actions_sync ;
    public final LinkedHashSet<String> actions() throws RecognitionException {
        LinkedHashSet<String> actions = null;

        LinkedHashSet<String> actions_sync14 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:199:2: ( actions_sync )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:199:4: actions_sync
            {
            pushFollow(FOLLOW_actions_sync_in_actions431);
            actions_sync14=actions_sync();

            state._fsp--;


            		actions = actions_sync14;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return actions;
    }
    // $ANTLR end "actions"


    // $ANTLR start "actions_sync"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:207:1: actions_sync returns [LinkedHashSet<String> actionset] : '<' ( ID )* '>' ;
    public final LinkedHashSet<String> actions_sync() throws RecognitionException {
        LinkedHashSet<String> actionset = null;

        Token ID15=null;


        	LinkedHashSet<String> acts = new LinkedHashSet<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:211:2: ( '<' ( ID )* '>' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:211:4: '<' ( ID )* '>'
            {
            match(input,27,FOLLOW_27_in_actions_sync457); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:211:8: ( ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:211:9: ID
            	    {
            	    ID15=(Token)match(input,ID,FOLLOW_ID_in_actions_sync460); 

            	    		acts.add((ID15!=null?ID15.getText():null));
            	    	

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,28,FOLLOW_28_in_actions_sync469); 

            		actionset = acts;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return actionset;
    }
    // $ANTLR end "actions_sync"


    // $ANTLR start "rate"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:223:1: rate returns [Double value] : NUMBER ;
    public final Double rate() throws RecognitionException {
        Double value = null;

        Token NUMBER16=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:224:2: ( NUMBER )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:224:4: NUMBER
            {
            NUMBER16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rate491); 

            		value = Double.parseDouble((NUMBER16!=null?NUMBER16.getText():null));
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "rate"

    // Delegated rules


 

    public static final BitSet FOLLOW_11_in_imc38 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_port_relations_in_imc40 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_imc43 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_initial_state_in_imc45 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_imc47 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_goal_states_in_imc49 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_imc51 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_transitions_in_imc53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_port_relations73 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_port_relations77 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_port_relations81 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_port_relations88 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_port_relations92 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_port_relations97 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_port_relations104 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_state_in_initial_state127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_goal_states151 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_state_in_transitions182 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_transition_label_in_transitions184 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_transition_edge_in_transitions188 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_actions_in_transition_label223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_transition_label232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_transition_edge260 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_state_in_transition_edge262 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rate_in_transition_edge264 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_transition_edge267 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LABEL_in_transition_edge269 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_transition_edge271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requests_in_state300 = new BitSet(new long[]{0x0000000002410002L});
    public static final BitSet FOLLOW_transmissions_in_state308 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_16_in_state320 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_22_in_state327 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_23_in_requests360 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ID_in_requests363 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_requests373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_transmissions398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_transmissions401 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_transmissions411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actions_sync_in_actions431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_actions_sync457 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ID_in_actions_sync460 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_actions_sync469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_rate491 = new BitSet(new long[]{0x0000000000000002L});

}