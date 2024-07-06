package basic15.thread16;

public class WaitingTest {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		Thread t1 = new Thread() {

			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.inputData(i);
				}
			}
			
		};
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				for (int i = 1; i < 9; i++) {
					dataBox.outputData();
				}
			}
			
		};
		
		t1.start();
		t2.start();
	}
}
