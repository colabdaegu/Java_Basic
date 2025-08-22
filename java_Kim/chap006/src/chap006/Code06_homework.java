package chap006;
import java.util.Scanner;

public class Code06_homework {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start_num;
		System.out.print("초기값 ==> ");
		start_num = s.nextInt();
		
		int end_num;
		System.out.print("끝값 ==> ");
		end_num = s.nextInt();
		
		int plus_num;
		System.out.print("증갓값 ==> ");
		plus_num = s.nextInt();
		
		int total = 0;
		for (int i=start_num; i<=end_num; i+=plus_num) {
			total+=i;
		}

		
		System.out.println(start_num + "부터 " + end_num + "까지 " + plus_num + "씩 증가한 합계는 " + total + "입니다.");
		
		s.close();
	}

}
