package Exceptions;

public class ZoneNotExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ZoneNotExistException(String msg) {
		super(msg);
	}
	
	public ZoneNotExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public ZoneNotExistException() {
		super("The zone does not exist");
	}
}