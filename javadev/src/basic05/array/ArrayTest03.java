package basic05.array;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 90, 80, 70, },
				{90, 80, 70, 60, },
				{80, 70, 60, 50, }
		};
		System.out.println("\t\t[성적표]");
		System.out.println("===========================================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for(int row = 0; row<score.length; row++) {
			int total = 0;
			for(int col=0; col<score[row].length; col++) {
				System.out.print(score[row][col]+ "\t");
			total += score[row][col];
			}
			System.out.println(total + "\t" + (total/score[row].length));
			System.out.println();
		}
		System.out.println("===========================================");
	}

}
