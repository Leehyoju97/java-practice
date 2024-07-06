package basic15.thread11;

public class MethodAndBlockSynchTest {
	public static void main(String[] args) {
		MyData myData = new MyData();
		
		new Thread() {
			
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {
			
			public void run() {
				myData.bcd();
			}
		}.start();
		
		new Thread() {
			
			public void run() {
				myData.cde();
			}
		}.start();
	}
}
