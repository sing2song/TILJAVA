package p140;

public class Person {
	String name;
	int age;
	String job;
	public Person(String a, int b) {
		this.name=a;
		this.age=b;
	}
	
	public void Behavior() {
		System.out.println(name+" "+age+"세"+job+"행동: 과제 내는중..");
	}
}
