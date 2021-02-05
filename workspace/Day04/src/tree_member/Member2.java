package tree_member;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class Member2 implements Comparable<Member2>{
	private String name;
	private String  id ;

	public Member2(String id, String name) {
		this.name = name;
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public int equals(Member2 o) {
		if(this.id.equals(o.getId())) {
			if(this.name.equals(o.getName())) {
				return 1;
			}
		}
		return 0 ;
	}

	@Override
	public int compareTo(Member2 o) {
		return  this.id.compareTo(o.getId());
	}
}

