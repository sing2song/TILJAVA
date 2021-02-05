
public class Subway {
	private int route;//지하철 노선
	private int cusCnt;//승객수
	private int sales;//매출액
	private int charge=1500;//요금
	
	public int getRoute() {
		return route;
	}

	public void setRoute(int route) {
		this.route = route;
	}

	public int getCusCnt() {
		return cusCnt;
	}

	public void setCusCnt(int cusCnt) {
		this.cusCnt += cusCnt;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales += sales;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	
}
