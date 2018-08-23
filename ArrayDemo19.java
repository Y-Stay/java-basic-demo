import java.util.*;
class ArrayDemo19 
{
	public static void main(String[] args) 
	{
		String a="张三";
		String [] b={"zhangsan","lisi"};
        String [][] c={{"zhangsan","ali"},{"lisi","小命"},{"wangwu","小红"}};
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		for (int i=0;i<c.length ;i++ )
		{
			System.out.println(Arrays.toString(c[i]));
		}
	}
}
