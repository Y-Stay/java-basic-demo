import java.util.Scanner;
class FunDemol1 
{
	public static void main(String[] args) 
	{
		//Scanner s=new Scanner(System.in);
		for (int i=1;i<=2 ;i++ )
		{
			inPutNo(i);
		}
		
	}
	public static void inPutNo(int t)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入第"+t+"个数字：");
		 t=s.nextInt();
		printSons(t);
		
	}
	public static void printSons(int n)
	{
		System.out.print(n+"的因子为：");
        for (int i=2;i<=n/2 ;i++ )
        {
			if (n%i==0)
			{
				System.out.print(i+" ");
			}
        }
		System.out.println();
	}
}
