package koreait.day11;
/*
 * �߻�Ŭ���� : 
	1.��ü�� ������������ �ʴ� ������ Ŭ���� �Դϴ�.
	2.�߻�޼ҵ带 ���� �ֽ��ϴ�. �߻�(abstract): ��üȭ���� ���� ����.
	3.�θ�Ŭ�������� ��üȭ���� ���� �߻�޼ҵ带 �ڽ�Ŭ������ ������(�������̵�)�ϵ��� �ϴ� ���Դϴ�.
	4.����: '���'�� �߻�ȭ����. '�����'�� ��üȭ�� ��ü.
		�� �߻�Ŭ���� ������ �߻�ȭ�� ���� ��ü�� ������ ����!!
	5.�߻�޼ҵ带 ������(����)�� �ڽ�Ŭ������ �����ؼ� ��ü�� �����մϴ�.
*/
public abstract class ClassAbs {
	
	protected String name;
	
	//�߻�޼ҵ� : �ڽĵ��� �������ϵ��� ���ĸ� �����մϴ�. {}(body,��ü) �����ϴ�.
	public abstract void test();
	
	//�ν��Ͻ� �޼ҵ�
	public void print()	{
		System.out.println("name="+name);
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

}
