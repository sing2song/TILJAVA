package p91;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		System.out.println("구구단 출력");
		
//		while(i<=9) {
//			int j=1;
//			while(j<=9) {
//				System.out.println(i+"*"+j+"="+i*j);
//				j++;
//			}
//			i++;
//		}
		
//		for(i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++)
//				System.out.println(i+"*"+j+"="+i*j);
//		}
		
		int j=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 단 :");
		i=sc.nextInt();
		do {
			System.out.println(i+"*"+j+"="+i*j);
			j++;
		}while(j<=9);
		
		sc.close();
		
	}

}
