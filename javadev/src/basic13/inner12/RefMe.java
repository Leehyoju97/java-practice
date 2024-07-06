package basic13.inner12;

interface A {
	
}

interface B {
	
}

public class RefMe extends Object implements A, B {
	public RefMe() {
		System.out.println("태어남");
	}

	@Override
	protected void finalize() throws Throwable { // 인스턴스가 소멸될 떄 호출되는 메소드
		System.out.println("아악");
	}
	
	
}
