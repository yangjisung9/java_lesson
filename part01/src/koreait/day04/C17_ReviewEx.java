package koreait.day04;

import java.util.Scanner;

public class C17_ReviewEx {
	
	
	public static void main(String[] args) {
	
		String best;		//Ư��� ������ ����
	int korean, english, science ;	
	

	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("[[���� ���� : ��հ� ���� ���ϱ�");
	System.out.println("���� �Է��ϼ���");
	System.out.print("���� ->");
	korean = sc.nextInt();
	System.out.print("���� ->");
	english = sc.nextInt();
	System.out.print("���� ->");
	science = sc.nextInt();
	
	int total = korean + english + science;
	int max;
	int subject = 3;
	double average = (double)total/subject;
	
	System.out.println("\n>>ó���Ǿ����ϴ�");
	System.out.println("���� : " + total);
	System.out.printf("��� : %d ( %.2f ) , ����� : %d \n", (int)average, average, subject);
	
	if (korean>english) {max = korean;
						best = "����";}
	else {max = english;
        best = "����";}
	
	if (max < science) {best = "����";
						max = science;}
	
	System.out.printf("�� �л��� Ư������� %s�̰� ������  %d�� �Դϴ�." ,best,max );
	
		
	sc.close();
	
	}

}
