package p56;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = {'A', 'B', 'C', 'D'};
		System.out.println (str1);
		System.out.println(str1.length);
		
		String a = "abc";
		String b = new String("abc");
		String c = "abc";
		String d = new String("abc");
		System.out.println(a==b);//False =>주소가 다르다
		System.out.println(a.equals(b));//True =>문자열이같다
		System.out.println(a==c);//True =>주소가 같다
		System.out.println(a.equals(c));//True =>문자열이같다
		
		a="cba";//abc를 담고있던 주소는 남아있고 cba를 갖는 주소가 새로생긴다
		b=new String("cba");//새로 생성
		System.out.println(a==b);//False
		System.out.println(a.equals(b));//True
		
		
	}

}
