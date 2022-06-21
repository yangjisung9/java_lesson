package koreait.day14;

import java.util.Random;

public class FunctionATest {

	public static void main(String[] args) {
		
		//1) �͸� Ŭ����: �߻�޼ҵ��� ���� ��������ϴ�
		FunctionA fa = new FunctionA() {
			@Override
			public int methodA(int a, int b) {
				System.out.print("a*b=");
				return a*b;
			}
			
		};
		System.out.println(fa.methodA(23, 11));
		
		//2 ���ٽ� : �߻�޼ҵ尡 1���� ���� ����. �� �Լ��� �������̽��� ǥ���� �����մϴ� (�޼ҵ� �̸��� ������ ����)
		fa = (int a, int b) -> {
			System.out.print("a+b=");
			return a+b;
		};
	
		System.out.println(fa.methodA(23, 11));
		
		
		fa = (int max, int min) -> {
			Random r = new Random();
			System.out.print("���� = ");
			return r.nextInt(max-min+1)+min;
			
				};
		System.out.println(fa.methodA(99, 11));
	}

}
