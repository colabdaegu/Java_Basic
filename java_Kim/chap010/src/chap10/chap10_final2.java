package chap10;
import java.util.Arrays;
import java.util.Scanner;

public class chap10_final2 {
	static int type;
	
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
	
	
	static int[] lotto_input() {
		Scanner s = new Scanner(System.in);
    	
    	System.out.print("로또 번호 방식을 선택하세요(1: 수동, 2: 자동) : ");
    	type = s.nextInt();
    	
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
	
	
	
	
	
	
	static void result_sum(int[] list1) {
		int sum = 0;
		
		for (int i = 0; i < 6; i++)
			for (int j = 6; j < 12; j++) {
				if (list1[i] == list1[j])
					sum += 1;
			}
		
		switch (sum) {
			case 2: System.out.println("5등 당첨");
				break;
			case 3: System.out.println("4등 당첨");
				break;
			case 4: System.out.println("3등 당첨");
				break;
			case 5: System.out.println("2등 당첨");
				break;
			case 6: System.out.println("1등 당첨!");
				break;
			default: System.out.println("꽝");
		}
	}
	
    public static void main(String[] args) {
    	int[] lottoInput = lotto_input();
    	int[] lottoGet = lotto_get();
    	
    	int resultLength = lottoInput.length + lotto.length;
    	int[] resultClass = new int[resultLength];
    	System.arraycopy(lottoInput, 0, resultClass, 0, 6);
    	System.arraycopy(lottoGet, 0, resultClass, lottoInput.length, 6);
    	
    	
    	result_sum(resultClass);
    	
    	System.out.println("로또 당첨 번호 ==> " + Arrays.toString(lottoGet));
    	System.out.println("로또 입력 번호 ==> " + Arrays.toString(lottoInput));
    
    }
}