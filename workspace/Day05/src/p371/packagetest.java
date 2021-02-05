package p371;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class packagetest {
	static Queue q = new LinkedList();
	static int exprice = 0;
	static boolean bool = true;

	static void save(String input) {
		if (!"".equals(input))
			q.offer(input);
	}
	static void exprice(int price) {
		exprice += price;
	}
	
	static void start() {
		System.out.println("[식당]을 입력하세요");
		while (true) {
			System.out.print(">>");
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				if ("".equals(input))
					continue;
				if (input.equalsIgnoreCase("end")) {
					System.out.println("종료");
					System.exit(0);
				} else if (input.equalsIgnoreCase("식당")) {
					restaurant();
				} else if (input.equalsIgnoreCase("메뉴")) {
					menu();
				} else if (input.equalsIgnoreCase("영수증")) {
					receipt();
				} else {
					System.out.println("다시 입력 하세요");
					continue;
				}} catch (Exception e) {
					System.out.println("입력오류 입니다.");
				}
		}
	}
	
	static void restaurant() {
		System.out.println(" ");
		System.out.println("====================식당에 들어오셨습니다.=============");
		System.out.println("===========[메뉴] - 메뉴를 보여줍니다.=================");
		System.out.println("===========[end] - 프로그램을 종료합니다.==============");
		System.out.println("======[영수증] - 주문하신 메뉴 총 금액을 출력합니다.===");
		System.out.println("==========================================================");
	} 
	static void menu() {
		System.out.println(" ");
		System.out.println("======================메뉴를 입력하세요==============");
		System.out.println("=[치킨] [피자] [족발] [보쌈] [뼈다귀해장국] [나가기]=");
		System.out.println("=====================================================");
		Scanner s2 = new Scanner(System.in);
		String menu;
		System.out.print("메뉴 입력>>");
		while (true) {
			menu = s2.nextLine().trim();
			if (menu.equals("치킨")) {
				System.out.println("치킨을 입력하셨습니다.");
				exprice(10000);
				save(menu);
			} else if (menu.equals("피자")) {
				System.out.println("피자을 입력하셨습니다.");
				exprice(18000);
				save(menu);
			} else if (menu.equals("족발")) {
				System.out.println("족발을 입력하셨습니다.");
				exprice(38000);
				save(menu);
			} else if (menu.equals("보쌈")) {
				System.out.println("보쌈을 입력하셨습니다.");
				exprice(38000);
				save(menu);
				
			} else if (menu.equals("뼈다귀해장국")) {
				System.out.println("뼈다귀 해장국을 입력하셨습니다.");
				exprice(5000);
				save(menu);
			} else if (menu.equals("나가기")) {
				System.out.println("나가기를 입력하셨습니다.");
				restaurant();
				break;
			}
		}
	}
	
	
	static void receipt() {
		System.out.println("");
		System.out.println("[영수증] - 주문하신 메뉴와 총 금액입니다.");
		//int i = 0;
		
		/*
		LinkedList tmp = (LinkedList) q;
		ListIterator it = tmp.listIterator();
		while (it.hasNext()) {
			System.out.println(++i + "." + it.next());
		}
		System.out.println("");
		System.out.println("총 금액 : " + exprice);
		*/
		
		int i = 1;
		
		while(!q.isEmpty()) {
			System.out.println(i++ + ". "+q.poll());
		}
		System.out.println("총 주문 금액: "+exprice+"원");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start();
	}
	
	
}
