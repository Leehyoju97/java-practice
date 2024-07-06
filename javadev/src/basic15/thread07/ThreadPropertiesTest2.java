package basic15.thread07;

public class ThreadPropertiesTest2 {
	public static void main(String[] args) {
		System.out.println("코어 수: " + Runtime.getRuntime().availableProcessors());
		
		// 우선순위 자동 지정
		for (int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		for (int i = 0; i < 15; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 쓰레드");
			if (i == 9) thread.setPriority(10);
			thread.start();
		}
	}
}
