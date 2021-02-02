package p140;

public class Test02 {
	public static void main(String[] args) {
		Student student = new Student("문주영",24);
		Professor professor = new Professor("최세지",42);
		
		student.Behavior();
		professor.Behavior();
	}
}
