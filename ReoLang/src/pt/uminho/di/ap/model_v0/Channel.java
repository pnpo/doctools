/**
 * 
 */
package pt.uminho.di.ap.model_v0;

import java.util.HashSet;
import java.util.Set;

import pt.uminho.di.cp.model.graph.Edge;
import pt.uminho.di.cp.model.graph.Node;

/**
 * @author Nuno Oliveira
 * @date 3 de Abr de 2012
 *
 */
public class Channel extends Pattern {

	
	private Set<Flow> behaviour;
	
	public Channel() {
		super();
		this.behaviour = new HashSet<Flow>(0);
	}

	/**
	 * @param in
	 * @param out
	 */
	public Channel(String name, Set<Node> in, Set<Node> out, Set<Flow> flows) {
		super(in, out, name);
		this.behaviour = new HashSet<Flow>(flows);
	}

	/**
	 * @return the behaviour
	 */
	public Set<Flow> getBehaviour() {
		return behaviour;
	}

	/**
	 * @param behaviour the behaviour to set
	 */
	public void setBehaviour(Set<Flow> behaviour) {
		this.behaviour = behaviour;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append('<');
		sb.append(super.toString());
		sb.append(',');
		sb.append(this.behaviour.toString());
		sb.append('>');
		return sb.toString();
	}

	
	
	
	
	@Override
	public Set<Edge> extractEdges() {
		Set<Edge> edges = new HashSet<Edge>(2); //for sure, it will create 2 edges at maximum
		Edge e;
		Node[] in_ports = this.getIn().toArray(new Node[0]);
		Node[] out_ports = this.getOut().toArray(new Node[0]);
		
		if(in_ports.length==1) { 
			e = new Edge(in_ports[0].toString(), out_ports[0].toString(), true, this.getName());
		}
		else {
			if(in_ports.length ==2) {
				e = new Edge(in_ports[0].toString(), in_ports[1].toString(), false, this.getName());
				//create edges (in_ports[0], id, t, NULL) and (in_ports[1], id, t, NULL)
			}
			else {
				e = new Edge(out_ports[0].toString(), out_ports[1].toString(), false, this.getName());
				//create edges (NULL, id, t,out_ports[0]) and (NULL, id, t, out_ports[1])
			}
		}
		
		edges.add(e);
		
		return edges;
	}
	

}
