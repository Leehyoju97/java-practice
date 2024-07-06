package basic15.thread13;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(3000);	//3초동안 일시정지
		} catch (InterruptedException e) {
			System.out.println("--sleep() 진행 중 interrupt() 발생");
			for (long i = 0; i < 1000_000_000_000000000L; i++) {}
		}
	}
	
}
