package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		map.put("java","자바");
		map.put("school","학교");
		map.put("map","지도");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("영어 단어 입력:");
			String word = sc.next();
			if(word.equals("quit")) {
				System.out.println("종료");
				System.exit(0);;
			}

			if(map.containsKey(word)) {
				System.out.println(word+"="+map.get(word));
			}else {
				System.out.println("해당 단어가 존재하지 않습니다.");
			}

		}
	}
}
