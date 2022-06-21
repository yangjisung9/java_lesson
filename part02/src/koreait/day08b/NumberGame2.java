package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2 {


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int max =10; //�õ� Ƚ��
	int[] triallst = new int[max];
	GameValue[] history = new GameValue[10];
	int k=0;
	
	System.out.println("���� ���߱� ���� �����մϴ� .");
	System.out.print("������ �����Ϸ��� �� �޸��� �̸��������� >>>>");
	String gamer=sc.nextLine();
	int rmin=11,rmax=29;
	
	do {
		
	//���⼭����
	GameValue temp=new GameValue(gamer);
	System.out.println("���� ���߱� ���� �����մϴ� . �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
	System.out.println(String.format("��, �޸��� ���纸����. (���� %d ~ %d)",rmin,rmax));
	int numComputer =GameValue.makeNumber(rmin, rmax);
	int numHuman;
	int i = 0;
	
	do {
		System.out.print("������ ���� �Է� (��ȸ: "+ (max -i)+ ") -> ");
		numHuman= sc.nextInt();
		if (numComputer > numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
		} else if (numComputer < numHuman) {
			triallst[i]=numHuman;
			i++;
			System.out.println("�ƴմϴ�. �� ���� ���Դϴ�");
		}
		
		if (i == max)	break;
	}	while(numComputer != numHuman);
	//numComputer == numHuman�̸� ��������� �ݺ�������

if(i==max) {
	System.out.println("�� �޸� �Է³��� : " +Arrays.toString(triallst));
	System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �������ּ���");
	temp.setCount(max);
}else {
	System.out.println("������ �����Դϴ�~, �������� �õ�Ƚ��"+(i+1));
	temp.setCount(i+1);
	temp.setSuccess(true);
	}
	//�������

//���ǰ���� history�迭�� ����
history[k]=temp;	//temp�� GameValue ��ü�� ������(�ּ�)
k++;	//���� �ε����� ,ī��Ʈ ����(������ Ƚ��)

System.out.print("������ ����Ͻðڽ��ϱ�? ����Ϸ��� 0�Է� >>> ");
	}while(sc.nextInt()==0);//���̸� do�ΰ��� �ݺ�
	
	System.out.println("::::::::���� ���ھ� ::::::::");
	
	//for �ݺ����� history�迭�� ����� �� ����ϱ�
	for(int j=0;j<k; j++)
		history[j].print();   	//history[j]�� Ÿ���� GameValue
		
sc.close();


}

}

