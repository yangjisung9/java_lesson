package koreait.day03;

import java.util.Scanner;

public class C15_CharacterIfTest {

	public static void main(String[] args) {  
	      //���ڸ� �з��մϴ�.(ascii�ڵ� �빮��,�ҹ���,����,Ư����ȣ)

	      int ch1;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("�˰���� �ƽ�Ű�ڵ� ������ �Է��ϼ���.(32���� 126) -> ");
	      
	      ch1 = sc.nextInt();
	      char ch2 = (char)ch1;      //�Է¹��� �������� char �� ��ȯ.
	      
	      
	      //�䱸���� : �������� �ش��ϴ� ���ڿ� ���� �з� ��� ����ϱ�.		*** char Ÿ�� �����ʹ� ���,���迬�� �����մϴ�.
	      if(ch2 >='A' && ch2 <='Z')  //'A' ~ 'Z' ���� �˻�
	         System.out.println("�з� : �빮�� , �Է��� �ƽ�Ű�ڵ尪 ���� : " + ch2);
	      else if(ch2 >= 'a' && ch2 <='z')   // 'a' ~ 'z' ���� �˻�
	         System.out.println("�з� : �ҹ��� , �Է��� �ƽ�Ű�ڵ尪 ���� : " + ch2);
	      //�з�:Ư����ȣ , ������ üũ�غ�����. (���� �Ǵ� �ڵ尪) �ڵ尪 32~47,58~64,91~96,123~126
	      else if(ch2>=32 && ch2 <=47 || ch2>=58 && ch2 <=64 || ch2>=91 && ch2 <=96 || ch2>=123 && ch2 <=126)
	         System.out.println("�з� : ��ȣ , �Է��� �ƽ�Ű�ڵ尪 ���� : " + ch2);
	      //�з�:����, �ش��ϴ� �ڵ� �߰� �ڵ尪 48~57
	      else if(ch2>=48 && ch2 <=57 )
	    	 System.out.println("�з� : ����, �Է��� �ƽ�Ű�ڵ尪 ���� : " + ch2);
	    	  
	      
	      else 
	         System.out.println("�з� : ����, �˼� ���� ���� :" + ch2);
	      
	      sc.close();
	   }
	
}