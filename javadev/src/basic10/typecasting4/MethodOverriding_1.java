package basic10.typecasting4;

class A {
	void print() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	@Override
	void print() {
		System.out.println("B클래스");
	}
}
public class MethodOverriding_1 {
	public static void main(String[] args) {
		A aa = new A();
		aa.print();
		
		B bb = new B();
		bb.print();
		
		A ab = new B();
		ab.print();
	}
}
