package chap10;

public class chap11_06 {

	public static void main(String[] args) throws Exception {
		
		int[] ary = {10, 20, 30};
		
		try {
			ary[3] = 1234;
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
	}
}
