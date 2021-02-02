package p98;

public class Test {
	public static void main(String[] args) {
		Loops:for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==5)
					break Loops;
				//break;
				//continue Loops;
				//continue;
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}
