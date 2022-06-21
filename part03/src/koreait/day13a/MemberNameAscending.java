package koreait.day13a;

import java.util.Comparator;
import koreait.day12.Member;
//Member 객체의 sort : 비교가능한 값으로 필드 중 하나를 선택해서 비교자(Comparator) 구현체 만듭니다.
public class MemberNameAscending implements Comparator<Member> { //비교자 인터페이스를 통해서 구현체를 만들려한다
	
	@Override	//ctrl+spacebar : compare
	public int compare(Member o1, Member o2) {	//Comparator의 제너릭타입이 Member이므로 타입은 자동으로 Member로 생성. 비교해야하므로 인자는 2개
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);		//오름차순: age1<age2 일때 -1을 리턴
	}

	

}
