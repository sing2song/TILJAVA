package test01;

import java.lang.reflect.Method;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test01.Test";
		try {
			Class<?> test = Class.forName(str);
			Object obj = test.newInstance();
			
			Method m =test.getDeclaredMethod("print");
			m.setAccessible(true);
			m.invoke(obj);
		
			
		} catch (Exception e) {
		}
	}

}

