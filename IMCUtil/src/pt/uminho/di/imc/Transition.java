/**
 * 
 */
package pt.uminho.di.imc;

/**
 * @author Nuno Oliveira
 * @date 19 de Nov de 2012
 *
 */
public abstract class Transition implements Comparable<Transition>{

	private String start_state;
	private String final_state;
	
	public Transition() {
		this.start_state="ss";
		this.final_state="sf";
	}
	
	
	
	
	/**
	 * 
	 * @param start_state the initial state of this transition
	 * @param final_state the final state of this transition
	 */
	public Transition(String start_state, String final_state) {
		super();
		this.start_state = start_state;
		this.final_state = final_state;
	}

	

	/**
	 * @return the start_state
	 */
	public String getStart_state() {
		return start_state;
	}

	/**
	 * @param start_state the start_state to set
	 */
	public void setStart_state(String start_state) {
		this.start_state = start_state;
	}

	/**
	 * @return the final_state
	 */
	public String getFinal_state() {
		return final_state;
	}

	/**
	 * @param final_state the final_state to set
	 */
	public void setFinal_state(String final_state) {
		this.final_state = final_state;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transition [start_state=" + start_state + ", final_state="
				+ final_state + "]";
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
		result = prime * result
				+ ((start_state == null) ? 0 : start_state.hashCode());
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
		if (!(obj instanceof Transition))
			return false;
		Transition other = (Transition) obj;
		if (final_state == null) {
			if (other.final_state != null)
				return false;
		} else if (!final_state.equals(other.final_state))
			return false;
		if (start_state == null) {
			if (other.start_state != null)
				return false;
		} else if (!start_state.equals(other.start_state))
			return false;
		return true;
	}




	public abstract Transition copy(); 
	
	


}
