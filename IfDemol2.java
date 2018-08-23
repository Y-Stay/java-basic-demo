import java.util.Scanner;
class  IfDemol2 ///////输入三个数字 找出并输出最大的一个数
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("第一个：");
		 int a=s.nextInt();
		System.out.print("第二个：");
		 int b=s.nextInt();
		System.out.print("第三个：");
		 int c=s.nextInt();
		 //方法一
		/*1、先比较a和b，如果a>b则不变，若a<b则a和b交换
		  2、再比较a和c，若a>c不变，若a<c,则a和c交换
		  3、输出a即为最大值*/
		  
		 if (a<b)
		 {
			 int d=a;
			 a=b;
			 b=d;
		 }
	     if (a<c)
	     {
			 int d=a;
			 a=c;
			 c=d;
	     }
		 System.out.println("最大值为"+a);
		 //方法二
		 /*1、创建int字符 max 并将a赋值给它 假设a就是最大的
		   2、max和b比较max<b 则max=b
		   3、max和c比较max<c 则max=c*/

		 int max=a;
		 if (max<b)
		 {
			 max=b;
		 }
         if (max<c)
         {
			 max=c;
         } 
		System.out.println("最大值为"+max);
	}
}
