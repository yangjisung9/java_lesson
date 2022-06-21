package koreait.day04;

import java.util.Scanner;

public class C21_StringEx {
// 작성자 : 양지성 -> 소스 완료하면 DM으로 파일 보내주세요.
	public static void main(String[] args) {
		
		
		/* 구글 이메일 계정을 체크하는 기능 구현
		 *	1.gmail.com 으로 끝나야 합니다.
		 *	2. @ 기호가 포함되어야 합니다. 
		 *	3. @ 앞까지의 문자열은 계정이름만 추출합니다 
		 *	4.계정이름은 6글자 이상이어야 합니다.
		 *	5. 계정 이름에는 특수기호가 포함되면 안됩니다.
		 *	 
		 */

		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid=true;
		
		System.out.print("사용할 이메일 입력하세요. >>> ");
		
		email = sc.nextLine();						//키보드 입력을 문자열로 처리합니다.
		
		//입력한 email이 처리조건 1,2,4,5에 해당하지 않으면 메시지 출력하고 isValid 변수를 false로 합니다.
		
		int idx = email.indexOf('@');
		String domain = email.substring(idx);
		String account = email.substring(0,idx);
		int alt = account.length();
		
		//1. @ 기호가 포함되어야 합니다
		if ((email.indexOf('@')==-1))
													{System.out.println("메시지 : 이메일 형식이 아닙니다.");}
		//2. 1번이 참일 때 @ 뒤에는 gmail.com 이어야 합니다.
		else if ((domain.equals("@gmail.com") == false))
													{System.out.println("메시지 : 도메인 이름이 틀립니다.");}
		//3. 2번이 참일 때 @ 앞까지의 문자열(계정이름)만 추출합니다.
		else 
													{System.out.println(account);}
	
		//4. 3번의 계정이름은 6글자 이상이어야 합니다.
		if	(alt<6)
													{System.out.println("메시지 : 계정이름은 6글자 이상이어야 합니다.");}
		//5. 3번의 계정이름에는 특수기호 $,%가 포함되면 안됩니다.
		if	(account.indexOf('$')!=-1 || account.indexOf('%')!=-1)
													{System.out.println("메시지 : 계정이름에는 특수기호 $,%가 포함되면 안됩니다.");}
	
	}

}
