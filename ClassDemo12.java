class ClassDemo12 
{
	public static void main(String[] args) 
	{
		point p1=new point(10,10);
		point other=new point(5,5);
		//System.out.println(p1.getDistance());
		//System.out.println(other.getDistance());
		//System.out.println(p1.getDistance(other));
		//circle c1=new circle(p1,10);
		//System.out.println(c1.contain(other));
		//System.out.println(c1.contain(6,6));
		circle c2=new circle(5,5,10);
		System.out.println(c2.contain(20,20));

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
class circle
{
	point center;
	double r;
	//写构造函数
	//circle(point center,double r)
	//{
	//	this.center=center;
	//	this.r=r;

	//}
	circle(double x,double y,double r)
	{
		//circle c1=new circle(10,10,10);
		this.center=new point(x,y);
		this.r=r;
		//this(new point(x,y),r);
	}
	//行为  求面积 求周长 是否包含一个点
	double getArea()
	{
		return 3.14*r*r;
	}
	double getLength()
	{
		return 2*3.14*r;
	}
	boolean contain(point p)
	{
		return center.getDistance(p)<=r;
	}
	boolean contain(double x,double y)
	{
		//return center.getDistance(new point(x,y))<=r;
		return this.contain(new point(x,y));//此处的this也可以省略
	}

}