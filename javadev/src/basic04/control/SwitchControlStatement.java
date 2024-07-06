package basic04.control;

public class SwitchControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = 2;
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		System.out.println();
		
		
		int value2 = 2;
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
		}
		System.out.println();
		
		// if - else if - else 구문으로 변환
		if(value1 == 1) {
			System.out.println("A");
		}
		else if(value1 == 2) {
			System.out.println("B");
		}
		else if(value1 == 3) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}

	}

}
