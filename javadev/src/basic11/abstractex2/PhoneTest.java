package basic11.abstractex2;

public class PhoneTest {
	public static void main(String[] args) {
		Phone phone = new SmartPhone("손흥민");
		phone.turnOn();
		phone.internetSearch();
		phone.turnOff();
	}
}
