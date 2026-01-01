package chap10;

public class chap10_lotto {
	static int lotto_method() {
		int lottoNum = (int)(Math.random()*45 + 1);
		return lottoNum;
	}
    
	static void method1() {
		int a = 200;
		System.out.println("method1()에서 a의 값==> " + a);
	}
	
	static void method2() {
		a = a+1;
		System.out.println("method2()에서 a의값==> " + a);
	}
	
    public static void main(String[] args) {
    	method1();
    	method2();
    }
}