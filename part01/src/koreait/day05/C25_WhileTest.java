package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		//��
		for(int i=0;i<5;i++)
			System.out.println("hello!("+(i+1)+")");
		
		//while�� ����
		// loop counter ���� ����
		int j=0;
		while(j<5)	{	// ���ǽ�
			System.out.println("hello!("+(j+1)+")");
			j++;
					}
		
		//���� : for���� 1���� 100���� ���ϴ� �������� ���� ������� �Ҷ� ����
		//		while ����  ���� �������� ���� ���� ������� �Ҷ� ����
		//		�ݺ����� �Բ� ����ϴ� ��ɹ�	-	break , continue(continue ���� ����� �������� �ʰ� �ݺ�ó������ ����.)
		
		int k=0, sum=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ������ ��� ���ϴ� ���� �Դϴ�. (����:-1)");
		while(k!=-1) 	{
				System.out.print("���� �Է� >>> ");
				k=sc.nextInt();
				sum +=k;	//sum=sum+k;
								
						}
		System.out.println("sum = " + sum);
		
		sum = 0;
		k = 0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� �����Դϴ�._ (����:-1)");
		do {
			sum+=k;
			System.out.println("���� �Է� >>> ");
			k=sc.nextInt();
			}
		while(k!=-1);	//������ �ڿ��� �˻��ϴ� ��ɹ��Դϴ�.
		System.out.println("sum = " + sum);
		
		sum=0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� �����Դϴ�.__ (����:-1)");
		
		while(true) {
			if(k==-1) break;			//�׻� ���϶�, Ż��(����) ���ǰ� break �� ����մϴ�.
			
			sum+=k;
					}
		System.out.println("sum =" + sum);
		
		sum=0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� �����Դϴ�.___ (����:-1)");
		boolean isState = true;
		while(isState) {
				System.out.println("���� �Է� >>> ");
				k=sc.nextInt();
				
				if(k==-1)	isState=false;
				else sum+=k;
		}
		System.out.println("sum = " + sum);
		
		//continue ���� : �Էµ� ���� 10�� ����̸� sum�� ������ �ʰ� �ٽ� �Է¹ޱ�
		
		sum=0;
		System.out.println("\n\n�Է��� ������ ��� ���ϴ� �����Դϴ�.__ (����:10�ǹ��)");
		
		// 10�� ��� �϶� �����ϴ� �� ������
		
		
		
		
		sc.close();
		
		
		
		
		}
		
	
		
	}


