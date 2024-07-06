package basic19.fileex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2 {
	public static void main(String[] args) throws IOException {
		File outFile = new File("src/basic19/fileex/FileOutputStream2.txt");
		OutputStream os2 = new FileOutputStream(outFile, true);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os2.write(byteArray1);
		os2.write('\n');
		os2.flush();
		os2.close();
		
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		os3.write(byteArray2, 6, 6);
		os3.flush();
		os3.close();
	}
}
