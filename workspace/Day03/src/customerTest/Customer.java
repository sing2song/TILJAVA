package customerTest;

public class Customer {
	private String id;
	private String name;
	private String rank;
	private long bp;
	private double sr;
	
	public Customer(String id,String name, String rank) {
		this.id=id;
		this.name=name;
		this.rank=rank;
		this.bp=10000;
		this.sr=0;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public long getBp() {
		return bp;
	}

	public void setBp(long bp) {
		this.bp = bp;
	}

	public double getSr() {
		return sr;
	}

	public void setSr(double sr) {
		this.sr = sr;
	}
	
}
