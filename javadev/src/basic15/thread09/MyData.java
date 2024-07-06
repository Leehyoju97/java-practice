package basic15.thread09;

public class MyData {
	int data = 3;
	
	public synchronized void plusData() {
		int mydata = data;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		data = mydata + 1;
	}
}
