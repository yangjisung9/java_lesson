package koreait.day14;

import java.util.Arrays;

//�ۼ��� ������
public class C58_ArraySortEx2 {
	//�迭�� ����� �� ���� ���� �����ϼ���.
	public static void main(String[] args) {

		String[] names = {"����","����","����","�ź�","����","���"};
			for(int i=0;i<=names.length-2;i++) {
			for(int k=i+1;k<=names.length-1;k++) {
					if(names[i].compareTo(names[k])>0) {
						String temp = names[i];
						names[i]=names[k];
						names[k]=temp;	}
											}
									}
		String t = Arrays.toString(names);
		System.out.println("���İ�� : " + t);
		for(int i =0;i<names.length;i++)	{
			System.out.printf("%s, ",names[i]);
			
		}

	}
	

}
