package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3 {
	static Scanner sc = new Scanner(System.in);
	static Map<String,String> map = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		for(int i=0;i<3;i++) {
			save();
		}
		find();		
	}

	
	public static void save() {
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("전화번호:");
		String number = sc.next();
		map.put(name, number);
	}
	
	public static void find() {
		System.out.print("찾는 이름:");
		String find = sc.next();
		boolean check=false;
		
		System.out.println(map.containsKey(find));
		
		for(String c:map.keySet()) {
			if(find.equals(c)){
				System.out.println("전화번호:"+map.get(c));
				check=true;
				break;
			}			
		}
		if(!check) {
			System.out.println("없는 회원입니다.");
		}
	}
}
