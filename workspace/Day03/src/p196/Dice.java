package p196;

import java.util.Random;
public class Dice {
	private int result=0;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public int roll() {
		Random rd = new Random();
		result = rd.nextInt(5)+1;
		return result;
	}
}
