package koreait.day05;

// �ۼ��� : ������

import java.util.Scanner;

public class C28_IntArrayEx 
{
			/*		1. int �迭ũ�� 5�� �����ϼ���. �̸��� nums
		 * 		2. �迭 ����� ���� ����� �Է����� �����մϴ�.
		 * 		3. �Էµ� ���� �հ�, ����� ���մϴ�.
		 * 		4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 ����ϴ�.
		 * 				��	maxOfArray , minOfArray : ���ڴ� int �迭
		 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int avg;
				
		int[] nums = new int[5]; 													// 1
		
		System.out.print("0�� �迭 ��� ���� �Է��ϼ��� >> ");								// 2
		nums[0] = sc.nextInt();
		System.out.print("1�� �迭 ��� ���� �Է��ϼ��� >> ");
		nums[1] = sc.nextInt();
		System.out.print("2�� �迭 ��� ���� �Է��ϼ��� >> ");
		nums[2] = sc.nextInt();
		System.out.print("3�� �迭 ��� ���� �Է��ϼ��� >> ");
		nums[3] = sc.nextInt();
		System.out.print("4�� �迭 ��� ���� �Է��ϼ��� >> ");
		nums[4] = sc.nextInt();
		
		
		for (int i = 0; i<nums.length; i++) {										
			sum+=nums[i];
					}
				
		System.out.println("\n�Էµ� ���� �հ� >> " + sum);								// 3
		avg = sum/nums.length;
		System.out.println("�Էµ� ���� ��� >> " + avg); 
		
		int max = maxOfArray(nums);													// 4
		System.out.println("�迭 nums �ִ밪 max = " + max);							
		int min = minOfArray(nums);
		System.out.println("�迭 nums �ּҰ� min = " + min);
		
		
		
		
	
		
	}		
	
	public static int maxOfArray(int[] array)
	{
		int max = array[0];		
		for (int i=1;i<array.length;i++)	{	
			if(max < array[i])	
				max = array[i];
							}
		return max;
	}
	public static int minOfArray(int[] array)
	{
		int min = array[0];		
		for (int i=1;i<array.length;i++)	{		
			if(min > array[i])	
				min = array[i];
		}
		return min;
	}
									

		
	}
	
	
	



		//max, min ������ ���� �迭�� 0�� ��Ұ����� �ʱ�ȭ�մϴ�.
		// �迭��� 1������ ������ ��ұ��� max, min�� ������� ���ؼ�
		// max�� �� ������ ������ (min�� �� ������ ũ��) max(min) ���� �迭��Ұ����� �����մϴ�.
		// -> �񱳰� ������ ���� max, min ������ �˴ϴ�.