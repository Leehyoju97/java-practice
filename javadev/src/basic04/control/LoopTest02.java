package basic04.control;

public class LoopTest02 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j > i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("종료");

	}
	}

