//输入一个数字求其各个数位的数字之和
//用 for循环也行
import java.util.Scanner;
class  WhileDemol2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个多位数字：");
		/*int n=s.nextInt();
		int sum=0;
		while (n!=0)
		{
			sum+=n%10;
			n=n/10;
		}*/
		int sum=0;
		for (int n=s.nextInt();n!=0 ;n/=10 )
		{
			sum+=n%10;
		}
		System.out.println("各个数位之和为："+sum);
	}
}
