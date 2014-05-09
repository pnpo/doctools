/**
 * 
 */
package pt.uminho.di.cp.reconfigurations;

import java.util.LinkedHashSet;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;
import pt.uminho.di.reolang.parsing.util.Pair;

/**
 * @author Nuno Oliveira
 * @date 16 de Dez de 2013
 *
 */
public class OverlapP extends Reconfiguration {

	private CoordinationPattern2 p;
	private LinkedHashSet<Pair<Node,Node>> X;
	
	

	
	/**
	 * 
	 * @param arg1
	 * @param arg2
	 */
	public OverlapP(CoordinationPattern2 arg1, LinkedHashSet <Pair<Node,Node>> arg2 ) {
		this.p = arg1 ;
		this.X = arg2 ;
	}





	/* (non-Javadoc)
	 * @see pt.uminho.di.cp.reconfigurations.IReconfiguration#apply(pt.uminho.di.cp.model.CoordinationPattern2)
	 */
	@Override
	public CoordinationPattern2 apply(CoordinationPattern2 __cp__) {
		Par par;
		Join join ;
		par = new Par(this.p);
		par.apply(__cp__);
		for(Pair<Node,Node> n : this.X) {
			Node n1, n2;
			n1 = n.fst();
			n2 = n.snd();
			
			LinkedHashSet<Node> E = new LinkedHashSet<Node>();
			E.add(n1);
			E.add(n2);
			join = new Join(E);
			join.apply(__cp__);
		}
		return __cp__ ;
	}


	
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OverlapP [p=" + p + ", X=" + X + "]";
	}

	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((X == null) ? 0 : X.hashCode());
		result = prime * result + ((p == null) ? 0 : p.hashCode());
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
		if (getClass() != obj.getClass())
			return false;
		OverlapP other = (OverlapP) obj;
		if (X == null) {
			if (other.X != null)
				return false;
		} else if (!X.equals(other.X))
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		return true;
	}








	
	
}
