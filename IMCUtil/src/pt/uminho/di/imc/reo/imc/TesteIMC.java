package pt.uminho.di.imc.reo.imc;



import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

import org.antlr.runtime.RecognitionException;

import pt.uminho.di.imc.IMC;
import pt.uminho.di.imc.IMCTransformer;
import pt.uminho.di.imc.NotIMCREOException;
import pt.uminho.di.imc.parsing.IMCParserWrapper;
import pt.uminho.di.imc.parsing.InvalidIMCFileException;
import pt.uminho.di.imc.reo.composition.Library;
import pt.uminho.di.imc.reo.parsing.ReoMAParserFrontEnd;
import pt.uminho.di.imc.util.Util;

public class TesteIMC {

	public static void main(String[] args) {
		
//		String s = Library.fifo1e("f1", "a", "b", "0.1", "0.2", "0.3", "0.4");
//		IMCREOimc imc = ReoMAParserFrontEnd.parse(s, false);
//		POPorts poset = imc.getPoset();
//		IMC i = imc.toIMC(false, true);
//		//System.out.println(i);
//		
//		//System.out.println(imc.hideArrivalAtNode("b"));
//		
//		String ser_lbl = "f[b, a]~FIFO1e_f1_ARR_[a]~f[b, a]";
//		IMCREOState s1 = new IMCREOState();
//		IMCREOState s2 = new IMCREOState();
//		IMCREOimc.unserializeInternalStates(ser_lbl, s1, s2);
//
//		
//		try{
//			IMCREOimc imc2 = new IMCTransformer(i).toIMCREO(poset);
//			//System.out.println(imc2);
//		}
//		catch(NotIMCREOException e){
//			System.out.println(e.getMessage());
//		}
		
		String aut = "fifo_h_b";
	//	Util.minimize(aut);
		
		IMCParserWrapper p = new IMCParserWrapper(new File("tmp/"+aut+".red.aut"));
		try {
			p.parse();
			IMCREOimc imc3 = new IMCTransformer(p.getImc()).toIMCREO(new POPorts());
			LinkedHashSet<String> mx = new LinkedHashSet<String>();
			mx.add("b");
			System.out.println(imc3.removeForcedNonDeterminism(mx, false));
			
		} catch (InvalidIMCFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotIMCREOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	
	
	
}
