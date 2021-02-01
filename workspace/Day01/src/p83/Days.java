package p83;

import java.util.Scanner;
public class Days{
	public static void main(String args[]){
		int month;
		int year = 2020;
		int days =0;
		System.out.print("월을 입력하시오.");
		Scanner scan = new Scanner(System.in);
		month = scan.nextInt();
		switch(month)
		{
			case 1 :case 3: case 5:case 7: case 8: case 10: case 12:
				days = 31;
				break;
			case 4 :case 6: case 9: case 11:
				days = 30;
				break;
			case 2:
				days = 28;
				break;
			default:
				System.out.println("월이 잘못 입력되었습니다.");
				break;
		}
		System.out.println(month+"월의 날짜 수는 "+days+"일입니다.");
	}
}