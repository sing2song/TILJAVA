package reflection;



import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.Test;

public class Main {
	@Test
	public void test_ToClass() throws ClassNotFoundException {

	    //접근 방법
	    Class<Book> bookClass = Book.class;

	    Book book = new Book();
	    Class<? extends Book> aClass = book.getClass();

	    Class<?> aClass1 = Class.forName("reflection.Book");

	}

	@Test
	public void test_ToClassField() {
	    Class<Book> bookClass = Book.class;

	    System.out.println("getFields");
	    Arrays.stream(bookClass.getFields()).forEach(System.out::println);
	    //finish();

	    System.out.println("getDeclaredFields");
	    Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
	    //finish();

	    System.out.println("getMethods");
	    Arrays.stream(bookClass.getMethods()).forEach(System.out::println);
	    //finish();

	    System.out.println("getSuperclass");
	    System.out.println(Mybook.class.getSuperclass());
	    //finish();

	    System.out.println("getInterfaces");
	    Arrays.stream(Mybook.class.getInterfaces()).forEach(System.out::println);
	    //finish();

	    System.out.println("detail Info ");
	    Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
	        System.out.println("modifies");
	        int modifies = f.getModifiers();
	        System.out.println(f);
	        System.out.println(Modifier.isPrivate(modifies));
	        System.out.println(Modifier.isStatic(modifies));
	    });
	   // finish();

	}
}
