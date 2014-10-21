/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import pt.uminho.di.cp.model.CoordinationPattern2;

/**
 * @author Nuno Oliveira
 * @date 16 de Dez de 2013
 *
 */
public class Const implements IReconfiguration {

	CoordinationPattern2 pattern ;
	
	
	

	
	/**
	 * @param cp
	 */
	public Const(CoordinationPattern2 cp) {
		super();
		this.pattern = new CoordinationPattern2(cp);
	}







	/**
	 * @return the cp
	 */
	public CoordinationPattern2 getPattern() {
		return new CoordinationPattern2(this.pattern);
	}




	/**
	 * @param cp the cp to set
	 */
	public void setPattern(CoordinationPattern2 cp) {
		this.pattern = new CoordinationPattern2(cp);
	}








	/* (non-Javadoc)
	 * @see pt.uminho.di.cp.reconfigurations.IReconfiguration#apply(pt.uminho.di.cp.model.CoordinationPattern2)
	 */
	
	public CoordinationPattern2 apply(CoordinationPattern2 cp) {
		return new CoordinationPattern2(this.getPattern());
	}


	
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Const [pattern=" + pattern + "]";
	}

	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
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
		if (!(obj instanceof Const))
			return false;
		Const other = (Const) obj;
		if (pattern == null) {
			if (other.pattern != null)
				return false;
		} else if (!pattern.equals(other.pattern))
			return false;
		return true;
	}








	
	
}
