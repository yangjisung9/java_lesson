package koreait.test;

public class ProductTest {

	public static void main(String[] args) {
		//13
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[1] = new Electronics(35000, "USB");
		cart[3] = new Bike(99000, "»ïÃµ¸®",15);
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg³ÃÀå°í");
		
		//14
		System.out.println(((Electronics) cart[7]).power(0.9));
		//15
		for(Product temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		
		
		//16
/*		for(Product bike : cart)
			if(bike instanceof Bike==true) 
		System.out.println(((Bike) bike).ride(speed));
*/	}
	@Override
	public String toString() {
		return "ProductTest []";
	}

}


