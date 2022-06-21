package koreait.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C70_StringSplit {

	public static void main(String[] args) {

		//String Ŭ������ split(�п���Ű��. �ɰ���) �޼ҵ�	- ���ڿ��� Ư�� ���ؿ� ���� �߶� �迭�� ����
		
		String temp = "��� 90 88 79";
		String result[]	=	temp.split(" ");	//������ �������� ���ڿ��� �������� �ɰ���
		System.out.println("1.�ݺ��� ���� ���");
		System.out.println("index 0 : "+result[0]);
		System.out.println("index 1 : "+result[1]);
		System.out.println("index 2 : "+result[2]);
		System.out.println("index 3 : "+result[3]);
		
		
		
		//for������
		System.out.println("2. �Ϲ����� for ���");
		for(int i=0;i<result.length;i++) {	//i+=4
			System.out.println(String.format("result[%d] : %s",i,result[i] ));
		}
		
		//���� for
		System.out.println("3. ���� for ���");
		for(String t : result)
			System.out.println("result ��� : "+t);
		
		String temp2 = "���,90,88,79";
		result = temp2.split(",");
		System.out.println("4. split ���б�ȣ , ");
		for(String t : result)
				System.out.println("result ��� : "+t);
		
		temp2 = "���,,90,,88,,79";
		result = temp2.split(",");
		System.out.println("5. split ���б�ȣ , ");	//���� ��ȣ ���ڿ��� ����
			System.out.println("result length : "+result.length);
		for(String t : result)
			System.out.println("result ��� : "+t);
		//result[1],result[3],result[5] 3���� �� ���ڿ��Դϴ�
		
		result = temp2.split(",,");			//���Խ� ���ڿ� : ���� ��ȣ�� ���� �Ǵ� , 
		System.out.println("5. split ���б�ȣ , ");
			System.out.println("result length : "+result.length);
		for(String t : result)
			System.out.println("result ��� : "+t);
		
		//Split�� ������ ���ڿ��� ���Խ� ���ڿ��Դϴ�. (���Խ� ������ ����, ��ƽ��ϴ�)
		//			���Խ� ���� : []�ȿ� ǥ���ϴ� ���� ���� �������� (or)�� �ش��մϴ�. ���Խ�-regex

		temp2 = "���,90 88()79";
		result = temp2.split("[ ,()]");			//���Խ� ���ڿ� : ���� ��ȣ�� ���� �Ǵ� , �Ǵ�( �Ǵ�)
		System.out.println("7. split ���ڰ� ���Խ�");
			System.out.println("result length : "+result.length);
		for(String t : result)
			System.out.println("result ��� : "+t);
		
		//���Խ��̶�� ���� �������� ���� ��ȣ�� �� �� �ִٴ� ��?

		temp2 = "���,90,88,79";
		result = temp2.split(",", 3);			//���Խ� ���ڿ� : ���� ��ȣ�� ���� �Ǵ� , �Ǵ�( �Ǵ�)
		System.out.println("8. split �ι�° ���� limit Ȯ��");
//		limit�� ���ϵǴ� �迭�� ũ��.	��, �ɰ����� �������� Ŀ�� ���� ����
			System.out.println("result length : "+result.length);
		for(String t : result)
			System.out.println("result ��� : "+t);
		
//		limit�� �ʰ��ص� �����Ͱ� ���������ʰ� ������ �迭��ҷ� ������ ���´�
		
		
		
//		�迭�� ������ �ڷᱸ�� : List
//		�迭�� List�� ��ȯ�ϴ� ���
		result = temp2.split(",");
		System.out.println("9. result �迭�� List ��ü�� ����");
		List<String> rlist = Arrays.asList(result);
		System.out.println(rlist);
		System.out.println("rlist size : "+rlist.size());
		for(String t : rlist)		//��¹��� 90�� 88 �տ� �������ִµ� split���� �ɰ��� ��� ������ ������ �ִ°�
			System.out.println("rlist ��� : "+t);

		//���� rlist�� �迭�� ũ�⸸ŭ List�� �������� �����մϴ�. (�߰�,����,���� ����)
//		rlist.add("test");		// ���� : ������ ũ���� ����Ʈ
//		rlist.remove(2);		// ���� : ������ ����� ����Ʈ		-> split���� ������ �迭�� ������ ����Ʈ!
//		rlist.add(2,"100");		// ����
		//������ List�� �����
		
		List<String> rlist2 = new ArrayList<String>(rlist);
		System.out.println("10. ArrayList�� ���ڰ� �ִ� ������ �׽�Ʈ");
		System.out.println(rlist2);
		rlist2.add("test");
		rlist2.remove(2);
		rlist2.add(2,"100");
		System.out.println(rlist2);
		
//		Arrays.asList �� �׽�Ʈ������ ����� ����Ʈ �Ǵ� ������ ���� ����Ʈ ������� ���鶧 �����մϴ�.
		List<Integer> ilist = Arrays.asList(1,2,6,9,100);
		System.out.println("11. Arrays.asList Ȱ��");
		System.out.println(ilist);
		
		
	
		
	}

}
