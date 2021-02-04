package tree;

public class Member implements Comparable<Member> {
	private String name;
	public Member(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Member m1) {
		// TODO Auto-generated method stub
		return (this.name.compareTo(m1.name));
	}

}
