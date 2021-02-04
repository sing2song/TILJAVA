package p353;

import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("일");
		list.add("이");
		list.add("삼");
		list.add("사");
		list.add("삼");
		list.add("이");
		list.add("일");
		
		String str;
		Iterator e = list.iterator(); //반복자 객체 얻기
		while(e.hasNext()) // 다음 원소가 있다면 실행
		{
			str = (String)e.next(); // 다음 원소 반환
			System.out.println(str);
		}
		System.out.println(list.indexOf("일")); //앞에서 부터 검색한다. -> 0
		System.out.println(list.lastIndexOf("일")); //뒤에서 부터 검색한다. -> 6
	
	
	}

}
