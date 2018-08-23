class ClassDemo9
{
	public static void main(String[] args) 
	{
		point p1=new point(8,8);
		point p2=p1;
		p2.x=10;
	    p2.showLocation();
		point p3=new point(20,20);
		p3=p1;
		p3.showLocation();
	}
}
class point
{
	
	double x,y;
	point(double a,double b)
	{
		x=a;
		y=b;
	}
	double getInstance()
	{
		return Math.sqrt(x*x+y*y);
	}
	void showLocation()
	{
		System.out.println(x+","+y);
	}
}
