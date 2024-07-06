package basic15.thread12;

public class ThreadStateTest1 {
	public static void main(String[] args) {
		Thread.State state;
		
//		Thread.State[] ts = Thread.State.values();
//		for (Thread.State s : ts) {
//			System.out.println(s);
//		}
		
		// 1. 객체 생성
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 1000_000_000L; i++) {}
			};
		};
		
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		// 스레드 시작
		myThread.start();
		state = myThread.getState();
		System.out.println("myThread state = " + state);
		
		
		// 스레드 종료
		try {
			myThread.join();
		} catch (InterruptedException e) {}
		
		state = myThread.getState();
		System.out.println("myThread state = " + state);
	}
}
