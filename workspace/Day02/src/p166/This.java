package p166;

public class This {
	int i;
	double d;
	
	public This(int i) {//생성자
		this(3.14);//키워드 this
		System.out.println(i);
	}
	public This(double d) {//생성자
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t = new This(100);
	}

}
