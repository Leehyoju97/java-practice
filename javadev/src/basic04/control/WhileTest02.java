package basic04.control;
/*
 1-1000까지의 정수 중 3의 배수의 합계를 구하세요. while
 */
public class WhileTest02 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while( i <= 1000) {
			if ( i % 3 == 0)
				sum += i;
				i++;
		}
		
		System.out.println("1부터 100까지 정수 중 3의 배수의 합계는 " +sum);
	}
		
	}

