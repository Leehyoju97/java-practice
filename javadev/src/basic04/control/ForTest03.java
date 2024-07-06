package basic04.control;
/*
 1부터 100까지 정수 중 3의 배수의 합계를 구하세요
 */
public class ForTest03 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if ( i % 3 == 0)
				sum += i;
		}
		
		/*for(int i = 0; i <= 1000; i+=3) {
			sum += i;
		}*/
		System.out.println("1부터 100까지 정수 중 3의 배수의 합계는 " +sum);
		
	}

}
