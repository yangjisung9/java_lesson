package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
//�ۼ��� ������
public class MyDictionary {
	static Scanner sc = new Scanner(System.in);
	static List<Word> mywords = new ArrayList<Word>();
	
	public static void main(String[] args) {

		boolean run = true;

		System.out.println("���� ��� (�����ʰ���Ű��)  1.�ܾ�����	2.�ܾ� �˻�		 3. ��ü����	4.������ �˻�	5.���α׷� ������");
			
			while(run) {							//while �ݺ��ȿ� switch�� ���� ������ ���۽�ų�� break�� ���մϴ�. -> ���� ����߽��ϴ�.
				System.out.print("��� ���� - > ");
				String sel = sc.nextLine();
				switch (sel) {
				case "1":							//switch������ case "���ڿ�" ���� ����. if�������� sel.equals("1")�� �ؾ��մϴ�.
					System.out.println("�ܾ� ����");
					System.out.print("English - > ");
					String eng = sc.nextLine();			
					System.out.print("Korean - > ");
					String kor = sc.nextLine(); 
					System.out.print("���� -> ");
					int level = Integer.parseInt(sc.nextLine());
					Word temp = new Word(eng,kor);
					temp.setLevel(level);
					mywords.add(temp);		//����
					break;
					
				case "2":
					System.out.println("�˻� �ܾ� English -> ");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().equals(eng))
							System.out.println("�ܾ��� �˻��߽��ϴ�. ��� => "+w);
					break;
				
				case "3" :
					all(mywords);
					break;
					
				case "4" :
					System.out.println("�˻��� ���� �Է�(1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords,no);
					break;
					
					
				case "5" :
					run =false;
					break;
					
				default:
					System.out.println("�߸� �Էµ� �����Դϴ�. 1~4 �Է¶��Դϴ�.");
					break;
				}
				
			}	//while end
				System.out.println("::::�ܾ����� �����մϴ�::::");
			}	//main end
	
	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}
	private static void all(List<Word> mywords) {	// mywords�� ������ ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
		mywords.sort(new Comparator<Word>() {
			@Override
		public int compare(Word o1, Word o2) {
			return o1.getEnglish().compareTo(o2.getEnglish());
		}
		});
		System.out.println(String.format("%-30s %-20s %15s","English","Korean","Level"));
		System.out.println("-----------------------------------------------------------------");
		for (Word w : mywords) {
			System.out.println(String.format("%-30s %-20s %50d", w.getEnglish(),w.getKorean(),w.getLevel()));
		}
		
	}
	private static void wordSave() {

	}	
	
	private static void wordSearch() {
		
	}
	private static void wordList() {
		
	}
		}	
//���� : ���� ������ �Է��� �޾ƾ��Ѵٸ� ���ڿ� nextLine()	�޾Ƽ� ������ ��ȯ�մϴ�. 
// int score = Integer.parseInt(sc.nextLine());	
// ���� : nextInt()�� ���͸� ó������ �ʾƼ� ������ ������ nextLine()���� ���޵Ǿ� �Է� �帧�� ���ذ� �˴ϴ�.
// ��� : �� �ҽ� ���Ͽ��� nextInt() �� ��� �Ǵ� nextLine()�� ����ϰų� �մϴ�.
		

	


