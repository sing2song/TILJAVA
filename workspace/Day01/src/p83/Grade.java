package p83;
import java.util.Scanner;
public class Grade{
	public static void main(String args[]){
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		grade = input.nextInt();
		
		switch(grade/10) {
			case 10:
			case 9:
				System.out.println("A");break;
			case 8:
				System.out.println("B");break;
			case 7:
				System.out.println("C");break;
			case 6:
				System.out.println("D");break;
			default:
				System.out.println("F");break;
		}
		
		input.close();

	}
}