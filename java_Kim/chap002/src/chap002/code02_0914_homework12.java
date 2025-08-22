package chap002;
import java.util.Scanner;

public class code02_0914_homework12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디 ==> ");
		String id = s.next();
		System.out.print("이름 ==> ");
		String name = s.next();
		System.out.print("메일 ==> ");
		String mail = s.next();
		
		System.out.println("아이디는 " + id + "이며, 이름은 " + name + "이며, 이메일은 " + mail + "입니다");
		
		s.close();
	}

}
