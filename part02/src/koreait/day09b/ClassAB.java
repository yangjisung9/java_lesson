package koreait.day09b;

import koreait.day09a.ClassA;

public class ClassAB extends ClassA {
	//���� �� Ŭ������ �ʵ�, �޼ҵ� ��ӹ޾ҳ� Ȯ��.
	//ClassA�� private , default ���������� ��Ҵ� ��� ������.
	
public void test() {
	//	System.out.println("name = "+name); /�������� name�ʵ� ���������ڴ� ����Ʈ:�ٸ���Ű������ �����մϴ�
		title="momo";	//��ӹ��� title�ʵ� �ٸ� ��Ű�������� protected ���������ڷ� �ڽ�Ŭ������ ���
		System.out.println("title= "+title);
		setName("�ź�");
		System.out.println("name = "+getName());
		
		
	}
}
