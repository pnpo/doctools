package pt.uminho.di.cp.model;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class ReconfigurableCoordinationPattern extends CoordinationPattern {
	
	public ReconfigurableCoordinationPattern() {
		super();
	}

	public ReconfigurableCoordinationPattern(String s) {
		super(s);
	} 
	
	public ReconfigurableCoordinationPattern(CoordinationPattern coordinationPattern) {
		//save coordination pattern's id
		String cpId = coordinationPattern.getId();

		//get CommunicationMeans set (pattern)
		Set<CommunicationMean> pattern = coordinationPattern.getPattern();
//		System.out.println("BEFORE\n" + pattern);
		
		// for each CommunicationMean
		for (CommunicationMean cm : pattern) {
			//get type information about CommunicationMean
			//and test if CommunicationMean is a instance of StochasticCommunicationMean
			//if it is, update the Stochastic_map and the router_nodes
			if (cm instanceof StochasticCommunicationMean){
				
				//array of keys for save inode, fnode e id of CommunicationMean (cm)
				ArrayList<String> keys = new ArrayList<String>();
				String inode = cm.getInode();
				keys.add(inode);
				
				String fnode = cm.getFnode();
				keys.add(fnode);
				
				String id = cm.getId();
				keys.add(id);
				
				//get Stochastic_map
				Map<String, Double> map = ((StochasticCommunicationMean) cm).getStochastic_map();
				
				//get set of router_nodes
				Set<String> rn = this.getRouter_nodes();
				
				for (String key : keys){
					//for each key, test if it has a prefix (coordination pattern id) 
					String newKey;
					
					//if it already has a prefix, remove the old one and add the new one
					if(key.contains(".")){
						key = key.replaceAll("^[a-z]+.", "");
					}
					
					//add simply the new one
					newKey = cpId + "." + key;
					
					
					//get the map value for key, before remove that key
					Double value = map.get(key);
					
					//if the key exists in Stochastic_map, update the value
					if (map.containsKey(key)){
						map.remove(key);
						map.put(newKey, value);
					}
					
					//if the key is also a router_node, update the router_nodes with the new key
					if (rn.contains(key)){
						rn.remove(key);
						rn.add(newKey);
					}
				}
			}
			
			
			String inode = cm.getInode();
			//cmInode
		    if(inode.contains(".")){
		    	int index = inode.indexOf(".");
		    	inode = inode.substring(index + 1);
			}
			cm.setInode(cpId + "." + inode);
			
			String fnode = cm.getFnode();
			//cmFnode
		    if(fnode.contains(".")){
		    	int index = fnode.indexOf(".");
		    	fnode = fnode.substring(index + 1);
			}	
		    cm.setFnode(cpId + "." + fnode);
		      
		    String id = cm.getId();
		    //cmId
		    if(id.contains(".")){
		    	int index = id.indexOf(".");
		    	id = id.substring(index + 1);
		    	
			}
		    cm.setId(cpId + "." + id);
		}
		
		//update coordination pattern's id
		this.setId(cpId);
		
		//update coordination pattern's pattern
		this.setPattern(pattern);
		
//		System.out.println("AFTER\n" + pattern.toString());
	}
	
	
	
	/*** PRIMITIVES ***/
	
	//ID
	public ReconfigurableCoordinationPattern id(){
		return this;
	}
	
	
	//CONST
	public ReconfigurableCoordinationPattern constant(CoordinationPattern cp2){
		//if (!(cp2 instanceof ReconfigurableCoordinationPattern)){
		cp2 = new ReconfigurableCoordinationPattern(cp2);
		
		this.setId(cp2.getId());
		this.setPattern(cp2.getPattern());
		this.setRouter_nodes(cp2.getRouter_nodes());
		return this;
	}
	

	//PAR
	public ReconfigurableCoordinationPattern par(CoordinationPattern cp2){
		cp2 = new ReconfigurableCoordinationPattern(cp2);
		
		this.getPattern().addAll(cp2.getPattern());
		return this;
	}

	
	//JOIN
	public CoordinationPattern join(Set<String> nodes, String newNode){
		//ver se newNode é igual a um dos nodes (ver defs join)
		//...
		
		Set<CommunicationMean> pattern = this.getPattern();
//		
		for (CommunicationMean cm : pattern) {
		    
		    String inode = cm.getInode();
			String fnode = cm.getFnode();
			
			if (nodes.contains(inode)){
				cm.setInode(newNode);
			}
			else if(nodes.contains(fnode)){
				cm.setInode(newNode);
			}
		}
		
		this.setPattern(pattern);
		
		return this;
	}
	
	

	/* 
	public CoordinationPattern split(){
		return cp1;
	}
	
	public CoordinationPattern remove(){
		return cp1;
	}
	*/
	
	
	
	
	
}
