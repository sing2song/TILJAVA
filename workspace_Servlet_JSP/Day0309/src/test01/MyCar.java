package test01;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MyCar";
		try {
			Class<?> o = Class.forName(s);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//MyClass o = new MyClass();
	}

}
