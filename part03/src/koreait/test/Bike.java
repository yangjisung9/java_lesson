package koreait.test;
//작성자명 양지성
public class Bike extends Product{
	//6	
	private int speed;
	
	//7
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	//10
	public static String ride(int speed) {
		return "당신은 이것을 시속 "+speed+"km 로 탈 수 있습니다";
	}

	//4
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d %%인하", obj);
	}
	
	//6
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//12
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	


	
	
	
}
