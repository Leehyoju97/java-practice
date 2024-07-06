package basic11.interfaceex10;

public class LgRemoteTV extends RemoteTV {

	@Override
	public void channelDown() {
		System.out.println("RemoteTV 채널을 내립니다.");
	}

}
