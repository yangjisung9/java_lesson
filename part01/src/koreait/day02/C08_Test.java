package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {

		int a = 23;
		int b = 19;
		
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.println("���� : " + a + "cm");
		System.out.println("���� : " + b + "cm");
		System.out.println("���̸� ���߽��ϴ�. -> " + a*b +"��");

		double c = 23.230;
		double d = 3.14*c*c;
		
		System.out.println();
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.println("������ : " + c + "cm");
		System.out.println("�ѷ��� ���߽��ϴ�. -> " + 2*3.14*c + "cm");
		System.out.println("���̸� ���߽��ϴ�. -> " + d + "�� \n");
		
		System.out.printf("\n");
		System.out.println("[[�簢�� ������ ���� ���ϱ�]]");
		System.out.printf("���� : %d cm\n" ,a );
		System.out.printf("���� : %d cm\n" ,b );
		System.out.printf("���̸� ���߽��ϴ�. -> %d �� \n" ,a*b);
		
		System.out.printf("\n");
		System.out.println("[[�� ������ ���̿� �ѷ� ���ϱ�]]");
		System.out.printf("������ : %f cm\n" ,c );
		System.out.printf("�ѷ��� ���߽��ϴ�. -> %.3f cm\n" ,2*3.14*c);
		System.out.printf("���̸� ���߽��ϴ�. -> %.3f �� \n" , d);
		
		//final �׽�Ʈ
		//		�������� �տ� final(������) Ű���带 ���̸� ���� �������� ���մϴ�.
		
		final int test = 123;			//���� ���� ���ϴ� ����Դϴ�.
		System.out.println("test =" + test);
		
//		test = 456;			//���� : final�� �����.
		
				
		
		
	}

	

}
