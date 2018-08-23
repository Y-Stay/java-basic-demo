class ClassDmeo115 
{
	public static void main(String[] args) 
	{
		Point p1=new Point(10,10);
			Circle c1=new Circle(p1,5);
			System.out.println(c1.Contain(8,8));

	}
}
class Circle
{
	Point center;
	double r;
	Circle(Point center,double r)
	{
		this.center=center;
		this.r=r;
	}
	double getArea()
	{
		return 3.14*r*r;
	}
	double getLength()
	{
		return 2*3.14*r;
	}
	boolean Contain(Point p)
	{
		return center.getDistance(p)<=r;
	}
	boolean Contain(int x,int y)
	{
		return center.getDistance(new Point(x,y))<=r;
	}
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