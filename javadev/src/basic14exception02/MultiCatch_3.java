package basic14exception02;

public class MultiCatch_3 {
	public static void main(String[] args) {
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		catch (ArithmeticException e) {
			System.out.println("예외 발생");
		}
		catch (NumberFormatException e) {
			System.out.println("예외 발생");
		}
		
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		}
		catch (ArithmeticException | NumberFormatException e) {
			System.out.println("예외 발생");
		}
	}
}
