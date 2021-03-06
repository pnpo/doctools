/**
 * 
 */
package pt.uminho.di.imc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Pattern;

import javax.naming.InitialContext;

import pt.uminho.di.imc.reo.imc.IMCREOInteractiveTransition;
import pt.uminho.di.imc.reo.imc.IMCREOMarkovianTransition;
import pt.uminho.di.imc.reo.imc.IMCREOState;
import pt.uminho.di.imc.reo.imc.IMCREOTransition;
import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.imc.POPorts;

/**
 * @author Nuno Oliveira
 * @date 4 de Dez de 2012
 *
 */
public class IMCTransformer {
	
	
	private IMC imc;
	
	
	public IMCTransformer(IMC imc) {
		this.imc = new IMC(imc); 
	}
	
	
	
	
	/**
	 * Returns a String vesion of the IMC in the .aut format,
	 * to be used as input for the <a href="http://cadp.inria.fr/">CADP tool</a><br/>
	 * Since this format is not the actual format used by CADP, it must be used
	 * the <b>bcg_io tool</b> as bcg_io <.aut file> <.bcg file> to convert it into 
	 * the BCG binary format.
	 * 
	 * @param hide_all - a flag saying whether all the labels are to hide or not
	 * @param reusable - a flag saying whether the file is to be reused or not 
	 * 
	 * @return a String version of the IMC in the .aut format with a state mapping 
	 * at the end for clarity... it should be removed from the aut file. 
	 */
	public String toAUTFormat(boolean hide_all, boolean reusable) {
		StringBuffer sb = new StringBuffer();
		int num_states = this.imc.getStates().size();
		int num_transitions = this.imc.getTransitions().size();
		
		HashMap<String, Integer> states_mapping = new HashMap<String, Integer>();
		
		boolean initial_used = false;
		int state_number = 1;
		//convert state identifiers into numbers...
		for(String st : this.imc.getStates()){
			if(!initial_used && this.imc.getInitial_states().contains(st) ){
				//the initial state must be 0... (this format only assumes one single initial state)
				states_mapping.put(st, 0);
				initial_used = true;
			}
			else {
				states_mapping.put(st, state_number);
				state_number ++;
			}
		}
		
		
		sb.append("des ( ").append(0).append(", ").append(num_transitions).append(", ").append(num_states).append(" )\n");
		for(Transition t : this.imc.getTransitions()){
			if(t instanceof MarkovianTransition){
				sb.append("( ").append(states_mapping.get(t.getStart_state())).append(", ").
						append("\"").append((((MarkovianTransition) t).getLabel().equals("") || ((MarkovianTransition) t).getLabel()==null) ? "" : ((MarkovianTransition) t).getLabel()+"; ").append("rate ").append(((MarkovianTransition) t).getRate()).append("\", ").
							append(states_mapping.get(t.getFinal_state())).append(" )\n");
			}
			else {
				if(t instanceof InteractiveTransition) {
					sb.append("( ").append(states_mapping.get(t.getStart_state())).append(", ");
					if(hide_all){
						sb.append("i");
					}
					else {
						if(((InteractiveTransition) t).getAction().equals("tau")){
							sb.append("i");
						}
						else {
							if(((InteractiveTransition) t).getAction().equals("i")) {
								sb.append("_i_");
							}
							else {
								sb.append("\"").append(((InteractiveTransition) t).getAction()).append("\"");
							}
						}
					}
					sb.append(", ").append(states_mapping.get(t.getFinal_state())).append(" )\n");
				}
			}
		}
		
		if(!reusable){
			sb.append("-- STATES MAPPING --\n\n");
			for(String state : states_mapping.keySet()){
				sb.append(states_mapping.get(state) + "\t---\t" + state + "\n");
			}
		}
		
		return sb.toString();
	}
	
	
	
	
	
	/**
	 * Returns a String version of the IMC in the .ma format,
	 * to be used as input for the 
	 * <a href="http://www-i2.informatik.rwth-aachen.de/imca/index.html"> IMCA tool </a>
	 * 
	 * @return string version of the IMC in the .ma format
	 */
	public String toMAFormat() {
		StringBuffer sb = new StringBuffer();
		sb.append("#INITIALS\n");
		for(String s : this.imc.getInitial_states()){
			sb.append(s).append("\n");
		}
		sb.append("#GOALS\n");
		for(String s : this.imc.getGoal_states()){
			sb.append(s).append("\n");
		}
		sb.append("#TRANSITIONS\n");
		//run every state
		for(String state : this.imc.getStates()) {
			//for each state get its output transitions 
			HashSet<Transition> state_trans = (HashSet<Transition>)this.imc.getAllOutgoingTransitionsForState(state);
			//if the state has transitions
			if(state_trans.size()>0){
				//hash used to store the string for each action in interactive transitions 
				HashMap<String, StringBuffer> sb_inter = new HashMap<String, StringBuffer>();
				//string buffer to store the string for all markovian transitions
				StringBuffer sb_mark = new StringBuffer();
				//boolean to now if it is the first markovian transitions so it is possible
				//to add the head of the transition "state !"
				boolean first_markov_trans = true;
				//for each outgoing transition of the current state
				for(Transition t : state_trans) {
					//if the transition is interactive
					if(t instanceof InteractiveTransition) {
						//if the action already appeared for the current state 
						if(sb_inter.containsKey((((InteractiveTransition) t).getAction()))){
							//get the string to append the new transition 
							StringBuffer sb_i = sb_inter.get(((InteractiveTransition) t).getAction());
							//add the new transition to the transitions string
							sb_i.append("* ").append(t.getFinal_state()).append(" 1\n");
							//set the transition string into the hash, associated to the action  
							sb_inter.put(((InteractiveTransition) t).getAction(), sb_i);
						}
						else { //if it is the first time the action appears 
							StringBuffer sb_i = new StringBuffer();
							//append the head and the first transition for the action
							sb_i.append(state).append(" ").append(((InteractiveTransition) t).getAction()).append("\n");
							sb_i.append("* ").append(t.getFinal_state()).append(" 1\n");
							//add the transition string to the hash associated to action
							sb_inter.put(((InteractiveTransition) t).getAction(), sb_i);
						}
					}
					else { //if the transition is interactive
						//if it is the first markov transition
						if(first_markov_trans){
							//append the head and the first transition for the symbol "!"
							sb_mark.append(state).append(" !\n");
							sb_mark.append("* ").append(t.getFinal_state()).append(" ").
													append(((MarkovianTransition)t).getRate()).append("\n");
							//set the boolean to false because the next markov transition will not be the first...
							first_markov_trans = false;
						}
						else { //otherwise only add the new string of the markov transition (atention to the rate)
							sb_mark.append("* ").append(t.getFinal_state()).append(" ").
													append(((MarkovianTransition)t).getRate()).append("\n");
						}
					}
				}
				//append the markov transition to the complete translation
				sb.append(sb_mark);
				//append all the interactive transitions to the complete translation
				for(String k : sb_inter.keySet()){
					sb.append(sb_inter.get(k));
				}
			}
		}
		
		return sb.toString().trim();
	}
	
	
	
	
	@Deprecated
	public String toPRISMTransitionMatrix(Map<String, Integer> rewards) throws NotCTMCException {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb_rew = new StringBuffer();
		StringBuffer sb_rew_aux = new StringBuffer();
		boolean has_rewards = rewards != null && ! rewards.isEmpty(); 
		int number_trans_rewards = 0;
		//header transition matrix
		sb.append(this.imc.getStates().size())
			.append(" ")
				.append(this.imc.getTransitions().size())
					.append("\n");
		
			
		//body
		for(Transition t : this.imc.getTransitions()) {
			if(t instanceof InteractiveTransition) {
				throw new NotCTMCException("Interactive transitions are not allowed in CTMCs.\nProblem found at transition: " + t);
			}
			else {
				String trans = t.getStart_state() + " " + t.getFinal_state() + " "; 
				sb.append(trans)
					.append(((MarkovianTransition) t).getRate())
						.append("\n");
				//body rewards
				if(has_rewards && rewards.containsKey(((MarkovianTransition) t).getLabel())){
					sb_rew_aux.append(trans)
						.append(rewards.get(((MarkovianTransition) t).getLabel()))
							.append("\n");
					number_trans_rewards++;
				}
				
			}
		}
		
		//header transition reward
		sb_rew.append(this.imc.getStates().size())
			.append(" ")
				.append(number_trans_rewards)
					.append("\n")
						.append(sb_rew_aux);
		
		
		//final composition
		sb.append("-- TRANSITION REWARDS --\n\n");
		sb.append(sb_rew);
		
		return sb.toString();
	}
	
	
	
	
	
	public String toPRISM(String module_name, Map<String, Integer> rewards) throws NotCTMCException {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb_constants = new StringBuffer();
		StringBuffer sb_module = new StringBuffer();
		boolean has_rewards = rewards != null && ! rewards.isEmpty();
		LinkedHashMap<String, Double> constants = new LinkedHashMap<String, Double>();
		
		//header transition matrix
		sb.append("ctmc\n\n\n");
		sb_module.append("module ").append(module_name).append("\n\n");
		sb_module.append("\t//states\n")
			.append("\ts : [0..").append(this.imc.getStates().size()-1).append("] init 0 ;\n\n");
		
			
		//body
		for(Transition t : this.imc.getTransitions()) {
			if(t instanceof InteractiveTransition) {
				throw new NotCTMCException("Interactive transitions are not allowed in CTMCs.\nProblem found at transition: " + t);
			}
			else {
				String source = t.getStart_state() ;
				String target = t.getFinal_state() ;
				String lbl = ((MarkovianTransition) t).getLabel().replaceAll("[\\[\\],|]", "_");
				String cons_lbl = "CONST_"+lbl;
				if(! lbl.equals("") && !constants.containsKey(cons_lbl)){
					constants.put(cons_lbl, ((MarkovianTransition) t).getRate());
				}
				
				sb_module.append("\t[").append(lbl).append("] s=").append(source)
					.append(" -> ").append(constants.containsKey(cons_lbl)? cons_lbl : ((MarkovianTransition) t).getRate()).append(" : ")
						.append("( s'=").append(target).append(" ) ; \n");
				
			}
		}
		
		sb_module.append("\nendmodule\n\n");
		
		//body rewards
		if(has_rewards){
			sb_module.append("rewards \"<insert reward name here>\"\n");
			for(String lbl : rewards.keySet()){
				String lbl2 = lbl.replaceAll("[\\[\\],]", "_");
				sb_module.append("\t[").append(lbl2).append("] true : ").append(rewards.get(lbl)).append(";\n");
			}
			sb_module.append("endrewards\n");
		}
		
		//create the constants
		for(String l : constants.keySet()){
			sb_constants.append("const double ").append(l).append(" = ").append(constants.get(l)).append(";\n");
		}
		
		sb.append(sb_constants).append("\n").append(sb_module);
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Returns a String version of the IMC in the .imc format,
	 * as presented in the <a href="http://www-i2.informatik.rwth-aachen.de/imca/index.html"> IMCA project </a>
	 * 
	 * @deprecated This format is no longer used (since version 1.4 of the IMCA tool)... 
	 * use MA (Markov Automta) instead.
	 * 
	 * @see IMCTransformer#toMAFormat()
	 * 
	 * @return string version of the IMC in the .imc format
	 */
	public String toIMCFormat() {
		StringBuffer sb = new StringBuffer();
		
		for(String s : this.imc.getInitial_states()){
			sb.append(s).append(" ");
		}
		sb.append("// initial states\n");
		for(String s : this.imc.getGoal_states()){
			sb.append(s).append(" ");
		}
		if(!this.imc.getGoal_states().isEmpty()){
			sb.append("// initial states\n");
		}
		for(Transition t : this.imc.getTransitions()){
			sb.append(t.getStart_state()).append(" ").append(t.getFinal_state());
			if(t instanceof MarkovianTransition){
				sb.append(" ").append(((MarkovianTransition) t).getRate()).append("\n");
			}
			else {
				sb.append(" ").append(((InteractiveTransition) t).getAction()).append("\n");
			}
		}
		
		return sb.toString();
	}
	
	
	
	
	
	
	/**
	 * Returns a String version of the IMC in a dot compliant format.
	 * 
	 * @return string version of the IMC in a dot compliant format
	 */
	public String toDotFormat() {
		StringBuffer sb = new StringBuffer();
		sb.append("digraph \"imc\" { \n").
		append("graph [	fontname = \"Helvetica-Oblique\", fontsize = 10]; \n").
		append("edge [	fontname = \"Helvetica-Oblique\", fontsize = 10]; \n").
		append("node [	shape=circle, fontname = \"Helvetica-Oblique\", fontsize = 10] ; \n");
		for(String s : this.imc.getInitial_states()){
			sb.append("\""+ s +"\" [shape=circle, style=filled, fillcolor=green] ; \n");
		}
		for(String s : this.imc.getGoal_states()){
			sb.append("\""+ s +"\" [shape=circle, style=filled, fillcolor=red] ; \n");
		}
		for(Transition t : this.imc.getTransitions()) {
			if(t instanceof MarkovianTransition){
				sb.append("\"" + t.getStart_state() + "\"").
					append(" -> ").
						append("\"" + t.getFinal_state() + "\" ").
							append("[label = \"" +  (((MarkovianTransition)t).getLabel().equals("") || ((MarkovianTransition)t).getLabel()==null ? "" : ((MarkovianTransition)t).getLabel() + "; ")  + ((MarkovianTransition)t).getRate() + "\"] ; \n");
				
			}
			else {
				if(t instanceof InteractiveTransition){
					sb.append("\"" + t.getStart_state() + "\"").
						append(" -> ").
							append("\"" + t.getFinal_state() + "\" ").
								append("[label = \"" + ((InteractiveTransition)t).getAction() + "\" style=dashed] ; \n");
					
				}
				
			}
		}
		
		sb.append("}");
		return sb.toString();
	}
	
	
	
	
	
	
	
	public IMCREOimc toIMCREO(POPorts poset) throws NotIMCREOException{
		
		IMCREOimc newimc = new IMCREOimc();
		
		//set the POSET
		newimc.setPoset(poset);
		//create initial state
		IMCREOState initial = new IMCREOState();
		initial.setId((String)this.imc.getInitial_states().toArray()[0]);
		newimc.setInitial_state(initial);
		boolean inital_state_is_complete = false;
		
		//run over all the transitions
		for(Transition t : this.imc.getTransitions()){
			if(t instanceof InteractiveTransition){
				//get the action as a string
				String act = ((InteractiveTransition) t).getAction();
				LinkedHashSet<String> acts = new LinkedHashSet<String>();
				if(act.contains("~")){
					String act_cleaned = act.substring(act.indexOf('~')+1, act.lastIndexOf('~'));
					//if the action has $... then it means it is a set of actions
					if(act_cleaned.contains("$")) {
						//so we break them into pieces
						String[] acts_str = act_cleaned.split("\\$");
						//and add them to the action
						for(int i = 0 ; i < acts_str.length ; i++) {
							acts.add(acts_str[i]);
						}
					}
					else {
						//unless it is an internal transition...
						if(!act_cleaned.equals("tau")) {
							acts.add(act_cleaned);
						}
					}//end if act has $
				}
				else {
					throw new NotIMCREOException("The IMC to convert into IMCREO cannot be converted!\nIt is not in the correct format!");
				}
				
				//now we create the source and target state
				IMCREOState src = new IMCREOState();
				src.setId(t.getStart_state());
				IMCREOState trg = new IMCREOState();
				trg.setId(t.getFinal_state());
				if(! acts.isEmpty()){
					IMCREOimc.unserializeInternalStates(act, src, trg);
				}
				//now we check wether the src state is alread in the map of states of the newimc
				if(!newimc.getChain().containsKey(src)){
					newimc.getChain().put(src, new LinkedList<IMCREOTransition>());
				}
				//and now we create the new int. trans. and add to the list of trans
				IMCREOInteractiveTransition it = new IMCREOInteractiveTransition();
				it.setActions(acts);
				it.setFinal_state(trg);
				newimc.getChain().get(src).add(it);
				//now we try to complete the initial state, unless it is already complete
				if(!inital_state_is_complete){
					if(src.getId().equals(newimc.getInitial_state().getId())){
						newimc.setInitial_state(src.copy());
						inital_state_is_complete = true;
					}
					else {
						if(trg.getId().equals(newimc.getInitial_state().getId())){
							newimc.setInitial_state(trg.copy());
							inital_state_is_complete = true;
						}
					}
				}
			}
			else {
				String lbl = ((MarkovianTransition) t).getLabel();
				String lbl_cleaned = lbl;
				if(lbl.contains("~")){
					lbl_cleaned = lbl.substring(lbl.indexOf('~')+1, lbl.lastIndexOf('~'));
				}
				else {
					throw new NotIMCREOException("The IMC to convert into IMCREO cannot be converted!\nIt is not in the correct format!");
				}
				
				//now we create the source and target state
				IMCREOState src = new IMCREOState();
				src.setId(t.getStart_state());
				IMCREOState trg = new IMCREOState();
				trg.setId(t.getFinal_state());
				IMCREOimc.unserializeInternalStates(lbl, src, trg);
				
				//now we check whether the src state is already in the map of states of the newimc
				if(!newimc.getChain().containsKey(src)){
					newimc.getChain().put(src, new LinkedList<IMCREOTransition>());
				}
				//and now we create the new mark. trans. and add to the list of trans
				IMCREOMarkovianTransition mt = new IMCREOMarkovianTransition();
				mt.setLabel(lbl_cleaned);
				mt.setRate(((MarkovianTransition) t).getRate());
				mt.setFinal_state(trg);
				newimc.getChain().get(src).add(mt);
				//now we try to complete the initial state, unless it is already complete
				if(!inital_state_is_complete){
					if(src.getId().equals(newimc.getInitial_state().getId())){
						newimc.setInitial_state(src.copy());
						inital_state_is_complete = true;
					}
					else {
						if(trg.getId().equals(newimc.getInitial_state().getId())){
							newimc.setInitial_state(trg.copy());
							inital_state_is_complete = true;
						}
					}
				}
			}
		}
		
		return newimc;
		
	}
	
	
	
	
	
}
