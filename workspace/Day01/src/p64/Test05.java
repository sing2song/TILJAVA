package p64;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		String b = "Hello";
		String ssn = "950201-1124444";
		
		//b에서 ll추출하기
		System.out.println(a.substring(2,4));		
		//b를 소문자로 변환
		System.out.println(b.toLowerCase());
		//b를 대문자로 변환
		System.out.println(b.toUpperCase());
		//ssn에서 남녀를 추출할려면?
		System.out.println(ssn.charAt(7)=='1'?"Man":"Woman");		
		//c의 길이는?
		System.out.println(ssn.length());
	}

}
