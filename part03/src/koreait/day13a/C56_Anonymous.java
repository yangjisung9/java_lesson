package koreait.day13a;

import koreait.day13.InterfaceA;
import koreait.day13.InterfaceB;

public class C56_Anonymous {
//인터페이스 구현체를 익명 내부 클래스로 생성하기 : 1회용 클래스 (익명클래스는 현재 파일에서만 사용할 수 있습니다)
	public static void main(String[] args) {

		InterfaceA ia = new InterfaceA() {		//interface자체로는 객체를 생성할 수 없어서 추상메소드를 만든다
			
			@Override
			public int methodB(int num) {
				System.out.println("i am anonymous!!");
				return 1234;
			}
			
			@Override
			public void methodA() {
				System.out.println("익명InterfaceA methodA");
			}
		};
		
		InterfaceB ib = new InterfaceB() {
			
			@Override
			public String name(String name) {
				return "익명 내부 클래스 : "+ name;
			}
		};
		ia.methodA();
		ia.methodB(1);
		System.out.println(ib.name("테스트"));
		ia.methodD("하이~ 인터페이스");
		InterfaceA.methodC();
		System.out.println("상수 : " + InterfaceA.SIZE);		
		
	}

}
