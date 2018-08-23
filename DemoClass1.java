
class DemoClass1
{
	public static void main(String[] args)
	{
		person p1=new person(176,90,"lisi");
		System.out.println(p1.name+","+p1.h+","+p1.w);
		//p1.eat(new String("fangbianmian"));
	
		p1.eat("fangbianmian");

	}
}
class person
{
	double h,w;
	String name;
	person(double a,double b,String c){
		System.out.println("构造函数被调用");
		h=a;
		w=b;
		name=c;
	}
	void eat(String s)
	{
		System.out.println(name+" is eatting "+s);
	}
	void walk()
	{
		System.out.println(name+" is walking.....");
	}
}