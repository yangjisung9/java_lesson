package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
// �ۼ��� : ������ -> �ҽ� �Ϸ��ϸ� DM���� ���� �����ּ���.
	public static void main(String[] args) {
		
		
		/* ���� �̸��� ������ üũ�ϴ� ��� ����
		 *	1.gmail.com ���� ������ �մϴ�.
		 *	2. @ ��ȣ�� ���ԵǾ�� �մϴ�. 
		 *	3. @ �ձ����� ���ڿ��� �����̸��� �����մϴ� 
		 *	4.�����̸��� 6���� �̻��̾�� �մϴ�.
		 *	5. ���� �̸����� Ư����ȣ�� ���ԵǸ� �ȵ˴ϴ�.
		 *	 
		 */

		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid=true;
		
		System.out.print("����� �̸��� �Է��ϼ���. >>> ");
		
		email = sc.nextLine();						//Ű���� �Է��� ���ڿ��� ó���մϴ�.
		
		//�Է��� email�� ó������ 1,2,4,5�� �ش����� ������ �޽��� ����ϰ� isValid ������ false�� �մϴ�.
		
		int idx = email.indexOf('@');
		String domain = email.substring(idx);
		String account = email.substring(0,idx);
		int alt = account.length();
		
		//1. @ ��ȣ�� ���ԵǾ�� �մϴ�
		if ((email.indexOf('@')==-1))
													{System.out.println("�޽��� : �̸��� ������ �ƴմϴ�.");}
		//2. 1���� ���� �� @ �ڿ��� gmail.com �̾�� �մϴ�.
		else if ((domain.equals("@gmail.com") == false))
													{System.out.println("�޽��� : ������ �̸��� Ʋ���ϴ�.");}
		//3. 2���� ���� �� @ �ձ����� ���ڿ�(�����̸�)�� �����մϴ�.
		else 
													{System.out.println(account);}
	
		//4. 3���� �����̸��� 6���� �̻��̾�� �մϴ�.
		if	(alt<6)
													{System.out.println("�޽��� : �����̸��� 6���� �̻��̾�� �մϴ�.");}
		//5. 3���� �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�.
		if	(account.indexOf('$')!=-1 || account.indexOf('%')!=-1)
													{System.out.println("�޽��� : �����̸����� Ư����ȣ $,%�� ���ԵǸ� �ȵ˴ϴ�.");}
	
	}

}
