package p186;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		int input;
		long balance;
		boolean loop=true;
		Scanner c = new Scanner(System.in);
		Account a = new Account();
		
		while(loop) {
			System.out.println("#####원하는 거래 선택#####" );
			System.out.print("[1]입금(DEPOSIT)" );
			System.out.print("[2]출금(WITHDRAW)" );
			System.out.print("[3]조회" );
			System.out.println("[4]종료" );
			System.out.print("입력:" );
			input = c.nextInt();
			
			if(input == 1)
			{
				System.out.print("금액 입력 : " );
				balance = c.nextLong();
				a.deposit(balance);
			}
			else if( input ==2)
			{
				System.out.print("금액 입력 : " );
				balance = c.nextLong();
				a.withdraw(balance);
			}
			else if( input ==3)
			{
				System.out.println("잔금 :"+a.getBalance());
			}
			else if( input ==4)
			{
				System.out.println("종료합니다.");
				loop=false;
			}
			else{
				System.out.println("잘못 선택 하셨습니다." );
			}
		}
	}
}

