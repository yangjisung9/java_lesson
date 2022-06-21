package koreait.day07;
//40번 생략
import java.util.Scanner;

public class Score {

	int korean;
	int english;
	int science;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 >>>"); 	this.korean = sc.nextInt();
		System.out.println("영어 >>>"); 	this.english = sc.nextInt();
		System.out.println("과학 >>>"); 	this.science = sc.nextInt();
		//sc.close();		//완전히 프로그램이 종료될때만 close를 쓴다. close를 쓰면 더 이상 입력이 안된다
	}
	
	int sum()	{
		return	(korean+english+science);
				}
	
	double average()	{
		return (double)sum()/3;
	}
	@Override
	public String toString() {
		return "Score [korean=" + korean + ", english=" + english + ", science=" + science + "]";
	}
}
