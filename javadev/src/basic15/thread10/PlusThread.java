package basic15.thread10;

public class PlusThread extends Thread {
	MyData myData;
	
	public PlusThread(MyData myData) {
		this.myData = myData;
	}

	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과: " + myData.data);
	}
	
	
}
