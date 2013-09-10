// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g 2013-09-10 12:13:07

	package pt.uminho.di.imc.reo.parsing;
	import pt.uminho.di.imc.reo.*;
	import pt.uminho.di.imc.util.Pair;
	import java.util.HashSet;
	import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ReoMAParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "FLOAT", "EXPONENT", "COMMENT", "WS", "'#PORTS'", "'#INITIALS'", "'#GOALS'", "'#TRANSITIONS'", "'('", "'#'", "','", "')'", "'!'", "'*'", "'@'", "'&'", "'['", "']'", "'{'", "'}'", "'<'", "'>'"
    };
    public static final int EXPONENT=7;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int NUMBER=5;
    public static final int FLOAT=6;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int WS=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int COMMENT=8;

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


    	private IMCREOimc<IMCREOState> imc;
    	
    	public IMCREOimc<IMCREOState> getIMC(){
    		return this.imc;
    	}



    // $ANTLR start "imc"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:26:1: imc : '#PORTS' ( port_relations )? '#INITIALS' initial_state '#GOALS' goal_states '#TRANSITIONS' transitions ;
    public final void imc() throws RecognitionException {

        	this.imc = new IMCREOimc<IMCREOState>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:2: ( '#PORTS' ( port_relations )? '#INITIALS' initial_state '#GOALS' goal_states '#TRANSITIONS' transitions )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:4: '#PORTS' ( port_relations )? '#INITIALS' initial_state '#GOALS' goal_states '#TRANSITIONS' transitions
            {
            match(input,10,FOLLOW_10_in_imc38); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:30:13: ( port_relations )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
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

            match(input,11,FOLLOW_11_in_imc43); 
            pushFollow(FOLLOW_initial_state_in_imc45);
            initial_state();

            state._fsp--;

            match(input,12,FOLLOW_12_in_imc47); 
            pushFollow(FOLLOW_goal_states_in_imc49);
            goal_states();

            state._fsp--;

            match(input,13,FOLLOW_13_in_imc51); 
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

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:3: '(' bfr= ID ( '#' )? ',' aft= ID ( '#' )? ')'
            	    {
            	    match(input,14,FOLLOW_14_in_port_relations73); 
            	    bfr=(Token)match(input,ID,FOLLOW_ID_in_port_relations77); 
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:14: ( '#' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==15) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:16: '#'
            	            {
            	            match(input,15,FOLLOW_15_in_port_relations81); 
            	            p1 += "#";

            	            }
            	            break;

            	    }

            	    match(input,16,FOLLOW_16_in_port_relations88); 
            	    aft=(Token)match(input,ID,FOLLOW_ID_in_port_relations92); 
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:48: ( '#' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:38:50: '#'
            	            {
            	            match(input,15,FOLLOW_15_in_port_relations97); 
            	            p2 += "#";

            	            }
            	            break;

            	    }

            	    match(input,17,FOLLOW_17_in_port_relations104); 

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



        	HashSet<IMCREOState> goals = new HashSet<IMCREOState>();

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

                if ( (LA5_0==22) ) {
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:73:1: transitions : ( state transition_label ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+ ;
    public final void transitions() throws RecognitionException {
        ReoMAParserParser.transition_label_return transition_label3 = null;

        IMCREOTransition transition_edge4 = null;

        IMCREOState state5 = null;



        	LinkedList<IMCREOTransition<IMCREOState>> trans = new LinkedList<IMCREOTransition<IMCREOState>>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:2: ( ( state transition_label ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+ )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:4: ( state transition_label ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+
            {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:4: ( state transition_label ( transition_edge[$transition_label.type, $transition_label.actions] )+ )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:5: state transition_label ( transition_edge[$transition_label.type, $transition_label.actions] )+
            	    {
            	    pushFollow(FOLLOW_state_in_transitions182);
            	    state5=state();

            	    state._fsp--;

            	    pushFollow(FOLLOW_transition_label_in_transitions184);
            	    transition_label3=transition_label();

            	    state._fsp--;

            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:28: ( transition_edge[$transition_label.type, $transition_label.actions] )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==19) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:77:29: transition_edge[$transition_label.type, $transition_label.actions]
            	    	    {
            	    	    pushFollow(FOLLOW_transition_edge_in_transitions187);
            	    	    transition_edge4=transition_edge((transition_label3!=null?transition_label3.type:null), (transition_label3!=null?transition_label3.actions:null));

            	    	    state._fsp--;


            	    	    		trans.add(transition_edge4);
            	    	    	

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


            	    		if(this.imc.getChain().containsKey(state5)){
            	    			this.imc.getChain().get(state5).addAll(trans);
            	    		}
            	    		else{
            	    			this.imc.getChain().put(state5, trans);	
            	    		}
            	    		trans = new LinkedList<IMCREOTransition<IMCREOState>>();
            	    	

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
        public IMCREOAction actions;
    };

    // $ANTLR start "transition_label"
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:97:1: transition_label returns [String type, IMCREOAction actions] : ( actions | '!' );
    public final ReoMAParserParser.transition_label_return transition_label() throws RecognitionException {
        ReoMAParserParser.transition_label_return retval = new ReoMAParserParser.transition_label_return();
        retval.start = input.LT(1);

        IMCREOAction actions6 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:98:2: ( actions | '!' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
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
                    pushFollow(FOLLOW_actions_in_transition_label221);
                    actions6=actions();

                    state._fsp--;


                    		retval.type = "INTERACTIVE";
                    		retval.actions = actions6;
                    	

                    }
                    break;
                case 2 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:103:4: '!'
                    {
                    match(input,18,FOLLOW_18_in_transition_label230); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:113:1: transition_edge[String in_type, IMCREOAction in_action] returns [IMCREOTransition transition] : '*' state rate ( '@' ID '@' )? ;
    public final IMCREOTransition transition_edge(String in_type, IMCREOAction in_action) throws RecognitionException {
        IMCREOTransition transition = null;

        Token ID9=null;
        IMCREOState state7 = null;

        Double rate8 = null;



        	IMCREOTransition<IMCREOState> t;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:117:2: ( '*' state rate ( '@' ID '@' )? )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:117:4: '*' state rate ( '@' ID '@' )?
            {
            match(input,19,FOLLOW_19_in_transition_edge258); 
            pushFollow(FOLLOW_state_in_transition_edge260);
            state7=state();

            state._fsp--;

            pushFollow(FOLLOW_rate_in_transition_edge262);
            rate8=rate();

            state._fsp--;

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:117:19: ( '@' ID '@' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:117:20: '@' ID '@'
                    {
                    match(input,20,FOLLOW_20_in_transition_edge265); 
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_transition_edge267); 
                    match(input,20,FOLLOW_20_in_transition_edge269); 

                    }
                    break;

            }


            		if(in_type.equals("INTERACTIVE")){
            			t = new IMCREOInteractiveTransition<IMCREOState>(state7, in_action);
            		}
            		else {
            			t = new IMCREOMarkovianTransition<IMCREOState>(state7, rate8, (ID9!=null?ID9.getText():null) == null ? "" : (ID9!=null?ID9.getText():null));	
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:133:1: state returns [IMCREOState value] : requests ( transmissions )? ( '#' | '&' )* ;
    public final IMCREOState state() throws RecognitionException {
        IMCREOState value = null;

        HashSet<String> requests10 = null;

        HashSet<String> transmissions11 = null;



        	IMCREOState st = new IMCREOState();
        	String bs = null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:139:2: ( requests ( transmissions )? ( '#' | '&' )* )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:139:5: requests ( transmissions )? ( '#' | '&' )*
            {
            pushFollow(FOLLOW_requests_in_state298);
            requests10=requests();

            state._fsp--;


            		st.setRequests(requests10);
            	
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:143:2: ( transmissions )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:143:3: transmissions
                    {
                    pushFollow(FOLLOW_transmissions_in_state306);
                    transmissions11=transmissions();

                    state._fsp--;


                    		st.setTransmissions(transmissions11);
                    	

                    }
                    break;

            }

            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:148:2: ( '#' | '&' )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }
                else if ( (LA11_0==21) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:148:3: '#'
            	    {
            	    match(input,15,FOLLOW_15_in_state318); 
            	    bs="#"; st.getBuffer().add(IMCREOBufferState.FULL);

            	    }
            	    break;
            	case 2 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:149:3: '&'
            	    {
            	    match(input,21,FOLLOW_21_in_state325); 
            	    bs="&"; st.getBuffer().add(IMCREOBufferState.EMPTY);

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            		if(bs==null){st.getBuffer().add(IMCREOBufferState.NONE);}
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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:159:1: requests returns [HashSet<String> reqset] : '[' ( ID )* ']' ;
    public final HashSet<String> requests() throws RecognitionException {
        HashSet<String> reqset = null;

        Token ID12=null;


        	HashSet<String> reqs = new HashSet<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:163:2: ( '[' ( ID )* ']' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:163:4: '[' ( ID )* ']'
            {
            match(input,22,FOLLOW_22_in_requests358); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:163:8: ( ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:163:9: ID
            	    {
            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_requests361); 

            	    		reqs.add((ID12!=null?ID12.getText():null));
            	    	

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_requests371); 

            		reqset = reqs;
            	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:175:1: transmissions returns [HashSet<String> transset] : '{' ( ID )+ '}' ;
    public final HashSet<String> transmissions() throws RecognitionException {
        HashSet<String> transset = null;

        Token ID13=null;


        	HashSet<String> trans = new HashSet<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:2: ( '{' ( ID )+ '}' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:4: '{' ( ID )+ '}'
            {
            match(input,24,FOLLOW_24_in_transmissions396); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:8: ( ID )+
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
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:179:9: ID
            	    {
            	    ID13=(Token)match(input,ID,FOLLOW_ID_in_transmissions399); 

            	    		trans.add((ID13!=null?ID13.getText():null));
            	    	

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

            match(input,25,FOLLOW_25_in_transmissions409); 

            		transset = trans;
            	

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:191:1: actions returns [IMCREOAction actions] : actions_sync ;
    public final IMCREOAction actions() throws RecognitionException {
        IMCREOAction actions = null;

        HashSet<String> actions_sync14 = null;


        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:192:2: ( actions_sync )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:192:4: actions_sync
            {
            pushFollow(FOLLOW_actions_sync_in_actions429);
            actions_sync14=actions_sync();

            state._fsp--;

            actions = new IMCREOAction(actions_sync14);

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:197:1: actions_sync returns [HashSet<String> actionset] : '<' ( ID )* '>' ;
    public final HashSet<String> actions_sync() throws RecognitionException {
        HashSet<String> actionset = null;

        Token ID15=null;


        	HashSet<String> acts = new HashSet<String>();

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:201:2: ( '<' ( ID )* '>' )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:201:4: '<' ( ID )* '>'
            {
            match(input,26,FOLLOW_26_in_actions_sync453); 
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:201:8: ( ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:201:9: ID
            	    {
            	    ID15=(Token)match(input,ID,FOLLOW_ID_in_actions_sync456); 

            	    		acts.add((ID15!=null?ID15.getText():null));
            	    	

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,27,FOLLOW_27_in_actions_sync465); 

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
    // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:213:1: rate returns [Double value] : NUMBER ;
    public final Double rate() throws RecognitionException {
        Double value = null;

        Token NUMBER16=null;

        try {
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:214:2: ( NUMBER )
            // /Users/nunooliveira/Dropbox/NunoOliveira_Thesis/Thesis/Tools/doctools/IMCUtil/IMCSpecs/ReoMAParser.g:214:4: NUMBER
            {
            NUMBER16=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rate487); 

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


 

    public static final BitSet FOLLOW_10_in_imc38 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_port_relations_in_imc40 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_imc43 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_initial_state_in_imc45 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_imc47 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_goal_states_in_imc49 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_imc51 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_transitions_in_imc53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_port_relations73 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_port_relations77 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_port_relations81 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_port_relations88 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_port_relations92 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_port_relations97 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_port_relations104 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_state_in_initial_state127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_state_in_goal_states151 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_state_in_transitions182 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_transition_label_in_transitions184 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transition_edge_in_transitions187 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_actions_in_transition_label221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_transition_label230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_transition_edge258 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_state_in_transition_edge260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rate_in_transition_edge262 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_transition_edge265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_transition_edge267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_transition_edge269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_requests_in_state298 = new BitSet(new long[]{0x0000000001208002L});
    public static final BitSet FOLLOW_transmissions_in_state306 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_15_in_state318 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_21_in_state325 = new BitSet(new long[]{0x0000000000208002L});
    public static final BitSet FOLLOW_22_in_requests358 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_ID_in_requests361 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_23_in_requests371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_transmissions396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_transmissions399 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_transmissions409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actions_sync_in_actions429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_actions_sync453 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_ID_in_actions_sync456 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_27_in_actions_sync465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_rate487 = new BitSet(new long[]{0x0000000000000002L});

}