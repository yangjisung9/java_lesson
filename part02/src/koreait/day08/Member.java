package koreait.day08;
//�ۼ��� ������

public class Member{

	private String name;
	private String email;
	private	int age;
	private int level;
	
	//name email �ʵ��ʱ�ȭ �ϴ� Ŀ���� ������
	public Member(String name,String email) {	
		this.name=name;
		this.email=email;	
	}
	
	/*
	public Member(String name) {	���� �޼ҵ� �����ε�   ������ �޼ҵ�:Ÿ�԰� �Ű����� ������ ������ �����ϱ� ������
		this.name=name;
	}
	public Member(String email) {	�������̸� ���� Ÿ���̰��Ƽ� ��������
		this.email=email;	
	}
	���� �޼ҵ� �����ε�  
	*/ 
	
	//�⺻(default) ������ :��¹� �߰�
	public Member() {	
		System.out.println("name,email,age,level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name = "+this.name);
		System.out.println("age = "+this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
		

	
	
	
	
	
	
		
		
	}
