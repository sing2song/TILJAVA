package p193;

public class MyClass {
	private String name;
	private int age;
	//생성자
	public MyClass(){}
	public MyClass(String a, int b){
		this.name = a;
		this.age = b;
	}
	//Get,Set
	public String Get_Name(){
		return name;
	}
	public int Get_Age(){
		return age;
	}
	public void Set_Name(String a){
		this.name = a;
	}
	public void Set_Age(int b){
		this.age = b;
	}
	//깊은 복사를 하기위해 Cloneable 인터페이스를	재정의 한다.
	public Object Clone() {
		MyClass a = new MyClass();
		a.Set_Name(this.name);
		a.Set_Age(this.age);
		return a; // 생성된 객체를 리턴
	}

}
