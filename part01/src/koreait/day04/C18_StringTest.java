package koreait.day04;

public class C18_StringTest {

	public static void main(String[] args) {
		
		String name = "kim"; 			//������ ���� (�⺻�� Ÿ���� �ƴϰ� Ŭ���� Ÿ���̹Ƿ� name�� ������ �����̴�)
		String name2 = "kim";
		String name3 = "lee";
		String name4 = new String("kim");	// ���ο� String ��ü ���� (new �� ������ ���ο� ��ü�� ����)
											// 7,8�� ���� ��ġ�� ����
		
		System.out.println("name == name2 ���� ��ġ?" + (name ==name2));		//true
		System.out.println("name == name4 ���� ��ġ?" + (name ==name4));		//false
		System.out.println("name2 == name4 ���� ��ġ?" + (name2==name4));		//false
		
		name2 = "son";
		System.out.println("name == name2 ���� ��ġ?" + (name == name2));		//false
		
		//new�� ���� �����̵� ���� ������ ���ο� �޸𸮸� �Ҵ�޴� ���̴�.
		
		System.out.println("name = " + name);
		System.out.println("name2 = " + name2);
		System.out.printf("name3 = %s\n" , name3);
		System.out.printf("name4 = %s\n" , name4);
		
		
		
		
	/*	
	 * 		���ڿ� : ��ȣ ""�� ����ϸ鹮�ڿ��Դϴ�. (''�� ����ϸ� ������)
	 * 		�ڹٿ����� �⺻�� ������ �ƴϰ� String Ŭ���� Ÿ������ ����մϴ�
	 * 								���ʵ�, �޼ҵ� �̿��Ͽ� ���ڿ� ��� ���
	 * 
	 * 
	 */

	}

}
