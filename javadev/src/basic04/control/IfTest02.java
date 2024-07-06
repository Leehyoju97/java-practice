package basic04.control;

import java.util.Scanner;

/*
  score(if)
  0부터 100사이의 점수를 입력해서 (Scanner 클래스 이용)
  90점 이상이면 A
  80점 이상 90점 미만이면 B
  70점 이상 80점 미만이면 C
  60점 이상 70점 미만이면 D
  그 외에는 F를 출력해라.
  
 */
public class IfTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("점수를 입력하시오 :");
			int n = sc.nextInt();
			
			if(n>=90) System.out.println("A");
			else if(n>=80)System.out.println("B");
			else if(n>=70) System.out.println("C");
			else if(n>=60) System.out.println("D");
			else System.out.println("F");
			
			
			sc.close();
	}

}
