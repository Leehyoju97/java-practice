package basic04.control;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		int c1, c2, c3;
		int h1, h2, h3;
		int s, b;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		//컴퓨터의 임의의 숫자 3개
		c1 = (int)(Math.random()*10);
		
		do {
			c2 = (int) (Math.random() * 10);
		} while (c2==c1);
		
		do {
			c3 = (int) (Math.random() * 10);
		} while (c3==c1 || c3==c2);
		
		//System.out.println(c1 + "," + c2 + "," + c3);
		
		do {
			cnt++;
			s = b = 0;
			
			System.out.print("0~9 사이의 서로다른 숫자 3개 입력(ex. 1 2 3): ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
			
			if(h1==c1) s++;
			else if(h1==c2 || h1==c3) b++;
			
			if(h2==c2) s++;
			else if(h2==c1 || h2==c3) b++;
			
			if(h3==c3) s++;
			else if(h3==c1 || h3==c2) b++;
			
			System.out.println("["+s+"S"+b+"B"+"]");
		}while(s!=3);
		System.out.println("축하합니다. "+cnt+"번만에 맞추셨습니다.");
		sc.close();
	}

}
