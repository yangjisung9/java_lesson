package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//�ۼ��� : ������ _ ���� �����մϴ�. (�ּ����� ������ �ۼ��ϼ���. �ʹ� ��Ȳ���� �ʰ� ����)
	public static void main(String[] args) {
		int[] numbers = new int[45];		//�迭 ����
		Random r = new Random();		//������ ����
		for(int i=0;i<45;i++)	{		//�ε��� ���� : 0~44
			numbers[i]=i+1;				//�� ���� : 1~45
								}
		
		System.out.println("numbers �迭 �ʱⰪ----------------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("--------------------------------------------------");
		
		int[] lotto = new int[6];				//�ζ� ������ �迭 ����
		int k;									//������ ��ġ�� �ε��� ��
		for(int cnt=0;cnt<6;cnt++)	{			
			k=r.nextInt(45-cnt);				//�ε��� ������ ���̱� ���� ���� �߻� ���� ����
			System.out.println("k="+k +",number =" +numbers[k]);
			
			lotto[cnt]=numbers[k];				//lotto �迭�� �ε��� K���� ����
			
			for(int i=k;i<numbers.length-1;i++)		{	//�迭���� ������ ����
				numbers[i]=numbers[i+1];				//�ε��� i+1�� �ε��� i�� ����
													}
			System.out.println(Arrays.toString(numbers));	//������ ������ �迭 ��� ���
									}
		System.out.println("���� ���� ���� : ");				
		System.out.println(Arrays.toString(lotto));			// �迭��� ���
		
		Arrays.sort(lotto);			//lotto �迭���� ũ�� ������� ��ġ�� ����
		System.out.println(Arrays.toString(lotto));			//������������ ���
 				
		
		
		}

	}


