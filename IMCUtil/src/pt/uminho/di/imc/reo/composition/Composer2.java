package pt.uminho.di.imc.reo.composition;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import pt.uminho.di.imc.reo.imc.IMCREOimc;

public class Composer2 {

	private LinkedList<IMCREOimc> elements;
	private LinkedList<IMCREOimc> environments;
	
	
	
	public Composer2() {
		super();
		this.elements = new LinkedList<IMCREOimc>();
		this.environments = new LinkedList<IMCREOimc>();
	}
	
	
	public Composer2(LinkedList<IMCREOimc> els, LinkedList<IMCREOimc> envs) {
		super();
		this.elements = new LinkedList<IMCREOimc>(els);
		this.environments = new LinkedList<IMCREOimc>(envs);
	}
	
	
	
	
	public IMCREOimc compose() {
		
		IMCREOimc composite = null;
		int NTHREADS = this.elements.size() / 2;
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
	    try{
	    	composite = parallelComposition(this.elements, executor).get(0);
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
		
		executor.shutdown();
		return composite;
	}
	
	
	private LinkedList<IMCREOimc> parallelComposition(LinkedList<IMCREOimc> composites, ExecutorService pool) 
														throws InterruptedException, ExecutionException {
		if(composites.size() != 1) {
			LinkedList<IMCREOimc> n = new LinkedList<IMCREOimc>();
			LinkedList<Future<IMCREOimc>> new_composites = new LinkedList<Future<IMCREOimc>>();
		    //If the number of IMCs to compose is bigger than 1
			if( (composites.size() % 2) != 0){
		    	n.add(composites.getLast());
		    }
		    for (int i = 0; i < composites.size()-1; i+=2) {
	            Callable<IMCREOimc> worker = 
	            		new ComposerWorker(composites.get(i), composites.get(i+1), new LinkedHashSet<String>());
	            Future<IMCREOimc> res = pool.submit(worker);
	            new_composites.add(res);
		    }
		    
		    for(Future<IMCREOimc> i : new_composites) {
		    	n.add(i.get());
		    }
		    
		    composites = parallelComposition(n, pool);
		}
		
		return composites;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
