package chap009;

public class chap09_9 {

    public static void main(String[] args) {
    	int[][] ary = new int[3][4];
    	int value=1;
    	
    	//ary[0][0] = 1; ary[0][1] = 2; ary[0][2] = 3; ary[0][3] = 4;
    	//ary[1][0] = 5; ary[1][1] = 6; ary[1][2] = 7; ary[1][3] = 8;
    	//ary[2][0] = 9; ary[2][1] = 10; ary[2][2] = 11; ary[2][3] = 12;
    	
    	for (int i=0; i<=2; i++) {
    		for (int j=0; j<=3; j++) {
    			ary[i][j]=value;
        		value++;
    		}   		
    	}
        
    	for (int i=0; i<=2; i++) {
    		for (int j=0; j<=3; j++) {
    			System.out.printf("%3d ", ary[i][j]);
    		}   		
    		System.out.println();
    	}
    }
}