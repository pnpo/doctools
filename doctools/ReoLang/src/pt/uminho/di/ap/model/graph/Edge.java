/**
 * 
 */
package pt.uminho.di.ap.model.graph;

import pt.uminho.di.ap.model_v0.Node;

/**
 * @author Nuno Oliveira
 * @date 4 de Abr de 2012
 *
 */
public class Edge {

	private Node n1;
	private Node n2;
	private Node oldN1;
	private Node oldN2;
	private boolean directed;
	private String label;
	
	public Edge() {
		this.n1 = new Node();
		this.n2 = new Node();
		this.oldN1 = this.n1;
		this.oldN2 = this.n2;
		this.directed = true;
		this.label = "";
	}
	
	public Edge(String n1, String n2, boolean directed, String label){
		this.n1 = new Node(n1);
		this.n2 = new Node(n2);
		this.oldN1 = this.n1;
		this.oldN2 = this.n2;
		this.directed = directed;
		this.label = label;	
	}

	
	/**
	 * @return the n1
	 */
	public Node getN1() {
		return n1;
	}

	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(Node n1) {
		this.n1 = n1;
	}

	/**
	 * @return the n2
	 */
	public Node getN2() {
		return n2;
	}

	/**
	 * @param n2 the n2 to set
	 */
	public void setN2(Node n2) {
		this.n2 = n2;
	}

	/**
	 * @return the oldN1
	 */
	public Node getOldN1() {
		return oldN1;
	}

	/**
	 * @param oldN1 the oldN1 to set
	 */
	public void setOldN1(Node oldN1) {
		this.oldN1 = oldN1;
	}

	/**
	 * @return the oldN2
	 */
	public Node getOldN2() {
		return oldN2;
	}

	/**
	 * @param oldN2 the oldN2 to set
	 */
	public void setOldN2(Node oldN2) {
		this.oldN2 = oldN2;
	}

	/**
	 * @return the directed
	 */
	public boolean isDirected() {
		return directed;
	}

	/**
	 * @param directed the directed to set
	 */
	public void setDirected(boolean directed) {
		this.directed = directed;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}	
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		sb.append(this.n1);
		if(!this.n1.equals(this.oldN1)){
			sb.append(" >" + this.oldN1 + "< ");
		}
		sb.append("," + this.n2);
		if(!this.n2.equals(this.oldN2)){
			sb.append(" >" + this.oldN2 + "< ");
		}
		sb.append(")");
		return sb.toString();
	}
	
	
	
}
