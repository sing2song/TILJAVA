package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("#######유저프로그램#######");
		
		while(true) {
			System.out.println("1. Sign up");
			System.out.println("2. Print all users");
			System.out.println("3. Exit");
			
			System.out.print("입력 : ");
			int num=sc.nextInt();
			
			switch(num) {
			case 1:
				user.SignUp();
				break;
			case 2: 
				user.printAll();
				break;
			case 3: 
				System.exit(0); break;
			}
		}
		
		
	}

}
