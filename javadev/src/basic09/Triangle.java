package basic09;

public class Triangle {
	int width;
	int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height / 2;
	}
	
	public void print(int area) {
		System.out.printf("삼각형의 넓이는 %d입니다.", area);
	}
}
