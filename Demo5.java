class Demo5 
{
	public static void main(String[] args) 
	{
		B b=new B();
		System.out.println(b.i);
		A a=new A();
	}
}
class A
{
	A(){this.test();}
	void test ()
	{
		System.out.println("hello");
	}
}
class B extends A
{
	int i=11;
	B(){}
	void test()
	{
		System.out.println(i);
	}
}
