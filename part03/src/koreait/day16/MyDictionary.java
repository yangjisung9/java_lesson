package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
//작성자 양지성
public class MyDictionary {
	static Scanner sc = new Scanner(System.in);
	static List<Word> mywords = new ArrayList<Word>();
	
	public static void main(String[] args) {

		boolean run = true;

		System.out.println("선택 기능 (오른쪽가르키기)  1.단어저장	2.단어 검색		 3. 전체보기	4.레벨로 검색	5.프로그램 끝내기");
			
			while(run) {							//while 반복안에 switch로 종료 조건을 동작시킬때 break로 못합니다. -> 변수 사용했습니다.
				System.out.print("기능 선택 - > ");
				String sel = sc.nextLine();
				switch (sel) {
				case "1":							//switch문에서 case "문자열" 형식 가능. if문에서는 sel.equals("1")로 해야합니다.
					System.out.println("단어 저장");
					System.out.print("English - > ");
					String eng = sc.nextLine();			
					System.out.print("Korean - > ");
					String kor = sc.nextLine(); 
					System.out.print("레벨 -> ");
					int level = Integer.parseInt(sc.nextLine());
					Word temp = new Word(eng,kor);
					temp.setLevel(level);
					mywords.add(temp);		//저장
					break;
					
				case "2":
					System.out.println("검색 단어 English -> ");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().equals(eng))
							System.out.println("단어장 검색했습니다. 결과 => "+w);
					break;
				
				case "3" :
					all(mywords);
					break;
					
				case "4" :
					System.out.println("검색할 레벨 입력(1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords,no);
					break;
					
					
				case "5" :
					run =false;
					break;
					
				default:
					System.out.println("잘못 입력된 선택입니다. 1~4 입력란입니다.");
					break;
				}
				
			}	//while end
				System.out.println("::::단어장을 종료합니다::::");
			}	//main end
	
	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}
	private static void all(List<Word> mywords) {	// mywords의 참조값 전달받아 동일한 객체를 가리킵니다.
		mywords.sort(new Comparator<Word>() {
			@Override
		public int compare(Word o1, Word o2) {
			return o1.getEnglish().compareTo(o2.getEnglish());
		}
		});
		System.out.println(String.format("%-30s %-20s %15s","English","Korean","Level"));
		System.out.println("-----------------------------------------------------------------");
		for (Word w : mywords) {
			System.out.println(String.format("%-30s %-20s %50d", w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
	}
	private static void wordSave() {

	}	
	
	private static void wordSearch() {
		
	}
	private static void wordList() {
		
	}
		}	
//참고 : 정수 데이터 입력을 받아야한다면 문자열 nextLine()	받아서 정수로 변환합니다. 
// int score = Integer.parseInt(sc.nextLine());	
// 이유 : nextInt()는 엔터를 처리하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
// 결론 : 한 소스 파일에서 nextInt() 만 사용 또는 nextLine()만 사용하거나 합니다.
		

	


