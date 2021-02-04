package p353;

import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector v = new Vector(10);
		v.add("10");
		v.add("9");
		v.add("8");
		v.add("7");
		print(v);
		
		v.trimToSize(); // tirmToSize()메소드는 빈공간을 없앤다.
		System.out.println("===[빈공간을 없앤 후]===");
		print(v);
		
		v.ensureCapacity(6); //ensureCapacity(6)은 버퍼의 크기를 6이상으로 늘린다.
		System.out.println("===[버퍼크기6이상 늘린 후]===");
		print(v);
		v.clear();
		System.out.println("===[벡터를 지운 후]===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity() : " + v.capacity());
	}
}
