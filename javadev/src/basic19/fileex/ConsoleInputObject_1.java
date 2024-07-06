package basic19.fileex;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputObject_1 {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		int data;
		
		while ((data = is.read()) != '\r') {
			System.out.println("읽은 데이터: " + (char)data + "남은 바이트 수: " + is.available());
		}
		System.out.println(data);
		System.out.println(is.read());
	}
}
