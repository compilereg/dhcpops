package Exceptions;

public class OptionNotExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public OptionNotExistException(String msg) {
		super(msg);
	}
	
	public OptionNotExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public OptionNotExistException() {
		super("Option is not exist");
	}
}