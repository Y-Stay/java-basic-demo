class ClassDemo6 
{
	public static void main(String[] args) 
	{
		Adder a=new Adder();
		System.out.println(a.add(10,10));
		System.out.println(a.add(10,10,10));
		System.out.println(a.add(5.5,3.4));
	}
}

class Adder
{
   public int add(int a,int b,int c)
	{
	   System.out.println("add1被调用");
	   return a+b+c;
   }
   public int add(int a,int b)
	{
	   System.out.println("add2被调用");
	   return a+b;
   }
   public double add(double a,double b)
	{
	   System.out.println("add3被调用");
	   return a+b;
   }
}