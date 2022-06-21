package koreait.day14;

import java.util.Random;

public class FunctionATest {

	public static void main(String[] args) {
		
		//1) 익명 클래스: 추상메소드의 개수 상관없습니다
		FunctionA fa = new FunctionA() {
			@Override
			public int methodA(int a, int b) {
				System.out.print("a*b=");
				return a*b;
			}
			
		};
		System.out.println(fa.methodA(23, 11));
		
		//2 람다식 : 추상메소드가 1개일 때만 가능. 즉 함수형 인터페이스만 표현이 가능합니다 (메소드 이름을 생략한 형식)
		fa = (int a, int b) -> {
			System.out.print("a+b=");
			return a+b;
		};
	
		System.out.println(fa.methodA(23, 11));
		
		
		fa = (int max, int min) -> {
			Random r = new Random();
			System.out.print("난수 = ");
			return r.nextInt(max-min+1)+min;
			
				};
		System.out.println(fa.methodA(99, 11));
	}

}
