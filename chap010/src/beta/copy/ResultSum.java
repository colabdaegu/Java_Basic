package beta.copy;

public class ResultSum {
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
}
