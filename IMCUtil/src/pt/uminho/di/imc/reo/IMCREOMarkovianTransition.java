package pt.uminho.di.imc.reo;


/**
 * @author Nuno Oliveira
 * @date 31 de Jan de 2013
 *
 */

public class IMCREOMarkovianTransition<STATE> extends IMCREOTransition<STATE> {

	private double rate;
	private String label;

	
	
	public IMCREOMarkovianTransition() {
		super();
		this.rate = 0.0;
		this.label = "";
	}

	
	/**
	 * @param final_state the final state
	 * @param rate the stochastic rate parameter
	 * @param label a (possibly empty) label for the rate
	 */
	public IMCREOMarkovianTransition(STATE final_state, double rate, String label) {
		super(final_state);
		this.rate = rate;
		this.label = label;
	}


	/**
	 * @return the rate
	 */
	public double getRate() {
		return this.rate;
	}


	/**
	 * @param rate the stochastic rate parameter
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
		StringBuffer sb = new StringBuffer() ;
		sb.append(" -- ")
			.append(((this.label.equals("") || this.label==null) ? "" : this.label + "; "))
				.append(this.rate)
					.append(" --> ")
						.append(this.getFinal_state().toString());
		return sb.toString();
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
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof IMCREOMarkovianTransition))
			return false;
		IMCREOMarkovianTransition<STATE> other = (IMCREOMarkovianTransition<STATE>) obj;
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
	public IMCREOTransition<STATE> copy() {
		return new IMCREOMarkovianTransition<STATE>(this.getFinal_state(), this.getRate(), this.getLabel());
	}
	
	
	@Override
	public int compareTo(IMCREOTransition<STATE> t) {
		return this.hashCode()-t.hashCode();
	}
	
	
	
	
	
	
	
}
