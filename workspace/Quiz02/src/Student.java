
public class Student {
	private String name;
	private int grade;
	private int money;
	
	public Student(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//학생정보출력
	public void print() {
		System.out.println("name:"+name+
				", grade:"+grade+
				", money:"+money);
	}
	
	public boolean pay(int payment) {
		if(payment>money) {
			return false;//System.out.println("잔액이 부족합니다.");
		}else	
			return true;//this.money-=payment;
	}
	
}
