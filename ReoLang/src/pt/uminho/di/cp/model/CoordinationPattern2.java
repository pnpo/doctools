package pt.uminho.di.cp.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.omg.CORBA.Environment;

import pt.uminho.di.reolang.parsing.util.Pair;


/**
 * @author Nuno Oliveira
 * @date 16 Dec, 2013
 *
 */

public class CoordinationPattern2 {

	private Set<CommunicationMean2> pattern;
	private String id;
	//a mapping from node to pairs of doubles (read, write)
	private Map<Node, Pair<Double,Double>> delays;
	//xor nodes
	private LinkedHashSet<Node> xors;
	
	
	
	
	

	public CoordinationPattern2() {
		super();
		this.pattern = new LinkedHashSet<CommunicationMean2>();
		this.id = "unnamed";
		this.delays = new LinkedHashMap<Node, Pair<Double,Double>>();
		this.xors = new LinkedHashSet<Node>();
	}
	
	
	
	/**
	 * @param pattern
	 * @param id
	 */
	public CoordinationPattern2(Set<CommunicationMean2> pattern, String id, 
			LinkedHashMap<Node, Pair<Double, Double>>delays,
			LinkedHashSet<Node> xors) {
		super();
		this.pattern = new LinkedHashSet<CommunicationMean2>(pattern);
		this.id = id;
		this.delays = delays;
		this.xors = xors;
	}
	

	/**
	 * @param cp
	 * @param id
	 */
	public CoordinationPattern2(CoordinationPattern2 cp) {
		super();
		this.pattern = new LinkedHashSet<CommunicationMean2>();
		for(CommunicationMean2 cm : cp.getPattern()) {
			this.pattern.add(new CommunicationMean2(cm));
		}
		//this.pattern = new LinkedHashSet<CommunicationMean2>(cp.getPattern());
		this.id = cp.getId();
		this.delays = new LinkedHashMap<Node, Pair<Double,Double>>(cp.getDelays());
		this.xors = new LinkedHashSet<Node>(cp.getXors());
	}
	
	
	
	
	
	
	/**
	 * @return the pattern
	 */
	public Set<CommunicationMean2> getPattern() {
		return pattern;
	}
	/**
	 * @param pattern the pattern to set
	 */
	public void setPattern(Set<CommunicationMean2> pattern) {
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
	 * @return the delays
	 */
	public Map<Node, Pair<Double, Double>> getDelays() {
		return delays;
	}



	/**
	 * @param delays the delays to set
	 */
	public void setDelays(Map<Node, Pair<Double, Double>> delays) {
		this.delays = delays;
	}
	


	
	/**
	 * @return the xors
	 */
	public LinkedHashSet<Node> getXors() {
		return xors;
	}



	/**
	 * @param xors the xors to set
	 */
	public void setXors(LinkedHashSet<Node> xors) {
		this.xors = xors;
	}
	
	
	
	//// SPECIFIC METHODS //////
	/*
	public void updateXors() {
		LinkedHashSet<Node> xors = new LinkedHashSet<Node>();
		Set<Node> mixed = this.getMixed();
		for (Node n : mixed){
			int in = 0;
			int out = 0;
			for (CommunicationMean2 cm : this.getPattern()){
				if (cm.getInodes().contains(n)){
					in++;
				}
				if (cm.getOnodes().contains(n)){
					out++;
				}
			}

			if (in >= 1 && out >= 2){
				xors.add(n);
			}
		}
		
		this.xors = xors;
	}
	*/

	public Set<Node> getPorts() {
		Set<Node> ports = new LinkedHashSet<Node>(this.getIn());
		ports.addAll( new LinkedHashSet<Node>(this.getOut()) );
		
		return ports;
	}
	

	/**
	 * This method implements the I(p) operations as
	 * described in: 
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * for the retrieval of input ports of the
	 * coordination patterns.
	 *
	 * @return input nodes of the coordination pattern
	 * 
	 */
	public Set<Node> getIn() {
		Set<Node> ports = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 c : this.pattern) {
			for(Node n : c.getInodes()){
				if(isIn(n)){
					ports.add(new Node(n));
				}
			}
			
		}
		
		return ports;
	}
	
	
	public Node getIn(int i) {
		ArrayList<Node> ports = new ArrayList<Node>(this.getIn());
				
		Node port = new Node();
		if (ports.size() > i){
			port = ports.get(i);
		}
		return port;
	}
	
	
	
	
	private boolean isIn(Node n) {
		
		boolean is_in = true;
		
		Iterator<CommunicationMean2> it_comm = this.pattern.iterator();
		while(it_comm.hasNext() && is_in) {
			CommunicationMean2 cm = it_comm.next();
			if(cm.getOnodes().contains(n)){
				is_in = false;
			}
		}
		
		return is_in;
	}
	
	
	
	
	/**
	 * This method implements the O(p) operations as
	 * described in: 
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * for the retrieval of output ports of the
	 * coordination patterns.
	 *
	 * @return output nodes of the coordination pattern
	 * 
	 */
	public Set<Node> getOut() {
		Set<Node> ports = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 c : this.pattern) {
			for(Node n : c.getOnodes()){
				if(isOut(n)){
					ports.add(new Node(n));
				}
			}
			
		}
		
		return ports;
	}
	
	
	public Node getOut(int i) {
		ArrayList<Node> ports = new ArrayList<Node>(this.getOut());
		
		Node port = new Node();
		if (ports.size() > i){
			port = ports.get(i);
		}
		return port;
	}
	
	
	private boolean isOut(Node n) {
		
		boolean is_out = true;
		
		Iterator<CommunicationMean2> it_comm = this.pattern.iterator();
		while(it_comm.hasNext() && is_out) {
			CommunicationMean2 cm = it_comm.next();
			if(cm.getInodes().contains(n)){
				is_out = false;
			}
		}
		
		return is_out;
	}
	
	
	
	/**
	 * This method implements the nodes_of(p) as described in:
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * It retrieves all the nodes of the pattern.
	 *  
	 * @return A set with all nodes within the pattern
	 */
	public Set<Node> getNodes() {
		Set<Node> nodes = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 cm : this.getPattern()) {
			nodes.addAll(new LinkedHashSet<Node>(cm.getEnds()));
		}
		
		return nodes;
	}
	
	
	/**
	 * This method implements the mixed_of(p) as described in:
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * It retrieves all the nodes of the pattern with more than one end
	 * 
	 * @return A set with all mixed nodes 
	 */
	public Set<Node> getMixed() {
		Set<Node> mixeds = new LinkedHashSet<Node>();
		Set<Node> nodes = this.getNodes();
		for(Node n : nodes){
			if(n.size() > 1) {
				mixeds.add(new Node(n));
			}
		}
		return mixeds;
	}
	
	
	/**
	 * This method implements the mixed_of(p) as described in:
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * with a slight difference: it does not export the nodes that are XOR.
	 * 
	 * @return A set with all mixed nodes 
	 */
	public Set<Node> getMixedNonXOR(){
		Set<Node> res =  this.getMixed();
		res.removeAll(this.xors);
		
		return res;
	}
	
	
	
	
	/**
	 * This method implements the names_of(p) as described in:
	 * 
	 * "Reasoning about reconfigurations: the behavioural and structural perspectives"
	 * 
	 * It retrieves all the names of the communication means within the pattern
	 * 
	 * @return A set with all the communication means identifiers
	 */
	public Set<String> getNames() {
		Set<String> names =  new LinkedHashSet<String>();
		for(CommunicationMean2 cm : this.getPattern()) {
			names.add(cm.getId());
		}
		
		return names;
	}
	
	
	
	public CommunicationMean2 getChannel(String id){
		CommunicationMean2 channel = new CommunicationMean2();
		
		for(CommunicationMean2 cm : this.getPattern()) {
			if(cm.getId().equals(id)) {
				channel = cm;
			}
		}
		
		return channel;
	}
	
	
	public Set<Node> getEndsOf(String id) {
		Set<Node> ends = new LinkedHashSet<Node>();
		
		for(CommunicationMean2 cm : this.getPattern()) {
			if(cm.getId().equals(id)) {
				ends = new LinkedHashSet<Node>(cm.getEnds());
			}
		}
		
		return ends;
	}
	
	
	
	
	////////////////////////////
	
	
	
	
	
	
	/**
	 * This method looks into the IO nodes of all Comm. Means 
	 * and replaces them by a Node n when they share ends.
	 * 
	 * An assertion here is that n is bigger than all the
	 * IO nodes of the comm. means 
	 * 
	 * @param n the node to replace all nodes that contain ends on n
	 */
	public void replaceNodesBy(Node n){
		
		for(CommunicationMean2 cm : this.getPattern()){
			LinkedHashSet<Node> to_remove = new LinkedHashSet<Node>();
			for(Node i : cm.getInodes()){
				LinkedHashSet<String> intersect_inodes = new LinkedHashSet<String>(i.getEnds());
				intersect_inodes.retainAll(n.getEnds());
				if(! intersect_inodes.isEmpty()) {
					to_remove.add(i);
				}
			}
			
			cm.getInodes().removeAll(to_remove);
			if(! to_remove.isEmpty()){
				cm.getInodes().add(n);
			}
			to_remove.clear();
			
			for(Node o : cm.getOnodes()){
				LinkedHashSet<String> intersect_onodes = new LinkedHashSet<String>(o.getEnds());
				intersect_onodes.retainAll(n.getEnds());
				if(! intersect_onodes.isEmpty()) {
					to_remove.add(o);
				}
			}
			
			cm.getOnodes().removeAll(to_remove);
			if(! to_remove.isEmpty()){
				cm.getOnodes().add(n);
			}
		}
	}
	
	
	
	
	
	/**
	 * Defines a string that is a script of channels to compose into IMCREO
	 * @return a formatted string as a script accepted by the IMCREOScript parser. 
	 */
	public String intoIMCScript(){
		
		CoordinationPattern2 decomposed = this.decompose();
		
		StringBuffer sb = new StringBuffer();
		//---- CHANNELS
		for(CommunicationMean2 cm : decomposed.getPattern()) {
			sb.append(cm.getType()).append(" ").append(cm.getId()).append(" ");
			for(Node in : cm.getInodes()) {
				sb.append((new Node(in)).takeEnd()).append(" ");
			}
			for(Node out : cm.getOnodes()) {
				sb.append((new Node(out)).takeEnd()).append(" ");
			}
			//append stochastic information from channels
			for(String sd : cm.getDelays().keySet()){
				sb.append(cm.getDelays().get(sd)).append(" ");
			}
			sb.append("\n");
		}
		
		
		//---- MER_REP
		for(Node n : this.getMixedNonXOR()) {
			Pair<String, String> ports = createMixedNodesPorts(n, decomposed);
			sb.append("mer_rep ").append(ports.fst()).append(ports.snd()).append(" ");
			// append stochastic information
			if(this.delays.containsKey(n)){
				 sb.append(this.delays.get(n).fst()).append(" ");
				 sb.append(this.delays.get(n).snd()).append(" ");
			}
			
			sb.append("\n");
		}
		
		//---- MER_XOR
		for(Node n : this.getXors()) {
			Pair<String, String> ports = createMixedNodesPorts(n, decomposed);
			sb.append("mer_xor ").append(ports.fst()).append(ports.snd()).append(" ");
			// append stochastic information
			if(this.delays.containsKey(n)){
				 sb.append(this.delays.get(n).fst()).append(" ");
				 sb.append(this.delays.get(n).snd()).append(" ");
			}
			
			sb.append("\n");
		}
		
		
		
		//---- ENVIRONMENT
		for(Node n : this.getIn()) {
			sb.append("env ").append((new Node(n).takeEnd())).append(" ");
			//append stochastic information
			if(this.delays.containsKey(n)){
				 sb.append(this.delays.get(n).fst()).append(" ");
			}

			sb.append("\n");
		}
		
		for(Node n : this.getOut()) {
			sb.append("env ").append((new Node(n).takeEnd())).append(" ");
			//append stochastic information
			if(this.delays.containsKey(n)){
				 sb.append(this.delays.get(n).fst()).append(" ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	

	
	
	
	/**
	 * Transforms a in-memory coopla pattern into coopla string 
	 * @return
	 */
	public String toCooPLa() {
		StringBuilder sb = new StringBuilder();

		sb.append("\n\npattern " + this.getId() 
				+ "(" + nodesToString( this.getIn() ).replace('.', '_')  
				+ ":" + nodesToString( this.getOut() ).replace('.', '_')
				+ "){\n");

		//key: type
		//value: all channels of type key
		HashMap<String, Set<String>> type_channels = new HashMap<String, Set<String>>();
		for (CommunicationMean2 cm : this.getPattern()){

			Set<String> channels = type_channels.get(cm.getType()) != null ? 
					type_channels.get(cm.getType()) : new HashSet<String>();
					channels.add(cm.getId());
					type_channels.put(cm.getType(), channels);
		}

		sb.append("\tuse:\n");
		for(CommunicationMean2 cm : this.getPattern()){
			String coopla_type = cm.getType();

			if(coopla_type.contains("fifo")) {
				
				if (coopla_type.endsWith("1e")) { //empty
					coopla_type = "(E)" + coopla_type.substring(0,coopla_type.length()-2) + "~1";
				}
				else if (coopla_type.endsWith("1f")) {//full
					coopla_type = "(F)" + coopla_type.substring(0, coopla_type.length()-2) + "~1";
				}
			}

			Set<String> ins = new LinkedHashSet<String>();
			Set<String> outs = new LinkedHashSet<String>();
			//Set<String> used = new LinkedHashSet<String>();
			for(CommunicationMean2 cm2 : this.getPattern()){
				for(Node n : cm2.getInodes()){
					for(String e : n.getEnds()) {
						if(e.startsWith(cm.getId()) && cm2.getId().equals(cm.getId())){
							ins.add(e.substring(cm.getId().length()+1));  
						}
					}
				}
				for(Node n : cm2.getOnodes()){
					for(String e : n.getEnds()) {
						if(e.startsWith(cm.getId()) && cm2.getId().equals(cm.getId())){ 
							outs.add(e.substring(cm.getId().length()+1));  
						}
					}
				}
			}
			coopla_type += "( " + setToString(ins, ", ") + " : " + setToString(outs, ", ") + " )";
			sb.append("\t\t" + coopla_type + "\tas ").append(cm.getId()).append(";\n");

		}
		sb.append("\tin:\n");


		String joined_nodes = "";
		for (Node node : this.getNodes()){
			String node_name = node.sepEndsByDot();
			if (node_name.contains(".")){
				joined_nodes += "\t\tjoin[" + setToString(node.getEnds(), ", ").replace('_', '.') + "] as " +  setToString(node.getEnds(), "_") + ";\n";
			}
			else{
				sb.append("\t\t" + node_name + " = " + node_name.replace('_', '.') + ";\n");
			}
		}

		sb.append(joined_nodes);
		sb.append("}");


	     return sb.toString();
	}
	
	
	
	public String toCooPLaStoch(String instance_name) {
		StringBuilder sb = new StringBuilder();
		
		if(instance_name!=null && ! instance_name.isEmpty()){
			
			if(this.delays.size()>0) {
				sb.append("\n\nstochastic ").append(this.getId()).append(" {\n");
				for(Node port : this.getIn()){
					if(this.getDelays().containsKey(port)){
						sb.append("\t").append(setToString(port.getEnds(), "_")).append(" @ ").append(this.getDelays().get(port).fst()).append(";\n");
					}
				}
				for(Node port : this.getOut()){
					if(this.getDelays().containsKey(port)){
						sb.append("\t").append(setToString(port.getEnds(), "_")).append(" @ ").append(this.getDelays().get(port).fst()).append(";\n");
					}
				}
				for(CommunicationMean2 cm : this.getPattern()){
					String id = cm.getId();
					for(String label : cm.getDelays().keySet()){
						sb.append("\t").append(id).append("#").append(label).append(" @ ").append(cm.getDelays().get(label)).append(";\n");
					}
				}
				for(Node node : this.getDelays().keySet()){
					Double value_write = this.getDelays().get(node).fst();
					Double value_read = this.getDelays().get(node).snd();
					if(value_read != null && value_read != 0.0 ){
						sb.append("\t").append(setToString(node.getEnds(), "_")).append(" @ (").append(value_write).append(", ").append(value_read).append(");\n");
					}
				}
			}
			sb.append("} ").append(instance_name).append("\n");
		}
		
		return sb.toString();
				
	}
	
	
	



	private static String nodesToString(Set<Node> nodes){
		String sep = "";
		String values = "";
		for (pt.uminho.di.cp.model.Node node : nodes){
			values += sep;
			values += node.sepEndsByDot();
			
		    sep = ",";
		}
		return values;
	}
	
	private static String setToString(Set<String> args, String sep) {
		String _sep = "";
		String values = "";
		for (String a : args){
			values += _sep;
			values += a;
			
		        _sep = sep;
		}
		return values;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * @param n - a mixed node
	 * @param decomposed - a CP decomposed. This is, a CP with a single end per node
	 * @return A pair of formated strings (in, out) referring to the ends of the given node
	 * that are input or output ports of the nodes to be created.
	 */
	private Pair<String, String> createMixedNodesPorts(Node n, CoordinationPattern2 decomposed) {
		
		Pair<String, String> ports = new Pair<String, String>();
		String in = "";
		String out= "";
		
		for(String end : n.getEnds()) {
			Node temp_node = new Node();
			temp_node.addEnd(end);
			for(CommunicationMean2 cm : decomposed.getPattern()) {
				if(cm.getInodes().contains(temp_node)){
					out += end + " ";
				}
				else {
					if(cm.getOnodes().contains(temp_node)){
						in += end + " ";
					}
				}
			}
		}
		
		in = "[" + in.trim() + "]";
		out = "[" + out.trim() + "]";
		
		ports.setFirst(in);
		ports.setSecond(out);
		return ports;
	}



	/**
	 * Decomposes a CP as follows:
	 * 
	 * Each communication mean has nodes with single ends.
	 * The ends are picked randomly from the original mixed nodes. 
	 * 
	 * @return a CP decomposed.
	 */
	private CoordinationPattern2 decompose() {
		Set<String> ends_used = new LinkedHashSet<String>();
		CoordinationPattern2 cp2 = new CoordinationPattern2();
		
		for(CommunicationMean2 cm : this.pattern) {
			CommunicationMean2 cm_new = new CommunicationMean2();
			LinkedHashSet<Node> inodes = new LinkedHashSet<Node>();
			LinkedHashSet<Node> onodes = new LinkedHashSet<Node>();
			for(Node in : cm.getInodes()){
				Node in_minus_used = new Node(in);
				in_minus_used.getEnds().removeAll(ends_used);
				String end = in_minus_used.takeEnd();
				Node n = new Node();
				n.addEnd(end);
				inodes.add(n);
				ends_used.add(end);
			}
			for(Node out : cm.getOnodes()) {
				Node out_minus_used = new Node(out);
				out_minus_used.getEnds().removeAll(ends_used);
				String end = out_minus_used.takeEnd();
				Node n = new Node();
				n.addEnd(end);
				onodes.add(n);
				ends_used.add(end);
			}
			
			cm_new.setId(cm.getId());
			cm_new.setType(cm.getType());
			cm_new.setInodes(inodes);
			cm_new.setOnodes(onodes);
			cm_new.setDelays(cm.getDelays());
			
			cp2.getPattern().add(cm_new);
			cp2.setDelays(this.getDelays());
		}
		
		return cp2;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id+"\n" + pattern + "\n@ " + this.delays + "\nXORs: " + this.xors ;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((delays == null) ? 0 : delays.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pattern == null) ? 0 : pattern.hashCode());
		result = prime * result + ((xors == null) ? 0 : xors.hashCode());
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
		if (!(obj instanceof CoordinationPattern2))
			return false;
		CoordinationPattern2 other = (CoordinationPattern2) obj;
		if (delays == null) {
			if (other.delays != null)
				return false;
		} else if (!delays.equals(other.delays))
			return false;
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
		if (xors == null) {
			if (other.xors != null)
				return false;
		} else if (!xors.equals(other.xors))
			return false;
		return true;
	}



	
	
	
	
	
}
