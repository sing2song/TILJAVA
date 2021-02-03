package p173;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Now {
	SimpleDateFormat dayTime = new SimpleDateFormat("[hh:mm:ss]");
	private String time = dayTime.format(new Date());
	
	private String name="쏭";
	public String getTime() {
		return time;
	}
	
	public void setTime(String t) {
		time=t;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}

}
