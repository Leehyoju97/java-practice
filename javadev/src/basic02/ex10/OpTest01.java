package basic02.ex10;

import java.util.Scanner;

public class OpTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // System.in은 기본 입력 장치 즉, 키보드 의미.
		
			System.out.print("정수 a값 입력 : ");
			int a = sc.nextInt();
			
			System.out.print("정수 b값 입력 : ");
			int b = sc.nextInt();
			
			System.out.println(a+"+"+b+"="+(a+b));
			System.out.println(a+"-"+b+"="+(a-b));
			System.out.println(a+"*"+b+"="+a*b);
			System.out.println(a+"/"+b+"="+a/b);
			System.out.println(a+"%"+b+"="+a%b);
			
			sc.close();
	}

}
