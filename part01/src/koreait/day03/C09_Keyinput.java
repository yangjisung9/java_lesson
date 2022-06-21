package koreait.day03;

import java.util.Scanner;

public class C09_Keyinput {

	public static void main(String[] args) {

			Scanner sc = new Scanner (System.in);
			
		int width;
		int height;
		int box_area;
		double half;
		double round;
		double circle_area;
		final double PI = 3.14;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("사각형 너비 입력 -> ");
			width = sc.nextInt();
		System.out.println("사각형 높이 입력 -> ");
			height = sc.nextInt();
			box_area = width*height;
		
		System.out.println("사각형의 넓이는 " + box_area + "입니다.");
		System.out.println();
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.println("원의 반지름 입력 -> ");
			half = sc.nextDouble();
			round = 2*half*PI;
			circle_area = half*half*PI;
		System.out.println("원의 둘레 길이는 " + round + "입니다.");
		
		System.out.println("원의 넓이는 " + circle_area + "입니다.");
		
	sc.close();
	
		
		
		
	}

	

}
