package basic19.fileex;

import java.io.UnsupportedEncodingException;

public class UTF16vsUTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1 = "abc".getBytes("UTF-16");
		byte[] b2 = "abc".getBytes("UTF-8");
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		for (byte b: b1) {	// FE FF 00 61 00 62 00 63 
			System.out.printf("%02X ", b);
		}
		
		System.out.println();
		
		for (byte b: b2) {	// 61 62 63
			System.out.printf("%02X ", b);
		}
		
		System.out.println();
		
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		System.out.println();
		
		
		byte[] b3 = "가나다".getBytes("UTF-16");
		byte[] b4 = "가나다".getBytes("UTF-8");
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		for (byte b: b3) {	// FE FF AC 00 B0 98 B2 E4 
			System.out.printf("%02X ", b);
		}
		
		System.out.println();
		
		for (byte b: b4) {	// EA B0 80 EB 82 98 EB 8B A4 
			System.out.printf("%02X ", b);
			/*
			 	1110xxxx		11111010 <- EA
			 	10xxxxxx		10110000 
			 	10xxxxxx		10000000
			 */
		}
		
		System.out.println();
		
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
		System.out.println();
	}
}
