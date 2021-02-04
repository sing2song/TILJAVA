package collection;

import java.util.Collections;

import java.util.Random;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector();
		Random rd = new Random();
		int max = 0;
		int total = 0;
		int n = 0;

		for(int i=0;i<5;i++) {
			v.add(rd.nextInt(5));
		}			
		System.out.println("랜덤발생");

		for(int i = 0; i < v.size(); i++) {
			n = (Integer)(v.get(i));
			total += n;
			if(max < n) {
				max = n;
			}
		}
		System.out.println("전체의 합: " + total + " 가장 큰 수: " + max);
	}

}

