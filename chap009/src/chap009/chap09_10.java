package chap009;
import java.util.Scanner;

public class chap09_10 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int row, col;
    	
    	System.out.print("행 계수 입력 : ");
    	row = s.nextInt();
    	System.out.print("열 계수 입력 : ");
    	col = s.nextInt();
    	
    	System.out.printf("ary[0][0]부터 ary[%d][%d]까지 출력", row, col);
    	System.out.println();
    	
    	int[][] ary = new int[row][col];
    	int value = 1;
    	
    	for (int i = 0; i<row; i++) {
    		for (int j = 0; j<col; j++) {
    			ary[i][j] = value;
    			value++;
    		}
    	}
    	
    	for (int i = 0; i<row; i++) {
    		for (int j = 0; j<col; j++) {
    			System.out.printf("%3d", ary[i][j]);
    		}
    		System.out.println();
    	}
    }
}