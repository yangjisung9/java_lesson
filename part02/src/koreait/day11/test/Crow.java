package koreait.day11.test;

public class Crow extends Animal{	//���

	protected int wings;
	
	
	public Crow() {	//������ ��ä�����Ҷ� ���	��¼����� �θ�Ŭ������ ������ ��������µ�
		System.out.println("���ο� ���������� crow");
		type=Animal.CROW;
	}
	
	
		public void fly() {
			setName("���");
			setColor("������"); 
			System.out.println("Ư¡ : ����" );
			
			
		}
		
		//�߻�޼ҵ� ������(����)
		@Override
			public void act() {
				System.out.println("Animal �ൿ: �Ϸ����� ����ٴϱ�");
				
			}
		@Override
			public String eat(Object object) {
					return "���̴� ������"+object+"���� �Դϴ�.";
			}
}