/**
 * 
 */
package pt.uminho.di.imc.reo.imc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import pt.uminho.di.imc.IMC;
import pt.uminho.di.imc.InteractiveTransition;
import pt.uminho.di.imc.MarkovianTransition;
import pt.uminho.di.imc.Transition;
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
								//try lvl 1
								for(int i = 0 ; i < transitions_2.size() ; i++){
									IMCREOTransition t2_lvl1 = transitions_2.get(i); 
									if(t2_lvl1 instanceof IMCREOInteractiveTransition){
										//new (2013-04-14) -- changed test to synchronise... two actions sync if their intersection with the mixed ports is equal!!!
										LinkedHashSet<String> actions_inter_mixed_2 = 
												new LinkedHashSet<String>(((IMCREOInteractiveTransition) t2_lvl1).getActions());
										actions_inter_mixed_2.retainAll(mixedports);
										//test if the trans from imc1 sync with trans from imc2
										if(actions_inter_mixed_2.equals(actions_inter_mixed)){
											//create the final state
											Pair<IMCREOState, IMCREOState> next_state = 
													new Pair<IMCREOState, IMCREOState>(t1.getFinal_state().copy(), t2_lvl1.getFinal_state().copy());
											//Union of actions
											LinkedHashSet<String> actions_union = 
													new LinkedHashSet<String>(((IMCREOInteractiveTransition) t1).getActions());
											actions_union.addAll(((IMCREOInteractiveTransition) t2_lvl1).getActions());
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
											transitions_2.remove(i);
											i--;
										}
									}
								}
								//try lvl 2
								if( mixedports.size() > 1 ){
									for(int i = 0 ; i < transitions_2.size() - 1 ; i++){
										IMCREOTransition t2_lvl1 = transitions_2.get(i); 
										if(t2_lvl1 instanceof IMCREOInteractiveTransition){
											//new (2013-04-14) -- changed test to synchronise... two actions sync if their intersection with the mixed ports is equal!!!
											for(int j = i+1 ; j < transitions_2.size() ; j ++) {
												IMCREOTransition t2_lvl2 = transitions_2.get(j);
												if(t2_lvl2 instanceof IMCREOInteractiveTransition){
													//new (2013-04-14) -- changed test to synchronise... two actions sync if their intersection with the mixed ports is equal!!!
													//the intersection of level 2 shall unite the actions of both transitions from the 2nd imc
													LinkedHashSet<String> actions_inter_mixed_lvl2 = 
															new LinkedHashSet<String>(((IMCREOInteractiveTransition) t2_lvl1).getActions());
													actions_inter_mixed_lvl2.addAll(((IMCREOInteractiveTransition) t2_lvl2).getActions());
													actions_inter_mixed_lvl2.retainAll(mixedports);
													//test if the trans from imc1 sync with the two trans from imc2
													if(actions_inter_mixed_lvl2.equals(actions_inter_mixed)){
														//create the final state
														Pair<IMCREOState, IMCREOState> next_state = 
																new Pair<IMCREOState, IMCREOState>(
																		t1.getFinal_state().copy(), 
																		new IMCREOState("¤"+t2_lvl1.getFinal_state().getId()+"_"+t2_lvl2.getFinal_state().getId()+"¤", t2_lvl1.getFinal_state().getBuffer()));
														//Union of actions
														LinkedHashSet<String> actions_union = 
																new LinkedHashSet<String>(((IMCREOInteractiveTransition) t1).getActions());
														actions_union.addAll(((IMCREOInteractiveTransition) t2_lvl1).getActions());
														actions_union.addAll(((IMCREOInteractiveTransition) t2_lvl2).getActions());
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
														transitions_2.remove(i);
														i--;
														j--;
														transitions_2.remove(j);
														j--;
													}//end if
												}//end if
											}//end for j
										}// end if
									}//end for i
								}//end if M>1
								
//								Iterator<IMCREOTransition> it = transitions_2.iterator();
//								while(it.hasNext()){
//									IMCREOTransition t2 = it.next();
//									if(t2 instanceof IMCREOInteractiveTransition){
//										//new (2013-04-14) -- changed test to synchronise... two actions sync if their intersection with the mixed ports is equal!!!
//										LinkedHashSet<String> actions_inter_mixed_2 = 
//												new LinkedHashSet<String>(((IMCREOInteractiveTransition) t2).getActions());
//										actions_inter_mixed_2.retainAll(mixedports);
//										//HashSet<String> actions2_intersection = new HashSet<String>(((IMCREOInteractiveTransition<IMCREOState>) t2).getActions().getActions());
//										//actions2_intersection.retainAll(actions_intersection);
//										//if(!actions2_intersection.isEmpty()){
//										if(actions_inter_mixed_2.equals(actions_inter_mixed)){
//											//create the final state
//											Pair<IMCREOState, IMCREOState> next_state = 
//													new Pair<IMCREOState, IMCREOState>(t1.getFinal_state().copy(), t2.getFinal_state().copy());
//											//Union of actions
//											LinkedHashSet<String> actions_union = 
//													new LinkedHashSet<String>(((IMCREOInteractiveTransition) t1).getActions());
//											actions_union.addAll(((IMCREOInteractiveTransition) t2).getActions());
//											//create the transition
//											IMCREOInteractiveTransition new_transition = 
//													new IMCREOInteractiveTransition(
//															IMCREOState.concatenate(next_state), 
//															new LinkedHashSet<String>(actions_union)
//														);
//											//add the transition
//											newimc.chain.get(ongoing_state_concatenated).add(new_transition);
//											//check whether the resulting state is final
//											//if(this.final_states.contains(next_state.fst()) || other.final_states.contains(next_state.snd())){
//												//add the state as a final state
//											//	newimc.final_states.add(next_state);
//											//}
//											//add the next_state to visit
//											if(! (to_visit.contains(next_state) || visited.contains(next_state))){
//												to_visit.add(next_state);
//											}
//											
//											//remove the interactive transition on the imc2 that sync...
//											it.remove();
//										}
//										else {
//											//new (2013-06-03) -- added synchronisation clausule: 
//											//actions sync when there is a third set of actions such that
//											//(A \_inter (B \_union C)) == mixed
//										}
//									}
//								}
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
		
		
		newimc = newimc.removeTransitionsIncorrectOrder();
		
		return newimc;
	}
	

	
	
	
	
	/**
	 * Attempts to prune this IMCREOimc acting on several aspects:
	 * 
	 * 1) Removes forced non-determinism;
	 * 
	 * 2) Removes transitions that are not in the correct transmission order
	 * 
	 * 3) Removes undesired transitions (request arrivals and IT during transmissions)
	 * 
	 * 4) Removes deadlock states from the chain...
	 * 
	 * 
	 * @param all_mixedports the set of all mixed ports
	 * @return a new IMCREOimc cleaned
	 */
	public IMCREOimc pruneIMCREO(Set<String> all_mixedports) {
		IMCREOimc res = 
				this.removeForcedNonDeterminism(all_mixedports)
					//.removeTransitionsIncorrectOrder()
						.removeUndesiredTransitions(all_mixedports)
							.removeDeadLockRemainings();
		
		return res;
	}
	
	
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//+++++++++++++++++++++++++ MAIN FUNCTIONS +++++++++++++++++++++++++++++++++
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	
	
	
	
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
	private IMCREOimc removeForcedNonDeterminism(Set<String> mixedports){
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
							LinkedHashSet<String> A = new LinkedHashSet<String>(((IMCREOInteractiveTransition) transitions.get(i)).getActions());
							LinkedHashSet<String> B = new LinkedHashSet<String>(((IMCREOInteractiveTransition) transitions.get(j)).getActions());
							LinkedHashSet<String> A_inter_M = 
									new LinkedHashSet<String>(A);
							A_inter_M.retainAll(mixedports);
							
							LinkedHashSet<String> B_inter_M = 
									new LinkedHashSet<String>(B);
							B_inter_M.retainAll(mixedports);
							
							LinkedHashSet<String> A_inter_B = 
									new LinkedHashSet<String>(A);
							A_inter_B.retainAll(B);
							
							//check for non determinism
							if((! A_inter_M.isEmpty() || ! B_inter_M.isEmpty()) && !A_inter_B.isEmpty()) {
								
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
									else {
										//case 3)
										if(A_inter_B.equals(A) ^ A_inter_B.equals(B))
										{
											if(A_inter_B.equals(A)){
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
											if(A_inter_B.equals(B)){
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
				}
			}
			//add the entry in the chain...
			newimc.chain.put(current_state.copy(), transitions);			
		}
		
		newimc.removeUnaccessibleStates();
		
		System.out.println("----------------------------\nNON DETERMINISM\n----------------------------");
		System.out.println(newimc);
		
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
	private IMCREOimc removeUndesiredTransitions(Set<String> all_mixedports){
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
		
		System.out.println("----------------------------\nUNDESIRED\n----------------------------");
		System.out.println(newimc);
		
		return newimc;
		
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
	private IMCREOimc removeTransitionsIncorrectOrder() {
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
							
							
							//verify wether there exists data in the internal state of the
							LinkedList<IMCREOBufferState> fst_part  = new LinkedList<IMCREOBufferState>(current_state.getBuffer()); 
							IMCREOBufferState snd_part_internal = fst_part.removeLast();
							IMCREOBufferState fst_part_internal = fst_part.contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
							
							//IMCREOBufferState current_internal_state = current_state.hasData() ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
							//IMCREOBufferState current_internal_state = current_state.hasData() ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
							//compute the internal state of the initial state
							//IMCREOBufferState current_internal_state = current_state.getInternalState();
							//prepare the ports to be according to the POSET and the buffer state
							preparePortsTransmitting(ports_tr_1, ports_tr_2, fst_part_internal, snd_part_internal);
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
		
		System.out.println("----------------------------\nINCORRECT\n----------------------------");
		System.out.println(newimc);
		
		return newimc;
	}
	
	
	
	
	/**
	 * Removes from the chain, deadlock states.
	 * 
	 * By no means the transitions are affected.
	 * Only the state on the chain (a map) is 
	 * removed as one its keys. 
	 * 
	 * @return a new IMCREOimc without deadlock states.
	 */
	private IMCREOimc removeDeadLockRemainings(){
		
		IMCREOimc newimc = new IMCREOimc();
		
		newimc.setInitial_state(this.initial_state.copy());
		newimc.setPoset(this.poset);
		
		for(IMCREOState st : this.chain.keySet()){
			if(! (this.chain.get(st).isEmpty() && ! st.equals(initial_state)) ) {
				LinkedList<IMCREOTransition> new_tr = new LinkedList<IMCREOTransition>();
				for(IMCREOTransition tr : this.chain.get(st)) {
					new_tr.add(tr.copy());
				}
				newimc.chain.put(st.copy(), new_tr);
			}
		}
		
		
		System.out.println("----------------------------\nDEADLOCK\n----------------------------");
		System.out.println(newimc);
		
		//newimc.removeUnaccessibleStates();
		return newimc;
	} 
	
	
	
	
	/**
	 * Hides actions in the Interactive Transitions.
	 * 
	 * If the set of actions is empty after hidding, 
	 * then the action becomes internal = tau.
	 * 
	 * @param mixedports the mixed ports to hide
	 * @return a new IMCREOimc with hidden ports in the actions of ITs
	 */
	public IMCREOimc hide(Set<String> mixedports){
		IMCREOimc newimc = new IMCREOimc();
		
		newimc.setInitial_state(this.initial_state.copy());
		newimc.setPoset(this.poset);
		
		LinkedHashSet<String> M_union_SHARP = new LinkedHashSet<String>(mixedports);
		M_union_SHARP.add("#");
		
		for(IMCREOState st : this.chain.keySet()){
			LinkedList<IMCREOTransition> new_tr = new LinkedList<IMCREOTransition>();
			for(IMCREOTransition tr : this.chain.get(st)) {
				IMCREOTransition tr_hidden = tr.copy();
				if(tr instanceof IMCREOInteractiveTransition){
					((IMCREOInteractiveTransition)tr_hidden).getActions().removeAll(M_union_SHARP);
					if(((IMCREOInteractiveTransition)tr_hidden).getActions().isEmpty()){
						((IMCREOInteractiveTransition)tr_hidden).getActions().add("tau");
					}
				}
				new_tr.add(tr_hidden.copy());
			}
			newimc.chain.put(st.copy(), new_tr);
		}
		
		return newimc;
	}
	
	
	
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//+++++++++++++++++++++++++ AUX FUNCTIONS +++++++++++++++++++++++++++++++++
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	


	
	
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
	 * Checks if the ports in set1 set transmit before than the ports in set2t. 
	 * 
	 * @param set1 ports to check whether transmit before
	 * @param set2 ports to compare t with
	 * @param intersection the intersection between the effective ports transmitting  
	 * @return true if set1 transmit before than set2
	 */
	private boolean isTransmittedBeforeThan(Set<String> set1, Set<String> set2, Set<String> intersection) {
	
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
	private void preparePortsTransmitting(Set<String> p1, Set<String> p2, IMCREOBufferState internal_state1, IMCREOBufferState internal_state2) {
		
		LinkedHashSet<String> p_aux = new LinkedHashSet<String>(p1);
		for(String p : p_aux) {
			if(internal_state1.equals(IMCREOBufferState.FULL)){
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
			if(internal_state2.equals(IMCREOBufferState.FULL)){
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
			}
		}
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//+++++++++++++++++ OUTPUT FUNCTIONS +++++++++++++++++++++++++++++++++
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	
	
	

	
	
	
	
	
	/**
	 * This method creates a IMC based on the IMCREO.
	 * It may produce a state-readable or a 
	 * state-unreadable version.
	 * 
	 *  The readable version prints the states with
	 *  notion of requests, transmissions and buffers.
	 *  
	 *  The unreadable version prints the states as sI, 
	 *  where I is any number from 0. s0 is always the
	 *  initial state! 
	 * 
	 *    
	 * @param readable - a boolean that drives the creation of a
	 * a readable or unreadable IMC version  
	 * @return the IMC based on the IMCREO.
	 */
	public IMC toIMC(boolean readable){
		
		IMC imc = new IMC();
		HashMap<IMCREOState, String> map = new HashMap<IMCREOState, String>(this.chain.size());
		if( ! readable ) {
			//prepare a mapping of IMCREOState into strings of type sX, where X is a number
			int index = 1;
			for(IMCREOState s : this.chain.keySet()){
				map.put(s, "s" + index);
				index++;
			}
			//Force the initial state to be always s0
			map.put(initial_state, "s0");
		}
		
		
		//initial and final state is the same...
		String imc_initial_state = ! readable ? map.get(this.initial_state) : this.initial_state.toString().replaceAll(" ", ""); 
		imc.addInitialState(imc_initial_state);
		imc.addGoalState(imc_initial_state);
		
		for(IMCREOState s : this.chain.keySet()) {
			String source = ! readable? map.get(s) : s.toString().replaceAll(" ", "");
			for(IMCREOTransition t : this.chain.get(s)) {
				String target = ! readable ? map.get(t.getFinal_state()) : t.getFinal_state().toString().replaceAll(" ", "");
				Transition t_imc;
				if(t instanceof IMCREOInteractiveTransition) {
					String action =  ((IMCREOInteractiveTransition)t).getActionsCompact();
					t_imc = new InteractiveTransition(source, target, action );
					
				}
				else {
					double rate = ((IMCREOMarkovianTransition)t).getRate();
					String label= ((IMCREOMarkovianTransition)t).getLabel();
					t_imc = new MarkovianTransition(source, target, rate, label);
				}
				imc.addTransition(t_imc);
				imc.addState(source);
			}
		}
		
		return imc;
		
	}
	

	
	
	/**
	 * This method creates a RMA based on the IMCREO.
	 * 
	 * @return a string as .rma format
	 */
	public String toReoMA() {
		StringBuffer sb = new StringBuffer("#PORTS\n");
		
		
		for(Pair<String,String> p: this.poset.getPo()){
			sb.append(p).append(" ");
		}
		sb.append("\n\n");
		
		
		sb.append("#INITIALS\n");
		sb.append(((IMCREOState) this.initial_state));
		sb.append("\n\n");
		sb.append("#GOALS\n");
		sb.append(((IMCREOState) this.initial_state));
		sb.append("\n\n");
		
		sb.append("#TRANSITIONS\n\n");
		
		
		for(IMCREOState s : this.chain.keySet()) {
			IMCREOState s__ = (IMCREOState) s;
			StringBuffer sb_markov = new StringBuffer("");
			
			for(IMCREOTransition t : this.chain.get(s)) {
				if(t instanceof IMCREOInteractiveTransition) {
					sb.append(s__).append(" <");
					sb.append(((IMCREOInteractiveTransition) t).getActionsAsString());
					sb.append(">\n");
					sb.append("* ");
					sb.append(((IMCREOState) t.getFinal_state()));
					sb.append(" 1\n\n");
				}
				else {
					sb_markov.append("* ");
					sb_markov.append(((IMCREOState) t.getFinal_state()));
					sb_markov.append(" ");
					sb_markov.append(((IMCREOMarkovianTransition) t).getRate());
					sb_markov.append("\t\t\t@ " + ((IMCREOMarkovianTransition) t).getLabel() + " @");
					sb_markov.append("\n");
				}
			}
			if(sb_markov.length() > 0 ) {
				sb.append(s__).append(" ");
				sb.append("! \n" + sb_markov + "\n");
			}
			
		}
		
		return sb.toString();
		
	}
	
	
	
	
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
	
	
	

	
	
	
	
	
	
	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//+++++++++++++++++ NORMAL FUNCTIONS +++++++++++++++++++++++++++++++++
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	
	

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
