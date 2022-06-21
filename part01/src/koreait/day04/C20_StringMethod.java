package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		
		String message = "hello~";			//java.lang.String (�⺻��Ű�� Ŭ������ import�� �ʿ����)
		
		//String Ŭ������ �޼ҵ�� �����ϴ�. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ����մϴ�.
		
		message.length();			//public int length() : ����
		message.charAt(0);			//public char charAt(int index) : ����
		
		message.equals("Hello~");	//public boolean equals(Object anObject) : ���� , Object�� ��� Ÿ�� 
									//message �� String Ÿ���̹Ƿ� Object �� String���� �ؼ��մϴ�.
		
	//���ϰ� ������?
/*
			message.indexOf('e');
			message.indexOf("lo");
			message.substring(2);
			message.substring(2,4);
			message.replace("ll","*@");
*/
	//�޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.
		System.out.println("indexOf('e') = " + message.indexOf('e'));						//1�� ��ġ
		System.out.println("indexOf(\"lo\") = " + message.indexOf("lo"));					//3�� ��ġ
		System.out.println("indexOf(\"lo\") = " + message.indexOf("ol"));					// -1 : ã�� ���ڿ��� ���� ��
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\")) = " + test.indexOf("lo"));				//3��
		System.out.println("test.LastIndexOf(\"lo\")) = " + test.lastIndexOf("lo"));		//��ġ�ϴ� ������ ��ġ 9��
		
		
		System.out.println("substring(2) = " + message.substring(2));						//�κ����� : llo~
		System.out.println("substring(2,4) = " + message.substring(2,4));					//�κ����� : 2~4	ll (4-2)
		System.out.println("replace(\"ll\",\"*@\") = " + message.replace("ll","*@"));		//ġȯ : he*@o~
		System.out.println("startsWith(\"H\") = " + message.startsWith("H"));
		System.out.println("endsWith(\"~\" = " + message.endsWith("~"));
	
		int len = message.length();
		char temp = message.charAt(3);
		boolean	isState = message.equals("Hello~");
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);					//0���� �����ؼ� 3�� ���ڰ� �������� ����.
		System.out.println("equals(\"Hello\") = " + isState);		//���ڿ��� ������
	}
	// "�� ����Ҷ��� \(��������) �ʿ��մϴ� . -> " ��ȣ�� ���ڿ��������� �ؼ��Ǳ� �����Դϴ�.

}
