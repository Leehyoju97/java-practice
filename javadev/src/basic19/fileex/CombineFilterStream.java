package basic19.fileex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CombineFilterStream {
	public static void main(String[] args) throws IOException {
		File dataFile = new File("src/basic19/fileex/file2.data");
		
		try (OutputStream os = new FileOutputStream(dataFile);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				DataOutputStream dos = new DataOutputStream(bos);) {
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		}
		
		try (InputStream is = new FileInputStream(dataFile);
				BufferedInputStream bis = new BufferedInputStream(is);
				DataInputStream dis = new DataInputStream(bis);) {
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}
	}
}
