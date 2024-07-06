package basic15.thread15;

public class MyBlockedTest {
	MyClass mc = new MyClass();
	Thread t1 = new Thread("thread1") {
		
		@Override
		public void run() {
			mc.syncMethod();
		}
	};
	
	Thread t2 = new Thread("thread2") {
		
		@Override
		public void run() {
			mc.syncMethod();
		}
	};
	
	Thread t3 = new Thread("thread3") {
		
		@Override
		public void run() {
			mc.syncMethod();
		}
	};
	
	void startAll() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	class MyClass {
		synchronized void syncMethod() {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {	// 스레드 시작 준비 시간
				System.out.println("====" + Thread.currentThread().getName() + "====");
				System.out.println("thread1 -> " + t1.getState());
				System.out.println("thread2 -> " + t2.getState());
				System.out.println("thread3 -> " + t3.getState());
				for (long i = 0; i < 1000_000_00000000L; i++) {}
			}
		}
	}
}
