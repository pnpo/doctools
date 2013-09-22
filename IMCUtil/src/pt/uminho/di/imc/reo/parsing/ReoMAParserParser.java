// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g 2013-09-22 18:33:57

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:26:1: imc : '#PORTS' ( port_relations )? '#INITIALS' initial_state[$port_relations.ports] '#GOALS' goal_states[$port_relations.ports] '#TRANSITIONS' transitions[$port_relations.ports] ;
    public final void imc() throws RecognitionException {
        LinkedHashSet<String> port_relations1 = null;



        	this.imc = new IMCREOimc();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:2: ( '#PORTS' ( port_relations )? '#INITIALS' initial_state[$port_relations.ports] '#GOALS' goal_states[$port_relations.ports] '#TRANSITIONS' transitions[$port_relations.ports] )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:4: '#PORTS' ( port_relations )? '#INITIALS' initial_state[$port_relations.ports] '#GOALS' goal_states[$port_relations.ports] '#TRANSITIONS' transitions[$port_relations.ports]
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
                    port_relations1=port_relations();

                    state._fsp--;


                    }
                    break;

            }

            match(input,12,FOLLOW_12_in_imc43); 
            pushFollow(FOLLOW_initial_state_in_imc45);
            initial_state(port_relations1);

            state._fsp--;

            match(input,13,FOLLOW_13_in_imc48); 
            pushFollow(FOLLOW_goal_states_in_imc50);
            goal_states(port_relations1);

            state._fsp--;

            match(input,14,FOLLOW_14_in_imc53); 
            pushFollow(FOLLOW_transitions_in_imc55);
            transitions(port_relations1);

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:33:1: port_relations returns [LinkedHashSet<String> ports] : ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+ ;
    public final LinkedHashSet<String> port_relations() throws RecognitionException {
        LinkedHashSet<String> ports = null;

        Token bfr=null;
        Token aft=null;


        	String p1="", p2="";
        	LinkedHashSet<String> _ports = new LinkedHashSet<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:2: ( ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:4: ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:4: ( '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')' )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:39:3: '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')'
            	    {
            	    match(input,15,FOLLOW_15_in_port_relations79); 
            	    bfr=(Token)match(input,ID,FOLLOW_ID_in_port_relations83); 
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:39:14: ( '#' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==16) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:39:16: '#'
            	            {
            	            match(input,16,FOLLOW_16_in_port_relations87); 
            	            p1 += "#";

            	            }
            	            break;

            	    }

            	    match(input,17,FOLLOW_17_in_port_relations94); 
            	    aft=(Token)match(input,ID,FOLLOW_ID_in_port_relations98); 
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:39:48: ( '#' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:39:50: '#'
            	            {
            	            match(input,16,FOLLOW_16_in_port_relations103); 
            	            p2 += "#";

            	            }
            	            break;

            	    }

            	    match(input,18,FOLLOW_18_in_port_relations110); 

            	    		this.imc.getPoset().addSinglePOSet(new Pair<String, String>((bfr!=null?bfr.getText():null) + p1, (aft!=null?aft.getText():null) + p2));
            	    		_ports.add((bfr!=null?bfr.getText():null));
            	    		_ports.add((aft!=null?aft.getText():null));
            	    	

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


            		ports = _ports;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ports;
    }
    // $ANTLR end "port_relations"


    // $ANTLR start "initial_state"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:52:1: initial_state[LinkedHashSet<String> ports] : state[$initial_state.ports] ;
    public final void initial_state(LinkedHashSet<String> ports) throws RecognitionException {
        IMCREOState state2 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:53:2: ( state[$initial_state.ports] )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:53:4: state[$initial_state.ports]
            {
            pushFollow(FOLLOW_state_in_initial_state137);
            state2=state(ports);

            state._fsp--;


            		this.imc.setInitial_state(state2);
            	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:62:1: goal_states[LinkedHashSet<String> ports] : ( state[$goal_states.ports] )+ ;
    public final void goal_states(LinkedHashSet<String> ports) throws RecognitionException {
        IMCREOState state3 = null;



        	LinkedHashSet<IMCREOState> goals = new LinkedHashSet<IMCREOState>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:66:2: ( ( state[$goal_states.ports] )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:66:4: ( state[$goal_states.ports] )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:66:4: ( state[$goal_states.ports] )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:66:6: state[$goal_states.ports]
            	    {
            	    pushFollow(FOLLOW_state_in_goal_states163);
            	    state3=state(ports);

            	    state._fsp--;


            	    		//goals.add(state3);
            	    	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:79:1: transitions[LinkedHashSet<String> ports] : ( state[$transitions.ports] transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transition_label.actions, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transitions.ports] )+ )+ ;
    public final void transitions(LinkedHashSet<String> ports) throws RecognitionException {
        IMCREOState state4 = null;

        ReoMAParserParser.transition_label_return transition_label5 = null;

        IMCREOTransition transition_edge6 = null;



        	LinkedList<IMCREOTransition> trans = new LinkedList<IMCREOTransition>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:83:2: ( ( state[$transitions.ports] transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transition_label.actions, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transitions.ports] )+ )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:83:4: ( state[$transitions.ports] transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transition_label.actions, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transitions.ports] )+ )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:83:4: ( state[$transitions.ports] transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transition_label.actions, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transitions.ports] )+ )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:83:5: state[$transitions.ports] transition_label[$state.value.getInternalState()] ( transition_edge[$transition_label.type, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transition_label.actions, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transitions.ports] )+
            	    {
            	    pushFollow(FOLLOW_state_in_transitions198);
            	    state4=state(ports);

            	    state._fsp--;

            	    pushFollow(FOLLOW_transition_label_in_transitions201);
            	    transition_label5=transition_label(state4.getInternalState());

            	    state._fsp--;

            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:83:81: ( transition_edge[$transition_label.type, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transition_label.actions, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transitions.ports] )+
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
            	    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:83:82: transition_edge[$transition_label.type, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transition_label.actions, \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$transitions.ports]
            	    	    {
            	    	    pushFollow(FOLLOW_transition_edge_in_transitions205);
            	    	    transition_edge6=transition_edge((transition_label5!=null?transition_label5.type:null), (transition_label5!=null?transition_label5.actions:null), ports);

            	    	    state._fsp--;


            	    	    		trans.add(transition_edge6);
            	    	    	

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


            	    		if(this.imc.getChain().containsKey(state4)){
            	    			this.imc.getChain().get(state4).addAll(trans);
            	    		}
            	    		else{
            	    			this.imc.getChain().put(state4, trans);	
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:105:1: transition_label[IMCREOBufferState buf_s] returns [String type, LinkedHashSet<String> actions] : ( actions | '!' );
    public final ReoMAParserParser.transition_label_return transition_label(IMCREOBufferState buf_s) throws RecognitionException {
        ReoMAParserParser.transition_label_return retval = new ReoMAParserParser.transition_label_return();
        retval.start = input.LT(1);

        LinkedHashSet<String> actions7 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:106:2: ( actions | '!' )
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
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:106:4: actions
                    {
                    pushFollow(FOLLOW_actions_in_transition_label240);
                    actions7=actions();

                    state._fsp--;


                    		retval.type = "INTERACTIVE";
                    		LinkedHashSet<String> actual_actions = actions7;
                    		if(buf_s.equals(IMCREOBufferState.FULL) || buf_s.equals(IMCREOBufferState.EMPTY)){
                    			actual_actions.add("#");
                    		}
                    		retval.actions = actual_actions;
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:115:4: '!'
                    {
                    match(input,19,FOLLOW_19_in_transition_label249); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:125:1: transition_edge[String in_type, LinkedHashSet<String> in_action, LinkedHashSet<String> ports] returns [IMCREOTransition transition] : '*' state[$transition_edge.ports] rate ( '@' LABEL '@' )? ;
    public final IMCREOTransition transition_edge(String in_type, LinkedHashSet<String> in_action, LinkedHashSet<String> ports) throws RecognitionException {
        IMCREOTransition transition = null;

        Token LABEL10=null;
        IMCREOState state8 = null;

        Double rate9 = null;



        	IMCREOTransition t;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:129:2: ( '*' state[$transition_edge.ports] rate ( '@' LABEL '@' )? )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:129:4: '*' state[$transition_edge.ports] rate ( '@' LABEL '@' )?
            {
            match(input,20,FOLLOW_20_in_transition_edge277); 
            pushFollow(FOLLOW_state_in_transition_edge279);
            state8=state(ports);

            state._fsp--;

            pushFollow(FOLLOW_rate_in_transition_edge282);
            rate9=rate();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:129:43: ( '@' LABEL '@' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:129:44: '@' LABEL '@'
                    {
                    match(input,21,FOLLOW_21_in_transition_edge285); 
                    LABEL10=(Token)match(input,LABEL,FOLLOW_LABEL_in_transition_edge287); 
                    match(input,21,FOLLOW_21_in_transition_edge289); 

                    }
                    break;

            }


            		if(in_type.equals("INTERACTIVE")){
            			t = new IMCREOInteractiveTransition(state8, in_action);
            		}
            		else {
            			t = new IMCREOMarkovianTransition(state8, rate9, (LABEL10!=null?LABEL10.getText():null) == null ? "" : (LABEL10!=null?LABEL10.getText():null));	
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:145:1: state[LinkedHashSet<String> ports] returns [IMCREOState value] : requests ( transmissions )? ( '#' | '&' )* ;
    public final IMCREOState state(LinkedHashSet<String> ports) throws RecognitionException {
        IMCREOState value = null;

        String requests11 = null;

        String transmissions12 = null;



        	IMCREOState st = new IMCREOState();
        	IMCREOInternalState is = new IMCREOInternalState();
        	String bs = null;
        	String state_id = "";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:153:2: ( requests ( transmissions )? ( '#' | '&' )* )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:153:5: requests ( transmissions )? ( '#' | '&' )*
            {
            pushFollow(FOLLOW_requests_in_state319);
            requests11=requests();

            state._fsp--;


            		state_id = requests11;
            	
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:157:2: ( transmissions )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:157:3: transmissions
                    {
                    pushFollow(FOLLOW_transmissions_in_state327);
                    transmissions12=transmissions();

                    state._fsp--;


                    		state_id = ( state_id.equals("E") && ! transmissions12.equals("") ) ? transmissions12 : state_id + transmissions12;
                    	

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:162:2: ( '#' | '&' )*
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:162:3: '#'
            	    {
            	    match(input,16,FOLLOW_16_in_state339); 
            	    bs="#"; st.getBuffer().add(new IMCREOInternalState(IMCREOBufferState.FULL, new LinkedHashSet<String>(ports)));

            	    }
            	    break;
            	case 2 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:163:3: '&'
            	    {
            	    match(input,22,FOLLOW_22_in_state346); 
            	    bs="&"; st.getBuffer().add(new IMCREOInternalState(IMCREOBufferState.EMPTY, new LinkedHashSet<String>()));

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            		
            		if(bs==null){st.getBuffer().add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));}
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:175:1: requests returns [String reqset] : '[' ( ID )* ']' ;
    public final String requests() throws RecognitionException {
        String reqset = null;

        Token ID13=null;


        	String reqs = "";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:2: ( '[' ( ID )* ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:4: '[' ( ID )* ']'
            {
            match(input,23,FOLLOW_23_in_requests379); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:8: ( ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:9: ID
            	    {
            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_requests382); 

            	    		reqs += (ID13!=null?ID13.getText():null) + ",";
            	    	

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_requests392); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:191:1: transmissions returns [String transset] : '{' ( ID )+ '}' ;
    public final String transmissions() throws RecognitionException {
        String transset = null;

        Token ID14=null;


        	String trans = "{";

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:195:2: ( '{' ( ID )+ '}' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:195:4: '{' ( ID )+ '}'
            {
            match(input,25,FOLLOW_25_in_transmissions417); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:195:8: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:195:9: ID
            	    {
            	    ID14=(Token)match(input,ID,FOLLOW_ID_in_transmissions420); 

            	    		trans += (ID14!=null?ID14.getText():null) + ",";
            	    	

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

            match(input,26,FOLLOW_26_in_transmissions430); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:207:1: actions returns [LinkedHashSet<String> actions] : actions_sync ;
    public final LinkedHashSet<String> actions() throws RecognitionException {
        LinkedHashSet<String> actions = null;

        LinkedHashSet<String> actions_sync15 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:208:2: ( actions_sync )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:208:4: actions_sync
            {
            pushFollow(FOLLOW_actions_sync_in_actions450);
            actions_sync15=actions_sync();

            state._fsp--;


            		actions = actions_sync15;
            	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:216:1: actions_sync returns [LinkedHashSet<String> actionset] : '<' ( ID )* '>' ;
    public final LinkedHashSet<String> actions_sync() throws RecognitionException {
        LinkedHashSet<String> actionset = null;

        Token ID16=null;


        	LinkedHashSet<String> acts = new LinkedHashSet<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:220:2: ( '<' ( ID )* '>' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:220:4: '<' ( ID )* '>'
            {
            match(input,27,FOLLOW_27_in_actions_sync476); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:220:8: ( ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:220:9: ID
            	    {
            	    ID16=(Token)match(input,ID,FOLLOW_ID_in_actions_sync479); 

            	    		acts.add((ID16!=null?ID16.getText():null));
            	    	

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,28,FOLLOW_28_in_actions_sync488); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:232:1: rate returns [Double value] : NUMBER ;
    public final Double rate() throws RecognitionException {
        Double value = null;

        Token NUMBER17=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:233:2: ( NUMBER )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:233:4: NUMBER
            {
            NUMBER17=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rate510); 

            		value = Double.parseDouble((NUMBER17!=null?NUMBER17.getText():null));
            	

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
    public static final BitSet FOLLOW_13_in_imc48 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_goal_states_in_imc50 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_imc53 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_transitions_in_imc55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_port_relations79 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_port_relations83 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_port_relations87 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_port_relations94 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_port_relations98 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_port_relations103 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_port_relations110 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_state_in_initial_state137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_goal_states163 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_state_in_transitions198 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_transition_label_in_transitions201 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_transition_edge_in_transitions205 = new BitSet(new long[]{0x0000000000900002L});
    public static final BitSet FOLLOW_actions_in_transition_label240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_transition_label249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_transition_edge277 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_state_in_transition_edge279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rate_in_transition_edge282 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_transition_edge285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LABEL_in_transition_edge287 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_transition_edge289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requests_in_state319 = new BitSet(new long[]{0x0000000002410002L});
    public static final BitSet FOLLOW_transmissions_in_state327 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_16_in_state339 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_22_in_state346 = new BitSet(new long[]{0x0000000000410002L});
    public static final BitSet FOLLOW_23_in_requests379 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_ID_in_requests382 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_24_in_requests392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_transmissions417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_transmissions420 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_transmissions430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actions_sync_in_actions450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_actions_sync476 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_ID_in_actions_sync479 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_28_in_actions_sync488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_rate510 = new BitSet(new long[]{0x0000000000000002L});

}