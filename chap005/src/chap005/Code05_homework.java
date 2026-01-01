package chap005;
import java.util.Scanner;

public class Code05_homework {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score;
		
		score = (int)(Math.random() * 101);
		
		System.out.println(score);
		
		if (score >= 90)
			System.out.print("장학생입니다~~");
		else if (score >= 60)
			System.out.print("합격입니다~~");
		else
			System.out.print("불합격입니다~~");
		
		System.out.println(" 학점입니다.");
		s.close();
	}

}
