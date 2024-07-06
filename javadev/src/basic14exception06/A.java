package basic14exception06;

public class A {
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메시지: MyException");
	
	MyRTException mre1 = new MyRTException();
	MyRTException mre2 = new MyRTException("예외 메시지: MyRTException");
	
	void abc_1(int num) {
		try {
			if (num > 70) System.out.println("정상 작동");
			else throw me1;
		} catch (MyException e) {
			System.out.println("예외 처리 1");
		}
	}
	
	void bcd_1() {
		abc_1(65);
	}
	
	void abc_2(int num) throws MyException {
		if (num > 70) System.out.println("정상 작동");
		else throw me1;
	}
	
	void bcd_2() {
		try {
			abc_2(65);
		} catch (MyException e) {
			System.out.println("예외 처리 2");
		}
	}
}
