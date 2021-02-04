package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	private String id;	
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	Scanner sc = new Scanner(System.in);
	List<User> users = new ArrayList<User>();
	
	public User() {}
	public User(String id, String pw) {
		this.id=id;
		this.pw=pw;			
	}
	
	
	public void SignUp() {
		System.out.print("ID :");
		id=sc.next();
		System.out.print("PW :");
		pw=sc.next();
		
		users.add(new User(id,pw)); 
		System.out.println("회원가입이 완료되었습니다.");
	}
	
	public void printAll() {
		
		for(User user : users) {
			System.out.println(user.toString());
		}
	}
	
	public String toString() {
		return this.getId();
	}
	
	
}
