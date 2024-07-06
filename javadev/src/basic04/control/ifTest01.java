package basic04.control;

public class ifTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		
		if(n == 1) {
			System.out.println("남자"); // 한 문장일 때 중괄호 생략 가능
		}else if(n == 2){
			System.out.println("여자");
		}else {
			System.out.println("에러");
		}
		
		System.out.println("종료");
	}

}
