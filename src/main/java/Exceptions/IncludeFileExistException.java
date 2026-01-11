package Exceptions;

public class IncludeFileExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public IncludeFileExistException(String msg) {
		super(msg);
	}
	
	public IncludeFileExistException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public IncludeFileExistException() {
		super("File has been included before");
	}
}