package theater;

import java.util.Scanner;

public class Theater {
	  private int[] seats = new int[10];

	    public void reserve() {
	        int cnt = 0;
	        int re;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("<좌석 배치도>");

	        for (int i = 0; i < seats.length; i++) {
	            System.out.print((i+1) + " | ");
	            cnt += seats[i];
	        }

	        System.out.println();
	        System.out.println("====================");
	        for (int seat : seats) {
	            System.out.print(seat + " ");
	        }

	        System.out.println();

	        if (cnt == seats.length) {
	            System.out.println("좌석이 모두 매진되었습니다.");
	            System.exit(0);
	        }
	        
	        while (true) {
	            System.out.print("예약할 좌석을 선택하세요: ");
	            re = sc.nextInt();

	            if (seats[re-1] == 1) {
	                System.out.println("이미 예약된 좌석입니다.");
	                continue;
	            }
	            break;
	        }
	        
	        seats[re-1] = 1;
	        System.out.println("좌석 예약이 완료되었습니다.");
	    }

}
