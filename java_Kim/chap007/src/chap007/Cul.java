package chap007;
import java.util.Scanner;

public class Cul {
	double result;
	double num1, num2;
	
	void scanVal() {
		Scanner s = new Scanner(System.in);
		System.out.print("input first number ==> ");
		num1 = s.nextInt();
		System.out.print("input second number ==> ");
		num2 = s.nextInt();
	}
	
	void add() {
		result = num1+num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
	void sub() {
		result = num1-num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}
	void mul() {
		result = num1*num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}
	void div() {
		result = num1/num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
	
}
