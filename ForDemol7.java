//吃包子案例
class  ForDemol7
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10 ;i++ )
		{
			if (i==5)
			{
				System.out.println("第5个包子掉地上了我不吃");
				continue;
			}
			if (i==8)
			{
				System.out.println("第8个包子我吃不了了，不吃了");
				break;
			}
			System.out.println("我吃第"+i+"个包子");
		}
		System.out.println("早饭结束");
	}
}
