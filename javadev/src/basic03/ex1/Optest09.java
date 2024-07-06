package basic03.ex1;

import java.util.Scanner;

public class Optest09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("남자면 1,3 여자면 2, 4 입력 :");
		int n = sc.nextInt();
		
		
		System.out.println(
				n==1 || n==3 ? "남자입니다." : 
				n==2 || n==4 ? "여자입니다." :
					           "에러입니다.");
	}

}
