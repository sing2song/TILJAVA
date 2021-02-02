package p98;

public class ArrayMain {
	public static void main(String[] args){
		int[] ap = new int[]{0,1,2,3,4,5,6,7,8,9}; //초기화 방법 1
		int[] aw = {10,11,12,13,14,15,16,17,18,19}; //초기화 방법 2
		int[] ad = new int[10]; //선언과 할당의 분리
		ad[0] = 20; ad[1] = 21; ad[2] = 22;
		ad[3] = 23; ad[4] = 24; ad[5] = 25;
		ad[6] = 26; ad[7] = 27; ad[8] = 28;
		ad[9] = 29;
		
		//1. int[] ap 출력
		for(int i=0; i<ap.length; i++){
			System.out.print(ap[i] + "\t");
		}
		//2. int[] aw 출력
		for(int i=0; i<aw.length; i++){
			System.out.print(aw[i] + "\t");
		}

		//3. int[] ad 출력
		for(int i=0; i<ad.length; i++){
			System.out.print(ad[i] + "\t");
		}
	} //end of main
} //end of ArrayMain class