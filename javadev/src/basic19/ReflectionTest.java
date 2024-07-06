package basic19;

public class ReflectionTest {
	public static void main(String[] args) {
		Worker worker = new Worker("정대만", Worker.POSITION_MANAGER);
		
		Class cls1 = worker.getClass();
		
		Class cls2 = Worker.class;
		
		Class cls3 = null;
		try {
			cls3 = Class.forName("basic19.Worker");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("cls1.hashCode : " + cls1.hashCode());
		System.out.println("cls2.hashCode : " + cls2.hashCode());
		System.out.println("cls3.hashCode : " + cls3.hashCode());
	}
}
