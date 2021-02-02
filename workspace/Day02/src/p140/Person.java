package p140;

public class Person {
	String name;
	int age;
	String job;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void Behavior() {
		System.out.println(name+" "+age+"세"+job+"행동: 과제 내는중..");
	}
}
