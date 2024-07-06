package basic13.inner9;

interface A {
	public abstract void abc(); 
}

class C {
	void cde(A a) {
		a.abc();
	}
}

public class AnnoymousClass_4 {
	public static void main(String[] args) {
		C c = new C();
		
		A a = new A() {
			@Override
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		};
		
		c.cde(a);
		
		c.cde(new A() {
			public void abc() {
				System.out.println("입력매개변수 전달");
			}
		});
	}
}
