class  Demo6
{
	public static void main(String[] args) 
	{
		Circle c1=new Circle(5,5,5);
		c1.showLocation();
	
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
	void showLocation()
	{
		System.out.println("点的位置是"+x+" ,"+y);
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
		System.out.print(location.x+" ,"+location.y);
	}
}
class Circle extends Shape
{
	double r;
	Circle(point location, double r)
	{
		super(location);
		this.r=r;
	}
	Circle(double x,double y,double r)
	{
		super(x,y);
		this.r=r;
		
	}

		void showLocation()
	{
		System.out.print("圆的圆心是：");
		super.showLocation();
	}
}
