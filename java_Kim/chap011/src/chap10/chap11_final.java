package chap10;
import java.io.BufferedReader;
import java.io.FileReader;

public class chap11_final {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/myData1.txt"));
		String inStr;
		
		int num = 1;
		for(;;) {
			inStr = br.readLine();
			if (inStr == null)
				break;
			System.out.println(num + "행: " + inStr);
			
			num++;
		}
		
		br.close();
	}
}

