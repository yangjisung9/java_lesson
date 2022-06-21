package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {

		int a = 23;
		int b = 19;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + a + "cm");
		System.out.println("세로 : " + b + "cm");
		System.out.println("넓이를 구했습니다. -> " + a*b +"㎠");

		double c = 23.230;
		double d = 3.14*c*c;
		
		System.out.println();
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.println("반지름 : " + c + "cm");
		System.out.println("둘레를 구했습니다. -> " + 2*3.14*c + "cm");
		System.out.println("넓이를 구했습니다. -> " + d + "㎠ \n");
		
		System.out.printf("\n");
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.printf("가로 : %d cm\n" ,a );
		System.out.printf("세로 : %d cm\n" ,b );
		System.out.printf("넓이를 구했습니다. -> %d ㎠ \n" ,a*b);
		
		System.out.printf("\n");
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("반지름 : %f cm\n" ,c );
		System.out.printf("둘레를 구했습니다. -> %.3f cm\n" ,2*3.14*c);
		System.out.printf("넓이를 구했습니다. -> %.3f ㎠ \n" , d);
		
		//final 테스트
		//		변수선언 앞에 final(최종의) 키워드를 붙이면 값을 변경하지 못합니다.
		
		final int test = 123;			//값을 변경 못하는 상수입니다.
		System.out.println("test =" + test);
		
//		test = 456;			//오류 : final로 선언됨.
		
				
		
		
	}

	

}
