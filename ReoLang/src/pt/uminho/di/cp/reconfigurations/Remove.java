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
public class Remove implements IReconfiguration {

	
	private String id;
	
	
	
	

	/**
	 * @param id
	 */
	public Remove(String id) {
		super();
		this.id = id;
	}

	
	
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}







	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}







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
		return "Remove [id=" + id + "]";
	}





	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (!(obj instanceof Remove))
			return false;
		Remove other = (Remove) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
	
}
