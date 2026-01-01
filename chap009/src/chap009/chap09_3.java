package chap009;
import java.util.Scanner;

public class chap09_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int sum;
		
		System.out.print("숫자 : ");
		num1 = s.nextInt();
		
		System.out.print("숫자 : ");
		num2 = s.nextInt();
		
		System.out.print("숫자 : ");
		num3 = s.nextInt();
		
		System.out.print("숫자 : ");
		num4 = s.nextInt();
		
		sum = num1 + num2 + num3 + num4;
		System.out.print("합계 ==> " + sum);
		
		s.close();
	}

}
