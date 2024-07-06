package basic15.thread03;

public class CreateAndStartThread_M2C1 {
	public static void main(String[] args) {
		Runnable r = new SMIFileRunnable();
		Thread thread = new Thread(r);
		thread.start();
		
		int[] intArray = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}
