package p196;

public class DiceTest {
	public static void main(String args[]) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		dice1.setResult(dice1.roll());
		dice2.setResult(dice2.roll());
		
		if(dice1.getResult()==dice2.getResult()) {
			System.out.println("서로 같은 값이 나왔습니다.");
			System.out.println("dice1의 값:"+ dice1.getResult());
			System.out.println("dice2의 값:"+dice2.getResult());
		}
		else {
			System.out.println("서로 다른 값이 나왔습니다.");
			System.out.println("dice1의 값:"+ dice1.getResult());
			System.out.println("dice2의 값:"+dice2.getResult());
		}
	}


}
