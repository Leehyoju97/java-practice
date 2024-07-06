package basic14exception09;

public class UserExceptionExample {
	public static void main(String[] args) {
		A a = new A();
		
		try {
			a.checkScore(85);
			a.checkScore(150);
			System.out.println("종료");
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
