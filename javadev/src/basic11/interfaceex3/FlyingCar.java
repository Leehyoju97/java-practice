package basic11.interfaceex3;

public class FlyingCar implements Drivable, Flyable {

	@Override
	public void fly() {
		System.out.println("fly");
	}

	@Override
	public void drive() {
		System.out.println("drive");
	}

}
