package oop.class02;

public class A {
	int m = 3;
	int n = 4;
	
	void work1() {
		int k = 5;	// 지역 변수
		System.out.println(k);
		work2(3);
	}

	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}
}
