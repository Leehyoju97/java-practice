package basic15.thread14;

public class MyThread2 extends Thread {

	MyThread1 myThread1;
	
	public MyThread2(MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		try {
			myThread1.join(3000);
		} catch (InterruptedException e) {
			System.out.println("--join(...) 진행 중 interrupt() 발생");
			for (long i = 0; i < 1000_000_000L; i++) {}
		}
	}
	
}
