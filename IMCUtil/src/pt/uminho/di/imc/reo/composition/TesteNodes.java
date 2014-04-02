package pt.uminho.di.imc.reo.composition;

import java.util.LinkedHashSet;

import pt.uminho.di.imc.reo.imc.IMCREOimc;

public class TesteNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> ins = new LinkedHashSet<String>();
		LinkedHashSet<String> outs = new LinkedHashSet<String>();
		
		outs.add("b3");
		//outs.add("b4");
		
		ins.add("b1");
		ins.add("b2");
		//ins.add("b5");
		try{
			IMCREOimc test  = Library.merger_replicator(ins, outs);
			System.out.println(test.toString());
		}
		catch(IMCREOBadNodeException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
