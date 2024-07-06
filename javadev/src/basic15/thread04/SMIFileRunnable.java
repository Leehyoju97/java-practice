package basic15.thread04;

public class SMIFileRunnable implements Runnable {

	@Override
	public void run() {
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("- 자막번호" + strArray[i]);
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {}
	}
}
