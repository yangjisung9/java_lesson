package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		//비교
		for(int i=0;i<5;i++)
			System.out.println("hello!("+(i+1)+")");
		
		//while문 형식
		// loop counter 변수 선언
		int j=0;
		while(j<5)	{	// 조건식
			System.out.println("hello!("+(j+1)+")");
			j++;
					}
		
		//예시 : for문은 1부터 100까지 더하는 연속적인 값을 대상으로 할때 적합
		//		while 문은  아직 정해지지 않은 값을 대상으로 할때 적합
		//		반복문과 함께 사용하는 명령문	-	break , continue(continue 뒤의 명령을 실행하지 않고 반복처음으로 들어간다.)
		
		int k=0, sum=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 정수를 모두 더하는 계산기 입니다. (종료:-1)");
		while(k!=-1) 	{
				System.out.print("정수 입력 >>> ");
				k=sc.nextInt();
				sum +=k;	//sum=sum+k;
								
						}
		System.out.println("sum = " + sum);
		
		sum = 0;
		k = 0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다._ (종료:-1)");
		do {
			sum+=k;
			System.out.println("정수 입력 >>> ");
			k=sc.nextInt();
			}
		while(k!=-1);	//조건을 뒤에서 검사하는 명령문입니다.
		System.out.println("sum = " + sum);
		
		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다.__ (종료:-1)");
		
		while(true) {
			if(k==-1) break;			//항상 참일때, 탈출(종료) 조건과 break 문 사용합니다.
			
			sum+=k;
					}
		System.out.println("sum =" + sum);
		
		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다.___ (종료:-1)");
		boolean isState = true;
		while(isState) {
				System.out.println("점수 입력 >>> ");
				k=sc.nextInt();
				
				if(k==-1)	isState=false;
				else sum+=k;
		}
		System.out.println("sum = " + sum);
		
		//continue 연습 : 입력된 값이 10의 배수이면 sum에 더하지 않고 다시 입력받기
		
		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기입니다.__ (종료:10의배수)");
		
		// 10의 배수 일때 종료하는 것 만들어보기
		
		
		
		
		sc.close();
		
		
		
		
		}
		
	
		
	}


