package basic02.ex05;

public class PrimaryDataType_1 {
	public static void main(String[] args) {
		// boolean: true / false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool1);
		System.out.println();
		
		// 정수(byte, short, int, lont) : 음의 정수 / 0 / 양의 정수
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100l; // long 자료형으로 인식
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value2);
		System.out.println(value4);
		System.out.println();
		
		float value5 = 1.2f; // float 자료형으로 인식
		double value6 = -1.5;
		double value7 = 5; // 자동 형변환
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7); // 실숫값으로 출력
	}

}
