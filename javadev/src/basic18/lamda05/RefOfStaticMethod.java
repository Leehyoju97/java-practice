package basic18.lamda05;


interface A {
	void abc();
}

class B {
	static void bcd() {
		System.out.println("메소드");
	}
}
public class RefOfStaticMethod {
	public static void main(String[] args) {
		A a1 = new A() {

			@Override
			public void abc() {
				B.bcd();		
			}
		};
		
		A a2 = () -> {B.bcd();};
		
		A a3 = B::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
