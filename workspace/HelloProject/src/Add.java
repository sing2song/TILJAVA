import java.util.*;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		
		System.out.println("Input num1 :");
		x=sc.nextInt();
		System.out.println("Input num2 :");
		y=sc.nextInt();
		sum=x/y;
		
		System.out.println(sum);
		System.out.println("결과 = "+ x / y);
		System.out.println(args);
		sc.close();
	}

}
