package basic15.thread04;

public class CreateAndStartThread_M2C1 {
	public static void main(String[] args) {
		Runnable r = new SMIFileRunnable();
		Thread thread1 = new Thread(r);
		thread1.start();
		
		Runnable r2 = new VideoFileRunnable();
		Thread thread2 = new Thread(r2);
		thread2.start();
		
	}
}
