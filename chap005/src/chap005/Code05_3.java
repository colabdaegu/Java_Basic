package chap005;
import java.util.Scanner;

public class Code05_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score;
		
		System.out.print("점수 입력 ==> ");
		score = s.nextInt();
		
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("A입니다");
				break;
			case 8:
				System.out.println("B입니다");
				break;
			case 7:
				System.out.println("C입니다");
				break;
			case 6:
				System.out.println("D입니다");
				break;
			default:
				System.out.println("F입니다");
		}
		
		s.close();
		
	}

}
