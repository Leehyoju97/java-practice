package basic15.thread02;

public class CreateAndStartThread_M1C1 {
	public static void main(String[] args) {
		Thread smiFileThread = new SMFileThread();
		smiFileThread.start();
		
		Thread videoFileThread = new VideoFileThread();
		videoFileThread.run();
	}
}
