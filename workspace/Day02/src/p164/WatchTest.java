package p164;

public class WatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch watch = new Watch();
		//watch.brand = "SEIOK"; // 오류!
		watch.SetBrand("SEIOK");
		//watch.hour = 8; // 오류!
		watch.SetHour(8);
		watch.minute=25;//OK
		watch.second=50;//같은 패키지이므로 OK
	}

}
