package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 *  �л� ����(����) ���� ������ ����ϴ�.
		 *  �л� �ο��� 100�� - ������ ���������� �׽�Ʈ(0<= ���� <=100)
		 * 	90~100 : o ��( �Ҽ��� 1�ڸ� %) 	ī��Ʈ ������ 5�� �ʿ��մϴ�. (cntA,cntB,cntC,cntD,cntE)
		 * 	80~89 : o ��( �Ҽ��� 1�ڸ� %) 							�� counts[5] : counts[0],counts[1],counts[2],count[3],count[4]
		 * 	70~79 : o ��( �Ҽ��� 1�ڸ� %) 
		 * 	60~69 : o ��( �Ҽ��� 1�ڸ� %) 
		 * 	50~59 : o ��( �Ҽ��� 1�ڸ� %) 
		 *  
		 */
		
		Random r = new Random();
		int[] koreans = new int[100];
		int[] counts = new int[5];
						
		System.out.print("[ ");
		for (int i=0;i<koreans.length;i++)	{
			koreans[i] = r.nextInt(101);		// ���� ���� ����	
			System.out.printf("%d, ",koreans[i]);
											}
		System.out.print(" ]");
		
		//���� ���� count�ϱ�
		for (int i=0;i<koreans.length;i++)	{
			if (koreans[i]>=90)	counts[0]++;
			else if (koreans[i]>=80) counts[1]++;
			else if (koreans[i]>=70) counts[2]++;
			else if (koreans[i]>=60) counts[3]++;
			else counts[4]++;
											}
							
		//���� ���� ��� ����ϱ�
//		System.out.println("\n90~100\t 80~89\t 70~79\t 60~69\t 60�̸�");
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60�̸�");
		System.out.println("-------------------------------------");	
		for(int i=0; i<counts.length;i++)	{
			//counts �迭�� ���
			System.out.printf("%8d ",counts[i]);
			
			
											}
		System.out.println();
		for(int i=0;i<counts.length;i++)
			//counts �迭������ ����� ���ϰ� ����ϱ�
			System.out.printf("%7.1f%% ",(double)counts[i]);
	
			
											}
			
			
	//�迭���� ����� ���(�����ͻ���,�߰�)�� ���� �ڹ�ArrayList
		
		
				
			
			
		
		
		
	}


