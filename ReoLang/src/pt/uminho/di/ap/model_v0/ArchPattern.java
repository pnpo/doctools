/**
 * 
 */
package pt.uminho.di.ap.model_v0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import pt.uminho.di.cp.model.graph.ArchPatternAbstractGraph;
import pt.uminho.di.cp.model.graph.Edge;
import pt.uminho.di.cp.model.graph.Graph;
import pt.uminho.di.cp.model.graph.Node;

/**
 * @author Nuno Oliveira
 * @date 3 de Abr de 2012
 *
 */
public class ArchPattern extends Pattern {
	
	private HashMap<String, Pattern> behaviour;
	private HashMap<String, Set<Node>> internalNodes;
	
	public ArchPattern() {
		super();
		this.behaviour = new HashMap<String, Pattern>(0);
		this.internalNodes = new HashMap<String, Set<Node>>(0);
	}
	
	
	public ArchPattern(String name, Set<Node> in, Set<Node> out, Map<String, Pattern> beh, Map<String, Set<Node>> nodes) {
		super(in, out, name);
		this.behaviour = new HashMap<String, Pattern>(beh);
		this.internalNodes = new HashMap<String, Set<Node>>(nodes);
	}


	/**
	 * @return the behaviour
	 */
	public HashMap<String, Pattern> getBehaviour() {
		return this.behaviour;
	}


	/**
	 * @param behaviour the behaviour to set
	 */
	public void setBehaviour(HashMap<String, Pattern> behaviour) {
		this.behaviour = behaviour;
	}


	/**
	 * @return the internalNodes
	 */
	public HashMap<String, Set<Node>> getInternalNodes() {
		return internalNodes;
	}


	/**
	 * @param internalNodes the internalNodes to set
	 */
	public void setInternalNodes(HashMap<String, Set<Node>> internalNodes) {
		this.internalNodes = internalNodes;
	}
	
	
	public Graph toGraph(){
		
		Set<Node> in_nodes = new HashSet<Node>();
		Set<Node> out_nodes = new HashSet<Node>();
		Set<Node> nodes = new HashSet<Node>();
		Set<Edge> edges = new HashSet<Edge>();
		
		in_nodes.addAll(this.getIn());
		out_nodes.addAll(this.getOut());
		//collect all names of joined nodes and make of them a node
		for(String key : this.internalNodes.keySet()){
			nodes.add(new Node(key));
		}
		
		edges.addAll(this.extractEdges());
		
		Graph g = new ArchPatternAbstractGraph(in_nodes, out_nodes, nodes, edges, this.getName());
		
		return g;
	}
	
	
	
	@Override
	public Set<Edge> extractEdges() {
		Set<Edge> edges = new HashSet<Edge>();
		
		//collect all edges from constituent patterns
		for(String key_pattern : this.behaviour.keySet()){
			Pattern pat = this.behaviour.get(key_pattern);
			edges.addAll(pat.extractEdges());
		}
		
		//rename nodes of edges if they are joined
		for(String key_node : this.internalNodes.keySet()){
			Set<Node> nodes = this.internalNodes.get(key_node);
			for(Edge edge : edges){
				if(nodes.contains(edge.getN1())){
					edge.setN1(new Node(key_node));
				}
				else{
					if(nodes.contains(edge.getN2())){
						edge.setN2(new Node(key_node));
					}
				}
			}
		}
		
		return edges;
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		sb.append(super.toString());
		sb.append(',');
		sb.append(this.behaviour.toString());
		sb.append(',');
		sb.append(this.internalNodes.toString());
		sb.append(">");
		return sb.toString();
	}


	
	
	
	
	
	
	
	
}
