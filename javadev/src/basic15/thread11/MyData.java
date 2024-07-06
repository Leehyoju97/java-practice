package basic15.thread11;

public class MyData {
	synchronized void abc() {	// this: 메서드 동기화
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "sec");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void bcd() {	// this : 메서드 동기화
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void cde() {
		/*
		synchronized (this) {	// this : 블록 동기화
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		*/
		synchronized (new Object()) {	// this : 블록 동기화
			for (int i = 0; i < 3; i++) {
				System.out.println(i + "번째");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
