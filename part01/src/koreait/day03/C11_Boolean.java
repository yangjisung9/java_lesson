package koreait.day03;

import java.util.Scanner;

public class C11_Boolean {

	public static void main(String[] args) {
		boolean result;
		
		result = 10 > 5;
		System.out.println("10 > 5 ��� : " + result);
		
		System.out.println("9 != 9 ��� : " + (9!=9));
		
		System.out.println("9 == 9 ��� : " + (9==9)); 
		
		// �˻��ϰ� ���� ������ ���� �� �־�� �Ѵ�.
		
		int korean, math ; //��������, ��������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� ->" );
		korean = sc.nextInt();
		System.out.println("���� ���� �Է� ->" );
		math = sc.nextInt();
		
		//���� ������ ���� ���� ��� 80�� �̻��ΰ�? 		-> ����л�
		System.out.println("����л�?" + (korean>=80 && math>=80));	
		
		//�������� �Ǵ� �������� �� 90�� �̻��� �ִ°�?		-> Ư���л�
		System.out.println("Ư���л�?"	 + (korean>=90 || math>=90));
		
		//���������� 20~80�� �ƴ�(not) �л����� ? -> Ư���� �л�
		System.out.println("Ư���� �л�? " + (!(korean>20) || !(korean<80)));
		
/*
 * 		System.out.println("������ ��� Ȯ���ϱ� : and");
 * 		System.out.println(" true and true = " + (true && true));
	    System.out.println(" true and false = " + (true && false));
	     				//�Ʒ��� 2�� ������ ù��°���� false �̹Ƿ� �ι�° ���� don't care ������� ��� false - &&�� �ΰ��� ��� ���̾�� �� 
	    System.out.println(" false and true = " + (false && true));		//	�� ���� ���� ������ 37 ture�� 38 �ι�° false�� �����ڵ��̴�
	    System.out.println(" false and false = " + (false && false));
	      
	    System.out.println("������ ��� Ȯ���ϱ� : or");
	      				//�Ʒ��� 2�� ������ ù��° ���� true �̹Ƿ� �ι�° ���� don't care ������� ��� true - ||�� �ΰ��� ��� �����̾�� ����
	    System.out.println(" true or true = " + (true || true));			//			�� ���� ���� ������ �����ڵ� �߻�
	    System.out.println(" true or false = " + (true || false));
	    System.out.println(" false or true = " + (false || true));
	    System.out.println(" false or false = " + (false || false));
	      
	    System.out.println("������ ��� Ȯ���ϱ� : not");
	    System.out.println(" not ture = " + !true);    	//true ���� �ݴ�(not)������ �ٲ�
	    System.out.println(" not false = " + !false);
 */
	      		
		
		
		
		
		
		
		
		
	/*
	 *	�������� �⺻ ���� : boolean �� true �Ǵ� false ���� ���� ����. (Boolean ���� Ŭ���� �ֽ��ϴ�.)
	 * 
	 *	���迬�� ==(����,����.) , != (���� �ʴ�) , > , < , >= , <= 				�� ������ ������� boolean ����
	 *	������ && (and , �׸���) , || (or , �Ǵ�) , !(not) 					�� ������ ������� boolean ����
	 *	���� : if , for ���� �ʿ��� ���ǽĿ� ���� ������ ���˴ϴ�.
	 */

	}

}
