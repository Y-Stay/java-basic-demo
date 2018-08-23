class ClassDemo10
{
	public static void main(String[] args) 
	{
		point p1=new point(10,10);
		p1.showLocation();
		point p2=new point(20,20);
		p2.showLocation();
	}
}
class person
{
	int age;
	double h,w;
	String name;
	person(int age,double h,double w,String name)
	{
		this.age=age;
		this.h=h;
		this.w=w;
		this.name=name;
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
	double getInstance()
	{
		return Math.sqrt(x*x+y*y);
	}
	void showLocation()
	{
		System.out.println(this.x+","+this.y);
	}
}

