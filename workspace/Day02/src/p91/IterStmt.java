package p91;

public class IterStmt {
	
	public static void main( String args[] ) {
		int n = 10, sum = 0;
		for( int i = 1; i <= n; i++ ){
			sum += i;//지역변수
		}
		System.out.println(sum);//55
		
		int i;
		i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);//110
		
		i = 1;
		do {
			sum += i;
			i++;
		} while (i <= n);
		
		System.out.println(sum);//165
		
		
	}
}
