package oop.class03;

public class InternalCallMethods {
	public static void main(String[] args) {
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 5.8);
		System.out.println(b);
	}

	private static void print() {
		System.out.println("안녕");
		
	}

	private static int twice(int k) {
		return k * 2;
	}

	private static double sum(int m, double n) {
		return m + n;
	}
}
