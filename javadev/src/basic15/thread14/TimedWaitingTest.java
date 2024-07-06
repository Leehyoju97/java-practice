package basic15.thread14;

public class TimedWaitingTest {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2(myThread1);
		
		myThread1.start();
		myThread2.start();
		
		try {
			Thread.sleep(100);	// 스레드 시작 준비 시간
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
		
		myThread2.interrupt(); // TIMED_WAITING -> RUNNABLE 
		
		try {
			Thread.sleep(100);	// 인터럽트 준비 시간
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("MyThread1 State = " + myThread1.getState());
		System.out.println("MyThread2 State = " + myThread2.getState());
	}
}
