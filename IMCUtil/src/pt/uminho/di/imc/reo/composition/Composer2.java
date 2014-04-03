package pt.uminho.di.imc.reo.composition;

import java.util.LinkedList;
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
	
	
	
	
	
	
	
	
	
	/**
	 * @return the elements
	 */
	public LinkedList<IMCREOimc> getElements() {
		return elements;
	}


	/**
	 * @param elements the elements to set
	 */
	public void setElements(LinkedList<IMCREOimc> elements) {
		this.elements = elements;
	}


	/**
	 * @return the environments
	 */
	public LinkedList<IMCREOimc> getEnvironments() {
		return environments;
	}


	/**
	 * @param environments the environments to set
	 */
	public void setEnvironments(LinkedList<IMCREOimc> environments) {
		this.environments = environments;
	}


	public IMCREOimc compose() {
		
		IMCREOimc composite = null;
		int NTHREADS = this.elements.size() / 2;
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
	    try{
	    	//compose in parallel (with thread pool) and take the first (unique) element
	    	//of the obtained list of IMCREOs...
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
				//We take the last one and set as the first element
				//to be composed in the next round...
		    	n.add(composites.getLast());
		    }
		    for (int i = 0; i < composites.size()-1; i+=2) {
	            Callable<IMCREOimc> worker = 
	            		new ComposerWorker(composites.get(i), composites.get(i+1));
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
