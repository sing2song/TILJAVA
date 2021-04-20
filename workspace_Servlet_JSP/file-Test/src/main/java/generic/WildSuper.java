package generic;


import java.util.*;

// Person 클래스
class Person {
	String name;

	// 기본 생성자
	Person() {
	}

	// 생성자 오버로딩
	Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

// Person 상속 Man 클래스
class Man extends Person {
	// 생성자
	Man(String name) {
		this.name = name;
	}

	// name 반환 메소드
	public String toString() {
		return name.toString();
	}
}


// Person 상속 Woman 클래스
class Woman extends Person {
	Woman(String name) {
		this.name = name;
	}

	public String toString() {
		return name.toString();
	}
}

public class WildSuper {

	public static void main(String[] args) {

		// Person
		List<Person> listP = new ArrayList<Person>();
		listP.add(new Person("사람"));
		listP.add(new Person("인간"));
		printData(listP); // 사람 인간

		// Man
		List<Man> listM = new ArrayList<Man>();
		listM.add(new Man("하현우"));
		listM.add(new Man("박효신"));
		printData(listM); // 하현우 박효신

		// Woman
		List<Woman> listW = new ArrayList<Woman>();
		listW.add(new Woman("백예린"));
		listW.add(new Woman("박정현"));
		//      printData(listW); → Man 클래스의 상위 클래스가 아니기 때문에 메소드 호출 불가

	}

	// Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
	public static void printData(List<? super Man> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}