/**
 * 
 */
package pt.uminho.di.imc.reo.composition;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Nuno Oliveira
 * @date 5 de Abr de 2013
 *
 */
public class ScriptParser {

	public String script;
	
	
	public ScriptParser(){
		script = "";
	}


	/**
	 * @param script
	 */
	public ScriptParser(String script) {
		super();
		this.script = script;
	}


	/**
	 * @return the script
	 */
	public String getScript() {
		return script;
	}


	/**
	 * @param script the script to set
	 */
	public void setScript(String script) {
		this.script = script;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Composer parser(){
		Composer cp = new Composer();
		
		//each line of the script is of the form:
		//channel_type port_1 port_2 port_3? stoch_1 ... stoch_n
		String[] lines = script.split("[\n]");
		
		//for each line of the script...
		for(int i = 0 ; i < lines.length ; i++ ) {
			//break each line into its parts
			String[] parts = lines[i].split("[ ]+");
			
			//use reflection to dynamically invoke methods based on the 
			//channel_type name.
			String class_name = "pt.uminho.di.imc.reo.composition.Library";
			String method_name = parts[0];
			String method_name_indexed = (i+1) + "#" + method_name;
			
			Class<?>[] types = new Class[parts.length -1];
			Object[] args = new Object[parts.length -1];
			
			//define the type of each argument (all of them are strings)
			//and the arguments themselves.
			for(int n_args = 0 ; n_args < types.length ; n_args ++) {   
				 types[n_args] = String.class ;
				 args[n_args] = parts[n_args+1];
			}
			//invoke the method dynamically and store the result in the
			//structure_to_text map
			try {
				Class<?> cls = Class.forName(class_name);
				Method mthd = cls.getMethod(method_name, types);
				String res = (String) mthd.invoke(null, args);
				
				cp.getStructure_to_text().put(method_name_indexed, res);
				cp.getStructure_order().add(method_name_indexed);
				
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
			
			//set to collect ports that will be added to structure_to_ports 
			//map of the composer, to keep track of the ports of each structure.
			HashSet<String> ports = new HashSet<String>();
			
			//create maps of ports to structure for the first port
			if(cp.getPorts_to_structure().containsKey(parts[1])) {
				cp.getPorts_to_structure().get(parts[1]).add(method_name_indexed);
			}
			else{
				LinkedList<String> lst = new LinkedList<String>();
				lst.add(method_name_indexed);
				cp.getPorts_to_structure().put(parts[1], lst);
			}
			ports.add(parts[1]);
			
			
			//create maps of ports to structure for the second port
			if(cp.getPorts_to_structure().containsKey(parts[2])) {
				cp.getPorts_to_structure().get(parts[2]).add(method_name_indexed);
			}
			else{
				LinkedList<String> lst = new LinkedList<String>();
				lst.add(method_name_indexed);
				cp.getPorts_to_structure().put(parts[2], lst);
			}
			ports.add(parts[2]);
			
			//create maps of ports to structure for the third port (if existing)
			try{
				//if is a double do not insert in the map
				Double.parseDouble(parts[3]);
			}
			catch(NumberFormatException e) {
				//if it is a port... insert in the map
				
				if(cp.getPorts_to_structure().containsKey(parts[3])) {
					cp.getPorts_to_structure().get(parts[3]).add(method_name_indexed);
				}
				else{
					LinkedList<String> lst = new LinkedList<String>();
					lst.add(method_name_indexed);
					cp.getPorts_to_structure().put(parts[3], lst);
				}
				ports.add(parts[3]);
			}
			
			//add the collected ports to the structure_to_ports map
			//don't need to check if method_name_indexed exists in the map, 
			//because it is unique in each iteration.
			cp.getStructure_to_ports().put(method_name_indexed, ports);

		}
		
		return cp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ScriptParser [script=" + script + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((script == null) ? 0 : script.hashCode());
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
		if (!(obj instanceof ScriptParser))
			return false;
		ScriptParser other = (ScriptParser) obj;
		if (script == null) {
			if (other.script != null)
				return false;
		} else if (!script.equals(other.script))
			return false;
		return true;
	}
	
	
	
	
	
}
