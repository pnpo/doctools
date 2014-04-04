/**
 * 
 */
package pt.uminho.di.imc.reo.composition;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import pt.uminho.di.imc.reo.imc.IMCREOBufferState;
import pt.uminho.di.imc.reo.imc.IMCREOInteractiveTransition;
import pt.uminho.di.imc.reo.imc.IMCREOInternalState;
import pt.uminho.di.imc.reo.imc.IMCREOMarkovianTransition;
import pt.uminho.di.imc.reo.imc.IMCREOMarkovianTransitionSort;
import pt.uminho.di.imc.reo.imc.IMCREOState;
import pt.uminho.di.imc.reo.imc.IMCREOTransition;
import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.util.Pair;

/**
 * @author Nuno Oliveira
 * @date 5 de Abr de 2013
 *
 */
public final class Library {

	
	public static String path = "pt/uminho/di/imc/reo/templates/";
	



	public static String sync_( String id, String a, String b, String gab){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate sync_ab = group.getInstanceOf(path + "sync_");
		sync_ab.setAttribute("a", a);
		sync_ab.setAttribute("b", b);
		sync_ab.setAttribute("gab", gab);
		sync_ab.setAttribute("id", id);
		
		return sync_ab.toString();
		
	}
	
	
	
	public static String drain_( String id, String a, String b, String gab){
	
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate drain_ab = group.getInstanceOf(path + "drain");
		drain_ab.setAttribute("a", a);
		drain_ab.setAttribute("b", b);
		drain_ab.setAttribute("gab", gab);
		drain_ab.setAttribute("id", id);
		
		return drain_ab.toString();
	}
	
	
	public static String lossy_( String id, String a, String b, String gab, String gaL){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate lossy_ab = group.getInstanceOf(path + "lossy_");
		lossy_ab.setAttribute("a", a);
		lossy_ab.setAttribute("b", b);
		lossy_ab.setAttribute("gab", gab);
		lossy_ab.setAttribute("gaL", gaL);
		lossy_ab.setAttribute("id", id);
		
		return lossy_ab.toString();
		
	}
	
	
	public static String fifo1e_(String id, String a, String b,  String gaB, String gBb){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate fifo_ab = group.getInstanceOf(path + "fifo1e_");
		fifo_ab.setAttribute("a", a);
		fifo_ab.setAttribute("b", b);
		fifo_ab.setAttribute("gaB", gaB);
		fifo_ab.setAttribute("gBb", gBb);
		fifo_ab.setAttribute("id", id);
		 
		return fifo_ab.toString();
		
	}
	
	
	public static String fifo1f_(String id, String a, String b,  String gaB, String gBb){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate fifo_ab = group.getInstanceOf(path + "fifo1f_");
		fifo_ab.setAttribute("a", a);
		fifo_ab.setAttribute("b", b);
		fifo_ab.setAttribute("gaB", gaB);
		fifo_ab.setAttribute("gBb", gBb);
		fifo_ab.setAttribute("id", id);
		 
		return fifo_ab.toString();
		
	}
	
	

	public static String environment_(String a, String ga ){
		
		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
		StringTemplate env_id = group.getInstanceOf(path + "environment_");
		env_id.setAttribute("a", a);
		env_id.setAttribute("ga", ga);
		
		return env_id.toString();
		
	}





	/**
	 * Creates the IMCREOimc of a special node (merger+replicator)
	 * that can be added to the composition of an imcreo with
	 * nodes that take time to process.
	 * 
	 * It allows for different kind of nodes:
	 * 
	 * 1 - simple merger, if outs is a singleton;
	 * 2 - simple replicator, if ins is a singleton;
	 * 3 - simple node, if ins and outs are singletons.
	 * 
	 * @param time_to_read - the exponential distribution parameter for reading delay. 
	 * @param time_to_write - the exponential distribution parameter for writing delay.
	 * @param ins - the names of the nodes that are input ports of the node.
	 * @param outs - the names of the nodes that are output ports of the node.
	 * @return IMCREOimc representing the stochastic node. 
	 */
	public static IMCREOimc merger_replicator(
			double time_to_read, 
			double time_to_write, 
			Set<String> ins, 
			Set<String> outs) //throws IMCREOBadNodeException
	{
		IMCREOimc mr = new IMCREOimc(); 

//		if(ins.isEmpty() || outs.isEmpty()){
//			throw new IMCREOBadNodeException("The input/output ports of the node should not be empty!");
//		}
		
		//create initial state and add to the chain
		LinkedList<IMCREOInternalState> int_state = new LinkedList<IMCREOInternalState>();
		int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
		IMCREOState initial = new IMCREOState("E", int_state);
		
		mr.getChain().put(initial, new LinkedList<IMCREOTransition>());
		mr.setInitial_state(initial);
		
		//formats...
		String outs_formated = formatState(outs);
		String id = formatId(ins, outs);
		
		//create write state and add to the chain
		int_state = new LinkedList<IMCREOInternalState>();
		int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
		IMCREOState write_state = new IMCREOState("-" + outs_formated + "-", int_state);
		mr.getChain().put(write_state, new LinkedList<IMCREOTransition>());
		
		for(String end : ins) {
			//create a read state and add to the chain
			int_state = new LinkedList<IMCREOInternalState>();
			int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
			IMCREOState read_state = new IMCREOState("+" + end + "+", int_state);
			mr.getChain().put(read_state, new LinkedList<IMCREOTransition>());
			
			Set<String> actions = new LinkedHashSet<String>();
			actions.add(end);
			actions.addAll(outs);
			
			//create interactive transition and add to the chain (initial - i_tr - read_state)
			IMCREOInteractiveTransition i_tr = new IMCREOInteractiveTransition(read_state,actions);
			mr.getChain().get(initial).add(i_tr);
			
			//create markovian transition and add to the chain (read_state - m_tr - write_state)
			String label_read = formatMarkovianLabel(end, id, IMCREOMarkovianTransitionSort.READ, "MREP");
			IMCREOMarkovianTransition m_tr = new IMCREOMarkovianTransition(write_state, time_to_read, label_read);
			mr.getChain().get(read_state).add(m_tr);
		}
		
		//create markovian transition and add to the chain (write_state - m_tr - initial)
		String label_read = formatMarkovianLabel(outs, id, IMCREOMarkovianTransitionSort.WRITE, "MREP");
		IMCREOMarkovianTransition m_tr = new IMCREOMarkovianTransition(initial, (time_to_write/outs.size()), label_read);
		mr.getChain().get(write_state).add(m_tr);
		
		//partial order...
		for(String in : ins){
			for(String out: outs){
				Pair<String, String> order = new Pair<String, String>(in, out);
				mr.getPoset().addSinglePOSet(order);
			}
		}
		
		return mr; 
	} 
	
	
	

	/**
	 * Creates the IMCREOimc of a special node (merger+replicator)
	 * that can be added to the composition of an imcreo with
	 * NON-DELAYING nodes.
	 * 
	 * It allows for different kind of nodes:
	 * 
	 * 1 - simple merger, if outs is a singleton;
	 * 2 - simple replicator, if ins is a singleton;
	 * 3 - simple node, if ins and outs are singletons.
	 * 
	 * @param ins - the names of the nodes that are input ports of the node.
	 * @param outs - the names of the nodes that are output ports of the node.
	 * @return IMCREOimc representing the stochastic node. 
	 */
	public static IMCREOimc merger_replicator(
			Set<String> ins, 
			Set<String> outs) //throws IMCREOBadNodeException
	{
		IMCREOimc mr = new IMCREOimc(); 

//		if(ins.isEmpty() || outs.isEmpty()){
//			throw new IMCREOBadNodeException("The input/output ports of the node should not be empty!");
//		}
		
		//create initial state and add to the chain
		LinkedList<IMCREOInternalState> int_state = new LinkedList<IMCREOInternalState>();
		int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
		IMCREOState initial = new IMCREOState("E", int_state);
		mr.getChain().put(initial, new LinkedList<IMCREOTransition>());
		mr.setInitial_state(initial);
		
		for(String end : ins) {

			Set<String> actions = new LinkedHashSet<String>();
			actions.add(end);
			actions.addAll(outs);
			
			//create interactive transition and add to the chain (initial - i_tr - read_state)
			IMCREOInteractiveTransition i_tr = new IMCREOInteractiveTransition(initial,actions);
			mr.getChain().get(initial).add(i_tr);
			

		}

		
		//partial order...
		for(String in : ins){
			for(String out: outs){
				Pair<String, String> order = new Pair<String, String>(in, out);
				mr.getPoset().addSinglePOSet(order);
			}
		}
		
		return mr; 
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 * Creates the IMCREOimc of a special node (merger+router)
	 * that can be added to the composition of an imcreo with
	 * nodes that take time to process.
	 * 
	 * It allows for different kind of nodes:
	 * 
	 * 1 - simple router, if ins is a singleton;
	 * 2 - simple node, if ins and outs are singletons.
	 * 
	 * 
	 * @param time_to_read - the exponential distribution parameter for reading delay 
	 * @param time_to_write - the exponential distribution parameter for writing delay
	 * @param ins - the set of input ends of the node
	 * @param outs - the set of output ends of the node
	 * @return IMCREOimc represeting a merger_router node
	 * 
	 * @throws IMCREOBadNodeException
	 */
	public static IMCREOimc merger_router(
			double time_to_read, 
			double time_to_write, 
			Set<String> ins, 
			Set<String> outs) //throws IMCREOBadNodeException
	{
		IMCREOimc mr = new IMCREOimc(); 

//		if(ins.isEmpty() || outs.isEmpty()){
//			throw new IMCREOBadNodeException("The input/output ports of the node should not be empty!");
//		}
//		else {
//			if(outs.size() < 2) {
//				throw new IMCREOBadNodeException("The number of output ports of the node should be 2 or more!");
//			}
//		}
		
		//create initial state and add to the chain
		LinkedList<IMCREOInternalState> int_state = new LinkedList<IMCREOInternalState>();
		int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
		IMCREOState initial = new IMCREOState("E", int_state);
		mr.getChain().put(initial, new LinkedList<IMCREOTransition>());
		mr.setInitial_state(initial);
		
		//formats...
		//String outs_formated = formatOutsForWriteState(outs);
		String id = formatId(ins, outs);
		
		
		
		for(String in_end : ins) {
			for(String out_end : outs) {
				Set<String> actions = new LinkedHashSet<String>();
				actions.add(in_end);
				actions.add(out_end);
				
				//create a read state and add to the chain
				int_state = new LinkedList<IMCREOInternalState>();
				int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
				IMCREOState read_state = new IMCREOState("+" + formatState(actions) + "+", int_state);
				mr.getChain().put(read_state, new LinkedList<IMCREOTransition>());
				
				//create interactive transition and add to the chain (initial - i_tr - read_state)
				IMCREOInteractiveTransition i_tr = new IMCREOInteractiveTransition(read_state,actions);
				mr.getChain().get(initial).add(i_tr);
				
				//create write state and add to the chain
				int_state = new LinkedList<IMCREOInternalState>();
				int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
				IMCREOState write_state = new IMCREOState("-" + out_end + "-", int_state);
				mr.getChain().put(write_state, new LinkedList<IMCREOTransition>());
				
				//create markovian transition and add to the chain (read_state - m_tr - write_state)
				String label_read = formatMarkovianLabel(actions, id, IMCREOMarkovianTransitionSort.READ, "MXOR");
				IMCREOMarkovianTransition m_tr_rd = new IMCREOMarkovianTransition(write_state, time_to_read, label_read);
				mr.getChain().get(read_state).add(m_tr_rd);
				
				//create markovian transition and add to the chain (write_state - m_tr - initial)
				String label_write = formatMarkovianLabel(out_end, id, IMCREOMarkovianTransitionSort.WRITE, "MXOR");
				IMCREOMarkovianTransition m_tr_wr = new IMCREOMarkovianTransition(initial, time_to_write, label_write);
				mr.getChain().get(write_state).add(m_tr_wr);
			}
			
		}
		
		
		//partial order...
		for(String in : ins){
			for(String out: outs){
				Pair<String, String> order = new Pair<String, String>(in, out);
				mr.getPoset().addSinglePOSet(order);
			}
		}
		
		return mr; 
	}
	
	
	
	
	
	
	/**
	 * 
	 * Creates the IMCREOimc of a special node (merger+router)
	 * that can be added to the composition of an imcreo with
	 * NON-DELAYING nodes.
	 * 
	 * It allows for different kind of nodes:
	 * 
	 * 1 - simple router, if ins is a singleton;
	 * 2 - simple node, if ins and outs are singletons.
	 * 
	 * 
	 * @param ins - the set of input ends of the node
	 * @param outs - the set of output ends of the node
	 * @return IMCREOimc represeting a merger_router node
	 * 
	 * @throws IMCREOBadNodeException
	 */
	public static IMCREOimc merger_router(
			Set<String> ins, 
			Set<String> outs) //throws IMCREOBadNodeException
	{
		IMCREOimc mr = new IMCREOimc(); 

//		if(ins.isEmpty() || outs.isEmpty()){
//			throw new IMCREOBadNodeException("The input/output ports of the node should not be empty!");
//		}
//		else {
//			if(outs.size() < 2) {
//				throw new IMCREOBadNodeException("The number of output ports of the node should be 2 or more!");
//			}
//		}
		
		//create initial state and add to the chain
		LinkedList<IMCREOInternalState> int_state = new LinkedList<IMCREOInternalState>();
		int_state.add(new IMCREOInternalState(IMCREOBufferState.NONE, new LinkedHashSet<String>()));
		IMCREOState initial = new IMCREOState("E", int_state);
		mr.getChain().put(initial, new LinkedList<IMCREOTransition>());
		mr.setInitial_state(initial);
		
		
		for(String in_end : ins) {
			for(String out_end : outs) {
				Set<String> actions = new LinkedHashSet<String>();
				actions.add(in_end);
				actions.add(out_end);
				
				//create interactive transition and add to the chain (initial - i_tr - read_state)
				IMCREOInteractiveTransition i_tr = new IMCREOInteractiveTransition(initial,actions);
				mr.getChain().get(initial).add(i_tr);
			}
			
		}
		
		
		//partial order...
		for(String in : ins){
			for(String out: outs){
				Pair<String, String> order = new Pair<String, String>(in, out);
				mr.getPoset().addSinglePOSet(order);
			}
		}
		
		return mr; 
	}
	
	
	
	
	
	
	
	
	
	
	private static String formatId(Set<String>ins, Set<String> outs) {
	
		String id = "";
		for(String end : ins){
			id += end;
		}
		for(String end : outs){
			id += end;
		}
		
		return id;
	}
	
	
	
	private static String formatState(Set<String> outs) {
		
		String outs_formated = "";
		for(String out : outs){
			outs_formated += out + " ";
		}
		outs_formated = outs_formated.trim();
		
		return outs_formated;
	}
	
	
	private static String formatMarkovianLabel(
			String end, 
			String id, 
			IMCREOMarkovianTransitionSort type, 
			String state_type)
	{
		String label = "";
		label = state_type + "_" + id + "_" + (type.equals(IMCREOMarkovianTransitionSort.READ) ? "RD": "WR" ) + "_[" +end+"]";
		return label;
	}
	
	
	private static String formatMarkovianLabel(
			Set<String> ends, 
			String id, 
			IMCREOMarkovianTransitionSort type, 
			String state_type)
	{
		String label = "";
		String ends_formated = "";
		for(String end : ends) {
			ends_formated += end + ",";
		}
		ends_formated = ends_formated.substring(0, ends_formated.length()-1);
		
		label = state_type + "_" + id + "_" + (type.equals(IMCREOMarkovianTransitionSort.READ) ? "RD": "WR" ) + "_[" + ends_formated +"]";
		return label;
	}
	



	
	
	
//	public static String sync( String id, String a, String b, String ga, String gb, String gab){
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate sync_ab = group.getInstanceOf(path + "sync");
//		sync_ab.setAttribute("a", a);
//		sync_ab.setAttribute("b", b);
//		sync_ab.setAttribute("ga", ga);
//		sync_ab.setAttribute("gb", gb);
//		sync_ab.setAttribute("gab", gab);
//		sync_ab.setAttribute("id", id);
//		
//		return sync_ab.toString();
//		
//	}
//	
//	
//
//	
//	
//	
//	public static String drain( String id, String a, String b, String ga, String gb, String gab){
//		
//		
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate drain_ab = group.getInstanceOf(path + "drain");
//		drain_ab.setAttribute("a", a);
//		drain_ab.setAttribute("b", b);
//		drain_ab.setAttribute("ga", ga);
//		drain_ab.setAttribute("gb", gb);
//		drain_ab.setAttribute("gab", gab);
//		drain_ab.setAttribute("id", id);
//		
//		return drain_ab.toString();
//		
//		
//	}
//	
//	
//	
//	
//	public static String lossy( String id, String a, String b, String ga, String gb, String gab, String gaL){
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate lossy_ab = group.getInstanceOf(path + "lossy");
//		lossy_ab.setAttribute("a", a);
//		lossy_ab.setAttribute("b", b);
//		lossy_ab.setAttribute("ga", ga);
//		lossy_ab.setAttribute("gb", gb);
//		lossy_ab.setAttribute("gab", gab);
//		lossy_ab.setAttribute("gaL", gaL);
//		lossy_ab.setAttribute("id", id);
//		
//		return lossy_ab.toString();
//		
//	}
//	
//	
//	
//	public static String fifo1e(String id, String a, String b, String ga, String gb, String gaB, String gBb){
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate fifo_ab = group.getInstanceOf(path + "fifo1e");
//		fifo_ab.setAttribute("a", a);
//		fifo_ab.setAttribute("b", b);
//		fifo_ab.setAttribute("ga", ga);
//		fifo_ab.setAttribute("gb", gb);
//		fifo_ab.setAttribute("gaB", gaB);
//		fifo_ab.setAttribute("gBb", gBb);
//		fifo_ab.setAttribute("id", id);
//		 
//		return fifo_ab.toString();
//		
//	}
//	
//	
//	public static String fifo1f( String id, String a, String b, String ga, String gb, String gaB, String gBb){
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate fifo_ab = group.getInstanceOf(path + "fifo1f");
//		fifo_ab.setAttribute("a", a);
//		fifo_ab.setAttribute("b", b);
//		fifo_ab.setAttribute("ga", ga);
//		fifo_ab.setAttribute("gb", gb);
//		fifo_ab.setAttribute("gaB", gaB);
//		fifo_ab.setAttribute("gBb", gBb);
//		fifo_ab.setAttribute("id", id);
//		 
//		return fifo_ab.toString();
//		
//	}
//	
//	
//	
//	
//	public static String merger( String id, String a, String b, String c, String ga, String gb, String gc, String gac, String gbc){
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate merger_abc = group.getInstanceOf(path + "merger");
//		merger_abc.setAttribute("a", a);
//		merger_abc.setAttribute("b", b);
//		merger_abc.setAttribute("c", c);
//		merger_abc.setAttribute("ga", ga);
//		merger_abc.setAttribute("gb", gb);
//		merger_abc.setAttribute("gc", gc);
//		merger_abc.setAttribute("gac", gac);
//		merger_abc.setAttribute("gbc", gbc);
//		merger_abc.setAttribute("id", id);
//		 
//		return merger_abc.toString();
//		
//	}
//	
//	
//	
//	public static String replicator(String id, String a, String b, String c, String ga, String gb, String gc, String gabc){
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate replicator_abc = group.getInstanceOf(path + "replicator");
//		replicator_abc.setAttribute("a", a);
//		replicator_abc.setAttribute("b", b);
//		replicator_abc.setAttribute("c", c);
//		replicator_abc.setAttribute("ga", ga);
//		replicator_abc.setAttribute("gb", gb);
//		replicator_abc.setAttribute("gc", gc);
//		replicator_abc.setAttribute("gabc", gabc);
//		replicator_abc.setAttribute("id", id);
//		 
//		return replicator_abc.toString();
//		
//	}
//	
//	
//public static String exrouter(String id, String a, String b, String c, String ga, String gb, String gc, String gac, String gab){
//		
//		StringTemplateGroup group = new StringTemplateGroup("imc_templates");
//		StringTemplate exrouter_abc = group.getInstanceOf(path + "exrouter");
//		exrouter_abc.setAttribute("a", a);
//		exrouter_abc.setAttribute("b", b);
//		exrouter_abc.setAttribute("c", c);
//		exrouter_abc.setAttribute("ga", ga);
//		exrouter_abc.setAttribute("gb", gb);
//		exrouter_abc.setAttribute("gc", gc);
//		exrouter_abc.setAttribute("gac", gac);
//		exrouter_abc.setAttribute("gab", gab);
//		exrouter_abc.setAttribute("id", id);
//		 
//		return exrouter_abc.toString();
//		
//	}




	
	

	
}
