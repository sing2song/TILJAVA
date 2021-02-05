import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt=3;//환승카운트
		boolean subCnt=true;//지하철 환승
		
		Student s = new Student("송원",3);
		Bus bus = new Bus();
		Subway sub = new Subway();
		
		System.out.print("학생이 가진 돈 :");
		s.setMoney(sc.nextInt());
		
		while(cnt>0) {
			System.out.println("교통수단 선택");
			System.out.println("1. 버스 \t 2. 지하철");
			System.out.print(">>");
			int menu=sc.nextInt();
			switch(menu) {
			case 1:
				
				if(s.pay(bus.getCharge())) {
					bus.setSales(bus.getCharge());
					cnt--;
					int rate=bus.getCharge()+300;
					s.setMoney(s.getMoney()-rate);
					bus.setCusCnt(1);
				}else {
					
					System.out.println("잔액이 부족합니다.");
					cnt=0;
					break;
				}break;				
				
			case 2:
				
				if(s.pay(sub.getCharge()) && subCnt) {
					sub.setSales(sub.getCharge());
					cnt--;
					int rate=sub.getCharge()+300;
					s.setMoney(s.getMoney()-rate);
					sub.setCusCnt(1);
					subCnt=false;
				}else {				
					
					System.out.println("잔액이 부족합니다.");
					cnt=0;//환승못함
					break;
				}break;
				
			default: 
				System.out.println("잘못 입력하셨습니다."); 
				break;
			}
			System.out.println("잔액: "+s.getMoney());
			
		}
		
		System.out.println("학생의 잔액:"+s.getMoney());
		System.out.println("버스회사의 수입:"+bus.getSales());
		System.out.println("지하철회사의 수입:"+sub.getSales());
		
	}
}
