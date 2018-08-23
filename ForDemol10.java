//打印100到1000所有质数,并求出其和
class  ForDemol10
{
	public static void main(String[] args) 
	{
		int n,i;
		int sum=0;
		int count=0;
		//先列出101到1000不确定是不是质数的数字
		for (n=101;n<1000 ;n+=2 )
		{
			//判断是不是质数不是质数break出下面的for
			for (i=2;i<=n/2 ;i++ )
			{
				if (n%i==0)
				{
					break;
				}
			}
			if (i>n/2)//检查n是不是质数
			{   //n是质数的前提下执行下面语句
				count++;
				System.out.print(n+" ");
				if (count%5==0)
				{
					System.out.println();
				}
				if (n==997)
				{
					System.out.println();
				}
				sum+=n;
			}
			
		}
		System.out.println("100到1000所有质数的和为："+sum);
	}
}
