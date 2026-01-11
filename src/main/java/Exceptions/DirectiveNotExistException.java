package Exceptions;

public class DirectiveNotExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DirectiveNotExistException(String msg) {
		super(msg);
	}
	
	public DirectiveNotExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public DirectiveNotExistException() {
		super("The directive does not exist");
	}
}