package p74;

import java.util.Scanner;
public class Grade{
	public static void main(String args[]){
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		grade = input.nextInt();
		if(grade>=90)
			System.out.println("A");
		else if (grade>=80)
			System.out.println("B");
		else if (grade>=70)
			System.out.println("C");
		else if (grade>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
		
		int score = 88;
		if(score >80 && score <=90){
			if(score>87)
				System.out.println("B+ !");
			else if(score <84)
				System.out.println("B- !");
			else
				System.out.println("Bo !");
		}
		
		input.close();

	}
}