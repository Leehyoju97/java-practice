package basic04.control;

/*
    * 1행은 *을 5열부터
   ** 2행은 *을 4,5열부터
  *** 3행은 *을 3,4,5열부터
 **** 4행은 *을 2,3,4,5열부터
***** 5행은 *을 1,2,3,4,5열부터

ㅑ
 */
public class LoopTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j <= 5; j++) {
				if(j>=6-i) {
					System.out.print("*");
					}
				else System.out.print(" ");
			}System.out.println();
		}
		System.out.println("종료");

	}

}
