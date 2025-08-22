package chap006;

public class Code06_3 {

	public static void main(String[] args) {
		int j = 0;
		for (int i=1000; i<=2000; i++) {
			if(i%2==1) j+=i;
		}
		
		System.out.println(j);
	}

}
