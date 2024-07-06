package basic15.thread10;

public class TheNeedsForSynchronized {
	public static void main(String[] args) {
		MyData myData = new MyData();
		
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
