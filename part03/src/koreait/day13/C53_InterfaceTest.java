package koreait.day13;

public class C53_InterfaceTest {

	public static void main(String[] args) {
		MyClassX x1 = new MyClassX(); //Ŭ���� ��ü ����
		MyClassY y1 = new MyClassY(); 
		MyClassZ z1 = new MyClassZ(); 
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();

//���� Ÿ�Կ� ���� �޼ҵ� ����(���� ����ü)	: z1,z2,z3 �� � �޼ҵ� ���డ������?
		z1.methodA();
		z1.methodB(23);
		z1.name("����");
		
		z2.methodA();
		z2.methodB(24);
//		z2.name("����");		//����:InterfaceB�� �߻�޼ҵ�� ���� ���� (InterfaceA �� ����Ǿ��⶧��)
		
//		z3.methodA();		//����:InterfaceA�� �߻�޼ҵ�� ���� ���� (InterfaceB �� ����Ǿ��⶧��)
//		z3.methodB(24);		//����:InterfaceA�� �߻�޼ҵ�� ���� ���� (InterfaceB �� ����Ǿ��⶧��)
		z3.name("����");
		
//	ĳ����(���� �Ǵ� ���� Ÿ�Ժ�ȯ) : ���� ����ü�� �������̽� Ÿ�� ĳ����
//			��MyClassZ�� InterfaceA �� InterfaceB Ÿ������ ��� ����
		InterfaceB ib = (InterfaceB)z2;
		ib.name("����");
		InterfaceA ia = (InterfaceA)z3;
		ia.methodA();
		
		iAmethod(x2);
//		iAmethod(y2);	���� : InterfaceA ����ü �ƴ�.
		iAmethod(z2);
		iAmethod(x1);	//InterfaceA�� implement�� Ŭ�������� ����
		iAmethod(z1);
		iAmethod(z2);
//		iAmethod(z3);	����: InterfaceA�� implement�� Ŭ���������� ���� ����Ÿ���� InterfaceB
		
		iBmethod(y1); 	
		iBmethod(y2); 	
		iBmethod(z1); 	
//		iBmethod(z2);	���� : InterfaceA�� implement�� Ŭ���������� ���� ����Ÿ���� InterfaceA 
		iBmethod(z3); 	
		
		
		
	}
	//������ ���� ���� : �޼ҵ� ���� Ÿ���� InterfaceA
	//		InterfaceA ����ü�� ��� ���ڷ� ���ް���
	public static void iAmethod(InterfaceA ia)	{
		ia.methodA();
	}
	//		InterfaceB ����ü�� ��� ���ڷ� ���ް���
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
	}
	
}
