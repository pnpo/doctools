package pt.uminho.di.imc.reo.composition;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

import pt.uminho.di.imc.reo.imc.IMCREOimc;

public class ComposerWorker implements Callable<IMCREOimc>{

	private IMCREOimc imc1 ;
	private IMCREOimc imc2 ;
	private LinkedHashSet<String> mixed;
	
	
	
	/**
	 * @param imc1
	 * @param imc2
	 */
	public ComposerWorker(IMCREOimc imc1, IMCREOimc imc2, LinkedHashSet<String> mixedports) {
		super();
		this.imc1 = imc1;
		this.imc2 = imc2;
		this.mixed = mixedports;
	}




	@Override
	public IMCREOimc call() {
		System.out.println(Thread.currentThread().getName());
		IMCREOimc res = this.imc1.compose(this.imc2).pruneIMCREO(this.mixed, false);
		System.out.println(Thread.currentThread().getName()+" End.");
		return res;
	}

}
