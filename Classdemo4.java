class ClassDemo4 
{
	public static void main(String[] args) 
	{
		person p1=new person(180,80,"zhangsan");
		p1.eat();
		p1.walk();
		person p2=new person(180,90,"lisi");
		p2.eat();
		p2.walk();
	}
}
class person
{
	double h,w;
	int age;
	String name;
	person(double a,double b,String c)
	{
		System.out.println("构造函数被调用。。。");
		h=a;
		w=b;
		name=c;
	}
	void eat()
	{
		System.out.println(name+" eating....");
	}
	void walk()
	{
		System.out.println(name+" walking....");
	}


}
