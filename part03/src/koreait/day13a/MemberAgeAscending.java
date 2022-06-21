package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;
//Member ��ü�� sort : �񱳰����� ������ �ʵ� �� �ϳ��� �����ؼ� ����(Comparator) ����ü ����ϴ�.
public class MemberAgeAscending implements Comparator<Member> { //���� �������̽��� ���ؼ� ����ü�� ������Ѵ�
	
	@Override	//ctrl+spacebar : compare
	public int compare(Member o1, Member o2) {	//Comparator�� ���ʸ�Ÿ���� Member�̹Ƿ� Ÿ���� �ڵ����� Member�� ����. ���ؾ��ϹǷ� ���ڴ� 2��
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
	
		//age �ʵ�(1�� ����)���� ���� �� name�ʵ�(2������) ������������ ����.
		if(age1==age2)
			return o1.getName().compareTo(o2.getName());
		else		
			return age1.compareTo(age2);		//��������: age1<age2 �϶� -1�� ����
	}

}
