package hash_member;

public class Member implements Comparable<Member>{
	String name;
	int number;
	
	public Member() {
		
	}
	public Member( int number,String name) {
		super();
		this.name = name;
		this.number = number;
	}
	public Member(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", number=" + number + "]";
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
//		return this.getName().compareTo(o.getName());
		return this.number - o.number;
	} 

}
