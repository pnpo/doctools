/**
 * 
 */
package pt.uminho.di.imc;

import java.util.HashMap;
import java.util.HashSet;

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
	 * 
	 * @return a String version of the IMC in the .aut format
	 */
	public String toAUTFormat() {
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
						append("\"rate ").append(((MarkovianTransition) t).getRate()).append("\", ").
							append(states_mapping.get(t.getFinal_state())).append(" )\n");
			}
			else {
				if(t instanceof InteractiveTransition) {
					sb.append("( ").append(states_mapping.get(t.getStart_state())).append(", ");
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
							
					sb.append(", ").append(states_mapping.get(t.getFinal_state())).append(" )\n");
				}
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
							append("[label = \"" + ((MarkovianTransition)t).getRate() + "\"] ; \n");
				
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
	
	
	
	
	
}
