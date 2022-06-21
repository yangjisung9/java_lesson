package koreait.day02;


//참고 : 자바 프로그래밍언어에서는 클래스 이름과 파일명이 동일해야 합니다.
public class C07_CastingTest {

	public static void main(String[] args) {
		
//		대입문 : 오른쪽 값 (리터럴) / 수식 / 변수가 왼쪽 변수로 대입.
//			수식에 사용되는 연산은 다음과 같습니다.				
//				산술연산 + , - , * , /(나눗셈 몫) , %(나눗셈 나머지, 정수연산에서만)
//				관계연산 ==(동등,같다) , != (같지 않다.) , > , < , >= , <=
//				논리연산 && (and , 그리고) , || (or , 또는) , !(not) 
//											ㄴ	shift+\\	
//	참고 : ++ , -- , += , -= , *=, /= 과 같은 축약연산자도 활용
		//정수형식의 연산은 int를 활용
		
		int a = 123 , b = 13;			// 같은 형식의 두 개의 변수를 한 줄에 쓸 수도 있다.
		double c=10.34;
		
		//	연산에 사용되는	피연산자(123,13)가 모두 정수이면 결과는 정수
		//				피연산자가 정수, 실수 경우라면 결과는 실수
		//				-> 연산결과를 변수에 저장할 때 데이터 형식을 고려
		
		int isum;
		double dsum;
		
		isum = a+b;
		dsum = a+c;
		
		System.out.println("a +b = " + isum);
		System.out.println("a +c = " + dsum);
		
//		isum = a +c;		// 결과가 실수이므로 정수형식 변수에 저장 못한다. : 오류
							// 실수를 꼭 정수형 변수에 대입해야 한다면 형변환한다
		
//		형변환(casting) : 정수 + 실수 결과를 꼭 정수 변수에 저장해야 한다면, 실수를 정수로 변환해서 연산을 한다		
//					-> 프로그래머가 결정해서 강제로 형변환
		//	i는 정수 , d는 실수
		
		isum = a + (int)c;	//c변수의 실수값을 정수로 변환(소수점 아래 버림)
	
		System.out.println("a +(int)c = " + isum);
		b=10;
		System.out.println(" a / b = " + (a/b));		//	정수끼리 나누면 결과 정수
		System.out.println(" a % b = " + (a%b));		//	정수끼리 나누기의 나머지
		
		System.out.printf("%d / %d = %d\n", a,b,a/b);
		System.out.printf("%d %% %d = %d\n", a,b,a%b);

//		강제 형변환(캐스팅) 예시 : 정수끼리 나눗셈 결과를 실수로 구하고 싶다면....		
//						-> 정수 1개를 실수로 변환 (정수+실수는 실수로 출력되므로)
		
//		\(역슬래쉬) 사용하는 이스케이프 문자 : \n (줄바꿈) , \t(tab)
//		 * 	형식지정문자 %기호 사용 : %s(문자열) , %d(정수) , %f(실수)
		
		System.out.println("정수 / 정수 = 실수 형식 값으로 구합니다.");
		System.out.printf("%d / %d = %f\n", a,b,(double)a/b);	//실수 형식문자 %f , 기본 소수점이하 6자리
//																					ㄴ f앞에 .n으로 입력해서 소수점아래 n자리 까지 출력한다
		b=11;
		System.out.printf("%d / %d = %.3f\n", a,b,(double)a/b);	// 소수점아래 3자리로 변경, 소수점이하 자리수 변경할때 자리수 이하의 수들은 반올림으로 처리된다

		double test = 12.3456123456789;
		System.out.println("test = " + test);			//전체 나온다
		System.out.printf("test = %f\n" ,test);			//6자리까지만 나온다
		System.out.printf("test = %.15f\n" ,test);		//15자리까지 나온다
		
		
	}

}
