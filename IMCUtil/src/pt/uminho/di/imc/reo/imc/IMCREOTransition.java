/**
 * 
 */
package pt.uminho.di.imc.reo.imc;

/**
 * @author Nuno Oliveira
 * @date 13 de Jan de 2013
 *
 */
public abstract class IMCREOTransition implements Comparable<IMCREOTransition> {

	private IMCREOState final_state;
	
	
	public IMCREOTransition() {
		super();
		this.final_state = new IMCREOState();
	}
	
	
	/**
	 * @param final_state
	 */
	public IMCREOTransition( IMCREOState final_state) {
		super();
		this.final_state = new IMCREOState(final_state);
	}



	/**
	 * @return the final_state
	 */
	public IMCREOState getFinal_state() {
		return new IMCREOState(final_state);
	}


	/**
	 * @param final_state the final_state to set
	 */
	public void setFinal_state(IMCREOState final_state) {
		this.final_state = new IMCREOState(final_state);
	}


	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IMCREOTransition [ final_state=" + final_state + "]";
	}


	
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((final_state == null) ? 0 : final_state.hashCode());
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
		if (!(obj instanceof IMCREOTransition))
			return false;
		IMCREOTransition other = (IMCREOTransition) obj;
		if (final_state == null) {
			if (other.final_state != null)
				return false;
		} else if (!final_state.equals(other.final_state))
			return false;
		return true;
	}


	public abstract IMCREOTransition copy();

	
	
	
}
