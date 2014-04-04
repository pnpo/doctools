package pt.uminho.di.imc.reo.composition;

import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.parsing.IMCREOScriptParserFrontEnd;

public class TestComposer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String script = "" +
				//"sync s1 a b0 5 " +
				"fifo1f l1 a b0 10 24 " +
				"fifo1f f2 b1 c 15 35 " +
				//"fifo1e f1 d c 15 20 " +
				"mer_rep [c] [a] " +
				"mer_rep [b0] [b1] " +
				//"env a 1 " +
				//"env c 2 " +
				"" ;
		
		
		Composer2 c = IMCREOScriptParserFrontEnd.parse(script, false);
		
		System.out.println("ELEMS: "+ c.getElements().size());
		System.out.println("ENVS: "+ c.getEnvironments().size());
		
		long startTime = System.currentTimeMillis();
		IMCREOimc imc2 = c.compose2();
		long endTime   = System.currentTimeMillis();
		long totalTime1 = endTime - startTime;
		
		
		
		
		startTime = System.currentTimeMillis();
		IMCREOimc imc = c.compose();
		
		endTime   = System.currentTimeMillis();
		double totalTime2 = endTime - startTime;
		
		//System.out.println(imc2.toString());
		System.out.println(imc.toString());
		System.out.println("NO PAR took..." + totalTime1);
		System.out.println("PAR took..." + totalTime2);
		
		
		
		
		

	}

}
