package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {
//작성자 : 양지성 _ 파일 제출합니다. (주석으로 설명을 작성하세요. 너무 장황하지 않게 정리)
	public static void main(String[] args) {
		int[] numbers = new int[45];		//배열 선언
		Random r = new Random();		//랜덤값 생성
		for(int i=0;i<45;i++)	{		//인덱스 범위 : 0~44
			numbers[i]=i+1;				//값 범위 : 1~45
								}
		
		System.out.println("numbers 배열 초기값----------------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("--------------------------------------------------");
		
		int[] lotto = new int[6];				//로또 저장할 배열 생성
		int k;									//삭제할 위치의 인덱스 값
		for(int cnt=0;cnt<6;cnt++)	{			
			k=r.nextInt(45-cnt);				//인덱스 범위를 줄이기 위해 난수 발생 범위 변경
			System.out.println("k="+k +",number =" +numbers[k]);
			
			lotto[cnt]=numbers[k];				//lotto 배열에 인덱스 K값을 저장
			
			for(int i=k;i<numbers.length-1;i++)		{	//배열에서 데이터 삭제
				numbers[i]=numbers[i+1];				//인덱스 i+1을 인덱스 i로 변경
													}
			System.out.println(Arrays.toString(numbers));	//데이터 삭제된 배열 요소 출력
									}
		System.out.println("최종 선택 숫자 : ");				
		System.out.println(Arrays.toString(lotto));			// 배열요소 출력
		
		Arrays.sort(lotto);			//lotto 배열값의 크기 순서대로 위치를 변경
		System.out.println(Arrays.toString(lotto));			//오름차순으로 출력
 				
		
		
		}

	}


