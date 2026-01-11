package Exceptions;

public class HostNameExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public HostNameExistException(String msg) {
		super(msg);
	}
	
	public HostNameExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public HostNameExistException() {
		super("Hostname is already reserved");
	}
}