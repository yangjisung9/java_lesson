package koreait.test;

public class Electronics extends Product{
	
	private double kwh;
	
	//9
	Electronics(int price,String prdName) {
		this.price=price;
		this.prdName=prdName;
		}
	
	//8
	public double getKwh() {
		return kwh;
	}
	
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	//11
	public double power(double kwh) {
		return 24*kwh;
	}
	
	
	//5
	@Override
	public String sell(Object obj) {
		return String.format("π≠¿Ω ªÛ«∞ - %s (1set)", obj);
	}
	//12
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}



	}

