/**
 * 
 */
package pt.uminho.di.cp.model.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import pt.uminho.di.cp.model.CommunicationMean2;
import pt.uminho.di.cp.model.CoordinationPattern2;

/**
 * @author Nuno Oliveira
 * @date 17 de Dez de 2013
 *
 */
public class ReoXMLProcessor {

	private String path;
	private HashMap<String, String> channel_types;
	private HashMap<String, String> type_conversion;
	
	
	/**
	 * @param path
	 */
	public ReoXMLProcessor(String path) {
		super();
		this.path = path;
		this.channel_types = new HashMap<String, String>();
		this.channel_types.put("Sync", 					"3001");
		this.channel_types.put("LossySync", 			"3002");
		this.channel_types.put("FIFO", 					"3003");
		this.channel_types.put("SyncDrain", 			"3005");
		this.channel_types.put("SyncSpout", 			"3006");
		this.channel_types.put("AsyncDrain", 			"3007");
		this.channel_types.put("AsyncSpout", 			"3008");
		this.channel_types.put("Filter", 				"3011");
		this.channel_types.put("Transform", 			"3012");
		this.channel_types.put("Timer", 				"3015");
		this.channel_types.put("PrioritySync", 			"3019");
		this.channel_types.put("BlockingSync", 			"3020");
		this.channel_types.put("BlockingSinkSync", 		"3021");
		this.channel_types.put("BlockingSourceSync",	"3021");
		
		this.type_conversion = new HashMap<String, String>();
		this.type_conversion.put("Sync", 				"sync");
		this.type_conversion.put("LossySync", 			"lossy");
		this.type_conversion.put("FIFO", 				"fifo");
		this.type_conversion.put("SyncDrain", 			"sync_drain");
		this.type_conversion.put("SyncSpout", 			"sync_spout");
		this.type_conversion.put("AsyncDrain", 			"async_drain");
		this.type_conversion.put("AsyncSpout", 			"async_spout");
		this.type_conversion.put("Filter", 				"filter");
		this.type_conversion.put("Transform", 			"transformer");
		this.type_conversion.put("Timer", 				"timer");	
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
			File reo = new File(this.path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(reo);
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
			
			
			NodeList primitives = doc.getElementsByTagName("primitives");
			
			//Process NODES FOR PRIMITIVES
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
						state = "_f";
					}
					else {
						state = "_e";
					}
				}
				
				//PROCESS the identifier
				int counter = 1;
				if(ids_converter.containsKey(type.toLowerCase())){
					counter = ids_converter.get(type.toLowerCase()) + 1; 
					ids_converter.put(type.toLowerCase(), counter);
				}
				else {
					ids_converter.put(type.toLowerCase(), counter);
				}
				String id = type.toLowerCase() + counter;
				
				//PROCESS the ends/nodes
				NodeList ends_nodes = primitive.getChildNodes();
			
				for(int j = 0 ; j < ends_nodes.getLength(); j++) {
					Node sen = ends_nodes.item(j);
					if(sen instanceof Element) {
						String node_val= sen.getAttributes().getNamedItem("xmi:id").getNodeValue();
						//update node
						for(pt.uminho.di.cp.model.Node nn : model_nodes.values()){
							if(nn.containsEnd(node_val)){
								nn.removeEnd(node_val);
								nn.addEnd(id+ "_" + (node_val.replaceAll("[-_]", "z")));
							}
						}
					}
				}
			}
			
			
			ids_converter = new LinkedHashMap<String, Integer>();
			//Process primitives
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
						state = "_f";
					}
					else {
						state = "_e";
					}
				} 
				cm.setType(this.type_conversion.containsKey(type) ? this.type_conversion.get(type) + state : type + state);
				
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
	
	
	
	
	
	
	
	
	
	
	public Document toReoXML(CoordinationPattern2 cp, String file_name) {
		Document doc = initReoXML();
		Random generator = new Random();
		int seed_number = generator.nextInt();
		final String _SEP_ = "";
		final int _INC_ = 50;
		final int _WIDTH_ = 400;
		int disp_x = 15;
		int disp_y = 15;
		HashMap<String,String> ids = new HashMap<String, String>();
		ids.put("module_id", "module_" + seed_number);
		ids.put("connector_id", "conn_" + seed_number);
		ids.put("diagram_id", "diagram_" + seed_number);
		ids.put("chd_wrap_id", "wrpa_" + seed_number);
		ids.put("chd_tbox_id", "tbox_" + seed_number);
		ids.put("chd_cont_id", "container_" + seed_number);
		ids.put("base_layout_id", "baselayout_" + seed_number);
		ids.put("styles_id", "styles_" + seed_number);
				
		try{
			//<reo:Module>
			Element reo_module = (Element) doc.getElementsByTagName("reo:Module").item(0);
			reo_module.setAttribute("xmi:id", ids.get("module_id"));
			
			//<connectors xmi:type="" xmi:id="" name="">
			//anchor point for Nodes and Primitives
			Element connector = (Element) doc.getElementsByTagName("connectors").item(0);
			connector.setAttribute("xmi:id", ids.get("connector_id"));
			connector.setAttribute("name", cp.getId());
			
			//<notation:Diagram xmi:id="" element="" name="">
			//anchor point for styles and edges
			Element diagram = (Element) doc.getElementsByTagName("notation:Diagram").item(0);
			diagram.setAttribute("xmi:id", ids.get("diagram_id"));
			diagram.setAttribute("element", ids.get("module_id"));
			diagram.setAttribute("name", file_name);
			
			//<children xmi:id="" element="" ...>
			NodeList chd = doc.getElementsByTagName("children");
			Element ch1 = (Element) chd.item(0);
			ch1.setAttribute("xmi:id", ids.get("chd_wrap_id"));
			ch1.setAttribute("element", ids.get("connector_id"));
			
			//<children xmi:id="" element="" ...>
			Element ch2 = (Element) chd.item(1);
			ch2.setAttribute("xmi:id", ids.get("chd_tbox_id"));
			
			//<children xmi:id="" element="" ...>
			//anchor point for nodes representation
			Element ch3 = (Element) chd.item(2);
			ch3.setAttribute("xmi:id", ids.get("chd_cont_id"));
			
			//<layoutConstraint xmi:type="notation:Bounds" xmi:id="" x="" y="" width="" height=""/>
			Element layout = (Element) doc.getElementsByTagName("layoutConstraint").item(0);
			layout.setAttribute("xmi:id", ids.get("base_layout_id"));
			layout.setAttribute("x", "30");
			layout.setAttribute("y", "30");
			layout.setAttribute("width", _WIDTH_+"");
			layout.setAttribute("height", _WIDTH_+"");
			
			
			//<styles xmi:type='notation:DiagramStyle' xmi:id='' />
			Element styles = (Element) doc.getElementsByTagName("styles").item(0);
			styles.setAttribute("xmi:id", ids.get("styles_id"));
			
			
			//TO STORE USED NODES
			HashMap<pt.uminho.di.cp.model.Node, pt.uminho.di.cp.model.Node> nodes_map = 
					new HashMap<pt.uminho.di.cp.model.Node, pt.uminho.di.cp.model.Node>();
			LinkedHashSet<String> used_as_in = new LinkedHashSet<String>();
			LinkedHashSet<String> used_as_out = new LinkedHashSet<String>();
			
			//TO STORE IDS OF NODES REPRESENTATION
			HashMap<pt.uminho.di.cp.model.Node, String> nodes_drawing_ids = 
					new HashMap<pt.uminho.di.cp.model.Node, String>();
			
			//TO STORE ELEMENTS BEFORE APPENDING TO THE XML
			ArrayList<Element> primitives = new ArrayList<Element>();
			ArrayList<Element> nodes = new ArrayList<Element>();
			
			
			// PRIMITIVES
			Set<CommunicationMean2> pattern_elems = cp.getPattern();
			for(CommunicationMean2 elem : pattern_elems) {
				//<primitives xmi:id="" xmi:type="channels:..." >
				Element prim = doc.createElement("primitives");
				prim.setAttribute("xmi:id", elem.getId());
				String type = elem.getType();
				if(type.endsWith("_f")) {
					prim.setAttribute("full", "true");
					type = type.substring(0,type.length()-2);
				}
				else {
					if(type.endsWith("_e")) {
						type = type.substring(0,type.length()-2);
					}
				}
				prim.setAttribute("xmi:type", "channels:"+type);
				
				
				LinkedHashSet<pt.uminho.di.cp.model.Node> inodes = elem.getInodes();
				for(pt.uminho.di.cp.model.Node node : inodes ){
					if(!nodes_map.containsKey(node)){
						nodes_map.put(node, new pt.uminho.di.cp.model.Node(node));
						nodes_drawing_ids.put(node, "ele_" + (seed_number++));
					}
					String end = nodes_map.get(node).takeEnd();
					used_as_in.add(end);
					//<sourceEnds xmi:id="" xmi:type="reo:SourceEnd" node="">
					Element srcend = doc.createElement("sourceEnds");
					srcend.setAttribute("xmi:id", end);
					srcend.setAttribute("xmi:type", "reo:SourceEnd");
					srcend.setAttribute("node", "node_"+ node.formatXMLID(_SEP_));
					
					prim.appendChild(srcend);
				}
				
				LinkedHashSet<pt.uminho.di.cp.model.Node> onodes = elem.getOnodes();
				for(pt.uminho.di.cp.model.Node node : onodes ){
					if(!nodes_map.containsKey(node)){
						nodes_map.put(node, new pt.uminho.di.cp.model.Node(node));
						nodes_drawing_ids.put(node, "ele_" + (seed_number++));
					}
					String end = nodes_map.get(node).takeEnd();
					used_as_out.add(end);
					//<sinkEnds xmi:id="" xmi:type="reo:SinkEnd" node="">
					Element snkend = doc.createElement("sinkEnds");
					snkend.setAttribute("xmi:id", end);
					snkend.setAttribute("xmi:type", "reo:SinkEnd");
					snkend.setAttribute("node", "node_"+ node.formatXMLID(_SEP_));
					
					prim.appendChild(snkend);
				}
				
				primitives.add(prim);
				
				
//				<edges xmi:type="notation:Connector" xmi:id="" type="3001" element="" source="" target="">
//			      <styles xmi:type="notation:FontStyle" xmi:id="" fontName="Lucida Grande"/>
//			      <bendpoints xmi:type="notation:RelativeBendpoints" xmi:id="" />
//			    </edges>
				
				Element edge = doc.createElement("edges");
				edge.setAttribute("xmi:id", "ele_" + (seed_number++));
				edge.setAttribute("xmi:type", "notation:Connector");
				edge.setAttribute("type", this.channel_types.containsKey(type) ? this.channel_types.get(type) : this.channel_types.get("Sync"));
				edge.setAttribute("element", elem.getId());
				edge.setAttribute("source", nodes_drawing_ids.get(elem.getSourceTarget().fst()));
				edge.setAttribute("target", nodes_drawing_ids.get(elem.getSourceTarget().snd()));
				
				Element style = doc.createElement("styles");
				style.setAttribute("xmi:id", "ele_" + (seed_number++));
				style.setAttribute("xmi:type", "notation:FontStyle");
				style.setAttribute("fontName", "Lucida Grande");
				
				Element points = doc.createElement("bendpoints");
				points.setAttribute("xmi:id", "ele_" + (seed_number++));
				points.setAttribute("xmi:type", "notation:RelativeBendpoints");
				
				edge.appendChild(style);
				edge.appendChild(points);
				diagram.appendChild(edge);
				
			}
			
			
			//NODES
			for(pt.uminho.di.cp.model.Node node : nodes_map.keySet()) {
				//<nodes xmi:id="" xmi:type="reo:Node" sinkEnds="..." sourceEnds="...">
				Element n = doc.createElement("nodes");
				n.setAttribute("xmi:id", "node_"+node.formatXMLID(_SEP_));
				n.setAttribute("xmi:type", "reo:Node");
				String in = "";
				String out = "";
				for(String end : node.getEnds()) {
					if(used_as_in.contains(end)) {
						in += end + " ";
					}	
					else {
						out += end + " ";
					}
				}
				
				
				if(in.length() > 0) {
					in = in.substring(0, in.length()-1);
					n.setAttribute("sourceEnds", in);
				}
				
				if(out.length() > 0) {
					out = out.substring(0, out.length()-1);
					n.setAttribute("sinkEnds", out);
				}
				
				nodes.add(n);
				
//				<children xmi:type="notation:Shape" xmi:id="" type="2001" element="n1" fontName="Lucida Grande">
//		          <children xmi:type="notation:DecorationNode" xmi:id="" type="4001">
//		            <layoutConstraint xmi:type="notation:Location" xmi:id="" y="5"/>
//		          </children>
//		          <layoutConstraint xmi:type="notation:Bounds" xmi:id="" x="" y=""/>
//				</children>				
				Element node_child1 = doc.createElement("children");
				node_child1.setAttribute("xmi:id", nodes_drawing_ids.get(node));
				node_child1.setAttribute("xmi:type", "notation:Shape");
				node_child1.setAttribute("type", "2001");
				node_child1.setAttribute("element", "node_"+node.formatXMLID(_SEP_));
				node_child1.setAttribute("fontName", "Lucida Grande");
				
				Element node_child2 = doc.createElement("children");
				node_child2.setAttribute("xmi:id", "ele_" + (seed_number++));
				node_child2.setAttribute("xmi:type", "notation:DecorationNode");
				node_child2.setAttribute("type", "4001");
				
				Element node_layout1 = doc.createElement("layoutConstraint");
				node_layout1.setAttribute("xmi:id", "ele_" + (seed_number++));
				node_layout1.setAttribute("xmi:type", "notation:Location");
				node_layout1.setAttribute("y", "5");
				
				Element node_layout2 = doc.createElement("layoutConstraint");
				node_layout2.setAttribute("xmi:id", "ele_" + (seed_number++));
				node_layout2.setAttribute("xmi:type", "notation:Bounds");
				
				//UPDATE LAYOUT POSITIONS
				disp_x += _INC_;
				disp_y += disp_x > _WIDTH_ ? _INC_ :  0;
				disp_x = disp_x % _WIDTH_;
				node_layout2.setAttribute("x", disp_x+"");
				node_layout2.setAttribute("y", disp_y+"");
						
				node_child2.appendChild(node_layout1);
				node_child1.appendChild(node_child2);
				node_child1.appendChild(node_layout2);
				
				ch3.appendChild(node_child1); 
				
			}
			
			
			
			nodes.addAll(primitives);
			for(Element e : nodes) {
				connector.appendChild(e);
			}
			
			
			

			
			
			
			
			//System.out.println(prettyPrint(doc));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return doc;
	}
	
	
	
	
	
	
	
	
	private static Document initReoXML() {
		
		String static_reoxml = 
				"<?xml version='1.0' encoding='UTF-8' ?>\n" +
				"<xmi:XMI " +
				"	xmi:version='2.0' xmlns:xmi='http://www.omg.org/XMI' " +
				"	xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' " +
				"	xmlns:channels='http://www.cwi.nl/reo/channels' " +
				"	xmlns:notation='http://www.eclipse.org/gmf/runtime/1.0.2/notation' " +
				"	xmlns:reo='http://www.cwi.nl/reo' " +
				"	xsi:schemaLocation='http://www.cwi.nl/reo/channels http://www.cwi.nl/reo#//channels'>\n" +
				" 	<reo:Module xmi:id=''>\n" +
				"		<connectors xmi:type='reo:Connector' name=''>\n" +
						//HERE GO NODES
						//HERE GO PRIMITIVES
				"		</connectors>\n" +
				"	</reo:Module>\n" + 
				" 	<notation:Diagram xmi:id='' element='' name='' type='Reo' measurementUnit='Pixel'>\n" +
				"		<children xmi:id='' element='' xmi:type='notation:Shape' type='1001' fontName='Lucida Grande'>\n" +
				"			<children xmi:type='notation:DecorationNode' xmi:id='' type='4004'/>\n " +
				"			<children xmi:type='notation:BasicCompartment' xmi:id='' type='5001'>\n" +
							//HERE GO NODES REPRESENTATION
				"			</children>\n" +
				"			<layoutConstraint xmi:type='notation:Bounds' xmi:id='' x='' y='' width='' height=''/>\n" +
				"		</children>\n" +
				"		<styles xmi:type='notation:DiagramStyle' xmi:id='' />\n" +	
						//HERE GO STYLE n EDGES
				"	</notation:Diagram>\n" +
				"</xmi:XMI>";
		
		Document doc = null;
		
		try{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(new InputSource(new ByteArrayInputStream(static_reoxml.getBytes("utf-8"))));
			doc.getDocumentElement();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return doc;
	}
	
	
	
	
	/////////////////////////////
	
	
	
	
	public static String prettyPrint(Document xml) throws Exception {
	        Transformer tf = TransformerFactory.newInstance().newTransformer();
	        tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	        tf.setOutputProperty(OutputKeys.INDENT, "yes");
	        tf.setOutputProperty(OutputKeys.STANDALONE, "yes");
	        Writer out = new StringWriter();
	        tf.transform(new DOMSource(xml), new StreamResult(out));
	        return out.toString();
	}

	
	
	
	
	
	
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
