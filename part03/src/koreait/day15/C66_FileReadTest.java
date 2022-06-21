package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {	//io:input,output ����� ���õ� ��ɵ��� Ŭ����

	public static void main(String[] args) {
			String filename = "E:\\iclass\\�ڹ��׽�Ʈ.txt";
						//		    ��	 ������ġ�� \�ε� �ڹٳ����� \\�� �ٲ�� ������ \�� ����� �ִ� ���ڿ��� ���ڷμ��� \�� \\�� �����ؾ��Ѵ�
//			String filename = "E:\\iclass\\�ڹ��׽�Ʈ2.txt";	���������׽�Ʈ(�ڹ��׽�Ʈ2)
			File file = new File(filename);
			
			//Scanner : �Է±���� ���� Ŭ����
			//Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try-catch �ʿ��ϴ�
			Scanner sc = null;
			try {
				sc = new Scanner(file);		//System.in : ǥ�� �Է�(�ܼ� �Է�)
				
/*				
				System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());	//System.out : ǥ�� ���(�ܼ� ���)
				System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());	
				System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());	
*/
				while(sc.hasNext()) {
					System.out.println(sc.nextLine());
				}	
				System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�");
//				System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");
			} catch (FileNotFoundException e) {
				//��±�ɿ��� ������ ������ �ڵ����� ��������ϴ�.
				System.out.println("����� ���� �߻� : "+e.getMessage());
			} finally {
				if(sc != null)sc.close();		//���������� �� �� �ƴϸ� �ʱ�ȭ �ؾ���
			}
			// try ~ catch �ڿ����� ����� finally �Ⱦ��� java 7 ���� ���� �ٸ� ���� ������ �����մϴ�.			
			//		�� ���õ� �������̽��� ���������� ã�ƺ���
	
	
	}

}
