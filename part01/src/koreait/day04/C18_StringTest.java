package koreait.day04;

public class C18_StringTest {

	public static void main(String[] args) {
		
		String name = "kim"; 			//참조형 변수 (기본형 타입이 아니고 클래스 타입이므로 name은 참조형 변수이다)
		String name2 = "kim";
		String name3 = "lee";
		String name4 = new String("kim");	// 새로운 String 객체 생성 (new 는 무조건 새로운 객체를 생성)
											// 7,8은 참조 위치가 같다
		
		System.out.println("name == name2 참조 위치?" + (name ==name2));		//true
		System.out.println("name == name4 참조 위치?" + (name ==name4));		//false
		System.out.println("name2 == name4 참조 위치?" + (name2==name4));		//false
		
		name2 = "son";
		System.out.println("name == name2 참조 위치?" + (name == name2));		//false
		
		//new는 값이 무엇이든 간에 완전히 새로운 메모리를 할당받는 것이다.
		
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.printf("name3 = %s\n" , name3);
		System.out.printf("name4 = %s\n" , name4);
		
		
		
		
	/*	
	 * 		문자열 : 기호 ""를 사용하면문자열입니다. (''를 사용하면 문자형)
	 * 		자바에서는 기본형 데이터 아니고 String 클래스 타입으로 사용합니다
	 * 								ㄴ필드, 메소드 이용하여 문자열 기능 사용
	 * 
	 * 
	 */

	}

}
