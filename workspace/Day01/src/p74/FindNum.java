package p74;
import java.util.*;
public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		int max;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1=");
		num1=sc.nextInt();
		System.out.print("num2=");
		num2=sc.nextInt();
		System.out.print("num3=");
		num3=sc.nextInt();

//		if (num1 >= num2 && num1 >= num3) {
//			max = num1;
//		} else if (num2 >= num1 && num2 >= num3) {
//			max = num2;
//		} else {
//			max = num3;
//		}
		
		int result = (num1 > num2)? num1: num2;//숫자 두개를 비교해서 더 큰 값을 저장한다.        
        int result2 = num3 > result? num3: result;


		System.out.println("가장 큰 수는 " + result2 + "입니다.");

		sc.close();

	}

}
