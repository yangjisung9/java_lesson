package koreait.day08;

public class MyClass2Test {
//�ϰ���� ������ �غ����� -MyClass ��ü����
	public static void main(String[] args) {
		
		//�⺻�����ڷ� ��ü����
		MyClass2 my2=new MyClass2();
		//����: Ŀ���� �����ڸ� �����ϸ� �⺻�����ڰ� ����Ҽ� ���Ե˴ϴ�.
		
		//Ŀ���� �����ڷ� ��ü �����ϱ�
		MyClass2 my22 =new MyClass2("���");
		
		System.out.println("name :" +my2.getName());
		System.out.println("name :" +my22.getName());
		
		//my2��ü�� �⺻�����ڸ� ����ϸ� name �ʵ尪 �ʱ�ȭ�� ���մϴ�
		System.out.println("name :" +my2.getAge());
	//	System.out.println("name :" +my22.setAge(););
		
		//�⺻�����ڸ� ��������ʴ� ����
	//	Scanner sc=new Scanner();
		
	}

}