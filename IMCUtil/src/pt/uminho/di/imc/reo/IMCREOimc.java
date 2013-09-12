/**
 * 
 */
package pt.uminho.di.imc.reo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
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
 * @date 1 de Fev de 2013
 *
 */
public class IMCREOimc<STATE> {

	private Map<STATE, LinkedList<IMCREOTransition<STATE>>> chain;
	//private Set<STATE> final_states;
	private STATE initial_state;
	private POPorts poset;
	
	
	public IMCREOimc() {
		super();
		this.chain = new LinkedHashMap< STATE, LinkedList<IMCREOTransition<STATE>>>();
		//this.final_states = new HashSet<STATE>(1);
		this.initial_state = null;
		this.poset = new POPorts();
	}
	
	
	
//	/**
//	 * @param chain
//	 * @param initial_state
//	 */
//	public IMCREOimc(
//			Map< STATE, LinkedList<IMCREOTransition<STATE>>> chain,
//			STATE initial_state, POPorts po) {
//		super();
//		this.chain = chain;
//		//this.final_states = final_states;
//		this.initial_state = initial_state;
//		this.poset = po;
//	}
	
	
	
	/**
	 * @return the chain
	 */
	public Map<STATE, LinkedList<IMCREOTransition<STATE>>> getChain() {
		return chain;
	}
	/**
	 * @param chain the chain to set
	 */
	public void setChain(
			Map<STATE, LinkedList<IMCREOTransition<STATE>>> chain) {
		this.chain = chain;
	}
	/**
	 * @return the final_states
	 */
	//public Set<STATE> getFinal_states() {
	//	return final_states;
	//}
	/**
	 * @param final_states the final_states to set
	 */
//	public void setFinal_states(Set<STATE> final_states) {
//		this.final_states = final_states;
//	}
	/**
	 * @return the initial_state
	 */
	public STATE getInitial_state() {
		return initial_state;
	}
	/**
	 * @param initial_state the initial_state to set
	 */
	public void setInitial_state(STATE initial_state) {
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
		for(STATE st : this.chain.keySet()){
			count += this.chain.get(st).size(); 
		}
		return count;  
	}
	
	
	
	
	public String getIMCProfile() {
		int count_it = 0, count_mt = 0;
		for(STATE st : this.chain.keySet()){
			for(IMCREOTransition<STATE> t : this.chain.get(st)) {
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
	public IMCREOimc<Pair<IMCREOState, IMCREOState>> compose(IMCREOimc<IMCREOState> other, Set<String> mixedports){
		   
		
		//the new IMC
		IMCREOimc<Pair<IMCREOState, IMCREOState>> newimc = null;
		
		if(this.getInitial_state() instanceof IMCREOState){
		
			newimc = new IMCREOimc<Pair<IMCREOState, IMCREOState>>();
			//The queue with states to process
			PriorityQueue<Pair<IMCREOState, IMCREOState>> to_visit = new PriorityQueue<Pair<IMCREOState,IMCREOState>>();
			//The set of states already visited
			LinkedHashSet<Pair<IMCREOState, IMCREOState>> visited = new LinkedHashSet<Pair<IMCREOState,IMCREOState>>();
			
			//the initial state construction
			Pair<IMCREOState, IMCREOState> initial_state = new Pair<IMCREOState, IMCREOState>(((IMCREOState)this.initial_state).copy(), other.initial_state.copy());
			newimc.setInitial_state(initial_state);
			to_visit.add(initial_state);
			
			Pair<IMCREOState, IMCREOState> ongoing_state;
			IMCREOState ongoing_state_1;
			IMCREOState ongoing_state_2;
			LinkedList<IMCREOTransition<STATE>> transitions_1;
			LinkedList<IMCREOTransition<IMCREOState>> transitions_2;
			
			
			//While there are pairs of states to visit
			while(! to_visit.isEmpty()){
				//get the first state on the queue of states to process
				ongoing_state = to_visit.poll();
				//if the ongoing state is not already visited... 
				if(! visited.contains(ongoing_state)){
					//add the ongoing state into the set of visited states
					visited.add(ongoing_state);
					//add an entry in the new imc for this state
					newimc.chain.put(ongoing_state, new LinkedList<IMCREOTransition<Pair<IMCREOState,IMCREOState>>>());
					
					//divide the state into its parts
					ongoing_state_1 = ongoing_state.fst();
					ongoing_state_2 = ongoing_state.snd();
					//get the outgoing transitions from these states
					transitions_1 = this.chain.get(ongoing_state_1)!=null?  new LinkedList<IMCREOTransition<STATE>>(this.chain.get(ongoing_state_1)) : new LinkedList<IMCREOTransition<STATE>>();
					transitions_2 = other.chain.get(ongoing_state_2)!= null? new LinkedList<IMCREOTransition<IMCREOState>>(other.chain.get(ongoing_state_2)) : new LinkedList<IMCREOTransition<IMCREOState>>();
					
					
					//forall transitions belonging to the ongoing_state of imc1
					while(! transitions_1.isEmpty()) {	
						//get the first transition
						IMCREOTransition<STATE> t1 = transitions_1.get(0);
						
						//if transition is markovian...
						if(t1 instanceof IMCREOMarkovianTransition){
							//>>>>RULE C4: independent evolution rule
							//create the final state
							Pair<IMCREOState, IMCREOState> next_state = new Pair<IMCREOState, IMCREOState>(((IMCREOState)t1.getFinal_state()).copy(), ongoing_state_2.copy());
							//create the transition
							IMCREOMarkovianTransition<Pair<IMCREOState, IMCREOState>> new_transition = new IMCREOMarkovianTransition<Pair<IMCREOState,IMCREOState>>(next_state,((IMCREOMarkovianTransition<STATE>) t1).getRate(), ((IMCREOMarkovianTransition<STATE>) t1).getLabel());
							//add the transition
							newimc.chain.get(ongoing_state).add(new_transition);
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
							LinkedHashSet<String> actions_intersection = new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>)t1).getActions().getActions());
							actions_intersection.retainAll(mixedports);
							//>>>>>>RULE C1: If the actions in the transition do not contain some of the mixed ports:
							//evolve individually
							if(actions_intersection.isEmpty()) {
								//create the final state
								Pair<IMCREOState, IMCREOState> next_state = new Pair<IMCREOState, IMCREOState>(((IMCREOState)t1.getFinal_state()).copy(), ongoing_state_2.copy());
								//create the transition
								IMCREOInteractiveTransition<Pair<IMCREOState, IMCREOState>> new_transition = new IMCREOInteractiveTransition<Pair<IMCREOState,IMCREOState>>(next_state,((IMCREOInteractiveTransition<STATE>) t1).getActions());
								//add the transition
								newimc.chain.get(ongoing_state).add(new_transition);
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
								Iterator<IMCREOTransition<IMCREOState>> it = transitions_2.iterator();
								while(it.hasNext()){
									IMCREOTransition<IMCREOState> t2 = it.next();
									if(t2 instanceof IMCREOInteractiveTransition){
										//new (2013-04-14) -- changed test to synchronise... two actions sync if their intersection with the mixed ports is equal!!!
										LinkedHashSet<String> actions2_intersection = new LinkedHashSet<String>(((IMCREOInteractiveTransition<IMCREOState>) t2).getActions().getActions());
										actions2_intersection.retainAll(mixedports);
										//HashSet<String> actions2_intersection = new HashSet<String>(((IMCREOInteractiveTransition<IMCREOState>) t2).getActions().getActions());
										//actions2_intersection.retainAll(actions_intersection);
										//if(!actions2_intersection.isEmpty()){
										if(actions2_intersection.equals(actions_intersection)){
											//create the final state
											Pair<IMCREOState, IMCREOState> next_state = new Pair<IMCREOState, IMCREOState>(((IMCREOState)t1.getFinal_state()).copy(), t2.getFinal_state().copy());
											//Union of actions
											LinkedHashSet<String> actions_union = new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>) t1).getActions().getActions());
											actions_union.addAll(((IMCREOInteractiveTransition<IMCREOState>) t2).getActions().getActions());
											//create the transition
											IMCREOInteractiveTransition<Pair<IMCREOState, IMCREOState>> new_transition = new IMCREOInteractiveTransition<Pair<IMCREOState,IMCREOState>>(next_state, new IMCREOAction(actions_union));
											//add the transition
											newimc.chain.get(ongoing_state).add(new_transition);
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
						IMCREOTransition<IMCREOState> t2 = transitions_2.get(0);
						
						//if transition is markovian...
						if(t2 instanceof IMCREOMarkovianTransition){
							//>>>>RULE C5: independent evolution rule
							//create the final state
							Pair<IMCREOState, IMCREOState> next_state = new Pair<IMCREOState, IMCREOState>(ongoing_state_1.copy(), ((IMCREOState)t2.getFinal_state()).copy());
							//create the transition
							IMCREOMarkovianTransition<Pair<IMCREOState, IMCREOState>> new_transition = new IMCREOMarkovianTransition<Pair<IMCREOState,IMCREOState>>(next_state,((IMCREOMarkovianTransition<IMCREOState>) t2).getRate(), ((IMCREOMarkovianTransition<IMCREOState>) t2).getLabel());
							//add the transition
							newimc.chain.get(ongoing_state).add(new_transition);
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
							LinkedHashSet<String> actions_intersection = new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>)t2).getActions().getActions());
							actions_intersection.retainAll(mixedports);
							//>>>>>>RULE C2: If the actions in the transition do not contain all the mixed ports
							if(actions_intersection.isEmpty()) {
								//create the final state
								Pair<IMCREOState, IMCREOState> next_state = new Pair<IMCREOState, IMCREOState>(ongoing_state_1.copy(), ((IMCREOState)t2.getFinal_state()).copy());
								//create the transition
								IMCREOInteractiveTransition<Pair<IMCREOState, IMCREOState>> new_transition = new IMCREOInteractiveTransition<Pair<IMCREOState,IMCREOState>>(next_state,((IMCREOInteractiveTransition<IMCREOState>) t2).getActions());
								//add the transition
								newimc.chain.get(ongoing_state).add(new_transition);
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
	
	
	
	
	
	
	
	
	
	// SYNCHRONISATION
	
	
	/**
	 * This method synchronises the IMCREOimc (resulting from composition) 
	 * by removing non-reolike transitions. 
	 * 
	 * The IMCREO to synchronise shall be and instance of IMCREOimc<Pair<IMCREOState, IMCREOState>>, 
	 * which is the direct result of the composition. 
	 * 
	 * In the end the result is an instance of IMCREOimc<IMCREOState> 
	 * which is the initial imc without transitions that do not make 
	 * in reo and also with the pairs of states merged. 
	 * 
	 * 
	 * @param mixedports - the ports corresponding to mixed nodes after 
	 * the composition.
	 * 
	 * @param already_mixed - ...
	 *   
	 * @return an instance of IMCREOimc which is the initial 
	 * imc without transitions that do not make sense in reo.
	 * 
	 */
	@SuppressWarnings("unchecked")
	public IMCREOimc<Pair<IMCREOState, IMCREOState>> synchronise(Set<String> mixedports, Set<String> already_mixed) {
		
		//only synchronise if the states are pairs 
		if(this.initial_state instanceof Pair<?,?>) {
		
			
			//1st step: remove transitions that go to states with request in the mixed ports
			Iterator<STATE> it_state = this.chain.keySet().iterator(); 
			while(it_state.hasNext()){
				STATE s = it_state.next();	
				Iterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).iterator();
				while(it_trans.hasNext()) {
					IMCREOTransition<STATE> t = it_trans.next();
					LinkedHashSet<String> intersect_trans_final_1 = new LinkedHashSet<String>( ((IMCREOState)((Pair<?,?>) t.getFinal_state()).fst()).getRequests());
					intersect_trans_final_1.retainAll(mixedports);
					LinkedHashSet<String> intersect_trans_final_2 = new LinkedHashSet<String>( ((IMCREOState)((Pair<?,?>) t.getFinal_state()).snd()).getRequests());
					intersect_trans_final_2.retainAll(mixedports);
					
					//if it goes to a state with request in mixed ports...
					if(! (intersect_trans_final_1.isEmpty() && intersect_trans_final_2.isEmpty()) ) {
						//remove the transition
						it_trans.remove();
					}
					
				}
			}
			
			
			
			//2 - 1/2 step : join all the transitions from states [M]X to states
			// X (the same state but without request mixed nodes)  and remove states [M]X
			
			//an auxiliar structure to keep track of the changed states, to ease the next steps...
			LinkedHashSet<STATE> aux_changed_states = new LinkedHashSet<STATE>();
			it_state = this.chain.keySet().iterator();
			while(it_state.hasNext()){
				STATE s = it_state.next();
				
				IMCREOState s1 = (IMCREOState) ((Pair<?,?>) s).fst();
				IMCREOState s2 = (IMCREOState) ((Pair<?,?>) s).snd();
				
				HashSet<String> i_req_s1 = new HashSet<String>(s1.getRequests());
				i_req_s1.retainAll(mixedports);
				HashSet<String> i_req_s2 = new HashSet<String>(s2.getRequests());
				i_req_s2.retainAll(mixedports);
				
				//??? this list of transitions only have interactive transitions (is this true)????
				LinkedList<IMCREOTransition<STATE>> tr_tmp = this.chain.get(s);
				
				
				//if at least one part of the state have a request on the same mixed ports
				if(! tr_tmp.isEmpty() && (! i_req_s1.isEmpty() || ! i_req_s2.isEmpty()) ){
					
					Pair<IMCREOState, IMCREOState> newstate = new Pair<IMCREOState, IMCREOState>(s1.copy(), s2.copy());
					newstate.fst().getRequests().removeAll(mixedports);
					newstate.snd().getRequests().removeAll(mixedports);
					//add reference to the new state
					aux_changed_states.add((STATE)newstate);
					
					it_state.remove();
					if(this.chain.containsKey(newstate)){
						//add transitions from changed state to the existent state (in this case referred to by newstate)
						LinkedList<IMCREOTransition<STATE>> state_and_changed_state_transitions =
								new LinkedList<IMCREOTransition<STATE>>(this.chain.get(newstate));
						state_and_changed_state_transitions.addAll(tr_tmp);
						//put all the transitions in the existent state
						this.chain.put((STATE)newstate, state_and_changed_state_transitions);
						
					}
					else { 
						//else make entry for this changed state and add all its transitions before removing mixed ports
						this.chain.put((STATE) newstate, tr_tmp);
					}
				}
				
			}
			
			
			// 2 - 2/2 step : remove all the transitions that violate active blocking in the sense that
			// the transition with actions with less mixed nodes is violating the self-pumping assumption 
			for(STATE st : aux_changed_states) {
				//An auxiliary list of the transitions to easily check the violation...
				ArrayList<IMCREOTransition<STATE>> aux_trans_list = 
						new ArrayList<IMCREOTransition<STATE>>(this.chain.get(st)) ;
				//Check the violation by inspecting the first with all the remaining, the second with all the remaining... and so on
				for(int i=0; i < aux_trans_list.size()-1; i++){
					IMCREOTransition<STATE> tr1 = aux_trans_list.get(i);
					for(int j=1; j < aux_trans_list.size() ; j++){
						IMCREOTransition<STATE> tr2 = aux_trans_list.get(j);
						//do it only for INTERACTIVE TRANSITIONS
						if( tr1 instanceof IMCREOInteractiveTransition<?> && tr2 instanceof IMCREOInteractiveTransition<?>)
						{
							//get the intersections of actions with mixed nodes
							LinkedHashSet<String> tr1_actions_inter_mixed = 
									new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>)tr1).getActions().getActions());
							tr1_actions_inter_mixed.retainAll(mixedports);
							
							LinkedHashSet<String> tr2_actions_inter_mixed = 
									new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>)tr2).getActions().getActions());
							tr2_actions_inter_mixed.retainAll(mixedports);
							
							//check the sizes and remove that with less mixed nodes...
							if(tr1_actions_inter_mixed.size() > tr2_actions_inter_mixed.size()){
								if(this.chain.get(st).contains(tr2)){
									this.chain.get(st).remove(tr2);
								}
							}
							else {
								if(tr1_actions_inter_mixed.size() < tr2_actions_inter_mixed.size()){
									if(this.chain.get(st).contains(tr1)){
										this.chain.get(st).remove(tr1);
									}
								}
							}
						}
					}
				}
			}
			
			
			
			
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
//					if(this.chain.containsKey(newstate)){
//						//remove nondeterminism
//						LinkedList<IMCREOTransition<STATE>> without_nondeterminism = this.removeNonDeterminism(this.chain.get(newstate), tr_tmp, mixedports);
//						this.chain.put((STATE)newstate, without_nondeterminism);
//						
//					}
//					else { 
//						this.chain.put((STATE) newstate, tr_tmp);
//					}
//				}
//			}
			
			
	
			
			//3d step: remove transmissions not in the correct order
			it_state = this.chain.keySet().iterator();
			while( it_state.hasNext() ) {
				STATE s = it_state.next();
				
				IMCREOState s1 = (IMCREOState) ((Pair<?,?>) s).fst();
				IMCREOState s2 = (IMCREOState) ((Pair<?,?>) s).snd();
				//if some of the two states are transmitting... 
				if(s1.getTransmissions().size() > 0 || s2.getTransmissions().size() >0 && ! this.chain.get(s).isEmpty()){
					
					//create a set of Transmissions on the original state: Ti... 
					//this set does not count with merged nodes ($i suffixed nodes)
					//this set counts with the notion of FULL buffer
					IMCREOBufferState buf_s1 = s1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
					IMCREOBufferState buf_s2 = s2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
					
					
					LinkedHashSet<String> Ti = prepareTransmission(s1, buf_s1);
					Ti.addAll(prepareTransmission(s2, buf_s2));
					
					//Let us check if the list of transmissions respect Ti\Tf < Tf
					// if not, remove such transition
					ListIterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).listIterator();
					while(it_trans.hasNext()){
						IMCREOTransition<STATE> t = it_trans.next();
						if(t.getFinal_state() instanceof Pair<?, ?> && t instanceof IMCREOMarkovianTransition<?>) {
						 
							// create a set of Transmissions on the original state: Tf...
							IMCREOState ts1 = (IMCREOState) ((Pair<?,?>) t.getFinal_state()).fst();
							IMCREOState ts2 = (IMCREOState) ((Pair<?,?>) t.getFinal_state()).snd();
							IMCREOBufferState buf_ts1 = ts1.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
							IMCREOBufferState buf_ts2 = ts2.getBuffer().contains(IMCREOBufferState.FULL) ? IMCREOBufferState.FULL : IMCREOBufferState.EMPTY;
							
						
							LinkedHashSet<String> Tf = prepareTransmission(ts1, buf_ts1);
							Tf.addAll(prepareTransmission(ts2, buf_ts2));
							//Tf.retainAll(Ti);
							
							
							//the set transmitted
							LinkedHashSet<String> T = new LinkedHashSet<String>(Ti);
							T.removeAll(Tf);
							
							//is the transmitted set empty?
							//Maybe it is not... maybe it is a node repeated on the transmissions of both parts of the node
							if(T.isEmpty()) {
								
								LinkedHashSet<String> parts_intersect = new LinkedHashSet<String>(s1.getTransmissions());
								parts_intersect.retainAll(s2.getTransmissions());
								
								int n_ti = s1.getTransmissions().size() + s2.getTransmissions().size();
								int n_tf = ts1.getTransmissions().size() + ts2.getTransmissions().size();
								
								// There is actually a transmission when the intersection of the transmissions of both
								// parts of the nodes is not empty and the size of the disjoint union of both transmission
								// parts from the initial state and the size of the same disjoint union from the target state
								// is different.
								// Moreover, we remove the transition if the node being transmitted shall transmit after those
								// that are still transmitting.
								if( (n_ti != n_tf) && ! isTransmittedMinorThanToTransmit(parts_intersect, Tf, already_mixed) ){
									it_trans.remove();
								}
							}
							else {
								//if there is a transmission and there are nodes still transmitting in the target state
								//and the transmitted states shall transmit after those still transmitting... then remove
								// the transmission
								if(! Tf.isEmpty() && ! T.isEmpty() && ! isTransmittedMinorThanToTransmit(T, Tf, already_mixed)){
										it_trans.remove();
								}
							}
						}
					}
				}
			}
			
			
			//to reduce state space....		
			this.removeUnaccessibleStates();
			
			
			
			//4th step remove undesired requests
			// AND undesired interactive transitions based on:
			// when transmitting, it is not possible to have an interactive transition, 
			// unless the ports that start transmitting are not already transmitting. 
			
			it_state = this.chain.keySet().iterator();
			while(it_state.hasNext()){
				STATE s = it_state.next();
				
				if(s instanceof Pair<?,?>){
					IMCREOState st1 = (IMCREOState)((Pair<?, ?>) s).fst();
					IMCREOState st2 = (IMCREOState)((Pair<?, ?>) s).snd();
					//get the active ports for the state 
					LinkedHashSet<String> active_ports = this.getActivePortsForState2(s);
					
					//Now get the requests that already exist in the current state
					LinkedHashSet<String> current_requests = new LinkedHashSet<String>(st1.getRequests());
					current_requests.addAll(st2.getRequests());
					
					//iterate over the transitions leaving the current state 
					ListIterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).listIterator();
					while(it_trans.hasNext()) {
						IMCREOTransition<STATE> t = it_trans.next();
						//if the transtition is markovian 
						if(t instanceof IMCREOMarkovianTransition) {
							//if the state is transmitting (on one side or another...)
							//it is never possible that transmissions are null
							//assert st1.getTransmissions()!=null && st2.getTransmissions() !=null
							if(st1.getTransmissions().size()>0 || st2.getTransmissions().size()>0) {
								//collect the requests of the states 
								IMCREOState tr_st1 = (IMCREOState)((Pair<?, ?>) t.getFinal_state()).fst();
								IMCREOState tr_st2 = (IMCREOState)((Pair<?, ?>) t.getFinal_state()).snd();
								LinkedHashSet<String> requests = new LinkedHashSet<String>(tr_st1.getRequests());
								requests.addAll(tr_st2.getRequests());
								
								//remove the current requests from the set of requests in the 
								//goal state...
								requests.removeAll(current_requests);
								
								//intersect the requests set with the active ports set
								//requests.retainAll(active_ports);
								Iterator<String> req_it = requests.iterator();
								while(req_it.hasNext()){
									String r = req_it.next();
									String r_stripped = r.contains("$") ? r.substring(0,r.lastIndexOf('$')) : r;
									if(! (active_ports.contains(r) || active_ports.contains(r_stripped))){
										req_it.remove();
									}
								}
								
								//if the intersection does not result into an empty set
								//meaning that there are requests that also are active ports...
								if(requests.size()>0){
									//remove the transition
									it_trans.remove();
								}
							}
						}
						else { //if the transition is interactive
							//and there is no requests in the previous state and the state is empty/none 
							//then a new action of ports cannot exist.
							
							
							LinkedHashSet<String> req_st = new LinkedHashSet<String>(st1.getRequests());
							req_st.addAll(st2.getRequests());
							LinkedHashSet<String> req_st_aux = new LinkedHashSet<String>();
							//remove prefixes from request set
							for(String r : req_st) {
								int posDot = r.indexOf('.');
								if(posDot!=-1 && posDot > 0){
									req_st_aux.add(r.substring(posDot+1,r.length()));
								}
								else {
									req_st_aux.add(r);
								}
							}
							req_st = req_st_aux;
							
							
							LinkedHashSet<String> acts = new LinkedHashSet<String>(((IMCREOInteractiveTransition<STATE>) t).getActions().getActions());
							
							LinkedHashSet<String> acts_minus_mixed = new LinkedHashSet<String>(acts);
							acts_minus_mixed.removeAll(mixedports);
							acts_minus_mixed.removeAll(already_mixed);
							
							LinkedHashSet<String> req_inter_actions = new LinkedHashSet<String>(req_st);
							req_inter_actions.retainAll(acts_minus_mixed);
							
							LinkedHashSet<String> active_inter_actions = new LinkedHashSet<String>(active_ports);
							active_inter_actions.retainAll(acts);
							
							//if(active_inter_actions.size()!=0) {
							//	it_trans.remove();
							//}
							if(!(req_st.containsAll(acts_minus_mixed) || (acts_minus_mixed.size()==0 && active_inter_actions.size()==0))){
								it_trans.remove();
							}
							else{
								if(this.initial_state.equals(s) && 
										(
												(
														!st1.getBuffer().contains(IMCREOBufferState.FULL)  
												) && 
												(
														!st2.getBuffer().contains(IMCREOBufferState.FULL)  
														
												)
											)
								) {
									it_trans.remove();
								}
							}
						}
					}
				}
			}
			
			
			
			
			//5th step remove states without outgoing transitions 
			//this is, states that are absorving and cause deadlock
			//this only removes the state from the list of states, not
			//from the list of transitions... so the deadlock still exists...
			it_state = this.chain.keySet().iterator();
			while(it_state.hasNext()) {
				STATE s = it_state.next();
				//remove the state if it ends up without transitions
				if(this.chain.containsKey(s) && this.chain.get(s).isEmpty() && ! s.equals(initial_state)) {
					it_state.remove();
				//	this.final_states.remove(s);
				}
			}
			
			
			//6th step: remove unaccessible states and their transitions 
			this.removeUnaccessibleStates();
			
		}
		
		
		
		return (IMCREOimc<Pair<IMCREOState, IMCREOState>>) this;
		
	}
	
	
	
	

	/**
	 * 
	 * @param t
	 * @param tf
	 * @return
	 */
	private boolean isTransmittedMinorThanToTransmit(Set<String> t, Set<String> tf, Set<String> global_mixedports) {
	
		boolean res = true;
		
		for(String n_t : t){
			for(String n_tf : tf) {
				POPorts.REL comparison = this.poset._transmit_order_(n_t, n_tf);
				if( comparison == POPorts.REL.PAR && (n_t.contains("#") ^ n_tf.contains("#") )) {
					comparison = n_t.contains("#") ? POPorts.REL.BFR : POPorts.REL.AFT ; 
				}
				res = res && (comparison != POPorts.REL.AFT);
			}
		}
		
		return res;
	}



	/**
	 * @param s1
	 * @param buf_s1
	 * @return
	 */
	private LinkedHashSet<String> prepareTransmission(IMCREOState s,
			IMCREOBufferState buf_s) {
		LinkedHashSet<String> transmissions = new LinkedHashSet<String>();
	
		for(String n : s.getTransmissions()) {
			int dollar_pos = n.indexOf('$');
			String new_n =  dollar_pos == -1 ? n : n.substring(0,dollar_pos);
			
			if(buf_s.equals(IMCREOBufferState.FULL)) {
				String new_n_full = new_n + "#" ;
				for(Pair<String, String> p : this.getPoset().getPo()) {
					if(p.fst().equals(new_n_full) || p.snd().equals(new_n_full)) {
						new_n = new_n_full;
						break;
					}
				}
			}
			transmissions.add( new_n );
			
		}
		return transmissions;
	}


	
	
	
	
	
	/**
	 * This method performs a cleaning of transitions and states after a synchronisation
	 * via multiple ports based on a notion of balanced mixed ports in transmission states...
	 * 
	 * @param mixedports
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public IMCREOimc<IMCREOState> cleanAfterMultiMixedPortsSynchronisation (Set<String> mixedports) {
		IMCREOimc<IMCREOState> newimc = new IMCREOimc<IMCREOState>();
		
		LinkedHashSet<IMCREOState> merged_states = new LinkedHashSet<IMCREOState>();
		
		newimc.setInitial_state(((IMCREOState)this.initial_state).copy());
		newimc.setPoset(new POPorts(this.poset.getPo()));
		
		for(STATE s : this.chain.keySet()) {
				LinkedList<IMCREOTransition<IMCREOState>> transitions = new LinkedList<IMCREOTransition<IMCREOState>>();
				for(IMCREOTransition<STATE> t : this.chain.get(s)) {
					if(t instanceof IMCREOMarkovianTransition<?>) {
						IMCREOMarkovianTransition<IMCREOState> new_tr = 
								new IMCREOMarkovianTransition<IMCREOState>(
										((IMCREOState) t.getFinal_state()).copy(),
										((IMCREOMarkovianTransition<?>) t).getRate(),
										((IMCREOMarkovianTransition<?>) t).getLabel()
										);
//						new_tr.setFinal_state(((IMCREOState) t.getFinal_state()).copy());
//						new_tr.setRate(((IMCREOMarkovianTransition<?>) t).getRate());
//						new_tr.setLabel(((IMCREOMarkovianTransition<?>) t).getLabel());
						transitions.add(new_tr);
					}
					else {
						if(t instanceof IMCREOInteractiveTransition<?>) {
							boolean is_balanced = this.checkBalancedMixedPortsTransmission((IMCREOInteractiveTransition<STATE>)t, mixedports);
							if(is_balanced){
								IMCREOInteractiveTransition<IMCREOState> new_tr = 
										new IMCREOInteractiveTransition<IMCREOState>(
												((IMCREOState) t.getFinal_state()).copy(),
												new IMCREOAction(((IMCREOInteractiveTransition<IMCREOState>) t).getActions().getActions())
												);
								//createInteractiveTransition(t);
								transitions.add(new_tr);
							}
							else {
								IMCREOInteractiveTransition<IMCREOState> reduction = reduceConsecutiveInteractiveTransitions((IMCREOInteractiveTransition<IMCREOState>)t, mixedports);
								if(! reduction.equals(t)) {
									is_balanced = this.checkBalancedMixedPortsTransmission((IMCREOInteractiveTransition<STATE>)reduction, mixedports);
									if(is_balanced) {
										merged_states.add((IMCREOState)t.getFinal_state());
										IMCREOInteractiveTransition<IMCREOState> new_tr =  
												new IMCREOInteractiveTransition<IMCREOState>(
														reduction.getFinal_state().copy(),
														new IMCREOAction(reduction.getActions().getActions())
														);
												//createInteractiveTransition((IMCREOInteractiveTransition<STATE>)reduction);
										if(! transitions.contains(new_tr)) {
											transitions.add(new_tr);
										}
									}
								}
							}
						}
					}
				}
				newimc.getChain().put((IMCREOState) s, transitions);
		}
		
		//System.out.println(merged_states);
		
		//remove ITs from merged_states (or merged_states if they have no markovian transition)
		for(IMCREOState st : merged_states) {
			
			if(newimc.getChain().containsKey(st)){
				LinkedList<IMCREOTransition<IMCREOState>> trans = newimc.getChain().get(st);
				ListIterator<IMCREOTransition<IMCREOState>> trans_iter = trans.listIterator();
				while(trans_iter.hasNext()) {
					IMCREOTransition<IMCREOState> t = trans_iter.next();
					if(t instanceof IMCREOInteractiveTransition<?>) {
						trans_iter.remove();
					}
				}
				
				if(trans.isEmpty()) {
					newimc.getChain().remove(st);
				}
			}
		}
		
		newimc.removeUnaccessibleStates();
		
		pruneITOnAlreadyActivePorts(newimc);
		
		newimc.removeUnaccessibleStates();
		
		return newimc;
	}



	@SuppressWarnings("unchecked")
	private void pruneITOnAlreadyActivePorts(IMCREOimc<IMCREOState> newimc) {
		
		
		Iterator<IMCREOState> it_state = newimc.chain.keySet().iterator();
		while(it_state.hasNext()){
			IMCREOState s = it_state.next();
			LinkedHashSet<String> active_ports = getActivePortsForState2((STATE)s);
			ListIterator<IMCREOTransition<IMCREOState>> trans_it = newimc.chain.get(s).listIterator();
			while(trans_it.hasNext()) {
				IMCREOTransition<IMCREOState> t = trans_it.next();
				if(t instanceof IMCREOInteractiveTransition<?>) {
					LinkedHashSet<String> active_inter_actions = new LinkedHashSet<String>(active_ports);
					active_inter_actions.retainAll(((IMCREOInteractiveTransition<?>) t).getActions().getActions());
					if(! active_inter_actions.isEmpty()){
						trans_it.remove();
					}
				}
			}
		}	
	}



//	/**
//	 * @param t
//	 * @return
//	 */
//	@SuppressWarnings("unchecked")
//	private IMCREOInteractiveTransition<IMCREOState> createInteractiveTransition(
//			IMCREOTransition<STATE> t) {
//		IMCREOInteractiveTransition<IMCREOState> new_tr = new IMCREOInteractiveTransition<IMCREOState>();
//		new_tr.setFinal_state(((IMCREOState) t.getFinal_state()).copy());
//		new_tr.setActions(new IMCREOAction(new HashSet<String>(((IMCREOInteractiveTransition<IMCREOState>) t).getActions().getActions())));
//		return new_tr;
//	}
	
	
	
	
	private boolean checkBalancedMixedPortsTransmission(IMCREOInteractiveTransition<STATE> t, Set<String> mixedports) {
	
		boolean is_balanced = true;
		LinkedHashSet<String> actions_intersect_mixedports = new LinkedHashSet<String>(t.getActions().getActions());
		actions_intersect_mixedports.retainAll(mixedports);
		LinkedHashMap<String, Integer> transmission_counter = new LinkedHashMap<String, Integer>(actions_intersect_mixedports.size());
		
		//prepare counter
		for(String a : actions_intersect_mixedports) {
			transmission_counter.put(a, 0);
		}
		
		//count
		for(String port : new LinkedHashSet<String>(((IMCREOState)t.getFinal_state()).getTransmissions())) {
			//trim port being transmitted off the $i appendix
			int index_of_dollar = port.indexOf('$'); 
			port = index_of_dollar != -1 ? port.substring(0,index_of_dollar): port;
			if(transmission_counter.containsKey(port)){
				transmission_counter.put(port, transmission_counter.get(port) + 1);
			}
		}
		
		//check whether all the elements in the counter are exactly 2
		Iterator<String> it = transmission_counter.keySet().iterator();
		while(is_balanced && it.hasNext()) {
			String p = it.next();
			is_balanced = transmission_counter.get(p) == 2;
		}
		
	
		return is_balanced;
	}
	

	
	
	private IMCREOInteractiveTransition<IMCREOState> reduceConsecutiveInteractiveTransitions (IMCREOInteractiveTransition<IMCREOState> t, Set<String> mixedports){
		IMCREOInteractiveTransition<IMCREOState> res = new IMCREOInteractiveTransition<IMCREOState>();
		res.getActions().getActions().addAll(new LinkedHashSet<String>(t.getActions().getActions()));
		res.setFinal_state(t.getFinal_state().copy());
		
		if(this.chain.containsKey(t.getFinal_state())){
			//forward search for a consecutive transition
			for(IMCREOTransition<STATE> trans : this.chain.get(t.getFinal_state())){
				if(trans instanceof IMCREOInteractiveTransition<?>) {
					res.getActions().getActions().addAll(new HashSet<String>(((IMCREOInteractiveTransition<?>) trans).getActions().getActions()));
					res.setFinal_state(((IMCREOState)trans.getFinal_state()).copy());
					
					break;
				}
			}
		}
				
		return res;
	}  
	
	
	
	
	
	



	//HIDE
	
	/**
	 * This (destructive) method performs the traditional hide operations, 
	 * where the nodes used to synchronise become internal, 
	 * and therefore, interaction transitions with those nodes
	 * become as well internal.
	 * 
	 * Differently to what happens with traditional IMCs, this
	 * hide operation do not make all the interactive transitions 
	 * evolving via a mixed node internal. Due to adopting a set
	 * of actions instead of a single action, an Inter. Trans. only
	 * become internal if the set of actions is only composed of
	 * the actions used to synchronise... the mixedports.   
	 * 
	 * 
	 * @param mixedports - the set of ports that shall be hidden 
	 * 
	 * 
	 */
	@SuppressWarnings("unchecked")
	public void hide(Set<String> mixedports) {
		Iterator<STATE> it_states = this.chain.keySet().iterator();
		LinkedHashMap<IMCREOState, LinkedList<IMCREOTransition<STATE>>> aux_map = new LinkedHashMap<IMCREOState, LinkedList<IMCREOTransition<STATE>>>();
		while(it_states.hasNext()){
			STATE s = it_states.next();
			ListIterator<IMCREOTransition<STATE>> it_trans = this.chain.get(s).listIterator();
			while(it_trans.hasNext()) {
				IMCREOTransition<STATE> t = it_trans.next();
				if(t instanceof IMCREOInteractiveTransition){
					((IMCREOInteractiveTransition<STATE>) t).getActions().getActions().removeAll(mixedports);
					if(((IMCREOInteractiveTransition<STATE>) t).getActions().getActions().isEmpty()){
						((IMCREOInteractiveTransition<STATE>) t).getActions().getActions().add("tau");
					}
				}
				t.setFinal_state((STATE) this.hideTransmissions(t.getFinal_state()));
			}
			//FIXME: is it guaranteed that the above statement and the below statement create 
			// the same state? It may cause hash problems...
			IMCREOState new_state = hideTransmissions(s);
			aux_map.put(new_state, this.chain.get(s));
			
			//remove mixed ports relations on the poset...
			Iterator<Pair<String, String>> it_poset_ports= this.poset.getPo().iterator();
			while(it_poset_ports.hasNext()) {
				Pair<String, String> p = it_poset_ports.next();
				if(mixedports.contains(p.fst()) || mixedports.contains(p.snd())) {
					it_poset_ports.remove();
				}
			}
		}
		
		this.chain = (Map<STATE, LinkedList<IMCREOTransition<STATE>>>) aux_map;
	}



	/**
	 * This method performs the hide of transmission parts of states.
	 * Basically, it adds a $ to the beginning of the mixed ports that
	 * are transmitting (which are identified by a $ or more in its name)
	 * 
	 * @param s - the state to hide
	 * @return an hidden state as explained above
	 */
	private IMCREOState hideTransmissions(STATE s) {
		Iterator<String> it_transmissions = ((IMCREOState) s).getTransmissions().iterator();
		IMCREOState new_state = new IMCREOState();//((IMCREOState) s).copy();
		new_state.setRequests( new LinkedHashSet<String>(((IMCREOState) s).getRequests()) );
		new_state.setBuffer(((IMCREOState) s).getBuffer());
		while(it_transmissions.hasNext()){
			String port = it_transmissions.next();
			if(port.contains("$") && port.indexOf('$') > 0 && port.indexOf('$') < port.length()){
				//new_state.getTransmissions().remove(port);
				port = "" + port;
				
			}
			new_state.getTransmissions().add(port);
		}
		
		return new_state;
	} 
	
	
	
	
	
	
	
	
	
//	/**
//	 * This method hides every interactive transitions, this is, 
//	 * sets all interactive transitions to tau.
//	 * 
//	 * It is not useful most of the times, but it may become useful 
//	 * for further creation of a CTMC... 
//	 * 
//	 * This is a destructive method!!
//	 * 
//	 */
//	public void hide_all(){
//		
//		for(STATE st : this.chain.keySet()) {
//			for(IMCREOTransition<STATE> t : this.chain.get(st)) {
//				if(t instanceof IMCREOInteractiveTransition<?>){
//					((IMCREOInteractiveTransition<?>) t).getActions().setActions(new HashSet<String>());
//					((IMCREOInteractiveTransition<?>) t).getActions().getActions().add("tau");
//				}
//			}
//		}
//	}
	
	
	
	
	
	
	

	
	
	/**
	 *	This method computes the ports that are active for a transmission state.
	 * 
	 *  The computation is based on the ports that are transmitting and
	 *  their relations in the partial order set. If a port x is transmitting
	 *  and is related to some port y in the poset then x and y are active.
	 *  
	 *  This computation ignores the states with #, because in the end, 
	 *  # indicates a discontinuity in the partial order... 
	 * 
	 * 
	 * @param st the state to check the ports that are active 
	 * @return a set of ports that are active
	 */
	private LinkedHashSet<String> getActivePortsForState2(STATE st){
	
		LinkedHashSet<String> activeports = new LinkedHashSet<String>();
		LinkedHashSet<String> transmitting = new LinkedHashSet<String>();
		//check state sort
		if(st instanceof Pair<?,?>){
			IMCREOState st1 = (IMCREOState)((Pair<?, ?>) st).fst();
			IMCREOState st2 = (IMCREOState)((Pair<?, ?>) st).snd();
			//if the state is transmitting (on one side or another...)
			//it is never possible that transmissions are null
			//assert st1.getTransmissions()!=null && st2.getTransmissions() !=null
			if(st1.getTransmissions().size()>0 || st2.getTransmissions().size()>0) {
				//collect all the states transmitting
				transmitting = new LinkedHashSet<String>(st1.getTransmissions());
				transmitting.addAll(st2.getTransmissions());
			}
		}
		else {
			if(st instanceof IMCREOState) {
				if(((IMCREOState) st).getTransmissions().size()>0) {
					transmitting = new LinkedHashSet<String>(((IMCREOState) st).getTransmissions());
				}
			}
		}
	
			
		boolean added_new_ports = true;
		while(added_new_ports) {
			added_new_ports = false;
			//add the ports transmitting as activeports...
			activeports = new LinkedHashSet<String>(transmitting);
			//for each port transmitting
			for(String port_transmitting : activeports) {
				
				String port_transmitting_stripped = port_transmitting.contains("$") ? 
						port_transmitting.substring(0,port_transmitting.lastIndexOf('$')) : 
							port_transmitting;
				
				//get all the ports that are related to this one, from the poset
				for(Pair<String, String> ord : this.poset.getPo()) {
					//check if the port_transmitting is in some relation
					if(ord.fst().equals(port_transmitting_stripped) && ! ord.snd().endsWith("#")) {
						//we ignore the ports ending with # and put the others in the active ports
						added_new_ports = added_new_ports || transmitting.add(ord.snd()); 
					}
					else {
						if(ord.snd().equals(port_transmitting_stripped) && ! ord.fst().endsWith("#")) {
							//we ignore the ports ending with # and put the others in the active ports
							added_new_ports = added_new_ports || transmitting.add(ord.fst());
						}
					}
				}
			}
		}

		return activeports;
		
	}
	
	
	
	
	
	
	
	/**
	 * This method performs the union of two sets of strings,
	 * and it is non-destructive. 
	 * 
	 * @param ports1 - the first set of ports (as strings)
	 * @param ports2 - the second set of ports (as strings)
	 * @return the union of the two sets given as parameters
	 */
	/*
	private Set<String> unitePorts( Set<String> ports1, Set<String> ports2) {
		
		Set<String> ports =  new HashSet<String>(ports1);
		ports.addAll(ports2);
		
		return ports;
	}
	 */


	
	
	
	private void removeUnaccessibleStates(){
		PriorityQueue<STATE> to_visit = new PriorityQueue<STATE>();
		LinkedList<STATE> visited = new LinkedList<STATE>();
		
		to_visit.add(this.initial_state);
		
		while(!to_visit.isEmpty()) {
			STATE s = to_visit.poll();
			visited.add(s);
			if(this.chain.containsKey(s)){
				for(IMCREOTransition<STATE> trans : this.chain.get(s)) {
					STATE st_trans = trans.getFinal_state(); 
					if(! (to_visit.contains(st_trans) || visited.contains(st_trans))){
						to_visit.add(st_trans);
					}
				}
			}
		}
		
		Iterator<STATE> it_states = this.chain.keySet().iterator();
		while(it_states.hasNext()){
			STATE st = it_states.next();
			if(! visited.contains(st)){
				it_states.remove();
			}
		}
		
	}
	
	


	



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
//			LinkedList<IMCREOTransition<STATE>> old_state_trans,
//			LinkedList<IMCREOTransition<STATE>> new_state_trans, Set<String> mixedports) 
//		{
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
//						
//						if(inter_actions_transitions.equals(((IMCREOInteractiveTransition<STATE>) t1).getActions().getActions())){
//							it.remove();
//							break;
//						}
//						else {
//							if(inter_actions_transitions.equals(((IMCREOInteractiveTransition<STATE>) t2).getActions().getActions())) {
//								it2.remove();
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
	
	
	
	
	
	
	
	
	/**
	 * This (non-destructive) method performs the wise union of the
	 * imcreo, taking advantage of the wiseunion for the states. 
	 * 
	 * The idea of this method is that it can prepare the composed
	 * IMC (with pairs of states) as a IMC with simple states 
	 * (ie, not pairs) so that it can be used for further compositions.
	 * 
	 * @param mixednodes - the mixed nodes that shall be disguised 
	 * for state distinction...
	 * 
	 * @return a new IMCREOimc with the nodes merged as a single and
	 * simplified node.   
	 */
	public IMCREOimc<IMCREOState> wiseUnion(Set<String> mixednodes) {
		
		IMCREOimc<IMCREOState> newimc = null;
		
		if(this.getInitial_state() instanceof Pair<?,?>) {
			newimc = new IMCREOimc<IMCREOState>();
			
			Iterator<STATE> it = this.chain.keySet().iterator();
			while(it.hasNext()){
				STATE s = it.next();
				if(s instanceof Pair<?,?>){
					if(((Pair<?,?>) s).fst() instanceof IMCREOState && ((Pair<?,?>) s).snd() instanceof IMCREOState ){
						IMCREOState fst = ((IMCREOState) ((Pair<?, ?>) s).fst()).copy();
						IMCREOState snd = ((IMCREOState) ((Pair<?, ?>) s).snd()).copy();
						IMCREOState newstate = fst.wiseUnion(snd, mixednodes);
						
						LinkedList<IMCREOTransition<IMCREOState>> transitions = new LinkedList<IMCREOTransition<IMCREOState>>();
						for(IMCREOTransition<STATE> t : this.chain.get(s)){
							if(t.getFinal_state() instanceof Pair<?,?>){
								if(((Pair<?,?>) t.getFinal_state()).fst() instanceof IMCREOState 
										&& ((Pair<?,?>) t.getFinal_state()).snd() instanceof IMCREOState ){
									IMCREOState trans_fst = ((IMCREOState) ((Pair<?, ?>) t.getFinal_state()).fst()).copy();
									IMCREOState trans_snd = ((IMCREOState) ((Pair<?, ?>) t.getFinal_state()).snd()).copy();
									IMCREOState trans_newstate = trans_fst.wiseUnion(trans_snd, mixednodes);
									if(t instanceof IMCREOInteractiveTransition){
										transitions.add(new IMCREOInteractiveTransition<IMCREOState>(trans_newstate, ((IMCREOInteractiveTransition<?>) t).getActions()));
									}
									else {
										transitions.add(new IMCREOMarkovianTransition<IMCREOState>(trans_newstate, ((IMCREOMarkovianTransition<?>) t).getRate(), ((IMCREOMarkovianTransition<?>) t).getLabel()));
									}
								}
							}
						}
						
						newimc.getChain().put(newstate, transitions);
					}
				}
			}
			
			//set initial state
			IMCREOState init_fst = ((IMCREOState) ((Pair<?,?>) this.getInitial_state()).fst()).copy(); 
			IMCREOState init_snd = ((IMCREOState) ((Pair<?,?>) this.getInitial_state()).snd()).copy();
			IMCREOState init_new = init_fst.wiseUnion(init_snd, mixednodes);
			newimc.setInitial_state(init_new);
			newimc.setPoset(poset);
		
		}
		
		return newimc;
	}
	
	
	
	
	
	
	/**
	 * This method attempts to correct references to states that 'magically' change their
	 * names and hashes so they are not the same and create duplicate entries in the hashmap
	 * ...
	 * 
	 * FIXME: PLEASE, I do not know what I am doing here. What the hell is states_map???
	 * @return
	 */
	public IMCREOimc<IMCREOState> fixStateReferences() {
		IMCREOimc<IMCREOState> newimc = new IMCREOimc<IMCREOState>();
		
		newimc.setInitial_state( ((IMCREOState)this.initial_state).copy());
		newimc.setPoset(new POPorts(new HashSet<Pair<String,String>>(this.poset.getPo())));
		
		if(this.initial_state instanceof IMCREOState) {
		
			LinkedHashMap<IMCREOState, IMCREOState> states_map = new LinkedHashMap<IMCREOState, IMCREOState>();
			for(STATE s : this.chain.keySet()) {
				states_map.put((IMCREOState) s, ((IMCREOState) s));
			}
			
			
				for(STATE s : this.chain.keySet()) {
					IMCREOState imcst = (IMCREOState) s ;
					LinkedList<IMCREOTransition<IMCREOState>> trans = new LinkedList<IMCREOTransition<IMCREOState>>();
					for(IMCREOTransition<STATE> t : this.chain.get(imcst)){
						if(t instanceof IMCREOMarkovianTransition<?>) {
							IMCREOMarkovianTransition<IMCREOState> mt = 
									new IMCREOMarkovianTransition<IMCREOState>(
											states_map.get(((IMCREOState)t.getFinal_state()).copy()),
											((IMCREOMarkovianTransition<?>) t).getRate(),
											((IMCREOMarkovianTransition<?>) t).getLabel()
											);
							
							trans.add(mt);
							
							//FIXME: to delete later
							try{
								mt.toString();
							}
							catch(Exception e){
								System.out.println("MT");
								System.out.println("state -- " + imcst.toString());
								System.out.println("trans t- " + t.toString());
								System.out.println("trs mt - " + mt.toString());
							}
							
						}
						else {
							IMCREOInteractiveTransition<IMCREOState> it = 
									new IMCREOInteractiveTransition<IMCREOState>(
											states_map.get(((IMCREOState)t.getFinal_state()).copy()),
											new IMCREOAction(((IMCREOInteractiveTransition<STATE>) t).getActions().getActions())
											);
							trans.add(it);
							
							//FIXME: to delete later
							try{
								it.toString();
							}
							catch(Exception e){
								System.out.println("IT");
								System.out.println("state -- " + imcst.toString() );
								for(IMCREOState st : states_map.keySet()){
									System.out.println(t.getFinal_state() + " =?= " + st + " --- " + st.equals(t.getFinal_state()) ) ;
									System.out.println(t.getFinal_state().hashCode() + " =?= " + st.hashCode() + "\n");
									//System.out.println("h_state = h_t f st -- " + imcst.hashCode() + " = " + t.getFinal_state().hashCode());
								}
								//System.out.println("t f st -- " + t.getFinal_state().toString());
								//System.out.println("state = t f st -- " + imcst.equals(t.getFinal_state()));
								//System.out.println("h_state = h_t f st -- " + imcst.hashCode() + " = " + t.getFinal_state().hashCode());
								//System.out.println("trans t- " + t.toString());
								//System.out.println("st get - " + (states_map.containsKey(t.getFinal_state()) ? states_map.get(t.getFinal_state()).toString() : "NULL!!"));
								//System.out.println("trs f st " + it.getFinal_state().toString());
								//System.out.println("trs acts " + it.getActions().toString());
							}
							
						}
					}
					newimc.getChain().put(imcst, trans);
				}

		}
		
		return newimc;
	}
	
	
	
	
	
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
		HashMap<STATE, String> map = new HashMap<STATE, String>(this.chain.size());
		if( ! readable ) {
			//prepare a mapping of IMCREOState into strings of type sX, where X is a number
			int index = 1;
			for(STATE s : this.chain.keySet()){
				map.put(s, "s" + index);
				index++;
			}
			//Force the initial state to be always s0
			map.put(initial_state, "s0");
		}
		
		
		//initial and final state is the same...
		String imc_initial_state = ! readable ? map.get(this.initial_state) : ((IMCREOState)this.initial_state).toStringCompact() ; 
		imc.addInitialState(imc_initial_state);
		imc.addGoalState(imc_initial_state);
		
		for(STATE s : this.chain.keySet()) {
			String source = ! readable? map.get(s) : ((IMCREOState)s).toStringCompact();
			for(IMCREOTransition<STATE> t : this.chain.get(s)) {
				String target = ! readable ? map.get(t.getFinal_state()) : ((IMCREOState)t.getFinal_state()).toStringCompact();
				Transition t_imc;
				if(t instanceof IMCREOInteractiveTransition) {
					String action = ((IMCREOInteractiveTransition<STATE>) t).getActions().toSingleAction();
					t_imc = new InteractiveTransition(source, target, action );
					
				}
				else {
					double rate = ((IMCREOMarkovianTransition<STATE>)t).getRate();
					String label= ((IMCREOMarkovianTransition<STATE>)t).getLabel();
					t_imc = new MarkovianTransition(source, target, rate, label);
				}
				imc.addTransition(t_imc);
				imc.addState(source);
			}
		}
		
		return imc;
		
	}
	

	
	
	
	public String toReoMA() {
		StringBuffer sb = new StringBuffer("#PORTS\n");
		
		
		for(Pair<String,String> p: this.poset.getPo()){
			sb.append(p).append(" ");
		}
		sb.append("\n\n");
		
		
		sb.append("#INITIALS\n");
		sb.append(((IMCREOState) this.initial_state).toReoMAState());
		sb.append("\n\n");
		sb.append("#GOALS\n");
		sb.append(((IMCREOState) this.initial_state).toReoMAState());
		sb.append("\n\n");
		
		sb.append("#TRANSITIONS\n\n");
		
		
		for(STATE s : this.chain.keySet()) {
			IMCREOState s__ = (IMCREOState) s;
			StringBuffer sb_markov = new StringBuffer("");
			
			for(IMCREOTransition<STATE> t : this.chain.get(s)) {
				if(t instanceof IMCREOInteractiveTransition) {
					sb.append(s__.toReoMAState()).append(" ");
					sb.append(((IMCREOInteractiveTransition<STATE>) t).getActions().toString());
					sb.append("\n");
					sb.append("* ");
					sb.append(((IMCREOState) t.getFinal_state()).toReoMAState());
					sb.append(" 1\n\n");
				}
				else {
					sb_markov.append("* ");
					sb_markov.append(((IMCREOState) t.getFinal_state()).toReoMAState());
					sb_markov.append(" ");
					sb_markov.append(((IMCREOMarkovianTransition<STATE>) t).getRate());
					sb_markov.append("\t\t\t@ " + ((IMCREOMarkovianTransition<STATE>) t).getLabel() + " @");
					sb_markov.append("\n");
				}
			}
			if(sb_markov.length() > 0 ) {
				sb.append(s__.toReoMAState()).append(" ");
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
		
		for(STATE st : this.chain.keySet()){
			sb.append(st);
			for(IMCREOTransition<STATE> t : this.chain.get(st)) {
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
		IMCREOimc<STATE> other = (IMCREOimc<STATE>) obj;
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



//	/**
//	 * 
//	 * @param prefix
//	 * @param mixedports_single
//	 */
//	@SuppressWarnings("unchecked")
//	public void prefixPortNames(String prefix, HashSet<String> mixedports_single) {
//		if(this.initial_state instanceof IMCREOState) {
//			
//			IMCREOState new_st = ((IMCREOState) this.initial_state).prefixPortNames(prefix, mixedports_single);
//			this.initial_state = (STATE) new_st;
//			
//			HashMap<STATE, LinkedList<IMCREOTransition<STATE>>> aux_chain = 
//					new HashMap<STATE, LinkedList<IMCREOTransition<STATE>>>();
//			
//			Iterator<STATE> it_states = this.chain.keySet().iterator();
//			while(it_states.hasNext()) {
//				STATE st = it_states.next();
//				new_st = ((IMCREOState) st).prefixPortNames(prefix, mixedports_single);
//				for(IMCREOTransition<STATE> tr : this.chain.get(st)) {
//					tr.setFinal_state((STATE) ((IMCREOState) tr.getFinal_state()).prefixPortNames(prefix, mixedports_single));
//				}
//				aux_chain.put((STATE) new_st, this.chain.get(st));
//				it_states.remove();
//			}
//			this.chain.putAll(aux_chain);
//			
//			HashSet<Pair<String,String>> poset_prefixed = new HashSet<Pair<String,String>>();
//			for(Pair<String,String>  p : this.poset.getPo()) {				
//				String p1_new = mixedports_single.contains(p.fst()) || ( p.fst().endsWith("#") && mixedports_single.contains(p.fst().substring(0, p.fst().length()-1))) ? p.fst() : prefix + "." + p.fst();
//				String p2_new = mixedports_single.contains(p.snd()) || ( p.snd().endsWith("#") && mixedports_single.contains(p.snd().substring(0, p.snd().length()-1)))? p.snd() : prefix + "." + p.snd();
//				poset_prefixed.add(new Pair<String, String>(p1_new, p2_new));
//			}
//			this.poset.setPo(poset_prefixed);
//		}
//	}



	/**
	 * 
	 * @param mixedports_single
	 * @param is_state_pair
	 */
//	@SuppressWarnings("unchecked")
//	public void unprefixMixedPorts(HashSet<String> mixedports_single, boolean is_state_pair) {
//		if(is_state_pair && this.initial_state instanceof Pair<?,?>) {
//			IMCREOState new_st1 = ((Pair<IMCREOState, IMCREOState>) this.initial_state).fst().unprefixMixedPorts(mixedports_single);
//			IMCREOState new_st2 = ((Pair<IMCREOState, IMCREOState>) this.initial_state).snd().unprefixMixedPorts(mixedports_single);
//			this.initial_state = (STATE) new Pair<IMCREOState, IMCREOState>(new_st1, new_st2);
//			
//			HashMap<STATE, LinkedList<IMCREOTransition<STATE>>> aux_chain = 
//					new HashMap<STATE, LinkedList<IMCREOTransition<STATE>>>();
//			
//			Iterator<STATE> it_states = this.chain.keySet().iterator();
//			while(it_states.hasNext()) {
//				STATE st = it_states.next();
//				new_st1 = ((Pair<IMCREOState, IMCREOState>) st).fst().unprefixMixedPorts(mixedports_single);
//				new_st2 = ((Pair<IMCREOState, IMCREOState>) st).snd().unprefixMixedPorts(mixedports_single);
//				
//				for(IMCREOTransition<STATE> tr : this.chain.get(st)) {
//					IMCREOState trs1 = ((Pair<IMCREOState, IMCREOState>) tr.getFinal_state()).fst().unprefixMixedPorts(mixedports_single);
//					IMCREOState trs2 = ((Pair<IMCREOState, IMCREOState>) tr.getFinal_state()).snd().unprefixMixedPorts(mixedports_single);
//					tr.setFinal_state((STATE) new Pair<IMCREOState, IMCREOState>(trs1, trs2));
//				}
//				aux_chain.put((STATE) new Pair<IMCREOState, IMCREOState>(new_st1, new_st2), this.chain.get(st));
//				it_states.remove();
//			}
//			this.chain.putAll(aux_chain);
//		}
//		else {
//			if(! is_state_pair && this.initial_state instanceof IMCREOState) {
//				IMCREOState new_st = ((IMCREOState) this.initial_state).unprefixMixedPorts(mixedports_single);
//				this.initial_state = (STATE) new_st;
//				
//				HashMap<STATE, LinkedList<IMCREOTransition<STATE>>> aux_chain = 
//						new HashMap<STATE, LinkedList<IMCREOTransition<STATE>>>(this.chain);
//				
//				Iterator<STATE> it_states = this.chain.keySet().iterator();
//				while(it_states.hasNext()) {
//					STATE st = it_states.next();
//					new_st = ((IMCREOState) st).unprefixMixedPorts(mixedports_single);
//					for(IMCREOTransition<STATE> tr : this.chain.get(st)) {
//						tr.setFinal_state((STATE) ((IMCREOState) tr.getFinal_state()).unprefixMixedPorts(mixedports_single));
//					}
//					aux_chain.put((STATE) new_st, this.chain.get(st));
//					it_states.remove();
//				}
//				this.chain.putAll(aux_chain);
//			}
//		}
//		
//		
//		HashSet<Pair<String,String>> poset_unprefixed = new HashSet<Pair<String,String>>();
//		for(Pair<String,String>  p : this.poset.getPo()) {				
//			for(String mp : mixedports_single){
//				String p1_new = p.fst().contains(".") ? p.fst().substring(p.fst().indexOf('.')+1 , p.fst().length()) : p.fst();
//				String p2_new = p.snd().contains(".") ? p.snd().substring(p.snd().indexOf('.')+1 , p.snd().length()) : p.snd();
//				poset_unprefixed.add(new Pair<String, String>(p1_new, p2_new));
//			}	
//		}
//		this.poset.setPo(poset_unprefixed);
//		
//	}
	

	
	
	
	
	
	
	
	
	
}
