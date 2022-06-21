package koreait.day08b;

import java.util.Random;

public class GameValue {	//���ӱ�� �����͸� ������������ Ŭ����

	private String gamer; //������ �̸� 
	private int count;	//���̸� �õ�Ƚ��
	private boolean success;//���߱� �������� �⺻�� false
	
	//Ŀ���� ������  : gamer �ʱⰪ���� -> �⺻ ������ ���Ұ�
	public GameValue(String gamer){
		this.gamer=gamer;
	}
	
	//��ü�� ����ϴ� �ν��Ͻ� �޼ҵ�
	public void print () {
		System.out.println("gamer : "+gamer+","
				+ " �õ�Ƚ�� : "+count+",���߱� �������� "+success);
	}
	
	public static int makeNumber(int min, int max) {
		Random r= new Random();
		return r.nextInt(max-min+1)+min;
	}

	public String getGamer() {
		return gamer;
	}

	public void setGamer(String gamer) {
		this.gamer = gamer;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
	
	
	
	
}
