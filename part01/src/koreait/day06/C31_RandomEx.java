package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 *  학생 성적(국어) 분포 보고서를 만듭니다.
		 *  학생 인원은 100명 - 점수는 랜덤값으로 테스트(0<= 난수 <=100)
		 * 	90~100 : o 명( 소수점 1자리 %) 	카운트 변수가 5개 필요합니다. (cntA,cntB,cntC,cntD,cntE)
		 * 	80~89 : o 명( 소수점 1자리 %) 							ㄴ counts[5] : counts[0],counts[1],counts[2],count[3],count[4]
		 * 	70~79 : o 명( 소수점 1자리 %) 
		 * 	60~69 : o 명( 소수점 1자리 %) 
		 * 	50~59 : o 명( 소수점 1자리 %) 
		 *  
		 */
		
		Random r = new Random();
		int[] koreans = new int[100];
		int[] counts = new int[5];
						
		System.out.print("[ ");
		for (int i=0;i<koreans.length;i++)	{
			koreans[i] = r.nextInt(101);		// 국어 점수 저장	
			System.out.printf("%d, ",koreans[i]);
											}
		System.out.print(" ]");
		
		//점수 분포 count하기
		for (int i=0;i<koreans.length;i++)	{
			if (koreans[i]>=90)	counts[0]++;
			else if (koreans[i]>=80) counts[1]++;
			else if (koreans[i]>=70) counts[2]++;
			else if (koreans[i]>=60) counts[3]++;
			else counts[4]++;
											}
							
		//점수 분포 결과 출력하기
//		System.out.println("\n90~100\t 80~89\t 70~79\t 60~69\t 60미만");
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60미만");
		System.out.println("-------------------------------------");	
		for(int i=0; i<counts.length;i++)	{
			//counts 배열값 출력
			System.out.printf("%8d ",counts[i]);
			
			
											}
		System.out.println();
		for(int i=0;i<counts.length;i++)
			//counts 배열값으로 백분율 구하고 출력하기
			System.out.printf("%7.1f%% ",(double)counts[i]);
	
			
											}
			
			
	//배열에서 기능이 향상(데이터삭제,추가)된 것이 자바ArrayList
		
		
				
			
			
		
		
		
	}


