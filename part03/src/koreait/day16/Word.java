package koreait.day16;

import java.util.List;

//조사하세요 : enum (열거형 타입) - > 상수만 정의한 클래스
public class Word {
	public static final int BASIC =1;		//기초
	public static final int PRACTICAL =2;	//활용
	public static final int EXPERT =3;		//전문가
	
	private String english;
	private String korean;
	private int level;
	public Word(String english, String korean, int level) {
		this.english = english;
		this.korean = korean;
		this.level = level;
	}
	public Word(String english,String korean) {
		this.english = english;
		this.korean = korean;
	}
	public Word(String english) {
		this.english = english;
		this.korean = korean;
		this.level = level;
	}
public String getEnglish() {
	return english;
}
public String getKorean() {
	return korean;
}
public int getLevel() {
	return level;
}
public void setWord(String english,String korean, int level) {
	this.english = english;
	this.korean = korean;
	this.level = level;
}
public void setkorean() {
	this.korean = korean;
}
public void setLevel(int level) {
	this.level = level;
}
@Override
public String toString() {
	return "("+english+" "+korean+" "+(this.level==BASIC?"기초" : this.level==PRACTICAL?"활용":"전문가")+")";	//의미파악하기위해 값대신에 상수명입력
													//ㄴ 내부에서 쓰는것이기때문에 클래스명 지정 안해줘도됨
}

}


