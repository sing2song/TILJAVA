
public class Bus {
	private int number;//버스번호
	private int cusCnt;//승객수
	private int sales;//매출액
	
	private int charge=1300;//요금
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
