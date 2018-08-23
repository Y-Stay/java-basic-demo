import java.util.Scanner;
class  IfDemol3 //输入三个数字，按从小到大的顺序输出
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("请依次输入三个数字");
		System.out.print("第一个数：");
		int a=s.nextInt();
		System.out.print("第二个数：");
		int b=s.nextInt();
		System.out.print("第三个数：");
		int c=s.nextInt();
		/*思路1、假设a>b>c  
		      2、比较a和b若 a>b 则不变 若a<b则a和b交换
			  3、比较a和c若 a>c 则不变 若a<c则a和c交换
			  4、比较b和c若 b>c 则不变 若b<c则b和c交换
			  5、最终结果a>b>c*/
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
		if (b<c)
		{
			int d=b;
			b=c;
			c=d;
		}
		System.out.println("三个数由小到大的顺序为:"+c+","+b+","+a);



	}
}
