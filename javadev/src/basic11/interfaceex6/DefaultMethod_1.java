package basic11.interfaceex6;

interface A {
	void abc();
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	}
}

class B implements A {
	public void abc() {
		System.out.println("B클래스의 abc()");
	}
}

class C implements A {
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}

public class DefaultMethod_1 {
	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new C();
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd(); // 메소드 오버라이딩
	}
}
