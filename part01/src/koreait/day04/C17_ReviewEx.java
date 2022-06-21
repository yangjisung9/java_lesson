package koreait.day04;

import java.util.Scanner;

public class C17_ReviewEx {
	
	
	public static void main(String[] args) {
	
		String best;		//특기명 참조할 변수
	int korean, english, science ;	
	

	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("[[성적 집계 : 평균과 총점 구하기");
	System.out.println("성적 입력하세요");
	System.out.print("국어 ->");
	korean = sc.nextInt();
	System.out.print("영어 ->");
	english = sc.nextInt();
	System.out.print("과학 ->");
	science = sc.nextInt();
	
	int total = korean + english + science;
	int max;
	int subject = 3;
	double average = (double)total/subject;
	
	System.out.println("\n>>처리되었습니다");
	System.out.println("총점 : " + total);
	System.out.printf("평균 : %d ( %.2f ) , 과목수 : %d \n", (int)average, average, subject);
	
	if (korean>english) {max = korean;
						best = "국어";}
	else {max = english;
        best = "영어";}
	
	if (max < science) {best = "과학";
						max = science;}
	
	System.out.printf("이 학생의 특기과목은 %s이고 점수는  %d점 입니다." ,best,max );
	
		
	sc.close();
	
	}

}
