package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;

//Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberNameDescending implements Comparator<Member> { //���� �������̽��� ���ؼ� ����ü�� ������Ѵ�
	
	@Override	//ctrl+spacebar : compare
	public int compare(Member o1, Member o2) {		
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name2.compareTo(name1);		//��������
	}

	

}
