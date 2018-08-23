class Demo119 
{
	public static void main(String[] args) 
	{
		B b=new B();
		
	}
}
class A
{
	A(){test();}
	void test(){System.out.println("hello");}
}
class B extends A
{
	int i=11;
	B(){}
	//void test(){System.out.println("word");}
	void test(){System.out.println(i);}
}