/**
 * 
 */
package pt.uminho.di.imc;

/**
 * @author Nuno Oliveira
 * @date 19 de Nov de 2012
 *
 */
public class MarkovianTransition extends Transition {

	
	private double rate;
	
	/**
	 * 
	 */
	public MarkovianTransition() {
		this.rate = 0.0;
	}
	
	
	
	
	/**
	 * 
	 * @param start_state the initial state of the transition
	 * @param final_state the final staet of the transition
	 * @param rate the rate of this transition
	 */
	public MarkovianTransition(String start_state, String final_state, double rate) {
		super(start_state, final_state);
		this.rate = rate;
	}





	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + getStart_state() + " -- " + rate + " --> " + getFinal_state() + ")";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (!(obj instanceof MarkovianTransition))
			return false;
		MarkovianTransition other = (MarkovianTransition) obj;
		if (Double.doubleToLongBits(rate) != Double
				.doubleToLongBits(other.rate))
			return false;
		return true;
	}




	@Override
	public Transition copy() {
		return new MarkovianTransition(this.getStart_state(), this.getFinal_state(), this.getRate());
	}




	@Override
	public int compareTo(Transition t) {
		return this.hashCode()-t.hashCode();
	}
	
	
	
	

}
