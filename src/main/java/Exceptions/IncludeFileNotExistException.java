package Exceptions;

public class IncludeFileNotExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public IncludeFileNotExistException(String msg) {
		super(msg);
	}
	
	public IncludeFileNotExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public IncludeFileNotExistException() {
		super("Files is not included");
	}
}