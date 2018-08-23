/*求一个数的所有因子
    并把它们放如到一个数组包含1也包含自己
	*/
import java.util.*;
class  ArrayDemol7
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("请输入一个数字:");
		int n=s.nextInt();
		
		System.out.println(Arrays.toString (arraySons(n)));
	}
	public static int countSons(int a)
	{
		int count=0;
		for (int i=1;i<=a ; i++)
		{
			if (a%i==0)
				count++;
		}
		return count;
	}
	public static int[] arraySons(int n)
	{
		int [] a=new int[countSons(n)];
		int t=0;
		for (int i=1;i<=n;i++ )
		{
			if (n%i==0)
			{
				a[t]=i;
				t++;
			}
		}
		return a;
	}
}
