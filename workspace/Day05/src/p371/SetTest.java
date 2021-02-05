package p371;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();

		set.add("dog");
		set.add("dog");
		System.out.println(set);//dog 하나 들어가있다. String은 알아서 비교를해준다!! 똑같은걸 넣어주지않는다
	
		set.add(new String("abc"));
		set.add(new String("abc"));
		System.out.println(set.size());//2 
		System.out.println(set);//=> [dog,abc]
		
		
		Person p3 = new Person("kim",10);
		Person p4 = new Person("kim",10);
		System.out.println(p3.equals(p4));//false
		
		set.add(new Person("kim",10));
		set.add(new Person("kim",10));
		set.add(new Person("kim",20));
		System.out.println(set);//[kim, 20, abc, kim, 10, kim, 10, dog]
		
		
		set.add(new Person("lee",30));
		set.add(new Person("lee",30));
		System.out.println(set);//[kim, 20, abc, lee, 30, kim, 10, kim, 10, lee, 30, dog]
	}

}

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return name+", "+age;
	}
}