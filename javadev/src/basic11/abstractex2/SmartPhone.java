package basic11.abstractex2;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void internetSearch() {
		System.out.println(owner + "의 폰으로 인터넷을 검색합니다.");
	}
}
