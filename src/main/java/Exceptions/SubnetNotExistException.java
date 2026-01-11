package Exceptions;

public class SubnetNotExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public SubnetNotExistException(String msg) {
		super(msg);
	}
	
	public SubnetNotExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public SubnetNotExistException() {
		super("Subnet does not exist");
	}
}