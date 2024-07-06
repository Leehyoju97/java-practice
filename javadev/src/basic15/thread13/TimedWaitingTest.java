package basic15.thread13;

public class TimedWaitingTest {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {
			Thread.sleep(100);	// 스레드 시작 준비 시간
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread State = " + myThread.getState());
		
		myThread.interrupt(); // Timed_WAITING -> runnable 상태 전환
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread State = " + myThread.getState());
	}
}
