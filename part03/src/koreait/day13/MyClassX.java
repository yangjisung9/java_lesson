package koreait.day13;

//InterfaceA�� ����ü(����Ŭ����,��ü)
public class MyClassX implements InterfaceA{
	//public abstract�� ������ �����̹Ƿ��߻�޼ҵ尡 �־���Ѵ�.

	public void methodA() {
		System.out.println("MyClassX methodA");		
	}

	public int methodB(int num) {
		System.out.println("MyClassX methodB"+num);		
		return 999;
	}

	
}
