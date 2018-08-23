import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.text.*;
class ArrayDemo15 
{
	public static void main(String[] args) 
	{
		//System.out.print("请输入一个数字：");
		//int x=new Scanner(System.in).nextInt();
		//System.out.println("输入de 数字为："+x);
		int a[] =new int[100000];
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=new Random().nextInt();
		}
		long start=System.currentTimeMillis();
		Arrays.sort(a);
		//ArrayDemo14.sort(a);
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		Date date=new Date();
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=format.format(date);
        System.out.println(time);
		System.out.println(date);
		//System.out.println(format);

	}
}
//获取一个随机数random函数
// Random r=new Random();
// a=r.nextInt();

//获取当前系统时间到1970年1月1日的毫秒数
//System.currentTimeMillis();