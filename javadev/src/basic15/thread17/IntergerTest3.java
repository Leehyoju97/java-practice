package basic15.thread17;

public class IntergerTest3 {
	public static void main(String[] args) {
		//  -127 ~ 127은 미리 메모리에 할당해서 찾아쓴다.
		Integer a1 = Integer.valueOf(127);
		Integer a2 = Integer.valueOf(127);
		
		System.out.println(a1 == a2); // 위치 비교
		System.out.println(a1.equals(a2));	// 값 비교
		
		Integer b1 = Integer.valueOf(128);
		Integer b2 = Integer.valueOf(128);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}
}
