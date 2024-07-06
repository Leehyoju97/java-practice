package basic05.String;

import java.util.Scanner;

/*
  Game Start~~~!
    oop -> oop
    
    constructor -> constructor
    
    information -> information
 */
public class TypingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] keywords = {
		"oop", "primitive type", "for", "while",
		"Scanner", "constructor", "instance",
		"class", "inheritance", "information hiding"

	};
		
		int[] item = new int[5];
		
		for(int i = 0; i<item.length; i++) {
			item[i] = (int)(Math.random()*keywords.length);
			for(int j = 0; j< i; j++) {
				if(item[i]==item[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("Game Start~~~!");
		long startTime = System.currentTimeMillis(); //시간 측정 시작
		for(int i=0; i<item.length; i++) {
			System.out.print(keywords[item[i]] + "->");
			String input = sc.nextLine(); //단어 입력받기
			if(!input.equals(keywords[item[i]])) {
				System.out.println("typing miss");
				i--;
			}
		}
		long endTime = System.currentTimeMillis(); // 시간 측정 끝
		System.out.println("총 소요 시간은 " + ((endTime - startTime)/1000 + " 초 입니다."));
	}
}
