//��ӡ1��100֮����ܱ�3�������ܱ�5���������ֲ���¼�м���
class ForDemol4 
{
	public static void main(String[] args) 
	{
		System.out.println("1��100֮���ܱ�3�������ܱ�5�����������ǣ�");
		int count=0;
		for (int i=1;i<=100 ;i++ )
		{
			if (i%3==0&&i%5==0)
			{
				System.out.println(i);
				count+=1;

			}
		}
		System.out.println("һ����"+count+"��");
	}
}
