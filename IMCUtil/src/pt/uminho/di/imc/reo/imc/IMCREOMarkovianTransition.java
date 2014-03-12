package pt.uminho.di.imc.reo.imc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @author Nuno Oliveira
 * @date 13 de Set de 2013
 *
 */

public class IMCREOMarkovianTransition extends IMCREOTransition {

	private double rate;
	private String label;
	private Set<String> ports;
	private IMCREOMarkovianTransitionSort sort;

	
	
	public IMCREOMarkovianTransition() {
		super();
		this.rate = 0.0;
		this.label = "";
		this.ports = new LinkedHashSet<String>();
		this.sort = IMCREOMarkovianTransitionSort.NONE;
	}

	
	/**
	 * @param final_state the final state
	 * @param rate the stochastic rate parameter
	 * @param label a (possibly empty) label for the rate
	 */
	public IMCREOMarkovianTransition(IMCREOState final_state, double rate, String label) {
		super(final_state);
		this.rate = rate;
		this.label = label;
		this.ports = this.retrivePortsFromLabel(label);
		this.sort = this.retriveSortFromLabel(label);
	}


	
	
	


	public IMCREOMarkovianTransition(IMCREOMarkovianTransition mt) {
		super(mt.getFinal_state());
		this.rate = mt.getRate();
		this.label = mt.getLabel();
		this.ports = new LinkedHashSet<String>(mt.getPorts());
		this.sort = mt.getSort();
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

	
	
	
	
	
	
	

	/**
	 * @return the ports
	 */
	public Set<String> getPorts() {
		return ports;
	}


	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Set<String> ports) {
		this.ports = ports;
	}


	
	
	
	
	
	
	/**
	 * @return the sort
	 */
	public IMCREOMarkovianTransitionSort getSort() {
		return sort;
	}


	/**
	 * @param sort the sort to set
	 */
	public void setSort(IMCREOMarkovianTransitionSort sort) {
		this.sort = sort;
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
		result = prime * result + ((ports == null) ? 0 : ports.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
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
		if (!(obj instanceof IMCREOMarkovianTransition))
			return false;
		IMCREOMarkovianTransition other = (IMCREOMarkovianTransition) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (ports == null) {
			if (other.ports != null)
				return false;
		} else if (!ports.equals(other.ports))
			return false;
		if (Double.doubleToLongBits(rate) != Double
				.doubleToLongBits(other.rate))
			return false;
		if (sort != other.sort)
			return false;
		return true;
	}


	@Override
	public IMCREOMarkovianTransition copy() {
		return new IMCREOMarkovianTransition(this.getFinal_state(), this.getRate(), this.getLabel());
	}
	
	
	@Override
	public int compareTo(IMCREOTransition t) {
		return this.hashCode()-t.hashCode();
	}
	
	
	
	
	//PRIVATE
	
	private Set<String> retrivePortsFromLabel(String label) {
		
		LinkedHashSet<String> p = new LinkedHashSet<String>();
		int i_pos,f_pos;
		i_pos = label.indexOf('[');
		f_pos = label.indexOf(']');
		String str_ports = label.substring(i_pos+1, f_pos);
		
		p.addAll(Arrays.asList(str_ports.split(",")));
		
		return p;
	}

	
	private IMCREOMarkovianTransitionSort retriveSortFromLabel(String label) {
		IMCREOMarkovianTransitionSort s = 
				label.contains("_ARR_") ? IMCREOMarkovianTransitionSort.ARRIVAL : 
					(label.contains("_TR") ? IMCREOMarkovianTransitionSort.TRANSMISSION : 
						(label.contains("_RD") ? IMCREOMarkovianTransitionSort.READ : 
							(label.contains("_WR")? IMCREOMarkovianTransitionSort.WRITE : 
								IMCREOMarkovianTransitionSort.NONE
							)
						)
					);
		
		return s;
	}

	
	
	
	
	
	
}
