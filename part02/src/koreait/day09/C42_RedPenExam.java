package koreait.day09;

import java.util.Random;
import java.util.Scanner;

public class C42_RedPenExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r=new Random();
		int size=5;
		int[] x1 = new int[10];
		int[] x2 = new int[10];
		int[] no = new int[10];
		int n1,n2,ans;
		int cnt=0;
		System.out.println("----------------------------------------------------");
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("----------------------------------------------------");
		System.out.println("�����մϴ�.");
		for(int i=0;i<size;i++) {
			n1 = r.nextInt(89)+11;		//11~99
			n2 = r.nextInt(89)+11;
			System.out.println("����"+(i+1)+".  "+n1+" + "+n2+"= �� �Է� ->");
			ans =sc.nextInt();
			if(ans !=n1+n2) {
				x1[cnt]=n1;
				x2[cnt]=n2;
				no[cnt]=i+1;
				cnt++;
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("ä���մϴ�. ���� ���� "+ (size-cnt)+ " ( "+ ((size-cnt)*100/size)+"�� )");
				System.out.println(":::::Ʋ������ ���亸��:::::");
			for (int i=0;i<cnt;i++)	
				System.out.println("���� "+no[i]+".   "+x1[i]+"+ "+x2[i]+"="+(x1[i]+x2[i]));
			sc.close();
	}
}
