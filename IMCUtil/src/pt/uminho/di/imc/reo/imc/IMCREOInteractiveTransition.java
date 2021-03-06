package pt.uminho.di.imc.reo.imc;

import java.util.LinkedHashSet;
import java.util.Set;



/**
 * @author Nuno Oliveira
 * @date 13 de Set de 2013
 *
 */

public class IMCREOInteractiveTransition extends IMCREOTransition {

	private Set<String> actions;

	
	
	public IMCREOInteractiveTransition() {
		super();
		this.actions = new LinkedHashSet<String>();
	}

	
	/**
	 * When using this method, make sure to pass a copy of final_state.
	 * Otherwise it may cause unintended errors when updates to the 
	 * referenced state are made...
	 * 
	 * @param final_state the final state
	 * @param acts the set of actions
	 */
	public IMCREOInteractiveTransition(IMCREOState final_state, Set<String> acts) {
		super( final_state );
		this.actions = new LinkedHashSet<String>(acts);
	}
	
	
	
	public IMCREOInteractiveTransition(IMCREOInteractiveTransition it) {
		super( it.getFinal_state() );
		this.actions = new LinkedHashSet<String>(it.getActions());
	}
	
	
	


	/**
	 * @return the actions
	 */
	public Set<String> getActions() {
		return actions;
	}


	/**
	 * @param actions the actions to set
	 */
	public void setActions(Set<String> actions) {
		this.actions = new LinkedHashSet<String>(actions);
	}

	
	/**
	 * 
	 * @return a string "a b c" if actions are [a, b, c]
	 */
	public String getActionsAsString(){
		StringBuffer sb = new StringBuffer();

		for(String a : this.actions) {
			sb.append(a).append(" ");
		}
		String res = sb.toString().trim();
		return res;
	}
	
	
	/**
	 * 
	 * @param actions_reusable a flag that says wether the actions
	 * are to be compressed in a way that they can be reusable latter on
	 * as a list of action
	 * @return a string "abc" if actions are [a, b, c]
	 */
	public String getActionsCompact(boolean actions_reusable) {
		String replace = actions_reusable ? "\\$" : "";
		String act = this.getActionsAsString();
		return act.replaceAll(" ", replace);
	}
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = " -- ( " ; 
		for(String act : this.actions){
			s+= act + " ";
		}
		s += ") --> " + 
					this.getFinal_state().toString();
		return s;
	}


	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof IMCREOInteractiveTransition))
			return false;
		IMCREOInteractiveTransition other = (IMCREOInteractiveTransition) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		return true;
	}


	@Override
	public IMCREOInteractiveTransition copy() {
		return new IMCREOInteractiveTransition(this);
	}
	
	
	@Override
	public int compareTo(IMCREOTransition t) {
		return this.hashCode()-t.hashCode();
	}
	
	
	
	
	
	
	
}
