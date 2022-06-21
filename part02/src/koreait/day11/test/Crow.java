package koreait.day11.test;

public class Crow extends Animal{	//까마귀

	protected int wings;
	
	
	public Crow() {	//생성자 객채생성할때 출력	출력순서는 부모클래스의 생성자 다음에출력됨
		System.out.println("새로운 동물가족은 crow");
		type=Animal.CROW;
	}
	
	
		public void fly() {
			setName("까마귀");
			setColor("검정색"); 
			System.out.println("특징 : 날기" );
			
			
		}
		
		//추상메소드 재정의(구현)
		@Override
			public void act() {
				System.out.println("Animal 행동: 하루종일 날라다니기");
				
			}
		@Override
			public String eat(Object object) {
					return "먹이는 개구리"+object+"마리 입니다.";
			}
}