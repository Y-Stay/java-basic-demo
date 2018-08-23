class ClassDemo16 
{
	static {
		System.out.println("hello word!");
		System.exit(0);
	}
	public static void main(String[] args) 
	{
		Person.printData();
	}
}
class Person
{
	double h=175;
	static int diqiu;
	static{
		diqiu=1;
		System.out.println("staic....:");
	}
	static void printData()
	{
		System.out.println(diqiu);
	}
}
