package pt.uminho.di.imc.reo;



/**
 * @author Nuno Oliveira
 * @date 31 de Jan de 2013
 *
 */

public class IMCREOInteractiveTransition<STATE> extends IMCREOTransition<STATE> {

	private IMCREOAction actions;

	
	
	public IMCREOInteractiveTransition() {
		super();
		this.actions = new IMCREOAction();
	}

	
	/**
	 * @param final_state the final state
	 * @param act the set of actions
	 */
	public IMCREOInteractiveTransition(STATE final_state, IMCREOAction act) {
		super( final_state);
		this.actions = act;
	}


	/**
	 * @return the actions
	 */
	public IMCREOAction getActions() {
		return actions;
	}


	/**
	 * @param actions the actions to set
	 */
	public void setActions(IMCREOAction actions) {
		this.actions = actions;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = " -- " + this.actions.toString() + " --> " + 
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
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof IMCREOInteractiveTransition))
			return false;
		IMCREOInteractiveTransition<STATE> other = (IMCREOInteractiveTransition<STATE>) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		return true;
	}
	
	
	@Override
	public IMCREOTransition<STATE> copy() {
		return new IMCREOInteractiveTransition<STATE>(this.getFinal_state(), this.getActions());
	}
	
	
	@Override
	public int compareTo(IMCREOTransition<STATE> t) {
		return this.hashCode()-t.hashCode();
	}
	
	
	
	
	
	
	
}
