class HotelManagerSystem 
{
	public static void main(String[] args) 
	{
		String[][] rooms=new String[12][10];
		System.out.println("欢迎光临阳光大酒店!");
		System.out.println("使用前请先初始化房间");
		System.out.println("命令提示请输入help");
		help();
	}
	public static void help()
	{
		System.out.println("初始化房间请输入chushihua");
		System.out.println("查询房间请输入chaxun!");
		System.out.println("办理入住请输入in!");
		System.out.println("办理退房请输入out");
		System.out.println("推出入住或退房功能请输入0");
		System.out.println("退出本系统请输入quit");
	}
	public static void chaxun(String[][] a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{if (i<9)
				{
			     System.out.print(0);
				System.out.print((i+1)*100+j+1);
				}
			}
		}
	}
	public static void chushihua(String[][] a)
	{

	}
}
