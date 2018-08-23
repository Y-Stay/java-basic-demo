class  ClassDemo8
{
	public static void main(String[] args) 
	{
		person p1=new person(80,"zhangshan");
		person p2=new person(75,"lisi");
		p1.print();
		p2.print();
	}
}
class person
{
	double h=175;
	double w;
	String name;
	person (double a,String b)
	{
		w=a;
		name=b;
	}
	void print()
	{
		System.out.println(name+"的身高"+h+"体重"+w);
	}
}