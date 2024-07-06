package basic09;

public class Rectangle {
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	public void print(int area) {
		System.out.printf("사각형의 넓이는 %d입니다.", area);
	}
}
