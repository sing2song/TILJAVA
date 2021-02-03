package p208;

import java.util.Scanner;

public class CalculatorTest extends Operator {	
	int result=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char op;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		System.out.print("op=");
		op=sc.next();
				
		switch(op) {
		case '+':
			
		}
	}
	@Override
	public int plus(int a, int b) {
		result=a+b;
		return result;
	}
	@Override
	public int minus(int a, int b) {
		result=a-b;
		return result;
	}
	@Override
	public int mul(int a, int b) {
		result=a*b;
		return result;
	}
	@Override
	public int div(int a, int b) {
		result=a/b;
		return result;
	}

	
}
