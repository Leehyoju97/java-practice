package basic10.super2;

class A {
	void abc() {
		System.out.println("A클래스 abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	
	void bcd() {
		super.abc();
	}
}

public class SuperKeyword_2 {
	public static void main(String[] args) {
		B bb = new B();
		bb.bcd();
	}
}
