package basic10;

class A {}

class B extends A {}
class C extends B {}
class D extends B {}

public class Polymorphism {
	public static void main(String[] args) {
		// A 타입의 다형적 표현
		A a1 = new A();	// A는 A이다. (o) 업캐스팅
		A a2 = new B();
		A a3 = new C();
		A a4 = new D(); // D는 A이다. (o)
		
//		B b1 = new A();		// A는 B이다. (x)
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
//		C c1 = new A();
//		C c2 = new B();
		C c3 = new C();
//		C c4 = new D();
		
//		D d1 = new A();
//		D d2 = new B();
//		D d3 = new C();
		D d4 = new D();
	}
}
