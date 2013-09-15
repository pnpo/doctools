/**
 * 
 */
package pt.uminho.di.imc.reo.imc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import pt.uminho.di.imc.util.Pair;




/**
 * @author Nuno Oliveira
 * @date 13 de Set de 2013
 *
 */
public class IMCREOimc {

	private Map<IMCREOState, LinkedList<IMCREOTransition>> chain;
	private IMCREOState initial_state;
	private POPorts poset;
	
	
	public IMCREOimc() {
		this.chain = new LinkedHashMap< IMCREOState, LinkedList<IMCREOTransition>>();
		this.initial_state = null;
		this.poset = new POPorts();
	}
	
	
	
	
	/**
	 * @return the chain
	 */
	public Map<IMCREOState, LinkedList<IMCREOTransition>> getChain() {
		return chain;
	}
	/**
	 * @param chain the chain to set
	 */
	public void setChain(
			Map<IMCREOState, LinkedList<IMCREOTransition>> chain) {
		this.chain = chain;
	}
	
	
	
	
	
	/**
	 * @return the initial_state
	 */
	public IMCREOState getInitial_state() {
		return initial_state;
	}
	/**
	 * @param initial_state the initial_state to set
	 */
	public void setInitial_state(IMCREOState initial_state) {
		this.initial_state = initial_state;
	}


	/**
	 * @return the poset
	 */
	public POPorts getPoset() {
		return poset;
	}



	/**
	 * @param poset the poset to set
	 */
	public void setPoset(POPorts poset) {
		this.poset = poset;
	}
	
	
	
	public int getNumberOfStates(){
		return this.chain.size();
	}
	
	
	
	public int getNumberOfTransitions() {
		int count = 0;
		for(IMCREOState st : this.chain.keySet()){
			count += this.chain.get(st).size(); 
		}
		return count;  
	}
	
	
	
	
	public String getIMCProfile() {
		int count_it = 0, count_mt = 0;
		for(IMCREOState st : this.chain.keySet()){
			for(IMCREOTransition t : this.chain.get(st)) {
				if(t instanceof IMCREOMarkovianTransition){
					count_mt++;
				} 
				else {
					count_it++;
				}
			}
		}
		return  this.getNumberOfStates() + " States; " +  
				 (count_it + count_mt) + " Transitions [MT " + count_mt + " and IT " + count_it + "]" ;  
	}
	

	
	
	
	
	
	// COMPOSITION





	/**
	 * 
	 * This method performs the compostion of two imcreo. This takes into
	 * account the composition definition by Holger, but with the suitable
	 * adaptations to deal with sets of actions, instead single action in
	 * Interactive transitions.
	 * 
	 * The result is a new IMCREO with pairs of states, where the 1st 
	 * component is the state of this imc and the 2nd is the state of the 
	 * provided imc.
	 * 
	 * @param other - the other IMCREOimc<IMCREOState>.
	 * 
	 * @param mixedports - the ports upon which it is desired the two chains
	 * to communicate. In the end, these ports will become mixed nodes.
	 * 
	 * @return a new IMCREO with pairs of states, where the 1st component 
	 * is the state of this imc and the 2nd is the state of the provided imc.
	 * 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public IMCREOimc compose(IMCREOimc other, Set<String> mixedports){
		   
		
		//the new IMC
		IMCREOimc newimc = null;
		
		if(this.getInitial_state() instanceof IMCREOState){
		
			newimc = new IMCREOimc();
			//The queue with states to process
			PriorityQueue<Pair<IMCREOState, IMCREOState>> to_visit = new PriorityQueue<Pair<IMCREOState,IMCREOState>>();
			//The set of states already visited
			LinkedHashSet<Pair<IMCREOState, IMCREOState>> visited = new LinkedHashSet<Pair<IMCREOState,IMCREOState>>();
			
			//the initial state construction
			Pair<IMCREOState, IMCREOState> initial_state = 
					new Pair<IMCREOState, IMCREOState>(this.initial_state.copy(), other.initial_state.copy());
			
			//set the initial state
			newimc.setInitial_state(IMCREOState.concatenate(initial_state));
			//add the new initial state to the list of states ot visit
			to_visit.add(initial_state);
			
			Pair<IMCREOState, IMCREOState> ongoing_state;
			IMCREOState ongoing_state_concatenated;
			IMCREOState ongoing_state_1;
			IMCREOState ongoing_state_2;
			LinkedList<IMCREOTransition> transitions_1;
			LinkedList<IMCREOTransition> transitions_2;
			
			
			//While there are pairs of states to visit
			while(! to_visit.isEmpty()){
				//get the first state on the queue of states to process
				ongoing_state = to_visit.poll();
				ongoing_state_concatenated = IMCREOState.concatenate(ongoing_state);
				//if the ongoing state is not already visited... 
				if(! visited.contains(ongoing_state)){
					//add the ongoing state into the set of visited states
					visited.add(ongoing_state);
					//add an entry in the new imc for this state
					newimc.chain.put(ongoing_state_concatenated, new LinkedList<IMCREOTransition>());
					
					//divide the state into its parts
					ongoing_state_1 = ongoing_state.fst();
					ongoing_state_2 = ongoing_state.snd();
					//get the outgoing transitions from these states
					transitions_1 = this.chain.get(ongoing_state_1)!=null?  new LinkedList<IMCREOTransition>(this.chain.get(ongoing_state_1)) : new LinkedList<IMCREOTransition>();
					transitions_2 = other.chain.get(ongoing_state_2)!= null? new LinkedList<IMCREOTransition>(other.chain.get(ongoing_state_2)) : new LinkedList<IMCREOTransition>();
					
					
					//forall transitions belonging to the ongoing_state of imc1
					while(! transitions_1.isEmpty()) {	
						//get the first transition
						IMCREOTransition t1 = transitions_1.get(0);
						
						//if transition is markovian...
						if(t1 instanceof IMCREOMarkovianTransition){
							//>>>>RULE C4: independent evolution rule
							//create the final state
							Pair<IMCREOState, IMCREOState> next_state = 
									new Pair<IMCREOState, IMCREOState>(t1.getFinal_state().copy(), ongoing_state_2.copy());
							//create the transition
							IMCREOMarkovianTransition new_transition = 
									new IMCREOMarkovianTransition(
											IMCREOState.concatenate(next_state),
											((IMCREOMarkovianTransition) t1).getRate(), 
											((IMCREOMarkovianTransition) t1).getLabel()
										);
							//add the transition
							newimc.chain.get(ongoing_state_concatenated).add(new_transition);
							//check whether the resulting state is final
							//if(this.final_states.contains(next_state.fst()) || other.final_states.contains(next_state.snd())){
								//add the state as a final state
							//	newimc.final_states.add(next_state);
							//}
							//add the next_state to visit
							if(! (to_visit.contains(next_state) || visited.contains(next_state))){
								to_visit.add(next_state);
							}
						}
						else {//if the transition is interactive
							//perform the intersection of actions with the mixedports
							LinkedHashSet<String> actions_inter_mixed = 
									new LinkedHashSet<String>(((IMCREOInteractiveTransition)t1).getActions());
							actions_inter_mixed.retainAll(mixedports);
							//>>>>>>RULE C1: If the actions in the transition do not contain some of the mixed ports:
							//evolve individually
							if(actions_inter_mixed.isEmpty()) {
								//create the final state
								Pair<IMCREOState, IMCREOState> next_state = 
										new Pair<IMCREOState, IMCREOState>(t1.getFinal_state().copy(), ongoing_state_2.copy());
								//create the transition
								IMCREOInteractiveTransition new_transition = 
										new IMCREOInteractiveTransition(
												IMCREOState.concatenate(next_state),
												((IMCREOInteractiveTransition) t1).getActions()
											);
								//add the transition
								newimc.chain.get(ongoing_state_concatenated).add(new_transition);
								//check whether the resulting state is final
								//if(this.final_states.contains(next_state.fst()) || other.final_states.contains(next_state.snd())){
									//add the state as a final state
								//	newimc.final_states.add(next_state);
								//}
								//add the next_state to visit
								if(! (to_visit.contains(next_state) || visited.contains(next_state))){
									to_visit.add(next_state);
								}
							}
							else {
							//>>>> RULE C3: If the actions in the transition do contain mixed ports
							//it must synchronise
								Iterator<IMCREOTransition> it = transitions_2.iterator();
								while(it.hasNext()){
									IMCREOTransition t2 = it.next();
									if(t2 instanceof IMCREOInteractiveTransition){
										//new (2013-04-14) -- changed test to synchronise... two actions sync if their intersection with the mixed ports is equal!!!
										LinkedHashSet<String> actions_inter_mixed_2 = 
												new LinkedHashSet<String>(((IMCREOInteractiveTransition) t2).getActions());
										actions_inter_mixed_2.retainAll(mixedports);
										//HashSet<String> actions2_intersection = new HashSet<String>(((IMCREOInteractiveTransition<IMCREOState>) t2).getActions().getActions());
										//actions2_intersection.retainAll(actions_intersection);
										//if(!actions2_intersection.isEmpty()){
										if(actions_inter_mixed_2.equals(actions_inter_mixed)){
											//create the final state
											Pair<IMCREOState, IMCREOState> next_state = 
													new Pair<IMCREOState, IMCREOState>(t1.getFinal_state().copy(), t2.getFinal_state().copy());
											//Union of actions
											LinkedHashSet<String> actions_union = 
													new LinkedHashSet<String>(((IMCREOInteractiveTransition) t1).getActions());
											actions_union.addAll(((IMCREOInteractiveTransition) t2).getActions());
											//create the transition
											IMCREOInteractiveTransition new_transition = 
													new IMCREOInteractiveTransition(
															IMCREOState.concatenate(next_state), 
															new LinkedHashSet<String>(actions_union)
														);
											//add the transition
											newimc.chain.get(ongoing_state_concatenated).add(new_transition);
											//check whether the resulting state is final
											//if(this.final_states.contains(next_state.fst()) || other.final_states.contains(next_state.snd())){
												//add the state as a final state
											//	newimc.final_states.add(next_state);
											//}
											//add the next_state to visit
											if(! (to_visit.contains(next_state) || visited.contains(next_state))){
												to_visit.add(next_state);
											}
											
											//remove the interactive transition on the imc2 that sync...
											it.remove();
										}
										else {
											//new (2013-06-03) -- added synchronisation clausule: 
											//actions sync when there is a third set of actions such that
											//(A \_inter (B \_union C)) == mixed
										}
									}
								}
							}
						}
					
						transitions_1.remove(t1);
					}
					
					
					//forall transitions belonging to the ongoing_state of imc2
					while(! transitions_2.isEmpty()) {	
						//get the first transition
						IMCREOTransition t2 = transitions_2.get(0);
						
						//if transition is markovian...
						if(t2 instanceof IMCREOMarkovianTransition){
							//>>>>RULE C5: independent evolution rule
							//create the final state
							Pair<IMCREOState, IMCREOState> next_state = 
									new Pair<IMCREOState, IMCREOState>(ongoing_state_1.copy(), t2.getFinal_state().copy());
							//create the transition
							IMCREOMarkovianTransition new_transition = 
									new IMCREOMarkovianTransition(
											IMCREOState.concatenate(next_state),
											((IMCREOMarkovianTransition) t2).getRate(), 
											((IMCREOMarkovianTransition) t2).getLabel()
										);
							//add the transition
							newimc.chain.get(ongoing_state_concatenated).add(new_transition);
							//check whether the resulting state is final
							//if(this.final_states.contains(next_state.fst()) || other.final_states.contains(next_state.snd())){
								//add the state as a final state
							//	newimc.final_states.add(next_state);
							//}
							//add the next_state to visit
							if(! (to_visit.contains(next_state) || visited.contains(next_state))){
								to_visit.add(next_state);
							}
						}
						else { //if the transition is interactive
							//perform the intersection of actions with the mixedports
							LinkedHashSet<String> actions_inter_mixed = 
									new LinkedHashSet<String>(((IMCREOInteractiveTransition)t2).getActions());
							actions_inter_mixed.retainAll(mixedports);
							//>>>>>>RULE C2: If the actions in the transition do not contain all (at least one?) the mixed ports
							if(actions_inter_mixed.isEmpty()) {
								//create the final state
								Pair<IMCREOState, IMCREOState> next_state = 
										new Pair<IMCREOState, IMCREOState>(ongoing_state_1.copy(), t2.getFinal_state().copy());
								//create the transition
								IMCREOInteractiveTransition new_transition = 
										new IMCREOInteractiveTransition(
												IMCREOState.concatenate(next_state),
												((IMCREOInteractiveTransition) t2).getActions());
								//add the transition
								newimc.chain.get(ongoing_state_concatenated).add(new_transition);
								//if(this.final_states.contains(next_state.fst()) || other.final_states.contains(next_state.snd())){
									//add the state as a final state
								//	newimc.final_states.add(next_state);
								//}
								//add the next_state to visit
								if(! (to_visit.contains(next_state) || visited.contains(next_state))){
									to_visit.add(next_state);
								}
							}
							//AT THIS MOMENT ALL THE TRANSITIONS TO SYNCHRONISE ARE ALREADY SYNCHRONISED... SO THERE IS NO NEED TO CHECK THEM... 
						}
					
						transitions_2.remove(t2);
						
					}
				}
			}
		}
		
		//System.out.println(newimc + "\n ----------------------- ");
		
		newimc.poset.addAllPOSet(this.poset.getPo());
		newimc.poset.addAllPOSet(other.getPoset().getPo());
		
		return newimc;
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public IMCREOimc mixedRequestsReduction(Set<String> mixedports) {
		IMCREOimc newimc = new IMCREOimc ();
		
		PriorityQueue<IMCREOState> states_to_process = new PriorityQueue<IMCREOState>();
		PriorityQueue<IMCREOState> states_reached_via_mixed_requests;
		LinkedHashMap<IMCREOState, Integer> level_reduction_state;
		LinkedHashMap<IMCREOState, LinkedHashSet<IMCREOState>> equivalent_states = new LinkedHashMap<IMCREOState, LinkedHashSet<IMCREOState>>();
		
		
		//add initial state to the new chain
		newimc.setInitial_state(this.getInitial_state().copy());
		newimc.setPoset(new POPorts(this.getPoset().getPo()));
		
		//initialize the equivalent states map with the initial state.
		equivalent_states.put(initial_state, new LinkedHashSet<IMCREOState>());
				
		//set the initial state as the first state to process
		states_to_process.add(newimc.getInitial_state());
		
		//while there are states to process
		while(! states_to_process.isEmpty()) {
			//create a list for transitions of the current state
			LinkedList<IMCREOTransition> current_state_transitions = new LinkedList<IMCREOTransition>();
			
			//LinkedList<IMCREOTransition> candidates = new LinkedList<IMCREOTransition>();
			LinkedHashMap<String, Pair<IMCREOTransition, Integer>> candidates = new LinkedHashMap<String, Pair<IMCREOTransition,Integer>>();
			
			//remove the current state from the list to process and use it
			IMCREOState current_state = states_to_process.poll();
			//we create a queue that is used to collect the states reached from the current state via a request on mixed ports
			states_reached_via_mixed_requests = new PriorityQueue<IMCREOState>();
			level_reduction_state = new LinkedHashMap<IMCREOState, Integer>();
			//for all transitions associated to the current state in the original chain
			for(IMCREOTransition t : this.chain.get(current_state)){
				//check whether there already exists a transition with the same identification
				//IF NOT, THEN WE CAN ADD IT... BUT
				IMCREOTransition tr_in_the_list = this.containsTransitionIdentification(current_state_transitions, t) ;
				if( tr_in_the_list == null) {
					//only if the transition is not an arrival to a mixedport
					if(t instanceof IMCREOMarkovianTransition){
						LinkedHashSet<String> ports_inter_mixed = 
								new LinkedHashSet<String>(((IMCREOMarkovianTransition) t).getPorts());
						ports_inter_mixed.retainAll(mixedports);
						
						
						
						//if it is an arrival to a mixed port we do not add to the list of transitions
						if(	((IMCREOMarkovianTransition) t).getSort().equals(IMCREOMarkovianTransitionSort.ARRIVAL) && 
								! ports_inter_mixed.isEmpty()
								) 
						{
							//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
							//++++++++START RECURSIVE SEARCH FOR TRANSITIONS REACHED VIA PATHS OF ARRIVALS TO MIXED PORTS+++++++++++++++
							//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
							
							//instead we search for a transitions that is not a request of a mixed port
							//but first we add that state to the queue of such states to process
							if(! states_reached_via_mixed_requests.contains(t.getFinal_state())) {
								states_reached_via_mixed_requests.add(t.getFinal_state());
								level_reduction_state.put(t.getFinal_state(), 1);
							}
							//for all states reached from transitions with arrivals to mixed ports...
							while(! states_reached_via_mixed_requests.isEmpty()) {
								//get the first ignored state
								IMCREOState current_ignored_state = states_reached_via_mixed_requests.poll();
								int level = level_reduction_state.get(current_ignored_state);
								for(IMCREOTransition t_from_ignored : this.chain.get(current_ignored_state)) {
									//check whether there already exists a transition with the same identification
									//IF NOT, THEN WE CAN ADD IT... BUT
									IMCREOTransition tr_in_the_list_ignored = this.containsTransitionIdentification(current_state_transitions, t_from_ignored) ;
									if( tr_in_the_list_ignored == null) {
										//only if the transition is not an arrival to a mixedport
										if(t_from_ignored instanceof IMCREOMarkovianTransition){ 
											LinkedHashSet<String> ports_inter_mixed2 = 
													new LinkedHashSet<String>(((IMCREOMarkovianTransition) t_from_ignored).getPorts());
											ports_inter_mixed2.retainAll(mixedports);
											//if it is an arrival to a mixed port we do not add to the list of transitions
											if(	((IMCREOMarkovianTransition) t_from_ignored).getSort().equals(IMCREOMarkovianTransitionSort.ARRIVAL) && 
													! ports_inter_mixed2.isEmpty()
													) 
											{
												//BUT... we add that state to the queue of such states to process
												if(! states_reached_via_mixed_requests.contains(t_from_ignored.getFinal_state())) {
													states_reached_via_mixed_requests.add(t_from_ignored.getFinal_state());
													level_reduction_state.put(t_from_ignored.getFinal_state(), level+1);
												}//end if
											}//end if
											else {//we add otherwise...
												//we add the transition as a candidate
												//if one with that label already exists, we put the one with lower level
												if(candidates.containsKey(((IMCREOMarkovianTransition) t_from_ignored).getLabel())) {
													int lvl = candidates.get(((IMCREOMarkovianTransition) t_from_ignored).getLabel()).snd(); 
													if(lvl > level){
														candidates.get(((IMCREOMarkovianTransition) t_from_ignored).getLabel()).setFirst(t_from_ignored);
														candidates.get(((IMCREOMarkovianTransition) t_from_ignored).getLabel()).setSecond(level);
													}
												}
												else {
													//we just put the found transition
													candidates.put(
															((IMCREOMarkovianTransition) t_from_ignored).getLabel(), 
															new Pair<IMCREOTransition, Integer>(t_from_ignored, level)
															);
												}
											}//end else
										}//end if
										else {
											//assert t instanceof IMCREOInteractiveTransition ;
											//we add the transition as a candidate
											//if one with that label already exists, we put the one with lower level
											if(candidates.containsKey(((IMCREOInteractiveTransition) t_from_ignored).getActions().toString())) {
												int lvl = candidates.get(((IMCREOInteractiveTransition) t_from_ignored).getActions().toString()).snd(); 
												if(lvl > level){
													candidates.get(((IMCREOInteractiveTransition) t_from_ignored).getActions().toString()).setFirst(t_from_ignored);
													candidates.get(((IMCREOInteractiveTransition) t_from_ignored).getActions().toString()).setSecond(level);
												}
											}
											else {
												//we just put the found transition
												candidates.put(
														((IMCREOInteractiveTransition) t_from_ignored).getActions().toString(), 
														new Pair<IMCREOTransition, Integer>(t_from_ignored, level)
														);
											}
										}//end else
									}//end if
									else {
										//if there is already a transition with the same identification
										//we only add the final state of that transition to the equivalent 
										//states mapping of the transition with that same identification
										//But attention... it may be one its equivalent
										IMCREOState equiv_state = hasEquivalentState(tr_in_the_list_ignored.getFinal_state(), equivalent_states);
										if(equiv_state == null && equivalent_states.containsKey(tr_in_the_list_ignored.getFinal_state())){
											equivalent_states.get(tr_in_the_list_ignored.getFinal_state()).add(t_from_ignored.getFinal_state());
										}
										else {
											equivalent_states.get(equiv_state).add(t_from_ignored.getFinal_state());
										}
									}
								}//end for										
							}//end while
							
							//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
							//++++++++END RECURSIVE SEARCH FOR TRANSITIONS REACHED VIA PATHS OF ARRIVALS TO MIXED PORTS+++++++++++++++
							//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
							
						}//end if
						else {//if the transition is not an arrival to a mixed port => add otherwise...
							//we update the equivalent states with a new entry if the final state of the transition has not equivalent state
							IMCREOState equiv_state = hasEquivalentState(t.getFinal_state(), equivalent_states);
							if(!equivalent_states.containsKey(t.getFinal_state()) && equiv_state == null){
								equivalent_states.put(t.getFinal_state(), new LinkedHashSet<IMCREOState>());
							}
							else{
								if(equiv_state!=null){
									//if it has an equivalent state, update the state to the equivalent
									t = t.copy();
									t.setFinal_state(equiv_state);
								}
							}
							//we add the IT transition to the list of transitions for the current state 
							current_state_transitions.add(t.copy());
							//we update the final state of this transition as a new state to process 
							//(if it is not to be processed and it was not yet processed)
							if(! states_to_process.contains(t.getFinal_state()) && ! newimc.chain.containsKey(t.getFinal_state()) ){
								states_to_process.add(t.getFinal_state());
							}//end if
						}//end else
					}//end if
					else {
						//assert t instanceof IMCREOInteractiveTransition ;
						
						//we update the equivalent states with a new entry if the final state of the transition has not equivalent state
						IMCREOState equiv_state = hasEquivalentState(t.getFinal_state(), equivalent_states);
						if(!equivalent_states.containsKey(t.getFinal_state()) && equiv_state == null){
							equivalent_states.put(t.getFinal_state(), new LinkedHashSet<IMCREOState>());
						}
						else{
							if(equiv_state!=null){
								//if it has an equivalent state, update the state to the equivalent
								t = t.copy();
								t.setFinal_state(equiv_state);
							}
						}
						//we add the IT transition to the list of transitions for the current state 
						current_state_transitions.add(t.copy());
						//we update the final state of this transition as a new state to process
						if(! states_to_process.contains(t.getFinal_state()) && ! newimc.chain.containsKey(t.getFinal_state()) ){
							states_to_process.add(t.getFinal_state());
						}//end if
					}//end else
				}//end if
				else {
					//if there is already a transition with the same identification
					//we only add the final state of that transition to the equivalent 
					//states mapping of the transition with that same identification
					//But attention... it may be one its equivalent
					IMCREOState equiv_state = hasEquivalentState(tr_in_the_list.getFinal_state(), equivalent_states);
					if(equiv_state == null && equivalent_states.containsKey(tr_in_the_list.getFinal_state())){
						equivalent_states.get(tr_in_the_list.getFinal_state()).add(t.getFinal_state());
					}
					else {
						equivalent_states.get(equiv_state).add(t.getFinal_state());
					}
				}//end else
			}//end for
			
			
			//process the candidates
			for(String lbl_candidate : candidates.keySet()) {
				IMCREOTransition tr_candidate = candidates.get(lbl_candidate).fst();
				IMCREOTransition tr_in_the_list = this.containsTransitionIdentification(current_state_transitions, tr_candidate) ;
				//if the candidate transition is not in the list of the current state transitions
				if( tr_in_the_list == null) { 
					IMCREOState equiv_state = hasEquivalentState(tr_candidate.getFinal_state(), equivalent_states);
					if(!equivalent_states.containsKey(tr_candidate.getFinal_state()) && equiv_state == null){
						equivalent_states.put(tr_candidate.getFinal_state(), new LinkedHashSet<IMCREOState>());
					}
					else{
						if(equiv_state!=null){
							//if it has an equivalent state, update the state to the equivalent
							tr_candidate = tr_candidate.copy();
							tr_candidate.setFinal_state(equiv_state);
						}
					}
					//we add the MT transition to the list of transitions for the current state 
					current_state_transitions.add(tr_candidate.copy());
					//we update the final state of this transition as a new state to process
					if(! states_to_process.contains(tr_candidate.getFinal_state()) && ! newimc.chain.containsKey(tr_candidate.getFinal_state()) ){
						states_to_process.add(tr_candidate.getFinal_state());
					}
				}
			}
			
			
			//in the end we add the new state
			newimc.chain.put(current_state, current_state_transitions);
		}//end while
		
		return newimc;
	}
	

	
	

	
	
	/**
	 * Searches for an equivalent state to the one given, 
	 * in a map that maps states to their equivalent states
	 * 
	 * @param state the state to check for equivalences 
	 * @param equivalent_states the map of equivalent states
	 * @return the equivalent if exists, otherwise null.
	 */
	private IMCREOState hasEquivalentState(
			IMCREOState state,
			LinkedHashMap<IMCREOState, LinkedHashSet<IMCREOState>> equivalent_states) 
	{
		IMCREOState is_equivalent_found = null;
		Iterator<IMCREOState> states_iter = equivalent_states.keySet().iterator();
		while(states_iter.hasNext() && is_equivalent_found == null) {
			IMCREOState st = states_iter.next();
			Iterator<IMCREOState> list_states_iter = equivalent_states.get(st).iterator();
			while(list_states_iter.hasNext() && is_equivalent_found == null) {
				IMCREOState st_in_list = list_states_iter.next();
				is_equivalent_found = (st_in_list.equals(state)) ? st : null;
			}
		}
		
		return is_equivalent_found;
	}




	/**
	 * Searches for a transition identification in a list of transitions.
	 * 
	 * A transition identification is the label or the actions of the 
	 * transitions depending if tr is markovian or interactive.
	 *  
	 * @param transitions the list of transitions
	 * @param tr the transition to check the identifier
	 * @return the transition in the list if the identification is equal to tr or null otherwise
	 */
	private IMCREOTransition containsTransitionIdentification(
			LinkedList<IMCREOTransition> transitions,
			IMCREOTransition tr) 
	{
		IMCREOTransition found_transition_id = null;
		Object tr_id = null; 
		if (tr instanceof IMCREOMarkovianTransition) {
			tr_id = ((IMCREOMarkovianTransition) tr).getLabel();
		}
		else {
			tr_id = ((IMCREOInteractiveTransition) tr).getActions();
		}
		
		ListIterator<IMCREOTransition> trans_iter = transitions.listIterator();
		while(trans_iter.hasNext() && found_transition_id == null) {
			IMCREOTransition tr_aux = trans_iter.next();
			if(tr_aux instanceof IMCREOMarkovianTransition) {
				found_transition_id = ((IMCREOMarkovianTransition) tr_aux).getLabel().equals(tr_id) ?  tr_aux : null;
			}
			else {
				found_transition_id = ((IMCREOInteractiveTransition) tr_aux).getActions().equals(tr_id) ?  tr_aux : null;
			}
		}
		
		return found_transition_id;
	}


	

	
	/**
	 * Remove Forced non determinism from the chain.
	 * Non determinism exists in a state when two or more IT exist 
	 * and for each two ITs with set of actions A and B, and M the mixed ports set:
	 * A \inter M != 0 || A \inter M != 0
	 * 
	 * To solve non determinism we check the following cases:
	 * 
	 * 1) A \inter M = 0 && B \inter M != 0 => Remove IT with A
	 * 
	 * 2) A \inter M != 0 && B \inter M = 0 => Remove IT with B
	 * 
	 * 3) A \inter M != 0 && B \inter M != 0  => DO NOTHING! This is not
	 * forced non determinism
	 * 
	 * Attention that rules (1) and (2)  invert when the buffers in the chain are FULL.
	 *  
	 * 
	 * @param mixedports the set with all the mixed ports
	 * @return a IMC without forced non determinism...
	 */
	public IMCREOimc removeForcedNonDeterminism(Set<String> mixedports){
		IMCREOimc newimc = new IMCREOimc();
		
		
		//set the initial state and the POSet
		newimc.setInitial_state(this.initial_state.copy());
		newimc.setPoset(this.getPoset());
		
		//lets runover all the states in the chain 
		for(IMCREOState current_state : this.chain.keySet()){
			//copy the transitions of the current state into the transitions list
			LinkedList<IMCREOTransition> transitions = new LinkedList<IMCREOTransition>();
			for(IMCREOTransition t : this.chain.get(current_state)){
				transitions.add(t.copy());
			}
			//now process the list of transitions
			for(int i = 0 ; i < transitions.size() - 1; i++) {
				//first check if the ith transition is interactive
				if(transitions.get(i) instanceof IMCREOInteractiveTransition) {
					//if it is interactive, lets compare it with all the remaining...
					for(int j = i+1 ; j < transitions.size() ; j++) {
						//if the jth transition is also interactive
						if(transitions.get(j) instanceof IMCREOInteractiveTransition) {
							//prepare the initial intersections for checking the existence of nondeterminism
							LinkedHashSet<String> A_inter_M = 
									new LinkedHashSet<String>(((IMCREOInteractiveTransition) transitions.get(i)).getActions());
							A_inter_M.retainAll(mixedports);
							
							LinkedHashSet<String> B_inter_M = 
									new LinkedHashSet<String>(((IMCREOInteractiveTransition) transitions.get(j)).getActions());
							B_inter_M.retainAll(mixedports);
							
							//check for non determinism
							if(! A_inter_M.isEmpty() || ! B_inter_M.isEmpty()) {
								
								//Lets get the state of the buffers from the current_state
								IMCREOBufferState internal_state = current_state.getInternalState();
								
								//case 1)
								if(A_inter_M.isEmpty() && ! B_inter_M.isEmpty()){
									if(internal_state.equals(IMCREOBufferState.FULL)) {
										transitions.remove(j);
										j--;
									}
									else {
										transitions.remove(i);
										i--;
										break;
									}
								}
								else {
									//case 2)
									if(B_inter_M.isEmpty() && ! A_inter_M.isEmpty()) {
										if(internal_state.equals(IMCREOBufferState.FULL)) {
											transitions.remove(i);
											i--;
											break;
										}
										else {
											transitions.remove(j);
											j--;
										}
									}
								}
							}
						}
					}
				}
			}
			//add the entry in the chain...
			newimc.chain.put(current_state.copy(), transitions);			
		}
		
		newimc.removeUnaccessibleStates();
		
		return newimc;
	}
	
	
	
	
	
	
	/**
	 * Removes undesired transitions from the chain. 
	 * 
	 * An undesired transition is a request arrival or an IT.
	 * 
	 * An undesired request arrival occurs when in that state 
	 * there is a transmission occurring. But this is not enough.
	 * The port involved in the arrival, say 'a', shall not be 
	 * in any relation (given by the poset) with the ports 
	 * involved in the transmission. 
	 * 
	 * So if 'a' is related with the ports transmitting, then the
	 * request arrival transition shall be removed. Otherwise it
	 * may coexist.
	 * 
	 * An undesired IT is an IT leaving a state that also has 
	 * transmissions ocurring. But again, this is not enough.
	 * The actions involved in the IT, say set A, shall not
	 * be in any relation (given by the poset) with the ports
	 * involved in the transmission.
	 * 
	 * So, if there exists an x \in A somehow related to ports 
	 * transmitting, then IT with actions A shall be removed.
	 * Otherwise they may coexist.
	 * 
	 * Moreover, an IT transition leaving the initial state is
	 * not possible, unless the internal state of the initial
	 * state is FULL.
	 * 
	 * @param all_mixedports the mixed ports involved in all the process
	 * 
	 * @return an IMCREOimc without undesired transitions (request arrivals and IT)
	 */
	public IMCREOimc removeUndesiredTransitions(Set all_mixedports){
		IMCREOimc newimc = new IMCREOimc();
		
		//initialize the newimc with the initial state and the poset
		newimc.setInitial_state(this.initial_state.copy());
		newimc.setPoset(this.poset);
		
		//lets run over all the states in the chain.
		for(IMCREOState current_state : this.chain.keySet()){
			//copy the transitions of the current state into the transitions list
			LinkedList<IMCREOTransition> transitions = new LinkedList<IMCREOTransition>();
			for(IMCREOTransition t : this.chain.get(current_state)){
				transitions.add(t.copy());
			}
			//now run over these transitions
			for(int i = 0; i< transitions.size() ; i++) {
				IMCREOTransition tr = transitions.get(i);
				//if the transition is an arrival
				if(tr instanceof IMCREOMarkovianTransition &&
						((IMCREOMarkovianTransition) tr).getSort().equals(IMCREOMarkovianTransitionSort.ARRIVAL)) 
				{
					//see for all the transitions if there is one or several Transmissions (and compare to all of them)
					for(IMCREOTransition t : this.chain.get(current_state)){
						if(t instanceof IMCREOMarkovianTransition && 
								((IMCREOMarkovianTransition) t).getSort().equals(IMCREOMarkovianTransitionSort.TRANSMISSION)) 
						{
							//get the port involved in the arrival 
							LinkedHashSet<String> ports_arrival = 
									new LinkedHashSet<String>(((IMCREOMarkovianTransition) tr).getPorts() );
							//get the ports involved in the transmission
							LinkedHashSet<String> ports_transmission = 
									new LinkedHashSet<String>(((IMCREOMarkovianTransition) t).getPorts() );
							
							//get the active ports in the transmission
							LinkedHashSet<String> active_ports = this.getActivePortsForTransmission(ports_transmission);
							
							//FOR SURE assert ports_arrival.size()==1
							//We could simplify the process, by checking if the element belongs to the set of active ports
							//but we will compute the intersection for security reasons...
							LinkedHashSet<String> arrival_inter_active = new LinkedHashSet<String>(ports_arrival);
							arrival_inter_active.retainAll(active_ports);
							//if the intersection is not empty...
							if(!arrival_inter_active.isEmpty()){
								transitions.remove(i);
								i--;
								break;
							}
							
						}
					}
				}
				else {
					//if the transition is interactive
					if( tr instanceof IMCREOInteractiveTransition) {
						boolean is_IT_removed = false;
						//see all the other transitions to check whether there exists a transmission 
						for(IMCREOTransition tt : this.chain.get(current_state)){
							//if there is a transitions
							if(tt instanceof IMCREOMarkovianTransition && 
									((IMCREOMarkovianTransition) tt).getSort().equals(IMCREOMarkovianTransitionSort.TRANSMISSION)) 
							{
								//We must check whether the active ports forbid the existence of an interactive transition
								//So we get the ports transmitting
								LinkedHashSet<String> ports_transmitting = 
										new LinkedHashSet<String>(((IMCREOMarkovianTransition) tt).getPorts());
								LinkedHashSet<String> active_ports = 
										this.getActivePortsForTransmission(ports_transmitting);
								//And get the actions involved in the IT
								LinkedHashSet<String> actions = 
										new LinkedHashSet<String>(((IMCREOInteractiveTransition) tr).getActions());
								//Find the intersection of both and remove mixed ports
								LinkedHashSet<String> ACT_inter_TRS_minus_MIX = new LinkedHashSet<String>(actions);
								ACT_inter_TRS_minus_MIX.retainAll(active_ports);
								ACT_inter_TRS_minus_MIX.removeAll(all_mixedports);
								//now we see if this intersection is empty or not.
								//if it is not empty, than tr is forbiden because the ports are being used
								if(!ACT_inter_TRS_minus_MIX.isEmpty()) {
									transitions.remove(i);
									is_IT_removed = true;
									i--;
									break;
								}
							}
						}
						//moreover, if the transmission was not removed, we shall check if it is in the initial state
						
						if(! is_IT_removed && current_state.equals(newimc.initial_state)  ) {
							//and we remove it if there is no data at the initial state (having data is different from being full)
							// or if the actions involved are not ALL mixedports
							
							//So, we get the actions and remove all the mixed ports from it
							LinkedHashSet<String> ACT_minus_MIX = new LinkedHashSet<String>(((IMCREOInteractiveTransition) tr).getActions());
							ACT_minus_MIX.removeAll(all_mixedports);
							//remove also the special action that tells apart lossy actions from buffer actions... 
							ACT_minus_MIX.remove("#");
							
							if(! (current_state.hasData() && ACT_minus_MIX.isEmpty()) ) {
								//we remove the transition
								transitions.remove(i);
								i--;
							}
						}
					}
				}
			}
			//add the entry in the chain...
			newimc.chain.put(current_state.copy(), transitions);	
		}
		
		newimc.removeUnaccessibleStates();
		
		return newimc;
		
	}
	
	
	
	/**
	 *	Computes the ports that are active for a set of transmitting ports.
	 * 
	 *  The computation is based on the ports that are transmitting and
	 *  their relations in the partial order set. If a port x is transmitting
	 *  and is related to some port y in the poset then x and y are active.
	 *  
	 *  This computation ignores the states with #, because in the end, 
	 *  # indicates a discontinuity in the partial order... 
	 * 
	 * 
	 * @param transmitting the set of ports to check the ports related to it 
	 * @return a set of ports that are active
	 */
	private LinkedHashSet<String> getActivePortsForTransmission(Set<String> transmitting){
	
		//define the set of active ports
		LinkedHashSet<String> activeports = new LinkedHashSet<String>();
		//define an auxiliar set to hold the transmitting ports temporarily
		LinkedHashSet<String> transmitting_aux = new LinkedHashSet<String>(transmitting);
		
		boolean added_new_ports = true;
		while(added_new_ports) {
			added_new_ports = false;
			
			//add the transmitting ports to the active ports
			activeports.addAll(transmitting_aux);
			
			//for each port transmitting
			for(String port_transmitting : activeports) {				
				//get all the ports that are related to this one, from the poset
				for(Pair<String, String> ord : this.poset.getPo()) {
					//check if the port_transmitting is in some relation
					if(ord.fst().equals(port_transmitting) && ! ord.snd().endsWith("#")) {
						//we ignore the ports ending with # and put the others in the active ports
						added_new_ports = added_new_ports || transmitting_aux.add(ord.snd()); 
					}
					else {
						if(ord.snd().equals(port_transmitting) && ! ord.fst().endsWith("#")) {
							//we ignore the ports ending with # and put the others in the active ports
							added_new_ports = added_new_ports || transmitting_aux.add(ord.fst());
						}
					}
				}
			}
		}

		return activeports;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Removes transitions from transmitting states that are not in the correct 
	 * order, according to the following algorithm
	 * 	
	 * For each state in the chain check the MT that are actually transmitting.
	 * Test each transmitting transition with the others in the state and see
	 * if it really can transmit before than the other... based on the POSET.
	 * 
	 * Take into consideration the buffer state and how the transmitting order
	 * is affected by the ports...
	 * 
	 * @return an IMCREOimc without incorrect transmitting transitions
	 * 
	 */
	public IMCREOimc removeTransitionsIncorrectOrder() {
		IMCREOimc newimc = new IMCREOimc();
		//initialize the newimc with the initial state and the poset
		newimc.setInitial_state(this.initial_state.copy());
		newimc.setPoset(this.poset);
		
		//lets run over all the states in the chain.
		for(IMCREOState current_state : this.chain.keySet()){
			//copy the transitions of the current state into the transitions list
			LinkedList<IMCREOTransition> transitions = new LinkedList<IMCREOTransition>();
			for(IMCREOTransition t : this.chain.get(current_state)){
				transitions.add(t.copy());
			}
			//now, for each transition in the list...
			for(int i = 0 ; i <transitions.size() ; i++) {
				//if the ith transition is MT and transmission
				if(transitions.get(i) instanceof IMCREOMarkovianTransition && 
						((IMCREOMarkovianTransition) transitions.get(i)).getSort().equals(IMCREOMarkovianTransitionSort.TRANSMISSION))
				{
					//compare it with all the others
					for(int j = i+1 ; j<transitions.size() ; j++) {
						//if the jth transition is MT and transmission
						if(transitions.get(j) instanceof IMCREOMarkovianTransition && 
								((IMCREOMarkovianTransition) transitions.get(j)).getSort().equals(IMCREOMarkovianTransitionSort.TRANSMISSION))
						{
							LinkedHashSet<String> ports_tr_1 = 
									new LinkedHashSet<String>(((IMCREOMarkovianTransition) transitions.get(i)).getPorts());
							LinkedHashSet<String> ports_tr_2 = 
									new LinkedHashSet<String>(((IMCREOMarkovianTransition) transitions.get(j)).getPorts());
							//compute the intersection
							LinkedHashSet<String> p1_inter_p2 = new LinkedHashSet<String>(ports_tr_1);
							p1_inter_p2.retainAll(ports_tr_2);
							//compute the difference of ports that are transmitting
//							LinkedHashSet<String> p1_minus_p2 = new LinkedHashSet<String>(ports_tr_1);
//							p1_minus_p2.removeAll(ports_tr_2);
//							LinkedHashSet<String> p2_minus_p1 = new LinkedHashSet<String>(ports_tr_2);
//							p2_minus_p1.removeAll(ports_tr_1);
							
							
							
							//compute the internal state of the initial state
							IMCREOBufferState current_internal_state = current_state.getInternalState();
							//prepare the ports to be according to the POSET and the buffer state
							preparePortsTransmitting(ports_tr_1, ports_tr_2, current_internal_state);
							//lets check first whether they do not transmit in parallel
							//by testing that only one transmits before
							if(isTransmittedBeforeThan(ports_tr_1, ports_tr_2, p1_inter_p2) ^ 
									isTransmittedBeforeThan(ports_tr_2, ports_tr_1, p1_inter_p2))
							{
								//if the first shall transmit first
								if(isTransmittedBeforeThan(ports_tr_1, ports_tr_2, p1_inter_p2)){
									//then remove the second
									transitions.remove(j);
									j--;
								}
								else {//otherwise
									//if the second shal transmit first
									if(isTransmittedBeforeThan(ports_tr_2, ports_tr_1, p1_inter_p2)){
										//remove the first
										transitions.remove(i);
										i--;
										break;
									}
								}
							}
							//if they happen to occur in parallel, let them remain in the transitions list
						}
					}
				}
				
			}
			//add the entry in the chain...
			newimc.chain.put(current_state.copy(), transitions);
		}
		
		newimc.removeUnaccessibleStates();
		
		return newimc;
	}
	
	
	
	
	
	/**
	 * Checks if the ports in set1 set transmit before than the ports in set2t. 
	 * 
	 * @param set1 ports to check whether transmit before
	 * @param set2 ports to compare t with
	 * @param intersection the intersection between the effective ports transmitting  
	 * @return true if set1 transmit before than set2
	 */
	private boolean isTransmittedBeforeThan(Set<String> set1, Set<String> set2, Set intersection) {
	
		boolean res = true;
		
		for(String n_1 : set1){
			for(String n_2 : set2) {
				POPorts.REL comparison = this.poset._transmit_order_(n_1, n_2);
				if( comparison == POPorts.REL.PAR && ! intersection.isEmpty() && (n_1.contains("#") ^ n_2.contains("#") )) {
					comparison = n_1.contains("#") ? POPorts.REL.BFR : POPorts.REL.AFT ; 
				}
				res = res && (comparison != POPorts.REL.AFT);
			}
		}
		
		return res;
	}



	/**
	 * Prepares ports in the sets given according to the internal state and the POSET.
	 * According to the following:
	 * 
	 * If port 'a' is transmitting from a state FULL, 'a' is added the suffix '#' iff
	 * 'a#' occurs in the POSET.
	 * 
	 * @param p1 a set with ports to prepare according to the POSET and the internal state
	 * @param p2 a snd set with ports to prepare according to the POSET and the internal state
	 * @param internal_state the current state internal state
	 */
	private void preparePortsTransmitting(Set<String> p1, Set<String> p2, IMCREOBufferState internal_state) {
		
		LinkedHashSet<String> p_aux = new LinkedHashSet<String>(p1);
		for(String p : p_aux) {
			if(internal_state.equals(IMCREOBufferState.FULL)){
				String new_p_full = p + "#";
				for(Pair<String, String> pair : this.getPoset().getPo()) {
					if(pair.fst().equals(new_p_full) || pair.snd().equals(new_p_full)) {
						p1.remove(p);
						p1.add(new_p_full);
						//p = new_p_full;
						break;
					}
				}
			}
		}
		
		p_aux = new LinkedHashSet<String>(p2);
		for(String p : p_aux) {
			if(internal_state.equals(IMCREOBufferState.FULL)){
				String new_p_full = p + "#";
				for(Pair<String, String> pair : this.getPoset().getPo()) {
					if(pair.fst().equals(new_p_full) || pair.snd().equals(new_p_full)) {
						p2.remove(p);
						p2.add(new_p_full);
						break;
					}
				}
			}
		}
	}
	
	
	
	
	
	/**
	 * Removes states that are not accessible from the initial state. 
	 */
	private void removeUnaccessibleStates(){
		PriorityQueue<IMCREOState> to_visit = new PriorityQueue<IMCREOState>();
		LinkedList<IMCREOState> visited = new LinkedList<IMCREOState>();
		
		to_visit.add(this.initial_state);
		
		while(!to_visit.isEmpty()) {
			IMCREOState s = to_visit.poll();
			visited.add(s);
			if(this.chain.containsKey(s)){
				for(IMCREOTransition trans : this.chain.get(s)) {
					IMCREOState st_trans = trans.getFinal_state(); 
					if(! (to_visit.contains(st_trans) || visited.contains(st_trans))){
						to_visit.add(st_trans);
					}
				}
			}
		}
		
		Iterator<IMCREOState> it_states = this.chain.keySet().iterator();
		while(it_states.hasNext()){
			IMCREOState st = it_states.next();
			if(! visited.contains(st)){
				it_states.remove();
				//System.out.println("[X] " + st + "\n  STATE NOT ACCESSIBLE (removeUnaccessibleStates)");
			}
		}
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
//	// SYNCHRONISATION
//	
//	
//	/**
//	 * This method synchronises the IMCREOimc (resulting from composition) 
//	 * by removing non-reolike transitions. 
//	 * 
//	 * The IMCREO to synchronise shall be and instance of IMCREOimc<Pair<IMCREOState, IMCREOState>>, 
//	 * which is the direct result of the composition. 
//	 * 
//	 * In the end the result is an instance of IMCREOimc<IMCREOState> 
//	 * which is the initial imc without transitions that do not make 
//	 * in reo and also with the pairs of states merged. 
//	 * 
//	 * 
//	 * @param mixedports - the ports corresponding to mixed nodes after 
//	 * the composition.
//	 * 
//	 * @param already_mixed - ...
//	 *   
//	 * @return an instance of IMCREOimc which is the initial 
//	 * imc without transitions that do not make sense in reo.
//	 * 
//	 */
//	@SuppressWarnings("unchecked")
//	public IMCREOimc<Pair<IMCREOState, IMCREOState>> synchronise(Set<String> mixedports, Set<String> already_mixed) {
//		
//		System.out.println(this);
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++\n++++++++++++++++++++++++++++++++++++++++++++");
//		
//		//only synchronise if the states are pairs 
//		if(this.initial_state instanceof Pair<?,?>) {
//		
//			
//			//1st step: remove transitions that go to states with request in the mixed ports
//			Iterator<STATE> it_state = this.chain.keySet().iterator(); 
//			while(it_state.hasNext()){
//				STATE s = it_state.next();	
//				Iterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).iterator();
//				while(it_trans.hasNext()) {
//					IMCREOTransition<STATE> t = it_trans.next();
//					LinkedHashSet<String> intersect_trans_final_1 = new LinkedHashSet<String>( ((IMCREOState)((Pair<?,?>) t.getFinal_state()).fst()).getRequests());
//					intersect_trans_final_1.retainAll(mixedports);
//					LinkedHashSet<String> intersect_trans_final_2 = new LinkedHashSet<String>( ((IMCREOState)((Pair<?,?>) t.getFinal_state()).snd()).getRequests());
//					intersect_trans_final_2.retainAll(mixedports);
//					
//					//if it goes to a state with request in mixed ports...
//					if(! (intersect_trans_final_1.isEmpty() && intersect_trans_final_2.isEmpty()) ) {
//						//remove the transition
//						it_trans.remove();
//						//System.out.println("[X] " + s + t + "\n 1st STEP");
//						
//					}
//					
//				}
//			}
//			
//			
//			
////			//2 - 1/2 step : join all the transitions from states [M]X to states
////			// X (the same state but without request mixed nodes)  and remove states [M]X
////			
////			//an auxiliar structure to keep track of the changed states, to ease the next steps...
////			LinkedHashSet<STATE> aux_changed_states = new LinkedHashSet<STATE>();
////			it_state = this.chain.keySet().iterator();
////			while(it_state.hasNext()){
////				STATE s = it_state.next();
////				
////				IMCREOState s1 = (IMCREOState) ((Pair<?,?>) s).fst();
////				IMCREOState s2 = (IMCREOState) ((Pair<?,?>) s).snd();
////				
////				HashSet<String> i_req_s1 = new HashSet<String>(s1.getRequests());
////				i_req_s1.retainAll(mixedports);
////				HashSet<String> i_req_s2 = new HashSet<String>(s2.getRequests());
////				i_req_s2.retainAll(mixedports);
////				
////				//??? this list of transitions only have interactive transitions (is this true)????
////				LinkedList<IMCREOTransition<STATE>> tr_tmp = this.chain.get(s);
////				
////				
////				//if at least one part of the state have a request on the same mixed ports
////				if(! tr_tmp.isEmpty() && (! i_req_s1.isEmpty() || ! i_req_s2.isEmpty()) ){
////					
////					Pair<IMCREOState, IMCREOState> newstate = new Pair<IMCREOState, IMCREOState>(s1.copy(), s2.copy());
////					newstate.fst().getRequests().removeAll(mixedports);
////					newstate.snd().getRequests().removeAll(mixedports);
////					//add reference to the new state
////					aux_changed_states.add((STATE)newstate);
////					
////					it_state.remove();
////					if(this.chain.containsKey(newstate)){
////						//add transitions from changed state to the existent state (in this case referred to by newstate)
////						LinkedList<IMCREOTransition<STATE>> state_and_changed_state_transitions =
////								new LinkedList<IMCREOTransition<STATE>>(this.chain.get(newstate));
////						state_and_changed_state_transitions.addAll(tr_tmp);
////						//put all the transitions in the existent state
////						this.chain.put((STATE)newstate, state_and_changed_state_transitions);
////						
////					}
////					else { 
////						//else make entry for this changed state and add all its transitions before removing mixed ports
////						this.chain.put((STATE) newstate, tr_tmp);
////					}
////				}
////				
////			}
////			
////			
////			// 2 - 2/2 step : remove all the transitions that violate active blocking in the sense that
////			// the transition with actions with less mixed nodes is violating the self-pumping assumption 
////			// But this "game" changes when the buffers are all full
////			for(STATE st : aux_changed_states) {
////				
////				IMCREOState s1 = (IMCREOState)((Pair<?,?>) st).fst();
////				IMCREOState s2 = (IMCREOState)((Pair<?,?>) st).snd();
////				IMCREOBufferState buf_s1 = s1.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : s1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
////				IMCREOBufferState buf_s2 = s2.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : s2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
////				
////				//An auxiliary list of the transitions to easily check the violation...
////				ArrayList<IMCREOTransition<STATE>> aux_trans_list = 
////						new ArrayList<IMCREOTransition<STATE>>(this.chain.get(st)) ;
////				//Check the violation by inspecting the first with all the remaining, the second with all the remaining... and so on
////				for(int i=0; i < aux_trans_list.size()-1; i++){
////					IMCREOTransition<STATE> tr1 = aux_trans_list.get(i);
////					for(int j=1; j < aux_trans_list.size() ; j++){
////						IMCREOTransition<STATE> tr2 = aux_trans_list.get(j);
////						//do it only for INTERACTIVE TRANSITIONS
////						if( tr1 instanceof IMCREOInteractiveTransition<?> && tr2 instanceof IMCREOInteractiveTransition<?>)
////						{
////							//get the intersections of actions with mixed nodes
////							LinkedHashSet<String> tr1_actions_inter_mixed = 
////									new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>)tr1).getActions().getActions());
////							tr1_actions_inter_mixed.retainAll(mixedports);
////							
////							LinkedHashSet<String> tr2_actions_inter_mixed = 
////									new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>)tr2).getActions().getActions());
////							tr2_actions_inter_mixed.retainAll(mixedports);
////							
////							//check the sizes and remove that with less mixed nodes...
////							if(tr1_actions_inter_mixed.size() > tr2_actions_inter_mixed.size()){
////								if(buf_s1.equals(IMCREOBufferState.FULL) && buf_s2.equals(IMCREOBufferState.FULL)) {
////									if(this.chain.get(st).contains(tr1)){
////										this.chain.get(st).remove(tr1);
////									}
////								}
////								else {
////									if(this.chain.get(st).contains(tr2)){
////										this.chain.get(st).remove(tr2);
////									}
////								}
////								
////							}
////							else {
////								if(tr1_actions_inter_mixed.size() < tr2_actions_inter_mixed.size()){
////									if(buf_s1.equals(IMCREOBufferState.FULL) && buf_s2.equals(IMCREOBufferState.FULL)) {
////										if(this.chain.get(st).contains(tr2)){
////											this.chain.get(st).remove(tr2);
////										}
////									}
////									else {
////										if(this.chain.get(st).contains(tr1)){
////											this.chain.get(st).remove(tr1);
////										}
////									}
////								}
////							}
////						}
////					}
////				}
////			}
//			
//			
//			
//			
//			//2nd step: update transitions leaving states nodeX to leave states 
//			//X (the same state but without mixed nodes) and remove forced non-determinism
//			it_state = this.chain.keySet().iterator();
//			while(it_state.hasNext()){
//				STATE s = it_state.next();
//				
//				IMCREOState s1 = (IMCREOState) ((Pair<?,?>) s).fst();
//				IMCREOState s2 = (IMCREOState) ((Pair<?,?>) s).snd();
//				
//				HashSet<String> i_req_s1 = new HashSet<String>(s1.getRequests());
//				i_req_s1.retainAll(mixedports);
//				HashSet<String> i_req_s2 = new HashSet<String>(s2.getRequests());
//				i_req_s2.retainAll(mixedports);
//				
//				LinkedList<IMCREOTransition<STATE>> tr_tmp = this.chain.get(s);
//				
//				//if at least one part of the state have a request on the same mixed ports
//				if(! tr_tmp.isEmpty() && (! i_req_s1.isEmpty() || ! i_req_s2.isEmpty()) ){
//					
//					Pair<IMCREOState, IMCREOState> newstate = new Pair<IMCREOState, IMCREOState>(s1.copy(), s2.copy());
//					newstate.fst().getRequests().removeAll(mixedports);
//					newstate.snd().getRequests().removeAll(mixedports);
//					
//					
//					it_state.remove();
//					//System.out.println("[X] " + s + "\n  STATE WITH MIXED PART (synchronisation step 2)");
//					if(this.chain.containsKey(newstate)){
//						//remove nondeterminism
//						LinkedList<IMCREOTransition<STATE>> without_nondeterminism = this.removeNonDeterminism((STATE)newstate, this.chain.get(newstate), tr_tmp, mixedports);
//						this.chain.put((STATE)newstate, without_nondeterminism);
//						
//					}
//					else { 
//						this.chain.put((STATE) newstate, tr_tmp);
//					}
//				}
//			}
//			
//			
//	
//			
//			//3d step: remove transmissions not in the correct order
//			it_state = this.chain.keySet().iterator();
//			while( it_state.hasNext() ) {
//				STATE s = it_state.next();
//				
//				IMCREOState s1 = (IMCREOState) ((Pair<?,?>) s).fst();
//				IMCREOState s2 = (IMCREOState) ((Pair<?,?>) s).snd();
//				//if some of the two states are transmitting... 
//				if(s1.getTransmissions().size() > 0 || s2.getTransmissions().size() >0 && ! this.chain.get(s).isEmpty()){
//					
//					//create a set of Transmissions on the original state: Ti... 
//					//this set does not count with merged nodes ($i suffixed nodes)
//					//this set counts with the notion of FULL buffer
//					//IMCREOBufferState buf_s1 = s1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//					//IMCREOBufferState buf_s2 = s2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//					IMCREOBufferState buf_s1 = s1.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : s1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//					IMCREOBufferState buf_s2 = s2.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : s2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//					
//					LinkedHashSet<String> poset_prepared_s1 = prepareTransmission(s1, buf_s1);
//					LinkedHashSet<String> poset_prepared_s2 = prepareTransmission(s2, buf_s2);
//					
//					LinkedHashSet<String> Ti = new LinkedHashSet<String>(poset_prepared_s1); //prepareTransmission(s1, buf_s1);
//					Ti.addAll(new LinkedHashSet<String>(poset_prepared_s2)); //Ti.addAll(prepareTransmission(s2, buf_s2));
//					
//					//Let us check if the list of transmissions respect Ti\Tf < Tf
//					// if not, remove such transition
//					ListIterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).listIterator();
//					while(it_trans.hasNext()){
//						IMCREOTransition<STATE> t = it_trans.next();
//						if(t.getFinal_state() instanceof Pair<?, ?> && t instanceof IMCREOMarkovianTransition<?>) {
//						 
//							// create a set of Transmissions on the original state: Tf...
//							IMCREOState ts1 = (IMCREOState) ((Pair<?,?>) t.getFinal_state()).fst();
//							IMCREOState ts2 = (IMCREOState) ((Pair<?,?>) t.getFinal_state()).snd();
//							//IMCREOBufferState buf_ts1 = ts1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//							//IMCREOBufferState buf_ts2 = ts2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//							IMCREOBufferState buf_ts1 = ts1.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : ts1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//							IMCREOBufferState buf_ts2 = ts2.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : ts2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
//						
//							
//							LinkedHashSet<String> poset_prepared_ts1 = prepareTransmission(ts1, buf_ts1);
//							LinkedHashSet<String> poset_prepared_ts2 = prepareTransmission(ts2, buf_ts2);
//							
//							LinkedHashSet<String> Tf = new LinkedHashSet<String>(poset_prepared_ts1);
//							Tf.addAll(new LinkedHashSet<String>(poset_prepared_ts2));
//							//Tf.retainAll(Ti);
//							
//							
//							//the set transmitted
//							LinkedHashSet<String> T = new LinkedHashSet<String>(Ti);
//							T.removeAll(Tf);
//							
//							//is the transmitted set empty?
//							//Maybe it is not... maybe it is a node repeated on the transmissions of both parts of the node
//							if(T.isEmpty()) {
//								
//								LinkedHashSet<String> parts_intersect = new LinkedHashSet<String>(poset_prepared_s1);
//								parts_intersect.retainAll(poset_prepared_s2);
//								
//								int n_ti = s1.getTransmissions().size() + s2.getTransmissions().size();
//								int n_tf = ts1.getTransmissions().size() + ts2.getTransmissions().size();
//								
//								// There is actually a transmission when the intersection of the transmissions of both
//								// parts of the nodes is not empty and the size of the disjoint union of both transmission
//								// parts from the initial state and the size of the same disjoint union from the target state
//								// is different???.
//								// Moreover, we remove the transition if the node being transmitted shall transmit after those
//								// that are still transmitting.
//								if( (n_ti != n_tf) && ! isTransmittedMinorThanToTransmit(parts_intersect, Tf, already_mixed) ){
//									it_trans.remove();
//									System.out.println("[X] " + s + t + "\n NOT IN CORRECT ORDER (1st) step 3");
//								}
//							}
//							else {
//								//if there is a transmission and there are nodes still transmitting in the target state
//								//and the transmitted states shall transmit after those still transmitting... then remove
//								// the transmission
//								if(! Tf.isEmpty() && ! T.isEmpty() && ! isTransmittedMinorThanToTransmit(T, Tf, already_mixed)){
//										it_trans.remove();
//										System.out.println("[X] " + s + t + "\n NOT IN CORRECT ORDER (2nd) step 3");
//								}
//							}
//						}
//					}
//				}
//			}
//			
//			
//			//to reduce state space....		
//			this.removeUnaccessibleStates();
//			
//			
//			
//			//4th step remove undesired requests
//			// AND undesired interactive transitions based on:
//			// when transmitting, it is not possible to have an interactive transition, 
//			// unless the ports that start transmitting are not already transmitting. 
//			
//			it_state = this.chain.keySet().iterator();
//			while(it_state.hasNext()){
//				STATE s = it_state.next();
//				
//				if(s instanceof Pair<?,?>){
//					IMCREOState st1 = (IMCREOState)((Pair<?, ?>) s).fst();
//					IMCREOState st2 = (IMCREOState)((Pair<?, ?>) s).snd();
//					//get the active ports for the state 
//					LinkedHashSet<String> active_ports = this.getActivePortsForState2(s);
//					
//					//Now get the requests that already exist in the current state
//					LinkedHashSet<String> current_requests = new LinkedHashSet<String>(st1.getRequests());
//					current_requests.addAll(st2.getRequests());
//					
//					//iterate over the transitions leaving the current state 
//					ListIterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).listIterator();
//					while(it_trans.hasNext()) {
//						IMCREOTransition<STATE> t = it_trans.next();
//						//if the transtition is markovian 
//						if(t instanceof IMCREOMarkovianTransition) {
//							//if the state is transmitting (on one side or another...)
//							//it is never possible that transmissions are null
//							//assert st1.getTransmissions()!=null && st2.getTransmissions() !=null
//							if(st1.getTransmissions().size()>0 || st2.getTransmissions().size()>0) {
//								//collect the requests of the states 
//								IMCREOState tr_st1 = (IMCREOState)((Pair<?, ?>) t.getFinal_state()).fst();
//								IMCREOState tr_st2 = (IMCREOState)((Pair<?, ?>) t.getFinal_state()).snd();
//								LinkedHashSet<String> requests = new LinkedHashSet<String>(tr_st1.getRequests());
//								requests.addAll(tr_st2.getRequests());
//								
//								//remove the current requests from the set of requests in the 
//								//goal state...
//								requests.removeAll(current_requests);
//								
//								//intersect the requests set with the active ports set
//								//requests.retainAll(active_ports);
//								Iterator<String> req_it = requests.iterator();
//								while(req_it.hasNext()){
//									String r = req_it.next();
//									String r_stripped = r.contains("$") ? r.substring(0,r.lastIndexOf('$')) : r;
//									if(! (active_ports.contains(r) || active_ports.contains(r_stripped))){
//										req_it.remove();
//									}
//								}
//								
//								//if the intersection does not result into an empty set
//								//meaning that there are requests that also are active ports...
//								if(requests.size()>0){
//									//remove the transition
//									it_trans.remove();
//									//System.out.println("[X] " + s + t + "\n UNDESIRED (1st) step 4");
//								}
//							}
//						}
//						else { //if the transition is interactive
//							//and there is no requests in the previous state and the state is empty/none 
//							//then a new action of ports cannot exist.
//							
//							
//							LinkedHashSet<String> req_st = new LinkedHashSet<String>(st1.getRequests());
//							req_st.addAll(st2.getRequests());
//							LinkedHashSet<String> req_st_aux = new LinkedHashSet<String>();
//							//remove prefixes from request set
//							for(String r : req_st) {
//								int posDot = r.indexOf('.');
//								if(posDot!=-1 && posDot > 0){
//									req_st_aux.add(r.substring(posDot+1,r.length()));
//								}
//								else {
//									req_st_aux.add(r);
//								}
//							}
//							req_st = req_st_aux;
//							
//							
//							LinkedHashSet<String> acts = new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>) t).getActions().getActions());
//							
//							LinkedHashSet<String> acts_minus_mixed = new LinkedHashSet<String>(acts);
//							acts_minus_mixed.removeAll(mixedports);
//							acts_minus_mixed.removeAll(already_mixed);
//							
//							LinkedHashSet<String> req_inter_actions = new LinkedHashSet<String>(req_st);
//							req_inter_actions.retainAll(acts_minus_mixed);
//							
//							LinkedHashSet<String> active_inter_actions = new LinkedHashSet<String>(active_ports);
//							active_inter_actions.retainAll(acts);
//							
//							//if(active_inter_actions.size()!=0) {
//							//	it_trans.remove();
//							//}
//							if(!(req_st.containsAll(acts_minus_mixed) || (acts_minus_mixed.size()==0 && active_inter_actions.size()==0))){
//								it_trans.remove();
//								//System.out.println("[X] " + s + t + "\n UNDESIRED (2nd) step 4");
//							}
//							else{
//								if(this.initial_state.equals(s) && 
//										(
//												(
//														!st1.getBuffer().contains(IMCREOBufferState.FULL)  
//												) && 
//												(
//														!st2.getBuffer().contains(IMCREOBufferState.FULL)  
//														
//												)
//											)
//								) {
//									it_trans.remove();
//									//System.out.println("[X] " + s + t + "\n UNDESIRED (3nd) step 4");
//								}
//							}
//						}
//					}
//				}
//			}
//			
//			
//			
//			
//			//5th step remove states without outgoing transitions 
//			//this is, states that are absorving and cause deadlock
//			//this only removes the state from the list of states, not
//			//from the list of transitions... so the deadlock still exists...
//			it_state = this.chain.keySet().iterator();
//			while(it_state.hasNext()) {
//				STATE s = it_state.next();
//				//remove the state if it ends up without transitions
//				if(this.chain.containsKey(s) && this.chain.get(s).isEmpty() && ! s.equals(initial_state)) {
//					it_state.remove();
//					//System.out.println("[X] " + s + "\n  STATE WIHTOUT OUTGOING EDGES (synchronisation step 5)" );
//				//	this.final_states.remove(s);
//				}
//			}
//			
//			
//			//6th step: remove unaccessible states and their transitions 
//			this.removeUnaccessibleStates();
//			
//		}
//		
//		
//		
//		return (IMCREOimc<Pair<IMCREOState, IMCREOState>>) this;
//		
//	}
//	
//	
//	
//	
//
//	/**
//	 * 
//	 * @param t
//	 * @param tf
//	 * @return
//	 */
//	private boolean isTransmittedMinorThanToTransmit(Set<String> t, Set<String> tf, Set<String> global_mixedports) {
//	
//		boolean res = true;
//		
//		for(String n_t : t){
//			for(String n_tf : tf) {
//				POPorts.REL comparison = this.poset._transmit_order_(n_t, n_tf);
//				if( comparison == POPorts.REL.PAR && (n_t.contains("#") ^ n_tf.contains("#") )) {
//					comparison = n_t.contains("#") ? POPorts.REL.BFR : POPorts.REL.AFT ; 
//				}
//				res = res && (comparison != POPorts.REL.AFT);
//			}
//		}
//		
//		return res;
//	}
//
//
//
//	/**
//	 * @param s1
//	 * @param buf_s1
//	 * @return
//	 */
//	private LinkedHashSet<String> prepareTransmission(IMCREOState s,
//			IMCREOBufferState buf_s) {
//		LinkedHashSet<String> transmissions = new LinkedHashSet<String>();
//	
//		for(String n : s.getTransmissions()) {
//			int dollar_pos = n.indexOf('$');
//			String new_n =  dollar_pos == -1 ? n : n.substring(0,dollar_pos);
//			
//			if(buf_s.equals(IMCREOBufferState.FULL)) {
//				String new_n_full = new_n + "#" ;
//				for(Pair<String, String> p : this.getPoset().getPo()) {
//					if(p.fst().equals(new_n_full) || p.snd().equals(new_n_full)) {
//						new_n = new_n_full;
//						break;
//					}
//				}
//			}
//			transmissions.add( new_n );
//			
//		}
//		return transmissions;
//	}
//
//
//	
//	
//	
//	
//	
//	/**
//	 * This method performs a cleaning of transitions and states after a synchronisation
//	 * via multiple ports based on a notion of balanced mixed ports in transmission states...
//	 * 
//	 * @param mixedports
//	 * @return
//	 */
//	@SuppressWarnings("unchecked")
//	public IMCREOimc<IMCREOState> cleanAfterMultiMixedPortsSynchronisation (Set<String> mixedports) {
//		System.out.println(this);
//		IMCREOimc<IMCREOState> newimc = new IMCREOimc<IMCREOState>();
//		
//		LinkedHashSet<IMCREOState> merged_states = new LinkedHashSet<IMCREOState>();
//		
//		newimc.setInitial_state(((IMCREOState)this.initial_state).copy());
//		newimc.setPoset(new POPorts(this.poset.getPo()));
//		
//		for(STATE s : this.chain.keySet()) {
//				LinkedList<IMCREOTransition<IMCREOState>> transitions = new LinkedList<IMCREOTransition<IMCREOState>>();
//				for(IMCREOTransition<STATE> t : this.chain.get(s)) {
//					if(t instanceof IMCREOMarkovianTransition<?>) {
//						IMCREOMarkovianTransition<IMCREOState> new_tr = 
//								new IMCREOMarkovianTransition<IMCREOState>(
//										((IMCREOState) t.getFinal_state()).copy(),
//										((IMCREOMarkovianTransition<?>) t).getRate(),
//										((IMCREOMarkovianTransition<?>) t).getLabel()
//										);
////						new_tr.setFinal_state(((IMCREOState) t.getFinal_state()).copy());
////						new_tr.setRate(((IMCREOMarkovianTransition<?>) t).getRate());
////						new_tr.setLabel(((IMCREOMarkovianTransition<?>) t).getLabel());
//						if(! transitions.contains(new_tr)) {
//							transitions.add(new_tr);
//						}
//					}
//					else {
//						if(t instanceof IMCREOInteractiveTransition<?>) {
//							boolean is_balanced = this.checkBalancedMixedPortsTransmission((IMCREOInteractiveTransition<STATE>)t, mixedports);
//							if(is_balanced){
//								IMCREOInteractiveTransition<IMCREOState> new_tr = 
//										new IMCREOInteractiveTransition<IMCREOState>(
//												((IMCREOState) t.getFinal_state()).copy(),
//												new IMCREOAction(((IMCREOInteractiveTransition<IMCREOState>) t).getActions().getActions())
//												);
//								//createInteractiveTransition(t);
//								if(! transitions.contains(new_tr)) {
//									transitions.add(new_tr);
//								}
//							}
//							else {
//								IMCREOInteractiveTransition<IMCREOState> reduction = reduceConsecutiveInteractiveTransitions((IMCREOInteractiveTransition<IMCREOState>)t, mixedports);
//								if(! reduction.equals(t)) {
//									//System.out.println("[R] " + s + t + "\n  REDUCTED TO " + reduction);
//									is_balanced = this.checkBalancedMixedPortsTransmission((IMCREOInteractiveTransition<STATE>)reduction, mixedports);
//									if(is_balanced) {
//										merged_states.add((IMCREOState)t.getFinal_state());
//										IMCREOInteractiveTransition<IMCREOState> new_tr =  
//												new IMCREOInteractiveTransition<IMCREOState>(
//														reduction.getFinal_state().copy(),
//														new IMCREOAction(reduction.getActions().getActions())
//														);
//												//createInteractiveTransition((IMCREOInteractiveTransition<STATE>)reduction);
//										if(! transitions.contains(new_tr)) {
//											transitions.add(new_tr);
//										}
//									}
//									//System.out.println("[X] "+ s + reduction + "\n  RED NOT BALANCED ->");
//								}
//								//System.out.println("[X] " +s + t + "\n  NOT BALANCED");
//							}
//						}
//						
//					}
//				}
//				newimc.getChain().put((IMCREOState) s, transitions);
//		}
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++\n\n" + merged_states);
//		
//		//remove ITs from merged_states (or merged_states if they have no markovian transition)
//		for(IMCREOState st : merged_states) {
//			
//			if(newimc.getChain().containsKey(st)){
//				LinkedList<IMCREOTransition<IMCREOState>> trans = newimc.getChain().get(st);
//				ListIterator<IMCREOTransition<IMCREOState>> trans_iter = trans.listIterator();
//				while(trans_iter.hasNext()) {
//					IMCREOTransition<IMCREOState> t = trans_iter.next();
//					if(t instanceof IMCREOInteractiveTransition<?>) {
//						trans_iter.remove();
//						//System.out.println("[X] " + st + t + "\n  IT LEAVING MERGED STATE " + st);
//					}
//				}
//				
//				if(trans.isEmpty()) {
//					newimc.getChain().remove(st);
//					//System.out.println("[X] " + st + "\n  STATE REMOVED FOR EMPTYNESS" );
//				}
//			}
//		}
//		
//		newimc.removeUnaccessibleStates();
//		
//		pruneITOnAlreadyActivePorts(newimc);
//		
//		newimc.removeUnaccessibleStates();
//		
//		//System.out.println("--------------------------------------------------\n------------------------------------------\n" + newimc);
//		
//		return newimc;
//	}
//
//
//
//	@SuppressWarnings("unchecked")
//	private void pruneITOnAlreadyActivePorts(IMCREOimc<IMCREOState> newimc) {
//		
//		
//		Iterator<IMCREOState> it_state = newimc.chain.keySet().iterator();
//		while(it_state.hasNext()){
//			IMCREOState s = it_state.next();
//			LinkedHashSet<String> active_ports = getActivePortsForState2((STATE)s);
//			ListIterator<IMCREOTransition<IMCREOState>> trans_it = newimc.chain.get(s).listIterator();
//			while(trans_it.hasNext()) {
//				IMCREOTransition<IMCREOState> t = trans_it.next();
//				if(t instanceof IMCREOInteractiveTransition<?>) {
//					LinkedHashSet<String> active_inter_actions = new LinkedHashSet<String>(active_ports);
//					active_inter_actions.retainAll(((IMCREOInteractiveTransition<?>) t).getActions().getActions());
//					if(! active_inter_actions.isEmpty()){
//						trans_it.remove();
//						//System.out.println("[X] " + s + t + "\n  PRUNED IT" );
//					}
//				}
//			}
//		}	
//	}
//
//
//
////	/**
////	 * @param t
////	 * @return
////	 */
////	@SuppressWarnings("unchecked")
////	private IMCREOInteractiveTransition<IMCREOState> createInteractiveTransition(
////			IMCREOTransition<STATE> t) {
////		IMCREOInteractiveTransition<IMCREOState> new_tr = new IMCREOInteractiveTransition<IMCREOState>();
////		new_tr.setFinal_state(((IMCREOState) t.getFinal_state()).copy());
////		new_tr.setActions(new IMCREOAction(new HashSet<String>(((IMCREOInteractiveTransition<IMCREOState>) t).getActions().getActions())));
////		return new_tr;
////	}
//	
//	
//	
//	/**
//	 * This method checks whether a transition is balanced in respect to the mixed ports transmitting:
//	 * That is, any transition transmitting mixed ports shall transmit exactly 2 mixed ports, due to the fact
//	 * that in any connection are always involved ony 2 channels. 
//	 * 
//	 * So when an IT has one mixed port X in the set of actions, then the final state of this IT shall
//	 * have a transmission set of two X under the form of X$1 and X$2 (presumably).
//	 * 
//	 * Then, if the X is not duplicated, it means that the port is seen as disconnected, and then it is
//	 * not balanced...
//	 * 
//	 * @param t
//	 * @param mixedports
//	 * @return
//	 */
//	private boolean checkBalancedMixedPortsTransmission(IMCREOInteractiveTransition<STATE> t, Set<String> mixedports) {
//	
//		boolean is_balanced = true;
//		LinkedHashSet<String> actions_intersect_mixedports = new LinkedHashSet<String>(t.getActions().getActions());
//		actions_intersect_mixedports.retainAll(mixedports);
//		LinkedHashMap<String, Integer> transmission_counter = new LinkedHashMap<String, Integer>(actions_intersect_mixedports.size());
//		
//		//prepare counter
//		for(String a : actions_intersect_mixedports) {
//			transmission_counter.put(a, 0);
//		}
//		
//		//count
//		for(String port : new LinkedHashSet<String>(((IMCREOState)t.getFinal_state()).getTransmissions())) {
//			//trim port being transmitted off the $i appendix
//			int index_of_dollar = port.indexOf('$'); 
//			port = index_of_dollar != -1 ? port.substring(0,index_of_dollar): port;
//			if(transmission_counter.containsKey(port)){
//				transmission_counter.put(port, transmission_counter.get(port) + 1);
//			}
//		}
//		
//		//check whether all the elements in the counter are exactly 2
//		Iterator<String> it = transmission_counter.keySet().iterator();
//		while(is_balanced && it.hasNext()) {
//			String p = it.next();
//			is_balanced = transmission_counter.get(p) == 2;
//		}
//		
//	
//		return is_balanced;
//	}
//	
//
//	
//	
//	private IMCREOInteractiveTransition<IMCREOState> reduceConsecutiveInteractiveTransitions (IMCREOInteractiveTransition<IMCREOState> t, Set<String> mixedports){
//		IMCREOInteractiveTransition<IMCREOState> res = new IMCREOInteractiveTransition<IMCREOState>();
//		res.getActions().getActions().addAll(new LinkedHashSet<String>(t.getActions().getActions()));
//		res.setFinal_state(t.getFinal_state().copy());
//		
//		if(this.chain.containsKey(t.getFinal_state())){
//			//forward search for a consecutive transition
//			for(IMCREOTransition<STATE> trans : this.chain.get(t.getFinal_state())){
//				if(trans instanceof IMCREOInteractiveTransition<?>) {
//					//first we join the actions into a sinlge set of actions
//					res.getActions().getActions().addAll(new LinkedHashSet<String>(((IMCREOInteractiveTransition<?>) trans).getActions().getActions()));
//					//and set the new state
//					res.setFinal_state(((IMCREOState)trans.getFinal_state()).copy());
//					//we break out of the cycle because we only have (really???) 2 consecutive interactive transitions 
//					break;
//				}
//			}
//		}
//				
//		return res;
//	}  
//	
//	
//	
//	
//	
//	
//
//
//
//	//HIDE
//	
//	/**
//	 * This (destructive) method performs the traditional hide operations, 
//	 * where the nodes used to synchronise become internal, 
//	 * and therefore, interaction transitions with those nodes
//	 * become as well internal.
//	 * 
//	 * Differently to what happens with traditional IMCs, this
//	 * hide operation do not make all the interactive transitions 
//	 * evolving via a mixed node internal. Due to adopting a set
//	 * of actions instead of a single action, an Inter. Trans. only
//	 * become internal if the set of actions is only composed of
//	 * the actions used to synchronise... the mixedports.   
//	 * 
//	 * 
//	 * @param mixedports - the set of ports that shall be hidden 
//	 * 
//	 * 
//	 */
//	@SuppressWarnings("unchecked")
//	public void hide(Set<String> mixedports) {
//		Iterator<STATE> it_states = this.chain.keySet().iterator();
//		LinkedHashMap<IMCREOState, LinkedList<IMCREOTransition<STATE>>> aux_map = new LinkedHashMap<IMCREOState, LinkedList<IMCREOTransition<STATE>>>();
//		while(it_states.hasNext()){
//			STATE s = it_states.next();
//			ListIterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).listIterator();
//			while(it_trans.hasNext()) {
//				IMCREOTransition<STATE> t = it_trans.next();
//				if(t instanceof IMCREOInteractiveTransition){
//					((IMCREOInteractiveTransition<STATE>) t).getActions().getActions().removeAll(mixedports);
//					if(((IMCREOInteractiveTransition<STATE>) t).getActions().getActions().isEmpty()){
//						((IMCREOInteractiveTransition<STATE>) t).getActions().getActions().add("tau");
//					}
//				}
//				t.setFinal_state((STATE) this.hideTransmissions(t.getFinal_state()));
//			}
//			//FIXME: is it guaranteed that the above statement and the below statement create 
//			// the same state? It may cause hash problems...
//			IMCREOState new_state = hideTransmissions(s);
//			aux_map.put(new_state, this.chain.get(s));
//			
//			//remove mixed ports relations on the poset...
//			Iterator<Pair<String, String>> it_poset_ports= this.poset.getPo().iterator();
//			while(it_poset_ports.hasNext()) {
//				Pair<String, String> p = it_poset_ports.next();
//				if(mixedports.contains(p.fst()) || mixedports.contains(p.snd())) {
//					it_poset_ports.remove();
//				}
//			}
//		}
//		
//		this.chain = (Map<STATE, LinkedList<IMCREOTransition<STATE>>>) aux_map;
//	}
//
//
//
//	/**
//	 * This method performs the hide of transmission parts of states.
//	 * Basically, it adds a $ to the beginning of the mixed ports that
//	 * are transmitting (which are identified by a $ or more in its name)
//	 * 
//	 * @param s - the state to hide
//	 * @return an hidden state as explained above
//	 */
//	private IMCREOState hideTransmissions(STATE s) {
//		Iterator<String> it_transmissions = ((IMCREOState) s).getTransmissions().iterator();
//		IMCREOState new_state = new IMCREOState();//((IMCREOState) s).copy();
//		new_state.setRequests( new LinkedHashSet<String>(((IMCREOState) s).getRequests()) );
//		new_state.setBuffer(((IMCREOState) s).getBuffer());
//		while(it_transmissions.hasNext()){
//			String port = it_transmissions.next();
//			if(port.contains("$") && port.indexOf('$') > 0 && port.indexOf('$') < port.length()){
//				//new_state.getTransmissions().remove(port);
//				port = "" + port;
//				
//			}
//			new_state.getTransmissions().add(port);
//		}
//		
//		return new_state;
//	} 
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	/**
////	 * This method hides every interactive transitions, this is, 
////	 * sets all interactive transitions to tau.
////	 * 
////	 * It is not useful most of the times, but it may become useful 
////	 * for further creation of a CTMC... 
////	 * 
////	 * This is a destructive method!!
////	 * 
////	 */
////	public void hide_all(){
////		
////		for(STATE st : this.chain.keySet()) {
////			for(IMCREOTransition<STATE> t : this.chain.get(st)) {
////				if(t instanceof IMCREOInteractiveTransition<?>){
////					((IMCREOInteractiveTransition<?>) t).getActions().setActions(new HashSet<String>());
////					((IMCREOInteractiveTransition<?>) t).getActions().getActions().add("tau");
////				}
////			}
////		}
////	}
//	
//	
//	
//	
//	
//	
//	
//
//	
//	
//	/**
//	 *	This method computes the ports that are active for a transmission state.
//	 * 
//	 *  The computation is based on the ports that are transmitting and
//	 *  their relations in the partial order set. If a port x is transmitting
//	 *  and is related to some port y in the poset then x and y are active.
//	 *  
//	 *  This computation ignores the states with #, because in the end, 
//	 *  # indicates a discontinuity in the partial order... 
//	 * 
//	 * 
//	 * @param st the state to check the ports that are active 
//	 * @return a set of ports that are active
//	 */
//	private LinkedHashSet<String> getActivePortsForState2(STATE st){
//	
//		LinkedHashSet<String> activeports = new LinkedHashSet<String>();
//		LinkedHashSet<String> transmitting = new LinkedHashSet<String>();
//		//check state sort
//		if(st instanceof Pair<?,?>){
//			IMCREOState st1 = (IMCREOState)((Pair<?, ?>) st).fst();
//			IMCREOState st2 = (IMCREOState)((Pair<?, ?>) st).snd();
//			//if the state is transmitting (on one side or another...)
//			//it is never possible that transmissions are null
//			//assert st1.getTransmissions()!=null && st2.getTransmissions() !=null
//			if(st1.getTransmissions().size()>0 || st2.getTransmissions().size()>0) {
//				//collect all the states transmitting
//				transmitting = new LinkedHashSet<String>(st1.getTransmissions());
//				transmitting.addAll(st2.getTransmissions());
//			}
//		}
//		else {
//			if(st instanceof IMCREOState) {
//				if(((IMCREOState) st).getTransmissions().size()>0) {
//					transmitting = new LinkedHashSet<String>(((IMCREOState) st).getTransmissions());
//				}
//			}
//		}
//	
//			
//		boolean added_new_ports = true;
//		while(added_new_ports) {
//			added_new_ports = false;
//			//add the ports transmitting as activeports...
//			activeports = new LinkedHashSet<String>(transmitting);
//			//for each port transmitting
//			for(String port_transmitting : activeports) {
//				
//				String port_transmitting_stripped = port_transmitting.contains("$") ? 
//						port_transmitting.substring(0,port_transmitting.lastIndexOf('$')) : 
//							port_transmitting;
//				
//				//get all the ports that are related to this one, from the poset
//				for(Pair<String, String> ord : this.poset.getPo()) {
//					//check if the port_transmitting is in some relation
//					if(ord.fst().equals(port_transmitting_stripped) && ! ord.snd().endsWith("#")) {
//						//we ignore the ports ending with # and put the others in the active ports
//						added_new_ports = added_new_ports || transmitting.add(ord.snd()); 
//					}
//					else {
//						if(ord.snd().equals(port_transmitting_stripped) && ! ord.fst().endsWith("#")) {
//							//we ignore the ports ending with # and put the others in the active ports
//							added_new_ports = added_new_ports || transmitting.add(ord.fst());
//						}
//					}
//				}
//			}
//		}
//
//		return activeports;
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	/**
//	 * This method performs the union of two sets of strings,
//	 * and it is non-destructive. 
//	 * 
//	 * @param ports1 - the first set of ports (as strings)
//	 * @param ports2 - the second set of ports (as strings)
//	 * @return the union of the two sets given as parameters
//	 */
//	/*
//	private Set<String> unitePorts( Set<String> ports1, Set<String> ports2) {
//		
//		Set<String> ports =  new HashSet<String>(ports1);
//		ports.addAll(ports2);
//		
//		return ports;
//	}
//	 */
//
//
//	
//	
//	
//	private void removeUnaccessibleStates(){
//		PriorityQueue<STATE> to_visit = new PriorityQueue<STATE>();
//		LinkedList<STATE> visited = new LinkedList<STATE>();
//		
//		to_visit.add(this.initial_state);
//		
//		while(!to_visit.isEmpty()) {
//			STATE s = to_visit.poll();
//			visited.add(s);
//			if(this.chain.containsKey(s)){
//				for(IMCREOTransition<STATE> trans : this.chain.get(s)) {
//					STATE st_trans = trans.getFinal_state(); 
//					if(! (to_visit.contains(st_trans) || visited.contains(st_trans))){
//						to_visit.add(st_trans);
//					}
//				}
//			}
//		}
//		
//		Iterator<STATE> it_states = this.chain.keySet().iterator();
//		while(it_states.hasNext()){
//			STATE st = it_states.next();
//			if(! visited.contains(st)){
//				it_states.remove();
//				//System.out.println("[X] " + st + "\n  STATE NOT ACCESSIBLE (removeUnaccessibleStates)");
//			}
//		}
//		
//	}
//	
//	
//
//
//	
//
//
//
//	/**
//	 * This method removes forced nondeterminism that may exist upon 
//	 * junction of two states.
//	 * 
//	 * @param old_state_trans - the list of transitions of the base state 
//	 * @param new_state_trans - the list of transitions of the state that 
//	 * via remotion of mixed ports is equal to the old_state 
//	 * @param mixedports - the ports that will be joined
//	 * @return
//	 */
//	private LinkedList<IMCREOTransition<STATE>> removeNonDeterminism(
//			STATE s,
//			LinkedList<IMCREOTransition<STATE>> old_state_trans,
//			LinkedList<IMCREOTransition<STATE>> new_state_trans, Set<String> mixedports) 
//		{
//		
//		IMCREOState s1 = (IMCREOState)((Pair<?,?>) s).fst();
//		IMCREOState s2 = (IMCREOState)((Pair<?,?>) s).snd();
//		IMCREOBufferState buf_s1 = s1.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : s1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.NONE;
//		IMCREOBufferState buf_s2 = s2.getBuffer().contains(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : s2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.NONE;
//		IMCREOBufferState global_buf = buf_s1.equals(IMCREOBufferState.EMPTY) || buf_s2.equals(IMCREOBufferState.EMPTY) ? IMCREOBufferState.EMPTY : buf_s1.equals(IMCREOBufferState.FULL) || buf_s2.equals(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.NONE;
//		
//		ListIterator<IMCREOTransition<STATE>> it = old_state_trans.listIterator();
//		while(it.hasNext()){
//			IMCREOTransition<STATE> t1 = it.next();
//			if(t1 instanceof IMCREOInteractiveTransition) {
//				ListIterator<IMCREOTransition<STATE>> it2 = new_state_trans.listIterator();
//				while(it2.hasNext()){
//					IMCREOTransition<STATE> t2 = it2.next();
//					if(t2 instanceof IMCREOInteractiveTransition){
//						LinkedHashSet<String> inter_actions_transitions = new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>) t1).getActions().getActions());
//						inter_actions_transitions.retainAll(((IMCREOInteractiveTransition<STATE>) t2).getActions().getActions());
//						
//						//aqui ---> nao determinismo existe sse intersecao das accoes nas duas trans
//						//e igual a uma delas... se sim, remover a que e igual
//						//Mas devemos ter em atenção se o estado final está ou não cheio... o que inverte a solução se estiver cheio...
//						if(inter_actions_transitions.equals(((IMCREOInteractiveTransition<STATE>) t1).getActions().getActions())){
//							if(global_buf.equals(IMCREOBufferState.FULL)){
//								it2.remove();
//								//System.out.println("[X] " + s + t2 + "\n NON DETERMINISM (1) step 2");
//							}
//							else{
//								it.remove();
//								//System.out.println("[X] " + s + t1 + "\n NON DETERMINISM (2) step 2");
//								break;
//							}
//							
//						}
//						else {
//							if(inter_actions_transitions.equals(((IMCREOInteractiveTransition<STATE>) t2).getActions().getActions())) {
//								if(global_buf.equals(IMCREOBufferState.FULL) ){
//									it.remove();
//									//System.out.println("[X] " + s + t1 + "\n NON DETERMINISM (3) step 2");
//									break;
//								}
//								else{
//									it2.remove();
//									//System.out.println("[X] " + s + t2 + "\n NON DETERMINISM (4) step 2");
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		
//		old_state_trans.addAll(new_state_trans);
//		
//		return old_state_trans;
//	}	
//	
//	
//	
//	
//	
//	
//	
//	
//	/**
//	 * This (non-destructive) method performs the wise union of the
//	 * imcreo, taking advantage of the wiseunion for the states. 
//	 * 
//	 * The idea of this method is that it can prepare the composed
//	 * IMC (with pairs of states) as a IMC with simple states 
//	 * (ie, not pairs) so that it can be used for further compositions.
//	 * 
//	 * @param mixednodes - the mixed nodes that shall be disguised 
//	 * for state distinction...
//	 * 
//	 * @return a new IMCREOimc with the nodes merged as a single and
//	 * simplified node.   
//	 */
//	public IMCREOimc<IMCREOState> wiseUnion(Set<String> mixednodes) {
//		
//		IMCREOimc<IMCREOState> newimc = null;
//		
//		if(this.getInitial_state() instanceof Pair<?,?>) {
//			newimc = new IMCREOimc<IMCREOState>();
//			
//			Iterator<STATE> it = this.chain.keySet().iterator();
//			while(it.hasNext()){
//				STATE s = it.next();
//				if(s instanceof Pair<?,?>){
//					if(((Pair<?,?>) s).fst() instanceof IMCREOState && ((Pair<?,?>) s).snd() instanceof IMCREOState ){
//						IMCREOState fst = ((IMCREOState) ((Pair<?, ?>) s).fst()).copy();
//						IMCREOState snd = ((IMCREOState) ((Pair<?, ?>) s).snd()).copy();
//						IMCREOState newstate = fst.wiseUnion(snd, mixednodes);
//						
//						LinkedList<IMCREOTransition<IMCREOState>> transitions = new LinkedList<IMCREOTransition<IMCREOState>>();
//						for(IMCREOTransition<STATE> t : this.chain.get(s)){
//							if(t.getFinal_state() instanceof Pair<?,?>){
//								if(((Pair<?,?>) t.getFinal_state()).fst() instanceof IMCREOState 
//										&& ((Pair<?,?>) t.getFinal_state()).snd() instanceof IMCREOState ){
//									IMCREOState trans_fst = ((IMCREOState) ((Pair<?, ?>) t.getFinal_state()).fst()).copy();
//									IMCREOState trans_snd = ((IMCREOState) ((Pair<?, ?>) t.getFinal_state()).snd()).copy();
//									IMCREOState trans_newstate = trans_fst.wiseUnion(trans_snd, mixednodes);
//									if(t instanceof IMCREOInteractiveTransition){
//										transitions.add(new IMCREOInteractiveTransition<IMCREOState>(trans_newstate, ((IMCREOInteractiveTransition<?>) t).getActions()));
//									}
//									else {
//										transitions.add(new IMCREOMarkovianTransition<IMCREOState>(trans_newstate, ((IMCREOMarkovianTransition<?>) t).getRate(), ((IMCREOMarkovianTransition<?>) t).getLabel()));
//									}
//								}
//							}
//						}
//						
//						newimc.getChain().put(newstate, transitions);
//					}
//				}
//			}
//			
//			//set initial state
//			IMCREOState init_fst = ((IMCREOState) ((Pair<?,?>) this.getInitial_state()).fst()).copy(); 
//			IMCREOState init_snd = ((IMCREOState) ((Pair<?,?>) this.getInitial_state()).snd()).copy();
//			IMCREOState init_new = init_fst.wiseUnion(init_snd, mixednodes);
//			newimc.setInitial_state(init_new);
//			newimc.setPoset(poset);
//		
//		}
//		
//		return newimc;
//	}
//	
//	
//	
//	
//	
//	
//	/**
//	 * This method attempts to correct references to states that 'magically' change their
//	 * names and hashes so they are not the same and create duplicate entries in the hashmap
//	 * ...
//	 * 
//	 * FIXME: PLEASE, I do not know what I am doing here. What the hell is states_map???
//	 * @return
//	 */
//	public IMCREOimc<IMCREOState> fixStateReferences() {
//		IMCREOimc<IMCREOState> newimc = new IMCREOimc<IMCREOState>();
//		
//		newimc.setInitial_state( ((IMCREOState)this.initial_state).copy());
//		newimc.setPoset(new POPorts(new HashSet<Pair<String,String>>(this.poset.getPo())));
//		
//		if(this.initial_state instanceof IMCREOState) {
//		
//			LinkedHashMap<IMCREOState, IMCREOState> states_map = new LinkedHashMap<IMCREOState, IMCREOState>();
//			for(STATE s : this.chain.keySet()) {
//				states_map.put((IMCREOState) s, ((IMCREOState) s));
//			}
//			
//			
//				for(STATE s : this.chain.keySet()) {
//					IMCREOState imcst = (IMCREOState) s ;
//					LinkedList<IMCREOTransition<IMCREOState>> trans = new LinkedList<IMCREOTransition<IMCREOState>>();
//					for(IMCREOTransition<STATE> t : this.chain.get(imcst)){
//						if(t instanceof IMCREOMarkovianTransition<?>) {
//							IMCREOMarkovianTransition<IMCREOState> mt = 
//									new IMCREOMarkovianTransition<IMCREOState>(
//											states_map.get(((IMCREOState)t.getFinal_state()).copy()),
//											((IMCREOMarkovianTransition<?>) t).getRate(),
//											((IMCREOMarkovianTransition<?>) t).getLabel()
//											);
//							
//							trans.add(mt);
//							
//							//FIXME: to delete later
//							try{
//								mt.toString();
//							}
//							catch(Exception e){
//								System.out.println("MT");
//								System.out.println("state -- " + imcst.toString());
//								System.out.println("trans t- " + t.toString());
//								System.out.println("trs mt - " + mt.toString());
//							}
//							
//						}
//						else {
//							IMCREOInteractiveTransition<IMCREOState> it = 
//									new IMCREOInteractiveTransition<IMCREOState>(
//											states_map.get(((IMCREOState)t.getFinal_state()).copy()),
//											new IMCREOAction(((IMCREOInteractiveTransition<STATE>) t).getActions().getActions())
//											);
//							trans.add(it);
//							
//							//FIXME: to delete later
//							try{
//								it.toString();
//							}
//							catch(Exception e){
//								System.out.println("IT");
//								System.out.println("state -- " + imcst.toString() );
//								for(IMCREOState st : states_map.keySet()){
//									System.out.println(t.getFinal_state() + " =?= " + st + " --- " + st.equals(t.getFinal_state()) ) ;
//									System.out.println(t.getFinal_state().hashCode() + " =?= " + st.hashCode() + "\n");
//									//System.out.println("h_state = h_t f st -- " + imcst.hashCode() + " = " + t.getFinal_state().hashCode());
//								}
//								//System.out.println("t f st -- " + t.getFinal_state().toString());
//								//System.out.println("state = t f st -- " + imcst.equals(t.getFinal_state()));
//								//System.out.println("h_state = h_t f st -- " + imcst.hashCode() + " = " + t.getFinal_state().hashCode());
//								//System.out.println("trans t- " + t.toString());
//								//System.out.println("st get - " + (states_map.containsKey(t.getFinal_state()) ? states_map.get(t.getFinal_state()).toString() : "NULL!!"));
//								//System.out.println("trs f st " + it.getFinal_state().toString());
//								//System.out.println("trs acts " + it.getActions().toString());
//							}
//							
//						}
//					}
//					newimc.getChain().put(imcst, trans);
//				}
//
//		}
//		
//		return newimc;
//	}
//	
//	
//	
	
	
	//
	//
	//
////		/**
////		 * 
////		 * @param prefix
////		 * @param mixedports_single
////		 */
////		@SuppressWarnings("unchecked")
////		public void prefixPortNames(String prefix, HashSet<String> mixedports_single) {
////			if(this.initial_state instanceof IMCREOState) {
////				
////				IMCREOState new_st = ((IMCREOState) this.initial_state).prefixPortNames(prefix, mixedports_single);
////				this.initial_state = (STATE) new_st;
////				
////				HashMap<STATE, LinkedList<IMCREOTransition<STATE>>> aux_chain = 
////						new HashMap<STATE, LinkedList<IMCREOTransition<STATE>>>();
////				
////				Iterator<STATE> it_states = this.chain.keySet().iterator();
////				while(it_states.hasNext()) {
////					STATE st = it_states.next();
////					new_st = ((IMCREOState) st).prefixPortNames(prefix, mixedports_single);
////					for(IMCREOTransition<STATE> tr : this.chain.get(st)) {
////						tr.setFinal_state((STATE) ((IMCREOState) tr.getFinal_state()).prefixPortNames(prefix, mixedports_single));
////					}
////					aux_chain.put((STATE) new_st, this.chain.get(st));
////					it_states.remove();
////				}
////				this.chain.putAll(aux_chain);
////				
////				HashSet<Pair<String,String>> poset_prefixed = new HashSet<Pair<String,String>>();
////				for(Pair<String,String>  p : this.poset.getPo()) {				
////					String p1_new = mixedports_single.contains(p.fst()) || ( p.fst().endsWith("#") && mixedports_single.contains(p.fst().substring(0, p.fst().length()-1))) ? p.fst() : prefix + "." + p.fst();
////					String p2_new = mixedports_single.contains(p.snd()) || ( p.snd().endsWith("#") && mixedports_single.contains(p.snd().substring(0, p.snd().length()-1)))? p.snd() : prefix + "." + p.snd();
////					poset_prefixed.add(new Pair<String, String>(p1_new, p2_new));
////				}
////				this.poset.setPo(poset_prefixed);
////			}
////		}
	
//		/**
//		 * 
//		 * @param mixedports_single
//		 * @param is_state_pair
//		 */
////		@SuppressWarnings("unchecked")
////		public void unprefixMixedPorts(HashSet<String> mixedports_single, boolean is_state_pair) {
////			if(is_state_pair && this.initial_state instanceof Pair<?,?>) {
////				IMCREOState new_st1 = ((Pair<IMCREOState, IMCREOState>) this.initial_state).fst().unprefixMixedPorts(mixedports_single);
////				IMCREOState new_st2 = ((Pair<IMCREOState, IMCREOState>) this.initial_state).snd().unprefixMixedPorts(mixedports_single);
////				this.initial_state = (STATE) new Pair<IMCREOState, IMCREOState>(new_st1, new_st2);
////				
////				HashMap<STATE, LinkedList<IMCREOTransition<STATE>>> aux_chain = 
////						new HashMap<STATE, LinkedList<IMCREOTransition<STATE>>>();
////				
////				Iterator<STATE> it_states = this.chain.keySet().iterator();
////				while(it_states.hasNext()) {
////					STATE st = it_states.next();
////					new_st1 = ((Pair<IMCREOState, IMCREOState>) st).fst().unprefixMixedPorts(mixedports_single);
////					new_st2 = ((Pair<IMCREOState, IMCREOState>) st).snd().unprefixMixedPorts(mixedports_single);
////					
////					for(IMCREOTransition<STATE> tr : this.chain.get(st)) {
////						IMCREOState trs1 = ((Pair<IMCREOState, IMCREOState>) tr.getFinal_state()).fst().unprefixMixedPorts(mixedports_single);
////						IMCREOState trs2 = ((Pair<IMCREOState, IMCREOState>) tr.getFinal_state()).snd().unprefixMixedPorts(mixedports_single);
////						tr.setFinal_state((STATE) new Pair<IMCREOState, IMCREOState>(trs1, trs2));
////					}
////					aux_chain.put((STATE) new Pair<IMCREOState, IMCREOState>(new_st1, new_st2), this.chain.get(st));
////					it_states.remove();
////				}
////				this.chain.putAll(aux_chain);
////			}
////			else {
////				if(! is_state_pair && this.initial_state instanceof IMCREOState) {
////					IMCREOState new_st = ((IMCREOState) this.initial_state).unprefixMixedPorts(mixedports_single);
////					this.initial_state = (STATE) new_st;
////					
////					HashMap<STATE, LinkedList<IMCREOTransition<STATE>>> aux_chain = 
////							new HashMap<STATE, LinkedList<IMCREOTransition<STATE>>>(this.chain);
////					
////					Iterator<STATE> it_states = this.chain.keySet().iterator();
////					while(it_states.hasNext()) {
////						STATE st = it_states.next();
////						new_st = ((IMCREOState) st).unprefixMixedPorts(mixedports_single);
////						for(IMCREOTransition<STATE> tr : this.chain.get(st)) {
////							tr.setFinal_state((STATE) ((IMCREOState) tr.getFinal_state()).unprefixMixedPorts(mixedports_single));
////						}
////						aux_chain.put((STATE) new_st, this.chain.get(st));
////						it_states.remove();
////					}
////					this.chain.putAll(aux_chain);
////				}
////			}
////			
////			
////			HashSet<Pair<String,String>> poset_unprefixed = new HashSet<Pair<String,String>>();
////			for(Pair<String,String>  p : this.poset.getPo()) {				
////				for(String mp : mixedports_single){
////					String p1_new = p.fst().contains(".") ? p.fst().substring(p.fst().indexOf('.')+1 , p.fst().length()) : p.fst();
////					String p2_new = p.snd().contains(".") ? p.snd().substring(p.snd().indexOf('.')+1 , p.snd().length()) : p.snd();
////					poset_unprefixed.add(new Pair<String, String>(p1_new, p2_new));
////				}	
////			}
////			this.poset.setPo(poset_unprefixed);
////			
////		}
		
	
	



	//	
//	
//	/**
//	 * This method creates a IMC based on the IMCREO.
//	 * It may produce a state-readable or a 
//	 * state-unreadable version.
//	 * 
//	 *  The readable version prints the states with
//	 *  notion of requests, transmissions and buffers.
//	 *  
//	 *  The unreadable version prints the states as sI, 
//	 *  where I is any number from 0. s0 is always the
//	 *  initial state! 
//	 * 
//	 *    
//	 * @param readable - a boolean that drives the creation of a
//	 * a readable or unreadable IMC version  
//	 * @return the IMC based on the IMCREO.
//	 */
//	public IMC toIMC(boolean readable){
//		
//		IMC imc = new IMC();
//		HashMap<STATE, String> map = new HashMap<STATE, String>(this.chain.size());
//		if( ! readable ) {
//			//prepare a mapping of IMCREOState into strings of type sX, where X is a number
//			int index = 1;
//			for(STATE s : this.chain.keySet()){
//				map.put(s, "s" + index);
//				index++;
//			}
//			//Force the initial state to be always s0
//			map.put(initial_state, "s0");
//		}
//		
//		
//		//initial and final state is the same...
//		String imc_initial_state = ! readable ? map.get(this.initial_state) : ((IMCREOState)this.initial_state).toStringCompact() ; 
//		imc.addInitialState(imc_initial_state);
//		imc.addGoalState(imc_initial_state);
//		
//		for(STATE s : this.chain.keySet()) {
//			String source = ! readable? map.get(s) : ((IMCREOState)s).toStringCompact();
//			for(IMCREOTransition<STATE> t : this.chain.get(s)) {
//				String target = ! readable ? map.get(t.getFinal_state()) : ((IMCREOState)t.getFinal_state()).toStringCompact();
//				Transition t_imc;
//				if(t instanceof IMCREOInteractiveTransition) {
//					String action = ((IMCREOInteractiveTransition<STATE>) t).getActions().toSingleAction();
//					t_imc = new InteractiveTransition(source, target, action );
//					
//				}
//				else {
//					double rate = ((IMCREOMarkovianTransition<STATE>)t).getRate();
//					String label= ((IMCREOMarkovianTransition<STATE>)t).getLabel();
//					t_imc = new MarkovianTransition(source, target, rate, label);
//				}
//				imc.addTransition(t_imc);
//				imc.addState(source);
//			}
//		}
//		
//		return imc;
//		
//	}
//	
//
//	
//	
//	
//	public String toReoMA() {
//		StringBuffer sb = new StringBuffer("#PORTS\n");
//		
//		
//		for(Pair<String,String> p: this.poset.getPo()){
//			sb.append(p).append(" ");
//		}
//		sb.append("\n\n");
//		
//		
//		sb.append("#INITIALS\n");
//		sb.append(((IMCREOState) this.initial_state).toReoMAState());
//		sb.append("\n\n");
//		sb.append("#GOALS\n");
//		sb.append(((IMCREOState) this.initial_state).toReoMAState());
//		sb.append("\n\n");
//		
//		sb.append("#TRANSITIONS\n\n");
//		
//		
//		for(STATE s : this.chain.keySet()) {
//			IMCREOState s__ = (IMCREOState) s;
//			StringBuffer sb_markov = new StringBuffer("");
//			
//			for(IMCREOTransition<STATE> t : this.chain.get(s)) {
//				if(t instanceof IMCREOInteractiveTransition) {
//					sb.append(s__.toReoMAState()).append(" ");
//					sb.append(((IMCREOInteractiveTransition<STATE>) t).getActions().toString());
//					sb.append("\n");
//					sb.append("* ");
//					sb.append(((IMCREOState) t.getFinal_state()).toReoMAState());
//					sb.append(" 1\n\n");
//				}
//				else {
//					sb_markov.append("* ");
//					sb_markov.append(((IMCREOState) t.getFinal_state()).toReoMAState());
//					sb_markov.append(" ");
//					sb_markov.append(((IMCREOMarkovianTransition<STATE>) t).getRate());
//					sb_markov.append("\t\t\t@ " + ((IMCREOMarkovianTransition<STATE>) t).getLabel() + " @");
//					sb_markov.append("\n");
//				}
//			}
//			if(sb_markov.length() > 0 ) {
//				sb.append(s__.toReoMAState()).append(" ");
//				sb.append("! \n" + sb_markov + "\n");
//			}
//			
//		}
//		
//		return sb.toString();
//		
//	}
//	
//	
//
//	
//	
//	
//
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		int count_mt = 0;
		int count_it = 0;
		
		sb.append(this.poset + "\n");
		
		for(IMCREOState st : this.chain.keySet()){
			sb.append(st);
			for(IMCREOTransition t : this.chain.get(st)) {
					sb.append(" " + t + " ");
					if(t instanceof IMCREOMarkovianTransition){
						count_mt++;
					} 
					else {
						count_it++;
					}
			}
			sb.append("\n");
			
		}
		
		sb.append("Initial: " + this.initial_state + "\n");
		//sb.append("Finals : " + this.final_states + "\n");
		sb.append("States : " + this.chain.size() + "\n");
		
		sb.append("Transitions : " + (count_mt + count_it) + " -- MT(" + count_mt + ") IT("+ count_it + ")\n");
		
		
		return sb.toString();
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chain == null) ? 0 : chain.hashCode());
		//result = prime * result
		//		+ ((final_states == null) ? 0 : final_states.hashCode());
		result = prime * result
				+ ((initial_state == null) ? 0 : initial_state.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof IMCREOimc))
			return false;
		IMCREOimc other = (IMCREOimc) obj;
		if (chain == null) {
			if (other.chain != null)
				return false;
		} else if (!chain.equals(other.chain))
			return false;
	//	if (final_states == null) {
		//	if (other.final_states != null)
		//		return false;
		//} else if (!final_states.equals(other.final_states))
		//	return false;
		if (initial_state == null) {
			if (other.initial_state != null)
				return false;
		} else if (!initial_state.equals(other.initial_state))
			return false;
		return true;
	}

	
	
	
	
	
	
}
