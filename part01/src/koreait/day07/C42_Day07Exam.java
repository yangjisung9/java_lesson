package koreait.day07;

//5��25�б��� ��������
import java.util.Scanner;
import java.util.Random;

	public class C42_Day07Exam {
//�ۼ��� : ������
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
		System.out.println("������ ���� 2�ڸ� ���� ���� Ǯ��");
		System.out.println("-----------------------");
		System.out.println("�����մϴ�.");
	for (int i=0;i<10;i++)
							{
	System.out.print("���� " + (i+1) + " " + ar1[i] + " + " + ar2[i] + " = �� �Է� -> ");	
	ans = sc.nextInt();
	ar3[i]	=	ar1[i]+ar2[i];
	ar4[i]	=	ans;
	if (ans == (ar3[i])) cnt++; 
							}
	
	System.out.println("-----------------------");
	System.out.println("ä�� �մϴ�. ���� ���� " + cnt + "(" + cnt * 10 + "��)");
	System.out.println("Ʋ�� ���� �ٽú���");
	for (int i=0;i<10;i++)
		if (ar4[i] != ar3[i])
			System.out.println(ar1[i] + " + " + ar2[i] + " = ���� : " + ar3[i]);
	System.out.println("����Ͻ÷��� : 0 , �����Ϸ��� : �ƹ� Ű�� ��������");
	op = sc.nextInt();					
						}
	System.out.println("���α׷� ����");
		sc.close();
	
	

	
}
}