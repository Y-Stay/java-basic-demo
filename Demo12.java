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
	void drawShape(Shape s)//Shape类作为参数在方法区可以传递它的实例和它的子类的实例
	{
		s.draw();
	}
	Shape getOneShape()//Shape类作为返回值类型可以返回它的实例和它的子类的实例
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