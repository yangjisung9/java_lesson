package koreait.day03;

import java.util.Scanner;

public class C12_ConditionOp {
// ���ǽ��� ����� ���� ����� �����ϴ� ���ǿ����� : ���ǽ�? ��/����T : ��/����F
		public static void main(String[] args) {
	
			Scanner sc = new Scanner (System.in);
			
			int korean;
			int math;
			
			System.out.println("���� ���� �Է� -> ");
			korean = sc.nextInt();
			
			System.out.println("���� ���� �Է� -> ");
			math = sc.nextInt();
			
			//���� ������ �������� ��� 80�� �̻��ΰ�? -> ����л�
			System.out.println("����л�? " + ((korean >=80 && math >=80)? "�½��ϴ�.":"�ƴմϴ�."));
			
			//if : ó���� ����� �����ϴ� ���ǹ�
			//		{	}�� ��ɹ� ���(block) �̰� �������� ��ɵ��� ���δ� ������ ��ȣ,
			if(korean >= 80 && math >= 80) {
					//���ǽ��� ���϶� �����ϴ� ��ɵ�
				System.out.println("�½��ϴ�");
			}else {
					//���ǽ��� ������ �� �����ϴ� ��ɵ�
				System.out.println("�ƴմϴ�");
			}
	// 	System.out.println("Ư���л�? " + (korean>=90 || math>=90));
	//		{	}�ȿ� ���� ��ɹ��� 1���� ���� ������ �� �ֽ��ϴ�
			if(korean>=90 || math>=90)
				System.out.println("�½��ϴ�");
			else
				System.out.println("�ƴմϴ�");
			

			
			
				
			
	
			
}	
	
	
}
