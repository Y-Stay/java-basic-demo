class ClassDemo15 
{
	public static void main(String[] args) 
	{
		Person p=new Person(10,"zhangsan");//��������ʱ�� ��ʼ����̬��Ա �ٳ�ʼ��������Ա�����ٵ��ù��캯��
		Person p1=new Person(20,"lisi");//��̬��Ա����̬�飩������.�����õ����ʱ��ֻ�����һ��
		System.out.println(p.name);
		System.out.println(Person.diqiu);//������.���þ�̬��Ա

	}
}
class Person
{
	int age;
	String name;
	int h;
	
	{h=175;
	    System.out.println("aa");}
		
      //ÿ���˶����Լ�����ߣ����ǳ�ʼֵ����175
	//��ʾ���� ������1����
	//int diqiu=1 ����  ÿ���˶���һ���Լ��ĵ�������ʾ����
	static int diqiu;//�����˹���һ������
    static 
		{
		diqiu=1;
		System.out.println("bb....");
	}
	Person (int age,String name)
	{
		this.age=age;
		this.name=name;
		System.out.println("cc");
	}
}
