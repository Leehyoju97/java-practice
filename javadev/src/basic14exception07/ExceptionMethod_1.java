package basic14exception07;

public class ExceptionMethod_1 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			throw new Exception("에외 메시지");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
