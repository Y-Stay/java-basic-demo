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
			System.out.println("��ʣ" + hh + "Сʱ" + mm + "����" + ss + "��");
			time--;
			//Thread.sleep(1000);
		}
		System.out.println("����ʱ������ʣ��ʱ��Ϊ��"+time);
	}
}
