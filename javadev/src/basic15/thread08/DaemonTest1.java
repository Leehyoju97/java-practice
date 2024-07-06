package basic15.thread08;

public class DaemonTest1 {
	public static void main(String[] args) {
		Thread thread = new MyThread();
//		thread.setDaemon(false);	// 일반 스레드(기본 디폴트)
		thread.setDaemon(true); 	// 데몬 스레드
		thread.setName("thread1");
		thread.start();
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main Thread 종료");
	}
}
