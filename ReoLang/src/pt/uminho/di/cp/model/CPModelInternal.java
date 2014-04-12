package pt.uminho.di.cp.model;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CPModelInternal {

		private CoordinationPattern2 simple_pattern;
		private LinkedHashMap<String, CoordinationPattern2> stoch_instances;
		LinkedHashSet<Node> environment;
		LinkedHashMap<String, Node> nodes;
		
		
		public CPModelInternal() {
			this.simple_pattern = new CoordinationPattern2();
			this.stoch_instances = new LinkedHashMap<String, CoordinationPattern2> ();
			this.environment = new LinkedHashSet<Node> ();
			this.nodes = new LinkedHashMap<String, Node> ();
		}
		
		public CoordinationPattern2 getSimplePattern() {
			return simple_pattern;
		}
		
		public LinkedHashMap<String, CoordinationPattern2> getStochInstances() {
			return stoch_instances;
		
		}
		public LinkedHashSet<Node> getEnvironment() {
			return environment;
		}
		public LinkedHashMap<String, Node> getNodes() {
			return nodes;
		}
		
		public void setSimplePattern(CoordinationPattern2 p) {
			this.simple_pattern = p;
		}
		
		public void setStochInstances(LinkedHashMap<String, CoordinationPattern2> is) {
			this.stoch_instances = is;
		}
		
		public void setEnvironment(LinkedHashSet<Node> env) {
			this.environment = env;
		}
		
		public void setNodes(LinkedHashMap<String, Node> ns) {
			this.nodes = ns;
		}
		
		public String toString(){return simple_pattern.toString();}
	
}
