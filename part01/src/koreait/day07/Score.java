package koreait.day07;
//40�� ����
import java.util.Scanner;

public class Score {

	int korean;
	int english;
	int science;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� >>>"); 	this.korean = sc.nextInt();
		System.out.println("���� >>>"); 	this.english = sc.nextInt();
		System.out.println("���� >>>"); 	this.science = sc.nextInt();
		//sc.close();		//������ ���α׷��� ����ɶ��� close�� ����. close�� ���� �� �̻� �Է��� �ȵȴ�
	}
	
	int sum()	{
		return	(korean+english+science);
				}
	
	double average()	{
		return (double)sum()/3;
	}
	@Override
	public String toString() {
		return "Score [korean=" + korean + ", english=" + english + ", science=" + science + "]";
	}
}
