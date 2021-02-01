package p20;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bit=30;	//int 숫자를 byte타입에 넣어서 에러!
		//byte의 최대 표현 가능 수는 127
		double grade1;
		grade1=98.2;
		double grade2 = 50.5;
		float f1=3.15f;
		boolean b2;
		b2 =true;
		
		int grade = 90;
		double grade3;
		grade3 = grade;
		System.out.println(grade3);
		
		int a = 10;
		double b;
		b = a; System.out.println(b); //10.0 upcasting
		//a = b; //error System.out.println(a);
		a = (int)b; System.out.println(a); //10
		b = 10 / 3; System.out.println(b); //3.0
		b = (double)10 / 3; System.out.println(b); //3.333
		b = (int)10.2 + (int)3.3; System.out.println(b); //13.0
		b = (int)10.2 + 3.3; System.out.println(b); //13.3
		
	} 

}
