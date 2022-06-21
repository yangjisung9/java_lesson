package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;
//Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberAgeAscending implements Comparator<Member> { //비교자 인터페이스를 통해서 구현체를 만들려한다
	
	@Override	//ctrl+spacebar : compare
	public int compare(Member o1, Member o2) {	//Comparator의 제너릭타입이 Member이므로 타입은 자동으로 Member로 생성. 비교해야하므로 인자는 2개
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
	
		//age 필드(1차 기준)값이 같을 때 name필드(2차기준) 오름차순으로 정렬.
		if(age1==age2)
			return o1.getName().compareTo(o2.getName());
		else		
			return age1.compareTo(age2);		//오름차순: age1<age2 일때 -1을 리턴
	}

}
