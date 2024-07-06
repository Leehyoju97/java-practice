package basic15.thread06;

public class ThreadPropertiesTest {
	public static void main(String[] args) {
		// 객체 참조하기, 스레드의 개수 가져오기
		Thread currentThread = Thread.currentThread();
		System.out.println("현재 스레드의 이름 : " + currentThread.getName());
		System.out.println("동작하는 스레드의 개수 : " + Thread.activeCount());
		
		// 스레드의 자동 지정된 이름 확인
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 스레드의 이름 직접 지정
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			thread.setName(i + "번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}
		
		// 스레드 이름 자동 지정
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("동작하는 쓰레드의 개수 : " + Thread.activeCount());
	}
}
