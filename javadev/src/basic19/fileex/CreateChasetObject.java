package basic19.fileex;

import java.nio.charset.Charset;

public class CreateChasetObject {
	public static void main(String[] args) {
		Charset cs1 = Charset.defaultCharset();
		Charset cs2 = Charset.forName("MS949");
		Charset cs3 = Charset.forName("UTF-8");
		
		System.out.println(cs1);
		System.out.println(cs2);
		System.out.println(cs3);
		System.out.println();
		System.out.println(Charset.isSupported("MS949"));
		System.out.println(Charset.isSupported("UTF-8"));
	}
}
