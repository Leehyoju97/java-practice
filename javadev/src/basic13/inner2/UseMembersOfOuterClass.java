package basic13.inner2;

class A {
	int a = 3;
	int b = 4;
	
	void abc() {
		System.out.println("A클래스 메서드 abc()");
	}
	
	class B {
		int a = 5;
		int b = 6;
		
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		
		void bcd() {
			// 아우터 클래스 필드 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}

public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.bcd();
	}
}