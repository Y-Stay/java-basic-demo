class FunDemol6 
{
	public static void main(String[] args) 
	{
		System.out.println(jiecheng(6));
	}
	public static long jiecheng(int n)
	{
		int t=1;
		for (int i=1;i<=n ; i++)
		{
			t*=i;
		}
		return t;
	}
}
