package p56;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;//0000 0100
		int y = 8;//0000 1000
		System.out.println(x & y);//0000 0000 =0
		System.out.println(x | y);//0000 1100 = 12
		System.out.println(x ^ y);//0000 1100 = 12
		System.out.println( ~x );//1111 1011 = -5
		System.out.println( x << 5);//1000 0000 = 128
		System.out.println( y >> 2);//0000 0010 = 2
		int bignum = (x > y) ? x : y;
		System.out.println(bignum);//8
	}

}
