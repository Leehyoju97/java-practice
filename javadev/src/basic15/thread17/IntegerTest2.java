package basic15.thread17;

public class IntegerTest2 {
	public static void main(String[] args) {
		Integer i = 10;
		Object obj = i;	// Object 타입으로 업캐스팅
		
		int n = (Integer) obj;	// 다운캐스팅
	}
}
