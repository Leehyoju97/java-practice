package basic11.interfaceex1;

import java.io.FileInputStream;
import java.util.Properties;

public class TvUser {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/basic11/interfaceex1/product.properties"));
		String tvName = prop.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		
		
		TV tv = (TV) tvClass.getConstructor().newInstance();
		String speakerName = prop.getProperty("speaker");
		
		Class speakerClass = Class.forName(speakerName);
		Speaker speaker = (Speaker) speakerClass.getConstructor().newInstance();
		tv.setSpeaker(speaker);
		
//		TV tv = new LgTV();
		tv.turnOn();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}
}
