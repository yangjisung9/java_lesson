package koreait.day09a;

public class Crow extends Animal{	//���

	protected int wings;
	
	
	public Crow() {	//������ ��ä�����Ҷ� ���	��¼����� �θ�Ŭ������ ������ ��������µ�
		System.out.println("���ο� ���������� crow");
	}
	
	
		public void fly() {
			setName("���");
			setColor("������"); 
			System.out.println("Ư¡ : ����" );
			
		}
}