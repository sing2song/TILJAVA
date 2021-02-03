package p210;

public class Rectangle extends Shape{

	int under;
	int h;
	
	public Rectangle(int under, int h) {
	// TODO Auto-generated constructor stub
		this.under = under;
		this.h = h;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그립니다.");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return under * h * 0.5;
	}
	
}
