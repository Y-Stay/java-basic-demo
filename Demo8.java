class Demo8 
{
	public static void main(String[] args) 
	{
		man m1=new man("zhangsan");
	}
}
class person
{
	static int h;
	{
		h=172;
		System.out.println("���ྲ̬�����ʼ��");
	}
	int age;
	{
		age=25;
		System.out.println("���ඨ���ʼ��");
	}
	String name;
	person(String name)
	{
		this.h=h;
		this.age=age;
		this.name=name;
		System.out.println("����Ĺ��캯��������");
	}

}
class man extends person
{
	static 
	{
	    int w=120;
		System.out.println("����ľ�̬�����ʼ��");
	}
	int x;
	{
		x=1;
		System.out.println("����Ķ����ʼ��");
	}
	man(String name)
	{
		super(name);
		
		System.out.println("����Ĺ��캯��������");
	}
}