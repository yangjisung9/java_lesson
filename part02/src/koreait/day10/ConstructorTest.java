package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		

	}

}
class Product{
	int price;
	//����Ʈ �����ڴ� ������ ���մϴ�.
	
	public Product(int price) {
		this.price=price;
	}
}
class Food extends Product{	
	//Product()	����Ʈ ������ ���� ������ ����
	//-> �ڽ�Ŭ������ Ŀ���һ����ڸ� �����ؼ� �θ�Ŭ����
	//Ŀ���� �����ڸ� ȣ��
	public Food(int price) {
		super(price);
	}
}
class Electronics extends Product{	//Product()	����Ʈ ������ ���� - Food() ����Ʈ ������ ����
	public Electronics(int price) {
		super(price);				//Product()	����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
	}
	
}
