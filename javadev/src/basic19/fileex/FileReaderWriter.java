package basic19.fileex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriter {
	public static void main(String[] args) throws IOException {
		File readerWriterFile = new File("src/basic19/fileex/ReaderWriterFile.txt");
		
		try (Writer writer = new FileWriter(readerWriterFile)) {
			writer.write("안녕하세요\n".toCharArray());
			writer.write("Hello");
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다.", 2, 3);
			writer.flush();
		} catch (IOException e) {}
		try (Reader reader = new FileReader(readerWriterFile)) {
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {}
	}
}
