/*已知faibonacci（斐波那契）数列的前几个数分别为0，1,1,2,3,5,8.......。
   从第三项开始，每一项都等于前两项之和。
   读入一个整数n，求出次数列的前n项的和。
   注意：这里的数列是从0开始的。
   */
import java.util.Scanner;
class  ForDemol24
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int n=s.nextInt();
		System.out.print("斐波那咧数列的前"+n+"项和为:");
		int sum=1;
		int a=0,b=1,x;
		if (n==1)
		{
			System.out.println("0");
		}
		else if (n==2)
		{
			System.out.println("1");
		}
		else if (n>=3)
		{
		for (int i=3;i<=n ; i++)
		{
            x=a+b;
			sum+=x;
			a=b;
			b=x;
		}
		System.out.println(sum);
		}
	}
}
