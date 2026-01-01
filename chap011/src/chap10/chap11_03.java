package chap10;
import java.io.BufferedReader;
import java.io.FileReader;

public class chap11_03 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/myData1.txt"));
		String inStr;
		
		int num = 1;
		for(;;) {
			inStr = br.readLine();
			if (inStr == null)
				break;
			System.out.println(num + " : " + inStr);
			
			num++;
		}
		
		br.close();
	}
}
