package basic19.fileex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BuffedInputOutputStream {
	public static void main(String[] args) {
		File orgFile = new File("src/basic19/fileex/m1.jpg");
		File copyfile1 = new File("src/basic19/fileex/m2.jpg");
		File copyfile2 = new File("src/basic19/fileex/m3.jpg");
		
		long start, end, time1, time2;
		
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(orgFile)) {
			OutputStream os = new FileOutputStream(copyfile1);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			int data;
			while ((data = is.read()) != -1) {
				os.write(data);
			} 
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		end = System.nanoTime();
		time1 = end - start;
		
		System.out.println("With BufferedStream : " + time1);
		
		start = System.nanoTime();
		
		try(InputStream is = new FileInputStream(orgFile)) {
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile2);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			} 
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		end = System.nanoTime();
		
		time2 = end - start;
		
		System.out.println("With BufferedStream : " + time2);
		System.out.println("Ratio of with and without: " + time1 / time2);
	}
}
