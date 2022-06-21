package koreait.day11;

public class AShapeTest {
//main �޼ҵ�� Ŭ������ ������� ���ø����̼��Դϴ�. �߻�Ŭ������ �ϼ��� ���ø����̼ǿ��� ���ο� �߻�޼ҵ带 �߰��ϸ�?
//			
	public static void main(String[] args) {
		Triangle tri = new Triangle(100,84);
		tri.shapeName="�����ﰢ��";
		System.out.println(tri);
		System.out.println("����="+tri.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(89); cir.shapeName="��";
		System.out.println(cir);
		System.out.println("����="+cir.getArea());
		
	}

}//AShapeTest
/*
 * ���� : �޼ҵ� �������� �� ���������� 
 * �θ� public -> �ڽ� default	: ���� 
 * �θ� default -> �ڽ� public 	: ����
 */



abstract class AShape{		//����
	protected String shapeName;
	protected int width;
	protected int height;
	
	public AShape() {		//AShape()	�� ��ü�� ���� ������� �ڽ� ��ü ��������� ����
		System.out.println("AShape ����Ʈ ������ �����մϴ�");
	}
	
	//�߻�Ŭ������ Ŀ���һ����� ���峪��?
	public AShape(int width,int height) {
		System.out.println("AShape Ŀ���� ������ �����մϴ�");
		this.width=width;
		this.height=height;
		
		
	}

	public abstract double getArea();	//������ ����
	
	//�߻�Ŭ������ �ν��Ͻ� �޼ҵ� �����ؼ� �ڽ�Ŭ������ ������ �� �� �ֽ��ϴ�.
	public Object explain()	{			//���ø����̼� �Ϸ� �� �߻�޼ҵ� �߰� ���� �߻��ϹǷ� �ν��Ͻ� �޼ҵ� �߰�
		return null;
	}
	
	@Override
	public String toString() {
		return "AShape [��������" + shapeName + ", width=" + width + ", height=" + height + "]";
	}
	
	

}	//AShape

class Triangle extends AShape{	// width*height/2
	
	public Triangle(int width,int height) {
			super(width,height);
//			this.width=width;
//			this.height=height;
	}
	
	@Override
	public double getArea() {
		return width*height/2;
	}

	@Override
	public String toString() {
		return "Triangle [��������=" + shapeName + ", width=" + width + ", height=" + height + "]";
	}

	
	
	
}

class Circle extends AShape{
	private int radius;	//������
				//radius*radius*3.14
	@Override
	public double getArea() {
		return radius*radius*3.14;
	}
	@Override
	public String toString() {
		return "Circle [������=" + radius + ", ��������=" + shapeName + ", width=" + width + ", height=" + height
				+ "]";
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
						

class Rectangle extends AShape{
								//width*height
@Override
public double getArea() {
	return width*height;
}

@Override
public String toString() {
	return "Rectangle [��������=" + shapeName + ", width=" + width + ", height=" + height + "]";
}

}

