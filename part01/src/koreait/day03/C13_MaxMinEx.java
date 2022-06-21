// 양지성

package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx  {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("n1 입력하세요.");
		n1 = sc.nextInt();
		System.out.println("n2 입력하세요.");
		n2 = sc.nextInt();
		System.out.println("n3 입력하세요.");
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
