class Demo8 
{
	public static void main(String[] args) 
	{
		man m1=new man("zhangsan");
	}
}
class person
{
	static int h;
	{
		h=172;
		System.out.println("父类静态定义初始化");
	}
	int age;
	{
		age=25;
		System.out.println("父类定义初始化");
	}
	String name;
	person(String name)
	{
		this.h=h;
		this.age=age;
		this.name=name;
		System.out.println("父类的构造函数被调用");
	}

}
class man extends person
{
	static 
	{
	    int w=120;
		System.out.println("子类的静态定义初始化");
	}
	int x;
	{
		x=1;
		System.out.println("子类的定义初始化");
	}
	man(String name)
	{
		super(name);
		
		System.out.println("子类的构造函数被调用");
	}
}