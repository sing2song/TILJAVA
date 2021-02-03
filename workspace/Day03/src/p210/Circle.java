package p210;

public class Circle extends Shape{
int r;


public Circle(int r) {
	this.r=r;
}

@Override
public void draw() {
	// TODO Auto-generated method stub
	System.out.println("원을 그린다");
}

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return r*r;
}

}
