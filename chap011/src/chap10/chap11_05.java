package chap10;
import java.io.FileWriter;
import java.util.Scanner;

public class chap11_05 {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("C:/FirstJava/myData3.txt");
		String outStr;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("좋아하는 가수는? ");
			outStr = s.nextLine();
			if (outStr.equals(""))
				break;
			fw.write(outStr + "\n");
		}
		
		fw.close();
		System.out.println("--- myData3.txt 파일이 저장됨 ---");
	}
}
