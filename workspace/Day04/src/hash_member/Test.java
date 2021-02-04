package hash_member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		HashSet<HashMember> member = new HashSet<HashMember>();
		int i=1;
		Scanner sc = new Scanner(System.in);
		while(i==1) {			
			System.out.println("1.회원 가입 2.회원탈퇴 3. 회원 출력 4.종료");
			int choose = sc.nextInt();
			
			switch (choose) {
			case 1:
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.next();
				System.out.println();
				System.out.print("이름을 입력해주세요: ");
				String name = sc.next();
				
				member.add(new HashMember(id, name));
				
				break;
		
			case 2:
				System.out.println("아이디를 입력하세요: ");
				String outid = sc.next();
				Iterator<HashMember> iter = member.iterator();
				while(iter.hasNext()){
		        	HashMember person = iter.next();
		        	
		        	if(outid.equals(person.getId())) {
		        		member.remove(person);
		        	}
		        	else {
		        		System.out.println("존재하지 않는 아이디입니다.");
		        		break;
		        	}
		        }
				break;
				
			case 3: 
				 Iterator<HashMember> iterator = member.iterator();
			        while(iterator.hasNext()){
			        	HashMember person = iterator.next();
			            System.out.println("아이디: "+person.getId() +" 이름: "+ person.getName());
			        }
				break;
				
			case 4: 
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}

	}

}
