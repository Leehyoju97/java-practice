package basic13.inner1;

public class InnerTest {
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.bcd();
	}
}
