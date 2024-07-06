package basic11.interfaceex8;

interface A {
	static void abc() {
		System.out.println("A 인터페이스 정적 메소드 abc()");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A.abc();
	}
}
