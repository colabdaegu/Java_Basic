package chap003;
import java.util.Scanner;

public class Code03_homework {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 1==>");
		int numFirst = s.nextInt();
		System.out.print("숫자 2==>");
		int numSecond = s.nextInt();
		
		System.out.println(numFirst + "+" + numSecond + "=" + (numFirst + numSecond));
		System.out.println(numFirst + "*" + numSecond + "=" + (numFirst * numSecond));
		System.out.println(numFirst + "/" + numSecond + "=" + (numFirst / numSecond));
		System.out.println(numFirst + "%" + numSecond + "=" + (numFirst % numSecond));
		
		s.close();
	}

}
