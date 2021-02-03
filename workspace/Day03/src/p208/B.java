package p208;


class Figure{
	void draw(){
		System.out.println("도형을 그리다");
	}
}
class Triangle extends Figure {
	void draw(){
		System.out.println("삼각형을 그리다");
	}
}
class Rect extends Figure{
	void draw(){
		System.out.println("사각형을 그리다");
	}
}
class Circle extends Figure{
	void draw(){
		System.out.println("원을 그리다");
	}
}


public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f1 = new Figure();
		Figure f2 = new Triangle();
		Figure f3 = new Rect();
		Figure f4 = new Circle();
		f1.draw();
		f2.draw();
		f3.draw();
		f4.draw();
	}

}
