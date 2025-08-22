package chpa004;

public class code04_0921_10 {

	public static void main(String[] args) {
		String str = "           한글    ABCD      efgh";
		String cutStr = "";
		
		cutStr=str.replaceAll(" ", "");
		
		System.out.println("기존 문자열 ==> [" + str + "]");
		System.out.println("공백 제거 ==> [" + cutStr + "]");
				
	}

}
