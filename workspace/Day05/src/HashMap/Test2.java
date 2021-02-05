package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap();
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<3;i++)
		{
			System.out.print("나라이름:");
			String country=sc.next();
			System.out.print("인구:");
			int pop = sc.nextInt();

			map.put(country, pop);
		}

		int max=Integer.MIN_VALUE;
		String result="";
		for(String c:map.keySet()) {
			if(map.get(c)>max) {
				result=c;
				max=map.get(c);
			}
		}
		
		System.out.println(result+"의 인구가 "+max+"명으로 제일 많다.");
	}

}
