package basic04.control;

import java.util.Scanner;

/*
 switch~case
 1:남자
 2:여자
 3:남자
 4:여자
 defalut: 에러
 */
public class SwitchTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
			System.out.print("남자는 1, 3 여자는 2, 4입력:");
			int n = sc.nextInt();
			
			switch(n) {
			case 1, 3:
				System.out.println("남자");
				break;
			case 2, 4:
				System.out.println("여자");
				break;	
			default:
				System.out.println("에러");
				break;
			}
		
	}

}
