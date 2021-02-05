package p384;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=10;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<50;i++) {
			list.add(i);
		}
		int index=Collections.binarySearch(list, number);
		System.out.println("탐색 후 반환 값="+index);
		
	}

}
