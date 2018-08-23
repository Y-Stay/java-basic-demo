class Demo1x 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		System.out.println(c.getArea());
	}
}
class Shape
{
	Point location;
	double getArea()
	{
		return 0;
	}
}
class Circle extends Shape
{

}
class Point
{
	int x,y;
	Point(int x,int y)
		{
		this.x=x;
		this.y=y;
	}
	double getDistance()
	{
		return Math.sqrt(x*x+y*y);
	}
	double getDistance(Point p)
	{
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}

}