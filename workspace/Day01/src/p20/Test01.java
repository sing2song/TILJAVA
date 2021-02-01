package p20;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value; double pi = 3.14;
		value = 10 + 8; 
		System.out.println(value); //18.0
		value = 10 * pi; 
		System.out.println(value); //31.40000
		value = 314 / pi; 
		System.out.println(value); //100.0
		value = pi - 3; 
		System.out.println(value); //0.140000
		value = (double)10 / 3; 
		System.out.println(value);//3.3333
		value = 10 % 3; 
		System.out.println(value);//1.0
		value = 123 % 3;//나머지값은 어떤수를 나누건 0,1,2 중하나이다.
		System.out.println(value);//0.0
		
		
		int x = 2; int y = 2; int val;
		val = ++x * 5; System.out.println(val);//15
		val = ++y; System.out.println(val);//3
		val = y++ * 5; System.out.println(val);//15
		val = ++y; System.out.println(val);//5
		val = x++; System.out.println(val);//3
		val = y--; System.out.println(val);//5
		val = --x; System.out.println(val);//3
		
		
	}

}
