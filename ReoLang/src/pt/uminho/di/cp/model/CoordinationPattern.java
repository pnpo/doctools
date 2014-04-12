/**
 * 
 */
package pt.uminho.di.cp.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;


/**
 * @author Nuno Oliveira
 * @date 4 de Abr de 2013
 *
 */
public class CoordinationPattern {
	
	private Set<CommunicationMean> pattern;
	private String id;
	private Set<String> router_nodes;
	
	
	
	/**
	 * 
	 */
	public CoordinationPattern() {
		super();
		this.id = "unnamed";
		this.pattern = new LinkedHashSet<CommunicationMean>();
		this.router_nodes = new LinkedHashSet<String>();
	}



	/**
	 * @param pattern
	 * @param id
	 */
	public CoordinationPattern(Set<CommunicationMean> pattern, String id, Set<String> routers) {
		super();
		this.pattern = pattern;
		this.id = id;
		this.router_nodes = routers;
	}
	
	
	
	/**
	 * @param id
	 */
	public CoordinationPattern(String id) {
		super();
		this.pattern = new LinkedHashSet<CommunicationMean>();
		this.id = id;
		this.router_nodes = new LinkedHashSet<String>();
	}

	
	
	
	public CoordinationPattern(CoordinationPattern p) {
		this.pattern = new LinkedHashSet<CommunicationMean>();
		for(CommunicationMean cm : p.getPattern()){
			if(cm instanceof StochasticCommunicationMean) {
				this.pattern.add(new StochasticCommunicationMean((StochasticCommunicationMean)cm));
			}
			else {
				this.pattern.add(new CommunicationMean(cm));
			}
				
		}
		this.id = p.getId();
		this.router_nodes = new LinkedHashSet<String>();
		for(String r : p.router_nodes){
			this.router_nodes.add(r);
		}
	}
	
	
	


	/**
	 * @return the pattern
	 */
	public Set<CommunicationMean> getPattern() {
		return pattern;
	}



	/**
	 * @param pattern the pattern to set
	 */
	public void setPattern(Set<CommunicationMean> pattern) {
		this.pattern = pattern;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}



	

	
	/**
	 * @return the router_nodes
	 */
	public Set<String> getRouter_nodes() {
		return router_nodes;
	}



	/**
	 * @param router_nodes the router_nodes to set
	 */
	public void setRouter_nodes(Set<String> router_nodes) {
		this.router_nodes = router_nodes;
	}

	
	
	

	////// SPECIFIC METHODS /////


	/**
	 * This method implements the I(p) operations as
	 * described in: 
	 * 
	 * "Reconfiguration mechanisms for service coordination"
	 * 
	 * for the retrieval of input ports of the
	 * coordination patterns.
	 *
	 * @return input ports of the coordination pattern
	 * 
	 */
	public Set<String> getInputPorts() {
		Set<String> ports = new HashSet<String>();
		
		for(CommunicationMean c : this.pattern) {
			if(! c.getInode().equals("BOTTOM") && in(c.getInode())){
				ports.add(c.getInode());
			}
		}
		
		return ports;
	}
	

	
	private boolean in(String inode) {
		
		boolean is_in = true;
		
		Iterator<CommunicationMean> it_comm = this.pattern.iterator();
		while(it_comm.hasNext() && is_in) {
			CommunicationMean c = it_comm.next();
			if(c.getFnode().equals(inode)){
				is_in = false;
			}
		}
		
		return is_in;
	}
	
	
	
	/**
	 * 
	 * This method implements the O(p) operations as
	 * described in: 
	 * 
	 * "Reconfiguration mechanisms for service coordination"
	 * 
	 * for the retrieval of output ports of the
	 * coordination patterns.
	 *
	 * @return output ports of the coordination pattern
	 * 
	 */
	public Set<String> getOutputPorts() {
		Set<String> ports = new HashSet<String>();
		
		for(CommunicationMean c : this.pattern) {
			if(! c.getFnode().equals("BOTTOM") && out(c.getFnode())){
				ports.add(c.getFnode());
			}
		}
		
		return ports;
	}
	

	private boolean out(String fnode) {
		
		boolean is_out = true;
		
		Iterator<CommunicationMean> it_comm = this.pattern.iterator();
		while(it_comm.hasNext() && is_out) {
			CommunicationMean c = it_comm.next();
			if(c.getInode().equals(fnode)){
				is_out = false;
			}
		}
		
		return is_out;
	}
	

	public Set<String> nodes_of(){
		Set<String> nodes = new HashSet<String>();
		
		Set<CommunicationMean> pattern = this.getPattern();
		for (CommunicationMean cm : pattern) {
			nodes.add( cm.getInode() );
			nodes.add( cm.getFnode() );
		}
		return nodes;
	}
	
	
	public Set<String> names_of(){
		Set<String> names = new HashSet<String>();
		
		Set<CommunicationMean> pattern = this.getPattern();
		for (CommunicationMean cm : pattern) {
			names.add( cm.getId() );
		}
		return names;
	}
	
	public void updateRouterNodes(String old_node, String new_node){
		Set<String> rn = this.getRouter_nodes();
		
		//if the old_node is also a router_node, update the router_nodes with the new_node
		if (rn.contains(old_node)){
			rn.remove(old_node);
			rn.add(new_node);
		}
	}
	
	
	
	/********************* PRIMITIVES *********************/
	
	//ID
	public CoordinationPattern id(){
		return this;
	}
	
	
	//CONST
	public CoordinationPattern constant(CoordinationPattern cp){
		this.setId(cp.getId());
		this.setPattern(cp.getPattern());
		this.setRouter_nodes(cp.getRouter_nodes());
		return this;
	}
	

	//PAR
	public CoordinationPattern par(CoordinationPattern cp) throws InvalidReconfigurationOperationException{
		
		//get nodes of cp1
		Set<String> nodes_cp1 = this.nodes_of(); 
		//get nodes of cp2
		Set<String> nodes_cp2 = cp.nodes_of();
		
		//save cp1 nodes on cp1_inter_cp2
		Set<String> n1_inter_n2 = new HashSet<String>(nodes_cp1);
		//keep only cp1_inter_cp2 nodes that are equals to cp2 nodes
		n1_inter_n2.retainAll(nodes_cp2);	
	
		//if there aren't nodes equal to cp2 nodes, the cp1_inter_cp2 set is empty
		//otherwise, if cp1_inter_cp2 set isn't empty, exists repeated nodes
		if( !n1_inter_n2.isEmpty() ) {
			throw new InvalidReconfigurationOperationException("Operation 'par' is not allowed.\nSome nodes are equal: " + n1_inter_n2.toString() );
		}
		else {
			
			//get channel identifiers of cp1
			Set<String> ids_cp1 = this.names_of(); 
			//get channel identifiers of cp2
			Set<String> ids_cp2 = cp.names_of();
			
			Set<String> ids1_inter_ids2 = new HashSet<String>(ids_cp1);
			ids1_inter_ids2.retainAll(ids_cp2);	
		
			if( !ids1_inter_ids2.isEmpty() ) {
				throw new InvalidReconfigurationOperationException("Operation 'par' is not allowed.\nSome channel identifiers are equal.");
			}
			
			//no errors
			else{
				this.getPattern().addAll(cp.getPattern());
				return this;
			}
		}
	}

	
	
	//JOIN
	public CoordinationPattern join(Set<String> nodes){
		
		//Test if nodes exist in coordination pattern
		if ( this.nodes_of().containsAll(nodes) ) {
			Set<CommunicationMean> pattern = this.getPattern();
			
			String newNode = "";
			String sep = "";
			for (String node : nodes)
			{
			    newNode += sep + node;
		        sep = ".";
			}
			Set<CommunicationMean> aux_pattern = new LinkedHashSet<CommunicationMean>();
			
			Iterator<CommunicationMean> it = pattern.iterator();
			
//			System.out.println("B1: " + pattern.toString());
//			System.out.println("B2: " + aux_pattern.toString());
			while(it.hasNext()){
				
				CommunicationMean cm = it.next();
				it.remove();
				
				String inode = cm.getInode();
				String fnode = cm.getFnode();
				
				if( nodes.contains(inode) ){
					cm.setInode(newNode);
					updateRouterNodes(inode, newNode);
				}
				if( nodes.contains(fnode) ){
					cm.setFnode(newNode);
					updateRouterNodes(fnode, newNode);
				}
				
				aux_pattern.add(cm);
				
					
//****************** Used for StochasticCommunicationMean Map update ****************** 			
//				Set<String> cm_nodes = new HashSet<String>();
//				cm_nodes.add(inode);
//				cm_nodes.add(fnode);
//				
//				//update cm_node -> cm_node can be inode or fnode
//				for(String cm_node : cm_nodes){
//					//test if cm_node exists on nodes set
//					if(nodes.contains(cm_node)){
//						if( cm_node.equals(inode) ){
//							cm.setInode(newNode);
//						}
//						if( cm_node.equals(fnode) ){
//							cm.setFnode(newNode);
//						}
//					
//					
//						if (cm instanceof StochasticCommunicationMean){
//							//get Stochastic_map
//							Map<String, Double> map = ((StochasticCommunicationMean) cm).getStochastic_map();
//							//get set of router_nodes
//							Set<String> rn = this.getRouter_nodes();
//							
//							//get the map value for cm_node, before remove that cm_node
//							Double value = map.get(cm_node);
//							
//							//if the cm_node exists in Stochastic_map, update the value
//							if (map.containsKey(cm_node)){
//								map.remove(cm_node);
//								map.put(newNode, value);
//							}
//							
//							//if the cm_node is also a router_node, update the router_nodes with the new cm_node
//							if (rn.contains(cm_node)){
//								rn.remove(cm_node);
//								rn.add(newNode);
//							}
//						}
//					}
//				}
//******************************************************		
			}

//			System.out.println("A1: " + pattern.toString());
//			System.out.println("A2: " + aux_pattern.toString());
			this.setPattern(aux_pattern);
		}
		return this;
	}
	

	
	//SPLIT 
	public CoordinationPattern split(String node){
		
		// "a.b" -> ["a", "b"]
		String[] split_nodes = node.split("\\.");
		
		//get all channels
		Set<CommunicationMean> pattern = this.getPattern();
		
		Set<CommunicationMean> aux_pattern = new LinkedHashSet<CommunicationMean>();

		int i = 0;
		Iterator<CommunicationMean> it = pattern.iterator();
		
//		System.out.println("B1: " + pattern.toString());
//		System.out.println("B2: " + aux_pattern.toString());
		
//		if (split_nodes.length == channels_where_input_node_appears.length){
		while(it.hasNext()){
			
			CommunicationMean cm = it.next();
		    it.remove();
		    
			if (cm.getInode().equals(node)){
				cm.setInode( split_nodes[i] );
				updateRouterNodes(node, split_nodes[i]);
				i++;
			}
			if (cm.getFnode().equals(node)){
				cm.setFnode( split_nodes[i] );
				updateRouterNodes(node, split_nodes[i]);
				i++;
			}
			aux_pattern.add(cm);
			//System.out.print(cm + " ");
		}
		
		this.setPattern(aux_pattern);

//		System.out.println("A1: " + pattern.toString());
//		System.out.println("A2: " + aux_pattern.toString());
		return this;
	}
	
	
	
	//REMOVE
	public CoordinationPattern remove(String ch_id) {
		if ( this.names_of().contains(ch_id) ){
			Set<CommunicationMean> pattern = this.getPattern();
			
			CommunicationMean ch = new CommunicationMean();
			
			for (CommunicationMean cm : pattern) {
				if (cm.getId().equals(ch_id)){
					ch = cm;
					break;
				}
			}
			
//			System.out.println(ch);
//			System.out.println(this.getPattern().contains(ch));
			boolean removed = this.getPattern().remove(ch);
//			System.out.println(pattern);
//			System.out.println(removed);

			if (removed){
				Set<String> cm_nodes = new HashSet<String>();
				cm_nodes.add(ch.getInode()); 	//add inode
				cm_nodes.add(ch.getFnode()); 	//add fnode
				
				//cm_nodes are the nodes of the removed channel
				for(String cm_node : cm_nodes){
	
					if(cm_node.contains(".")){
						//after remove the channel, test if any of the other channels have equal nodes, and change them ids
						for (CommunicationMean cm : pattern) {
							String new_node = cm_node.substring(0, cm_node.lastIndexOf(".")); 
							if (cm.getInode().equals(cm_node)) {
								cm.setInode(new_node);
								updateRouterNodes(cm_node, new_node);
							}
							if (cm.getFnode().equals(cm_node)) {
								cm.setFnode( new_node );
								updateRouterNodes(cm_node, new_node);
							}
						}
					}
					
				}
			}
		}
		
		return this;
		//throw new InvalidReconfigurationOperationException("Operation 'remove' is not allowed.\nThe channel identifier doesn't exist in this coordination pattern.");	
	}
	
	/********************************************************************/
	
	
	
	
	
	/**
	 * This method replaces old names of ports by new names for these ports.
	 * It takes into account the id of the communication mean, and also
	 * the hierarchy of nodes that may exist.
	 * 
	 * @param old_name the name of the port to be replaced
	 * @param cm_id the identifier of the communication mean
	 * @param new_name the name of the port to replace the old_name
	 */
	public void replacePortNames(String old_name, String cm_id, String new_name) {
		for(CommunicationMean cm : this.pattern) {
			if(cm.getId().equals(cm_id) || cm.getId().startsWith(cm_id + "::")) {
				if(cm.getInode().equals(old_name) || 
						(cm.getInode().startsWith(cm_id + "::") && cm.getInode().endsWith("::" + old_name)) ||
							cm.getInode().equals(cm_id + "." + old_name)){
					//Change the node in the routers set if the old name was a router...
					if(this.router_nodes.contains(cm.getInode())){
						this.router_nodes.remove(cm.getInode());
						this.router_nodes.add(new_name);
					}
					//change the new name
					cm.setInode(new_name);
					//if it is a stochastic comm mean, have also to change the arrival requests labels on ports
					replaceStochasticMap(old_name, new_name, cm);
				}
				else{
					if(cm.getFnode().equals(old_name) || 
							(cm.getFnode().startsWith(cm_id + "::") && cm.getFnode().endsWith("::" + old_name)) ||
								cm.getFnode().equals(cm_id + "." + old_name)){
						//Change the node in the routers set if the old name was a router...
						if(this.router_nodes.contains(cm.getFnode())){
							this.router_nodes.remove(cm.getFnode());
							this.router_nodes.add(new_name);
						}
						cm.setFnode(new_name);
						//if it is a stochastic comm mean, have also to change the arrival requests labels on ports
						replaceStochasticMap(old_name, new_name, cm);
					}
				}
			}
			
		}
	}



	/**
	 * This method replaces old names of ports by new names for these ports,
	 * in the stochastic map, so that it is always known the arrival request
	 * to the ports (even they change the name on the operations of join and
	 * so on).
	 * 
	 * @param old_name - the old name of the port
	 * @param new_name - the new name of the port
	 * @param cm - the communication mean to perform the change upon
	 */
	private void replaceStochasticMap(String old_name, String new_name,
			CommunicationMean cm) {
		if(cm instanceof StochasticCommunicationMean){
			if(((StochasticCommunicationMean) cm).getStochastic_map().containsKey(old_name)){
				Double value = ((StochasticCommunicationMean) cm).getStochastic_map().get(old_name);
				((StochasticCommunicationMean) cm).getStochastic_map().remove(old_name);
				((StochasticCommunicationMean) cm).getStochastic_map().put(new_name, value);
			}
			
			//Update the stochastic value in the other part of channels with ports in the same direction 
			if(cm.getInode().equals("NULL") || cm.getFnode().equals("NULL")){
				for(CommunicationMean cm_aux : this.pattern){
					if(cm_aux.getId().equals(cm.getId())){
						if(((StochasticCommunicationMean) cm_aux).getStochastic_map().containsKey(old_name)){
							Double value = ((StochasticCommunicationMean) cm_aux).getStochastic_map().get(old_name);
							((StochasticCommunicationMean) cm_aux).getStochastic_map().remove(old_name);
							((StochasticCommunicationMean) cm_aux).getStochastic_map().put(new_name, value);
						}
					}
				}
			}
			
		}
	}
	
	
	
	


	
	/**
	 * Creates a scrpit that is basically a list of channels 
	 * with all their ports and stochastic values defined.
	 * 
	 * This method is based on the CP model, by counting 
	 * the cardinality of outgoing and incoming edges to 
	 * each port. Based on this count it automatically
	 * knows how may mergers/replicators it must create.
	 * 
	 * For instance, if the a node has 2 incoming edges,
	 * then a merger must be created. If it has 3, then
	 * 2 mergers must be created... The same for outgoing
	 * edges and replicators.
	 * 
	 * For the records, the stochastic values for mergers 
	 * and replicators are inhere hard-coded. 
	 * 
	 * TODO add support for channels with two input /output ports 
	 * like drains and spouts
	 * 
	 * @return a script as a list of channels to compose
	 * 
	 */
	public String intoIMCScript() {
		String res = "";
		
		HashMap<String, Integer> outgoing = new HashMap<String, Integer>();
		HashMap<String, Integer> incoming = new HashMap<String, Integer>();
		this.getCardinalityOfPorts(outgoing, incoming);
		
		HashMap<String, LinkedList<String>> merger_ports = new HashMap<String, LinkedList<String>>();
		HashMap<String, LinkedList<String>> replicator_ports = new HashMap<String, LinkedList<String>>();
		this.createMergersReplicators(merger_ports, incoming);
		this.createMergersReplicators(replicator_ports, outgoing);
		
		HashMap<String, String> same_dir_ports_channels = new HashMap<String, String>();
		boolean is_same_dir_port_channel;
		
		for(CommunicationMean c : this.pattern) {
			
			StochasticCommunicationMean scm = (StochasticCommunicationMean) c;
			is_same_dir_port_channel = false;
			
			if(c.getInode().equals("NULL") || scm.getFnode().equals("NULL")){
				String id = scm.getId(); //the two CM will have the same ID so it will be the key
				String port = scm.getInode().equals("NULL") ? scm.getFnode() : scm.getInode(); //the value
				if(!same_dir_ports_channels.containsKey(id)){
					same_dir_ports_channels.put(id, port);
					
					is_same_dir_port_channel = true;
				}
				else {
					StochasticCommunicationMean scm_fake = new StochasticCommunicationMean(scm);
					if(scm.getInode().equals("NULL")) {
						scm_fake.setInode(same_dir_ports_channels.get(id));
					}
					else {
						scm_fake.setFnode(same_dir_ports_channels.get(id));
					}
					scm = scm_fake;
				}
			}
			
			if(! is_same_dir_port_channel) {
				String elem = scm.getType() + " " + scm.getId() + " ";
				
				if(merger_ports.containsKey(scm.getInode())){
					elem += merger_ports.get(scm.getInode()).removeFirst();
				}
				else {
					if (replicator_ports.containsKey(scm.getInode())) {
						elem += replicator_ports.get(scm.getInode()).removeLast();
					}
					else {
						elem += scm.getInode(); 
					}
				}
				
				elem += " ";
				
				if(merger_ports.containsKey(scm.getFnode())) {
					elem += merger_ports.get(scm.getFnode()).removeLast();
				}
				else {
					if(replicator_ports.containsKey(scm.getFnode())) {
						elem += replicator_ports.get(scm.getFnode()).removeFirst();
					}
					else {
						elem += scm.getFnode();
					}
				}
				
				elem += " ";
				
				
				//input port stoch value
				elem += scm.getStochastic_map().containsKey(scm.getInode()) ? 
							scm.getStochastic_map().get(scm.getInode()) + " ": "";
				
				//output port stoch value
				elem += scm.getStochastic_map().containsKey(scm.getFnode()) ? 
							scm.getStochastic_map().get(scm.getFnode()) + " ": "";
				
				//NOTICE THAT LINKED HASH MAP INSERTS IN THE HEAD... 
				//SO STOCH VALUES WILL BE REFERRED AS THE ORDER WE DEFINE
				//FOR OUR IMC SCRIPT
				for(String sv_lbl : scm.getStochastic_map().keySet()){
					if(! sv_lbl.equals(c.getInode()) && ! sv_lbl.equals(scm.getFnode())){
						elem += ((StochasticCommunicationMean) scm).getStochastic_map().get(sv_lbl) + " ";
					}
				}

				res += elem + "\n";
				
			}
		} 
			
		
		//Add mergers
		int count = 1;
		for(String p : merger_ports.keySet()) {
			//int number_of_mergers = incoming.get(p) - 1;
			//int number_of_ports = incoming.get(p) + 1;
			int number_of_joins = incoming.get(p) - 2;
			String elem = "";
			//for( int i = 0 ; i < number_of_mergers ; i++ ){
				int number_of_ports = incoming.get(p) ;
				for(int j = 1 ; j <= number_of_joins + 1 ; j ++ ) {
					if(j == 1) {
						if(number_of_joins == 0) {
							elem += "merger  mer"+count+" ";
							elem += p + "|" + (number_of_ports--) + " ";
							elem += p + "|" + (number_of_ports--) + " ";
							elem += p + "|" + (number_of_ports) + " 0.001 0.001 0.001 0.001 0.002\n" ;
						}
						else {
							elem += "merger mer"+count+" ";
							elem += p + "|" + (number_of_ports--) + " ";
							elem += p + "|" + (number_of_ports--) + " ";
							elem += p + "|m" + j + " 0.001 0.001 0.001 0.001 0.002\n" ;
						}
					}
					else {
						if(j==number_of_joins + 1) {
							elem += "merger mer"+count+" ";
							elem += p + "|m" + (j - 1) + " ";
							elem += p + "|" + (number_of_ports--) + " ";
							elem += p + "|" + (number_of_ports--) + " 0.001 0.001 0.001 0.001 0.002\n" ;
						}
						else {
							elem += "merger mer"+count+" ";
							elem += p + "|m" + (j - 1) + " ";
							elem += p + "|" + (number_of_ports--) + " ";
							elem += p + "|m" + j + " 0.001 0.001 0.001 0.001 0.002\n" ;
						}
					}
				}
				res = elem + res;
		}
		
		//CREATE REPLICATERS/EX-ROUTERS
		count = 1;
		for(String p : replicator_ports.keySet()) {
			int number_of_joins = outgoing.get(p) - 2;
			String type = this.router_nodes.contains(p) ? "exrouter" : "replicator" ;
			String id = this.router_nodes.contains(p) ? "xor" : "rep" ;
			String elem = "";
			//for( int i = 0 ; i < number_of_mergers ; i++ ){
				int number_of_ports = 0 ;
				for(int j = 1 ; j <= number_of_joins + 1 ; j ++ ) {
					if(j == 1) {
						if(number_of_joins == 0) {
							elem += type + " "+ id + count+ " ";
							elem += p + "|" + (number_of_ports++) + " ";
							elem += p + "|" + (number_of_ports++) + " ";
							elem += p + "|" + number_of_ports + " 0.001 0.001 0.001 0.001" + (type.equals("exrouter") ? " 0.002" : "") + "\n" ;
						}
						else {
							elem += type + " "+ id +count+" ";
							elem += p + "|" + (number_of_ports++) + " ";
							elem += p + "|" + (number_of_ports++) + " ";
							elem += p + "|m" + j + " 0.001 0.001 0.001 0.001" + (type.equals("exrouter") ? " 0.002" : "") + "\n" ;
							
						}
						
					}
					else {
						if(j==number_of_joins + 1 ) {
							elem += type + " "+ id + count+" ";
							elem += p + "|m" + (j - 1) + " ";
							elem += p + "|" + (number_of_ports++) + " ";
							elem += p + "|" + (number_of_ports++) + " 0.001 0.001 0.001 0.001" + (type.equals("exrouter") ? " 0.002" : "") + "\n" ;
						}
						else {
							elem += type + " "+ id + count+" ";
							elem += p + "|m" + (j - 1) + " ";
							elem += p + "|" + (number_of_ports++) + " ";
							elem += p + "|m" + j + " 0.001 0.001 0.001 0.001"+ (type.equals("exrouter") ? " 0.002" : "") + "\n" ;
						}
					}
				}
				res = elem + res;
		}
		
		
		
		System.out.println(res);
		
		
		
		return res;
	} 
	
	
	
	
	private void swapPorts(StochasticCommunicationMean scm_fake) {
		String aux;
		aux = scm_fake.getInode();
		scm_fake.setInode(scm_fake.getFnode());
		scm_fake.setFnode(aux);
	}



	/**
	 * Checks whether all the communication means within the pattern
	 * are instances of stochastic communication means.
	 * 
	 * @return true if all instances od communication means are stochastic;
	 * false otherwise.
	 * 
	 */
	public boolean isStochasticPattern() {
		
		boolean isstochastic = true;
		
		Iterator<CommunicationMean> iter_cm = this.pattern.iterator();		
		while(iter_cm.hasNext() && isstochastic) {
			if(! (iter_cm.next() instanceof StochasticCommunicationMean)){
				isstochastic = false;
			}
		}
		
		return isstochastic;
	}



	private void createMergersReplicators(HashMap<String, LinkedList<String>> ports, HashMap<String, Integer> port_map) {
		
		for(String p : port_map.keySet()) {
			if(port_map.get(p) > 1) {
				LinkedList<String> element = createMergerReplicator(port_map.get(p), p);
				ports.put(p, element);
			}
		}
	}



	private LinkedList<String> createMergerReplicator(Integer n, String p) {
		LinkedList<String> ports = new LinkedList<String>();
		
		for(int i = 0; i < n+1 ; i++) {
			ports.add(p + "|" + i);
		}
		
//		for(int i = 0; i < n-2; i++) {
//			ports.add(p + "|m" + (i+1));
//		}
		
		
		return ports;
	}



	private void getCardinalityOfPorts(HashMap<String, Integer> outgoing, HashMap<String, Integer> incoming) {
		
		for(CommunicationMean c : this.pattern) {
			if(! c.getInode().equals("NULL")){
				if(! outgoing.containsKey(c.getInode()) ){
					outgoing.put(c.getInode(), 1);
				}
				else {
					outgoing.put(c.getInode(), outgoing.get(c.getInode()) + 1 );
				}
			}
			
			if(! c.getFnode().equals("NULL")){
				if(! incoming.containsKey(c.getFnode())) { 
					incoming.put(c.getFnode(), 1);
				}
				else {
					incoming.put(c.getFnode(), incoming.get(c.getFnode()) +1 );
				}
			}
		}
	}
	
	
	
	



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		String res = this.id + "\n{\n";
		int i = 1;
		for(CommunicationMean c : this.pattern) {
			res += c.toString() + "\t";
			res += (i%2==0) ? "\n" : "";
			i++;
		}
		
		return res + "\n}\n\n";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
		result = prime * result
				+ ((router_nodes == null) ? 0 : router_nodes.hashCode());
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
		if (!(obj instanceof CoordinationPattern))
			return false;
		CoordinationPattern other = (CoordinationPattern) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pattern == null) {
			if (other.pattern != null)
				return false;
		} else if (!pattern.equals(other.pattern))
			return false;
		if (router_nodes == null) {
			if (other.router_nodes != null)
				return false;
		} else if (!router_nodes.equals(other.router_nodes))
			return false;
		return true;
	}



	
	
	// CLASS METHODS
	
	
	/**
	 * 
	 * @param pattern
	 * @param stoch_values
	 * @param instance
	 * @return
	 * 
	 */
	public static CoordinationPattern applyStochasticMap(
			CoordinationPattern pattern, 
			Map<String, Double> stoch_values,
			String instance){
		
		CoordinationPattern res = new CoordinationPattern();
		
		res.setRouter_nodes(new LinkedHashSet<String>(pattern.getRouter_nodes()));
		res.setId(instance);
		
		LinkedHashSet<CommunicationMean> p = new LinkedHashSet<CommunicationMean>();
		
		for(CommunicationMean cm : pattern.getPattern()){
			String in = cm.getInode();
			String out = cm.getFnode();
			String type = cm.getType();
			String id = cm.getId();
			LinkedHashMap<String, Double> values = new  LinkedHashMap<String, Double>();
			//if the in port of the channel coincides with a in port of the pattern 
			if(stoch_values.containsKey(in)){
				//we add the value to the stochastic map of the stoc. comm. mean
				values.put(in, stoch_values.get(in));
			}
			else {
				if(! in.equals("NULL")){
					//if the in node is internal... we put a symbolic value 1.0
					//but this value will never be used due to composition
					values.put(in, 1.0);
				}
			}
			
			//now we do the same for the out node
			if(stoch_values.containsKey(out)){
				values.put(out, stoch_values.get(out));
			}
			else {
				if(! out.equals("NULL")){
					values.put(out, 1.0);
				}
			}
			
			for(String lbl : stoch_values.keySet()){
				if(lbl.contains("#")){
					String _id = lbl.substring(0,lbl.indexOf('#'));
					String _lbl = lbl.substring(lbl.indexOf('#')+1);
					if(_id.equals(id)){
						values.put(_lbl, stoch_values.get(lbl));
					}
				}
			}
			
			StochasticCommunicationMean scm = new StochasticCommunicationMean(in, id, type, out,values);
			res.pattern.add(scm);
		}
		
		
		return res;
		
	} 
	
	

	
	
}
