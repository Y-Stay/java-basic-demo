class ClassDemo5 
{
	public static void main(String[] args) 
	{
		person p1=new person(175,80,28,"zhangsan");
		p1.eat();
		person p2=new person();
		person p3=new person(175,85);
	}
}
class person
{
	double h,w;
	int age;
	String name;
	person(double a,double b,int c,String d)
	{
		h=a;
		w=b;
		age=c;
		name=d;
		
		System.out.println("person��"+name+"�����ɹ�");
	}
	person(){System.out.println("�����޲����Ĺ��캯��");}
	person(double a,double b)
	{System.out.println("�������������Ĺ��캯��");}
	void eat()
	
	{
		System.out.println( name+"is eating.....");
	}
}

