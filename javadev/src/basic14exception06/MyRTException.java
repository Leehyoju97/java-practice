package basic14exception06;

public class MyRTException extends RuntimeException {
	public MyRTException() {
		super();
	}
	
	public MyRTException(String message) {
		super(message);
	}
}
