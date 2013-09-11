/**
 * 
 */
package pt.uminho.di.imc.reo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Nuno Oliveira
 * @date 1 de Fev de 2013
 *
 */
public class IMCREOAction {

	private Set<String> actions;

	/**
	 * @param actions
	 */
	public IMCREOAction(Set<String> actions) {
		super();
		this.actions = actions;
	}

	/**
	 * 
	 */
	public IMCREOAction() {
		super();
		this.actions = new LinkedHashSet<String>(2);
	}



	/**
	 * @return the actions
	 */
	public Set<String> getActions() {
		return actions;
	}

	/**
	 * @param actions the actions to set
	 */
	public void setActions(HashSet<String> actions) {
		this.actions = actions;
	}
	
	
	
	
	public String toSingleAction() {
		StringBuffer sb = new StringBuffer("");
		for(String s : this.actions){
			sb.append(s);
		}
		
		return sb.toString();
	}
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("<");
		for(String s : this.actions){
			sb.append(s + " ");
		}
		sb.setLength(sb.length()-1);
		sb.append(">");
		
		return sb.toString();
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
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
		if (!(obj instanceof IMCREOAction))
			return false;
		IMCREOAction other = (IMCREOAction) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		return true;
	}

	
	
	
	
	
}
