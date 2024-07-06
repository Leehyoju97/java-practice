package basic15.thread14;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < 1000_000_000_000000000L; i++) {}
	}
	
}
