package koreait.day03;

import java.util.Scanner;

public class C16_IfSwitchEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int item_no;
		int pay;
		
		System.out.println("��ǰ��� : \n1.2200��\n2.1900��	\n3.3600��	\n4.2870��");
		System.out.println("��ǰ�� �����ؼ� ��ٱ��Ͽ� ��������. >>> ");
		item_no = sc.nextInt();

		if(item_no == 1) 		 pay = 2200;
		else	if(item_no == 2) pay = 1900;
		else 	if(item_no == 3) pay = 3600;
		else	if(item_no == 4) pay = 2870;
		else	{System.out.println("��ǰ ������ �߸��Ǿ����ϴ�.");
				pay = 99999;}
		
		
		System.out.println("���� �ݾ� " + pay + "�Դϴ�.");
		
		//���� switch ���� if~ else if �� �ٲپ �����ϱ�
		
		
	}


}
