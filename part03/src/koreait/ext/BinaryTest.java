package koreait.ext;

public class BinaryTest {

	public static void main(String[] args) {
		System.out.println("10����\t 2����\t 16����");
		for (int i=0;i<100;i++) {
			System.out.println(String.format("%d\t %s\t %s", i,Integer.toBinaryString(i),
					Integer.toHexString(i)));
			  
		}
	}

}
/*	10���� �������� �ٸ� ����(����)���� ���ڿ� ��ȯ
 *	Integer.toBinaryString(i)	->	2������ ��ȯ
 *	Integer.toOctalString(i)	->	8������ ��ȯ
 *	Integer.toHexString(i)		->	16������ ��ȯ
 *
 *	int������ 4����Ʈ 32��Ʈ 2������ 32�ڸ�, 16�����δ� 8�ڸ�, 10�����δ� �� ���� -2147483648~2147483647
 *												FFFFFFFF(32��Ʈ�� ��� 1, 02147383648)
 *	0xxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx		�� ���
 *	1xxx xxxx xxxx xxxx xxxx xxxx xxxx xxxx		�� ����
*/