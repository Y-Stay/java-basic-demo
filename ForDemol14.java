/*百钱买百鸡  100元钱买100只鸡
  公鸡3元/只 母鸡2元/只 小鸡1元2只
  公鸡 i    母鸡  j    小鸡  k
  i=1 时   j=1  / j=2 / j=3 .......j=49
  ......
  ......
  i=33    ...........
  */
class ForDemol14
  
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i=1;i<=33 ;i++ )
		{
			for (j=1;j<=49 ;j++ )
			{
				k=100-i-j;
				if (k%2==0&&(3*i+2*j+k/2)==100)
				{
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
	}
}
