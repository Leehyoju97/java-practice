package basic11.abstractex1;

public class Triangle extends Shape {
	int w = 10;
	int h = 5;
	
	@Override
	public void area() {
		res = w * h / 2;
	}
}
