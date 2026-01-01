package chap009;

public class chap09_final {
    public static void main(String[] args) {
    	int[] ary = new int[100];
    	double avr = 0;
    	
    	for (int i : ary) {
    		ary[i] = (int)(Math.random()*6+1);
    		
    		avr += ary[i];
    	}
    	System.out.printf("100번 던진 주사위 값의 평균은 %.2f 입니다.", avr/ary.length);
    }
}