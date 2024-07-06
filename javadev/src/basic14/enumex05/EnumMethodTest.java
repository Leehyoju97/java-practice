package basic14.enumex05;

public class EnumMethodTest {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// 2. ordinal() 메소드 : 전체 열거 객체 중에서 몇번째 열거 객체인지
		int ordinal = today.ordinal();
		System.out.println(ordinal);	//0번부터 시작
		
		// 3. compareTo() 메서드 : 매개값으로 주어진 열거 객체를 기준으로 몇 번째 위치하는지 알려주는 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1);
		System.out.println(result2);
		
		// 4.values() 메서드 : 열거 타입의 모든 객체들을 배열로 만들어 리턴. 배열의 인덱스는 열거 객체의 순번과 같음
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}
	}
}
