package pt.uminho.di.cp.model.graph;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Nuno Oliveira
 * @date 4 de Abr de 2012
 * 
 */



public class Graph {

	private Set<Node> nodes;
	private Set<Edge> edges;
	private String graphName;
	
	
	
	
	public Graph() {
		this.nodes = new HashSet<Node>(0);
		this.edges = new HashSet<Edge>(0);
		this.graphName = "DEFAULT";
	}
	
	
	/**
	 * @param nodes
	 * @param edges
	 */
	public Graph(Set<Node> nodes, Set<Edge> edges, String name) {
		this.nodes = nodes;
		this.edges = edges;
		this.graphName=name;
	}
	
	
	
	/**
	 * @return the nodes
	 */
	public Set<Node> getNodes() {
		return nodes;
	}
	/**
	 * @param nodes the nodes to set
	 */
	public void setNodes(Set<Node> nodes) {
		this.nodes = nodes;
	}
	/**
	 * @return the edges
	 */
	public Set<Edge> getEdges() {
		return edges;
	}
	/**
	 * @param edges the edges to set
	 */
	public void setEdges(Set<Edge> edges) {
		this.edges = edges;
	}
	/**
	 * @return the graphName
	 */
	public String getGraphName() {
		return graphName;
	}
	/**
	 * @param graphName the graphName to set
	 */
	public void setGraphName(String graphName) {
		this.graphName = graphName;
	}
	
	
	/**
	 * 
	 * @param n the node to add
	 */
	public void addNode(Node n) {
		this.nodes.add(n);
	}
	
	/**
	 * 
	 * @param e the edge to add
	 */
	public void addEdge(Edge e){
		this.edges.add(e);
	}

	
	
	

	public String toDot(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("digraph ");
		sb.append(this.graphName);
		sb.append(" { \n\t");
		
		for(Edge e : this.edges){
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
	
	
	public void toDotFile(String file_path){
		try{
		 	// Create file 
			  FileWriter fstream = new FileWriter(file_path);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(this.toDot());
			  //Close the output stream
			  out.close();
			}
			catch (Exception e){//Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
	}	
	
	
	@Override
	public String toString() {
		return this.edges.toString();
	}
	
	
	
	
	
	
}
