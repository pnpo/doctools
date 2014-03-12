/**
 * 
 */
package pt.uminho.di.imc.reo.composition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import pt.uminho.di.imc.reo.imc.IMCREOBufferState;
import pt.uminho.di.imc.reo.imc.IMCREOState;
import pt.uminho.di.imc.reo.imc.IMCREOimc;
import pt.uminho.di.imc.reo.parsing.ReoMAParserFrontEnd;

/**
 * @author Nuno Oliveira
 * @date 5 de Abr de 2013
 *
 */
public class TesteMain {

	public static void main(String[] args) {
		
		String teste = /*"fifo1e j1|2 j2|0 3.0 3.1 3.2 3.3\n"+ 
						"sync j1|1 b 2.0 2.1 2.2\n" +
						"sync j2|2 d 5.0 5.1 5.2\n" +
						"sync j2|1 c 4.0 4.1 4.2\n" +
						"sync a j1|0 1.0 1.1 1.2\n" +
						"replicator j2|0 j2|1 j2|2 0.1 0.2 0.3 0.4\n" +
						"replicator j1|0 j1|1 j1|2 0.1 0.2 0.3 0.4\n" + 
						*/
						
						//"sync a b  2.0 2.1 2.2\n" +
				
				
//				"lossy l1 a b 2.0 2.1 2.2 2.3\n" +
//				"sync s1 b c 1.0 1.1 1.2\n" +
				//"sync b a 1.0 1.1 1.2\n" +
//				"fifo1f a b 1.0 1.1 1.2 1.3\n"+
//				"fifo1e f1 c d 3.0 3.1 3.2 3.3\n"+
				
				
				
				
				
//				"fifo1f c j 1.0 1.1 1.2 1.3\n"+
//				"fifo1e j k 3.0 3.1 3.2 3.3\n"+
//				"lossy k c 1.0 1.1 1.2 1.3\n" +
				
//				"fifo1f c a 1.0 1.1 1.2 1.3\n"+
//				"fifo1e a b 3.0 3.1 3.2 3.3\n"+
//				"lossy b c 1.0 1.1 1.2 1.3\n" +				
				
				
//				"fifo1e b c 3.0 3.1 3.2 3.3\n"+
				
				
				
//				"sync a b 1.0 1.1 1.2\n" +
//				"replicator b g m 0.1 0.2 0.3 0.4\n" +
//				"drain m k 1.0 1.1 1.2\n" +
//				"sync c k 1.0 1.1 1.2\n" +
				
				
//				"sync a j 1.0 1.1 1.2\n" +
//				"sync c d 1.0 1.1 1.2\n" +
//				"replicator j c e 0.1 0.2 0.3 0.4\n" +
//				"sync e f 1.0 1.1 1.2\n" +
				
				
				
//				"sync a k 1.0 1.1 1.2\n" +
//				"sync c d 1.0 1.1 1.2\n" +
//				"sync j f 1.0 1.1 1.2\n" +
//				"lossy b c 1.0 1.1 1.2 1.3\n" +
				
				
				
//				"merger k d j 0.1 0.2 0.3 0.4 0.5\n" +
				
				
				
//				"sync a a|0 1.0 1.1 1.2\n" +
//				
//				"sync a|1 b 1.0 1.1 1.2\n" +
//				 
//				"sync a|2 c 1.0 1.1 1.2\n" +
//				"replicator a|0 a|1 a|2 0.1 0.2 0.3 0.4\n" +
				
				
//				"replicator a k|1 k|2 0.1 0.2 0.3 0.4\n" +
//				"replicator c d|1 d|2 0.1 0.2 0.3 0.4\n" +
//				"drain d|1 k|1 1.0 1.1 1.2\n" +
//				"sync k|2 e|2 1.0 1.1 1.2\n" +
//				"fifo1e d|2 e|1 3.0 3.1 3.2 3.3\n"+
//				"merger e|2 e|1 e 0.1 0.2 0.3 0.4 0.5\n" +
				
				
				
//				"sync j1|2 b 1.0 1.1 1.2\n" +
//				"fifo1e j1|1 j2|0 3.0 3.1 3.2 3.3\n"+
//				"replicator j1|0 j1|1 j1|2 0.1 0.2 0.3 0.4\n" +
//				"replicator j2|0 j2|1 j2|2 0.1 0.2 0.3 0.4\n" +
//				"sync j2|1 a 1.0 1.1 1.2\n" +
//				"fifo1f j2|2 j1|0 1.0 1.1 1.2 1.3\n"+
//				

//fifo1f j2|2 j1|0 1.1 1.2 1.3 1.4 
//sync j2|1 b 3.1 3.2 3.3 
//sync j1|2 a 2.1 2.2 2.3 
//fifo1e j1|1 j2|0 0.1 0.2 0.3 0.4 
//replicator j2|0 j2|1 j2|2 0.1 0.2 0.3 0.4
//replicator j1|0 j1|1 j1|2 0.1 0.2 0.3 0.4	
				
				
				
				
				
						//--"replicator a b c 1.0 1.1 1.2 1.3\n" +
						//"sync c e 3.0 3.1 3.2\n" +
						//"replicator b c d 1.0 1.1 1.2 1.3\n" +		
						//"sync a g 5.0 5.1 5.2\n"+
						//"sync c j0 2.0 2.1 2.2\n" +
						//"lossy a b 2.0 2.1 2.2 2.3\n" +
						//"lossy d e 2.0 2.1 2.2 2.4\n" +
						//--"sync f a 4.0 4.1 4.2\n" +
				
				
//				"lossy l1 i a 0.1 0.25 0.4 0.1\n"+
//				"fifo1e f1 a b 0.1 0.2 0.3 0.4\n"+
//				"fifo1e f2 b c 0.1 0.2 0.3 0.4\n"+
//				"fifo1e f3 c d 0.1 0.2 0.3 0.4\n"+
				
//				"sync s1 a b 2.0 1.0 0.1\n" +
//				"lossy l1 b c 0.1 0.25 0.4 0.1\n" +
				
//				"sync s1 a r0 2.0 1.0 0.1\n" +
//				"replicator re1 r0 r1 r2 0.1 0.2 0.3 0.5\n" +
//				"sync s2 r2 c 2.0 1.0 0.1\n" +
//				"drain sd1 r1 b 0.1 0.25 0.4\n" +
				
//				"sync s1 a r0 2.0 1.0 0.1\n" +
//				"sync s2 b d1 2.0 1.0 0.1\n" +
//				"drain sd1 d1 r2 0.1 0.25 0.4\n" +
//				"replicator re1 r0 r1 r2 0.1 0.2 0.3 0.5\n" +
//				"replicator re2 s0 s1 s2 0.1 0.2 0.3 0.5\n" +
//				"drain sd2 s1 r1 0.1 0.25 0.4\n" +
//				"sync s3 c s0 2.0 1.0 0.1\n" +
//				"drain sd3 s2 d2 0.1 0.25 0.4\n" +
//				"sync s4 d d2 2.0 1.0 0.1\n" +
//				
//				"lossy l1 a b 0.1 0.25 0.4 0.1\n" +
//				"fifo1e f2 b c 0.1 0.2 0.3 0.4\n"+
				
//				"fifo1e s1 xr|2 c 2.0 1.0 0.1 0.3\n" +
//				"lossy l1 i xr|0 0.1 0.25 0.4 0.1\n" + 
//				"fifo1e l2 xr|1 b 3.0 0.4 0.3 0.5\n" + 
//				"exrouter xor1 xr|0 xr|1 xr|2 0.1 0.1 0.1 0.1 0.1\n" +
//				"merger m1 b c o 0.1 0.2 0.3 0.4 0.5\n" +
				
//				"exrouter xor1 x|0 x|1 x|2 0.001 0.001 0.001 0.001 0.001\n" +
//				"merger  mer1 a|1 a|2 a|0 0.001 0.001 0.001 0.001 0.001\n" +
//				"fifo1e mas a|0 x|0 1.0 1.0 1.8 1000000.0\n" + 
//				"sync sei x|2 esi 1.0 1.0 800000.0\n" + 
//				"sync sbi x|1 bi 1.0 1000000.0 200000.0\n" +
//				"fifo1e wq t a|1 5.0 1.0 1000000.0 1000000.0\n" + 
//				"fifo1e exs esi eso 1.0 1.0 1000000.0 4.5\n" + 
//				"sync seo eso a|2 1.0 1000000.0 1000000.0\n" + 
				
//				"sync s1 a b 2.0 1.0 800000.0\n" + 
//				"fifo1f f1 a b 1.0 1.0 1000000.0 4.5\n" +
//				"fifo1e f2 c a 1.0 1.0 1000000.0 4.5\n" +
//				"lossy l1 b c 1.0 1000000.0 200000.0 4.0\n" +
//				"sync s2 c d 1.0 1000000.0 200000.0\n" +
				
				//"sync_ s1 a b 1.0\n" +
				//"node_ b b b 6.0 7.0\n" +
				//"lossy_ s2 b c 2.0 3.0\n" +
				//"fifo1e_ f1 b c 4.0 5.0\n" +
						""
						;
		
		IMCREOimc imc1 = ReoMAParserFrontEnd.parse(Library.sync_("s1", "a", "b", "1.0"), false);
		IMCREOimc imc2 = ReoMAParserFrontEnd.parse(Library.lossy_("l1", "b", "c", "2.0", "4.0"), false);
		IMCREOimc env_a = ReoMAParserFrontEnd.parse(Library.environment_("Ea", "a", "3.0"), false);
		IMCREOimc env_b = ReoMAParserFrontEnd.parse(Library.environment_("Ec", "c", "4.0"), false);
		//IMCREOimc imc3 = ReoMAParserFrontEnd.parse(Library.sync_("l1", "c", "d", "4.0"), false);
		LinkedHashSet<String> mixed = new LinkedHashSet<String>();
		mixed.add("b");
		//mixed.add("c");
		LinkedList<IMCREOimc> envs = new LinkedList<IMCREOimc>() ;
		envs.add(env_a); 
		envs.add(env_b);
		long startTime = System.currentTimeMillis();
//		ScriptParser sp = new ScriptParser(teste);
//		Composer cs = sp.parser();
		
		
		IMCREOimc res = imc2.compose(imc1, mixed).pruneIMCREO(mixed, false).fix_environment(envs, mixed);
		
//		IMCREOimc res = cs.intelligentCompose(false, "", "", "", "");
		//res.hide(cs.getMixed_ports());
		
		System.out.println(res.toString());
		
		long endTime   = System.currentTimeMillis();
		 long totalTime = endTime - startTime;
		 System.out.println("took..." + totalTime);
		
		 
//		 "{j|1$1, j|0$1, a}_e-f-"
//		 "{j|1$1, j|0$1, a}_e-f-"
		 
		 
		 
//		 IMCREOState s1 = new IMCREOState();
//		 s1.getTransmissions().add("j|1$1");
//		 s1.getTransmissions().add("j|0$1");
//		 s1.getTransmissions().add("a");
//		 s1.getBuffer().add(IMCREOBufferState.EMPTY);
//		 s1.getBuffer().add(IMCREOBufferState.NONE);
//		 s1.getBuffer().add(IMCREOBufferState.FULL);
//		 s1.getBuffer().add(IMCREOBufferState.NONE);
//		 
//		 IMCREOState s3 = s1.copy();
//		 IMCREOState s4 = new IMCREOState();
//		 s4.setRequests(new HashSet<String>(s1.getRequests()));
//		 s4.setTransmissions(new HashSet<String>(s1.getTransmissions()));
//		 s4.setBuffer(new ArrayList<IMCREOBufferState>(s1.getBuffer()));
//		 
//		 IMCREOState s2 = new IMCREOState();
//		 s2.getTransmissions().add("j|0$1");
//		 s2.getTransmissions().add("j|1$1");
//		 s2.getTransmissions().add("a");
//		 s2.getBuffer().add(IMCREOBufferState.EMPTY);
//		 s2.getBuffer().add(IMCREOBufferState.NONE);
//		 s2.getBuffer().add(IMCREOBufferState.FULL);
//		 s2.getBuffer().add(IMCREOBufferState.NONE);
//		 
//		 
//		 HashMap<IMCREOState, String> map = new HashMap<IMCREOState, String>();
//		 
//		 map.put(s1, "s1");
//		 map.put(s3, "s3");
//		 map.put(s4, "s4");
//		 
//		 
//		 System.out.println(s1 + " --- " + s1.getTransmissions().hashCode() +  " --- " + s1.getRequests().hashCode() +  " --- " + s1.getBuffer().hashCode() +  " --- " + s1.toString().hashCode() + " --- " + s1.hashCode());
//		 System.out.println(s3 + " --- " + s3.getTransmissions().hashCode() +  " --- " + s3.getRequests().hashCode() +  " --- " + s3.getBuffer().hashCode() +  " --- " + s3.toString().hashCode() + " --- " + s3.hashCode());
//		 System.out.println(s4 + " --- " + s4.getTransmissions().hashCode() +  " --- " + s4.getRequests().hashCode() +  " --- " + s4.getBuffer().hashCode() +  " --- " + s4.toString().hashCode() + " --- " + s4.hashCode());
//		 System.out.println("s1=s3? + " + s1.equals(s3));
//		 System.out.println("s1=s4? + " + s1.equals(s4));
//		 System.out.println("s3=s4? + " + s3.equals(s4));
//		 
	}
	
}


