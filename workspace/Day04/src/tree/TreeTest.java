package tree;

import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member("park");
		Member m2=new Member("kim");
		Member m3=new Member("lee");
		TreeSet<Member> ts = new TreeSet<Member>();
		
		ts.add(m1);
		ts.add(m2);
		ts.add(m3);
		for(Member member :ts) {
			System.out.println(member);//이름순서대로 나옴!!
		}
		System.out.println(ts);
	}

}
