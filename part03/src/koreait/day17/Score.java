package koreait.day17;

public class Score {
	private String name;
	private int korean;
	private int english;
	private int science;
	private String grade;		//getter, setter 작성해보기
					// 값 예시 : A+,A,B+,B.......
	
	
	//기본생성자가 숨어 있습니다. 어떤 코드일까요? 접근한정자는 public
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
	
	//인스턴스 메소드
	public int sum() {
		int result = this.korean+this.english+this.science;

		return result;
	}
	
	public double average() {
		return (double)sum()/3;
	}
	
	//setter 를 변경하기 : 실행 내용. 필요에 따라서는 접근한정자를 private 으로도 할 수 있습니다.
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
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
		//this는 setKorean 메소드 실행객체
	}
	
	int getKorean() {
		return korean;
	}
	
	void setenglish(int english) {
		this.english=english;
		//메소드 인자로 전달받은 값을 클래스 전역변수 english에 저장(대입)
		//this는 setenglish 메소드 실행객체
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
	private String grade;	//getter, setter 작성해보기
					//값 예시: A+,A,B+,B....
	
	


	//기본생성자 숨어 있습니다.어떤 코드 일까요? 접근한정자는 public
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
	
	//인스턴스 메소드
	public int sum() {
		int result = this.korean+this.english+this.science;	//인스턴스 메소드는 객체의 값을 활용하는 메소드이다. 인스턴스 메소드가 인자로 받는것은 필드값과 다른 값이다.
		setGrade();		//객체가 sum() 실행하면 setGrade 도 호출되어 실행
		return result;
	}
	public double average() {
		return (double)sum()/3;
	}
	
	//setter 를 변경하기 : 실행내용. 필요에 따라서는 접근한정자를 private 으로도 할 수 있습니다.
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
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장(대입)
		//this는 setKorean메소드 실행객체
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