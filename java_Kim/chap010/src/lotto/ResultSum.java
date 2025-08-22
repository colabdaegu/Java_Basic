package lotto;

public class ResultSum {
	
	static String result = "";
	
	public ResultSum() {
		int sum = 0;
		
		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 6; j++) {
				if (GameWindow.lottoAry[i] == LottoGet.winLottoAry[j])
					sum += 1;
			}
		
		switch (sum) {
			case 2: result = "5등 당첨";
				break;
			case 3: result = "4등 당첨";
				break;
			case 4: result = "3등 당첨";
				break;
			case 5: result = "2등 당첨";
				break;
			case 6: result = "1등 당첨";
				break;
			default: result = "꽝";
		}
	}
}
