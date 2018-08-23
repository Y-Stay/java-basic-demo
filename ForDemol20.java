/*求水仙花数。所谓水仙花数，是指一个三位数abc，如果满足a3+b3+c3=abc，
   （a的3次方）则abc是水仙花数，打印所有水仙花数
   */
class ForDemol20 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		for (int i=100;i<=999 ;i++ )
		{
			a=i%10;
			b=i/10%10;
			c=i/100;
			if ((a*a*a)+(b*b*b)+(c*c*c)==i)
			{
				System.out.println(i);
			}
		}
	}
}
