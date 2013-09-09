/**
 * 
 */
package pt.uminho.di.imc.reo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import pt.uminho.di.imc.util.ICopiable;

/**
 * @author Nuno Oliveira
 * @date 31 de Jan de 2013
 *
 */
public class IMCREOState implements ICopiable, Comparable<IMCREOState> {

	private HashSet<String> requests;
	private HashSet<String> transmissions;
	private ArrayList<IMCREOBufferState> buffer;
	
	
	public IMCREOState() {
		this.setRequests(new HashSet<String>(2));
		this.setTransmissions(new HashSet<String>(2));
		this.setBuffer(new ArrayList<IMCREOBufferState>());
	}
	
	
	
	/**
	 * Creates a copy of the states in the sense that 
	 * an all sets passed as arguments will be cloned.
	 * @param r the set of request states
	 * @param t the set to transmission states
	 * @param b the set of blocking states
	 * @param buff the buffer qualifier.
	 */
	@SuppressWarnings("unchecked")
	public IMCREOState(HashSet<String> r, HashSet<String> t, ArrayList<IMCREOBufferState> buff) {
		this.setRequests((HashSet<String>)r.clone());
		this.setTransmissions((HashSet<String>)t.clone());
		this.setBuffer(buff);
	}
	
	
	
	
	/**
	 * @return the requests
	 */
	public HashSet<String> getRequests() {
		return requests;
	}


	/**
	 * @param requests the requests to set
	 */
	public void setRequests(HashSet<String> requests) {
		this.requests = requests;
	}


	/**
	 * @return the transmissions
	 */
	public HashSet<String> getTransmissions() {
		return transmissions;
	}


	/**
	 * @param transmissions the transmissions to set
	 */
	public void setTransmissions(HashSet<String> transmissions) {
		this.transmissions = transmissions;
	}


	

	/**
	 * @return the buffer
	 */
	public ArrayList<IMCREOBufferState> getBuffer() {
		return buffer;
	}


	/**
	 * @param buffer the buffer to set
	 */
	public void setBuffer(ArrayList<IMCREOBufferState> buffer) {
		this.buffer = buffer;
	}

	
	
	/**
	 * @return the IMCREOStateSort of the state
	 */
	private IMCREOStateSort getSort(){
		IMCREOStateSort sort = IMCREOStateSort.MIXED;
		if(this.transmissions.isEmpty() && (! this.requests.isEmpty())){
			sort = IMCREOStateSort.REQUEST;
		}
		else {
			if(this.requests.isEmpty() && (! this.transmissions.isEmpty())){
				sort = IMCREOStateSort.TRANSMISSION;
			}
		}
		
		return sort;
	}
	
	
	
	
	/**
	 * @return whether or not the state is a REQUEST state
	 */
	public boolean isRequestState() {
		return this.getSort().equals(IMCREOStateSort.REQUEST);
	}
	
	/**
	 * @return whether or not the state is a TRANSMISSION state
	 */
	public boolean isTransmissionState() {
		return this.getSort().equals(IMCREOStateSort.TRANSMISSION);
	}
	
	/**
	 * @return whether or not the state is a MIXED state
	 */
	public boolean isMixedState() {
		return this.getSort().equals(IMCREOStateSort.MIXED);
	}
		
	
	
	
	
	
	
	/**
	 * Performs a simple component-wise union of two states.
	 * 
	 * This method is non-destructive!!
	 * 
	 * E.g., s1 = [a]{b}_e and s2 = {a c}_f => [a]{a b c}_ef
	 * 
	 * @param other_state - the state to merge wit the first
	 * @return a new IMCREOState corresponding to the merge of
	 * both states. 
	 */
	public IMCREOState wiseUnion(IMCREOState other_state) {
		IMCREOState state = new IMCREOState();
		
		state.getRequests().addAll(this.requests);
		state.getRequests().addAll(other_state.getRequests());
		
		state.getTransmissions().addAll(this.transmissions);
		state.getTransmissions().addAll(other_state.getTransmissions());
		
		state.getBuffer().addAll(this.buffer);
		state.getBuffer().addAll(other_state.getBuffer());
		
		return state;
	}
	
	
	
	/**
	 * Performs a component-wise union of two states, but 
	 * restricts the buffer state union to just one of the
	 * states merged.
	 * 
	 * This method is non-destructive!!
	 * 
	 * E.g., s1 = [a]{b}_e and s2 = {a c}_f and 1 is the buffer_side 
	 * => [a]{a b c}_e 
	 * 
	 * @param other_state - the state to merge wit the first
	 * @param buffer_side - a number (1 or 2) corresponding to
	 * the state of which one wants the buffer state to remain.
	 * If any other number is provided, no buffer state is added, 
	 * this method behaves as the single argument wiseUnion. 
	 * @return a new IMCREOState corresponding to the merge of
	 * both states but with only a buffer state.
	 */
	public IMCREOState wiseUnion(IMCREOState other_state, int buffer_side) {
		IMCREOState state = new IMCREOState();
		
		state.getRequests().addAll(this.requests);
		state.getRequests().addAll(other_state.getRequests());
		
		state.getTransmissions().addAll(this.transmissions);
		state.getTransmissions().addAll(other_state.getTransmissions());
		
		switch(buffer_side){
			case 1 : state.getBuffer().addAll(this.buffer); break;
			case 2 : state.getBuffer().addAll(other_state.getBuffer()); break;
			default : {
					state.getBuffer().addAll(this.buffer);
					state.getBuffer().addAll(other_state.getBuffer());
				} ; break;
		}
		
		return state;
	}
	
	
	
	
	
	/**
	 * Performs a component-wise union of two states.
	 * 
	 * This method is non-destructive!!
	 * 
	 * When mixed nodes are present, they are transformed into $Ni
	 * with i \in {1,2}. i is 1 if node N is in the first state, 
	 * and it is 2 otherwise 
	 * 
	 * E.g., s1 = [a]{b}_e and s2 = {a c}_f and {b} is the mixednodes 
	 * => [a]{a $b1 c}_ef
	 * 
	 * @param other_state the state join with the current state
	 * @param mixednodes - the nodes that are in both states (representing mixed nodes)
	 * @return A state which is the union (component by component)
	 * of two states
	 */
	public IMCREOState wiseUnion(IMCREOState other_state, HashSet<String> mixednodes) {
		IMCREOState state = new IMCREOState();
		
		state.getRequests().addAll(this.requests);
		state.getRequests().addAll(other_state.getRequests());
		
		state.getTransmissions().addAll(this.transmissions);
		HashSet<String> mixednodes_replaced = new HashSet<String>(); 
		Iterator<String> it = state.getTransmissions().iterator(); 
		while(it.hasNext()) {
			String n = it.next();
			prepareTransmissions(mixednodes, mixednodes_replaced, it, n, "$1");
		}
			
		state.getTransmissions().addAll(other_state.getTransmissions());
		it = state.getTransmissions().iterator(); 
		while(it.hasNext()) {
			String n = it.next();
			prepareTransmissions(mixednodes, mixednodes_replaced, it, n, "$2");
		}
		state.getTransmissions().addAll(mixednodes_replaced);
		
		state.getBuffer().addAll(this.buffer);
		state.getBuffer().addAll(other_state.getBuffer());
		
		return state;
	}



	/**
	 * @param mixednodes
	 * @param mixednodes_replaced
	 * @param it
	 * @param n
	 */
	private void prepareTransmissions(HashSet<String> mixednodes,
			HashSet<String> mixednodes_replaced, Iterator<String> it, String n, String trail) {
		int dolar_pos = n.indexOf('$');
		String n_trimmed = (dolar_pos > 0 || dolar_pos < n.length()) && dolar_pos != -1 ? n.substring(0, dolar_pos) : n;
		if(mixednodes.contains(n_trimmed)){
			mixednodes_replaced.add( n + trail);
			it.remove();
		}
	}
	
	
	
	
	
	public String toReoMAState() {
		StringBuffer sb = new StringBuffer(); 
		if(!requests.isEmpty()){
			sb.append("[");  
			for(String s : this.requests){
				sb.append(s + " ");
			}
			sb.setLength(sb.length()-1);
			sb.append("]");
		}
		if(!transmissions.isEmpty()){
			if(requests.isEmpty()){
				sb.append("[]");
			}
			sb.append("{");  
			for(String s : this.transmissions){
				sb.append(s + " ");
			}
			sb.setLength(sb.length()-1);
			sb.append("}");
		}
		if(sb.toString().equals("")){
			sb.append("[]");
		}
		
		for(IMCREOBufferState bs : this.buffer){
			switch(bs) {
				case FULL : sb.append("#"); break;
				case EMPTY: sb.append("&"); break;
				default : break;
			}
		}
		
		return sb.toString();
	}
	
	
	
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(); 
		if(!requests.isEmpty()){
			sb.append("[");  
			for(String s : this.requests){
				sb.append(s + ", ");
			}
			sb.setLength(sb.length()-2);
			sb.append("]");
		}
		if(!transmissions.isEmpty()){
			sb.append("{");  
			for(String s : this.transmissions){
				sb.append(s + ", ");
			}
			sb.setLength(sb.length()-2);
			sb.append("}");
		}
		if(sb.toString().equals("")){
			sb.append("E");
		}
		
		sb.append("_");
		for(IMCREOBufferState bs : this.buffer){
			switch(bs) {
				case FULL : sb.append("f"); break;
				case EMPTY: sb.append("e"); break;
				default : sb.append("-"); break;
			}
		}
				
		
		return sb.toString();
	}

	
	
	
	public String toStringCompact() {
		StringBuffer sb = new StringBuffer(); 
		if(!requests.isEmpty()){
			sb.append("[");  
			for(String s : this.requests){
				sb.append(s + ",");
			}
			sb.setLength(sb.length()-1);
			sb.append("]");
		}
		if(!transmissions.isEmpty()){
			sb.append("{");  
			for(String s : this.transmissions){
				sb.append(s + ",");
			}
			sb.setLength(sb.length()-1);
			sb.append("}");
		}
		if(sb.toString().equals("")){
			sb.append("E");
		}
		
		sb.append("_");
		for(IMCREOBufferState bs : this.buffer){
			switch(bs) {
				case FULL : sb.append("f"); break;
				case EMPTY: sb.append("e"); break;
				default : sb.append("-"); break;
			}
		}
				
		
		return sb.toString();
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buffer == null) ? 0 : buffer.hashCode());
		result = prime * result
				+ ((requests == null) ? 0 : requests.hashCode());
		result = prime * result
				+ ((transmissions == null) ? 0 : transmissions.hashCode());
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
		if (!(obj instanceof IMCREOState))
			return false;
		IMCREOState other = (IMCREOState) obj;
		if (buffer == null) {
			if (other.buffer != null)
				return false;
		} else if (!buffer.equals(other.buffer))
			return false;
		if (requests == null) {
			if (other.requests != null)
				return false;
		} else if (!requests.equals(other.requests))
			return false;
		if (transmissions == null) {
			if (other.transmissions != null)
				return false;
		} else if (!transmissions.equals(other.transmissions))
			return false;
		return true;
	}

	
	


	public IMCREOState copy() {
		return new IMCREOState(this.requests, this.transmissions, this.buffer); 
	}



	@Override
	public int compareTo(IMCREOState o) {
		return this.hashCode() - o.hashCode();
	}


	/**
	 * 
	 * @param prefix
	 * @param mixedports_single
	 * @return
	 */
	public IMCREOState prefixPortNames(String prefix, HashSet<String> mixedports_single) {
		IMCREOState st = new IMCREOState();
		
		
		for(String req : this.getRequests()) {
			if(! mixedports_single.contains(req)){
				st.getRequests().add(prefix + "." + req);
			}
			else {
				st.getRequests().add(req);
			}
		}
		
		for(String tra : this.getTransmissions()) {
			if(! mixedports_single.contains(tra)) {
				st.getTransmissions().add(prefix + "." + tra);
			}
			else {
				st.getTransmissions().add(tra);
			}
		}
		
		st.setBuffer(this.buffer);
		return st;
	}


	/**
	 * 
	 * @param mixedports_single
	 * @return
	 */
	public IMCREOState unprefixMixedPorts(HashSet<String> mixedports_single) {
		IMCREOState st = new IMCREOState();
		
		for(String req : this.getRequests()) {
			for(String mp : mixedports_single){
				if(req.contains("." + mp)){
					st.getRequests().add(req.substring(req.indexOf('.')+1, req.length()));
				}
				else {
					st.getRequests().add(req);
				}
			}
			
		}
		
		for(String tra : this.getTransmissions()) {
			for(String mp : mixedports_single){
				if(! tra.contains("$") && tra.contains("." + mp)){
					st.getTransmissions().add(tra.substring(tra.indexOf('.')+1, tra.length()));
				}
				else {
					st.getTransmissions().add(tra);
				}
			}
		}
		
		st.setBuffer(this.buffer);
		
		return st;
	}
	
	
	
	
	
	
}
