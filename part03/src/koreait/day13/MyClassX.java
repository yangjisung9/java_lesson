package koreait.day13;

//InterfaceA의 구현체(구현클래스,실체)
public class MyClassX implements InterfaceA{
	//public abstract가 생략된 형태이므로추상메소드가 있어야한다.

	public void methodA() {
		System.out.println("MyClassX methodA");		
	}

	public int methodB(int num) {
		System.out.println("MyClassX methodB"+num);		
		return 999;
	}

	
}
