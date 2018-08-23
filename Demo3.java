class Demo3 
{
	public static void main(String[] args) 
	{
		B b=new B();
	}
}
class A
{
	static{System.out.println("aa..");}
	{System.out.println("bb..");}
	int b;
	{
		b=0;System.out.println("gg..");
	}
	A(){System.out.println("cc..");}
}
class B extends A
{
	static{System.out.println("dd..");}
	{System.out.println("ee..");}
	B(){System.out.println("ff..");}
}
