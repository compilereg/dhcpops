package Exceptions;

public class DDNSOptionExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DDNSOptionExistException(String msg) {
		super(msg);
	}
	
	public DDNSOptionExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public DDNSOptionExistException() {
		super("DDNS Option already exist");
	}
}