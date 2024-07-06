package basic19.fileex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_2 {
	public static void main(String[] args) throws IOException {
		File inFile = new File("src/basic19/fileex/FileInputStream1.txt");
		InputStream is1 = new FileInputStream(inFile);
		int data;
		
		while ((data = is1.read()) != -1) {
			System.out.print((char) data);
		}
		
		is1.close();
		
		System.out.println();
		System.out.println();
		
		InputStream is2 = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[9];
		int count1;
		
		while ((count1 = is2.read(byteArray1)) != -1) {
			for (int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.print(": count1 = " + count1);
		}
		
		is2.close();
		System.out.println();
		System.out.println();
		
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[9];
		
		int offset = 3;
		int length = 6;
		int count2 = is3.read(byteArray2, offset, length);
		
		for (int i = 0; i < offset; i++) {
			System.out.print((char) byteArray2[i]);
		}
		is3.close();
	}
}
