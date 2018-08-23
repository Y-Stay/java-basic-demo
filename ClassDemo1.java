class ClassDemo1
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		Person p2=new Person();

		p1.h=175;
		p1.w=200;
		
		p2.h=165;
		p2.w=82;
		p1.eat();
		p2.walk();

		p1.eat();
		p2.walk();
		System.out.println(p1.h);
	}

}
class Person
{
	double h,w;
	int age;
	String name;
	void eat ()
	{
		System.out.println("eat....");
	}
	void walk()
	{
		System.out.println("walking....");
	}
}
