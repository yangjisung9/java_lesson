package koreait.day13a;

public class C54_CompareTo {

	public static void main(String[] args) {
//모든 객체(Object 상속)에는 compareTo 메소드가 있습니다. : 값의 비교
	
		String na = "kim";
		String you = "momo";
		String he = "Son";
		
		//String은 알파벳(사전식)비교 : 대문자 < 소문자
		System.out.println("kim과 momo 비교 : " + na.compareTo(you));	//-2(음수) : "kim" < "momo", "kim"-"momo"<0  // k l m 2 차이
		System.out.println("kim과 son 비교 : " + na.compareTo(he));	//24(양수) : "kim" > "Son" (대문자 아스키코드값이 소문자 보다 작음)

		int a = 12 , b=45;
		System.out.println("a-b :" + (a-b));	//12-45 <0
		Integer aa = 12;
		Integer bb = 45;
		//비교값 출력이 아닌 객체간의 비교의 대소관계 결과만 출력
		System.out.println("aa와 bb : " + aa.compareTo(bb)); // -1 : aa<bb
		aa=90;
		System.out.println("aa와 bb : " + aa.compareTo(bb)); // 1 : aa>bb
		aa=45;
		System.out.println("aa와 bb : " + aa.compareTo(bb)); // 0 : aa==bb
		
		//compareTo 와 같은 비교는 sort (정렬) 에 사용 됩니다.
		// 정렬은 오름차순 , 내림 차순 2가지 방법으로 할 수 있습니다.
	}

}
