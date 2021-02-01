package p56;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(3 < 4);
		System.out.println(10 > 20.0);
		System.out.println(12.5f <= 11);
		System.out.println(7 >= 7);
		int num1 = 5;
		int num2 = 2 + 3;
		if (num1 == num2)
		System.out.println("num1과 num2의 값은 동일합니다.");
		if ((num1 != num2) == false)
		System.out.println("다르다고 하면 거짓말!");
		
		int x = 2;
		int y = 2;
		System.out.println(x == y);
		System.out.println(x <= y);
		System.out.println(x > y);
		System.out.println((x == 2) && (y == 2));//t&&t
		System.out.println((x == 2) && (y != 2));//t&&f
		System.out.println((x == 2) || (y != 2));//t||f
		System.out.println((x == 5) || (y != 2));//f||f
	}

}
