class HotelManagerSystem 
{
	public static void main(String[] args) 
	{
		String[][] rooms=new String[12][10];
		System.out.println("��ӭ���������Ƶ�!");
		System.out.println("ʹ��ǰ���ȳ�ʼ������");
		System.out.println("������ʾ������help");
		help();
	}
	public static void help()
	{
		System.out.println("��ʼ������������chushihua");
		System.out.println("��ѯ����������chaxun!");
		System.out.println("������ס������in!");
		System.out.println("�����˷�������out");
		System.out.println("�Ƴ���ס���˷�����������0");
		System.out.println("�˳���ϵͳ������quit");
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
