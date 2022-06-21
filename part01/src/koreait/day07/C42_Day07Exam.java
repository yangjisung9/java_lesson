package koreait.day07;

//5시25분까지 파일제출
import java.util.Scanner;
import java.util.Random;

	public class C42_Day07Exam {
//작성자 : 양지성
public static void main(String[] args) {

	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int n1, n2;
	int max1=99,max2=99;
	int min1=11,min2=11;
	int ans; int cnt = 0; int op = 0;
	int ar1[] = new int[10];
	int ar2[] = new int[10];
	int ar3[] = new int[10];
	int ar4[] = new int[10];
	
	for(int i=0;i<10;i++) 	{
	n1=r.nextInt(max1-min1+1)+min1;
	n2=r.nextInt(max2-min2+1)+min2;
	ar1[i] = n1; ar2[i] = n2;
							}
	
	
	while (op == 0) 		{
		System.out.println("-----------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------");
		System.out.println("시작합니다.");
	for (int i=0;i<10;i++)
							{
	System.out.print("문제 " + (i+1) + " " + ar1[i] + " + " + ar2[i] + " = 답 입력 -> ");	
	ans = sc.nextInt();
	ar3[i]	=	ar1[i]+ar2[i];
	ar4[i]	=	ans;
	if (ans == (ar3[i])) cnt++; 
							}
	
	System.out.println("-----------------------");
	System.out.println("채점 합니다. 맞은 개수 " + cnt + "(" + cnt * 10 + "점)");
	System.out.println("틀린 문제 다시보기");
	for (int i=0;i<10;i++)
		if (ar4[i] != ar3[i])
			System.out.println(ar1[i] + " + " + ar2[i] + " = 정답 : " + ar3[i]);
	System.out.println("계속하시려면 : 0 , 종료하려면 : 아무 키를 누르세요");
	op = sc.nextInt();					
						}
	System.out.println("프로그램 종료");
		sc.close();
	
	

	
}
}