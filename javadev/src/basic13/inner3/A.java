package basic13.inner3;

public class A {
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	
	static void method2() {
		System.out.println("static method");
	}
	
	static class B {
		void bcd() {
//			System.out.println(a);
			
			System.out.println(b);
//			method1();
			method2();
		}
	}
}
