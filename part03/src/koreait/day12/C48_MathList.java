package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;


//C43번 예제 리스트로 변경하기 ( 배열 > 리스트)
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//입력메서드
		int size = 5;								//배열 크기 5
		ArrayList<MathProblem> problems = new ArrayList<MathProblem>();		// 리스트 problems에 저장되는 것은 객체 MathProblem의 참조값
		
		int ans;
		int cnt=0;
		System.out.println("----------------------------------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("----------------------------------------------------");
		System.out.println("시작합니다.");
		
		for(int i=0;i<size;i++) {
			MathProblem temp =new MathProblem('+');							// MathProblem의 변수 temp 생성
			temp.makeProb();  
			System.out.print("문제"+(i+1)+".  "+temp.problem()+"답 입력 ->");
			
			ans = sc.nextInt();
			if(ans ==temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			problems.add(temp);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("채점합니다. 맞은 갯수 "+ cnt+ " ( "+ (cnt*100/size)+"점 )");
		
		System.out.println("::::틀린문제 정답::::");
		for (int i=0;i<problems.size();i++)	
			if(!problems.get(i).isCorrect())  
				System.out.println("문제 "+(i+1)+".   "+problems.get(i).problem()
					+problems.get(i).showAnswer());
		sc.close();
		}
									
			
				
		
			
}

