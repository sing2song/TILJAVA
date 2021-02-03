package dogTest;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Dog> dogs = new ArrayList<Dog> ();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("name: ");
			String name = sc.next();
			System.out.println("type: ");
			String type = sc.next();

			dogs.add(new Dog(name, type));
			System.out.println("continue? y/n");
			if(sc.next().equals("n")) break;
		}
		sc.close();

		for(Dog d : dogs) {
			System.out.println(d.toString());
		}
	}


}

