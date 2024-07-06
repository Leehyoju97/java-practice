package basic02.ex07;

public class TypeCasting_1 {
public static void main(String[] args) {
	
	// 캐스팅 방법 1: 자료형
	int value1 = (int)5.3; // 5로 데이터 손실
	long value2 = (long)10; // 그릇이 커서 형변환 안해도됨.
	float value3 = (float)5.8;
	double value4 = (double)16; // 실수 기본 자료형이 더블이기 때문에 형변환 안해도 됨.
	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println(value4);
	System.out.println();
	
	// 캐스팅 방법 2: L, F
	long value5 = 10L; //롱 타입이 인트보다 그릇이 크기 때문에 따로 형변환 하지 않아도 됨.
	long value6 = 10l; // 다른 문자와 헷갈릴 수 있기 때문에 지양
	float value7 = 5.8F;
	float value8 = 5.8f;
	System.out.println(value5);
	System.out.println(value6);
	System.out.println(value7);
	System.out.println(value8);
	
}
}
