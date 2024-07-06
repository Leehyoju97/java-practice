package basic15.thread08;

public class DaemonTest2 {
	public static void main(String[] args) {
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);	// 일반 스레드(기본 디폴트)
		thread1.setName("일반스레드");
		thread1.start();
		
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);	// 데몬스레드
		thread2.setName("데몬스레드");
		thread2.start();
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main Thread 종료");
	}
}
