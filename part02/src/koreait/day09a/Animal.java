package koreait.day09a;

public class Animal {

	static final int CAT =1;
	static final int DOG =2;
	static final int CROW =3;
	static final int FROG =4;
	static final int SNAKE =5;
	
	
	private String name;
	private String color;
	protected int type;
	
	public Animal() {	//생성자
		System.out.println("새로운 Animal가족이 생겼습니다");
	}
	
	public void act() {
		System.out.println("Animal 행동 : 아직 모름(unknown)");
	}
	
	public void print() {
		System.out.println("name:"+name+" ,color:"+color);
	}
	
	//Object 설명하고 작성한 메소드입니다 .
	public boolean isDog(Object object) {
		return object instanceof Dog;
	}
	
	public boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	
	
	//getter ,setter
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	
	
}
