package lotto;

public class LottoGet {
	static int winNum1, winNum2, winNum3, winNum4, winNum5, winNum6;
	
	static int[] winLottoAry = new int[6];
	
	public LottoGet() {
		boolean execution = true;
		
		int num1, num2, num3, num4, num5, num6;
		
		while(true) {
    		execution = true;
            
        	num1 = (int)(Math.random() * GameWindow.maxNum + 1);
			num2 = (int)(Math.random() * GameWindow.maxNum + 1);
			num3 = (int)(Math.random() * GameWindow.maxNum + 1);
			num4 = (int)(Math.random() * GameWindow.maxNum + 1);
			num5 = (int)(Math.random() * GameWindow.maxNum + 1);
			num6 = (int)(Math.random() * GameWindow.maxNum + 1);
			
			winLottoAry[0] = num1; winLottoAry[1] = num2; winLottoAry[2] = num3; winLottoAry[3] = num4; winLottoAry[4] = num5; winLottoAry[5] = num6;
        	
    		for (int i = 0; i < winLottoAry.length - 1; i++) {
    		    for (int j = i + 1; j < winLottoAry.length; j++) {
    		        if (winLottoAry[i] == winLottoAry[j]) {
    		        	execution = false;
    		        	
    		        	continue;
    		        }
    		    }
    		}
    		if (execution) {
    			break;
    		}
		}
		winNum1 = num1; winNum2 = num2; winNum3 = num3; winNum4 = num4; winNum5 = num5; winNum6 = num6;
		
		//Arrays.sort(winLottoAry);
	}
}
