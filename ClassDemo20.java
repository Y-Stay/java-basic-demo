class ClassDemo20 
{
	public static void main(String[] args) 
	{
		point p1=new point(5,5);
		Circle c1=new Circle(10,10,10);
		Circle c2=new Circle(p1,5);
		c1.showLocation();
        c2.showLocation();
		System.out.println(c1.getArea());
	}
}
class point
{
	double x,y;
	point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	void showLocation(point p)
	{
		System.out.println(p.x+" "+p.y);
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
		this(new point(x,y));
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
		super(x,y);
		this.r=r;
	}
	double getArea()
	{
		return 3.14*r*r;
	}
}
