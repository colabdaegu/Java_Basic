package chap10;
import java.util.Arrays;

public class chap10_final {
	static int[] lotto_get() {
		int[] lottoAry = {};
		int num = 0;
		
		while(true) {
			num = (int)(Math.random() * 45 + 1);
			
			for (int l : lottoAry) {
				if (num == l)
					continue;
			}
			lottoAry = Arrays.copyOf(lottoAry, lottoAry.length + 1);
			lottoAry[lottoAry.length - 1] = num;
			if (lottoAry.length == 6)
				break;
		}
		Arrays.sort(lottoAry);
		return lottoAry;
	}
	
    public static void main(String[] args) {
    	int[] lotto = lotto_get();
    	
    	System.out.println("로또 번호 ==> " + Arrays.toString(lotto));
    	
    
    }
}