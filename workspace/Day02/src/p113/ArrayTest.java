package p113;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]score = {{60,70,80},{70,80,90},{80,90,100}};
		int[] student = new int[3];
		int[] subject = new int[3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				student[i]+=score[i][j];
			}
			System.out.println((i+1)+"번 학생의 총점:"+student[i]);
		}
		
		int[][] score2= {
				{10,10,10},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int[][] result=new int[score2.length+1][score2[0].length+1];
		//Q. 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지
		//막 요소에 각 열과 행의 총합을 저장하고 출력해보자.
		
		for(int i=0;i<score2.length;i++) {
			for(int j=0;j<score2[i].length;j++) {
				
				result[i][j]=score2[i][j];
				//누적
				result[i][score2[i].length]=result[i][score2[i].length]+score2[i][j];
				result[score2.length][j]=result[score2.length][j]+score2[i][j];
				
				//마지막 끝값
				result[score2.length][score2[i].length]=result[score2.length][score2[i].length]+score2[i][j];
				
			}
			
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println();
		}
		
		
		
	}//main

}
