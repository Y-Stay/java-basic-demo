class Demo12 
{
	public static void main(String[] args) 
	{
		Shape c=new Circle();
		Shape r=new Rectangle();
		Person p=new Person();
		p.drawShape(c);
		p.getOneShape().draw();
	}
}
class Person
{
	void drawShape(Shape s)//Shape����Ϊ�����ڷ��������Դ�������ʵ�������������ʵ��
	{
		s.draw();
	}
	Shape getOneShape()//Shape����Ϊ����ֵ���Ϳ��Է�������ʵ�������������ʵ��
	{
		//return new Circle();
		return new Rectangle();
	}
}
class Shape
{
	void draw()
	{
		System.out.println("draw....");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("draw Circle...");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("draw Rectangle....");
	}
}