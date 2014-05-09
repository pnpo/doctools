/**
 * 
 */

import java.util.LinkedHashSet;

import pt.uminho.di.cp.model.CoordinationPattern2;
import pt.uminho.di.cp.model.Node;
import pt.uminho.di.cp.reconfigurations.*;
import pt.uminho.di.reolang.parsing.util.Pair;

/**
 * @author Nuno Oliveira
 * @date 16 de Dez de 2013
 *
 */
public class OverlapP extends Reconfiguration {

	private CoordinationPattern2 p;
	private LinkedHashSet<Pair<Node,Node>> X;
	
	public static void main(String[] a){
		System.out.println("Conseguimos!!");
	}

	
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
	public CoordinationPattern2 apply(CoordinationPattern2 __recoopla_pattern__) {
		Par par;
		Join join ;
		par = new Par(this.p);
		par.apply(__recoopla_pattern__);
		for(Pair<Node,Node> n : this.X) {
			Node n1, n2;
			n1 = n.fst();
			n2 = n.snd();
			
			LinkedHashSet<Node> E = new LinkedHashSet<Node>();
			E.add(n1);
			E.add(n2);
			join = new Join(E);
			join.apply(__recoopla_pattern__);
		}
		return __recoopla_pattern__ ;
	}


	
	
	





	
	
}
