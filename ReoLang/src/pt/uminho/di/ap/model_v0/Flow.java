/**
 * 
 */
package pt.uminho.di.ap.model_v0;

import java.util.HashSet;
import java.util.Set;

import pt.uminho.di.cp.model.graph.Node;

/**
 * @author Nuno Oliveira
 * @date 3 de Abr de 2012
 *
 */
public class Flow {
	private Set<Node> request;
	private Set<Node> fire;
	private int istate;
	private int fstate;
	
	public Flow(){
		this.fire = new HashSet<Node>(0);
		this.request = new HashSet<Node>(0);
		this.istate = 1;
		this.fstate = 1;
	}
	
	
	
	
	public Flow(Set<Node> r, Set<Node> f){
		this.request = new HashSet<Node>(r);
		this.fire = new HashSet<Node>(f);
		this.istate = 1;
		this.fstate = 1;
	}
	
	
	
	public Flow(Set<Node> r, int istate, Set<Node> f, int fstate){
		this.request = new HashSet<Node>(r);
		this.fire = new HashSet<Node>(f);
		this.istate = istate;
		this.fstate = fstate;
	}


	/**
	 * @return the request
	 */
	public Set<Node> getRequest() {
		return request;
	}


	/**
	 * @param request the request to set
	 */
	public void setRequest(Set<Node> request) {
		this.request = request;
	}


	/**
	 * @return the fire
	 */
	public Set<Node> getFire() {
		return fire;
	}


	/**
	 * @param fire the fire to set
	 */
	public void setFire(Set<Node> fire) {
		this.fire = fire;
	}
	
	
	public int getIstate() {
		return istate;
	}


	public void setIstate(int istate) {
		this.istate = istate;
	}


	public int getFstate() {
		return fstate;
	}


	public void setFstate(int fstate) {
		this.fstate = fstate;
	}


	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append('(');
		sb.append(this.request.toString());
		sb.append(',');
		sb.append(this.fire.toString());
		sb.append(')');
		
		return sb.toString();
	}
	
	
}
