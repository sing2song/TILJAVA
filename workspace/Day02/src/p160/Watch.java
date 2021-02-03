package p160;

public class Watch {
	private String brand;
	private int hour;
	private int minute;
	private int second;
	
	private static int watch_number=0;//정적변수
	static final int MAX_NUMBER=5;
	
	//디폴트 생성자
	public Watch() {}
	//매개변수가 있는 생성자
	public Watch(String brand, int hour, int minute, int second) {
		this.brand=brand;
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		watch_number++;//시계만들어진것체크
	}
	
	//일반메소드
	public void ToString() {
		System.out.println(brand+" "+hour+" "+minute+" "+second);
	}
	
	//get메소드
	public static int getWatch_Number() {
		return watch_number;
	}
}
