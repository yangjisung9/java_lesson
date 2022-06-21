package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;		//getter, setter �ۼ��غ���
					// �� ���� : A+,A,B+,B.......
	
	
	//�⺻�����ڰ� ���� �ֽ��ϴ�. � �ڵ��ϱ��? ���������ڴ� public
	public Score() {
	}
	
	public Score(String name, int korean, int english, int science) {
		this.name=name;
		this.korean=korean;
		this.english=english;
		this.science=science;
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", korean=" + korean + ", english=" + english + ", science=" + science
				+ ", grade=" + getgrade() + "]";
	}
	
	//�ν��Ͻ� �޼ҵ�
	public int sum() {
		int result = this.korean+this.english+this.science;

		return result;
	}
	
	public double average() {
		return (double)sum()/3;
	}
	
	//setter �� �����ϱ� : ���� ����. �ʿ信 ���󼭴� ���������ڸ� private ���ε� �� �� �ֽ��ϴ�.
	private void setgrade() {
		if(average() >= 90) this.grade="A";
		else if(average() >= 80) this.grade ="B";
		else if(average() >= 70) this.grade ="C";
		else if(average() >= 60) this.grade ="D";
		else this.grade ="F";
	}
	String getgrade() {
		setgrade();
		return grade;
	}
	//getter,setter
	public String getName() {
		return name;
	}
	
	
	

	public void setName(String name) {
		this.name = name;
	}
	
	void setScience(int science) {
		this.science=science;
	}
	int getscience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
		//this�� setKorean �޼ҵ� ���ఴü
	}
	
	int getKorean() {
		return korean;
	}
	
	void setenglish(int english) {
		this.english=english;
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� english�� ����(����)
		//this�� setenglish �޼ҵ� ���ఴü
	}
	
	int getenglish() {
		return english;
	}
	
	
	
	
	
	
}

/*package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;	//getter, setter �ۼ��غ���
					//�� ����: A+,A,B+,B....
	
	


	//�⺻������ ���� �ֽ��ϴ�.� �ڵ� �ϱ��? ���������ڴ� public
	public Score() {
	}
	
	public Score(String name,int korean,int english,int science) {
		this.name=name;
		this.english=english;
		this.korean=korean;
		this.science=science;
	}

	@Override
	public String toString() {
		return "Score [korean=" + korean + ", english=" + english + ", science=" + science + ", grade=" + getGrade()
				+ ", name=" + name + "]";
	}
	
	//�ν��Ͻ� �޼ҵ�
	public int sum() {
		int result = this.korean+this.english+this.science;	//�ν��Ͻ� �޼ҵ�� ��ü�� ���� Ȱ���ϴ� �޼ҵ��̴�. �ν��Ͻ� �޼ҵ尡 ���ڷ� �޴°��� �ʵ尪�� �ٸ� ���̴�.
		setGrade();		//��ü�� sum() �����ϸ� setGrade �� ȣ��Ǿ� ����
		return result;
	}
	public double average() {
		return (double)sum()/3;
	}
	
	//setter �� �����ϱ� : ���೻��. �ʿ信 ���󼭴� ���������ڸ� private ���ε� �� �� �ֽ��ϴ�.
	private void setGrade() {
		if(average()>=90)
		this.grade = "A";
		else if(average() >=80)this.grade="B";
		else if(average() >=70)this.grade="C";
		else if(average() >=60)this.grade="D";
		else this.grade="F";
	}
	
	String getGrade() {
		setGrade();
		return grade;
	}
	
	void setScience(int science) {
		this.science = science;
	}
	
	int getScience() {
		return science;
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//�޼ҵ� ���ڷ� ���޹��� ���� Ŭ���� �������� korean�� ����(����)
		//this�� setKorean�޼ҵ� ���ఴü
	}
	
	int getKorean() {
		return korean;
	}
	
	
	
	void setEnglish(int english) {
		this.english = english;
	}
	
	int getEnglish() {
		return english;
	}
	
	
}
*/