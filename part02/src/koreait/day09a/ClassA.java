package koreait.day09a;


/*
 * Ŭ������ ���
 * -> Ŭ�������� �θ�(����Ŭ���� , super) �ڽ�(����Ŭ����)���谡 ��������ϴ�.
 * -> �θ��� Ŭ���� ������Ҹ� �ڽ��� ���
 * -> extends Ű���带 ����Ͽ� �θ�Ŭ������ �����մϴ�.
 * -> private ���������ڴ� ��Ӿȵ˴ϴ�.
 * -> protected �� �ٸ���Ű���� �ڽ�Ŭ������ ��ӹ����� �ֵ��� �մϴ�.
 * -> ���Ǽ��迡�� �ݷ������� �. ������ ������ ���ؼ� Ŭ���� ����.
 *  ������ ���� �� ����� �ܽ��� ������ �䳢 ����� -> �ϳ��� �׷����� Animal Ŭ���� �����ϰ� �������� �������
 *  -> ��������Ұ� �ƴѰ��� ��ü���� Ŭ������ ����(��, Cat,Dog, Rabbit,...) �׸��� Animal Ŭ������ ��ӹ޽��ϴ�
 *  
 *  
 * 
 */
public class ClassA {

	int ab;
	String name;
	protected String title;
	
	
	void print() {
		System.out.println("ab= "+ab);
		System.out.println("name= "+name);
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name=name;
	}
}
