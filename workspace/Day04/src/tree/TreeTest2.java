package tree;

import java.util.HashSet;
import java.util.Scanner;

public class TreeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m = new Member2(); 
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("#############");
			System.out.println("1. 회원 가입");
			System.out.println("1. 회원 탈퇴");
			System.out.println("1. 회원 출력");
			System.out.println("4. 종료");
			System.out.print("입력 : ");
			int menu=sc.nextInt();

			switch(menu) {
			case 1:
				m.join();
				break;
			case 2:
				m.delete();
				break;
			case 3:
				m.print();
				break;
			case 4: System.exit(0); break;
			}
		}
	}

}
