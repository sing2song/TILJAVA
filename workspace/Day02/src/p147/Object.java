package p147;

public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount1 = new Account("12345","철수",10000);
		Account myAccount2 = new Account("987","adam",20000);
		
		myAccount1.deposit(10000);
		System.out.println("myAccount1의 "+myAccount1);
		
		myAccount2.deposit(30000);
		myAccount2.withdraw(5000);
		System.out.println("myAccount2의 "+myAccount2);
		
		myAccount1.tranfer(4000, myAccount2);
		System.out.println("myAccount1의 "+myAccount1);
		
		System.out.println(myAccount1.getCnt());
		
	}

}
