class FunDemol5 
{
	public static void main(String[] args) 
	{
		System.out.println(xiangcha(2000,12,1,2001,1,1));
		System.out.println(shengyu(2000,12,1));
		System.out.println(yiguo(2001,1,1));
	}
	public static boolean runnian(int y)
	{
		if (y%4==0&&y%100!=0||y%400==0)
			return true;
		return false;
	}
	public static int yiguo(int y,int m,int d)
	{
		int sum=0;
		switch (m-1)
		{
		case 11:sum+=30;
		case 10:sum+=31;
		case 9:sum+=30;
		case 8:sum+=31;
		case 7:sum+=31;
		case 6:sum+=30;
		case 5:sum+=31;
		case 4:sum+=30;
		case 3:sum+=31;
		case 2:if (runnian(y))
		{
			sum+=29;
		}else
				sum+=28;
		case 1:sum+=31;
		}
		sum+=d;
		return sum;
	}
	public static int shengyu(int y,int m,int d)
	{
		int sum=0;
		if (runnian(y))
		{
			sum=366-yiguo(y,m,d);
		}else
			sum=365-yiguo(y,m,d);
		return sum;
	}
	public static int xiangcha(int y1,int m1, int d1,int y2,int m2,int d2)
	{  
        if (y1==y2)
        {
			int sum=0;
            sum=yiguo(y1,m1,d1)-yiguo(y2,m2,d2);
			return zhengfu(sum);
        }
		else if (y1>y2)
		{
			int sum1=shengyu(y2,m2,d2);
			int sum2=yiguo(y1,m1,d1);
			int sum3=0;
			int sum=0;
				for (int i=y2+1;i<y1 ;i++ )
				{
				if (runnian(i))
				
					sum3+=366;
				else sum3+=365;
				}
			return  sum=sum1+sum2+sum3;
		}else
		{   int sum1=shengyu(y1,m1,d1);
			int sum2=yiguo(y2,m2,d2);
			int sum3=0;
			int sum=0;
				for (int i=y1+1;i<y2 ;i++ )
				{
				if (runnian(i))
				
					sum+=366;
				else sum+=365;
				}
			return sum=sum1+sum2+sum3;
		}
	}
	public static int zhengfu(int n)
	{
		return n>=0? n:-n;
	}
}
