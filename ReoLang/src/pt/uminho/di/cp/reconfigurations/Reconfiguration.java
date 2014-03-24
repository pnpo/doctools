/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import java.util.LinkedList;

import pt.uminho.di.cp.model.CoordinationPattern2;

/**
 * @author Nuno Oliveira
 * @date 16 de Dez de 2013
 *
 */
public class Reconfiguration implements IReconfiguration {

	//this pattern shall be internal (therefore, the unique way of setting this
	// pattern is by using setCP. We dont't have a method GET for this.
	//Only this class can manage this pattern internally.
	private CoordinationPattern2 pattern ; //perhaps this should be a map of variable name to coordination pattern
	private LinkedList<IReconfiguration> reconfigurations;
	
	
	
	
	
	public Reconfiguration() {
		super();
		this.pattern = new CoordinationPattern2();
		this.reconfigurations = new LinkedList<IReconfiguration>();
	}
	
	
	/**
	 * @param reconfigurations
	 */
	public Reconfiguration(LinkedList<IReconfiguration> reconfigurations) {
		super();
		this.pattern = new CoordinationPattern2();
		this.reconfigurations = new LinkedList<IReconfiguration>(reconfigurations);
	}









	/**
	 * @param cp the cp to set
	 */
	public void setPattern(CoordinationPattern2 cp) {
		this.pattern = cp;
	}







	/**
	 * @return the reconfigurations
	 */
	public LinkedList<IReconfiguration> getReconfigurations() {
		return reconfigurations;
	}







	/**
	 * @param reconfigurations the reconfigurations to set
	 */
	public void setReconfigurations(LinkedList<IReconfiguration> reconfigurations) {
		this.reconfigurations = reconfigurations;
	}




	
	
	///// SPECIFIC METHODS ////////////////
	
	
	/**
	 * Adding reconfiguration operations to the list of reconfigurations 
	 * of this reconfiguration.
	 * 
	 * If a reconfiguration is primitive, then it is added to the list.
	 * 
	 * If it not a primitive, than the list of reconfigurations composing 
	 * it is added as is to the list of this reconfiguration.
	 * 
	 * @param rec the reconfiguration to add.
	 */
	public void addReconfiguration(IReconfiguration rec) {
		if(rec instanceof Reconfiguration) {
			this.reconfigurations.addAll(((Reconfiguration) rec).getReconfigurations());
		}
		else {
			this.reconfigurations.add(rec);
		}
	}
	
	
	
	///////////////////////////////////////
	
	



	/* (non-Javadoc)
	 * @see pt.uminho.di.cp.reconfigurations.IReconfiguration#apply(pt.uminho.di.cp.model.CoordinationPattern2)
	 */
	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 cp) {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Reconfiguration [pattern=" + pattern + ", reconfigurations="
				+ reconfigurations + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
		result = prime
				* result
				+ ((reconfigurations == null) ? 0 : reconfigurations.hashCode());
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
		if (!(obj instanceof Reconfiguration))
			return false;
		Reconfiguration other = (Reconfiguration) obj;
		if (pattern == null) {
			if (other.pattern != null)
				return false;
		} else if (!pattern.equals(other.pattern))
			return false;
		if (reconfigurations == null) {
			if (other.reconfigurations != null)
				return false;
		} else if (!reconfigurations.equals(other.reconfigurations))
			return false;
		return true;
	}

	

	
	
}
