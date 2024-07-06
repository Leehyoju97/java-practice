package basic14exception05;

class A {
	void abc() {
		bcd();
		System.out.println("A 종료");
	}
	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (InterruptedException | ClassNotFoundException e) {
//			e.printStackTrace();
		}
	}
}

class B {
	void abc() {
		try {
			bcd();
			System.out.println("B 종료");
		} catch(InterruptedException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}

public class ThrowsException_3 {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		
		B b = new B();
		b.abc();
	}
}
