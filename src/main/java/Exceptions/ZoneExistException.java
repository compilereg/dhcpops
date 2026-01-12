package Exceptions;

public class ZoneExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ZoneExistException(String msg) {
		super(msg);
	}
	
	public ZoneExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public ZoneExistException() {
		super("The zone is already exist");
	}
}