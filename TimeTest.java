class TimeTest 
{
	public static void main(String[] args) 
	{
		int time=5;
		while (time>=1)
		{
	
			int hh = time / 60 / 60 % 60;
            int mm = time / 60 % 60;
            int ss = time % 60;
			System.out.println("还剩" + hh + "小时" + mm + "分钟" + ss + "秒");
			time--;
			//Thread.sleep(1000);
		}
		System.out.println("倒计时结束，剩余时间为："+time);
	}
}
