package koreait.day09a;

import koreait.day09b.ClassAB;

public class C45_Test {

	public static void main(String[] args) {
		
		ClassAA test1=new ClassAA();
		test1.ab=123;
		test1.name="hong";
		
		//��ӹ��� �޼ҵ�
		test1.print();
		
		//ClassAA ���� ���ǵ� �޼ҵ�
		test1.test();
		
		//AB���� ���ǵ� �޼ҵ�
		ClassAB test2 =new ClassAB();	
		test2.test();
		
	}

}
