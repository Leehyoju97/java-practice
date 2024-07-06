package basic15.thread12;

public class ThreadStateTest2 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("t1");
		t1.yieldFlag = false;
		t1.setDaemon(true);
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("t2");
		t2.yieldFlag = false;
		t2.setDaemon(true);
		t2.start();
		
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			t1.yieldFlag = !t1.yieldFlag;
			t2.yieldFlag = !t2.yieldFlag;
		}
	}
}
