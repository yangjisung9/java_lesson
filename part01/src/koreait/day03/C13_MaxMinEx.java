// ������

package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx  {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("n1 �Է��ϼ���.");
		n1 = sc.nextInt();
		System.out.println("n2 �Է��ϼ���.");
		n2 = sc.nextInt();
		System.out.println("n3 �Է��ϼ���.");
		n3 = sc.nextInt();
	
		if(n1>n2){
		if (n1<n3) System.out.println(n3);
		else System.out.println(n1);
		
	}else {
		if (n2<n3) System.out.println(n3);
		else System.out.println(n2);
	}
		
	}
}
