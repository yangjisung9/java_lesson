package koreait.day13;

public class MyClassY implements InterfaceB {
//InterfaceB�� ����ü(����Ŭ����.��ü)
	public String name(String name) {
		return "MyClassY :"+name;
	}
	
}
//���� ���� : InterfaceA, InterfaceB�� ����ü(����Ŭ����, ��ü)
class MyClassZ implements InterfaceA,InterfaceB{

	@Override
	public void methodA() {
		System.out.println("MyClassZ methodA");
		
	}

	@Override
	public int methodB(int num) {
		System.out.println("MyClassZ methodA");
		return 3333;
	}
	public String name(String name) {
		return "MyClassZ :"+name;
	}
	
}