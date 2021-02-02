package p147;

public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String accountNo,String ownerName, int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	protected int deposit(int money) {
		System.out.println("원래 잔액 : "+balance);
		balance+=money;
		System.out.println("입금 후 잔액 : "+balance);
		return balance;
	}
	
	protected int withdraw(int money) {
		System.out.println("원래 잔액 : "+balance);		
		if(balance>money) {
			balance-=money;
			System.out.println("출금 후 잔액:  "+balance);
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		return balance;
	}
	
	void tranfer(int money,Account user) {
		if(balance>money) {
			this.balance-=money;
			user.deposit(money);
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
	@Override
	public String toString() {
		return "잔액: "+balance;		
	}
	
}
