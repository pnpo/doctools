package pt.uminho.di.imc.reo.composition;

import java.util.LinkedHashSet;
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

	
	
	/**
	 * Performs composition of all elements (channels + nodes) in this composer.
	 * 
	 * It takes advantage of parallelism to speed up the composition.
	 * 
	 * @return the IMCREOimc composed
	 */
	public IMCREOimc compose() {
		
		IMCREOimc composite = null;
		int NTHREADS = this.elements.size() > 1 ? this.elements.size() / 2 : 1;
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
	    try{
	    	//compose in parallel (with thread pool) and take the first (unique) element
	    	//of the obtained list of IMCREOs...
	    	composite = parallelComposition(this.elements, executor).get(0);
	    	composite = deploy(composite);
	    	
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
	
	
	
	/**
	 * Performs composition of all the elements (channels + nodes) of this composer.
	 * 
	 *  IT IS NOT EFFICIENT: it composes in sequence...
	 * 
	 * @return
	 */
	public IMCREOimc compose2(){
		IMCREOimc res = null;
		if(this.elements.size() >= 2){
			IMCREOimc i1 = this.elements.get(0);
			IMCREOimc i2 = this.elements.get(1);
			LinkedHashSet<String> mixed = new LinkedHashSet<String>(i1.getActs());
			mixed.retainAll(i2.getActs());
			res = i1.compose(i2).pruneIMCREO(mixed/*, false*/);
			for(int i = 2; i < this.elements.size(); i++) {
				i2 = this.elements.get(i);
				mixed = new LinkedHashSet<String>(res.getActs());
				mixed.retainAll(i2.getActs());
				res = res.compose(i2).pruneIMCREO(mixed);
			}
		}
		else {
			res = this.elements.get(0);
		}
		
		res = deploy(res);
		
		return res;
	}
	
	
	
	
	
	/**
	 * @param composite - the IMCREOimc of the connector to deploy with the environment given in this composer
	 * @return an IMCREOimc deployed. I.e., with environment information in the connector ports  
	 */
	public IMCREOimc deploy(IMCREOimc composite) {
		LinkedHashSet<String> env_ports = new LinkedHashSet<String>();
		for(IMCREOimc imc : this.environments){
			env_ports.addAll(imc.getActs());
		}
		LinkedHashSet<String> mixedports = new LinkedHashSet<String>(composite.getActs());
		mixedports.removeAll(env_ports);
		composite = composite.fix_environment(environments, mixedports);
		return composite;
	}
	
	
	
	
	
	
	

}
