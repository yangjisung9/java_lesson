package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

//�ۼ��� ������
public class C52_MyDictionary {

	
	public static void main(String[] args) {
//		HashMap<String,String> mydic = new HashMap<>();									//�ܾ��� ������ �ڷᱸ��
		TreeMap<String, String> mydic = new TreeMap<String, String>();					//���� �˻� ������ ������ Map�� ����: ������ �Ǵ� Map
		Scanner sc = new Scanner(System.in);
		//***mydic�� mywords�� �ٲ㼭 �����غ���
		String eng, kor;
		String sel = null;
		boolean run = true;

		System.out.println("���� ��� (�����ʰ���Ű��)  1.�ܾ�����	 2.�ܾ� �˻� 3.�ܾ��庸��	4.���α׷� ������");
			
			while(run) {							//while �ݺ��ȿ� switch�� ���� ������ ���۽�ų�� break�� ���մϴ�. -> ���� ����߽��ϴ�.
				System.out.print("���� - > ");
				sel = sc.nextLine();
				switch (sel) {
				case "1":							//switch������ case "���ڿ�" ���� ����. if�������� sel.equals("1")�� �ؾ��մϴ�.
					System.out.print("English - > ");
					eng = sc.nextLine();			// sc.nextInt();	���� ���� Ȯ���ϱ�(�Է¹���(��Ʈ��))
					System.out.print("Korean - > ");
					kor = sc.nextLine();
					mydic.put(eng,kor);				//����
					break;
					
				case "2":
					System.out.print("�˻� �ܾ� English -> ");
					eng = sc.nextLine();
					System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => "+mydic.get(eng));
					break;
				
				case "3" :
					System.out.println("�ܾ��� ��ü���� : " +mydic);
					break;
					
				case "4" :
					run =false;
					break;
					
				
				default:
					System.out.println("�߸� �Էµ� �����Դϴ�. 1~4 �Է¶��Դϴ�.");
				
				}
				
			}	//while end
				System.out.println("::::�ܾ����� �����մϴ�::::");
				sc.close();
			}
		}	
//���� : ���� ������ �Է��� �޾ƾ��Ѵٸ� ���ڿ� nextLine()	�޾Ƽ� ������ ��ȯ�մϴ�. 
// int score = Integer.parseInt(sc.nextLine());	
// ���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� �˴ϴ�.
// ��� : �� �ҽ� ���Ͽ��� nextInt() �� ��� �Ǵ� nextLine()�� ����ϰų� �մϴ�.
		

	


