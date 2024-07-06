package basic14exception04;

class A {
	void abc() {
		bcd();
	}
	
	void bcd() {
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
		}
	}
}

class B {
	void abc() {
		try {
			bcd();
			System.out.println("종료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
}

public class ThrowsException_1 {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		
		B b = new B();
		b.abc();
	}
}
