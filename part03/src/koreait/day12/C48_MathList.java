package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;


//C43�� ���� ����Ʈ�� �����ϱ� ( �迭 > ����Ʈ)
public class C48_MathList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//�Է¸޼���
		int size = 5;								//�迭 ũ�� 5
		ArrayList<MathProblem> problems = new ArrayList<MathProblem>();		// ����Ʈ problems�� ����Ǵ� ���� ��ü MathProblem�� ������
		
		int ans;
		int cnt=0;
		System.out.println("----------------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------------------------------");
		System.out.println("�����մϴ�.");
		
		for(int i=0;i<size;i++) {
			MathProblem temp =new MathProblem('+');							// MathProblem�� ���� temp ����
			temp.makeProb();  
			System.out.print("����"+(i+1)+".  "+temp.problem()+"�� �Է� ->");
			
			ans = sc.nextInt();
			if(ans ==temp.showAnswer()) {
				cnt++;
				temp.setCorrect(true);
			}
			problems.add(temp);
		}
		System.out.println("---------------------------------------------------");
		System.out.println("ä���մϴ�. ���� ���� "+ cnt+ " ( "+ (cnt*100/size)+"�� )");
		
		System.out.println("::::Ʋ������ ����::::");
		for (int i=0;i<problems.size();i++)	
			if(!problems.get(i).isCorrect())  
				System.out.println("���� "+(i+1)+".   "+problems.get(i).problem()
					+problems.get(i).showAnswer());
		sc.close();
		}
									
			
				
		
			
}

