package basic01.ex03;

public class DataType {
	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println("b1 : " + b1);
		
		//char c = 'A';
		char c = 54620;
		System.out.println("c : " + c);
		
		byte b2 = 127;
		System.out.println("b2 : " + b2);
		
		short s = 32767;
		System.out.println("s : " + s);
		
		int i = 2147483647;
		System.out.println("i : " + i);
		
		long l1 = 2147483648L;
		System.out.println("l1 : " + l1);
		
		double d = 3.1415926535;
		System.out.println("d : " + d);
		
		float f = 3.1415926535f;
		System.out.println("f : " + f);
		
		String str = """
				만나서 반갑습니다.
				좋은 하루되세요.
				"""; //문자를 블록 단위로 줄 때
		
		System.out.println(str);
		//escape squence
		System.out.println("그가 말했다. \"안녕하세요\"");
		System.out.println("안녕하세요\n반갑습니다.");
		System.out.println("0\t1\t2\t3");
	}
}

