package basic18.lamda10;

interface A {
	B abc(int k);
}

class B {
	B() {
		System.out.println("첫 번쨰 생성자");
	}
	B(int k) {
		System.out.println("두 번째 생성자");
	}
}

public class RefOfClassConstructor {
	public static void main(String[] args) {
		A a1 = new A() {

			@Override
			public B abc(int k) {
				return new B(k);
			}
		};
		
		A a2 = (int k) -> new B(k);
		
		A a3 = B::new;
		
		a1.abc(3);
		a2.abc(3);
		a3.abc(3);
		
		
	}
	
	
}
