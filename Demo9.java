class Demo9 
{
	public static void main(String[] args) 
	{
		JavaCourse j1=new JavaCourse("java");
		j1.print();
	}
}
class Course
{
	String name;
	Course(String name)
	{
		this.name=name;
	}
	void print()
	{
		System.out.println(name+"�Ŀγ�");
	}
}
class JavaCourse extends Course
{
	JavaCourse(String name)
	{
		super(name);
	}
	void print()
	{
		super.print();
		System.out.println("��һ��:java��ʶ");
	}
}