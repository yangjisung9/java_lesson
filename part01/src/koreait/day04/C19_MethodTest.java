package koreait.day04;

import java.util.Scanner;

public class C19_MethodTest {


	
	//main �޼ҵ� : ������ ������. ���α׷� ������ ��	�ؼ��� �� �־���� �޼ҵ�. static�� ������ �ִ�
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("�޼ҵ带 ���� �����ؼ� ����غ��ϴ�");
		System.out.println("���α׷��� main �޼ҵ��� ��ɹ��� ������� �����ϰ� �߰��� �޼ҵ� ȣ���� ������ �޼ҵ尡 ���ǵ� ������ ����");
		System.out.println("����(�������)�� �̵��մϴ�. �޼ҵ� ������ ����Ǹ� �ٽ� main �޼ҵ�� ��� ���ƿɴϴ�.");
		System.out.println("1.");
		methodA();		//�޼ҵ� ȣ��(����) . �ʿ��� �� ȣ���մϴ�.
		System.out.println("2.");
		methodB(11,33);	//**11,33�� �޼ҵ� ���࿡ �ʿ��� ����**
		methodB(929,111);
		System.out.println("3.");
		methodC(929,12.1);
		methodC(929,121);		//���� �ƴ� : �ڵ�ĳ����(����ȯ)
		System.out.println("4.");
//		methodD();						//��ȯ���� �ִ� �޼ҵ������� main �޼ҵ忡�� ��ȯ�� ������ ���߽��ϴ�.
		System.out.println("return = " + methodD());	//��ȯ���� �޾Ƽ� ����ϴ� ����.
		int temp = methodD();
		System.out.println("return = " + temp);
		System.out.println("5.");
		
		
//		methodE(int a, double b);
		int a;
		double b;
		System.out.print("a���� �Է��ϼ���.");
		a = sc.nextInt();
		System.out.print("b���� �Է��ϼ���.");
		b = sc.nextDouble();		
		
		System.out.println("return = " + methodE(a,b));			//���ϰ� �ִ� �޼ҵ�� �� ���� Ȱ���ؾ� �մϴ�.
		
//??????????????????????????????????		methodF('i',4)
//??????????????????????????????????		System.out.println(methodF('i',4));
		
		sc.close();
		
	}
		// String Ŭ������ �޼ҵ带 ����
		/*		���޼ҵ��� ���� ����
		 * 
		 * 	�޼ҵ��� �ֿ� ��� : ��ȯ��, ����(argument) �Ǵ� �Ű�����(parameter) , �޼ҵ� �̸�, public �Ǵ� static ���� ����
		 *		�� ��ȯ�� : �޼ҵ� ���� �Ϸ�Ǹ� ������� �����	- ��ȯ ������ ��� Ÿ���Դϴ�. ��ȯ���� ������ void
		 *		�� ���� : �޼ҵ� ������ ���ؼ� �ʿ��� ������ (���İ� ������ ���� �ʿ� ) - ������ ������ ������ �پ��մϴ�.
		 *		�� �޼ҵ� �̸� : �ĺ���
		 *		�� public  : ���� ������ , static : ���� ���
		 */

		
		//static �� main���� ������ �޼ҵ�� �����ϰ� static �̾�� �մϴ�.
		//�޼ҵ� ���� (����)
		
public static void methodA()
	{
	System.out.println("##ù��° �޼ҵ� ���� �����Դϴ�.##");
	}
public static void methodB(int a, int b)			//**int a, int b�� ���ڰ��� ���޹޴� �Ű�����(��������)**
													//								������������ �� ��Ͼȿ����� Ȱ��Ǵ� ����
	{
	System.out.println("##�ι�° �޼ҵ� ���� �����Դϴ�.##");
	System.out.println("���޹��� �� a = " + a + ",b=" + b);
	}
public static void methodC(int a, double b)		
	{
	System.out.println("##����° �޼ҵ� ���� �����Դϴ�.##");
	System.out.println("���޹��� �� a = " + a + ",b=" + b);
	}
public static int methodD()
	{									// ��ȯ���� �ִ� ���� : ��ȯ���� int ������, �ݵ�� return�� �ʿ��մϴ�.
	System.out.println("##�׹�° �޼ҵ� ���� �����Դϴ�.##");
	return 999;
	}
public static double methodE(int a, double b)
	{
	System.out.println("##�ټ���° �޼ҵ� ���� �����Դϴ�.##");
	System.out.println("���޹��� �� a = " + a + ",b=" + b);
	return a+b;				//���ڷ� ���޹��� ������ �����ϰ� ó����� ����
	}

public static void methodF(char ch, int size)
	{
	System.out.println("##�������� �޼ҵ� ���� �����Դϴ�.##");
	
//?????????????????????????????	return (char)(ch+size);		//���ڷ� ���޹��� ������ �����ϰ� ó����� ����
	}
}

