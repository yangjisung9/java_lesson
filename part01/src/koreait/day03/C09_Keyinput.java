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
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("�簢�� �ʺ� �Է� -> ");
			width = sc.nextInt();
		System.out.println("�簢�� ���� �Է� -> ");
			height = sc.nextInt();
			box_area = width*height;
		
		System.out.println("�簢���� ���̴� " + box_area + "�Դϴ�.");
		System.out.println();
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.println("���� ������ �Է� -> ");
			half = sc.nextDouble();
			round = 2*half*PI;
			circle_area = half*half*PI;
		System.out.println("���� �ѷ� ���̴� " + round + "�Դϴ�.");
		
		System.out.println("���� ���̴� " + circle_area + "�Դϴ�.");
		
	sc.close();
	
		
		
		
	}

	

}
