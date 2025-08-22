package beta.copy;

import java.util.Arrays;

public class Main {
	

	public static void main(String[] args) {
		LottoInput lottoInput = new LottoInput();
        LottoGet lottoGet = new LottoGet();
        ResultSum resultSum = new ResultSum();

        int[] inputNumbers = lottoInput.lotto_input();
        int[] generatedNumbers = lottoGet.lotto_get();

        int resultLength = inputNumbers.length + generatedNumbers.length;
        int[] resultClass = new int[resultLength];
        System.arraycopy(inputNumbers, 0, resultClass, 0, 6);
        System.arraycopy(generatedNumbers, 0, resultClass, inputNumbers.length, 6);

        resultSum.result_sum(resultClass);

        System.out.println("로또 당첨 번호 ==> " + Arrays.toString(generatedNumbers));
        System.out.println("로또 입력 번호 ==> " + Arrays.toString(inputNumbers));
	}

}
