package basic11.abstractex1;

public class Circle extends Shape {
	int r = 10;
	
	@Override
	public void area() {
		res = r * r * 3.14;
	}
}
