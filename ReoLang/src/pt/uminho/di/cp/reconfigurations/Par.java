/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import java.util.HashSet;
import java.util.Set;

import pt.uminho.di.cp.model.CoordinationPattern2;
//import pt.uminho.di.cp.model.InvalidReconfigurationOperationException;
import pt.uminho.di.cp.model.Node;

/**
 * @author Nuno Oliveira
 * @date 16 de Dez de 2013
 *
 */
public class Par implements IReconfiguration {

	CoordinationPattern2 pattern ;
	
	
	

	
	/**
	 * @param cp
	 */
	public Par(CoordinationPattern2 cp) {
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
		
		//get nodes of this.pattern
		Set<Node> nodes_cp1 = this.getPattern().getNodes(); 
		//get nodes of cp
		Set<Node> nodes_cp2 = cp.getNodes();
		
		//save cp nodes on n1_inter_n2
		Set<Node> n1_inter_n2 = new HashSet<Node>(nodes_cp1);
		//keep only n1_inter_n2 nodes that are equals to cp2 nodes
		n1_inter_n2.retainAll(nodes_cp2);
	
		//if there aren't nodes equal to cp2 nodes, the cp1_inter_cp2 set is empty
		//otherwise, if cp1_inter_cp2 set isn't empty, exists repeated nodes
		if( !n1_inter_n2.isEmpty() ) {
			//throw new InvalidReconfigurationOperationException("Operation 'par' is not allowed.\nSome nodes are equal: " + n1_inter_n2.toString() );
		}
		else {
			//get channel identifiers of cp1
			Set<String> ids_cp1 = this.getPattern().getNames(); 
			//get channel identifiers of cp2
			Set<String> ids_cp2 = cp.getNames();
			
			Set<String> ids1_inter_ids2 = new HashSet<String>(ids_cp1);
			ids1_inter_ids2.retainAll(ids_cp2);	

			if( !ids1_inter_ids2.isEmpty() ) {
				//throw new InvalidReconfigurationOperationException("Operation 'par' is not allowed.\nSome channel identifiers are equal.");
			}
			
			//no errors
			else{
				CoordinationPattern2 cp2 = this.getPattern();
				//pattern.getPattern(); -> getPattern gets all communication means
				cp.getPattern().addAll(cp2.getPattern());
				//return cp;
			}
		}

		return new CoordinationPattern2(cp);
	}


	
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Par [pattern=" + pattern + "]";
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
		if (!(obj instanceof Par))
			return false;
		Par other = (Par) obj;
		if (pattern == null) {
			if (other.pattern != null)
				return false;
		} else if (!pattern.equals(other.pattern))
			return false;
		return true;
	}








	
	
}
