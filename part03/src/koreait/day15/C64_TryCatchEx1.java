package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			String message = null;
			int cnt = message.length();
			
			System.out.print("정수 입력 >>> ");
//			int n =sc.nextInt();			 //nextInt와 nextLine을 같이 쓰면 발생하는 문제로 인해 parseInt사용
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("당신이 입력한 값 : " + n);	
//		} catch	(Exception e) {		//오류 원인에 따른 Exception 종류를 검사합니다.
//		} catch	(NullPointerException e) {		//오류 원인에 따른 Exception 종류를 검사합니다.
												////NullPointerException만 처리하라해서 빨간글씨뜸
		} catch	(NullPointerException | NumberFormatException e) {
									//NullPointerExceptiondㅣ거나 NumberFormatException이면
									//Exception 종류가 여러가진데 처리해야하는 내용이 같으면 catch 문을 더 작성안하고 간편하게 작성 가능
								//	| 기호는 bit 단위 or연산 : Exception이 비트값으로 설정
			//발생한 오류 정보를 Exception 객체로 관리하고 이에 대한 참조변수는 e(e는 지역변수)입니다.
			System.out.println("오류 발생 : " + e.getMessage());
			System.out.println("사용자 기능에 문제가 발생했습니다.");
		} finally {
			sc.close();
		}
		System.out.println("프로그램 끝 !!");
	}

}
