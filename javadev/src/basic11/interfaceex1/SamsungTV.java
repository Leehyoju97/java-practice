package basic11.interfaceex1;

public class SamsungTV implements TV {
	
	private Speaker speaker = new HamanSpeaker();
	
	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void turnOn() {
		System.out.println("samsungtv : 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("samsungtv : 전원을 끕니다.");
	}
	
	public void channelUp() {
		System.out.println("samsungtv : 채널을 올립니다.");
	}
	
	public void channelDown() {
		System.out.println("samsungtv : 채널을 내립니다.");
	}
	
	public void soundUp() {
		if (speaker == null) {
			System.out.println("samsungtv : 소리를 키웁니다.");
		} else {
			speaker.soundUp();
		}
	}
	
	public void soundDown() {
		if (speaker == null) {
			System.out.println("samsungtv : 소리를 줄입니다.");
		} else {
			speaker.soundUp();
		}
	}
}
