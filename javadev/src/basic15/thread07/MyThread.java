package basic15.thread07;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < 1000_000_000_000000000L; i++) {
			System.out.println(getName() + "우선순위: " + getPriority());
		}
	}
	
}
