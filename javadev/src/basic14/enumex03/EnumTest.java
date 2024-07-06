package basic14.enumex03;

public class EnumTest {
	public static void main(String[] args) {
		whoAreYou(Person.MAN);
		
		Person myFriend = Person.WOMAN;
//		Person myFriend2 = Animal.CAT;
	}
	
	private static void whoAreYou(Person man) {
		switch (man) {
		case MAN:
			System.out.println("남성입니다.");
			break;
		case WOMAN:
			System.out.println("여성입니다.");
			break;
		case BABY:
			System.out.println("아기입니다.");
			break;
		}
	}
}
