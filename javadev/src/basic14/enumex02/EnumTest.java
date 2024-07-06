package basic14.enumex02;

public class EnumTest {
	public static void main(String[] args) {
		Person man = Person.WOMAN;
		
		if (man == Person.MAN) {
			System.out.println("남자");
		} else if (man == Person.WOMAN) {
			System.out.println("여자");
		} else {
			System.out.println("아기");
		}
		
//		if (man == Animal.DOG) {
//			System.out.println("사람이 아님");
//		}
	}
}
