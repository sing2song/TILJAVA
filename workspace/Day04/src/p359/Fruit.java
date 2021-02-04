package p359;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet();
		String[] str = {"사과","사과","바나나","토마토"};
		int cnt=0;
		int overcnt=0;//중복된수
		for(String s:str) {
			if(set.add(s))cnt++;
			else overcnt++;			
		}
		
		System.out.println("중복되지 않은 수="+cnt+", 중복된 수="+overcnt);
	}

}
