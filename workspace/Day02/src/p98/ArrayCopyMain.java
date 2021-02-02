package p98;

public class ArrayCopyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = new int[] {5,4,6,9,7,9};
		int[] target = {100,200,300,400,500,600,700};
		
		System.arraycopy(source,2, target, 3, 4);
		for(int i=0;i<target.length;i++) {
			System.out.println("target["+i+"]:"+target[i]);
		}
		
				
		int[][] b =new int[3][4];
		int cnt=1;
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				b[i][j]=cnt++;
			}				
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++)
				System.out.println(i+"행의 "+j+"열 :"+b[i][j]);
		}
		
	}

}
