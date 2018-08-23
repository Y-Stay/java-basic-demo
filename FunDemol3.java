/*打印10到1000之间各个数位之和是5的数
    把这个多位数的求和过程写成函数
    函数返回值类型为int
    FunDemol3
	*/
class FunDemol3 
{
	public static void main(String[] args) 
	{
		for (int i=10;i<=1000 ;i++ )
		{
			int t=getSum(i);
			if (t==5)
			{
				System.out.println(i+"是");
			}
		}
	}
	public static int getSum(int n)
	{
		int sum=0;
		
        while (n!=0)
        {
          sum+=n%10;
		  n/=10;
        }
		return sum;
	}
}
