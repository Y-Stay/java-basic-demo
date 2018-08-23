//打印1到100之间既能被3整除又能被5整除的数字并记录有几个
class ForDemol4 
{
	public static void main(String[] args) 
	{
		System.out.println("1到100之间能被3整除又能被5整除的数字是：");
		int count=0;
		for (int i=1;i<=100 ;i++ )
		{
			if (i%3==0&&i%5==0)
			{
				System.out.println(i);
				count+=1;

			}
		}
		System.out.println("一共有"+count+"个");
	}
}
