package pt.uminho.di.cp.model;

public class InvalidReconfigurationOperationException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidReconfigurationOperationException() {
		super();
	}
	
	
	public InvalidReconfigurationOperationException(String msg) {
        super(msg);
    }
}
