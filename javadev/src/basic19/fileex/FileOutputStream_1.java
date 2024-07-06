package basic19.fileex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		File outfile = new File("src/basic19/fileex/FileOutputStream1.txt");
		OutputStream os1 = new FileOutputStream(outfile);
		
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');
		os1.write('\n');
		os1.flush();
		os1.close();
		
		OutputStream os3 = new FileOutputStream(outfile, true);
		byte[] byteArray2 = "Better the last smile than the first laugher".getBytes();
		os3.write(byteArray2, 7, 8);
		os3.flush();
		os3.close();
	}
}
