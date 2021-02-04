package collection;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("임의의 정수 입력");
			list.add(sc.nextInt());
		}
		
		Iterator e=list.iterator();
		int maxnum=0,sum=0;
		while(e.hasNext()) {
			int num=(int)e.next();
			if (maxnum<num) maxnum=num;
			sum+=num;
		}
		System.out.println("가장 큰 수:"+maxnum+"\n총 합:"+sum);
	}


}

