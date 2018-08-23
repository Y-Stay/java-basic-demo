class ClassDemo19
{
	public static void main(String[] args) 
	{
		//Circle c=new Circle();
		//System.out.println(c.getArea());
		Circle c1=new Circle(10,10,10);
	   c1.showLocation();
	   Rectangle r=new Rectangle(10,10,10,10);
		   r.showLocation();
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
	double getDistance()
	{
		return Math.sqrt(x*x+y*y);
	}
	double getDistance(point other)
	{
		return Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y));
		
	}
}
class Shape
{
	point location;
	Shape(point location )
	{
		this.location=location;
	}
	Shape (double x,double y)
	{
		this(new point(x,y));
	}
	double getArea(){return 2;}
	double getlength(){return 0;}
	void showLocation()
	{
		System.out.println("我的位置是："+location.x+" "+location.y);
	}
}
class Rectangle extends Shape
{
	double w,h;
	Rectangle (double x,double y,double w,double h)
	{
		super(x,y);
	
		this.w=w;
		this.h=h;
	}
	double getArea()
	{
		return w*h;
	}
	double getlength()
	{
		return 2*(w+h);
	}
}
class Circle extends Shape
{
	double r;
	Circle(point location,double r)
	{
		super (location);
		
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
	double getLength()
	{
		return 2*3.14*r;
	}
}
