package tree;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Member2 implements Comparable<Member>{

	private String id;
	private String name;
	
	
	TreeSet<Member2> ts = new TreeSet<Member2>();
	Scanner sc = new Scanner(System.in);
	
	public Member2() {
		
	}
	public Member2(String id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void join() {
		// TODO Auto-generated method stub
		
		System.out.print("아이디 :");
		id=sc.next();
		System.out.print("이름 :");
		name=sc.next();
		
		ts.add(new Member2(id,name));
	}

	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("지울 아이디:");
		String deletId=sc.next();
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()) {
			
		}
		
	}

	public void print() {
		// TODO Auto-generated method stub
		for(Member2 member :ts) {
			System.out.println(member);
		}
	}
	
	public String toString() {
		return "Member name="+name;
	}

}
