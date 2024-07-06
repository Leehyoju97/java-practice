package basic10.super1;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	
	void bcd() {
		abc();	//this.abc()
	}
}

public class SuperKeyword_1 {
	public static void main(String[] args) {
		B bb = new B();
		bb.bcd();
	}
}
