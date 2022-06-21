package koreait.day03;

import java.util.Scanner;

public class C16_IfSwitchEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int item_no;
		int pay;
		
		System.out.println("상품목록 : \n1.2200원\n2.1900원	\n3.3600원	\n4.2870원");
		System.out.println("상품을 선택해서 장바구니에 넣으세요. >>> ");
		item_no = sc.nextInt();

		if(item_no == 1) 		 pay = 2200;
		else	if(item_no == 2) pay = 1900;
		else 	if(item_no == 3) pay = 3600;
		else	if(item_no == 4) pay = 2870;
		else	{System.out.println("상품 선택이 잘못되었습니다.");
				pay = 99999;}
		
		
		System.out.println("결제 금액 " + pay + "입니다.");
		
		//위의 switch 문을 if~ else if 로 바꾸어서 실행하기
		
		
	}


}
