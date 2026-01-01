package chap003;
import java.util.Scanner;

public class Code03_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("시험 점수를 입력하세요. ");
		int score = s.nextInt();
		
		
		System.out.print("시험 점수가 70점 이상인가요? " + (score>=70));
		
		s.close();
	}

}
