package koreait.day13;

public class C53_InterfaceTest {

	public static void main(String[] args) {
		MyClassX x1 = new MyClassX(); //클래스 객체 선언
		MyClassY y1 = new MyClassY(); 
		MyClassZ z1 = new MyClassZ(); 
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();

//참조 타입에 따른 메소드 실행(다중 구현체)	: z1,z2,z3 이 어떤 메소드 실행가능한지?
		z1.methodA();
		z1.methodB(23);
		z1.name("쯔위");
		
		z2.methodA();
		z2.methodB(24);
//		z2.name("쯔위");		//오류:InterfaceB의 추상메소드로 실행 못함 (InterfaceA 로 선언되었기때문)
		
//		z3.methodA();		//오류:InterfaceA의 추상메소드로 실행 못함 (InterfaceB 로 선언되었기때문)
//		z3.methodB(24);		//오류:InterfaceA의 추상메소드로 실행 못함 (InterfaceB 로 선언되었기때문)
		z3.name("쯔위");
		
//	캐스팅(변수 또는 값의 타입변환) : 다중 구현체의 인터페이스 타입 캐스팅
//			ㄴMyClassZ는 InterfaceA 와 InterfaceB 타입으로 모두 참조
		InterfaceB ib = (InterfaceB)z2;
		ib.name("쯔위");
		InterfaceA ia = (InterfaceA)z3;
		ia.methodA();
		
		iAmethod(x2);
//		iAmethod(y2);	오류 : InterfaceA 구현체 아님.
		iAmethod(z2);
		iAmethod(x1);	//InterfaceA를 implement한 클래스여서 가능
		iAmethod(z1);
		iAmethod(z2);
//		iAmethod(z3);	오류: InterfaceA를 implement한 클래스이지만 변수 참조타입이 InterfaceB
		
		iBmethod(y1); 	
		iBmethod(y2); 	
		iBmethod(z1); 	
//		iBmethod(z2);	오류 : InterfaceA를 implement한 클래스이지만 변수 참조타입이 InterfaceA 
		iBmethod(z3); 	
		
		
		
	}
	//다형성 구현 예시 : 메소드 인자 타입인 InterfaceA
	//		InterfaceA 구현체는 모두 인자로 전달가능
	public static void iAmethod(InterfaceA ia)	{
		ia.methodA();
	}
	//		InterfaceB 구현체는 모두 인자로 전달가능
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
	}
	
}
