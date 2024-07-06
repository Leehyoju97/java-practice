package basic14exception08;

public class ExceptionMethod_2 {
	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.abc();
			System.out.println("종료");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
