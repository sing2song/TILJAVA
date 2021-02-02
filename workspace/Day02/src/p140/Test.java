package p140;
import java.util.*;
class Bank {
	private int balance;//잔액
	private int account_id;//계좌번호
	public int account_ps;//계좌비번
	public String Bank_name;//은행명
	public void Balance_Check() {System.out.println(balance);}
	public void Print_ID() {System.out.println(account_id);}
}
public class Test{
	public static void main(String args[]) {
		Bank user = new Bank();
		user.Balance_Check();
		//user.balance=100000;//외부접근 불가
		user.Print_ID();
		user.account_ps=3690;//외부접근 불가
		user.Bank_name="aaaa";//외부접근 가능
	}//main
}

