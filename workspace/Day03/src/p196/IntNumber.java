package p196;

public class IntNumber {
	private int num1;
	private int num2;
	
	public IntNumber(int r,int i) {
		num1=r;
		num2=i;
	}
	
	int getNum1() {
		return num1;
	}
	
	int getNum2() {
		return num2;
	}
	
	public IntNumber add(IntNumber c) {
		int resultReal = num1+c.getNum1();
		int resultImag = num2+c.getNum2();
		return new IntNumber(resultReal,resultImag);
	}
	
}
