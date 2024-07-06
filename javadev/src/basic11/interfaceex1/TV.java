package basic11.interfaceex1;

public interface TV {
	public void turnOn();
	
	public void turnOff();
	
	public void channelUp();
	
	public void channelDown();
	
	public void soundUp();
	
	public void soundDown();
	
	public default void setSpeaker(Speaker speaker) {
		System.out.println("본체의 스피커로 출력합니다.");
	};
}
