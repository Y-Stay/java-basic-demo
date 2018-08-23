class  ClassDemo14
{
	public static void main(String[] args) 
	{
		point p1=new point(20,20);
		point p2=new point(35,30);
		System.out.println(p1.getDistance(10,10));
		System.out.println(p1.getDistance(p2));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		circle c1=new circle(p1,10);
		circle c2=new circle(10,10,10);
		System.out.println(c1.contain(p2));
		System.out.println(c1.contain(15,15));
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
		void showLocation()
	{
			System.out.println(this.x+","+this.y);
		}
		double getDistance()
	{
			return Math.sqrt((this.x*this.x)+(this.y*this.y));
		}
		double getDistance(point other)
	{
			return Math.sqrt((this.x-other.x)*(this.x-other.x)+(this.y-other.y)*(this.y-other.y));
		}
		double getDistance(double x,double y)
	{
			//point p1=new point(x,y);
			//return Math.sqrt((this.x-p1.x)*(this.x-p1.x)+(this.y-p1.y)*(this.y-p1.y));
			return this.getDistance(new point(x,y));

		}
}
class circle
{
	point center;
	double r;
	circle(point center,double r)
	{
		this.center=center;
		this.r=r;
	}
	circle(double x,double y,double r)
	{
		this.center=new point(x,y);
		this.r=r;
		//this(new point(x,y),r);
	}
	double getArea()
	{
		return 3.14*r*r;
	}
	double getlength()
	{
		return 2*3.14*r;
	}
	boolean contain(point a)
	{
		return center.getDistance(a)<r;
	}
	boolean contain(double x,double y)
	{
		//return center.getDistance(x,y)<r;
		//return center.getDistance(new point(x,y))<r;
		return this.contain(new  point(x,y));
	}
}