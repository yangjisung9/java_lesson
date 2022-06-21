package koreait.day10;

import koreait.day09a.Animal;
import koreait.day09a.Crow;
import koreait.day09a.Dog;

public class AnimalTest3 {

	//다형석 구현 예시3
	public static void main(String[] args) {
		
		
		//부모타입 클래스 배열 : 배열에는 Animal 타입 인스턴스 객체의 참조값이 저장.
		Animal[] animals = new Animal[10];
		
		animals[0] = new Frog();
		animals[1] = new Cat();
		animals[5] = new Dog();
		animals[7] = new Frog();
		animals[8] = new Crow();
		
		for(Animal temp : animals)	{	//배열에서 순서대로 하나씩 꺼내보기
			System.out.println("::::");
			if(temp !=null) {
				Cat cat; Dog dog; Frog frog; Crow crow;
				if(temp instanceof Cat) {
					cat = (Cat)temp;	//다운캐스팅:animal 진짜 객체에 따라 오류 또는 오류 없음. -> instanceof
					cat.sound();
								}
				if(temp instanceof Dog) {
					dog = (Dog)temp;	
					dog.run();
										}
				if(temp instanceof Frog) {
					frog = (Frog)temp;
					frog.jump();
										}
				if(temp instanceof Dog) {
					crow = (Crow)temp;
					crow.fly();
										}
				temp.act();
				temp.print();
							}	//if end
			else {
				System.out.println("null 참조입니다.");
				}
			System.out.println("::::");
									}

	

}
}
