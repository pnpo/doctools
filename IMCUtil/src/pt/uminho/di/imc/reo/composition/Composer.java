/**
 * 
 */
package pt.uminho.di.imc.reo.composition;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.parsing.ReoMAParserFrontEnd;

/**
 * @author Nuno Oliveira
 * @date 5 de Abr de 2013
 *
 */
public class Composer {
	
	private Map<String, LinkedList<String>> ports_to_structure;
	private Map<String, String> structure_to_text;
	private Map<String, Set<String>> structure_to_ports;
	private Set<String> mixed_ports;
	private LinkedList<String> structure_order;
	
	/**
	 * 
	 */
	public Composer() {
		super();
		ports_to_structure = new LinkedHashMap<String, LinkedList<String>>();
		structure_to_text = new LinkedHashMap<String, String>();
		structure_to_ports = new LinkedHashMap<String, Set<String>>();
		mixed_ports = new LinkedHashSet<String>();
		structure_order = new LinkedList<String>();
	}


//	/**
//	 * 
//	 * @param ports_to_structure
//	 * @param structure_to_text
//	 * @param structure_to_ports
//	 * @param mixed
//	 */
//	public Composer(Map<String, LinkedList<String>> ports_to_structure,
//			Map<String, String> structure_to_text, 
//			Map<String, Set<String>> structure_to_ports, Set<String> mixed, LinkedList<String> order) {
//		super();
//		this.ports_to_structure = ports_to_structure;
//		this.structure_to_text = structure_to_text;
//		this.structure_to_ports = structure_to_ports;
//		this.mixed_ports = new LinkedHashSet<String>(mixed);
//		this.structure_order = new LinkedList<String>(order);
//	}


	/**
	 * @return the ports_to_structure
	 */
	public Map<String, LinkedList<String>> getPorts_to_structure() {
		return ports_to_structure;
	}


	/**
	 * @param ports_to_structure the ports_to_structure to set
	 */
	public void setPorts_to_structure(Map<String, LinkedList<String>> ports_to_structure) {
		this.ports_to_structure = ports_to_structure;
	}


	/**
	 * @return the structure_to_text
	 */
	public Map<String, String> getStructure_to_text() {
		return structure_to_text;
	}


	/**
	 * @param structure_to_text the structure_to_text to set
	 */
	public void setStructure_to_text(Map<String, String> structure_to_text) {
		this.structure_to_text = structure_to_text;
	}
	
	
	
	
	
	
	/**
	 * @return the structure_to_ports
	 */
	public Map<String, Set<String>> getStructure_to_ports() {
		return structure_to_ports;
	}


	/**
	 * @param structure_to_ports the structure_to_ports to set
	 */
	public void setStructure_to_ports(
			Map<String, Set<String>> structure_to_ports) {
		this.structure_to_ports = structure_to_ports;
	}


	/**
	 * @return the mixed_ports
	 */
	public Set<String> getMixed_ports() {
		return mixed_ports;
	}


	/**
	 * @param mixed_ports the mixed_ports to set
	 */
	public void setMixed_ports(Set<String> mixed_ports) {
		this.mixed_ports = mixed_ports;
	}

	
	
	
	
	
	/**
	 * @return the structure_order
	 */
	public LinkedList<String> getStructure_order() {
		return structure_order;
	}


	/**
	 * @param structure_order the structure_order to set
	 */
	public void setStructure_order(LinkedList<String> structure_order) {
		this.structure_order = structure_order;
	}

	
	
//	/**
//	 * This method composes a set of channels into a connector.
//	 * It composes channels in order of appearence. Thus it may
//	 * cause several multi-mixed nodes compositions which may
//	 * lead to undesired results. 
//	 *  
//	 * @return The IMCREOimc of a stochastic connector...
//	 * 
//	 */
//	@Deprecated
//	public IMCREOimc<IMCREOState> compose() {
//		IMCREOimc<IMCREOState> res = new IMCREOimc<IMCREOState>();
//
//		HashSet<String> mixedports;
//		HashSet<String> portsused = new HashSet<String>();
//		
//		//if there is only a structure, the result is the IMC of such structure  
//		if(this.structure_to_text.size()==1) {
//			res = ReoMAParserFrontEnd.parse((String)(this.structure_to_text.values().toArray())[0], false);
//		}
//		else {
//			//if there are more then a structure...
//			String[] structures = new String[this.structure_order.size()]; 
//			structures = this.structure_order.toArray(structures);
//			System.out.println(this.structure_order);
//			//we compose them one by one...
//			for(int i = 0 ; i < structures.length; i++) {
//				//IMCREOimc<Pair<IMCREOState, IMCREOState>> res_internal = new IMCREOimc<Pair<IMCREOState,IMCREOState>>();
//				//if it is the first composition we will compose the two first channnels
//				if(i == 0) {
//					//get the mixed nodes as the intersection of the nodes present in the two channels
//					mixedports = new HashSet<String>(this.structure_to_ports.get(structures[i]));
//					mixedports.retainAll(this.structure_to_ports.get(structures[i+1]));
//					//the used ports are a collection of the ports in these two channels
//					portsused.addAll(this.structure_to_ports.get(structures[i]));
//					portsused.addAll(this.structure_to_ports.get(structures[i+1]));
//					
//					//obtain the IMC for each structure and compose
//					IMCREOimc<IMCREOState> imc1 = ReoMAParserFrontEnd.parse((String)this.structure_to_text.get(structures[i]), false);
//					IMCREOimc<IMCREOState> imc2 = ReoMAParserFrontEnd.parse((String)this.structure_to_text.get(structures[i+1]), false);
//					//res_internal = imc1.compose(imc2, mixedports).synchronise(mixedports, this.mixed_ports);
//					//res = res_internal.wiseUnion(mixedports);
//					res = performComposition(imc1, imc2, mixedports);
//					//here, i is incremented so in the next step we compose the 3rd strucutre and not the second...
//					i = i + 1;
//				}
//				else {
//					//if it is the second or more composition we will compose the obtained IMC with the following channel
//					mixedports = new HashSet<String>(this.structure_to_ports.get(structures[i]));
//					mixedports.retainAll(portsused);
//					//update used ports only after obtaining the mixednodes, otherwise 
//					//undesired nodes will also be seen as mixed... 
//					portsused.addAll(this.structure_to_ports.get(structures[i]));
//					
//					//compose the previously obtained IMC with the new channel
//					IMCREOimc<IMCREOState> imc1 = ReoMAParserFrontEnd.parse((String)this.structure_to_text.get(structures[i]), false);
//					//res_internal = res.compose(imc1, mixedports).synchronise(mixedports, this.mixed_ports);
//					//res = res_internal.wiseUnion(mixedports);
//					res = performComposition(res, imc1, mixedports);
//					
//				}
//				// finally, update the mixed_ports of the composer object.
//				this.mixed_ports.addAll(mixedports);
//			}
//		}
//		
//		return res;
//		
//	}
	
	
	
	
	/**
	 * This method is used to actually invoke the composition and 
	 * synchornisation methods.
	 * 
	 * 
	 * 
	 * @param imc1 - the first reo imc to compose
	 * @param imc2 - the second reo imc to compose 
	 * @param mixedports - the set of mixed ports to perform the join of the imcs.
	 * @return
	 */
	private IMCREOimc performComposition( IMCREOimc imc1, IMCREOimc imc2, LinkedHashSet<String> mixedports) {
		IMCREOimc res_internal;
		
		res_internal = imc1.compose(imc2, mixedports); 
		System.out.println("-------------------------\nCOMPi\n------------------------------");
		System.out.println(res_internal);
		
		res_internal = res_internal.mixedRequestsReduction(mixedports);
		System.out.println("-------------------------\nREDi\n------------------------------");
		System.out.println(res_internal);
		
		return res_internal;
		
		//ArrayList<String> mixedports_list = new ArrayList<String>(mixedports);
		//LinkedHashSet<String> single_mixed_port = new LinkedHashSet<String>();
		
		//when the mixed ports are more than 1, we shall compose only by one of them
		//but we perform synchronisation by all of the mixed ports at once
//		if(mixedports.size() > 0) {
//			single_mixed_port.add(mixedports_list.get(0));
//		}
//
//		res_internal = imc1.compose(imc2, single_mixed_port).synchronise(mixedports, this.mixed_ports);
		
		//return mixedports.size() > 1 ? res_internal.wiseUnion(mixedports).cleanAfterMultiMixedPortsSynchronisation(mixedports) : res_internal.wiseUnion(mixedports);
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * This method composes a set of channels into a connector.
	 * It is intelligent because it uses a strategy to compose
	 * the channels in sequence.
	 * 
	 * This way, channels are composed always by a single mixed 
	 * port. Only at the end it may happen that two mixed ports 
	 * are left to synchronise.
	 * 
	 * @return The IMCREOimc of a stochastic connector
	 * 
	 */
	public IMCREOimc intelligentCompose(){
		IMCREOimc res = new IMCREOimc();
		//HashSet<String> ports_merged = new HashSet<String>();
		LinkedHashSet<String> ports_in_comp = new LinkedHashSet<String>();
		
		
		if(this.structure_to_text.size()==1) {
			res = ReoMAParserFrontEnd.parse((String)(this.structure_to_text.values().toArray())[0], false);
		}
		else {
			String current_comp = "";
			boolean has_joins = true;
			//boolean did_join = false;
			int joins_made = 0;
			
			//While joins are being performed...
			//we will be iterating over the ports_to_structure map over and over again... 
			while(has_joins) {
				has_joins = false;		
				LinkedList<String> visited_compositions = new LinkedList<String>();
				//Iterate on the ports of ports_to_structure
				Iterator<String> it_ports = this.ports_to_structure.keySet().iterator();
				while(it_ports.hasNext() && ! has_joins){
					String port = it_ports.next();
					//by default we cannot compose
					 boolean may_compose = false;
					 //but let's check whether we can or cannot compose
					 //if there are two structures associated to the port and
					 //that port was not already merged,,,
					 if(this.ports_to_structure.get(port).size() == 2 && ! this.mixed_ports.contains(port)) {
						String fst="", snd="";
						//if there were no joins before, then we'll compose
						if(joins_made==0) {
							//we may use getFirst and getLast because we know that there are
							//only two structures on the port list (given by the if above)
							fst = this.ports_to_structure.get(port).getFirst();
							snd = this.ports_to_structure.get(port).getLast();
							//in this context we are able to compose
							may_compose = true;
						}
						else { //if there were one or more joins
							//if the current composition is in the list of structures for the port
							if(this.ports_to_structure.get(port).contains(current_comp)) {
								fst = this.ports_to_structure.get(port).getFirst();
								snd = current_comp;
								String visting = fst + current_comp;
								LinkedHashSet<String> ports_structure_1_test = new LinkedHashSet<String>(this.structure_to_ports.get(fst));
								LinkedHashSet<String> ports_structure_2_test = new LinkedHashSet<String>(ports_in_comp) ;
								//the mixed ports for this composition are the intersection of the ports 
								// of both structures
								ports_structure_1_test.retainAll(ports_structure_2_test);
								//in this context we are able compose
								may_compose = ports_structure_1_test.size()==1 || (ports_structure_1_test.size()==2 && visited_compositions.contains(visting) );
								visited_compositions.add(visting);
							}
							//in any other case we may not compose
						}
						
						if(may_compose){ //compose
							//get the IMC of each structure to compose
							//the first always need to be parsed
							//System.out.println(fst + " + " + snd);
							IMCREOimc imc_fst = ReoMAParserFrontEnd.parse(this.structure_to_text.get(fst), false);
							//the second may need to be parsed unless it is the current_composition
							IMCREOimc imc_snd = snd.equals(current_comp)/*startsWith("$COMP$")*/ ? 
									res : ReoMAParserFrontEnd.parse(this.structure_to_text.get(snd), false);
						
							
							//check the ports of each structure to compose to find the mixed ports
							// for this composition
							LinkedHashSet<String> ports_structure_1 = new LinkedHashSet<String>(this.structure_to_ports.get(fst));
							LinkedHashSet<String> ports_structure_2 = snd.equals(current_comp) ? 
								new LinkedHashSet<String>(ports_in_comp) : new LinkedHashSet<String>(this.structure_to_ports.get(snd));
							//the mixed ports for this composition are the intersection of the ports 
							// of both structures
							ports_structure_1.retainAll(ports_structure_2);
							LinkedHashSet<String> mixedports = new LinkedHashSet<String>(ports_structure_1);
							
							res = this.performComposition(imc_fst, imc_snd, mixedports);
							
							//keep track of all mixed ports...
							this.mixed_ports.addAll(mixedports);
							
							
							//update ports in the composition
							//Do not use ports_structure_1 because it is now the intersection...
							ports_in_comp.addAll(new HashSet<String>(this.structure_to_ports.get(fst)));
							//Since the ports_structure_2 was not changed, we can use it...
							ports_in_comp.addAll(ports_structure_2);
							
							
							//update linked_lists by reducing structures composed to the current_composition
							Iterator<String> it_ports2 = this.ports_to_structure.keySet().iterator();
							while(it_ports2.hasNext()) {
								String p = it_ports2.next();
								//if the list associated to the port has 2 structures and the port was not yet merged
								//and one of the fst or snd structures are in that list...
								if(this.ports_to_structure.get(p).size() == 2 && ! this.mixed_ports.contains(p) && 
										(this.ports_to_structure.get(p).contains(fst) || this.ports_to_structure.get(p).contains(snd))) {
									//remove the fst and the snd
									//we may do so, and only one of them is removed, because
									//only one of them is in list (most of the times) and the remove operation
									//only removes an element from the list if this element is on the list.
									//If for some reason the two are in the list, then both need to be removed
									//the latter may happen because, eg, there may exist cycles in the pattern
									this.ports_to_structure.get(p).remove(fst);
									this.ports_to_structure.get(p).remove(snd);
									current_comp = "$COMP$" + (joins_made + 1) ;
									this.ports_to_structure.get(p).add(current_comp);
								}
							}
							//since there was a join, then we give another try to see if more joins may be performed
							has_joins = true;
							joins_made ++;
						}
					}
				} 
			}
		}
		
//		System.out.println("----------------------------\nREDUCED\n----------------------------");
//		System.out.println(res);

		return res.pruneIMCREO(this.mixed_ports);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Composer [ports_to_structure=" + ports_to_structure
				+ ", structure_to_text=" + structure_to_text + ", mixed_ports="
				+ mixed_ports + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mixed_ports == null) ? 0 : mixed_ports.hashCode());
		result = prime
				* result
				+ ((ports_to_structure == null) ? 0 : ports_to_structure
						.hashCode());
		result = prime
				* result
				+ ((structure_to_text == null) ? 0 : structure_to_text
						.hashCode());
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
		if (!(obj instanceof Composer))
			return false;
		Composer other = (Composer) obj;
		if (mixed_ports == null) {
			if (other.mixed_ports != null)
				return false;
		} else if (!mixed_ports.equals(other.mixed_ports))
			return false;
		if (ports_to_structure == null) {
			if (other.ports_to_structure != null)
				return false;
		} else if (!ports_to_structure.equals(other.ports_to_structure))
			return false;
		if (structure_to_text == null) {
			if (other.structure_to_text != null)
				return false;
		} else if (!structure_to_text.equals(other.structure_to_text))
			return false;
		return true;
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
