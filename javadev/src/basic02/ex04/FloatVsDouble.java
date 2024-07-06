package basic02.ex04;

public class FloatVsDouble {
	public static void main(String[] args) {
		
		// float의 정밀도(대략 소수 7자리)
		float f1 = 1.000_0001f;
		System.out.println(f1);
		float f2 = 1.000_00001f;
		System.out.println(f2); // 오차 발생
		
		// double의 정밀도(대략 소수 15자리)
		double d1 = 1.000_000_000_000_001;
		System.out.println(d1);
		double d2 = 1.000_000_000_000_0001;
		System.out.println(d2); // 오차 발생
		double d3 = 5; // double 로 자동 형변환
		System.out.println(d3);
	}

}
