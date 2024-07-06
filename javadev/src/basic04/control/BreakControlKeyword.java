package basic04.control;

public class BreakControlKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단일 반복문 탈출
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			break;
		}
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		//다중 반복문 탈출
		// @1개의 반복문만 탈출할 때
		/*for(int j = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();*/
		
		//@break + Label문으로 다중 반복문 탈출
		POS1: for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 2) {
					break POS1;
				}
			}
		}

	}

}
