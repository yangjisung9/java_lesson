package koreait.day05;

public class C22_AssignTest {

	public static void main(String[] args) {
		// ���� : ���������� , ��࿬����
		int i = 10, sum = 0;
		i = i + 1;
		i+=1; // (i = i + 1 �� ���� ��)
		i++;  // ��ġ : postfix
		++i;  // ��ġ : prefix
		// ��ġ, ��ġ�� �ٸ� ��ɾ� (�Ǵ� ������)��� ���� ���� ���� ���̰� �ֽ��ϴ�.
				
		System.out.println("i++ ? " + i++); //����� 14, i���� 15�� ��
		System.out.println("++i ? " + (++i)); //��� 16, i�� 16
		
		
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
