//输入一个数字打印出其所有因子包含1不包含自己 并对所有因子求和
import java.util.Scanner;
class  ForDemol6
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int n=s.nextInt();
		int sum=1;
		for (int i=1;i<n ;i++ )
		{
			if (n%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("所有因子之和为：");
	}
}
