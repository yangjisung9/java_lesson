package koreait.day14;

import java.util.Arrays;

//작성자 양지성
public class C57_ArraySortEx {
	//배열에 저장된 값 정렬 직접 구현하세요.
	public static void main(String[] args) {

		int[] nums = {34,77,19,56,45,9};
		for(int i=0;i<=nums.length-2;i++) {
			for(int k=i+1;k<=nums.length-1;k++) {
					if(nums[i]>nums[k]) {
						int temp = 0;
						temp=nums[i];
						nums[i]=nums[k];
						nums[k]=temp;	}
											}
									}
		String t = Arrays.toString(nums);
		System.out.println("정렬결과 : " + t);

	}
	

}
