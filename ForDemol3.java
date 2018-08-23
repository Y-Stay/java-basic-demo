//求1到100之间奇数的和
class ForDemol3 
{
	public static void main(String[] args) 
	{
		int sum=0;
		for (int i=1;i<=100 ;i++ )
		{
			if (i%2!=0)
			{
				sum+=i;
			}
		}
		System.out.print("1到100之间奇数的和为："+sum);
	}
}
