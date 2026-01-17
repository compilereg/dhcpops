package Exceptions;

public class SharedNetworkNameNotExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SharedNetworkNameNotExistException(String msg) {
		super(msg);
	}
	
	public SharedNetworkNameNotExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public SharedNetworkNameNotExistException() {
		super("The Shared network name does not exist");
	}
}