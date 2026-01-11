package Exceptions;

public class HostNameNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public HostNameNotFoundException(String msg) {
		super(msg);
	}
	
	public HostNameNotFoundException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public HostNameNotFoundException() {
		super("Hostname not found");
	}
}