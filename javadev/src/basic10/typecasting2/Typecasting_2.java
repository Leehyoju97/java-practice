package basic10.typecasting2;

class A {
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class Typecasting_2 {
	public static void main(String[] args) {
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		A ab = new B();	// 업캐스팅
		System.out.println(ab.m);
		ab.abc();
//		System.out.println(ab.n);	// 에러
//		System.out.println(ab.bcd());	// 에러
	}
}
