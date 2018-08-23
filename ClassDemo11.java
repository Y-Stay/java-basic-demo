class ClassDemo11 
{
	public static void main(String[] args) 
	{
		person p1=new person();
		p1.getPerson().getPerson().getPerson().getPerson();
		p1.print();
	}
}
class person
{
	double h;
	person getPerson()
	{
		h++;
		return this;
	}
	void print()
	{
		System.out.println(h);
	}
}