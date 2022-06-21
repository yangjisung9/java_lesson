package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {	//io:input,output 입출력 관련된 기능들의 클래스

	public static void main(String[] args) {
			String filename = "E:\\iclass\\자바테스트.txt";
						//		    ㄴ	 저장위치는 \인데 자바내에서 \\로 바뀌는 이유는 \가 기능이 있는 문자여서 문자로서의 \는 \\로 기입해야한다
//			String filename = "E:\\iclass\\자바테스트2.txt";	없는파일테스트(자바테스트2)
			File file = new File(filename);
			
			//Scanner : 입력기능을 갖는 클래스
			//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try-catch 필요하다
			Scanner sc = null;
			try {
				sc = new Scanner(file);		//System.in : 표준 입력(콘솔 입력)
				
/*				
				System.out.println("파일에서 읽은 내용 : " + sc.nextLine());	//System.out : 표준 출력(콘솔 출력)
				System.out.println("파일에서 읽은 내용 : " + sc.nextLine());	
				System.out.println("파일에서 읽은 내용 : " + sc.nextLine());	
*/
				while(sc.hasNext()) {
					System.out.println(sc.nextLine());
				}	
				System.out.println("파일 읽기가 완료되었습니다");
//				System.out.println("파일 출력이 완료되었습니다.");
			} catch (FileNotFoundException e) {
				//출력기능에는 파일이 없으면 자동으로 만들어집니다.
				System.out.println("사용자 오류 발생 : "+e.getMessage());
			} finally {
				if(sc != null)sc.close();		//지역변수로 쓸 게 아니면 초기화 해야함
			}
			// try ~ catch 자원해제 방법을 finally 안쓰고 java 7 버전 부터 다른 구문 형식이 가능합니다.			
			//		ㄴ 관련된 인터페이스가 무엇인지도 찾아보기
	
	
	}

}
