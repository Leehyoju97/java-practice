package basic07.Method;

public class MethodTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		print();
		print("son");
		print("lee");
		
		int a = 7, b = 4;
		System.out.println(a + "+" + b + "=" + add(a, b));
		System.out.println(a + "-" + b + "=" + sub(a, b));
		System.out.println(a + "*" + b + "=" + mul(a, b));
		System.out.println(a + "/" + b + "=" + div(a, b));
		System.out.println(a + "%" + b + "=" + mod(a, b));
		

	}

	private static int mod(int a, int b) {
		// TODO Auto-generated method stub
		return a % b;
	}

	private static int div(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	private static int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	private static int add(int a, int b) {
		
		// TODO Auto-generated method stub
		return a + b;
	}

	private static void print(String name) {
		System.out.println("Hello " + name);
		// TODO Auto-generated method stub
		
		
	}

	private static void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		return; //메서드 강제 종료
		
	}

}
