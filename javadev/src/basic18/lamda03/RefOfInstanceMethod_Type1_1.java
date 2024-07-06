package basic18.lamda03;


interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("메서드");
	}
}

public class RefOfInstanceMethod_Type1_1 {
	public static void main(String[] args) {
		A a1 = new A() {

			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		
		A a2 = () ->  {
			B b = new B();
			b.bcd();
		};
		
		B b = new B();
		A a3 = b::bcd;
		
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
