package p371;

public class Test {
	public static void main(String[] args) {
		String str1="apple";
		String str2="apple";

		String str3=new String("apple");
		String str4 = new String("apple");

		System.out.println(str1==str2);//true
		System.out.println(str2==str3);//false
		System.out.println(str3==str4);//false
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str2.equals(str3));//true
		System.out.println(str3.equals(str4));//true
		
		System.out.println(str2.equalsIgnoreCase(str3));//true
		System.out.println(str2.equalsIgnoreCase(str4));//true
		//equalsIgnoreCase()=대소문자 구분하지 않고 형태만 같으면 똑같다!

	}
}
