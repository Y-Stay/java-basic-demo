class ClassDemo7
{
	public static void main(String[] args) 
	{
		Adder a=new Adder();
		System.out.println(a.add(10,10));
		System.out.println(a.add(10,10,10));
		System.out.println(a.add(5.5,3.4));
		System.out.println(a.add('a','b','c'));
	}
}

class Adder
{
	int add(char a,char b,char c)
	{
		System.out.println("char������");
		return a+b+c;
	}
   public int add(int a,int b,int c)
	{
	   System.out.println("add1������");
	   return a+b+c;
   }
   /*public int add(int a,int b)
	{
	   System.out.println("add2������");
	   return a+b;
   }*/
   public double add(double a,double b)
	{
	   System.out.println("add3������");
	   return a+b;
   }
}