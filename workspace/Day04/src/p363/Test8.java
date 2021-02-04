package p363;

import java.util.LinkedList;
import java.util.List;

public class Test8 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("홍길동");
		list.add("또치");
		list.add("둘리");
		
		list.set(0, "도우너");//0번째 인덱스 홍길동을 도우너로 수정
		
		String s = list.get(0);
		int size = list.size();
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}
}
