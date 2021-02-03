package customerTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dogTest.Dog;

public class CustomerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vip vip = new Vip("1","q","vip","J");
		Gold gold = new Gold("2","g","gold");
		
		System.out.println(vip);
		vip.buying(20000);
		System.out.println(vip);
		
		System.out.println(gold);
		gold.buying(20000);
		System.out.println(gold);
	}
}
