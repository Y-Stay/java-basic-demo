//打印出100到1000之间所有素数
//
class  ForDemol9
{
	public static void main(String[] args) 
	{
		int a,b;
		for (a=100;a<=1000 ;a++ )
		{
			for (b=2;b<=a ;b++ )
			{
				if (a%b==0)
				{
					break;
				}
			}
			if (b==a)
			{
				System.out.println(a);
			}
			
		}
	}
}
