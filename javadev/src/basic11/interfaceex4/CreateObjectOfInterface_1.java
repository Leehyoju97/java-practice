package basic11.interfaceex4;

interface A {
	int a = 3;
	void abc();
}

class B implements A {
	public void abc() {
		System.out.println("방법 1. 자식클래스 생성자로 객체 생성");
	}
}

public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		A b1 = new B();
		A b2 = new B();
		
		b1.abc();
		b2.abc();
	}
}
