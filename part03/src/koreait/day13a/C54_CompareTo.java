package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
//��� ��ü(Object ���)���� compareTo �޼ҵ尡 �ֽ��ϴ�. : ���� ��
	
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		//String�� ���ĺ�(������)�� : �빮�� < �ҹ���
		System.out.println("kim�� momo �� : " + na.compareTo(you));	//-2(����) : "kim" < "momo", "kim"-"momo"<0  // k l m 2 ����
		System.out.println("kim�� son �� : " + na.compareTo(he));	//24(���) : "kim" > "Son" (�빮�� �ƽ�Ű�ڵ尪�� �ҹ��� ���� ����)

		int a = 12 , b=45;
		System.out.println("a-b :" + (a-b));	//12-45 <0
		Integer aa = 12;
		Integer bb = 45;
		//�񱳰� ����� �ƴ� ��ü���� ���� ��Ұ��� ����� ���
		System.out.println("aa�� bb : " + aa.compareTo(bb)); // -1 : aa<bb
		aa=90;
		System.out.println("aa�� bb : " + aa.compareTo(bb)); // 1 : aa>bb
		aa=45;
		System.out.println("aa�� bb : " + aa.compareTo(bb)); // 0 : aa==bb
		
		//compareTo �� ���� �񱳴� sort (����) �� ��� �˴ϴ�.
		// ������ �������� , ���� ���� 2���� ������� �� �� �ֽ��ϴ�.
	}

}
