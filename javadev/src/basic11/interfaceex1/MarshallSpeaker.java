package basic11.interfaceex1;

public class MarshallSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("MarshallSpeaker : 볼륨을 키웁니다.");
		
	}

	@Override
	public void soundDown() {
		System.out.println("MarshallSpeaker : 볼륨을 줄입니다.");
	}

}
