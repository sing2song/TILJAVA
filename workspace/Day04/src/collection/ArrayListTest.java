package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest {
	private static ArrayList<String> arr = new ArrayList();
	private static Scanner sc = new Scanner(System.in);
	static Iterator<String> iter = arr.iterator();
	
	public void insert() {
		String name;
		System.out.print("이름 :");
		name = sc.next();
		
		if(arr.contains(name)) {
			System.out.println(name+"님은 현재 회원입니다.");
		}else
			arr.add(name);
	}
	
	private void find(String name) {
		// TODO Auto-generated method stub
		if(arr.contains(name)) System.out.println(name+"님은 회원입니다");
		else System.out.println(name+"님은 회원이 아닙니다.");
		
	}

	public void print() {
		System.out.println("회원목록");
		for(int i=0;i<arr.size();i++)
			System.out.print(arr.get(i)+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListTest alt = new ArrayListTest();
		
		while(iter.hasNext()){ //얘는 true, false 반환, 있으면 true, 없으면 false 이제 이정도 짬은 되겠죠?

			System.out.println(iter.next());

		}
		for(int i=0;i<5;i++)
			alt.insert();
		
		String name;
		System.out.print("찾는 이름 :");
		name = sc.next();
		alt.find(name);
		alt.print();
	}

	
	
}
