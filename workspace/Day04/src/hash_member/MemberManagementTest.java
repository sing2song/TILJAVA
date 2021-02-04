package hash_member;

import java.util.Scanner;

public class MemberManagementTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberManagement mm = new MemberManagement();
		String name;
		Menu : while(true) {
			mm.printMenu();
			int input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.print("input name : ");
				name = sc.next();
				mm.signIn(name);				
				break;
			case 2:
				System.out.print("input name : ");
				name = sc.next();
				mm.secede(name);
				break;
			case 3:
				mm.printMembers();
				break;
			case 4: 
				System.out.println("exit menu");
				break Menu;
			}
		}

	}

}
