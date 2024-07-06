package basic11.interfaceex3;

interface A {
	public abstract void abc();
}
interface B {
	void bcd();
}

class C implements A {
	public void abc() {}
}

/*
class D implements B {
	void bcd() {}	// 상위클래스는 public, 하위클래스는 default로 오버라이딩 중에 접근지정자 범위가 좁아지므로 에러 발생
}
*/

public class InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}
