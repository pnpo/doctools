/**
 * 
 */
package pt.uminho.di.imc.reo.imc;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Nuno Oliveira
 * @date 22 de Set de 2013
 *
 */
public class IMCREOInternalState {

	private IMCREOBufferState state;
	private Set<String> ports; //ports that are in the given internal state
	
	
	public IMCREOInternalState() {
		super();
		this.state = IMCREOBufferState.NONE;
		this.ports = new LinkedHashSet<String>();
	}
	
	
	
	/**
	 * @param state
	 * @param ports
	 */
	public IMCREOInternalState(IMCREOBufferState state, Set<String> ports) {
		super();
		this.state = state;
		this.ports = ports;
	}
	/**
	 * @return the state
	 */
	public IMCREOBufferState getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(IMCREOBufferState state) {
		this.state = state;
	}
	/**
	 * @return the ports
	 */
	public Set<String> getPorts() {
		return ports;
	}
	/**
	 * @param ports the ports to set
	 */
	public void setPorts(Set<String> ports) {
		this.ports = ports;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String res;
		switch(state){
			case NONE : {res = "-"; }  break;
			case FULL : {res = "f"; }  break;
			case EMPTY : {res = "e"; }  break;
			default : {res = "" ;} break;
		}
		
		return res;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ports == null) ? 0 : ports.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		if (!(obj instanceof IMCREOInternalState))
			return false;
		IMCREOInternalState other = (IMCREOInternalState) obj;
		if (ports == null) {
			if (other.ports != null)
				return false;
		} else if (!ports.equals(other.ports))
			return false;
		if (state != other.state)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
