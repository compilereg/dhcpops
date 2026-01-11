package Exceptions;

public class DirectiveExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DirectiveExistException(String msg) {
		super(msg);
	}
	
	public DirectiveExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public DirectiveExistException() {
		super("The directive is already exist");
	}
}