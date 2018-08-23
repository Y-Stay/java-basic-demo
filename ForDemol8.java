//输入一个数字，判断其是否为素数（质数）
import java.util.Scanner;
class  ForDemol8
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个数字");
		int n=s.nextInt();
		int i;
		for ( i=2;i<=n/2 ; )
		{
			if (n%i==0)
			{
				break;
			}

		}
		if (i==n/2+1)
		{
			System.out.println(n+"为质数");
		}else
        { 
			System.out.println(n+"不是质数");
        }     
	}
}
