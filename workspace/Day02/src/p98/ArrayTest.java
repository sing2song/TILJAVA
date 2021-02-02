package p98;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayTest {
	final static int STUDENT=5;
	
	public static void main(String[] args) {
		int[] scores=new int[STUDENT];
		getValue(scores);
		getAverage(scores);
		printScore(scores);
	}
	
	//성적입력
	private static void getValue(int[] array) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("성적 입력 :");
			array[i] = sc.nextInt();
		}
	}
	
	//평균
	private static void getAverage(int[] array) {
		// TODO Auto-generated method stub
		int total=0;		
		for(int i=0;i<array.length;i++) {
			total+=array[i];
		}
		System.out.println("평균 : "+ total/array.length);
	}
		
	private static void printScore(int[] array) {
		System.out.println("#####점수목록#####");
		for(int i=0;i<array.length;i++) {
			System.out.println("점수 :"+array[i]);
		}
	}
}
