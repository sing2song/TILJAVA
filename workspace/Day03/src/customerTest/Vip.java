package customerTest;

public class Vip extends Customer implements Buy{
	private String manager;

	public Vip(String id, String name, String grade, String manager) {
		super(id, name, grade);
		this.manager = manager;
		this.setSr(2.5);
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public void buying( int cost) {		
		System.out.println(this.getName()+"님께서 "+cost + "원 제품을 구매하셨습니다. ");
		this.getBonusPoint(cost);
	}

	public void getBonusPoint(int cost) {		
		double add = cost*this.getSr();
		System.out.println("추가 적립 포인트 : "+add);
		add += this.getBp();
		this.setBp((long)add);
	}

	public String toString() {		
		return "매니저 : "+this.getManager()+", 구매자 : "+this.getName()  +", bunus point: "+this.getBp()+", 등급 : "+this.getRank();
	}
}

