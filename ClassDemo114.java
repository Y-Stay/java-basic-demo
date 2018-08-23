class ClassDemo114
{
	public static void main(String[] args)
	{
		Person p1=new Person();
		p1.getPerson().getPerson().getPerson().getPerson().print();

	}
}
class Person
{
	int h;
	Person getPerson()
	{
		this.h++;
		return this;
	}
	void print()
	{
		System.out.println(this.h);
	}
}