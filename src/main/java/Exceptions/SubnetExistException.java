package Exceptions;

public class SubnetExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SubnetExistException(String msg) {
		super(msg);
	}
	
	public SubnetExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public SubnetExistException() {
		super("Subnet is already exist");
	}
}