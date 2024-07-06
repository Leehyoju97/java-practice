package basic04.control;

import java.util.Scanner;

/*
 향상된 switch~case문
 계절을 출력합니다. 현재 월을 입력하세요 : 8
 
 */
public class SwitchTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계절을 출력합니다. 현재 월을 입력하세요 :");
		int n = sc.nextInt();
		
		String s = switch(n) {
			case 3, 4, 5, 6 -> "봄";
			case 7, 8 -> "여름";
			case 11, 12, 1, 2 -> "겨울";
			default -> "가을";
		};
		
		System.out.println(s);
		

	}

}
