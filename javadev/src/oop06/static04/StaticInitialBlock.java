package oop06.static04;

class A {
	int a;
	static int b;
	
	static {
		b = 5;
		System.out.println("클래스 A가 로딩됬습니다.");
	}
	
	A() {
		a = 3;
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A.b);
	}
}
