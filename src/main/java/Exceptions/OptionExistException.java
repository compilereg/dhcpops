package Exceptions;

public class OptionExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public OptionExistException(String msg) {
		super(msg);
	}
	
	public OptionExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public OptionExistException() {
		super("Option already exist");
	}
}