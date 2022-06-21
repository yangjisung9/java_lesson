package koreait.day05;

// 작성자 : 양지성

import java.util.Scanner;

public class C28_IntArrayEx 
{
			/*		1. int 배열크기 5를 선언하세요. 이름은 nums
		 * 		2. 배열 요소의 값은 사용자 입력으로 저장합니다.
		 * 		3. 입력된 값의 합계, 평균을 구합니다.
		 * 		4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만듭니다.
		 * 				ㄴ	maxOfArray , minOfArray : 인자는 int 배열
		 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int avg;
				
		int[] nums = new int[5]; 													// 1
		
		System.out.print("0번 배열 요소 값을 입력하세요 >> ");								// 2
		nums[0] = sc.nextInt();
		System.out.print("1번 배열 요소 값을 입력하세요 >> ");
		nums[1] = sc.nextInt();
		System.out.print("2번 배열 요소 값을 입력하세요 >> ");
		nums[2] = sc.nextInt();
		System.out.print("3번 배열 요소 값을 입력하세요 >> ");
		nums[3] = sc.nextInt();
		System.out.print("4번 배열 요소 값을 입력하세요 >> ");
		nums[4] = sc.nextInt();
		
		
		for (int i = 0; i<nums.length; i++) {										
			sum+=nums[i];
					}
				
		System.out.println("\n입력된 값의 합계 >> " + sum);								// 3
		avg = sum/nums.length;
		System.out.println("입력된 값의 평균 >> " + avg); 
		
		int max = maxOfArray(nums);													// 4
		System.out.println("배열 nums 최대값 max = " + max);							
		int min = minOfArray(nums);
		System.out.println("배열 nums 최소값 min = " + min);
		
		
		
		
	
		
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
	
	
	



		//max, min 변수를 각각 배열의 0번 요소값으로 초기화합니다.
		// 배열요소 1번부터 마지막 요소까지 max, min과 순서대로 비교해서
		// max가 그 값보다 작으면 (min이 그 값보다 크면) max(min) 값을 배열요소값으로 변경합니다.
		// -> 비교가 끝나면 최종 max, min 결정이 됩니다.