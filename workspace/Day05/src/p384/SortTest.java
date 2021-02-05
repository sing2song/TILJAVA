package p384;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Grade implements Comparable<Grade> { //Comparable 인터페이스는 compareTo() 라는 메소드를 가진다.
	int number;
	String grade;
	public Grade(int number,String grade) {
		this.number = number;
		this.grade = grade;
	}
	public String toString() {
		return grade;
	}
	public String getGrade() {
		return grade;
	}
	
	@Override	
	public int compareTo(Grade g) { // 객체를 서로 비교하기 위한 메소드이다.
		//return number- g.number;//숫자로 비교
		return this.getGrade().compareTo(g.getGrade());	//grade로 비교
	}
	
}
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade array[] = {
				new Grade(20130001, "A+"),
				new Grade(20130002, "C+"),
				new Grade(20130003, "B+"),
				new Grade(20130004, "D")
		};
		List<Grade> list = Arrays.asList(array);
		Collections.sort(list); // 정렬하는 도중에 Grade클래스의 compareTo() 메소드를 사용한다.
		System.out.println(list);

	}

}
