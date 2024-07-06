package basic11.interfaceex10;

public class RemoteTest {
	public static void main(String[] args) {
		RemoteControl tv = new LgRemoteTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}
}
