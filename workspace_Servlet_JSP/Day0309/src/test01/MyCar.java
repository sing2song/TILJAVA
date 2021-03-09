package test01;

import java.lang.reflect.Method;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Test";
		try {
			Class<?> test = Class.forName(str);
			Object obj = test.newInstance();
			Method m =test.getDeclaredMethod("print");
			m.invoke(obj);
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//MyClass o = new MyClass();
	}

}

class Test{
	public static void print() {
		System.out.println("hello");
	}
}
