package bookTest;

import java.util.Calendar;

public class Novel implements Lendable {

	private String title;
	private String author;
	private String user;
	public Novel(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public void lendBook(String user) {
		// TODO Auto-generated method stub
		this.user = user;
		System.out.println(this.title+ " borrowed by " + this.user + " on " + Calendar.getInstance().getTime());
	}
	@Override
	public void returnBook() {
		// TODO Auto-generated method stub
		System.out.println(this.title+ " returned by " + this.user + " on " + Calendar.getInstance().getTime());
		this.user = "";
	}


}
