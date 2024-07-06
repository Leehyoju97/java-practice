package basic19.fileex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderWriter {
	public static void main(String[] args) {
		File readerWriterFile = new File("src/basic19/fileex/BufferedFile.txt");
		
		try (Writer writer = new FileWriter(readerWriterFile);
				BufferedWriter bw = new BufferedWriter(writer); ) {
			bw.write("안녕하세요\n".toCharArray());
			bw.write("Hello");
			bw.write('\r');
			bw.write('\n');
			bw.write("반갑습니다.", 2, 3);
			bw.flush();
		} catch(IOException e) {
			
		}
		
		try (Reader reader = new FileReader(readerWriterFile)) {
			BufferedReader br = new BufferedReader(reader);
			String data;
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {}
	}
}
