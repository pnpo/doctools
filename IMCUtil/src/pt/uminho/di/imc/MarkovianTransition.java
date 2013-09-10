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
	private String label;
	
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
	 * @param label the (possibly empty) label of the rate
	 */
	public MarkovianTransition(String start_state, String final_state, double rate, String label) {
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
	
	
	

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}




	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "(" + getStart_state() + " -- " + ((this.label.equals("") || this.label==null)? "" : this.label + "; ") + rate + " --> " + getFinal_state() + ")";
	}

	




	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((label == null) ? 0 : label.hashCode());
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
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (Double.doubleToLongBits(rate) != Double
				.doubleToLongBits(other.rate))
			return false;
		return true;
	}




	@Override
	public Transition copy() {
		return new MarkovianTransition(this.getStart_state(), this.getFinal_state(), this.getRate(), this.getLabel());
	}




	@Override
	public int compareTo(Transition t) {
		return this.hashCode()-t.hashCode();
	}
	
	
	
	

}
