package basic14exception09;

public class A {
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) throw new MinusException("예외 : 응수값 입력");
		else if (score > 100) throw new OverException("예외 : 100 초과");
		else System.out.println("정상");
	}
}
