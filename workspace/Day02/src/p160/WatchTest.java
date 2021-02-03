package p160;

public class WatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch watch1 = new Watch("ARMANI", 1,30,50);
		watch1.ToString();
		System.out.println("시계의 갯수는 : "+Watch.getWatch_Number());
	}

}
