package koreait.day15;

import java.util.Scanner;

public class C64_TryCatchEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			String message = null;
			int cnt = message.length();
			
			System.out.print("���� �Է� >>> ");
//			int n =sc.nextInt();			 //nextInt�� nextLine�� ���� ���� �߻��ϴ� ������ ���� parseInt���
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("����� �Է��� �� : " + n);	
//		} catch	(Exception e) {		//���� ���ο� ���� Exception ������ �˻��մϴ�.
//		} catch	(NullPointerException e) {		//���� ���ο� ���� Exception ������ �˻��մϴ�.
												////NullPointerException�� ó���϶��ؼ� �����۾���
		} catch	(NullPointerException | NumberFormatException e) {
									//NullPointerExceptiond�Ӱų� NumberFormatException�̸�
									//Exception ������ ���������� ó���ؾ��ϴ� ������ ������ catch ���� �� �ۼ����ϰ� �����ϰ� �ۼ� ����
								//	| ��ȣ�� bit ���� or���� : Exception�� ��Ʈ������ ����
			//�߻��� ���� ������ Exception ��ü�� �����ϰ� �̿� ���� ���������� e(e�� ��������)�Դϴ�.
			System.out.println("���� �߻� : " + e.getMessage());
			System.out.println("����� ��ɿ� ������ �߻��߽��ϴ�.");
		} finally {
			sc.close();
		}
		System.out.println("���α׷� �� !!");
	}

}
