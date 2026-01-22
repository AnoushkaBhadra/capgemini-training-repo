package exception_handling.customexception;

public class InvalidNameException extends Exception{
	public InvalidNameException(String msg) {
		super(msg);
	}
}
