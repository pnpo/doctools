package pt.uminho.di.imc.reo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestSetsProblem {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		IMCREOState st1 = new IMCREOState();
		IMCREOState st2 = new IMCREOState();
		
		
		
		
		LinkedHashSet<String> h1 = new LinkedHashSet<String>();
		LinkedHashSet<String> h2 = new LinkedHashSet<String>();
		LinkedHashSet<String> h3 = new LinkedHashSet<String>();
		LinkedHashSet<String> h4 = new LinkedHashSet<String>(10);
		LinkedHashSet<String> h5 = new LinkedHashSet<String>();
		ArrayList<IMCREOBufferState> buff = new ArrayList<IMCREOBufferState>();
		
		
		h1.add("dois");
		h1.add("um");
		h1.add("tres");
		h1.add("quatro");
		h1.add("cinco");
		
//		h5.add("um");
//		h5.add("dois");
//		h5.add("tres");
//		h5.add("quatro");
//		h5.add("cinco");
//		
//		
//		//h3.add("b|0");
//		//h3.add("a");
//		
//		buff.add(IMCREOBufferState.EMPTY);
//		buff.add(IMCREOBufferState.NONE);
//		buff.add(IMCREOBufferState.NONE);
//		buff.add(IMCREOBufferState.EMPTY);
//		buff.add(IMCREOBufferState.NONE);
//		
//		st1.setRequests(h1);
//		st1.setTransmissions(h4);
//		st1.setBuffer(buff);
//		
//		System.out.println("st1    - " + st1);
//		System.out.println("st1 hash " + st1.hashCode());
//		
////		st2.setRequests(h2);
////		st2.setTransmissions(h4);
////		st2.setBuffer(buff);
//		
//		st2 = st1.copy();
//		st2.setRequests(h5);
//		
//		System.out.println("st2    - " + st2);
//		System.out.println("st2 hash " + st2.hashCode());
//		
//		System.out.println("st2 = st1 " + st2.equals(st1));
//		
//		
//		HashMap<IMCREOState, String> map = new HashMap<IMCREOState, String>();
//		
//		map.put(st1, "st1");
//		map.put(st2, "st2");
//			
//		System.out.println(map);
		
		
		h3.add("quatro");
		h3.add("um");
		h3.add("dois");
		h3.add("cinco");
		h3.add("tres");
		
		h2.addAll(h1) ;//= new LinkedHashSet<String>(h1);
		
		System.out.println("NEW");
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		//System.out.println(h3.toString());
		System.out.println("hash h1 = " + h1.hashCode());
		System.out.println("hash h2 = " + h2.hashCode());
		//System.out.println("hash h3 = " + h3.hashCode());
		System.out.println(h1.equals(h2));
		
		LinkedHashSet<String> h6 = new LinkedHashSet<String>();
		for(String s : h1) {
			if(s.equals("tres")){
				s = "3";
			}
			h6.add(s);
		}
		
		System.out.println("COPY VALUE BY VALUE");
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		//System.out.println(h3.toString());
		System.out.println("hash h1 = " + h1.hashCode());
		System.out.println("hash h2 = " + h2.hashCode());
		//System.out.println("hash h3 = " + h3.hashCode());
		System.out.println(h1.equals(h2));
		System.out.println(h6);
		System.out.println(h1);
	}

}
