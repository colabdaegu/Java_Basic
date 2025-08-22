package beta.copy;

import java.util.Arrays;
import java.util.Scanner;

public class LottoInput {
	static int[] lotto_input() {
		Scanner s = new Scanner(System.in);
    	
    	System.out.print("로또 번호 방식을 선택하세요(1: 수동, 2: 자동) : ");
    	int type = s.nextInt();
    	
    	int[] lottoAry = {};
		int num = 0;
    	
		if (type == 1) {
			Scanner n = new Scanner(System.in);
			
			while(true) {
				
				num = n.nextInt();
				
				for (int l : lottoAry) {
					if (num == l)
						continue;
				}
				lottoAry = Arrays.copyOf(lottoAry, lottoAry.length + 1);
				lottoAry[lottoAry.length - 1] = num;
				if (lottoAry.length == 6)
					break;
			}
			
		} else if (type == 2) {
			
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
		} else {
			System.out.println("입력이 올바르지 않습니다.");
		}
		
		Arrays.sort(lottoAry);
		return lottoAry;
	}
}
