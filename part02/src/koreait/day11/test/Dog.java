package koreait.day11.test;

public class Dog extends Animal {

	protected int legs;	//protected�� �ܺ���Ű���� �ִ� �ڽ�Ŭ�������� ���ٰ���??
	
	
public	Dog () {
	System.out.println("���ο� ���������� dog");
	type=Animal.DOG;
}
	
	public void run() {
		setName("������");
		setColor("����");
		System.out.println("Ư¡ : �޸���");
	}
		@Override
		public void act() {
			System.out.println("Animal �ൿ: �Ϸ翡 2�� ��å�ϱ�");
			
		}
		@Override
		public String eat(Object object) {
			return "���̴� "+object+"�Դϴ�.";
		}
}
