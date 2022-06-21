package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {
		boolean result;
		
		result = 10 > 5;
		System.out.println("10 > 5 결과 : " + result);
		
		System.out.println("9 != 9 결과 : " + (9!=9));
		
		System.out.println("9 == 9 결과 : " + (9==9)); 
		
		// 검사하고 싶은 수식을 만들 수 있어야 한다.
		
		int korean, math ; //국어점수, 수학점수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 ->" );
		korean = sc.nextInt();
		System.out.println("수학 점수 입력 ->" );
		math = sc.nextInt();
		
		//국어 점수와 수학 점수 모두 80점 이상인가? 		-> 모범학생
		System.out.println("모범학생?" + (korean>=80 && math>=80));	
		
		//국어점수 또는 수학점수 중 90점 이상이 있는가?		-> 특기학생
		System.out.println("특기학생?"	 + (korean>=90 || math>=90));
		
		//국어점수가 20~80이 아닌(not) 학생들은 ? -> 특이한 학생
		System.out.println("특이한 학생? " + (!(korean>20) || !(korean<80)));
		
/*
 * 		System.out.println("논리연산 결과 확인하기 : and");
 * 		System.out.println(" true and true = " + (true && true));
	    System.out.println(" true and false = " + (true && false));
	     				//아래의 2개 논리식은 첫번째값이 false 이므로 두번째 값은 don't care 상관없이 결과 false - &&는 두값이 모두 참이어야 참 
	    System.out.println(" false and true = " + (false && true));		//	ㄴ 위와 같은 이유로 37 ture와 38 두번째 false는 데드코드이다
	    System.out.println(" false and false = " + (false && false));
	      
	    System.out.println("논리연산 결과 확인하기 : or");
	      				//아래의 2개 논리식은 첫번째 값이 true 이므로 두번째 값은 don't care 상관없이 결과 true - ||는 두값이 모두 거짓이어야 거짓
	    System.out.println(" true or true = " + (true || true));			//			ㄴ 위와 같은 이유로 데드코드 발생
	    System.out.println(" true or false = " + (true || false));
	    System.out.println(" false or true = " + (false || true));
	    System.out.println(" false or false = " + (false || false));
	      
	    System.out.println("논리연산 결과 확인하기 : not");
	    System.out.println(" not ture = " + !true);    	//true 값을 반대(not)값으로 바꿈
	    System.out.println(" not false = " + !false);
 */
	      		
		
		
		
		
		
		
		
		
	/*
	 *	데이터의 기본 형식 : boolean 은 true 또는 false 값을 갖는 형식. (Boolean 래퍼 클래스 있습니다.)
	 * 
	 *	관계연산 ==(동등,같다.) , != (같지 않다) , > , < , >= , <= 				이 연산의 결과값은 boolean 형식
	 *	논리연산 && (and , 그리고) , || (or , 또는) , !(not) 					이 연산의 결과값은 boolean 형식
	 *	참고 : if , for 에서 필요한 조건식에 관계 연산이 사용됩니다.
	 */

	}

}
