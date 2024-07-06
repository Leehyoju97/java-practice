package basic13.inner4;

class A {
	int a = 3;
	void abc() {
		int b = 5;	// 지역변수
		
		class B {	// 지역클래스
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				
				a = 5;
//				b = 7;	// 지역 변수를 사용할 떄는 final로 선언되어 있으므로 값 변경 불가
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}
