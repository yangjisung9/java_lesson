package koreait.day07;

public class Singer {
//C37 번호 생략
			/*
		 * 클래스 정의 하는 것은 현실세계의 데이터를 처리하기 위한 형식을 지정
		 */
		//Singer 객체가 만들어질 때마다 다른 값 : 인스턴스 필드
		
		String genre;		//장르
		String name_eng;
		String name_kor;
		int debutYear;
		String[] members;		//그룹일 경우 멤버이름들 저장
		
		static final String JOB = "연예인";
		static String LabeL="👍";				//Singer 에게는 모두 동일한 라벨표시
		
		void printMembers() {
				if(members == null)
					System.out.println("그룹이 아닌 솔로 가수입니다.");
//----				else
//----					for(int i=0;i>members.length;i++) {
//----						if(members[i] != null)
//----							System.out.println((i+1) +":" + members[i]);
							
					}
//----			}
//----	int actYears(int year);
	@Override
	public String toString() {
		return "Singer [genre=" + genre + ", name_eng=" + name_eng + ", name_kor=" + name_kor + ", debutYear="
				+ debutYear + ", members=" + members + "]";
//-----	}	
//-----		return year-debutYear+1;
	
		}
	

}
