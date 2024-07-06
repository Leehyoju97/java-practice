package basic11.interfaceex2;

public class BodyTest {
	public static void main(String[] args) {
		BodySign bs = new Pitcher();
		bs.throwBall(BodySign.CENTER);
		bs.throwBall(BodySign.RIGHT);
	}
}
