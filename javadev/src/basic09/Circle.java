package basic09;

public class Circle {
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getArea() {
		return (int) (radius * radius * 3.14);
	}
	
	public void print(int area) {
		System.out.printf("원의 넓이는 %d입니다.", area);
	}
}
