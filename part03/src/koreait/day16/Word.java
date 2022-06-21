package koreait.day16;

import java.util.List;

//�����ϼ��� : enum (������ Ÿ��) - > ����� ������ Ŭ����
public class Word {
	public static final int BASIC =1;		//����
	public static final int PRACTICAL =2;	//Ȱ��
	public static final int EXPERT =3;		//������
	
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
	return "("+english+" "+korean+" "+(this.level==BASIC?"����" : this.level==PRACTICAL?"Ȱ��":"������")+")";	//�ǹ��ľ��ϱ����� ����ſ� ������Է�
													//�� ���ο��� ���°��̱⶧���� Ŭ������ ���� �����൵��
}

}


