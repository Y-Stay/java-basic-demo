/*
打印出100到1000之间的所有素数
    把判断素数写成函数
	函数返回值类型为boolean
	*/
class FunDemol2 
{
	public static void main(String[] args) 
	{
		for (int i=100;i<=1000 ;i++ )
		{
			if (judge(i)==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	public static boolean judge(int n)
    {
		for (int i=2;i<=n/2 ;i++ )
		{
          if (n%i==0)
          {
			return false;
          }
		}
		return true;
	}
}
