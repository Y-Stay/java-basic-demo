import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.text.*;
class ArrayDemo15 
{
	public static void main(String[] args) 
	{
		//System.out.print("������һ�����֣�");
		//int x=new Scanner(System.in).nextInt();
		//System.out.println("����de ����Ϊ��"+x);
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
//��ȡһ�������random����
// Random r=new Random();
// a=r.nextInt();

//��ȡ��ǰϵͳʱ�䵽1970��1��1�յĺ�����
//System.currentTimeMillis();