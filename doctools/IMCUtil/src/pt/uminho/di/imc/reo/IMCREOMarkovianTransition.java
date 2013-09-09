package pt.uminho.di.imc.reo;


/**
 * @author Nuno Oliveira
 * @date 31 de Jan de 2013
 *
 */

public class IMCREOMarkovianTransition<STATE> extends IMCREOTransition<STATE> {

	private double rate;

	
	
	public IMCREOMarkovianTransition() {
		super();
		this.rate = 0.0;
	}

	
	/**
	 * @param final_state the final state
	 * @param rate the stochastic rate parameter
	 */
	public IMCREOMarkovianTransition(STATE final_state, double rate) {
		super(final_state);
		this.rate = rate;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " -- " + this.rate + " --> " + 
					this.getFinal_state().toString();
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
		if (Double.doubleToLongBits(rate) != Double
				.doubleToLongBits(other.rate))
			return false;
		return true;
	}


	@Override
	public IMCREOTransition<STATE> copy() {
		return new IMCREOMarkovianTransition<STATE>(this.getFinal_state(), this.getRate());
	}
	
	
	@Override
	public int compareTo(IMCREOTransition<STATE> t) {
		return this.hashCode()-t.hashCode();
	}
	
	
	
	
	
	
	
}
