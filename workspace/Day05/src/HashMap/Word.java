package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m =new HashMap<String,Integer>();
		String[] sample= {"one","two","one","three","a","b"};
		
		//중복검사
		for(String a:sample) {
			Integer freg=m.get(a);
			System.out.println("freg="+freg);
			m.put(a, (freg==null) ?1:freg+1);
			
			System.out.println(m);
		}
		
		System.out.println(m.size()+"단어가 있습니다.");
		System.out.println(m.containsKey("a"));//true
		System.out.println(m.isEmpty());//false
		System.out.println(m);
		//{a=1, b=1, one=2, two=1, three=1}
	}

}
