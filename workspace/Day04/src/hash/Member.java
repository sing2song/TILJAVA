package hash;

public class Member {

	int memberId;
	String memberName;

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public void setId(int id) {memberId = id;}
	public int getId() {return memberId;}

	public void setName(String name) {memberName = name;}
	public String getName() {return memberName;}

	public String toString() {
		String s;
		s = this.memberName+"회원님의 아이디는 "+this.memberId+"입니다";
		return s;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member temp = (Member)obj;
			return memberId == temp.memberId; 
		}
		return false;
	}
	public int hashCode() {
		return ((Integer)memberId).hashCode();
//		return (memberId+memberName).hashCode();
	}
}	