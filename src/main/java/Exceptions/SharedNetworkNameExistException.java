package Exceptions;

public class SharedNetworkNameExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SharedNetworkNameExistException(String msg) {
		super(msg);
	}
	
	public SharedNetworkNameExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public SharedNetworkNameExistException() {
		super("The Shared network name already exist");
	}
}