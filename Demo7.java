class Demo7 
{
	public static void main(String[] args) 
	{
	     B b=new B();
	}
}
class A
{
	static{System.out.println("aa");}
	{System.out.println("bb");}
	A(){System.out.println("cc");}
}
class B extends A
{
	static{System.out.println("dd");};
		{System.out.println("ee");}
		B(){System.out.println("ff");}
}
