package koreait.day03;

import java.util.Scanner;

public class C10_KeyInput {


	
	public static void main(String[] args) {
//sc�� ������ �Դϴ�. �⺻�� ������ �ƴ� Ŭ���� Ÿ���� �����Դϴ�. -> ������ ����
//		�� new �������� ����� ��ü�� Ŭ���� �̸��� ���� �̸����� ���� ���� �մϴ�.
		
		Scanner sc = new Scanner (System.in);
// Ű���� �Է��� ���� ���� ���� - ǥ���Է����� Scanner ��ü�� ����� ���� sc�� �����մϴ�.
		
		int data;
		
		System.out.println("������ �Է��ϼ���. -> ");	//�Է� �ȳ� �޽���
		
		data = sc.nextInt();	//����ڷκ��� Ű���� �Է¹ް� �װ��� ������ ��ȯ�Ͽ� data ������ ����
		
		//����ڰ� ���ڸ� �Է����� �ʾ������� ������ ��ȯ���� ���ϰ� ���� �߻���ŵ�ϴ�.
		
		System.out.println("�Էµ� ����" + data +" �Դϴ�.");
		
		
		
		double point;
		System.out.println("�Ǽ��� �Է��ϼ���. -> ");
		
		point = sc.nextDouble();
		System.out.println("�Էµ� ���� " + point + " �Դϴ�.");
	}
/* 
* ǥ�� ��� : System.out (out�� system Ŭ������ ������ �ʵ��̰� �޼ҵ� println()�� �����ϴ�.
* ǥ�� �Է� : System.in 	->	in�� System Ŭ������ ������ �ʵ�
* 						->	Scanner Ŭ������ �̿��ؼ� �Է°��� Ư�� �⺻�������� ��ȯ���Ѽ� ��� ���.
* 						->	�⺻ ��Ű���� Ŭ������ �ƴϹǷ� improt�� �ʿ��մϴ�.
* 					*���� : �⺻��Ű�� java.lang�� import ���� ����մϴ�.
* 
* import ����Ű ctrl+shift+O
*/
	
}


