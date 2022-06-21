package koreait.day14;

import java.util.Arrays;

//작성자 양지성
public class C58_ArraySortEx2 {
	//배열에 저장된 값 정렬 직접 구현하세요.
	public static void main(String[] args) {

		String[] names = {"제니","다현","나연","신비","은하","모모"};
			for(int i=0;i<=names.length-2;i++) {
			for(int k=i+1;k<=names.length-1;k++) {
					if(names[i].compareTo(names[k])>0) {
						String temp = names[i];
						names[i]=names[k];
						names[k]=temp;	}
											}
									}
		String t = Arrays.toString(names);
		System.out.println("정렬결과 : " + t);
		for(int i =0;i<names.length;i++)	{
			System.out.printf("%s, ",names[i]);
			
		}

	}
	

}
