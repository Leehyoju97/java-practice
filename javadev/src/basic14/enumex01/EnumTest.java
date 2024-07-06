package basic14.enumex01;

public class EnumTest {
	public static void main(String[] args) {
		whoAreYou(Person.MAN);
		whoAreYou(Animal.DOG);
		
		int myFriend = Person.MAN;
		
		if (myFriend == Animal.CAT) {
			System.out.println("고양이 o");
		} else {
			System.out.println("고양이 x");
		}
	}

	private static void whoAreYou(int man) {
		switch (man) {
		case Person.MAN:
			System.out.println("남성입니다.");
			break;
		case Person.WOMAN:
			System.out.println("여성입니다.");
			break;
		case Person.BABY:
			System.out.println("아기입니다.");
			break;
		}
	}
}
