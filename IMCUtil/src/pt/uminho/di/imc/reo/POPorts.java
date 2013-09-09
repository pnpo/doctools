/**
 * 
 */
package pt.uminho.di.imc.reo;

import java.util.HashSet;
import java.util.Set;

import pt.uminho.di.imc.util.Pair;

/**
 * @author Nuno Oliveira
 * @date 25 de Mar de 2013
 *
 */
public class POPorts {
	
	public enum REL { BFR, AFT, PAR };
	
	private Set<Pair<String, String>> po ;
	
	
	
	public POPorts() {
		this.po = new HashSet<Pair<String, String>>();
	}
	
	
	
	public POPorts(Set<Pair<String, String>> poset) {
		this.po = new HashSet<Pair<String, String>>(poset);
		this.completePO();
	}
	

	
	/**
	 * @return the po
	 */
	public Set<Pair<String, String>> getPo() {
		return po;
	}


	/**
	 * @param po the po to set
	 */
	public void setPo(Set<Pair<String, String>> po) {
		this.po = po;
	}


	
	/**
	 * 
	 * @param po the po to add to the existing poset
	 */
	public void addAllPOSet(Set<Pair<String, String>> po) {
		this.po.addAll(po);
		this.completePO();
	}
	
	
	/**
	 * 
	 * @param p the po to add to the existing poset
	 */
	public void addSinglePOSet(Pair<String, String> p) {
		this.po.add(p);
		this.completePO();
	}
	
	
	/* COMPARISONS */
	
	/**
	 * This method allows to check whether a port x transmits 
	 * before port y. It will return a value 0 if y actually transmits 
	 * before x; 1 if x transmits before x,; or -1 if they may transmit 
	 * in parallel. 
	 * 
	 * @param x the first element to compare
	 * @param y the second element to compare
	 * @return 
	 * PAR -- if x not comparable/parallel y
	 * AFT -- if y << x
	 * BFR -- if x << y 
	 */
	public POPorts.REL _transmit_order_(String x, String y) {
		
		POPorts.REL value = POPorts.REL.PAR; //x is not comparable to y... they may transmit in parallel
		
		if(this.po.contains(new Pair<String, String>(x, y))) {
			value = POPorts.REL.BFR; //x transmits before y
		}
		else {
			if(this.po.contains(new Pair<String, String>(y, x))) {
				value = POPorts.REL.AFT; //y transmits before x
			}
		}
		
		return value;
		
	} 
	
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "{" + po + "}";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((po == null) ? 0 : po.hashCode());
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
		if (!(obj instanceof POPorts))
			return false;
		POPorts other = (POPorts) obj;
		if (po == null) {
			if (other.po != null)
				return false;
		} else if (!po.equals(other.po))
			return false;
		return true;
	}


	
	
	

	
	/**
	 * This method completes the partial ordered set with 
	 * the notion of transitivity as a property of Posets. 
	 * 
	 * We assume here that the poset is valid as for the 
	 * Antisymmetric property;
	 */
	private void completePO() {
		HashSet<Pair<String, String>> aux = new HashSet<Pair<String,String>>();
		HashSet<Pair<String, String>> sharp_processed = new HashSet<Pair<String,String>>();
		boolean is_incomplete = true;
		
		while(is_incomplete) {
			for(Pair<String, String> i : this.po) {
				//Dealing with ports on full states...
				//if a port is (a#,b) then we automatically create: (a#,a) and (a#,b#)
				if(i.fst().endsWith("#")){
					int pos_sharp = i.fst().length()-1;
					String port = i.fst().substring(0,pos_sharp);
					//if the pair was not processed and its snd element does not end with # and is not equal to the port
					if(! port.equals(i.snd()) && ! i.snd().endsWith("#") && ! sharp_processed.contains(i) ){
						Pair<String, String> new_pair_ahead = new Pair<String, String>(i.fst(),port);
						aux.add(new_pair_ahead);
						Pair<String, String> new_pair_behind = new Pair<String, String>(i.fst(), i.snd() + "#");
						aux.add(new_pair_behind);
					}
					sharp_processed.add(i);
				}
				for(Pair<String, String> j : this.po) {
					if(! i.equals(j)) {
						Pair<String, String> new_pair = null;
						if(i.snd().equals(j.fst()) && ! j.fst().endsWith("#")){
								new_pair = new Pair<String, String>(i.fst(),j.snd());
						}
						else {
							if(i.fst().equals(j.snd()) && ! j.snd().endsWith("#") ){
								new_pair = new Pair<String, String>(j.fst(),i.snd());
							}
						}
						if( new_pair!=null && !this.po.contains(new_pair) && !aux.contains(new_pair) ) {
							aux.add(new_pair);
						}
					}
				}
			}
			if(aux.size() > 0){
				this.po.addAll(aux);
				aux.clear();
			}
			else {
				is_incomplete = false;
			}
		}
	}
	
	
	
	
	
	
	
}
