package Construct;

public class User {
	private String id;
	private String pwd;
	private String name;
	private int birthdate;
	
	public User() {}
	public User(String id, String pwd) {
		this.id=id;
		this.pwd=pwd;
	}
	public User(String id,String pwd,String name, Integer birthdate) {
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.birthdate=birthdate;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	
	
}
