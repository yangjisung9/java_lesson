package koreait.day05;

public class C22_AssignTest {

	public static void main(String[] args) {
		// 참고 : 증가연산자 , 축약연산자
		int i = 10, sum = 0;
		i = i + 1;
		i+=1; // (i = i + 1 과 같은 식)
		i++;  // 후치 : postfix
		++i;  // 전치 : prefix
		// 전치, 후치는 다른 명령어 (또는 연산자)들과 같이 쓰일 떄는 차이가 있습니다.
				
		System.out.println("i++ ? " + i++); //출력은 14, i값은 15가 됨
		System.out.println("++i ? " + (++i)); //출력 16, i값 16
		
		
		sum = sum + i; 	//sum = 16;
		sum+=i;			//sum = 32;
		System.out.println("sum ? " + sum);
		
		
		//
		i--;
		--i;
		sum = sum -10;
		sum -= 10;
		
	}

}
