class ClassDemo15 
{
	public static void main(String[] args) 
	{
		Person p=new Person(10,"zhangsan");//创建对象时先 初始化静态成员 再初始化其他成员变量再调用构造函数
		Person p1=new Person(20,"lisi");//静态成员（静态块）属于类.程序用到类的时候只需加载一次
		System.out.println(p.name);
		System.out.println(Person.diqiu);//用类名.调用静态成员

	}
}
class Person
{
	int age;
	String name;
	int h;
	
	{h=175;
	    System.out.println("aa");}
		
      //每个人都有自己的身高，但是初始值都是175
	//表示地球 用整数1代表
	//int diqiu=1 错误  每个人都有一个自己的地球，与显示不符
	static int diqiu;//所有人公用一个地球
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
