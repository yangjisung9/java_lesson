package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

//Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberAgeDescending implements Comparator<Member> { //���� �������̽��� ���ؼ� ����ü�� ������Ѵ�
	
	@Override	//ctrl+spacebar : compare
	public int compare(Member o1, Member o2) {		
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		return age2.compareTo(age1);		//�������� :
	}

	/* �� �Ű����� ��ü�� ���Ͽ� compare ���� ���ϰ� ����� ������ ��쿡 �� ���� ��ġ�� ��ȯ�Ѵ�.
	 * ���Ͻ��� �������� ������ ��츦 ���ϴ�. ��ȯ���� �ʴ� ��츦 -1(����)�� ���ϵǰ� �մϴ�.
	 * ���� ��ȯ���� �ʴ� ���� 
	 *�������� : o1 < o2    	//�������� : o1 > o2 
	*/

	

}
