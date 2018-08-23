class Demo4 
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle(10,10,10);
		c1.showLocation();
		Shape s1=new Circle(5,5,5);
		s1.showLocation();
	}
}
class point
{
	double x,y;
	point (double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
class Shape
{
	point location;
	Shape(point location)
	{
		this.location=location;
	}
	Shape(double x,double y)
	{
		this(new point (x,y));
	}
	void showLocation()
	{
		System.out.println(location.x+" "+location.y);
	}
}
class Circle extends Shape
{
	double r;
	Circle(point location,double r)
	{
		super(location);
		this.r=r;
	}
	Circle(double x,double y,double r)
	{
		this(new point(x,y),r);
	}
	void showLocation()
	{
		System.out.print("Ô²µÄÔ²ÐÄÊÇ£º");
		super.showLocation();
	}
}
