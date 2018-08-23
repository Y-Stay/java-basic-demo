/*求10到1000之间所有的可逆素数
    该数字是素数  改数字倒置之后还是素数
	*/
class FunDemol4 
{
	public static void main(String[] args) 
	{
		for (int i=10;i<=1000 ;i++ )
		{
			if (isPrim(i)==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrim(int n)
	{
		int t=0;
		int s=n;
		while(s!=0)
		{
			t=t*10+s%10;
            s/=10; 
		}
		int i,j;
		for (i=2;i<=n/2 ;i++ )
		{
            if (n%i==0)
            {
				break;
            }
		}
		for (j=2;j<=t/2 ;j++ )
		{
            if (t%j==0)
            {
				break;
            }
		}
		if (i>n/2&&j>t/2)
		{
			return true;
		}
		return false;
	}
}
