package exception;

import java.io.IOException;
public class TestMyClass {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		try {
			mc.danger();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
