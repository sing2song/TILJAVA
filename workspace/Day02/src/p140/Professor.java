package p140;

public class Professor extends Person {

	public Professor(String name, int age) {
		super(name, age);
		this.job="교수";
		// TODO Auto-generated constructor stub
	}
	
	public void Behavior() {
		System.out.println(name+" "+age+"세 "+job+"행동: 과제 내는중..");
	}

}
