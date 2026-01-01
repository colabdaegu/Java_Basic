package chap009;
import java.util.Arrays;

public class chap09_8 {

    public static void main(String[] args) {
    	String[] oldAry = {"짜장", "탕수육", "군만두"};
    	String[] newAry;
    	
    	newAry = oldAry;
    	
    	oldAry[0] = "쟁반짜장";
    	oldAry[1] = "짬뽕";
    	
    	System.out.println("원본 배열 : " + Arrays.toString(oldAry));
    	System.out.println("복사 배열 : " + Arrays.toString(newAry));
        
    }
}