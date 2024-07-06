package basic19;

public class ReflectionTest4 {
	public static void main(String[] args) {
		Worker worker = new Worker("서태웅", Worker.POSITION_ASSISANT);
		
		Class<?> cls = worker.getClass();
		try {
			Object obj = cls.getConstructor().newInstance();
			
			if (obj instanceof Worker) System.out.println("Worker 클래스의 인스턴스입니다.");
			
			System.out.println("Worker.hashCode : " + worker.hashCode());
			System.out.println("obj.hashCode : " + obj.hashCode());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
