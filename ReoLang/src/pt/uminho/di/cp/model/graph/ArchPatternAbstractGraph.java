/**
 * 
 */
package pt.uminho.di.cp.model.graph;

import java.util.HashSet;
import java.util.Set;


/**
 * @author Nuno Oliveira
 * @date 4 de Abr de 2012
 *
 */
public class ArchPatternAbstractGraph extends Graph {

	private Set<Node> in_nodes;
	private Set<Node> out_nodes;
	
	public ArchPatternAbstractGraph() {
		super();
		this.in_nodes = new HashSet<Node>(0);
		this.out_nodes = new HashSet<Node>(0);
	}

	/**
	 * @param nodes
	 * @param edges
	 */
	public ArchPatternAbstractGraph(Set<Node> in_nodes, Set<Node> out_nodes, Set<Node> nodes, Set<Edge> edges, String name) {
		super(nodes, edges, name);
		this.in_nodes = in_nodes;
		this.out_nodes = out_nodes;
	}

	/**
	 * @return the in_nodes
	 */
	public Set<Node> getIn_nodes() {
		return in_nodes;
	}

	/**
	 * @param in_nodes the in_nodes to set
	 */
	public void setIn_nodes(Set<Node> in_nodes) {
		this.in_nodes = in_nodes;
	}

	/**
	 * @return the out_nodes
	 */
	public Set<Node> getOut_nodes() {
		return out_nodes;
	}

	/**
	 * @param out_nodes the out_nodes to set
	 */
	public void setOut_nodes(Set<Node> out_nodes) {
		this.out_nodes = out_nodes;
	}
	
	
	/**
	 * 
	 * @param ni the out node to add
	 */
	public void addInNode(Node ni) {
		this.in_nodes.add(ni);
	}
	
	/**
	 * 
	 * @param no the out node to add
	 */
	public void addOutNode(Node no){
		this.out_nodes.add(no);
	}
	
	
	
	
	@Override
	public String toDot(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("digraph ");
		sb.append(this.getGraphName());
		sb.append(" { \n\t");
		//distinguishing in nodes
		sb.append("node [shape = circle, fixedsize=true, width=0.25, color=green]; ");
		for(Node in : this.in_nodes){
			sb.append(in.toString());
			sb.append(' ');
		}
		sb.append(";\n\t");
		//distinguishing out nodes
		sb.append("node [shape = circle, fixedsize=true, width=0.25, color=red]; ");
		for(Node out : this.out_nodes){
			sb.append(out.toString());
			sb.append(' ');
		}
		sb.append(";\n\t");
		//normal nodes style
		sb.append("node [shape = circle, fixedsize=true, width=0.3, color=black]; \n\t");
		
		for(Edge e : this.getEdges()){
			sb.append(e.getN1().toString());
			sb.append(" -> ");
			sb.append(e.getN2().toString());
			sb.append("[ label = \"" + e.getLabel()+ "\"");
			if(!e.isDirected()){
				sb.append(", dir=\"none\"");
			}
			sb.append("];\n\t");
		}
		
		sb.append("}");
		
		return sb.toString();
	}
	
	

}
