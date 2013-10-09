package pt.uminho.di.imc;

/**
 * @author Nuno Oliveira
 * @date 19 de Nov de 2012
 *
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import pt.uminho.di.imc.util.Pair;


public class IMC {

	private Set<String> states;
	private Set<String> initial_states;
	private Set<String> goal_states;
	private Set<Transition> transitions;
	
	
	public IMC() {
		this.states = new LinkedHashSet<String>();
		this.initial_states = new LinkedHashSet<String>();
		this.goal_states = new LinkedHashSet<String>();
		this.transitions = new LinkedHashSet<Transition>();
	}


	/**
	 * @param states the set of states in the IMC
	 * @param transitions the set of both markovian and interactive transitions in the IMC 
	 * @param initial_state the initial state of the IMC
	 */
	public IMC(Set<String> states, Set<String> initial_states, Set<Transition> transitions, Set<String> goal_states) {
		super();
		this.states = states;
		this.initial_states = initial_states;
		this.transitions = transitions;
		this.goal_states = goal_states;
	}
	
	/**
	 * 
	 * @param imc the imc to "clone"
	 */
	public IMC(IMC imc){
		this.states = new LinkedHashSet<String>();
		for(String s : imc.getStates()){
			this.states.add(s);
		}
		
		this.initial_states = new LinkedHashSet<String>();
		for(String s : imc.getInitial_states()){
			this.initial_states.add(s);
		}
		
		this.goal_states = new LinkedHashSet<String>();
		for(String s : imc.getGoal_states()){
			this.goal_states.add(s);
		}
		
		this.transitions = new LinkedHashSet<Transition>();
		for(Transition t : imc.getTransitions()){
			this.transitions.add(t.copy());
		}
	}


	

	
	/**
	 * @return the states
	 */
	public Set<String> getStates() {
		return states;
	}


	/**
	 * @param states the states to set
	 */
	public void setStates(Set<String> states) {
		this.states = states;
	}
	
	
	
	
	
	/**
	 * @return the initial_states
	 */
	public Set<String> getInitial_states() {
		return initial_states;
	}


	/**
	 * @param initial_states the initial_states to set
	 */
	public void setInitial_states(Set<String> initial_states) {
		this.initial_states = initial_states;
	}


	/**
	 * @return the goal_states
	 */
	public Set<String> getGoal_states() {
		return goal_states;
	}


	/**
	 * @param goal_states the goal_states to set
	 */
	public void setGoal_states(Set<String> goal_states) {
		this.goal_states = goal_states;
	}


	/**
	 * @return the transitions
	 */
	public Set<Transition> getTransitions() {
		return transitions;
	}


	/**
	 * @param transitions the transitions to set
	 */
	public void setTransitions(Set<Transition> transitions) {
		this.transitions = transitions;
	}


	
	/**
	 * @param t the new transition to add
	 */
	public void addTransition(Transition t){
		this.transitions.add(t);
	}
	
	/**
	 * @param s the state identifier to add as initial state 
	 */
	public void addInitialState(String s){
		this.initial_states.add(s);
		this.states.add(s);
	}
	
	
	/**
	 * @param s the state identifier to add as goal state
	 */
	public void addGoalState(String s){
		this.goal_states.add(s);
		this.states.add(s);
	}
	
	
	public void addState(String s){
		this.states.add(s);
	}
	
	
	
	
	
	
	
	//STATES AND TRANSITIONS PROPERTIES
	
	
	
	
	
	/**
	 * Selects all the markovian transitions in the IMC and returns them.
	 * 
	 * @return all the markovian transitions of this IMC
	 */
	public Set<Transition> getMarkovianTransitions(){
		Set<Transition> markovians = new HashSet<Transition>();
		for(Transition t : this.transitions){
			if(t instanceof MarkovianTransition) {
				markovians.add(t);
			}
		}
		return markovians;
	}
	
	
	/**
	 * Selects all the interactive transitions in the IMC and returns them.
	 * 
	 * @return all the interactive transitions of this IMC
	 */
	public Set<Transition> getInteractiveTransitions(){
		Set<Transition> interactive = new HashSet<Transition>();
		for(Transition t : this.transitions){
			if(t instanceof InteractiveTransition) {
				interactive.add(t);
			}
		}
		return interactive;
	}
	
	
	/**
	 * Selects all the outgoing transitions for a given state.
	 * 
	 * @param s the state from which the outgoing transitions shall be retrieved  
	 * @return the outgoing transitions for a given state
	 */
	public Set<Transition> getAllOutgoingTransitionsForState(String s){
		Set<Transition> trans = new HashSet<Transition>();
		for(Transition t : this.transitions){
			if(t.getStart_state().equals(s)){
				trans.add(t);
			}
		}
		return trans;
	}
	
	
	
	/**
	 * Selects all the incoming transitions for a given state.
	 * 
	 * @param s the state from which the incoming transitions shall be retrieved  
	 * @return the incoming transitions for a given state
	 */
	public Set<Transition> getAllIncomingTransitionsForState(String s){
		Set<Transition> trans = new HashSet<Transition>();
		for(Transition t : this.transitions){
			if(t.getFinal_state().equals(s)){
				trans.add(t);
			}
		}
		
		return trans;
	}
	
	
	
	
	
	/**
	 * Selects all the markovian transitions of a state s.
	 * This method is based on the defintion of MT(s) as provided
	 * in <i>H.Hermanns and J.-P. Katoen's</i> 
	 * <b>The How and Why of Interactive Markov Chains</b>    
	 * 
	 * @param state the state identifier
	 * @return all the markov transitions leaving state s
	 */
	public Set<Transition> MT(String state) {
		Set<Transition> markovian = new HashSet<Transition>();
		for(Transition t : this.transitions){
			if(t instanceof MarkovianTransition) {
				if(t.getStart_state().equals(state)){
					markovian.add(t);
				}
			}
		}
		return markovian;
	}

	
	private int countMT(String state) {
		int c = 0;
		for(Transition t : this.transitions){
			if(t instanceof MarkovianTransition) {
				if(t.getStart_state().equals(state)){
					c++;
				}
			}
		}
		return c;
	}
	
	
	
	
	
	/**
	 * Selects all the interactive transitions of a state s.
	 * This method is based on the defintion of IT(s) as provided
	 * in <i>H.Hermanns and J.-P. Katoen's</i> 
	 * <b>The How and Why of Interactive Markov Chains</b>    
	 * 
	 * @param state the state identifier
	 * @return all the interactive transitions leaving state s
	 */
	public Set<Transition> IT(String state) {
		Set<Transition> interactive = new HashSet<Transition>();
		for(Transition t : this.transitions){
			if(t instanceof InteractiveTransition) {
				if(t.getStart_state().equals(state)){
					interactive.add(t);
				}
			}
		}
		return interactive;
	}
	
	
	
	private int countIT(String state) {
		int c = 0;
		for(Transition t : this.transitions){
			if(t instanceof InteractiveTransition) {
				if(t.getStart_state().equals(state)){
					c++;
				}
			}
		}
		return c;
	}
	
	
	
	/**
	 * This method is based on the defintion of <i>markovian state</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>   
	 * A state is markovian if it only has outgoing markovian transitions
	 * 
	 * @param state the state to check if it is a markovian state
	 * @return true if the state has no outgoing interactive transition
	 */
	public boolean isMarkovianState(String state) {
		return this.countIT(state)==0 && this.countMT(state)>0;
	}
	
	
	/**
	 * This method is based on the defintion of <i>interactive state</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>   
	 * A state is interactive if it only has outgoing interactive transitions   
	 * 
	 * @param state the state to check if it is an interactive state
	 * @return true if the state has no outgoing markovian transition
	 */
	public boolean isInteractiveState(String state) {
		return this.countMT(state)==0 && this.countIT(state)>0;
	}
	
	
	/**
	 * This method is based on the defintion of <i>hybrid state</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>.
	 * A state is hybrid if it has both markovian and interactive outgoing transitions
	 * 
	 * @param state the state to check if it is a hybrid state
	 * @return true if the state has both outgoing markovian and interactive transition
	 */
	public boolean isHybridState(String state) {
		return (this.isInteractiveState(state) && this.isMarkovianState(state));
	}
	
	
	
	/**
	 * This method is based on the defintion of <i>deadlock state</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>.
	 * A state is deadlock if it has neither markovian nor interactive outgoing transitions
	 * 
	 * @param state the state to check if it is a deadlock state
	 * @return true if the state has no outgoing markovian transition
	 */
	public boolean isDeadlockState(String state) {
		return !(this.isInteractiveState(state) || this.isMarkovianState(state));
	}
	
	
	
	
	
	/**
	 * Returns true or false whether or not there is a tau transition from 
	 * the provided state.
	 * This method is based on the defintion of <i>unstable state</i> as provided
	 * in <i>H.Hermanns</i> book
	 * <b>Interactive Markov Chains</b>.
	 * 
	 * @param s the state to chech its stability
	 * @return true or false whether or not there is a tau transition from s.
	 */
	public boolean isUnstableState(String s) {
		for(Transition t : this.transitions) {
			if( t instanceof InteractiveTransition && 
					t.getStart_state().equals(s) && 
						((InteractiveTransition) t).getAction().equals("tau")){
				return true;
			}
		}
		return false;
	}
	
	
	
	/**
	 * Returns the set of unstable states according to the
	 * definition of such states.
	 * @see IMC#isUnstableState(String)
	 * 
	 * @return the set of unstable states
	 */
	public Set<String> getUnstableSates() {
		Set<String> unstable = new HashSet<String>();
		for(String state : this.states) {
			if(this.isUnstableState(state)) {
				unstable.add(state);
			}
		}
		
		return unstable;
		
	}
	
	
	
	/**
	 * Returns a set of transitions (not invisible) that depart 
	 * from state s, if s is unstable.
	 * 
	 * @param s the state (source) with invisible transitions from which it must
	 * be collected all the transitions but the invisible.   
	 * @return The transitions starting in <tt>s</tt> that are not invisible, if 
	 * <tt>s</tt> has some invisible transition.
	 */
	public Set<Transition> getUnstableStateNotTauTransitions(String s) {
		Set<Transition> trs = new HashSet<Transition>();
		if(this.isUnstableState(s)){
			for(Transition t : this.transitions){
				if(t.getStart_state().equals(s)){
					if(t instanceof MarkovianTransition  || ! ( t instanceof InteractiveTransition && ((InteractiveTransition) t).getAction().equals("tau"))){
						trs.add(t);
					}
				}
			}
		}
		return trs;
	}
	
	
	
	
	/**
	 * returns a set with the states that are not reachable from the initial states.
	 * 
	 * @return a set with the states that are not reachable from the initial states.
	 */
	public Set<String> getUnreachableStates(){
		Set<String> reached_states = new HashSet<String>(this.getInitial_states());
		Set<String> unreachable = new HashSet<String>();
		Queue<Transition> trans_to_process = new PriorityQueue<Transition>();
		//initialize the queue of transitions to process with the outgoing 
		//transitions from the inital states
		for(String state : this.getInitial_states()) {
			trans_to_process.addAll(this.getAllOutgoingTransitionsForState(state));
		}
		
		//While the queue is not empty
		while(! trans_to_process.isEmpty()) {
			//poll the top transition off the queue
			Transition t  = trans_to_process.poll();
			//If the destiny state of the transition is not already in the reached_states set
			if( ! reached_states.contains(t.getFinal_state()) ) {
				//add the state to that list
				reached_states.add(t.getFinal_state());
				//add all the outgoing transitions of that state to the queue
				//of transitions to process
				trans_to_process.addAll(this.getAllOutgoingTransitionsForState(t.getFinal_state()));
			}
		}
		
		//basically, performs a setminus operation: this.states - reached_states
		//and put the remaining elements in the unreachable list
		for(String s : this.states) {
			if(!reached_states.contains(s)){
				unreachable.add(s);
			}
		}
		
		return unreachable;
	}
	
	
	
	
	
	
	
	
	
	
	//RATES AND PROBABILITIES 
	
	
	
	
	
	/**
	 * This method is based on the defintion of <i>rate of moving from a state</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>.
	 * The rate to move from a state s to a state s' is given by
	 * R(s,s') = sum of all rates in markovian transitions from s to s'.
	 * 
	 * 
	 * @param state the state to which the rate of moving to another state must be computed 
	 * @param to_state the state to where the move shall occur
	 * @return the rate to move from a state to another
	 */
	public double rateToMoveFrom(String state, String to_state) {
		double r = 0.0;
		for(Transition t : this.transitions){
			if(t instanceof MarkovianTransition) {
				if(t.getStart_state().equals(state) && t.getFinal_state().equals(to_state)) {
					r += ((MarkovianTransition) t).getRate();
				}
			}
		}
		return this.round(r,2);
	}
	
	
	
	
	
	/**
	 * This method is based on the defintion of <i>exit rate</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>.
	 * E(s) = sum of all R(s,s'), for all states s' related to s.
	 * 
	 * @param state the state for which the exit rate must be computed
	 * @return the exit rate for the state
	 */
	public double exitRateOf(String state) {
		double e = 0.0;
		for(Transition t : this.transitions){
			if(t instanceof MarkovianTransition) {
				if(t.getStart_state().equals(state)) {
					e += ((MarkovianTransition) t).getRate();
				}
			}
		}
		
     
		return this.round(e,2);
	}
	
	
	
	/**
	 * This method is based on the intuitive defintion of <i>probability of moving 
	 * from a state</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>.
	 * The probability to move from a state s to a state s' is given by:
	 * P(s,s') =  R(s,s') / E(s)
	 * 
	 * 
	 * @param state the state for which the probability to move to another state (within time units) must be computed
	 * @param to_state the state to which the initial state must transit
	 * @return
	 */
	public double probabilityToMoveFrom(String state, String to_state) {
		double p = 0.0;
		double Rm = this.rateToMoveFrom(state, to_state);
		double Er = this.exitRateOf(state);
		
		p = Rm/Er;
		
		return this.round(p,2);
	}
	
	
	
	
	
	/**
	 * This method is based on the defintion of <i>probability of moving 
	 * from a state within d time units</i> as provided
	 * in <i>H.Hermanns and J.-P. Katoen</i> article
	 * <b>The How and Why of Interactive Markov Chains</b>.
	 * The probability to move from a state s to a state s' after d time units is given by:
	 * P(s,s') = ( R(s,s') / E(s) ) * ( 1 - e ^ ( ( -E(s) * d ) ) )
	 * 
	 * 
	 * @param state the state for which the probability to move to another state (within time units) must be computed
	 * @param to_state the state to which the initial state must transit
	 * @param after_time_units the time units within which the transition shall occur
	 * @return
	 */
	public double probabilityToMoveWithinTime(String state, String to_state, double after_time_units) {
		double p = 0.0;
		double Er = this.exitRateOf(state);
		p = this.probabilityToMoveFrom(state, to_state) * (1-(Math.pow(Math.E, -(Er * after_time_units))));
		
		return this.round(p,2);
	}
	
	
	
	
	
	
	
	//COMPOSITIONS
	
	
	
	
	
	
	/**
	 * Performs the parallel composition of two IMCs as
	 * defined by Holger Hermanns in his book 
	 * <b>Interactive Markov Chains</b>. 
	 * 
	 * This method does not "hide" the actions synchronised. 
	 * 
	 * @param imc the IMC to parallel compose with this IMC
	 * @param actions the set of interactive actions that 
	 * are to be synchronised during the composition   
	 * @return an IMC as result of composing this IMC and the one given 
	 * as parameter.
	 */
	public IMC compose(IMC other_imc, Set<String> actions){
		IMC imc = new IMC();
		//stores the states already processed
		Set<Pair<String, String>> states_processed = new HashSet<Pair<String,String>>();
		//stores the states set to be processed
		Queue<Pair<String,String>> states_to_process = new PriorityQueue<Pair<String, String>>();
		//store the transitions starting on a given state 
		ArrayList<Transition> trans_imc_1, trans_imc_2;
		//the initial state of this imc (assumes only one initial state)
		String init_state_imc_1 = (String)this.initial_states.toArray()[0];
		//the initial state of the other imc (assumes only one initial state)
		String init_state_imc_2 = (String)other_imc.initial_states.toArray()[0];
		//the pair of initial states in both imcs  
		Pair<String,String> current_state = new Pair<String,String>(init_state_imc_1,init_state_imc_2);
		
		//add the initial state to the new imc => composition of the both init states separated by _
		imc.addInitialState(current_state.concatenate());
		
		//push the pair to the queue of pairs to processed
		states_to_process.add(current_state);
		
		//While there are pairs of states to be processed
		while(!states_to_process.isEmpty()){
			//get the head of the queue as the state to process in this iteration
			current_state = states_to_process.poll();
			//get all the transitions for the states in both imcs
			trans_imc_1 = new ArrayList<Transition>(this.getAllOutgoingTransitionsForState(current_state.fst()));
			trans_imc_2 = new ArrayList<Transition>(other_imc.getAllOutgoingTransitionsForState(current_state.snd()));
			
			//while there are transitions for the state of the first imc
			while( ! trans_imc_1.isEmpty() ){
				//get the transition in position 0;
				Transition t = trans_imc_1.get(0);
				//if it is a markovian transition
				if( t instanceof MarkovianTransition){
					String next_state_1 = t.getFinal_state();
					String next_state_2 = current_state.snd();
					Pair<String, String> next_state_to_process = new Pair<String, String>(next_state_1,next_state_2);
					//create a new state to be processed IF not already processed
					if(! states_processed.contains(next_state_to_process)){
						states_to_process.add(next_state_to_process);
					}
					//create a new transition
					Transition new_t = new MarkovianTransition(current_state.concatenate(), next_state_to_process.concatenate(), ((MarkovianTransition) t).getRate(), ((MarkovianTransition) t).getLabel());
					//add new transition to the new imc
					imc.addTransition(new_t);
				
				}
				else{ //If the transition is interactive
					//>>>>>>If the action in the transition is to be synchronised
					String action = ((InteractiveTransition)t).getAction();
					if(actions.contains(action)){
						//get a list of all transitions in trans_imc_2 that have the 
						//same action (because of possible non-determinism)
						ArrayList<Transition> transitions_to_sync = (ArrayList<Transition>)this.findActionInTransitions(trans_imc_2, action);
						//in case of the list being empty... do nothing, otherwise...
						if( ! transitions_to_sync.isEmpty()){
							String next_state_1 = t.getFinal_state();
							//get all the final states possible via transition by the action to sync
							ArrayList<String> next_states_2 = extractFinalStatesFromTransitions(transitions_to_sync);
							//create next states to process
							ArrayList<Pair<String,String>> next_states_to_process = mapStateToStates(next_state_1, next_states_2);
							for(Pair<String, String> next_state_to_process : next_states_to_process){
								//add (IF not already processed) new states to be processed
								if(! states_processed.contains(next_state_to_process)){
									states_to_process.add(next_state_to_process);
								}
								//create a new transition
								Transition new_t = new InteractiveTransition(current_state.concatenate(), next_state_to_process.concatenate(), ((InteractiveTransition) t).getAction());
								//add new transition to the new imc
								imc.addTransition(new_t);
							}
						}
						
						
						
					}
					else { //If the action is not to synchronise 
						String next_state_1 = t.getFinal_state();
						String next_state_2 = current_state.snd();
						Pair<String, String> next_state_to_process = new Pair<String, String>(next_state_1,next_state_2);
						//create a new state to be processed IF not already processed
						if(! states_processed.contains(next_state_to_process)){
							states_to_process.add(next_state_to_process);
						}
						//create a new transition
						Transition new_t = new InteractiveTransition(current_state.concatenate(), next_state_to_process.concatenate(), ((InteractiveTransition) t).getAction());
						//add new transition to the new imc
						imc.addTransition(new_t);
					}
					
				}
				//remove the transition
				trans_imc_1.remove(t);
			}
			
			
			while( ! trans_imc_2.isEmpty() ){
				//get the transition in position 0;
				Transition t = trans_imc_2.get(0);
				if( t instanceof MarkovianTransition){
					String next_state_1 = current_state.fst();
					String next_state_2 = t.getFinal_state();
					Pair<String, String> next_state_to_process = new Pair<String,String>(next_state_1,next_state_2);
					//create a new state to be processed IF not already processed
					if(! states_processed.contains(next_state_to_process)){
						states_to_process.add(next_state_to_process);
					}
					//create a new transition
					Transition new_t = new MarkovianTransition(current_state.concatenate(), next_state_to_process.concatenate(), ((MarkovianTransition) t).getRate(), ((MarkovianTransition) t).getLabel());
					//add new transition to the new imc
					imc.addTransition(new_t);
				}
				else{ //If the transition is interactive
					//If the action in the transition is not to be synchronised...
					if(!actions.contains(((InteractiveTransition)t).getAction())){
						String next_state_1 = current_state.fst();
						String next_state_2 = t.getFinal_state();
						Pair<String, String> next_state_to_process = new Pair<String, String>(next_state_1,next_state_2);
						//create a new state to be processed IF not already processed
						if(! states_processed.contains(next_state_to_process)){
							states_to_process.add(next_state_to_process);
						}
						//create a new transition
						Transition new_t = new InteractiveTransition(current_state.concatenate(), next_state_to_process.concatenate(), ((InteractiveTransition) t).getAction());
						//add new transition to the new imc
						imc.addTransition(new_t);
					}
					//At this moment it is OK to ignore and remove all the transitions 
					//with actions (to be synchronised) in the list of transitions belonging 
					//to the state in imc2 because these either were already processed or will 
					//not be processed at this point.
					
				}
				//remove the transition
				trans_imc_2.remove(t);
			}
			
			//set the pair of states as processed
			states_processed.add(current_state);
			
			//add the current_state as a state of the imc
			imc.addState(current_state.concatenate());
			
			//check if it is a possible goal state 
			//(it would be a goal state if it is goal in at least one of the imcs)
			//if it is... add the state as a goal state
			if(this.goal_states.contains(current_state.fst()) || other_imc.getGoal_states().contains(current_state.snd())){
				imc.addGoalState(current_state.concatenate());
			}
		}

		return imc;
	}
	
	
	
	
	
	/**
	 * Performs the abstraction of the IMC following the 3 rules
	 * as defined by <i>Holger Hermanns</i> in his book 
	 * <b>Interactive Markov Chains</b>. 
	 * 
	 * Baiscally, only one rule changes the IMC in this way: 
	 * actions in parameter <i>actions</i> are transformed 
	 * into "tau" transitions.
	 * 
	 * @param actions the set of actions to be abstracted (aka hidden)
	 * @return an IMC as result of abstracting the actions provided as
	 * parameters      
	 */
	public IMC hide(Set<String> actions){
		IMC res = new IMC(this);
		for(Transition t : res.transitions){
			if(t instanceof InteractiveTransition && actions.contains(((InteractiveTransition) t).getAction())){
				((InteractiveTransition)t).setAction("tau");
			}
		}
		return res;
	}
	
	
	/**
	 * @see IMC#compose(IMC, Set)
	 * @see IMC#hide(Set)
	 * 
	 * @param imc the IMC to parallel compose with this IMC
	 * @param actions the set of interactive actions that 
	 * are to be synchronised during the composition and hidden
	 * @return an IMC as result of composing this IMC and the one given 
	 * as parameter as well as hiding the actions in the set provided
	 */
	public IMC composeAndHide(IMC imc, Set<String> actions){
		IMC res = this.compose(imc, actions).hide(actions);
		return res;
	}

	
	
	
	
	
	
	
	//EQUIVALENCES AND REDUCTIONS
	
	
	
	
	
	
	/**
	 * Returns an IMC equivalent to the original one but 
	 * coping with the maximal progression assumption as 
	 * introduced by <i>Holger Hermanns</i> in his book 
	 * <b>Interactive Markov Chains</b>.
	 * <br/>
	 * <br/>
	 * In basic words, it removes markovian transitions 
	 * (and originated isolates/inaccessible states) whose source 
	 * state is unstable (meaning it has at least one 
	 * outgoing invisible/internal/tau transition) 
	 * <br/>
	 * <br/>
	 * Maximal progression property of a IMC is based on
	 * the assumption that nothing prevents an internal
	 * action to occur immediately, and on the fact that
	 * the probability for markovian transition occur 
	 * instantaneously is 0, that is P = 1 - e^(-d*0) ), 
	 * where d is the rate associated to that transition.
	 * <br/>
	 * <br/>
	 * <b>This method erases also structres that are unreachable, 
	 * via a reachability test</b>
	 * 
	 * @see IMC#isUnstableState(String)
	 * 
	 *  
	 * 
	 * @return an IMC that copes with the maximal progression assumption. 
	 *  
	 */
	public IMC maximalProgressionReduction() {
		IMC res = new IMC(this);
		//get all unstable states
		Set<String> unstable_states = res.getUnstableSates();
		//for each unstable state 
		for(String state : unstable_states){
			//get all the non internal transitions of that state
			Set<Transition> not_tau_trans = res.getUnstableStateNotTauTransitions(state);
			//for each such transition
			for(Transition t : not_tau_trans){
				//if it is a markovian transition 
				//(possibly interactive transitions would have the same treatment)
				if(t instanceof MarkovianTransition) {
					//get the final state of the transition
					String final_state = t.getFinal_state();
					//remove the transition
					res.getTransitions().remove(t);
					//and finally safely remove such final_state, by checking if it
					//is an isolated or inaccessible state... The latter case may
					//cause the remotion of other transitions... Basically, it performs
					//a maximal progression closure. 
					res.safelyRemoveState(final_state);
				}
			}
		}
		
		//analyse the unreachable states and remove them and their transitions
		res.removeUnreachableStructure();
		
		return res;
	}



	
	
	
	
	
	
	//UTILITIES
	
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IMC [total states: " + this.states.size() + "\ninitial states: " + this.initial_states.size() + ", \ngoal states: "
				+ this.goal_states.size() + ", \nnumber of transitions: " + this.transitions.size() + "\ntransisions: " + this.transitions + "]";
	}

	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((goal_states == null) ? 0 : goal_states.hashCode());
		result = prime * result
				+ ((initial_states == null) ? 0 : initial_states.hashCode());
		result = prime * result
				+ ((transitions == null) ? 0 : transitions.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof IMC))
			return false;
		IMC other = (IMC) obj;
		if (goal_states == null) {
			if (other.goal_states != null)
				return false;
		} else if (!goal_states.equals(other.goal_states))
			return false;
		if (initial_states == null) {
			if (other.initial_states != null)
				return false;
		} else if (!initial_states.equals(other.initial_states))
			return false;
		if (transitions == null) {
			if (other.transitions != null)
				return false;
		} else if (!transitions.equals(other.transitions))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	//AUXILIARY FUNCTIONS
	
	
	private boolean isIsolatedState(String state) {
		return (
			(
				this.getAllIncomingTransitionsForState(state).size() == 0 
				&& 
				this.getAllOutgoingTransitionsForState(state).size() == 0
			)
			||
			(
				this.getAllIncomingTransitionsForState(state).size() == 0
				&&
				! this.initial_states.contains(state)
			)
		); 
	}
	
	
	
	/*private boolean isCompletelyIsolatedState(String state) {
		return (
			this.getAllIncomingTransitionsForState(state).size() == 0 
			&& 
			this.getAllOutgoingTransitionsForState(state).size() == 0
		); 
	}
	*/
	
	
	private boolean isInaccessibleState(String state) {
		return (
			this.getAllIncomingTransitionsForState(state).size() == 0
			&&
			! this.initial_states.contains(state)
		); 
	}
	
	
	
	private void safelyRemoveState(String state) {
		
		//If the state is isolated (either completely or inaccessible)
		//then it will be removed...
		if(this.isIsolatedState(state)){
			//If the state is not initial and has no incoming transitions
			//but defenitively has outgoing transitions, (ie, is inaccessible) then
			//we may remove the state, associated transitions, and recursively 
			//safely remove the final states of these transitions
			if(isInaccessibleState(state)){
				Set<Transition> ts = this.getAllOutgoingTransitionsForState(state);
				Set<String> final_states = new HashSet<String>();
				for(Transition t : ts) {
					final_states.add(t.getFinal_state());
					this.getTransitions().remove(t);
				}
				for(String st : final_states ) {
					this.safelyRemoveState(st);
				}
			}
		
			this.getStates().remove(state);
			this.getInitial_states().remove(state);
			this.getGoal_states().remove(state);
		}
	
	}

	
	
	
	private void removeUnreachableStructure() {
		Set<String> unreachable = this.getUnreachableStates();
		this.getGoal_states().removeAll(unreachable);
		this.getStates().removeAll(unreachable);
		
		HashSet<Transition> to_remove = new HashSet<Transition>();
		for(Transition t : this.getTransitions()) {
			if(unreachable.contains(t.getFinal_state()) || unreachable.contains(t.getStart_state())) {
				to_remove.add(t);
			}
		}
		this.getTransitions().removeAll(to_remove);
	}
	
	
	
	
	
	private ArrayList<Pair<String, String>> mapStateToStates(String state, List<String> states) {
		ArrayList<Pair<String, String>> product = new ArrayList<Pair<String,String>>();
		for(String s : states){
			product.add(new Pair<String, String>(state, s));
		}
		return product;
	}


	private ArrayList<String> extractFinalStatesFromTransitions(List<Transition> transitions) {
		ArrayList<String> final_states = new ArrayList<String>();
		for(Transition t : transitions){
			final_states.add(t.getFinal_state());
		}
		
		return final_states;
	}
	

	private ArrayList<Transition> findActionInTransitions(List<Transition> transitions, String action){
		ArrayList<Transition> trans = new ArrayList<Transition>();
		for(Transition t : transitions){
			if(t instanceof InteractiveTransition && ((InteractiveTransition) t).getAction().equals(action)){
				trans.add(t);
			}
		}
		return trans;
	} 
	
	
	private double round(double value, int places) {
		BigDecimal bd = new BigDecimal(value).setScale(places, RoundingMode.HALF_UP);
		double d = bd.doubleValue();
		return d;
	}
	
	
	
	
	

	
	
	
	
	

}
