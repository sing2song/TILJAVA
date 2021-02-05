import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressMain {
	
	static Map<String,String> map = new HashMap();
	static Scanner sc = new Scanner(System.in);
	
	public static void add() {		
		System.out.print("학생이름:");
		String name=sc.next();
		System.out.print("전화번호:");
		String number = sc.next();
	
		if(map.containsKey(name)) {
			System.out.println("해당 이름은 존재합니다");
		}else {
			map.put(name, number);
			System.out.println("이름을 추가했습니다.");
		}
		
	}
	
	public static void search() {
		System.out.print("찾는 이름 입력:");
		String SearchName = sc.next();

		if(map.containsKey(SearchName)) {
			System.out.println(SearchName+"의 번호: "+map.get(SearchName));
		}else {
			System.out.println("해당 이름이 존재하지 않습니다.");
		}
	}
	
	public static void delete() {
		System.out.print("삭제 이름 입력:");
		String DeleteName = sc.next();
		
		
		if(map.containsKey(DeleteName)) {
			map.remove(DeleteName);
			System.out.println("해당 이름을 삭제했습니다.");
		}else System.out.println("해당 이름이 존재하지 않습니다.");
		
	}
	
	public static void print() {
		for(String key:map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
	}
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("1. 이름 추가\t 2.이름 검색\t 3.이름 삭제\t 4.이름 출력\t 5.종료");
			System.out.print(">>");
			int num=sc.nextInt();
			
			switch(num) {
			case 1:
				add(); break;
			case 2:
				search(); break;
			case 3:
				delete(); break;
			case 4:
				print(); break;
			case 5: 				
				System.out.println("시스템을 종료합니다.");
				System.exit(0); 
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
			}
			
		}
		
		
	}
	
	
	
}
