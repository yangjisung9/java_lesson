package koreait.day14;

import java.util.Arrays;

//�ۼ��� ������
public class C57_ArraySortEx {
	//�迭�� ����� �� ���� ���� �����ϼ���.
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
		System.out.println("���İ�� : " + t);

	}
	

}
