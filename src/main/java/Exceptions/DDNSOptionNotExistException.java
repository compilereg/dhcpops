package Exceptions;

public class DDNSOptionNotExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DDNSOptionNotExistException(String msg) {
		super(msg);
	}
	
	public DDNSOptionNotExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public DDNSOptionNotExistException() {
		super("DDNS Option does not exist");
	}
}