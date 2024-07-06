package basic14.enumex04;

import java.util.Scanner;

public class EnumTest2 {
	public static void main(String[] args) {
		System.out.print("SEOUL, BUSAN, JEJU >> ");
		Scanner sc = new Scanner(System.in);
		
		String where = sc.nextLine();
		where = where.toUpperCase();	// 대문자로 변환
		
		City city = City.valueOf(where);
		
		switch (city) {
		case SEOUL: System.out.println("서울 인구 : " + city.getPopulation());
		break;
		case BUSAN: System.out.println("부산 인구 : " + city.getPopulation());
		break;
		case JEJU: System.out.println("제주 인구 : " + city.getPopulation());
		break;
		}
	}
}
