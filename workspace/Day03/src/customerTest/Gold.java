package customerTest;

class Gold extends Customer implements Buy {
	public Gold(String id, String name, String grade) {
		super(id, name, grade);
		this.setSr(1.5);
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

	
}

