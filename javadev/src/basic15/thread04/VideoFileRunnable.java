package basic15.thread04;

public class VideoFileRunnable implements Runnable {

	@Override
	public void run() {
		int[] intArray = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("(비디오 프레임) " + intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}

}
