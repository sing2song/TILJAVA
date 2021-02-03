package p173;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
		Scanner sc = new Scanner(System.in);
		Now now = new Now();
		System.out.println("현재 시간 :" + now.getTime());
		System.out.println("현재 이름 :" + now.getName());
		System.out.printf("변경할 이름을 입력하십시오 : ");
		String str = sc.nextLine();
		now.setName(str);
		String time1 = dayTime.format(new Date());
		now.setTime(time1);
		System.out.println("현재 시간 :" + now.getTime());
		System.out.println("현재 이름 :" + now.getName());

	}

}
