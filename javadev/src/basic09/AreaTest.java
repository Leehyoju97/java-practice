package basic09;

import java.util.Scanner;

public class AreaTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("넓이를 계산할 도형은? 1.원, 2.삼각형, 3.삼각형 > ");
		int choice = sc.nextInt();
		int area = 0;
		
		if (choice == 1) {
			System.out.println("원의 넓이를 계산합니다.");
			System.out.print("반지름을 입력하세요 > ");
			int radius = sc.nextInt();
			Circle circle = new Circle(radius);
			area = circle.getArea();
			circle.print(area);
		} else if (choice == 2) {
			System.out.println("사각형의 넓이를 계산합니다.");
			System.out.print("가로 길이를 입력하세요 > ");
			int width = sc.nextInt();
			System.out.print("세로 길이를 입력하세요.");
			int height = sc.nextInt();
			Rectangle rectangle = new Rectangle(width, height);
			area = rectangle.getArea();
			rectangle.print(area);
		} else if (choice == 3) {
			System.out.println("삼각형의 넓이를 계산합니다.");
			System.out.print("밑변 길이를 입력하세요 > ");
			int width = sc.nextInt();
			System.out.print("높이 길이를 입력하세요.");
			int height = sc.nextInt();
			Triangle triangle = new Triangle(width, height);
			area = triangle.getArea();
			triangle.print(area);
		}
	}
}
