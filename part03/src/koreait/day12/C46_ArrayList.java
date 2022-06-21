package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		int[]	datas = {45,23,7,21,19,11,44};	//배열은 선언할때 배열의 크기를 정합니다.
												//배열은 기본형 데이터타입 int,double,long.... 또는 참조형 타입
		ArrayList<Integer> list = new ArrayList<>();
						//ArrayList는 크기가 동적입니다.
						//데이터 타입은 항상 참조형타입 만 입니다. 기본형은 래퍼클래스를 사용합니다.
						//<E> 는 제너릭(generic, 포괄적인) 타입이라고 부릅니다. 모든 타입을 리스트에 담을 수 있다.
						//리스트에 저장하는 데이터를 요소(Element)라고 합니다.
						//주요 메소드 : add,get,size,remove 
		
		String[] names = {"쯔위","모모","신비","은하","나나"};
		ArrayList<String> name_list = new ArrayList<>();
		
		//ArrayList에 데이터 추가는 add()	메소드로 합니다
		list.add(45);list.add(7);list.add(21);list.add(19);list.add(11);list.add(44);
		
		System.out.println("\n1.첫번째 ArrayList<Integer> 출력");				//ArrayList 출력 방법 : 출력하려는 ArrayList 생성자 입력
		System.out.println(list);
		System.out.println("참고(배열_" + Arrays.toString(datas)+"배열크기:"+datas.length);			//배열 출력하는 방법
		System.out.println("리스트의 크기 : "+ list.size());
		
		name_list.add("쯔위");
		name_list.add("모모");
		name_list.add("은하");
		name_list.add("나나");
	
		System.out.println("\n2.두번쨰 ArrayList<String> 출력");
		System.out.println(name_list);
		System.out.println("리스트의 크기 : " + name_list.size());			//데이터 없을때 0으로 출력됨
		
		System.out.println("\n3.특정 위치에 데이터 추가");
		list.add(1,23);		//(인덱스위치, 추가될 값)
		System.out.println("add(1,23)결과 :" + list);
		name_list.add(2,"신비");
		System.out.println("add(2, \"신비\") 결과 :" +name_list);
		
		System.out.println("\n4.배열처럼 index 값으로 데이터 가져오기");
		System.out.println("get(3) : "+list.get(3));
		System.out.println("get(3) : "+name_list.get(3));
		
		System.out.println("\n5.특정 위치의 데이터(요소) 제거");
		list.remove(4);
		System.out.println("remove(4)결과 : " + list);
		name_list.remove(4);
		System.out.println("remove(4)결과 : " + name_list);
		
		System.out.println("\n6.특정 값 위치를 알아내기"); //배열에서는 for문으로 비교하면서 찾아내야한다
		System.out.println("배열 : " + Arrays.binarySearch(names, "신비"));
		System.out.println("리스트 : " + name_list.indexOf("신비"));
		
		System.out.println("\n7. 6번의 실행내용을 for문으로 한다면?");
		System.out.println("배열");
		int i;
		for(i=0;i<names.length;i++)
			if(names[i].equals("신비"))
				break;
		System.out.println("'신비'는 인덱스 : " + i);
		System.out.println("리스트");
		for(i=0;i<name_list.size();i++)
			if(name_list.get(i).equals("신비"))
				break;
		System.out.println("'신비'는 인덱스 : " + i);
		
//		'신비'요소가 여러개일떄 리스트는 lastIndextOf 메소드로 마지막 일치 요소를 찾을 수 있습니다.
//		배열은 for 문을 써야 한다.
		
		System.out.println("\n8.contains 메소드");		//특정값이 있는지 확인
		System.out.println("'모모'가 리스트에 있는가?" + name_list.contains("모모"));
		System.out.println("'다현'이 리스트에 있는가?" + name_list.contains("다현"));
	
		

	}
}

/*
 *  배열 : 많은 양의 데이터를 저장하는 방법
 *  
 *  컬렉션(Collections)	: 자료구조. 많은 양의 데이터를 저장하는 것이고 데이터의 특징에 따라
 *  						관리(저장,읽기/쓰기)하는 차이가 있다.
 *  						데이터를 삽입/삭제 등의 알고리즘이 메소드로 구현되어 있습니다.
 *  	ㄴArrayList	클래스
 *  	ㄴHashMap	클래스
 */
