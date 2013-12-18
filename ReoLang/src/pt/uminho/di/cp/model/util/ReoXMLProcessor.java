/**
 * 
 */
package pt.uminho.di.cp.model.util;

import java.io.File;
import java.util.LinkedHashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import pt.uminho.di.cp.model.CommunicationMean2;
import pt.uminho.di.cp.model.CoordinationPattern2;

/**
 * @author Nuno Oliveira
 * @date 17 de Dez de 2013
 *
 */
public class ReoXMLProcessor {

	private String path;

	/**
	 * @param path
	 */
	public ReoXMLProcessor(String path) {
		super();
		this.path = path;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	
	
	
	

	///// SPECIFIC METHODS //////
	
	
	public CoordinationPattern2 toCoordinationPattern() {
		CoordinationPattern2 cp = new CoordinationPattern2();
		
		try {
			//LOAD THE REO XML FILE
			File stocks = new File(this.path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			
			dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(stocks);
			doc.getDocumentElement().normalize();
			
			
			//PROCESS the connector name
			String connector_id = "";
			NamedNodeMap outer_connector_node = doc.getElementsByTagName("connectors").item(0).getAttributes(); 
			if( outer_connector_node.getNamedItem("name") != null) {
				connector_id = outer_connector_node.getNamedItem("name").getNodeValue();
			}
			else {
				connector_id = outer_connector_node.getNamedItem("xmi:id").getNodeValue();
			}
			cp.setId(connector_id);
			
			
			//Process nodes
			NodeList nodes = doc.getElementsByTagName("nodes");
			LinkedHashMap<String, pt.uminho.di.cp.model.Node> model_nodes = new LinkedHashMap<String, pt.uminho.di.cp.model.Node>();
			for(int i = 0 ; i < nodes.getLength() ; i++){
				Node node = nodes.item(i);
				pt.uminho.di.cp.model.Node n = new pt.uminho.di.cp.model.Node();
				String node_id = node.getAttributes().getNamedItem("xmi:id").getNodeValue();
				String str_node = "";
				Node sources = node.getAttributes().getNamedItem("sourceEnds");
				Node sinks = node.getAttributes().getNamedItem("sinkEnds");
				if(sources != null){
					str_node += sources.getNodeValue() + " "; 
				}
				if(sinks != null){
					str_node += sinks.getNodeValue();
				}
				
				String[] ends = str_node.split(" ");
				for(int j = 0; j<ends.length ; j++) {
					n.addEnd(ends[j]);
				}
				
				model_nodes.put(node_id,n);
			}
			
			LinkedHashMap<String, Integer> ids_converter = new LinkedHashMap<String, Integer>();
			
			//Process primitives
			NodeList primitives = doc.getElementsByTagName("primitives");
			for(int i = 0 ; i < primitives.getLength() ; i++){
				Node primitive = primitives.item(i);
				CommunicationMean2 cm = new CommunicationMean2();
				//PROCESS the TYPE
				String type = primitive.getAttributes().getNamedItem("xmi:type").getNodeValue();
				//the substring is used to remove the tag channels: before the actual type
				type = type.substring(type.indexOf(':')+1);
				//get the state of the channel
				String state = "";
				if(primitive.getAttributes().getNamedItem("full") != null) {
					if(primitive.getAttributes().getNamedItem("full").getNodeValue().equals("true")){
						state = "f";
					}
					else {
						state = "e";
					}
				} 
				cm.setType(type + state);
				
				//PROCESS the identifier
				int counter = 1;
				if(ids_converter.containsKey(type.toLowerCase())){
					counter = ids_converter.get(type.toLowerCase()) + 1; 
					ids_converter.put(type.toLowerCase(), counter);
				}
				else {
					ids_converter.put(type.toLowerCase(), counter);
				}
				cm.setId(type.toLowerCase() + counter);
				
				
				//PROCESS the ends/nodes
				NodeList ends_nodes = primitive.getChildNodes();
				for(int j = 0 ; j < ends_nodes.getLength(); j++) {
					Node sen = ends_nodes.item(j);
					if(sen instanceof Element) {
						String node_id = sen.getAttributes().getNamedItem("node").getNodeValue();
						if(sen.getNodeName().equals("sourceEnds")){
							cm.getInodes().add(new pt.uminho.di.cp.model.Node(model_nodes.get(node_id)));
						}
						else {
							if(sen.getNodeName().equals("sinkEnds")) {
								cm.getOnodes().add(new pt.uminho.di.cp.model.Node(model_nodes.get(node_id)));
							}
						}
					}
				}
				
				cp.getPattern().add(cm);
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//System.out.println(cp);
		return cp;
		
	}
	
	
	/////////////////////////////
	
	
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReoXMLProcessor [path=" + path + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((path == null) ? 0 : path.hashCode());
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
		if (!(obj instanceof ReoXMLProcessor))
			return false;
		ReoXMLProcessor other = (ReoXMLProcessor) obj;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
