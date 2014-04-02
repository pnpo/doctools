package pt.uminho.di.imc.reo.composition;

import java.util.LinkedHashSet;
import java.util.concurrent.Callable;

import pt.uminho.di.imc.reo.imc.IMCREOimc;

public class ComposerWorker implements Callable<IMCREOimc>{

	private IMCREOimc imc1 ;
	private IMCREOimc imc2 ;
	
	
	
	/**
	 * @param imc1
	 * @param imc2
	 */
	public ComposerWorker(IMCREOimc imc1, IMCREOimc imc2) {
		super();
		this.imc1 = imc1;
		this.imc2 = imc2;
	}




	@Override
	public IMCREOimc call() {
		System.out.println(Thread.currentThread().getName());
		LinkedHashSet<String> mixed = new LinkedHashSet<String>(this.imc1.getActs());
		mixed.retainAll(this.imc2.getActs());
		//TODO: verify if this mixed set is enough or if it has to be the history 
		//of all ports already composed...
		IMCREOimc res = this.imc1.compose(this.imc2).pruneIMCREO(mixed, false);
		System.out.println(Thread.currentThread().getName()+" End.");
		return res;
	}

}
