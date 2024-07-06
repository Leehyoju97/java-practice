package basic19.fileex;

import java.io.File;

public class FileMethods {
	public static void main(String[] args) {
		File tempDir = new File("C:/dev/temp");
		
		if (!tempDir.exists()) {
			tempDir.mkdir();
		}
		
		File file = new File("C:/Windows");
		
		System.out.println("절대 경로: " + file.getAbsolutePath());
		System.out.println("폴더(?): " + file.isDirectory());
		System.out.println("파일(?): " + file.isFile());
		System.out.println("파일/폴더명: " + file.getName());
		System.out.println("부모 폴더: " + file.getParent());
		
		File newFile1 = new File("C:/dev/temp/abc");
		System.out.println(newFile1.mkdir());
		
		File newFile2 = new File("C:/dev/temp/bcd/cde");
		System.out.println(newFile2.mkdir());
		System.out.println(newFile2.mkdirs());
		
		File[] fnames = file.listFiles();
		
		for (File fname: fnames) {
			System.out.println((fname.isDirectory()? "폴더 " : "파일: ") + fname.getName());
		}
	}
}
