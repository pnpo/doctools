/**
 * 
 */
package pt.uminho.di.imc;

/**
 * @author Nuno Oliveira
 * @date 19 de Nov de 2012
 *
 */
public class InteractiveTransition extends Transition {

	private String action;
	
	/**
	 * 
	 */
	public InteractiveTransition() {
		this.action = "none";
	}
	

	
	

	/**
	 * @param start_state the initial state of this transition
	 * @param final_state the final state of this transition
	 * @param action the interactive action of this transition 
	 */
	public InteractiveTransition(String start_state, String final_state, String action) {
		super(start_state, final_state);
		this.action = action;
	}




	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + getStart_state() + " -- " + action + " --> " + getFinal_state() + ")";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((action == null) ? 0 : action.hashCode());
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
		if (!(obj instanceof InteractiveTransition))
			return false;
		InteractiveTransition other = (InteractiveTransition) obj;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		return true;
	}





	@Override
	public Transition copy() {
		return new InteractiveTransition(this.getStart_state(), this.getFinal_state(), this.getAction());
	}
	
	
	@Override
	public int compareTo(Transition t) {
		return this.hashCode()-t.hashCode();
	}
	
	
}