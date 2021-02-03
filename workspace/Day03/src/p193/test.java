package p193;

public class test {
	public static void main(String args[]){
		//얕은복사의 예
		MyClass c1 = new MyClass("이태호", 25);
		MyClass c2 = c1;
		//c2에 값을 넣고 c1을 확인해본다.
		c2.Set_Age(99);
		System.out.println(c1.Get_Age());//99
		System.out.println(c2.Get_Age());//99
		
		//깊은 복사의 예
		MyClass c3 = new MyClass("이태호", 25);
		MyClass c4 = (MyClass) c3.Clone();
		c4.Set_Age(99); //c4에 값을 넣고 c3을 확인해본다.
		System.out.println(c3.Get_Age());//25
		System.out.println(c4.Get_Age());//99
	}
}
