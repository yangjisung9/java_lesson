package koreait.day09;

import java.util.Scanner;

public class C43_RedPenExam2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size=5;
		MathProblem[] problems=new MathProblem[size];
		//��� ���� �����ϴ¹迭
		
		//�迭�� Ÿ���� MathPoblem ��ü������ : n1,n2 ,op,isCorrect

		int ans;
		int cnt=0;
		System.out.println("----------------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0;i<size;i++) {
			MathProblem temp =new MathProblem('+');
			temp.makeProb();  //n1 ,n2���� ��ü�� �ʵ�� ��������
			
			
			System.out.print("����"+(i+1)+".  "+temp.problem()+"�� �Է� ->");
			
			
			ans =sc.nextInt();
			if(ans ==temp.showAnswer()) {	//����� �񱳸��� ���� count
				cnt++;
				temp.setCorrect(true);
			}
			problems[i]=temp;
		}
		System.out.println("---------------------------------------------------");
		System.out.println("ä���մϴ�. ���� ���� "+ cnt+ " ( "+ (cnt*100/size)+"�� )");
		
		
		System.out.println(":::::Ʋ������ ����:::::");
		/*	for (int i=0;i<problems.length;i++)	
				if(!problems[i].isCorrect())  //�����̸� !�������� ������ �ٲ�ϴ�
				System.out.println("���� "+(i+1)+".   "+problems[i].problem()
						+problems[i].showAnswer());
				*/
				
		//���� for���� for each�� �ٲ㼭 ����ϱ�
			for(MathProblem temp : problems)	//problems�� temp�� �ϳ�������
				if(!temp.isCorrect()) 
			System.out.println(temp.problem() +temp.showAnswer());
				
			//�츮�� ���� �ϴ� Ŭ���� 
			//���� �޼ҵ尡 �ʿ��Ѱ�?
			//�ʵ�? 
			//�ν��Ͻ� ��� ����ƽ��� ���� (��Ҵ� �ʵ� �޼ҵ�
			
			//�ڹ��� Ŭ����
			//�޼ҵ尡 �������ֳ�
			//�������� ����?
			
			
			sc.close();
	}
}
