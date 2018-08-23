/*
1、输入一个数，因式分解
   如输入90 得到90=2*3*3*5
     输入80 得到80=2*2*2*2*5
	 思路：用n%i==0判断当前的i是不是n的一个因子
	          如果是 则n=n/i;输出i
		      提前定义一个计数变量count=0  count++
		      如果count>0 则输出*
           如果不是 则i++

*/import java.util.Scanner;
class  ForDemol19
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int n=s.nextInt();
		System.out.print(n+"=");
		int count=0;
		int t=n;
		for (int i=2;i<=t/2 ; )
		{
			if (n%i==0)
			{
				if (count>0)
				{
					System.out.print("*");
				}
				n=n/i;
				System.out.print(i);
                count++;	
             }
			 else
			{ 
				 i++;
			}
		}
		//判断输入的数字是不是一个质数 
		int j;
		
		for (j=2;j<=t/2 ;j++ )
		{
			if (j%t==0)
			{
				break;
			}
	    }
		if (j==t/2+1)//如果是质数则输出"1*"+t
			{
				System.out.println("1*"+t);
			}
	    if (t==1)
			{
				System.out.println("1*1");
			}
		}

}
