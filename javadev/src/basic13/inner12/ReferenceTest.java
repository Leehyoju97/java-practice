package basic13.inner12;

public class ReferenceTest {
	public static void main(String[] args) {
		RefMe r1 = new RefMe();
		RefMe r2 = r1;
		r1 = null;
		System.gc(); // 강제로 gc 요청
		
		r2 = null;
		System.gc();
		System.out.println("종료");
	}
}
