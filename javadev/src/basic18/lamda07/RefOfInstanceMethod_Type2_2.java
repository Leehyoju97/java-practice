package basic18.lamda07;

interface A {
	int abc(String str);
}

public class RefOfInstanceMethod_Type2_2 {
	public static void main(String[] args) {
		A a1 = new A() {

			@Override
			public int abc(String str) {
				return str.length();
			}
			
		};
		
		A a2 = (String str) -> str.length();
		
		A a3 = String::length;
		
		System.out.println(a1.abc("hi"));
		System.out.println(a2.abc("hi"));
		System.out.println(a3.abc("hi"));
		
	}
}
