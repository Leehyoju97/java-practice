package basic07.constructor2;

class A {
	A() {
		System.out.println("첫번째 생성자");
	}
	
	A(int a) {
		this();	// 반드시 생성자의 첫줄
		System.out.println("두번째 생성자");
	}
	
	/*
	void abc() {
		//this()	//메소드에서는 this() 사용불가
	}
	*/
	
}
public class ThisMethod_1 {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println();
		A a2 = new A(3);
	}
}
