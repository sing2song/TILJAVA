package p191;


class Variable{
	public static void display(String ...strings) {
		for(String s:strings) {
			System.out.println("가변 배열 형태 :"+s);
		}
	}
}
public class test {
	public static void main(String[] args) {
		Variable.display("Hello","java","good");
	}
}
