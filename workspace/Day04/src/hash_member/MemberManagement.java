package hash_member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberManagement {
	static int count;
	HashSet<Member> members;

	public MemberManagement() {
		this.members = new HashSet<Member>();
		
	}
	public void signIn(String id) {
		this.members.add(new Member(++count,id));
	}
	public void secede(int num) {
		Iterator iter = members.iterator();
		while(iter.hasNext()) {
			Member m = (Member)iter.next();
			if(m.number == num) {
				this.members.remove(m);
				return;
			}
		}
		System.out.println("number not found");
		return;

	}
	public void secede(String id) {
		Iterator iter = members.iterator();
		while(iter.hasNext()) {
			Member m = (Member)iter.next();
			if(m.name.contentEquals(id)) {
				this.members.remove(m);
				return;
			}
		}
		System.out.println("id not found");
		return; 
	}
	public void printMenu() {
		System.out.println("1.signin");
		System.out.println("2.secede");
		System.out.println("3.print all members");
		System.out.println("3.exit");
	}
	public void printMembers() {
		for(Iterator<Member> i = members.iterator();i.hasNext();) {
			System.out.println((Member)i.next());
		}
	}
	

}
